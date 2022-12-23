package com.applovin.impl.sdk.p049d;

/* renamed from: com.applovin.impl.sdk.d.e */
public final class C1870e {

    /* renamed from: a */
    private long f3429a;

    /* renamed from: b */
    private long f3430b;

    /* renamed from: c */
    private boolean f3431c;

    /* renamed from: d */
    private long f3432d;

    /* renamed from: e */
    private long f3433e;

    /* renamed from: f */
    private int f3434f;

    /* renamed from: g */
    private Exception f3435g;

    /* renamed from: a */
    public void mo14113a() {
        this.f3431c = true;
    }

    /* renamed from: a */
    public void mo14114a(int i) {
        this.f3434f = i;
    }

    /* renamed from: a */
    public void mo14115a(long j) {
        this.f3429a += j;
    }

    /* renamed from: a */
    public void mo14116a(Exception exc) {
        this.f3435g = exc;
    }

    /* renamed from: b */
    public void mo14117b(long j) {
        this.f3430b += j;
    }

    /* renamed from: b */
    public boolean mo14118b() {
        return this.f3431c;
    }

    /* renamed from: c */
    public long mo14119c() {
        return this.f3429a;
    }

    /* renamed from: d */
    public long mo14120d() {
        return this.f3430b;
    }

    /* renamed from: e */
    public void mo14121e() {
        this.f3432d++;
    }

    /* renamed from: f */
    public void mo14122f() {
        this.f3433e++;
    }

    /* renamed from: g */
    public long mo14123g() {
        return this.f3432d;
    }

    /* renamed from: h */
    public long mo14124h() {
        return this.f3433e;
    }

    /* renamed from: i */
    public Exception mo14125i() {
        return this.f3435g;
    }

    /* renamed from: j */
    public int mo14126j() {
        return this.f3434f;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f3429a + ", totalCachedBytes=" + this.f3430b + ", isHTMLCachingCancelled=" + this.f3431c + ", htmlResourceCacheSuccessCount=" + this.f3432d + ", htmlResourceCacheFailureCount=" + this.f3433e + '}';
    }
}
