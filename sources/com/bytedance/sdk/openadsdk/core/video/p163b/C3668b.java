package com.bytedance.sdk.openadsdk.core.video.p163b;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.b.b */
/* compiled from: PlayableEvent */
public class C3668b {
    /* renamed from: a */
    public static void m11692a(Context context, C3498n nVar) {
        if (C3501p.m10761a(nVar)) {
            C3156e.m9202e(context, nVar, "playable_preload", "preload_start", (Map<String, Object>) null);
        }
    }

    /* renamed from: a */
    public static void m11694a(Context context, C3498n nVar, long j, long j2) {
        if (nVar == null) {
            return;
        }
        if (C3501p.m10769i(nVar) || C3501p.m10761a(nVar)) {
            HashMap hashMap = new HashMap();
            hashMap.put("loadzip_success_time", Long.valueOf(j));
            hashMap.put("unzip_success_time", Long.valueOf(j2));
            C3156e.m9202e(context, nVar, "playable_preload", "preload_success", (Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m11693a(Context context, C3498n nVar, int i, String str) {
        if (nVar == null) {
            return;
        }
        if (C3501p.m10769i(nVar) || C3501p.m10761a(nVar)) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", Integer.valueOf(i));
            hashMap.put("error_reason", str);
            C3156e.m9202e(context, nVar, "playable_preload", "preload_fail", (Map<String, Object>) hashMap);
        }
    }
}
