package net.dongliu.apk.parser.struct.resource

enum class HighDynamicRange(val flag: Int, val qualifier: String) {
    LOW(4, "-lowdr"),
    HIGH(8, "-highdr");

    companion object {
        fun findQualifier(flag: Int): String {
            return values().find { it.flag == flag }?.qualifier ?: ""
        }
    }
}