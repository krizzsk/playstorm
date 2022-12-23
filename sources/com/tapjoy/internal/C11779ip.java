package com.tapjoy.internal;

import com.google.common.base.Ascii;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.tapjoy.internal.ip */
public final class C11779ip {

    /* renamed from: a */
    private final byte[] f28742a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f28743b;

    /* renamed from: c */
    private C11778io f28744c;

    /* renamed from: d */
    private int f28745d = 0;

    /* renamed from: a */
    public final C11779ip mo72705a(byte[] bArr) {
        if (bArr != null) {
            m34190a(ByteBuffer.wrap(bArr));
        } else {
            this.f28743b = null;
            this.f28744c.f28730b = 2;
        }
        return this;
    }

    /* renamed from: a */
    public final C11778io mo72704a() {
        if (this.f28743b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m34202l()) {
            return this.f28744c;
        } else {
            m34197g();
            if (!m34202l()) {
                m34192b();
                if (this.f28744c.f28731c < 0) {
                    this.f28744c.f28730b = 1;
                }
            }
            return this.f28744c;
        }
    }

    /* renamed from: b */
    private void m34192b() {
        m34193c();
    }

    /* renamed from: c */
    private void m34193c() {
        boolean z = false;
        while (!z && !m34202l() && this.f28744c.f28731c <= Integer.MAX_VALUE) {
            int k = m34201k();
            if (k == 33) {
                int k2 = m34201k();
                if (k2 == 1) {
                    m34199i();
                } else if (k2 == 249) {
                    this.f28744c.f28732d = new C11777in();
                    m34194d();
                } else if (k2 == 254) {
                    m34199i();
                } else if (k2 != 255) {
                    m34199i();
                } else {
                    m34200j();
                    String str = "";
                    for (int i = 0; i < 11; i++) {
                        str = str + ((char) this.f28742a[i]);
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        m34196f();
                    } else {
                        m34199i();
                    }
                }
            } else if (k == 44) {
                if (this.f28744c.f28732d == null) {
                    this.f28744c.f28732d = new C11777in();
                }
                m34195e();
            } else if (k != 59) {
                this.f28744c.f28730b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: d */
    private void m34194d() {
        m34201k();
        int k = m34201k();
        this.f28744c.f28732d.f28724g = (k & 28) >> 2;
        boolean z = true;
        if (this.f28744c.f28732d.f28724g == 0) {
            this.f28744c.f28732d.f28724g = 1;
        }
        C11777in inVar = this.f28744c.f28732d;
        if ((k & 1) == 0) {
            z = false;
        }
        inVar.f28723f = z;
        short s = this.f28743b.getShort();
        if (s < 2) {
            s = 10;
        }
        this.f28744c.f28732d.f28726i = s * 10;
        this.f28744c.f28732d.f28725h = m34201k();
        m34201k();
    }

    /* renamed from: e */
    private void m34195e() {
        this.f28744c.f28732d.f28718a = this.f28743b.getShort();
        this.f28744c.f28732d.f28719b = this.f28743b.getShort();
        this.f28744c.f28732d.f28720c = this.f28743b.getShort();
        this.f28744c.f28732d.f28721d = this.f28743b.getShort();
        int k = m34201k();
        boolean z = false;
        boolean z2 = (k & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((k & 7) + 1));
        C11777in inVar = this.f28744c.f28732d;
        if ((k & 64) != 0) {
            z = true;
        }
        inVar.f28722e = z;
        if (z2) {
            this.f28744c.f28732d.f28728k = m34191a(pow);
        } else {
            this.f28744c.f28732d.f28728k = null;
        }
        this.f28744c.f28732d.f28727j = this.f28743b.position();
        m34198h();
        if (!m34202l()) {
            this.f28744c.f28731c++;
            this.f28744c.f28733e.add(this.f28744c.f28732d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34196f() {
        /*
            r3 = this;
        L_0x0000:
            r3.m34200j()
            byte[] r0 = r3.f28742a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x0026
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.tapjoy.internal.io r2 = r3.f28744c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f28741m = r0
            com.tapjoy.internal.io r0 = r3.f28744c
            int r0 = r0.f28741m
            if (r0 != 0) goto L_0x0026
            com.tapjoy.internal.io r0 = r3.f28744c
            r1 = -1
            r0.f28741m = r1
        L_0x0026:
            int r0 = r3.f28745d
            if (r0 <= 0) goto L_0x0030
            boolean r0 = r3.m34202l()
            if (r0 == 0) goto L_0x0000
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11779ip.m34196f():void");
    }

    /* renamed from: g */
    private void m34197g() {
        boolean z = false;
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) m34201k());
        }
        if (!str.startsWith("GIF")) {
            this.f28744c.f28730b = 1;
            return;
        }
        this.f28744c.f28734f = this.f28743b.getShort();
        this.f28744c.f28735g = this.f28743b.getShort();
        int k = m34201k();
        C11778io ioVar = this.f28744c;
        if ((k & 128) != 0) {
            z = true;
        }
        ioVar.f28736h = z;
        this.f28744c.f28737i = 2 << (k & 7);
        this.f28744c.f28738j = m34201k();
        this.f28744c.f28739k = m34201k();
        if (this.f28744c.f28736h && !m34202l()) {
            C11778io ioVar2 = this.f28744c;
            ioVar2.f28729a = m34191a(ioVar2.f28737i);
            C11778io ioVar3 = this.f28744c;
            ioVar3.f28740l = ioVar3.f28729a[this.f28744c.f28738j];
        }
    }

    /* renamed from: a */
    private int[] m34191a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f28743b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << Ascii.DLE) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            Object[] objArr = new Object[1];
            this.f28744c.f28730b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m34198h() {
        m34201k();
        m34199i();
    }

    /* renamed from: i */
    private void m34199i() {
        int k;
        do {
            try {
                k = m34201k();
                this.f28743b.position(this.f28743b.position() + k);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (k > 0);
    }

    /* renamed from: j */
    private int m34200j() {
        int k = m34201k();
        this.f28745d = k;
        int i = 0;
        if (k > 0) {
            int i2 = 0;
            while (i < this.f28745d) {
                try {
                    i2 = this.f28745d - i;
                    this.f28743b.get(this.f28742a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    Object[] objArr = new Object[4];
                    Integer.valueOf(i);
                    Integer.valueOf(i2);
                    Integer.valueOf(this.f28745d);
                    this.f28744c.f28730b = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: k */
    private int m34201k() {
        try {
            return this.f28743b.get() & 255;
        } catch (Exception unused) {
            this.f28744c.f28730b = 1;
            return 0;
        }
    }

    /* renamed from: l */
    private boolean m34202l() {
        return this.f28744c.f28730b != 0;
    }

    /* renamed from: a */
    private C11779ip m34190a(ByteBuffer byteBuffer) {
        this.f28743b = null;
        Arrays.fill(this.f28742a, (byte) 0);
        this.f28744c = new C11778io();
        this.f28745d = 0;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f28743b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f28743b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
