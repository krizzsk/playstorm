package com.iab.omid.library.mmadbridge.walking.p267a;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.adsession.C7938a;
import com.iab.omid.library.mmadbridge.p263b.C7940a;
import com.iab.omid.library.mmadbridge.p265d.C7955b;
import com.iab.omid.library.mmadbridge.walking.p267a.C7973b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a.f */
public class C7979f extends C7972a {
    public C7979f(C7973b.C7975b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22713b(String str) {
        C7940a a = C7940a.m22525a();
        if (a != null) {
            for (C7938a next : a.mo55580b()) {
                if (this.f18973a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55641a(str, this.f18975c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7955b.m22607b(this.f18974b, this.f18977d.mo55688b())) {
            return null;
        }
        this.f18977d.mo55687a(this.f18974b);
        return this.f18974b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m22713b(str);
        }
        super.onPostExecute(str);
    }
}
