package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.C3267c;
import com.bytedance.sdk.openadsdk.component.p141f.C3281a;

public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void load(Context context, AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        adSlot.setDurationSlotType(3);
        C3267c.m9530a(context).mo18949a(adSlot, appOpenAdListener, i);
    }

    /* renamed from: a */
    public static void m8557a(Context context) {
        C3281a.m9587a(context);
    }
}
