package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4679b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.d */
public final class C4690d implements C4679b {

    /* renamed from: b */
    public int f11778b = -1;

    /* renamed from: c */
    public int f11779c = -1;

    /* renamed from: d */
    public int[] f11780d;

    /* renamed from: e */
    public boolean f11781e;

    /* renamed from: f */
    public int[] f11782f;

    /* renamed from: g */
    public ByteBuffer f11783g;

    /* renamed from: h */
    public ByteBuffer f11784h;

    /* renamed from: i */
    public boolean f11785i;

    public C4690d() {
        ByteBuffer byteBuffer = C4679b.f11704a;
        this.f11783g = byteBuffer;
        this.f11784h = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo25063a(int i, int i2, int i3) throws C4679b.C4680a {
        boolean z = !Arrays.equals(this.f11780d, this.f11782f);
        int[] iArr = this.f11780d;
        this.f11782f = iArr;
        if (iArr == null) {
            this.f11781e = false;
            return z;
        } else if (i3 != 2) {
            throw new C4679b.C4680a(i, i2, i3);
        } else if (!z && this.f11779c == i && this.f11778b == i2) {
            return false;
        } else {
            this.f11779c = i;
            this.f11778b = i2;
            this.f11781e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f11782f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f11781e = (i5 != i4) | this.f11781e;
                    i4++;
                } else {
                    throw new C4679b.C4680a(i, i2, i3);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo25064b() {
        return this.f11785i && this.f11784h == C4679b.f11704a;
    }

    /* renamed from: c */
    public void mo25065c() {
        this.f11785i = true;
    }

    /* renamed from: d */
    public boolean mo25066d() {
        return this.f11781e;
    }

    /* renamed from: e */
    public int mo25067e() {
        return 2;
    }

    /* renamed from: f */
    public int mo25068f() {
        int[] iArr = this.f11782f;
        return iArr == null ? this.f11778b : iArr.length;
    }

    public void flush() {
        this.f11784h = C4679b.f11704a;
        this.f11785i = false;
    }

    /* renamed from: g */
    public void mo25070g() {
        flush();
        this.f11783g = C4679b.f11704a;
        this.f11778b = -1;
        this.f11779c = -1;
        this.f11782f = null;
        this.f11781e = false;
    }

    /* renamed from: a */
    public void mo25062a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f11778b * 2)) * this.f11782f.length * 2;
        if (this.f11783g.capacity() < length) {
            this.f11783g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f11783g.clear();
        }
        while (position < limit) {
            for (int i : this.f11782f) {
                this.f11783g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f11778b * 2;
        }
        byteBuffer.position(limit);
        this.f11783g.flip();
        this.f11784h = this.f11783g;
    }

    /* renamed from: a */
    public ByteBuffer mo25061a() {
        ByteBuffer byteBuffer = this.f11784h;
        this.f11784h = C4679b.f11704a;
        return byteBuffer;
    }
}
