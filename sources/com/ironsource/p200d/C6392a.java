package com.ironsource.p200d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C6399a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.tapjoy.TapjoyConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.d.a */
public class C6392a {

    /* renamed from: a */
    private boolean f16238a = true;

    /* renamed from: b */
    private IronSourceError f16239b = null;

    /* renamed from: a */
    public static String m19175a(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? m19176a(m19178b(context), context) : m19181d(context);
    }

    /* renamed from: a */
    public static String m19176a(Network network, Context context) {
        String str;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return m19181d(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    str = TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                } else if (!networkCapabilities.hasTransport(0)) {
                    return m19181d(context);
                } else {
                    str = "3g";
                }
            } else {
                str = m19181d(context);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    /* renamed from: a */
    public static JSONObject m19177a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (!(connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null)) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", m19180c(context));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static Network m19178b(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 23 && connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m19179b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (!(Build.VERSION.SDK_INT < 23 || network == null || context == null)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "ethernet";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "wifiAware";
                }
                if (networkCapabilities.hasTransport(6)) {
                    return "lowpan";
                }
                if (networkCapabilities.hasTransport(2)) {
                    return "bluetooth";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: c */
    public static boolean m19180c(Context context) {
        return m19179b(context, m19178b(context)).equals("vpn");
    }

    /* renamed from: d */
    private static String m19181d(Context context) {
        String a = C6399a.C64001.m19212a(context);
        return TextUtils.isEmpty(a) ? "none" : a;
    }

    /* renamed from: a */
    public void mo35874a(IronSourceError ironSourceError) {
        this.f16238a = false;
        this.f16239b = ironSourceError;
    }

    /* renamed from: a */
    public boolean mo35875a() {
        return this.f16238a;
    }

    /* renamed from: b */
    public IronSourceError mo35876b() {
        return this.f16239b;
    }

    public String toString() {
        StringBuilder sb;
        if (mo35875a()) {
            sb = new StringBuilder("valid:");
            sb.append(this.f16238a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.f16238a);
            sb.append(", IronSourceError:");
            sb.append(this.f16239b);
        }
        return sb.toString();
    }
}
