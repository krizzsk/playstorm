package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4974a;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j */
public final class C4987j implements C4983f, Comparator<C4984g> {

    /* renamed from: a */
    public final TreeSet<C4984g> f13299a = new TreeSet<>(this);

    /* renamed from: b */
    public long f13300b;

    public C4987j(long j) {
    }

    /* renamed from: a */
    public void mo25520a(C4974a aVar, C4984g gVar) {
        this.f13299a.remove(gVar);
        this.f13300b -= gVar.f13284c;
    }

    /* renamed from: b */
    public void mo25522b(C4974a aVar, C4984g gVar) {
        this.f13299a.add(gVar);
        this.f13300b += gVar.f13284c;
        mo25542a(aVar, 0);
    }

    public int compare(Object obj, Object obj2) {
        C4984g gVar = (C4984g) obj;
        C4984g gVar2 = (C4984g) obj2;
        long j = gVar.f13287f;
        long j2 = gVar2.f13287f;
        if (j - j2 == 0) {
            return gVar.compareTo(gVar2);
        }
        return j < j2 ? -1 : 1;
    }

    /* renamed from: a */
    public void mo25521a(C4974a aVar, C4984g gVar, C4984g gVar2) {
        this.f13299a.remove(gVar);
        this.f13300b -= gVar.f13284c;
        mo25522b(aVar, gVar2);
    }

    /* renamed from: a */
    public final void mo25542a(C4974a aVar, long j) {
        while (this.f13300b + j > 10485760) {
            try {
                aVar.mo25514a(this.f13299a.first());
            } catch (C4974a.C4975a unused) {
            }
        }
    }
}
