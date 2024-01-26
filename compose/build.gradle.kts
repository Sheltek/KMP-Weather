plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.google.secrets)
    alias(libs.plugins.google.services)
    alias(libs.plugins.multiplatformResources)
    alias(libs.plugins.ksp)
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    androidTarget()
    jvmToolchain(17)

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            binaryOption("bundleId", "com.br.kmmdemo.shared")
            export(libs.moko.resources)
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(mapOf("path" to ":domain")))
                implementation(project(mapOf("path" to ":shared")))
                // Put your multiplatform dependencies here

                // Jetpack Compose
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.animation)
                implementation(compose.material3)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)

                // PreCompose - https://github.com/Tlaster/PreCompose
                api(libs.precompose)
                api(libs.precompose.viewmodel)
                api(libs.precompose.koin)
                api(libs.moko.resources)
                api(libs.moko.resources.compose)

                // Logger
                implementation(libs.kermit.logger)
            }
        }
        val commonTest by getting {
            dependsOn(commonMain)
            dependencies {
                implementation(libs.koin.test)
                implementation(libs.moko.resources.test)
            }
        }
    }
}

multiplatformResources {
    multiplatformResourcesPackage = "com.br.kmmdemo.resources"
    multiplatformResourcesClassName = "SharedRes"
}

android {
    namespace = "com.br.kmmdemo"
    compileSdk = libs.versions.compile.sdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.min.sdk.get().toInt()
    }

    // Needed for Preview Pane in IDE
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4"
    }
}