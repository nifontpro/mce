plugins {
	id("com.android.application")
	kotlin("android")
	id("dagger.hilt.android.plugin")
	id("kotlin-kapt")
//	id("kotlin-parcelize")
}

android {
	namespace = ProjectConfig.appId
	compileSdk = ProjectConfig.compileSdk

	defaultConfig {
		applicationId = ProjectConfig.appId
		minSdk = ProjectConfig.minSdk
		targetSdk = ProjectConfig.targetSdk
		versionCode = ProjectConfig.versionCode
		versionName = ProjectConfig.versionName

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		vectorDrawables {
			useSupportLibrary = true
		}
	}

	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
		}
	}

	@Suppress("UnstableApiUsage")
	buildFeatures {
		compose = true
	}

	composeOptions {
		kotlinCompilerExtensionVersion = Compose.composeCompilerVersion
	}

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_17
		targetCompatibility = JavaVersion.VERSION_17
	}

	kotlinOptions {
		jvmTarget = "17"
	}
}

dependencies {

	//	implementation(project(Modules.core))
	implementation(project(Modules.coreUi))

	implementation(Compose.compiler)
	implementation(Compose.ui)
	implementation(Compose.uiToolingPreview)
	implementation(Compose.hiltNavigationCompose)
	implementation(Compose.material)
	implementation(Compose.runtime)
	implementation(Compose.viewModelCompose)
	implementation(Compose.activityCompose)
	implementation(Compose.materialIcon)
//	implementation(Compose.splashScreen)
//	implementation(Compose.permission)

	implementation(DaggerHilt.hiltAndroid)
	kapt(DaggerHilt.hiltCompiler)
	kapt(WorkManager.hiltCompiler)
	implementation(WorkManager.work)
	implementation(WorkManager.hiltWork)

	implementation(AndroidX.coreKtx)
	implementation(AndroidX.appCompat)

	implementation(Compose.coilCompose)

	implementation(Google.material)

//	testImplementation(Testing.junit4)
//	testImplementation(Testing.junitAndroidExt)
//	testImplementation(Testing.truth)
//	testImplementation(Testing.coroutines)
//	testImplementation(Testing.turbine)
//	testImplementation(Testing.composeUiTest)
//	testImplementation(Testing.mockk)
//	testImplementation(Testing.mockWebServer)
//
//	androidTestImplementation(Testing.junit4)
//	androidTestImplementation(Testing.junitAndroidExt)
//	androidTestImplementation(Testing.truth)
//	androidTestImplementation(Testing.coroutines)
//	androidTestImplementation(Testing.turbine)
//	androidTestImplementation(Testing.composeUiTest)
//	androidTestImplementation(Testing.mockkAndroid)
//	androidTestImplementation(Testing.mockWebServer)
//	androidTestImplementation(Testing.hiltTesting)
//	kaptAndroidTest(DaggerHilt.hiltCompiler)
//	androidTestImplementation(Testing.testRunner)
}