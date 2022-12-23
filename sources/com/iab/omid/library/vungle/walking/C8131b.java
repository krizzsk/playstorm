package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.p285a.C8124b;
import com.iab.omid.library.vungle.walking.p285a.C8127c;
import com.iab.omid.library.vungle.walking.p285a.C8128d;
import com.iab.omid.library.vungle.walking.p285a.C8129e;
import com.iab.omid.library.vungle.walking.p285a.C8130f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.b */
public class C8131b implements C8124b.C8126b {

    /* renamed from: a */
    private JSONObject f19329a;

    /* renamed from: b */
    private final C8127c f19330b;

    public C8131b(C8127c cVar) {
        this.f19330b = cVar;
    }

    /* renamed from: a */
    public void mo56298a() {
        this.f19330b.mo56291b(new C8128d(this));
    }

    /* renamed from: a */
    public void mo56289a(JSONObject jSONObject) {
        this.f19329a = jSONObject;
    }

    /* renamed from: a */
    public void mo56299a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19330b.mo56291b(new C8130f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo56290b() {
        return this.f19329a;
    }

    /* renamed from: b */
    public void mo56300b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19330b.mo56291b(new C8129e(this, hashSet, jSONObject, j));
    }
}
