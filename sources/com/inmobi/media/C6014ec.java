package com.inmobi.media;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.inmobi.media.C6028ei;
import com.inmobi.media.C6125fq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.ec */
/* compiled from: ImpressionTracker */
public class C6014ec {

    /* renamed from: a */
    private static final String f15287a = C6014ec.class.getSimpleName();

    /* renamed from: b */
    private final C6028ei f15288b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<View, C6017b> f15289c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<View, C6017b> f15290d;

    /* renamed from: e */
    private final Handler f15291e;

    /* renamed from: f */
    private final C6018c f15292f;

    /* renamed from: g */
    private final long f15293g;

    /* renamed from: h */
    private C6028ei.C6031c f15294h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6016a f15295i;

    /* renamed from: com.inmobi.media.ec$a */
    /* compiled from: ImpressionTracker */
    public interface C6016a {
        /* renamed from: a */
        void mo35143a(View view, Object obj);
    }

    /* renamed from: com.inmobi.media.ec$b */
    /* compiled from: ImpressionTracker */
    static class C6017b {

        /* renamed from: a */
        Object f15297a;

        /* renamed from: b */
        int f15298b;

        /* renamed from: c */
        int f15299c;

        /* renamed from: d */
        long f15300d = Long.MAX_VALUE;

        C6017b(Object obj, int i, int i2) {
            this.f15297a = obj;
            this.f15298b = i;
            this.f15299c = i2;
        }
    }

    public C6014ec(C6125fq.C6142m mVar, C6028ei eiVar, C6016a aVar) {
        this(new WeakHashMap(), new WeakHashMap(), eiVar, new Handler(), mVar, aVar);
    }

    private C6014ec(Map<View, C6017b> map, Map<View, C6017b> map2, C6028ei eiVar, Handler handler, C6125fq.C6142m mVar, C6016a aVar) {
        this.f15289c = map;
        this.f15290d = map2;
        this.f15288b = eiVar;
        this.f15293g = (long) mVar.impressionPollIntervalMillis;
        C60151 r1 = new C6028ei.C6031c() {
            /* renamed from: a */
            public final void mo35142a(List<View> list, List<View> list2) {
                for (View next : list) {
                    C6017b bVar = (C6017b) C6014ec.this.f15289c.get(next);
                    if (bVar == null) {
                        C6014ec.this.mo35136a(next);
                    } else {
                        C6017b bVar2 = (C6017b) C6014ec.this.f15290d.get(next);
                        if (bVar2 == null || !bVar.f15297a.equals(bVar2.f15297a)) {
                            bVar.f15300d = SystemClock.uptimeMillis();
                            C6014ec.this.f15290d.put(next, bVar);
                        }
                    }
                }
                for (View remove : list2) {
                    C6014ec.this.f15290d.remove(remove);
                }
                C6014ec.this.m17965e();
            }
        };
        this.f15294h = r1;
        this.f15288b.f15331c = r1;
        this.f15291e = handler;
        this.f15292f = new C6018c(this);
        this.f15295i = aVar;
    }

    /* renamed from: a */
    public final void mo35137a(View view, Object obj, int i, int i2) {
        C6017b bVar = this.f15289c.get(view);
        if (bVar == null || !bVar.f15297a.equals(obj)) {
            mo35136a(view);
            C6017b bVar2 = new C6017b(obj, i, i2);
            this.f15289c.put(view, bVar2);
            this.f15288b.mo35154a(view, obj, bVar2.f15298b);
        }
    }

    /* renamed from: a */
    public final void mo35136a(View view) {
        this.f15289c.remove(view);
        this.f15290d.remove(view);
        this.f15288b.mo35153a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35138a(Object obj) {
        View view;
        Iterator<Map.Entry<View, C6017b>> it = this.f15289c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry next = it.next();
            if (((C6017b) next.getValue()).f15297a.equals(obj)) {
                view = (View) next.getKey();
                break;
            }
        }
        if (view != null) {
            mo35136a(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35135a() {
        this.f15288b.mo35156f();
        this.f15291e.removeCallbacksAndMessages((Object) null);
        this.f15290d.clear();
    }

    /* renamed from: b */
    public final void mo35139b() {
        for (Map.Entry next : this.f15289c.entrySet()) {
            this.f15288b.mo35154a((View) next.getKey(), ((C6017b) next.getValue()).f15297a, ((C6017b) next.getValue()).f15298b);
        }
        m17965e();
        this.f15288b.mo35131d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo35140c() {
        return !this.f15289c.isEmpty();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17965e() {
        if (!this.f15291e.hasMessages(0)) {
            this.f15291e.postDelayed(this.f15292f, this.f15293g);
        }
    }

    /* renamed from: com.inmobi.media.ec$c */
    /* compiled from: ImpressionTracker */
    static class C6018c implements Runnable {

        /* renamed from: a */
        private final ArrayList<View> f15301a = new ArrayList<>();

        /* renamed from: b */
        private WeakReference<C6014ec> f15302b;

        C6018c(C6014ec ecVar) {
            this.f15302b = new WeakReference<>(ecVar);
        }

        public final void run() {
            C6014ec ecVar = (C6014ec) this.f15302b.get();
            if (ecVar != null) {
                for (Map.Entry entry : ecVar.f15290d.entrySet()) {
                    View view = (View) entry.getKey();
                    C6017b bVar = (C6017b) entry.getValue();
                    if (C6014ec.m17961a(bVar.f15300d, bVar.f15299c) && this.f15302b.get() != null) {
                        ecVar.f15295i.mo35143a(view, bVar.f15297a);
                        this.f15301a.add(view);
                    }
                }
                Iterator<View> it = this.f15301a.iterator();
                while (it.hasNext()) {
                    ecVar.mo35136a(it.next());
                }
                this.f15301a.clear();
                if (!ecVar.f15290d.isEmpty()) {
                    ecVar.m17965e();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo35141d() {
        this.f15289c.clear();
        this.f15290d.clear();
        this.f15288b.mo35156f();
        this.f15291e.removeMessages(0);
        this.f15288b.mo35132e();
        this.f15294h = null;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m17961a(long j, int i) {
        return SystemClock.uptimeMillis() - j >= ((long) i);
    }
}
