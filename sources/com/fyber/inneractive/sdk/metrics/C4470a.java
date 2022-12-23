package com.fyber.inneractive.sdk.metrics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.metrics.a */
public class C4470a {

    /* renamed from: a */
    public final String f11032a;

    public C4470a(String str) {
        this.f11032a = str;
    }

    /* renamed from: a */
    public static boolean m13823a(int i, int i2, JSONArray jSONArray, List<Long> list) {
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis((long) i);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= jSONArray.length()) {
                break;
            }
            long optLong = jSONArray.optLong(i3, 0);
            if (optLong <= currentTimeMillis) {
                z = false;
            }
            if (z) {
                i4++;
                list.add(Long.valueOf(optLong));
            }
            i3++;
        }
        if (i4 >= i2) {
            return true;
        }
        return false;
    }
}
