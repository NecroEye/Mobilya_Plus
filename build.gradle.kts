

buildscript{

    repositories{
        mavenCentral()
        google()
        maven { url = uri("https://maven.google.com") }
    }
}



plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}

