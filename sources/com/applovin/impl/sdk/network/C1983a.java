package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1925u;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.a */
public class C1983a extends C1877a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f3770a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1990c<JSONObject> f3771c;

    public C1983a(String str, C1990c<JSONObject> cVar, C1959m mVar) {
        super("CommunicatorRequestTask:" + str, mVar);
        this.f3770a = str;
        this.f3771c = cVar;
    }

    public void run() {
        this.f3467b.mo14303S().mo14205a((C1877a) new C1925u<JSONObject>(this.f3771c, this.f3467b, mo14150g()) {
            /* renamed from: a */
            public void mo13362a(int i, String str, JSONObject jSONObject) {
                this.f3467b.mo14334ag().mo14262a(C1983a.this.f3770a, C1983a.this.f3771c.mo14478a(), i, jSONObject, str, false);
            }

            /* renamed from: a */
            public void mo13364a(JSONObject jSONObject, int i) {
                this.f3467b.mo14334ag().mo14262a(C1983a.this.f3770a, C1983a.this.f3771c.mo14478a(), i, jSONObject, (String) null, true);
            }
        });
    }
}
