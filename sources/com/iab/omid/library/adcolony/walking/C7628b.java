package com.iab.omid.library.adcolony.walking;

import com.iab.omid.library.adcolony.walking.p225a.C7621b;
import com.iab.omid.library.adcolony.walking.p225a.C7624c;
import com.iab.omid.library.adcolony.walking.p225a.C7625d;
import com.iab.omid.library.adcolony.walking.p225a.C7626e;
import com.iab.omid.library.adcolony.walking.p225a.C7627f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.b */
public class C7628b implements C7621b.C7623b {

    /* renamed from: a */
    private JSONObject f18174a;

    /* renamed from: b */
    private final C7624c f18175b;

    public C7628b(C7624c cVar) {
        this.f18175b = cVar;
    }

    /* renamed from: a */
    public void mo54326a() {
        this.f18175b.mo54319b(new C7625d(this));
    }

    /* renamed from: a */
    public void mo54317a(JSONObject jSONObject) {
        this.f18174a = jSONObject;
    }

    /* renamed from: a */
    public void mo54327a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18175b.mo54319b(new C7627f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo54318b() {
        return this.f18174a;
    }

    /* renamed from: b */
    public void mo54328b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18175b.mo54319b(new C7626e(this, hashSet, jSONObject, j));
    }
}
