plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()

    maven("https://repo.crazycrew.us/first-party/")

    maven("https://repo.crazycrew.us/third-party/")
}

dependencies {
    implementation("com.github.johnrengelman", "shadow", "8.1.0")

    implementation("com.lordcodes.turtle", "turtle", "0.8.0")
}