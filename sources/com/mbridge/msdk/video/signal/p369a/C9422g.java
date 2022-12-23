package com.mbridge.msdk.video.signal.p369a;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.signal.C9532i;

/* renamed from: com.mbridge.msdk.video.signal.a.g */
/* compiled from: DefaultJSVideoModule */
public class C9422g implements C9532i {
    public int getBorderViewHeight() {
        return 0;
    }

    public int getBorderViewLeft() {
        return 0;
    }

    public int getBorderViewRadius() {
        return 0;
    }

    public int getBorderViewTop() {
        return 0;
    }

    public int getBorderViewWidth() {
        return 0;
    }

    public boolean isH5Canvas() {
        return false;
    }

    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C8608u.m24880a("js", "showVideoLocation:marginTop=" + i + ",marginLeft=" + i2 + ",width=" + i3 + ",height=" + i4 + ",radius=" + i5 + ",borderTop=" + i6 + ",borderTop=" + i6 + ",borderLeft=" + i7 + ",borderWidth=" + i8 + ",borderHeight=" + i9);
    }

    public void soundOperate(int i, int i2) {
        C8608u.m24880a("js", "soundOperate:mute=" + i + ",soundViewVisible=" + i2);
    }

    public void soundOperate(int i, int i2, String str) {
        C8608u.m24880a("js", "soundOperate:mute=" + i + ",soundViewVisible=" + i2 + ",pt=" + str);
    }

    public void videoOperate(int i) {
        C8608u.m24880a("js", "videoOperate:" + i);
    }

    public void closeVideoOperate(int i, int i2) {
        C8608u.m24880a("js", "closeOperte:close=" + i + "closeViewVisible=" + i2);
    }

    public void progressOperate(int i, int i2) {
        C8608u.m24880a("js", "progressOperate:progress=" + i + "progressViewVisible=" + i2);
    }

    public void progressBarOperate(int i) {
        C8608u.m24880a("js", "progressBarOperate:progressViewVisible=" + i);
    }

    public String getCurrentProgress() {
        C8608u.m24880a("js", "getCurrentProgress");
        return JsonUtils.EMPTY_JSON;
    }

    public void setScaleFitXY(int i) {
        C8608u.m24880a("js", "setScaleFitXY:" + i);
    }

    public void setVisible(int i) {
        C8608u.m24880a("js", "setVisible:" + i);
    }

    public void setCover(boolean z) {
        C8608u.m24880a("js", "setCover:" + z);
    }

    public void notifyCloseBtn(int i) {
        C8608u.m24880a("js", "notifyCloseBtn:" + i);
    }

    public void showIVRewardAlertView(String str) {
        C8608u.m24880a("js", "showAlertView:");
    }

    public void showAlertView() {
        C8608u.m24880a("js", "showAlertView:");
    }

    public void hideAlertView(int i) {
        C8608u.m24880a("js", "hideAlertView:");
    }

    public void alertWebViewShowed() {
        C8608u.m24880a("js", "alertWebViewShowed:");
    }

    public void dismissAllAlert() {
        C8608u.m24880a("js", "dismissAllAlert");
    }

    public void setMiniEndCardState(boolean z) {
        C8608u.m24880a("js", "setMiniEndCardState" + z);
    }
}
