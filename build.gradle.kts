plugins {
    kotlin("jvm") version "1.8.10"
    id("com.ncorti.ktfmt.gradle") version "0.11.0"
    id("com.google.devtools.ksp") version "1.8.10-1.0.9"
}

group = "dev.whosnickdoglio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")
}

kotlin {
    jvmToolchain(11)
}