plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.testcv2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.testcv2"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation( project(":opencv"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // TensorFlow Lite dependencies in Kotlin Script
    implementation ("org.tensorflow:tensorflow-lite:2.12.0")  // Use the latest stable version
    implementation("org.tensorflow:tensorflow-lite-support:0.1.0")

}