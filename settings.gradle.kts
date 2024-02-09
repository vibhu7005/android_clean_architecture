import org.gradle.internal.impldep.org.bouncycastle.asn1.x500.style.RFC4519Style.name

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "android_clean_architecture"
include(":app")
include(":core")
