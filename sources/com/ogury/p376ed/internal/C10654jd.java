package com.ogury.p376ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.jd */
public final class C10654jd {

    /* renamed from: a */
    public static final C10655a f26893a = new C10655a((byte) 0);

    /* renamed from: b */
    private final C10656je f26894b;

    /* renamed from: c */
    private final C10656je f26895c;

    /* renamed from: d */
    private final C10656je f26896d;

    /* renamed from: e */
    private final C10656je f26897e;

    public /* synthetic */ C10654jd(C10656je jeVar, C10656je jeVar2, C10656je jeVar3, C10656je jeVar4, byte b) {
        this(jeVar, jeVar2, jeVar3, jeVar4);
    }

    private C10654jd(C10656je jeVar, C10656je jeVar2, C10656je jeVar3, C10656je jeVar4) {
        this.f26894b = jeVar;
        this.f26895c = jeVar2;
        this.f26896d = jeVar3;
        this.f26897e = jeVar4;
    }

    /* renamed from: com.ogury.ed.internal.jd$a */
    public static final class C10655a {
        public /* synthetic */ C10655a(byte b) {
            this();
        }

        private C10655a() {
        }

        /* renamed from: a */
        public static C10654jd m32568a(Context context, C10483eb ebVar) {
            C10765mq.m32773b(context, "context");
            C10765mq.m32773b(ebVar, "ad");
            C10510ez ezVar = new C10510ez(context);
            C10658jg jgVar = new C10658jg(ezVar);
            C10656je jfVar = new C10657jf(ezVar, C10485ed.m31752a(ebVar));
            return new C10654jd(jgVar, new C10653jc(ezVar, jfVar, ebVar), new C10652jb(), jfVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final void mo67682a(C10660jh jhVar) {
        C10765mq.m32773b(jhVar, "webView");
        this.f26894b.mo67681a(jhVar.getMraidCommandExecutor());
    }

    /* renamed from: b */
    public final void mo67683b(C10660jh jhVar) {
        C10765mq.m32773b(jhVar, "webView");
        this.f26895c.mo67681a(jhVar.getMraidCommandExecutor());
    }

    /* renamed from: c */
    public final void mo67684c(C10660jh jhVar) {
        C10765mq.m32773b(jhVar, "webView");
        this.f26896d.mo67681a(jhVar.getMraidCommandExecutor());
    }

    /* renamed from: d */
    public final void mo67685d(C10660jh jhVar) {
        C10765mq.m32773b(jhVar, "webView");
        this.f26897e.mo67681a(jhVar.getMraidCommandExecutor());
    }
}
