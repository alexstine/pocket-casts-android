plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kapt)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kotlin.parcelize)
}

apply(from = "${project.rootDir}/base.gradle")

android {
    namespace = "au.com.shiftyjelly.pocketcasts.taskerplugin"
    buildFeatures {
        buildConfig = true
        viewBinding = true
        dataBinding = true
        compose = true
    }
}

dependencies {
    implementation(project(":modules:services:analytics"))
    implementation(project(":modules:services:localization"))
    implementation(project(":modules:services:ui"))
    implementation(project(":modules:services:compose"))
    implementation(project(":modules:services:repositories"))
    implementation(project(":modules:services:model"))
    implementation(project(":modules:services:views"))
    implementation(project(":modules:services:images"))
    implementation(project(":modules:services:preferences"))
    implementation("com.joaomgcd:taskerpluginlibrary:0.4.6")
}
