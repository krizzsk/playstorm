package com.iab.omid.library.amazon.walking.p231a;

import com.iab.omid.library.amazon.adsession.C7636a;
import com.iab.omid.library.amazon.p227b.C7638a;
import com.iab.omid.library.amazon.walking.p231a.C7671b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.a.e */
public class C7676e extends C7670a {
    public C7676e(C7671b.C7673b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21351b(String str) {
        C7638a a = C7638a.m21166a();
        if (a != null) {
            for (C7636a next : a.mo54409b()) {
                if (this.f18282a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54475b(str, this.f18284c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18283b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m21351b(str);
        super.onPostExecute(str);
    }
}
