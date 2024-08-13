plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.yort.kordial"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("dev.kord:kord-common:0.14.0")
    implementation("dev.kord:kord-rest:0.14.0")
    implementation("dev.kord:kord-gateway:0.14.0")
    implementation("dev.kord:kord-core:0.14.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}