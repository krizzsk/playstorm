package com.mbridge.msdk.video.p346bt.module.p349b;

import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.videocommon.p371b.C9541c;

/* renamed from: com.mbridge.msdk.video.bt.module.b.b */
/* compiled from: DefaultShowRewardListener */
public class C9239b implements C9246h {
    /* renamed from: a */
    public void mo60930a() {
        C8608u.m24880a("ShowRewardListener", "onAdShow");
    }

    /* renamed from: a */
    public void mo60935a(boolean z, C9541c cVar) {
        C8608u.m24880a("ShowRewardListener", "onAdClose:isCompleteView:" + z + ",reward:" + cVar);
    }

    /* renamed from: a */
    public void mo60932a(String str) {
        C8608u.m24880a("ShowRewardListener", "onShowFail:" + str);
    }

    /* renamed from: a */
    public void mo60936a(boolean z, String str, String str2) {
        C8608u.m24880a("ShowRewardListener", "onVideoAdClicked:" + str2);
    }

    /* renamed from: a */
    public void mo60933a(String str, String str2) {
        C8608u.m24880a("ShowRewardListener", "onVideoComplete: " + str2);
    }

    /* renamed from: a */
    public void mo60934a(boolean z, int i) {
        C8608u.m24880a("ShowRewardListener", "onAdCloseWithIVReward: " + z + "  " + i);
    }

    /* renamed from: b */
    public void mo60937b(String str, String str2) {
        C8608u.m24880a("ShowRewardListener", "onEndcardShow: " + str2);
    }

    /* renamed from: a */
    public void mo60931a(int i, String str, String str2) {
        C8608u.m24880a("ShowRewardListener", "onAutoLoad: " + str2);
    }
}
