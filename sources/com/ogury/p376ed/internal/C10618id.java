package com.ogury.p376ed.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ogury.ed.internal.id */
public final class C10618id {

    /* renamed from: a */
    public static final C10618id f26806a = new C10618id();

    /* renamed from: b */
    private static final Map<String, C10617ic> f26807b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Handler f26808c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private static final Runnable f26809d = $$Lambda$id$clsWNa_MEVgRz0b4PPKC1NFHoZg.INSTANCE;

    /* renamed from: e */
    private static Integer f26810e;

    /* renamed from: f */
    private static C10531fn f26811f = C10531fn.f26635a;

    private C10618id() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m32373d() {
        m32371c();
    }

    /* renamed from: a */
    public static void m32366a(C10622ig igVar) {
        C10765mq.m32773b(igVar, "presageAdGateway");
        Iterator<Map.Entry<String, C10617ic>> it = f26807b.entrySet().iterator();
        while (it.hasNext()) {
            if (C10765mq.m32772a(((C10617ic) it.next().getValue()).mo67612a().get(), (Object) igVar)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static void m32367a(String str) {
        C10765mq.m32773b(str, "cacheId");
        Iterator<Map.Entry<String, C10617ic>> it = f26807b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (C10765mq.m32772a(next.getKey(), (Object) str)) {
                it.remove();
                C10622ig igVar = (C10622ig) ((C10617ic) next.getValue()).mo67612a().get();
                if (igVar != null) {
                    igVar.mo67622b(((C10617ic) next.getValue()).mo67614c());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m32365a(C10617ic icVar) {
        C10765mq.m32773b(icVar, "mraidCacheItem");
        m32370b(icVar);
        f26807b.put(icVar.mo67614c().mo67214a(), icVar);
        m32369b();
    }

    /* renamed from: b */
    private static void m32370b(C10617ic icVar) {
        if (f26810e == null) {
            Context context = icVar.mo67613b().getContext();
            C10765mq.m32770a((Object) context, "mraidCacheItem.webView.context");
            C10530fm a = C10531fn.m32005a(context);
            if (a != null) {
                f26810e = a.mo67429f() > 0 ? Integer.valueOf(a.mo67429f()) : null;
            }
        }
    }

    /* renamed from: a */
    public static void m32364a() {
        Iterator<Map.Entry<String, C10617ic>> it = f26807b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (m32372c((C10617ic) next.getValue())) {
                it.remove();
                C10445di diVar = C10445di.f26411a;
                C10445di.m31608a((C10444dh) new C10455dl("expired", ((C10617ic) next.getValue()).mo67614c()));
                C10622ig igVar = (C10622ig) ((C10617ic) next.getValue()).mo67612a().get();
                if (igVar != null) {
                    igVar.mo67621a(((C10617ic) next.getValue()).mo67614c());
                }
            }
        }
    }

    /* renamed from: c */
    private static boolean m32372c(C10617ic icVar) {
        Context context = icVar.mo67613b().getContext();
        C10765mq.m32770a((Object) context, "mraidCacheItem.webView.context");
        C10530fm a = C10531fn.m32005a(context);
        return a != null && System.currentTimeMillis() - icVar.mo67615d() > a.mo67435j();
    }

    /* renamed from: b */
    public static C10660jh m32368b(String str) {
        C10765mq.m32773b(str, "cacheId");
        C10660jh jhVar = null;
        if (f26807b.containsKey(str)) {
            C10617ic icVar = f26807b.get(str);
            if (icVar != null) {
                jhVar = icVar.mo67613b();
            }
            f26807b.remove(str);
        }
        return jhVar;
    }

    /* renamed from: b */
    private static void m32369b() {
        Iterator<Map.Entry<String, C10617ic>> it = f26807b.entrySet().iterator();
        while (it.hasNext()) {
            if (((C10617ic) it.next().getValue()).mo67612a().get() == null) {
                it.remove();
            }
        }
        f26808c.removeCallbacksAndMessages((Object) null);
        if (!f26807b.isEmpty()) {
            f26808c.postDelayed(f26809d, 1200000);
        }
    }

    /* renamed from: c */
    private static void m32371c() {
        C10765mq.m32765a("clean cache ", (Object) Integer.valueOf(f26807b.size()));
        m32364a();
        m32369b();
        C10765mq.m32765a("after cache ", (Object) Integer.valueOf(f26807b.size()));
    }
}
