package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import com.tapjoy.internal.C11515dj;
import com.tapjoy.internal.C11537dy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dx */
public final class C11533dx implements C11515dj.C11516a {

    /* renamed from: a */
    public static Handler f27897a = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static C11533dx f27898c = new C11533dx();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Handler f27899d = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f27900j = new Runnable() {
        public final void run() {
            C11533dx.m33473b(C11533dx.m33468a());
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f27901k = new Runnable() {
        public final void run() {
            if (C11533dx.f27899d != null) {
                C11533dx.f27899d.post(C11533dx.f27900j);
                C11533dx.f27899d.postDelayed(C11533dx.f27901k, 200);
            }
        }
    };

    /* renamed from: b */
    public List<Object> f27902b = new ArrayList();

    /* renamed from: e */
    private int f27903e;

    /* renamed from: f */
    private C11517dk f27904f = new C11517dk();

    /* renamed from: g */
    private C11537dy f27905g = new C11537dy();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C11548ef f27906h = new C11548ef(new C11544eb());

    /* renamed from: i */
    private long f27907i;

    C11533dx() {
    }

    /* renamed from: a */
    public static C11533dx m33468a() {
        return f27898c;
    }

    /* renamed from: a */
    private void m33470a(long j) {
        if (this.f27902b.size() > 0) {
            Iterator<Object> it = this.f27902b.iterator();
            while (it.hasNext()) {
                it.next();
                TimeUnit.NANOSECONDS.toMillis(j);
            }
        }
    }

    /* renamed from: a */
    private void m33471a(View view, C11515dj djVar, JSONObject jSONObject, int i) {
        djVar.mo72312a(view, jSONObject, this, i == C11549eg.f27937a);
    }

    /* renamed from: b */
    public static void m33472b() {
        if (f27899d == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f27899d = handler;
            handler.post(f27900j);
            f27899d.postDelayed(f27901k, 200);
        }
    }

    /* renamed from: c */
    public static void m33474c() {
        Handler handler = f27899d;
        if (handler != null) {
            handler.removeCallbacks(f27901k);
            f27899d = null;
        }
    }

    /* renamed from: a */
    public final void mo72313a(View view, C11515dj djVar, JSONObject jSONObject) {
        String str;
        boolean z = false;
        if (C11525dr.m33452c(view) == null) {
            C11537dy dyVar = this.f27905g;
            int i = dyVar.f27912d.contains(view) ? C11549eg.f27937a : dyVar.f27916h ? C11549eg.f27938b : C11549eg.f27939c;
            if (i != C11549eg.f27939c) {
                JSONObject a = djVar.mo72311a(view);
                C11521do.m33439a(jSONObject, a);
                C11537dy dyVar2 = this.f27905g;
                if (dyVar2.f27909a.size() == 0) {
                    str = null;
                } else {
                    String str2 = dyVar2.f27909a.get(view);
                    if (str2 != null) {
                        dyVar2.f27909a.remove(view);
                    }
                    str = str2;
                }
                if (str != null) {
                    C11521do.m33437a(a, str);
                    this.f27905g.f27916h = true;
                    z = true;
                }
                if (!z) {
                    C11537dy dyVar3 = this.f27905g;
                    C11537dy.C11538a aVar = dyVar3.f27910b.get(view);
                    if (aVar != null) {
                        dyVar3.f27910b.remove(view);
                    }
                    if (aVar != null) {
                        C11521do.m33436a(a, aVar);
                    }
                    m33471a(view, djVar, a, i);
                }
                this.f27903e++;
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m33473b(C11533dx dxVar) {
        String str;
        dxVar.f27903e = 0;
        dxVar.f27907i = System.nanoTime();
        C11537dy dyVar = dxVar.f27905g;
        C11507dd a = C11507dd.m33405a();
        if (a != null) {
            for (T t : Collections.unmodifiableCollection(a.f27852b)) {
                View c = t.mo72289c();
                if (t.mo72290d()) {
                    String str2 = t.f27822f;
                    if (c != null) {
                        if (!c.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view = c;
                            while (true) {
                                if (view == null) {
                                    dyVar.f27912d.addAll(hashSet);
                                    str = null;
                                    break;
                                }
                                String c2 = C11525dr.m33452c(view);
                                if (c2 != null) {
                                    str = c2;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        }
                        if (str == null) {
                            dyVar.f27913e.add(str2);
                            dyVar.f27909a.put(c, str2);
                            dyVar.mo72329a(t);
                        } else {
                            dyVar.f27914f.add(str2);
                            dyVar.f27911c.put(str2, c);
                            dyVar.f27915g.put(str2, str);
                        }
                    } else {
                        dyVar.f27914f.add(str2);
                        dyVar.f27915g.put(str2, "noAdView");
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        C11518dl dlVar = dxVar.f27904f.f27874b;
        if (dxVar.f27905g.f27914f.size() > 0) {
            Iterator<String> it = dxVar.f27905g.f27914f.iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a2 = dlVar.mo72311a((View) null);
                View view2 = dxVar.f27905g.f27911c.get(next);
                C11519dm dmVar = dxVar.f27904f.f27873a;
                String str3 = dxVar.f27905g.f27915g.get(next);
                if (str3 != null) {
                    JSONObject a3 = dmVar.mo72311a(view2);
                    C11521do.m33437a(a3, next);
                    C11521do.m33441b(a3, str3);
                    C11521do.m33439a(a2, a3);
                }
                C11521do.m33435a(a2);
                HashSet hashSet2 = new HashSet();
                hashSet2.add(next);
                C11548ef efVar = dxVar.f27906h;
                efVar.f27935a.mo72337a(new C11546ed(efVar, hashSet2, a2, nanoTime));
            }
        }
        if (dxVar.f27905g.f27913e.size() > 0) {
            JSONObject a4 = dlVar.mo72311a((View) null);
            dxVar.m33471a((View) null, dlVar, a4, C11549eg.f27937a);
            C11521do.m33435a(a4);
            C11548ef efVar2 = dxVar.f27906h;
            efVar2.f27935a.mo72337a(new C11547ee(efVar2, dxVar.f27905g.f27913e, a4, nanoTime));
        } else {
            dxVar.f27906h.mo72341b();
        }
        C11537dy dyVar2 = dxVar.f27905g;
        dyVar2.f27909a.clear();
        dyVar2.f27910b.clear();
        dyVar2.f27911c.clear();
        dyVar2.f27912d.clear();
        dyVar2.f27913e.clear();
        dyVar2.f27914f.clear();
        dyVar2.f27915g.clear();
        dyVar2.f27916h = false;
        dxVar.m33470a(System.nanoTime() - dxVar.f27907i);
    }
}
