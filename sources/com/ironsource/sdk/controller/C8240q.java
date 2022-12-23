package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.ironsource.sdk.controller.C8252x;
import com.ironsource.sdk.p288c.C8173d;
import com.ironsource.sdk.p288c.C8175e;
import com.ironsource.sdk.p290e.p291a.C8333a;
import com.ironsource.sdk.p293g.C8350f;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.q */
public class C8240q {

    /* renamed from: a */
    private static final String f19701a = C8240q.class.getSimpleName();

    /* renamed from: b */
    private final Context f19702b;

    /* renamed from: c */
    private final C8333a f19703c = new C8333a();

    /* renamed from: com.ironsource.sdk.controller.q$a */
    static class C8241a {

        /* renamed from: a */
        String f19704a;

        /* renamed from: b */
        JSONObject f19705b;

        /* renamed from: c */
        String f19706c;

        /* renamed from: d */
        String f19707d;

        private C8241a() {
        }

        /* synthetic */ C8241a(byte b) {
            this();
        }
    }

    public C8240q(Context context) {
        this.f19702b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56593a(String str, C8252x.C8275d.C8305a aVar) {
        C8333a aVar2;
        JSONObject jSONObject = new JSONObject(str);
        C8241a aVar3 = new C8241a((byte) 0);
        aVar3.f19704a = jSONObject.optString("omidFunction");
        aVar3.f19705b = jSONObject.optJSONObject("omidParams");
        aVar3.f19706c = jSONObject.optString("success");
        aVar3.f19707d = jSONObject.optString("fail");
        C8350f fVar = new C8350f();
        if (aVar3.f19705b != null) {
            String optString = aVar3.f19705b.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                fVar.mo56861a("adViewId", optString);
            }
        }
        try {
            String str2 = aVar3.f19704a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals("activate")) {
                        c = 0;
                        break;
                    }
                    break;
                case -984459207:
                    if (str2.equals("getOmidData")) {
                        c = 4;
                        break;
                    }
                    break;
                case 70701699:
                    if (str2.equals("finishSession")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1208109646:
                    if (str2.equals("impressionOccurred")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1850541012:
                    if (str2.equals("startSession")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    C8333a aVar4 = this.f19703c;
                    C8333a.C8334a a = C8333a.C8334a.m23879a(aVar3.f19705b);
                    if (!aVar4.f19970d) {
                        throw new IllegalStateException("OMID has not been activated");
                    } else if (!TextUtils.isEmpty(a.f19977g)) {
                        String str3 = a.f19977g;
                        if (!aVar4.f19969c.containsKey(str3)) {
                            C8175e a2 = C8173d.m23494a().mo56456a(str3);
                            if (a2 != null) {
                                AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a.f19976f, a.f19975e, a.f19972b, a.f19973c, a.f19971a), AdSessionContext.createHtmlAdSessionContext(aVar4.f19968b, a2.mo56442b(), (String) null, a.f19974d));
                                createAdSession.registerAdView(a2.mo56442b());
                                createAdSession.start();
                                aVar4.f19969c.put(str3, createAdSession);
                            } else {
                                throw new IllegalStateException("No adview found with the provided adViewId");
                            }
                        } else {
                            throw new IllegalStateException("OMID Session has already started");
                        }
                    } else {
                        throw new IllegalStateException("Missing adview id in OMID params");
                    }
                } else if (c == 2) {
                    C8333a aVar5 = this.f19703c;
                    JSONObject jSONObject2 = aVar3.f19705b;
                    aVar5.mo56829a(jSONObject2);
                    String optString2 = jSONObject2.optString("adViewId");
                    AdSession adSession = aVar5.f19969c.get(optString2);
                    if (adSession != null) {
                        adSession.finish();
                        aVar5.f19969c.remove(optString2);
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c == 3) {
                    C8333a aVar6 = this.f19703c;
                    JSONObject jSONObject3 = aVar3.f19705b;
                    aVar6.mo56829a(jSONObject3);
                    AdSession adSession2 = aVar6.f19969c.get(jSONObject3.optString("adViewId"));
                    if (adSession2 != null) {
                        AdEvents createAdEvents = AdEvents.createAdEvents(adSession2);
                        if (jSONObject3.optBoolean("signalLoaded")) {
                            createAdEvents.loaded();
                        }
                        createAdEvents.impressionOccurred();
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c == 4) {
                    aVar2 = this.f19703c;
                } else {
                    throw new IllegalArgumentException(String.format("%s | unsupported OMID API", new Object[]{aVar3.f19704a}));
                }
                aVar.mo56757a(true, aVar3.f19706c, fVar);
            }
            C8333a aVar7 = this.f19703c;
            Context context = this.f19702b;
            if (!aVar7.f19970d) {
                Omid.activate(context);
                aVar7.f19970d = true;
            }
            aVar2 = this.f19703c;
            fVar = aVar2.mo56828a();
            aVar.mo56757a(true, aVar3.f19706c, fVar);
        } catch (Exception e) {
            fVar.mo56861a("errMsg", e.getMessage());
            Logger.m24028i(f19701a, "OMIDJSAdapter " + aVar3.f19704a + " Exception: " + e.getMessage());
            aVar.mo56757a(false, aVar3.f19707d, fVar);
        }
    }
}
