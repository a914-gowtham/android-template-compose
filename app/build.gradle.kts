plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinKapt)
    id(Plugins.hilt)
}

android {
    compileSdk = Config.compileSdkVersion
    buildToolsVersion = Config.buildToolsVersion

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Compose.version
    }

    packagingOptions {
        // Multiple dependency bring these files in. Exclude them to enable
        // our test APK to build (has no effect on our AARs)
        resources.excludes.add("/META-INF/AL2.0")
        resources.excludes.add("/META-INF/LGPL2.1")
        resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
    }
}

dependencies {

    // android
    implementation(Dependencies.Android.ktx)
    implementation(Dependencies.Android.appCompat)
    implementation(Dependencies.Android.material)
    implementation(Dependencies.Android.crypto)
    implementation(Dependencies.Android.splashScreen)

    // compose
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.tooling)
    implementation(Dependencies.Compose.activity)

    // lifecycle
    implementation(Dependencies.Lifecycle.runtime)

    // hilt
    implementation(Dependencies.Hilt.dependency)
    implementation(Dependencies.Hilt.compiler)

    // testing
    testImplementation(Dependencies.Testing.junit)



    androidTestImplementation(Dependencies.Testing.junitAndroid)
    androidTestImplementation(Dependencies.Testing.espresso)
    androidTestImplementation(Dependencies.Testing.junitCompose)

    // Local Unit Tests
    implementation("androidx.test:core:1.3.0")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.2.1")
    testImplementation("com.google.truth:truth:1.0.1")

    // Instrumented Unit Tests
    androidTestImplementation("junit:junit:4.13.2")
    androidTestImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.2.1")
    androidTestImplementation("com.google.truth:truth:1.0.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
    androidTestImplementation("org.mockito:mockito-core:2.28.2")
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.37")
    kaptAndroidTest("com.google.dagger:hilt-android-compiler:2.38.1")
}