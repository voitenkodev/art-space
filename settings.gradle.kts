enableFeaturePreview("VERSION_CATALOGS")
@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    versionCatalogs { create("libs") { from(files("gradle/wrapper/libs.versions.toml")) } }
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "Art Space"
include(":app")
include(":shared")
