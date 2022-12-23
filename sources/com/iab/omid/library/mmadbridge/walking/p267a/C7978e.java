package com.iab.omid.library.mmadbridge.walking.p267a;

import com.iab.omid.library.mmadbridge.adsession.C7938a;
import com.iab.omid.library.mmadbridge.p263b.C7940a;
import com.iab.omid.library.mmadbridge.walking.p267a.C7973b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a.e */
public class C7978e extends C7972a {
    public C7978e(C7973b.C7975b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22710b(String str) {
        C7940a a = C7940a.m22525a();
        if (a != null) {
            for (C7938a next : a.mo55580b()) {
                if (this.f18973a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55646b(str, this.f18975c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18974b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m22710b(str);
        super.onPostExecute(str);
    }
}
