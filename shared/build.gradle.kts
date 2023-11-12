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

                // KTOR Networking and Serialization
                implementation(libs.ktor.client.core)
                implementation(libs.ktor.client.content.negotiation)
                implementation(libs.ktor.serialization.kotlinx.json)
                implementation(libs.koin.core)
            }
        }
        val androidMain by getting {
            dependsOn(commonMain)
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
                implementation(libs.ktor.client.android)
                implementation(libs.koin.android)
                implementation(libs.koin.androidx.compose)

                // Utility
                implementation(libs.google.maps)
                implementation(libs.google.maps.utils)
                implementation(libs.google.places)
                implementation(libs.play.services.maps)

                // Preview Utils need to be implemented in platform code as they use platform renderers
                implementation(compose.preview)
                implementation(compose.uiTooling)

                api(libs.moko.resources)
                api(libs.moko.resources.compose)
            }
        }
        val iosMain by getting {
            dependsOn(commonMain)
            dependencies {
                implementation(libs.ktor.client.darwin)
                api(libs.moko.resources)
                api(libs.moko.resources.compose)
            }
        }
        val commonTest by getting {
            dependsOn(commonMain)
            dependencies {
//                implementation(kotlin("test"))
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
    compileSdk = 34
    defaultConfig {
        minSdk = 30
    }

    // Needed for Preview Pane in IDE
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4"
    }
}