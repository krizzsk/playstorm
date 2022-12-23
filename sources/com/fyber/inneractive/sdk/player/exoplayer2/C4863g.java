package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4710e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4864h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4913p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4966f;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4967g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.g */
public final class C4863g implements C4710e {

    /* renamed from: a */
    public final C4911n[] f12866a;

    /* renamed from: b */
    public final C4967g f12867b;

    /* renamed from: c */
    public final C4966f f12868c;

    /* renamed from: d */
    public final Handler f12869d;

    /* renamed from: e */
    public final C4864h f12870e;

    /* renamed from: f */
    public final CopyOnWriteArraySet<C4710e.C4711a> f12871f;

    /* renamed from: g */
    public final C4913p.C4916c f12872g;

    /* renamed from: h */
    public final C4913p.C4915b f12873h;

    /* renamed from: i */
    public boolean f12874i;

    /* renamed from: j */
    public boolean f12875j;

    /* renamed from: k */
    public int f12876k;

    /* renamed from: l */
    public int f12877l;

    /* renamed from: m */
    public int f12878m;

    /* renamed from: n */
    public boolean f12879n;

    /* renamed from: o */
    public C4913p f12880o;

    /* renamed from: p */
    public Object f12881p;

    /* renamed from: q */
    public C4948s f12882q;

    /* renamed from: r */
    public C4966f f12883r;

    /* renamed from: s */
    public C4874m f12884s;

    /* renamed from: t */
    public C4864h.C4866b f12885t;

    /* renamed from: u */
    public int f12886u;

    /* renamed from: v */
    public long f12887v;

    public C4863g(C4911n[] nVarArr, C4967g gVar, C4696c cVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + C5049u.f13475e + "]");
        C5023a.m15304b(nVarArr.length > 0);
        this.f12866a = (C4911n[]) C5023a.m15300a(nVarArr);
        this.f12867b = (C4967g) C5023a.m15300a(gVar);
        this.f12875j = false;
        this.f12876k = 1;
        this.f12871f = new CopyOnWriteArraySet<>();
        C4966f fVar = new C4966f(new C4964e[nVarArr.length]);
        this.f12868c = fVar;
        this.f12880o = C4913p.f13076a;
        this.f12872g = new C4913p.C4916c();
        this.f12873h = new C4913p.C4915b();
        this.f12882q = C4948s.f13197d;
        this.f12883r = fVar;
        this.f12884s = C4874m.f12978d;
        C4862f fVar2 = new C4862f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f12869d = fVar2;
        C4864h.C4866b bVar = new C4864h.C4866b(0, 0);
        this.f12885t = bVar;
        this.f12870e = new C4864h(nVarArr, gVar, cVar, this.f12875j, fVar2, bVar, this);
    }

    /* renamed from: a */
    public void mo25328a(boolean z) {
        if (this.f12875j != z) {
            this.f12875j = z;
            this.f12870e.f12899f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator<C4710e.C4711a> it = this.f12871f.iterator();
            while (it.hasNext()) {
                it.next().mo24980a(z, this.f12876k);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|24|21|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x000f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0017 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25330b() {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.h r0 = r3.f12870e
            monitor-enter(r0)
            boolean r1 = r0.f12911r     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            goto L_0x0025
        L_0x0009:
            android.os.Handler r1 = r0.f12899f     // Catch:{ all -> 0x002c }
            r2 = 6
            r1.sendEmptyMessage(r2)     // Catch:{ all -> 0x002c }
        L_0x000f:
            boolean r1 = r0.f12911r     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x001f
            r0.wait()     // Catch:{ InterruptedException -> 0x0017 }
            goto L_0x000f
        L_0x0017:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002c }
            r1.interrupt()     // Catch:{ all -> 0x002c }
            goto L_0x000f
        L_0x001f:
            android.os.HandlerThread r1 = r0.f12900g     // Catch:{ all -> 0x002c }
            r1.quit()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)
        L_0x0025:
            android.os.Handler r0 = r3.f12869d
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4863g.mo25330b():void");
    }

    /* renamed from: a */
    public void mo25327a(int i, long j) {
        if (i < 0 || (!this.f12880o.mo25463c() && i >= this.f12880o.mo25462b())) {
            throw new C4872k(this.f12880o, i, j);
        }
        this.f12877l++;
        this.f12886u = i;
        if (!this.f12880o.mo25463c()) {
            this.f12880o.mo25461a(i, this.f12872g, false, 0);
            long j2 = j == -9223372036854775807L ? this.f12872g.f13086e : j;
            C4913p.C4916c cVar = this.f12872g;
            int i2 = cVar.f13084c;
            long a = cVar.f13088g + C4695b.m14454a(j2);
            long j3 = this.f12880o.mo25459a(i2, this.f12873h, false).f13080d;
            while (j3 != -9223372036854775807L && a >= j3 && i2 < this.f12872g.f13085d) {
                a -= j3;
                i2++;
                j3 = this.f12880o.mo25459a(i2, this.f12873h, false).f13080d;
            }
        }
        if (j == -9223372036854775807L) {
            this.f12887v = 0;
            this.f12870e.f12899f.obtainMessage(3, new C4864h.C4867c(this.f12880o, i, -9223372036854775807L)).sendToTarget();
            return;
        }
        this.f12887v = j;
        this.f12870e.f12899f.obtainMessage(3, new C4864h.C4867c(this.f12880o, i, C4695b.m14454a(j))).sendToTarget();
        Iterator<C4710e.C4711a> it = this.f12871f.iterator();
        while (it.hasNext()) {
            it.next().mo24974a();
        }
    }

    /* renamed from: a */
    public void mo25329a(C4710e.C4713c... cVarArr) {
        C4864h hVar = this.f12870e;
        if (hVar.f12911r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        hVar.f12916w++;
        hVar.f12899f.obtainMessage(11, cVarArr).sendToTarget();
    }

    /* renamed from: a */
    public int mo25326a() {
        if (this.f12880o.mo25463c() || this.f12877l > 0) {
            return this.f12886u;
        }
        return this.f12880o.mo25459a(this.f12885t.f12939a, this.f12873h, false).f13079c;
    }
}
