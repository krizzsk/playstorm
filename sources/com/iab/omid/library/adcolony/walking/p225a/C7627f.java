package com.iab.omid.library.adcolony.walking.p225a;

import android.text.TextUtils;
import com.iab.omid.library.adcolony.adsession.C7586a;
import com.iab.omid.library.adcolony.p221b.C7588a;
import com.iab.omid.library.adcolony.p223d.C7603b;
import com.iab.omid.library.adcolony.walking.p225a.C7621b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.f */
public class C7627f extends C7620a {
    public C7627f(C7621b.C7623b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21124b(String str) {
        C7588a a = C7588a.m20936a();
        if (a != null) {
            for (C7586a next : a.mo54210b()) {
                if (this.f18165a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54271a(str, this.f18167c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7603b.m21018b(this.f18166b, this.f18169d.mo54318b())) {
            return null;
        }
        this.f18169d.mo54317a(this.f18166b);
        return this.f18166b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m21124b(str);
        }
        super.onPostExecute(str);
    }
}
