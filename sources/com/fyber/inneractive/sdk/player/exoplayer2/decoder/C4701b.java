package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.b */
public class C4701b {

    /* renamed from: a */
    public int f11849a;

    /* renamed from: b */
    public final C4698a f11850b = new C4698a();

    /* renamed from: c */
    public ByteBuffer f11851c;

    /* renamed from: d */
    public long f11852d;

    /* renamed from: e */
    public final int f11853e;

    public C4701b(int i) {
        this.f11853e = i;
    }

    /* renamed from: b */
    public static C4701b m14461b() {
        return new C4701b(0);
    }

    /* renamed from: a */
    public void mo25108a() {
        this.f11849a = 0;
        ByteBuffer byteBuffer = this.f11851c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: b */
    public final boolean mo25109b(int i) {
        return (this.f11849a & i) == i;
    }

    /* renamed from: a */
    public final ByteBuffer mo25107a(int i) {
        int i2 = this.f11853e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f11851c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }
}
