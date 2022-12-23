package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.C4310h;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.util.g */
public class C5334g {
    /* renamed from: a */
    public static boolean m16733a(UnitDisplayType unitDisplayType, C4310h hVar) {
        return !unitDisplayType.isFullscreenUnit() || hVar.mo24347a("use_fraud_detection_fullscreen", true);
    }
}
