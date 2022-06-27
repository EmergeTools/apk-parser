rootProject.name = "apk-parser"

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("findbugs-jsr305", "com.google.code.findbugs:jsr305:3.0.0")
            library("bouncycastle-bcprov-jdk15on", "org.bouncycastle:bcprov-jdk15on:1.58")
            library("bouncycastle-bcpkix-jdk15on", "org.bouncycastle:bcpkix-jdk15on:1.58")
        }

        create("testlibs") {
            library("junit", "junit:junit:4.12")
        }
    }
}
