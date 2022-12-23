package com.iab.omid.library.smaato.walking;

import com.iab.omid.library.smaato.walking.p279a.C8074b;
import com.iab.omid.library.smaato.walking.p279a.C8077c;
import com.iab.omid.library.smaato.walking.p279a.C8078d;
import com.iab.omid.library.smaato.walking.p279a.C8079e;
import com.iab.omid.library.smaato.walking.p279a.C8080f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.b */
public class C8081b implements C8074b.C8076b {

    /* renamed from: a */
    private JSONObject f19216a;

    /* renamed from: b */
    private final C8077c f19217b;

    public C8081b(C8077c cVar) {
        this.f19217b = cVar;
    }

    /* renamed from: a */
    public void mo56104a() {
        this.f19217b.mo56097b(new C8078d(this));
    }

    /* renamed from: a */
    public void mo56095a(JSONObject jSONObject) {
        this.f19216a = jSONObject;
    }

    /* renamed from: a */
    public void mo56105a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19217b.mo56097b(new C8080f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo56096b() {
        return this.f19216a;
    }

    /* renamed from: b */
    public void mo56106b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19217b.mo56097b(new C8079e(this, hashSet, jSONObject, j));
    }
}
