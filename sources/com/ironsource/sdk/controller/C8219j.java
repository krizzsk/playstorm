package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.p293g.C8342c;
import com.ironsource.sdk.p293g.C8343d;
import com.ironsource.sdk.p296j.C8360a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.controller.j */
public final class C8219j {

    /* renamed from: a */
    private final Map<String, C8342c> f19648a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, C8342c> f19649b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, C8342c> f19650c = new LinkedHashMap();

    /* renamed from: a */
    public final C8342c mo56571a(C8343d.C8348e eVar, String str) {
        Map<String, C8342c> a;
        if (TextUtils.isEmpty(str) || (a = mo56573a(eVar)) == null) {
            return null;
        }
        return a.get(str);
    }

    /* renamed from: a */
    public final C8342c mo56572a(C8343d.C8348e eVar, String str, Map<String, String> map, C8360a aVar) {
        C8342c cVar = new C8342c(str, str, map, aVar);
        mo56574a(eVar, str, cVar);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, C8342c> mo56573a(C8343d.C8348e eVar) {
        if (eVar.name().equalsIgnoreCase(C8343d.C8348e.RewardedVideo.name())) {
            return this.f19648a;
        }
        if (eVar.name().equalsIgnoreCase(C8343d.C8348e.Interstitial.name())) {
            return this.f19649b;
        }
        if (eVar.name().equalsIgnoreCase(C8343d.C8348e.Banner.name())) {
            return this.f19650c;
        }
        return null;
    }

    /* renamed from: a */
    public void mo56574a(C8343d.C8348e eVar, String str, C8342c cVar) {
        Map<String, C8342c> a;
        if (!TextUtils.isEmpty(str) && (a = mo56573a(eVar)) != null) {
            a.put(str, cVar);
        }
    }

    /* renamed from: b */
    public final Collection<C8342c> mo56575b(C8343d.C8348e eVar) {
        Map<String, C8342c> a = mo56573a(eVar);
        return a != null ? a.values() : new ArrayList();
    }
}
