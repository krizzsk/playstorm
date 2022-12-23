package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C4710e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4940m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4942n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4971b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5020y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h */
public final class C4742h implements C4942n, C4756e.C4761e {

    /* renamed from: a */
    public final Uri f12004a;

    /* renamed from: b */
    public final C4738d f12005b;

    /* renamed from: c */
    public final C4926f.C4927a f12006c;

    /* renamed from: d */
    public C4756e f12007d;

    /* renamed from: e */
    public C4942n.C4943a f12008e;

    public C4742h(Uri uri, C4996g.C4997a aVar, int i, Handler handler, C4926f fVar) {
        this(uri, (C4738d) new C4733b(aVar), i, handler, fVar);
    }

    /* renamed from: a */
    public void mo25206a(C4710e eVar, boolean z, C4942n.C4943a aVar) {
        C5023a.m15304b(this.f12007d == null);
        Uri uri = this.f12004a;
        C4738d dVar = this.f12005b;
        C4756e eVar2 = new C4756e(uri, dVar, this.f12006c, 3, this);
        this.f12007d = eVar2;
        this.f12008e = aVar;
        eVar2.f12110i.mo25565a(new C5020y(((C4733b) dVar).f11941a.mo24836a(), uri, 4, eVar2.f12104c), eVar2, 3);
    }

    /* renamed from: b */
    public void mo25208b() {
        C4756e eVar = this.f12007d;
        if (eVar != null) {
            eVar.f12110i.mo25569d();
            for (C4756e.C4757a aVar : eVar.f12106e.values()) {
                aVar.f12117b.mo25569d();
            }
            eVar.f12107f.removeCallbacksAndMessages((Object) null);
            eVar.f12106e.clear();
            this.f12007d = null;
        }
        this.f12008e = null;
    }

    public C4742h(Uri uri, C4738d dVar, int i, Handler handler, C4926f fVar) {
        this.f12004a = uri;
        this.f12005b = dVar;
        this.f12006c = new C4926f.C4927a(handler, fVar);
    }

    /* renamed from: a */
    public void mo25205a() throws IOException {
        C4756e eVar = this.f12007d;
        eVar.f12110i.mo25568c();
        C4749a.C4750a aVar = eVar.f12113l;
        if (aVar != null) {
            C4756e.C4757a aVar2 = eVar.f12106e.get(aVar);
            aVar2.f12117b.mo25568c();
            IOException iOException = aVar2.f12125j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: a */
    public C4940m mo25204a(int i, C4971b bVar, long j) {
        C5023a.m15302a(i == 0);
        return new C4741g(this.f12007d, this.f12005b, 3, this.f12006c, bVar, j);
    }

    /* renamed from: a */
    public void mo25207a(C4940m mVar) {
        C4741g gVar = (C4741g) mVar;
        gVar.f11988a.f12109h.remove(gVar);
        gVar.f11995h.removeCallbacksAndMessages((Object) null);
        C4744j[] jVarArr = gVar.f12001n;
        if (jVarArr != null) {
            for (C4744j jVar : jVarArr) {
                int size = jVar.f12020j.size();
                for (int i = 0; i < size; i++) {
                    jVar.f12020j.valueAt(i).mo25153b();
                }
                jVar.f12017g.mo25569d();
                jVar.f12023m.removeCallbacksAndMessages((Object) null);
                jVar.f12029s = true;
            }
        }
    }
}
