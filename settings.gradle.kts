dependencyResolutionManagement {
    repositories.gradlePluginPortal()
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()

        maven("https://repo.crazycrew.us/first-party/")
        maven("https://repo.crazycrew.us/third-party/")
    }
}

rootProject.name = "Amethyst"

val lowerCase = rootProject.name.lowercase()

listOf("server", "api").forEach(::includeProject)

fun includeProject(name: String) {
    include(name) {
        this.name = "$lowerCase-$name"
    }
}

fun include(name: String, block: ProjectDescriptor.() -> Unit) {
    include(name)
    project(":$name").apply(block)
}