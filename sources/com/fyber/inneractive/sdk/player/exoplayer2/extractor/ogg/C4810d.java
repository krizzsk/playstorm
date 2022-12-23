package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.d */
public final class C4810d {

    /* renamed from: a */
    public final C4811e f12556a = new C4811e();

    /* renamed from: b */
    public final C5036k f12557b = new C5036k(new byte[65025], 0);

    /* renamed from: c */
    public int f12558c = -1;

    /* renamed from: d */
    public int f12559d;

    /* renamed from: e */
    public boolean f12560e;

    /* renamed from: a */
    public boolean mo25284a(C4730g gVar) throws IOException, InterruptedException {
        int i;
        C5023a.m15304b(gVar != null);
        if (this.f12560e) {
            this.f12560e = false;
            this.f12557b.mo25614r();
        }
        while (!this.f12560e) {
            if (this.f12558c < 0) {
                if (!this.f12556a.mo25286a(gVar, true)) {
                    return false;
                }
                C4811e eVar = this.f12556a;
                int i2 = eVar.f12565d;
                if ((eVar.f12562a & 1) == 1 && this.f12557b.f13446c == 0) {
                    i2 += mo25283a(0);
                    i = this.f12559d + 0;
                } else {
                    i = 0;
                }
                ((C4715b) gVar).mo25139c(i2);
                this.f12558c = i;
            }
            int a = mo25283a(this.f12558c);
            int i3 = this.f12558c + this.f12559d;
            if (a > 0) {
                int b = this.f12557b.mo25593b();
                C5036k kVar = this.f12557b;
                int i4 = kVar.f13446c + a;
                if (b < i4) {
                    kVar.f13444a = Arrays.copyOf(kVar.f13444a, i4);
                }
                C5036k kVar2 = this.f12557b;
                ((C4715b) gVar).mo25138b(kVar2.f13444a, kVar2.f13446c, a, false);
                C5036k kVar3 = this.f12557b;
                kVar3.mo25598d(kVar3.f13446c + a);
                this.f12560e = this.f12556a.f12567f[i3 + -1] != 255;
            }
            if (i3 == this.f12556a.f12564c) {
                i3 = -1;
            }
            this.f12558c = i3;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo25283a(int i) {
        int i2;
        int i3 = 0;
        this.f12559d = 0;
        do {
            int i4 = this.f12559d;
            int i5 = i + i4;
            C4811e eVar = this.f12556a;
            if (i5 >= eVar.f12564c) {
                break;
            }
            int[] iArr = eVar.f12567f;
            this.f12559d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
