package com.iab.omid.library.ironsrc.walking.p261a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.adsession.C7888a;
import com.iab.omid.library.ironsrc.p257b.C7890a;
import com.iab.omid.library.ironsrc.p259d.C7905b;
import com.iab.omid.library.ironsrc.walking.p261a.C7923b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.f */
public class C7929f extends C7922a {
    public C7929f(C7923b.C7925b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22483b(String str) {
        C7890a a = C7890a.m22302a();
        if (a != null) {
            for (C7888a next : a.mo55390b()) {
                if (this.f18856a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55443a(str, this.f18858c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7905b.m22380b(this.f18857b, this.f18860d.mo55489b())) {
            return null;
        }
        this.f18860d.mo55488a(this.f18857b);
        return this.f18857b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m22483b(str);
        }
        super.onPostExecute(str);
    }
}
