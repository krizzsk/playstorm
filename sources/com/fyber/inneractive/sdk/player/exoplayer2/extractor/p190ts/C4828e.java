package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e */
public final class C4828e implements C4853v.C4856c {

    /* renamed from: a */
    public final int f12647a;

    /* renamed from: b */
    public final List<C4869i> f12648b;

    public C4828e(int i, List<C4869i> list) {
        this.f12647a = i;
        if (!mo25303a(32) && list.isEmpty()) {
            list = Collections.singletonList(C4869i.m14977a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (C4702a) null));
        }
        this.f12648b = list;
    }

    /* renamed from: a */
    public SparseArray<C4853v> mo25300a() {
        return new SparseArray<>();
    }

    /* renamed from: a */
    public C4853v mo25302a(int i, C4853v.C4855b bVar) {
        if (i == 2) {
            return new C4843o(new C4832i());
        }
        if (i == 3 || i == 4) {
            return new C4843o(new C4841m(bVar.f12842a));
        }
        if (i != 15) {
            if (i == 21) {
                return new C4843o(new C4840l());
            }
            if (i != 27) {
                if (i == 36) {
                    return new C4843o(new C4838k(mo25301a(bVar)));
                }
                if (i == 89) {
                    return new C4843o(new C4830g(bVar.f12843b));
                }
                if (i != 138) {
                    if (i != 129) {
                        if (i != 130) {
                            if (i != 134) {
                                if (i != 135) {
                                    return null;
                                }
                            } else if (mo25303a(16)) {
                                return null;
                            } else {
                                return new C4847r(new C4849t());
                            }
                        }
                    }
                    return new C4843o(new C4825b(bVar.f12842a));
                }
                return new C4843o(new C4829f(bVar.f12842a));
            } else if (mo25303a(4)) {
                return null;
            } else {
                return new C4843o(new C4834j(mo25301a(bVar), mo25303a(1), mo25303a(8)));
            }
        } else if (mo25303a(2)) {
            return null;
        } else {
            return new C4843o(new C4827d(false, bVar.f12842a));
        }
    }

    /* renamed from: a */
    public final C4848s mo25301a(C4853v.C4855b bVar) {
        byte b;
        String str;
        if (mo25303a(32)) {
            return new C4848s(this.f12648b);
        }
        byte[] bArr = bVar.f12844c;
        int length = bArr.length;
        int i = 0;
        List<C4869i> list = this.f12648b;
        while (length - i > 0) {
            int i2 = i + 1;
            byte b2 = bArr[i] & 255;
            int i3 = i2 + 1;
            int i4 = (bArr[i2] & 255) + i3;
            boolean z = true;
            ArrayList arrayList = list;
            if (b2 == 134) {
                ArrayList arrayList2 = new ArrayList();
                int i5 = i3 + 1;
                byte b3 = bArr[i3] & 255 & Ascii.f17947US;
                for (int i6 = 0; i6 < b3; i6++) {
                    String str2 = new String(bArr, i5, 3, Charset.defaultCharset());
                    int i7 = i5 + 3;
                    int i8 = i7 + 1;
                    byte b4 = bArr[i7] & 255;
                    if ((b4 & 128) != 0) {
                        b = b4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        b = 1;
                    }
                    arrayList2.add(C4869i.m14976a((String) null, str, (String) null, -1, 0, str2, b, (C4702a) null, Long.MAX_VALUE, Collections.emptyList()));
                    i5 = i8 + 2;
                    C5023a.m15302a(i5 >= 0 && i5 <= length);
                }
                arrayList = arrayList2;
            }
            if (i4 < 0 || i4 > length) {
                z = false;
            }
            C5023a.m15302a(z);
            i = i4;
            list = arrayList;
        }
        return new C4848s(list);
    }

    /* renamed from: a */
    public final boolean mo25303a(int i) {
        return (i & this.f12647a) != 0;
    }
}
