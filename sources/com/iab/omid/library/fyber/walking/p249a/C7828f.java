package com.iab.omid.library.fyber.walking.p249a;

import android.text.TextUtils;
import com.iab.omid.library.fyber.adsession.C7787a;
import com.iab.omid.library.fyber.p245b.C7789a;
import com.iab.omid.library.fyber.p247d.C7804b;
import com.iab.omid.library.fyber.walking.p249a.C7822b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.a.f */
public class C7828f extends C7821a {
    public C7828f(C7822b.C7824b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22038b(String str) {
        C7789a a = C7789a.m21850a();
        if (a != null) {
            for (C7787a next : a.mo55001b()) {
                if (this.f18629a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55062a(str, this.f18631c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7804b.m21932b(this.f18630b, this.f18633d.mo55109b())) {
            return null;
        }
        this.f18633d.mo55108a(this.f18630b);
        return this.f18630b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m22038b(str);
        }
        super.onPostExecute(str);
    }
}
