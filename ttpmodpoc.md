# .gitattributes

```
#
# https://help.github.com/articles/dealing-with-line-endings/
#
# Linux start script should use lf
/gradlew        text eol=lf

# These are Windows script files and should use crlf
*.bat           text eol=crlf


```

# .gitignore

```
# gradle

.gradle/
build/
out/
classes/

# eclipse

*.launch

# idea

.idea/
*.iml
*.ipr
*.iws

# vscode

.settings/
.vscode/
bin/
.classpath
.project

# macos

*.DS_Store

# fabric

run/

# java

hs_err_*.log
replay_*.log
*.hprof
*.jfr

```

# .idea/.gitignore

```
# Default ignored files
/shelf/
/workspace.xml
# Editor-based HTTP Client requests
/httpRequests/
# Datasource local storage ignored files
/dataSources/
/dataSources.local.xml

```

# .idea/compiler.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="CompilerConfiguration">
    <bytecodeTargetLevel target="21" />
  </component>
</project>
```

# .idea/gradle.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="GradleMigrationSettings" migrationVersion="1" />
  <component name="GradleSettings">
    <option name="linkedExternalProjectsSettings">
      <GradleProjectSettings>
        <option name="externalProjectPath" value="$PROJECT_DIR$" />
        <option name="modules">
          <set>
            <option value="$PROJECT_DIR$" />
          </set>
        </option>
        <option name="resolveExternalAnnotations" value="true" />
      </GradleProjectSettings>
    </option>
  </component>
</project>
```

# .idea/jarRepositories.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="RemoteRepositoriesConfiguration">
    <remote-repository>
      <option name="id" value="central" />
      <option name="name" value="Maven Central repository" />
      <option name="url" value="https://repo1.maven.org/maven2" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="jboss.community" />
      <option name="name" value="JBoss Community repository" />
      <option name="url" value="https://repository.jboss.org/nexus/content/repositories/public/" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="LoomLocalRemappedMods" />
      <option name="name" value="LoomLocalRemappedMods" />
      <option name="url" value="file:/$PROJECT_DIR$/.gradle/loom-cache/remapped_mods/" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="LoomGlobalMinecraft" />
      <option name="name" value="LoomGlobalMinecraft" />
      <option name="url" value="file:/$USER_HOME$/.gradle/caches/fabric-loom/minecraftMaven/" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="LoomLocalMinecraft" />
      <option name="name" value="LoomLocalMinecraft" />
      <option name="url" value="file:/$PROJECT_DIR$/.gradle/loom-cache/minecraftMaven/" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="Fabric" />
      <option name="name" value="Fabric" />
      <option name="url" value="https://maven.fabricmc.net/" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="Mojang" />
      <option name="name" value="Mojang" />
      <option name="url" value="https://libraries.minecraft.net/" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="MavenRepo" />
      <option name="name" value="MavenRepo" />
      <option name="url" value="https://repo.maven.apache.org/maven2/" />
    </remote-repository>
  </component>
</project>
```

# .idea/misc.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="ExternalStorageConfigurationManager" enabled="true" />
  <component name="FrameworkDetectionExcludesConfiguration">
    <file type="web" url="file://$PROJECT_DIR$" />
  </component>
  <component name="ProjectRootManager" version="2" languageLevel="JDK_21" default="true" project-jdk-name="ms-21" project-jdk-type="JavaSDK" />
</project>
```

# .idea/modules.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="ProjectModuleManager">
    <modules>
      <module fileurl="file://$PROJECT_DIR$/.idea/modules/ttpmodpoc.main.iml" filepath="$PROJECT_DIR$/.idea/modules/ttpmodpoc.main.iml" />
      <module fileurl="file://$PROJECT_DIR$/.idea/modules/ttpmodpoc.test.iml" filepath="$PROJECT_DIR$/.idea/modules/ttpmodpoc.test.iml" />
    </modules>
  </component>
</project>
```

# .idea/modules/ttpmodpoc.main.iml

```iml
<?xml version="1.0" encoding="UTF-8"?>
<module version="4">
  <component name="FacetManager">
    <facet type="minecraft" name="Minecraft">
      <configuration>
        <autoDetectTypes>
          <platformType>FABRIC</platformType>
          <platformType>MIXIN</platformType>
          <platformType>MCP</platformType>
        </autoDetectTypes>
        <projectReimportVersion>1</projectReimportVersion>
      </configuration>
    </facet>
  </component>
  <component name="McpModuleSettings">
    <option name="minecraftVersion" value="1.21.5" />
  </component>
</module>
```

# .idea/modules/ttpmodpoc.test.iml

```iml
<?xml version="1.0" encoding="UTF-8"?>
<module version="4">
  <component name="FacetManager">
    <facet type="minecraft" name="Minecraft">
      <configuration>
        <autoDetectTypes>
          <platformType>FABRIC</platformType>
          <platformType>MIXIN</platformType>
          <platformType>MCP</platformType>
        </autoDetectTypes>
        <projectReimportVersion>1</projectReimportVersion>
      </configuration>
    </facet>
  </component>
  <component name="McpModuleSettings">
    <option name="minecraftVersion" value="1.21.5" />
  </component>
</module>
```

# .idea/runConfigurations/Data_Generation.xml

```xml
<component name="ProjectRunConfigurationManager">
  <configuration default="false" factoryName="Application" name="Data Generation" type="Application">
    <option name="MAIN_CLASS_NAME" value="net.fabricmc.devlaunchinjector.Main"/>
    <module name="ttpmodpoc.main"/>
    <option name="PROGRAM_PARAMETERS" value=""/>
    <option name="VM_PARAMETERS" value="-Dfabric.dli.config=C:\_git\ttpmodpoc\.gradle\loom-cache\launch.cfg -Dfabric.dli.env=client -Dfabric-api.datagen -Dfabric-api.datagen.output-dir=C:\_git\ttpmodpoc\src\main\generated -Dfabric.dli.main=net.fabricmc.loader.impl.launch.knot.KnotClient"/>
    <option name="WORKING_DIRECTORY" value="$PROJECT_DIR$/build/datagen/"/>
    <method v="2">
      <option enabled="true" name="Make"/>
    </method>
    <envs>
      
    </envs>
    <shortenClasspath name="ARGS_FILE"/>
  <classpathModifications/></configuration>
</component>
```

# .idea/runConfigurations/Minecraft_Client.xml

```xml
<component name="ProjectRunConfigurationManager">
  <configuration default="false" factoryName="Application" name="Minecraft Client" type="Application">
    <option name="MAIN_CLASS_NAME" value="net.fabricmc.devlaunchinjector.Main"/>
    <module name="ttpmodpoc.main"/>
    <option name="PROGRAM_PARAMETERS" value=""/>
    <option name="VM_PARAMETERS" value="-Dfabric.dli.config=C:\_git\ttpmodpoc\.gradle\loom-cache\launch.cfg -Dfabric.dli.env=client -Dfabric.dli.main=net.fabricmc.loader.impl.launch.knot.KnotClient"/>
    <option name="WORKING_DIRECTORY" value="$PROJECT_DIR$/run/"/>
    <method v="2">
      <option enabled="true" name="Make"/>
    </method>
    <envs>
      
    </envs>
    <shortenClasspath name="ARGS_FILE"/>
  <classpathModifications/></configuration>
</component>
```

# .idea/runConfigurations/Minecraft_Server.xml

```xml
<component name="ProjectRunConfigurationManager">
  <configuration default="false" factoryName="Application" name="Minecraft Server" type="Application">
    <option name="MAIN_CLASS_NAME" value="net.fabricmc.devlaunchinjector.Main"/>
    <module name="ttpmodpoc.main"/>
    <option name="PROGRAM_PARAMETERS" value="nogui"/>
    <option name="VM_PARAMETERS" value="-Dfabric.dli.config=C:\_git\ttpmodpoc\.gradle\loom-cache\launch.cfg -Dfabric.dli.env=server -Dfabric.dli.main=net.fabricmc.loader.impl.launch.knot.KnotServer"/>
    <option name="WORKING_DIRECTORY" value="$PROJECT_DIR$/run/"/>
    <method v="2">
      <option enabled="true" name="Make"/>
    </method>
    <envs>
      
    </envs>
    <shortenClasspath name="ARGS_FILE"/>
  <classpathModifications><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\commons-logging\commons-logging\1.3.4\b9fc14968d63a8b8a8a2c1885fe3e90564239708\commons-logging-1.3.4.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.apache.httpcomponents\httpclient\4.5.14\1194890e6f56ec29177673f2f12d0b8e627dec98\httpclient-4.5.14.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\patchy\2.2.10\da05971b07cbb379d002cf7eaec6a2048211fefc\patchy-2.2.10.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\blocklist\1.0.10\5c685c5ffa94c4cd39496c7184c1d122e515ecef\blocklist-1.0.10.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.apache.httpcomponents\httpcore\4.4.16\51cf043c87253c9f58b539c9f7e44c8894223850\httpcore-4.4.16.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-openal\3.3.3\daada81ceb5fc0c291fbfdd4433cb8d9423577f2\lwjgl-openal-3.3.3.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-jemalloc\3.3.3\b543467b7ff3c6920539a88ee602d34098628be5\lwjgl-jemalloc-3.3.3.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.jcraft\jorbis\0.0.17\8872d22b293e8f5d7d56ff92be966e6dc28ebdc6\jorbis-0.0.17.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl\3.3.3\29589b5f87ed335a6c7e7ee6a5775f81f97ecb84\lwjgl-3.3.3.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-compress\1.27.1\a19151084758e2fbb6b41eddaa88e7b8ff4e6599\commons-compress-1.27.1.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-tinyfd\3.3.3\82d755ca94b102e9ca77283b9e2dc46d1b15fbe5\lwjgl-tinyfd-3.3.3.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\commons-codec\commons-codec\1.17.1\973638b7149d333563584137ebf13a691bb60579\commons-codec-1.17.1.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-glfw\3.3.3\efa1eb78c5ccd840e9f329717109b5e892d72f8e\lwjgl-glfw-3.3.3.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.ibm.icu\icu4j\76.1\215f3a8e936d4069344bd75f2b1368fd58112894\icu4j-76.1.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\text2speech\1.18.11\e853a12cdd6ba4f4836e8f4bf3b37844a13482b6\text2speech-1.18.11.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-stb\3.3.3\25dd6161988d7e65f71d5065c99902402ee32746\lwjgl-stb-3.3.3.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-opengl\3.3.3\2f6b0147078396a58979125a4c947664e98293a\lwjgl-opengl-3.3.3.jar"/><entry exclude="true" path="C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-freetype\3.3.3\a0db6c84a8becc8ca05f9dbfa985edc348a824c7\lwjgl-freetype-3.3.3.jar"/></classpathModifications></configuration>
</component>
```

# .idea/workspace.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="AutoImportSettings">
    <option name="autoReloadType" value="SELECTIVE" />
  </component>
  <component name="ChangeListManager">
    <list default="true" id="22926d6e-c17a-4adf-925e-3218791c5f41" name="Changes" comment="" />
    <option name="SHOW_DIALOG" value="false" />
    <option name="HIGHLIGHT_CONFLICTS" value="true" />
    <option name="HIGHLIGHT_NON_ACTIVE_CHANGELIST" value="false" />
    <option name="LAST_RESOLUTION" value="IGNORE" />
  </component>
  <component name="ExternalProjectsData">
    <projectState path="$PROJECT_DIR$">
      <ProjectState />
    </projectState>
  </component>
  <component name="ExternalProjectsManager">
    <system id="GRADLE">
      <state>
        <task path="$PROJECT_DIR$">
          <activation />
        </task>
        <projects_view>
          <tree_state>
            <expand>
              <path>
                <item name="" type="6a2764b6:ExternalProjectsStructure$RootNode" />
                <item name="ttpmodpoc" type="f1a62948:ProjectNode" />
              </path>
              <path>
                <item name="" type="6a2764b6:ExternalProjectsStructure$RootNode" />
                <item name="ttpmodpoc" type="f1a62948:ProjectNode" />
                <item name="Tasks" type="e4a08cd1:TasksNode" />
              </path>
              <path>
                <item name="" type="6a2764b6:ExternalProjectsStructure$RootNode" />
                <item name="ttpmodpoc" type="f1a62948:ProjectNode" />
                <item name="Tasks" type="e4a08cd1:TasksNode" />
                <item name="build" type="c8890929:TasksNode$1" />
              </path>
              <path>
                <item name="" type="6a2764b6:ExternalProjectsStructure$RootNode" />
                <item name="ttpmodpoc" type="f1a62948:ProjectNode" />
                <item name="Dependencies" type="6de06a37:ExternalSystemViewDefaultContributor$MyDependenciesNode" />
              </path>
            </expand>
            <select />
          </tree_state>
        </projects_view>
      </state>
    </system>
  </component>
  <component name="FileTemplateManagerImpl">
    <option name="RECENT_TEMPLATES">
      <list>
        <option value="Class" />
      </list>
    </option>
  </component>
  <component name="ProjectColorInfo">{
  &quot;associatedIndex&quot;: 5
}</component>
  <component name="ProjectId" id="2v9VwwTrTlf4I4KUrPugI0y16lR" />
  <component name="ProjectViewState">
    <option name="showLibraryContents" value="true" />
  </component>
  <component name="PropertiesComponent">{
  &quot;keyToString&quot;: {
    &quot;Gradle.C:/_git/ttpmodpoc/build.gradle.executor&quot;: &quot;Run&quot;,
    &quot;Gradle.Download Sources.executor&quot;: &quot;Run&quot;,
    &quot;Gradle.ttpmodpoc [:net.fabricmc.devlaunchinjector.Main.main()].executor&quot;: &quot;Run&quot;,
    &quot;Gradle.ttpmodpoc [build].executor&quot;: &quot;Run&quot;,
    &quot;Gradle.ttpmodpoc [clean].executor&quot;: &quot;Run&quot;,
    &quot;Gradle.ttpmodpoc [genSources].executor&quot;: &quot;Run&quot;,
    &quot;Gradle.ttpmodpoc.executor&quot;: &quot;Run&quot;,
    &quot;RunOnceActivity.ShowReadmeOnStart&quot;: &quot;true&quot;,
    &quot;kotlin-language-version-configured&quot;: &quot;true&quot;,
    &quot;last_opened_file_path&quot;: &quot;C:/_git/ttpmodpoc/src/main&quot;,
    &quot;node.js.detected.package.eslint&quot;: &quot;true&quot;,
    &quot;node.js.detected.package.tslint&quot;: &quot;true&quot;,
    &quot;node.js.selected.package.eslint&quot;: &quot;(autodetect)&quot;,
    &quot;node.js.selected.package.tslint&quot;: &quot;(autodetect)&quot;,
    &quot;nodejs_package_manager_path&quot;: &quot;npm&quot;,
    &quot;project.structure.last.edited&quot;: &quot;Project&quot;,
    &quot;project.structure.proportion&quot;: &quot;0.15&quot;,
    &quot;project.structure.side.proportion&quot;: &quot;0.2&quot;,
    &quot;settings.editor.selected.configurable&quot;: &quot;reference.settingsdialog.project.gradle&quot;,
    &quot;vue.rearranger.settings.migration&quot;: &quot;true&quot;
  }
}</component>
  <component name="RecentsManager">
    <key name="CopyFile.RECENT_KEYS">
      <recent name="C:\_git\ttpmodpoc\src\main" />
    </key>
  </component>
  <component name="RunAnythingCache">
    <option name="myCommands">
      <command value="gradle --dry-run" />
    </option>
  </component>
  <component name="RunManager" selected="Application.Minecraft Client">
    <configuration name="ttpmodpoc [build]" type="GradleRunConfiguration" factoryName="Gradle" temporary="true">
      <ExternalSystemSettings>
        <option name="executionName" />
        <option name="externalProjectPath" value="$PROJECT_DIR$" />
        <option name="externalSystemIdString" value="GRADLE" />
        <option name="scriptParameters" />
        <option name="taskDescriptions">
          <list />
        </option>
        <option name="taskNames">
          <list>
            <option value="build" />
          </list>
        </option>
        <option name="vmOptions" />
      </ExternalSystemSettings>
      <ExternalSystemDebugServerProcess>true</ExternalSystemDebugServerProcess>
      <ExternalSystemReattachDebugProcess>true</ExternalSystemReattachDebugProcess>
      <DebugAllEnabled>false</DebugAllEnabled>
      <RunAsTest>false</RunAsTest>
      <method v="2" />
    </configuration>
    <configuration name="ttpmodpoc [clean]" type="GradleRunConfiguration" factoryName="Gradle" temporary="true">
      <ExternalSystemSettings>
        <option name="executionName" />
        <option name="externalProjectPath" value="$PROJECT_DIR$" />
        <option name="externalSystemIdString" value="GRADLE" />
        <option name="scriptParameters" />
        <option name="taskDescriptions">
          <list />
        </option>
        <option name="taskNames">
          <list>
            <option value="clean" />
          </list>
        </option>
        <option name="vmOptions" />
      </ExternalSystemSettings>
      <ExternalSystemDebugServerProcess>true</ExternalSystemDebugServerProcess>
      <ExternalSystemReattachDebugProcess>true</ExternalSystemReattachDebugProcess>
      <DebugAllEnabled>false</DebugAllEnabled>
      <RunAsTest>false</RunAsTest>
      <method v="2" />
    </configuration>
    <configuration name="ttpmodpoc [genSources]" type="GradleRunConfiguration" factoryName="Gradle" temporary="true">
      <ExternalSystemSettings>
        <option name="executionName" />
        <option name="externalProjectPath" value="$PROJECT_DIR$" />
        <option name="externalSystemIdString" value="GRADLE" />
        <option name="scriptParameters" />
        <option name="taskDescriptions">
          <list />
        </option>
        <option name="taskNames">
          <list>
            <option value="genSources" />
          </list>
        </option>
        <option name="vmOptions" />
      </ExternalSystemSettings>
      <ExternalSystemDebugServerProcess>true</ExternalSystemDebugServerProcess>
      <ExternalSystemReattachDebugProcess>true</ExternalSystemReattachDebugProcess>
      <DebugAllEnabled>false</DebugAllEnabled>
      <RunAsTest>false</RunAsTest>
      <method v="2" />
    </configuration>
    <configuration name="ttpmodpoc" type="GradleRunConfiguration" factoryName="Gradle" temporary="true">
      <ExternalSystemSettings>
        <option name="executionName" />
        <option name="externalProjectPath" value="$PROJECT_DIR$" />
        <option name="externalSystemIdString" value="GRADLE" />
        <option name="scriptParameters" value="--dry-run" />
        <option name="taskDescriptions">
          <list />
        </option>
        <option name="taskNames">
          <list />
        </option>
        <option name="vmOptions" />
      </ExternalSystemSettings>
      <ExternalSystemDebugServerProcess>true</ExternalSystemDebugServerProcess>
      <ExternalSystemReattachDebugProcess>true</ExternalSystemReattachDebugProcess>
      <DebugAllEnabled>false</DebugAllEnabled>
      <RunAsTest>false</RunAsTest>
      <method v="2" />
    </configuration>
    <recent_temporary>
      <list>
        <item itemvalue="Gradle.ttpmodpoc [build]" />
        <item itemvalue="Gradle.ttpmodpoc [clean]" />
        <item itemvalue="Gradle.ttpmodpoc [genSources]" />
        <item itemvalue="Gradle.ttpmodpoc" />
      </list>
    </recent_temporary>
  </component>
  <component name="SharedIndexes">
    <attachedChunks>
      <set>
        <option value="bundled-jdk-9823dce3aa75-a94e463ab2e7-intellij.indexing.shared.core-IU-243.26053.27" />
        <option value="bundled-js-predefined-d6986cc7102b-1632447f56bf-JavaScript-IU-243.26053.27" />
      </set>
    </attachedChunks>
  </component>
  <component name="SpellCheckerSettings" RuntimeDictionaries="0" Folders="0" CustomDictionaries="0" DefaultDictionary="application-level" UseSingleDictionary="true" transferred="true" />
  <component name="TaskManager">
    <task active="true" id="Default" summary="Default task">
      <changelist id="22926d6e-c17a-4adf-925e-3218791c5f41" name="Changes" comment="" />
      <created>1743557519114</created>
      <option name="number" value="Default" />
      <option name="presentableId" value="Default" />
      <updated>1743557519114</updated>
      <workItem from="1743557520343" duration="4177000" />
      <workItem from="1743590446532" duration="8134000" />
      <workItem from="1743617828564" duration="29000" />
      <workItem from="1743618033303" duration="1963000" />
      <workItem from="1743623711961" duration="18035000" />
    </task>
    <servers />
  </component>
  <component name="TypeScriptGeneratedFilesManager">
    <option name="version" value="3" />
  </component>
</project>
```

# build.gradle

```gradle
plugins {
	id 'fabric-loom' version '1.10-SNAPSHOT'
	id 'maven-publish'
	id 'com.google.protobuf' version '0.9.4'
	id 'com.github.johnrengelman.shadow' version '8.1.1'
}

version = project.mod_version
group = project.maven_group

base {
	archivesName = project.archives_base_name
}

repositories {
	// Add repositories to retrieve artifacts from in here.
	// You should only use this when depending on other mods because
	// Loom adds the essential maven repositories to download Minecraft and libraries from automatically.
	// See https://docs.gradle.org/current/userguide/declaring_repositories.html
	// for more information about repositories.
}

fabricApi {
	configureDataGeneration {
		client = true
	}
}

dependencies {
	// To change the versions see the gradle.properties file
	minecraft "com.mojang:minecraft:${project.minecraft_version}"
	mappings "net.fabricmc:yarn:${project.yarn_mappings}:v2"
	modImplementation "net.fabricmc:fabric-loader:${project.loader_version}"

	// Fabric API. This is technically optional, but you probably want it anyway.
	modImplementation "net.fabricmc.fabric-api:fabric-api:${project.fabric_version}"

	// gRPC dependencies
	implementation 'io.grpc:grpc-netty-shaded:1.61.0'
	implementation 'io.grpc:grpc-protobuf:1.61.0'
	implementation 'io.grpc:grpc-stub:1.61.0'
	implementation 'com.google.protobuf:protobuf-java:4.28.2'
	implementation 'javax.annotation:javax.annotation-api:1.3.2'

	implementation 'com.google.guava:guava:32.1.3-jre'
	
}

processResources {
	inputs.property "version", project.version

	filesMatching("fabric.mod.json") {
		expand "version": inputs.properties.version
	}

	exclude '**/*.proto' // Exclude all .proto files from being treated as resources
}

tasks.withType(JavaCompile).configureEach {
	it.options.release = 21
}

java {
	// Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the "build" task
	// if it is present.
	// If you remove this line, sources will not be generated.
	withSourcesJar()

	sourceCompatibility = JavaVersion.VERSION_21
	targetCompatibility = JavaVersion.VERSION_21
}

jar {
	inputs.property "archivesName", project.base.archivesName

	from("LICENSE") {
		rename { "${it}_${inputs.properties.archivesName}"}
	}

	exclude 'oshi.properties'
	exclude 'oshi.architecture.properties'
}

// Disable the standard jar task, as shadowJar produces the final artifact
tasks.jar.enabled = false

shadowJar {
	archiveClassifier.set('') // Don't append 'all' or 'shadow' to the JAR name
	mergeServiceFiles() // Needed for gRPC/Protobuf service discovery
	zip64 = true // Good practice for large JARs

	// Exclude signature files
	exclude 'META-INF/*.SF', 'META-INF/*.DSA', 'META-INF/*.RSA'

	// Exclude OSHI again just to be safe
	exclude 'oshi.properties', 'oshi.architecture.properties'

	// Relocate packages to avoid conflicts with other mods or Minecraft internals
	relocate 'io.grpc', 'net.obsrvr.ttpmodpoc.shaded.io.grpc'
	relocate 'com.google.protobuf', 'net.obsrvr.ttpmodpoc.shaded.com.google.protobuf'
	relocate 'javax.annotation', 'net.obsrvr.ttpmodpoc.shaded.javax.annotation'
	relocate 'com.google.common', 'net.obsrvr.ttpmodpoc.shaded.com.google.common' // Relocate Guava too
	// Add other relocations if needed for transitive dependencies
}
// Ensure the 'build' task depends on 'shadowJar'
tasks.named('build') {

}
// Standard Gradle source set configuration
sourceSets {
	main {
		proto { // The plugin adds this 'proto' source directory set automatically
			srcDirs 'src/main/proto'
		}
		// java { srcDirs 'src/main/java' } // Usually default
		// resources { srcDirs 'src/main/resources' } // Usually default
	}
}

protobuf {
	protoc { artifact = "com.google.protobuf:protoc:3.25.1" } // Match implementation version if possible
	plugins {
		grpc { artifact = 'io.grpc:protoc-gen-grpc-java:1.61.0' } // Match implementation version
	}
	generateProtoTasks {
		all()*.plugins { grpc {} }
		// Configure where the generated Java code goes
		all()*.builtins {
			java { } // Use 'lite' if you don't need full runtime, usually fine for clients
		}
		all()*.generateDescriptorSet = true // Optional but can be useful
	}

}



// configure the maven publication
publishing {
	publications {
		create("mavenJava", MavenPublication) {
			artifactId = project.archives_base_name
			from components.java
		}
	}

	// See https://docs.gradle.org/current/userguide/publishing_maven.html for information on how to set up publishing.
	repositories {
		// Add repositories to publish to here.
		// Notice: This block does NOT have the same function as the block in the top level.
		// The repositories here will be used for publishing your artifact, not for
		// retrieving dependencies.
	}
}


```

# gradle.properties

```properties
# Done to increase the memory available to gradle.
org.gradle.jvmargs=-Xmx1G
org.gradle.parallel=true

# Fabric Properties
# check these on https://fabricmc.net/develop
minecraft_version=1.21.5
yarn_mappings=1.21.5+build.1
loader_version=0.16.11

# Mod Properties
mod_version=1.0.0
maven_group=net.obsrvr.ttpmodpoc
archives_base_name=ttpmodpoc

# Dependencies
fabric_version=0.119.6+1.21.5
```

# gradle/wrapper/gradle-wrapper.jar

This is a binary file of the type: Binary

# gradle/wrapper/gradle-wrapper.properties

```properties
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-8.12.1-bin.zip
networkTimeout=10000
validateDistributionUrl=true
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists

```

# gradlew

```
#!/bin/sh

#
# Copyright © 2015-2021 the original authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# SPDX-License-Identifier: Apache-2.0
#

##############################################################################
#
#   Gradle start up script for POSIX generated by Gradle.
#
#   Important for running:
#
#   (1) You need a POSIX-compliant shell to run this script. If your /bin/sh is
#       noncompliant, but you have some other compliant shell such as ksh or
#       bash, then to run this script, type that shell name before the whole
#       command line, like:
#
#           ksh Gradle
#
#       Busybox and similar reduced shells will NOT work, because this script
#       requires all of these POSIX shell features:
#         * functions;
#         * expansions «$var», «${var}», «${var:-default}», «${var+SET}»,
#           «${var#prefix}», «${var%suffix}», and «$( cmd )»;
#         * compound commands having a testable exit status, especially «case»;
#         * various built-in commands including «command», «set», and «ulimit».
#
#   Important for patching:
#
#   (2) This script targets any POSIX shell, so it avoids extensions provided
#       by Bash, Ksh, etc; in particular arrays are avoided.
#
#       The "traditional" practice of packing multiple parameters into a
#       space-separated string is a well documented source of bugs and security
#       problems, so this is (mostly) avoided, by progressively accumulating
#       options in "$@", and eventually passing that to Java.
#
#       Where the inherited environment variables (DEFAULT_JVM_OPTS, JAVA_OPTS,
#       and GRADLE_OPTS) rely on word-splitting, this is performed explicitly;
#       see the in-line comments for details.
#
#       There are tweaks for specific operating systems such as AIX, CygWin,
#       Darwin, MinGW, and NonStop.
#
#   (3) This script is generated from the Groovy template
#       https://github.com/gradle/gradle/blob/HEAD/platforms/jvm/plugins-application/src/main/resources/org/gradle/api/internal/plugins/unixStartScript.txt
#       within the Gradle project.
#
#       You can find Gradle at https://github.com/gradle/gradle/.
#
##############################################################################

# Attempt to set APP_HOME

# Resolve links: $0 may be a link
app_path=$0

# Need this for daisy-chained symlinks.
while
    APP_HOME=${app_path%"${app_path##*/}"}  # leaves a trailing /; empty if no leading path
    [ -h "$app_path" ]
do
    ls=$( ls -ld "$app_path" )
    link=${ls#*' -> '}
    case $link in             #(
      /*)   app_path=$link ;; #(
      *)    app_path=$APP_HOME$link ;;
    esac
done

# This is normally unused
# shellcheck disable=SC2034
APP_BASE_NAME=${0##*/}
# Discard cd standard output in case $CDPATH is set (https://github.com/gradle/gradle/issues/25036)
APP_HOME=$( cd -P "${APP_HOME:-./}" > /dev/null && printf '%s\n' "$PWD" ) || exit

# Use the maximum available, or set MAX_FD != -1 to use that value.
MAX_FD=maximum

warn () {
    echo "$*"
} >&2

die () {
    echo
    echo "$*"
    echo
    exit 1
} >&2

# OS specific support (must be 'true' or 'false').
cygwin=false
msys=false
darwin=false
nonstop=false
case "$( uname )" in                #(
  CYGWIN* )         cygwin=true  ;; #(
  Darwin* )         darwin=true  ;; #(
  MSYS* | MINGW* )  msys=true    ;; #(
  NONSTOP* )        nonstop=true ;;
esac

CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar


# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        # IBM's JDK on AIX uses strange locations for the executables
        JAVACMD=$JAVA_HOME/jre/sh/java
    else
        JAVACMD=$JAVA_HOME/bin/java
    fi
    if [ ! -x "$JAVACMD" ] ; then
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
else
    JAVACMD=java
    if ! command -v java >/dev/null 2>&1
    then
        die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
fi

# Increase the maximum file descriptors if we can.
if ! "$cygwin" && ! "$darwin" && ! "$nonstop" ; then
    case $MAX_FD in #(
      max*)
        # In POSIX sh, ulimit -H is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        MAX_FD=$( ulimit -H -n ) ||
            warn "Could not query maximum file descriptor limit"
    esac
    case $MAX_FD in  #(
      '' | soft) :;; #(
      *)
        # In POSIX sh, ulimit -n is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        ulimit -n "$MAX_FD" ||
            warn "Could not set maximum file descriptor limit to $MAX_FD"
    esac
fi

# Collect all arguments for the java command, stacking in reverse order:
#   * args from the command line
#   * the main class name
#   * -classpath
#   * -D...appname settings
#   * --module-path (only if needed)
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, and GRADLE_OPTS environment variables.

# For Cygwin or MSYS, switch paths to Windows format before running java
if "$cygwin" || "$msys" ; then
    APP_HOME=$( cygpath --path --mixed "$APP_HOME" )
    CLASSPATH=$( cygpath --path --mixed "$CLASSPATH" )

    JAVACMD=$( cygpath --unix "$JAVACMD" )

    # Now convert the arguments - kludge to limit ourselves to /bin/sh
    for arg do
        if
            case $arg in                                #(
              -*)   false ;;                            # don't mess with options #(
              /?*)  t=${arg#/} t=/${t%%/*}              # looks like a POSIX filepath
                    [ -e "$t" ] ;;                      #(
              *)    false ;;
            esac
        then
            arg=$( cygpath --path --ignore --mixed "$arg" )
        fi
        # Roll the args list around exactly as many times as the number of
        # args, so each arg winds up back in the position where it started, but
        # possibly modified.
        #
        # NB: a `for` loop captures its iteration list before it begins, so
        # changing the positional parameters here affects neither the number of
        # iterations, nor the values presented in `arg`.
        shift                   # remove old arg
        set -- "$@" "$arg"      # push replacement arg
    done
fi


# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

# Collect all arguments for the java command:
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, JAVA_OPTS, and optsEnvironmentVar are not allowed to contain shell fragments,
#     and any embedded shellness will be escaped.
#   * For example: A user cannot expect ${Hostname} to be expanded, as it is an environment variable and will be
#     treated as '${Hostname}' itself on the command line.

set -- \
        "-Dorg.gradle.appname=$APP_BASE_NAME" \
        -classpath "$CLASSPATH" \
        org.gradle.wrapper.GradleWrapperMain \
        "$@"

# Stop when "xargs" is not available.
if ! command -v xargs >/dev/null 2>&1
then
    die "xargs is not available"
fi

# Use "xargs" to parse quoted args.
#
# With -n1 it outputs one arg per line, with the quotes and backslashes removed.
#
# In Bash we could simply go:
#
#   readarray ARGS < <( xargs -n1 <<<"$var" ) &&
#   set -- "${ARGS[@]}" "$@"
#
# but POSIX shell has neither arrays nor command substitution, so instead we
# post-process each arg (as a line of input to sed) to backslash-escape any
# character that might be a shell metacharacter, then use eval to reverse
# that process (while maintaining the separation between arguments), and wrap
# the whole thing up as a single "set" statement.
#
# This will of course break if any of these variables contains a newline or
# an unmatched quote.
#

eval "set -- $(
        printf '%s\n' "$DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS" |
        xargs -n1 |
        sed ' s~[^-[:alnum:]+,./:=@_]~\\&~g; ' |
        tr '\n' ' '
    )" '"$@"'

exec "$JAVACMD" "$@"

```

# gradlew.bat

```bat
@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem
@rem SPDX-License-Identifier: Apache-2.0
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  Gradle startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH. 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME% 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\gradle\wrapper\gradle-wrapper.jar


@rem Execute Gradle
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%GRADLE_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega

```

# run/command_history.txt

```txt
/ttp
/ttp status
/ttp start
/ttp stop
/ttp start
/ttp stop
/ttp status
/ttp start 1 10
/ttp start 1 100
/ttp start 1 10
/grpc_test Hello

```

# run/config/fabric/indigo-renderer.properties

```properties
#Indigo properties file
#Wed Apr 02 20:10:03 EDT 2025
ambient-occlusion-mode=hybrid
debug-compare-lighting=auto
fix-exterior-vertex-lighting=auto
fix-luminous-block-ambient-occlusion=auto
fix-mean-light-calculation=auto
fix-smooth-lighting-offset=auto

```

# run/data/fabricDefaultResourcePacks.dat

This is a binary file of the type: Binary

# run/downloads/log.json

```json

```

# run/eula.txt

```txt
#By changing the setting below to TRUE you are indicating your agreement to our EULA (https://aka.ms/MinecraftEULA).
#Wed Apr 02 06:39:54 EDT 2025
eula=false

```

# run/logs/2025-04-02-1.log.gz

This is a binary file of the type: Binary

# run/logs/2025-04-02-2.log.gz

This is a binary file of the type: Binary

# run/logs/2025-04-02-3.log.gz

This is a binary file of the type: Binary

# run/logs/2025-04-02-4.log.gz

This is a binary file of the type: Binary

# run/logs/2025-04-02-5.log.gz

This is a binary file of the type: Binary

# run/logs/2025-04-02-6.log.gz

This is a binary file of the type: Binary

# run/logs/2025-04-02-7.log.gz

This is a binary file of the type: Binary

# run/logs/debug-1.log.gz

This is a binary file of the type: Binary

# run/logs/debug-2.log.gz

This is a binary file of the type: Binary

# run/logs/debug-3.log.gz

This is a binary file of the type: Binary

# run/logs/debug-4.log.gz

This is a binary file of the type: Binary

# run/logs/debug-5.log.gz

This is a binary file of the type: Binary

# run/logs/debug.log

```log
[20:09:48] [main/INFO] (FabricLoader/GameProvider) Loading Minecraft 1.21.5 with Fabric Loader 0.16.11
[20:09:48] [main/DEBUG] (FabricLoader/GamePatch) Found game constructor: net.minecraft.client.main.Main -> net.minecraft.client.MinecraftClient
[20:09:48] [main/DEBUG] (FabricLoader/GamePatch) Patching game constructor <init>(Lnet/minecraft/client/RunArgs;)V
[20:09:48] [main/DEBUG] (FabricLoader/GamePatch) Run directory field is thought to be net/minecraft/client/MinecraftClient/runDirectory
[20:09:48] [main/DEBUG] (FabricLoader/GamePatch) Applying brand name hook to net/minecraft/client/ClientBrandRetriever::getClientModName
[20:09:48] [main/DEBUG] (FabricLoader/GamePatch) Applying brand name hook to net/minecraft/server/MinecraftServer::getServerModName
[20:09:48] [main/DEBUG] (FabricLoader/Mappings) Loading mappings took 189 ms
[20:09:48] [main/DEBUG] (FabricLoader/GamePatch) Patched 3 classs
[20:09:48] [main/DEBUG] (FabricLoader/Discovery) Mod discovery time: 42.9 ms
[20:09:48] [main/DEBUG] (FabricLoader/Resolution) Mod resolution time: 112.6 ms
[20:09:48] [main/INFO] (FabricLoader) Loading 55 mods:
	- fabric-api 0.119.6+1.21.5
	- fabric-api-base 0.4.62+73a52b4b49
	- fabric-api-lookup-api-v1 1.6.95+86c3a9f149
	- fabric-biome-api-v1 16.0.7+2dd063df49
	- fabric-block-api-v1 1.0.37+86c3a9f149
	- fabric-block-view-api-v2 1.0.26+aa6d566c49
	- fabric-blockrenderlayer-v1 2.0.16+86c3a9f149
	- fabric-client-gametest-api-v1 4.1.10+f3ffa98949
	- fabric-client-tags-api-v1 1.1.37+86c3a9f149
	- fabric-command-api-v1 1.2.70+f71b366f49
	- fabric-command-api-v2 2.2.49+73a52b4b49
	- fabric-commands-v0 0.2.87+df3654b349
	- fabric-content-registries-v0 10.0.11+216530c849
	- fabric-convention-tags-v1 2.1.28+7f945d5b49
	- fabric-convention-tags-v2 2.14.2+7d35484649
	- fabric-crash-report-info-v1 0.3.12+86c3a9f149
	- fabric-data-attachment-api-v1 1.6.6+7b20cbb049
	- fabric-data-generation-api-v1 22.3.2+d94614b849
	- fabric-dimensions-v1 4.0.16+86c3a9f149
	- fabric-entity-events-v1 2.0.25+27c1078f49
	- fabric-events-interaction-v0 4.0.13+73a52b4b49
	- fabric-game-rule-api-v1 1.0.70+c327076a49
	- fabric-gametest-api-v1 3.1.2+2a6ec84b49
	- fabric-item-api-v1 11.3.1+eeb42f0249
	- fabric-item-group-api-v1 4.2.8+3459fc6149
	- fabric-key-binding-api-v1 1.0.63+ecf51cdc49
	- fabric-keybindings-v0 0.2.61+df3654b349
	- fabric-lifecycle-events-v1 2.5.13+5cbce67349
	- fabric-loot-api-v2 3.0.47+3f89f5a549
	- fabric-loot-api-v3 1.0.35+86c3a9f149
	- fabric-message-api-v1 6.0.33+86c3a9f149
	- fabric-model-loading-api-v1 5.0.3+129968e949
	- fabric-networking-api-v1 4.4.0+f3ffa98949
	- fabric-object-builder-api-v1 21.0.0+7b20cbb049
	- fabric-particles-v1 4.0.22+86c3a9f149
	- fabric-recipe-api-v1 8.1.6+052a85d049
	- fabric-registry-sync-v0 6.1.20+b556383249
	- fabric-renderer-api-v1 6.0.0+55bce67a49
	- fabric-renderer-indigo 3.0.0+55bce67a49
	- fabric-rendering-data-attachment-v1 0.3.64+73761d2e49
	- fabric-rendering-fluids-v1 3.1.27+86c3a9f149
	- fabric-rendering-v1 11.1.11+081cc04349
	- fabric-resource-conditions-api-v1 5.0.21+73a52b4b49
	- fabric-resource-loader-v0 3.1.6+02ca679649
	- fabric-screen-api-v1 2.0.46+86c3a9f149
	- fabric-screen-handler-api-v1 1.3.127+c327076a49
	- fabric-sound-api-v1 1.0.38+86c3a9f149
	- fabric-tag-api-v1 1.0.16+ecf51cdc49
	- fabric-transfer-api-v1 5.4.23+7b20cbb049
	- fabric-transitive-access-wideners-v1 6.3.17+f17a180c49
	- fabricloader 0.16.11
	- java 21
	- minecraft 1.21.5
	- mixinextras 0.4.1
	- ttpmodpoc 1.0.0
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-crash-report-info-v1\0.3.12+86c3a9f149\fabric-crash-report-info-v1-0.3.12+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-networking-api-v1\4.4.0+f3ffa98949\fabric-networking-api-v1-4.4.0+f3ffa98949.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-command-api-v2\2.2.49+73a52b4b49\fabric-command-api-v2-2.2.49+73a52b4b49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-key-binding-api-v1\1.0.63+ecf51cdc49\fabric-key-binding-api-v1-1.0.63+ecf51cdc49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-entity-events-v1\2.0.25+27c1078f49\fabric-entity-events-v1-2.0.25+27c1078f49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-keybindings-v0\0.2.61+df3654b349\fabric-keybindings-v0-0.2.61+df3654b349.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-blockrenderlayer-v1\2.0.16+86c3a9f149\fabric-blockrenderlayer-v1-2.0.16+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-recipe-api-v1\8.1.6+052a85d049\fabric-recipe-api-v1-8.1.6+052a85d049.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-command-api-v1\1.2.70+f71b366f49\fabric-command-api-v1-1.2.70+f71b366f49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-object-builder-api-v1\21.0.0+7b20cbb049\fabric-object-builder-api-v1-21.0.0+7b20cbb049.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-particles-v1\4.0.22+86c3a9f149\fabric-particles-v1-4.0.22+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-rendering-v1\11.1.11+081cc04349\fabric-rendering-v1-11.1.11+081cc04349.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-gametest-api-v1\3.1.2+2a6ec84b49\fabric-gametest-api-v1-3.1.2+2a6ec84b49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-data-attachment-api-v1\1.6.6+7b20cbb049\fabric-data-attachment-api-v1-1.6.6+7b20cbb049.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-resource-loader-v0\3.1.6+02ca679649\fabric-resource-loader-v0-3.1.6+02ca679649.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-tag-api-v1\1.0.16+ecf51cdc49\fabric-tag-api-v1-1.0.16+ecf51cdc49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-convention-tags-v1\2.1.28+7f945d5b49\fabric-convention-tags-v1-2.1.28+7f945d5b49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-block-api-v1\1.0.37+86c3a9f149\fabric-block-api-v1-1.0.37+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-item-group-api-v1\4.2.8+3459fc6149\fabric-item-group-api-v1-4.2.8+3459fc6149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-renderer-api-v1\6.0.0+55bce67a49\fabric-renderer-api-v1-6.0.0+55bce67a49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-message-api-v1\6.0.33+86c3a9f149\fabric-message-api-v1-6.0.33+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-commands-v0\0.2.87+df3654b349\fabric-commands-v0-0.2.87+df3654b349.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-loot-api-v2\3.0.47+3f89f5a549\fabric-loot-api-v2-3.0.47+3f89f5a549.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-api-base\0.4.62+73a52b4b49\fabric-api-base-0.4.62+73a52b4b49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-sound-api-v1\1.0.38+86c3a9f149\fabric-sound-api-v1-1.0.38+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-api-lookup-api-v1\1.6.95+86c3a9f149\fabric-api-lookup-api-v1-1.6.95+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-loot-api-v3\1.0.35+86c3a9f149\fabric-loot-api-v3-1.0.35+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-model-loading-api-v1\5.0.3+129968e949\fabric-model-loading-api-v1-5.0.3+129968e949.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-api\0.119.6+1.21.5\fabric-api-0.119.6+1.21.5.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-rendering-data-attachment-v1\0.3.64+73761d2e49\fabric-rendering-data-attachment-v1-0.3.64+73761d2e49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-screen-api-v1\2.0.46+86c3a9f149\fabric-screen-api-v1-2.0.46+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-block-view-api-v2\1.0.26+aa6d566c49\fabric-block-view-api-v2-1.0.26+aa6d566c49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-item-api-v1\11.3.1+eeb42f0249\fabric-item-api-v1-11.3.1+eeb42f0249.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-client-tags-api-v1\1.1.37+86c3a9f149\fabric-client-tags-api-v1-1.1.37+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-resource-conditions-api-v1\5.0.21+73a52b4b49\fabric-resource-conditions-api-v1-5.0.21+73a52b4b49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-registry-sync-v0\6.1.20+b556383249\fabric-registry-sync-v0-6.1.20+b556383249.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-data-generation-api-v1\22.3.2+d94614b849\fabric-data-generation-api-v1-22.3.2+d94614b849.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-dimensions-v1\4.0.16+86c3a9f149\fabric-dimensions-v1-4.0.16+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-transitive-access-wideners-v1\6.3.17+f17a180c49\fabric-transitive-access-wideners-v1-6.3.17+f17a180c49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-content-registries-v0\10.0.11+216530c849\fabric-content-registries-v0-10.0.11+216530c849.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-events-interaction-v0\4.0.13+73a52b4b49\fabric-events-interaction-v0-4.0.13+73a52b4b49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-screen-handler-api-v1\1.3.127+c327076a49\fabric-screen-handler-api-v1-1.3.127+c327076a49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-transfer-api-v1\5.4.23+7b20cbb049\fabric-transfer-api-v1-5.4.23+7b20cbb049.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-lifecycle-events-v1\2.5.13+5cbce67349\fabric-lifecycle-events-v1-2.5.13+5cbce67349.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-rendering-fluids-v1\3.1.27+86c3a9f149\fabric-rendering-fluids-v1-3.1.27+86c3a9f149.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\build\resources\main to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-convention-tags-v2\2.14.2+7d35484649\fabric-convention-tags-v2-2.14.2+7d35484649.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-renderer-indigo\3.0.0+55bce67a49\fabric-renderer-indigo-3.0.0+55bce67a49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-game-rule-api-v1\1.0.70+c327076a49\fabric-game-rule-api-v1-1.0.70+c327076a49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-client-gametest-api-v1\4.1.10+f3ffa98949\fabric-client-gametest-api-v1-4.1.10+f3ffa98949.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.github.llamalad7\mixinextras-fabric\0.4.1\8d1a9e96afb990367fa1f904d17580d164da72e3\mixinextras-fabric-0.4.1.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-biome-api-v1\16.0.7+2dd063df49\fabric-biome-api-v1-16.0.7+2dd063df49.jar to classpath.
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl::clientInit for mod fabric-networking-api-v1 (key client)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.networking.CommonPacketsImpl::init for mod fabric-networking-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.networking.NetworkingImpl::init for mod fabric-networking-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.recipe.ingredient.client.CustomIngredientSyncClient for mod fabric-recipe-api-v1 (key client)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientInit for mod fabric-recipe-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync for mod fabric-recipe-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.command.v1.LegacyHandler for mod fabric-command-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.gametest.FabricGameTestModInitializer for mod fabric-gametest-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.attachment.client.AttachmentSyncClient for mod fabric-data-attachment-api-v1 (key client)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.attachment.AttachmentEntrypoint for mod fabric-data-attachment-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.attachment.sync.AttachmentSync for mod fabric-data-attachment-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.tag.TagInit for mod fabric-tag-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.tag.convention.ConventionLogWarnings for mod fabric-convention-tags-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.loot.v2.LootInitializer for mod fabric-loot-api-v2 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.lookup.ApiLookupImpl for mod fabric-api-lookup-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl for mod fabric-resource-conditions-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.client.registry.sync.FabricRegistryClientInit for mod fabric-registry-sync-v0 (key client)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.registry.sync.FabricRegistryInit for mod fabric-registry-sync-v0 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.event.interaction.InteractionEventsRouter for mod fabric-events-interaction-v0 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.screenhandler.client.ClientNetworking for mod fabric-screen-handler-api-v1 (key client)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.screenhandler.Networking for mod fabric-screen-handler-api-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.client.event.lifecycle.ClientLifecycleEventsImpl for mod fabric-lifecycle-events-v1 (key client)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.event.lifecycle.LifecycleEventsImpl for mod fabric-lifecycle-events-v1 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.obsrvr.ttpmodpoc.TtpmodpocDataGenerator for mod ttpmodpoc (key fabric-datagen)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.obsrvr.ttpmodpoc.TtpmodpocClient for mod ttpmodpoc (key client)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.obsrvr.ttpmodpoc.Ttpmodpoc for mod ttpmodpoc (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.tag.convention.v2.TranslationConventionLogWarnings for mod fabric-convention-tags-v2 (key main)
[20:09:48] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.client.indigo.Indigo for mod fabric-renderer-indigo (key client)
[20:09:48] [main/INFO] (FabricLoader/Mixin) SpongePowered MIXIN Subsystem Version=0.8.7 Source=file:/C:/Users/tillman/.gradle/caches/modules-2/files-2.1/net.fabricmc/sponge-mixin/0.15.4+mixin.0.8.7/6a12aacc794f1078458433116e9ed42c1cc98096/sponge-mixin-0.15.4+mixin.0.8.7.jar Service=Knot/Fabric Env=CLIENT
[20:09:48] [main/DEBUG] (FabricLoader/Mixin) Initialising Mixin Platform Manager
[20:09:48] [main/DEBUG] (FabricLoader/Mixin) Adding mixin platform agents for container ContainerHandleURI(file:///C:/Users/tillman/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.11/eb5ed64a38b1d76e0febc1902b27f2c4bd0abe40/fabric-loader-0.16.11.jar)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Instancing new MixinPlatformAgentDefault for ContainerHandleURI(file:///C:/Users/tillman/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.11/eb5ed64a38b1d76e0febc1902b27f2c4bd0abe40/fabric-loader-0.16.11.jar)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) MixinPlatformAgentDefault accepted container ContainerHandleURI(file:///C:/Users/tillman/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.11/eb5ed64a38b1d76e0febc1902b27f2c4bd0abe40/fabric-loader-0.16.11.jar)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Instancing new MixinPlatformAgentDefault for ContainerHandleURI(file:///C:/Users/tillman/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.11/eb5ed64a38b1d76e0febc1902b27f2c4bd0abe40/fabric-loader-0.16.11.jar)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) MixinPlatformAgentDefault accepted container ContainerHandleURI(file:///C:/Users/tillman/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.11/eb5ed64a38b1d76e0febc1902b27f2c4bd0abe40/fabric-loader-0.16.11.jar)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Processing prepare() for PlatformAgent[MixinPlatformAgentDefault:ContainerHandleURI(file:///C:/Users/tillman/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.11/eb5ed64a38b1d76e0febc1902b27f2c4bd0abe40/fabric-loader-0.16.11.jar)]
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Processing prepare() for PlatformAgent[MixinPlatformAgentDefault:ContainerHandleURI(file:///C:/Users/tillman/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.11/eb5ed64a38b1d76e0febc1902b27f2c4bd0abe40/fabric-loader-0.16.11.jar)]
[20:09:49] [main/INFO] (FabricLoader/Mixin) Loaded Fabric development mappings for mixin remapper!
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_21 specified by fabric-crash-report-info-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[20:09:49] [main/INFO] (FabricLoader/Mixin) Compatibility level set to JAVA_21
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-crash-report-info-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-networking-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-networking-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-command-api-v2.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-command-api-v2.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-key-binding-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-entity-events-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-blockrenderlayer-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-recipe-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-object-builder-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-object-builder-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-particles-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-rendering-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-gametest-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-data-attachment-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-data-attachment-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-resource-loader-v0.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-resource-loader-v0.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-tag-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-block-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-item-group-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-item-group-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-renderer-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-renderer-api-v1.debughud.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-message-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-message-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-loot-api-v2.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-sound-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-api-lookup-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-loot-api-v3.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-model-loading-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-rendering-data-attachment-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-rendering-data-attachment-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-screen-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-block-view-api-v2.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-block-view-api-v2.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-item-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-item-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-resource-conditions-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-registry-sync-v0.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-registry-sync-v0.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-data-generation-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-data-generation-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-dimensions-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-content-registries-v0.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-events-interaction-v0.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-events-interaction-v0.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-screen-handler-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-transfer-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-lifecycle-events-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-lifecycle-events-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-rendering-fluids-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config ttpmodpoc.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-convention-tags-api-v2.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-renderer-indigo.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-game-rule-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-game-rule-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-client-gametest-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-biome-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\minecraftMaven\net\minecraft\minecraft-merged-5e5bca9d97\1.21.5-net.fabricmc.yarn.1_21_5.1.21.5+build.1-v2\minecraft-merged-5e5bca9d97-1.21.5-net.fabricmc.yarn.1_21_5.1.21.5+build.1-v2.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\build\classes\java\main to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\build\resources\main to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\fabric-loom\1.21.5\net.fabricmc.yarn.1_21_5.1.21.5+build.1-v2\mappings.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.grpc\grpc-netty-shaded\1.61.0\b05c80ba6c3da3b3cbdc4453b822556232a59e70\grpc-netty-shaded-1.61.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.grpc\grpc-protobuf\1.61.0\75f6c72f90c0ab8561328b51f91fca815b2ef101\grpc-protobuf-1.61.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.grpc\grpc-stub\1.61.0\74dfd353cec372c07ac12eb7567ee4dd1c3f3534\grpc-stub-1.61.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.google.api.grpc\proto-google-common-protos\2.29.0\eb1cf1cf4c12d5eb9cef958dfd76af4101c55a62\proto-google-common-protos-2.29.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.google.protobuf\protobuf-java\4.28.2\d6c83e058bc3494c384d8e9e6b7a51ed2f5515cc\protobuf-java-4.28.2.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\javax.annotation\javax.annotation-api\1.3.2\934c04d3cfef185a8008e7bf34331b79730a9d43\javax.annotation-api-1.3.2.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.grpc\grpc-util\1.61.0\6d38801d23342b8ac15d2f5de500912ca16e2d20\grpc-util-1.61.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.grpc\grpc-core\1.61.0\70acbcf51003d6cf03a09c381f243ccf8de17dc5\grpc-core-1.61.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.grpc\grpc-protobuf-lite\1.61.0\9cbea0855652283cf793825d79cef7562ca812ad\grpc-protobuf-lite-1.61.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.grpc\grpc-context\1.61.0\a2e81e14a9cbc624012b2ef9a25bee882d477908\grpc-context-1.61.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.grpc\grpc-api\1.61.0\b9577481d3b994c32ef664cb33062c3d3aaf1b91\grpc-api-1.61.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.google.guava\guava\33.3.1-jre\852f8b363da0111e819460021ca693cacca3e8db\guava-33.3.1-jre.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.github.llamalad7\mixinextras-fabric\0.4.1\8d1a9e96afb990367fa1f904d17580d164da72e3\mixinextras-fabric-0.4.1.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\net.fabricmc\dev-launch-injector\0.2.1+build.8\da8bef7e6e2f952da707f282bdb46882a0fce5e3\dev-launch-injector-0.2.1+build.8.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.13.4\858c6cc78e1f08a885b1613e1d817c829df70a6e\jackson-annotations-2.13.4.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.13.4\cf934c681294b97ef6d80082faeefbe1edadf56\jackson-core-2.13.4.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.13.4.2\325c06bdfeb628cfb80ebaaf1a26cc1eb558a585\jackson-databind-2.13.4.2.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.github.oshi\oshi-core\6.6.5\e1099981fd15dc4236c4499d82aba1276fb43a9a\oshi-core-6.6.5.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.github.stephenc.jcip\jcip-annotations\1.0-1\ef31541dd28ae2cefdd17c7ebf352d93e9058c63\jcip-annotations-1.0-1.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.google.guava\failureaccess\1.0.2\c4a06a64e650562f30b7bf9aaec1bfed43aca12b\failureaccess-1.0.2.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.ibm.icu\icu4j\76.1\215f3a8e936d4069344bd75f2b1368fd58112894\icu4j-76.1.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.microsoft.azure\msal4j\1.17.2\a6211e3d71d0388929babaa0ff0951b30d001852\msal4j-1.17.2.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\blocklist\1.0.10\5c685c5ffa94c4cd39496c7184c1d122e515ecef\blocklist-1.0.10.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\brigadier\1.3.10\d15b53a14cf20fdcaa98f731af5dda654452c010\brigadier-1.3.10.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\datafixerupper\8.0.16\67d4de6d7f95d89bcf5862995fb854ebaec02a34\datafixerupper-8.0.16.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\jtracy\1.0.29\6f07dcb6a2e595c7ee2ca43b67e5d1c018ca0770\jtracy-1.0.29.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\jtracy\1.0.29\e05332cb31c7ae582dc8d8bd1bffd47c2ff7636f\jtracy-1.0.29-natives-windows.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\patchy\2.2.10\da05971b07cbb379d002cf7eaec6a2048211fefc\patchy-2.2.10.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.mojang\text2speech\1.18.11\e853a12cdd6ba4f4836e8f4bf3b37844a13482b6\text2speech-1.18.11.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.nimbusds\content-type\2.3\e3aa0be212d7a42839a8f3f506f5b990bcce0222\content-type-2.3.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.nimbusds\lang-tag\1.7\97c73ecd70bc7e8eefb26c5eea84f251a63f1031\lang-tag-1.7.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.nimbusds\nimbus-jose-jwt\9.40\42b1dfa0360e4062951b070bac52dd8d96fd7b38\nimbus-jose-jwt-9.40.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.nimbusds\oauth2-oidc-sdk\11.18\7c7ec4f4066625ff07a711ad856fa04da1ff9de\oauth2-oidc-sdk-11.18.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\commons-codec\commons-codec\1.17.1\973638b7149d333563584137ebf13a691bb60579\commons-codec-1.17.1.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\commons-io\commons-io\2.17.0\ddcc8433eb019fb48fe25207c0278143f3e1d7e2\commons-io-2.17.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\commons-logging\commons-logging\1.3.4\b9fc14968d63a8b8a8a2c1885fe3e90564239708\commons-logging-1.3.4.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-buffer\4.1.118.Final\7022990af1e0d449f9d5322035899745e19735c5\netty-buffer-4.1.118.Final.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec\4.1.118.Final\307f665c08ce57333121de4f460479fc0c3c94d4\netty-codec-4.1.118.Final.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-common\4.1.118.Final\4bb0f9899146484fa89f7b9bc27389d5b8e2ecde\netty-common-4.1.118.Final.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler\4.1.118.Final\30ebb05b6b0fb071dbfcf713017c4a767a97bb9b\netty-handler-4.1.118.Final.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver\4.1.118.Final\28c378c19c1779eca1104b400452627f3ebc4aea\netty-resolver-4.1.118.Final.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport-classes-epoll\4.1.118.Final\376ce95507066f0e755d97c1c8bcd6c33f657617\netty-transport-classes-epoll-4.1.118.Final.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport-native-unix-common\4.1.118.Final\9da25a94e6a0edac90da0bc7894e5a54efcb866b\netty-transport-native-unix-common-4.1.118.Final.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport\4.1.118.Final\5a27232e5d08218722d94ca14f0b1b4576e7711c\netty-transport-4.1.118.Final.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\it.unimi.dsi\fastutil\8.5.15\1e885b40c9563ab0d3899b871fd0b30e958705dc\fastutil-8.5.15.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\net.java.dev.jna\jna-platform\5.15.0\86b502cad57d45da172b5e3231c537b042e296ef\jna-platform-5.15.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\net.java.dev.jna\jna\5.15.0\1ee1d80ff44f08280188f7c0e740d57207841ac\jna-5.15.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\net.minidev\accessors-smart\2.5.1\19b820261eb2e7de7d5bde11d1c06e4501dd7e5f\accessors-smart-2.5.1.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\net.minidev\json-smart\2.5.1\4c11d2808d009132dfbbf947ebf37de6bf266c8e\json-smart-2.5.1.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\net.sf.jopt-simple\jopt-simple\5.0.4\4fdac2fbe92dfad86aa6e9301736f6b4342a3f5c\jopt-simple-5.0.4.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-compress\1.27.1\a19151084758e2fbb6b41eddaa88e7b8ff4e6599\commons-compress-1.27.1.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-lang3\3.17.0\b17d2136f0460dcc0d2016ceefca8723bdf4ee70\commons-lang3-3.17.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.apache.httpcomponents\httpclient\4.5.14\1194890e6f56ec29177673f2f12d0b8e627dec98\httpclient-4.5.14.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.apache.httpcomponents\httpcore\4.4.16\51cf043c87253c9f58b539c9f7e44c8894223850\httpcore-4.4.16.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.jcraft\jorbis\0.0.17\8872d22b293e8f5d7d56ff92be966e6dc28ebdc6\jorbis-0.0.17.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.joml\joml\1.10.8\fc0a71dad90a2cf41d82a76156a0e700af8e4f8d\joml-1.10.8.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-freetype\3.3.3\a0db6c84a8becc8ca05f9dbfa985edc348a824c7\lwjgl-freetype-3.3.3.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-freetype\3.3.3\81091b006dbb43fab04c8c638e9ac87c51b4096d\lwjgl-freetype-3.3.3-natives-windows.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-freetype\3.3.3\82028265a0a2ff33523ca75137ada7dc176e5210\lwjgl-freetype-3.3.3-natives-windows-arm64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-freetype\3.3.3\15a8c1de7f51d07a92eae7ce1222557073a0c0c3\lwjgl-freetype-3.3.3-natives-windows-x86.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-glfw\3.3.3\efa1eb78c5ccd840e9f329717109b5e892d72f8e\lwjgl-glfw-3.3.3.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-glfw\3.3.3\e449e28b4891fc423c54c85fbc5bb0b9efece67a\lwjgl-glfw-3.3.3-natives-windows.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-glfw\3.3.3\f27018dc74f6289574502b46cce55d52817554e2\lwjgl-glfw-3.3.3-natives-windows-arm64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-glfw\3.3.3\32334f3fd5270a59bad9939a93115acb6de36dcf\lwjgl-glfw-3.3.3-natives-windows-x86.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-jemalloc\3.3.3\b543467b7ff3c6920539a88ee602d34098628be5\lwjgl-jemalloc-3.3.3.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-jemalloc\3.3.3\426222fc027602a5f21b9c0fe79cde6a4c7a011f\lwjgl-jemalloc-3.3.3-natives-windows.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-jemalloc\3.3.3\ba1f3fed0ee4be0217eaa41c5bbfb4b9b1383c33\lwjgl-jemalloc-3.3.3-natives-windows-arm64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-jemalloc\3.3.3\f6063b6e0f23be483c5c88d84ce51b39dc69126c\lwjgl-jemalloc-3.3.3-natives-windows-x86.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-openal\3.3.3\daada81ceb5fc0c291fbfdd4433cb8d9423577f2\lwjgl-openal-3.3.3.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-openal\3.3.3\cf83862ae95d98496b26915024c7e666d8ab1c8f\lwjgl-openal-3.3.3-natives-windows.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-openal\3.3.3\8e0615235116b9e4160dfe87bec90f5f6378bf72\lwjgl-openal-3.3.3-natives-windows-arm64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-openal\3.3.3\87b8d5050e3adb46bb58fe1cb2669a4a48fce10d\lwjgl-openal-3.3.3-natives-windows-x86.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-opengl\3.3.3\2f6b0147078396a58979125a4c947664e98293a\lwjgl-opengl-3.3.3.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-opengl\3.3.3\e6c1eec8be8a71951b830a4d69efc01c6531900c\lwjgl-opengl-3.3.3-natives-windows.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-opengl\3.3.3\65e956d3735a1abdc82eff4baec1b61174697d4b\lwjgl-opengl-3.3.3-natives-windows-arm64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-opengl\3.3.3\d32d833dcaa2f355a886eaf21f0408b5f03241d\lwjgl-opengl-3.3.3-natives-windows-x86.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-stb\3.3.3\25dd6161988d7e65f71d5065c99902402ee32746\lwjgl-stb-3.3.3.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-stb\3.3.3\1d9facdf6541de114b0f963be33505b7679c78cb\lwjgl-stb-3.3.3-natives-windows.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-stb\3.3.3\a584ab44de569708871f0a79561f4d8c37487f2c\lwjgl-stb-3.3.3-natives-windows-arm64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-stb\3.3.3\b5c874687b9aac1a936501d4ed2c49567fd1b575\lwjgl-stb-3.3.3-natives-windows-x86.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-tinyfd\3.3.3\82d755ca94b102e9ca77283b9e2dc46d1b15fbe5\lwjgl-tinyfd-3.3.3.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-tinyfd\3.3.3\a6697981b0449a5087c1d546fc08b4f73e8f98c9\lwjgl-tinyfd-3.3.3-natives-windows.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-tinyfd\3.3.3\a88c494f3006eb91a7433b12a3a55a9a6c20788b\lwjgl-tinyfd-3.3.3-natives-windows-arm64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-tinyfd\3.3.3\c336c84ee88cccb495c6ffa112395509e7378e8a\lwjgl-tinyfd-3.3.3-natives-windows-x86.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl\3.3.3\29589b5f87ed335a6c7e7ee6a5775f81f97ecb84\lwjgl-3.3.3.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl\3.3.3\a5ed18a2b82fc91b81f40d717cb1f64c9dcb0540\lwjgl-3.3.3-natives-windows.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl\3.3.3\e9aca8c5479b520a2a7f0d542a118140e812c5e8\lwjgl-3.3.3-natives-windows-arm64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl\3.3.3\9e670718e050aeaeea0c2d5b907cffb142f2e58f\lwjgl-3.3.3-natives-windows-x86.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.lz4\lz4-java\1.8.0\4b986a99445e49ea5fbf5d149c4b63f6ed6c6780\lz4-java-1.8.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport-native-epoll\4.1.118.Final\7e6b89e3746acb7cf6f0aad993bbd058fc6d912e\netty-transport-native-epoll-4.1.118.Final-linux-x86_64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport-native-epoll\4.1.118.Final\82f94d0a9d837f6b6a580379373310ff7288c0f8\netty-transport-native-epoll-4.1.118.Final-linux-aarch_64.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-api\0.119.6+1.21.5\fabric-api-0.119.6+1.21.5.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-transfer-api-v1\5.4.23+7b20cbb049\fabric-transfer-api-v1-5.4.23+7b20cbb049.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-api-lookup-api-v1\1.6.95+86c3a9f149\fabric-api-lookup-api-v1-1.6.95+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-blockrenderlayer-v1\2.0.16+86c3a9f149\fabric-blockrenderlayer-v1-2.0.16+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-client-tags-api-v1\1.1.37+86c3a9f149\fabric-client-tags-api-v1-1.1.37+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-command-api-v1\1.2.70+f71b366f49\fabric-command-api-v1-1.2.70+f71b366f49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-commands-v0\0.2.87+df3654b349\fabric-commands-v0-0.2.87+df3654b349.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-command-api-v2\2.2.49+73a52b4b49\fabric-command-api-v2-2.2.49+73a52b4b49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-content-registries-v0\10.0.11+216530c849\fabric-content-registries-v0-10.0.11+216530c849.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-data-generation-api-v1\22.3.2+d94614b849\fabric-data-generation-api-v1-22.3.2+d94614b849.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-convention-tags-v1\2.1.28+7f945d5b49\fabric-convention-tags-v1-2.1.28+7f945d5b49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-convention-tags-v2\2.14.2+7d35484649\fabric-convention-tags-v2-2.14.2+7d35484649.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-data-attachment-api-v1\1.6.6+7b20cbb049\fabric-data-attachment-api-v1-1.6.6+7b20cbb049.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-entity-events-v1\2.0.25+27c1078f49\fabric-entity-events-v1-2.0.25+27c1078f49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-events-interaction-v0\4.0.13+73a52b4b49\fabric-events-interaction-v0-4.0.13+73a52b4b49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-gametest-api-v1\3.1.2+2a6ec84b49\fabric-gametest-api-v1-3.1.2+2a6ec84b49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-item-api-v1\11.3.1+eeb42f0249\fabric-item-api-v1-11.3.1+eeb42f0249.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-item-group-api-v1\4.2.8+3459fc6149\fabric-item-group-api-v1-4.2.8+3459fc6149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-lifecycle-events-v1\2.5.13+5cbce67349\fabric-lifecycle-events-v1-2.5.13+5cbce67349.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-loot-api-v2\3.0.47+3f89f5a549\fabric-loot-api-v2-3.0.47+3f89f5a549.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-loot-api-v3\1.0.35+86c3a9f149\fabric-loot-api-v3-1.0.35+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-message-api-v1\6.0.33+86c3a9f149\fabric-message-api-v1-6.0.33+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-model-loading-api-v1\5.0.3+129968e949\fabric-model-loading-api-v1-5.0.3+129968e949.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-recipe-api-v1\8.1.6+052a85d049\fabric-recipe-api-v1-8.1.6+052a85d049.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-screen-handler-api-v1\1.3.127+c327076a49\fabric-screen-handler-api-v1-1.3.127+c327076a49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-registry-sync-v0\6.1.20+b556383249\fabric-registry-sync-v0-6.1.20+b556383249.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-networking-api-v1\4.4.0+f3ffa98949\fabric-networking-api-v1-4.4.0+f3ffa98949.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-object-builder-api-v1\21.0.0+7b20cbb049\fabric-object-builder-api-v1-21.0.0+7b20cbb049.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-particles-v1\4.0.22+86c3a9f149\fabric-particles-v1-4.0.22+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-renderer-indigo\3.0.0+55bce67a49\fabric-renderer-indigo-3.0.0+55bce67a49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-renderer-api-v1\6.0.0+55bce67a49\fabric-renderer-api-v1-6.0.0+55bce67a49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-rendering-fluids-v1\3.1.27+86c3a9f149\fabric-rendering-fluids-v1-3.1.27+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-rendering-v1\11.1.11+081cc04349\fabric-rendering-v1-11.1.11+081cc04349.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-tag-api-v1\1.0.16+ecf51cdc49\fabric-tag-api-v1-1.0.16+ecf51cdc49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-resource-loader-v0\3.1.6+02ca679649\fabric-resource-loader-v0-3.1.6+02ca679649.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-screen-api-v1\2.0.46+86c3a9f149\fabric-screen-api-v1-2.0.46+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-api-base\0.4.62+73a52b4b49\fabric-api-base-0.4.62+73a52b4b49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-biome-api-v1\16.0.7+2dd063df49\fabric-biome-api-v1-16.0.7+2dd063df49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-block-api-v1\1.0.37+86c3a9f149\fabric-block-api-v1-1.0.37+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-rendering-data-attachment-v1\0.3.64+73761d2e49\fabric-rendering-data-attachment-v1-0.3.64+73761d2e49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-block-view-api-v2\1.0.26+aa6d566c49\fabric-block-view-api-v2-1.0.26+aa6d566c49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-client-gametest-api-v1\4.1.10+f3ffa98949\fabric-client-gametest-api-v1-4.1.10+f3ffa98949.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-crash-report-info-v1\0.3.12+86c3a9f149\fabric-crash-report-info-v1-0.3.12+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-dimensions-v1\4.0.16+86c3a9f149\fabric-dimensions-v1-4.0.16+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-game-rule-api-v1\1.0.70+c327076a49\fabric-game-rule-api-v1-1.0.70+c327076a49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-keybindings-v0\0.2.61+df3654b349\fabric-keybindings-v0-0.2.61+df3654b349.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-key-binding-api-v1\1.0.63+ecf51cdc49\fabric-key-binding-api-v1-1.0.63+ecf51cdc49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-resource-conditions-api-v1\5.0.21+73a52b4b49\fabric-resource-conditions-api-v1-5.0.21+73a52b4b49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-sound-api-v1\1.0.38+86c3a9f149\fabric-sound-api-v1-1.0.38+86c3a9f149.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\_git\ttpmodpoc\.gradle\loom-cache\remapped_mods\net_fabricmc_yarn_1_21_5_1_21_5_build_1_v2\net\fabricmc\fabric-api\fabric-transitive-access-wideners-v1\6.3.17+f17a180c49\fabric-transitive-access-wideners-v1-6.3.17+f17a180c49.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.google.errorprone\error_prone_annotations\2.28.0\59fc00087ce372de42e394d2c789295dff2d19f0\error_prone_annotations-2.28.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\io.perfmark\perfmark-api\0.26.0\ef65452adaf20bf7d12ef55913aba24037b82738\perfmark-api-0.26.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.google.code.findbugs\jsr305\3.0.2\25ea2e8b0c338a877313bd4672d3fe056ea78f0d\jsr305-3.0.2.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.google.guava\listenablefuture\9999.0-empty-to-avoid-conflict-with-guava\b421526c5f297295adef1c886e5246c39d4ac629\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.checkerframework\checker-qual\3.43.0\9425eee39e56b116d2b998b7c2cebcbd11a3c98b\checker-qual-3.43.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.google.j2objc\j2objc-annotations\3.0.0\7399e65dd7e9ff3404f4535b2f017093bdb134c7\j2objc-annotations-3.0.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.jline\jline-reader\3.20.0\8f15415b022a25b473e8e16c28ae913186ffb9c4\jline-reader-3.20.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\com.google.android\annotations\4.1.1.4\a1678ba907bf92691d879fef34e1a187038f9259\annotations-4.1.1.4.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.codehaus.mojo\animal-sniffer-annotations\1.23\3c0daebd5f0e1ce72cc50c818321ac957aeb5d70\animal-sniffer-annotations-1.23.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\tillman\.gradle\caches\modules-2\files-2.1\org.jline\jline-terminal\3.20.0\d0ddcc708ddf527a3454c941b7b9225cc83a15ff\jline-terminal-3.20.0.jar to classpath.
[20:09:49] [main/DEBUG] (FabricLoader/Entrypoint) No subscribers for entrypoint 'preLaunch'
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing mixins for MixinEnvironment[DEFAULT]
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-crash-report-info-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-networking-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-networking-api-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-command-api-v2.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-command-api-v2.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-key-binding-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-entity-events-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-blockrenderlayer-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-recipe-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-object-builder-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-object-builder-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-particles-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-rendering-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-gametest-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-data-attachment-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-data-attachment-api-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-resource-loader-v0.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-resource-loader-v0.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-tag-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-block-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-item-group-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-item-group-api-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-renderer-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-renderer-api-v1.debughud.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-message-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-message-api-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-loot-api-v2.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-sound-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-api-lookup-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-loot-api-v3.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-model-loading-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-rendering-data-attachment-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-rendering-data-attachment-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-screen-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-block-view-api-v2.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-block-view-api-v2.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-item-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-item-api-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-resource-conditions-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-registry-sync-v0.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-registry-sync-v0.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-data-generation-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-data-generation-api-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-dimensions-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-content-registries-v0.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-events-interaction-v0.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-events-interaction-v0.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-screen-handler-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-transfer-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-lifecycle-events-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-lifecycle-events-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-rendering-fluids-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config ttpmodpoc.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-convention-tags-api-v2.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-renderer-indigo.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-game-rule-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-game-rule-api-v1.client.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-client-gametest-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config mixinextras.init.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/MixinExtras|Service) com.llamalad7.mixinextras.service.MixinExtrasServiceImpl(version=0.4.1) is taking over from null
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @Inject with org.spongepowered.asm.mixin.injection.struct.CallbackInjectionInfo
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @ModifyArg with org.spongepowered.asm.mixin.injection.struct.ModifyArgInjectionInfo
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @ModifyArgs with org.spongepowered.asm.mixin.injection.struct.ModifyArgsInjectionInfo
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @Redirect with org.spongepowered.asm.mixin.injection.struct.RedirectInjectionInfo
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @ModifyVariable with org.spongepowered.asm.mixin.injection.struct.ModifyVariableInjectionInfo
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @ModifyConstant with org.spongepowered.asm.mixin.injection.struct.ModifyConstantInjectionInfo
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-biome-api-v1.mixins.json
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-crash-report-info-v1.mixins.json (2)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-networking-api-v1.mixins.json (20)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/network/packet/CustomPayload$1 is public in fabric-networking-api-v1.mixins.json:CustomPayloadPacketCodecMixin from mod fabric-networking-api-v1 and should be specified in value
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/server/world/ServerChunkLoadingManager$EntityTracker is public in fabric-networking-api-v1.mixins.json:accessor.EntityTrackerAccessor from mod fabric-networking-api-v1 and should be specified in value
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-networking-api-v1.client.mixins.json (9)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-command-api-v2.mixins.json (5)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-command-api-v2.client.mixins.json (2)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-key-binding-api-v1.mixins.json (2)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-entity-events-v1.mixins.json (7)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-blockrenderlayer-v1.mixins.json (1)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-recipe-api-v1.mixins.json (5)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-object-builder-v1.mixins.json (9)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-object-builder-v1.client.mixins.json (4)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-particles-v1.client.mixins.json (4)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-rendering-v1.mixins.json (17)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-gametest-api-v1.mixins.json (4)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-data-attachment-api-v1.mixins.json (14)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-data-attachment-api-v1.client.mixins.json (1)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-resource-loader-v0.mixins.json (15)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-resource-loader-v0.client.mixins.json (8)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/option/GameOptions$3 is public in fabric-resource-loader-v0.client.mixins.json:GameOptionsWriteVisitorMixin from mod fabric-resource-loader-v0 and should be specified in value
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-tag-api-v1.mixins.json (5)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/registry/SimpleRegistry$2 is public in fabric-tag-api-v1.mixins.json:SimpleRegistry2Mixin from mod fabric-tag-api-v1 and should be specified in value
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/registry/SimpleRegistry$3 is public in fabric-tag-api-v1.mixins.json:SimpleRegistry3Mixin from mod fabric-tag-api-v1 and should be specified in value
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/registry/SimpleRegistry$TagLookup$2 is public in fabric-tag-api-v1.mixins.json:SimpleRegistryTagLookup2Accessor from mod fabric-tag-api-v1 and should be specified in value
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-block-api-v1.mixins.json (4)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/world/chunk/ChunkSection$BlockStateCounter is public in fabric-block-api-v1.mixins.json:ChunkSectionBlockStateCounterMixin from mod fabric-block-api-v1 and should be specified in value
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-item-group-api-v1.mixins.json (3)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-item-group-api-v1.client.mixins.json (1)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-renderer-api-v1.mixins.json (22)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-renderer-api-v1.debughud.mixins.json (1)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-message-api-v1.mixins.json (2)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-message-api-v1.client.mixins.json (2)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-loot-api-v2.mixins.json (2)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-sound-api-v1.mixins.json (2)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-api-lookup-api-v1.mixins.json (2)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-loot-api-v3.mixins.json (7)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-model-loading-api-v1.mixins.json (4)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-rendering-data-attachment-v1.mixins.json (2)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-rendering-data-attachment-v1.client.mixins.json (1)
[20:09:49] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-screen-api-v1.mixins.json (7)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-block-view-api-v2.mixins.json (3)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-block-view-api-v2.client.mixins.json (2)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-item-api-v1.mixins.json (16)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-item-api-v1.client.mixins.json (3)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-resource-conditions-api-v1.mixins.json (8)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-registry-sync-v0.mixins.json (16)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-registry-sync-v0.client.mixins.json (5)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/network/ClientRegistries$DynamicRegistries is public in fabric-registry-sync-v0.client.mixins.json:ClientRegistriesDynamicRegistriesAccessor from mod fabric-registry-sync-v0 and should be specified in value
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-data-generation-api-v1.mixins.json (10)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/data/DataCache$CachedData is public in fabric-data-generation-api-v1.mixins.json:DataCacheCachedDataMixin from mod fabric-data-generation-api-v1 and should be specified in value
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-data-generation-api-v1.client.mixins.json (4)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-dimensions-v1.mixins.json (4)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-content-registries-v0.mixins.json (17)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-events-interaction-v0.mixins.json (5)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/server/network/ServerPlayNetworkHandler$1 is public in fabric-events-interaction-v0.mixins.json:ServerPlayNetworkHandlerInteractEntityHandlerMixin from mod fabric-events-interaction-v0 and should be specified in value
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-events-interaction-v0.client.mixins.json (3)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-screen-handler-api-v1.mixins.json (2)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-transfer-api-v1.mixins.json (15)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-lifecycle-events-v1.mixins.json (10)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/server/world/ServerWorld$ServerEntityHandler is public in fabric-lifecycle-events-v1.mixins.json:ServerWorldServerEntityHandlerMixin from mod fabric-lifecycle-events-v1 and should be specified in value
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-lifecycle-events-v1.client.mixins.json (7)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/world/ClientWorld$ClientEntityHandler is public in fabric-lifecycle-events-v1.client.mixins.json:ClientWorldClientEntityHandlerMixin from mod fabric-lifecycle-events-v1 and should be specified in value
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-rendering-fluids-v1.mixins.json (1)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing ttpmodpoc.mixins.json (0)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-convention-tags-api-v2.mixins.json (1)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-renderer-indigo.mixins.json (8)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-game-rule-api-v1.mixins.json (6)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/server/command/GameRuleCommand$1 is public in fabric-game-rule-api-v1.mixins.json:GameRuleCommandVisitorMixin from mod fabric-game-rule-api-v1 and should be specified in value
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-game-rule-api-v1.client.mixins.json (3)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/gui/screen/world/EditGameRulesScreen$RuleListWidget$1 is public in fabric-game-rule-api-v1.client.mixins.json:RuleListWidgetVisitorMixin from mod fabric-game-rule-api-v1 and should be specified in value
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-client-gametest-api-v1.mixins.json (26)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing mixinextras.init.mixins.json (0)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-biome-api-v1.mixins.json (9)
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/world/biome/source/MultiNoiseBiomeSourceParameterList$Preset$1 is public in fabric-biome-api-v1.mixins.json:NetherBiomePresetMixin from mod fabric-biome-api-v1 and should be specified in value
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Inner class net/fabricmc/fabric/mixin/itemgroup/ItemGroupsMixin$1ItemGroupPosition in net/fabricmc/fabric/mixin/itemgroup/ItemGroupsMixin on net/minecraft/item/ItemGroups gets unique name net/minecraft/item/ItemGroups$1ItemGroupPosition$a6ad1fe972fc4336bf5405275a4ca496
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Inner class net/fabricmc/fabric/mixin/renderer/client/block/model/MultipartBlockStateModelMixin$1Key in net/fabricmc/fabric/mixin/renderer/client/block/model/MultipartBlockStateModelMixin on net/minecraft/client/render/model/MultipartBlockStateModel gets unique name net/minecraft/client/render/model/MultipartBlockStateModel$1Key$da2be0b942754b29886dea670ba392a3
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Inner class net/fabricmc/fabric/mixin/transfer/ChiseledBookshelfBlockEntityMixin$1 in net/fabricmc/fabric/mixin/transfer/ChiseledBookshelfBlockEntityMixin on net/minecraft/block/entity/ChiseledBookshelfBlockEntity gets unique name net/minecraft/block/entity/ChiseledBookshelfBlockEntity$Anonymous$dca4e5ddaab04397b5ad47f4ae3a54e4
[20:09:50] [main/DEBUG] (FabricLoader/Mixin) Prepared 350 mixins in 1.045 sec (3.0ms avg) (0ms load, 0ms transform, 0ms plugin)
[20:09:50] [main/DEBUG] (io.netty.util.internal.logging.InternalLoggerFactory) Using SLF4J as the default logging framework
[20:09:50] [main/DEBUG] (io.netty.util.ResourceLeakDetector) -Dio.netty.leakDetection.level: simple
[20:09:50] [main/DEBUG] (io.netty.util.ResourceLeakDetector) -Dio.netty.leakDetection.targetRecords: 4
[20:09:51] [main/INFO] (FabricLoader/MixinExtras|Service) Initializing MixinExtras via com.llamalad7.mixinextras.service.MixinExtrasServiceImpl(version=0.4.1).
[20:09:51] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @SugarWrapper with com.llamalad7.mixinextras.sugar.impl.SugarWrapperInjectionInfo
[20:09:51] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @FactoryRedirectWrapper with com.llamalad7.mixinextras.wrapper.factory.FactoryRedirectWrapperInjectionInfo
[20:09:51] [main/DEBUG] (FabricLoader/Mixin) Mixing TaggedChoiceMixin from fabric-dimensions-v1.mixins.json into com.mojang.datafixers.types.templates.TaggedChoice
[20:09:51] [main/DEBUG] (FabricLoader/Mixin) fabric-dimensions-v1.mixins.json:TaggedChoiceMixin from mod fabric-dimensions-v1->@Inject::onApply(Lcom/mojang/datafixers/util/Pair;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:51] [main/DEBUG] (FabricLoader/Mixin) Mixing TaggedChoiceTypeMixin from fabric-dimensions-v1.mixins.json into com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
[20:09:51] [main/DEBUG] (FabricLoader/Mixin) fabric-dimensions-v1.mixins.json:TaggedChoiceTypeMixin from mod fabric-dimensions-v1->@Inject::onGetCodec(Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:52] [main/DEBUG] (FabricLoader/Mixin) Mixing Schema2832Mixin from fabric-dimensions-v1.mixins.json into net.minecraft.datafixer.schema.Schema2832
[20:09:52] [main/DEBUG] (FabricLoader/Mixin) Mixing SystemDetailsMixin from fabric-crash-report-info-v1.mixins.json into net.minecraft.util.SystemDetails
[20:09:52] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$appendMods$1(Lnet/fabricmc/loader/api/ModContainer;)Ljava/lang/String; to md84ced3$fabric-crash-report-info-v1$lambda$appendMods$1$0 in fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1
[20:09:52] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fillSystemDetails$0()Ljava/lang/String; to md84ced3$fabric-crash-report-info-v1$lambda$fillSystemDetails$0$1 in fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1
[20:09:52] [main/DEBUG] (FabricLoader/Mixin) fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1->@Inject::fillSystemDetails(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:52] [main/DEBUG] (FabricLoader/Mixin) fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1->@Inject::fillSystemDetails(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:52] [main/DEBUG] (FabricLoader/Mixin) fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1->@Inject::fillSystemDetails(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing BootstrapMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.Bootstrap
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$initialize$1(Lnet/minecraft/fluid/Fluid;)Ljava/util/Collection; to md84ced3$fabric-registry-sync-v0$lambda$initialize$1$0 in fabric-registry-sync-v0.mixins.json:BootstrapMixin from mod fabric-registry-sync-v0
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$initialize$0(Lnet/minecraft/block/Block;)Ljava/util/Collection; to md84ced3$fabric-registry-sync-v0$lambda$initialize$0$1 in fabric-registry-sync-v0.mixins.json:BootstrapMixin from mod fabric-registry-sync-v0
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:BootstrapMixin from mod fabric-registry-sync-v0->@Inject::initialize(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistryMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.Registry
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistriesMixin from fabric-item-api-v1.mixins.json into net.minecraft.registry.Registries
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistriesAccessor from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.Registries
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getROOT()Lnet/minecraft/registry/MutableRegistry; to getROOT$fabric-registry-sync-v0_$md$84ced3$0 in fabric-registry-sync-v0.mixins.json:RegistriesAccessor from mod fabric-registry-sync-v0
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistriesMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.Registries
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:RegistriesMixin from mod fabric-item-api-v1->@Inject::modifyDefaultItemComponents(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:RegistriesMixin from mod fabric-registry-sync-v0->@Inject::init(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing SimpleRegistryMixin from fabric-tag-api-v1.mixins.json into net.minecraft.registry.SimpleRegistry
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing SimpleRegistryAccessor from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.SimpleRegistry
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing SimpleRegistryMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.SimpleRegistry
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$4([Lnet/fabricmc/fabric/api/event/registry/RegistryIdRemapCallback;)Lnet/fabricmc/fabric/api/event/registry/RegistryIdRemapCallback; to md84ced3$fabric-registry-sync-v0$lambda$init$4$0 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$3([Lnet/fabricmc/fabric/api/event/registry/RegistryIdRemapCallback;Lnet/fabricmc/fabric/api/event/registry/RegistryIdRemapCallback$RemapState;)V to md84ced3$fabric-registry-sync-v0$lambda$init$3$1 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$2(ILnet/minecraft/util/Identifier;Ljava/lang/Object;)V to md84ced3$fabric-registry-sync-v0$lambda$init$2$2 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$1([Lnet/fabricmc/fabric/api/event/registry/RegistryEntryAddedCallback;)Lnet/fabricmc/fabric/api/event/registry/RegistryEntryAddedCallback; to md84ced3$fabric-registry-sync-v0$lambda$init$1$3 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$0([Lnet/fabricmc/fabric/api/event/registry/RegistryEntryAddedCallback;ILnet/minecraft/util/Identifier;Ljava/lang/Object;)V to md84ced3$fabric-registry-sync-v0$lambda$init$0$4 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0->@Inject::init(Lnet/minecraft/registry/RegistryKey;Lcom/mojang/serialization/Lifecycle;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0->@Inject::init(Lnet/minecraft/registry/RegistryKey;Lcom/mojang/serialization/Lifecycle;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0->@Inject::init(Lnet/minecraft/registry/RegistryKey;Lcom/mojang/serialization/Lifecycle;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0->@Inject::set(Lnet/minecraft/registry/RegistryKey;Ljava/lang/Object;Lnet/minecraft/registry/entry/RegistryEntryInfo;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistryKeysMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.RegistryKeys
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing ArgumentTypesAccessor from fabric-command-api-v2.mixins.json into net.minecraft.command.argument.ArgumentTypes
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method fabric_getClassMap()Ljava/util/Map; to fabric_getClassMap$fabric-command-api-v2_$md$84ced3$0 in fabric-command-api-v2.mixins.json:ArgumentTypesAccessor from mod fabric-command-api-v2
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemGroupsMixin from fabric-item-group-api-v1.mixins.json into net.minecraft.item.ItemGroups
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$paginateGroups$0(Lnet/minecraft/registry/entry/RegistryEntry$Reference;Lnet/minecraft/registry/entry/RegistryEntry$Reference;)I to md84ced3$fabric-item-group-api-v1$lambda$paginateGroups$0$0 in fabric-item-group-api-v1.mixins.json:ItemGroupsMixin from mod fabric-item-group-api-v1
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupsMixin from mod fabric-item-group-api-v1->@Inject::deferDuplicateCheck(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupsMixin from mod fabric-item-group-api-v1->@Inject::paginateGroups(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemGroupAccessor from fabric-item-group-api-v1.mixins.json into net.minecraft.item.ItemGroup
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemGroupMixin from fabric-item-group-api-v1.mixins.json into net.minecraft.item.ItemGroup
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$getStacks$0(Lnet/minecraft/item/ItemGroup;)Ljava/lang/IllegalStateException; to md84ced3$fabric-item-group-api-v1$lambda$getStacks$0$0 in fabric-item-group-api-v1.mixins.json:ItemGroupMixin from mod fabric-item-group-api-v1
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupMixin from mod fabric-item-group-api-v1->@Inject::getStacks(Lnet/minecraft/item/ItemGroup$DisplayContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupMixin from mod fabric-item-group-api-v1->@Inject::getStacks(Lnet/minecraft/item/ItemGroup$DisplayContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupMixin from mod fabric-item-group-api-v1->@Inject::getStacks(Lnet/minecraft/item/ItemGroup$DisplayContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing FireBlockMixin from fabric-content-registries-v0.mixins.json into net.minecraft.block.FireBlock
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::afterConstruct(Lnet/minecraft/block/AbstractBlock$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::afterConstruct(Lnet/minecraft/block/AbstractBlock$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::afterConstruct(Lnet/minecraft/block/AbstractBlock$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::getFabricBurnChance(Lnet/minecraft/block/BlockState;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::getFabricSpreadChance(Lnet/minecraft/block/BlockState;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockMixin from fabric-block-api-v1.mixins.json into net.minecraft.block.Block
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractBlockAccessor from fabric-object-builder-v1.mixins.json into net.minecraft.block.AbstractBlock
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractBlockMixin from fabric-content-registries-v0.mixins.json into net.minecraft.block.AbstractBlock
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockViewMixin from fabric-block-view-api-v2.mixins.json into net.minecraft.world.BlockView
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing EntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.Entity
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing AttachmentTargetsMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.entity.Entity
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_readAttachmentsFromNbt$0(Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lnet/fabricmc/fabric/api/attachment/v1/AttachmentType;Ljava/lang/Object;)V to md84ced3$fabric-data-attachment-api-v1$lambda$fabric_readAttachmentsFromNbt$0$0 in fabric-data-attachment-api-v1.mixins.json:AttachmentTargetsMixin from mod fabric-data-attachment-api-v1
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Mixing EntityMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.entity.Entity
[20:09:54] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_syncChange$0(Lnet/fabricmc/fabric/api/attachment/v1/AttachmentSyncPredicate;Lnet/fabricmc/fabric/impl/attachment/sync/s2c/AttachmentSyncPayloadS2C;Lnet/minecraft/server/network/ServerPlayerEntity;)V to md84ced3$fabric-data-attachment-api-v1$lambda$fabric_syncChange$0$1 in fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::readEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::readEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::readEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::writeEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::writeEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::writeEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing PlayerEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.player.PlayerEntity
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:PlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onTrySleep(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:PlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onIsSleepingLongEnough(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:55] [Datafixer Bootstrap/INFO] (com.mojang.datafixers.DataFixerBuilder) 263 Datafixer optimizations took 2683 milliseconds
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing LivingEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.LivingEntity
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing elytra.LivingEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.LivingEntity
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing LivingEntityMixin from fabric-item-api-v1.mixins.json into net.minecraft.entity.LivingEntity
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing LivingEntityMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.entity.LivingEntity
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::beforeDamage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::afterDamage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;FFZ)V doesn't use it's CallbackInfoReturnable
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::afterDamage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;FFZ)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::afterDamage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;FFZ)V won't be passed a CallbackInfoReturnable as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onSleep(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onSleep(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onSleep(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onWakeUp(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onWakeUp(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onWakeUp(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onIsSleepingInBed(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:elytra.LivingEntityMixin from mod fabric-entity-events-v1->@Inject::injectElytraTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:elytra.LivingEntityMixin from mod fabric-entity-events-v1->@Inject::injectElytraCheck(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:LivingEntityMixin from mod fabric-item-api-v1->@Inject::onGetPreferredEquipmentSlot(Lnet/minecraft/item/ItemStack;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:LivingEntityMixin from mod fabric-lifecycle-events-v1->@Inject::getEquipmentChanges(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:LivingEntityMixin from mod fabric-lifecycle-events-v1->@Inject::getEquipmentChanges(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:LivingEntityMixin from mod fabric-lifecycle-events-v1->@Inject::getEquipmentChanges(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldViewMixin from fabric-rendering-data-attachment-v1.mixins.json into net.minecraft.world.WorldView
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldViewMixin from fabric-block-view-api-v2.mixins.json into net.minecraft.world.WorldView
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing AttachmentTargetsMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.World
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.World
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.world.World
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerWorldMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.server.world.ServerWorld
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_syncChange$1(Lnet/fabricmc/fabric/api/attachment/v1/AttachmentType;Lnet/fabricmc/fabric/impl/attachment/sync/s2c/AttachmentSyncPayloadS2C;Lnet/minecraft/server/network/ServerPlayerEntity;)V to md84ced3$fabric-data-attachment-api-v1$lambda$fabric_syncChange$1$0 in fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$createAttachmentsPersistentState$0(Lnet/minecraft/server/world/ServerWorld;)Lnet/fabricmc/fabric/impl/attachment/AttachmentPersistentState; to md84ced3$fabric-data-attachment-api-v1$lambda$createAttachmentsPersistentState$0$1 in fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerWorldMixin from fabric-api-lookup-api-v1.mixins.json into net.minecraft.server.world.ServerWorld
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_invalidateCache$5(Ljava/util/Map$Entry;)Z to md84ced3$fabric-api-lookup-api-v1$lambda$fabric_invalidateCache$5$2 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_invalidateCache$4(Ljava/lang/ref/WeakReference;)Z to md84ced3$fabric-api-lookup-api-v1$lambda$fabric_invalidateCache$4$3 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_invalidateCache$3(Ljava/lang/ref/WeakReference;)V to md84ced3$fabric-api-lookup-api-v1$lambda$fabric_invalidateCache$3$4 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_invalidateCache$2(Ljava/lang/ref/WeakReference;)Z to md84ced3$fabric-api-lookup-api-v1$lambda$fabric_invalidateCache$2$5 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_registerCache$1(Ljava/lang/ref/WeakReference;)Z to md84ced3$fabric-api-lookup-api-v1$lambda$fabric_registerCache$1$6 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_registerCache$0(Lnet/minecraft/util/math/BlockPos;)Ljava/util/List; to md84ced3$fabric-api-lookup-api-v1$lambda$fabric_registerCache$0$7 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerWorldMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.server.world.ServerWorld
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1->@Inject::createAttachmentsPersistentState(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1->@Inject::createAttachmentsPersistentState(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1->@Inject::createAttachmentsPersistentState(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::endWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::endWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::endWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockStateMixin from fabric-block-api-v1.mixins.json into net.minecraft.block.BlockState
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractBlockStateMixin from fabric-content-registries-v0.mixins.json into net.minecraft.block.AbstractBlock$AbstractBlockState
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing IdListMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.util.collection.IdList
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_remapIds$0(Lit/unimi/dsi/fastutil/ints/Int2IntMap;Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer; to md84ced3$fabric-registry-sync-v0$lambda$fabric_remapIds$0$0 in fabric-registry-sync-v0.mixins.json:IdListMixin from mod fabric-registry-sync-v0
[20:09:55] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistryByteBufMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.RegistryByteBuf
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing BlocksMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.block.Blocks
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$initShapeCache$0(ILnet/minecraft/util/Identifier;Lnet/minecraft/block/Block;)V to md84ced3$fabric-registry-sync-v0$lambda$initShapeCache$0$0 in fabric-registry-sync-v0.mixins.json:BlocksMixin from mod fabric-registry-sync-v0
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:BlocksMixin from mod fabric-registry-sync-v0->@Inject::initShapeCache(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing OxidizableMixin from fabric-content-registries-v0.mixins.json into net.minecraft.block.Oxidizable
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:OxidizableMixin from mod fabric-content-registries-v0->@Inject::createOxidationLevelIncreasesMap(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing EntityTypeMixin from fabric-object-builder-v1.mixins.json into net.minecraft.entity.EntityType
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:EntityTypeMixin from mod fabric-object-builder-api-v1->@Inject::onAlwaysUpdateVelocity(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:EntityTypeMixin from mod fabric-object-builder-api-v1->@Inject::onCanPotentiallyExecuteCommands(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing FluidMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.fluid.Fluid
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:FluidMixin from mod fabric-transfer-api-v1->@Inject::hookGetBucketFillSound(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing ComponentMapBuilderMixin from fabric-item-api-v1.mixins.json into net.minecraft.component.ComponentMap$Builder
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing AttachmentTargetsMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.block.entity.BlockEntity
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.block.entity.BlockEntity
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_syncChange$0(Lnet/fabricmc/fabric/api/attachment/v1/AttachmentType;Lnet/fabricmc/fabric/impl/attachment/sync/s2c/AttachmentSyncPayloadS2C;Lnet/minecraft/server/network/ServerPlayerEntity;)V to md84ced3$fabric-data-attachment-api-v1$lambda$fabric_syncChange$0$0 in fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityMixin from fabric-rendering-data-attachment-v1.mixins.json into net.minecraft.block.entity.BlockEntity
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityMixin from fabric-block-view-api-v2.mixins.json into net.minecraft.block.entity.BlockEntity
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1->@Inject::readBlockEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1->@Inject::readBlockEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1->@Inject::readBlockEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1->@Inject::writeBlockEntityAttachments(Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing NamedScreenHandlerFactoryMixin from fabric-screen-handler-api-v1.mixins.json into net.minecraft.screen.NamedScreenHandlerFactory
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing LockableContainerBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.LockableContainerBlockEntity
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Mixing DetectorRailBlockMixin from fabric-object-builder-v1.mixins.json into net.minecraft.block.DetectorRailBlock
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$getCustomComparatorOutput$0(Lnet/minecraft/entity/Entity;)Z to md84ced3$fabric-object-builder-api-v1$lambda$getCustomComparatorOutput$0$0 in fabric-object-builder-v1.mixins.json:DetectorRailBlockMixin from mod fabric-object-builder-api-v1
[20:09:56] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:DetectorRailBlockMixin from mod fabric-object-builder-api-v1->@Inject::getCustomComparatorOutput(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing MobEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.mob.MobEntity
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing ChiseledBookshelfBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.ChiseledBookshelfBlockEntity
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:ChiseledBookshelfBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::setStackBypass(ILnet/minecraft/item/ItemStack;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityTypeMixin from fabric-object-builder-v1.mixins.json into net.minecraft.block.entity.BlockEntityType
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityTypeAccessor from fabric-api-lookup-api-v1.mixins.json into net.minecraft.block.entity.BlockEntityType
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:BlockEntityTypeMixin from mod fabric-object-builder-api-v1->@Inject::mutableBlocks(Lnet/minecraft/block/entity/BlockEntityType$BlockEntityFactory;Ljava/util/Set;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:BlockEntityTypeMixin from mod fabric-object-builder-api-v1->@Inject::mutableBlocks(Lnet/minecraft/block/entity/BlockEntityType$BlockEntityFactory;Ljava/util/Set;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:BlockEntityTypeMixin from mod fabric-object-builder-api-v1->@Inject::mutableBlocks(Lnet/minecraft/block/entity/BlockEntityType$BlockEntityFactory;Ljava/util/Set;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractFurnaceBlockEntityMixin from fabric-item-api-v1.mixins.json into net.minecraft.block.entity.AbstractFurnaceBlockEntity
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractFurnaceBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.AbstractFurnaceBlockEntity
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:AbstractFurnaceBlockEntityMixin from mod fabric-item-api-v1->@Inject::getStackRemainder(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/block/entity/AbstractFurnaceBlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;ZZLnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;ZZLnet/minecraft/recipe/RecipeEntry;Lnet/minecraft/recipe/input/SingleStackRecipeInput;I)V doesn't use it's CallbackInfo
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:AbstractFurnaceBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::setStackSuppressUpdate(ILnet/minecraft/item/ItemStack;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing WoodTypeMixin from fabric-object-builder-v1.client.mixins.json into net.minecraft.block.WoodType
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:WoodTypeMixin from mod fabric-object-builder-api-v1->@Inject::onReturnRegister(Lnet/minecraft/block/WoodType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing JukeboxBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.JukeboxBlockEntity
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:JukeboxBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::setStackBypass(Lnet/minecraft/item/ItemStack;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing BrewingStandBlockEntityMixin from fabric-item-api-v1.mixins.json into net.minecraft.block.entity.BrewingStandBlockEntity
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:BrewingStandBlockEntityMixin from mod fabric-item-api-v1->@Inject::captureItemStack(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/collection/DefaultedList;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lnet/minecraft/item/ItemStack;)V doesn't use it's CallbackInfo
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemStackMixin from fabric-item-api-v1.mixins.json into net.minecraft.item.ItemStack
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookDamage$0(Lorg/apache/commons/lang3/mutable/MutableBoolean;Ljava/util/function/Consumer;)V to md84ced3$fabric-item-api-v1$lambda$hookDamage$0$0 in fabric-item-api-v1.mixins.json:ItemStackMixin from mod fabric-item-api-v1
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemStackMixin from fabric-item-api-v1.client.mixins.json into net.minecraft.item.ItemStack
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:ItemStackMixin from mod fabric-item-api-v1->@Inject::getTooltip(Lnet/minecraft/item/Item$TooltipContext;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/item/tooltip/TooltipType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing AnvilScreenHandlerMixin from fabric-item-api-v1.mixins.json into net.minecraft.screen.AnvilScreenHandler
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing HopperBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.HopperBlockEntity
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookExtract$1(Lnet/fabricmc/fabric/api/transfer/v1/item/ItemVariant;)Z to md84ced3$fabric-transfer-api-v1$lambda$hookExtract$1$0 in fabric-transfer-api-v1.mixins.json:HopperBlockEntityMixin from mod fabric-transfer-api-v1
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookInsert$0(Lnet/fabricmc/fabric/api/transfer/v1/item/ItemVariant;)Z to md84ced3$fabric-transfer-api-v1$lambda$hookInsert$0$1 in fabric-transfer-api-v1.mixins.json:HopperBlockEntityMixin from mod fabric-transfer-api-v1
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:HopperBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::hookInsert(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/HopperBlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:HopperBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::hookExtract(Lnet/minecraft/world/World;Lnet/minecraft/block/entity/Hopper;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing DropperBlockMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.DropperBlock
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookDispense$0(Lnet/fabricmc/fabric/api/transfer/v1/item/ItemVariant;)Z to md84ced3$fabric-transfer-api-v1$lambda$hookDispense$0$0 in fabric-transfer-api-v1.mixins.json:DropperBlockMixin from mod fabric-transfer-api-v1
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:DropperBlockMixin from mod fabric-transfer-api-v1->@Inject::hookDispense(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:09:57] [main/DEBUG] (FabricLoader/Mixin) Mixing BannerBlockEntityMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.block.entity.BannerBlockEntity
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) Mixing CrafterBlockMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.CrafterBlock
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemAccessor from fabric-item-api-v1.mixins.json into net.minecraft.item.Item
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemMixin from fabric-item-api-v1.mixins.json into net.minecraft.item.Item
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.item.Item
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemMixin from mod fabric-item-api-v1->@Inject::onConstruct(Lnet/minecraft/item/Item$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemMixin from mod fabric-item-api-v1->@Inject::onConstruct(Lnet/minecraft/item/Item$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:58] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemMixin from mod fabric-item-api-v1->@Inject::onConstruct(Lnet/minecraft/item/Item$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing BucketItemAccessor from fabric-transfer-api-v1.mixins.json into net.minecraft.item.BucketItem
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing BucketItemMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.item.BucketItem
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing HoeItemAccessor from fabric-content-registries-v0.mixins.json into net.minecraft.item.HoeItem
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getTillingActions()Ljava/util/Map; to getTillingActions$fabric-content-registries-v0_$md$84ced3$0 in fabric-content-registries-v0.mixins.json:HoeItemAccessor from mod fabric-content-registries-v0
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing AxeItemAccessor from fabric-content-registries-v0.mixins.json into net.minecraft.item.AxeItem
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getStrippedBlocks()Ljava/util/Map; to getStrippedBlocks$fabric-content-registries-v0_$md$84ced3$0 in fabric-content-registries-v0.mixins.json:AxeItemAccessor from mod fabric-content-registries-v0
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method setStrippedBlocks(Ljava/util/Map;)V to setStrippedBlocks$fabric-content-registries-v0_$md$84ced3$1 in fabric-content-registries-v0.mixins.json:AxeItemAccessor from mod fabric-content-registries-v0
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing ShovelItemAccessor from fabric-content-registries-v0.mixins.json into net.minecraft.item.ShovelItem
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getPathStates()Ljava/util/Map; to getPathStates$fabric-content-registries-v0_$md$84ced3$0 in fabric-content-registries-v0.mixins.json:ShovelItemAccessor from mod fabric-content-registries-v0
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemSettingsMixin from fabric-item-api-v1.mixins.json into net.minecraft.item.Item$Settings
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing TagKeyMixin from fabric-convention-tags-api-v2.mixins.json into net.minecraft.registry.tag.TagKey
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing BundleContentsComponentAccessor from fabric-transfer-api-v1.mixins.json into net.minecraft.component.type.BundleContentsComponent
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method getOccupancy(Lnet/minecraft/item/ItemStack;)Lorg/apache/commons/lang3/math/Fraction; to getOccupancy$fabric-transfer-api-v1_$md$84ced3$0 in fabric-transfer-api-v1.mixins.json:BundleContentsComponentAccessor from mod fabric-transfer-api-v1
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing AttachmentTargetsMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.chunk.Chunk
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing ChunkMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.chunk.Chunk
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldChunkMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.chunk.WorldChunk
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_syncChange$0(Lnet/fabricmc/fabric/api/attachment/v1/AttachmentType;Lnet/fabricmc/fabric/impl/attachment/sync/s2c/AttachmentSyncPayloadS2C;Lnet/minecraft/server/network/ServerPlayerEntity;)V to md84ced3$fabric-data-attachment-api-v1$lambda$fabric_syncChange$0$0 in fabric-data-attachment-api-v1.mixins.json:WorldChunkMixin from mod fabric-data-attachment-api-v1
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldChunkMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.world.chunk.WorldChunk
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:WorldChunkMixin from mod fabric-data-attachment-api-v1->@Inject::transferProtoChunkAttachment(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/world/chunk/ProtoChunk;Lnet/minecraft/world/chunk/WorldChunk$EntityLoader;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:WorldChunkMixin from mod fabric-data-attachment-api-v1->@Inject::transferProtoChunkAttachment(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/world/chunk/ProtoChunk;Lnet/minecraft/world/chunk/WorldChunk$EntityLoader;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:WorldChunkMixin from mod fabric-data-attachment-api-v1->@Inject::transferProtoChunkAttachment(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/world/chunk/ProtoChunk;Lnet/minecraft/world/chunk/WorldChunk$EntityLoader;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onLoadBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onLoadBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onLoadBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lnet/minecraft/block/entity/BlockEntity;)V doesn't use it's CallbackInfo
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lnet/minecraft/block/entity/BlockEntity;)V has 0 override(s) in child classes
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lnet/minecraft/block/entity/BlockEntity;)V won't be passed a CallbackInfo as a result
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing ContainerComponentAccessor from fabric-transfer-api-v1.mixins.json into net.minecraft.component.type.ContainerComponent
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing LootTableAccessor from fabric-loot-api-v3.mixins.json into net.minecraft.loot.LootTable
[20:09:59] [main/DEBUG] (FabricLoader/Mixin) Mixing EnchantRandomlyLootFunctionMixin from fabric-item-api-v1.mixins.json into net.minecraft.loot.function.EnchantRandomlyLootFunction
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) Mixing EntityTypeBuilderMixin from fabric-object-builder-v1.mixins.json into net.minecraft.entity.EntityType$Builder
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:EntityTypeBuilderMixin from mod fabric-object-builder-api-v1->@Inject::applyChildBuilders(Lnet/minecraft/registry/RegistryKey;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) Mixing VillagerEntityAccessor from fabric-content-registries-v0.mixins.json into net.minecraft.entity.passive.VillagerEntity
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method fabric_setItemFoodValues(Ljava/util/Map;)V to fabric_setItemFoodValues$fabric-content-registries-v0_$md$84ced3$0 in fabric-content-registries-v0.mixins.json:VillagerEntityAccessor from mod fabric-content-registries-v0
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) Mixing VillagerEntityMixin from fabric-content-registries-v0.mixins.json into net.minecraft.entity.passive.VillagerEntity
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayerEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.server.network.ServerPlayerEntity
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayerEntityMixin from fabric-events-interaction-v0.mixins.json into net.minecraft.server.network.ServerPlayerEntity
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayerEntityMixin from fabric-screen-handler-api-v1.mixins.json into net.minecraft.server.network.ServerPlayerEntity
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::callOnKillForPlayer(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::callOnKillForPlayer(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::callOnKillForPlayer(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::afterWorldChanged(Lnet/minecraft/server/world/ServerWorld;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::afterWorldChanged(Lnet/minecraft/server/world/ServerWorld;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::afterWorldChanged(Lnet/minecraft/server/world/ServerWorld;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onCopyFrom(Lnet/minecraft/server/network/ServerPlayerEntity;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onCopyFrom(Lnet/minecraft/server/network/ServerPlayerEntity;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onCopyFrom(Lnet/minecraft/server/network/ServerPlayerEntity;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onTrySleepDirectionCheck(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/util/math/Direction;)V does use it's CallbackInfoReturnable
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerEntityMixin from mod fabric-events-interaction-v0->@Inject::onPlayerInteractEntity(Lnet/minecraft/entity/Entity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-screen-handler-api-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-screen-handler-api-v1->@Inject::fabric_storeOpenedScreenHandler(Lnet/minecraft/screen/NamedScreenHandlerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/screen/ScreenHandler;)V doesn't use it's CallbackInfoReturnable
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-screen-handler-api-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-screen-handler-api-v1->@Inject::fabric_storeOpenedScreenHandler(Lnet/minecraft/screen/NamedScreenHandlerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/screen/ScreenHandler;)V has 0 override(s) in child classes
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-screen-handler-api-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-screen-handler-api-v1->@Inject::fabric_storeOpenedScreenHandler(Lnet/minecraft/screen/NamedScreenHandlerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/screen/ScreenHandler;)V won't be passed a CallbackInfoReturnable as a result
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) Mixing HoneycombItemMixin from fabric-content-registries-v0.mixins.json into net.minecraft.item.HoneycombItem
[20:10:00] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:HoneycombItemMixin from mod fabric-content-registries-v0->@Inject::createUnwaxedToWaxedMap(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Mixing EntitySelectorOptionsAccessor from fabric-command-api-v2.mixins.json into net.minecraft.command.EntitySelectorOptions
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method callPutOption(Ljava/lang/String;Lnet/minecraft/command/EntitySelectorOptions$SelectorHandler;Ljava/util/function/Predicate;Lnet/minecraft/text/Text;)V to callPutOption$fabric-command-api-v2_$md$84ced3$0 in fabric-command-api-v2.mixins.json:EntitySelectorOptionsAccessor from mod fabric-command-api-v2
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Mixing EntitySelectorReaderMixin from fabric-command-api-v2.mixins.json into net.minecraft.command.EntitySelectorReader
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Generating mapped inner class net/minecraft/block/entity/ChiseledBookshelfBlockEntity$Anonymous$dca4e5ddaab04397b5ad47f4ae3a54e4 (originally net/fabricmc/fabric/mixin/transfer/ChiseledBookshelfBlockEntityMixin$1)
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Mixing SimpleInventoryMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.inventory.SimpleInventory
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Mixing CraftingRecipeMixin from fabric-item-api-v1.mixins.json into net.minecraft.recipe.CraftingRecipe
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Mixing ingredient.IngredientMixin from fabric-recipe-api-v1.mixins.json into net.minecraft.recipe.Ingredient
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$injectCodec$2(Lnet/minecraft/recipe/Ingredient;)Lcom/mojang/datafixers/util/Either; to md84ced3$fabric-recipe-api-v1$lambda$injectCodec$2$0 in fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$injectCodec$1(Lcom/mojang/datafixers/util/Either;)Lnet/minecraft/recipe/Ingredient; to md84ced3$fabric-recipe-api-v1$lambda$injectCodec$1$1 in fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$injectCodec$0(Lnet/minecraft/recipe/Ingredient;)Lnet/minecraft/recipe/Ingredient; to md84ced3$fabric-recipe-api-v1$lambda$injectCodec$0$2 in fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1->@Inject::injectCodec(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1->@Inject::onGetEntries(Lnet/minecraft/recipe/Ingredient;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1->@Inject::onGetEntries(Lnet/minecraft/recipe/Ingredient;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1->@Inject::onGetEntries(Lnet/minecraft/recipe/Ingredient;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1->@Inject::onHeadEquals(Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Mixing ingredient.ShapelessRecipeMixin from fabric-recipe-api-v1.mixins.json into net.minecraft.recipe.ShapelessRecipe
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.ShapelessRecipeMixin from mod fabric-recipe-api-v1->@Inject::cacheRequiresTesting(Ljava/lang/String;Lnet/minecraft/recipe/book/CraftingRecipeCategory;Lnet/minecraft/item/ItemStack;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.ShapelessRecipeMixin from mod fabric-recipe-api-v1->@Inject::cacheRequiresTesting(Ljava/lang/String;Lnet/minecraft/recipe/book/CraftingRecipeCategory;Lnet/minecraft/item/ItemStack;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.ShapelessRecipeMixin from mod fabric-recipe-api-v1->@Inject::cacheRequiresTesting(Ljava/lang/String;Lnet/minecraft/recipe/book/CraftingRecipeCategory;Lnet/minecraft/item/ItemStack;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.ShapelessRecipeMixin from mod fabric-recipe-api-v1->@Inject::customIngredientMatch(Lnet/minecraft/recipe/input/CraftingRecipeInput;Lnet/minecraft/world/World;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) Mixing ChunkGeneratingMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.world.chunk.ChunkGenerating
[20:10:01] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ChunkGeneratingMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkLoad(Lnet/minecraft/world/chunk/Chunk;Lnet/minecraft/world/chunk/ChunkGenerationContext;Lnet/minecraft/world/chunk/AbstractChunkHolder;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing StructureTemplateManagerMixin from fabric-gametest-api-v1.mixins.json into net.minecraft.structure.StructureTemplateManager
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:StructureTemplateManagerMixin from mod fabric-gametest-api-v1->@Inject::addFabricTemplateProvider(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lcom/google/common/collect/ImmutableList$Builder;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:StructureTemplateManagerMixin from mod fabric-gametest-api-v1->@Inject::addFabricTemplateProvider(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lcom/google/common/collect/ImmutableList$Builder;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:StructureTemplateManagerMixin from mod fabric-gametest-api-v1->@Inject::addFabricTemplateProvider(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lcom/google/common/collect/ImmutableList$Builder;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing BiomeSourceMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.biome.source.BiomeSource
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing MultiNoiseBiomeSourceMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.biome.source.MultiNoiseBiomeSource
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing NetherBiomePresetMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList$Preset$1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:NetherBiomePresetMixin from mod fabric-biome-api-v1->@Inject::apply(Ljava/util/function/Function;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistryOpsAccessor from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.registry.RegistryOps
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing TheEndBiomeSourceMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.biome.source.TheEndBiomeSource
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$1(Lnet/minecraft/registry/RegistryEntryLookup;)Lnet/fabricmc/fabric/impl/biome/TheEndBiomeData$Overrides; to md84ced3$fabric-biome-api-v1$lambda$init$1$0 in fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$modifyCodec$0(Lcom/mojang/serialization/codecs/RecordCodecBuilder$Instance;)Lcom/mojang/datafixers/kinds/App; to md84ced3$fabric-biome-api-v1$lambda$modifyCodec$0$1 in fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::modifyCodec(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::rememberLookup(Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::clearLookup(Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::init(Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::init(Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::init(Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing DebugChunkGeneratorAccessor from fabric-registry-sync-v0.mixins.json into net.minecraft.world.gen.chunk.DebugChunkGenerator
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method setBLOCK_STATES(Ljava/util/List;)V to setBLOCK_STATES$fabric-registry-sync-v0_$md$84ced3$0 in fabric-registry-sync-v0.mixins.json:DebugChunkGeneratorAccessor from mod fabric-registry-sync-v0
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method setX_SIDE_LENGTH(I)V to setX_SIDE_LENGTH$fabric-registry-sync-v0_$md$84ced3$1 in fabric-registry-sync-v0.mixins.json:DebugChunkGeneratorAccessor from mod fabric-registry-sync-v0
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method setZ_SIDE_LENGTH(I)V to setZ_SIDE_LENGTH$fabric-registry-sync-v0_$md$84ced3$2 in fabric-registry-sync-v0.mixins.json:DebugChunkGeneratorAccessor from mod fabric-registry-sync-v0
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing GameRulesBooleanRuleAccessor from fabric-game-rule-api-v1.mixins.json into net.minecraft.world.GameRules$BooleanRule
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method invokeCreate(ZLjava/util/function/BiConsumer;)Lnet/minecraft/world/GameRules$Type; to invokeCreate$fabric-game-rule-api-v1_$md$84ced3$0 in fabric-game-rule-api-v1.mixins.json:GameRulesBooleanRuleAccessor from mod fabric-game-rule-api-v1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing GameRulesAccessor from fabric-game-rule-api-v1.mixins.json into net.minecraft.world.GameRules
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method callRegister(Ljava/lang/String;Lnet/minecraft/world/GameRules$Category;Lnet/minecraft/world/GameRules$Type;)Lnet/minecraft/world/GameRules$Key; to callRegister$fabric-game-rule-api-v1_$md$84ced3$0 in fabric-game-rule-api-v1.mixins.json:GameRulesAccessor from mod fabric-game-rule-api-v1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getRuleTypes()Ljava/util/Map; to getRuleTypes$fabric-game-rule-api-v1_$md$84ced3$1 in fabric-game-rule-api-v1.mixins.json:GameRulesAccessor from mod fabric-game-rule-api-v1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing GameRulesKeyMixin from fabric-game-rule-api-v1.mixins.json into net.minecraft.world.GameRules$Key
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing MinecraftServerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.server.MinecraftServer
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$0(Lnet/minecraft/resource/ResourcePack;)Ljava/util/stream/Stream; to md84ced3$fabric-resource-loader-v0$lambda$init$0$0 in fabric-resource-loader-v0.mixins.json:MinecraftServerMixin from mod fabric-resource-loader-v0
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing MinecraftServerMixin from fabric-message-api-v1.mixins.json into net.minecraft.server.MinecraftServer
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$onGetChatDecorator$0(Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/text/Text;)Lnet/minecraft/text/Text; to md84ced3$fabric-message-api-v1$lambda$onGetChatDecorator$0$1 in fabric-message-api-v1.mixins.json:MinecraftServerMixin from mod fabric-message-api-v1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing MinecraftServerMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.server.MinecraftServer
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$endResourceReload$0(Ljava/lang/Void;Ljava/lang/Throwable;)Ljava/lang/Void; to md84ced3$fabric-lifecycle-events-v1$lambda$endResourceReload$0$2 in fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing modification.MinecraftServerMixin from fabric-biome-api-v1.mixins.json into net.minecraft.server.MinecraftServer
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:MinecraftServerMixin from mod fabric-resource-loader-v0->@Inject::init(Ljava/lang/Thread;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lnet/minecraft/resource/ResourcePackManager;Lnet/minecraft/server/SaveLoader;Ljava/net/Proxy;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/util/ApiServices;Lnet/minecraft/server/WorldGenerationProgressListenerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:MinecraftServerMixin from mod fabric-resource-loader-v0->@Inject::init(Ljava/lang/Thread;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lnet/minecraft/resource/ResourcePackManager;Lnet/minecraft/server/SaveLoader;Ljava/net/Proxy;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/util/ApiServices;Lnet/minecraft/server/WorldGenerationProgressListenerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:MinecraftServerMixin from mod fabric-resource-loader-v0->@Inject::init(Ljava/lang/Thread;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lnet/minecraft/resource/ResourcePackManager;Lnet/minecraft/server/SaveLoader;Ljava/net/Proxy;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/util/ApiServices;Lnet/minecraft/server/WorldGenerationProgressListenerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.mixins.json:MinecraftServerMixin from mod fabric-message-api-v1->@Inject::onGetChatDecorator(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onUnloadWorldAtShutdown(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Ljava/util/Iterator;Lnet/minecraft/server/world/ServerWorld;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onUnloadWorldAtShutdown(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Ljava/util/Iterator;Lnet/minecraft/server/world/ServerWorld;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onUnloadWorldAtShutdown(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Ljava/util/Iterator;Lnet/minecraft/server/world/ServerWorld;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startResourceReload(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startResourceReload(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startResourceReload(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::endResourceReload(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::endSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::endSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::endSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:modification.MinecraftServerMixin from mod fabric-biome-api-v1->@Inject::finalizeWorldGen(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:modification.MinecraftServerMixin from mod fabric-biome-api-v1->@Inject::finalizeWorldGen(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:modification.MinecraftServerMixin from mod fabric-biome-api-v1->@Inject::finalizeWorldGen(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing GameRulesIntRuleAccessor from fabric-game-rule-api-v1.mixins.json into net.minecraft.world.GameRules$IntRule
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing client.item.UnbakedBasicItemModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.item.model.BasicItemModel$Unbaked
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing client.item.BasicItemModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.item.model.BasicItemModel
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.item.BasicItemModelMixin from mod fabric-renderer-api-v1->@Inject::onReturnUpdate(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.item.BasicItemModelMixin from mod fabric-renderer-api-v1->@Inject::onReturnUpdate(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.item.BasicItemModelMixin from mod fabric-renderer-api-v1->@Inject::onReturnUpdate(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing SpecialModelTypesMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.item.model.special.SpecialModelTypes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:SpecialModelTypesMixin from mod fabric-rendering-v1->@Inject::onReturnClinit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing TexturedRenderLayersMixin from fabric-object-builder-v1.client.mixins.json into net.minecraft.client.render.TexturedRenderLayers
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:TexturedRenderLayersMixin from mod fabric-object-builder-api-v1->@Inject::onReturnClinit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing client.SpriteAtlasTextureMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.texture.SpriteAtlasTexture
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.SpriteAtlasTextureMixin from mod fabric-renderer-api-v1->@Inject::uploadHook(Lnet/minecraft/client/texture/SpriteLoader$StitchResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.SpriteAtlasTextureMixin from mod fabric-renderer-api-v1->@Inject::uploadHook(Lnet/minecraft/client/texture/SpriteLoader$StitchResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.SpriteAtlasTextureMixin from mod fabric-renderer-api-v1->@Inject::uploadHook(Lnet/minecraft/client/texture/SpriteLoader$StitchResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.render.item.ItemRenderer
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemRendererAccessor from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.item.ItemRenderer
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method fabric_getDynamicDisplayGlintConsumer(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;Lnet/minecraft/client/util/math/MatrixStack$Entry;)Lnet/minecraft/client/render/VertexConsumer; to fabric_getDynamicDisplayGlintConsumer$fabric-renderer-indigo_$md$84ced3$0 in fabric-renderer-indigo.mixins.json:ItemRendererAccessor from mod fabric-renderer-indigo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing InGameHudMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.gui.hud.InGameHud
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1->@Inject::render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1->@Inject::render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1->@Inject::render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1->@Inject::registerLayers(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1->@Inject::registerLayers(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1->@Inject::registerLayers(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing ClientWorldMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.world.ClientWorld
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$new$1(Lnet/minecraft/world/biome/ColorResolver;)Lnet/minecraft/client/world/BiomeColorCache; to md84ced3$fabric-rendering-v1$lambda$new$1$0 in fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$new$0(Lnet/minecraft/world/biome/ColorResolver;Lnet/minecraft/util/math/BlockPos;)I to md84ced3$fabric-rendering-v1$lambda$new$0$1 in fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) Mixing ClientWorldMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.world.ClientWorld
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onResetChunkColor(Lnet/minecraft/util/math/ChunkPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onResetChunkColor(Lnet/minecraft/util/math/ChunkPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onResetChunkColor(Lnet/minecraft/util/math/ChunkPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onReloadColor(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onReloadColor(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onReloadColor(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::tickWorldAfterBlockEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::tickWorldAfterBlockEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::tickWorldAfterBlockEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:02] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [main/DEBUG] (FabricLoader/Mixin) Mixing KeyBindingAccessor from fabric-key-binding-api-v1.mixins.json into net.minecraft.client.option.KeyBinding
[20:10:03] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method fabric_getCategoryMap()Ljava/util/Map; to fabric_getCategoryMap$fabric-key-binding-api-v1_$md$84ced3$0 in fabric-key-binding-api-v1.mixins.json:KeyBindingAccessor from mod fabric-key-binding-api-v1
[20:10:03] [main/DEBUG] (FabricLoader/Mixin) Mixing KeyBindingAccessor from fabric-events-interaction-v0.client.mixins.json into net.minecraft.client.option.KeyBinding
[20:10:03] [main/DEBUG] (FabricLoader/Mixin) Mixing AtlasSourceManagerAccessor from fabric-rendering-v1.mixins.json into net.minecraft.client.texture.atlas.AtlasSourceManager
[20:10:03] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getAtlasSourceCodecs()Lnet/minecraft/util/dynamic/Codecs$IdMapper; to getAtlasSourceCodecs$fabric-rendering-v1_$md$84ced3$0 in fabric-rendering-v1.mixins.json:AtlasSourceManagerAccessor from mod fabric-rendering-v1
[20:10:03] [main/DEBUG] (FabricLoader/Mixin) Mixing DefaultAttributeRegistryAccessor from fabric-object-builder-v1.mixins.json into net.minecraft.entity.attribute.DefaultAttributeRegistry
[20:10:03] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getRegistry()Ljava/util/Map; to getRegistry$fabric-object-builder-api-v1_$md$84ced3$0 in fabric-object-builder-v1.mixins.json:DefaultAttributeRegistryAccessor from mod fabric-object-builder-api-v1
[20:10:03] [main/DEBUG] (FabricLoader/Mixin) Mixing DefaultAttributeRegistryMixin from fabric-object-builder-v1.mixins.json into net.minecraft.entity.attribute.DefaultAttributeRegistry
[20:10:03] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:DefaultAttributeRegistryMixin from mod fabric-object-builder-api-v1->@Inject::injectAttributes(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.MinecraftClientAccessor from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.MinecraftClient
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.MinecraftClient
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Unique field LOGGERLorg/slf4j/Logger; to fd84ced3$fabric-screen-api-v1$LOGGER$0 in fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-registry-sync-v0.client.mixins.json into net.minecraft.client.MinecraftClient
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-data-generation-api-v1.client.mixins.json into net.minecraft.client.MinecraftClient
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-events-interaction-v0.client.mixins.json into net.minecraft.client.MinecraftClient
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.MinecraftClient
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::checkThreadOnDev(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::checkThreadOnDev(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::checkThreadOnDev(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemove(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemove(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemove(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemoveBecauseStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemoveBecauseStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemoveBecauseStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::disconnectAfter(Lnet/minecraft/client/gui/screen/Screen;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::disconnectAfter(Lnet/minecraft/client/gui/screen/Screen;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::disconnectAfter(Lnet/minecraft/client/gui/screen/Screen;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::afterModInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::afterModInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::afterModInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-data-generation-api-v1.client.mixins.json:MinecraftClientMixin from mod fabric-data-generation-api-v1->@Inject::main(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-data-generation-api-v1.client.mixins.json:MinecraftClientMixin from mod fabric-data-generation-api-v1->@Inject::main(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-data-generation-api-v1.client.mixins.json:MinecraftClientMixin from mod fabric-data-generation-api-v1->@Inject::main(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectUseEntityCallback(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;[Lnet/minecraft/util/Hand;IILnet/minecraft/util/Hand;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/hit/EntityHitResult;Lnet/minecraft/entity/Entity;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectHandleInputEventsForPreAttackCallback(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectHandleInputEventsForPreAttackCallback(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectHandleInputEventsForPreAttackCallback(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectDoAttackForCancelling(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectHandleBlockBreakingForCancelling(ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStart(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStart(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStart(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::afterClientWorldChange(Lnet/minecraft/client/world/ClientWorld;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::afterClientWorldChange(Lnet/minecraft/client/world/ClientWorld;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::afterClientWorldChange(Lnet/minecraft/client/world/ClientWorld;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ScreenAccessor from fabric-screen-api-v1.mixins.json into net.minecraft.client.gui.screen.Screen
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ScreenMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.gui.screen.Screen
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing HandledScreenMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.gui.screen.ingame.HandledScreen
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:HandledScreenMixin from mod fabric-screen-api-v1->@Inject::callSuperMouseReleased(DDILorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:HandledScreenMixin from mod fabric-screen-api-v1->@Inject::callSuperMouseReleased(DDIDDLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing VanillaResourcePackProviderMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.resource.VanillaResourcePackProvider
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:VanillaResourcePackProviderMixin from mod fabric-resource-loader-v0->@Inject::addBuiltinResourcePacks(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:VanillaResourcePackProviderMixin from mod fabric-resource-loader-v0->@Inject::addBuiltinResourcePacks(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:VanillaResourcePackProviderMixin from mod fabric-resource-loader-v0->@Inject::addBuiltinResourcePacks(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourcePackManagerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.ResourcePackManager
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$handleAutoDisable$0(Ljava/util/Set;Lnet/minecraft/resource/ResourcePackProfile;)Z to md84ced3$fabric-resource-loader-v0$lambda$handleAutoDisable$0$0 in fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::construct([Lnet/minecraft/resource/ResourcePackProvider;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::construct([Lnet/minecraft/resource/ResourcePackProvider;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::construct([Lnet/minecraft/resource/ResourcePackProvider;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnableDisable(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnableDisable(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnableDisable(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoDisable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoDisable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoDisable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[20:10:03] [Render thread/INFO] (com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService) Environment: Environment[sessionHost=https://sessionserver.mojang.com, servicesHost=https://api.minecraftservices.com, name=PROD]
[20:10:03] [Yggdrasil Key Fetcher/DEBUG] (com.mojang.authlib.minecraft.client.MinecraftClient) Connecting to https://api.minecraftservices.com/publickeys
[20:10:03] [Download-1/DEBUG] (com.mojang.authlib.minecraft.client.MinecraftClient) Connecting to https://sessionserver.mojang.com/session/minecraft/profile/355b21270f2e3f20b6c28997b4abcafb?unsigned=false
[20:10:03] [Render thread/INFO] (net.minecraft.client.MinecraftClient) Setting user: Player425
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SoundInstanceMixin from fabric-sound-api-v1.mixins.json into net.minecraft.client.sound.SoundInstance
[20:10:03] [Render thread/DEBUG] (FabricLoader/Entrypoint) Iterating over entrypoint 'main'
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ServerConfigurationNetworkHandlerMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerConfigurationNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$bindChannelInfo$0(Lnet/minecraft/network/RegistryByteBuf;)Lnet/minecraft/network/RegistryByteBuf; to md84ced3$fabric-networking-api-v1$lambda$bindChannelInfo$0$0 in fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ServerConfigurationNetworkHandlerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.server.network.ServerConfigurationNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onClientReady(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ServerCommonNetworkHandlerMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerCommonNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.ServerCommonNetworkHandlerAccessor from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerCommonNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleCustomPayloadReceivedAsync(Lnet/minecraft/network/packet/c2s/common/CustomPayloadC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onPlayPong(Lnet/minecraft/network/packet/c2s/common/CommonPongC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onPlayPong(Lnet/minecraft/network/packet/c2s/common/CommonPongC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onPlayPong(Lnet/minecraft/network/packet/c2s/common/CommonPongC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourceFinderAccessor from fabric-loot-api-v3.mixins.json into net.minecraft.resource.ResourceFinder
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourceFinderAccessor from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.resource.ResourceFinder
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Unexpected: Registered method getDirectoryName()Ljava/lang/String; in net.minecraft.resource.ResourceFinder was not merged
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing CustomPayloadC2SPacketMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$wrapCodec$0(Lnet/minecraft/network/PacketByteBuf;Lnet/minecraft/util/Identifier;)Lnet/minecraft/network/packet/CustomPayload$Type; to md84ced3$fabric-networking-api-v1$lambda$wrapCodec$0$0 in fabric-networking-api-v1.mixins.json:CustomPayloadC2SPacketMixin from mod fabric-networking-api-v1
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing CustomPayloadS2CPacketAccessor from fabric-data-attachment-api-v1.mixins.json into net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing CustomPayloadPacketCodecMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.packet.CustomPayload$1
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayNetworkHandlerMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerPlayNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayNetworkHandlerMixin from fabric-events-interaction-v0.mixins.json into net.minecraft.server.network.ServerPlayNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleCustomPayloadReceivedAsync(Lnet/minecraft/network/packet/c2s/common/CustomPayloadC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LootTableBuilderMixin from fabric-loot-api-v2.mixins.json into net.minecraft.loot.LootTable$Builder
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LootTableBuilderMixin from fabric-loot-api-v3.mixins.json into net.minecraft.loot.LootTable$Builder
[20:10:03] [Render thread/DEBUG] (FabricLoader/Entrypoint) Iterating over entrypoint 'client'
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-message-api-v1.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-command-api-v2.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-data-attachment-api-v1.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_allowSendChatMessage(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_allowSendCommandMessage(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleServerPlayReady(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleServerPlayReady(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleServerPlayReady(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onOnCommandTree(Lnet/minecraft/network/packet/s2c/play/CommandTreeS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onOnCommandTree(Lnet/minecraft/network/packet/s2c/play/CommandTreeS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onOnCommandTree(Lnet/minecraft/network/packet/s2c/play/CommandTreeS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onSendCommand(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onSendCommand(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onPlayerRespawn(Lnet/minecraft/network/packet/s2c/play/PlayerRespawnS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onPlayerRespawn(Lnet/minecraft/network/packet/s2c/play/PlayerRespawnS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onPlayerRespawn(Lnet/minecraft/network/packet/s2c/play/PlayerRespawnS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onClearWorld(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onClearWorld(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onClearWorld(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::invokeTagsLoaded(Lnet/minecraft/network/packet/s2c/common/SynchronizeTagsS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::invokeTagsLoaded(Lnet/minecraft/network/packet/s2c/common/SynchronizeTagsS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::invokeTagsLoaded(Lnet/minecraft/network/packet/s2c/common/SynchronizeTagsS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.ClientCommonNetworkHandlerAccessor from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientCommonNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientCommonNetworkHandlerMixin from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientCommonNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onCustomPayload(Lnet/minecraft/network/packet/s2c/common/CustomPayloadS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.ClientLoginNetworkHandlerAccessor from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientLoginNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientLoginNetworkHandlerMixin from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientLoginNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleQueryRequest(Lnet/minecraft/network/packet/s2c/login/LoginQueryRequestS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientConfigurationNetworkHandlerMixin from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientConfigurationNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.ClientConfigurationNetworkHandlerAccessor from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientConfigurationNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientConfigurationNetworkHandlerMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.network.ClientConfigurationNetworkHandler
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleComplete(Lnet/minecraft/network/packet/s2c/config/ReadyS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleComplete(Lnet/minecraft/network/packet/s2c/config/ReadyS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleComplete(Lnet/minecraft/network/packet/s2c/config/ReadyS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::invokeTagsLoaded(Lnet/minecraft/resource/ResourceFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientConnectionMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.ClientConnection
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_getPendingChannelsNames$0(Lnet/minecraft/network/NetworkPhase;)Ljava/util/Collection; to md84ced3$fabric-networking-api-v1$lambda$fabric_getPendingChannelsNames$0$0 in fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ingredient.ClientConnectionMixin from fabric-recipe-api-v1.mixins.json into net.minecraft.network.ClientConnection
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientConnectionMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.network.ClientConnection
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::initAddedFields(Lnet/minecraft/network/NetworkSide;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::initAddedFields(Lnet/minecraft/network/NetworkSide;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::initAddedFields(Lnet/minecraft/network/NetworkSide;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::unwatchAddon(Lnet/minecraft/network/state/NetworkState;Lnet/minecraft/network/listener/PacketListener;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::unwatchAddon(Lnet/minecraft/network/state/NetworkState;Lnet/minecraft/network/listener/PacketListener;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::unwatchAddon(Lnet/minecraft/network/state/NetworkState;Lnet/minecraft/network/listener/PacketListener;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lio/netty/channel/ChannelHandlerContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lio/netty/channel/ChannelHandlerContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lio/netty/channel/ChannelHandlerContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/INFO] (net.fabricmc.fabric.impl.client.indigo.Indigo) [Indigo] Registering Indigo renderer!
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SimpleRegistryTagLookup2Accessor from fabric-tag-api-v1.mixins.json into net.minecraft.registry.SimpleRegistry$TagLookup$2
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameOptionsMixin from fabric-key-binding-api-v1.mixins.json into net.minecraft.client.option.GameOptions
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameOptionsMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.option.GameOptions
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-key-binding-api-v1.mixins.json:GameOptionsMixin from mod fabric-key-binding-api-v1->@Inject::loadHook(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-key-binding-api-v1.mixins.json:GameOptionsMixin from mod fabric-key-binding-api-v1->@Inject::loadHook(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-key-binding-api-v1.mixins.json:GameOptionsMixin from mod fabric-key-binding-api-v1->@Inject::loadHook(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:04] [Download-1/DEBUG] (com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService) Couldn't fetch profile properties for 355b2127-0f2e-3f20-b6c2-8997b4abcafb as the profile does not exist
[20:10:04] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourcePackProfileMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.ResourcePackProfile
[20:10:04] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$static$0(Ljava/util/Set;)Z to md84ced3$fabric-resource-loader-v0$lambda$static$0$0 in fabric-resource-loader-v0.mixins.json:ResourcePackProfileMixin from mod fabric-resource-loader-v0
[20:10:04] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourcePackProfileMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.resource.ResourcePackProfile
[20:10:04] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackProfileMixin from mod fabric-resource-loader-v0->@Inject::onCreateResourcePack(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:04] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameOptionsWriteVisitorMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.option.GameOptions$3
[20:10:04] [Render thread/INFO] (net.minecraft.client.MinecraftClient) Backend library: LWJGL version 3.3.3-snapshot
[20:10:04] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MouseMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.Mouse
[20:10:04] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyboardMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.Keyboard
[20:10:05] [Render thread/INFO] (net.minecraft.client.MinecraftClient) Using optional rendering extensions: GL_KHR_debug, GL_ARB_vertex_attrib_binding
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LifecycledResourceManagerImplMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.LifecycledResourceManagerImpl
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:LifecycledResourceManagerImplMixin from mod fabric-resource-loader-v0->@Inject::init(Lnet/minecraft/resource/ResourceType;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:LifecycledResourceManagerImplMixin from mod fabric-resource-loader-v0->@Inject::init(Lnet/minecraft/resource/ResourceType;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:LifecycledResourceManagerImplMixin from mod fabric-resource-loader-v0->@Inject::init(Lnet/minecraft/resource/ResourceType;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-item-group-api-v1_programmer_art, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, ttpmodpoc]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api, currently enabled: [vanilla, fabric, fabric-api]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-base, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-lookup-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-biome-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-view-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-blockrenderlayer-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-client-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-client-tags-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-commands-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-content-registries-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-crash-report-info-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-attachment-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-generation-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-dimensions-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-entity-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-events-interaction-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-game-rule-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-group-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-key-binding-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-keybindings-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-lifecycle-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v3, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-message-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-model-loading-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-networking-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-object-builder-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-particles-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-recipe-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-registry-sync-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-indigo, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-data-attachment-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-fluids-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-conditions-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-loader-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-handler-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-sound-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-tag-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transfer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transitive-access-wideners-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabricloader, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled ttpmodpoc, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, ttpmodpoc]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, ttpmodpoc]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-item-group-api-v1_programmer_art, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, ttpmodpoc]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api, currently enabled: [vanilla, fabric, fabric-api]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-base, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-lookup-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-biome-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-view-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-blockrenderlayer-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-client-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-client-tags-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-commands-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-content-registries-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-crash-report-info-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-attachment-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-generation-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-dimensions-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-entity-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-events-interaction-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-game-rule-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-group-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-key-binding-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-keybindings-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-lifecycle-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v3, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-message-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-model-loading-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-networking-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-object-builder-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-particles-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-recipe-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-registry-sync-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-indigo, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-data-attachment-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-fluids-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-conditions-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-loader-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-handler-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-sound-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-tag-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transfer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transitive-access-wideners-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabricloader, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled ttpmodpoc, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, ttpmodpoc]
[20:10:05] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, ttpmodpoc]
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.resource.language.LanguageManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.texture.TextureManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.sound.SoundManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing modification.DynamicRegistryManagerImmutableImplMixin from fabric-biome-api-v1.mixins.json into net.minecraft.registry.DynamicRegistryManager$ImmutableImpl
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SoundSystemMixin from fabric-sound-api-v1.mixins.json into net.minecraft.client.sound.SoundSystem
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing FontManagerMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.font.FontManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockColorsMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.color.block.BlockColors
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockColorsMixin from fabric-registry-sync-v0.client.mixins.json into net.minecraft.client.color.block.BlockColors
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:BlockColorsMixin from mod fabric-rendering-v1->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:BlockColorsMixin from mod fabric-registry-sync-v0->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:BlockColorsMixin from mod fabric-registry-sync-v0->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:BlockColorsMixin from mod fabric-registry-sync-v0->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.render.model.BakedModelManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BakedModelManagerMixin from fabric-model-loading-api-v1.mixins.json into net.minecraft.client.render.model.BakedModelManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookModelBaking$3(Ljava/util/function/Function;Ljava/lang/Void;)Ljava/util/concurrent/CompletableFuture; to md84ced3$fabric-model-loading-api-v1$lambda$hookModelBaking$3$0 in fabric-model-loading-api-v1.mixins.json:BakedModelManagerMixin from mod fabric-model-loading-api-v1
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookBlockStateModels$2(Lnet/minecraft/client/render/model/BlockStatesLoader$LoadedModels;Lnet/fabricmc/fabric/impl/client/model/loading/ModelLoadingEventDispatcher;)Lnet/minecraft/client/render/model/BlockStatesLoader$LoadedModels; to md84ced3$fabric-model-loading-api-v1$lambda$hookBlockStateModels$2$1 in fabric-model-loading-api-v1.mixins.json:BakedModelManagerMixin from mod fabric-model-loading-api-v1
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookModels$1(Ljava/util/Map;Lnet/fabricmc/fabric/impl/client/model/loading/ModelLoadingEventDispatcher;)Ljava/util/Map; to md84ced3$fabric-model-loading-api-v1$lambda$hookModels$1$2 in fabric-model-loading-api-v1.mixins.json:BakedModelManagerMixin from mod fabric-model-loading-api-v1
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$resetEventDispatcherFuture$0(Ljava/lang/Void;)Ljava/lang/Void; to md84ced3$fabric-model-loading-api-v1$lambda$resetEventDispatcherFuture$0$3 in fabric-model-loading-api-v1.mixins.json:BakedModelManagerMixin from mod fabric-model-loading-api-v1
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:BakedModelManagerMixin from mod fabric-model-loading-api-v1->@Inject::onHeadReload(Lnet/minecraft/resource/ResourceReloader$Synchronizer;Lnet/minecraft/resource/ResourceManager;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:BakedModelManagerMixin from mod fabric-model-loading-api-v1->@Inject::onHeadReload(Lnet/minecraft/resource/ResourceReloader$Synchronizer;Lnet/minecraft/resource/ResourceManager;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:BakedModelManagerMixin from mod fabric-model-loading-api-v1->@Inject::onHeadReload(Lnet/minecraft/resource/ResourceReloader$Synchronizer;Lnet/minecraft/resource/ResourceManager;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.particle.BlockModelsMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.block.BlockModels
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing JsonDataLoaderMixin from fabric-loot-api-v3.mixins.json into net.minecraft.resource.JsonDataLoader
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing JsonDataLoaderMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.resource.JsonDataLoader
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-loot-api-v3.mixins.json:JsonDataLoaderMixin from mod fabric-loot-api-v3->@Inject::fillSourceMap(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/resource/ResourceFinder;Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;Ljava/util/Map;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:JsonDataLoaderMixin from mod fabric-resource-conditions-api-v1->@Inject::skipData(Ljava/util/Map;Lnet/minecraft/util/Identifier;Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ItemRenderStateMixin from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.item.ItemRenderState
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:ItemRenderStateMixin from mod fabric-renderer-indigo->@Inject::afterInitVecLoad(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:ItemRenderStateMixin from mod fabric-renderer-indigo->@Inject::afterInitVecLoad(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:ItemRenderStateMixin from mod fabric-renderer-indigo->@Inject::afterInitVecLoad(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:ItemRenderStateMixin from mod fabric-renderer-indigo->@Inject::afterLayerLoad(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:ItemRenderStateMixin from mod fabric-renderer-indigo->@Inject::afterLayerLoad(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:ItemRenderStateMixin from mod fabric-renderer-indigo->@Inject::afterLayerLoad(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.item.LayerRenderStateMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.item.ItemRenderState$LayerRenderState
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LayerRenderStateMixin from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.item.ItemRenderState$LayerRenderState
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:LayerRenderStateMixin from mod fabric-renderer-indigo->@Inject::onReturnClear(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:LayerRenderStateMixin from mod fabric-renderer-indigo->@Inject::onReturnClear(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:LayerRenderStateMixin from mod fabric-renderer-indigo->@Inject::onReturnClear(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ModelBakerMixin from fabric-model-loading-api-v1.mixins.json into net.minecraft.client.render.model.ModelBaker
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookBlockModelBake$0(Ljava/util/function/BiFunction;Lnet/minecraft/block/BlockState;Lnet/minecraft/client/render/model/BlockStateModel$UnbakedGrouped;)Lnet/minecraft/client/render/model/BlockStateModel; to md84ced3$fabric-model-loading-api-v1$lambda$hookBlockModelBake$0$0 in fabric-model-loading-api-v1.mixins.json:ModelBakerMixin from mod fabric-model-loading-api-v1
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:ModelBakerMixin from mod fabric-model-loading-api-v1->@Inject::onReturnInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:ModelBakerMixin from mod fabric-model-loading-api-v1->@Inject::onReturnInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:ModelBakerMixin from mod fabric-model-loading-api-v1->@Inject::onReturnInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.render.block.BlockRenderManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.render.BlockRenderManagerMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.block.BlockRenderManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockRenderManagerAccessor from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.block.BlockRenderManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockRenderManagerMixin from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.block.BlockRenderManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$renderProxy$1(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer; to md84ced3$fabric-renderer-indigo$lambda$renderProxy$1$0 in fabric-renderer-indigo.mixins.json:BlockRenderManagerMixin from mod fabric-renderer-indigo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$afterGetModel$0(Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer; to md84ced3$fabric-renderer-indigo$lambda$afterGetModel$0$1 in fabric-renderer-indigo.mixins.json:BlockRenderManagerMixin from mod fabric-renderer-indigo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:BlockRenderManagerMixin from mod fabric-renderer-indigo->@Inject::afterGetModel(Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/BlockRenderView;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.render.BlockModelRendererMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.block.BlockModelRenderer
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockModelRendererMixin from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.block.BlockModelRenderer
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$render$0(Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer; to md84ced3$fabric-renderer-indigo$lambda$render$0$0 in fabric-renderer-indigo.mixins.json:BlockModelRendererMixin from mod fabric-renderer-indigo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing FluidRendererMixin from fabric-rendering-fluids-v1.mixins.json into net.minecraft.client.render.block.FluidRenderer
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-fluids-v1.mixins.json:FluidRendererMixin from mod fabric-rendering-fluids-v1->@Inject::onResourceReloadReturn(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-fluids-v1.mixins.json:FluidRendererMixin from mod fabric-rendering-fluids-v1->@Inject::onResourceReloadReturn(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-fluids-v1.mixins.json:FluidRendererMixin from mod fabric-rendering-fluids-v1->@Inject::onResourceReloadReturn(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-fluids-v1.mixins.json:FluidRendererMixin from mod fabric-rendering-fluids-v1->@Inject::onHeadRender(Lnet/minecraft/world/BlockRenderView;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/block/BlockState;Lnet/minecraft/fluid/FluidState;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing HeldItemRendererMixin from fabric-item-api-v1.client.mixins.json into net.minecraft.client.render.item.HeldItemRenderer
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:HeldItemRendererMixin from mod fabric-item-api-v1->@Inject::modifyProgressAnimation(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:HeldItemRendererMixin from mod fabric-item-api-v1->@Inject::modifyProgressAnimation(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:HeldItemRendererMixin from mod fabric-item-api-v1->@Inject::modifyProgressAnimation(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ParticleManagerMixin from fabric-particles-v1.client.mixins.json into net.minecraft.client.particle.ParticleManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ParticleManagerAccessor from fabric-particles-v1.client.mixins.json into net.minecraft.client.particle.ParticleManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ParticleManagerMixin from fabric-registry-sync-v0.client.mixins.json into net.minecraft.client.particle.ParticleManager
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:ParticleManagerMixin from mod fabric-particles-v1->@Inject::onRegisterDefaultFactories(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:ParticleManagerMixin from mod fabric-particles-v1->@Inject::onRegisterDefaultFactories(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:ParticleManagerMixin from mod fabric-particles-v1->@Inject::onRegisterDefaultFactories(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ParticleManagerMixin from mod fabric-registry-sync-v0->@Inject::onInit(Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/client/texture/TextureManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ParticleManagerMixin from mod fabric-registry-sync-v0->@Inject::onInit(Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/client/texture/TextureManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ParticleManagerMixin from mod fabric-registry-sync-v0->@Inject::onInit(Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/client/texture/TextureManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockDustParticleMixin from fabric-particles-v1.client.mixins.json into net.minecraft.client.particle.BlockDustParticle
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.particle.BlockDustParticleMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.particle.BlockDustParticle
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ParticleManagerAccessor$SimpleSpriteProviderAccessor from fabric-particles-v1.client.mixins.json into net.minecraft.client.particle.ParticleManager$SimpleSpriteProvider
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.particle.BlockMarkerParticleMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.particle.BlockMarkerParticle
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameRendererMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.render.GameRenderer
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing WorldRendererMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.WorldRenderer
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$beforeClouds$0()V to md84ced3$fabric-rendering-v1$lambda$beforeClouds$0$0 in fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.render.WorldRenderer
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRender(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRender(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRender(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSetup(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/Frustum;ZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSetup(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/Frustum;ZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSetup(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/Frustum;ZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeTerrainSolid(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeTerrainSolid(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeTerrainSolid(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSolid(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSolid(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSolid(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRenderOutline(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/util/math/MatrixStack;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRenderOutline(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/util/math/MatrixStack;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRenderOutline(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/util/math/MatrixStack;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onDrawBlockOutline(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/util/math/MatrixStack;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeDebugRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeDebugRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeDebugRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeClouds(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeClouds(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeClouds(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onFinishWritingFramebuffer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onFinishWritingFramebuffer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onFinishWritingFramebuffer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onReload(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onReload(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onReload(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::renderWeather(Lnet/minecraft/client/render/FrameGraphBuilder;Lnet/minecraft/util/math/Vec3d;FLnet/minecraft/client/render/Fog;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::renderCloud(Lnet/minecraft/client/render/FrameGraphBuilder;Lnet/minecraft/client/option/CloudRenderMode;Lnet/minecraft/util/math/Vec3d;FIFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::renderSky(Lnet/minecraft/client/render/FrameGraphBuilder;Lnet/minecraft/client/render/Camera;FLnet/minecraft/client/render/Fog;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LayeredDrawerAccessor from fabric-rendering-v1.mixins.json into net.minecraft.client.gui.LayeredDrawer
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LayeredDrawerMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.gui.LayeredDrawer
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:LayeredDrawerMixin from mod fabric-rendering-v1->@Inject::wrapSubDrawer(Lnet/minecraft/client/gui/LayeredDrawer;Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing DebugHudMixin from fabric-renderer-api-v1.debughud.mixins.json into net.minecraft.client.gui.hud.DebugHud
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.debughud.mixins.json:DebugHudMixin from mod fabric-renderer-api-v1->@Inject::getLeftText(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.debughud.mixins.json:DebugHudMixin from mod fabric-renderer-api-v1->@Inject::getLeftText(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourceMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.Resource
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MessageHandlerMixin from fabric-message-api-v1.client.mixins.json into net.minecraft.client.network.message.MessageHandler
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:MessageHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_onSignedChatMessage(Lnet/minecraft/network/message/MessageType$Parameters;Lnet/minecraft/network/message/SignedMessage;Lnet/minecraft/text/Text;Lcom/mojang/authlib/GameProfile;ZLjava/time/Instant;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:MessageHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_onFilteredSignedChatMessage(Lnet/minecraft/network/message/MessageType$Parameters;Lnet/minecraft/network/message/SignedMessage;Lnet/minecraft/text/Text;Lcom/mojang/authlib/GameProfile;ZLjava/time/Instant;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:MessageHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_onProfilelessChatMessage(Lnet/minecraft/network/message/MessageType$Parameters;Lnet/minecraft/text/Text;Ljava/time/Instant;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:05] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:MessageHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_allowGameMessage(Lnet/minecraft/text/Text;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:06] [Render thread/INFO] (net.minecraft.resource.ReloadableResourceManagerImpl) Reloading ResourceManager: vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, ttpmodpoc
[20:10:06] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SimpleResourceReloadMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.SimpleResourceReload
[20:10:06] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SimpleResourceReloadMixin from mod fabric-resource-loader-v0->@Inject::method_40087(Lnet/minecraft/resource/ResourceManager;Ljava/util/List;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/CompletableFuture;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[20:10:06] [Download-1/INFO] (net.minecraft.client.realms.RealmsClient) Could not authorize you against Realms server: Invalid session id
[20:10:06] [ForkJoinPool.commonPool-worker-1/DEBUG] (FabricLoader/Mixin) Mixing client.block.model.BlockStateModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.BlockStateModel
[20:10:06] [Download-1/ERROR] (net.minecraft.client.realms.RealmsClient) Failed to fetch Realms feature flags
net.minecraft.client.realms.exception.RealmsServiceException: Realms authentication error with message 'Invalid session id'
	at knot/net.minecraft.client.realms.RealmsClient.execute(RealmsClient.java:465) ~[minecraft-merged-5e5bca9d97-1.21.5-net.fabricmc.yarn.1_21_5.1.21.5+build.1-v2.jar:?]
	at knot/net.minecraft.client.realms.RealmsClient.fetchFeatureFlags(RealmsClient.java:149) ~[minecraft-merged-5e5bca9d97-1.21.5-net.fabricmc.yarn.1_21_5.1.21.5+build.1-v2.jar:?]
	at java.base/java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1768) ~[?:?]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144) ~[?:?]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642) ~[?:?]
	at java.base/java.lang.Thread.run(Thread.java:1583) [?:?]
[20:10:06] [Worker-Main-7/INFO] (net.minecraft.client.font.UnihexFont) Found unifont_all_no_pua-16.0.01.hex, loading
[20:10:06] [Worker-Main-2/DEBUG] (FabricLoader/Mixin) Mixing EntityModelsMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.model.EntityModels
[20:10:06] [Worker-Main-2/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:EntityModelsMixin from mod fabric-rendering-v1->@Inject::registerExtraModelData(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lcom/google/common/collect/ImmutableMap$Builder;)V doesn't use it's CallbackInfoReturnable
[20:10:06] [Render thread/DEBUG] (com.mojang.blaze3d.systems.RenderSystem) Growing IndexBuffer: Old limit 0, new limit 24.
[20:10:06] [Render thread/DEBUG] (com.mojang.blaze3d.systems.RenderSystem) Growing IndexBuffer: Old limit 24, new limit 60.
[20:10:06] [Worker-Main-4/DEBUG] (FabricLoader/Mixin) Mixing client.block.model.BlockModelPartMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.BlockModelPart
[20:10:06] [Worker-Main-4/DEBUG] (FabricLoader/Mixin) Mixing client.block.model.SimpleBlockStateModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.SimpleBlockStateModel
[20:10:06] [Worker-Main-5/DEBUG] (FabricLoader/Mixin) Mixing JsonUnbakedModelAccessor from fabric-model-loading-api-v1.mixins.json into net.minecraft.client.render.model.json.JsonUnbakedModel
[20:10:06] [Worker-Main-5/DEBUG] (FabricLoader/Mixin) Mixing JsonUnbakedModelMixin from fabric-model-loading-api-v1.mixins.json into net.minecraft.client.render.model.json.JsonUnbakedModel
[20:10:06] [Worker-Main-2/DEBUG] (FabricLoader/Mixin) Mixing EntityModelLayersMixin from fabric-object-builder-v1.client.mixins.json into net.minecraft.client.render.entity.model.EntityModelLayers
[20:10:06] [Worker-Main-2/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$createHangingSign$0(Lnet/minecraft/client/render/block/entity/HangingSignBlockEntityRenderer$AttachmentType;Ljava/lang/String;)Ljava/lang/String; to md84ced3$fabric-object-builder-api-v1$lambda$createHangingSign$0$0 in fabric-object-builder-v1.client.mixins.json:EntityModelLayersMixin from mod fabric-object-builder-api-v1
[20:10:06] [Worker-Main-2/DEBUG] (FabricLoader/Mixin) Mixing EntityModelLayersAccessor from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.model.EntityModelLayers
[20:10:06] [Worker-Main-2/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getLayers()Ljava/util/Set; to getLayers$fabric-rendering-v1_$md$84ced3$1 in fabric-rendering-v1.mixins.json:EntityModelLayersAccessor from mod fabric-rendering-v1
[20:10:06] [Worker-Main-2/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:EntityModelLayersMixin from mod fabric-object-builder-api-v1->@Inject::createStandingSign(Lnet/minecraft/block/WoodType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:06] [Worker-Main-2/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:EntityModelLayersMixin from mod fabric-object-builder-api-v1->@Inject::createWallSign(Lnet/minecraft/block/WoodType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:06] [Worker-Main-2/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:EntityModelLayersMixin from mod fabric-object-builder-api-v1->@Inject::createHangingSign(Lnet/minecraft/block/WoodType;Lnet/minecraft/client/render/block/entity/HangingSignBlockEntityRenderer$AttachmentType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[20:10:06] [Worker-Main-7/INFO] (net.minecraft.client.font.UnihexFont) Found unifont_jp_patch-16.0.01.hex, loading
[20:10:07] [Worker-Main-5/DEBUG] (FabricLoader/Mixin) Mixing client.block.model.MultipartBlockStateModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.MultipartBlockStateModel
[20:10:07] [Worker-Main-5/DEBUG] (FabricLoader/Mixin) Mixing client.block.model.WeightedBlockStateModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.WeightedBlockStateModel
[20:10:07] [Worker-Main-5/DEBUG] (FabricLoader/Mixin) Mixing client.block.model.GeometryBakedModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.GeometryBakedModel
[20:10:07] [Worker-Main-7/DEBUG] (FabricLoader/Mixin) Mixing client.block.model.MultipartBakedModelAccessor from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.MultipartBlockStateModel$MultipartBakedModel
[20:10:08] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Found unknown and unsupported uniform Sampler2 in minecraft:pipeline/energy_swirl
[20:10:08] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/energy_swirl
[20:10:08] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/armor_cutout_no_cull
[20:10:08] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/entity_no_outline
[20:10:08] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/armor_translucent
[20:10:08] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Found unknown and unsupported uniform Sampler2 in minecraft:pipeline/eyes
[20:10:08] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/eyes
[20:10:08] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/breeze_wind
[20:10:08] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/armor_decal_cutout_no_cull
[20:10:08] [Render thread/INFO] (net.minecraft.client.sound.SoundEngine) OpenAL initialized on device OpenAL Soft on Speakers/Headphones (Realtek High Definition Audio)
[20:10:08] [Render thread/INFO] (net.minecraft.client.sound.SoundSystem) Sound engine started
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 1024x512x4 minecraft:textures/atlas/blocks.png-atlas
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 256x256x4 minecraft:textures/atlas/signs.png-atlas
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x512x4 minecraft:textures/atlas/banner_patterns.png-atlas
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x512x4 minecraft:textures/atlas/shield_patterns.png-atlas
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 2048x1024x4 minecraft:textures/atlas/armor_trims.png-atlas
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 256x256x4 minecraft:textures/atlas/chest.png-atlas
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 128x64x4 minecraft:textures/atlas/decorated_pot.png-atlas
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x4 minecraft:textures/atlas/beds.png-atlas
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x4 minecraft:textures/atlas/shulker_boxes.png-atlas
[20:10:08] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 64x64x0 minecraft:textures/atlas/map_decorations.png-atlas
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing EntityRenderersMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.EntityRenderers
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$onRegisterRenderers$0(Lnet/minecraft/entity/EntityType;Lnet/minecraft/client/render/entity/EntityRendererFactory;)V to md84ced3$fabric-rendering-v1$lambda$onRegisterRenderers$0$0 in fabric-rendering-v1.mixins.json:EntityRenderersMixin from mod fabric-rendering-v1
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:EntityRenderersMixin from mod fabric-rendering-v1->@Inject::onRegisterRenderers(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LivingEntityRendererAccessor from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.LivingEntityRenderer
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ArmorFeatureRendererMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.feature.ArmorFeatureRenderer
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ArmorFeatureRendererMixin from mod fabric-rendering-v1->@Inject::render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/BipedEntityRenderState;FFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ArmorFeatureRendererMixin from mod fabric-rendering-v1->@Inject::render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/BipedEntityRenderState;FFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ArmorFeatureRendererMixin from mod fabric-rendering-v1->@Inject::render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/BipedEntityRenderState;FFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ArmorFeatureRendererMixin from mod fabric-rendering-v1->@Inject::renderArmor(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EquipmentSlot;ILnet/minecraft/client/render/entity/model/BipedEntityModel;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.render.FallingBlockEntityRendererMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.entity.FallingBlockEntityRenderer
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$render$0(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer; to md84ced3$fabric-renderer-api-v1$lambda$render$0$0 in fabric-renderer-api-v1.mixins.json:client.block.render.FallingBlockEntityRendererMixin from mod fabric-renderer-api-v1
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.render.ItemFrameEntityRendererMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.entity.ItemFrameEntityRenderer
[20:10:08] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$renderProxy$0(Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer; to md84ced3$fabric-renderer-api-v1$lambda$renderProxy$0$0 in fabric-renderer-api-v1.mixins.json:client.block.render.ItemFrameEntityRendererMixin from mod fabric-renderer-api-v1
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.render.MooshroomMushroomFeatureRendererMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.entity.feature.MooshroomMushroomFeatureRenderer
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$renderProxy$0(Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer; to md84ced3$fabric-renderer-api-v1$lambda$renderProxy$0$0 in fabric-renderer-api-v1.mixins.json:client.block.render.MooshroomMushroomFeatureRendererMixin from mod fabric-renderer-api-v1
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.render.SnowGolemPumpkinFeatureRendererMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.entity.feature.SnowGolemPumpkinFeatureRenderer
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$renderProxy$1(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer; to md84ced3$fabric-renderer-api-v1$lambda$renderProxy$1$0 in fabric-renderer-api-v1.mixins.json:client.block.render.SnowGolemPumpkinFeatureRendererMixin from mod fabric-renderer-api-v1
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$renderProxy$0(Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer; to md84ced3$fabric-renderer-api-v1$lambda$renderProxy$0$1 in fabric-renderer-api-v1.mixins.json:client.block.render.SnowGolemPumpkinFeatureRendererMixin from mod fabric-renderer-api-v1
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing CapeFeatureRendererMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.feature.CapeFeatureRenderer
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityRendererFactoriesMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.block.entity.BlockEntityRendererFactories
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$0(Lnet/minecraft/block/entity/BlockEntityType;Lnet/minecraft/client/render/block/entity/BlockEntityRendererFactory;)V to md84ced3$fabric-rendering-v1$lambda$init$0$0 in fabric-rendering-v1.mixins.json:BlockEntityRendererFactoriesMixin from mod fabric-rendering-v1
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:BlockEntityRendererFactoriesMixin from mod fabric-rendering-v1->@Inject::init(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.block.render.PistonBlockEntityRendererMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.block.entity.PistonBlockEntityRenderer
[20:10:09] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$renderModel$0(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer; to md84ced3$fabric-renderer-api-v1$lambda$renderModel$0$0 in fabric-renderer-api-v1.mixins.json:client.block.render.PistonBlockEntityRendererMixin from mod fabric-renderer-api-v1
[20:10:09] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x0 minecraft:textures/atlas/particles.png-atlas
[20:10:09] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x0 minecraft:textures/atlas/paintings.png-atlas
[20:10:09] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 256x128x0 minecraft:textures/atlas/mob_effects.png-atlas
[20:10:09] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 1024x512x0 minecraft:textures/atlas/gui.png-atlas
[20:10:11] [Render thread/DEBUG] (com.mojang.blaze3d.systems.RenderSystem) Growing IndexBuffer: Old limit 60, new limit 288.
[20:10:11] [Render thread/INFO] (net.minecraft.client.gl.GlDebug) OpenGL debug message: id=1282, source=API, type=ERROR, severity=HIGH, message='Error has been generated. GL error GL_INVALID_OPERATION in (null): (ID: 173538523) Generic error'
[20:10:11] [Render thread/INFO] (net.minecraft.client.gl.GlDebug) OpenGL debug message: id=1282, source=API, type=ERROR, severity=HIGH, message='Error has been generated. GL error GL_INVALID_OPERATION in (null): (ID: 173538523) Generic error'
[20:10:11] [Render thread/DEBUG] (com.mojang.blaze3d.systems.RenderSystem) Growing IndexBuffer: Old limit 288, new limit 816.
[20:10:11] [Render thread/INFO] (net.minecraft.client.gl.GlDebug) OpenGL debug message: id=1282, source=API, type=ERROR, severity=HIGH, message='Error has been generated. GL error GL_INVALID_OPERATION in (null): (ID: 173538523) Generic error'
[20:10:11] [Render thread/INFO] (net.minecraft.client.gl.GlDebug) OpenGL debug message: id=1282, source=API, type=ERROR, severity=HIGH, message='Error has been generated. GL error GL_INVALID_OPERATION in (null): (ID: 173538523) Generic error'
[20:10:33] [Render thread/INFO] (net.minecraft.client.MinecraftClient) Stopping!

```

# run/logs/latest.log

```log
[20:09:48] [main/INFO] (FabricLoader/GameProvider) Loading Minecraft 1.21.5 with Fabric Loader 0.16.11
[20:09:48] [main/INFO] (FabricLoader) Loading 55 mods:
	- fabric-api 0.119.6+1.21.5
	- fabric-api-base 0.4.62+73a52b4b49
	- fabric-api-lookup-api-v1 1.6.95+86c3a9f149
	- fabric-biome-api-v1 16.0.7+2dd063df49
	- fabric-block-api-v1 1.0.37+86c3a9f149
	- fabric-block-view-api-v2 1.0.26+aa6d566c49
	- fabric-blockrenderlayer-v1 2.0.16+86c3a9f149
	- fabric-client-gametest-api-v1 4.1.10+f3ffa98949
	- fabric-client-tags-api-v1 1.1.37+86c3a9f149
	- fabric-command-api-v1 1.2.70+f71b366f49
	- fabric-command-api-v2 2.2.49+73a52b4b49
	- fabric-commands-v0 0.2.87+df3654b349
	- fabric-content-registries-v0 10.0.11+216530c849
	- fabric-convention-tags-v1 2.1.28+7f945d5b49
	- fabric-convention-tags-v2 2.14.2+7d35484649
	- fabric-crash-report-info-v1 0.3.12+86c3a9f149
	- fabric-data-attachment-api-v1 1.6.6+7b20cbb049
	- fabric-data-generation-api-v1 22.3.2+d94614b849
	- fabric-dimensions-v1 4.0.16+86c3a9f149
	- fabric-entity-events-v1 2.0.25+27c1078f49
	- fabric-events-interaction-v0 4.0.13+73a52b4b49
	- fabric-game-rule-api-v1 1.0.70+c327076a49
	- fabric-gametest-api-v1 3.1.2+2a6ec84b49
	- fabric-item-api-v1 11.3.1+eeb42f0249
	- fabric-item-group-api-v1 4.2.8+3459fc6149
	- fabric-key-binding-api-v1 1.0.63+ecf51cdc49
	- fabric-keybindings-v0 0.2.61+df3654b349
	- fabric-lifecycle-events-v1 2.5.13+5cbce67349
	- fabric-loot-api-v2 3.0.47+3f89f5a549
	- fabric-loot-api-v3 1.0.35+86c3a9f149
	- fabric-message-api-v1 6.0.33+86c3a9f149
	- fabric-model-loading-api-v1 5.0.3+129968e949
	- fabric-networking-api-v1 4.4.0+f3ffa98949
	- fabric-object-builder-api-v1 21.0.0+7b20cbb049
	- fabric-particles-v1 4.0.22+86c3a9f149
	- fabric-recipe-api-v1 8.1.6+052a85d049
	- fabric-registry-sync-v0 6.1.20+b556383249
	- fabric-renderer-api-v1 6.0.0+55bce67a49
	- fabric-renderer-indigo 3.0.0+55bce67a49
	- fabric-rendering-data-attachment-v1 0.3.64+73761d2e49
	- fabric-rendering-fluids-v1 3.1.27+86c3a9f149
	- fabric-rendering-v1 11.1.11+081cc04349
	- fabric-resource-conditions-api-v1 5.0.21+73a52b4b49
	- fabric-resource-loader-v0 3.1.6+02ca679649
	- fabric-screen-api-v1 2.0.46+86c3a9f149
	- fabric-screen-handler-api-v1 1.3.127+c327076a49
	- fabric-sound-api-v1 1.0.38+86c3a9f149
	- fabric-tag-api-v1 1.0.16+ecf51cdc49
	- fabric-transfer-api-v1 5.4.23+7b20cbb049
	- fabric-transitive-access-wideners-v1 6.3.17+f17a180c49
	- fabricloader 0.16.11
	- java 21
	- minecraft 1.21.5
	- mixinextras 0.4.1
	- ttpmodpoc 1.0.0
[20:09:48] [main/INFO] (FabricLoader/Mixin) SpongePowered MIXIN Subsystem Version=0.8.7 Source=file:/C:/Users/tillman/.gradle/caches/modules-2/files-2.1/net.fabricmc/sponge-mixin/0.15.4+mixin.0.8.7/6a12aacc794f1078458433116e9ed42c1cc98096/sponge-mixin-0.15.4+mixin.0.8.7.jar Service=Knot/Fabric Env=CLIENT
[20:09:49] [main/INFO] (FabricLoader/Mixin) Loaded Fabric development mappings for mixin remapper!
[20:09:49] [main/INFO] (FabricLoader/Mixin) Compatibility level set to JAVA_21
[20:09:51] [main/INFO] (FabricLoader/MixinExtras|Service) Initializing MixinExtras via com.llamalad7.mixinextras.service.MixinExtrasServiceImpl(version=0.4.1).
[20:09:55] [Datafixer Bootstrap/INFO] (Minecraft) 263 Datafixer optimizations took 2683 milliseconds
[20:10:03] [Render thread/INFO] (Minecraft) Environment: Environment[sessionHost=https://sessionserver.mojang.com, servicesHost=https://api.minecraftservices.com, name=PROD]
[20:10:03] [Render thread/INFO] (Minecraft) Setting user: Player425
[20:10:03] [Render thread/INFO] (Indigo) [Indigo] Registering Indigo renderer!
[20:10:04] [Render thread/INFO] (Minecraft) Backend library: LWJGL version 3.3.3-snapshot
[20:10:05] [Render thread/INFO] (Minecraft) Using optional rendering extensions: GL_KHR_debug, GL_ARB_vertex_attrib_binding
[20:10:06] [Render thread/INFO] (Minecraft) Reloading ResourceManager: vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-gametest-api-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-tag-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, ttpmodpoc
[20:10:06] [Download-1/INFO] (Minecraft) Could not authorize you against Realms server: Invalid session id
[20:10:06] [Download-1/ERROR] (Minecraft) Failed to fetch Realms feature flags
net.minecraft.client.realms.exception.RealmsServiceException: Realms authentication error with message 'Invalid session id'
	at knot/net.minecraft.client.realms.RealmsClient.execute(RealmsClient.java:465) ~[minecraft-merged-5e5bca9d97-1.21.5-net.fabricmc.yarn.1_21_5.1.21.5+build.1-v2.jar:?]
	at knot/net.minecraft.client.realms.RealmsClient.fetchFeatureFlags(RealmsClient.java:149) ~[minecraft-merged-5e5bca9d97-1.21.5-net.fabricmc.yarn.1_21_5.1.21.5+build.1-v2.jar:?]
	at java.base/java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1768) ~[?:?]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144) ~[?:?]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642) ~[?:?]
	at java.base/java.lang.Thread.run(Thread.java:1583) [?:?]
[20:10:06] [Worker-Main-7/INFO] (Minecraft) Found unifont_all_no_pua-16.0.01.hex, loading
[20:10:06] [Worker-Main-7/INFO] (Minecraft) Found unifont_jp_patch-16.0.01.hex, loading
[20:10:08] [Render thread/WARN] (Minecraft) Found unknown and unsupported uniform Sampler2 in minecraft:pipeline/energy_swirl
[20:10:08] [Render thread/WARN] (Minecraft) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/energy_swirl
[20:10:08] [Render thread/WARN] (Minecraft) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/armor_cutout_no_cull
[20:10:08] [Render thread/WARN] (Minecraft) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/entity_no_outline
[20:10:08] [Render thread/WARN] (Minecraft) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/armor_translucent
[20:10:08] [Render thread/WARN] (Minecraft) Found unknown and unsupported uniform Sampler2 in minecraft:pipeline/eyes
[20:10:08] [Render thread/WARN] (Minecraft) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/eyes
[20:10:08] [Render thread/WARN] (Minecraft) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/breeze_wind
[20:10:08] [Render thread/WARN] (Minecraft) Found unknown and unsupported uniform Sampler1 in minecraft:pipeline/armor_decal_cutout_no_cull
[20:10:08] [Render thread/INFO] (Minecraft) OpenAL initialized on device OpenAL Soft on Speakers/Headphones (Realtek High Definition Audio)
[20:10:08] [Render thread/INFO] (Minecraft) Sound engine started
[20:10:08] [Render thread/INFO] (Minecraft) Created: 1024x512x4 minecraft:textures/atlas/blocks.png-atlas
[20:10:08] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/signs.png-atlas
[20:10:08] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/banner_patterns.png-atlas
[20:10:08] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/shield_patterns.png-atlas
[20:10:08] [Render thread/INFO] (Minecraft) Created: 2048x1024x4 minecraft:textures/atlas/armor_trims.png-atlas
[20:10:08] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/chest.png-atlas
[20:10:08] [Render thread/INFO] (Minecraft) Created: 128x64x4 minecraft:textures/atlas/decorated_pot.png-atlas
[20:10:08] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/beds.png-atlas
[20:10:08] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/shulker_boxes.png-atlas
[20:10:08] [Render thread/INFO] (Minecraft) Created: 64x64x0 minecraft:textures/atlas/map_decorations.png-atlas
[20:10:09] [Render thread/INFO] (Minecraft) Created: 512x256x0 minecraft:textures/atlas/particles.png-atlas
[20:10:09] [Render thread/INFO] (Minecraft) Created: 512x256x0 minecraft:textures/atlas/paintings.png-atlas
[20:10:09] [Render thread/INFO] (Minecraft) Created: 256x128x0 minecraft:textures/atlas/mob_effects.png-atlas
[20:10:09] [Render thread/INFO] (Minecraft) Created: 1024x512x0 minecraft:textures/atlas/gui.png-atlas
[20:10:11] [Render thread/INFO] (Minecraft) OpenGL debug message: id=1282, source=API, type=ERROR, severity=HIGH, message='Error has been generated. GL error GL_INVALID_OPERATION in (null): (ID: 173538523) Generic error'
[20:10:11] [Render thread/INFO] (Minecraft) OpenGL debug message: id=1282, source=API, type=ERROR, severity=HIGH, message='Error has been generated. GL error GL_INVALID_OPERATION in (null): (ID: 173538523) Generic error'
[20:10:11] [Render thread/INFO] (Minecraft) OpenGL debug message: id=1282, source=API, type=ERROR, severity=HIGH, message='Error has been generated. GL error GL_INVALID_OPERATION in (null): (ID: 173538523) Generic error'
[20:10:11] [Render thread/INFO] (Minecraft) OpenGL debug message: id=1282, source=API, type=ERROR, severity=HIGH, message='Error has been generated. GL error GL_INVALID_OPERATION in (null): (ID: 173538523) Generic error'
[20:10:33] [Render thread/INFO] (Minecraft) Stopping!

```

# run/options.txt

```txt
version:4325
ao:true
biomeBlendRadius:2
enableVsync:true
entityDistanceScaling:1.0
entityShadows:true
forceUnicodeFont:false
japaneseGlyphVariants:false
fov:0.0
fovEffectScale:1.0
darknessEffectScale:1.0
glintSpeed:0.5
glintStrength:0.75
prioritizeChunkUpdates:0
fullscreen:false
gamma:0.5
graphicsMode:1
guiScale:0
maxFps:120
inactivityFpsLimit:"afk"
mipmapLevels:4
narrator:0
particles:0
reducedDebugInfo:false
renderClouds:"true"
renderDistance:12
simulationDistance:12
screenEffectScale:1.0
soundDevice:""
autoJump:false
rotateWithMinecart:false
operatorItemsTab:false
autoSuggestions:true
chatColors:true
chatLinks:true
chatLinksPrompt:true
discrete_mouse_scroll:false
invertYMouse:false
realmsNotifications:true
showSubtitles:false
directionalAudio:false
touchscreen:false
bobView:true
toggleCrouch:false
toggleSprint:false
darkMojangStudiosBackground:false
hideLightningFlashes:false
hideSplashTexts:false
mouseSensitivity:0.5
damageTiltStrength:1.0
highContrast:false
highContrastBlockOutline:false
narratorHotkey:true
resourcePacks:["fabric"]
incompatibleResourcePacks:[]
lastServer:
lang:en_us
chatVisibility:0
chatOpacity:1.0
chatLineSpacing:0.0
textBackgroundOpacity:0.5
backgroundForChatOnly:true
hideServerAddress:false
advancedItemTooltips:false
pauseOnLostFocus:true
overrideWidth:0
overrideHeight:0
chatHeightFocused:1.0
chatDelay:0.0
chatHeightUnfocused:0.4375
chatScale:1.0
chatWidth:1.0
notificationDisplayTime:1.0
useNativeTransport:true
mainHand:"right"
attackIndicator:1
tutorialStep:find_tree
mouseWheelSensitivity:1.0
rawMouseInput:true
glDebugVerbosity:1
skipMultiplayerWarning:false
hideMatchedNames:true
joinedFirstServer:false
syncChunkWrites:true
showAutosaveIndicator:true
allowServerListing:true
onlyShowSecureChat:false
panoramaScrollSpeed:1.0
telemetryOptInExtra:false
onboardAccessibility:false
menuBackgroundBlurriness:5
startedCleanly:true
key_key.attack:key.mouse.left
key_key.use:key.mouse.right
key_key.forward:key.keyboard.w
key_key.left:key.keyboard.a
key_key.back:key.keyboard.s
key_key.right:key.keyboard.d
key_key.jump:key.keyboard.space
key_key.sneak:key.keyboard.left.shift
key_key.sprint:key.keyboard.left.control
key_key.drop:key.keyboard.q
key_key.inventory:key.keyboard.e
key_key.chat:key.keyboard.t
key_key.playerlist:key.keyboard.tab
key_key.pickItem:key.mouse.middle
key_key.command:key.keyboard.slash
key_key.socialInteractions:key.keyboard.p
key_key.screenshot:key.keyboard.f2
key_key.togglePerspective:key.keyboard.f5
key_key.smoothCamera:key.keyboard.unknown
key_key.fullscreen:key.keyboard.f11
key_key.spectatorOutlines:key.keyboard.unknown
key_key.swapOffhand:key.keyboard.f
key_key.saveToolbarActivator:key.keyboard.c
key_key.loadToolbarActivator:key.keyboard.x
key_key.advancements:key.keyboard.l
key_key.hotbar.1:key.keyboard.1
key_key.hotbar.2:key.keyboard.2
key_key.hotbar.3:key.keyboard.3
key_key.hotbar.4:key.keyboard.4
key_key.hotbar.5:key.keyboard.5
key_key.hotbar.6:key.keyboard.6
key_key.hotbar.7:key.keyboard.7
key_key.hotbar.8:key.keyboard.8
key_key.hotbar.9:key.keyboard.9
soundCategory_master:1.0
soundCategory_music:1.0
soundCategory_record:1.0
soundCategory_weather:1.0
soundCategory_block:1.0
soundCategory_hostile:1.0
soundCategory_neutral:1.0
soundCategory_player:1.0
soundCategory_ambient:1.0
soundCategory_voice:1.0
modelPart_cape:true
modelPart_jacket:true
modelPart_left_sleeve:true
modelPart_right_sleeve:true
modelPart_left_pants_leg:true
modelPart_right_pants_leg:true
modelPart_hat:true

```

# run/saves/TestWorld/advancements/5db36629-721d-3a36-8728-14b3ab112351.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 18:33:43 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:plains": "2025-04-02 18:33:44 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/advancements/6e05ecd8-b367-3929-8021-d89bbb1d2225.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 07:10:10 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:plains": "2025-04-02 07:10:11 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/advancements/9a479c15-8100-309d-8c38-1d323bfdcf80.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 07:22:42 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:plains": "2025-04-02 07:22:43 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/advancements/811b757c-1be5-33cf-864a-fb91beb14990.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 07:27:38 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:plains": "2025-04-02 07:27:38 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/advancements/23345143-148b-327b-8641-d2091803951a.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 14:25:00 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:plains": "2025-04-02 14:25:00 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/advancements/63489016-3661-38ec-acb6-3029cde6f29c.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 16:19:09 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:plains": "2025-04-02 16:19:10 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/advancements/ae93e61c-5484-3859-844d-955ead0489d9.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 07:37:47 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:plains": "2025-04-02 07:37:48 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/advancements/d0f5fb0c-30f8-3708-84d1-e619aef4d8f4.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 07:00:35 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:forest": "2025-04-02 07:00:36 -0400",
      "minecraft:plains": "2025-04-02 07:01:04 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/advancements/e012d939-bd4c-38f9-ae46-831d4959ff05.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 07:34:24 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:plains": "2025-04-02 07:34:24 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/advancements/f07953aa-b16d-3fed-8d8a-d64904ef9606.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2025-04-02 18:32:07 -0400"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:plains": "2025-04-02 18:32:08 -0400"
    },
    "done": false
  },
  "DataVersion": 4325
}
```

# run/saves/TestWorld/data/chunks.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/data/raids.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/data/random_sequences.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/data/scoreboard.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/DIM-1/data/chunks.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/DIM-1/data/raids.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/DIM1/data/chunks.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/DIM1/data/raids_end.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/entities/r.-1.-1.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/entities/r.-1.0.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/entities/r.0.-1.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/entities/r.0.0.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/icon.png

This is a binary file of the type: Image

# run/saves/TestWorld/level.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/level.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/5db36629-721d-3a36-8728-14b3ab112351.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/5db36629-721d-3a36-8728-14b3ab112351.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/6e05ecd8-b367-3929-8021-d89bbb1d2225.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/6e05ecd8-b367-3929-8021-d89bbb1d2225.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/9a479c15-8100-309d-8c38-1d323bfdcf80.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/9a479c15-8100-309d-8c38-1d323bfdcf80.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/811b757c-1be5-33cf-864a-fb91beb14990.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/811b757c-1be5-33cf-864a-fb91beb14990.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/23345143-148b-327b-8641-d2091803951a.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/23345143-148b-327b-8641-d2091803951a.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/63489016-3661-38ec-acb6-3029cde6f29c.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/63489016-3661-38ec-acb6-3029cde6f29c.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/ae93e61c-5484-3859-844d-955ead0489d9.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/ae93e61c-5484-3859-844d-955ead0489d9.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/d0f5fb0c-30f8-3708-84d1-e619aef4d8f4.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/d0f5fb0c-30f8-3708-84d1-e619aef4d8f4.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/e012d939-bd4c-38f9-ae46-831d4959ff05.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/e012d939-bd4c-38f9-ae46-831d4959ff05.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/f07953aa-b16d-3fed-8d8a-d64904ef9606.dat

This is a binary file of the type: Binary

# run/saves/TestWorld/playerdata/f07953aa-b16d-3fed-8d8a-d64904ef9606.dat_old

This is a binary file of the type: Binary

# run/saves/TestWorld/poi/r.-1.-1.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/poi/r.-1.0.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/poi/r.0.-1.mca

```mca

```

# run/saves/TestWorld/poi/r.0.0.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/region/r.-1.-1.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/region/r.-1.0.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/region/r.0.-1.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/region/r.0.0.mca

This is a binary file of the type: Binary

# run/saves/TestWorld/session.lock

```lock
☃
```

# run/saves/TestWorld/stats/5db36629-721d-3a36-8728-14b3ab112351.json

```json
{"stats":{"minecraft:custom":{"minecraft:time_since_rest":67,"minecraft:total_world_time":97,"minecraft:leave_game":1,"minecraft:play_time":67,"minecraft:time_since_death":67}},"DataVersion":4325}
```

# run/saves/TestWorld/stats/6e05ecd8-b367-3929-8021-d89bbb1d2225.json

```json
{"stats":{"minecraft:custom":{"minecraft:time_since_rest":159,"minecraft:total_world_time":199,"minecraft:leave_game":1,"minecraft:play_time":159,"minecraft:time_since_death":159}},"DataVersion":4325}
```

# run/saves/TestWorld/stats/9a479c15-8100-309d-8c38-1d323bfdcf80.json

```json
{"stats":{"minecraft:custom":{"minecraft:time_since_rest":354,"minecraft:total_world_time":395,"minecraft:leave_game":1,"minecraft:play_time":354,"minecraft:time_since_death":354}},"DataVersion":4325}
```

# run/saves/TestWorld/stats/811b757c-1be5-33cf-864a-fb91beb14990.json

```json
{"stats":{"minecraft:custom":{"minecraft:time_since_rest":297,"minecraft:total_world_time":333,"minecraft:leave_game":1,"minecraft:play_time":297,"minecraft:time_since_death":297}},"DataVersion":4325}
```

# run/saves/TestWorld/stats/23345143-148b-327b-8641-d2091803951a.json

```json
{"stats":{"minecraft:custom":{"minecraft:sprint_one_cm":59,"minecraft:time_since_rest":2277,"minecraft:walk_one_cm":6572,"minecraft:total_world_time":2315,"minecraft:leave_game":1,"minecraft:play_time":2277,"minecraft:jump":5,"minecraft:time_since_death":2277},"minecraft:picked_up":{"minecraft:dirt":33,"minecraft:wheat_seeds":1},"minecraft:mined":{"minecraft:short_grass":1,"minecraft:dirt":17,"minecraft:grass_block":16},"minecraft:used":{"minecraft:dirt":2}},"DataVersion":4325}
```

# run/saves/TestWorld/stats/63489016-3661-38ec-acb6-3029cde6f29c.json

```json
{"stats":{"minecraft:custom":{"minecraft:time_since_rest":426,"minecraft:total_world_time":626,"minecraft:leave_game":1,"minecraft:play_time":426,"minecraft:time_since_death":426}},"DataVersion":4325}
```

# run/saves/TestWorld/stats/ae93e61c-5484-3859-844d-955ead0489d9.json

```json
{"stats":{"minecraft:custom":{"minecraft:time_since_rest":292,"minecraft:total_world_time":323,"minecraft:leave_game":1,"minecraft:play_time":292,"minecraft:time_since_death":292}},"DataVersion":4325}
```

# run/saves/TestWorld/stats/d0f5fb0c-30f8-3708-84d1-e619aef4d8f4.json

```json
{"stats":{"minecraft:custom":{"minecraft:time_since_rest":675,"minecraft:fall_one_cm":525,"minecraft:walk_one_cm":1497,"minecraft:total_world_time":709,"minecraft:leave_game":1,"minecraft:play_time":675,"minecraft:jump":6,"minecraft:time_since_death":675}},"DataVersion":4325}
```

# run/saves/TestWorld/stats/e012d939-bd4c-38f9-ae46-831d4959ff05.json

```json
{"stats":{"minecraft:custom":{"minecraft:time_since_rest":193,"minecraft:total_world_time":224,"minecraft:leave_game":1,"minecraft:play_time":193,"minecraft:time_since_death":193}},"DataVersion":4325}
```

# run/saves/TestWorld/stats/f07953aa-b16d-3fed-8d8a-d64904ef9606.json

```json
{"stats":{"minecraft:custom":{"minecraft:time_since_rest":101,"minecraft:total_world_time":143,"minecraft:leave_game":1,"minecraft:play_time":101,"minecraft:time_since_death":101}},"DataVersion":4325}
```

# run/server.properties

```properties
#Minecraft server properties
#Wed Apr 02 06:39:54 EDT 2025
accepts-transfers=false
allow-flight=false
allow-nether=true
broadcast-console-to-ops=true
broadcast-rcon-to-ops=true
bug-report-link=
difficulty=easy
enable-command-block=false
enable-jmx-monitoring=false
enable-query=false
enable-rcon=false
enable-status=true
enforce-secure-profile=true
enforce-whitelist=false
entity-broadcast-range-percentage=100
force-gamemode=false
function-permission-level=2
gamemode=survival
generate-structures=true
generator-settings={}
hardcore=false
hide-online-players=false
initial-disabled-packs=
initial-enabled-packs=vanilla,fabric,fabric-convention-tags-v2,fabric-gametest-api-v1
level-name=world
level-seed=
level-type=minecraft\:normal
log-ips=true
max-chained-neighbor-updates=1000000
max-players=20
max-tick-time=60000
max-world-size=29999984
motd=A Minecraft Server
network-compression-threshold=256
online-mode=true
op-permission-level=4
pause-when-empty-seconds=60
player-idle-timeout=0
prevent-proxy-connections=false
pvp=true
query.port=25565
rate-limit=0
rcon.password=
rcon.port=25575
region-file-compression=deflate
require-resource-pack=false
resource-pack=
resource-pack-id=
resource-pack-prompt=
resource-pack-sha1=
server-ip=
server-port=25565
simulation-distance=10
spawn-monsters=true
spawn-protection=16
sync-chunk-writes=true
text-filtering-config=
text-filtering-version=0
use-native-transport=true
view-distance=10
white-list=false

```

# run/usercache.json

```json
[{"name":"Player370","uuid":"5db36629-721d-3a36-8728-14b3ab112351","expiresOn":"2025-05-02 18:33:43 -0400"},{"name":"Player9","uuid":"f07953aa-b16d-3fed-8d8a-d64904ef9606","expiresOn":"2025-05-02 18:32:07 -0400"},{"name":"Player42","uuid":"63489016-3661-38ec-acb6-3029cde6f29c","expiresOn":"2025-05-02 16:19:09 -0400"},{"name":"Player732","uuid":"23345143-148b-327b-8641-d2091803951a","expiresOn":"2025-05-02 14:24:59 -0400"},{"name":"Player569","uuid":"ae93e61c-5484-3859-844d-955ead0489d9","expiresOn":"2025-05-02 07:37:47 -0400"},{"name":"Player893","uuid":"e012d939-bd4c-38f9-ae46-831d4959ff05","expiresOn":"2025-05-02 07:34:23 -0400"},{"name":"Player86","uuid":"811b757c-1be5-33cf-864a-fb91beb14990","expiresOn":"2025-05-02 07:27:37 -0400"},{"name":"Player694","uuid":"9a479c15-8100-309d-8c38-1d323bfdcf80","expiresOn":"2025-05-02 07:22:42 -0400"},{"name":"Player808","uuid":"6e05ecd8-b367-3929-8021-d89bbb1d2225","expiresOn":"2025-05-02 07:10:10 -0400"},{"name":"Player332","uuid":"d0f5fb0c-30f8-3708-84d1-e619aef4d8f4","expiresOn":"2025-05-02 07:00:35 -0400"}]
```

# settings.gradle

```gradle
pluginManagement {
	repositories {
		maven {
			name = 'Fabric'
			url = 'https://maven.fabricmc.net/'
		}
		mavenCentral()
		gradlePluginPortal()
	}
}
```

# src/main/java/net/obsrvr/ttpmodpoc/event/TokenTransferEvent.java

```java
package net.obsrvr.ttpmodpoc.event;


/**
 * Represents a token transfer event in the Stellar network.
 * This is an internal representation that we'll use in our mod.
 */
public class TokenTransferEvent {
    // Event types
    public enum Type {
        TRANSFER,
        MINT,
        BURN,
        UNKNOWN
    }

    private final Type type;
    private final String assetCode;
    private final String assetIssuer;
    private final String fromAccount;
    private final String toAccount;
    private final long amount;
    private final long ledgerSequence;
    private final long transactionIndex;
    private final long operationIndex;

    /**
     * Creates a new token transfer event.
     */
    public TokenTransferEvent(
            Type type,
            String assetCode,
            String assetIssuer,
            String fromAccount,
            String toAccount,
            long amount,
            long ledgerSequence,
            long transactionIndex,
            long operationIndex) {
        this.type = type;
        this.assetCode = assetCode;
        this.assetIssuer = assetIssuer;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.ledgerSequence = ledgerSequence;
        this.transactionIndex = transactionIndex;
        this.operationIndex = operationIndex;
    }

    // Getters

    public Type getType() {
        return type;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public String getAssetIssuer() {
        return assetIssuer;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public long getAmount() {
        return amount;
    }

    public long getLedgerSequence() {
        return ledgerSequence;
    }

    public long getTransactionIndex() {
        return transactionIndex;
    }

    public long getOperationIndex() {
        return operationIndex;
    }

    @Override
    public String toString() {
        return String.format(
                "TokenTransferEvent{type=%s, asset=%s:%s, from=%s, to=%s, amount=%d, ledger=%d}",
                type, assetCode, assetIssuer, fromAccount, toAccount, amount, ledgerSequence);
    }
}
```

# src/main/java/net/obsrvr/ttpmodpoc/grpc/SimpleGrpcClient.java

```java
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

```

# src/main/java/net/obsrvr/ttpmodpoc/grpc/TtpmodGrpcClient.java

```java
package net.obsrvr.ttpmodpoc.grpc;

import  io.grpc.ManagedChannel;
import  io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.obsrvr.ttpmodpoc.Ttpmodpoc;
import net.obsrvr.ttpmodpoc.event.TokenTransferEvent;
import net.obsrvr.ttpmodpoc.grpc.proto.GetEventsRequest;
import net.obsrvr.ttpmodpoc.grpc.proto.EventServiceGrpc;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;


public class TtpmodGrpcClient {

    private final ManagedChannel channel;
    private final EventServiceGrpc.EventServiceBlockingStub blockingStub;
    private final EventServiceGrpc.EventServiceStub asyncStub;

    // Streaming state
    private final AtomicBoolean isStreaming = new AtomicBoolean(false);
    private ExecutorService streamExecutor;
    private int startLedger;
    private int endLedger;

    // Default endpoint for the simple Go Server
    private static final String DEFAULT_ENDPOINT = "localhost:50051";

    // Event handler for token transfer events
    private Consumer<TokenTransferEvent> eventHandler;

    public TtpmodGrpcClient() {
        this(DEFAULT_ENDPOINT);
    }

    public TtpmodGrpcClient(String endpoint) {
        channel = ManagedChannelBuilder.forTarget(endpoint)
                .usePlaintext()
                .build();
        blockingStub = EventServiceGrpc.newBlockingStub(channel);
        asyncStub = EventServiceGrpc.newStub(channel);
        Ttpmodpoc.LOGGER.info("TTP GRPC Client initialized for target: {}", endpoint);
    }

    /**
     * Sets the event handler for token transfer events.
     *
     * @param eventHandler the event handler to call when events are received
     */
    public void setEventHandler(Consumer<TokenTransferEvent> eventHandler) {
        // Event handler for token transfer events
        this.eventHandler = eventHandler;
    }

    /**
     * Gets the starting ledger sequence number.
     *
     * @return the starting ledger sequence number
     */
    public int getStartLedger() {
        return startLedger;
    }

    /**
     * Gets the ending ledger sequence number.
     *
     * @return the ending ledger sequence number
     */
    public int getEndLedger() {
        return endLedger;
    }

    public void shutdown() throws InterruptedException {
        Ttpmodpoc.LOGGER.info("Shutting down TTP gRPC client channel...");
        stopStreaming();
        if (channel != null) {
            try {
                channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Ttpmodpoc.LOGGER.error("Interrupted while closing gRPC channel", e);
            }
        }
        Ttpmodpoc.LOGGER.info("TTP gRPC client channel shut down.");
    }

    /**
     * Checks if currently streaming TTP events.
     *
     * @return true if streaming, false otherwise
     */
    public boolean isStreaming() {
        return isStreaming.get();
    }

    /**
     * Starts streaming TTP events from the specified ledger range.
     *
     * @param startLedger the starting ledger sequence number
     * @param endLedger the ending ledger sequence number (0 for unbounded streaming)
     * @throws IllegalStateException if already streaming
     */
    public void startStreaming(int startLedger, int endLedger) {
        if (isStreaming.get()) {
            throw new IllegalStateException("Already streaming TTP events");
        }
        this.startLedger = startLedger;
        this.endLedger = endLedger;

        streamExecutor = Executors.newSingleThreadExecutor();
        isStreaming.set(true);

        streamExecutor.submit(() -> {
            try {
                Ttpmodpoc.LOGGER.info("Starting streaming TTP events");
                // Create the request
                GetEventsRequest request = GetEventsRequest.newBuilder()
                        .setStartLedger(startLedger)
                        .setEndLedger(endLedger)
                        .build();

                Ttpmodpoc.LOGGER.info("Starting to stream TTP events from ledger {} to {}",
                        startLedger, endLedger > 0 ? endLedger : "unbounded");

                // Use async API to stream events
                Ttpmodpoc.LOGGER.info("Starting async streaming for TTP events");

                // Create a response observer
                StreamObserver<net.obsrvr.ttpmodpoc.grpc.proto.TokenTransferEvent> responseObserver =
                        new StreamObserver<net.obsrvr.ttpmodpoc.grpc.proto.TokenTransferEvent>() {
                            @Override
                            public void onNext(net.obsrvr.ttpmodpoc.grpc.proto.TokenTransferEvent event) {
                                Ttpmodpoc.LOGGER.info("Received TTP event from gRPC: {}", event);

                                try {
                                    // Convert the event to our internal format
                                    TokenTransferEvent ttpEvent = convertEvent(event);

                                    if (ttpEvent != null) {
                                        Ttpmodpoc.LOGGER.info("Converted to internal event: {}", ttpEvent);

                                        // Notify the event handler if it exists
                                        if (eventHandler != null) {
                                            Ttpmodpoc.LOGGER.info("Notifying event handler");
                                            eventHandler.accept(ttpEvent);
                                        } else {
                                            Ttpmodpoc.LOGGER.error("Event handler is null!");
                                        }
                                    } else {
                                        Ttpmodpoc.LOGGER.error("Failed to convert event!");
                                    }
                                } catch (Exception e) {
                                    Ttpmodpoc.LOGGER.error("Error processing TTP event", e);
                                }
                            }

                            @Override
                            public void onError(Throwable t) {
                                Ttpmodpoc.LOGGER.error("Error in TTP event stream", t);
                                isStreaming.set(false);
                            }

                            @Override
                            public void onCompleted() {
                                Ttpmodpoc.LOGGER.info("TTP event stream completed");
                                isStreaming.set(false);
                            }
                        };

                // Start streaming using async API
                asyncStub.getTTPEvents(request, responseObserver);

                // Keep this thread alive while streaming
                while (isStreaming.get()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }

                Ttpmodpoc.LOGGER.info("Streaming thread exiting");

            } catch (Exception e) {
                Ttpmodpoc.LOGGER.error("Error while streaming TTP events", e);
            } finally {
                isStreaming.set(false);
            }
        });

    }

    /**
     * Converts a gRPC token transfer event to our internal format.
     *
     * @param event the gRPC token transfer event
     * @return the converted event or null if conversion failed
     */
    private TokenTransferEvent convertEvent(net.obsrvr.ttpmodpoc.grpc.proto.TokenTransferEvent event) {
        try {
            Ttpmodpoc.LOGGER.info("Converting event: {}", event.getEventCase());
            // Determine the event type
            TokenTransferEvent.Type type;
            switch (event.getEventCase()) {
                case TRANSFER:
                    type = TokenTransferEvent.Type.TRANSFER;
                    Ttpmodpoc.LOGGER.info("Detected TRANSFER event");
                    break;
                case MINT:
                    type = TokenTransferEvent.Type.MINT;
                    Ttpmodpoc.LOGGER.info("Detected MINT event");
                    break;
                case BURN:
                    type = TokenTransferEvent.Type.BURN;
                    Ttpmodpoc.LOGGER.info("Detected BURN event");
                    break;
                default:
                    type = TokenTransferEvent.Type.UNKNOWN;
                    Ttpmodpoc.LOGGER.info("Detected UNKNOWN event type: {}", event.getEventCase());
                    break;
            }

            // Extract common properties
            long ledgerSequence = event.getMeta().getLedgerSequence();
            long txIndex = event.getMeta().getTransactionIndex();
            long opIndex = event.getMeta().getOperationIndex();

            String assetCode = "";
            String assetIssuer = "";
            String fromAccount = "";
            String toAccount = "";
            long amount = 0;

            // Extract event-specific properties
            switch (event.getEventCase()) {
                case TRANSFER:
                    net.obsrvr.ttpmodpoc.grpc.proto.Transfer transfer = event.getTransfer();
                    if (transfer.hasAsset()) {
                        net.obsrvr.ttpmodpoc.grpc.proto.Asset asset = transfer.getAsset();
                        if (asset.hasIssuedAsset()) {
                            assetCode = asset.getIssuedAsset().getAssetCode();
                            assetIssuer = asset.getIssuedAsset().getIssuer();
                        }
                    }
                    fromAccount = transfer.getFrom();
                    toAccount = transfer.getTo();
                    try {
                        amount = Long.parseLong(transfer.getAmount());
                    } catch (NumberFormatException e) {
                        Ttpmodpoc.LOGGER.error("Error parsing amount: {}", transfer.getAmount());
                    }
                    break;
                case MINT:
                    net.obsrvr.ttpmodpoc.grpc.proto.Mint mint = event.getMint();
                    if (mint.hasAsset()) {
                        net.obsrvr.ttpmodpoc.grpc.proto.Asset asset = mint.getAsset();
                        if (asset.hasIssuedAsset()) {
                            assetCode = asset.getIssuedAsset().getAssetCode();
                            assetIssuer = asset.getIssuedAsset().getIssuer();
                        }
                    }
                    fromAccount = ""; // Mint doesn't have admin field in the same way
                    toAccount = mint.getTo();
                    try {
                        amount = Long.parseLong(mint.getAmount());
                    } catch (NumberFormatException e) {
                        Ttpmodpoc.LOGGER.error("Error parsing amount: {}", mint.getAmount());
                    }
                    break;
                case BURN:
                    net.obsrvr.ttpmodpoc.grpc.proto.Burn burn = event.getBurn();
                    if (burn.hasAsset()) {
                        net.obsrvr.ttpmodpoc.grpc.proto.Asset asset = burn.getAsset();
                        if (asset.hasIssuedAsset()) {
                            assetCode = asset.getIssuedAsset().getAssetCode();
                            assetIssuer = asset.getIssuedAsset().getIssuer();
                        }
                    }
                    fromAccount = burn.getFrom();
                    toAccount = ""; // Burn doesn't have admin field in the same way
                    try {
                        amount = Long.parseLong(burn.getAmount());
                    } catch (NumberFormatException e) {
                        Ttpmodpoc.LOGGER.error("Error parsing amount: {}", burn.getAmount());
                    }
                    break;
            }

            // Create and return our internal event
            return new TokenTransferEvent(
                    type,
                    assetCode,
                    assetIssuer,
                    fromAccount,
                    toAccount,
                    amount,
                    ledgerSequence,
                    txIndex,
                    opIndex
            );
        } catch (Exception e) {
            Ttpmodpoc.LOGGER.error("Error converting gRPC event to TokenTransferEvent", e);
            return null;
        }
    }

    /**
     * Stops the current streaming operation.
     */
    public void stopStreaming() {
        if (!isStreaming.get()) {
            return;  // Not streaming
        }
        Ttpmodpoc.LOGGER.info("Stopping streaming TTP events");
        isStreaming.set(false);
        if (streamExecutor != null) {
            streamExecutor.shutdownNow();
            try {
                // Wait for the streaming thread to terminate
                if (!streamExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                    Ttpmodpoc.LOGGER.warn("TTP event stream did not terminate in time");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Ttpmodpoc.LOGGER.error("Interrupted while waiting for TTP event stream to stop", e);
            }

            streamExecutor = null;
        }
    }
}

```

# src/main/java/net/obsrvr/ttpmodpoc/mixin/ExampleMixin.java

```java
package net.obsrvr.ttpmodpoc.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadWorld()V
	}
}
```

# src/main/java/net/obsrvr/ttpmodpoc/render/EventRenderer.java

```java
package net.obsrvr.ttpmodpoc.render;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.particle.ParticleTypes; // Import particle types
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.obsrvr.ttpmodpoc.Ttpmodpoc;
import net.obsrvr.ttpmodpoc.event.TokenTransferEvent;
import org.joml.Matrix4f;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class EventRenderer {
    private final MinecraftClient client;
    // Use a thread-safe queue for adding effects from other threads
    private final Queue<VisualEffect> effectsToAdd = new ConcurrentLinkedQueue<>();
    private final List<VisualEffect> activeEffects = new ArrayList<>();
    private final Random random = new Random();
    private static final int MAX_EFFECTS = 50;
    private static final int RENDER_RADIUS_SQUARED = 40 * 40; // Only render effects within 40 blocks

    public EventRenderer(MinecraftClient client) {
        this.client = client;
        // No render hook registration here anymore
    }

    public void addEvent(TokenTransferEvent event) {
        Ttpmodpoc.LOGGER.info("Queueing visual effect for event: {}", event);

        // We don't need the client.execute here anymore because we add to a thread-safe queue
        // which is processed during the tick() method on the client thread.

        if (client.player == null) {
            Ttpmodpoc.LOGGER.warn("Cannot add event - player is null! Queueing anyway.");
            // Still queue it, maybe the player appears before the next tick
        }

        // Calculate position later in tick() relative to the player at that moment
        VisualEffect effect;
        switch (event.getType()) {
            case TRANSFER -> effect = new TransferBeamEffect(event, 0x00AAFF, 60 + (int)(Math.log10(event.getAmount() + 1) * 10)); // Blue, longer duration for larger amounts
            case MINT -> effect = new MintParticleEffect(event, 0x00FF00, 50 + (int)(Math.log10(event.getAmount() + 1) * 10)); // Green
            case BURN -> effect = new BurnExplosionEffect(event, 0xFF4400, 40 + (int)(Math.log10(event.getAmount() + 1) * 5)); // Orange/Red
            default -> effect = new MintParticleEffect(event, 0xFFFFFF, 40); // White for unknown
        }

        effectsToAdd.offer(effect); // Add to the thread-safe queue
    }

    public void tick() {
        // Process the queue of effects to add
        VisualEffect effectToAdd;
        while ((effectToAdd = effectsToAdd.poll()) != null) {
            if (client.player != null && activeEffects.size() < MAX_EFFECTS) {
                // Calculate position relative to player *now*
                BlockPos playerPos = client.player.getBlockPos();
                int offsetX = random.nextInt(41) - 20; // +/- 20 blocks
                int offsetY = random.nextInt(11) + 2;  // 2 to 12 blocks above/below player feet
                int offsetZ = random.nextInt(41) - 20; // +/- 20 blocks
                effectToAdd.setPosition(playerPos.add(offsetX, offsetY, offsetZ));
                activeEffects.add(effectToAdd);
                Ttpmodpoc.LOGGER.info("Activated visual effect for event: {}", effectToAdd.event);
            } else if (activeEffects.size() >= MAX_EFFECTS) {
                Ttpmodpoc.LOGGER.info("Effect queue full ({}/{}), discarding new effect for event: {}", activeEffects.size(), MAX_EFFECTS, effectToAdd.event);
            } else {
                // Player might not be ready yet, re-queue for next tick? Or discard. Discarding for now.
                Ttpmodpoc.LOGGER.warn("Player not available during tick, discarding queued effect for event: {}", effectToAdd.event);
            }
        }

        // Tick and remove finished effects
        activeEffects.removeIf(VisualEffect::isFinished);
        activeEffects.forEach(VisualEffect::tick);
    }

    // This is now called from the client's render hook
    public void renderWorld(MatrixStack matrices, Camera camera, float tickDelta, VertexConsumerProvider vertexConsumers) {
        if (activeEffects.isEmpty()) return;

        Vec3d cameraPos = camera.getPos();

        // Basic render setup for translucency
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.depthMask(false); // Allow transparency to draw correctly

        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder buffer = tessellator.getBuffer();

        for (VisualEffect effect : activeEffects) {
            // Cull effects that are too far away
            if (effect.position == null || effect.position.squaredDistanceTo(cameraPos) > RENDER_RADIUS_SQUARED) {
                continue;
            }

            matrices.push();
            // Translate matrices to the effect's position relative to the camera
            matrices.translate(effect.position.x - cameraPos.x,
                    effect.position.y - cameraPos.y,
                    effect.position.z - cameraPos.z);

            // Render the specific effect type
            effect.render(matrices, vertexConsumers, client.textRenderer, camera, tickDelta);

            matrices.pop();
        }

        // Restore render state
        RenderSystem.depthMask(true);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    // --- Visual Effect Base Class ---
    private abstract static class VisualEffect {
        protected final TokenTransferEvent event; // Store the original event
        protected Vec3d position; // Position is now set during tick()
        protected final int color;
        protected int lifetime;
        protected final int maxLifetime;
        protected float alpha = 1.0f;

        protected VisualEffect(TokenTransferEvent event, int color, int maxLifetime) {
            this.event = event;
            // Position is initially null, set in EventRenderer.tick()
            this.position = null;
            this.color = color;
            this.lifetime = 0;
            // Add some randomness to max lifetime
            this.maxLifetime = maxLifetime + Ttpmodpoc.RANDOM.nextInt(maxLifetime / 4 + 1) - (maxLifetime / 8);
        }

        // Allow setting position after creation
        public void setPosition(BlockPos blockPos) {
            this.position = new Vec3d(blockPos.getX() + 0.5, blockPos.getY() + 0.5, blockPos.getZ() + 0.5);
        }

        public void tick() {
            lifetime++;
            // Fade out effect in the last third of its life
            if (lifetime > maxLifetime * 2 / 3) {
                alpha = 1.0f - (float) (lifetime - maxLifetime * 2 / 3) / (maxLifetime / 3f);
            } else {
                alpha = 1.0f;
            }
        }

        public boolean isFinished() {
            return lifetime >= maxLifetime;
        }

        protected float[] getRGBComponents() {
            float r = ((color >> 16) & 0xFF) / 255f;
            float g = ((color >> 8) & 0xFF) / 255f;
            float b = (color & 0xFF) / 255f;
            return new float[]{r, g, b};
        }

        // Abstract render method now takes more context
        public abstract void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, TextRenderer textRenderer, Camera camera, float tickDelta);

        // Helper to render floating text
        protected void renderText(MatrixStack matrices, TextRenderer textRenderer, Camera camera, String text, float yOffset, int textColor) {
            matrices.push();
            // Make text face the camera
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
            matrices.scale(-0.025f, -0.025f, 0.025f); // Scale for text size

            Matrix4f matrix4f = matrices.peek().getPositionMatrix();

            float textWidth = textRenderer.getWidth(text);
            // Center the text horizontally, position it vertically with the offset
            textRenderer.draw(text, -textWidth / 2, yOffset * -40, textColor, false, matrix4f, MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers(), TextRenderer.TextLayerType.SEE_THROUGH, 0x000000, LightmapTextureManager.MAX_LIGHT_COORDINATE);
            // Draw with background
            // textRenderer.drawWithBackground(text, -textWidth / 2, yOffset * -40, textColor, false, matrix4f, MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers(), TextRenderer.TextLayerType.SEE_THROUGH, 0x90000000, LightmapTextureManager.MAX_LIGHT_COORDINATE);


            matrices.pop();
        }
    }

    // --- Specific Effect Implementations ---

    private static class MintParticleEffect extends VisualEffect {
        private final List<ParticleData> particles = new ArrayList<>();
        private final int particleCount;

        public MintParticleEffect(TokenTransferEvent event, int color, int maxLifetime) {
            super(event, color, maxLifetime);
            // More particles for larger amounts, capped
            this.particleCount = Math.min(100, 5 + (int)(Math.log10(event.getAmount() + 1) * 15));
        }

        @Override
        public void tick() {
            super.tick();
            // Spawn particles gradually
            if (lifetime < maxLifetime / 2 && particles.size() < particleCount) {
                for (int i = 0; i < 3; i++) { // Spawn a few per tick
                    if (particles.size() < particleCount) {
                        float vx = (random.nextFloat() - 0.5f) * 0.1f;
                        float vy = random.nextFloat() * 0.15f + 0.05f; // Mostly upward
                        float vz = (random.nextFloat() - 0.5f) * 0.1f;
                        float scale = random.nextFloat() * 0.1f + 0.05f;
                        int particleLifetime = maxLifetime - lifetime + random.nextInt(20) - 10; // Vary lifetime
                        particles.add(new ParticleData(new Vec3d(0, 0, 0), new Vec3d(vx, vy, vz), scale, particleLifetime));
                    }
                }
            }

            // Update existing particles
            Iterator<ParticleData> iterator = particles.iterator();
            while(iterator.hasNext()) {
                ParticleData p = iterator.next();
                p.tick();
                if (p.isDead()) {
                    iterator.remove();
                }
            }
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, TextRenderer textRenderer, Camera camera, float tickDelta) {
            if (position == null) return; // Don't render if position not set yet

            float[] rgb = getRGBComponents();

            VertexConsumer buffer = vertexConsumers.getBuffer(RenderLayer.getLightning()); // Use lightning for glow? Or particles layer

            // Render particles as quads facing the camera
            for (ParticleData p : particles) {
                Vec3d currentPos = p.position.add(p.velocity.multiply(tickDelta)); // Interpolate position

                matrices.push();
                matrices.translate(currentPos.x, currentPos.y, currentPos.z);
                // Billboarding
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));

                Matrix4f matrix = matrices.peek().getPositionMatrix();
                float scale = p.scale * p.getAlpha(); // Scale fades with alpha

                buffer.vertex(matrix, -scale, -scale, 0).color(rgb[0], rgb[1], rgb[2], p.getAlpha() * this.alpha).next();
                buffer.vertex(matrix, -scale,  scale, 0).color(rgb[0], rgb[1], rgb[2], p.getAlpha() * this.alpha).next();
                buffer.vertex(matrix,  scale,  scale, 0).color(rgb[0], rgb[1], rgb[2], p.getAlpha() * this.alpha).next();
                buffer.vertex(matrix,  scale, -scale, 0).color(rgb[0], rgb[1], rgb[2], p.getAlpha() * this.alpha).next();

                matrices.pop();
            }

            // Render floating text
            String amountText = "+" + event.getAmount() / 10000000.0; // Assuming 7 decimal places for Stellar
            String assetText = event.getAssetCode().isEmpty() ? "XLM" : event.getAssetCode();
            renderText(matrices, textRenderer, camera, amountText + " " + assetText, 1.0f, 0xFFFFFF); // White text
            renderText(matrices, textRenderer, camera, "Minted to: " + event.getToAccount().substring(0, 6) + "...", 0.5f, 0xAAAAAA); // Gray text
        }

        private static class ParticleData {
            Vec3d position;
            Vec3d velocity;
            float scale;
            int age = 0;
            final int maxAge;

            ParticleData(Vec3d pos, Vec3d vel, float scale, int maxAge) {
                this.position = pos;
                this.velocity = vel;
                this.scale = scale;
                this.maxAge = Math.max(1, maxAge); // Ensure maxAge is at least 1
            }

            void tick() {
                age++;
                position = position.add(velocity);
                // Apply pseudo-gravity/drag
                velocity = velocity.multiply(0.98).add(0, -0.005, 0);
            }

            boolean isDead() {
                return age >= maxAge;
            }

            float getAlpha() {
                return Math.max(0f, 1.0f - (float) age / maxAge);
            }
        }
    }


    private static class TransferBeamEffect extends VisualEffect {
        private final float beamHeight = 10.0f; // How high the beam goes

        public TransferBeamEffect(TokenTransferEvent event, int color, int maxLifetime) {
            super(event, color, maxLifetime);
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, TextRenderer textRenderer, Camera camera, float tickDelta) {
            if (position == null) return;

            float[] rgb = getRGBComponents();
            float currentAlpha = this.alpha * (float) Math.sin(Math.PI * (float) lifetime / maxLifetime); // Pulse alpha

            VertexConsumer buffer = vertexConsumers.getBuffer(RenderLayer.getLightning()); // Use lightning effect layer

            matrices.push();
            // Rotate slightly for visual interest
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((lifetime + tickDelta) * 2));

            Matrix4f matrix = matrices.peek().getPositionMatrix();

            float radius = 0.1f + 0.15f * (1 - alpha); // Beam shrinks slightly as it fades

            // Draw a simple quad beam from below to above the position
            // Side 1
            buffer.vertex(matrix, -radius, -beamHeight / 2, 0).color(rgb[0], rgb[1], rgb[2], 0).next(); // Bottom vertex, transparent
            buffer.vertex(matrix, radius, -beamHeight / 2, 0).color(rgb[0], rgb[1], rgb[2], 0).next();
            buffer.vertex(matrix, radius, beamHeight / 2, 0).color(rgb[0], rgb[1], rgb[2], currentAlpha).next(); // Top vertex, opaque
            buffer.vertex(matrix, -radius, beamHeight / 2, 0).color(rgb[0], rgb[1], rgb[2], currentAlpha).next();

            // Side 2 (rotated 90 degrees)
            buffer.vertex(matrix, 0, -beamHeight / 2, -radius).color(rgb[0], rgb[1], rgb[2], 0).next();
            buffer.vertex(matrix, 0, -beamHeight / 2, radius).color(rgb[0], rgb[1], rgb[2], 0).next();
            buffer.vertex(matrix, 0, beamHeight / 2, radius).color(rgb[0], rgb[1], rgb[2], currentAlpha).next();
            buffer.vertex(matrix, 0, beamHeight / 2, -radius).color(rgb[0], rgb[1], rgb[2], currentAlpha).next();


            matrices.pop();

            // Render floating text
            String amountText = "" + event.getAmount() / 10000000.0; // Assuming 7 decimal places
            String assetText = event.getAssetCode().isEmpty() ? "XLM" : event.getAssetCode();
            String fromText = event.getFromAccount().isEmpty() ? "Source?" : event.getFromAccount().substring(0, 6) + "...";
            String toText = event.getToAccount().isEmpty() ? "Dest?" : event.getToAccount().substring(0, 6) + "...";
            renderText(matrices, textRenderer, camera, amountText + " " + assetText, 1.0f, 0xFFFFFF);
            renderText(matrices, textRenderer, camera, fromText + " -> " + toText, 0.5f, 0xAAAAAA);
        }
    }


    private static class BurnExplosionEffect extends VisualEffect {
        private boolean particlesSpawned = false;
        private final int particleCount;

        public BurnExplosionEffect(TokenTransferEvent event, int color, int maxLifetime) {
            super(event, color, maxLifetime);
            // More particles for larger amounts, capped
            this.particleCount = Math.min(150, 10 + (int)(Math.log10(event.getAmount() + 1) * 25));
        }

        @Override
        public void tick() {
            super.tick();
            // Spawn particles only once, near the beginning
            if (!particlesSpawned && lifetime > 2 && client.world != null && position != null) {
                float[] rgb = getRGBComponents();
                for (int i = 0; i < particleCount; i++) {
                    // Use Minecraft's particle system for simplicity
                    double speed = 0.2 + random.nextDouble() * 0.4;
                    double dx = (random.nextDouble() - 0.5) * speed;
                    double dy = (random.nextDouble() - 0.5) * speed;
                    double dz = (random.nextDouble() - 0.5) * speed;
                    // Add flame or smoke particles
                    client.world.addParticle(ParticleTypes.LAVA, position.x, position.y, position.z, dx, dy, dz);
                    if (random.nextBoolean()) {
                        client.world.addParticle(ParticleTypes.SMOKE, position.x, position.y, position.z, dx * 0.5, dy * 0.5, dz * 0.5);
                    }
                }
                // Play explosion sound
                // client.world.playSound(position.x, position.y, position.z, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.NEUTRAL, 0.5f, 1.0f + (random.nextFloat() - 0.5f) * 0.4f, false);

                particlesSpawned = true;
            }
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, TextRenderer textRenderer, Camera camera, float tickDelta) {
            if (position == null) return;

            // Render floating text - make it fade quickly
            if (alpha > 0.1f) { // Only render text when not fully faded
                String amountText = "-" + event.getAmount() / 10000000.0; // Assuming 7 decimal places
                String assetText = event.getAssetCode().isEmpty() ? "XLM" : event.getAssetCode();
                int currentTextColor = ((int)(alpha * 255) << 24) | 0xFFFFFF; // Fade text alpha
                renderText(matrices, textRenderer, camera, amountText + " " + assetText, 1.0f, currentTextColor);
                renderText(matrices, textRenderer, camera, "Burned from: " + event.getFromAccount().substring(0, 6) + "...", 0.5f, ((int)(alpha * 170) << 24) | 0xAAAAAA);
            }
        }
    }
}
```

# src/main/java/net/obsrvr/ttpmodpoc/Ttpmodpoc.java

```java
package net.obsrvr.ttpmodpoc;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.api.ModInitializer;
import static net.minecraft.server.command.CommandManager.*;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer; // Import MinecraftServer
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.obsrvr.ttpmodpoc.event.TokenTransferEvent;
import net.obsrvr.ttpmodpoc.grpc.SimpleGrpcClient;
import net.obsrvr.ttpmodpoc.grpc.TtpmodGrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.Random; // Import Random

public class Ttpmodpoc implements ModInitializer {
	public static final String MOD_ID = "ttpmodpoc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Random RANDOM = new Random(); // Add this line

	private SimpleGrpcClient grpcClient; // Instance of our simple client
	private TtpmodGrpcClient ttpGrpcClient;

	// Event listeners for token transfer events - static and thread-safe
	private static final List<Consumer<TokenTransferEvent>> eventListeners = new CopyOnWriteArrayList<>();
	private static MinecraftServer serverInstance = null; // To execute tasks on the main thread

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Stellar TTP Mod");

		// Register server lifecycle events to manage clients and server instance
		ServerLifecycleEvents.SERVER_STARTING.register(server -> {
			serverInstance = server; // Store server instance
			LOGGER.info("Server starting - Initializing gRPC Clients...");
			try {
				grpcClient = new SimpleGrpcClient("localhost:50051");
				LOGGER.info("Simple gRPC Client initialized successfully.");
			} catch (Exception e) {
				LOGGER.error("Failed to initialize Simple gRPC client", e);
				grpcClient = null;
			}
			try {
				ttpGrpcClient = new TtpmodGrpcClient("localhost:50054"); // Assuming different port for TTP
				// Handle token transfer events - Moved setup here to ensure ttpGrpcClient is initialized
				ttpGrpcClient.setEventHandler(this::onTokenTransferEvent);
				LOGGER.info("TTP gRPC Client initialized successfully.");
			} catch (Exception e) {
				LOGGER.error("Failed to initialize TTP gRPC client", e);
				ttpGrpcClient = null;
			}
		});

		ServerLifecycleEvents.SERVER_STOPPING.register(server -> {
			LOGGER.info("Server stopping - Shutting down gRPC Clients...");
			if (grpcClient != null) {
				try {
					grpcClient.shutdown();
				} catch (InterruptedException e) {
					LOGGER.error("Interrupted while shutting down Simple gRPC client", e);
					Thread.currentThread().interrupt();
				}
			}
			if (ttpGrpcClient != null) {
				try {
					ttpGrpcClient.shutdown();
				} catch (InterruptedException e) {
					LOGGER.error("Interrupted while shutting down TTP gRPC client", e);
					Thread.currentThread().interrupt();
				}
			}
			LOGGER.info("gRPC Clients shut down.");
			serverInstance = null; // Clear server instance
		});

		// Register commands
		registerCommands();

		LOGGER.info("Stellar TTP Mod Initialized");
	}

	// Method to handle incoming TTP events from the gRPC client
	private void onTokenTransferEvent(TokenTransferEvent event) {
		LOGGER.info("Received TTP event from gRPC stream: {}", event);
		// Dispatch the event to all registered listeners on the server thread
		if (serverInstance != null) {
			serverInstance.execute(() -> {
				for (Consumer<TokenTransferEvent> listener : eventListeners) {
					try {
						listener.accept(event);
					} catch (Exception e) {
						LOGGER.error("Error in TTP event listener", e);
					}
				}
			});
		} else {
			LOGGER.warn("Received TTP event but server instance is null, cannot dispatch.");
		}
	}

	// Static method for clients (or other parts) to register listeners
	public static void registerEventListener(Consumer<TokenTransferEvent> listener) {
		eventListeners.add(listener);
		LOGGER.info("Registered new TTP event listener.");
	}

	private void registerCommands() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			// Simple Greeter Test Command
			dispatcher.register(literal("grpc_test")
					.then(argument("name", StringArgumentType.greedyString())
							.executes(context -> {
								if (grpcClient == null) {
									context.getSource().sendError(Text.literal("Simple gRPC client not initialized."));
									return 0;
								}
								String name = StringArgumentType.getString(context, "name");
								ServerCommandSource source = context.getSource();
								source.sendFeedback(() -> Text.literal("Sending greeting request for: " + name), false);

								CompletableFuture.supplyAsync(() -> grpcClient.greet(name))
										.thenAcceptAsync(response -> {
											source.sendFeedback(() -> Text.literal("gRPC Server Response: " + response), false);
										}, source.getServer());

								return 1;
							}))
					.executes(context -> {
						context.getSource().sendError(Text.literal("Usage: /grpc_test <name>"));
						return 0;
					})
			);

			// TTP Streaming Command
			dispatcher.register(literal("ttp")
					.then(literal("start")
							.then(argument("startLedger", IntegerArgumentType.integer(1))
									.then(argument("endLedger", IntegerArgumentType.integer(0)) // 0 for live
											.executes(context -> {
												if (ttpGrpcClient == null) {
													context.getSource().sendError(Text.literal("TTP gRPC client not initialized."));
													return 0;
												}
												if (ttpGrpcClient.isStreaming()) {
													context.getSource().sendError(Text.literal("Already streaming TTP events. Use /ttp stop first."));
													return 0;
												}
												int startLedger = IntegerArgumentType.getInteger(context, "startLedger");
												int endLedger = IntegerArgumentType.getInteger(context, "endLedger");
												try {
													ttpGrpcClient.startStreaming(startLedger, endLedger);
													context.getSource().sendFeedback(() ->
															Text.literal("Starting TTP Event Stream from ledger " +
																	startLedger + " to " + (endLedger <= 0 ? "live" : endLedger)), false);
													return 1;
												} catch (Exception e) {
													LOGGER.error("Failed to start TTP stream", e);
													context.getSource().sendError(Text.literal("Failed to start TTP stream: " + e.getMessage()));
													return 0;
												}
											})
									)
									// Simplified version: /ttp start <startLedger> (implies live streaming)
									.executes(context -> {
										if (ttpGrpcClient == null) {
											context.getSource().sendError(Text.literal("TTP gRPC client not initialized."));
											return 0;
										}
										if (ttpGrpcClient.isStreaming()) {
											context.getSource().sendError(Text.literal("Already streaming TTP events. Use /ttp stop first."));
											return 0;
										}
										int startLedger = IntegerArgumentType.getInteger(context, "startLedger");
										try {
											ttpGrpcClient.startStreaming(startLedger, 0); // 0 for live
											context.getSource().sendFeedback(() ->
													Text.literal("Starting live TTP Event Stream from ledger " + startLedger), false);
											return 1;
										} catch (Exception e) {
											LOGGER.error("Failed to start TTP stream", e);
											context.getSource().sendError(Text.literal("Failed to start TTP stream: " + e.getMessage()));
											return 0;
										}
									})
							)
							// Even simpler: /ttp start (starts live from ledger 1, maybe not ideal)
							.executes(context -> {
								if (ttpGrpcClient == null) {
									context.getSource().sendError(Text.literal("TTP gRPC client not initialized."));
									return 0;
								}
								if (ttpGrpcClient.isStreaming()) {
									context.getSource().sendError(Text.literal("Already streaming TTP events. Use /ttp stop first."));
									return 0;
								}
								try {
									ttpGrpcClient.startStreaming(1, 0); // Start live from ledger 1
									context.getSource().sendFeedback(() ->
											Text.literal("Starting live TTP Event Stream from ledger 1"), false);
									return 1;
								} catch (Exception e) {
									LOGGER.error("Failed to start TTP stream", e);
									context.getSource().sendError(Text.literal("Failed to start TTP stream: " + e.getMessage()));
									return 0;
								}
							})
					)
					.then(literal("stop")
							.executes(context -> {
								if (ttpGrpcClient == null) {
									context.getSource().sendError(Text.literal("TTP gRPC client not initialized."));
									return 0;
								}
								if (!ttpGrpcClient.isStreaming()) {
									context.getSource().sendFeedback(() -> Text.literal("TTP Event Stream is not running."), false);
									return 1;
								}
								try {
									ttpGrpcClient.stopStreaming();
									context.getSource().sendFeedback(() -> Text.literal("Stopped TTP Event Stream."), false);
									return 1;
								} catch (Exception e) {
									LOGGER.error("Failed to stop TTP stream", e);
									context.getSource().sendError(Text.literal("Failed to stop TTP stream: " + e.getMessage()));
									return 0;
								}
							})
					)
					.then(literal("status")
							.executes(context -> {
								if (ttpGrpcClient == null) {
									context.getSource().sendFeedback(() -> Text.literal("TTP gRPC client not initialized."), false);
									return 1;
								}
								boolean streaming = ttpGrpcClient.isStreaming();
								String status = streaming ? "Running" : "Stopped";
								String range = streaming ? " (from " + ttpGrpcClient.getStartLedger() + " to " +
										(ttpGrpcClient.getEndLedger() <= 0 ? "live" : ttpGrpcClient.getEndLedger()) + ")" : "";
								context.getSource().sendFeedback(() -> Text.literal("TTP Event Stream Status: " + status + range), false);
								return 1;
							})
					)
			);
		});
	}
}
```

# src/main/java/net/obsrvr/ttpmodpoc/TtpmodpocClient.java

```java
package net.obsrvr.ttpmodpoc;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext; // Correct import
import net.minecraft.client.MinecraftClient;
import net.obsrvr.ttpmodpoc.render.EventRenderer;
import net.obsrvr.ttpmodpoc.event.TokenTransferEvent;

public class TtpmodpocClient implements ClientModInitializer {

    private EventRenderer eventRenderer;
    private final MinecraftClient client = MinecraftClient.getInstance(); // Cache client instance

    @Override
    public void onInitializeClient() {
        Ttpmodpoc.LOGGER.info("Initializing Stellar TTP Mod Client");
        eventRenderer = new EventRenderer(client); // Pass client to renderer
        registerRenderHooks();
        registerTickEvents();
        // Register to receive events from the main mod logic
        Ttpmodpoc.registerEventListener(this::onTokenTransferEvent);
        Ttpmodpoc.LOGGER.info("Registered client to receive TTP events");
    }

    private void registerRenderHooks() {
        // Correctly register the AFTER_TRANSLUCENT event
        WorldRenderEvents.AFTER_TRANSLUCENT.register((WorldRenderContext context) -> {
            if (client.world != null && eventRenderer != null) {
                // Call the renderer's dedicated world rendering method
                eventRenderer.renderWorld(
                        context.matrixStack(),
                        context.camera(),
                        context.tickCounter().getDynamicDeltaTicks(), // Use getTickDelta() for smoother interpolation
                        context.consumers() // Pass the VertexConsumerProvider
                );
            }
        });
    }

    private void registerTickEvents() {
        ClientTickEvents.END_CLIENT_TICK.register(clientInstance -> { // Use the provided client instance
            if (clientInstance.world != null && clientInstance.player != null && eventRenderer != null) {
                eventRenderer.tick();
            }
        });
    }

    // This method is called when an event is received via the listener registered in Ttpmodpoc
    public void onTokenTransferEvent(TokenTransferEvent event) {
        Ttpmodpoc.LOGGER.info("Client received TTP event: {}", event);
        if (eventRenderer != null) {
            // The renderer now handles adding the event safely to its internal list
            eventRenderer.addEvent(event);
            Ttpmodpoc.LOGGER.info("Passed event to renderer");
        } else {
            Ttpmodpoc.LOGGER.error("Event renderer is null when receiving event!");
        }
    }
}
```

# src/main/java/net/obsrvr/ttpmodpoc/TtpmodpocDataGenerator.java

```java
package net.obsrvr.ttpmodpoc;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TtpmodpocDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

	}
}

```

# src/main/proto/event_service/event_service.proto

```proto
syntax = "proto3";

package token_transfer_service;

// Import the definition of the event we will stream
// Path is relative to the --proto_path specified in protoc command (./protos)
import "ingest/processors/token_transfer/token_transfer_event.proto";
// Option for Java code generation
option java_package = "net.obsrvr.ttpmodpoc.grpc.proto"; // Match your mod's package structure
option java_multiple_files = true;
// Define the Go package path where generated code will live
// This should match the module path + /gen/event_service
option go_package = "ttp-processor/gen/event_service";

// The service providing token transfer events
service EventService {
    // GetTTPEvents requests a stream of token transfer events for a given ledger range.
    // If end_ledger is 0 or less than start_ledger, the stream is potentially infinite (live).
    rpc GetTTPEvents(GetEventsRequest) returns (stream token_transfer.TokenTransferEvent) {}
}

// Request message for GetTTPEvents
message GetEventsRequest {
    uint32 start_ledger = 1; // The first ledger sequence number to include
    uint32 end_ledger = 2;   // The last ledger sequence number to include (inclusive). If 0 or < start_ledger, indicates a live stream.
}
```

# src/main/proto/greeter/greeter.proto

```proto
syntax = "proto3";

package greeter;

// Option for Java code generation
option java_package = "net.obsrvr.ttpmodpoc.grpc.proto"; // Match your mod's package structure
option java_multiple_files = true;

// Option for Go code generation (will be used in the server)
option go_package = "github.com/withObsrvr/hello-grpc-server/gen/go/greeter"; // Adjust if needed

// The greeting service definition.
service Greeter {
  // Sends a greeting
  rpc SayHello (HelloRequest) returns (HelloReply) {}
}

// The request message containing the user's name.
message HelloRequest {
  string name = 1;
}

// The response message containing the greetings
message HelloReply {
  string message = 1;
}
```

# src/main/proto/ingest/asset/asset.proto

```proto
// Copied from stellar/go/protos/ingest/asset/asset.proto
// Needed as a dependency for token_transfer_event.proto

syntax = "proto3";

package asset;

option go_package = "github.com/stellar/go/ingest/asset";

// Option for Java code generation
option java_package = "net.obsrvr.ttpmodpoc.grpc.proto"; // Match your mod's package structure
option java_multiple_files = true;


message IssuedAsset {
  string asset_code = 1;               // Asset code (e.g., USD, BTC)
  string issuer = 2;                  // Issuer account address
}

// Asset message that can represent either a native asset or an issued asset
message Asset {
  oneof asset_type {
    bool native = 1;                  // Native asset (XLM)
    IssuedAsset issued_asset = 2;      // Issued asset - via classic operations.
  }
}
```

# src/main/proto/ingest/processors/token_transfer/token_transfer_event.proto

```proto
// Copied from stellar/go/protos/ingest/processors/token_transfer/token_transfer_event.proto
// Defines the event message this processor will PRODUCE.

syntax = "proto3";

package token_transfer;

import "google/protobuf/timestamp.proto";

// Import are relative to the top level directory -  `/protos`
import "ingest/asset/asset.proto";

option go_package = "github.com/stellar/go/ingest/processors/token_transfer";
// Option for Java code generation
option java_package = "net.obsrvr.ttpmodpoc.grpc.proto"; // Match your mod's package structure
option java_multiple_files = true;


// EventMeta message
message EventMeta {
  uint32 ledger_sequence = 1;
  google.protobuf.Timestamp closed_at = 2;
  string tx_hash = 3;
  // Index of transaction within this ledger. This is 1-indexed as per SEP-35
  uint32 transaction_index = 4;
  // Index of operation within the transaction, if it is not a fee event. This is 1-indexed as per SEP-35
  optional uint32 operation_index = 5;
  /* For a classic operation, this contract_address is the ContractID as derived from asset
     For a smart contract event, this contractId is the id of the contract emiting the core event
   */
  string contract_address = 6;
}

// The `from` and `to` fields in each of these events is the strkey representations of the different address types

message Transfer {
  string from = 1;
  string to = 2;
  asset.Asset asset = 3; // Asset can be native or issued. For custom tokens, it will be absent
  string amount = 4;
}

message Mint {
  string to = 1;
  asset.Asset asset = 2; // Asset can be native or issued. For custom tokens, it will be absent
  string amount = 3;
}

message Burn {
  string from = 1;
  asset.Asset asset = 2; // Asset can be native or issued. For custom tokens, it will be absent
  string amount = 3;
}

message Clawback {
  string from = 1;
  asset.Asset asset = 2; // Asset can be native or issued. For custom tokens, it will be absent
  string amount = 3;
}

message Fee {
  string from = 1;
  asset.Asset asset = 2; // Asset can be native or issued. For custom tokens, it will be absent
  string amount = 3;
}

message TokenTransferEvent {
  EventMeta meta = 1;
  oneof event {
    Transfer transfer = 2;
    Mint mint = 3;
    Burn burn = 4;
    Clawback clawback = 5;
    Fee fee = 6;
  }
}
```

# src/main/resources/assets/ttpmodpoc/icon.png

This is a binary file of the type: Image

# src/main/resources/fabric.mod.json

```json
{
	"schemaVersion": 1,
	"id": "ttpmodpoc",
	"version": "${version}",
	"name": "ttpmodpoc",
	"description": "PoC mod to test out the TTP demo",
	"authors": [
		"tillmanmosley"
	],
	"contact": {
		"homepage": "https://withobsrvr.com/",
		"sources": "https://github.com/withObsrvr/ttpmodpoc"
	},
	"license": "CC0-1.0",
	"icon": "assets/ttpmodpoc/icon.png",
	"environment": "*",
	"entrypoints": {
		"main": [
			"net.obsrvr.ttpmodpoc.Ttpmodpoc"
		],
		"fabric-datagen": [
			"net.obsrvr.ttpmodpoc.TtpmodpocDataGenerator"
		],
		"client": [
			"net.obsrvr.ttpmodpoc.TtpmodpocClient"
		]
	},
	"mixins": [
		"ttpmodpoc.mixins.json"
	],
	"depends": {
		"fabricloader": ">=0.16.11",
		"minecraft": "~1.21.5",
		"java": ">=21",
		"fabric-api": "*"
	},
	"suggests": {
		"another-mod": "*"
	}
}
```

# src/main/resources/ttpmodpoc.mixins.json

```json
{
	"required": true,
	"package": "net.obsrvr.ttpmodpoc.mixin",
	"compatibilityLevel": "JAVA_21",
	"mixins": [
	],
	"injectors": {
		"defaultRequire": 1
	}
}
```

