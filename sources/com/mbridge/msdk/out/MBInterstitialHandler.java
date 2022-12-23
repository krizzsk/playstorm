package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.interstitial.p318c.C8634a;
import java.util.Map;

public class MBInterstitialHandler {
    private C8634a mController;

    public MBInterstitialHandler(Context context, Map<String, Object> map) {
        if (this.mController == null) {
            this.mController = new C8634a();
        }
        if (map != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (!TextUtils.isEmpty(str)) {
                String d = C8613y.m24943d(str);
                if (!TextUtils.isEmpty(d)) {
                    C8613y.m24924a(str, d);
                }
            }
        }
        this.mController.mo57842a(context, map);
        if (C2350a.m5601e().mo15792g() == null && context != null) {
            C2350a.m5601e().mo15785b(context);
        }
    }

    public void preload() {
        try {
            if (this.mController != null) {
                this.mController.mo57840a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getRequestId() {
        C8634a aVar = this.mController;
        return aVar != null ? aVar.mo57843b() : "";
    }

    public void show() {
        try {
            this.mController.mo57844c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialListener(InterstitialListener interstitialListener) {
        try {
            if (this.mController != null) {
                this.mController.mo57841a(interstitialListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
