package com.ogury.p376ed.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ogury.core.internal.OguryIntegrationLogger;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.ff */
public final class C10521ff {

    /* renamed from: a */
    public static final C10522a f26595a = new C10522a((byte) 0);

    /* renamed from: b */
    private final C10527fk f26596b;

    /* renamed from: c */
    private final boolean f26597c;

    /* renamed from: d */
    private JSONObject f26598d;

    /* renamed from: e */
    private String f26599e;

    /* renamed from: f */
    private final String f26600f = this.f26596b.mo67398d();

    /* renamed from: g */
    private final C10530fm f26601g;

    public C10521ff(C10519fd fdVar, C10527fk fkVar, boolean z) {
        C10765mq.m32773b(fdVar, "profigGenerator");
        C10765mq.m32773b(fkVar, "profigDao");
        this.f26596b = fkVar;
        this.f26597c = z;
        this.f26598d = fdVar.mo67368a();
        C10516fb fbVar = C10516fb.f26575a;
        String jSONObject = this.f26598d.toString();
        C10765mq.m32770a((Object) jSONObject, "generatedProfig.toString()");
        this.f26599e = C10516fb.m31899a(jSONObject);
        C10532fo foVar = C10532fo.f26637a;
        this.f26601g = C10532fo.m32008a(this.f26600f);
    }

    /* renamed from: com.ogury.ed.internal.ff$a */
    public static final class C10522a {
        public /* synthetic */ C10522a(byte b) {
            this();
        }

        private C10522a() {
        }
    }

    /* renamed from: b */
    private final boolean m31924b() {
        return this.f26601g != null ? this.f26596b.mo67390a() >= this.f26601g.mo67421d() : this.f26596b.mo67390a() >= 10;
    }

    /* renamed from: c */
    private final boolean m31925c() {
        C10530fm fmVar = this.f26601g;
        if (fmVar == null) {
            return true;
        }
        return fmVar.mo67412a();
    }

    /* renamed from: d */
    private final boolean m31926d() {
        return C10765mq.m32772a((Object) this.f26596b.mo67403g(), (Object) C10563go.m32099a());
    }

    /* renamed from: e */
    private final boolean m31927e() {
        C10530fm fmVar = this.f26601g;
        return this.f26596b.mo67404h() + (fmVar == null ? 0 : fmVar.mo67425e()) > System.currentTimeMillis();
    }

    /* renamed from: a */
    public final C10520fe mo67375a() {
        C10530fm fmVar = this.f26601g;
        long e = fmVar == null ? 43200000 : fmVar.mo67425e();
        boolean c = m31925c();
        boolean z = !c;
        boolean b = m31924b();
        C10765mq.m32765a("api calls reached ", (Object) Boolean.valueOf(b));
        OguryIntegrationLogger.m30996d(C10765mq.m32765a("[Ads][setup] Synchronization is enabled: ", (Object) Boolean.valueOf(c)));
        if (b) {
            OguryIntegrationLogger.m30996d("[Ads][setup] Too many synchronization");
        }
        boolean z2 = true;
        boolean z3 = !m31927e();
        boolean z4 = !m31926d();
        boolean z5 = z && z4;
        if (!c || b || !z3 || (!this.f26597c && !m31928f() && !z4 && !z3)) {
            z2 = false;
        }
        if ((this.f26597c || m31930h()) && !b) {
            OguryIntegrationLogger.m30996d("[Ads][setup] Configuration needs to be synchronized with servers");
            return new C10520fe(true, e, this.f26598d, c, this.f26599e);
        } else if (z2 || z5) {
            OguryIntegrationLogger.m30996d("[Ads][setup] Configuration needs to be synchronized with servers");
            String str = null;
            if (m31928f()) {
                str = this.f26599e;
            }
            return new C10520fe(true, e, m31929g(), c, str);
        } else {
            OguryIntegrationLogger.m30996d("[Ads][setup] Local configuration is up to date");
            return new C10520fe(e, new JSONObject(), c);
        }
    }

    /* renamed from: f */
    private final boolean m31928f() {
        return !C10765mq.m32772a((Object) this.f26596b.mo67394b(), (Object) this.f26599e);
    }

    /* renamed from: g */
    private final JSONObject m31929g() {
        if (this.f26597c || m31928f()) {
            return this.f26598d;
        }
        return new JSONObject();
    }

    /* renamed from: h */
    private final boolean m31930h() {
        return (this.f26600f.length() == 0) || C10765mq.m32772a((Object) this.f26600f, (Object) JsonUtils.EMPTY_JSON);
    }
}
