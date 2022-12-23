package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeex implements zzbxo {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzfiq zzf(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.zzfiq r4 = com.google.android.gms.internal.ads.zzfiq.zzd
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.zzfiq r4 = com.google.android.gms.internal.ads.zzfiq.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.zzfiq r4 = com.google.android.gms.internal.ads.zzfiq.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeex.zzf(java.lang.String):com.google.android.gms.internal.ads.zzfiq");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzfis zzg(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r3
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.zzfis r4 = com.google.android.gms.internal.ads.zzfis.UNSPECIFIED
            return r4
        L_0x003e:
            com.google.android.gms.internal.ads.zzfis r4 = com.google.android.gms.internal.ads.zzfis.ONE_PIXEL
            return r4
        L_0x0041:
            com.google.android.gms.internal.ads.zzfis r4 = com.google.android.gms.internal.ads.zzfis.DEFINED_BY_JAVASCRIPT
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.zzfis r4 = com.google.android.gms.internal.ads.zzfis.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeex.zzg(java.lang.String):com.google.android.gms.internal.ads.zzfis");
    }

    private static zzfit zzh(String str) {
        if ("native".equals(str)) {
            return zzfit.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfit.JAVASCRIPT;
        }
        return zzfit.NONE;
    }

    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, zzbxq zzbxq, zzbxp zzbxp, String str5) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzea)).booleanValue() || !zzfij.zzb()) {
            return null;
        }
        zzfiu zza = zzfiu.zza("Google", str);
        zzfit zzh = zzh("javascript");
        zzfiq zzf = zzf(zzbxp.toString());
        if (zzh == zzfit.NONE) {
            zze.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzf == null) {
            zze.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzbxp))));
            return null;
        } else {
            zzfit zzh2 = zzh(str4);
            if (zzf == zzfiq.zzd && zzh2 == zzfit.NONE) {
                zze.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
            return ObjectWrapper.wrap(zzfil.zza(zzfim.zza(zzf, zzg(zzbxq.toString()), zzh, zzh2, true), zzfin.zzb(zza, webView, str5, "")));
        }
    }

    public final IObjectWrapper zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzbxq zzbxq, zzbxp zzbxp, String str6) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzea)).booleanValue() || !zzfij.zzb()) {
            return null;
        }
        zzfiu zza = zzfiu.zza(str5, str);
        zzfit zzh = zzh("javascript");
        zzfit zzh2 = zzh(str4);
        zzfiq zzf = zzf(zzbxp.toString());
        if (zzh == zzfit.NONE) {
            zze.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzf == null) {
            zze.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzbxp))));
            return null;
        } else if (zzf == zzfiq.zzd && zzh2 == zzfit.NONE) {
            zze.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        } else {
            return ObjectWrapper.wrap(zzfil.zza(zzfim.zza(zzf, zzg(zzbxq.toString()), zzh, zzh2, true), zzfin.zzc(zza, webView, str6, "")));
        }
    }

    public final void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzea)).booleanValue() && zzfij.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfil) {
                ((zzfil) unwrap).zzd(view);
            }
        }
    }

    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzea)).booleanValue() && zzfij.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfil) {
                ((zzfil) unwrap).zze();
            }
        }
    }

    public final boolean zze(Context context) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzea)).booleanValue()) {
            zze.zzj("Omid flag is disabled");
            return false;
        } else if (zzfij.zzb()) {
            return true;
        } else {
            zzfij.zza(context);
            return zzfij.zzb();
        }
    }
}
