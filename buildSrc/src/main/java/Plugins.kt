object Plugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
    const val hilt = "dagger.hilt.android.plugin"

    object Spotless {
        const val plugin = "com.diffplug.spotless"
        const val version = "6.18.0"
    }

    object Detekts {
        const val detekt = "io.gitlab.arturbosch.detekt"
        const val version = "1.22.0"
    }

    object BenManes {
        const val plugin = "com.github.ben-manes.versions"
        const val version = "0.46.0"
    }
}
