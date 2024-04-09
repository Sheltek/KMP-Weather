plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinSerialization)
}

kotlin {
    applyDefaultHierarchyTemplate()
    androidTarget()
    jvmToolchain(17)

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "data"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":domain"))
                //put your multiplatform dependencies here
                implementation(libs.ktor.client.core)
                implementation(libs.ktor.client.content.negotiation)
                implementation(libs.ktor.serialization.kotlinx.json)
                implementation(libs.koin.core)
            }
        }
//        val commonTest by getting {
//            dependencies {
//                implementation(kotlin("test"))
//                implementation(libs.koin.test)
//            }
//        }
    }
}

android {
    with(libs.versions) {
        namespace = "${application.id.get()}.data"
        compileSdk = compile.sdk.get().toInt()
        defaultConfig {
            minSdk = min.sdk.get().toInt()
        }
    }
}