package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s */
public final class C4848s {

    /* renamed from: a */
    public final List<C4869i> f12814a;

    /* renamed from: b */
    public final C4804n[] f12815b;

    public C4848s(List<C4869i> list) {
        this.f12814a = list;
        this.f12815b = new C4804n[list.size()];
    }

    /* renamed from: a */
    public void mo25320a(C4731h hVar, C4853v.C4857d dVar) {
        for (int i = 0; i < this.f12815b.length; i++) {
            dVar.mo25322a();
            C4804n a = hVar.mo25173a(dVar.mo25324c(), 3);
            C4869i iVar = this.f12814a.get(i);
            String str = iVar.f12956f;
            C5023a.m15303a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = iVar.f12951a;
            if (str2 == null) {
                str2 = dVar.mo25323b();
            }
            a.mo25149a(C4869i.m14976a(str2, str, (String) null, -1, iVar.f12974x, iVar.f12975y, iVar.f12976z, (C4702a) null, Long.MAX_VALUE, Collections.emptyList()));
            this.f12815b[i] = a;
        }
    }
}
