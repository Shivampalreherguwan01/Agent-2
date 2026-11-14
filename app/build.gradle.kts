plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.agent2.remote"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.agent2.remote"
        minSdk = 30
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
