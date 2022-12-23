package com.ironsource.sdk.p290e.p291a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.p293g.C8350f;
import com.ironsource.sdk.utils.SDKUtils;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.e.a.a */
public final class C8333a {

    /* renamed from: a */
    public static final String f19967a = Omid.getVersion();

    /* renamed from: b */
    public final Partner f19968b = Partner.createPartner("Ironsrc", "7");

    /* renamed from: c */
    public final HashMap<String, AdSession> f19969c = new HashMap<>();

    /* renamed from: d */
    public boolean f19970d = false;

    /* renamed from: com.ironsource.sdk.e.a.a$a */
    public static class C8334a {

        /* renamed from: a */
        public boolean f19971a;

        /* renamed from: b */
        public Owner f19972b;

        /* renamed from: c */
        public Owner f19973c;

        /* renamed from: d */
        public String f19974d;

        /* renamed from: e */
        public ImpressionType f19975e;

        /* renamed from: f */
        public CreativeType f19976f;

        /* renamed from: g */
        public String f19977g;

        /* renamed from: h */
        private Owner f19978h;

        /* renamed from: a */
        public static C8334a m23879a(JSONObject jSONObject) {
            C8334a aVar = new C8334a();
            aVar.f19971a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    aVar.f19972b = Owner.valueOf(optString.toUpperCase());
                    String optString2 = jSONObject.optString("videoEventsOwner", "");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            aVar.f19973c = Owner.valueOf(optString2.toUpperCase());
                            aVar.f19974d = jSONObject.optString("customReferenceData", "");
                            aVar.f19976f = m23881c(jSONObject);
                            aVar.f19975e = m23880b(jSONObject);
                            String optString3 = jSONObject.optString("adViewId", "");
                            if (!TextUtils.isEmpty(optString3)) {
                                aVar.f19977g = optString3;
                                aVar.f19978h = m23882d(jSONObject);
                                return aVar;
                            }
                            throw new IllegalArgumentException("Missing adview id in OMID params" + optString3);
                        } catch (IllegalArgumentException unused) {
                            throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                        }
                    } else {
                        throw new IllegalArgumentException("Missing OMID videoEventsOwner");
                    }
                } catch (IllegalArgumentException unused2) {
                    throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
                }
            } else {
                throw new IllegalArgumentException("Missing OMID impressionOwner");
            }
        }

        /* renamed from: b */
        private static ImpressionType m23880b(JSONObject jSONObject) {
            String optString = jSONObject.optString("impressionType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (ImpressionType impressionType : ImpressionType.values()) {
                    if (optString.equalsIgnoreCase(impressionType.toString())) {
                        return impressionType;
                    }
                }
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        /* renamed from: c */
        private static CreativeType m23881c(JSONObject jSONObject) {
            String optString = jSONObject.optString(StaticResource.CREATIVE_TYPE, "");
            if (!TextUtils.isEmpty(optString)) {
                for (CreativeType creativeType : CreativeType.values()) {
                    if (optString.equalsIgnoreCase(creativeType.toString())) {
                        return creativeType;
                    }
                }
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        /* renamed from: d */
        private static Owner m23882d(JSONObject jSONObject) {
            try {
                return Owner.valueOf(jSONObject.optString("videoEventsOwner", "").toUpperCase());
            } catch (IllegalArgumentException unused) {
                return Owner.NONE;
            }
        }
    }

    /* renamed from: a */
    public final C8350f mo56828a() {
        C8350f fVar = new C8350f();
        fVar.mo56861a("omidVersion", SDKUtils.encodeString(f19967a));
        fVar.mo56861a("omidPartnerName", SDKUtils.encodeString("Ironsrc"));
        fVar.mo56861a("omidPartnerVersion", SDKUtils.encodeString("7"));
        fVar.mo56861a("omidActiveAdSessions", SDKUtils.encodeString(Arrays.toString(this.f19969c.keySet().toArray())));
        return fVar;
    }

    /* renamed from: a */
    public void mo56829a(JSONObject jSONObject) {
        if (!this.f19970d) {
            throw new IllegalStateException("OMID has not been activated");
        } else if (jSONObject == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
