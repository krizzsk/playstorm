package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4679b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.h */
public final class C4694h implements C4679b {

    /* renamed from: b */
    public int f11819b = -1;

    /* renamed from: c */
    public int f11820c = -1;

    /* renamed from: d */
    public C4693g f11821d;

    /* renamed from: e */
    public float f11822e = 1.0f;

    /* renamed from: f */
    public float f11823f = 1.0f;

    /* renamed from: g */
    public ByteBuffer f11824g;

    /* renamed from: h */
    public ShortBuffer f11825h;

    /* renamed from: i */
    public ByteBuffer f11826i;

    /* renamed from: j */
    public long f11827j;

    /* renamed from: k */
    public long f11828k;

    /* renamed from: l */
    public boolean f11829l;

    public C4694h() {
        ByteBuffer byteBuffer = C4679b.f11704a;
        this.f11824g = byteBuffer;
        this.f11825h = byteBuffer.asShortBuffer();
        this.f11826i = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo25063a(int i, int i2, int i3) throws C4679b.C4680a {
        if (i3 != 2) {
            throw new C4679b.C4680a(i, i2, i3);
        } else if (this.f11820c == i && this.f11819b == i2) {
            return false;
        } else {
            this.f11820c = i;
            this.f11819b = i2;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f11821d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25064b() {
        /*
            r1 = this;
            boolean r0 = r1.f11829l
            if (r0 == 0) goto L_0x000e
            com.fyber.inneractive.sdk.player.exoplayer2.audio.g r0 = r1.f11821d
            if (r0 == 0) goto L_0x000c
            int r0 = r0.f11812r
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4694h.mo25064b():boolean");
    }

    /* renamed from: c */
    public void mo25065c() {
        int i;
        C4693g gVar = this.f11821d;
        int i2 = gVar.f11811q;
        float f = gVar.f11809o;
        float f2 = gVar.f11810p;
        int i3 = gVar.f11812r + ((int) ((((((float) i2) / (f / f2)) + ((float) gVar.f11813s)) / f2) + 0.5f));
        gVar.mo25097a((gVar.f11799e * 2) + i2);
        int i4 = 0;
        while (true) {
            i = gVar.f11799e * 2;
            int i5 = gVar.f11796b;
            if (i4 >= i * i5) {
                break;
            }
            gVar.f11802h[(i5 * i2) + i4] = 0;
            i4++;
        }
        gVar.f11811q += i;
        gVar.mo25096a();
        if (gVar.f11812r > i3) {
            gVar.f11812r = i3;
        }
        gVar.f11811q = 0;
        gVar.f11814t = 0;
        gVar.f11813s = 0;
        this.f11829l = true;
    }

    /* renamed from: d */
    public boolean mo25066d() {
        return Math.abs(this.f11822e - 1.0f) >= 0.01f || Math.abs(this.f11823f - 1.0f) >= 0.01f;
    }

    /* renamed from: e */
    public int mo25067e() {
        return 2;
    }

    /* renamed from: f */
    public int mo25068f() {
        return this.f11819b;
    }

    public void flush() {
        C4693g gVar = new C4693g(this.f11820c, this.f11819b);
        this.f11821d = gVar;
        gVar.f11809o = this.f11822e;
        gVar.f11810p = this.f11823f;
        this.f11826i = C4679b.f11704a;
        this.f11827j = 0;
        this.f11828k = 0;
        this.f11829l = false;
    }

    /* renamed from: g */
    public void mo25070g() {
        this.f11821d = null;
        ByteBuffer byteBuffer = C4679b.f11704a;
        this.f11824g = byteBuffer;
        this.f11825h = byteBuffer.asShortBuffer();
        this.f11826i = byteBuffer;
        this.f11819b = -1;
        this.f11820c = -1;
        this.f11827j = 0;
        this.f11828k = 0;
        this.f11829l = false;
    }

    /* renamed from: a */
    public void mo25062a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f11827j += (long) remaining;
            C4693g gVar = this.f11821d;
            gVar.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i = gVar.f11796b;
            int i2 = remaining2 / i;
            gVar.mo25097a(i2);
            asShortBuffer.get(gVar.f11802h, gVar.f11811q * gVar.f11796b, ((i * i2) * 2) / 2);
            gVar.f11811q += i2;
            gVar.mo25096a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = this.f11821d.f11812r * this.f11819b * 2;
        if (i3 > 0) {
            if (this.f11824g.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.f11824g = order;
                this.f11825h = order.asShortBuffer();
            } else {
                this.f11824g.clear();
                this.f11825h.clear();
            }
            C4693g gVar2 = this.f11821d;
            ShortBuffer shortBuffer = this.f11825h;
            gVar2.getClass();
            int min = Math.min(shortBuffer.remaining() / gVar2.f11796b, gVar2.f11812r);
            shortBuffer.put(gVar2.f11804j, 0, gVar2.f11796b * min);
            int i4 = gVar2.f11812r - min;
            gVar2.f11812r = i4;
            short[] sArr = gVar2.f11804j;
            int i5 = gVar2.f11796b;
            System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
            this.f11828k += (long) i3;
            this.f11824g.limit(i3);
            this.f11826i = this.f11824g;
        }
    }

    /* renamed from: a */
    public ByteBuffer mo25061a() {
        ByteBuffer byteBuffer = this.f11826i;
        this.f11826i = C4679b.f11704a;
        return byteBuffer;
    }
}
