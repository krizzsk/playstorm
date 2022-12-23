package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8406g;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import com.mbridge.msdk.foundation.same.net.p310f.C8483c;
import com.mbridge.msdk.foundation.same.report.p312a.C8517a;
import com.mbridge.msdk.foundation.tools.C8608u;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.f */
/* compiled from: Listener */
public class C8480f<T> implements C8476e<T> {

    /* renamed from: a */
    private long f20495a;

    /* renamed from: b */
    private C8517a f20496b = null;

    /* renamed from: d */
    public String f20497d = "";

    /* renamed from: e */
    public String f20498e = "";

    /* renamed from: f */
    public int f20499f = 0;

    /* renamed from: a */
    public void mo57518a(long j, long j2) {
    }

    /* renamed from: a */
    public void mo57519a(C8452a aVar) {
    }

    /* renamed from: b */
    public void mo57521b() {
    }

    /* renamed from: c */
    public void mo57577c() {
    }

    /* renamed from: d */
    public final void mo57579d() {
    }

    /* renamed from: e */
    public final void mo57580e() {
    }

    /* renamed from: a */
    public void mo57576a() {
        this.f20495a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo57520a(C8501k<T> kVar) {
        try {
            String str = C2350a.m5601e().mo15793h() + "_" + this.f20498e + "_" + this.f20497d + "_" + this.f20499f;
            if (kVar.f20594a instanceof JSONObject) {
                C8483c.m24488a().mo57589a(str, ((JSONObject) kVar.f20594a).optInt("status"), ((JSONObject) kVar.f20594a).toString(), System.currentTimeMillis());
            }
            if (kVar.f20594a instanceof String) {
                C8483c.m24488a().mo57589a(str, new JSONObject((String) kVar.f20594a).optInt("status"), (String) kVar.f20594a, System.currentTimeMillis());
            }
        } catch (Exception e) {
            C8608u.m24884d("Listener", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo57586a(long j) {
        C8517a aVar = new C8517a(new C8406g());
        this.f20496b = aVar;
        aVar.mo57677b(this.f20497d);
        this.f20496b.mo57674a(1);
        C8517a aVar2 = this.f20496b;
        aVar2.mo57675a((j - this.f20495a) + "");
    }

    /* renamed from: a */
    public final void mo57585a(int i) {
        C8517a aVar = this.f20496b;
        if (aVar != null) {
            aVar.mo57676b(i);
            this.f20496b.mo57673a();
        }
    }

    /* renamed from: b */
    public final void mo57587b(int i) {
        C8517a aVar = this.f20496b;
        if (aVar != null) {
            aVar.mo57678c(i);
        }
    }
}
