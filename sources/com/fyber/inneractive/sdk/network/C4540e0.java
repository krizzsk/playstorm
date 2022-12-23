package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.factories.C4397b;
import com.fyber.inneractive.sdk.network.C4532b0;
import com.fyber.inneractive.sdk.p189dv.C4364g;
import com.fyber.inneractive.sdk.response.C5287a;
import com.fyber.inneractive.sdk.response.C5288b;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.response.C5296j;
import com.fyber.inneractive.sdk.response.C5297k;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.e0 */
public abstract class C4540e0<T> implements C4532b0<T> {

    /* renamed from: a */
    public volatile boolean f11223a = false;

    /* renamed from: b */
    public final C4579u<T> f11224b;

    /* renamed from: c */
    public C4544g f11225c;

    /* renamed from: d */
    public C4532b0.C4533a f11226d;

    /* renamed from: e */
    public C4551j f11227e;

    /* renamed from: f */
    public volatile C4559m0 f11228f = C4559m0.INITIAL;

    /* renamed from: com.fyber.inneractive.sdk.network.e0$a */
    public class C4541a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f11229a;

        /* renamed from: b */
        public final /* synthetic */ Exception f11230b;

        /* renamed from: c */
        public final /* synthetic */ boolean f11231c;

        public C4541a(Object obj, Exception exc, boolean z) {
            this.f11229a = obj;
            this.f11230b = exc;
            this.f11231c = z;
        }

        public void run() {
            C4540e0.this.f11224b.mo24228a(this.f11229a, this.f11230b, this.f11231c);
        }
    }

    public C4540e0(C4579u<T> uVar, C4544g gVar) {
        this.f11224b = uVar;
        this.f11225c = gVar;
    }

    /* renamed from: a */
    public void mo24716a(C4530a0 a0Var, String str, String str2) {
    }

    /* renamed from: a */
    public void mo24718a(T t, Exception exc, boolean z) {
        C5357n.f14225b.post(new C4541a(t, exc, z));
    }

    /* renamed from: b */
    public void mo24719b() {
        try {
            C4551j jVar = this.f11227e;
            if (jVar != null) {
                jVar.mo24755a();
            }
            this.f11225c.mo24749b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public String mo24720c() {
        return null;
    }

    /* renamed from: e */
    public boolean mo24721e() {
        return this.f11223a;
    }

    /* renamed from: g */
    public C4529a<T> mo24723g() {
        return null;
    }

    /* renamed from: h */
    public C4309s mo24724h() {
        return null;
    }

    /* renamed from: i */
    public C4566o0 mo24725i() {
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        return new C4566o0(iAConfigManager.f10557v.f10660b.mo24345a("connect_timeout", 5000, 1), iAConfigManager.f10557v.f10660b.mo24345a("read_timeout", 5000, 1));
    }

    /* renamed from: k */
    public byte[] mo24727k() {
        return null;
    }

    /* renamed from: l */
    public C4559m0 mo24728l() {
        return this.f11228f;
    }

    /* renamed from: m */
    public String mo24729m() {
        return "application/json; charset=utf-8";
    }

    /* renamed from: q */
    public Map<String, String> mo24732q() {
        return null;
    }

    /* renamed from: a */
    public C4551j mo24714a(String str) throws Exception {
        try {
            C4532b0.C4533a aVar = this.f11226d;
            if (aVar != null) {
                aVar.mo24229a("sdkInitNetworkRequest");
            }
            this.f11227e = this.f11225c.mo24748a(this, C5350l.m16770f(), str);
            C4532b0.C4533a aVar2 = this.f11226d;
            if (aVar2 != null) {
                aVar2.mo24229a("sdkGotServerResponse");
            }
            return this.f11227e;
        } catch (C4531b e) {
            IAlog.m16698a("failed start network request", e, new Object[0]);
            throw e;
        } catch (C4573q0 e2) {
            IAlog.m16698a("failed read network response", e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.m16698a("failed start network request", e3, new Object[0]);
            throw e3;
        }
    }

    /* renamed from: a */
    public void mo24717a(C4559m0 m0Var) {
        this.f11228f = m0Var;
    }

    /* renamed from: a */
    public C5291e mo24746a(int i, C4558m mVar, C5296j jVar, C4364g gVar) throws Exception {
        try {
            C5287a a = C5287a.m16615a(i);
            if (a == null) {
                a = C5287a.RETURNED_ADTYPE_MRAID;
            }
            C5288b a2 = C4397b.C4398a.f10858a.mo24559a(a);
            if (a2 == null) {
                IAlog.m16703e("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i));
                if (C4397b.C4398a.f10858a.f10857a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new C4587z("Could not find parser for ad type " + i);
            }
            IAlog.m16699a("Received ad type %s - Got parser! %s", Integer.valueOf(i), a2);
            if (jVar != null) {
                a2.f14057c = jVar;
            }
            a2.f14055a = a2.mo24393a();
            if (mVar != null) {
                a2.f14057c = new C5297k(mVar);
            }
            C5291e a3 = a2.mo26384a((String) null);
            if (gVar != null) {
                a3.f14084s = gVar;
            }
            C4532b0.C4533a aVar = this.f11226d;
            if (aVar != null) {
                aVar.mo24229a("sdkParsedResponse");
            }
            return a3;
        } catch (Exception e) {
            IAlog.m16698a("failed parse ad network request", e, new Object[0]);
            throw new C4587z(e);
        }
    }
}
