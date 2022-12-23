package com.iab.omid.library.fyber.walking;

import com.iab.omid.library.fyber.walking.p249a.C7822b;
import com.iab.omid.library.fyber.walking.p249a.C7825c;
import com.iab.omid.library.fyber.walking.p249a.C7826d;
import com.iab.omid.library.fyber.walking.p249a.C7827e;
import com.iab.omid.library.fyber.walking.p249a.C7828f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.b */
public class C7829b implements C7822b.C7824b {

    /* renamed from: a */
    private JSONObject f18638a;

    /* renamed from: b */
    private final C7825c f18639b;

    public C7829b(C7825c cVar) {
        this.f18639b = cVar;
    }

    /* renamed from: a */
    public void mo55117a() {
        this.f18639b.mo55110b(new C7826d(this));
    }

    /* renamed from: a */
    public void mo55108a(JSONObject jSONObject) {
        this.f18638a = jSONObject;
    }

    /* renamed from: a */
    public void mo55118a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18639b.mo55110b(new C7828f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55109b() {
        return this.f18638a;
    }

    /* renamed from: b */
    public void mo55119b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18639b.mo55110b(new C7827e(this, hashSet, jSONObject, j));
    }
}
