import gradle.kotlin.dsl.accessors._5bb3aeef91931d772a225dee378a9068.testImplementation

/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    // Apply the common convention plugin for shared build configuration between library and application projects.
    id("top.yangjianwu.java-common-conventions")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

extra["springCloudVersion"] = "2022.0.2"

dependencies {
    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation("org.springframework.cloud:spring-cloud-starter-consul-discovery")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}



