package com.iab.omid.library.corpmailru.walking.p243a;

import com.iab.omid.library.corpmailru.adsession.C7736a;
import com.iab.omid.library.corpmailru.p239b.C7738a;
import com.iab.omid.library.corpmailru.walking.p243a.C7771b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.e */
public class C7776e extends C7770a {
    public C7776e(C7771b.C7773b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21805b(String str) {
        C7738a a = C7738a.m21624a();
        if (a != null) {
            for (C7736a next : a.mo54803b()) {
                if (this.f18512a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54869b(str, this.f18514c);
                }
            }
        }
    }

    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18513b.toString();
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        m21805b(str);
        super.onPostExecute(str);
    }
}
