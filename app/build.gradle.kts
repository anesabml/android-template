plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(Sdk.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(Sdk.MIN_SDK_VERSION)
        targetSdkVersion(Sdk.TARGET_SDK_VERSION)

        applicationId = AppCoordinates.APP_ID
        versionCode = AppCoordinates.VERSION_CODE
        versionName = AppCoordinates.VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }

    android.sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
        getByName("test").java.srcDirs("src/test/kotlin")
        getByName("androidTest").java.srcDirs("src/androidTest/kotlin")
    }
}

dependencies {
    implementation(SupportLibs.ANDROIDX_CORE_KTX)
    implementation(SupportLibs.ANDROIDX_APPCOMPAT)
    implementation(SupportLibs.ANDROIDX_CONSTRAINT_LAYOUT)
    implementation(SupportLibs.RECYCLER_VIEW)
    implementation(SupportLibs.FRAGMENT_KTX)
    implementation(SupportLibs.ACTIVITY_KTX)
    implementation(Libraries.MATERIAL)
    implementation(Libraries.COIL)
    implementation(Libraries.NAVIGATION_FRAGMENT)
    implementation(Libraries.NAVIGATION_UI)
    implementation(Libraries.LIFECYCLE_LIVEDATA)
    implementation(Libraries.LIFECYCLE_VIEWMODEL)
    implementation(Libraries.LIFECYCLE_VIEWMODEL_SAVEDSTATE)
    implementation(Libraries.KOTLIN_COROUTINES_ANDROID)
    implementation(Libraries.OKHTTP)
    implementation(Libraries.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Libraries.RETROFIT)
    implementation(Libraries.RETROFIT_MOSHI_CONVERTER)
    implementation(Libraries.RETROFIT_COROUTINES_ADAPTER)
    implementation(Libraries.TIMBER)
    implementation(Libraries.ROOM_RUNTIME)
    implementation(Libraries.ROOM_KTX)
    kapt(Libraries.ROOM_COMPILER)

    testImplementation(TestingLib.JUNIT)
    testImplementation(TestingLib.TRUTH)
    testImplementation(TestingLib.KOTLIN_COROUTINE_TEST)
    androidTestImplementation(TestingLib.ANDROIDX_ARCH_CORE)

    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_EXT_JUNIT)
    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_CORE)
    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_RULES)
    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_RUNNER)
    androidTestImplementation(AndroidTestingLib.ANDROIDX_ARCH_CORE)
    androidTestImplementation(AndroidTestingLib.ESPRESSO_CORE)
}