package com.p374my.target;

import android.app.UiModeManager;
import android.content.Context;

/* renamed from: com.my.target.e5 */
public class C9678e5 extends C9736h5 {
    /* renamed from: a */
    public static boolean m27907a(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 3;
    }

    public void collectData(Context context) {
        addParam("isc", m27907a(context) ? "1" : null);
    }
}
