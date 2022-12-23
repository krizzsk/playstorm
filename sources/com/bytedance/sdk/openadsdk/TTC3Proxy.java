package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.reward.C3332d;
import com.bytedance.sdk.openadsdk.component.reward.C3343e;
import com.bytedance.sdk.openadsdk.component.reward.C3344f;
import com.bytedance.sdk.openadsdk.component.reward.C3357i;

public class TTC3Proxy {
    public static void verityPlayable(String str, int i, String str2, String str3, String str4) {
        C3343e.m9944a(str, i, str2, str3, str4);
    }

    public static void loadReward(Context context, AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        adSlot.setDurationSlotType(7);
        C3357i.m9973a(context).mo19219a(adSlot, (TTAdNative.RewardVideoAdListener) new C3344f(rewardVideoAdListener));
    }

    public static void loadFull(Context context, AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        adSlot.setDurationSlotType(8);
        C3332d.m9916a(context).mo19188a(adSlot, (TTAdNative.FullScreenVideoAdListener) new C3344f(fullScreenVideoAdListener));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0007 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8558a(android.content.Context r1) {
        /*
            com.bytedance.sdk.openadsdk.component.reward.i r0 = com.bytedance.sdk.openadsdk.component.reward.C3357i.m9973a((android.content.Context) r1)     // Catch:{ all -> 0x0007 }
            r0.mo19222b()     // Catch:{ all -> 0x0007 }
        L_0x0007:
            com.bytedance.sdk.openadsdk.component.reward.d r1 = com.bytedance.sdk.openadsdk.component.reward.C3332d.m9916a((android.content.Context) r1)     // Catch:{ all -> 0x000e }
            r1.mo19186a()     // Catch:{ all -> 0x000e }
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.TTC3Proxy.m8558a(android.content.Context):void");
    }
}
