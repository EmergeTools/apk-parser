package net.dongliu.apk.parser.struct.resource;

import net.dongliu.apk.parser.utils.Unsigned;

/**
 * used by resource Type.
 *
 * @author dongliu
 */
public class ResTableConfig {
    // Number of bytes in this structure. uint32_t
    private int size;

    // Mobile country code (from SIM).  0 means "any". uint16_t
    private short mcc;
    // Mobile network code (from SIM).  0 means "any". uint16_t
    private short mnc;
    //uint32_t imsi;

    // 0 means "any".  Otherwise, en, fr, etc. char[2]
    private String language;
    // 0 means "any".  Otherwise, US, CA, etc.  char[2]
    private String country;
    // uint32_t locale;

    // uint8_t
    private byte orientation;
    // uint8_t
    private byte touchscreen;
    // uint16_t
    // see Densities.java for values
    private short density;
    // uint32_t screenType;

    // uint8_t
    private short keyboard;
    // uint8_t
    private short navigation;
    // uint8_t
    private short inputFlags;
    // uint8_t
    private short inputPad0;
    // uint32_t input;

    // uint16_t
    private int screenWidth;
    // uint16_t
    private int screenHeight;
    // uint32_t screenSize;

    // uint16_t
    private int sdkVersion;
    // For now minorVersion must always be 0!!!  Its meaning is currently undefined.
    // uint16_t
    private int minorVersion;
    //uint32_t version;

    // uint8_t
    private short screenLayout;
    // uint8_t
    private short uiMode;
    // uint16_t
    private int smallestScreenWidthDp;
    //uint32_t screenConfig;

    // uint16_t
    private int screenWidthDp;
    // uint16_t
    private int screenHeightDp;
    //uint32_t screenSizeDp;

    // uint8_t. Contains round/notround qualifier.
    private short screenLayout2;
    // uint8_t. Wide-gamut, HDR, etc.
    private short colorMode;
    // uint16_t. Reserved padding.
    private int screenConfigPad2;
    //uint32_t screenConfig2;


    public int getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = Unsigned.ensureUInt(size);
    }

    public short getMcc() {
        return mcc;
    }

    public void setMcc(short mcc) {
        this.mcc = mcc;
    }

    public short getMnc() {
        return mnc;
    }

    public void setMnc(short mnc) {
        this.mnc = mnc;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public short getOrientation() {
        return (short) (orientation & 0xff);
    }

    public void setOrientation(short orientation) {
        this.orientation = (byte) orientation;
    }

    public short getTouchscreen() {
        return (short) (touchscreen & 0xff);
    }

    public void setTouchscreen(short touchscreen) {
        this.touchscreen = (byte) touchscreen;
    }

    public int getDensity() {
        return density & 0xffff;
    }

    public void setDensity(int density) {
        this.density = (short) density;
    }

    public short getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(short keyboard) {
        this.keyboard = keyboard;
    }

    public short getNavigation() {
        return navigation;
    }

    public void setNavigation(short navigation) {
        this.navigation = navigation;
    }

    public short getInputFlags() {
        return inputFlags;
    }

    public void setInputFlags(short inputFlags) {
        this.inputFlags = inputFlags;
    }

    public short getInputPad0() {
        return inputPad0;
    }

    public void setInputPad0(short inputPad0) {
        this.inputPad0 = inputPad0;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(int sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    public short getScreenLayout() {
        return screenLayout;
    }

    public void setScreenLayout(short screenLayout) {
        this.screenLayout = screenLayout;
    }

    public short getUiMode() {
        return uiMode;
    }

    public void setUiMode(short uiMode) {
        this.uiMode = uiMode;
    }


    public int getSmallestScreenWidthDp() {
        return smallestScreenWidthDp;
    }

    public void setSmallestScreenWidthDp(int smallestScreenWidthDp) {
        this.smallestScreenWidthDp = smallestScreenWidthDp;
    }

    public int getScreenWidthDp() {
        return screenWidthDp;
    }


    public void setScreenWidthDp(int screenWidthDp) {
        this.screenWidthDp = screenWidthDp;
    }


    public int getScreenHeightDp() {
        return screenHeightDp;
    }


    public void setScreenHeightDp(int screenHeightDp) {
        this.screenHeightDp = screenHeightDp;
    }


    public short getScreenLayout2() {
        return screenLayout2;
    }


    public void setScreenLayout2(short screenLayout2) {
        this.screenLayout2 = screenLayout2;
    }


    public short getColorMode() {
        return colorMode;
    }


    public void setColorMode(short colorMode) {
        this.colorMode = colorMode;
    }


    public int getScreenConfigPad2() {
        return screenConfigPad2;
    }


    public void setScreenConfigPad2(int screenConfigPad2) {
        this.screenConfigPad2 = screenConfigPad2;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResTableConfig{");
        sb.append("size=").append(size);
        sb.append(", mcc=").append(mcc);
        sb.append(", mnc=").append(mnc);
        sb.append(", language='").append(language).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", orientation=").append(orientation);
        sb.append(", touchscreen=").append(touchscreen);
        sb.append(", density=").append(density);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", navigation=").append(navigation);
        sb.append(", inputFlags=").append(inputFlags);
        sb.append(", inputPad0=").append(inputPad0);
        sb.append(", screenWidth=").append(screenWidth);
        sb.append(", screenHeight=").append(screenHeight);
        sb.append(", sdkVersion=").append(sdkVersion);
        sb.append(", minorVersion=").append(minorVersion);
        sb.append(", screenLayout=").append(screenLayout);
        sb.append(", uiMode=").append(uiMode);
        sb.append(", smallestScreenWidthDp=").append(smallestScreenWidthDp);
        sb.append(", screenWidthDp=").append(screenWidthDp);
        sb.append(", screenHeightDp=").append(screenHeightDp);
        sb.append(", screenLayout2=").append(screenLayout2);
        sb.append(", colorMode=").append(colorMode);
        sb.append(", screenConfigPad2=").append(screenConfigPad2);
        sb.append('}');
        return sb.toString();
    }
}
