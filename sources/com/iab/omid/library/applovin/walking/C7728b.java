package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.p237a.C7721b;
import com.iab.omid.library.applovin.walking.p237a.C7724c;
import com.iab.omid.library.applovin.walking.p237a.C7725d;
import com.iab.omid.library.applovin.walking.p237a.C7726e;
import com.iab.omid.library.applovin.walking.p237a.C7727f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.b */
public class C7728b implements C7721b.C7723b {

    /* renamed from: a */
    private JSONObject f18408a;

    /* renamed from: b */
    private final C7724c f18409b;

    public C7728b(C7724c cVar) {
        this.f18409b = cVar;
    }

    /* renamed from: a */
    public void mo54724a() {
        this.f18409b.mo54717b(new C7725d(this));
    }

    /* renamed from: a */
    public void mo54715a(JSONObject jSONObject) {
        this.f18408a = jSONObject;
    }

    /* renamed from: a */
    public void mo54725a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18409b.mo54717b(new C7727f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo54716b() {
        return this.f18408a;
    }

    /* renamed from: b */
    public void mo54726b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18409b.mo54717b(new C7726e(this, hashSet, jSONObject, j));
    }
}
