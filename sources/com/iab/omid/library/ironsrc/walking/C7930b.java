package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.p261a.C7923b;
import com.iab.omid.library.ironsrc.walking.p261a.C7926c;
import com.iab.omid.library.ironsrc.walking.p261a.C7927d;
import com.iab.omid.library.ironsrc.walking.p261a.C7928e;
import com.iab.omid.library.ironsrc.walking.p261a.C7929f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.b */
public class C7930b implements C7923b.C7925b {

    /* renamed from: a */
    private JSONObject f18865a;

    /* renamed from: b */
    private final C7926c f18866b;

    public C7930b(C7926c cVar) {
        this.f18866b = cVar;
    }

    /* renamed from: a */
    public void mo55497a() {
        this.f18866b.mo55490b(new C7927d(this));
    }

    /* renamed from: a */
    public void mo55488a(JSONObject jSONObject) {
        this.f18865a = jSONObject;
    }

    /* renamed from: a */
    public void mo55498a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18866b.mo55490b(new C7929f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55489b() {
        return this.f18865a;
    }

    /* renamed from: b */
    public void mo55499b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18866b.mo55490b(new C7928e(this, hashSet, jSONObject, j));
    }
}
