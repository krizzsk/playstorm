package com.iab.omid.library.smaato.walking.p279a;

import com.iab.omid.library.smaato.adsession.C8039a;
import com.iab.omid.library.smaato.p275b.C8041a;
import com.iab.omid.library.smaato.walking.p279a.C8074b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.a.e */
public class C8079e extends C8073a {
    public C8079e(C8074b.C8076b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m23163b(String str) {
        C8041a a = C8041a.m22982a();
        if (a != null) {
            for (C8039a next : a.mo55989b()) {
                if (this.f19207a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo56055b(str, this.f19209c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f19208b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m23163b(str);
        super.onPostExecute(str);
    }
}
