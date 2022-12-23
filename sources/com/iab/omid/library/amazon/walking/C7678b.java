package com.iab.omid.library.amazon.walking;

import com.iab.omid.library.amazon.walking.p231a.C7671b;
import com.iab.omid.library.amazon.walking.p231a.C7674c;
import com.iab.omid.library.amazon.walking.p231a.C7675d;
import com.iab.omid.library.amazon.walking.p231a.C7676e;
import com.iab.omid.library.amazon.walking.p231a.C7677f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.b */
public class C7678b implements C7671b.C7673b {

    /* renamed from: a */
    private JSONObject f18291a;

    /* renamed from: b */
    private final C7674c f18292b;

    public C7678b(C7674c cVar) {
        this.f18292b = cVar;
    }

    /* renamed from: a */
    public void mo54525a() {
        this.f18292b.mo54518b(new C7675d(this));
    }

    /* renamed from: a */
    public void mo54516a(JSONObject jSONObject) {
        this.f18291a = jSONObject;
    }

    /* renamed from: a */
    public void mo54526a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18292b.mo54518b(new C7677f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo54517b() {
        return this.f18291a;
    }

    /* renamed from: b */
    public void mo54527b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18292b.mo54518b(new C7676e(this, hashSet, jSONObject, j));
    }
}
