package com.fyber.inneractive.sdk.serverapi;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5368r;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.C5390z;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.serverapi.b */
public class C5300b implements C5301c {

    /* renamed from: d */
    public static final List<Integer> f14104d = Arrays.asList(new Integer[]{5});

    /* renamed from: e */
    public static final List<Integer> f14105e = Arrays.asList(new Integer[]{2, 5});

    /* renamed from: f */
    public static final List<String> f14106f = Arrays.asList(new String[]{"video/mp4", "video/webm", "video/3gpp", "application/x-mpegURL"});

    /* renamed from: a */
    public C4309s f14107a;

    /* renamed from: b */
    public Location f14108b = C5390z.C5391a.f14278a.mo26493a();

    /* renamed from: c */
    public String f14109c = C5348k.m16745j();

    public C5300b(C4309s sVar) {
        this.f14107a = sVar;
    }

    /* renamed from: a */
    public String mo26396a() {
        try {
            return ((TelephonyManager) C5350l.f14216a.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo26400b() {
        int i = C5348k.f14208c;
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* renamed from: c */
    public String mo26401c() {
        if (!mo26412n() || ((double) this.f14108b.getAccuracy()) == 0.0d) {
            return null;
        }
        return String.valueOf(this.f14108b.getAccuracy());
    }

    /* renamed from: d */
    public String mo26402d() {
        if (mo26412n()) {
            return String.valueOf(this.f14108b.getLatitude());
        }
        return null;
    }

    /* renamed from: e */
    public String mo26403e() {
        if (mo26412n()) {
            return String.valueOf(this.f14108b.getLongitude());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo26404f() {
        /*
            r9 = this;
            boolean r0 = r9.mo26412n()
            if (r0 == 0) goto L_0x005b
            android.location.Location r0 = r9.f14108b
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            r3 = 0
            r5 = 0
            if (r1 >= r2) goto L_0x002a
            long r1 = java.lang.System.currentTimeMillis()
            long r7 = r0.getTime()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            long r1 = r1 - r7
            double r0 = (double) r1
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x0041
        L_0x002a:
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()
            long r7 = r0.getElapsedRealtimeNanos()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            long r1 = r1 - r7
            double r0 = (double) r1
            r5 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
        L_0x0041:
            double r0 = r0 / r5
            goto L_0x0044
        L_0x0043:
            r0 = r3
        L_0x0044:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x005b
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r1 = 0
            r3[r1] = r0
            java.lang.String r0 = "%.2f"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            return r0
        L_0x005b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.serverapi.C5300b.mo26404f():java.lang.String");
    }

    /* renamed from: g */
    public String mo26405g() {
        if (mo26412n()) {
            Location location = this.f14108b;
            float f = 0.0f;
            if (Build.VERSION.SDK_INT >= 26) {
                f = location.getVerticalAccuracyMeters();
            }
            if (((double) f) != 0.0d) {
                return String.valueOf(f);
            }
        }
        return null;
    }

    /* renamed from: h */
    public String mo26406h() {
        String str = this.f14109c;
        if (str == null) {
            return "";
        }
        return str.substring(0, Math.min(3, str.length()));
    }

    /* renamed from: i */
    public String mo26407i() {
        String str = this.f14109c;
        if (str == null) {
            return "";
        }
        return str.substring(Math.min(3, str.length()));
    }

    /* renamed from: j */
    public String mo26408j() {
        return C5350l.f14216a.getPackageName();
    }

    /* renamed from: k */
    public String mo26409k() {
        try {
            return C5350l.f14216a.getPackageManager().getPackageInfo(C5350l.f14216a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    public int mo26410l() {
        return C5350l.m16765c(C5350l.m16767d());
    }

    /* renamed from: m */
    public int mo26411m() {
        return C5350l.m16765c(C5350l.m16769e());
    }

    /* renamed from: n */
    public boolean mo26412n() {
        return this.f14108b != null;
    }

    /* renamed from: o */
    public boolean mo26413o() {
        if ((!C5368r.m16780a()) || IAConfigManager.f10525J.f10553r) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo26398a(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('-');
        sb.append(APSAnalytics.OS_NAME);
        sb.append('-');
        sb.append("8.1.5");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo26399a(Map<String, String> map, String str) {
        String str2;
        HashMap<String, Integer> hashMap = C5298a.f14102a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str2 = "unity3d";
        } catch (Throwable unused) {
            str2 = "native";
        }
        map.put("frmn", str2);
        map.put("dsk_t", C5370s.m16786a(C5298a.m16657f()));
        map.put("dsk_a", C5370s.m16786a(C5298a.m16655d()));
        map.put("headset", m16666a(C5298a.m16664m()));
        map.put("is_muted", m16666a(C5298a.m16662k()));
        map.put("btry_c", m16666a(C5298a.m16661j()));
        map.put("btry_l", C5298a.m16651a());
        map.put("bt_con", m16666a(C5298a.m16659h()));
        map.put("tod", C5370s.m16786a(C5298a.m16656e()));
        map.put("apnm", m16666a(C5298a.m16658g()));
        map.put("dnd", m16666a(C5298a.m16663l()));
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        map.put("lng", iAConfigManager.f10551p);
        String a = iAConfigManager.f10559x.mo24283a(C5298a.m16649a(str), "LAST_DOMAIN_SHOWED");
        if (!TextUtils.isEmpty(a) && a.contains(",")) {
            a = a.split(",")[0];
        }
        map.put("ldomain", a);
        map.put("lbundle", iAConfigManager.f10559x.mo24283a(C5298a.m16649a(str), "LAST_APP_BUNDLE_ID"));
        String a2 = iAConfigManager.f10559x.mo24283a(C5298a.m16649a(str), "LAST_CLICKED");
        String str3 = "";
        if (TextUtils.equals(a2, "0")) {
            a2 = str3;
        }
        map.put("lclick", a2);
        String a3 = iAConfigManager.f10559x.mo24283a(C5298a.m16649a(str), "LAST_VAST_SKIPED");
        if (TextUtils.equals(a3, "0")) {
            a3 = str3;
        }
        map.put("v_lskip", a3);
        UnitDisplayType a4 = C5298a.m16649a(str);
        if (a4.isFullscreenUnit()) {
            str3 = iAConfigManager.f10559x.mo24283a(a4, "LAST_VAST_CLICKED_TYPE");
        }
        map.put("v_lclicktype", str3);
        map.put("sdur", C5370s.m16786a(C5298a.m16653b()));
        map.put(TapjoyConstants.TJC_TOKEN_PARAM_USER_ID, IAConfigManager.m13432e());
        map.put("low_power_mode", m16666a(C5298a.m16665n()));
        map.put("dark_mode", m16666a(C5298a.m16660i()));
        map.put("d_api", String.valueOf(Build.VERSION.SDK_INT));
    }

    /* renamed from: a */
    public static String m16666a(Boolean bool) {
        if (bool == null) {
            return "";
        }
        return bool.booleanValue() ? "1" : "0";
    }

    /* renamed from: a */
    public String mo26397a(Intent intent) {
        return C5298a.m16652a(((float) (intent.getIntExtra("level", -1) * 100)) / ((float) intent.getIntExtra("scale", -1)));
    }
}
