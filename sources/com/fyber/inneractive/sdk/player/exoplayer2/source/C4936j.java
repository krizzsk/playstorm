package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4930i;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.j */
public class C4936j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4930i.C4934d f13175a;

    /* renamed from: b */
    public final /* synthetic */ C4930i f13176b;

    public C4936j(C4930i iVar, C4930i.C4934d dVar) {
        this.f13176b = iVar;
        this.f13175a = dVar;
    }

    public void run() {
        C4930i.C4934d dVar = this.f13175a;
        C4723f fVar = dVar.f13172c;
        if (fVar != null) {
            fVar.mo25167b();
            dVar.f13172c = null;
        }
        int size = this.f13176b.f13146o.size();
        for (int i = 0; i < size; i++) {
            this.f13176b.f13146o.valueAt(i).mo25153b();
        }
    }
}
