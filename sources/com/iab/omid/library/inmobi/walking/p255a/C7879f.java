package com.iab.omid.library.inmobi.walking.p255a;

import android.text.TextUtils;
import com.iab.omid.library.inmobi.adsession.C7838a;
import com.iab.omid.library.inmobi.p251b.C7840a;
import com.iab.omid.library.inmobi.p253d.C7855b;
import com.iab.omid.library.inmobi.walking.p255a.C7873b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.a.f */
public class C7879f extends C7872a {
    public C7879f(C7873b.C7875b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22262b(String str) {
        C7840a a = C7840a.m22078a();
        if (a != null) {
            for (C7838a next : a.mo55196b()) {
                if (this.f18742a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55257a(str, this.f18744c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7855b.m22159b(this.f18743b, this.f18746d.mo55303b())) {
            return null;
        }
        this.f18746d.mo55302a(this.f18743b);
        return this.f18743b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m22262b(str);
        }
        super.onPostExecute(str);
    }
}
