package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.bytedance.sdk.component.utils.o */
/* compiled from: NetworkUtils */
public class C2979o {

    /* renamed from: a */
    private static C2980p f6747a;

    /* renamed from: a */
    public static boolean m8406a(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static int m8408b(Context context) {
        int c = m8409c(context);
        if (c == 1) {
            return 0;
        }
        if (c == 4) {
            return 1;
        }
        if (c == 5) {
            return 4;
        }
        if (c != 6) {
            return c;
        }
        return 6;
    }

    /* renamed from: c */
    public static int m8409c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (telephonyManager.getNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        if (f6747a == null || !f6747a.mo17898a(context, telephonyManager)) {
                            return 5;
                        }
                        return 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        if (TextUtils.isEmpty(subtypeName) || (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000"))) {
                            return 1;
                        }
                        return 3;
                }
            } else if (type != 1) {
                return 1;
            } else {
                return 4;
            }
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* renamed from: d */
    public static boolean m8410d(Context context) {
        return m8409c(context) == 4;
    }

    /* renamed from: e */
    public static boolean m8411e(Context context) {
        return m8409c(context) == 5;
    }

    /* renamed from: f */
    public static boolean m8412f(Context context) {
        return m8409c(context) == 6;
    }

    /* renamed from: g */
    public static String m8413g(Context context) {
        int c = m8409c(context);
        if (c == 2) {
            return "2g";
        }
        if (c == 3) {
            return "3g";
        }
        if (c == 4) {
            return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
        }
        if (c != 5) {
            return c != 6 ? TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE : "5g";
        }
        return "4g";
    }

    /* renamed from: a */
    public static boolean m8407a(String str) {
        return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
    }
}
