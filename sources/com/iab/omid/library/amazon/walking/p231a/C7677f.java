package com.iab.omid.library.amazon.walking.p231a;

import android.text.TextUtils;
import com.iab.omid.library.amazon.adsession.C7636a;
import com.iab.omid.library.amazon.p227b.C7638a;
import com.iab.omid.library.amazon.p229d.C7653b;
import com.iab.omid.library.amazon.walking.p231a.C7671b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.a.f */
public class C7677f extends C7670a {
    public C7677f(C7671b.C7673b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21354b(String str) {
        C7638a a = C7638a.m21166a();
        if (a != null) {
            for (C7636a next : a.mo54409b()) {
                if (this.f18282a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54470a(str, this.f18284c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7653b.m21248b(this.f18283b, this.f18286d.mo54517b())) {
            return null;
        }
        this.f18286d.mo54516a(this.f18283b);
        return this.f18283b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m21354b(str);
        }
        super.onPostExecute(str);
    }
}
