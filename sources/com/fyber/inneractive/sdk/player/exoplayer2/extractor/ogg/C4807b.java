package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4814h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5028e;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.b */
public final class C4807b extends C4814h {

    /* renamed from: n */
    public C5028e f12548n;

    /* renamed from: o */
    public C4808a f12549o;

    /* renamed from: a */
    public void mo25281a(boolean z) {
        super.mo25281a(z);
        if (z) {
            this.f12548n = null;
            this.f12549o = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.b$a */
    public class C4808a implements C4812f, C4767m {

        /* renamed from: a */
        public long[] f12550a;

        /* renamed from: b */
        public long[] f12551b;

        /* renamed from: c */
        public long f12552c = -1;

        /* renamed from: d */
        public long f12553d = -1;

        public C4808a() {
        }

        /* renamed from: a */
        public long mo25276a(C4730g gVar) throws IOException, InterruptedException {
            long j = this.f12553d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f12553d = -1;
            return j2;
        }

        /* renamed from: a */
        public boolean mo25130a() {
            return true;
        }

        /* renamed from: b */
        public C4767m mo25278b() {
            return this;
        }

        /* renamed from: c */
        public long mo25279c(long j) {
            long j2 = (((long) C4807b.this.f12580i) * j) / 1000000;
            this.f12553d = this.f12550a[C5049u.m15396b(this.f12550a, j2, true, true)];
            return j2;
        }

        /* renamed from: a */
        public long mo25129a(long j) {
            return this.f12552c + this.f12551b[C5049u.m15396b(this.f12550a, (((long) C4807b.this.f12580i) * j) / 1000000, true, true)];
        }

        /* renamed from: c */
        public long mo25131c() {
            C5028e eVar = C4807b.this.f12548n;
            return (eVar.f13420d * 1000000) / ((long) eVar.f13417a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r5 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo25280a(com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k r14) {
        /*
            r13 = this;
            byte[] r0 = r14.f13444a
            r1 = 0
            byte r2 = r0[r1]
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x000b
            r2 = r4
            goto L_0x000c
        L_0x000b:
            r2 = r1
        L_0x000c:
            if (r2 != 0) goto L_0x0011
            r0 = -1
            return r0
        L_0x0011:
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5 = 4
            int r0 = r0 >> r5
            switch(r0) {
                case 1: goto L_0x00af;
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00a9;
                case 5: goto L_0x00a9;
                case 6: goto L_0x0023;
                case 7: goto L_0x0023;
                case 8: goto L_0x001d;
                case 9: goto L_0x001d;
                case 10: goto L_0x001d;
                case 11: goto L_0x001d;
                case 12: goto L_0x001d;
                case 13: goto L_0x001d;
                case 14: goto L_0x001d;
                case 15: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x00b1
        L_0x001d:
            int r0 = r0 + -8
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x00ac
        L_0x0023:
            r14.mo25602f(r5)
            byte[] r2 = r14.f13444a
            int r3 = r14.f13445b
            byte r2 = r2[r3]
            long r2 = (long) r2
            r5 = 7
            r6 = r5
        L_0x002f:
            r7 = 6
            if (r6 < 0) goto L_0x004a
            int r8 = r4 << r6
            long r9 = (long) r8
            long r9 = r9 & r2
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0047
            if (r6 >= r7) goto L_0x0043
            int r8 = r8 - r4
            long r8 = (long) r8
            long r2 = r2 & r8
            int r5 = r5 - r6
            goto L_0x004b
        L_0x0043:
            if (r6 != r5) goto L_0x004a
            r5 = r4
            goto L_0x004b
        L_0x0047:
            int r6 = r6 + -1
            goto L_0x002f
        L_0x004a:
            r5 = r1
        L_0x004b:
            if (r5 == 0) goto L_0x0092
            r6 = r4
        L_0x004e:
            if (r6 >= r5) goto L_0x007c
            byte[] r8 = r14.f13444a
            int r9 = r14.f13445b
            int r9 = r9 + r6
            byte r8 = r8[r9]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            r10 = 128(0x80, float:1.794E-43)
            if (r9 != r10) goto L_0x0065
            long r2 = r2 << r7
            r8 = r8 & 63
            long r8 = (long) r8
            long r2 = r2 | r8
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0065:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid UTF-8 sequence continuation byte: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x007c:
            int r2 = r14.f13445b
            int r2 = r2 + r5
            r14.f13445b = r2
            if (r0 != r7) goto L_0x0088
            int r0 = r14.mo25608l()
            goto L_0x008c
        L_0x0088:
            int r0 = r14.mo25613q()
        L_0x008c:
            r14.mo25600e(r1)
            int r3 = r0 + 1
            goto L_0x00b1
        L_0x0092:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid UTF-8 sequence first byte: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x00a9:
            int r0 = r0 - r2
            r14 = 576(0x240, float:8.07E-43)
        L_0x00ac:
            int r3 = r14 << r0
            goto L_0x00b1
        L_0x00af:
            r3 = 192(0xc0, float:2.69E-43)
        L_0x00b1:
            long r0 = (long) r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4807b.mo25280a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):long");
    }

    /* renamed from: a */
    public boolean mo25282a(C5036k kVar, long j, C4814h.C4815a aVar) throws IOException, InterruptedException {
        C5036k kVar2 = kVar;
        C4814h.C4815a aVar2 = aVar;
        byte[] bArr = kVar2.f13444a;
        if (this.f12548n == null) {
            this.f12548n = new C5028e(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, kVar2.f13446c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            C5028e eVar = this.f12548n;
            int i = eVar.f13419c;
            int i2 = eVar.f13417a;
            aVar2.f12585a = C4869i.m14975a((String) null, "audio/flac", (String) null, -1, i * i2, eVar.f13418b, i2, -1, (List<byte[]>) singletonList, (C4702a) null, 0, (String) null);
        } else {
            if ((bArr[0] & Byte.MAX_VALUE) == 3) {
                C4808a aVar3 = new C4808a();
                this.f12549o = aVar3;
                kVar2.mo25602f(1);
                int n = kVar.mo25610n() / 18;
                aVar3.f12550a = new long[n];
                aVar3.f12551b = new long[n];
                for (int i3 = 0; i3 < n; i3++) {
                    aVar3.f12550a[i3] = kVar.mo25605i();
                    aVar3.f12551b[i3] = kVar.mo25605i();
                    kVar2.mo25602f(2);
                }
            } else {
                if (bArr[0] == -1) {
                    C4808a aVar4 = this.f12549o;
                    if (aVar4 != null) {
                        aVar4.f12552c = j;
                        aVar2.f12586b = aVar4;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
