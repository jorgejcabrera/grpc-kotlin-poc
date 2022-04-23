plugins {
    application
    kotlin("jvm")
}

dependencies {
    implementation(project(":stub"))
    runtimeOnly("io.grpc:grpc-netty:${rootProject.ext["grpcVersion"]}")
}

tasks.register<JavaExec>("BarServer") {
    dependsOn("classes")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.jjc.grpc.services.BarServerKt")
}

val barServerStartScripts = tasks.register<CreateStartScripts>("barServerStartScripts") {
    mainClass.set("com.jjc.grpc.services.BarServerKt")
    applicationName = "bar-server"
    outputDir = tasks.named<CreateStartScripts>("startScripts").get().outputDir
    classpath = tasks.named<CreateStartScripts>("startScripts").get().classpath
}

tasks.named("startScripts") {
    dependsOn(barServerStartScripts)
}
