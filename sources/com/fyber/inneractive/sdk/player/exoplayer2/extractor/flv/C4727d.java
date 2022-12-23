package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d */
public abstract class C4727d {

    /* renamed from: a */
    public final C4804n f11931a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d$a */
    public static final class C4728a extends C4873l {
        public C4728a(String str) {
            super(str);
        }
    }

    public C4727d(C4804n nVar) {
        this.f11931a = nVar;
    }

    /* renamed from: a */
    public final void mo25172a(C5036k kVar, long j) throws C4873l {
        if (mo25168a(kVar)) {
            mo25169b(kVar, j);
        }
    }

    /* renamed from: a */
    public abstract boolean mo25168a(C5036k kVar) throws C4873l;

    /* renamed from: b */
    public abstract void mo25169b(C5036k kVar, long j) throws C4873l;
}
