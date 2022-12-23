package com.iab.omid.library.fyber.walking.p249a;

import com.iab.omid.library.fyber.adsession.C7787a;
import com.iab.omid.library.fyber.p245b.C7789a;
import com.iab.omid.library.fyber.walking.p249a.C7822b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.a.e */
public class C7827e extends C7821a {
    public C7827e(C7822b.C7824b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22035b(String str) {
        C7789a a = C7789a.m21850a();
        if (a != null) {
            for (C7787a next : a.mo55001b()) {
                if (this.f18629a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55067b(str, this.f18631c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18630b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m22035b(str);
        super.onPostExecute(str);
    }
}
