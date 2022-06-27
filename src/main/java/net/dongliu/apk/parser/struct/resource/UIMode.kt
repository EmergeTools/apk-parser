package net.dongliu.apk.parser.struct.resource

enum class UIMode(val flag: Int, val qualifier: String) {
    DESK(2, "-desk"),
    CAR(3, "-car"),
    TELEVISION(4, "-television"),
    APPLIANCE(5, "-appliance"),
    WATCH(6, "-watch"),
    VR_HEADSET(7, "-vrheadset");

    companion object {
        fun findQualifier(flag: Int): String {
            return values().find { it.flag == flag }?.qualifier ?: ""
        }
    }
}