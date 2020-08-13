object PluginsVersion {
    const val AGP = "4.0.1"
    const val KOTLIN = "1.4.0"
    const val KTLINT = "9.3.0"
    const val DETEKT = "1.12.0-RC1"
    const val GRADLE_VERSION_PLUGIN = "0.29.0"
}

object Versions {
    const val KTLINT = "0.38.0"
    const val CORE_KTX = "1.5.0-alpha02"
    const val APPCOMPAT = "1.3.0-alpha02"
    const val ACTIVITY = "1.2.0-alpha08"
    const val FRAGMENT = "1.3.0-alpha08"
    const val CONSTRAINT_LAYOUT = "2.0.0"
    const val RECYCLER_VIEW = "1.2.0-alpha05"
    const val MATERIAL = "1.3.0-alpha02"
    const val COIL = "0.11.0"
    const val KOTLIN_COROUTINES = "1.3.9"
    const val LIFECYCLE = "2.3.0-alpha07"
    const val NAVIGATION = "2.3.0"
    const val OKHTTP = "4.8.1"
    const val RETROFIT = "2.9.0"
    const val RETROFIT_COROUTINES = "0.9.2"
    const val ROOM = "2.3.0-alpha02"
    const val TIMBER = "4.7.1"
    const val TRUTH = "1.0.1"
    const val JUNIT = "4.13"
    const val ANDROIDX_TEST = "1.3.0-rc03"
    const val ANDROIDX_TEST_EXT = "1.1.2-rc03"
    const val ANDROIDX_ARCH_CORE = "2.1.0"
    const val ESPRESSO_CORE = "3.3.0-rc03"
}

object SupportLibs {
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val ANDROIDX_CONSTRAINT_LAYOUT =
        "com.android.support.constraint:constraint-layout:${Versions.CONSTRAINT_LAYOUT}"
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:$${Versions.ACTIVITY}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLER_VIEW}"
}

object Libraries {
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"

    const val NAVIGATION_FRAGMENT =
        "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"

    const val LIFECYCLE_VIEWMODEL =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_VIEWMODEL_SAVEDSTATE =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.LIFECYCLE}"

    const val KOTLIN_COROUTINES_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.KOTLIN_COROUTINES}"

    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"

    const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val OKHTTP_LOGGING_INTERCEPTOR =
        "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_MOSHI_CONVERTER =
        "com.squareup.retrofit2:converter-moshi:${Versions.RETROFIT}"
    const val RETROFIT_COROUTINES_ADAPTER =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.RETROFIT_COROUTINES}"

    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"

    const val COIL = "io.coil-kt:coil:${Versions.COIL}"
}

object TestingLib {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val TRUTH = "com.google.truth:truth:${Versions.TRUTH}"

    const val KOTLIN_COROUTINE_TEST =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.KOTLIN_COROUTINES}"

    // Test helpers for LiveData
    const val ANDROIDX_ARCH_CORE = "androidx.arch.core:core-testing:${Versions.ANDROIDX_ARCH_CORE}"
}

object AndroidTestingLib {
    const val ANDROIDX_TEST_CORE = "androidx.test:core-ktx:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit-ktx:${Versions.ANDROIDX_TEST_EXT}"

    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"

    // Test helpers for LiveData
    const val ANDROIDX_ARCH_CORE = "androidx.arch.core:core-testing:${Versions.ANDROIDX_ARCH_CORE}"
}
