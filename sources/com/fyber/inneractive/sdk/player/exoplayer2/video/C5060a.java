package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5026c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.a */
public final class C5060a {

    /* renamed from: a */
    public final List<byte[]> f13532a;

    /* renamed from: b */
    public final int f13533b;

    /* renamed from: c */
    public final int f13534c;

    /* renamed from: d */
    public final int f13535d;

    /* renamed from: e */
    public final float f13536e;

    public C5060a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f13532a = list;
        this.f13533b = i;
        this.f13534c = i2;
        this.f13535d = i3;
        this.f13536e = f;
    }

    /* renamed from: a */
    public static byte[] m15427a(C5036k kVar) {
        int q = kVar.mo25613q();
        int i = kVar.f13445b;
        kVar.mo25602f(q);
        byte[] bArr = kVar.f13444a;
        byte[] bArr2 = C5026c.f13413a;
        byte[] bArr3 = new byte[(bArr2.length + q)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, q);
        return bArr3;
    }

    /* renamed from: b */
    public static C5060a m15428b(C5036k kVar) throws C4873l {
        float f;
        int i;
        int i2;
        try {
            kVar.mo25602f(4);
            int l = (kVar.mo25608l() & 3) + 1;
            if (l != 3) {
                ArrayList arrayList = new ArrayList();
                int l2 = kVar.mo25608l() & 31;
                for (int i3 = 0; i3 < l2; i3++) {
                    arrayList.add(m15427a(kVar));
                }
                int l3 = kVar.mo25608l();
                for (int i4 = 0; i4 < l3; i4++) {
                    arrayList.add(m15427a(kVar));
                }
                if (l2 > 0) {
                    C5032i.C5034b b = C5032i.m15324b((byte[]) arrayList.get(0), l, ((byte[]) arrayList.get(0)).length);
                    int i5 = b.f13431b;
                    int i6 = b.f13432c;
                    f = b.f13433d;
                    i2 = i5;
                    i = i6;
                } else {
                    f = 1.0f;
                    i2 = -1;
                    i = -1;
                }
                return new C5060a(arrayList, l, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C4873l("Error parsing AVC config", e);
        }
    }
}
