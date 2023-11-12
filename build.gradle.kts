import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin.Companion.kotlinNpmResolutionManager

plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
//    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.multiplatformResources) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.google.services) apply false
}

buildscript {
    repositories {
        gradlePluginPortal()
    }
    // TODO may need to move this. doesn't generate on gradle sync unless this file changed
    dependencies {
        // manual generate with ./gradlew generateMRcommonMain
        classpath(libs.mokoResourceGenerator)
        classpath(libs.kotlinGradlePlugin)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
