import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
dependencies {
    implementation(libs.androidx.room.gradle.plugin)
    compileOnly(libs.ksp.gradlePlugin)

}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}



gradlePlugin{
    plugins {
        register("room") {
            id = "room"
            implementationClass = "com.neo.baseProject.plugins.RoomPlugin"
        }
    }
}