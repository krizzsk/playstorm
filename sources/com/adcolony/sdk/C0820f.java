package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.f */
class C0820f {

    /* renamed from: a */
    private boolean f439a;

    C0820f() {
    }

    /* renamed from: a */
    public synchronized void mo10700a(long j) {
        if (!this.f439a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo10701a(boolean z) {
        this.f439a = z;
        if (z) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public boolean mo10702a() {
        return this.f439a;
    }
}
