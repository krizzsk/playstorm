package com.mbridge.msdk.foundation.same.p303e;

/* renamed from: com.mbridge.msdk.foundation.same.e.a */
/* compiled from: CommonTask */
public abstract class C8434a implements Runnable {

    /* renamed from: b */
    public static long f20403b;

    /* renamed from: c */
    public C8435a f20404c = C8435a.READY;

    /* renamed from: d */
    public C8436b f20405d;

    /* renamed from: com.mbridge.msdk.foundation.same.e.a$a */
    /* compiled from: CommonTask */
    public enum C8435a {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    /* renamed from: com.mbridge.msdk.foundation.same.e.a$b */
    /* compiled from: CommonTask */
    public interface C8436b {
        /* renamed from: a */
        void mo15705a(C8435a aVar);
    }

    /* renamed from: a */
    public abstract void mo15708a();

    /* renamed from: b */
    public abstract void mo15709b();

    public final void run() {
        try {
            if (this.f20404c == C8435a.READY) {
                m24375a(C8435a.RUNNING);
                mo15708a();
                m24375a(C8435a.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public C8434a() {
        f20403b++;
    }

    /* renamed from: d */
    public final void mo57525d() {
        if (this.f20404c != C8435a.CANCEL) {
            m24375a(C8435a.CANCEL);
            mo15709b();
        }
    }

    /* renamed from: a */
    private void m24375a(C8435a aVar) {
        this.f20404c = aVar;
        C8436b bVar = this.f20405d;
        if (bVar != null) {
            bVar.mo15705a(aVar);
        }
    }
}
