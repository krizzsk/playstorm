package com.ogury.p376ed.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ogury.ed.internal.jg */
public final class C10658jg implements C10656je {

    /* renamed from: a */
    private final C10510ez f26900a;

    public C10658jg(C10510ez ezVar) {
        C10765mq.m32773b(ezVar, "androidDevice");
        this.f26900a = ezVar;
    }

    /* renamed from: com.ogury.ed.internal.jg$a */
    static final class C10659a extends C10766mr implements C10729lj<C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10658jg f26901a;

        /* renamed from: b */
        final /* synthetic */ C10580hb f26902b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10659a(C10658jg jgVar, C10580hb hbVar) {
            super(0);
            this.f26901a = jgVar;
            this.f26902b = hbVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m32575b();
            return C10684ke.f26938a;
        }

        /* renamed from: b */
        private void m32575b() {
            this.f26901a.m32573b(this.f26902b);
        }
    }

    /* renamed from: a */
    public final void mo67681a(C10580hb hbVar) {
        C10765mq.m32773b(hbVar, "mraidCommandExecutor");
        C10566gr.m32106a(hbVar.mo67518a(), new C10659a(this, hbVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m32573b(C10580hb hbVar) {
        C10660jh a = hbVar.mo67518a();
        int a2 = C10556gi.m32086a(a.getWidth());
        int a3 = C10556gi.m32086a(a.getHeight());
        ViewParent parent = a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = a;
        }
        int a4 = C10556gi.m32085a(viewGroup.getX());
        int a5 = C10556gi.m32085a(viewGroup.getY());
        Rect a6 = this.f26900a.mo67337a((View) hbVar.mo67518a());
        hbVar.mo67529b(C10556gi.m32086a(a6.width()), C10556gi.m32086a(a6.height()));
        hbVar.mo67521a(a2, a3, a4, a5);
    }
}
