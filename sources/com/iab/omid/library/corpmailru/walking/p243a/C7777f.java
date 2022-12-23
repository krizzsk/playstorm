package com.iab.omid.library.corpmailru.walking.p243a;

import android.text.TextUtils;
import com.iab.omid.library.corpmailru.adsession.C7736a;
import com.iab.omid.library.corpmailru.p239b.C7738a;
import com.iab.omid.library.corpmailru.p241d.C7753b;
import com.iab.omid.library.corpmailru.walking.p243a.C7771b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.f */
public class C7777f extends C7770a {
    public C7777f(C7771b.C7773b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21808b(String str) {
        C7738a a = C7738a.m21624a();
        if (a != null) {
            for (C7736a next : a.mo54803b()) {
                if (this.f18512a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54864a(str, this.f18514c);
                }
            }
        }
    }

    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7753b.m21705b(this.f18513b, this.f18516d.mo54910b())) {
            return null;
        }
        this.f18516d.mo54909a(this.f18513b);
        return this.f18513b.toString();
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m21808b(str);
        }
        super.onPostExecute(str);
    }
}
