package com.ogury.p376ed.internal;

import android.app.Activity;

/* renamed from: com.ogury.ed.internal.ca */
public final class C10389ca {

    /* renamed from: a */
    public static final C10390a f26316a = new C10390a((byte) 0);

    /* renamed from: b */
    private final C10391cb f26317b;

    /* renamed from: com.ogury.ed.internal.ca$a */
    public static final class C10390a {
        public /* synthetic */ C10390a(byte b) {
            this();
        }

        private C10390a() {
        }

        /* renamed from: a */
        public static C10389ca m31452a(Activity activity) {
            C10765mq.m32773b(activity, "activity");
            return new C10389ca(new C10391cb(activity));
        }
    }

    public C10389ca(C10391cb cbVar) {
        C10765mq.m32773b(cbVar, "overlayScreenArea");
        this.f26317b = cbVar;
    }

    /* renamed from: a */
    public final int mo67144a(C10387bz bzVar, C10502et etVar) {
        C10765mq.m32773b(bzVar, "overlayPosition");
        C10765mq.m32773b(etVar, "overlayAdResponse");
        if (C10509ey.m31856a(bzVar.mo67138a())) {
            return bzVar.mo67139b();
        }
        return C10556gi.m32086a((this.f26317b.mo67146a() - C10556gi.m32087b(bzVar.mo67139b())) - etVar.mo67319b());
    }

    /* renamed from: b */
    public final int mo67145b(C10387bz bzVar, C10502et etVar) {
        C10765mq.m32773b(bzVar, "overlayPosition");
        C10765mq.m32773b(etVar, "overlayAdResponse");
        if (C10509ey.m31857b(bzVar.mo67138a())) {
            return bzVar.mo67140c();
        }
        return C10556gi.m32086a((this.f26317b.mo67147b() - C10556gi.m32087b(bzVar.mo67140c())) - etVar.mo67321c());
    }
}
