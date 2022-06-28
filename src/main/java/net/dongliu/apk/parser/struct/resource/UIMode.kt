package net.dongliu.apk.parser.struct.resource

enum class UIMode(val flag: Int, val qualifier: String, val minApiLevel: Int) {
    DESK(2, "-desk", 8),
    CAR(3, "-car", 8),
    TELEVISION(4, "-television", 13),
    APPLIANCE(5, "-appliance", 16),
    WATCH(6, "-watch", 20),
    VR_HEADSET(7, "-vrheadset", 26);

    companion object {
        fun findQualifier(flag: Int): String {
            return values().find { it.flag == flag }?.qualifier ?: ""
        }
    }
}