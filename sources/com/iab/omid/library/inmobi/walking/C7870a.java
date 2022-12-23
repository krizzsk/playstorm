package com.iab.omid.library.inmobi.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.inmobi.adsession.C7838a;
import com.iab.omid.library.inmobi.p251b.C7840a;
import com.iab.omid.library.inmobi.p251b.C7843c;
import com.iab.omid.library.inmobi.p253d.C7860f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.inmobi.walking.a */
public class C7870a {

    /* renamed from: a */
    private final HashMap<View, String> f18732a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7871a> f18733b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18734c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18735d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18736e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18737f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18738g = new HashMap<>();

    /* renamed from: h */
    private boolean f18739h;

    /* renamed from: com.iab.omid.library.inmobi.walking.a$a */
    public static class C7871a {

        /* renamed from: a */
        private final C7843c f18740a;

        /* renamed from: b */
        private final ArrayList<String> f18741b = new ArrayList<>();

        public C7871a(C7843c cVar, String str) {
            this.f18740a = cVar;
            mo55295a(str);
        }

        /* renamed from: a */
        public C7843c mo55294a() {
            return this.f18740a;
        }

        /* renamed from: a */
        public void mo55295a(String str) {
            this.f18741b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55296b() {
            return this.f18741b;
        }
    }

    /* renamed from: a */
    private void m22233a(C7838a aVar) {
        for (C7843c a : aVar.mo55160a()) {
            m22234a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22234a(C7843c cVar, C7838a aVar) {
        View view = (View) cVar.mo55214a().get();
        if (view != null) {
            C7871a aVar2 = this.f18733b.get(view);
            if (aVar2 != null) {
                aVar2.mo55295a(aVar.getAdSessionId());
            } else {
                this.f18733b.put(view, new C7871a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m22235d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7860f.m22184e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18735d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo55284a(View view) {
        if (this.f18732a.size() == 0) {
            return null;
        }
        String str = this.f18732a.get(view);
        if (str != null) {
            this.f18732a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55285a(String str) {
        return this.f18738g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55286a() {
        return this.f18736e;
    }

    /* renamed from: b */
    public View mo55287b(String str) {
        return this.f18734c.get(str);
    }

    /* renamed from: b */
    public C7871a mo55288b(View view) {
        C7871a aVar = this.f18733b.get(view);
        if (aVar != null) {
            this.f18733b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55289b() {
        return this.f18737f;
    }

    /* renamed from: c */
    public C7881c mo55290c(View view) {
        return this.f18735d.contains(view) ? C7881c.PARENT_VIEW : this.f18739h ? C7881c.OBSTRUCTION_VIEW : C7881c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55291c() {
        C7840a a = C7840a.m22078a();
        if (a != null) {
            for (C7838a next : a.mo55198c()) {
                View d = next.mo55164d();
                if (next.mo55165e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m22235d(d);
                        if (d2 == null) {
                            this.f18736e.add(adSessionId);
                            this.f18732a.put(d, adSessionId);
                            m22233a(next);
                        } else {
                            this.f18737f.add(adSessionId);
                            this.f18734c.put(adSessionId, d);
                            this.f18738g.put(adSessionId, d2);
                        }
                    } else {
                        this.f18737f.add(adSessionId);
                        this.f18738g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55292d() {
        this.f18732a.clear();
        this.f18733b.clear();
        this.f18734c.clear();
        this.f18735d.clear();
        this.f18736e.clear();
        this.f18737f.clear();
        this.f18738g.clear();
        this.f18739h = false;
    }

    /* renamed from: e */
    public void mo55293e() {
        this.f18739h = true;
    }
}
