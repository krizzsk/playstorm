package com.iab.omid.library.oguryco.walking;

import com.iab.omid.library.oguryco.walking.p273a.C8024b;
import com.iab.omid.library.oguryco.walking.p273a.C8027c;
import com.iab.omid.library.oguryco.walking.p273a.C8028d;
import com.iab.omid.library.oguryco.walking.p273a.C8029e;
import com.iab.omid.library.oguryco.walking.p273a.C8030f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.b */
public class C8031b implements C8024b.C8026b {

    /* renamed from: a */
    private JSONObject f19103a;

    /* renamed from: b */
    private final C8027c f19104b;

    public C8031b(C8027c cVar) {
        this.f19104b = cVar;
    }

    /* renamed from: a */
    public void mo55910a() {
        this.f19104b.mo55903b(new C8028d(this));
    }

    /* renamed from: a */
    public void mo55901a(JSONObject jSONObject) {
        this.f19103a = jSONObject;
    }

    /* renamed from: a */
    public void mo55911a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19104b.mo55903b(new C8030f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55902b() {
        return this.f19103a;
    }

    /* renamed from: b */
    public void mo55912b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19104b.mo55903b(new C8029e(this, hashSet, jSONObject, j));
    }
}
