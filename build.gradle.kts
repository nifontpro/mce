buildscript {
	repositories {
		google()
		mavenCentral()
	}
	dependencies {
//        classpath(Build.androidBuildTools)
		classpath("com.android.tools.build:gradle:8.0.2") // For update

		classpath(Build.hiltAndroidGradlePlugin)
		classpath(Build.kotlinGradlePlugin)
		classpath(Build.kotlinSerializationPlugin)
	}
}

tasks.register("clean", Delete::class) {
	delete(rootProject.buildDir)
}