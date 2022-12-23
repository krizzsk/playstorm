package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.adsession.C7888a;
import com.iab.omid.library.ironsrc.p257b.C7890a;
import com.iab.omid.library.ironsrc.p257b.C7893c;
import com.iab.omid.library.ironsrc.p259d.C7910f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.ironsrc.walking.a */
public class C7920a {

    /* renamed from: a */
    private final HashMap<View, String> f18846a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7921a> f18847b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18848c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18849d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18850e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18851f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18852g = new HashMap<>();

    /* renamed from: h */
    private boolean f18853h;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a */
    public static class C7921a {

        /* renamed from: a */
        private final C7893c f18854a;

        /* renamed from: b */
        private final ArrayList<String> f18855b = new ArrayList<>();

        public C7921a(C7893c cVar, String str) {
            this.f18854a = cVar;
            mo55481a(str);
        }

        /* renamed from: a */
        public C7893c mo55480a() {
            return this.f18854a;
        }

        /* renamed from: a */
        public void mo55481a(String str) {
            this.f18855b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55482b() {
            return this.f18855b;
        }
    }

    /* renamed from: a */
    private void m22454a(C7888a aVar) {
        for (C7893c a : aVar.mo55354a()) {
            m22455a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22455a(C7893c cVar, C7888a aVar) {
        View view = (View) cVar.mo55400a().get();
        if (view != null) {
            C7921a aVar2 = this.f18847b.get(view);
            if (aVar2 != null) {
                aVar2.mo55481a(aVar.getAdSessionId());
            } else {
                this.f18847b.put(view, new C7921a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m22456d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7910f.m22405e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18849d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo55470a(View view) {
        if (this.f18846a.size() == 0) {
            return null;
        }
        String str = this.f18846a.get(view);
        if (str != null) {
            this.f18846a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55471a(String str) {
        return this.f18852g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55472a() {
        return this.f18850e;
    }

    /* renamed from: b */
    public View mo55473b(String str) {
        return this.f18848c.get(str);
    }

    /* renamed from: b */
    public C7921a mo55474b(View view) {
        C7921a aVar = this.f18847b.get(view);
        if (aVar != null) {
            this.f18847b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55475b() {
        return this.f18851f;
    }

    /* renamed from: c */
    public C7931c mo55476c(View view) {
        return this.f18849d.contains(view) ? C7931c.PARENT_VIEW : this.f18853h ? C7931c.OBSTRUCTION_VIEW : C7931c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55477c() {
        C7890a a = C7890a.m22302a();
        if (a != null) {
            for (C7888a next : a.mo55392c()) {
                View d = next.mo55358d();
                if (next.mo55359e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m22456d(d);
                        if (d2 == null) {
                            this.f18850e.add(adSessionId);
                            this.f18846a.put(d, adSessionId);
                            m22454a(next);
                        } else {
                            this.f18851f.add(adSessionId);
                            this.f18848c.put(adSessionId, d);
                            this.f18852g.put(adSessionId, d2);
                        }
                    } else {
                        this.f18851f.add(adSessionId);
                        this.f18852g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55478d() {
        this.f18846a.clear();
        this.f18847b.clear();
        this.f18848c.clear();
        this.f18849d.clear();
        this.f18850e.clear();
        this.f18851f.clear();
        this.f18852g.clear();
        this.f18853h = false;
    }

    /* renamed from: e */
    public void mo55479e() {
        this.f18853h = true;
    }
}
