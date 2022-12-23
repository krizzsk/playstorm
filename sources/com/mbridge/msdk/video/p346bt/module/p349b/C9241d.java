package com.mbridge.msdk.video.p346bt.module.p349b;

import android.content.Context;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import com.mbridge.msdk.videocommon.p373d.C9551c;

/* renamed from: com.mbridge.msdk.video.bt.module.b.d */
/* compiled from: ProxyShowRewardListener */
public final class C9241d extends C9239b {

    /* renamed from: a */
    private C9246h f22385a;

    /* renamed from: b */
    private C9551c f22386b;

    /* renamed from: c */
    private String f22387c;

    /* renamed from: d */
    private String f22388d;

    /* renamed from: e */
    private boolean f22389e;

    /* renamed from: f */
    private Context f22390f;

    /* renamed from: g */
    private boolean f22391g = false;

    /* renamed from: h */
    private boolean f22392h = false;

    /* renamed from: i */
    private boolean f22393i = false;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9241d(android.content.Context r4, boolean r5, com.mbridge.msdk.videocommon.p373d.C9551c r6, com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.video.p346bt.module.p349b.C9246h r8, java.lang.String r9, java.lang.String r10) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f22391g = r0
            r3.f22392h = r0
            r3.f22393i = r0
            r3.f22385a = r8
            r3.f22386b = r6
            r3.f22387c = r10
            r3.f22388d = r9
            r3.f22389e = r5
            r3.f22390f = r4
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r4 = r4.mo15793h()     // Catch:{ Exception -> 0x0071 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0071 }
            r8 = 0
            if (r5 != 0) goto L_0x0042
            com.mbridge.msdk.c.b r5 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x0071 }
            com.mbridge.msdk.c.a r4 = r5.mo15563b(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0038
            com.mbridge.msdk.c.b r4 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x0071 }
            com.mbridge.msdk.c.a r4 = r4.mo15562b()     // Catch:{ Exception -> 0x0071 }
        L_0x0038:
            if (r4 == 0) goto L_0x0042
            long r4 = r4.mo15436J()     // Catch:{ Exception -> 0x0071 }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            goto L_0x0043
        L_0x0042:
            r4 = r8
        L_0x0043:
            com.mbridge.msdk.videocommon.d.b r10 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ Exception -> 0x0071 }
            com.mbridge.msdk.videocommon.d.a r10 = r10.mo63129b()     // Catch:{ Exception -> 0x0071 }
            if (r10 == 0) goto L_0x0051
            long r8 = r10.mo63114d()     // Catch:{ Exception -> 0x0071 }
        L_0x0051:
            if (r7 == 0) goto L_0x0071
            boolean r4 = r7.isSpareOffer(r8, r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 == 0) goto L_0x006b
            r4 = 1
            r7.setSpareOfferFlag(r4)     // Catch:{ Exception -> 0x0071 }
            int r5 = r6.mo63186x()     // Catch:{ Exception -> 0x0071 }
            if (r5 != r4) goto L_0x0067
            r7.setCbt(r4)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0071
        L_0x0067:
            r7.setCbt(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0071
        L_0x006b:
            r7.setSpareOfferFlag(r0)     // Catch:{ Exception -> 0x0071 }
            r7.setCbt(r0)     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p346bt.module.p349b.C9241d.<init>(android.content.Context, boolean, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.video.bt.module.b.h, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo60930a() {
        super.mo60930a();
        C9246h hVar = this.f22385a;
        if (hVar != null && !this.f22391g) {
            this.f22391g = true;
            hVar.mo60930a();
            this.f22385a.mo60931a(2, this.f22388d, this.f22387c);
        }
    }

    /* renamed from: a */
    public final void mo60935a(boolean z, C9541c cVar) {
        super.mo60935a(z, cVar);
        C9246h hVar = this.f22385a;
        if (hVar != null && !this.f22393i) {
            this.f22393i = true;
            hVar.mo60931a(7, this.f22388d, this.f22387c);
            this.f22385a.mo60935a(z, cVar);
        }
    }

    /* renamed from: a */
    public final void mo60934a(boolean z, int i) {
        super.mo60934a(z, i);
        C9246h hVar = this.f22385a;
        if (hVar != null && !this.f22393i) {
            hVar.mo60934a(z, i);
        }
    }

    /* renamed from: a */
    public final void mo60932a(String str) {
        super.mo60932a(str);
        C9246h hVar = this.f22385a;
        if (hVar != null && !this.f22392h) {
            this.f22392h = true;
            hVar.mo60932a(str);
            this.f22385a.mo60931a(4, this.f22388d, this.f22387c);
        }
    }

    /* renamed from: a */
    public final void mo60936a(boolean z, String str, String str2) {
        super.mo60936a(z, str, str2);
        C9246h hVar = this.f22385a;
        if (hVar != null) {
            hVar.mo60936a(z, str, str2);
        }
    }

    /* renamed from: b */
    public final void mo60937b(String str, String str2) {
        super.mo60937b(str, str2);
        C9246h hVar = this.f22385a;
        if (hVar != null) {
            hVar.mo60937b(str, str2);
            this.f22385a.mo60931a(6, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo60933a(String str, String str2) {
        super.mo60933a(str, str2);
        C9246h hVar = this.f22385a;
        if (hVar != null) {
            hVar.mo60933a(str, str2);
            this.f22385a.mo60931a(5, str, str2);
        }
    }
}
