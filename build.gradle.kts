buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
    }
} // Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.google.devtools.ksp") version "1.8.0-1.0.9"
    id("com.google.dagger.hilt.android") version "2.44" apply false
}
