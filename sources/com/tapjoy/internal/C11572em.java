package com.tapjoy.internal;

import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.tapjoy.internal.em */
public final class C11572em {

    /* renamed from: a */
    final C11803jd f27974a;

    /* renamed from: b */
    public C11551ei f27975b;

    /* renamed from: c */
    private long f27976c = 0;

    /* renamed from: d */
    private long f27977d = Long.MAX_VALUE;

    /* renamed from: e */
    private int f27978e;

    /* renamed from: f */
    private int f27979f = 2;

    /* renamed from: g */
    private int f27980g = -1;

    /* renamed from: h */
    private long f27981h = -1;

    public C11572em(C11803jd jdVar) {
        this.f27974a = jdVar;
    }

    /* renamed from: a */
    public final long mo72359a() {
        if (this.f27979f == 2) {
            int i = this.f27978e + 1;
            this.f27978e = i;
            if (i <= 65) {
                long j = this.f27981h;
                this.f27981h = -1;
                this.f27979f = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    /* renamed from: a */
    public final void mo72360a(long j) {
        if (this.f27979f == 6) {
            int i = this.f27978e - 1;
            this.f27978e = i;
            if (i < 0 || this.f27981h != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.f27976c == this.f27977d || i == 0) {
                this.f27977d = j;
            } else {
                throw new IOException("Expected to end at " + this.f27977d + " but was " + this.f27976c);
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }

    /* renamed from: b */
    public final int mo72361b() {
        int i = this.f27979f;
        if (i == 7) {
            this.f27979f = 2;
            return this.f27980g;
        } else if (i == 6) {
            while (this.f27976c < this.f27977d && !this.f27974a.mo72756b()) {
                int h = m33561h();
                if (h != 0) {
                    int i2 = h >> 3;
                    this.f27980g = i2;
                    int i3 = h & 7;
                    if (i3 == 0) {
                        this.f27975b = C11551ei.VARINT;
                        this.f27979f = 0;
                        return this.f27980g;
                    } else if (i3 == 1) {
                        this.f27975b = C11551ei.FIXED64;
                        this.f27979f = 1;
                        return this.f27980g;
                    } else if (i3 == 2) {
                        this.f27975b = C11551ei.LENGTH_DELIMITED;
                        this.f27979f = 2;
                        int h2 = m33561h();
                        if (h2 < 0) {
                            throw new ProtocolException("Negative length: ".concat(String.valueOf(h2)));
                        } else if (this.f27981h == -1) {
                            long j = this.f27977d;
                            this.f27981h = j;
                            long j2 = this.f27976c + ((long) h2);
                            this.f27977d = j2;
                            if (j2 <= j) {
                                return this.f27980g;
                            }
                            throw new EOFException();
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (i3 == 3) {
                        m33559a(i2);
                    } else if (i3 == 4) {
                        throw new ProtocolException("Unexpected end group");
                    } else if (i3 == 5) {
                        this.f27975b = C11551ei.FIXED32;
                        this.f27979f = 5;
                        return this.f27980g;
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i3)));
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    /* renamed from: a */
    private void m33559a(int i) {
        while (this.f27976c < this.f27977d && !this.f27974a.mo72756b()) {
            int h = m33561h();
            if (h != 0) {
                int i2 = h >> 3;
                int i3 = h & 7;
                if (i3 == 0) {
                    this.f27979f = 0;
                    mo72363d();
                } else if (i3 == 1) {
                    this.f27979f = 1;
                    mo72365f();
                } else if (i3 == 2) {
                    long h2 = (long) m33561h();
                    this.f27976c += h2;
                    this.f27974a.mo72764d(h2);
                } else if (i3 == 3) {
                    m33559a(i2);
                } else if (i3 != 4) {
                    if (i3 == 5) {
                        this.f27979f = 5;
                        mo72364e();
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i3)));
                    }
                } else if (i2 != i) {
                    throw new ProtocolException("Unexpected end group");
                } else {
                    return;
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public final int mo72362c() {
        int i = this.f27979f;
        if (i == 0 || i == 2) {
            int h = m33561h();
            m33560b(0);
            return h;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f27979f);
    }

    /* renamed from: h */
    private int m33561h() {
        int i;
        this.f27976c++;
        byte d = this.f27974a.mo72762d();
        if (d >= 0) {
            return d;
        }
        byte b = d & Byte.MAX_VALUE;
        this.f27976c++;
        byte d2 = this.f27974a.mo72762d();
        if (d2 >= 0) {
            i = d2 << 7;
        } else {
            b |= (d2 & Byte.MAX_VALUE) << 7;
            this.f27976c++;
            byte d3 = this.f27974a.mo72762d();
            if (d3 >= 0) {
                i = d3 << Ascii.f17945SO;
            } else {
                b |= (d3 & Byte.MAX_VALUE) << Ascii.f17945SO;
                this.f27976c++;
                byte d4 = this.f27974a.mo72762d();
                if (d4 >= 0) {
                    i = d4 << Ascii.NAK;
                } else {
                    byte b2 = b | ((d4 & Byte.MAX_VALUE) << Ascii.NAK);
                    this.f27976c++;
                    byte d5 = this.f27974a.mo72762d();
                    byte b3 = b2 | (d5 << Ascii.f17938FS);
                    if (d5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        this.f27976c++;
                        if (this.f27974a.mo72762d() >= 0) {
                            return b3;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
            }
        }
        return b | i;
    }

    /* renamed from: d */
    public final long mo72363d() {
        int i = this.f27979f;
        if (i == 0 || i == 2) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                this.f27976c++;
                byte d = this.f27974a.mo72762d();
                j |= ((long) (d & Byte.MAX_VALUE)) << i2;
                if ((d & 128) == 0) {
                    m33560b(0);
                    return j;
                }
            }
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f27979f);
    }

    /* renamed from: e */
    public final int mo72364e() {
        int i = this.f27979f;
        if (i == 5 || i == 2) {
            this.f27974a.mo72749a(4);
            this.f27976c += 4;
            int f = this.f27974a.mo72769f();
            m33560b(5);
            return f;
        }
        throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f27979f);
    }

    /* renamed from: f */
    public final long mo72365f() {
        int i = this.f27979f;
        if (i == 1 || i == 2) {
            this.f27974a.mo72749a(8);
            this.f27976c += 8;
            long g = this.f27974a.mo72772g();
            m33560b(1);
            return g;
        }
        throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f27979f);
    }

    /* renamed from: b */
    private void m33560b(int i) {
        if (this.f27979f == i) {
            this.f27979f = 6;
            return;
        }
        long j = this.f27976c;
        long j2 = this.f27977d;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.f27977d + " but was " + this.f27976c);
        } else if (j == j2) {
            this.f27977d = this.f27981h;
            this.f27981h = -1;
            this.f27979f = 6;
        } else {
            this.f27979f = 7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final long mo72366g() {
        if (this.f27979f == 2) {
            long j = this.f27977d - this.f27976c;
            this.f27974a.mo72749a(j);
            this.f27979f = 6;
            this.f27976c = this.f27977d;
            this.f27977d = this.f27981h;
            this.f27981h = -1;
            return j;
        }
        throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f27979f);
    }
}
