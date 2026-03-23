plugins {
    id("org.springframework.boot") version "3.5.12"
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    // Global
    implementation(platform("org.springframework.boot:spring-boot-dependencies:${properties["spring-boot.version"]}"))
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("com.squareup.retrofit2:retrofit:${properties["retrofit.version"]}")
    implementation("com.squareup.retrofit2:converter-jackson:${properties["retrofit.version"]}")

    testImplementation("org.springframework.boot:spring-boot-starter-test")

    compileOnly("org.springframework.boot:spring-boot-devtools")
}

tasks.test {
    useJUnitPlatform()
}
