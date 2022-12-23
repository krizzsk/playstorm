package com.google.android.gms.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.smaato.sdk.core.dns.DnsName;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzee.zzf().zzk(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzee.zzf().zze();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzee.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzee.zzf();
        String[] split = TextUtils.split("21.0.0", DnsName.ESCAPED_DOT);
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @Deprecated
    public static String getVersionString() {
        return zzee.zzf().zzg();
    }

    public static void initialize(Context context) {
        zzee.zzf().zzl(context, (String) null, (OnInitializationCompleteListener) null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzee.zzf().zzp(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzee.zzf().zzq(context, str);
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzee.zzf().zzr(cls);
    }

    public static void registerWebView(WebView webView) {
        zzee.zzf().zzs(webView);
    }

    public static void setAppMuted(boolean z) {
        zzee.zzf().zzt(z);
    }

    public static void setAppVolume(float f) {
        zzee.zzf().zzu(f);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzee.zzf().zzv(requestConfiguration);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzee.zzf().zzl(context, (String) null, onInitializationCompleteListener);
    }
}
