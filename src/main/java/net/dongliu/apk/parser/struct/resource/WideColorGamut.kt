package net.dongliu.apk.parser.struct.resource

enum class WideColorGamut(val flag: Int, val qualifier: String) {
    NO_WIDE_CG(1, "-nowidecg"),
    WIDE_CG(2, "-widecg");

    companion object {
        fun findQualifier(flag: Int): String {
            return values().find { it.flag == flag }?.qualifier ?: ""
        }
    }
}