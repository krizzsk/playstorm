package com.mbridge.msdk.video.dynview.p360i.p363c;

import android.os.CountDownTimer;

/* renamed from: com.mbridge.msdk.video.dynview.i.c.b */
/* compiled from: MBCountDownTimer */
public final class C9300b {

    /* renamed from: a */
    private long f22536a = 0;

    /* renamed from: b */
    private long f22537b;

    /* renamed from: c */
    private C9299a f22538c;

    /* renamed from: d */
    private C9301a f22539d;

    /* renamed from: a */
    public final C9300b mo62494a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f22537b = j;
        return this;
    }

    /* renamed from: a */
    public final C9300b mo62495a(C9299a aVar) {
        this.f22538c = aVar;
        return this;
    }

    /* renamed from: b */
    public final C9300b mo62497b(long j) {
        this.f22536a = j;
        return this;
    }

    /* renamed from: a */
    public final void mo62496a() {
        C9301a aVar = this.f22539d;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f22539d = null;
            }
            if (this.f22537b <= 0) {
                this.f22537b = this.f22536a + 1000;
            }
            C9301a aVar2 = new C9301a(this.f22536a, this.f22537b);
            this.f22539d = aVar2;
            aVar2.mo62499a(this.f22538c);
        }
        this.f22539d.start();
    }

    /* renamed from: b */
    public final void mo62498b() {
        C9301a aVar = this.f22539d;
        if (aVar != null) {
            aVar.cancel();
            this.f22539d = null;
        }
    }

    /* renamed from: com.mbridge.msdk.video.dynview.i.c.b$a */
    /* compiled from: MBCountDownTimer */
    private static class C9301a extends CountDownTimer {

        /* renamed from: a */
        private C9299a f22540a;

        public C9301a(long j, long j2) {
            super(j, j2);
        }

        public final void onTick(long j) {
            C9299a aVar = this.f22540a;
            if (aVar != null) {
                aVar.mo62493a(j);
            }
        }

        public final void onFinish() {
            C9299a aVar = this.f22540a;
            if (aVar != null) {
                aVar.mo62492a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo62499a(C9299a aVar) {
            this.f22540a = aVar;
        }
    }
}
