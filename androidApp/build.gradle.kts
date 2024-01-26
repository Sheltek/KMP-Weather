plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
}

kotlin {
    androidTarget()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(project(":domain"))
                implementation(project(":compose"))
                implementation(libs.activity.compose)
                implementation(libs.koin.android)

                // Utility
                implementation(libs.google.maps)
                implementation(libs.google.maps.utils)
                implementation(libs.google.places)
                implementation(libs.play.services.maps)
                implementation(libs.glance)
                implementation(libs.glance.appwidget)
                implementation(libs.glance.material3)
            }
        }
    }
}

android {
    namespace = "com.br.kmmdemo.android"
    compileSdk = libs.versions.compile.sdk.get().toInt()

    sourceSets["main"].apply {
        res.srcDirs("src/androidMain/res", "src/commonMain/resources")
        manifest.srcFile("src/androidMain/AndroidManifest.xml")
    }

    defaultConfig {
        applicationId = "com.br.kmmdemo.android"
        minSdk = libs.versions.min.sdk.get().toInt()
        targetSdk = (findProperty("android.targetSdk") as String).toInt()
        versionCode = 1
        versionName = "1.0"
        manifestPlaceholders["MAPS_API_KEY"] = "MAPS_API_KEY"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}