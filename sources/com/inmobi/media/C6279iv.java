package com.inmobi.media;

/* renamed from: com.inmobi.media.iv */
/* compiled from: SessionManager */
public class C6279iv {

    /* renamed from: g */
    private static final String f15893g = C6279iv.class.getSimpleName();

    /* renamed from: a */
    long f15894a;

    /* renamed from: b */
    long f15895b;

    /* renamed from: c */
    long f15896c;

    /* renamed from: d */
    long f15897d;

    /* renamed from: e */
    long f15898e;

    /* renamed from: f */
    long f15899f;

    /* renamed from: com.inmobi.media.iv$a */
    /* compiled from: SessionManager */
    static class C6280a {

        /* renamed from: a */
        static final C6279iv f15900a = new C6279iv((byte) 0);
    }

    /* synthetic */ C6279iv(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6279iv m18765a() {
        return C6280a.f15900a;
    }

    private C6279iv() {
        this.f15894a = 0;
        this.f15895b = 0;
        this.f15896c = 0;
        this.f15897d = 0;
        this.f15898e = 0;
        this.f15899f = 0;
    }

    /* renamed from: b */
    static void m18766b() {
        C6281iw.m18775a();
        if (C6281iw.m18777e().sessionEnabled) {
            C6259ih.m18712a().f15864c = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo35491a(long j) {
        int a = C6251ib.m18647a();
        if (a == 0) {
            m18769f(j);
        } else if (a == 1) {
            m18767d(j);
        }
    }

    /* renamed from: b */
    public final void mo35492b(long j) {
        int a = C6251ib.m18647a();
        if (a == 0) {
            m18770g(j);
        } else if (a == 1) {
            m18768e(j);
        }
    }

    /* renamed from: d */
    private void m18767d(long j) {
        this.f15894a += j;
    }

    /* renamed from: e */
    private void m18768e(long j) {
        this.f15895b += j;
    }

    /* renamed from: f */
    private void m18769f(long j) {
        this.f15896c += j;
    }

    /* renamed from: g */
    private void m18770g(long j) {
        this.f15897d += j;
    }

    /* renamed from: c */
    public final void mo35493c(long j) {
        this.f15898e += j;
    }
}
