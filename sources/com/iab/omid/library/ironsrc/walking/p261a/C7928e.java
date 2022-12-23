package com.iab.omid.library.ironsrc.walking.p261a;

import com.iab.omid.library.ironsrc.adsession.C7888a;
import com.iab.omid.library.ironsrc.p257b.C7890a;
import com.iab.omid.library.ironsrc.walking.p261a.C7923b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.e */
public class C7928e extends C7922a {
    public C7928e(C7923b.C7925b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22480b(String str) {
        C7890a a = C7890a.m22302a();
        if (a != null) {
            for (C7888a next : a.mo55390b()) {
                if (this.f18856a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55448b(str, this.f18858c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18857b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m22480b(str);
        super.onPostExecute(str);
    }
}
