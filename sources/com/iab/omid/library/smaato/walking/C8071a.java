package com.iab.omid.library.smaato.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.smaato.adsession.C8039a;
import com.iab.omid.library.smaato.p275b.C8041a;
import com.iab.omid.library.smaato.p275b.C8044c;
import com.iab.omid.library.smaato.p277d.C8061f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.smaato.walking.a */
public class C8071a {

    /* renamed from: a */
    private final HashMap<View, String> f19197a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C8072a> f19198b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f19199c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f19200d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f19201e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f19202f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f19203g = new HashMap<>();

    /* renamed from: h */
    private boolean f19204h;

    /* renamed from: com.iab.omid.library.smaato.walking.a$a */
    public static class C8072a {

        /* renamed from: a */
        private final C8044c f19205a;

        /* renamed from: b */
        private final ArrayList<String> f19206b = new ArrayList<>();

        public C8072a(C8044c cVar, String str) {
            this.f19205a = cVar;
            mo56088a(str);
        }

        /* renamed from: a */
        public C8044c mo56087a() {
            return this.f19205a;
        }

        /* renamed from: a */
        public void mo56088a(String str) {
            this.f19206b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo56089b() {
            return this.f19206b;
        }
    }

    /* renamed from: a */
    private void m23137a(C8039a aVar) {
        for (C8044c a : aVar.mo55953a()) {
            m23138a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m23138a(C8044c cVar, C8039a aVar) {
        View view = (View) cVar.mo56007a().get();
        if (view != null) {
            C8072a aVar2 = this.f19198b.get(view);
            if (aVar2 != null) {
                aVar2.mo56088a(aVar.getAdSessionId());
            } else {
                this.f19198b.put(view, new C8072a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m23139d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C8061f.m23088e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f19200d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo56077a(View view) {
        if (this.f19197a.size() == 0) {
            return null;
        }
        String str = this.f19197a.get(view);
        if (str != null) {
            this.f19197a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo56078a(String str) {
        return this.f19203g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo56079a() {
        return this.f19201e;
    }

    /* renamed from: b */
    public View mo56080b(String str) {
        return this.f19199c.get(str);
    }

    /* renamed from: b */
    public C8072a mo56081b(View view) {
        C8072a aVar = this.f19198b.get(view);
        if (aVar != null) {
            this.f19198b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo56082b() {
        return this.f19202f;
    }

    /* renamed from: c */
    public C8082c mo56083c(View view) {
        return this.f19200d.contains(view) ? C8082c.PARENT_VIEW : this.f19204h ? C8082c.OBSTRUCTION_VIEW : C8082c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo56084c() {
        C8041a a = C8041a.m22982a();
        if (a != null) {
            for (C8039a next : a.mo55991c()) {
                View d = next.mo55957d();
                if (next.mo55958e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m23139d(d);
                        if (d2 == null) {
                            this.f19201e.add(adSessionId);
                            this.f19197a.put(d, adSessionId);
                            m23137a(next);
                        } else {
                            this.f19202f.add(adSessionId);
                            this.f19199c.put(adSessionId, d);
                            this.f19203g.put(adSessionId, d2);
                        }
                    } else {
                        this.f19202f.add(adSessionId);
                        this.f19203g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo56085d() {
        this.f19197a.clear();
        this.f19198b.clear();
        this.f19199c.clear();
        this.f19200d.clear();
        this.f19201e.clear();
        this.f19202f.clear();
        this.f19203g.clear();
        this.f19204h = false;
    }

    /* renamed from: e */
    public void mo56086e() {
        this.f19204h = true;
    }
}
