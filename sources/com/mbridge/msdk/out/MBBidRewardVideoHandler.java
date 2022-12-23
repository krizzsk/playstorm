package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.reward.p341a.C9047a;
import com.mbridge.msdk.video.p346bt.module.p349b.C9238a;
import com.mbridge.msdk.video.p346bt.module.p349b.C9245g;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

public class MBBidRewardVideoHandler {
    private static final String TAG = "MBBidRewardVideoHandler";
    private C9047a controller;

    public MBBidRewardVideoHandler(Context context, String str, String str2) {
        if (C2350a.m5601e().mo15792g() == null && context != null) {
            C2350a.m5601e().mo15785b(context);
        }
        String d = C8613y.m24943d(str2);
        if (!TextUtils.isEmpty(d)) {
            C8613y.m24924a(str2, d);
        }
        initMBBidRewardVideoHandler(str, str2);
    }

    public MBBidRewardVideoHandler(String str, String str2) {
        String d = C8613y.m24943d(str2);
        if (!TextUtils.isEmpty(d)) {
            C8613y.m24924a(str2, d);
        }
        initMBBidRewardVideoHandler(str, str2);
    }

    private void initMBBidRewardVideoHandler(String str, String str2) {
        try {
            if (this.controller == null) {
                C9047a aVar = new C9047a();
                this.controller = aVar;
                aVar.mo60905a(false);
                this.controller.mo60909b(true);
            }
            this.controller.mo60908b(str, str2);
        } catch (Throwable th) {
            C8608u.m24881a(TAG, th.getMessage(), th);
        }
    }

    public void loadFromBid(String str) {
        C9047a aVar = this.controller;
        if (aVar != null) {
            aVar.mo60906a(true, str);
        }
    }

    public boolean isBidReady() {
        C9047a aVar = this.controller;
        if (aVar != null) {
            return aVar.mo60912e(false);
        }
        return false;
    }

    public String getRequestId() {
        C9047a aVar = this.controller;
        return aVar != null ? aVar.mo60899a() : "";
    }

    public void showFromBid() {
        C9047a aVar = this.controller;
        if (aVar != null) {
            aVar.mo60903a((String) null, (String) null, (String) null);
        }
    }

    public void showFromBid(String str) {
        C9047a aVar = this.controller;
        if (aVar != null) {
            aVar.mo60903a((String) null, str, (String) null);
        }
    }

    public void showFromBid(String str, String str2) {
        C9047a aVar = this.controller;
        if (aVar != null) {
            aVar.mo60903a((String) null, str, str2);
        }
    }

    public void setRewardVideoListener(C9245g gVar) {
        C9047a aVar = this.controller;
        if (aVar != null) {
            aVar.mo60902a((InterVideoOutListener) new C9238a(gVar));
        }
    }

    public void clearVideoCache() {
        try {
            if (this.controller != null) {
                C8602s.m24864a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playVideoMute(int i) {
        C9047a aVar = this.controller;
        if (aVar != null) {
            aVar.mo60900a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        C9047a aVar = this.controller;
        if (aVar != null) {
            aVar.mo60904a(str, str2, str3, str4);
        }
    }

    public void setRewardPlus(boolean z) {
        C9047a aVar = this.controller;
        if (aVar != null) {
            aVar.mo60910c(z);
        }
    }
}
