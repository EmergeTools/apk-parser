plugins {
    alias(libs.plugins.jetbrains.kotlin)
    `java-gradle-plugin`
}

group = "com.emergetools"
version = "3.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jetbrains.kotlin)
    implementation(libs.findbugs.jsr305)
    implementation(libs.bouncycastle.bcprov.jdk15on)
    implementation(libs.bouncycastle.bcpkix.jdk15on)
    testImplementation(testlibs.junit)
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
