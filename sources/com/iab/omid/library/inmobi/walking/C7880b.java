package com.iab.omid.library.inmobi.walking;

import com.iab.omid.library.inmobi.walking.p255a.C7873b;
import com.iab.omid.library.inmobi.walking.p255a.C7876c;
import com.iab.omid.library.inmobi.walking.p255a.C7877d;
import com.iab.omid.library.inmobi.walking.p255a.C7878e;
import com.iab.omid.library.inmobi.walking.p255a.C7879f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.b */
public class C7880b implements C7873b.C7875b {

    /* renamed from: a */
    private JSONObject f18751a;

    /* renamed from: b */
    private final C7876c f18752b;

    public C7880b(C7876c cVar) {
        this.f18752b = cVar;
    }

    /* renamed from: a */
    public void mo55311a() {
        this.f18752b.mo55304b(new C7877d(this));
    }

    /* renamed from: a */
    public void mo55302a(JSONObject jSONObject) {
        this.f18751a = jSONObject;
    }

    /* renamed from: a */
    public void mo55312a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18752b.mo55304b(new C7879f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55303b() {
        return this.f18751a;
    }

    /* renamed from: b */
    public void mo55313b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18752b.mo55304b(new C7878e(this, hashSet, jSONObject, j));
    }
}
