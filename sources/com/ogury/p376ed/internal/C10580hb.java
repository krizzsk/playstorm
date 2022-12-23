package com.ogury.p376ed.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.ogury.ed.internal.hb */
public final class C10580hb {

    /* renamed from: a */
    public static final C10581a f26705a = new C10581a((byte) 0);

    /* renamed from: b */
    private final C10660jh f26706b;

    public C10580hb(C10660jh jhVar) {
        C10765mq.m32773b(jhVar, "webView");
        this.f26706b = jhVar;
    }

    /* renamed from: com.ogury.ed.internal.hb$a */
    public static final class C10581a {
        public /* synthetic */ C10581a(byte b) {
            this();
        }

        private C10581a() {
        }
    }

    /* renamed from: a */
    public final C10660jh mo67518a() {
        return this.f26706b;
    }

    /* renamed from: a */
    public final void mo67524a(String str, String str2) {
        C10765mq.m32773b(str, "command");
        C10765mq.m32773b(str2, "message");
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32183a(str, str2));
    }

    /* renamed from: a */
    public final void mo67519a(int i) {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32178a(i));
    }

    /* renamed from: b */
    public final void mo67528b() {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32177a());
    }

    /* renamed from: a */
    public final void mo67525a(String str, boolean z) {
        C10765mq.m32773b(str, "orientation");
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32184a(str, z));
    }

    /* renamed from: a */
    public final void mo67527a(boolean z, String str) {
        C10765mq.m32773b(str, "forceOrientation");
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32187a(z, str));
    }

    /* renamed from: a */
    public final void mo67520a(int i, int i2) {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32179a(i, i2));
    }

    /* renamed from: a */
    public final void mo67523a(String str) {
        C10765mq.m32773b(str, "placementType");
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32182a(str));
    }

    /* renamed from: a */
    public final void mo67526a(boolean z) {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32186a(z));
    }

    /* renamed from: b */
    public final void mo67529b(int i, int i2) {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32189b(i, i2));
    }

    /* renamed from: a */
    public final void mo67521a(int i, int i2, int i3, int i4) {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32180a(i, i2, i3, i4));
    }

    /* renamed from: b */
    public final void mo67530b(int i, int i2, int i3, int i4) {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32190b(i, i2, i3, i4));
    }

    /* renamed from: c */
    public final void mo67535c(int i, int i2, int i3, int i4) {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32195c(i, i2, i3, i4));
    }

    /* renamed from: c */
    public final void mo67534c(int i, int i2) {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32194c(i, i2));
    }

    /* renamed from: b */
    public final void mo67531b(String str) {
        C10765mq.m32773b(str, "state");
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32191b(str));
        this.f26706b.setAdState(str);
    }

    /* renamed from: b */
    public final void mo67532b(String str, String str2) {
        C10765mq.m32773b(str, TJAdUnitConstants.String.CALLBACK_ID);
        C10765mq.m32773b(str2, IronSourceConstants.EVENTS_RESULT);
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32192b(str, str2));
    }

    /* renamed from: a */
    public final void mo67522a(C10576gy gyVar) {
        C10765mq.m32773b(gyVar, "adExposure");
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32181a(gyVar));
        m32157b(gyVar);
    }

    /* renamed from: b */
    private final void m32157b(C10576gy gyVar) {
        if (gyVar.mo67517c() < 50.0f) {
            mo67526a(false);
        } else if (!this.f26706b.mo67689b()) {
            mo67526a(true);
        }
    }

    /* renamed from: c */
    public final void mo67533c() {
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32193c());
    }

    /* renamed from: c */
    public final void mo67536c(String str) {
        C10765mq.m32773b(str, "url");
        C10660jh jhVar = this.f26706b;
        C10582hc hcVar = C10582hc.f26707a;
        C10663jk.m32606a(jhVar, C10582hc.m32196c(str));
    }
}
