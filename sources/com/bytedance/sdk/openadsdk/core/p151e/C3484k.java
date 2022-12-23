package com.bytedance.sdk.openadsdk.core.p151e;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTImage;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.k */
/* compiled from: Image */
public class C3484k {

    /* renamed from: a */
    private String f8512a;

    /* renamed from: b */
    private int f8513b;

    /* renamed from: c */
    private int f8514c;

    /* renamed from: d */
    private double f8515d;

    /* renamed from: e */
    private boolean f8516e;

    /* renamed from: f */
    private String f8517f;

    /* renamed from: a */
    public static TTImage m10521a(C3484k kVar) {
        if (kVar == null || !kVar.mo19568e()) {
            return null;
        }
        return new TTImage(kVar.mo19566c(), kVar.mo19563b(), kVar.mo19559a(), kVar.mo19567d());
    }

    /* renamed from: a */
    public String mo19559a() {
        return this.f8512a;
    }

    /* renamed from: a */
    public void mo19560a(int i) {
        this.f8513b = i;
    }

    /* renamed from: a */
    public void mo19561a(String str) {
        this.f8512a = str;
    }

    /* renamed from: a */
    public void mo19562a(boolean z) {
        this.f8516e = z;
    }

    /* renamed from: b */
    public int mo19563b() {
        return this.f8513b;
    }

    /* renamed from: b */
    public void mo19564b(int i) {
        this.f8514c = i;
    }

    /* renamed from: b */
    public void mo19565b(String str) {
        this.f8517f = str;
    }

    /* renamed from: c */
    public int mo19566c() {
        return this.f8514c;
    }

    /* renamed from: d */
    public double mo19567d() {
        return this.f8515d;
    }

    /* renamed from: e */
    public boolean mo19568e() {
        return !TextUtils.isEmpty(this.f8512a) && this.f8513b > 0 && this.f8514c > 0;
    }

    /* renamed from: f */
    public boolean mo19569f() {
        return this.f8516e;
    }

    /* renamed from: g */
    public String mo19570g() {
        return this.f8517f;
    }
}
