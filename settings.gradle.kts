rootProject.name = "grpc-kotlin-poc"

include("protos", "stub", "client", "server")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}
