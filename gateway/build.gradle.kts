/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("top.yangjianwu.java-application-base-conventions")
}

dependencies {
    implementation(project(":base"))
    // https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-gateway
    implementation("org.springframework.cloud:spring-cloud-starter-gateway")
}
