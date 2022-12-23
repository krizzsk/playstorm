package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5345j;
import com.fyber.inneractive.sdk.util.C5357n;

/* renamed from: com.fyber.inneractive.sdk.renderers.b */
public class C5266b {

    /* renamed from: a */
    public C5345j<Rect> f13968a;

    /* renamed from: b */
    public final C5291e f13969b;

    /* renamed from: c */
    public final FrameLayout f13970c;

    /* renamed from: d */
    public float f13971d = 0.0f;

    /* renamed from: e */
    public int f13972e = 1;

    /* renamed from: f */
    public float f13973f = 0.0f;

    /* renamed from: g */
    public long f13974g = 0;

    /* renamed from: h */
    public boolean f13975h = false;

    /* renamed from: i */
    public boolean f13976i = false;

    /* renamed from: j */
    public final C5269c f13977j;

    /* renamed from: k */
    public final Runnable f13978k = new C5267a();

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$a */
    public class C5267a implements Runnable {
        public C5267a() {
        }

        public void run() {
            C5266b.this.mo26324a();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$b */
    public class C5268b implements C5345j.C5346a<Rect> {
        public C5268b(C5266b bVar) {
        }

        /* renamed from: a */
        public Object mo26328a() {
            return new Rect();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$c */
    public interface C5269c {
    }

    public C5266b(C5291e eVar, FrameLayout frameLayout, C5269c cVar) {
        this.f13969b = eVar;
        this.f13970c = frameLayout;
        this.f13977j = cVar;
        this.f13968a = new C5345j<>(4, new C5268b(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26324a() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "IAVisibilityTracker: onCheckVisibility"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r1)
            int r1 = r10.f13972e
            float r1 = (float) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r2 = r10.f13968a
            java.lang.Object r2 = r2.mo26456a()
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            android.widget.FrameLayout r3 = r10.f13970c
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L_0x0046
            boolean r4 = r3.isShown()
            if (r4 == 0) goto L_0x0046
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L_0x0046
            boolean r4 = r3.getGlobalVisibleRect(r2)
            if (r4 == 0) goto L_0x0046
            int r4 = r2.height()
            int r5 = r2.width()
            int r4 = r4 * r5
            float r4 = (float) r4
            int r5 = r3.getHeight()
            int r3 = r3.getWidth()
            int r5 = r5 * r3
            float r3 = (float) r5
            float r4 = r4 / r3
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r3 = r10.f13968a
            java.util.Queue<T> r3 = r3.f14205a
            r3.offer(r2)
            r10.f13971d = r4
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r3 = 0
            r5 = 1
            if (r2 < 0) goto L_0x006e
            float r2 = r10.f13973f
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r6
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f13974g
            long r6 = r6 - r8
            float r6 = (float) r6
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x006e
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006e
            r2 = r5
            goto L_0x006f
        L_0x006e:
            r2 = r0
        L_0x006f:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r6[r0] = r7
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r6[r5] = r7
            java.lang.String r7 = "BannerVisibilityTracker | visible = %s, minVis = %f"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r7, r6)
            if (r2 == 0) goto L_0x00dd
            boolean r2 = r10.f13975h
            if (r2 == 0) goto L_0x00dd
            com.fyber.inneractive.sdk.renderers.b$c r1 = r10.f13977j
            if (r1 == 0) goto L_0x0108
            boolean r1 = r10.f13976i
            if (r1 != 0) goto L_0x0108
            r10.f13976i = r5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "BannerVisibilityTracker | firing viewable"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r1)
            com.fyber.inneractive.sdk.renderers.b$c r1 = r10.f13977j
            com.fyber.inneractive.sdk.renderers.d r1 = (com.fyber.inneractive.sdk.renderers.C5271d) r1
            com.fyber.inneractive.sdk.renderers.g r1 = r1.f13981a
            r1.getClass()
            AdContent r2 = r1.f10921b     // Catch:{ Exception -> 0x0108 }
            if (r2 == 0) goto L_0x0108
            r3 = r2
            com.fyber.inneractive.sdk.flow.u r3 = (com.fyber.inneractive.sdk.flow.C4437u) r3     // Catch:{ Exception -> 0x0108 }
            T r3 = r3.f10914b     // Catch:{ Exception -> 0x0108 }
            if (r3 == 0) goto L_0x0108
            com.fyber.inneractive.sdk.flow.u r2 = (com.fyber.inneractive.sdk.flow.C4437u) r2     // Catch:{ Exception -> 0x0108 }
            T r2 = r2.f10914b     // Catch:{ Exception -> 0x0108 }
            com.fyber.inneractive.sdk.response.f r2 = (com.fyber.inneractive.sdk.response.C5292f) r2     // Catch:{ Exception -> 0x0108 }
            java.lang.String r2 = r2.f14087v     // Catch:{ Exception -> 0x0108 }
            if (r2 == 0) goto L_0x0108
            java.lang.String r3 = r2.trim()     // Catch:{ Exception -> 0x0108 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0108 }
            if (r3 <= 0) goto L_0x0108
            java.lang.String r3 = "%sfiring banner mrc visibility impression!"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0108 }
            java.lang.String r6 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r1)     // Catch:{ Exception -> 0x0108 }
            r4[r0] = r6     // Catch:{ Exception -> 0x0108 }
            com.fyber.inneractive.sdk.util.IAlog.m16702d(r3, r4)     // Catch:{ Exception -> 0x0108 }
            int r3 = com.fyber.inneractive.sdk.util.IAlog.f14137a     // Catch:{ Exception -> 0x0108 }
            r3 = 0
            java.lang.String r4 = "MRC_VISIBILITY_IMPRESSION"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0108 }
            com.fyber.inneractive.sdk.util.IAlog.m16697a(r5, r3, r4, r0)     // Catch:{ Exception -> 0x0108 }
            r1.mo24605b((java.lang.String) r2)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0108
        L_0x00dd:
            boolean r0 = r10.f13975h
            if (r0 == 0) goto L_0x0108
            float r0 = r10.f13971d
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ea
            r10.f13974g = r3
            goto L_0x00fa
        L_0x00ea:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00fa
            long r0 = r10.f13974g
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00fa
            long r0 = java.lang.System.currentTimeMillis()
            r10.f13974g = r0
        L_0x00fa:
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.C5357n.f14225b
            java.lang.Runnable r1 = r10.f13978k
            r0.removeCallbacks(r1)
            java.lang.Runnable r1 = r10.f13978k
            r2 = 50
            r0.postDelayed(r1, r2)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5266b.mo26324a():void");
    }

    /* renamed from: b */
    public void mo26325b() {
        if (!this.f13976i && !this.f13975h && this.f13974g != 0) {
            this.f13974g = 0;
            this.f13975h = true;
            mo26324a();
        }
    }

    /* renamed from: c */
    public void mo26326c() {
        this.f13975h = false;
        C5357n.f14225b.removeCallbacks(this.f13978k);
    }
}
