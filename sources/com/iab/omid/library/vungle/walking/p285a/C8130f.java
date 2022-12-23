package com.iab.omid.library.vungle.walking.p285a;

import android.text.TextUtils;
import com.iab.omid.library.vungle.adsession.C8089a;
import com.iab.omid.library.vungle.p281b.C8091a;
import com.iab.omid.library.vungle.p283d.C8106b;
import com.iab.omid.library.vungle.walking.p285a.C8124b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.a.f */
public class C8130f extends C8123a {
    public C8130f(C8124b.C8126b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m23390b(String str) {
        C8091a a = C8091a.m23206a();
        if (a != null) {
            for (C8089a next : a.mo56183b()) {
                if (this.f19320a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo56244a(str, this.f19322c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C8106b.m23287b(this.f19321b, this.f19324d.mo56290b())) {
            return null;
        }
        this.f19324d.mo56289a(this.f19321b);
        return this.f19321b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m23390b(str);
        }
        super.onPostExecute(str);
    }
}
