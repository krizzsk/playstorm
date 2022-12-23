package com.iab.omid.library.adcolony.walking.p225a;

import com.iab.omid.library.adcolony.adsession.C7586a;
import com.iab.omid.library.adcolony.p221b.C7588a;
import com.iab.omid.library.adcolony.walking.p225a.C7621b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.e */
public class C7626e extends C7620a {
    public C7626e(C7621b.C7623b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21121b(String str) {
        C7588a a = C7588a.m20936a();
        if (a != null) {
            for (C7586a next : a.mo54210b()) {
                if (this.f18165a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54276b(str, this.f18167c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18166b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m21121b(str);
        super.onPostExecute(str);
    }
}
