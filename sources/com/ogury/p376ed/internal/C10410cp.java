package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.cp */
public final class C10410cp implements C10413cr {

    /* renamed from: a */
    public static final C10411a f26347a = new C10411a((byte) 0);

    /* renamed from: b */
    private final C10729lj<C10684ke> f26348b;

    /* renamed from: c */
    private boolean f26349c;

    /* renamed from: d */
    private C10730lk<? super Throwable, C10684ke> f26350d;

    public /* synthetic */ C10410cp(C10729lj ljVar, byte b) {
        this(ljVar);
    }

    private C10410cp(C10729lj<C10684ke> ljVar) {
        this.f26348b = ljVar;
    }

    /* renamed from: a */
    public final void mo67165a() {
        this.f26350d = null;
        this.f26349c = true;
    }

    /* renamed from: com.ogury.ed.internal.cp$a */
    public static final class C10411a {
        public /* synthetic */ C10411a(byte b) {
            this();
        }

        private C10411a() {
        }

        /* renamed from: a */
        public static C10410cp m31506a(C10729lj<C10684ke> ljVar) {
            C10765mq.m32773b(ljVar, "action");
            return new C10410cp(ljVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C10410cp mo67163a(C10730lk<? super Throwable, C10684ke> lkVar) {
        C10765mq.m32773b(lkVar, "consumer");
        this.f26350d = lkVar;
        return this;
    }

    /* renamed from: a */
    public final C10413cr mo67164a(C10729lj<C10684ke> ljVar) {
        C10765mq.m32773b(ljVar, "subscribedAction");
        C10416cu cuVar = C10416cu.f26353a;
        C10416cu.m31513b().mo67162a(new Runnable(ljVar) {
            public final /* synthetic */ C10729lj f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C10410cp.m31498a(C10410cp.this, this.f$1);
            }
        });
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m31498a(C10410cp cpVar, C10729lj ljVar) {
        C10765mq.m32773b(cpVar, "this$0");
        C10765mq.m32773b(ljVar, "$subscribedAction");
        try {
            cpVar.f26348b.mo67074a();
            cpVar.m31502b(ljVar);
        } catch (Throwable th) {
            C10730lk<? super Throwable, C10684ke> lkVar = cpVar.f26350d;
            if (lkVar != null) {
                cpVar.m31500a(lkVar, th);
            }
        }
    }

    /* renamed from: b */
    private final void m31502b(C10729lj<C10684ke> ljVar) {
        C10416cu cuVar = C10416cu.f26353a;
        C10416cu.m31514c().mo67162a(new Runnable(ljVar) {
            public final /* synthetic */ C10729lj f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C10410cp.m31501b(C10410cp.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m31501b(C10410cp cpVar, C10729lj ljVar) {
        C10765mq.m32773b(cpVar, "this$0");
        C10765mq.m32773b(ljVar, "$action");
        if (!cpVar.f26349c) {
            ljVar.mo67074a();
        }
    }

    /* renamed from: a */
    private final <R> void m31500a(C10730lk<? super R, C10684ke> lkVar, R r) {
        C10416cu cuVar = C10416cu.f26353a;
        C10416cu.m31514c().mo67162a(new Runnable(lkVar, r) {
            public final /* synthetic */ C10730lk f$1;
            public final /* synthetic */ Object f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C10410cp.m31499a(C10410cp.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m31499a(C10410cp cpVar, C10730lk lkVar, Object obj) {
        C10765mq.m32773b(cpVar, "this$0");
        C10765mq.m32773b(lkVar, "$consumer");
        if (!cpVar.f26349c) {
            lkVar.mo66961a(obj);
        }
    }
}
