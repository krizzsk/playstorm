package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.cw */
public final class C10420cw<T> implements C10413cr {

    /* renamed from: a */
    public static final C10421a f26359a = new C10421a((byte) 0);

    /* renamed from: b */
    private final C10729lj<T> f26360b;

    /* renamed from: c */
    private boolean f26361c;

    /* renamed from: d */
    private C10730lk<? super Throwable, C10684ke> f26362d;

    public /* synthetic */ C10420cw(C10729lj ljVar, byte b) {
        this(ljVar);
    }

    private C10420cw(C10729lj<? extends T> ljVar) {
        this.f26360b = ljVar;
    }

    /* renamed from: a */
    public final void mo67165a() {
        this.f26362d = null;
        this.f26361c = true;
    }

    /* renamed from: com.ogury.ed.internal.cw$a */
    public static final class C10421a {
        public /* synthetic */ C10421a(byte b) {
            this();
        }

        private C10421a() {
        }

        /* renamed from: a */
        public static <T> C10420cw<T> m31531a(C10729lj<? extends T> ljVar) {
            C10765mq.m32773b(ljVar, "callable");
            return new C10420cw<>(ljVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C10420cw<T> mo67169a(C10730lk<? super Throwable, C10684ke> lkVar) {
        C10765mq.m32773b(lkVar, "consumer");
        this.f26362d = lkVar;
        return this;
    }

    /* renamed from: b */
    public final C10413cr mo67170b(C10730lk<? super T, C10684ke> lkVar) {
        C10765mq.m32773b(lkVar, "consumer");
        C10416cu cuVar = C10416cu.f26353a;
        C10416cu.m31513b().mo67162a(new Runnable(lkVar) {
            public final /* synthetic */ C10730lk f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C10420cw.m31525a(C10420cw.this, this.f$1);
            }
        });
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m31525a(C10420cw cwVar, C10730lk lkVar) {
        C10765mq.m32773b(cwVar, "this$0");
        C10765mq.m32773b(lkVar, "$consumer");
        try {
            cwVar.m31527a(lkVar, cwVar.f26360b.mo67074a());
        } catch (Throwable th) {
            C10730lk<? super Throwable, C10684ke> lkVar2 = cwVar.f26362d;
            if (lkVar2 != null) {
                cwVar.m31527a(lkVar2, th);
            }
        }
    }

    /* renamed from: a */
    private final <R> void m31527a(C10730lk<? super R, C10684ke> lkVar, R r) {
        C10416cu cuVar = C10416cu.f26353a;
        C10416cu.m31514c().mo67162a(new Runnable(lkVar, r) {
            public final /* synthetic */ C10730lk f$1;
            public final /* synthetic */ Object f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C10420cw.m31526a(C10420cw.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m31526a(C10420cw cwVar, C10730lk lkVar, Object obj) {
        C10765mq.m32773b(cwVar, "this$0");
        C10765mq.m32773b(lkVar, "$consumer");
        if (!cwVar.f26361c) {
            lkVar.mo66961a(obj);
        }
    }
}
