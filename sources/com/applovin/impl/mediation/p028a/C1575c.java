package com.applovin.impl.mediation.p028a;

import android.os.SystemClock;
import com.applovin.impl.mediation.C1730g;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p047b.C1854c;
import com.applovin.impl.sdk.p048c.C1856a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.c */
public class C1575c extends C1573a {

    /* renamed from: c */
    private final AtomicReference<C1854c> f2060c;

    /* renamed from: d */
    private final AtomicBoolean f2061d;

    /* renamed from: e */
    private final AtomicBoolean f2062e;

    private C1575c(C1575c cVar, C1730g gVar) {
        super(cVar.mo13216T(), cVar.mo13206J(), cVar.mo13205I(), gVar, cVar.f2066b);
        this.f2062e = new AtomicBoolean();
        this.f2060c = cVar.f2060c;
        this.f2061d = cVar.f2061d;
    }

    public C1575c(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1959m mVar) {
        super(map, jSONObject, jSONObject2, (C1730g) null, mVar);
        this.f2062e = new AtomicBoolean();
        this.f2060c = new AtomicReference<>();
        this.f2061d = new AtomicBoolean();
    }

    /* renamed from: A */
    public long mo13180A() {
        return mo13232b("ahdm", ((Long) this.f2066b.mo14311a(C1856a.f3063x)).longValue());
    }

    /* renamed from: B */
    public boolean mo13181B() {
        return mo13233b("susaode", (Boolean) this.f2066b.mo14311a(C1856a.f3062w)).booleanValue();
    }

    /* renamed from: C */
    public String mo13182C() {
        return mo13234b("bcode", "");
    }

    /* renamed from: D */
    public String mo13183D() {
        return mo13227a("mcode", "");
    }

    /* renamed from: E */
    public boolean mo13184E() {
        return this.f2061d.get();
    }

    /* renamed from: F */
    public void mo13185F() {
        this.f2061d.set(true);
    }

    /* renamed from: G */
    public C1854c mo13186G() {
        return this.f2060c.getAndSet((Object) null);
    }

    /* renamed from: H */
    public AtomicBoolean mo13187H() {
        return this.f2062e;
    }

    /* renamed from: a */
    public C1573a mo13132a(C1730g gVar) {
        return new C1575c(this, gVar);
    }

    /* renamed from: a */
    public void mo13188a(C1854c cVar) {
        this.f2060c.set(cVar);
    }

    /* renamed from: u */
    public long mo13174u() {
        long b = mo13232b("ad_expiration_ms", -1);
        return b >= 0 ? b : mo13225a("ad_expiration_ms", ((Long) this.f2066b.mo14311a(C1856a.f3021D)).longValue());
    }

    /* renamed from: v */
    public long mo13189v() {
        long b = mo13232b("ad_hidden_timeout_ms", -1);
        return b >= 0 ? b : mo13225a("ad_hidden_timeout_ms", ((Long) this.f2066b.mo14311a(C1856a.f3024G)).longValue());
    }

    /* renamed from: w */
    public boolean mo13190w() {
        if (mo13233b("schedule_ad_hidden_on_ad_dismiss", (Boolean) false).booleanValue()) {
            return true;
        }
        return mo13226a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f2066b.mo14311a(C1856a.f3025H)).booleanValue();
    }

    /* renamed from: x */
    public long mo13191x() {
        long b = mo13232b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1);
        return b >= 0 ? b : mo13225a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f2066b.mo14311a(C1856a.f3026I)).longValue());
    }

    /* renamed from: y */
    public long mo13192y() {
        if (mo13167q() > 0) {
            return SystemClock.elapsedRealtime() - mo13167q();
        }
        return -1;
    }

    /* renamed from: z */
    public long mo13193z() {
        long b = mo13232b("fullscreen_display_delay_ms", -1);
        return b >= 0 ? b : ((Long) this.f2066b.mo14311a(C1856a.f3061v)).longValue();
    }
}
