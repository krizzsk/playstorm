package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.interstitialvideo.p320a.C8659a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.reward.p341a.C9047a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

public class MBInterstitialVideoHandler {

    /* renamed from: a */
    private C9047a f20956a;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (C2350a.m5601e().mo15792g() == null && context != null) {
            C2350a.m5601e().mo15785b(context);
        }
        String d = C8613y.m24943d(str2);
        if (!TextUtils.isEmpty(d)) {
            C8613y.m24924a(str2, d);
        }
        m25088a(str, str2);
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        m25088a(str, str2);
    }

    /* renamed from: a */
    private void m25088a(String str, String str2) {
        try {
            if (this.f20956a == null) {
                C9047a aVar = new C9047a();
                this.f20956a = aVar;
                aVar.mo60905a(true);
            }
            this.f20956a.mo60908b(str, str2);
            C2283b.m5275a().mo15570e(str2);
        } catch (Throwable th) {
            C8608u.m24881a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    public String getRequestId() {
        C9047a aVar = this.f20956a;
        return aVar != null ? aVar.mo60899a() : "";
    }

    public void load() {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            aVar.mo60911d(true);
        }
    }

    public void loadFormSelfFilling() {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            aVar.mo60911d(false);
        }
    }

    public boolean isReady() {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            return aVar.mo60912e(true);
        }
        return false;
    }

    public void show() {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            aVar.mo60903a((String) null, (String) null, (String) null);
        }
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            aVar.mo60902a((InterVideoOutListener) new C8659a(interstitialVideoListener));
        }
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            aVar.mo60902a((InterVideoOutListener) new C8659a(interstitialVideoListener));
        }
    }

    public void clearVideoCache() {
        try {
            if (this.f20956a != null) {
                C8602s.m24864a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playVideoMute(int i) {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            aVar.mo60900a(i);
        }
    }

    public void setIVRewardEnable(int i, int i2) {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            aVar.mo60901a(i, C8413a.f20335q, i2);
        }
    }

    public void setIVRewardEnable(int i, double d) {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            aVar.mo60901a(i, C8413a.f20334p, (int) (d * 100.0d));
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        C9047a aVar = this.f20956a;
        if (aVar != null) {
            aVar.mo60904a(str, str2, str3, str4);
        }
    }
}
