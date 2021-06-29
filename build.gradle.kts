// Top-level build file where you can add configuration options common to all sub-projects/modules.
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id(Plugins.benManes) version Plugins.benManesVersion
    id(Plugins.Spotless.plugin) version (Plugins.Spotless.version)
}

buildscript {

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(ClassPaths.gradlePlugin)
        classpath(ClassPaths.kotlinGradlePlugin)
        classpath(ClassPaths.hiltGradlePlugin)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

/* ./gradlew dependencyUpdates */
tasks.named<DependencyUpdatesTask>("dependencyUpdates").configure {
    rejectVersionIf {
        isNonStable(candidate.version)
    }
    checkForGradleUpdate = true
    outputDir = "${rootProject.buildDir}/dependencyUpdates"
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        target("**/*.kt")
        targetExclude("$buildDir/**/*.kt")
        targetExclude("bin/**/*.kt")
        ktlint("0.40.0").userData(mapOf("disabled_rules" to "no-wildcard-imports"))
    }
}

tasks.named("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}