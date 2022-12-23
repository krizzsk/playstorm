package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4710e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4864h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4913p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4762i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4930i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4942n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4971b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5015x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.l */
public final class C4938l implements C4942n, C4942n.C4943a {

    /* renamed from: a */
    public final Uri f13179a;

    /* renamed from: b */
    public final C4996g.C4997a f13180b;

    /* renamed from: c */
    public final C4762i f13181c;

    /* renamed from: d */
    public final int f13182d;

    /* renamed from: e */
    public final Handler f13183e;

    /* renamed from: f */
    public final C4939a f13184f;

    /* renamed from: g */
    public final C4913p.C4915b f13185g = new C4913p.C4915b();

    /* renamed from: h */
    public C4942n.C4943a f13186h;

    /* renamed from: i */
    public boolean f13187i;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.l$a */
    public interface C4939a {
    }

    public C4938l(Uri uri, C4996g.C4997a aVar, C4762i iVar, int i, Handler handler, C4939a aVar2, String str) {
        this.f13179a = uri;
        this.f13180b = aVar;
        this.f13181c = iVar;
        this.f13182d = i;
        this.f13183e = handler;
        this.f13184f = aVar2;
    }

    /* renamed from: a */
    public void mo25205a() throws IOException {
    }

    /* renamed from: a */
    public void mo25206a(C4710e eVar, boolean z, C4942n.C4943a aVar) {
        this.f13186h = aVar;
        ((C4864h) aVar).f12899f.obtainMessage(7, Pair.create(new C4946q(-9223372036854775807L, false), (Object) null)).sendToTarget();
    }

    /* renamed from: b */
    public void mo25208b() {
        this.f13186h = null;
    }

    /* renamed from: a */
    public C4940m mo25204a(int i, C4971b bVar, long j) {
        C5023a.m15302a(i == 0);
        return new C4930i(this.f13179a, this.f13180b.mo24836a(), this.f13181c.mo25141a(), this.f13182d, this.f13183e, this.f13184f, this, bVar, (String) null);
    }

    /* renamed from: a */
    public void mo25207a(C4940m mVar) {
        C4930i iVar = (C4930i) mVar;
        C4930i.C4934d dVar = iVar.f13141j;
        C5015x xVar = iVar.f13140i;
        C4936j jVar = new C4936j(iVar, dVar);
        C5015x.C5017b<? extends C5015x.C5018c> bVar = xVar.f13390b;
        if (bVar != null) {
            bVar.mo25571a(true);
        }
        xVar.f13389a.execute(jVar);
        xVar.f13389a.shutdown();
        iVar.f13145n.removeCallbacksAndMessages((Object) null);
        iVar.f13131G = true;
    }

    /* renamed from: a */
    public void mo25342a(C4913p pVar, Object obj) {
        boolean z = false;
        if (pVar.mo25459a(0, this.f13185g, false).f13080d != -9223372036854775807L) {
            z = true;
        }
        if (!this.f13187i || z) {
            this.f13187i = z;
            this.f13186h.mo25342a(pVar, (Object) null);
        }
    }
}
