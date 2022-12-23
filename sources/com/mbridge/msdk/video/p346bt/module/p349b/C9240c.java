package com.mbridge.msdk.video.p346bt.module.p349b;

import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.p346bt.module.p348a.C9237b;
import com.mbridge.msdk.videocommon.p371b.C9541c;

/* renamed from: com.mbridge.msdk.video.bt.module.b.c */
/* compiled from: H5ShowRewardListener */
public final class C9240c extends C9239b {

    /* renamed from: a */
    private C9237b f22383a;

    /* renamed from: b */
    private String f22384b;

    public C9240c(C9237b bVar, String str) {
        this.f22383a = bVar;
        this.f22384b = str;
    }

    /* renamed from: a */
    public final void mo60930a() {
        if (this.f22383a != null) {
            C8608u.m24880a("H5ShowRewardListener", "onAdShow");
            this.f22383a.mo62282a(this.f22384b);
        }
    }

    /* renamed from: a */
    public final void mo60935a(boolean z, C9541c cVar) {
        if (this.f22383a != null) {
            C8608u.m24880a("H5ShowRewardListener", "onAdClose");
            this.f22383a.mo62286a(this.f22384b, z, cVar);
        }
    }

    /* renamed from: a */
    public final void mo60932a(String str) {
        if (this.f22383a != null) {
            C8608u.m24880a("H5ShowRewardListener", "onShowFail");
            this.f22383a.mo62284a(this.f22384b, str);
        }
    }

    /* renamed from: a */
    public final void mo60936a(boolean z, String str, String str2) {
        if (this.f22383a != null) {
            C8608u.m24880a("H5ShowRewardListener", "onVideoAdClicked");
            this.f22383a.mo62285a(this.f22384b, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo60933a(String str, String str2) {
        if (this.f22383a != null) {
            C8608u.m24880a("H5ShowRewardListener", "onVideoComplete");
            this.f22383a.mo62288b(this.f22384b, str, str2);
        }
    }

    /* renamed from: b */
    public final void mo60937b(String str, String str2) {
        if (this.f22383a != null) {
            C8608u.m24880a("H5ShowRewardListener", "onEndcardShow");
            this.f22383a.mo62289c(this.f22384b, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo60931a(int i, String str, String str2) {
        if (this.f22383a != null) {
            C8608u.m24880a("H5ShowRewardListener", "onAutoLoad");
            this.f22383a.mo62283a(this.f22384b, i, str, str2);
        }
    }
}
