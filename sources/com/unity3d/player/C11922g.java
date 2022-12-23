package com.unity3d.player;

import android.util.Log;
import com.adcolony.sdk.AdColonyAppOptions;

/* renamed from: com.unity3d.player.g */
final class C11922g {

    /* renamed from: a */
    protected static boolean f29203a = false;

    protected static void Log(int i, String str) {
        if (!f29203a) {
            if (i == 6) {
                Log.e(AdColonyAppOptions.UNITY, str);
            }
            if (i == 5) {
                Log.w(AdColonyAppOptions.UNITY, str);
            }
        }
    }
}
