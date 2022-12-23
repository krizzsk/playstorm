package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.inmobi.media.ib */
/* compiled from: DeviceInfo */
public class C6251ib {
    /* renamed from: c */
    private static String m18653c() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Context c = C6227ho.m18551c();
        if (c == null || !C6240hw.m18620a(c, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) c.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 0) {
                return type + "|" + subtype;
            } else if (type != 1) {
                return Integer.toString(type);
            }
        } else {
            NetworkCapabilities networkCapabilities = null;
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
            if (networkCapabilities == null) {
                return "";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "0|" + activeNetworkInfo.getSubtype();
            } else if (!networkCapabilities.hasTransport(1)) {
                if (networkCapabilities.hasTransport(2)) {
                    return "7";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "9";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "17";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "10";
                }
                return networkCapabilities.hasTransport(6) ? "11" : "8";
            }
        }
        return "1";
    }

    /* renamed from: a */
    public static String m18649a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
    }

    /* renamed from: a */
    public static Map<String, String> m18650a(boolean z) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("os-v", Build.VERSION.RELEASE);
            hashMap.put("d-brand-name", Build.BRAND);
            hashMap.put("d-manufacturer-name", Build.MANUFACTURER);
            hashMap.put("d-model-name", Build.MODEL);
            hashMap.put("d-nettype-raw", m18653c());
            hashMap.put("d-localization", Locale.getDefault().toString());
            hashMap.put("d-language", Locale.getDefault().getLanguage());
            hashMap.put("d-media-volume", String.valueOf(m18648a(C6227ho.m18551c(), z)));
        } catch (Exception unused) {
            C6251ib.class.getSimpleName();
        }
        return hashMap;
    }

    /* renamed from: a */
    public static int m18647a() {
        String c = m18653c();
        if (c.startsWith("0")) {
            return 0;
        }
        return c.startsWith("1") ? 1 : 2;
    }

    /* renamed from: b */
    public static String m18652b() {
        int a = m18647a();
        if (a != 0) {
            return a != 1 ? "NIL" : TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
        }
        return "carrier";
    }

    /* renamed from: b */
    public static int m18651b(Context context) {
        return ((AudioManager) context.getSystemService("audio")).getStreamVolume(3);
    }

    /* renamed from: a */
    public static int m18648a(Context context, boolean z) {
        if (context == null || z) {
            return 0;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume != 0) {
            return (streamVolume * 100) / streamMaxVolume;
        }
        C6251ib.class.getSimpleName();
        return 0;
    }
}
