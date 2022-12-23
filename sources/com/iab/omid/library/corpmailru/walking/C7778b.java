package com.iab.omid.library.corpmailru.walking;

import com.iab.omid.library.corpmailru.walking.p243a.C7771b;
import com.iab.omid.library.corpmailru.walking.p243a.C7774c;
import com.iab.omid.library.corpmailru.walking.p243a.C7775d;
import com.iab.omid.library.corpmailru.walking.p243a.C7776e;
import com.iab.omid.library.corpmailru.walking.p243a.C7777f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.b */
public class C7778b implements C7771b.C7773b {

    /* renamed from: a */
    private JSONObject f18521a;

    /* renamed from: b */
    private final C7774c f18522b;

    public C7778b(C7774c cVar) {
        this.f18522b = cVar;
    }

    /* renamed from: a */
    public void mo54918a() {
        this.f18522b.mo54911b(new C7775d(this));
    }

    /* renamed from: a */
    public void mo54909a(JSONObject jSONObject) {
        this.f18521a = jSONObject;
    }

    /* renamed from: a */
    public void mo54919a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18522b.mo54911b(new C7777f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo54910b() {
        return this.f18521a;
    }

    /* renamed from: b */
    public void mo54920b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18522b.mo54911b(new C7776e(this, hashSet, jSONObject, j));
    }
}
