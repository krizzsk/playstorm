package com.iab.omid.library.smaato.walking.p279a;

import android.text.TextUtils;
import com.iab.omid.library.smaato.adsession.C8039a;
import com.iab.omid.library.smaato.p275b.C8041a;
import com.iab.omid.library.smaato.p277d.C8056b;
import com.iab.omid.library.smaato.walking.p279a.C8074b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.a.f */
public class C8080f extends C8073a {
    public C8080f(C8074b.C8076b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m23166b(String str) {
        C8041a a = C8041a.m22982a();
        if (a != null) {
            for (C8039a next : a.mo55989b()) {
                if (this.f19207a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo56050a(str, this.f19209c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C8056b.m23063b(this.f19208b, this.f19211d.mo56096b())) {
            return null;
        }
        this.f19211d.mo56095a(this.f19208b);
        return this.f19208b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m23166b(str);
        }
        super.onPostExecute(str);
    }
}
