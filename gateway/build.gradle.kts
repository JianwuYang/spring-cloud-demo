/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("top.yangjianwu.java-application-base-conventions")
}

dependencies {
    implementation(project(":base"))

    implementation("org.springframework.cloud:spring-cloud-starter-gateway")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
}
