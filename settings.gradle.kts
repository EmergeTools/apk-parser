rootProject.name = "apk-parser"

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {

            version("kotlin", "1.6.21")

            plugin("jetbrains-kotlin", "org.jetbrains.kotlin.jvm").versionRef("kotlin")

            library("jetbrains-kotlin", "org.jetbrains.kotlin", "kotlin-stdlib-jdk8").versionRef("kotlin")
            library("findbugs-jsr305", "com.google.code.findbugs:jsr305:3.0.0")
            library("bouncycastle-bcprov-jdk15on", "org.bouncycastle:bcprov-jdk15on:1.58")
            library("bouncycastle-bcpkix-jdk15on", "org.bouncycastle:bcpkix-jdk15on:1.58")
        }

        create("testlibs") {
            library("junit", "junit:junit:4.12")
        }
    }
}
