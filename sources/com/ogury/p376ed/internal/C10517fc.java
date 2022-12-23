package com.ogury.p376ed.internal;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.aaid.OguryAaid;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.ogury.p376ed.internal.C10527fk;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fc */
public final class C10517fc {

    /* renamed from: a */
    public static final C10518a f26576a = new C10518a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static C10517fc f26577k;

    /* renamed from: b */
    private final Context f26578b;

    /* renamed from: c */
    private final C10527fk f26579c;

    /* renamed from: d */
    private final C10519fd f26580d;

    /* renamed from: e */
    private final C10542fx f26581e;

    /* renamed from: f */
    private final C10469dv f26582f;

    /* renamed from: g */
    private final C10549gb f26583g;

    /* renamed from: h */
    private final C10461do f26584h;

    /* renamed from: i */
    private boolean f26585i;

    /* renamed from: j */
    private OguryAaid f26586j;

    public /* synthetic */ C10517fc(Context context, C10527fk fkVar, C10519fd fdVar, C10542fx fxVar, C10469dv dvVar, C10549gb gbVar, C10461do doVar, byte b) {
        this(context, fkVar, fdVar, fxVar, dvVar, gbVar, doVar);
    }

    private C10517fc(Context context, C10527fk fkVar, C10519fd fdVar, C10542fx fxVar, C10469dv dvVar, C10549gb gbVar, C10461do doVar) {
        this.f26578b = context;
        this.f26579c = fkVar;
        this.f26580d = fdVar;
        this.f26581e = fxVar;
        this.f26582f = dvVar;
        this.f26583g = gbVar;
        this.f26584h = doVar;
        this.f26586j = fxVar.mo67450a();
    }

    /* renamed from: com.ogury.ed.internal.fc$a */
    public static final class C10518a {
        public /* synthetic */ C10518a(byte b) {
            this();
        }

        private C10518a() {
        }

        /* renamed from: a */
        public final C10517fc mo67367a(Context context) {
            C10517fc c;
            C10765mq.m32773b(context, "context");
            C10559gl.m32092a("Profig.getInstance");
            synchronized (this) {
                if (C10517fc.f26577k == null) {
                    C10518a aVar = C10517fc.f26576a;
                    C10518a aVar2 = C10517fc.f26576a;
                    Context applicationContext = context.getApplicationContext();
                    C10765mq.m32770a((Object) applicationContext, "context.applicationContext");
                    C10517fc.f26577k = m31914b(applicationContext);
                }
                c = C10517fc.f26577k;
                C10765mq.m32769a((Object) c);
            }
            return c;
        }

        /* renamed from: b */
        private static C10517fc m31914b(Context context) {
            C10527fk.C10528a aVar = C10527fk.f26610a;
            C10527fk a = C10527fk.C10528a.m31966a(context);
            C10519fd fdVar = new C10519fd(new C10510ez(context), new C10514fa(context), new C10542fx(context));
            C10470dw dwVar = C10470dw.f26453a;
            return new C10517fc(context, a, fdVar, new C10542fx(context), C10470dw.m31662a(context), new C10550gc(), new C10461do(), (byte) 0);
        }
    }

    /* renamed from: d */
    private final void m31908d() {
        if (m31909e()) {
            this.f26579c.mo67391a(0);
            this.f26579c.mo67400e();
        }
    }

    /* renamed from: e */
    private final boolean m31909e() {
        return this.f26579c.mo67402f() != System.currentTimeMillis() / TimeUnit.DAYS.toMillis(1);
    }

    /* renamed from: f */
    private final void m31910f() {
        this.f26579c.mo67391a(this.f26579c.mo67390a() + 1);
    }

    /* renamed from: a */
    private final C10521ff m31900a(boolean z) {
        C10765mq.m32765a("Profig - force profig ", (Object) Boolean.valueOf(z));
        this.f26586j = this.f26581e.mo67450a();
        return new C10521ff(this.f26580d, this.f26579c, z);
    }

    /* renamed from: a */
    public final void mo67365a() {
        OguryIntegrationLogger.m30996d("[Ads][setup] Synchronisation of the configuration has just been required");
        this.f26579c.mo67406j();
        mo67366b();
    }

    /* renamed from: b */
    public final void mo67366b() throws C10499eq {
        OguryIntegrationLogger.m30996d("[Ads][setup] Synchronizing configuration...");
        boolean k = this.f26579c.mo67407k();
        if (!this.f26585i || k) {
            C10765mq.m32765a("Profig - syncProfigIfNecessary ", (Object) Boolean.valueOf(k));
            this.f26585i = true;
            m31908d();
            C10520fe a = m31900a(k).mo67375a();
            StringBuilder sb = new StringBuilder("Profig - profigRequest ");
            sb.append(k);
            sb.append(' ');
            sb.append(a);
            if (!this.f26583g.mo67495a(this.f26578b)) {
                OguryIntegrationLogger.m30996d("[Ads][setup] Impossible to join Ogury servers. No Internet connection");
                this.f26585i = false;
                return;
            }
            if (a.mo67369a()) {
                OguryIntegrationLogger.m30996d("[Ads][setup] Synchronizing configuration from servers...");
                m31902a(a);
            } else {
                OguryIntegrationLogger.m30996d("[Ads][setup] Configuration synchronized");
            }
            this.f26585i = false;
            return;
        }
        OguryIntegrationLogger.m30996d("[Ads][setup] Configuration is already synchronizing");
    }

    /* renamed from: a */
    private final void m31902a(C10520fe feVar) {
        C10765mq.m32765a("making profig api call ", (Object) feVar);
        try {
            OguryNetworkResponse a = this.f26582f.mo67205a(feVar.mo67370b());
            if (a instanceof OguryNetworkResponse.Success) {
                JSONObject jSONObject = new JSONObject(((OguryNetworkResponse.Success) a).getResponseBody());
                C10461do.m31640a(jSONObject);
                OguryIntegrationLogger.m30996d("[Ads][setup] Configuration synchronized");
                m31903a(feVar, jSONObject);
            } else if (a instanceof OguryNetworkResponse.Failure) {
                OguryIntegrationLogger.m30996d("[Ads][setup] Failed to synchronize configuration (" + ((OguryNetworkResponse.Failure) a).getException().getMessage() + ')');
                Throwable exception = ((OguryNetworkResponse.Failure) a).getException();
                C10765mq.m32770a((Object) exception, "response.exception");
                m31906a(exception);
            }
        } catch (Exception e) {
            OguryIntegrationLogger.m30996d("[Ads][setup] Failed to synchronize configuration (" + e.getMessage() + ')');
            m31906a((Throwable) e);
        }
    }

    /* renamed from: a */
    private final void m31906a(Throwable th) {
        if (C10559gl.m32094b(th)) {
            m31910f();
            m31911g();
        }
        if (th instanceof C10499eq) {
            throw th;
        }
    }

    /* renamed from: a */
    private final void m31903a(C10520fe feVar, JSONObject jSONObject) {
        m31910f();
        m31911g();
        m31905a(feVar.mo67371c());
        C10527fk fkVar = this.f26579c;
        String id = this.f26586j.getId();
        C10765mq.m32770a((Object) id, "aaid.id");
        fkVar.mo67395b(id);
        this.f26579c.mo67392a(System.currentTimeMillis());
        C10532fo foVar = C10532fo.f26637a;
        m31904a(C10532fo.m32009a(jSONObject), jSONObject);
    }

    /* renamed from: a */
    private final void m31905a(String str) {
        if (str != null) {
            this.f26579c.mo67393a(str);
        }
    }

    /* renamed from: g */
    private final void m31911g() {
        this.f26579c.mo67399d(C10563go.m32099a());
    }

    /* renamed from: a */
    private final void m31904a(C10534fq fqVar, JSONObject jSONObject) {
        if (fqVar instanceof C10530fm) {
            OguryIntegrationLogger.m30996d("[Ads][setup] Saving configuration...");
            C10531fn fnVar = C10531fn.f26635a;
            C10531fn.m32006a((C10530fm) fqVar);
            C10527fk fkVar = this.f26579c;
            String jSONObject2 = jSONObject.toString();
            C10765mq.m32770a((Object) jSONObject2, "profigJsonResponse.toString()");
            fkVar.mo67397c(jSONObject2);
            OguryIntegrationLogger.m30996d("[Ads][setup] Configuration saved");
        } else if (fqVar instanceof C10523fg) {
            OguryIntegrationLogger.m30996d("[Ads][setup] New configuration synchronization requested");
            mo67365a();
        } else if (fqVar instanceof C10529fl) {
            OguryIntegrationLogger.m30997e("[Ads][setup] Invalid configuration (empty)");
        }
    }
}
