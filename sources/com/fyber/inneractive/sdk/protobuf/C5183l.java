package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5219s1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.l */
public abstract class C5183l extends C5148h {

    /* renamed from: b */
    public static final Logger f13830b = Logger.getLogger(C5183l.class.getName());

    /* renamed from: c */
    public static final boolean f13831c = C5212r1.f13868g;

    /* renamed from: a */
    public C5191m f13832a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$b */
    public static abstract class C5185b extends C5183l {

        /* renamed from: d */
        public final byte[] f13833d;

        /* renamed from: e */
        public final int f13834e;

        /* renamed from: f */
        public int f13835f;

        /* renamed from: g */
        public int f13836g;

        public C5185b(int i) {
            super();
            if (i >= 0) {
                int max = Math.max(i, 20);
                this.f13833d = new byte[max];
                this.f13834e = max;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: a */
        public final int mo26116a() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* renamed from: b */
        public final void mo26136b(byte b) {
            byte[] bArr = this.f13833d;
            int i = this.f13835f;
            this.f13835f = i + 1;
            bArr[i] = b;
            this.f13836g++;
        }

        /* renamed from: e */
        public final void mo26137e(long j) {
            byte[] bArr = this.f13833d;
            int i = this.f13835f;
            int i2 = i + 1;
            this.f13835f = i2;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            this.f13835f = i3;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            this.f13835f = i4;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            this.f13835f = i5;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            this.f13835f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f13835f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f13835f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f13835f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f13836g += 8;
        }

        /* renamed from: f */
        public final void mo26138f(long j) {
            if (C5183l.f13831c) {
                long j2 = (long) this.f13835f;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f13833d;
                    int i = this.f13835f;
                    this.f13835f = i + 1;
                    C5212r1.m16226a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f13833d;
                int i2 = this.f13835f;
                this.f13835f = i2 + 1;
                C5212r1.m16226a(bArr2, (long) i2, (byte) ((int) j));
                this.f13836g += (int) (((long) this.f13835f) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f13833d;
                int i3 = this.f13835f;
                this.f13835f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f13836g++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f13833d;
            int i4 = this.f13835f;
            this.f13835f = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f13836g++;
        }

        /* renamed from: h */
        public final void mo26139h(int i) {
            byte[] bArr = this.f13833d;
            int i2 = this.f13835f;
            int i3 = i2 + 1;
            this.f13835f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f13835f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f13835f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f13835f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f13836g += 4;
        }

        /* renamed from: i */
        public final void mo26140i(int i) {
            if (C5183l.f13831c) {
                long j = (long) this.f13835f;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f13833d;
                    int i2 = this.f13835f;
                    this.f13835f = i2 + 1;
                    C5212r1.m16226a(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f13833d;
                int i3 = this.f13835f;
                this.f13835f = i3 + 1;
                C5212r1.m16226a(bArr2, (long) i3, (byte) i);
                this.f13836g += (int) (((long) this.f13835f) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f13833d;
                int i4 = this.f13835f;
                this.f13835f = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f13836g++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f13833d;
            int i5 = this.f13835f;
            this.f13835f = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f13836g++;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$d */
    public static class C5187d extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public C5187d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public C5187d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: a */
    public static int m16029a(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: a */
    public static C5183l m16033a(byte[] bArr) {
        return new C5186c(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m16035b(int i, int i2) {
        return m16034b(i) + 4;
    }

    /* renamed from: b */
    public static long m16037b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: c */
    public static int m16038c(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: c */
    public static int m16039c(int i, int i2) {
        return m16034b(i) + m16020a(i2);
    }

    /* renamed from: d */
    public static int m16041d(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: d */
    public static int m16042d(int i, int i2) {
        return m16034b(i) + 4;
    }

    /* renamed from: e */
    public static int m16044e(int i, int i2) {
        return m16034b(i) + m16038c(m16041d(i2));
    }

    /* renamed from: f */
    public static int m16046f(int i, int i2) {
        return m16034b(i) + m16038c(i2);
    }

    /* renamed from: a */
    public abstract int mo26116a();

    /* renamed from: a */
    public abstract void mo26117a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo26118a(int i, C5207q0 q0Var) throws IOException;

    /* renamed from: b */
    public abstract void mo26120b(int i, C5151i iVar) throws IOException;

    /* renamed from: b */
    public abstract void mo26121b(int i, C5207q0 q0Var, C5141f1 f1Var) throws IOException;

    /* renamed from: b */
    public abstract void mo26122b(int i, String str) throws IOException;

    /* renamed from: b */
    public abstract void mo26123b(int i, boolean z) throws IOException;

    /* renamed from: c */
    public abstract void mo26124c(int i, C5151i iVar) throws IOException;

    /* renamed from: c */
    public abstract void mo26125c(long j) throws IOException;

    /* renamed from: d */
    public abstract void mo26126d(long j) throws IOException;

    /* renamed from: e */
    public abstract void mo26127e(int i) throws IOException;

    /* renamed from: f */
    public abstract void mo26128f(int i) throws IOException;

    /* renamed from: f */
    public abstract void mo26129f(int i, long j) throws IOException;

    /* renamed from: g */
    public abstract void mo26130g(int i) throws IOException;

    /* renamed from: g */
    public abstract void mo26131g(int i, int i2) throws IOException;

    /* renamed from: g */
    public abstract void mo26132g(int i, long j) throws IOException;

    /* renamed from: h */
    public abstract void mo26133h(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo26134i(int i, int i2) throws IOException;

    /* renamed from: j */
    public abstract void mo26135j(int i, int i2) throws IOException;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$c */
    public static class C5186c extends C5183l {

        /* renamed from: d */
        public final byte[] f13837d;

        /* renamed from: e */
        public final int f13838e;

        /* renamed from: f */
        public int f13839f;

        public C5186c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f13837d = bArr;
                    this.f13839f = i;
                    this.f13838e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public final void mo26118a(int i, C5207q0 q0Var) throws IOException {
            mo26130g(C5227t1.m16370a(1, 3));
            mo26135j(2, i);
            mo26130g(C5227t1.m16370a(3, 2));
            mo26130g(q0Var.getSerializedSize());
            q0Var.writeTo(this);
            mo26130g(C5227t1.m16370a(1, 4));
        }

        /* renamed from: b */
        public final void mo26123b(int i, boolean z) throws IOException {
            mo26130g(C5227t1.m16370a(i, 0));
            mo26117a(z ? (byte) 1 : 0);
        }

        /* renamed from: c */
        public final void mo26124c(int i, C5151i iVar) throws IOException {
            mo26130g(C5227t1.m16370a(1, 3));
            mo26135j(2, i);
            mo26120b(3, iVar);
            mo26130g(C5227t1.m16370a(1, 4));
        }

        /* renamed from: d */
        public final void mo26126d(long j) throws IOException {
            if (!C5183l.f13831c || mo26116a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f13837d;
                    int i = this.f13839f;
                    this.f13839f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f13837d;
                    int i2 = this.f13839f;
                    this.f13839f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C5187d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13839f), Integer.valueOf(this.f13838e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f13837d;
                    int i3 = this.f13839f;
                    this.f13839f = i3 + 1;
                    C5212r1.m16226a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f13837d;
                int i4 = this.f13839f;
                this.f13839f = i4 + 1;
                C5212r1.m16226a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: e */
        public final void mo26127e(int i) throws IOException {
            try {
                byte[] bArr = this.f13837d;
                int i2 = this.f13839f;
                int i3 = i2 + 1;
                this.f13839f = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                this.f13839f = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                this.f13839f = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f13839f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C5187d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13839f), Integer.valueOf(this.f13838e), 1}), e);
            }
        }

        /* renamed from: f */
        public final void mo26129f(int i, long j) throws IOException {
            mo26130g(C5227t1.m16370a(i, 1));
            mo26125c(j);
        }

        /* renamed from: g */
        public final void mo26130g(int i) throws IOException {
            if (!C5183l.f13831c || C5130d.m15540a() || mo26116a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f13837d;
                    int i2 = this.f13839f;
                    this.f13839f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f13837d;
                    int i3 = this.f13839f;
                    this.f13839f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C5187d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13839f), Integer.valueOf(this.f13838e), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f13837d;
                int i4 = this.f13839f;
                this.f13839f = i4 + 1;
                C5212r1.m16226a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f13837d;
                int i5 = this.f13839f;
                this.f13839f = i5 + 1;
                C5212r1.m16226a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f13837d;
                    int i7 = this.f13839f;
                    this.f13839f = i7 + 1;
                    C5212r1.m16226a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f13837d;
                int i8 = this.f13839f;
                this.f13839f = i8 + 1;
                C5212r1.m16226a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f13837d;
                    int i10 = this.f13839f;
                    this.f13839f = i10 + 1;
                    C5212r1.m16226a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f13837d;
                int i11 = this.f13839f;
                this.f13839f = i11 + 1;
                C5212r1.m16226a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f13837d;
                    int i13 = this.f13839f;
                    this.f13839f = i13 + 1;
                    C5212r1.m16226a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f13837d;
                int i14 = this.f13839f;
                this.f13839f = i14 + 1;
                C5212r1.m16226a(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f13837d;
                int i15 = this.f13839f;
                this.f13839f = i15 + 1;
                C5212r1.m16226a(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: h */
        public final void mo26133h(int i, int i2) throws IOException {
            mo26130g(C5227t1.m16370a(i, 0));
            if (i2 >= 0) {
                mo26130g(i2);
            } else {
                mo26126d((long) i2);
            }
        }

        /* renamed from: i */
        public final void mo26134i(int i, int i2) throws IOException {
            mo26130g(C5227t1.m16370a(i, i2));
        }

        /* renamed from: j */
        public final void mo26135j(int i, int i2) throws IOException {
            mo26130g(C5227t1.m16370a(i, 0));
            mo26130g(i2);
        }

        /* renamed from: b */
        public final void mo26120b(int i, C5151i iVar) throws IOException {
            mo26130g(C5227t1.m16370a(i, 2));
            mo26141b(iVar);
        }

        /* renamed from: f */
        public final void mo26128f(int i) throws IOException {
            if (i >= 0) {
                mo26130g(i);
            } else {
                mo26126d((long) i);
            }
        }

        /* renamed from: b */
        public final void mo26121b(int i, C5207q0 q0Var, C5141f1 f1Var) throws IOException {
            mo26130g(C5227t1.m16370a(i, 2));
            mo26130g(((C5116a) q0Var).getSerializedSize(f1Var));
            f1Var.mo25945a(q0Var, (C5242u1) this.f13832a);
        }

        /* renamed from: c */
        public final void mo26125c(long j) throws IOException {
            try {
                byte[] bArr = this.f13837d;
                int i = this.f13839f;
                int i2 = i + 1;
                this.f13839f = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                this.f13839f = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                this.f13839f = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                this.f13839f = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                this.f13839f = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                this.f13839f = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                this.f13839f = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f13839f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C5187d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13839f), Integer.valueOf(this.f13838e), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo26117a(byte b) throws IOException {
            try {
                byte[] bArr = this.f13837d;
                int i = this.f13839f;
                this.f13839f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C5187d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13839f), Integer.valueOf(this.f13838e), 1}), e);
            }
        }

        /* renamed from: b */
        public final void mo26122b(int i, String str) throws IOException {
            mo26130g(C5227t1.m16370a(i, 2));
            mo26142b(str);
        }

        /* renamed from: b */
        public final void mo26141b(C5151i iVar) throws IOException {
            mo26130g(iVar.size());
            iVar.mo25981a((C5148h) this);
        }

        /* renamed from: a */
        public final void mo25967a(byte[] bArr, int i, int i2) throws IOException {
            mo26143b(bArr, i, i2);
        }

        /* renamed from: a */
        public final int mo26116a() {
            return this.f13838e - this.f13839f;
        }

        /* renamed from: b */
        public final void mo26143b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f13837d, this.f13839f, i2);
                this.f13839f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C5187d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13839f), Integer.valueOf(this.f13838e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: b */
        public final void mo26142b(String str) throws IOException {
            int i = this.f13839f;
            try {
                int c = C5183l.m16038c(str.length() * 3);
                int c2 = C5183l.m16038c(str.length());
                if (c2 == c) {
                    int i2 = i + c2;
                    this.f13839f = i2;
                    int a = C5219s1.f13873a.mo26243a((CharSequence) str, this.f13837d, i2, mo26116a());
                    this.f13839f = i;
                    mo26130g((a - i) - c2);
                    this.f13839f = a;
                    return;
                }
                mo26130g(C5219s1.m16299a((CharSequence) str));
                this.f13839f = C5219s1.f13873a.mo26243a((CharSequence) str, this.f13837d, this.f13839f, mo26116a());
            } catch (C5219s1.C5223d e) {
                this.f13839f = i;
                mo26119a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C5187d(e2);
            }
        }

        /* renamed from: g */
        public final void mo26131g(int i, int i2) throws IOException {
            mo26130g(C5227t1.m16370a(i, 5));
            mo26127e(i2);
        }

        /* renamed from: g */
        public final void mo26132g(int i, long j) throws IOException {
            mo26130g(C5227t1.m16370a(i, 0));
            mo26126d(j);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.l$e */
    public static final class C5188e extends C5185b {

        /* renamed from: h */
        public final OutputStream f13840h;

        public C5188e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f13840h = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: a */
        public void mo26118a(int i, C5207q0 q0Var) throws IOException {
            mo26130g(C5227t1.m16370a(1, 3));
            mo26135j(2, i);
            mo26130g(C5227t1.m16370a(3, 2));
            mo26130g(q0Var.getSerializedSize());
            q0Var.writeTo(this);
            mo26130g(C5227t1.m16370a(1, 4));
        }

        /* renamed from: b */
        public void mo26120b(int i, C5151i iVar) throws IOException {
            mo26130g(C5227t1.m16370a(i, 2));
            mo26145b(iVar);
        }

        /* renamed from: c */
        public void mo26124c(int i, C5151i iVar) throws IOException {
            mo26130g(C5227t1.m16370a(1, 3));
            mo26135j(2, i);
            mo26120b(3, iVar);
            mo26130g(C5227t1.m16370a(1, 4));
        }

        /* renamed from: d */
        public void mo26126d(long j) throws IOException {
            mo26148j(10);
            mo26138f(j);
        }

        /* renamed from: e */
        public void mo26127e(int i) throws IOException {
            mo26148j(4);
            mo26139h(i);
        }

        /* renamed from: f */
        public void mo26129f(int i, long j) throws IOException {
            mo26148j(18);
            mo26140i(C5227t1.m16370a(i, 1));
            mo26137e(j);
        }

        /* renamed from: g */
        public void mo26131g(int i, int i2) throws IOException {
            mo26148j(14);
            mo26140i(C5227t1.m16370a(i, 5));
            mo26139h(i2);
        }

        /* renamed from: h */
        public void mo26133h(int i, int i2) throws IOException {
            mo26148j(20);
            mo26140i(C5227t1.m16370a(i, 0));
            if (i2 >= 0) {
                mo26140i(i2);
            } else {
                mo26138f((long) i2);
            }
        }

        /* renamed from: i */
        public void mo26134i(int i, int i2) throws IOException {
            mo26130g(C5227t1.m16370a(i, i2));
        }

        /* renamed from: j */
        public void mo26135j(int i, int i2) throws IOException {
            mo26148j(20);
            mo26140i(C5227t1.m16370a(i, 0));
            mo26140i(i2);
        }

        /* renamed from: b */
        public void mo26121b(int i, C5207q0 q0Var, C5141f1 f1Var) throws IOException {
            mo26130g(C5227t1.m16370a(i, 2));
            mo26130g(((C5116a) q0Var).getSerializedSize(f1Var));
            f1Var.mo25945a(q0Var, (C5242u1) this.f13832a);
        }

        /* renamed from: f */
        public void mo26128f(int i) throws IOException {
            if (i >= 0) {
                mo26148j(5);
                mo26140i(i);
                return;
            }
            mo26126d((long) i);
        }

        /* renamed from: g */
        public void mo26132g(int i, long j) throws IOException {
            mo26148j(20);
            mo26140i(C5227t1.m16370a(i, 0));
            mo26138f(j);
        }

        /* renamed from: j */
        public final void mo26148j(int i) throws IOException {
            if (this.f13834e - this.f13835f < i) {
                mo26144b();
            }
        }

        /* renamed from: c */
        public void mo26125c(long j) throws IOException {
            mo26148j(8);
            mo26137e(j);
        }

        /* renamed from: b */
        public void mo26122b(int i, String str) throws IOException {
            mo26130g(C5227t1.m16370a(i, 2));
            mo26146b(str);
        }

        /* renamed from: a */
        public void mo26117a(byte b) throws IOException {
            if (this.f13835f == this.f13834e) {
                mo26144b();
            }
            mo26136b(b);
        }

        /* renamed from: g */
        public void mo26130g(int i) throws IOException {
            mo26148j(5);
            mo26140i(i);
        }

        /* renamed from: b */
        public void mo26123b(int i, boolean z) throws IOException {
            mo26148j(11);
            mo26140i(C5227t1.m16370a(i, 0));
            mo26136b(z ? (byte) 1 : 0);
        }

        /* renamed from: b */
        public void mo26145b(C5151i iVar) throws IOException {
            mo26130g(iVar.size());
            iVar.mo25981a((C5148h) this);
        }

        /* renamed from: a */
        public void mo25967a(byte[] bArr, int i, int i2) throws IOException {
            mo26147b(bArr, i, i2);
        }

        /* renamed from: b */
        public void mo26146b(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int c = C5183l.m16038c(length);
                int i3 = c + length;
                int i4 = this.f13834e;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int a = C5219s1.f13873a.mo26243a((CharSequence) str, bArr, 0, length);
                    mo26130g(a);
                    mo26147b(bArr, 0, a);
                    return;
                }
                if (i3 > i4 - this.f13835f) {
                    mo26144b();
                }
                int c2 = C5183l.m16038c(str.length());
                i = this.f13835f;
                if (c2 == c) {
                    int i5 = i + c2;
                    this.f13835f = i5;
                    int a2 = C5219s1.f13873a.mo26243a((CharSequence) str, this.f13833d, i5, this.f13834e - i5);
                    this.f13835f = i;
                    i2 = (a2 - i) - c2;
                    mo26140i(i2);
                    this.f13835f = a2;
                } else {
                    i2 = C5219s1.m16299a((CharSequence) str);
                    mo26140i(i2);
                    this.f13835f = C5219s1.f13873a.mo26243a((CharSequence) str, this.f13833d, this.f13835f, i2);
                }
                this.f13836g += i2;
            } catch (C5219s1.C5223d e) {
                this.f13836g -= this.f13835f - i;
                this.f13835f = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C5187d(e2);
            } catch (C5219s1.C5223d e3) {
                mo26119a(str, e3);
            }
        }

        /* renamed from: b */
        public void mo26147b(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f13834e;
            int i4 = this.f13835f;
            int i5 = i3 - i4;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, this.f13833d, i4, i2);
                this.f13835f += i2;
                this.f13836g += i2;
                return;
            }
            System.arraycopy(bArr, i, this.f13833d, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f13835f = this.f13834e;
            this.f13836g += i5;
            mo26144b();
            if (i7 <= this.f13834e) {
                System.arraycopy(bArr, i6, this.f13833d, 0, i7);
                this.f13835f = i7;
            } else {
                this.f13840h.write(bArr, i6, i7);
            }
            this.f13836g += i7;
        }

        /* renamed from: b */
        public final void mo26144b() throws IOException {
            this.f13840h.write(this.f13833d, 0, this.f13835f);
            this.f13835f = 0;
        }
    }

    public C5183l() {
    }

    /* renamed from: b */
    public static int m16036b(int i, long j) {
        return m16034b(i) + m16029a(j);
    }

    /* renamed from: c */
    public static int m16040c(int i, long j) {
        return m16034b(i) + 8;
    }

    /* renamed from: d */
    public static int m16043d(int i, long j) {
        return m16034b(i) + m16029a(m16037b(j));
    }

    /* renamed from: a */
    public static int m16030a(C5131d0 d0Var) {
        int i;
        if (d0Var.f13737b != null) {
            i = d0Var.f13737b.size();
        } else {
            i = d0Var.f13736a != null ? d0Var.f13736a.getSerializedSize() : 0;
        }
        return m16038c(i) + i;
    }

    /* renamed from: e */
    public static int m16045e(int i, long j) {
        return m16034b(i) + m16029a(j);
    }

    /* renamed from: b */
    public static int m16034b(int i) {
        return m16038c(C5227t1.m16370a(i, 0));
    }

    /* renamed from: a */
    public static int m16024a(int i, long j) {
        return m16034b(i) + 8;
    }

    /* renamed from: a */
    public static int m16022a(int i, float f) {
        return m16034b(i) + 4;
    }

    /* renamed from: a */
    public static int m16021a(int i, double d) {
        return m16034b(i) + 8;
    }

    /* renamed from: a */
    public static int m16028a(int i, boolean z) {
        return m16034b(i) + 1;
    }

    /* renamed from: a */
    public static int m16023a(int i, int i2) {
        return m16034b(i) + m16020a(i2);
    }

    /* renamed from: a */
    public static int m16027a(int i, String str) {
        return m16034b(i) + m16032a(str);
    }

    /* renamed from: a */
    public static int m16025a(int i, C5151i iVar) {
        int b = m16034b(i);
        int size = iVar.size();
        return b + m16038c(size) + size;
    }

    /* renamed from: a */
    public static int m16020a(int i) {
        if (i >= 0) {
            return m16038c(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m16032a(String str) {
        int i;
        try {
            i = C5219s1.m16299a((CharSequence) str);
        } catch (C5219s1.C5223d unused) {
            i = str.getBytes(C5252z.f13963a).length;
        }
        return m16038c(i) + i;
    }

    /* renamed from: a */
    public static int m16031a(C5151i iVar) {
        int size = iVar.size();
        return m16038c(size) + size;
    }

    /* renamed from: a */
    public final void mo26119a(String str, C5219s1.C5223d dVar) throws IOException {
        f13830b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C5252z.f13963a);
        try {
            mo26130g(bytes.length);
            mo25967a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C5187d(e);
        } catch (C5187d e2) {
            throw e2;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static int m16026a(int i, C5207q0 q0Var, C5141f1 f1Var) {
        return (m16034b(i) * 2) + ((C5116a) q0Var).getSerializedSize(f1Var);
    }
}
