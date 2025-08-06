package net.obsrvr.ttpmodpoc.grpc;

import  io.grpc.ManagedChannel;
import  io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import net.obsrvr.ttpmodpoc.Ttpmodpoc;

import net.obsrvr.ttpmodpoc.grpc.proto.GreeterGrpc;
import net.obsrvr.ttpmodpoc.grpc.proto.HelloRequest;
import net.obsrvr.ttpmodpoc.grpc.proto.HelloReply;


import java.util.concurrent.TimeUnit;

public class SimpleGrpcClient {
    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    // Default endpoint for the simple Go Server
    private static final String DEFAULT_ENDPOINT = "localhost:50051";

    public SimpleGrpcClient() {
        this(DEFAULT_ENDPOINT);
    }

    public SimpleGrpcClient(String target) {
        // Create a communication channel to the server, setting usePlaintext for simplicity.
        // **WARNING:** For production, use secure credentials!
        channel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext()
                .build();
        blockingStub = GreeterGrpc.newBlockingStub(channel);
        Ttpmodpoc.LOGGER.info("Simple gRPC Client initialized for target: {}", target);
    }

    public void shutdown() throws InterruptedException {
        Ttpmodpoc.LOGGER.info("Shutting down gRPC client channel...");
        if (channel != null) {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
        Ttpmodpoc.LOGGER.info("gRPC client channel shut down.");
    }

    /**
     * Sends a greeting request to the server.
     * @param name The name to greet.
     * @return The greeting message from the server, or an error message.
     */
    public String greet(String name) {
        Ttpmodpoc.LOGGER.info("Attempting to greet {}...", name);
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response;
        try {
            // Make the RPC call using the blocking stub
            response = blockingStub.sayHello(request);
            Ttpmodpoc.LOGGER.info("Greeting successful: {}", response.getMessage());
            return response.getMessage();
        } catch (StatusRuntimeException e) {
            Ttpmodpoc.LOGGER.error("gRPC call failed: {}", e.getStatus(), e);
            return "Error: " + e.getStatus().getDescription();
        } catch (Exception e) {
            Ttpmodpoc.LOGGER.error("Unexpected error during gRPC call", e);
            return "Error: Unexpected exception - " + e.getMessage();
        }
    }
}
