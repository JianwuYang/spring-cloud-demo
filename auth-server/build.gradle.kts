/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("top.yangjianwu.java-application-conventions")
}

dependencies {
    implementation(project(":base"))

    implementation("org.springframework.boot:spring-boot-starter-oauth2-authorization-server")
}
