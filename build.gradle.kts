

buildscript{

    repositories{
        mavenCentral()
        google()
        maven { url = uri("https://www.jitpack.io" ) }
    }
}



plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.google.dagger.hilt.android") version "2.48.1" apply false
}

