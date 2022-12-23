package com.bytedance.sdk.openadsdk.core.p151e;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.m */
/* compiled from: LoadingInfo */
public class C3497m {

    /* renamed from: a */
    private long f8567a = 10000;

    /* renamed from: b */
    private long f8568b = 10000;

    /* renamed from: c */
    private String f8569c = "";

    /* renamed from: a */
    public long mo19589a() {
        return this.f8567a;
    }

    /* renamed from: a */
    public void mo19590a(long j) {
        if (j <= 0) {
            this.f8567a = 10;
        } else {
            this.f8567a = j;
        }
    }

    /* renamed from: b */
    public long mo19592b() {
        return this.f8568b;
    }

    /* renamed from: b */
    public void mo19593b(long j) {
        if (j < 0) {
            this.f8568b = 20;
        } else {
            this.f8568b = j;
        }
    }

    /* renamed from: c */
    public String mo19594c() {
        return this.f8569c;
    }

    /* renamed from: a */
    public void mo19591a(String str) {
        this.f8569c = str;
    }
}
