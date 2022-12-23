package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4261a;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.network.C4558m;
import com.fyber.inneractive.sdk.p189dv.C4361e;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.response.b */
public abstract class C5288b {

    /* renamed from: a */
    public C5291e f14055a;

    /* renamed from: b */
    public String f14056b;

    /* renamed from: c */
    public C5296j f14057c;

    /* renamed from: d */
    public boolean f14058d = true;

    /* renamed from: a */
    public abstract C5291e mo24393a();

    /* renamed from: a */
    public void mo26385a(C4558m mVar) {
        this.f14055a = mo24393a();
    }

    /* renamed from: a */
    public abstract void mo24394a(String str, C4345y yVar) throws Exception;

    /* renamed from: b */
    public abstract boolean mo24395b();

    /* renamed from: a */
    public C5291e mo26384a(String str) throws Exception {
        this.f14058d = str != null;
        C5291e eVar = this.f14055a;
        eVar.getClass();
        eVar.f14068c = System.currentTimeMillis();
        this.f14057c.mo24232a(this);
        String a = this.f14057c.mo24231a();
        this.f14055a.f14073h = a;
        C4345y b = C4261a.m13439b(this.f14056b);
        IAlog.m16699a("%sGot unit config for unitId: %s from config manager", IAlog.m16696a((Object) this), this.f14056b);
        IAlog.m16699a("%s%s", IAlog.m16696a((Object) this), b);
        if (this.f14058d) {
            mo24394a(str, b);
        } else if (!(this instanceof C4361e)) {
            C5294h hVar = new C5294h(a);
            if (hVar.f14099a) {
                String str2 = hVar.f14100b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                mo24394a(str2, b);
            }
        } else {
            mo24394a(a, b);
        }
        return this.f14055a;
    }
}
