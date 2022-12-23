package com.mbridge.msdk.video.signal.p369a;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.signal.C9531h;

/* renamed from: com.mbridge.msdk.video.signal.a.f */
/* compiled from: DefaultJSRewardVideoV1 */
public class C9421f implements C9531h {
    /* renamed from: a */
    public String mo62844a() {
        C8608u.m24880a("js", "getEndScreenInfo");
        return JsonUtils.EMPTY_JSON;
    }

    public void notifyCloseBtn(int i) {
        C8608u.m24880a("js", "notifyCloseBtn,state=" + i);
    }

    public void toggleCloseBtn(int i) {
        C8608u.m24880a("js", "toggleCloseBtn,state=" + i);
    }

    /* renamed from: a */
    public void mo62845a(String str) {
        C8608u.m24880a("js", "triggerCloseBtn,state=" + str);
    }

    /* renamed from: b */
    public void mo62846b(String str) {
        C8608u.m24880a("js", "setOrientation,landscape=" + str);
    }

    /* renamed from: c */
    public void mo62847c(String str) {
        C8608u.m24880a("js", "handlerPlayableException，msg=" + str);
    }
}
