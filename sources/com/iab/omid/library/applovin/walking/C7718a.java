package com.iab.omid.library.applovin.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.adsession.C7686a;
import com.iab.omid.library.applovin.p233b.C7688a;
import com.iab.omid.library.applovin.p233b.C7691c;
import com.iab.omid.library.applovin.p235d.C7708f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.applovin.walking.a */
public class C7718a {

    /* renamed from: a */
    private final HashMap<View, String> f18388a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7719a> f18389b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18390c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18391d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18392e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18393f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18394g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f18395h = new WeakHashMap();

    /* renamed from: i */
    private boolean f18396i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a */
    public static class C7719a {

        /* renamed from: a */
        private final C7691c f18397a;

        /* renamed from: b */
        private final ArrayList<String> f18398b = new ArrayList<>();

        public C7719a(C7691c cVar, String str) {
            this.f18397a = cVar;
            mo54708a(str);
        }

        /* renamed from: a */
        public C7691c mo54707a() {
            return this.f18397a;
        }

        /* renamed from: a */
        public void mo54708a(String str) {
            this.f18398b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo54709b() {
            return this.f18398b;
        }
    }

    /* renamed from: a */
    private void m21553a(C7686a aVar) {
        for (C7691c a : aVar.mo54570a()) {
            m21554a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m21554a(C7691c cVar, C7686a aVar) {
        View view = (View) cVar.mo54626a().get();
        if (view != null) {
            C7719a aVar2 = this.f18389b.get(view);
            if (aVar2 != null) {
                aVar2.mo54708a(aVar.getAdSessionId());
            } else {
                this.f18389b.put(view, new C7719a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m21555e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m21556f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7708f.m21504e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18391d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m21556f(View view) {
        if (view.hasWindowFocus()) {
            this.f18395h.remove(view);
            return false;
        } else if (this.f18395h.containsKey(view)) {
            return this.f18395h.get(view);
        } else {
            this.f18395h.put(view, false);
            return false;
        }
    }

    /* renamed from: a */
    public String mo54696a(View view) {
        if (this.f18388a.size() == 0) {
            return null;
        }
        String str = this.f18388a.get(view);
        if (str != null) {
            this.f18388a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo54697a(String str) {
        return this.f18394g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo54698a() {
        return this.f18392e;
    }

    /* renamed from: b */
    public View mo54699b(String str) {
        return this.f18390c.get(str);
    }

    /* renamed from: b */
    public C7719a mo54700b(View view) {
        C7719a aVar = this.f18389b.get(view);
        if (aVar != null) {
            this.f18389b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo54701b() {
        return this.f18393f;
    }

    /* renamed from: c */
    public C7729c mo54702c(View view) {
        return this.f18391d.contains(view) ? C7729c.PARENT_VIEW : this.f18396i ? C7729c.OBSTRUCTION_VIEW : C7729c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo54703c() {
        C7688a a = C7688a.m21396a();
        if (a != null) {
            for (C7686a next : a.mo54610c()) {
                View e = next.mo54576e();
                if (next.mo54577f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m21555e(e);
                        if (e2 == null) {
                            this.f18392e.add(adSessionId);
                            this.f18388a.put(e, adSessionId);
                            m21553a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f18393f.add(adSessionId);
                            this.f18390c.put(adSessionId, e);
                            this.f18394g.put(adSessionId, e2);
                        }
                    } else {
                        this.f18393f.add(adSessionId);
                        this.f18394g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo54704d() {
        this.f18388a.clear();
        this.f18389b.clear();
        this.f18390c.clear();
        this.f18391d.clear();
        this.f18392e.clear();
        this.f18393f.clear();
        this.f18394g.clear();
        this.f18396i = false;
    }

    /* renamed from: d */
    public boolean mo54705d(View view) {
        if (!this.f18395h.containsKey(view)) {
            return true;
        }
        this.f18395h.put(view, true);
        return false;
    }

    /* renamed from: e */
    public void mo54706e() {
        this.f18396i = true;
    }
}
