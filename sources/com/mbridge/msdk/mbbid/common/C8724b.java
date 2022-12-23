package com.mbridge.msdk.mbbid.common;

/* renamed from: com.mbridge.msdk.mbbid.common.b */
/* compiled from: BidRequestParams */
public abstract class C8724b {

    /* renamed from: a */
    private String f21155a;

    /* renamed from: b */
    private String f21156b;

    /* renamed from: c */
    private String f21157c;

    public C8724b(String str, String str2) {
        this.f21155a = str;
        this.f21156b = str2;
    }

    public C8724b(String str, String str2, String str3) {
        this.f21155a = str;
        this.f21156b = str2;
        this.f21157c = str3;
    }

    public String getmUnitId() {
        return this.f21156b;
    }

    public void setmUnitId(String str) {
        this.f21156b = str;
    }

    public String getmFloorPrice() {
        return this.f21157c;
    }

    public void setmFloorPrice(String str) {
        this.f21157c = str;
    }

    public String getmPlacementId() {
        return this.f21155a;
    }

    public void setmPlacementId(String str) {
        this.f21155a = str;
    }
}
