package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.cache.C4614h;
import com.fyber.inneractive.sdk.player.controller.C4635d;
import com.fyber.inneractive.sdk.player.controller.C4662r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4938l;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.k */
public class C4937k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IOException f13177a;

    /* renamed from: b */
    public final /* synthetic */ C4930i f13178b;

    public C4937k(C4930i iVar, IOException iOException) {
        this.f13178b = iVar;
        this.f13177a = iOException;
    }

    public void run() {
        C4938l.C4939a aVar = this.f13178b.f13136e;
        IOException iOException = this.f13177a;
        C4662r rVar = (C4662r) aVar;
        if (rVar.f11639a != null && (iOException.getCause() instanceof C4614h.C4620f) && ((C4635d) rVar.f11639a.get()).f11554B) {
            ((C4635d) rVar.f11639a.get()).mo24887a(((C4635d) rVar.f11639a.get()).f11557E, ((C4635d) rVar.f11639a.get()).f11556D, false);
        }
    }
}
