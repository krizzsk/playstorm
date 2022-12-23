package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: com.adcolony.sdk.r0 */
class C0950r0 {

    /* renamed from: a */
    private static int f721a;

    /* renamed from: b */
    private static HashMap<String, Integer> f722b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, Integer> f723c = new HashMap<>();

    /* renamed from: a */
    static boolean m947a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i != 0) {
            if (i != 1 || bundle == null) {
                return false;
            }
            String string = bundle.getString("zone_id");
            if (f722b.get(string) == null) {
                f722b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (f723c.get(string) == null) {
                f723c.put(string, 0);
            }
            if (currentTimeMillis - f722b.get(string).intValue() > 1) {
                f723c.put(string, 1);
                f722b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = f723c.get(string).intValue() + 1;
            f723c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else if (currentTimeMillis - f721a < 5) {
            return true;
        } else {
            f721a = currentTimeMillis;
            return false;
        }
    }
}
