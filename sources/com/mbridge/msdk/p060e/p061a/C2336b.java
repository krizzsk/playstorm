package com.mbridge.msdk.p060e.p061a;

import android.os.CountDownTimer;

/* renamed from: com.mbridge.msdk.e.a.b */
/* compiled from: MBCountDownTimer */
public final class C2336b {

    /* renamed from: a */
    private long f4854a = 0;

    /* renamed from: b */
    private long f4855b;

    /* renamed from: c */
    private C2335a f4856c;

    /* renamed from: d */
    private C2337a f4857d;

    /* renamed from: a */
    public final C2336b mo15722a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f4855b = j;
        return this;
    }

    /* renamed from: a */
    public final C2336b mo15723a(C2335a aVar) {
        this.f4856c = aVar;
        return this;
    }

    /* renamed from: b */
    public final C2336b mo15725b(long j) {
        this.f4854a = j;
        return this;
    }

    /* renamed from: a */
    public final void mo15724a() {
        C2337a aVar = this.f4857d;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f4857d = null;
            }
            if (this.f4855b <= 0) {
                this.f4855b = this.f4854a + 1000;
            }
            C2337a aVar2 = new C2337a(this.f4854a, this.f4855b);
            this.f4857d = aVar2;
            aVar2.mo15727a(this.f4856c);
        }
        this.f4857d.start();
    }

    /* renamed from: b */
    public final void mo15726b() {
        C2337a aVar = this.f4857d;
        if (aVar != null) {
            aVar.cancel();
            this.f4857d = null;
        }
    }

    /* renamed from: com.mbridge.msdk.e.a.b$a */
    /* compiled from: MBCountDownTimer */
    private static class C2337a extends CountDownTimer {

        /* renamed from: a */
        private C2335a f4858a;

        public C2337a(long j, long j2) {
            super(j, j2);
        }

        public final void onTick(long j) {
            C2335a aVar = this.f4858a;
            if (aVar != null) {
                aVar.onTick(j);
            }
        }

        public final void onFinish() {
            C2335a aVar = this.f4858a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo15727a(C2335a aVar) {
            this.f4858a = aVar;
        }
    }
}
