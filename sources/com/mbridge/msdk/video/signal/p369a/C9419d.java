package com.mbridge.msdk.video.signal.p369a;

import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.signal.C9526e;
import com.mbridge.msdk.video.signal.C9530g;

/* renamed from: com.mbridge.msdk.video.signal.a.d */
/* compiled from: DefaultJSContainerModule */
public class C9419d implements C9526e, C9530g {
    public void configurationChanged(int i, int i2, int i3) {
    }

    public void showVideoClickView(int i) {
        C8608u.m24880a("js", "showVideoClickView:" + i);
    }

    public void showEndcard(int i) {
        C8608u.m24880a("js", "showEndcard,type=" + i);
    }

    public void showVideoEndCover() {
        C8608u.m24880a("js", "showVideoEndCover");
    }

    public boolean endCardShowing() {
        C8608u.m24880a("js", "endCardShowing");
        return true;
    }

    public boolean miniCardShowing() {
        C8608u.m24880a("js", "miniCardShowing");
        return false;
    }

    public void notifyCloseBtn(int i) {
        C8608u.m24880a("js", "notifyCloseBtn:state = " + i);
    }

    public void toggleCloseBtn(int i) {
        C8608u.m24880a("js", "toggleCloseBtn:state=" + i);
    }

    public void readyStatus(int i) {
        C8608u.m24880a("js", "readyStatus:isReady=" + i);
    }

    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        C8608u.m24880a("js", "showMiniCard top = " + i + " left = " + i2 + " width = " + i3 + " height = " + i4 + " radius = " + i5);
    }

    public void resizeMiniCard(int i, int i2, int i3) {
        C8608u.m24880a("js", "showMiniCard width = " + i + " height = " + i2 + " radius = " + i3);
    }

    public boolean showAlertWebView() {
        C8608u.m24880a("js", "showAlertWebView ,msg=");
        return false;
    }

    public void hideAlertWebview() {
        C8608u.m24880a("js", "hideAlertWebview ,msg=");
    }

    public void ivRewardAdsWithoutVideo(String str) {
        C8608u.m24880a("js", "ivRewardAdsWithoutVideo,params=");
    }
}
