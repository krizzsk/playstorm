package com.iab.omid.library.fyber.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.fyber.adsession.C7787a;
import com.iab.omid.library.fyber.p245b.C7789a;
import com.iab.omid.library.fyber.p245b.C7792c;
import com.iab.omid.library.fyber.p247d.C7809f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.fyber.walking.a */
public class C7819a {

    /* renamed from: a */
    private final HashMap<View, String> f18618a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7820a> f18619b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18620c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18621d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18622e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18623f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18624g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f18625h = new WeakHashMap();

    /* renamed from: i */
    private boolean f18626i;

    /* renamed from: com.iab.omid.library.fyber.walking.a$a */
    public static class C7820a {

        /* renamed from: a */
        private final C7792c f18627a;

        /* renamed from: b */
        private final ArrayList<String> f18628b = new ArrayList<>();

        public C7820a(C7792c cVar, String str) {
            this.f18627a = cVar;
            mo55101a(str);
        }

        /* renamed from: a */
        public C7792c mo55100a() {
            return this.f18627a;
        }

        /* renamed from: a */
        public void mo55101a(String str) {
            this.f18628b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55102b() {
            return this.f18628b;
        }
    }

    /* renamed from: a */
    private void m22007a(C7787a aVar) {
        for (C7792c a : aVar.mo54963a()) {
            m22008a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22008a(C7792c cVar, C7787a aVar) {
        View view = (View) cVar.mo55019a().get();
        if (view != null) {
            C7820a aVar2 = this.f18619b.get(view);
            if (aVar2 != null) {
                aVar2.mo55101a(aVar.getAdSessionId());
            } else {
                this.f18619b.put(view, new C7820a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: e */
    private String m22009e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (m22010f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7809f.m21958e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18621d.addAll(hashSet);
        return null;
    }

    /* renamed from: f */
    private Boolean m22010f(View view) {
        if (view.hasWindowFocus()) {
            this.f18625h.remove(view);
            return false;
        } else if (this.f18625h.containsKey(view)) {
            return this.f18625h.get(view);
        } else {
            this.f18625h.put(view, false);
            return false;
        }
    }

    /* renamed from: a */
    public String mo55089a(View view) {
        if (this.f18618a.size() == 0) {
            return null;
        }
        String str = this.f18618a.get(view);
        if (str != null) {
            this.f18618a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55090a(String str) {
        return this.f18624g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55091a() {
        return this.f18622e;
    }

    /* renamed from: b */
    public View mo55092b(String str) {
        return this.f18620c.get(str);
    }

    /* renamed from: b */
    public C7820a mo55093b(View view) {
        C7820a aVar = this.f18619b.get(view);
        if (aVar != null) {
            this.f18619b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55094b() {
        return this.f18623f;
    }

    /* renamed from: c */
    public C7830c mo55095c(View view) {
        return this.f18621d.contains(view) ? C7830c.PARENT_VIEW : this.f18626i ? C7830c.OBSTRUCTION_VIEW : C7830c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55096c() {
        C7789a a = C7789a.m21850a();
        if (a != null) {
            for (C7787a next : a.mo55003c()) {
                View e = next.mo54969e();
                if (next.mo54970f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e != null) {
                        String e2 = m22009e(e);
                        if (e2 == null) {
                            this.f18622e.add(adSessionId);
                            this.f18618a.put(e, adSessionId);
                            m22007a(next);
                        } else if (e2 != "noWindowFocus") {
                            this.f18623f.add(adSessionId);
                            this.f18620c.put(adSessionId, e);
                            this.f18624g.put(adSessionId, e2);
                        }
                    } else {
                        this.f18623f.add(adSessionId);
                        this.f18624g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55097d() {
        this.f18618a.clear();
        this.f18619b.clear();
        this.f18620c.clear();
        this.f18621d.clear();
        this.f18622e.clear();
        this.f18623f.clear();
        this.f18624g.clear();
        this.f18626i = false;
    }

    /* renamed from: d */
    public boolean mo55098d(View view) {
        if (!this.f18625h.containsKey(view)) {
            return true;
        }
        this.f18625h.put(view, true);
        return false;
    }

    /* renamed from: e */
    public void mo55099e() {
        this.f18626i = true;
    }
}
