package com.iab.omid.library.mmadbridge.walking;

import com.iab.omid.library.mmadbridge.walking.p267a.C7973b;
import com.iab.omid.library.mmadbridge.walking.p267a.C7976c;
import com.iab.omid.library.mmadbridge.walking.p267a.C7977d;
import com.iab.omid.library.mmadbridge.walking.p267a.C7978e;
import com.iab.omid.library.mmadbridge.walking.p267a.C7979f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.b */
public class C7980b implements C7973b.C7975b {

    /* renamed from: a */
    private JSONObject f18982a;

    /* renamed from: b */
    private final C7976c f18983b;

    public C7980b(C7976c cVar) {
        this.f18983b = cVar;
    }

    /* renamed from: a */
    public void mo55696a() {
        this.f18983b.mo55689b(new C7977d(this));
    }

    /* renamed from: a */
    public void mo55687a(JSONObject jSONObject) {
        this.f18982a = jSONObject;
    }

    /* renamed from: a */
    public void mo55697a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18983b.mo55689b(new C7979f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55688b() {
        return this.f18982a;
    }

    /* renamed from: b */
    public void mo55698b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18983b.mo55689b(new C7978e(this, hashSet, jSONObject, j));
    }
}
