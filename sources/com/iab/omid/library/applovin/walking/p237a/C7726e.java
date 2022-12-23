package com.iab.omid.library.applovin.walking.p237a;

import com.iab.omid.library.applovin.adsession.C7686a;
import com.iab.omid.library.applovin.p233b.C7688a;
import com.iab.omid.library.applovin.walking.p237a.C7721b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.a.e */
public class C7726e extends C7720a {
    public C7726e(C7721b.C7723b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21581b(String str) {
        C7688a a = C7688a.m21396a();
        if (a != null) {
            for (C7686a next : a.mo54608b()) {
                if (this.f18399a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54674b(str, this.f18401c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18400b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m21581b(str);
        super.onPostExecute(str);
    }
}
