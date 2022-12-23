package com.mbridge.msdk.mbbid.out;

public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a */
    private int f21160a;

    /* renamed from: b */
    private int f21161b;

    public AdvancedNativeBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f21160a = i2;
        this.f21161b = i;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f21160a = i2;
        this.f21161b = i;
    }

    public int getHeight() {
        return this.f21160a;
    }

    public void setHeight(int i) {
        this.f21160a = i;
    }

    public int getWidth() {
        return this.f21161b;
    }

    public void setWidth(int i) {
        this.f21161b = i;
    }
}
