package com.iab.omid.library.adcolony.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.adcolony.adsession.C7586a;
import com.iab.omid.library.adcolony.p221b.C7588a;
import com.iab.omid.library.adcolony.p221b.C7591c;
import com.iab.omid.library.adcolony.p223d.C7608f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.adcolony.walking.a */
public class C7618a {

    /* renamed from: a */
    private final HashMap<View, String> f18154a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7619a> f18155b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18156c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18157d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18158e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18159f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18160g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f18161h = new WeakHashMap();

    /* renamed from: i */
    private boolean f18162i;

    /* renamed from: com.iab.omid.library.adcolony.walking.a$a */
    public static class C7619a {

        /* renamed from: a */
        private final C7591c f18163a;

        /* renamed from: b */
        private final ArrayList<String> f18164b = new ArrayList<>();

        public C7619a(C7591c cVar, String str) {
            this.f18163a = cVar;
            mo54310a(str);
        }

        /* renamed from: a */
        public C7591c mo54309a() {
            return this.f18163a;
        }

        /* renamed from: a */
        public void mo54310a(String str) {
            this.f18164b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo54311b() {
            return this.f18164b;
        }
    }

    /* renamed from: a */
    private void m21093a(C7586a aVar) {
        for (C7591c a : aVar.mo54172a()) {
            m21094a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m21094a(C7591c cVar, C7586a aVar) {
        View view = (View) cVar.mo54228a().get();
        if (view != null) {
            C7619a aVar2 = this.f18155b.get(view);
            if (aVar2 != null) {
                aVar2.mo54310a(aVar.getAdSessionId());
            } else {
                this.f18155b.put(view, new C7619a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m21095e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m21096f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7608f.m21044e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18157d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m21096f(View view) {
        if (view.hasWindowFocus()) {
            this.f18161h.remove(view);
            return Boolean.FALSE;
        } else if (this.f18161h.containsKey(view)) {
            return this.f18161h.get(view);
        } else {
            Map<View, Boolean> map = this.f18161h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public String mo54298a(View view) {
        if (this.f18154a.size() == 0) {
            return null;
        }
        String str = this.f18154a.get(view);
        if (str != null) {
            this.f18154a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo54299a(String str) {
        return this.f18160g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo54300a() {
        return this.f18158e;
    }

    /* renamed from: b */
    public View mo54301b(String str) {
        return this.f18156c.get(str);
    }

    /* renamed from: b */
    public C7619a mo54302b(View view) {
        C7619a aVar = this.f18155b.get(view);
        if (aVar != null) {
            this.f18155b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo54303b() {
        return this.f18159f;
    }

    /* renamed from: c */
    public C7629c mo54304c(View view) {
        return this.f18157d.contains(view) ? C7629c.PARENT_VIEW : this.f18162i ? C7629c.OBSTRUCTION_VIEW : C7629c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo54305c() {
        C7588a a = C7588a.m20936a();
        if (a != null) {
            for (C7586a next : a.mo54212c()) {
                View e = next.mo54178e();
                if (next.mo54179f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m21095e(e);
                        if (e2 == null) {
                            this.f18158e.add(adSessionId);
                            this.f18154a.put(e, adSessionId);
                            m21093a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f18159f.add(adSessionId);
                            this.f18156c.put(adSessionId, e);
                            this.f18160g.put(adSessionId, e2);
                        }
                    } else {
                        this.f18159f.add(adSessionId);
                        this.f18160g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo54306d() {
        this.f18154a.clear();
        this.f18155b.clear();
        this.f18156c.clear();
        this.f18157d.clear();
        this.f18158e.clear();
        this.f18159f.clear();
        this.f18160g.clear();
        this.f18162i = false;
    }

    /* renamed from: d */
    public boolean mo54307d(View view) {
        if (!this.f18161h.containsKey(view)) {
            return true;
        }
        this.f18161h.put(view, Boolean.TRUE);
        return false;
    }

    /* renamed from: e */
    public void mo54308e() {
        this.f18162i = true;
    }
}
