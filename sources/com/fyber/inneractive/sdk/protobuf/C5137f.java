package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5151i;
import com.fyber.inneractive.sdk.protobuf.C5177j0;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.f */
public abstract class C5137f implements C5136e1 {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.f$b */
    public static final class C5139b extends C5137f {

        /* renamed from: a */
        public final boolean f13747a;

        /* renamed from: b */
        public final byte[] f13748b;

        /* renamed from: c */
        public int f13749c;

        /* renamed from: d */
        public int f13750d;

        /* renamed from: e */
        public int f13751e;

        /* renamed from: f */
        public int f13752f;

        public C5139b(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f13747a = z;
            this.f13748b = byteBuffer.array();
            this.f13749c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f13750d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public final int mo25924A() throws IOException {
            byte b;
            int i = this.f13749c;
            int i2 = this.f13750d;
            if (i2 != i) {
                byte[] bArr = this.f13748b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f13749c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo25926C();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << Ascii.f17945SO);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << Ascii.NAK);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << Ascii.f17938FS)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw C5119a0.m15528e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f13749c = i4;
                    return b;
                }
            } else {
                throw C5119a0.m15532i();
            }
        }

        /* renamed from: B */
        public long mo25925B() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f13749c;
            int i3 = this.f13750d;
            if (i3 != i2) {
                byte[] bArr = this.f13748b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f13749c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo25926C();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << Ascii.f17945SO);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << Ascii.NAK);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw C5119a0.m15528e();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f13749c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f13749c = i;
                    return j;
                }
            } else {
                throw C5119a0.m15532i();
            }
        }

        /* renamed from: C */
        public final long mo25926C() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte v = mo25938v();
                j |= ((long) (v & Byte.MAX_VALUE)) << i;
                if ((v & 128) == 0) {
                    return j;
                }
            }
            throw C5119a0.m15528e();
        }

        /* renamed from: a */
        public String mo25927a(boolean z) throws IOException {
            mo25932c(2);
            int A = mo25924A();
            if (A == 0) {
                return "";
            }
            mo25928a(A);
            if (z) {
                byte[] bArr = this.f13748b;
                int i = this.f13749c;
                if (!C5219s1.m16302b(bArr, i, i + A)) {
                    throw C5119a0.m15526c();
                }
            }
            String str = new String(this.f13748b, this.f13749c, A, C5252z.f13963a);
            this.f13749c += A;
            return str;
        }

        /* renamed from: b */
        public <T> T mo25888b(Class<T> cls, C5205q qVar) throws IOException {
            mo25932c(2);
            return mo25933d(C5124b1.f13725c.mo25837a(cls), qVar);
        }

        /* renamed from: c */
        public final <T> T mo25931c(C5141f1<T> f1Var, C5205q qVar) throws IOException {
            int i = this.f13752f;
            int i2 = this.f13751e;
            int i3 = C5227t1.f13895a;
            this.f13752f = C5227t1.m16370a(i2 >>> 3, 4);
            try {
                T a = f1Var.mo25943a();
                f1Var.mo25944a(a, this, qVar);
                f1Var.mo25951c(a);
                if (this.f13751e == this.f13752f) {
                    return a;
                }
                throw C5119a0.m15530g();
            } finally {
                this.f13752f = i;
            }
        }

        /* renamed from: d */
        public int mo25893d() throws IOException {
            mo25932c(0);
            return mo25924A();
        }

        /* renamed from: e */
        public int mo25895e() {
            return this.f13751e;
        }

        /* renamed from: f */
        public long mo25897f() throws IOException {
            mo25932c(0);
            return mo25925B();
        }

        /* renamed from: g */
        public long mo25899g() throws IOException {
            mo25932c(1);
            return mo25941y();
        }

        /* renamed from: h */
        public double mo25901h() throws IOException {
            mo25932c(1);
            return Double.longBitsToDouble(mo25941y());
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[LOOP:0: B:18:0x0032->B:21:0x003f, LOOP_START] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo25904i() throws java.io.IOException {
            /*
                r7 = this;
                boolean r0 = r7.mo25937u()
                r1 = 0
                if (r0 != 0) goto L_0x0089
                int r0 = r7.f13751e
                int r2 = r7.f13752f
                if (r0 != r2) goto L_0x000f
                goto L_0x0089
            L_0x000f:
                int r3 = com.fyber.inneractive.sdk.protobuf.C5227t1.f13895a
                r3 = r0 & 7
                r4 = 1
                if (r3 == 0) goto L_0x005d
                if (r3 == r4) goto L_0x0057
                r1 = 2
                if (r3 == r1) goto L_0x004f
                r1 = 4
                r5 = 3
                if (r3 == r5) goto L_0x002b
                r0 = 5
                if (r3 != r0) goto L_0x0026
                r7.mo25934d((int) r1)
                return r4
            L_0x0026:
                com.fyber.inneractive.sdk.protobuf.a0$a r0 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15527d()
                throw r0
            L_0x002b:
                int r0 = r0 >>> r5
                int r0 = com.fyber.inneractive.sdk.protobuf.C5227t1.m16370a(r0, r1)
                r7.f13752f = r0
            L_0x0032:
                int r0 = r7.mo25922s()
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L_0x0041
                boolean r0 = r7.mo25904i()
                if (r0 != 0) goto L_0x0032
            L_0x0041:
                int r0 = r7.f13751e
                int r1 = r7.f13752f
                if (r0 != r1) goto L_0x004a
                r7.f13752f = r2
                return r4
            L_0x004a:
                com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15530g()
                throw r0
            L_0x004f:
                int r0 = r7.mo25924A()
                r7.mo25934d((int) r0)
                return r4
            L_0x0057:
                r0 = 8
                r7.mo25934d((int) r0)
                return r4
            L_0x005d:
                int r0 = r7.f13750d
                int r2 = r7.f13749c
                int r0 = r0 - r2
                r3 = 10
                if (r0 < r3) goto L_0x0078
                byte[] r0 = r7.f13748b
                r5 = r1
            L_0x0069:
                if (r5 >= r3) goto L_0x0078
                int r6 = r2 + 1
                byte r2 = r0[r2]
                if (r2 < 0) goto L_0x0074
                r7.f13749c = r6
                goto L_0x0080
            L_0x0074:
                int r5 = r5 + 1
                r2 = r6
                goto L_0x0069
            L_0x0078:
                if (r1 >= r3) goto L_0x0084
                byte r0 = r7.mo25938v()
                if (r0 < 0) goto L_0x0081
            L_0x0080:
                return r4
            L_0x0081:
                int r1 = r1 + 1
                goto L_0x0078
            L_0x0084:
                com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15528e()
                throw r0
            L_0x0089:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5137f.C5139b.mo25904i():boolean");
        }

        /* renamed from: j */
        public int mo25905j() throws IOException {
            mo25932c(0);
            return C5172j.m15822b(mo25924A());
        }

        /* renamed from: k */
        public float mo25907k() throws IOException {
            mo25932c(5);
            return Float.intBitsToFloat(mo25939w());
        }

        /* renamed from: l */
        public long mo25909l() throws IOException {
            mo25932c(0);
            return C5172j.m15818a(mo25925B());
        }

        /* renamed from: m */
        public int mo25911m() throws IOException {
            mo25932c(5);
            return mo25939w();
        }

        /* renamed from: n */
        public String mo25913n() throws IOException {
            return mo25927a(false);
        }

        /* renamed from: o */
        public long mo25915o() throws IOException {
            mo25932c(0);
            return mo25925B();
        }

        /* renamed from: p */
        public String mo25917p() throws IOException {
            return mo25927a(true);
        }

        /* renamed from: q */
        public int mo25919q() throws IOException {
            mo25932c(5);
            return mo25939w();
        }

        /* renamed from: r */
        public boolean mo25921r() throws IOException {
            mo25932c(0);
            if (mo25924A() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public int mo25922s() throws IOException {
            if (mo25937u()) {
                return Integer.MAX_VALUE;
            }
            int A = mo25924A();
            this.f13751e = A;
            if (A == this.f13752f) {
                return Integer.MAX_VALUE;
            }
            int i = C5227t1.f13895a;
            return A >>> 3;
        }

        /* renamed from: t */
        public long mo25923t() throws IOException {
            mo25932c(1);
            return mo25941y();
        }

        /* renamed from: u */
        public final boolean mo25937u() {
            return this.f13749c == this.f13750d;
        }

        /* renamed from: v */
        public final byte mo25938v() throws IOException {
            int i = this.f13749c;
            if (i != this.f13750d) {
                byte[] bArr = this.f13748b;
                this.f13749c = i + 1;
                return bArr[i];
            }
            throw C5119a0.m15532i();
        }

        /* renamed from: w */
        public final int mo25939w() throws IOException {
            mo25928a(4);
            return mo25940x();
        }

        /* renamed from: x */
        public final int mo25940x() {
            int i = this.f13749c;
            byte[] bArr = this.f13748b;
            this.f13749c = i + 4;
            return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
        }

        /* renamed from: y */
        public final long mo25941y() throws IOException {
            mo25928a(8);
            return mo25942z();
        }

        /* renamed from: z */
        public final long mo25942z() {
            int i = this.f13749c;
            byte[] bArr = this.f13748b;
            this.f13749c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: e */
        public void mo25896e(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5250y) {
                C5250y yVar = (C5250y) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 2) {
                    int A = mo25924A();
                    mo25935e(A);
                    int i6 = this.f13749c + A;
                    while (this.f13749c < i6) {
                        yVar.mo26305c(mo25940x());
                    }
                } else if (i5 == 5) {
                    do {
                        yVar.mo26305c(mo25919q());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i7 = this.f13751e;
                int i8 = C5227t1.f13895a;
                int i9 = i7 & 7;
                if (i9 == 2) {
                    int A2 = mo25924A();
                    mo25935e(A2);
                    int i10 = this.f13749c + A2;
                    while (this.f13749c < i10) {
                        list.add(Integer.valueOf(mo25940x()));
                    }
                } else if (i9 == 5) {
                    do {
                        list.add(Integer.valueOf(mo25919q()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: n */
        public void mo25914n(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5149h0) {
                C5149h0 h0Var = (C5149h0) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 1) {
                    do {
                        h0Var.mo25968a(mo25899g());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = mo25924A();
                    mo25936f(A);
                    int i6 = this.f13749c + A;
                    while (this.f13749c < i6) {
                        h0Var.mo25968a(mo25942z());
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i7 = this.f13751e;
                int i8 = C5227t1.f13895a;
                int i9 = i7 & 7;
                if (i9 == 1) {
                    do {
                        list.add(Long.valueOf(mo25899g()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i9 == 2) {
                    int A2 = mo25924A();
                    mo25936f(A2);
                    int i10 = this.f13749c + A2;
                    while (this.f13749c < i10) {
                        list.add(Long.valueOf(mo25942z()));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: p */
        public void mo25918p(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5250y) {
                C5250y yVar = (C5250y) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo26305c(mo25886b());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = this.f13749c + mo25924A();
                    while (this.f13749c < A) {
                        yVar.mo26305c(mo25924A());
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i6 = this.f13751e;
                int i7 = C5227t1.f13895a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo25886b()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13749c + mo25924A();
                    while (this.f13749c < A2) {
                        list.add(Integer.valueOf(mo25924A()));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: d */
        public final <T> T mo25933d(C5141f1<T> f1Var, C5205q qVar) throws IOException {
            int A = mo25924A();
            mo25928a(A);
            int i = this.f13750d;
            int i2 = this.f13749c + A;
            this.f13750d = i2;
            try {
                T a = f1Var.mo25943a();
                f1Var.mo25944a(a, this, qVar);
                f1Var.mo25951c(a);
                if (this.f13749c == i2) {
                    return a;
                }
                throw C5119a0.m15530g();
            } finally {
                this.f13750d = i;
            }
        }

        /* renamed from: f */
        public void mo25898f(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5250y) {
                C5250y yVar = (C5250y) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 2) {
                    int A = mo25924A();
                    mo25935e(A);
                    int i6 = this.f13749c + A;
                    while (this.f13749c < i6) {
                        yVar.mo26305c(mo25940x());
                    }
                } else if (i5 == 5) {
                    do {
                        yVar.mo26305c(mo25911m());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i7 = this.f13751e;
                int i8 = C5227t1.f13895a;
                int i9 = i7 & 7;
                if (i9 == 2) {
                    int A2 = mo25924A();
                    mo25935e(A2);
                    int i10 = this.f13749c + A2;
                    while (this.f13749c < i10) {
                        list.add(Integer.valueOf(mo25940x()));
                    }
                } else if (i9 == 5) {
                    do {
                        list.add(Integer.valueOf(mo25911m()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: g */
        public void mo25900g(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5149h0) {
                C5149h0 h0Var = (C5149h0) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        h0Var.mo25968a(mo25909l());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = this.f13749c + mo25924A();
                    while (this.f13749c < A) {
                        h0Var.mo25968a(C5172j.m15818a(mo25925B()));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i6 = this.f13751e;
                int i7 = C5227t1.f13895a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Long.valueOf(mo25909l()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13749c + mo25924A();
                    while (this.f13749c < A2) {
                        list.add(Long.valueOf(C5172j.m15818a(mo25925B())));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: h */
        public void mo25902h(List<C5151i> list) throws IOException {
            int i;
            int i2 = this.f13751e;
            int i3 = C5227t1.f13895a;
            if ((i2 & 7) == 2) {
                do {
                    list.add(mo25880a());
                    if (!mo25937u()) {
                        i = this.f13749c;
                    } else {
                        return;
                    }
                } while (mo25924A() == this.f13751e);
                this.f13749c = i;
                return;
            }
            throw C5119a0.m15527d();
        }

        /* renamed from: j */
        public void mo25906j(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5194n) {
                C5194n nVar = (C5194n) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 1) {
                    do {
                        nVar.mo26183a(mo25901h());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = mo25924A();
                    mo25936f(A);
                    int i6 = this.f13749c + A;
                    while (this.f13749c < i6) {
                        nVar.mo26183a(Double.longBitsToDouble(mo25942z()));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i7 = this.f13751e;
                int i8 = C5227t1.f13895a;
                int i9 = i7 & 7;
                if (i9 == 1) {
                    do {
                        list.add(Double.valueOf(mo25901h()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i9 == 2) {
                    int A2 = mo25924A();
                    mo25936f(A2);
                    int i10 = this.f13749c + A2;
                    while (this.f13749c < i10) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo25942z())));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: k */
        public void mo25908k(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5149h0) {
                C5149h0 h0Var = (C5149h0) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        h0Var.mo25968a(mo25915o());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = this.f13749c + mo25924A();
                    while (this.f13749c < A) {
                        h0Var.mo25968a(mo25925B());
                    }
                    mo25930b(A);
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i6 = this.f13751e;
                int i7 = C5227t1.f13895a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Long.valueOf(mo25915o()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13749c + mo25924A();
                    while (this.f13749c < A2) {
                        list.add(Long.valueOf(mo25925B()));
                    }
                    mo25930b(A2);
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: l */
        public void mo25910l(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5142g) {
                C5142g gVar = (C5142g) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        gVar.mo25953a(mo25921r());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = this.f13749c + mo25924A();
                    while (this.f13749c < A) {
                        gVar.mo25953a(mo25924A() != 0);
                    }
                    mo25930b(A);
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i6 = this.f13751e;
                int i7 = C5227t1.f13895a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo25921r()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13749c + mo25924A();
                    while (this.f13749c < A2) {
                        list.add(Boolean.valueOf(mo25924A() != 0));
                    }
                    mo25930b(A2);
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: m */
        public void mo25912m(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5149h0) {
                C5149h0 h0Var = (C5149h0) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 1) {
                    do {
                        h0Var.mo25968a(mo25923t());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = mo25924A();
                    mo25936f(A);
                    int i6 = this.f13749c + A;
                    while (this.f13749c < i6) {
                        h0Var.mo25968a(mo25942z());
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i7 = this.f13751e;
                int i8 = C5227t1.f13895a;
                int i9 = i7 & 7;
                if (i9 == 1) {
                    do {
                        list.add(Long.valueOf(mo25923t()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i9 == 2) {
                    int A2 = mo25924A();
                    mo25936f(A2);
                    int i10 = this.f13749c + A2;
                    while (this.f13749c < i10) {
                        list.add(Long.valueOf(mo25942z()));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: o */
        public void mo25916o(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5250y) {
                C5250y yVar = (C5250y) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo26305c(mo25893d());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = this.f13749c + mo25924A();
                    while (this.f13749c < A) {
                        yVar.mo26305c(mo25924A());
                    }
                    mo25930b(A);
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i6 = this.f13751e;
                int i7 = C5227t1.f13895a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo25893d()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13749c + mo25924A();
                    while (this.f13749c < A2) {
                        list.add(Integer.valueOf(mo25924A()));
                    }
                    mo25930b(A2);
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: q */
        public void mo25920q(List<String> list) throws IOException {
            mo25929a(list, false);
        }

        /* renamed from: b */
        public <T> T mo25887b(C5141f1<T> f1Var, C5205q qVar) throws IOException {
            mo25932c(2);
            return mo25933d(f1Var, qVar);
        }

        /* renamed from: b */
        public int mo25886b() throws IOException {
            mo25932c(0);
            return mo25924A();
        }

        /* renamed from: b */
        public void mo25889b(List<String> list) throws IOException {
            mo25929a(list, true);
        }

        /* renamed from: b */
        public <T> void mo25890b(List<T> list, C5141f1<T> f1Var, C5205q qVar) throws IOException {
            int i;
            int i2 = this.f13751e;
            int i3 = C5227t1.f13895a;
            if ((i2 & 7) == 2) {
                do {
                    list.add(mo25933d(f1Var, qVar));
                    if (!mo25937u()) {
                        i = this.f13749c;
                    } else {
                        return;
                    }
                } while (mo25924A() == i2);
                this.f13749c = i;
                return;
            }
            throw C5119a0.m15527d();
        }

        /* renamed from: a */
        public <T> T mo25882a(Class<T> cls, C5205q qVar) throws IOException {
            mo25932c(3);
            return mo25931c(C5124b1.f13725c.mo25837a(cls), qVar);
        }

        /* renamed from: a */
        public <T> T mo25881a(C5141f1<T> f1Var, C5205q qVar) throws IOException {
            mo25932c(3);
            return mo25931c(f1Var, qVar);
        }

        /* renamed from: a */
        public C5151i mo25880a() throws IOException {
            C5151i iVar;
            mo25932c(2);
            int A = mo25924A();
            if (A == 0) {
                return C5151i.f13766b;
            }
            mo25928a(A);
            if (this.f13747a) {
                byte[] bArr = this.f13748b;
                int i = this.f13749c;
                C5151i iVar2 = C5151i.f13766b;
                iVar = new C5151i.C5155d(bArr, i, A);
            } else {
                iVar = C5151i.m15768a(this.f13748b, this.f13749c, A);
            }
            this.f13749c += A;
            return iVar;
        }

        /* renamed from: c */
        public int mo25891c() throws IOException {
            mo25932c(0);
            return mo25924A();
        }

        /* renamed from: b */
        public final void mo25930b(int i) throws IOException {
            if (this.f13749c != i) {
                throw C5119a0.m15532i();
            }
        }

        /* renamed from: c */
        public void mo25892c(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5250y) {
                C5250y yVar = (C5250y) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo26305c(mo25905j());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = this.f13749c + mo25924A();
                    while (this.f13749c < A) {
                        yVar.mo26305c(C5172j.m15822b(mo25924A()));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i6 = this.f13751e;
                int i7 = C5227t1.f13895a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo25905j()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13749c + mo25924A();
                    while (this.f13749c < A2) {
                        list.add(Integer.valueOf(C5172j.m15822b(mo25924A())));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: a */
        public void mo25883a(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5149h0) {
                C5149h0 h0Var = (C5149h0) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        h0Var.mo25968a(mo25897f());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = this.f13749c + mo25924A();
                    while (this.f13749c < A) {
                        h0Var.mo25968a(mo25925B());
                    }
                    mo25930b(A);
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i6 = this.f13751e;
                int i7 = C5227t1.f13895a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Long.valueOf(mo25897f()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13749c + mo25924A();
                    while (this.f13749c < A2) {
                        list.add(Long.valueOf(mo25925B()));
                    }
                    mo25930b(A2);
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: d */
        public void mo25894d(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5246w) {
                C5246w wVar = (C5246w) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 2) {
                    int A = mo25924A();
                    mo25935e(A);
                    int i6 = this.f13749c + A;
                    while (this.f13749c < i6) {
                        wVar.mo26293a(Float.intBitsToFloat(mo25940x()));
                    }
                } else if (i5 == 5) {
                    do {
                        wVar.mo26293a(mo25907k());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i7 = this.f13751e;
                int i8 = C5227t1.f13895a;
                int i9 = i7 & 7;
                if (i9 == 2) {
                    int A2 = mo25924A();
                    mo25935e(A2);
                    int i10 = this.f13749c + A2;
                    while (this.f13749c < i10) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo25940x())));
                    }
                } else if (i9 == 5) {
                    do {
                        list.add(Float.valueOf(mo25907k()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: i */
        public void mo25903i(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5250y) {
                C5250y yVar = (C5250y) list;
                int i3 = this.f13751e;
                int i4 = C5227t1.f13895a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo26305c(mo25891c());
                        if (!mo25937u()) {
                            i2 = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i2;
                } else if (i5 == 2) {
                    int A = this.f13749c + mo25924A();
                    while (this.f13749c < A) {
                        yVar.mo26305c(mo25924A());
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            } else {
                int i6 = this.f13751e;
                int i7 = C5227t1.f13895a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo25891c()));
                        if (!mo25937u()) {
                            i = this.f13749c;
                        } else {
                            return;
                        }
                    } while (mo25924A() == this.f13751e);
                    this.f13749c = i;
                } else if (i8 == 2) {
                    int A2 = this.f13749c + mo25924A();
                    while (this.f13749c < A2) {
                        list.add(Integer.valueOf(mo25924A()));
                    }
                } else {
                    throw C5119a0.m15527d();
                }
            }
        }

        /* renamed from: e */
        public final void mo25935e(int i) throws IOException {
            mo25928a(i);
            if ((i & 3) != 0) {
                throw C5119a0.m15530g();
            }
        }

        /* renamed from: f */
        public final void mo25936f(int i) throws IOException {
            mo25928a(i);
            if ((i & 7) != 0) {
                throw C5119a0.m15530g();
            }
        }

        /* renamed from: c */
        public final void mo25932c(int i) throws IOException {
            int i2 = this.f13751e;
            int i3 = C5227t1.f13895a;
            if ((i2 & 7) != i) {
                throw C5119a0.m15527d();
            }
        }

        /* renamed from: a */
        public void mo25929a(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            int i3 = this.f13751e;
            int i4 = C5227t1.f13895a;
            if ((i3 & 7) != 2) {
                throw C5119a0.m15527d();
            } else if (!(list instanceof C5140f0) || z) {
                do {
                    list.add(mo25927a(z));
                    if (!mo25937u()) {
                        i = this.f13749c;
                    } else {
                        return;
                    }
                } while (mo25924A() == this.f13751e);
                this.f13749c = i;
            } else {
                C5140f0 f0Var = (C5140f0) list;
                do {
                    f0Var.mo25874a(mo25880a());
                    if (!mo25937u()) {
                        i2 = this.f13749c;
                    } else {
                        return;
                    }
                } while (mo25924A() == this.f13751e);
                this.f13749c = i2;
            }
        }

        /* renamed from: d */
        public final void mo25934d(int i) throws IOException {
            mo25928a(i);
            this.f13749c += i;
        }

        /* renamed from: a */
        public <T> void mo25884a(List<T> list, C5141f1<T> f1Var, C5205q qVar) throws IOException {
            int i;
            int i2 = this.f13751e;
            int i3 = C5227t1.f13895a;
            if ((i2 & 7) == 3) {
                do {
                    list.add(mo25931c(f1Var, qVar));
                    if (!mo25937u()) {
                        i = this.f13749c;
                    } else {
                        return;
                    }
                } while (mo25924A() == i2);
                this.f13749c = i;
                return;
            }
            throw C5119a0.m15527d();
        }

        /* renamed from: a */
        public <K, V> void mo25885a(Map<K, V> map, C5177j0.C5178a<K, V> aVar, C5205q qVar) throws IOException {
            mo25932c(2);
            int A = mo25924A();
            mo25928a(A);
            int i = this.f13750d;
            this.f13750d = this.f13749c + A;
            try {
                throw null;
            } catch (Throwable th) {
                this.f13750d = i;
                throw th;
            }
        }

        /* renamed from: a */
        public final void mo25928a(int i) throws IOException {
            if (i < 0 || i > this.f13750d - this.f13749c) {
                throw C5119a0.m15532i();
            }
        }
    }

    public C5137f() {
    }
}
