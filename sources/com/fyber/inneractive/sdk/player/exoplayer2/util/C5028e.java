package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.e */
public final class C5028e {

    /* renamed from: a */
    public final int f13417a;

    /* renamed from: b */
    public final int f13418b;

    /* renamed from: c */
    public final int f13419c;

    /* renamed from: d */
    public final long f13420d;

    public C5028e(byte[] bArr, int i) {
        C5035j jVar = new C5035j(bArr);
        jVar.mo25585b(i * 8);
        jVar.mo25583a(16);
        jVar.mo25583a(16);
        jVar.mo25583a(24);
        jVar.mo25583a(24);
        this.f13417a = jVar.mo25583a(20);
        this.f13418b = jVar.mo25583a(3) + 1;
        this.f13419c = jVar.mo25583a(5) + 1;
        this.f13420d = ((((long) jVar.mo25583a(4)) & 15) << 32) | (((long) jVar.mo25583a(32)) & 4294967295L);
    }
}
