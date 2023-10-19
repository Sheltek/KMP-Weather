plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.jetbrainsCompose)
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

                // KTOR Networking and Serialization
                implementation(libs.ktor.client.core)
                implementation(libs.ktor.client.content.negotiation)
                implementation(libs.ktor.serialization.kotlinx.json)
                implementation(libs.koin.core)
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
                implementation(libs.ktor.client.android)
                implementation(libs.koin.android)
                implementation(libs.koin.androidx.compose)

                // Preview Utils need to be implemented in platform code as they use platform renderers
                implementation(compose.preview)
                implementation(compose.uiTooling)
            }
        }
        val iosMain by getting {
            dependencies {
                implementation(libs.ktor.client.darwin)
            }
        }
        val commonTest by getting {
            dependencies {
//                implementation(kotlin("test"))
                implementation(libs.koin.test)
            }
        }
    }
}

android {
    namespace = "com.br.kmmdemo"
    compileSdk = 34
    defaultConfig {
        minSdk = 30
    }
}