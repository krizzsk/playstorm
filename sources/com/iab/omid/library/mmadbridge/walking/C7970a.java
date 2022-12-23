package com.iab.omid.library.mmadbridge.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.mmadbridge.adsession.C7938a;
import com.iab.omid.library.mmadbridge.p263b.C7940a;
import com.iab.omid.library.mmadbridge.p263b.C7943c;
import com.iab.omid.library.mmadbridge.p265d.C7960f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a */
public class C7970a {

    /* renamed from: a */
    private final HashMap<View, String> f18962a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7971a> f18963b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18964c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18965d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18966e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18967f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18968g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f18969h = new WeakHashMap();

    /* renamed from: i */
    private boolean f18970i;

    /* renamed from: com.iab.omid.library.mmadbridge.walking.a$a */
    public static class C7971a {

        /* renamed from: a */
        private final C7943c f18971a;

        /* renamed from: b */
        private final ArrayList<String> f18972b = new ArrayList<>();

        public C7971a(C7943c cVar, String str) {
            this.f18971a = cVar;
            mo55680a(str);
        }

        /* renamed from: a */
        public C7943c mo55679a() {
            return this.f18971a;
        }

        /* renamed from: a */
        public void mo55680a(String str) {
            this.f18972b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55681b() {
            return this.f18972b;
        }
    }

    /* renamed from: a */
    private void m22682a(C7938a aVar) {
        for (C7943c a : aVar.mo55542a()) {
            m22683a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22683a(C7943c cVar, C7938a aVar) {
        View view = (View) cVar.mo55598a().get();
        if (view != null) {
            C7971a aVar2 = this.f18963b.get(view);
            if (aVar2 != null) {
                aVar2.mo55680a(aVar.getAdSessionId());
            } else {
                this.f18963b.put(view, new C7971a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m22684e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m22685f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7960f.m22633e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18965d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m22685f(View view) {
        if (view.hasWindowFocus()) {
            this.f18969h.remove(view);
            return false;
        } else if (this.f18969h.containsKey(view)) {
            return this.f18969h.get(view);
        } else {
            this.f18969h.put(view, false);
            return false;
        }
    }

    /* renamed from: a */
    public String mo55668a(View view) {
        if (this.f18962a.size() == 0) {
            return null;
        }
        String str = this.f18962a.get(view);
        if (str != null) {
            this.f18962a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55669a(String str) {
        return this.f18968g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55670a() {
        return this.f18966e;
    }

    /* renamed from: b */
    public View mo55671b(String str) {
        return this.f18964c.get(str);
    }

    /* renamed from: b */
    public C7971a mo55672b(View view) {
        C7971a aVar = this.f18963b.get(view);
        if (aVar != null) {
            this.f18963b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55673b() {
        return this.f18967f;
    }

    /* renamed from: c */
    public C7981c mo55674c(View view) {
        return this.f18965d.contains(view) ? C7981c.PARENT_VIEW : this.f18970i ? C7981c.OBSTRUCTION_VIEW : C7981c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55675c() {
        C7940a a = C7940a.m22525a();
        if (a != null) {
            for (C7938a next : a.mo55582c()) {
                View e = next.mo55548e();
                if (next.mo55549f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m22684e(e);
                        if (e2 == null) {
                            this.f18966e.add(adSessionId);
                            this.f18962a.put(e, adSessionId);
                            m22682a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f18967f.add(adSessionId);
                            this.f18964c.put(adSessionId, e);
                            this.f18968g.put(adSessionId, e2);
                        }
                    } else {
                        this.f18967f.add(adSessionId);
                        this.f18968g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55676d() {
        this.f18962a.clear();
        this.f18963b.clear();
        this.f18964c.clear();
        this.f18965d.clear();
        this.f18966e.clear();
        this.f18967f.clear();
        this.f18968g.clear();
        this.f18970i = false;
    }

    /* renamed from: d */
    public boolean mo55677d(View view) {
        if (!this.f18969h.containsKey(view)) {
            return true;
        }
        this.f18969h.put(view, true);
        return false;
    }

    /* renamed from: e */
    public void mo55678e() {
        this.f18970i = true;
    }
}
