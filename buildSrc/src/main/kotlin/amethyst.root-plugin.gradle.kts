plugins {
    `java-library`
    `maven-publish`

    kotlin("jvm")

    id("com.github.johnrengelman.shadow")
}

repositories {
    mavenCentral()

    maven("https://jitpack.io")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of("17"))
}

kotlin {
    jvmToolchain(17)
}

tasks {
    compileJava {
        options.release.set(17)
    }

    compileKotlin {
        kotlinOptions {
            jvmTarget = "17"
            javaParameters = true
        }
    }
}