package net.dongliu.apk.parser.struct.resource


fun Type.dirName(): String {
    val dirBuilder = StringBuilder("/${this.name}")

    if (this.resTableConfig.mcc > 0) {
        dirBuilder.append("-mcc${String.format("%03d", this.resTableConfig.mcc)}")
    }
    if (this.resTableConfig.mnc > 0) {
        dirBuilder.append("-mnc${String.format("%03d", this.resTableConfig.mnc)}")
    }

    if (!this.locale.isO3Language.isNullOrEmpty()) {
        dirBuilder.append("-${this.locale.language}")
    }
    if (!this.locale.country.isNullOrEmpty()) {
        dirBuilder.append("-r${this.locale.country}")
    }

    dirBuilder.append(
        when (this.resTableConfig.screenLayout.toInt() and 0x000000c0) {
            64 -> "-ldltr"
            128 -> "-ldrtl"
            else -> ""
        }
    )

    if (this.resTableConfig.smallestScreenWidthDp > 0) {
        dirBuilder.append("-sw${this.resTableConfig.smallestScreenWidthDp}dp")
    }

    if (this.resTableConfig.screenWidthDp > 0) {
        dirBuilder.append("-w${this.resTableConfig.screenWidthDp}dp")
    }
    if (this.resTableConfig.screenHeightDp > 0) {
        dirBuilder.append("-h${this.resTableConfig.screenHeightDp}dp")
    }

    dirBuilder.append(
        when (this.resTableConfig.screenLayout.toInt() and 0x0000000f) {
            1 -> "-small"
            2 -> "-normal"
            3 -> "-large"
            4 -> "-xlarge"
            else -> ""
        }
    )

    dirBuilder.append(
        when (this.resTableConfig.screenLayout.toInt() and 0x00000030) {
            16 -> "-notlong"
            32 -> "-long"
            else -> ""
        }
    )

    dirBuilder.append(
        when (this.resTableConfig.screenLayout2.toInt()) {
            1 -> "-notround"
            2 -> "-round"
            else -> ""
        }
    )

    dirBuilder.append(WideColorGamut.findQualifier(this.resTableConfig.colorMode.toInt() and 0x00000003))

    dirBuilder.append(HighDynamicRange.findQualifier(this.resTableConfig.colorMode.toInt() and 0x0000000c))

    dirBuilder.append(
        when (this.resTableConfig.orientation.toInt()) {
            1 -> "-port"
            2 -> "-land"
            3 -> "-square"
            else -> ""
        }
    )

    dirBuilder.append(UIMode.findQualifier(this.resTableConfig.uiMode.toInt() and 0x0000000f))

    dirBuilder.append(
        when (this.resTableConfig.uiMode.toInt() and 0x00000030) {
            16 -> "-notnight"
            32 -> "-night"
            else -> ""
        }
    )

    dirBuilder.append(
        when (this.resTableConfig.density) {
            Densities.LOW -> "-ldpi"
            Densities.MEDIUM -> "-mdpi"
            Densities.HIGH -> "-hdpi"
            Densities.XHIGH -> "-xhdpi"
            Densities.XXHIGH -> "-xxhdpi"
            Densities.XXXHIGH -> "-xxxhdpi"
            Densities.TV -> "-tvdpi"
            Densities.NONE -> "-nodpi"
            Densities.ANY -> "-anydpi"
            else -> ""
        }
    )

    dirBuilder.append(
        when (this.resTableConfig.touchscreen.toInt()) {
            1 -> "-notouch"
            2 -> "-stylus"
            3 -> "-finger"
            else -> ""
        }
    )

    dirBuilder.append(
        when (this.resTableConfig.keyboard.toInt()) {
            1 -> "-nokeys"
            2 -> "-qwerty"
            3 -> "-12key"
            else -> ""
        }
    )

    dirBuilder.append(
        when (this.resTableConfig.navigation.toInt()) {
            1 -> "-nonav"
            2 -> "-dpad"
            3 -> "-trackball"
            4 -> "-wheel"
            else -> ""
        }
    )

    if (this.resTableConfig.sdkVersion > 0) {
        dirBuilder.append("-v${this.resTableConfig.sdkVersion}")
    }
    return dirBuilder.toString()
}
