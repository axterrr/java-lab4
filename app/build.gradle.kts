plugins {
    id("java")
}

group = "java-automatization"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    annotationProcessor(project(mapOf("path" to ":compiler")))
    implementation(project(mapOf("path" to ":validators")))
    implementation(project(mapOf("path" to ":annotations")))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
}

tasks.test {
    useJUnitPlatform()
}
