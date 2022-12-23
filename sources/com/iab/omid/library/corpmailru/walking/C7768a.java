package com.iab.omid.library.corpmailru.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.corpmailru.adsession.C7736a;
import com.iab.omid.library.corpmailru.p239b.C7738a;
import com.iab.omid.library.corpmailru.p239b.C7741c;
import com.iab.omid.library.corpmailru.p241d.C7758f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.corpmailru.walking.a */
public class C7768a {

    /* renamed from: a */
    private final HashMap<View, String> f18502a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C7769a> f18503b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f18504c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f18505d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f18506e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f18507f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f18508g = new HashMap<>();

    /* renamed from: h */
    private boolean f18509h;

    /* renamed from: com.iab.omid.library.corpmailru.walking.a$a */
    public static class C7769a {

        /* renamed from: a */
        private final C7741c f18510a;

        /* renamed from: b */
        private final ArrayList<String> f18511b = new ArrayList<>();

        public C7769a(C7741c cVar, String str) {
            this.f18510a = cVar;
            mo54902a(str);
        }

        /* renamed from: a */
        public C7741c mo54901a() {
            return this.f18510a;
        }

        /* renamed from: a */
        public void mo54902a(String str) {
            this.f18511b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo54903b() {
            return this.f18511b;
        }
    }

    /* renamed from: a */
    private void m21779a(C7736a aVar) {
        for (C7741c a : aVar.mo54767a()) {
            m21780a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m21780a(C7741c cVar, C7736a aVar) {
        View view = (View) cVar.mo54821a().get();
        if (view != null) {
            C7769a aVar2 = this.f18503b.get(view);
            if (aVar2 != null) {
                aVar2.mo54902a(aVar.getAdSessionId());
            } else {
                this.f18503b.put(view, new C7769a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m21781d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C7758f.m21730e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f18505d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo54891a(View view) {
        if (this.f18502a.size() == 0) {
            return null;
        }
        String str = this.f18502a.get(view);
        if (str != null) {
            this.f18502a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo54892a(String str) {
        return this.f18508g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo54893a() {
        return this.f18506e;
    }

    /* renamed from: b */
    public View mo54894b(String str) {
        return this.f18504c.get(str);
    }

    /* renamed from: b */
    public C7769a mo54895b(View view) {
        C7769a aVar = this.f18503b.get(view);
        if (aVar != null) {
            this.f18503b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo54896b() {
        return this.f18507f;
    }

    /* renamed from: c */
    public C7779c mo54897c(View view) {
        return this.f18505d.contains(view) ? C7779c.PARENT_VIEW : this.f18509h ? C7779c.OBSTRUCTION_VIEW : C7779c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo54898c() {
        C7738a a = C7738a.m21624a();
        if (a != null) {
            for (C7736a next : a.mo54805c()) {
                View d = next.mo54771d();
                if (next.mo54772e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m21781d(d);
                        if (d2 == null) {
                            this.f18506e.add(adSessionId);
                            this.f18502a.put(d, adSessionId);
                            m21779a(next);
                        } else {
                            this.f18507f.add(adSessionId);
                            this.f18504c.put(adSessionId, d);
                            this.f18508g.put(adSessionId, d2);
                        }
                    } else {
                        this.f18507f.add(adSessionId);
                        this.f18508g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo54899d() {
        this.f18502a.clear();
        this.f18503b.clear();
        this.f18504c.clear();
        this.f18505d.clear();
        this.f18506e.clear();
        this.f18507f.clear();
        this.f18508g.clear();
        this.f18509h = false;
    }

    /* renamed from: e */
    public void mo54900e() {
        this.f18509h = true;
    }
}
