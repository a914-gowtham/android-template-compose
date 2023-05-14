object Dependencies {

    const val timber = "com.jakewharton.timber:timber:4.7.1"

    object OkHttp {
        const val bom = "com.squareup.okhttp3:okhttp-bom:4.9.0"
        const val dependency = "com.squareup.okhttp3:okhttp"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val converter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
    }

    object Kotlin {
        const val version = "1.8.21"
        private const val coroutinesVersion = "1.7.1"
        const val stbLib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1"
    }

    object Android {
        const val ktx = "androidx.core:core-ktx:1.6.0"
        const val appCompat = "androidx.appcompat:appcompat:1.3.0"
        const val material = "com.google.android.material:material:1.4.0"
        const val prefs = "androidx.preference:preference-ktx:1.1.1"
        const val crypto = "androidx.security:security-crypto:1.1.0-alpha03"
        const val splashScreen = "androidx.core:core-splashscreen:1.0.0-alpha01"

    }

    object DataStore {
        private const val version = "1.0.0"
        const val typed = "androidx.datastore:datastore:$version"
        const val preferences = "androidx.datastore:datastore-preferences:$version"
    }

    object Lifecycle {
        private const val version = "2.3.1"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
    }

    object Compose {
        const val version = "1.0.1"
        const val composeBom = "androidx.compose:compose-bom:2023.05.01"
        const val ui = "androidx.compose.ui:ui"
        const val material = "androidx.compose.material:material"
        const val material3 = "androidx.compose.material3:material3"

        const val tooling = "androidx.compose.ui:ui-tooling-preview"
        const val activity = "androidx.activity:activity-compose:1.6.1"
        const val lifecycle = "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
        const val livedata = "androidx.compose.runtime:runtime-livedata"
        const val iconsExtended = "androidx.compose.material:material-icons-extended"
        const val paging = "androidx.paging:paging-compose:1.0.0-alpha11"
    }

    object Accompanist {
        private const val version = "0.30.1"
        const val coil = "com.google.accompanist:accompanist-coil:0.15.0"
        const val animation = "com.google.accompanist:accompanist-navigation-animation:$version"
        const val windowInsets = "com.google.accompanist:accompanist-insets:$version"
        const val placeholder = "com.google.accompanist:accompanist-placeholder$version"
        const val flexLayout = "com.google.accompanist:accompanist-flowlayout:$version"
        const val pager = "com.google.accompanist:accompanist-pager:$version"
        const val permissions = "com.google.accompanist:accompanist-permissions:$version"
        const val systemUi = "com.google.accompanist:accompanist-systemuicontroller:$version"
    }

    object Navigation {
        const val compose = "androidx.navigation:navigation-compose:2.5.3"
        const val hilt = "androidx.hilt:hilt-navigation-compose:1.0.0"
    }

    object Hilt {
        const val version = "2.46"
        const val plugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
        const val dependency = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-compiler:$version"
    }

    object Room {
        const val version = "2.5.1"
        const val roomRunTime = "androidx.room:room-runtime:$version" //Room
        const val roomExt = "androidx.room:room-ktx:$version"  //Room
        const val roomKapt = "androidx.room:room-compiler:$version" //Room
    }

    object Testing {
        const val junit = "junit:junit:4.13.2"
        const val junitAndroid = "androidx.test.ext:junit:1.1.3"
        const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
        const val junitCompose = "androidx.compose.ui:ui-test-junit4:1.0.0-alpha07"
    }
}
