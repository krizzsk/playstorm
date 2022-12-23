package com.ogury.p376ed.internal;

import android.widget.FrameLayout;
import com.ogury.p376ed.internal.C10595ho;
import p394io.presage.mraid.browser.ShortcutActivity;

/* renamed from: com.ogury.ed.internal.hr */
public final class C10601hr {

    /* renamed from: a */
    public static final C10602a f26750a = new C10602a((byte) 0);

    /* renamed from: b */
    private final C10606hu f26751b;

    /* renamed from: c */
    private final ShortcutActivity f26752c;

    /* renamed from: d */
    private final C10643iv f26753d;

    /* renamed from: e */
    private final C10610hw f26754e;

    /* renamed from: f */
    private final C10595ho.C10596a f26755f;

    /* renamed from: g */
    private C10595ho f26756g;

    private C10601hr(C10606hu huVar, ShortcutActivity shortcutActivity, C10643iv ivVar, C10610hw hwVar, C10595ho.C10596a aVar) {
        C10765mq.m32773b(huVar, "shortcutPrefs");
        C10765mq.m32773b(shortcutActivity, "activity");
        C10765mq.m32773b(ivVar, "foregroundHandlerFactory");
        C10765mq.m32773b(hwVar, "webViewArgsParser");
        C10765mq.m32773b(aVar, "browserFactory");
        this.f26751b = huVar;
        this.f26752c = shortcutActivity;
        this.f26753d = ivVar;
        this.f26754e = hwVar;
        this.f26755f = aVar;
    }

    public /* synthetic */ C10601hr(C10606hu huVar, ShortcutActivity shortcutActivity, C10643iv ivVar) {
        this(huVar, shortcutActivity, ivVar, C10610hw.f26779a, C10595ho.f26725a);
    }

    /* renamed from: com.ogury.ed.internal.hr$a */
    public static final class C10602a {
        public /* synthetic */ C10602a(byte b) {
            this();
        }

        private C10602a() {
        }

        /* renamed from: a */
        public static C10601hr m32280a(C10606hu huVar, ShortcutActivity shortcutActivity, C10643iv ivVar) {
            C10765mq.m32773b(huVar, "shortcutPrefs");
            C10765mq.m32773b(shortcutActivity, "activity");
            C10765mq.m32773b(ivVar, "foregroundHandlerFactory");
            return new C10601hr(huVar, shortcutActivity, ivVar);
        }
    }

    /* renamed from: a */
    public final boolean mo67571a(String str, String str2, FrameLayout frameLayout) {
        C10608hv a;
        C10765mq.m32773b(str, "intentArgs");
        C10765mq.m32773b(str2, "shortcutId");
        C10765mq.m32773b(frameLayout, TtmlNode.RUBY_CONTAINER);
        String b = this.f26751b.mo67575b(str2);
        if (b.length() > 0) {
            str = b;
        }
        if ((str.length() == 0) || (a = C10610hw.m32322a(str)) == null) {
            return false;
        }
        if (!this.f26751b.mo67574a(a.mo67585c()) && !this.f26751b.mo67576c(a.mo67585c())) {
            return false;
        }
        m32277a(frameLayout, a);
        return true;
    }

    /* renamed from: a */
    private final void m32277a(FrameLayout frameLayout, C10608hv hvVar) {
        C10483eb ebVar = new C10483eb();
        ebVar.mo67240h("http://ogury.io");
        C10595ho a = C10595ho.C10596a.m32254a(this.f26752c, ebVar, frameLayout, this.f26753d);
        this.f26756g = a;
        if (a != null) {
            a.mo67548a(hvVar);
        }
    }

    /* renamed from: a */
    public final void mo67570a() {
        C10595ho hoVar = this.f26756g;
        if (hoVar != null) {
            hoVar.mo67558d();
        }
    }
}
