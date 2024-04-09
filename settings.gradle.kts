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
            url = uri("https://maven.pkg.github.com/Sheltek/KMP-Weather")
            credentials {
                username = System.getenv("REPO_READ_USER")
                password = System.getenv("REPO_READ_TOKEN")
            }
        }
        mavenLocal()
        google()
        mavenCentral()
    }
}

rootProject.name = "KmpWeather"
include(":androidApp")
include(":shared")
include(":domain")
include(":compose")
include(":data")