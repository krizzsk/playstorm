package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5151i;
import com.fyber.inneractive.sdk.protobuf.C5207q0;
import com.fyber.inneractive.sdk.protobuf.C5212r1;
import com.fyber.inneractive.sdk.protobuf.C5219s1;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.protobuf.j */
public abstract class C5172j {

    /* renamed from: a */
    public int f13795a;

    /* renamed from: b */
    public int f13796b;

    /* renamed from: c */
    public int f13797c;

    /* renamed from: d */
    public C5180k f13798d;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.j$b */
    public static final class C5174b extends C5172j {

        /* renamed from: e */
        public final byte[] f13799e;

        /* renamed from: f */
        public final boolean f13800f;

        /* renamed from: g */
        public int f13801g;

        /* renamed from: h */
        public int f13802h;

        /* renamed from: i */
        public int f13803i;

        /* renamed from: j */
        public int f13804j;

        /* renamed from: k */
        public int f13805k;

        /* renamed from: l */
        public int f13806l = Integer.MAX_VALUE;

        public C5174b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f13799e = bArr;
            this.f13801g = i2 + i;
            this.f13803i = i;
            this.f13804j = i;
            this.f13800f = z;
        }

        /* renamed from: A */
        public long mo26073A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = mo26076w();
                j |= ((long) (w & Byte.MAX_VALUE)) << i;
                if ((w & 128) == 0) {
                    return j;
                }
            }
            throw C5119a0.m15528e();
        }

        /* renamed from: B */
        public final void mo26074B() {
            int i = this.f13801g + this.f13802h;
            this.f13801g = i;
            int i2 = i - this.f13804j;
            int i3 = this.f13806l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f13802h = i4;
                this.f13801g = i - i4;
                return;
            }
            this.f13802h = 0;
        }

        /* renamed from: a */
        public void mo26046a(int i) throws C5119a0 {
            if (this.f13805k != i) {
                throw C5119a0.m15524a();
            }
        }

        /* renamed from: b */
        public int mo26049b() {
            return this.f13803i - this.f13804j;
        }

        /* renamed from: c */
        public void mo26050c(int i) {
            this.f13806l = i;
            mo26074B();
        }

        /* renamed from: d */
        public boolean mo26053d() throws IOException {
            return mo26079z() != 0;
        }

        /* renamed from: e */
        public boolean mo26055e(int i) throws IOException {
            int t;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f13801g - this.f13803i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.f13799e;
                        int i5 = this.f13803i;
                        this.f13803i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw C5119a0.m15528e();
                }
                while (i4 < 10) {
                    if (mo26076w() < 0) {
                        i4++;
                    }
                }
                throw C5119a0.m15528e();
                return true;
            } else if (i3 == 1) {
                mo26075f(8);
                return true;
            } else if (i3 == 2) {
                mo26075f(mo26063m());
                return true;
            } else if (i3 == 3) {
                do {
                    t = mo26070t();
                    if (t == 0 || !mo26055e(t)) {
                        mo26046a(C5227t1.m16370a(i >>> 3, 4));
                    }
                    t = mo26070t();
                    break;
                } while (!mo26055e(t));
                mo26046a(C5227t1.m16370a(i >>> 3, 4));
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo26075f(4);
                    return true;
                }
                throw C5119a0.m15527d();
            }
        }

        /* renamed from: f */
        public double mo26056f() throws IOException {
            return Double.longBitsToDouble(mo26078y());
        }

        /* renamed from: g */
        public int mo26057g() throws IOException {
            return mo26063m();
        }

        /* renamed from: h */
        public int mo26058h() throws IOException {
            return mo26077x();
        }

        /* renamed from: i */
        public long mo26059i() throws IOException {
            return mo26078y();
        }

        /* renamed from: j */
        public float mo26060j() throws IOException {
            return Float.intBitsToFloat(mo26077x());
        }

        /* renamed from: k */
        public int mo26061k() throws IOException {
            return mo26063m();
        }

        /* renamed from: l */
        public long mo26062l() throws IOException {
            return mo26079z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo26063m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f13803i
                int r1 = r5.f13801g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f13799e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f13803i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo26073A()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f13803i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5172j.C5174b.mo26063m():int");
        }

        /* renamed from: n */
        public int mo26064n() throws IOException {
            return mo26077x();
        }

        /* renamed from: o */
        public long mo26065o() throws IOException {
            return mo26078y();
        }

        /* renamed from: p */
        public int mo26066p() throws IOException {
            return C5172j.m15822b(mo26063m());
        }

        /* renamed from: q */
        public long mo26067q() throws IOException {
            return C5172j.m15818a(mo26079z());
        }

        /* renamed from: r */
        public String mo26068r() throws IOException {
            int m = mo26063m();
            if (m > 0) {
                int i = this.f13801g;
                int i2 = this.f13803i;
                if (m <= i - i2) {
                    String str = new String(this.f13799e, i2, m, C5252z.f13963a);
                    this.f13803i += m;
                    return str;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m < 0) {
                throw C5119a0.m15529f();
            }
            throw C5119a0.m15532i();
        }

        /* renamed from: s */
        public String mo26069s() throws IOException {
            int m = mo26063m();
            if (m > 0) {
                int i = this.f13801g;
                int i2 = this.f13803i;
                if (m <= i - i2) {
                    String a = C5219s1.f13873a.mo26245a(this.f13799e, i2, m);
                    this.f13803i += m;
                    return a;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m <= 0) {
                throw C5119a0.m15529f();
            }
            throw C5119a0.m15532i();
        }

        /* renamed from: t */
        public int mo26070t() throws IOException {
            if (mo26051c()) {
                this.f13805k = 0;
                return 0;
            }
            int m = mo26063m();
            this.f13805k = m;
            int i = C5227t1.f13895a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw C5119a0.m15525b();
        }

        /* renamed from: u */
        public int mo26071u() throws IOException {
            return mo26063m();
        }

        /* renamed from: v */
        public long mo26072v() throws IOException {
            return mo26079z();
        }

        /* renamed from: w */
        public byte mo26076w() throws IOException {
            int i = this.f13803i;
            if (i != this.f13801g) {
                byte[] bArr = this.f13799e;
                this.f13803i = i + 1;
                return bArr[i];
            }
            throw C5119a0.m15532i();
        }

        /* renamed from: x */
        public int mo26077x() throws IOException {
            int i = this.f13803i;
            if (this.f13801g - i >= 4) {
                byte[] bArr = this.f13799e;
                this.f13803i = i + 4;
                return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
            }
            throw C5119a0.m15532i();
        }

        /* renamed from: y */
        public long mo26078y() throws IOException {
            int i = this.f13803i;
            if (this.f13801g - i >= 8) {
                byte[] bArr = this.f13799e;
                this.f13803i = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw C5119a0.m15532i();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo26079z() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f13803i
                int r1 = r11.f13801g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f13799e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f13803i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo26073A()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f13803i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5172j.C5174b.mo26079z():long");
        }

        /* renamed from: d */
        public int mo26052d(int i) throws C5119a0 {
            if (i >= 0) {
                int b = i + mo26049b();
                int i2 = this.f13806l;
                if (b <= i2) {
                    this.f13806l = b;
                    mo26074B();
                    return i2;
                }
                throw C5119a0.m15532i();
            }
            throw C5119a0.m15529f();
        }

        /* renamed from: f */
        public void mo26075f(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f13801g;
                int i3 = this.f13803i;
                if (i <= i2 - i3) {
                    this.f13803i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C5119a0.m15529f();
            }
            throw C5119a0.m15532i();
        }

        /* renamed from: a */
        public void mo26047a(int i, C5207q0.C5208a aVar, C5205q qVar) throws IOException {
            int i2 = this.f13795a;
            if (i2 < this.f13796b) {
                this.f13795a = i2 + 1;
                ((GeneratedMessageLite.C5108a) aVar).mo25808a((C5172j) this, qVar);
                mo26046a(C5227t1.m16370a(i, 4));
                this.f13795a--;
                return;
            }
            throw C5119a0.m15531h();
        }

        /* renamed from: c */
        public boolean mo26051c() throws IOException {
            return this.f13803i == this.f13801g;
        }

        /* renamed from: a */
        public void mo26048a(C5207q0.C5208a aVar, C5205q qVar) throws IOException {
            int m = mo26063m();
            if (this.f13795a < this.f13796b) {
                int d = mo26052d(m);
                this.f13795a++;
                ((GeneratedMessageLite.C5108a) aVar).mo25808a((C5172j) this, qVar);
                mo26046a(0);
                this.f13795a--;
                this.f13806l = d;
                mo26074B();
                return;
            }
            throw C5119a0.m15531h();
        }

        /* renamed from: a */
        public int mo26045a() {
            int i = this.f13806l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo26049b();
        }

        /* renamed from: e */
        public C5151i mo26054e() throws IOException {
            byte[] bArr;
            int m = mo26063m();
            if (m > 0) {
                int i = this.f13801g;
                int i2 = this.f13803i;
                if (m <= i - i2) {
                    C5151i a = C5151i.m15768a(this.f13799e, i2, m);
                    this.f13803i += m;
                    return a;
                }
            }
            if (m == 0) {
                return C5151i.f13766b;
            }
            if (m > 0) {
                int i3 = this.f13801g;
                int i4 = this.f13803i;
                if (m <= i3 - i4) {
                    int i5 = m + i4;
                    this.f13803i = i5;
                    bArr = Arrays.copyOfRange(this.f13799e, i4, i5);
                    C5151i iVar = C5151i.f13766b;
                    return new C5151i.C5159h(bArr);
                }
            }
            if (m > 0) {
                throw C5119a0.m15532i();
            } else if (m == 0) {
                bArr = C5252z.f13964b;
                C5151i iVar2 = C5151i.f13766b;
                return new C5151i.C5159h(bArr);
            } else {
                throw C5119a0.m15529f();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.j$c */
    public static final class C5175c extends C5172j {

        /* renamed from: e */
        public final InputStream f13807e;

        /* renamed from: f */
        public final byte[] f13808f;

        /* renamed from: g */
        public int f13809g;

        /* renamed from: h */
        public int f13810h;

        /* renamed from: i */
        public int f13811i;

        /* renamed from: j */
        public int f13812j;

        /* renamed from: k */
        public int f13813k;

        /* renamed from: l */
        public int f13814l = Integer.MAX_VALUE;

        public C5175c(InputStream inputStream, int i) {
            super();
            C5252z.m16435a(inputStream, "input");
            this.f13807e = inputStream;
            this.f13808f = new byte[i];
            this.f13809g = 0;
            this.f13811i = 0;
            this.f13813k = 0;
        }

        /* renamed from: A */
        public long mo26080A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = mo26088w();
                j |= ((long) (w & Byte.MAX_VALUE)) << i;
                if ((w & 128) == 0) {
                    return j;
                }
            }
            throw C5119a0.m15528e();
        }

        /* renamed from: B */
        public final void mo26081B() {
            int i = this.f13809g + this.f13810h;
            this.f13809g = i;
            int i2 = this.f13813k + i;
            int i3 = this.f13814l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f13810h = i4;
                this.f13809g = i - i4;
                return;
            }
            this.f13810h = 0;
        }

        /* renamed from: a */
        public void mo26046a(int i) throws C5119a0 {
            if (this.f13812j != i) {
                throw C5119a0.m15524a();
            }
        }

        /* renamed from: b */
        public int mo26049b() {
            return this.f13813k + this.f13811i;
        }

        /* renamed from: c */
        public void mo26050c(int i) {
            this.f13814l = i;
            mo26081B();
        }

        /* renamed from: d */
        public boolean mo26053d() throws IOException {
            return mo26091z() != 0;
        }

        /* renamed from: e */
        public boolean mo26055e(int i) throws IOException {
            int t;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f13809g - this.f13811i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.f13808f;
                        int i5 = this.f13811i;
                        this.f13811i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw C5119a0.m15528e();
                }
                while (i4 < 10) {
                    if (mo26088w() < 0) {
                        i4++;
                    }
                }
                throw C5119a0.m15528e();
                return true;
            } else if (i3 == 1) {
                mo26086i(8);
                return true;
            } else if (i3 == 2) {
                mo26086i(mo26063m());
                return true;
            } else if (i3 == 3) {
                do {
                    t = mo26070t();
                    if (t == 0 || !mo26055e(t)) {
                        mo26046a(C5227t1.m16370a(i >>> 3, 4));
                    }
                    t = mo26070t();
                    break;
                } while (!mo26055e(t));
                mo26046a(C5227t1.m16370a(i >>> 3, 4));
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo26086i(4);
                    return true;
                }
                throw C5119a0.m15527d();
            }
        }

        /* renamed from: f */
        public double mo26056f() throws IOException {
            return Double.longBitsToDouble(mo26090y());
        }

        /* renamed from: g */
        public int mo26057g() throws IOException {
            return mo26063m();
        }

        /* renamed from: h */
        public int mo26058h() throws IOException {
            return mo26089x();
        }

        /* renamed from: i */
        public long mo26059i() throws IOException {
            return mo26090y();
        }

        /* renamed from: j */
        public float mo26060j() throws IOException {
            return Float.intBitsToFloat(mo26089x());
        }

        /* renamed from: k */
        public int mo26061k() throws IOException {
            return mo26063m();
        }

        /* renamed from: l */
        public long mo26062l() throws IOException {
            return mo26091z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo26063m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f13811i
                int r1 = r5.f13809g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f13808f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f13811i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo26080A()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f13811i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5172j.C5175c.mo26063m():int");
        }

        /* renamed from: n */
        public int mo26064n() throws IOException {
            return mo26089x();
        }

        /* renamed from: o */
        public long mo26065o() throws IOException {
            return mo26090y();
        }

        /* renamed from: p */
        public int mo26066p() throws IOException {
            return C5172j.m15822b(mo26063m());
        }

        /* renamed from: q */
        public long mo26067q() throws IOException {
            return C5172j.m15818a(mo26091z());
        }

        /* renamed from: r */
        public String mo26068r() throws IOException {
            int m = mo26063m();
            if (m > 0) {
                int i = this.f13809g;
                int i2 = this.f13811i;
                if (m <= i - i2) {
                    String str = new String(this.f13808f, i2, m, C5252z.f13963a);
                    this.f13811i += m;
                    return str;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m > this.f13809g) {
                return new String(mo26082a(m, false), C5252z.f13963a);
            }
            mo26085h(m);
            String str2 = new String(this.f13808f, this.f13811i, m, C5252z.f13963a);
            this.f13811i += m;
            return str2;
        }

        /* renamed from: s */
        public String mo26069s() throws IOException {
            byte[] bArr;
            int m = mo26063m();
            int i = this.f13811i;
            int i2 = this.f13809g;
            if (m <= i2 - i && m > 0) {
                bArr = this.f13808f;
                this.f13811i = i + m;
            } else if (m == 0) {
                return "";
            } else {
                if (m <= i2) {
                    mo26085h(m);
                    bArr = this.f13808f;
                    this.f13811i = m + 0;
                } else {
                    bArr = mo26082a(m, false);
                }
                i = 0;
            }
            return C5219s1.f13873a.mo26245a(bArr, i, m);
        }

        /* renamed from: t */
        public int mo26070t() throws IOException {
            if (mo26051c()) {
                this.f13812j = 0;
                return 0;
            }
            int m = mo26063m();
            this.f13812j = m;
            int i = C5227t1.f13895a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw C5119a0.m15525b();
        }

        /* renamed from: u */
        public int mo26071u() throws IOException {
            return mo26063m();
        }

        /* renamed from: v */
        public long mo26072v() throws IOException {
            return mo26091z();
        }

        /* renamed from: w */
        public byte mo26088w() throws IOException {
            if (this.f13811i == this.f13809g) {
                mo26085h(1);
            }
            byte[] bArr = this.f13808f;
            int i = this.f13811i;
            this.f13811i = i + 1;
            return bArr[i];
        }

        /* renamed from: x */
        public int mo26089x() throws IOException {
            int i = this.f13811i;
            if (this.f13809g - i < 4) {
                mo26085h(4);
                i = this.f13811i;
            }
            byte[] bArr = this.f13808f;
            this.f13811i = i + 4;
            return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
        }

        /* renamed from: y */
        public long mo26090y() throws IOException {
            int i = this.f13811i;
            if (this.f13809g - i < 8) {
                mo26085h(8);
                i = this.f13811i;
            }
            byte[] bArr = this.f13808f;
            this.f13811i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo26091z() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f13811i
                int r1 = r11.f13809g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f13808f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f13811i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo26080A()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f13811i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5172j.C5175c.mo26091z():long");
        }

        /* renamed from: d */
        public int mo26052d(int i) throws C5119a0 {
            if (i >= 0) {
                int i2 = i + this.f13813k + this.f13811i;
                int i3 = this.f13814l;
                if (i2 <= i3) {
                    this.f13814l = i2;
                    mo26081B();
                    return i3;
                }
                throw C5119a0.m15532i();
            }
            throw C5119a0.m15529f();
        }

        /* renamed from: f */
        public final byte[] mo26083f(int i) throws IOException {
            if (i == 0) {
                return C5252z.f13964b;
            }
            if (i >= 0) {
                int i2 = this.f13813k;
                int i3 = this.f13811i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f13797c <= 0) {
                    int i5 = this.f13814l;
                    if (i4 <= i5) {
                        int i6 = this.f13809g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f13807e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f13808f, this.f13811i, bArr, 0, i6);
                        this.f13813k += this.f13809g;
                        this.f13811i = 0;
                        this.f13809g = 0;
                        while (i6 < i) {
                            int read = this.f13807e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f13813k += read;
                                i6 += read;
                            } else {
                                throw C5119a0.m15532i();
                            }
                        }
                        return bArr;
                    }
                    mo26086i((i5 - i2) - i3);
                    throw C5119a0.m15532i();
                }
                throw new C5119a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C5119a0.m15529f();
        }

        /* renamed from: g */
        public final List<byte[]> mo26084g(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f13807e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f13813k += read;
                        i2 += read;
                    } else {
                        throw C5119a0.m15532i();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: h */
        public final void mo26085h(int i) throws IOException {
            if (mo26087j(i)) {
                return;
            }
            if (i > (this.f13797c - this.f13813k) - this.f13811i) {
                throw new C5119a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C5119a0.m15532i();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
            throw new java.lang.IllegalStateException(r7.f13807e.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26086i(int r8) throws java.io.IOException {
            /*
                r7 = this;
                int r0 = r7.f13809g
                int r1 = r7.f13811i
                int r0 = r0 - r1
                if (r8 > r0) goto L_0x000e
                if (r8 < 0) goto L_0x000e
                int r1 = r1 + r8
                r7.f13811i = r1
                goto L_0x0090
            L_0x000e:
                if (r8 < 0) goto L_0x009b
                int r2 = r7.f13813k
                int r3 = r2 + r1
                int r4 = r3 + r8
                int r5 = r7.f13814l
                if (r4 > r5) goto L_0x0091
                r7.f13813k = r3
                r1 = 0
                r7.f13809g = r1
                r7.f13811i = r1
            L_0x0021:
                if (r0 >= r8) goto L_0x006b
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f13807e     // Catch:{ all -> 0x0061 }
                long r3 = (long) r1     // Catch:{ all -> 0x0061 }
                long r1 = r2.skip(r3)     // Catch:{ all -> 0x0061 }
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x003c
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x003c
                if (r5 != 0) goto L_0x0039
                goto L_0x006b
            L_0x0039:
                int r1 = (int) r1     // Catch:{ all -> 0x0061 }
                int r0 = r0 + r1
                goto L_0x0021
            L_0x003c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
                r3.<init>()     // Catch:{ all -> 0x0061 }
                java.io.InputStream r4 = r7.f13807e     // Catch:{ all -> 0x0061 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0061 }
                r3.append(r4)     // Catch:{ all -> 0x0061 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0061 }
                r3.append(r1)     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0061 }
                r8.<init>(r1)     // Catch:{ all -> 0x0061 }
                throw r8     // Catch:{ all -> 0x0061 }
            L_0x0061:
                r8 = move-exception
                int r1 = r7.f13813k
                int r1 = r1 + r0
                r7.f13813k = r1
                r7.mo26081B()
                throw r8
            L_0x006b:
                int r1 = r7.f13813k
                int r1 = r1 + r0
                r7.f13813k = r1
                r7.mo26081B()
                if (r0 >= r8) goto L_0x0090
                int r0 = r7.f13809g
                int r1 = r7.f13811i
                int r1 = r0 - r1
                r7.f13811i = r0
                r0 = 1
                r7.mo26085h(r0)
            L_0x0081:
                int r2 = r8 - r1
                int r3 = r7.f13809g
                if (r2 <= r3) goto L_0x008e
                int r1 = r1 + r3
                r7.f13811i = r3
                r7.mo26085h(r0)
                goto L_0x0081
            L_0x008e:
                r7.f13811i = r2
            L_0x0090:
                return
            L_0x0091:
                int r5 = r5 - r2
                int r5 = r5 - r1
                r7.mo26086i(r5)
                com.fyber.inneractive.sdk.protobuf.a0 r8 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15532i()
                throw r8
            L_0x009b:
                com.fyber.inneractive.sdk.protobuf.a0 r8 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15529f()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5172j.C5175c.mo26086i(int):void");
        }

        /* renamed from: j */
        public final boolean mo26087j(int i) throws IOException {
            int i2 = this.f13811i;
            int i3 = i2 + i;
            int i4 = this.f13809g;
            if (i3 > i4) {
                int i5 = this.f13797c;
                int i6 = this.f13813k;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f13814l) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f13808f;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f13813k += i2;
                    this.f13809g -= i2;
                    this.f13811i = 0;
                }
                InputStream inputStream = this.f13807e;
                byte[] bArr2 = this.f13808f;
                int i7 = this.f13809g;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f13797c - this.f13813k) - i7));
                if (read == 0 || read < -1 || read > this.f13808f.length) {
                    throw new IllegalStateException(this.f13807e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f13809g += read;
                    mo26081B();
                    if (this.f13809g >= i) {
                        return true;
                    }
                    return mo26087j(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: a */
        public void mo26047a(int i, C5207q0.C5208a aVar, C5205q qVar) throws IOException {
            int i2 = this.f13795a;
            if (i2 < this.f13796b) {
                this.f13795a = i2 + 1;
                ((GeneratedMessageLite.C5108a) aVar).mo25808a((C5172j) this, qVar);
                mo26046a(C5227t1.m16370a(i, 4));
                this.f13795a--;
                return;
            }
            throw C5119a0.m15531h();
        }

        /* renamed from: c */
        public boolean mo26051c() throws IOException {
            return this.f13811i == this.f13809g && !mo26087j(1);
        }

        /* renamed from: a */
        public void mo26048a(C5207q0.C5208a aVar, C5205q qVar) throws IOException {
            int m = mo26063m();
            if (this.f13795a < this.f13796b) {
                int d = mo26052d(m);
                this.f13795a++;
                ((GeneratedMessageLite.C5108a) aVar).mo25808a((C5172j) this, qVar);
                mo26046a(0);
                this.f13795a--;
                this.f13814l = d;
                mo26081B();
                return;
            }
            throw C5119a0.m15531h();
        }

        /* renamed from: a */
        public int mo26045a() {
            int i = this.f13814l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f13813k + this.f13811i);
        }

        /* renamed from: a */
        public final byte[] mo26082a(int i, boolean z) throws IOException {
            byte[] f = mo26083f(i);
            if (f != null) {
                return z ? (byte[]) f.clone() : f;
            }
            int i2 = this.f13811i;
            int i3 = this.f13809g;
            int i4 = i3 - i2;
            this.f13813k += i3;
            this.f13811i = 0;
            this.f13809g = 0;
            List<byte[]> g = mo26084g(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f13808f, i2, bArr, 0, i4);
            Iterator it = ((ArrayList) g).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: e */
        public C5151i mo26054e() throws IOException {
            int m = mo26063m();
            int i = this.f13809g;
            int i2 = this.f13811i;
            if (m <= i - i2 && m > 0) {
                C5151i a = C5151i.m15768a(this.f13808f, i2, m);
                this.f13811i += m;
                return a;
            } else if (m == 0) {
                return C5151i.f13766b;
            } else {
                byte[] f = mo26083f(m);
                if (f != null) {
                    C5151i iVar = C5151i.f13766b;
                    return C5151i.m15768a(f, 0, f.length);
                }
                int i3 = this.f13811i;
                int i4 = this.f13809g;
                int i5 = i4 - i3;
                this.f13813k += i4;
                this.f13811i = 0;
                this.f13809g = 0;
                List<byte[]> g = mo26084g(m - i5);
                byte[] bArr = new byte[m];
                System.arraycopy(this.f13808f, i3, bArr, 0, i5);
                Iterator it = ((ArrayList) g).iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    i5 += bArr2.length;
                }
                C5151i iVar2 = C5151i.f13766b;
                return new C5151i.C5159h(bArr);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.j$d */
    public static final class C5176d extends C5172j {

        /* renamed from: e */
        public final ByteBuffer f13815e;

        /* renamed from: f */
        public final boolean f13816f;

        /* renamed from: g */
        public final long f13817g;

        /* renamed from: h */
        public long f13818h;

        /* renamed from: i */
        public long f13819i;

        /* renamed from: j */
        public long f13820j;

        /* renamed from: k */
        public int f13821k;

        /* renamed from: l */
        public int f13822l;

        /* renamed from: m */
        public int f13823m = Integer.MAX_VALUE;

        public C5176d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f13815e = byteBuffer;
            long a = C5212r1.m16216a(byteBuffer);
            this.f13817g = a;
            this.f13818h = ((long) byteBuffer.limit()) + a;
            long position = a + ((long) byteBuffer.position());
            this.f13819i = position;
            this.f13820j = position;
            this.f13816f = z;
        }

        /* renamed from: A */
        public long mo26092A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = mo26097w();
                j |= ((long) (w & Byte.MAX_VALUE)) << i;
                if ((w & 128) == 0) {
                    return j;
                }
            }
            throw C5119a0.m15528e();
        }

        /* renamed from: B */
        public final void mo26093B() {
            long j = this.f13818h + ((long) this.f13821k);
            this.f13818h = j;
            int i = (int) (j - this.f13820j);
            int i2 = this.f13823m;
            if (i > i2) {
                int i3 = i - i2;
                this.f13821k = i3;
                this.f13818h = j - ((long) i3);
                return;
            }
            this.f13821k = 0;
        }

        /* renamed from: C */
        public final int mo26094C() {
            return (int) (this.f13818h - this.f13819i);
        }

        /* renamed from: a */
        public void mo26046a(int i) throws C5119a0 {
            if (this.f13822l != i) {
                throw C5119a0.m15524a();
            }
        }

        /* renamed from: b */
        public int mo26049b() {
            return (int) (this.f13819i - this.f13820j);
        }

        /* renamed from: c */
        public void mo26050c(int i) {
            this.f13823m = i;
            mo26093B();
        }

        /* renamed from: d */
        public boolean mo26053d() throws IOException {
            return mo26100z() != 0;
        }

        /* renamed from: e */
        public boolean mo26055e(int i) throws IOException {
            int t;
            int i2 = C5227t1.f13895a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (mo26094C() >= 10) {
                    while (i4 < 10) {
                        long j = this.f13819i;
                        this.f13819i = 1 + j;
                        if (C5212r1.f13866e.mo26230a(j) < 0) {
                            i4++;
                        }
                    }
                    throw C5119a0.m15528e();
                }
                while (i4 < 10) {
                    if (mo26097w() < 0) {
                        i4++;
                    }
                }
                throw C5119a0.m15528e();
                return true;
            } else if (i3 == 1) {
                mo26096f(8);
                return true;
            } else if (i3 == 2) {
                mo26096f(mo26063m());
                return true;
            } else if (i3 == 3) {
                do {
                    t = mo26070t();
                    if (t == 0 || !mo26055e(t)) {
                        mo26046a(C5227t1.m16370a(i >>> 3, 4));
                    }
                    t = mo26070t();
                    break;
                } while (!mo26055e(t));
                mo26046a(C5227t1.m16370a(i >>> 3, 4));
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo26096f(4);
                    return true;
                }
                throw C5119a0.m15527d();
            }
        }

        /* renamed from: f */
        public double mo26056f() throws IOException {
            return Double.longBitsToDouble(mo26099y());
        }

        /* renamed from: g */
        public int mo26057g() throws IOException {
            return mo26063m();
        }

        /* renamed from: h */
        public int mo26058h() throws IOException {
            return mo26098x();
        }

        /* renamed from: i */
        public long mo26059i() throws IOException {
            return mo26099y();
        }

        /* renamed from: j */
        public float mo26060j() throws IOException {
            return Float.intBitsToFloat(mo26098x());
        }

        /* renamed from: k */
        public int mo26061k() throws IOException {
            return mo26063m();
        }

        /* renamed from: l */
        public long mo26062l() throws IOException {
            return mo26100z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
            if (r6.mo26230a(r4) < 0) goto L_0x0087;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo26063m() throws java.io.IOException {
            /*
                r11 = this;
                long r0 = r11.f13819i
                long r2 = r11.f13818h
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0087
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.f13866e
                byte r0 = r6.mo26230a(r0)
                if (r0 < 0) goto L_0x0019
                r11.f13819i = r4
                return r0
            L_0x0019:
                long r7 = r11.f13818h
                long r7 = r7 - r4
                r9 = 9
                int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r1 >= 0) goto L_0x0023
                goto L_0x0087
            L_0x0023:
                long r7 = r4 + r2
                byte r1 = r6.mo26230a(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0031
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008d
            L_0x0031:
                long r4 = r7 + r2
                byte r1 = r6.mo26230a(r7)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0040
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003e:
                r7 = r4
                goto L_0x008d
            L_0x0040:
                long r7 = r4 + r2
                byte r1 = r6.mo26230a(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0050
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008d
            L_0x0050:
                long r4 = r7 + r2
                byte r1 = r6.mo26230a(r7)
                int r7 = r1 << 28
                r0 = r0 ^ r7
                r7 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r7
                if (r1 >= 0) goto L_0x003e
                long r7 = r4 + r2
                byte r1 = r6.mo26230a(r4)
                if (r1 >= 0) goto L_0x008d
                long r4 = r7 + r2
                byte r1 = r6.mo26230a(r7)
                if (r1 >= 0) goto L_0x003e
                long r7 = r4 + r2
                byte r1 = r6.mo26230a(r4)
                if (r1 >= 0) goto L_0x008d
                long r4 = r7 + r2
                byte r1 = r6.mo26230a(r7)
                if (r1 >= 0) goto L_0x003e
                long r7 = r4 + r2
                byte r1 = r6.mo26230a(r4)
                if (r1 >= 0) goto L_0x008d
            L_0x0087:
                long r0 = r11.mo26092A()
                int r0 = (int) r0
                return r0
            L_0x008d:
                r11.f13819i = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5172j.C5176d.mo26063m():int");
        }

        /* renamed from: n */
        public int mo26064n() throws IOException {
            return mo26098x();
        }

        /* renamed from: o */
        public long mo26065o() throws IOException {
            return mo26099y();
        }

        /* renamed from: p */
        public int mo26066p() throws IOException {
            return C5172j.m15822b(mo26063m());
        }

        /* renamed from: q */
        public long mo26067q() throws IOException {
            return C5172j.m15818a(mo26100z());
        }

        /* renamed from: r */
        public String mo26068r() throws IOException {
            int m = mo26063m();
            if (m > 0 && m <= mo26094C()) {
                byte[] bArr = new byte[m];
                long j = (long) m;
                C5212r1.f13866e.mo26231a(this.f13819i, bArr, 0, j);
                String str = new String(bArr, C5252z.f13963a);
                this.f13819i += j;
                return str;
            } else if (m == 0) {
                return "";
            } else {
                if (m < 0) {
                    throw C5119a0.m15529f();
                }
                throw C5119a0.m15532i();
            }
        }

        /* renamed from: s */
        public String mo26069s() throws IOException {
            String str;
            int m = mo26063m();
            if (m > 0 && m <= mo26094C()) {
                int b = mo26095b(this.f13819i);
                ByteBuffer byteBuffer = this.f13815e;
                C5219s1.C5221b bVar = C5219s1.f13873a;
                bVar.getClass();
                if (byteBuffer.hasArray()) {
                    str = bVar.mo26245a(byteBuffer.array(), byteBuffer.arrayOffset() + b, m);
                } else if (byteBuffer.isDirect()) {
                    str = bVar.mo26246b(byteBuffer, b, m);
                } else {
                    str = bVar.mo26244a(byteBuffer, b, m);
                }
                this.f13819i += (long) m;
                return str;
            } else if (m == 0) {
                return "";
            } else {
                if (m <= 0) {
                    throw C5119a0.m15529f();
                }
                throw C5119a0.m15532i();
            }
        }

        /* renamed from: t */
        public int mo26070t() throws IOException {
            if (mo26051c()) {
                this.f13822l = 0;
                return 0;
            }
            int m = mo26063m();
            this.f13822l = m;
            int i = C5227t1.f13895a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw C5119a0.m15525b();
        }

        /* renamed from: u */
        public int mo26071u() throws IOException {
            return mo26063m();
        }

        /* renamed from: v */
        public long mo26072v() throws IOException {
            return mo26100z();
        }

        /* renamed from: w */
        public byte mo26097w() throws IOException {
            long j = this.f13819i;
            if (j != this.f13818h) {
                this.f13819i = 1 + j;
                return C5212r1.f13866e.mo26230a(j);
            }
            throw C5119a0.m15532i();
        }

        /* renamed from: x */
        public int mo26098x() throws IOException {
            long j = this.f13819i;
            if (this.f13818h - j >= 4) {
                this.f13819i = 4 + j;
                C5212r1.C5216d dVar = C5212r1.f13866e;
                return ((dVar.mo26230a(j + 3) & 255) << Ascii.CAN) | (dVar.mo26230a(j) & 255) | ((dVar.mo26230a(1 + j) & 255) << 8) | ((dVar.mo26230a(2 + j) & 255) << Ascii.DLE);
            }
            throw C5119a0.m15532i();
        }

        /* renamed from: y */
        public long mo26099y() throws IOException {
            long j = this.f13819i;
            if (this.f13818h - j >= 8) {
                this.f13819i = 8 + j;
                C5212r1.C5216d dVar = C5212r1.f13866e;
                return ((((long) dVar.mo26230a(j + 7)) & 255) << 56) | (((long) dVar.mo26230a(j)) & 255) | ((((long) dVar.mo26230a(1 + j)) & 255) << 8) | ((((long) dVar.mo26230a(2 + j)) & 255) << 16) | ((((long) dVar.mo26230a(3 + j)) & 255) << 24) | ((((long) dVar.mo26230a(4 + j)) & 255) << 32) | ((((long) dVar.mo26230a(5 + j)) & 255) << 40) | ((((long) dVar.mo26230a(6 + j)) & 255) << 48);
            }
            throw C5119a0.m15532i();
        }

        /* renamed from: z */
        public long mo26100z() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f13819i;
            if (this.f13818h != j4) {
                long j5 = j4 + 1;
                C5212r1.C5216d dVar = C5212r1.f13866e;
                byte a = dVar.mo26230a(j4);
                if (a >= 0) {
                    this.f13819i = j5;
                    return (long) a;
                } else if (this.f13818h - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte a2 = a ^ (dVar.mo26230a(j5) << 7);
                    if (a2 < 0) {
                        b = a2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte a3 = a2 ^ (dVar.mo26230a(j6) << Ascii.f17945SO);
                        if (a3 >= 0) {
                            j = (long) (a3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte a4 = a3 ^ (dVar.mo26230a(j7) << Ascii.NAK);
                            if (a4 < 0) {
                                b = a4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long a5 = ((long) a4) ^ (((long) dVar.mo26230a(j6)) << 28);
                                if (a5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long a6 = a5 ^ (((long) dVar.mo26230a(j7)) << 35);
                                    if (a6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        a5 = a6 ^ (((long) dVar.mo26230a(j8)) << 42);
                                        if (a5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            a6 = a5 ^ (((long) dVar.mo26230a(j7)) << 49);
                                            if (a6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (a6 ^ (((long) dVar.mo26230a(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) dVar.mo26230a(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f13819i = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = a6 ^ j2;
                                    j6 = j8;
                                    this.f13819i = j6;
                                    return j;
                                }
                                j = a5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f13819i = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f13819i = j6;
                    return j;
                }
            }
            return mo26092A();
        }

        /* renamed from: b */
        public final int mo26095b(long j) {
            return (int) (j - this.f13817g);
        }

        /* renamed from: d */
        public int mo26052d(int i) throws C5119a0 {
            if (i >= 0) {
                int b = i + mo26049b();
                int i2 = this.f13823m;
                if (b <= i2) {
                    this.f13823m = b;
                    mo26093B();
                    return i2;
                }
                throw C5119a0.m15532i();
            }
            throw C5119a0.m15529f();
        }

        /* renamed from: f */
        public void mo26096f(int i) throws IOException {
            if (i >= 0 && i <= mo26094C()) {
                this.f13819i += (long) i;
            } else if (i < 0) {
                throw C5119a0.m15529f();
            } else {
                throw C5119a0.m15532i();
            }
        }

        /* renamed from: a */
        public void mo26047a(int i, C5207q0.C5208a aVar, C5205q qVar) throws IOException {
            int i2 = this.f13795a;
            if (i2 < this.f13796b) {
                this.f13795a = i2 + 1;
                ((GeneratedMessageLite.C5108a) aVar).mo25808a((C5172j) this, qVar);
                mo26046a(C5227t1.m16370a(i, 4));
                this.f13795a--;
                return;
            }
            throw C5119a0.m15531h();
        }

        /* renamed from: c */
        public boolean mo26051c() throws IOException {
            return this.f13819i == this.f13818h;
        }

        /* renamed from: a */
        public void mo26048a(C5207q0.C5208a aVar, C5205q qVar) throws IOException {
            int m = mo26063m();
            if (this.f13795a < this.f13796b) {
                int d = mo26052d(m);
                this.f13795a++;
                ((GeneratedMessageLite.C5108a) aVar).mo25808a((C5172j) this, qVar);
                mo26046a(0);
                this.f13795a--;
                this.f13823m = d;
                mo26093B();
                return;
            }
            throw C5119a0.m15531h();
        }

        /* renamed from: a */
        public int mo26045a() {
            int i = this.f13823m;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo26049b();
        }

        /* renamed from: e */
        public C5151i mo26054e() throws IOException {
            int m = mo26063m();
            if (m > 0 && m <= mo26094C()) {
                byte[] bArr = new byte[m];
                long j = (long) m;
                C5212r1.f13866e.mo26231a(this.f13819i, bArr, 0, j);
                this.f13819i += j;
                C5151i iVar = C5151i.f13766b;
                return new C5151i.C5159h(bArr);
            } else if (m == 0) {
                return C5151i.f13766b;
            } else {
                if (m < 0) {
                    throw C5119a0.m15529f();
                }
                throw C5119a0.m15532i();
            }
        }
    }

    /* renamed from: a */
    public static long m15818a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public static C5172j m15819a(InputStream inputStream) {
        if (inputStream != null) {
            return new C5175c(inputStream, 4096);
        }
        byte[] bArr = C5252z.f13964b;
        return m15821a(bArr, 0, bArr.length, false);
    }

    /* renamed from: b */
    public static int m15822b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo26045a();

    /* renamed from: a */
    public abstract void mo26046a(int i) throws C5119a0;

    /* renamed from: a */
    public abstract void mo26047a(int i, C5207q0.C5208a aVar, C5205q qVar) throws IOException;

    /* renamed from: a */
    public abstract void mo26048a(C5207q0.C5208a aVar, C5205q qVar) throws IOException;

    /* renamed from: b */
    public abstract int mo26049b();

    /* renamed from: c */
    public abstract void mo26050c(int i);

    /* renamed from: c */
    public abstract boolean mo26051c() throws IOException;

    /* renamed from: d */
    public abstract int mo26052d(int i) throws C5119a0;

    /* renamed from: d */
    public abstract boolean mo26053d() throws IOException;

    /* renamed from: e */
    public abstract C5151i mo26054e() throws IOException;

    /* renamed from: e */
    public abstract boolean mo26055e(int i) throws IOException;

    /* renamed from: f */
    public abstract double mo26056f() throws IOException;

    /* renamed from: g */
    public abstract int mo26057g() throws IOException;

    /* renamed from: h */
    public abstract int mo26058h() throws IOException;

    /* renamed from: i */
    public abstract long mo26059i() throws IOException;

    /* renamed from: j */
    public abstract float mo26060j() throws IOException;

    /* renamed from: k */
    public abstract int mo26061k() throws IOException;

    /* renamed from: l */
    public abstract long mo26062l() throws IOException;

    /* renamed from: m */
    public abstract int mo26063m() throws IOException;

    /* renamed from: n */
    public abstract int mo26064n() throws IOException;

    /* renamed from: o */
    public abstract long mo26065o() throws IOException;

    /* renamed from: p */
    public abstract int mo26066p() throws IOException;

    /* renamed from: q */
    public abstract long mo26067q() throws IOException;

    /* renamed from: r */
    public abstract String mo26068r() throws IOException;

    /* renamed from: s */
    public abstract String mo26069s() throws IOException;

    /* renamed from: t */
    public abstract int mo26070t() throws IOException;

    /* renamed from: u */
    public abstract int mo26071u() throws IOException;

    /* renamed from: v */
    public abstract long mo26072v() throws IOException;

    public C5172j() {
        this.f13796b = 100;
        this.f13797c = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static C5172j m15821a(byte[] bArr, int i, int i2, boolean z) {
        C5174b bVar = new C5174b(bArr, i, i2, z);
        try {
            bVar.mo26052d(i2);
            return bVar;
        } catch (C5119a0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static C5172j m15820a(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m15821a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C5212r1.f13867f) {
            return new C5176d(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m15821a(bArr, 0, remaining, true);
    }
}
