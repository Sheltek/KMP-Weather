pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/BottleRocketStudios/KMP-LaunchPad-Utils")
            credentials {
                username = System.getenv("REPO_READ_USER")
                password = System.getenv("REPO_READ_TOKEN")
            }
        }
//        maven {
//            url = uri("https://maven.pkg.github.com/BottleRocketStudios/KMP-LaunchPad-Compose")
//
//        }
//        maven {
//            url = uri("https://maven.pkg.github.com/BottleRocketStudios/kmp-ignite")
//            credentials {
//                username = System.getenv("REPO_READ_USER")
//                password = System.getenv("REPO_READ_TOKEN")
//            }
//        }
        google()
        mavenCentral()
    }
}

rootProject.name = "KMM_Demo"
include(":androidApp")
include(":shared")
include(":domain")