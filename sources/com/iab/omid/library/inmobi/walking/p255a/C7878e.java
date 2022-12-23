package com.iab.omid.library.inmobi.walking.p255a;

import com.iab.omid.library.inmobi.adsession.C7838a;
import com.iab.omid.library.inmobi.p251b.C7840a;
import com.iab.omid.library.inmobi.walking.p255a.C7873b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.a.e */
public class C7878e extends C7872a {
    public C7878e(C7873b.C7875b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22259b(String str) {
        C7840a a = C7840a.m22078a();
        if (a != null) {
            for (C7838a next : a.mo55196b()) {
                if (this.f18742a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55262b(str, this.f18744c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18743b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m22259b(str);
        super.onPostExecute(str);
    }
}
