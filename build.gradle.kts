plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
    id("org.jetbrains.intellij.platform") version "2.5.0"
}

group = "sprengel.ruben"
version = "0.3.1"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    intellijPlatform {
        create("IU", "2025.2")
        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)
        // Add necessary plugin dependencies for compilation here, example:
        // bundledPlugin("com.intellij.java")
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "251"
        }

        changeNotes = """
        <div class="changelog">
            <h1>0.3.1</h1>
            
            <h2>Added</h2>
            <ul>
                <li>CONTRIBUTING.md</li>
                <li>FUNDING.yml</li>
            </ul>
        
            <h2>Changed</h2>
            <ul>
                <li>README.md</li>
            </ul>
            
            <h2>Fixed</h2>
            <ul>
                <li>Fixed live template `sv-await-wp-then-catch` variables (typo and missing variable)</li>
            </ul>    
            
            <hr>
            
            <h1>0.3.0</h1>
            
            <h2>Added</h2>
            <ul>
                <li><strong>Svelte 5 Live Templates:</strong> Extensive additions for Svelte 5, including <code>attach</code>, <code>await</code> variants (<code>catch</code>, <code>then</code>, <code>with pending</code>), <code>const</code>, <code>host</code>, <code>html</code>.</li>
                <li><strong>SvelteKit Live Templates:</strong> Many new templates for SvelteKit-specific use cases, such as <code>config</code>, <code>csr</code>, <code>error</code>, <code>form-action</code> variants, <code>hooks</code>, <code>load</code> functions (<code>layoutload</code>, <code>pageload</code>, <code>pageserverload</code>), <code>route</code> methods (<code>get-route</code>, <code>post-route</code>), <code>prerender</code>, and <code>ssr</code> settings.</li>
            </ul>

            <hr>

            <h1>Notable Changes in Previous Versions:</h1>
            <ul>
                <li><strong>0.2.0:</strong> Introduced numerous Svelte 5 Live Templates specifically for <code>runes</code> (e.g., <code>derived</code>, <code>effect</code>, <code>inspect</code>, <code>props</code>, <code>state</code>). Updated the changelog format and expanded README details.</li>
                <li><strong>0.1.0:</strong> Initial Release with basic Svelte 5 Live Templates for Control Flow (<code>each</code>, <code>if</code>) and other features (<code>key</code>, <code>render</code>, <code>snippet</code>).</li>
            </ul>

            <hr>

            <p>For all detailed changes and the complete history, please refer to the <a href="https://github.com/ruben-sprengel/jetbrains-svelte-templates/blob/main/CHANGELOG.md">jetbrains-svelte-templates CHANGELOG on GitHub</a>.</p>
        </div>
        """.trimIndent()
    }
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "21"
    }
}
