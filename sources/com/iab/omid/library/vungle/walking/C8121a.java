package com.iab.omid.library.vungle.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.vungle.adsession.C8089a;
import com.iab.omid.library.vungle.p281b.C8091a;
import com.iab.omid.library.vungle.p281b.C8094c;
import com.iab.omid.library.vungle.p283d.C8111f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.vungle.walking.a */
public class C8121a {

    /* renamed from: a */
    private final HashMap<View, String> f19310a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C8122a> f19311b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f19312c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f19313d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f19314e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f19315f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f19316g = new HashMap<>();

    /* renamed from: h */
    private boolean f19317h;

    /* renamed from: com.iab.omid.library.vungle.walking.a$a */
    public static class C8122a {

        /* renamed from: a */
        private final C8094c f19318a;

        /* renamed from: b */
        private final ArrayList<String> f19319b = new ArrayList<>();

        public C8122a(C8094c cVar, String str) {
            this.f19318a = cVar;
            mo56282a(str);
        }

        /* renamed from: a */
        public C8094c mo56281a() {
            return this.f19318a;
        }

        /* renamed from: a */
        public void mo56282a(String str) {
            this.f19319b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo56283b() {
            return this.f19319b;
        }
    }

    /* renamed from: a */
    private void m23361a(C8089a aVar) {
        for (C8094c a : aVar.mo56147a()) {
            m23362a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m23362a(C8094c cVar, C8089a aVar) {
        View view = (View) cVar.mo56201a().get();
        if (view != null) {
            C8122a aVar2 = this.f19311b.get(view);
            if (aVar2 != null) {
                aVar2.mo56282a(aVar.getAdSessionId());
            } else {
                this.f19311b.put(view, new C8122a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m23363d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C8111f.m23312e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f19313d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo56271a(View view) {
        if (this.f19310a.size() == 0) {
            return null;
        }
        String str = this.f19310a.get(view);
        if (str != null) {
            this.f19310a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo56272a(String str) {
        return this.f19316g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo56273a() {
        return this.f19314e;
    }

    /* renamed from: b */
    public View mo56274b(String str) {
        return this.f19312c.get(str);
    }

    /* renamed from: b */
    public C8122a mo56275b(View view) {
        C8122a aVar = this.f19311b.get(view);
        if (aVar != null) {
            this.f19311b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo56276b() {
        return this.f19315f;
    }

    /* renamed from: c */
    public C8132c mo56277c(View view) {
        return this.f19313d.contains(view) ? C8132c.PARENT_VIEW : this.f19317h ? C8132c.OBSTRUCTION_VIEW : C8132c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo56278c() {
        C8091a a = C8091a.m23206a();
        if (a != null) {
            for (C8089a next : a.mo56185c()) {
                View d = next.mo56151d();
                if (next.mo56152e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m23363d(d);
                        if (d2 == null) {
                            this.f19314e.add(adSessionId);
                            this.f19310a.put(d, adSessionId);
                            m23361a(next);
                        } else {
                            this.f19315f.add(adSessionId);
                            this.f19312c.put(adSessionId, d);
                            this.f19316g.put(adSessionId, d2);
                        }
                    } else {
                        this.f19315f.add(adSessionId);
                        this.f19316g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo56279d() {
        this.f19310a.clear();
        this.f19311b.clear();
        this.f19312c.clear();
        this.f19313d.clear();
        this.f19314e.clear();
        this.f19315f.clear();
        this.f19316g.clear();
        this.f19317h = false;
    }

    /* renamed from: e */
    public void mo56280e() {
        this.f19317h = true;
    }
}
