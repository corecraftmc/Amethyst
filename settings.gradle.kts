dependencyResolutionManagement {
    repositories.gradlePluginPortal()
}

pluginManagement {
    repositories {
        gradlePluginPortal()

        mavenCentral()
    }
}

rootProject.name = "Amethyst"

include("server", "api")

val lowerCase = rootProject.name.lowercase()

fun includeProject(name: String) {
    include(name) {
        this.name = "$lowerCase-$name"
    }
}

fun includeModule(name: String) {
    include(name) {
        this.name = "$lowerCase-module-$name"
        this.projectDir = file("modules/$name")
    }
}

fun includeType(name: String) {
    include(name) {
        this.name = "$lowerCase-$name"
        this.projectDir = file("minecraft/$name")
    }
}

fun include(name: String, block: ProjectDescriptor.() -> Unit) {
    include(name)
    project(":$name").apply(block)
}