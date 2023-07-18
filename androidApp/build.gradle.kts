plugins {
    id("com.android.application")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    android()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}

android {
    namespace = "com.example.kotlinhomeproject.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.kotlinhomeproject.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin {
        jvmToolchain(11)
    }
}

//dependencies {
//    implementation(project(":shared"))
//    implementation("androidx.compose.ui:ui:1.4.3")
//    implementation("androidx.compose.ui:ui-tooling:1.4.3")
//    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")
//    implementation("androidx.compose.foundation:foundation:1.4.3")
//    implementation("androidx.compose.material:material:1.4.3")
//    implementation("androidx.activity:activity-compose:1.6.1")
//}