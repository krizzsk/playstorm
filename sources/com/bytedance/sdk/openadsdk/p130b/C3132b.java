package com.bytedance.sdk.openadsdk.p130b;

import com.tapjoy.TJAdUnitConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.b.b */
/* compiled from: AdEventConstants */
public class C3132b {

    /* renamed from: a */
    public static final Set<String> f7382a = new HashSet(Arrays.asList(new String[]{"click", TJAdUnitConstants.String.BEACON_SHOW_PATH, "insight_log"}));

    /* renamed from: a */
    public static boolean m9038a(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
