// Top-level build file where you can add configuration options common to all sub-projects/modules.
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import io.gitlab.arturbosch.detekt.Detekt
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    id("org.jlleitschuh.gradle.ktlint") version PluginsVersion.KTLINT
    id("io.gitlab.arturbosch.detekt") version PluginsVersion.DETEKT
    id("com.github.ben-manes.versions") version PluginsVersion.GRADLE_VERSION_PLUGIN
}

buildscript {
    repositories {
        google()
        jcenter()
        maven("https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:${PluginsVersion.AGP}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersion.KOTLIN}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

subprojects {
    apply {
        plugin("org.jlleitschuh.gradle.ktlint")
        plugin("io.gitlab.arturbosch.detekt")
    }

    ktlint {
        version.set(Versions.KTLINT)
        debug.set(false)
        verbose.set(true)
        android.set(false)
        outputToConsole.set(true)
        outputColorName.set("RED")
        ignoreFailures.set(false)
        enableExperimentalRules.set(true)
        additionalEditorconfigFile.set(file(".editorconfig"))
        disabledRules.set(setOf("final-newline"))
        reporters {
            reporter(ReporterType.PLAIN)
            reporter(ReporterType.CHECKSTYLE)
        }
        filter {
            exclude("**/generated/**")
            include("**/kotlin/**")
        }
    }

    detekt {
        failFast = true
        config =
            rootProject.files("config/detekt/detekt.yml")

        reports {
            // Or xml, txt
            html {
                enabled = true
                destination = file("build/reports/detekt.html")
            }
        }
    }

    tasks.withType<Detekt>().configureEach {
        jvmTarget = "1.8"
    }
}

tasks.named("dependencyUpdates", DependencyUpdatesTask::class.java).configure {
    checkForGradleUpdate = true
    outputFormatter = "json"
    outputDir = "build/dependencyUpdates"
    reportfileName = "report"
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
