package com.iab.omid.library.applovin.walking.p237a;

import android.text.TextUtils;
import com.iab.omid.library.applovin.adsession.C7686a;
import com.iab.omid.library.applovin.p233b.C7688a;
import com.iab.omid.library.applovin.p235d.C7703b;
import com.iab.omid.library.applovin.walking.p237a.C7721b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.a.f */
public class C7727f extends C7720a {
    public C7727f(C7721b.C7723b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21584b(String str) {
        C7688a a = C7688a.m21396a();
        if (a != null) {
            for (C7686a next : a.mo54608b()) {
                if (this.f18399a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54669a(str, this.f18401c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7703b.m21478b(this.f18400b, this.f18403d.mo54716b())) {
            return null;
        }
        this.f18403d.mo54715a(this.f18400b);
        return this.f18400b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m21584b(str);
        }
        super.onPostExecute(str);
    }
}
