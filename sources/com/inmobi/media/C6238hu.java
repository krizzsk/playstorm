package com.inmobi.media;

import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdSdk;

/* renamed from: com.inmobi.media.hu */
/* compiled from: Logger */
public final class C6238hu {

    /* renamed from: a */
    private static byte f15799a;

    /* renamed from: a */
    public static void m18605a(byte b, String str, String str2) {
        if (b == 1) {
            byte b2 = f15799a;
            if (2 == b2 || 1 == b2 || 3 == b2) {
                Log.e("[InMobi]", str2);
            }
        } else if (b == 2) {
            byte b3 = f15799a;
            if (2 == b3 || 3 == b3) {
                Log.d("[InMobi]", str2);
            }
        } else if (b == 3) {
            if (str2.length() > 4000) {
                while (str2.length() > 4000) {
                    Log.d(str, str2.substring(0, TTAdSdk.INIT_LOCAL_FAIL_CODE));
                    str2 = str2.substring(TTAdSdk.INIT_LOCAL_FAIL_CODE);
                }
                Log.d(str, str2);
                return;
            }
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m18607a(String str, String str2) {
        m18605a((byte) 3, str, str2);
    }

    /* renamed from: a */
    public static void m18608a(String str, String str2, Throwable th) {
        m18606a((byte) 3, str, str2, th);
    }

    /* renamed from: a */
    public static void m18606a(byte b, String str, String str2, Throwable th) {
        if (b == 1) {
            byte b2 = f15799a;
            if (2 == b2 || 1 == b2 || 3 == b2) {
                Log.e("[InMobi]", str2, th);
            }
        } else if (b == 2) {
            byte b3 = f15799a;
            if (2 == b3 || 3 == b3) {
                Log.d("[InMobi]", str2, th);
            }
        } else if (b == 3) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m18604a(byte b) {
        f15799a = b;
    }
}
