package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4974a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5024b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k */
public final class C4988k implements C4974a {

    /* renamed from: a */
    public final File f13301a;

    /* renamed from: b */
    public final C4983f f13302b;

    /* renamed from: c */
    public final HashMap<String, C4984g> f13303c;

    /* renamed from: d */
    public final C4986i f13304d;

    /* renamed from: e */
    public final HashMap<String, ArrayList<C4974a.C4976b>> f13305e;

    /* renamed from: f */
    public long f13306f = 0;

    /* renamed from: g */
    public C4974a.C4975a f13307g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k$a */
    public class C4989a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ ConditionVariable f13308a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4989a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f13308a = conditionVariable;
        }

        public void run() {
            synchronized (C4988k.this) {
                this.f13308a.open();
                try {
                    C4988k.m15233a(C4988k.this);
                } catch (C4974a.C4975a e) {
                    C4988k.this.f13307g = e;
                }
                C4988k.this.f13302b.getClass();
            }
        }
    }

    public C4988k(File file, C4983f fVar, byte[] bArr) {
        this.f13301a = file;
        this.f13302b = fVar;
        this.f13303c = new HashMap<>();
        this.f13304d = new C4986i(file, (byte[]) null);
        this.f13305e = new HashMap<>();
        ConditionVariable conditionVariable = new ConditionVariable();
        new C4989a("SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }

    /* renamed from: a */
    public synchronized long mo25511a() {
        return this.f13306f;
    }

    /* renamed from: b */
    public C4984g mo25517b(String str, long j) throws InterruptedException, C4974a.C4975a {
        C4990l d;
        synchronized (this) {
            while (true) {
                d = mo25519c(str, j);
                if (d == null) {
                    wait();
                }
            }
        }
        return d;
    }

    /* renamed from: d */
    public synchronized C4990l mo25519c(String str, long j) throws C4974a.C4975a {
        C4990l lVar;
        C4990l floor;
        C4974a.C4975a aVar = this.f13307g;
        if (aVar == null) {
            C4985h hVar = this.f13304d.f13292a.get(str);
            if (hVar == null) {
                lVar = new C4990l(str, j, -1, -9223372036854775807L, (File) null);
            } else {
                while (true) {
                    C4990l lVar2 = new C4990l(hVar.f13289b, j, -1, -9223372036854775807L, (File) null);
                    floor = hVar.f13290c.floor(lVar2);
                    if (floor == null || floor.f13283b + floor.f13284c <= j) {
                        C4990l ceiling = hVar.f13290c.ceiling(lVar2);
                        if (ceiling == null) {
                            floor = new C4990l(hVar.f13289b, j, -1, -9223372036854775807L, (File) null);
                        } else {
                            floor = new C4990l(hVar.f13289b, j, ceiling.f13283b - j, -9223372036854775807L, (File) null);
                        }
                    }
                    if (!floor.f13285d || floor.f13286e.length() == floor.f13284c) {
                        lVar = floor;
                    } else {
                        mo25546b();
                    }
                }
                lVar = floor;
            }
            if (lVar.f13285d) {
                C4985h hVar2 = this.f13304d.f13292a.get(str);
                C5023a.m15304b(hVar2.f13290c.remove(lVar));
                int i = hVar2.f13288a;
                C5023a.m15304b(lVar.f13285d);
                long currentTimeMillis = System.currentTimeMillis();
                File a = C4990l.m15248a(lVar.f13286e.getParentFile(), i, lVar.f13283b, currentTimeMillis);
                C4990l lVar3 = new C4990l(lVar.f13282a, lVar.f13283b, lVar.f13284c, currentTimeMillis, a);
                if (lVar.f13286e.renameTo(a)) {
                    hVar2.f13290c.add(lVar3);
                    ArrayList arrayList = this.f13305e.get(lVar.f13282a);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((C4974a.C4976b) arrayList.get(size)).mo25521a(this, lVar, lVar3);
                        }
                    }
                    C4987j jVar = (C4987j) this.f13302b;
                    jVar.f13299a.remove(lVar);
                    jVar.f13300b -= lVar.f13284c;
                    jVar.mo25522b(this, lVar3);
                    return lVar3;
                }
                throw new C4974a.C4975a("Renaming of " + lVar.f13286e + " to " + a + " failed.");
            } else if (this.f13303c.containsKey(str)) {
                return null;
            } else {
                this.f13303c.put(str, lVar);
                return lVar;
            }
        } else {
            throw aVar;
        }
    }

    /* renamed from: a */
    public synchronized File mo25513a(String str, long j, long j2) throws C4974a.C4975a {
        File file;
        C4985h hVar;
        C5023a.m15304b(this.f13303c.containsKey(str));
        if (!this.f13301a.exists()) {
            mo25546b();
            this.f13301a.mkdirs();
        }
        ((C4987j) this.f13302b).mo25542a((C4974a) this, j2);
        file = this.f13301a;
        C4986i iVar = this.f13304d;
        hVar = iVar.f13292a.get(str);
        if (hVar == null) {
            hVar = iVar.mo25536a(str, -1);
        }
        return C4990l.m15248a(file, hVar.f13288a, j, System.currentTimeMillis());
    }

    /* renamed from: b */
    public synchronized void mo25518b(C4984g gVar) {
        C5023a.m15304b(gVar == this.f13303c.remove(gVar.f13282a));
        notifyAll();
    }

    /* renamed from: b */
    public final void mo25546b() throws C4974a.C4975a {
        LinkedList linkedList = new LinkedList();
        for (C4985h hVar : this.f13304d.f13292a.values()) {
            Iterator<C4990l> it = hVar.f13290c.iterator();
            while (it.hasNext()) {
                C4984g next = it.next();
                if (next.f13286e.length() != next.f13284c) {
                    linkedList.add(next);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            mo25544a((C4984g) it2.next(), false);
        }
        this.f13304d.mo25539b();
        this.f13304d.mo25541c();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo25515a(java.io.File r8) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4974a.C4975a {
        /*
            r7 = this;
            monitor-enter(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r0 = r7.f13304d     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l r0 = com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4990l.m15247a(r8, r0)     // Catch:{ all -> 0x0077 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r3 = r1
            goto L_0x000e
        L_0x000d:
            r3 = r2
        L_0x000e:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r3)     // Catch:{ all -> 0x0077 }
            java.util.HashMap<java.lang.String, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g> r3 = r7.f13303c     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = r0.f13282a     // Catch:{ all -> 0x0077 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r3)     // Catch:{ all -> 0x0077 }
            boolean r3 = r8.exists()     // Catch:{ all -> 0x0077 }
            if (r3 != 0) goto L_0x0024
            monitor-exit(r7)
            return
        L_0x0024:
            long r3 = r8.length()     // Catch:{ all -> 0x0077 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0033
            r8.delete()     // Catch:{ all -> 0x0077 }
            monitor-exit(r7)
            return
        L_0x0033:
            java.lang.String r8 = r0.f13282a     // Catch:{ all -> 0x0077 }
            monitor-enter(r7)     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r3 = r7.f13304d     // Catch:{ all -> 0x0074 }
            java.util.HashMap<java.lang.String, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h> r3 = r3.f13292a     // Catch:{ all -> 0x0074 }
            java.lang.Object r8 = r3.get(r8)     // Catch:{ all -> 0x0074 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h r8 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4985h) r8     // Catch:{ all -> 0x0074 }
            r3 = -1
            if (r8 != 0) goto L_0x0046
            r5 = r3
            goto L_0x0048
        L_0x0046:
            long r5 = r8.f13291d     // Catch:{ all -> 0x0074 }
        L_0x0048:
            monitor-exit(r7)     // Catch:{ all -> 0x0077 }
            java.lang.Long r8 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0077 }
            long r5 = r8.longValue()     // Catch:{ all -> 0x0077 }
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0067
            long r3 = r0.f13283b     // Catch:{ all -> 0x0077 }
            long r5 = r0.f13284c     // Catch:{ all -> 0x0077 }
            long r3 = r3 + r5
            long r5 = r8.longValue()     // Catch:{ all -> 0x0077 }
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r1 = r2
        L_0x0064:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r1)     // Catch:{ all -> 0x0077 }
        L_0x0067:
            r7.mo25545a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4990l) r0)     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r8 = r7.f13304d     // Catch:{ all -> 0x0077 }
            r8.mo25541c()     // Catch:{ all -> 0x0077 }
            r7.notifyAll()     // Catch:{ all -> 0x0077 }
            monitor-exit(r7)
            return
        L_0x0074:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0077 }
            throw r8     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4988k.mo25515a(java.io.File):void");
    }

    /* renamed from: a */
    public static void m15233a(C4988k kVar) throws C4974a.C4975a {
        if (!kVar.f13301a.exists()) {
            kVar.f13301a.mkdirs();
            return;
        }
        C4986i iVar = kVar.f13304d;
        C5023a.m15304b(!iVar.f13297f);
        if (!iVar.mo25538a()) {
            C5024b bVar = iVar.f13294c;
            bVar.f13409a.delete();
            bVar.f13410b.delete();
            iVar.f13292a.clear();
            iVar.f13293b.clear();
        }
        File[] listFiles = kVar.f13301a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                    C4990l a = file.length() > 0 ? C4990l.m15247a(file, kVar.f13304d) : null;
                    if (a != null) {
                        kVar.mo25545a(a);
                    } else {
                        file.delete();
                    }
                }
            }
            kVar.f13304d.mo25539b();
            kVar.f13304d.mo25541c();
        }
    }

    /* renamed from: a */
    public final void mo25545a(C4990l lVar) {
        C4986i iVar = this.f13304d;
        String str = lVar.f13282a;
        C4985h hVar = iVar.f13292a.get(str);
        if (hVar == null) {
            hVar = iVar.mo25536a(str, -1);
        }
        hVar.f13290c.add(lVar);
        this.f13306f += lVar.f13284c;
        ArrayList arrayList = this.f13305e.get(lVar.f13282a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C4974a.C4976b) arrayList.get(size)).mo25522b(this, lVar);
            }
        }
        ((C4987j) this.f13302b).mo25522b(this, lVar);
    }

    /* renamed from: a */
    public final void mo25544a(C4984g gVar, boolean z) throws C4974a.C4975a {
        boolean z2;
        C4985h a = this.f13304d.mo25535a(gVar.f13282a);
        if (a != null) {
            if (a.f13290c.remove(gVar)) {
                gVar.f13286e.delete();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f13306f -= gVar.f13284c;
                if (z && a.f13290c.isEmpty()) {
                    this.f13304d.mo25540b(a.f13289b);
                    this.f13304d.mo25541c();
                }
                ArrayList arrayList = this.f13305e.get(gVar.f13282a);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((C4974a.C4976b) arrayList.get(size)).mo25520a(this, gVar);
                    }
                }
                C4987j jVar = (C4987j) this.f13302b;
                jVar.f13299a.remove(gVar);
                jVar.f13300b -= gVar.f13284c;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo25514a(C4984g gVar) throws C4974a.C4975a {
        mo25544a(gVar, true);
    }

    /* renamed from: a */
    public synchronized void mo25516a(String str, long j) throws C4974a.C4975a {
        C4986i iVar = this.f13304d;
        C4985h hVar = iVar.f13292a.get(str);
        if (hVar == null) {
            iVar.mo25536a(str, j);
        } else if (hVar.f13291d != j) {
            hVar.f13291d = j;
            iVar.f13297f = true;
        }
        this.f13304d.mo25541c();
    }

    /* renamed from: a */
    public synchronized long mo25512a(String str) {
        long j;
        C4985h hVar = this.f13304d.f13292a.get(str);
        if (hVar == null) {
            j = -1;
        } else {
            j = hVar.f13291d;
        }
        return j;
    }
}
