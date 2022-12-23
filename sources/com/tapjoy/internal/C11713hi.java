package com.tapjoy.internal;

import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.internal.C11591ex;
import com.tapjoy.internal.C11597ez;
import com.tapjoy.internal.C11615ff;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hi */
public final class C11713hi {

    /* renamed from: a */
    final C11726hm f28471a;

    /* renamed from: b */
    final C11711hh f28472b;

    /* renamed from: c */
    long f28473c;

    /* renamed from: d */
    private int f28474d = 1;

    /* renamed from: e */
    private final C11597ez.C11598a f28475e = new C11597ez.C11598a();

    C11713hi(C11726hm hmVar, C11711hh hhVar) {
        this.f28471a = hmVar;
        this.f28472b = hhVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72603a() {
        C11612fe d = this.f28471a.mo72655d();
        C11726hm hmVar = this.f28471a;
        synchronized (hmVar) {
            int b = hmVar.f28524c.f28573h.mo72739b() + 1;
            hmVar.f28524c.f28573h.mo72737a(b);
            hmVar.f28523b.f28267h = Integer.valueOf(b);
        }
        C11591ex.C11592a a = mo72602a(C11601fa.APP, "bootup");
        this.f28473c = SystemClock.elapsedRealtime();
        if (d != null) {
            a.f28081s = d;
        }
        mo72604a(a);
    }

    /* renamed from: a */
    public final void mo72605a(String str, String str2, double d, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f28471a.mo72643a(str2, d);
        C11591ex.C11592a a = mo72602a(C11601fa.APP, FirebaseAnalytics.Event.PURCHASE);
        C11615ff.C11616a aVar = new C11615ff.C11616a();
        aVar.f28189c = str;
        if (str2 != null) {
            aVar.f28192f = str2;
        }
        aVar.f28191e = Double.valueOf(d);
        if (str5 != null) {
            aVar.f28199m = str5;
        }
        if (str3 != null) {
            aVar.f28201o = str3;
        }
        if (str4 != null) {
            aVar.f28202p = str4;
        }
        a.f28078p = aVar.mo72479b();
        mo72604a(a);
        this.f28471a.mo72642a(a.f28067e.longValue(), d);
    }

    /* renamed from: a */
    public final void mo72607a(String str, String str2, String str3, String str4, Map<String, Long> map) {
        C11591ex.C11592a a = mo72602a(C11601fa.CUSTOM, str2);
        a.f28082t = str;
        a.f28083u = str3;
        a.f28084v = str4;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                a.f28085w.add(new C11603fb((String) next.getKey(), (Long) next.getValue()));
            }
        }
        mo72604a(a);
    }

    /* renamed from: a */
    public final void mo72608a(Map<String, Object> map) {
        C11591ex.C11592a a = mo72602a(C11601fa.CAMPAIGN, "impression");
        if (map != null) {
            a.f28080r = C11443bb.m33243a((Object) map);
        }
        mo72604a(a);
    }

    /* renamed from: a */
    public final void mo72609a(Map<String, Object> map, long j) {
        C11591ex.C11592a a = mo72602a(C11601fa.CAMPAIGN, "view");
        a.f28071i = Long.valueOf(j);
        if (map != null) {
            a.f28080r = C11443bb.m33243a((Object) map);
        }
        mo72604a(a);
    }

    /* renamed from: a */
    public final void mo72610a(Map<String, Object> map, String str) {
        C11591ex.C11592a a = mo72602a(C11601fa.CAMPAIGN, "click");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("region", str);
        a.f28080r = C11443bb.m33243a((Object) linkedHashMap);
        mo72604a(a);
    }

    /* renamed from: a */
    public final void mo72606a(String str, String str2, int i, long j, long j2, Map<String, Long> map) {
        C11591ex.C11592a a = mo72602a(C11601fa.USAGES, str);
        a.f28086x = str2;
        a.f28087y = Integer.valueOf(i);
        a.f28088z = Long.valueOf(j);
        a.f28064A = Long.valueOf(j2);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                a.f28085w.add(new C11603fb((String) next.getKey(), (Long) next.getValue()));
            }
        }
        mo72604a(a);
    }

    /* renamed from: a */
    public final C11591ex.C11592a mo72602a(C11601fa faVar, String str) {
        C11609fd b = this.f28471a.mo72651b();
        C11591ex.C11592a aVar = new C11591ex.C11592a();
        aVar.f28069g = C11726hm.f28521a;
        aVar.f28065c = faVar;
        aVar.f28066d = str;
        if (C11841u.m34411c()) {
            aVar.f28067e = Long.valueOf(C11841u.m34410b());
            aVar.f28068f = Long.valueOf(System.currentTimeMillis());
        } else {
            aVar.f28067e = Long.valueOf(System.currentTimeMillis());
            aVar.f28070h = Long.valueOf(SystemClock.elapsedRealtime());
        }
        aVar.f28072j = b.f28157d;
        aVar.f28073k = b.f28158e;
        aVar.f28074l = b.f28159f;
        return aVar;
    }

    /* renamed from: a */
    public final synchronized void mo72604a(C11591ex.C11592a aVar) {
        if (aVar.f28065c != C11601fa.USAGES) {
            int i = this.f28474d;
            this.f28474d = i + 1;
            aVar.f28076n = Integer.valueOf(i);
            if (this.f28475e.f28097c != null) {
                aVar.f28077o = this.f28475e.mo72457b();
            }
            this.f28475e.f28097c = aVar.f28065c;
            this.f28475e.f28098d = aVar.f28066d;
            this.f28475e.f28099e = aVar.f28082t;
        }
        C11711hh hhVar = this.f28472b;
        C11591ex b = aVar.mo72451b();
        try {
            hhVar.f28465a.mo72672a(b);
            if (hhVar.f28466b != null) {
                if (!C11710hg.f28464a) {
                    if (b.f28051n == C11601fa.CUSTOM) {
                        hhVar.mo72599a(false);
                        return;
                    }
                }
                hhVar.mo72599a(true);
                return;
            }
            hhVar.f28465a.flush();
        } catch (Exception unused) {
        }
    }
}
