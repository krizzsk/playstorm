package com.mbridge.msdk.foundation.p066db.p067a;

import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2381l;
import com.mbridge.msdk.foundation.same.p299a.C8415b;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.db.a.a */
/* compiled from: ReplaceTempDaoMiddle */
public final class C2366a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2381l f4960a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8415b f4961b;

    /* renamed from: com.mbridge.msdk.foundation.db.a.a$a */
    /* compiled from: ReplaceTempDaoMiddle */
    private static class C2368a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C2366a f4965a = new C2366a();
    }

    private C2366a() {
        this.f4961b = new C8415b(1000);
        C2381l a = C2381l.m5751a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
        this.f4960a = a;
        mo15842a(a.mo15914a(), false);
    }

    /* renamed from: a */
    public static C2366a m5655a() {
        return C2368a.f4965a;
    }

    /* renamed from: a */
    public final JSONObject mo15841a(String str) {
        JSONObject a = this.f4961b.mo15677b(str);
        if (a != null) {
            return a;
        }
        JSONObject a2 = this.f4960a.mo15915a(str);
        if (a2 != null) {
            this.f4961b.mo15675a(str, a2);
        }
        return a2;
    }

    /* renamed from: a */
    public final void mo15842a(final JSONObject jSONObject, final boolean z) {
        if (jSONObject != null) {
            C8442b.m24388a().execute(new Runnable() {
                public final void run() {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject optJSONObject = jSONObject.optJSONObject(next);
                        C2366a.this.f4961b.mo15675a(next, optJSONObject);
                        if (z) {
                            C2366a.this.f4960a.mo15916a(next, optJSONObject);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final JSONArray mo15843b() {
        return new JSONArray(this.f4961b.mo15673a());
    }
}
