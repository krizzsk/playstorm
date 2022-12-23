package com.applovin.impl.mediation.p032d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.d.c */
public class C1645c {

    /* renamed from: a */
    private static final TreeMap<String, String> f2298a;

    /* renamed from: b */
    private static final List<String> f2299b = new ArrayList(f2298a.keySet());

    /* renamed from: c */
    private static JSONArray f2300c;

    /* renamed from: d */
    private static final Object f2301d = new Object();

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f2298a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        f2298a.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        f2298a.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        f2298a.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        f2298a.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        f2298a.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        f2298a.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        f2298a.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        f2298a.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        f2298a.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        f2298a.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        f2298a.put("com.applovin.mediation.adapters.GoogleMediationAdapter", AdColonyAppOptions.ADMOB);
        f2298a.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        f2298a.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        f2298a.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        f2298a.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", AdColonyAppOptions.FYBER);
        f2298a.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", AdColonyAppOptions.IRONSOURCE);
        f2298a.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        f2298a.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        f2298a.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        f2298a.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        f2298a.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        f2298a.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        f2298a.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        f2298a.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        f2298a.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        f2298a.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        f2298a.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        f2298a.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        f2298a.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        f2298a.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        f2298a.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        f2298a.put("com.applovin.mediation.adapters.VungleMediationAdapter", BuildConfig.OMSDK_PARTNER_NAME);
        f2298a.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
    }

    /* renamed from: a */
    public static C1908o.C1910a m3312a(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.INTERSTITIAL ? C1908o.C1910a.MEDIATION_INTERSTITIAL : maxAdFormat == MaxAdFormat.REWARDED ? C1908o.C1910a.MEDIATION_INCENTIVIZED : maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL ? C1908o.C1910a.MEDIATION_REWARDED_INTERSTITIAL : C1908o.C1910a.MEDIATION_BANNER;
    }

    /* renamed from: a */
    public static AppLovinSdkUtils.Size m3313a(int i, MaxAdFormat maxAdFormat, Context context) {
        if (i < 0) {
            try {
                Display defaultDisplay = (context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = AppLovinSdkUtils.pxToDp(context, displayMetrics.widthPixels);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
        Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", new Class[]{Context.class, Integer.TYPE});
        Method method2 = cls.getMethod("getWidth", new Class[0]);
        Method method3 = cls.getMethod("getHeight", new Class[0]);
        Object invoke = method.invoke((Object) null, new Object[]{context, Integer.valueOf(i)});
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, new Object[0])).intValue(), ((Integer) method3.invoke(invoke, new Object[0])).intValue());
    }

    /* renamed from: a */
    public static JSONArray m3314a(C1959m mVar) {
        if (f2300c != null) {
            m3318b(mVar);
            return f2300c;
        }
        f2300c = new JSONArray();
        for (String next : f2299b) {
            MaxAdapter b = m3317b(next, mVar);
            if (b != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", f2298a.get(next));
                    jSONObject.put("class", next);
                    jSONObject.put("sdk_version", b.getSdkVersion());
                    jSONObject.put("version", b.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (f2301d) {
                    f2300c.put(jSONObject);
                }
            }
        }
        return f2300c;
    }

    /* renamed from: a */
    public static JSONObject m3315a(String str, C1959m mVar) {
        JSONArray a = m3314a(mVar);
        for (int i = 0; i < a.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(a, i, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, "class", (String) null))) {
                return jSONObject;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3316a(Object obj) {
        return (obj instanceof C1829e) && StringUtils.isValidString(((C1829e) obj).mo13951N());
    }

    /* renamed from: b */
    public static MaxAdapter m3317b(String str, C1959m mVar) {
        if (TextUtils.isEmpty(str)) {
            if (C2092v.m5047a()) {
                mVar.mo14286A().mo14793e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return (MaxAdapter) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{mVar.mo14309Y()});
            }
            if (C2092v.m5047a()) {
                C2092v A = mVar.mo14286A();
                A.mo14793e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            }
            return null;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v A2 = mVar.mo14286A();
                A2.mo14790b("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
    }

    /* renamed from: b */
    private static void m3318b(C1959m mVar) {
        MaxAdapter b;
        for (int i = 0; i < f2300c.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f2300c, i, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (b = m3317b(string, mVar)) != null) {
                String sdkVersion = b.getSdkVersion();
                if (StringUtils.isValidString(sdkVersion)) {
                    synchronized (f2301d) {
                        JsonUtils.putString(jSONObject, "sdk_version", sdkVersion);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m3319b(Object obj) {
        return (obj instanceof C1573a) && "APPLOVIN".equals(((C1573a) obj).mo13209M());
    }
}
