package com.iab.omid.library.amazon.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.amazon.adsession.C7636a;
import com.iab.omid.library.amazon.p227b.C7638a;
import com.iab.omid.library.amazon.p227b.C7641c;
import com.iab.omid.library.amazon.p229d.C7658f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.amazon.walking.a */
public class C7668a {

    /* renamed from: a */
    private final HashMap<View, String> f18271a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7669a> f18272b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18273c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18274d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18275e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18276f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18277g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f18278h = new WeakHashMap();

    /* renamed from: i */
    private boolean f18279i;

    /* renamed from: com.iab.omid.library.amazon.walking.a$a */
    public static class C7669a {

        /* renamed from: a */
        private final C7641c f18280a;

        /* renamed from: b */
        private final ArrayList<String> f18281b = new ArrayList<>();

        public C7669a(C7641c cVar, String str) {
            this.f18280a = cVar;
            mo54509a(str);
        }

        /* renamed from: a */
        public C7641c mo54508a() {
            return this.f18280a;
        }

        /* renamed from: a */
        public void mo54509a(String str) {
            this.f18281b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo54510b() {
            return this.f18281b;
        }
    }

    /* renamed from: a */
    private void m21323a(C7636a aVar) {
        for (C7641c a : aVar.mo54371a()) {
            m21324a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m21324a(C7641c cVar, C7636a aVar) {
        View view = (View) cVar.mo54427a().get();
        if (view != null) {
            C7669a aVar2 = this.f18272b.get(view);
            if (aVar2 != null) {
                aVar2.mo54509a(aVar.getAdSessionId());
            } else {
                this.f18272b.put(view, new C7669a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m21325e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m21326f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7658f.m21274e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18274d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m21326f(View view) {
        if (view.hasWindowFocus()) {
            this.f18278h.remove(view);
            return false;
        } else if (this.f18278h.containsKey(view)) {
            return this.f18278h.get(view);
        } else {
            this.f18278h.put(view, false);
            return false;
        }
    }

    /* renamed from: a */
    public String mo54497a(View view) {
        if (this.f18271a.size() == 0) {
            return null;
        }
        String str = this.f18271a.get(view);
        if (str != null) {
            this.f18271a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo54498a(String str) {
        return this.f18277g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo54499a() {
        return this.f18275e;
    }

    /* renamed from: b */
    public View mo54500b(String str) {
        return this.f18273c.get(str);
    }

    /* renamed from: b */
    public C7669a mo54501b(View view) {
        C7669a aVar = this.f18272b.get(view);
        if (aVar != null) {
            this.f18272b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo54502b() {
        return this.f18276f;
    }

    /* renamed from: c */
    public C7679c mo54503c(View view) {
        return this.f18274d.contains(view) ? C7679c.PARENT_VIEW : this.f18279i ? C7679c.OBSTRUCTION_VIEW : C7679c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo54504c() {
        C7638a a = C7638a.m21166a();
        if (a != null) {
            for (C7636a next : a.mo54411c()) {
                View e = next.mo54377e();
                if (next.mo54378f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m21325e(e);
                        if (e2 == null) {
                            this.f18275e.add(adSessionId);
                            this.f18271a.put(e, adSessionId);
                            m21323a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f18276f.add(adSessionId);
                            this.f18273c.put(adSessionId, e);
                            this.f18277g.put(adSessionId, e2);
                        }
                    } else {
                        this.f18276f.add(adSessionId);
                        this.f18277g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo54505d() {
        this.f18271a.clear();
        this.f18272b.clear();
        this.f18273c.clear();
        this.f18274d.clear();
        this.f18275e.clear();
        this.f18276f.clear();
        this.f18277g.clear();
        this.f18279i = false;
    }

    /* renamed from: d */
    public boolean mo54506d(View view) {
        if (!this.f18278h.containsKey(view)) {
            return true;
        }
        this.f18278h.put(view, true);
        return false;
    }

    /* renamed from: e */
    public void mo54507e() {
        this.f18279i = true;
    }
}
