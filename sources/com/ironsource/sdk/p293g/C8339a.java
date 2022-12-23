package com.ironsource.sdk.p293g;

/* renamed from: com.ironsource.sdk.g.a */
public final class C8339a extends C8350f {

    /* renamed from: e */
    private static String f19993e = "type";

    /* renamed from: f */
    private static String f19994f = "numOfAdUnits";

    /* renamed from: g */
    private static String f19995g = "firstCampaignCredits";

    /* renamed from: h */
    private static String f19996h = "totalNumberCredits";

    /* renamed from: i */
    private static String f19997i = "productType";

    /* renamed from: a */
    public String f19998a;

    /* renamed from: b */
    public String f19999b;

    /* renamed from: c */
    public boolean f20000c;

    /* renamed from: j */
    private String f20001j;

    /* renamed from: k */
    private String f20002k;

    /* renamed from: l */
    private String f20003l;

    public C8339a(String str) {
        super(str);
        boolean z;
        if (mo56863a(f19993e)) {
            this.f20001j = mo56866d(f19993e);
        }
        if (mo56863a(f19994f)) {
            this.f19999b = mo56866d(f19994f);
            z = true;
        } else {
            z = false;
        }
        this.f20000c = z;
        if (mo56863a(f19995g)) {
            this.f20002k = mo56866d(f19995g);
        }
        if (mo56863a(f19996h)) {
            this.f20003l = mo56866d(f19996h);
        }
        if (mo56863a(f19997i)) {
            this.f19998a = mo56866d(f19997i);
        }
    }
}
