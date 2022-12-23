package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C2078k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.v */
public class C2092v {

    /* renamed from: a */
    private final C1959m f4100a;

    C2092v(final C1959m mVar) {
        this.f4100a = mVar;
        if (!mVar.mo14352e()) {
            m5045a("SDK Session Begin");
            mVar.mo14337aj().registerReceiver(new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    C2092v.this.m5045a("SDK Session End");
                    mVar.mo14337aj().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5045a(String str) {
        C2078k kVar = new C2078k();
        kVar.mo14712a().mo14718a(str).mo14712a();
        m5050f("AppLovinSdk", kVar.toString());
    }

    /* renamed from: a */
    private void m5046a(String str, String str2, boolean z) {
        int intValue;
        if (StringUtils.isValidString(str2) && (intValue = ((Integer) this.f4100a.mo14311a(C1857b.f3108al)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                String substring = str2.substring(i3, Math.min(length, i3 + intValue));
                if (z) {
                    Log.d(str, substring);
                } else {
                    mo14789b(str, substring);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m5047a() {
        List<AppLovinSdk> a = AppLovinSdk.m5781a();
        if (a.isEmpty()) {
            return false;
        }
        AppLovinSdk appLovinSdk = a.get(0);
        return appLovinSdk == null || m5048a(appLovinSdk.coreSdk);
    }

    /* renamed from: a */
    public static boolean m5048a(C1959m mVar) {
        return mVar != null && mVar.mo14296K().mo14069d();
    }

    /* renamed from: c */
    public static void m5049c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    /* renamed from: f */
    public static void m5050f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: g */
    public static void m5051g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: h */
    public static void m5052h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: i */
    public static void m5053i(String str, String str2) {
        m5049c(str, str2, (Throwable) null);
    }

    /* renamed from: j */
    private void m5054j(String str, String str2) {
    }

    /* renamed from: a */
    public void mo14787a(String str, String str2) {
        if (m5048a(this.f4100a)) {
            m5046a(str, str2, false);
        }
    }

    /* renamed from: a */
    public void mo14788a(String str, String str2, Throwable th) {
        if (m5048a(this.f4100a)) {
            String str3 = "[" + str + "] " + str2;
            Log.w("AppLovinSdk", str3, th);
            m5054j("WARN", str3);
        }
    }

    /* renamed from: b */
    public void mo14789b(String str, String str2) {
        if (m5048a(this.f4100a)) {
            String str3 = "[" + str + "] " + str2;
            Log.d("AppLovinSdk", str3);
            m5054j("DEBUG", str3);
        }
    }

    /* renamed from: b */
    public void mo14790b(String str, String str2, Throwable th) {
        if (m5048a(this.f4100a)) {
            String str3 = "[" + str + "] " + str2;
            Log.e("AppLovinSdk", str3, th);
            m5054j("ERROR", str3 + " : " + th);
        }
    }

    /* renamed from: c */
    public void mo14791c(String str, String str2) {
        if (m5048a(this.f4100a)) {
            String str3 = "[" + str + "] " + str2;
            Log.i("AppLovinSdk", str3);
            m5054j("INFO", str3);
        }
    }

    /* renamed from: d */
    public void mo14792d(String str, String str2) {
        mo14788a(str, str2, (Throwable) null);
    }

    /* renamed from: e */
    public void mo14793e(String str, String str2) {
        mo14790b(str, str2, (Throwable) null);
    }
}
