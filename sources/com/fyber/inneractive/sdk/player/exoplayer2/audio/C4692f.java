package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4679b;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.f */
public final class C4692f implements C4679b {

    /* renamed from: b */
    public int f11789b = -1;

    /* renamed from: c */
    public int f11790c = -1;

    /* renamed from: d */
    public int f11791d = 0;

    /* renamed from: e */
    public ByteBuffer f11792e;

    /* renamed from: f */
    public ByteBuffer f11793f;

    /* renamed from: g */
    public boolean f11794g;

    public C4692f() {
        ByteBuffer byteBuffer = C4679b.f11704a;
        this.f11792e = byteBuffer;
        this.f11793f = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo25063a(int i, int i2, int i3) throws C4679b.C4680a {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C4679b.C4680a(i, i2, i3);
        } else if (this.f11789b == i && this.f11790c == i2 && this.f11791d == i3) {
            return false;
        } else {
            this.f11789b = i;
            this.f11790c = i2;
            this.f11791d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f11792e = C4679b.f11704a;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo25064b() {
        return this.f11794g && this.f11793f == C4679b.f11704a;
    }

    /* renamed from: c */
    public void mo25065c() {
        this.f11794g = true;
    }

    /* renamed from: d */
    public boolean mo25066d() {
        int i = this.f11791d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: e */
    public int mo25067e() {
        return 2;
    }

    /* renamed from: f */
    public int mo25068f() {
        return this.f11790c;
    }

    public void flush() {
        this.f11793f = C4679b.f11704a;
        this.f11794g = false;
    }

    /* renamed from: g */
    public void mo25070g() {
        flush();
        this.f11792e = C4679b.f11704a;
        this.f11789b = -1;
        this.f11790c = -1;
        this.f11791d = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25062a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f11791d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 * 2
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f11792e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f11792e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f11792e
            r2.clear()
        L_0x003f:
            int r2 = r7.f11791d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f11792e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11792e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f11792e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11792e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f11792e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f11792e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f11792e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f11792e
            r7.f11793f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4692f.mo25062a(java.nio.ByteBuffer):void");
    }

    /* renamed from: a */
    public ByteBuffer mo25061a() {
        ByteBuffer byteBuffer = this.f11793f;
        this.f11793f = C4679b.f11704a;
        return byteBuffer;
    }
}
