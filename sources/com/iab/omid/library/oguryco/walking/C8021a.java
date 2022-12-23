package com.iab.omid.library.oguryco.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.oguryco.adsession.C7988a;
import com.iab.omid.library.oguryco.p269b.C7990a;
import com.iab.omid.library.oguryco.p269b.C7994c;
import com.iab.omid.library.oguryco.p271d.C8011f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.oguryco.walking.a */
public class C8021a {

    /* renamed from: a */
    private final HashMap<View, String> f19084a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C8022a> f19085b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f19086c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f19087d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f19088e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f19089f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f19090g = new HashMap<>();

    /* renamed from: h */
    private boolean f19091h;

    /* renamed from: com.iab.omid.library.oguryco.walking.a$a */
    public static class C8022a {

        /* renamed from: a */
        private final C7994c f19092a;

        /* renamed from: b */
        private final ArrayList<String> f19093b = new ArrayList<>();

        public C8022a(C7994c cVar, String str) {
            this.f19092a = cVar;
            mo55894a(str);
        }

        /* renamed from: a */
        public C7994c mo55893a() {
            return this.f19092a;
        }

        /* renamed from: a */
        public void mo55894a(String str) {
            this.f19093b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo55895b() {
            return this.f19093b;
        }
    }

    /* renamed from: a */
    private void m22913a(C7988a aVar) {
        for (C7994c a : aVar.mo55741a()) {
            m22914a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22914a(C7994c cVar, C7988a aVar) {
        View view = (View) cVar.mo55813a().get();
        if (view != null) {
            C8022a aVar2 = this.f19085b.get(view);
            if (aVar2 != null) {
                aVar2.mo55894a(aVar.getAdSessionId());
            } else {
                this.f19085b.put(view, new C8022a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m22915d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C8011f.m22864e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f19087d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo55883a(View view) {
        if (this.f19084a.size() == 0) {
            return null;
        }
        String str = this.f19084a.get(view);
        if (str != null) {
            this.f19084a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo55884a(String str) {
        return this.f19090g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo55885a() {
        return this.f19088e;
    }

    /* renamed from: b */
    public View mo55886b(String str) {
        return this.f19086c.get(str);
    }

    /* renamed from: b */
    public C8022a mo55887b(View view) {
        C8022a aVar = this.f19085b.get(view);
        if (aVar != null) {
            this.f19085b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo55888b() {
        return this.f19089f;
    }

    /* renamed from: c */
    public C8032c mo55889c(View view) {
        return this.f19087d.contains(view) ? C8032c.PARENT_VIEW : this.f19091h ? C8032c.OBSTRUCTION_VIEW : C8032c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo55890c() {
        C7990a a = C7990a.m22755a();
        if (a != null) {
            for (C7988a next : a.mo55803c()) {
                View d = next.mo55745d();
                if (next.mo55746e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m22915d(d);
                        if (d2 == null) {
                            this.f19088e.add(adSessionId);
                            this.f19084a.put(d, adSessionId);
                            m22913a(next);
                        } else {
                            this.f19089f.add(adSessionId);
                            this.f19086c.put(adSessionId, d);
                            this.f19090g.put(adSessionId, d2);
                        }
                    } else {
                        this.f19089f.add(adSessionId);
                        this.f19090g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55891d() {
        this.f19084a.clear();
        this.f19085b.clear();
        this.f19086c.clear();
        this.f19087d.clear();
        this.f19088e.clear();
        this.f19089f.clear();
        this.f19090g.clear();
        this.f19091h = false;
    }

    /* renamed from: e */
    public void mo55892e() {
        this.f19091h = true;
    }
}
