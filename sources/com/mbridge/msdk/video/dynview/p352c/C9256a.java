package com.mbridge.msdk.video.dynview.p352c;

/* renamed from: com.mbridge.msdk.video.dynview.c.a */
/* compiled from: CusError */
public enum C9256a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one");
    

    /* renamed from: e */
    private int f22435e;

    /* renamed from: f */
    private String f22436f;

    private C9256a(int i, String str) {
        this.f22435e = i;
        this.f22436f = str;
    }

    /* renamed from: a */
    public final int mo62386a() {
        return this.f22435e;
    }

    /* renamed from: b */
    public final String mo62387b() {
        return this.f22436f;
    }
}
