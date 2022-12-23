package com.iab.omid.library.vungle.walking.p285a;

import com.iab.omid.library.vungle.adsession.C8089a;
import com.iab.omid.library.vungle.p281b.C8091a;
import com.iab.omid.library.vungle.walking.p285a.C8124b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.a.e */
public class C8129e extends C8123a {
    public C8129e(C8124b.C8126b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m23387b(String str) {
        C8091a a = C8091a.m23206a();
        if (a != null) {
            for (C8089a next : a.mo56183b()) {
                if (this.f19320a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo56249b(str, this.f19322c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f19321b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m23387b(str);
        super.onPostExecute(str);
    }
}
