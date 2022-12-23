package com.iab.omid.library.oguryco.walking.p273a;

import com.iab.omid.library.oguryco.adsession.C7988a;
import com.iab.omid.library.oguryco.p269b.C7990a;
import com.iab.omid.library.oguryco.walking.p273a.C8024b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.a.e */
public class C8029e extends C8023a {
    public C8029e(C8024b.C8026b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22939b(String str) {
        C7990a a = C7990a.m22755a();
        if (a != null) {
            for (C7988a next : a.mo55801b()) {
                if (this.f19094a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55861b(str, this.f19096c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f19095b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m22939b(str);
        super.onPostExecute(str);
    }
}
