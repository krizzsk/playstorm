package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4971b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5001k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5039n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.c */
public final class C4696c {

    /* renamed from: a */
    public final C5001k f11832a;

    /* renamed from: b */
    public final long f11833b;

    /* renamed from: c */
    public final long f11834c;

    /* renamed from: d */
    public final long f11835d;

    /* renamed from: e */
    public final long f11836e;

    /* renamed from: f */
    public int f11837f;

    /* renamed from: g */
    public boolean f11838g;

    public C4696c(C5001k kVar, int i, int i2, long j, long j2) {
        this(kVar, i, i2, j, j2, (C5039n) null);
    }

    /* renamed from: a */
    public C4971b mo25101a() {
        return this.f11832a;
    }

    public C4696c(C5001k kVar, int i, int i2, long j, long j2, C5039n nVar) {
        this.f11832a = kVar;
        this.f11833b = ((long) i) * 1000;
        this.f11834c = ((long) i2) * 1000;
        this.f11835d = j * 1000;
        this.f11836e = j2 * 1000;
    }

    /* renamed from: a */
    public boolean mo25103a(long j) {
        boolean z;
        int i;
        boolean z2 = false;
        if (j > this.f11834c) {
            z = false;
        } else {
            z = j < this.f11833b ? true : true;
        }
        C5001k kVar = this.f11832a;
        synchronized (kVar) {
            i = kVar.f13339f * kVar.f13335b;
        }
        boolean z3 = i >= this.f11837f;
        boolean z4 = this.f11838g;
        if (z || (z && z4 && !z3)) {
            z2 = true;
        }
        this.f11838g = z2;
        return z2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final void mo25102a(boolean r3) {
        /*
            r2 = this;
            r0 = 0
            r2.f11837f = r0
            r2.f11838g = r0
            if (r3 == 0) goto L_0x0027
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k r3 = r2.f11832a
            monitor-enter(r3)
            boolean r1 = r3.f13334a     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0022
            monitor-enter(r3)     // Catch:{ all -> 0x0024 }
            int r1 = r3.f13338e     // Catch:{ all -> 0x001f }
            if (r1 <= 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            r3.f13338e = r0     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d
            r3.mo25557b()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0022
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r3)
            goto L_0x0027
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4696c.mo25102a(boolean):void");
    }
}
