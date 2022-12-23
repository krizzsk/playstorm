package com.ogury.p376ed.internal;

import android.graphics.Rect;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.ogury.ed.internal.hc */
public final class C10582hc {

    /* renamed from: a */
    public static final C10582hc f26707a = new C10582hc();

    /* renamed from: a */
    public static String m32177a() {
        return "ogySdkMraidGateway.updateSupportFlags({sms: false, tel: false, calendar: false, storePicture: false, inlineVideo: false, vpaid: false, location: false})";
    }

    /* renamed from: b */
    public static String m32188b() {
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnCloseSystem\", {})";
    }

    /* renamed from: c */
    public static String m32193c() {
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnTouchEnd\", {})";
    }

    private C10582hc() {
    }

    /* renamed from: a */
    public static String m32183a(String str, String str2) {
        C10765mq.m32773b(str, "command");
        C10765mq.m32773b(str2, "message");
        return "ogySdkMraidGateway.callErrorListeners(\"" + str2 + "\", \"" + str + "\")";
    }

    /* renamed from: a */
    public static String m32178a(int i) {
        return "ogySdkMraidGateway.updateAudioVolume(" + i + ')';
    }

    /* renamed from: a */
    public static String m32184a(String str, boolean z) {
        C10765mq.m32773b(str, "orientation");
        return "ogySdkMraidGateway.updateCurrentAppOrientation({orientation: \"" + str + "\", locked: " + z + "})";
    }

    /* renamed from: a */
    public static String m32187a(boolean z, String str) {
        C10765mq.m32773b(str, "forceOrientation");
        return "ogySdkMraidGateway.updateOrientationProperties({allowOrientationChange: " + z + ", forceOrientation: \"" + str + "\"})";
    }

    /* renamed from: a */
    public static String m32179a(int i, int i2) {
        return "ogySdkMraidGateway.updateScreenSize({width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: a */
    public static String m32182a(String str) {
        C10765mq.m32773b(str, "placementType");
        return "ogySdkMraidGateway.updatePlacementType(\"" + str + "\")";
    }

    /* renamed from: a */
    public static String m32186a(boolean z) {
        return "ogySdkMraidGateway.updateViewability(" + z + ')';
    }

    /* renamed from: b */
    public static String m32189b(int i, int i2) {
        return "ogySdkMraidGateway.updateMaxSize({width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: a */
    public static String m32180a(int i, int i2, int i3, int i4) {
        return "ogySdkMraidGateway.updateDefaultPosition({x: " + i3 + ", y: " + i4 + ", width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: b */
    public static String m32190b(int i, int i2, int i3, int i4) {
        return "ogySdkMraidGateway.updateCurrentPosition({x: " + i3 + ", y: " + i4 + ", width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: c */
    public static String m32195c(int i, int i2, int i3, int i4) {
        return "ogySdkMraidGateway.updateResizeProperties({width: " + i + ", height: " + i2 + ", offsetX: " + i3 + ", offsetY: " + i4 + ", customClosePosition: \"right\", allowOffscreen: false})";
    }

    /* renamed from: c */
    public static String m32194c(int i, int i2) {
        return "ogySdkMraidGateway.updateExpandProperties({width: " + i + ", height: " + i2 + ", useCustomClose: false, isModal: true})";
    }

    /* renamed from: b */
    public static String m32191b(String str) {
        C10765mq.m32773b(str, "state");
        return "ogySdkMraidGateway.updateState(\"" + str + "\")";
    }

    /* renamed from: b */
    public static String m32192b(String str, String str2) {
        C10765mq.m32773b(str, TJAdUnitConstants.String.CALLBACK_ID);
        C10765mq.m32773b(str2, IronSourceConstants.EVENTS_RESULT);
        return "ogySdkMraidGateway.callPendingMethodCallback(\"" + str + "\", null, " + str2 + ')';
    }

    /* renamed from: a */
    public static String m32181a(C10576gy gyVar) {
        String str;
        C10765mq.m32773b(gyVar, "adExposure");
        StringBuilder sb = new StringBuilder();
        for (Rect next : gyVar.mo67516b()) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("{x: " + C10556gi.m32086a(next.left) + ", y: " + C10556gi.m32086a(next.top) + ", width: " + C10556gi.m32086a(next.width()) + ", height: " + C10556gi.m32086a(next.height()) + '}');
        }
        Rect a = gyVar.mo67512a();
        if (a != null) {
            str = "visibleRectangle: {x: " + C10556gi.m32086a(a.left) + ", y: " + C10556gi.m32086a(a.top) + ", width: " + C10556gi.m32086a(a.width()) + ", height: " + C10556gi.m32086a(a.height()) + '}';
        } else {
            str = "visibleRectangle: null";
        }
        return "ogySdkMraidGateway.updateExposure({exposedPercentage: " + gyVar.mo67517c() + ", " + str + ", occlusionRectangles: [" + sb + "]})";
    }

    /* renamed from: a */
    public static String m32185a(String str, boolean z, boolean z2, String str2, String str3, String str4) {
        C10765mq.m32773b(str, "event");
        C10765mq.m32773b(str2, "webViewId");
        C10765mq.m32773b(str3, "url");
        C10765mq.m32773b(str4, "pageTitle");
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnNavigation\", {event: \"" + str + "\", canGoBack: " + z2 + ", canGoForward: " + z + ", webviewId: \"" + str2 + "\", url: \"" + str3 + "\", \"pageTitle\": \"" + str4 + "\"})";
    }

    /* renamed from: c */
    public static String m32196c(String str) {
        C10765mq.m32773b(str, "url");
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnOpenedUrl\", {url: \"" + str + "\"})";
    }
}
