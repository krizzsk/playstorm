package com.mbridge.msdk.mbbid.out;

public class BannerBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a */
    private int f21162a;

    /* renamed from: b */
    private int f21163b;

    public BannerBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f21162a = i2;
        this.f21163b = i;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f21162a = i2;
        this.f21163b = i;
    }

    public int getHeight() {
        return this.f21162a;
    }

    public void setHeight(int i) {
        this.f21162a = i;
    }

    public int getWidth() {
        return this.f21163b;
    }

    public void setWidth(int i) {
        this.f21163b = i;
    }
}
