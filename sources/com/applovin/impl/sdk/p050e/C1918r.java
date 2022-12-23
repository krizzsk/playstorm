package com.applovin.impl.sdk.p050e;

import com.applovin.impl.p025a.C1409e;
import com.applovin.impl.p025a.C1410f;
import com.applovin.impl.p025a.C1417l;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.C2089s;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.r */
public abstract class C1918r extends C1877a {

    /* renamed from: a */
    private final AppLovinAdLoadListener f3559a;

    /* renamed from: c */
    private final C1919a f3560c;

    /* renamed from: com.applovin.impl.sdk.e.r$a */
    private static final class C1919a extends C1409e {
        C1919a(JSONObject jSONObject, JSONObject jSONObject2, C1825b bVar, C1959m mVar) {
            super(jSONObject, jSONObject2, bVar, mVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14224a(C2088r rVar) {
            if (rVar != null) {
                this.f1560a.add(rVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$b */
    private static final class C1920b extends C1918r {

        /* renamed from: a */
        private final String f3561a;

        C1920b(String str, C1409e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            this.f3561a = str;
        }

        public void run() {
            mo14222a(mo14223e(this.f3561a));
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$c */
    private static final class C1921c extends C1918r {

        /* renamed from: a */
        private final JSONObject f3562a;

        C1921c(C1409e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            this.f3562a = eVar.mo12676c();
        }

        public void run() {
            C1410f fVar;
            if (C2092v.m5047a()) {
                mo14142a("Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f3562a, "xml", (String) null);
            if (!StringUtils.isValidString(string)) {
                if (C2092v.m5047a()) {
                    mo14147d("No VAST response received.");
                }
                fVar = C1410f.NO_WRAPPER_RESPONSE;
            } else if (string.length() < ((Integer) this.f3467b.mo14311a(C1857b.f3311eh)).intValue()) {
                mo14222a(mo14223e(string));
                return;
            } else {
                if (C2092v.m5047a()) {
                    mo14147d("VAST response is over max length");
                }
                fVar = C1410f.XML_PARSING;
            }
            mo14221a(fVar);
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$d */
    private static final class C1922d extends C1918r {

        /* renamed from: a */
        private final C2088r f3563a;

        C1922d(C2088r rVar, C1409e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            if (rVar == null) {
                throw new IllegalArgumentException("No response specified.");
            } else if (eVar == null) {
                throw new IllegalArgumentException("No context specified.");
            } else if (appLovinAdLoadListener != null) {
                this.f3563a = rVar;
            } else {
                throw new IllegalArgumentException("No callback specified.");
            }
        }

        public void run() {
            if (C2092v.m5047a()) {
                mo14142a("Processing VAST Wrapper response...");
            }
            mo14222a(this.f3563a);
        }
    }

    C1918r(C1409e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        super("TaskProcessVastResponse", mVar);
        if (eVar != null) {
            this.f3559a = appLovinAdLoadListener;
            this.f3560c = (C1919a) eVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    /* renamed from: a */
    public static C1918r m4273a(C2088r rVar, C1409e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        return new C1922d(rVar, eVar, appLovinAdLoadListener, mVar);
    }

    /* renamed from: a */
    public static C1918r m4274a(String str, JSONObject jSONObject, JSONObject jSONObject2, C1825b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        return new C1920b(str, new C1919a(jSONObject, jSONObject2, bVar, mVar), appLovinAdLoadListener, mVar);
    }

    /* renamed from: a */
    public static C1918r m4275a(JSONObject jSONObject, JSONObject jSONObject2, C1825b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        return new C1921c(new C1919a(jSONObject, jSONObject2, bVar, mVar), appLovinAdLoadListener, mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14221a(C1410f fVar) {
        if (C2092v.m5047a()) {
            mo14147d("Failed to process VAST response due to VAST error code " + fVar);
        }
        C1417l.m2434a((C1409e) this.f3560c, this.f3559a, fVar, -6, this.f3467b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14222a(C2088r rVar) {
        C1410f fVar;
        C1877a aVar;
        int a = this.f3560c.mo12674a();
        if (C2092v.m5047a()) {
            mo14142a("Finished parsing XML at depth " + a);
        }
        this.f3560c.mo14224a(rVar);
        if (C1417l.m2440a(rVar)) {
            int intValue = ((Integer) this.f3467b.mo14311a(C1857b.f3312ei)).intValue();
            if (a < intValue) {
                if (C2092v.m5047a()) {
                    mo14142a("VAST response is wrapper. Resolving...");
                }
                aVar = new C1930x(this.f3560c, this.f3559a, this.f3467b);
            } else {
                if (C2092v.m5047a()) {
                    mo14147d("Reached beyond max wrapper depth of " + intValue);
                }
                fVar = C1410f.WRAPPER_LIMIT_REACHED;
                mo14221a(fVar);
                return;
            }
        } else if (C1417l.m2443b(rVar)) {
            if (C2092v.m5047a()) {
                mo14142a("VAST response is inline. Rendering ad...");
            }
            aVar = new C1924t(this.f3560c, this.f3559a, this.f3467b);
        } else {
            if (C2092v.m5047a()) {
                mo14147d("VAST response is an error");
            }
            fVar = C1410f.NO_WRAPPER_RESPONSE;
            mo14221a(fVar);
            return;
        }
        this.f3467b.mo14303S().mo14205a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C2088r mo14223e(String str) {
        try {
            return C2089s.m5032a(str, this.f3467b);
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                mo14143a("Failed to process VAST response", th);
            }
            mo14221a(C1410f.XML_PARSING);
            return null;
        }
    }
}
