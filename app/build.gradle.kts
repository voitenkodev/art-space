@Suppress("UnstableApiUsage", "DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.app)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "dev.voitenko.artspace"
    compileSdk = 32

    defaultConfig {
        applicationId = "dev.voitenko.artspace"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(libs.kotlinx.coroutines)
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.runtime)
}
