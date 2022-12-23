package com.apm.insight.p022k;

import org.json.JSONObject;

/* renamed from: com.apm.insight.k.l */
public class C1283l {

    /* renamed from: a */
    private final int f1274a;

    /* renamed from: b */
    private String f1275b;

    /* renamed from: c */
    private JSONObject f1276c;

    /* renamed from: d */
    private byte[] f1277d;

    public C1283l(int i) {
        this.f1274a = i;
    }

    public C1283l(int i, String str) {
        this.f1274a = i;
        this.f1275b = str;
    }

    public C1283l(int i, Throwable th) {
        this.f1274a = i;
        if (th != null) {
            this.f1275b = th.getMessage();
        }
    }

    public C1283l(int i, JSONObject jSONObject) {
        this.f1274a = i;
        this.f1276c = jSONObject;
    }

    public C1283l(int i, byte[] bArr) {
        this.f1274a = i;
        this.f1277d = bArr;
    }

    /* renamed from: a */
    public boolean mo12351a() {
        return this.f1274a != 207;
    }

    /* renamed from: b */
    public byte[] mo12352b() {
        return this.f1277d;
    }
}
