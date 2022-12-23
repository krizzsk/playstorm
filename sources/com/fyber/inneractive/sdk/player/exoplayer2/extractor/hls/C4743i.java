package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4871j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4717d;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4925e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4944o;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i */
public final class C4743i implements C4944o {

    /* renamed from: a */
    public final int f12009a;

    /* renamed from: b */
    public final C4744j f12010b;

    public C4743i(C4744j jVar, int i) {
        this.f12010b = jVar;
        this.f12009a = i;
    }

    /* renamed from: a */
    public void mo25210a() throws IOException {
        this.f12010b.mo25223j();
    }

    public boolean isReady() {
        C4744j jVar = this.f12010b;
        return jVar.f12035y || (!jVar.mo25221h() && !jVar.f12020j.valueAt(this.f12009a).mo25157f());
    }

    /* renamed from: a */
    public int mo25209a(C4871j jVar, C4701b bVar, boolean z) {
        C4744j jVar2 = this.f12010b;
        int i = this.f12009a;
        if (jVar2.mo25221h()) {
            return -3;
        }
        while (true) {
            boolean z2 = true;
            if (jVar2.f12021k.size() <= 1) {
                break;
            }
            int i2 = jVar2.f12021k.getFirst().f11971j;
            int i3 = 0;
            while (true) {
                if (i3 >= jVar2.f12020j.size()) {
                    break;
                }
                if (jVar2.f12032v[i3]) {
                    C4717d.C4720c cVar = jVar2.f12020j.valueAt(i3).f11878c;
                    if ((cVar.f11902i == 0 ? cVar.f11911r : cVar.f11895b[cVar.f11904k]) == i2) {
                        z2 = false;
                        break;
                    }
                }
                i3++;
            }
            if (!z2) {
                break;
            }
            jVar2.f12021k.removeFirst();
        }
        C4740f first = jVar2.f12021k.getFirst();
        C4869i iVar = first.f13103c;
        if (!iVar.equals(jVar2.f12027q)) {
            C4926f.C4927a aVar = jVar2.f12018h;
            int i4 = jVar2.f12011a;
            int i5 = first.f13104d;
            Object obj = first.f13105e;
            long j = first.f13106f;
            if (aVar.f13122b != null) {
                aVar.f13121a.post(new C4925e(aVar, i4, iVar, i5, obj, j));
            }
        }
        jVar2.f12027q = iVar;
        return jVar2.f12020j.valueAt(i).mo25144a(jVar, bVar, z, jVar2.f12035y, jVar2.f12033w);
    }

    /* renamed from: a */
    public void mo25211a(long j) {
        C4744j jVar = this.f12010b;
        C4717d valueAt = jVar.f12020j.valueAt(this.f12009a);
        if (!jVar.f12035y || j <= valueAt.mo25155d()) {
            valueAt.mo25152a(j, true);
        } else {
            valueAt.mo25158g();
        }
    }
}
