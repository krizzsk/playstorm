package com.applovin.impl.sdk.p050e;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1985b;
import com.applovin.impl.sdk.p047b.C1854c;
import com.applovin.impl.sdk.p048c.C1857b;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.ab */
public abstract class C1879ab extends C1932y {
    protected C1879ab(String str, C1959m mVar) {
        super(str, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4142b(JSONObject jSONObject) {
        C1854c c = m4143c(jSONObject);
        if (c != null) {
            mo13379a(c);
            if (C2092v.m5047a()) {
                mo14142a("Pending reward handled: " + c);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3 = java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0020 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.sdk.p047b.C1854c m4143c(org.json.JSONObject r3) {
        /*
            r2 = this;
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.C2040h.m4895a((org.json.JSONObject) r3)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.m r1 = r2.f3467b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.C2040h.m4905d(r0, r1)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.m r1 = r2.f3467b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.C2040h.m4904c(r3, r1)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.m r1 = r2.f3467b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.C2040h.m4907e(r3, r1)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r3 = "params"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0020 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ all -> 0x0020 }
            java.util.Map r3 = com.applovin.impl.sdk.utils.JsonUtils.toStringMap(r3)     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x0032 }
        L_0x0024:
            java.lang.String r1 = "result"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x002b }
            goto L_0x002d
        L_0x002b:
            java.lang.String r0 = "network_timeout"
        L_0x002d:
            com.applovin.impl.sdk.b.c r3 = com.applovin.impl.sdk.p047b.C1854c.m4012a(r0, r3)     // Catch:{ JSONException -> 0x0032 }
            return r3
        L_0x0032:
            r3 = move-exception
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "Unable to parse API response"
            r2.mo14143a(r0, r3)
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p050e.C1879ab.m4143c(org.json.JSONObject):com.applovin.impl.sdk.b.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13379a(C1854c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo13380b();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo14151h() {
        return ((Integer) this.f3467b.mo14311a(C1857b.f3168bs)).intValue();
    }

    public void run() {
        mo14240a(mo14241i(), new C1985b.C1989c<JSONObject>() {
            /* renamed from: a */
            public void mo13362a(int i, String str, JSONObject jSONObject) {
                if (!C1879ab.this.mo13380b()) {
                    if (C2092v.m5047a()) {
                        C1879ab abVar = C1879ab.this;
                        abVar.mo14147d("Reward validation failed with code " + i + " and error: " + str);
                    }
                    C1879ab.this.mo13374a(i);
                } else if (C2092v.m5047a()) {
                    C1879ab abVar2 = C1879ab.this;
                    abVar2.mo14147d("Reward validation failed with error code " + i + " but task was cancelled already");
                }
            }

            /* renamed from: a */
            public void mo13364a(JSONObject jSONObject, int i) {
                if (!C1879ab.this.mo13380b()) {
                    if (C2092v.m5047a()) {
                        C1879ab abVar = C1879ab.this;
                        abVar.mo14142a("Reward validation succeeded with code " + i + " and response: " + jSONObject);
                    }
                    C1879ab.this.m4142b(jSONObject);
                } else if (C2092v.m5047a()) {
                    C1879ab abVar2 = C1879ab.this;
                    abVar2.mo14147d("Reward validation succeeded with code " + i + " but task was cancelled already");
                    C1879ab abVar3 = C1879ab.this;
                    abVar3.mo14147d("Response: " + jSONObject);
                }
            }
        });
    }
}
