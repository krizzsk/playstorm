package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.inmobi.unification.sdk.InitializationStatus;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11443bb;
import com.tapjoy.internal.C11452bh;
import com.tapjoy.internal.C11481ce;
import com.tapjoy.internal.C11588ew;
import com.tapjoy.internal.C11606fc;
import com.tapjoy.internal.C11609fd;
import com.tapjoy.internal.C11627fj;
import com.tapjoy.internal.C11640fq;
import com.tapjoy.internal.C11647fu;
import com.tapjoy.internal.C11662gd;
import com.tapjoy.internal.C11675gh;
import com.tapjoy.internal.C11687gp;
import com.tapjoy.internal.C11690gs;
import com.tapjoy.internal.C11714hj;
import com.tapjoy.internal.C11841u;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.w3c.dom.Document;

public class TapjoyConnectCore {

    /* renamed from: A */
    private static String f27513A = "";

    /* renamed from: B */
    private static int f27514B = 1;

    /* renamed from: C */
    private static float f27515C = 1.0f;

    /* renamed from: D */
    private static int f27516D = 1;
    public static final float DEFAULT_CURRENCY_MULTIPLIER = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static String f27517E = "";

    /* renamed from: F */
    private static String f27518F = "";

    /* renamed from: G */
    private static String f27519G = "";

    /* renamed from: H */
    private static String f27520H = "";

    /* renamed from: I */
    private static String f27521I = "";

    /* renamed from: J */
    private static String f27522J = "";

    /* renamed from: K */
    private static String f27523K = "";

    /* renamed from: L */
    private static String f27524L = "";

    /* renamed from: M */
    private static String f27525M = "";

    /* renamed from: N */
    private static String f27526N = "";

    /* renamed from: O */
    private static String f27527O = "";

    /* renamed from: P */
    private static String f27528P = "";

    /* renamed from: Q */
    private static String f27529Q = "native";

    /* renamed from: R */
    private static String f27530R = "";

    /* renamed from: S */
    private static String f27531S = "";

    /* renamed from: T */
    private static float f27532T = 1.0f;

    /* renamed from: U */
    private static boolean f27533U = false;

    /* renamed from: V */
    private static String f27534V = "";

    /* renamed from: W */
    private static String f27535W = "";

    /* renamed from: X */
    private static String f27536X = "";

    /* renamed from: Y */
    private static String f27537Y = "";

    /* renamed from: Z */
    private static Map<String, Object> f27538Z = new HashMap();

    /* renamed from: a */
    protected static int f27539a = 0;

    /* renamed from: aA */
    private static Set<String> f27540aA = null;

    /* renamed from: aB */
    private static Integer f27541aB = null;

    /* renamed from: aC */
    private static Integer f27542aC = null;

    /* renamed from: aD */
    private static Integer f27543aD = null;

    /* renamed from: aE */
    private static Long f27544aE = null;

    /* renamed from: aF */
    private static Long f27545aF = null;

    /* renamed from: aG */
    private static Long f27546aG = null;

    /* renamed from: aH */
    private static String f27547aH = null;

    /* renamed from: aI */
    private static Integer f27548aI = null;

    /* renamed from: aJ */
    private static Double f27549aJ = null;

    /* renamed from: aK */
    private static Double f27550aK = null;

    /* renamed from: aL */
    private static Long f27551aL = null;

    /* renamed from: aM */
    private static Integer f27552aM = null;

    /* renamed from: aN */
    private static Integer f27553aN = null;

    /* renamed from: aO */
    private static Integer f27554aO = null;

    /* renamed from: aP */
    private static String f27555aP = null;

    /* renamed from: aQ */
    private static String f27556aQ = null;

    /* renamed from: aR */
    private static String f27557aR = null;

    /* renamed from: aS */
    private static String f27558aS = "";

    /* renamed from: aT */
    private static String f27559aT = "";

    /* renamed from: aU */
    private static String f27560aU = "";

    /* renamed from: aV */
    private static boolean f27561aV = false;

    /* renamed from: aW */
    private static TJConnectListener f27562aW = null;

    /* renamed from: aX */
    private static boolean f27563aX = false;

    /* renamed from: aa */
    private static String f27564aa = null;

    /* renamed from: ad */
    private static long f27565ad = 0;

    /* renamed from: af */
    private static boolean f27566af = false;

    /* renamed from: ag */
    private static PackageManager f27567ag = null;

    /* renamed from: ah */
    private static TapjoyGpsHelper f27568ah = null;

    /* renamed from: ai */
    private static Hashtable<String, Object> f27569ai = TapjoyConnectFlag.CONNECT_FLAG_DEFAULTS;

    /* renamed from: aj */
    private static Map<String, Integer> f27570aj = new ConcurrentHashMap();

    /* renamed from: ak */
    private static String f27571ak = null;

    /* renamed from: al */
    private static String f27572al = null;

    /* renamed from: am */
    private static String f27573am = null;

    /* renamed from: an */
    private static String f27574an = null;

    /* renamed from: ao */
    private static Integer f27575ao = null;

    /* renamed from: ap */
    private static String f27576ap = null;

    /* renamed from: aq */
    private static String f27577aq = null;

    /* renamed from: ar */
    private static Long f27578ar = null;

    /* renamed from: as */
    private static String f27579as = null;

    /* renamed from: at */
    private static Integer f27580at = null;

    /* renamed from: au */
    private static Integer f27581au = null;

    /* renamed from: av */
    private static String f27582av = null;

    /* renamed from: aw */
    private static String f27583aw = null;

    /* renamed from: ax */
    private static String f27584ax = null;

    /* renamed from: ay */
    private static String f27585ay = null;

    /* renamed from: az */
    private static String f27586az = null;

    /* renamed from: b */
    protected static int f27587b = 0;

    /* renamed from: c */
    protected static String f27588c = "";

    /* renamed from: d */
    protected static boolean f27589d = false;

    /* renamed from: e */
    protected static String f27590e = "";

    /* renamed from: f */
    protected static String f27591f = "";

    /* renamed from: g */
    protected static String f27592g = "";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static Context f27593h = null;

    /* renamed from: i */
    private static String f27594i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static TapjoyConnectCore f27595j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static TapjoyURLConnection f27596k = null;

    /* renamed from: l */
    private static TJConnectListener f27597l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static TJSetUserIDListener f27598m = null;

    /* renamed from: n */
    private static boolean f27599n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static boolean f27600o = false;

    /* renamed from: p */
    private static Vector<String> f27601p = new Vector<>(Arrays.asList(TapjoyConstants.dependencyClassNames));

    /* renamed from: q */
    private static String f27602q = "";

    /* renamed from: r */
    private static String f27603r = "";

    /* renamed from: s */
    private static String f27604s = "";

    /* renamed from: t */
    private static String f27605t = "";

    /* renamed from: u */
    private static String f27606u = "";

    /* renamed from: v */
    private static String f27607v = "";

    /* renamed from: w */
    private static String f27608w = "";

    /* renamed from: x */
    private static String f27609x = "";

    /* renamed from: y */
    private static String f27610y = "";

    /* renamed from: z */
    private static String f27611z = "";

    /* renamed from: ab */
    private long f27612ab = 0;

    /* renamed from: ac */
    private boolean f27613ac = false;

    /* renamed from: ae */
    private boolean f27614ae = false;

    public static String getConnectURL() {
        return TapjoyConfig.TJC_CONNECT_SERVICE_URL;
    }

    public static TapjoyConnectCore getInstance() {
        return f27595j;
    }

    public static void requestTapjoyConnect(Context context, String str) {
        requestTapjoyConnect(context, str, (Hashtable<String, ?>) null);
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable<String, ?> hashtable) {
        requestTapjoyConnect(context, str, hashtable, (TJConnectListener) null);
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) {
        try {
            C11640fq fqVar = new C11640fq(str);
            if (fqVar.f28305a == C11640fq.C11641a.SDK_ANDROID) {
                f27594i = str;
                f27609x = fqVar.f28306b;
                f27527O = fqVar.f28307c;
                f27528P = fqVar.f28308d;
                if (hashtable != null) {
                    f27569ai.putAll(hashtable);
                    C11662gd.m33848b().mo72534a(hashtable);
                }
                C11714hj.m34000a(context).f28488i = str;
                f27597l = tJConnectListener;
                if (f27595j == null) {
                    f27595j = new TapjoyConnectCore();
                }
                TapjoyConnectCore tapjoyConnectCore = f27595j;
                try {
                    m33158a(context);
                    new Thread(new Runnable() {
                        public final void run() {
                            TapjoyConnectCore.m33152a();
                            TapjoyConnectCore.m33154a(TapjoyConnectCore.this, TapjoyConnectCore.f27593h, new TJTaskHandler() {
                                public final void onComplete() {
                                    new Thread(new Runnable() {
                                        public final void run() {
                                            TapjoyConnectCore.this.completeConnectCall();
                                        }
                                    }).start();
                                }
                            });
                        }
                    }).start();
                    tapjoyConnectCore.f27614ae = true;
                } catch (TapjoyIntegrationException e) {
                    TapjoyLog.m33195e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e.getMessage()));
                    m33173i();
                    C11647fu.f28325b.notifyObservers(Boolean.FALSE);
                } catch (TapjoyException e2) {
                    TapjoyLog.m33195e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e2.getMessage()));
                    m33173i();
                    C11647fu.f28325b.notifyObservers(Boolean.FALSE);
                }
            } else {
                throw new IllegalArgumentException("The given API key was not for Android.");
            }
        } catch (IllegalArgumentException e3) {
            throw new TapjoyIntegrationException(e3.getMessage());
        }
    }

    public static void requestLimitedTapjoyConnect(Context context, String str, TJConnectListener tJConnectListener) {
        try {
            C11640fq fqVar = new C11640fq(str);
            if (fqVar.f28305a == C11640fq.C11641a.SDK_ANDROID) {
                f27558aS = fqVar.f28306b;
                f27559aT = fqVar.f28307c;
                if (f27595j == null) {
                    f27595j = new TapjoyConnectCore();
                }
                f27562aW = tJConnectListener;
                TapjoyConnectCore tapjoyConnectCore = f27595j;
                try {
                    m33158a(context);
                    new Thread(new Runnable() {
                        public final void run() {
                            TapjoyConnectCore.m33152a();
                            TapjoyConnectCore.m33154a(TapjoyConnectCore.this, TapjoyConnectCore.f27593h, new TJTaskHandler() {
                                public final void onComplete() {
                                    new Thread(new Runnable() {
                                        public final void run() {
                                            TapjoyConnectCore.this.completeLimitedConnectCall();
                                        }
                                    }).start();
                                }
                            });
                        }
                    }).start();
                } catch (TapjoyIntegrationException e) {
                    TapjoyLog.m33195e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e.getMessage()));
                    m33174j();
                    C11647fu.f28325b.notifyObservers(Boolean.FALSE);
                } catch (TapjoyException e2) {
                    TapjoyLog.m33195e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e2.getMessage()));
                    m33174j();
                    C11647fu.f28325b.notifyObservers(Boolean.FALSE);
                }
                TapjoyLog.m33194d("TapjoyConnect", "requestTapjoyConnect function complete");
                return;
            }
            throw new IllegalArgumentException("The given API key was not for Android.");
        } catch (IllegalArgumentException e3) {
            TapjoyLog.m33194d("TapjoyConnect", e3.getMessage());
            throw new TapjoyIntegrationException(e3.getMessage());
        }
    }

    /* renamed from: i */
    private static void m33173i() {
        if (!TextUtils.isEmpty(f27528P)) {
            C11714hj.m33999a().mo72613a(f27593h, f27594i, "12.10.0", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, f27528P, f27527O);
        }
        TJConnectListener tJConnectListener = f27597l;
        if (tJConnectListener != null) {
            tJConnectListener.onConnectFailure();
        }
    }

    /* renamed from: j */
    private static void m33174j() {
        TJConnectListener tJConnectListener = f27562aW;
        if (tJConnectListener != null) {
            tJConnectListener.onConnectFailure();
        }
    }

    public void appPause() {
        this.f27613ac = true;
    }

    public void appResume() {
        if (this.f27613ac) {
            m33148K();
            this.f27613ac = false;
        }
    }

    public static Map<String, String> getURLParams() {
        Map<String, String> genericURLParams = getGenericURLParams();
        genericURLParams.putAll(getTimeStampAndVerifierParams());
        return genericURLParams;
    }

    public static Map<String, String> getLimitedURLParams() {
        Map<String, String> limitedGenericURLParams = getLimitedGenericURLParams();
        limitedGenericURLParams.putAll(getLimitedTimeStampAndVerifierParams());
        return limitedGenericURLParams;
    }

    public static Map<String, String> getGenericURLParams() {
        Map<String, String> k = m33175k();
        TapjoyUtil.safePut(k, "app_id", f27609x, true);
        return k;
    }

    public static Map<String, String> getLimitedGenericURLParams() {
        Map<String, String> k = m33175k();
        TapjoyUtil.safePut(k, "app_id", f27558aS, true);
        TapjoyUtil.safePut(k, TapjoyConstants.TJC_APP_GROUP_ID, f27560aU, true);
        TapjoyUtil.safePut(k, TapjoyConstants.TJC_LIMITED, "true", true);
        return k;
    }

    /* renamed from: k */
    private static Map<String, String> m33175k() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(m33176l());
        hashMap.putAll(m33181q());
        return hashMap;
    }

    /* renamed from: l */
    private static Map<String, String> m33176l() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(m33177m());
        hashMap.putAll(m33178n());
        hashMap.putAll(m33179o());
        hashMap.putAll(m33180p());
        hashMap.putAll(C11675gh.m33868a().mo72557b());
        if (!(TapjoyCache.getInstance() == null || TapjoyCache.getInstance().getCachedOfferIDs() == null || TapjoyCache.getInstance().getCachedOfferIDs().length() <= 0)) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CACHED_OFFERS, TapjoyCache.getInstance().getCachedOfferIDs(), true);
        }
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CURRENCY_MULTIPLIER, Float.toString(f27532T), true);
        return hashMap;
    }

    public static Map<String, String> getTimeStampAndVerifierParams() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String a = m33151a(currentTimeMillis);
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, "timestamp", String.valueOf(currentTimeMillis), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VERIFIER, a, true);
        return hashMap;
    }

    public static Map<String, String> getLimitedTimeStampAndVerifierParams() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String b = m33162b(currentTimeMillis);
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, "timestamp", String.valueOf(currentTimeMillis), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VERIFIER, b, true);
        return hashMap;
    }

    /* renamed from: m */
    private static Map<String, String> m33177m() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PLUGIN, f27529Q, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SDK_TYPE, f27530R, true);
        TapjoyUtil.safePut(hashMap, "app_id", f27609x, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_LIBRARY_VERSION, f27611z, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_LIBRARY_REVISION, TapjoyRevision.GIT_REVISION, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_BRIDGE_VERSION, f27513A, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_OMSDK_VERSION, C11481ce.m33385a(), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_APP_VERSION_NAME, f27610y, true);
        return hashMap;
    }

    /* renamed from: n */
    private static Map<String, String> m33178n() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_NAME, f27605t, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PLATFORM, f27519G, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, f27608w, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_MANUFACTURER, f27606u, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_TYPE_NAME, f27607v, true);
        StringBuilder sb = new StringBuilder();
        sb.append(f27516D);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_SCREEN_LAYOUT_SIZE, sb.toString(), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_STORE_NAME, f27526N, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_STORE_VIEW, String.valueOf(f27533U), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CARRIER_NAME, f27520H, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CARRIER_COUNTRY_CODE, f27521I, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_MOBILE_NETWORK_CODE, f27523K, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_MOBILE_COUNTRY_CODE, f27522J, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, Locale.getDefault().getCountry(), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_LANGUAGE, Locale.getDefault().getLanguage(), true);
        String connectionType = getConnectionType();
        f27524L = connectionType;
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CONNECTION_TYPE, connectionType, true);
        String connectionSubType = getConnectionSubType();
        f27525M = connectionSubType;
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CONNECTION_SUBTYPE, connectionSubType, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f27514B);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_SCREEN_DENSITY, sb2.toString(), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VOLUME, TapjoyUtil.getVolume(f27593h));
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_THEME, TapjoyUtil.getTheme(f27593h), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_SCREEN_BRIGHTNESS, TapjoyUtil.getScreenBrightness(f27593h));
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_AVAILABLE_DISK_SPACE, TapjoyUtil.getAvailableDiskSpace());
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_TOTAL_DISK_SPACE, TapjoyUtil.getTotalDiskSpace());
        return hashMap;
    }

    /* renamed from: o */
    private static Map<String, String> m33179o() {
        HashMap hashMap = new HashMap();
        if (m33145H()) {
            if (f27568ah.isAdvertisingIdAllowed()) {
                TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_ADVERTISING_ID, f27588c, true);
            }
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_AD_TRACKING_ENABLED, String.valueOf(f27589d), true);
        }
        if (!TextUtils.isEmpty(f27592g)) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_APP_SET_ID, f27592g, true);
        }
        if ((m33146I() && !m33145H()) || !m33147J()) {
            TapjoyUtil.safePut(hashMap, "android_id", f27602q, true);
        }
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_INSTALL_ID, f27604s, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_ID, f27517E, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_ADVERTISING_ID_CHECK_DISABLED, f27590e, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_LEGACY_ID_FALLBACK_ALLOWED, f27591f, true);
        int i = f27539a;
        if (i != 0) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGED_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(i), true);
        }
        int i2 = f27587b;
        if (i2 != 0) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(i2), true);
        }
        String str = f27603r;
        if (str == null || str.length() == 0 || System.currentTimeMillis() - f27565ad > TapjoyConstants.SESSION_ID_INACTIVITY_TIME) {
            f27603r = m33148K();
        } else {
            f27565ad = System.currentTimeMillis();
        }
        TapjoyUtil.safePut(hashMap, "session_id", f27603r, true);
        return hashMap;
    }

    /* renamed from: p */
    private static Map<String, String> m33180p() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_APP_GROUP_ID, f27534V, true);
        TapjoyUtil.safePut(hashMap, "store", f27535W, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_ANALYTICS_API_KEY, f27536X, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_MANAGED_DEVICE_ID, f27537Y, true);
        return hashMap;
    }

    /* renamed from: q */
    private static Map<String, String> m33181q() {
        HashMap hashMap = new HashMap();
        m33185u();
        hashMap.putAll(m33182r());
        hashMap.putAll(m33183s());
        hashMap.putAll(m33184t());
        return hashMap;
    }

    /* renamed from: r */
    private static Map<String, String> m33182r() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_ANALYTICS_ID, f27571ak, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_ID, f27572al, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_SIGN, f27573am, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY, f27552aM);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH, f27553aN);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT, f27554aO);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_COUNTRY_SIM, f27555aP, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_TIMEZONE, f27556aQ, true);
        return hashMap;
    }

    /* renamed from: s */
    private static Map<String, String> m33183s() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_VERSION, f27574an, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_REVISION, f27575ao);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_DATA_VERSION, f27576ap, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_INSTALLER, f27577aq, true);
        if (TextUtils.isEmpty(f27526N)) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_STORE_NAME, f27557aR, true);
        }
        return hashMap;
    }

    /* renamed from: t */
    private static Map<String, String> m33184t() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_INSTALLED, f27578ar);
        TapjoyUtil.safePut(hashMap, "referrer", f27579as, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_LEVEL, f27580at);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_FRIEND_COUNT, f27581au);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_1, f27582av, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_2, f27583aw, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_3, f27584ax, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_4, f27585ay, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_5, f27586az, true);
        int i = 0;
        for (String safePut : f27540aA) {
            StringBuilder sb = new StringBuilder("user_tags[");
            int i2 = i + 1;
            sb.append(i);
            sb.append("]");
            TapjoyUtil.safePut(hashMap, sb.toString(), safePut, true);
            i = i2;
        }
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY, f27541aB);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY, f27542aC);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_TOTAL_COUNT, f27543aD);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_TOTAL_LENGTH, f27544aE);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_LAST_AT, f27545aF);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_LAST_LENGTH, f27546aG);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_CURRENCY, f27547aH, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_TOTAL_COUNT, f27548aI);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_TOTAL_PRICE, f27549aJ);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_LAST_PRICE, f27550aK);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_LAST_AT, f27551aL);
        return hashMap;
    }

    /* renamed from: a */
    private static boolean m33158a(Context context) {
        f27593h = context;
        f27567ag = context.getPackageManager();
        C11675gh.m33868a().mo72554a(context);
        C11662gd.m33847a().mo72539a(context);
        f27568ah = new TapjoyGpsHelper(f27593h);
        if (f27596k == null) {
            f27596k = new TapjoyURLConnection();
        }
        m33139B();
        if (TextUtils.isEmpty(getConnectFlagValue("unit_test_mode"))) {
            m33142E();
        }
        m33187w();
        m33185u();
        if (getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).length() > 0) {
            f27591f = getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK);
        }
        if (getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) != null && getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).length() > 0) {
            f27590e = getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK);
        }
        if (getConnectFlagValue(TapjoyConnectFlag.USER_ID) != null && getConnectFlagValue(TapjoyConnectFlag.USER_ID).length() > 0) {
            TapjoyLog.m33197i("TapjoyConnect", "Setting userID to: " + getConnectFlagValue(TapjoyConnectFlag.USER_ID));
            setUserID(getConnectFlagValue(TapjoyConnectFlag.USER_ID), (TJSetUserIDListener) null);
        }
        f27531S = TapjoyUtil.getRedirectDomain(getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL));
        if (f27569ai == null) {
            return true;
        }
        m33186v();
        return true;
    }

    /* renamed from: u */
    private static void m33185u() {
        C11609fd a = C11714hj.m34000a(f27593h).mo72611a(true);
        C11606fc fcVar = a.f28157d;
        f27571ak = fcVar.f28121h;
        f27572al = fcVar.f28131r;
        f27573am = fcVar.f28132s;
        f27552aM = fcVar.f28126m;
        f27553aN = fcVar.f28127n;
        f27554aO = fcVar.f28128o;
        f27555aP = fcVar.f28134u;
        f27556aQ = fcVar.f28130q;
        C11588ew ewVar = a.f28158e;
        f27574an = ewVar.f28018e;
        f27575ao = ewVar.f28019f;
        f27576ap = ewVar.f28020g;
        f27577aq = ewVar.f28021h;
        f27557aR = ewVar.f28022i;
        C11627fj fjVar = a.f28159f;
        f27578ar = fjVar.f28252s;
        f27579as = fjVar.f28253t;
        f27580at = fjVar.f28243J;
        f27581au = fjVar.f28244K;
        f27582av = fjVar.f28245L;
        f27583aw = fjVar.f28246M;
        f27584ax = fjVar.f28247N;
        f27585ay = fjVar.f28248O;
        f27586az = fjVar.f28249P;
        f27540aA = new HashSet(fjVar.f28250Q);
        f27541aB = fjVar.f28254u;
        f27542aC = fjVar.f28255v;
        f27543aD = fjVar.f28257x;
        f27544aE = fjVar.f28258y;
        f27545aF = fjVar.f28259z;
        f27546aG = fjVar.f28234A;
        f27547aH = fjVar.f28235B;
        f27548aI = fjVar.f28236C;
        f27549aJ = fjVar.f28237D;
        f27550aK = fjVar.f28239F;
        f27551aL = fjVar.f28238E;
    }

    /* renamed from: v */
    private static void m33186v() {
        TapjoyLog.m33197i("TapjoyConnect", "Connect Flags:");
        TapjoyLog.m33197i("TapjoyConnect", "--------------------");
        for (Map.Entry next : f27569ai.entrySet()) {
            TapjoyLog.m33197i("TapjoyConnect", "key: " + ((String) next.getKey()) + ", value: " + Uri.encode(next.getValue().toString()));
        }
        TapjoyLog.m33197i("TapjoyConnect", "hostURL: [" + getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL) + "]");
        TapjoyLog.m33197i("TapjoyConnect", "redirectDomain: [" + f27531S + "]");
        TapjoyLog.m33197i("TapjoyConnect", "--------------------");
    }

    /* renamed from: w */
    private static void m33187w() {
        String string = Settings.Secure.getString(f27593h.getContentResolver(), "android_id");
        f27602q = string;
        if (string != null) {
            f27602q = string.toLowerCase();
        }
        try {
            f27610y = f27567ag.getPackageInfo(f27593h.getPackageName(), 0).versionName;
            f27607v = "android";
            f27519G = "android";
            f27605t = Build.MODEL;
            f27606u = Build.MANUFACTURER;
            f27608w = Build.VERSION.RELEASE;
            f27611z = "12.10.0";
            f27513A = TapjoyConstants.TJC_BRIDGE_VERSION_NUMBER;
            m33188x();
            m33189y();
            m33190z();
            m33138A();
        } catch (PackageManager.NameNotFoundException e) {
            throw new TapjoyException(e.getMessage());
        }
    }

    /* renamed from: x */
    private static void m33188x() {
        try {
            if (Build.VERSION.SDK_INT > 3) {
                TapjoyDisplayMetricsUtil tapjoyDisplayMetricsUtil = new TapjoyDisplayMetricsUtil(f27593h);
                f27514B = tapjoyDisplayMetricsUtil.getScreenDensityDPI();
                f27515C = tapjoyDisplayMetricsUtil.getScreenDensityScale();
                f27516D = tapjoyDisplayMetricsUtil.getScreenLayoutSize();
            }
        } catch (Exception e) {
            TapjoyLog.m33196e("TapjoyConnect", "Error getting screen density/dimensions/layout: " + e.toString());
        }
    }

    /* renamed from: y */
    private static void m33189y() {
        TelephonyManager telephonyManager = (TelephonyManager) f27593h.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                f27520H = telephonyManager.getNetworkOperatorName();
                f27521I = telephonyManager.getNetworkCountryIso();
                String networkOperator = telephonyManager.getNetworkOperator();
                if (networkOperator == null) {
                    return;
                }
                if (networkOperator.length() == 5 || networkOperator.length() == 6) {
                    f27522J = networkOperator.substring(0, 3);
                    f27523K = networkOperator.substring(3);
                }
            } catch (SecurityException unused) {
                TapjoyLog.m33197i("TapjoyConnect", "Error accessing network operator info");
            }
        }
    }

    /* renamed from: z */
    private static void m33190z() {
        SharedPreferences sharedPreferences = f27593h.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        String string = sharedPreferences.getString(TapjoyConstants.PREF_INSTALL_ID, "");
        f27604s = string;
        if (string == null || string.length() == 0) {
            try {
                f27604s = TapjoyUtil.SHA256(UUID.randomUUID().toString() + System.currentTimeMillis());
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(TapjoyConstants.PREF_INSTALL_ID, f27604s);
                edit.apply();
            } catch (Exception e) {
                TapjoyLog.m33196e("TapjoyConnect", "Error generating install id: " + e.toString());
            }
        }
    }

    /* renamed from: A */
    private static void m33138A() {
        if (getConnectFlagValue(TapjoyConnectFlag.STORE_NAME) != null && getConnectFlagValue(TapjoyConnectFlag.STORE_NAME).length() > 0) {
            f27526N = getConnectFlagValue(TapjoyConnectFlag.STORE_NAME);
            if (!new ArrayList(Arrays.asList(TapjoyConnectFlag.STORE_ARRAY)).contains(f27526N)) {
                TapjoyLog.m33199w("TapjoyConnect", "Warning -- undefined STORE_NAME: " + f27526N);
            }
        }
        try {
            f27533U = m33169e(f27526N);
        } catch (Exception e) {
            TapjoyLog.m33196e("TapjoyConnect", "Error trying to detect store intent on devicee: " + e.toString());
        }
    }

    /* renamed from: B */
    private static void m33139B() {
        if (f27569ai == null) {
            f27569ai = new Hashtable<>();
        }
        m33140C();
        m33141D();
    }

    /* renamed from: C */
    private static void m33140C() {
        try {
            if (f27567ag != null) {
                ApplicationInfo applicationInfo = f27567ag.getApplicationInfo(f27593h.getPackageName(), 128);
                if (applicationInfo == null || applicationInfo.metaData == null) {
                    TapjoyLog.m33194d("TapjoyConnect", "No metadata present.");
                    return;
                }
                for (String str : TapjoyConnectFlag.FLAG_ARRAY) {
                    String string = applicationInfo.metaData.getString("tapjoy.".concat(String.valueOf(str)));
                    if (string != null) {
                        TapjoyLog.m33194d("TapjoyConnect", "Found manifest flag: " + str + ", " + string);
                        m33155a(str, string);
                    }
                }
                TapjoyLog.m33194d("TapjoyConnect", "Metadata successfully loaded");
            }
        } catch (Exception e) {
            TapjoyLog.m33195e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error reading manifest meta-data -- " + e.toString()));
        }
    }

    /* renamed from: D */
    private static void m33141D() {
        int identifier = f27593h.getResources().getIdentifier("raw/tapjoy_config", (String) null, f27593h.getPackageName());
        Properties properties = new Properties();
        try {
            properties.load(f27593h.getResources().openRawResource(identifier));
            m33156a(properties);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m33156a(Properties properties) {
        Enumeration keys = properties.keys();
        while (keys.hasMoreElements()) {
            try {
                String str = (String) keys.nextElement();
                m33155a(str, (String) properties.get(str));
            } catch (ClassCastException unused) {
                TapjoyLog.m33196e("TapjoyConnect", "Error parsing configuration properties in tapjoy_config.txt");
            }
        }
    }

    /* renamed from: E */
    private static void m33142E() {
        try {
            List<ActivityInfo> asList = Arrays.asList(f27567ag.getPackageInfo(f27593h.getPackageName(), 1).activities);
            if (asList != null) {
                for (ActivityInfo a : asList) {
                    m33153a(a);
                }
            }
            if (f27601p.size() == 0) {
                m33143F();
                m33144G();
                if (getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) == null || !getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).equals("true")) {
                    f27568ah.checkGooglePlayIntegration();
                } else {
                    TapjoyLog.m33197i("TapjoyConnect", "Skipping integration check for Google Play Services and Advertising ID. Do this only if you do not have access to Google Play Services.");
                }
            } else if (f27601p.size() == 1) {
                throw new TapjoyIntegrationException("Missing " + f27601p.size() + " dependency class in manifest: " + f27601p.toString());
            } else {
                throw new TapjoyIntegrationException("Missing " + f27601p.size() + " dependency classes in manifest: " + f27601p.toString());
            }
        } catch (Exception unused) {
            throw new TapjoyIntegrationException("Error while getting package info.");
        }
    }

    /* renamed from: F */
    private static void m33143F() {
        Vector vector = new Vector();
        String[] strArr = TapjoyConstants.dependencyPermissions;
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            String str = strArr[i];
            if (f27567ag.checkPermission(str, f27593h.getPackageName()) != 0) {
                z = false;
            }
            if (!z) {
                vector.add(str);
            }
            i++;
        }
        if (vector.size() == 0) {
            Vector vector2 = new Vector();
            if (vector2.size() == 0) {
                return;
            }
            if (vector2.size() == 1) {
                TapjoyLog.m33199w("TapjoyConnect", "WARNING -- " + vector2.toString() + " permission was not found in manifest. The exclusion of this permission could cause problems.");
                return;
            }
            TapjoyLog.m33199w("TapjoyConnect", "WARNING -- " + vector2.toString() + " permissions were not found in manifest. The exclusion of these permissions could cause problems.");
        } else if (vector.size() == 1) {
            throw new TapjoyIntegrationException("Missing 1 permission in manifest: " + vector.toString());
        } else {
            throw new TapjoyIntegrationException("Missing " + vector.size() + " permissions in manifest: " + vector.toString());
        }
    }

    /* renamed from: G */
    private static void m33144G() {
        try {
            try {
                Class.forName("com.tapjoy.TJAdUnitJSBridge").getMethod(TJAdUnitConstants.String.CLOSE_REQUESTED, new Class[]{Boolean.class});
            } catch (NoSuchMethodException unused) {
                throw new TapjoyIntegrationException("Try configuring Proguard or other code obfuscators to ignore com.tapjoy classes. Visit http://dev.tapjoy.comfor more information.");
            }
        } catch (ClassNotFoundException unused2) {
            throw new TapjoyIntegrationException("ClassNotFoundException: com.tapjoy.TJAdUnitJSBridge was not found.");
        }
    }

    /* renamed from: H */
    private static boolean m33145H() {
        String str = f27588c;
        return str != null && str.length() > 0;
    }

    /* renamed from: I */
    private static boolean m33146I() {
        return getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).equals("true");
    }

    /* renamed from: J */
    private static boolean m33147J() {
        return (f27568ah.isGooglePlayServicesAvailable() && f27568ah.isGooglePlayManifestConfigured()) || getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) == null || !getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).equals("true");
    }

    /* renamed from: a */
    private static void m33153a(ActivityInfo activityInfo) {
        if (f27601p.contains(activityInfo.name)) {
            int indexOf = f27601p.indexOf(activityInfo.name);
            try {
                Class.forName(f27601p.get(indexOf));
                Vector vector = new Vector();
                if ((activityInfo.configChanges & 128) != 128) {
                    vector.add("orientation");
                }
                if ((activityInfo.configChanges & 32) != 32) {
                    vector.add("keyboardHidden");
                }
                if (vector.size() == 0) {
                    if (Build.VERSION.SDK_INT >= 13 && (activityInfo.configChanges & 1024) != 1024) {
                        TapjoyLog.m33199w("TapjoyConnect", "WARNING -- screenSize property is not specified in manifest configChanges for " + f27601p.get(indexOf));
                    }
                    if (Build.VERSION.SDK_INT >= 11 && activityInfo.name.equals("com.tapjoy.TJAdUnitActivity")) {
                        if ((activityInfo.flags & 512) != 512) {
                            throw new TapjoyIntegrationException("'hardwareAccelerated' property not specified in manifest for " + f27601p.get(indexOf));
                        }
                    }
                    f27601p.remove(indexOf);
                } else if (vector.size() == 1) {
                    throw new TapjoyIntegrationException(vector.toString() + " property is not specified in manifest configChanges for " + f27601p.get(indexOf));
                } else {
                    throw new TapjoyIntegrationException(vector.toString() + " properties are not specified in manifest configChanges for " + f27601p.get(indexOf));
                }
            } catch (ClassNotFoundException unused) {
                throw new TapjoyIntegrationException("[ClassNotFoundException] Could not find dependency class " + f27601p.get(indexOf));
            }
        }
    }

    /* renamed from: a */
    private static boolean m33160a(String str, boolean z) {
        C11452bh bhVar;
        C11452bh bhVar2;
        long j;
        try {
            C11452bh b = C11452bh.m33266b(str);
            try {
                Map<String, Object> d = b.mo72215d();
                String a = C11690gs.m33926a((String) d.get("override_service_url"));
                if (!TextUtils.isEmpty(a)) {
                    getInstance();
                    m33155a(TapjoyConnectFlag.SERVICE_URL, a);
                }
                String a2 = C11690gs.m33926a((String) d.get(TapjoyConstants.TJC_APP_GROUP_ID));
                String a3 = C11690gs.m33926a((String) d.get("store"));
                String a4 = C11690gs.m33926a((String) d.get(TapjoyConstants.TJC_ANALYTICS_API_KEY));
                Object obj = d.get("user_token_config");
                String a5 = C11690gs.m33926a((String) d.get(TapjoyConstants.TJC_MANAGED_DEVICE_ID));
                Object obj2 = d.get("cache_max_age");
                C11640fq fqVar = new C11640fq(a4);
                if (fqVar.f28305a == C11640fq.C11641a.RPC_ANALYTICS) {
                    String a6 = C11640fq.m33804a(fqVar.f28306b);
                    String str2 = fqVar.f28307c;
                    if (a2 == null) {
                        a2 = a6;
                    }
                    Object obj3 = obj2;
                    Object obj4 = obj;
                    C11714hj.m33999a().mo72613a(f27593h, a4, "12.10.0", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, a6, str2);
                    f27534V = a2;
                    f27535W = a3;
                    f27536X = a4;
                    f27537Y = a5;
                    if (obj4 instanceof Map) {
                        f27538Z = (Map) obj4;
                    }
                    if (!TextUtils.isEmpty(a) && f27599n) {
                        setUserID(f27517E, (TJSetUserIDListener) null);
                    }
                    b.close();
                    if (!z) {
                        Object obj5 = obj3;
                        if (obj5 instanceof String) {
                            try {
                                j = Long.parseLong(((String) obj5).trim());
                            } catch (NumberFormatException unused) {
                            }
                        } else {
                            if (obj5 instanceof Number) {
                                j = ((Number) obj5).longValue();
                            }
                            j = 0;
                        }
                        if (j <= 0) {
                            TapjoyAppSettings.getInstance().removeConnectResult();
                        } else {
                            TapjoyAppSettings.getInstance().saveConnectResultAndParams(str, m33150M(), (j * 1000) + C11841u.m34410b());
                        }
                        C11662gd a7 = C11662gd.m33847a();
                        Object obj6 = d.get(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS);
                        if (obj6 instanceof Map) {
                            try {
                                a7.f28363a.mo72535a((Map) obj6);
                                a7.mo72540c().edit().putString(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS, C11443bb.m33243a(obj6)).apply();
                            } catch (Exception unused2) {
                            }
                        } else if (obj6 == null) {
                            a7.f28363a.mo72535a((Map) null);
                            a7.mo72540c().edit().remove(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS).apply();
                        }
                    }
                    C11687gp.m33922a((Closeable) null);
                    return true;
                }
                throw new IOException("Invalid analytics_api_key");
            } catch (IOException e) {
                e = e;
                bhVar2 = b;
                TapjoyLog.m33198v("TapjoyConnect", e.getMessage());
                C11687gp.m33922a(bhVar);
                return false;
            } catch (RuntimeException e2) {
                e = e2;
                bhVar = b;
                TapjoyLog.m33198v("TapjoyConnect", e.getMessage());
                C11687gp.m33922a(bhVar);
                return false;
            } catch (Throwable th) {
                th = th;
                bhVar = b;
                C11687gp.m33922a(bhVar);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bhVar2 = null;
            TapjoyLog.m33198v("TapjoyConnect", e.getMessage());
            C11687gp.m33922a(bhVar);
            return false;
        } catch (RuntimeException e4) {
            e = e4;
            bhVar = null;
            TapjoyLog.m33198v("TapjoyConnect", e.getMessage());
            C11687gp.m33922a(bhVar);
            return false;
        } catch (Throwable th2) {
            th = th2;
            C11687gp.m33922a(bhVar);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: com.tapjoy.internal.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m33165c(java.lang.String r10) {
        /*
            java.lang.String r0 = "TapjoyConnect"
            r1 = 0
            com.tapjoy.internal.bh r10 = com.tapjoy.internal.C11452bh.m33266b(r10)     // Catch:{ IOException -> 0x00a2, RuntimeException -> 0x0096, all -> 0x0094 }
            java.util.Map r2 = r10.mo72215d()     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = "override_service_url"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = com.tapjoy.internal.C11690gs.m33926a(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            if (r4 != 0) goto L_0x0025
            getInstance()     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r4 = "TJC_OPTION_SERVICE_URL"
            m33155a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
        L_0x0025:
            java.lang.String r3 = "app_group_id"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = com.tapjoy.internal.C11690gs.m33926a(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r4 = "store"
            java.lang.Object r4 = r2.get(r4)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r4 = com.tapjoy.internal.C11690gs.m33926a(r4)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r5 = "analytics_api_key"
            java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r5 = com.tapjoy.internal.C11690gs.m33926a(r5)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r6 = "user_token_config"
            java.lang.Object r6 = r2.get(r6)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r7 = "managed_device_id"
            java.lang.Object r2 = r2.get(r7)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r2 = com.tapjoy.internal.C11690gs.m33926a(r2)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            com.tapjoy.internal.fq r7 = new com.tapjoy.internal.fq     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            com.tapjoy.internal.fq$a r5 = r7.f28305a     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            com.tapjoy.internal.fq$a r8 = com.tapjoy.internal.C11640fq.C11641a.RPC_ANALYTICS     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            if (r5 != r8) goto L_0x0085
            java.lang.String r5 = r7.f28306b     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r5 = com.tapjoy.internal.C11640fq.m33804a(r5)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            if (r3 != 0) goto L_0x006f
            r3 = r5
        L_0x006f:
            f27560aU = r3     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            f27535W = r4     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            f27537Y = r2     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            boolean r2 = r6 instanceof java.util.Map     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            if (r2 == 0) goto L_0x007d
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            f27538Z = r6     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
        L_0x007d:
            r10.close()     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            com.tapjoy.internal.C11687gp.m33922a(r1)
            r10 = 1
            return r10
        L_0x0085:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r2 = "Invalid analytics_api_key"
            r1.<init>(r2)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            throw r1     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
        L_0x008d:
            r0 = move-exception
            r1 = r10
            goto L_0x00b2
        L_0x0090:
            r1 = move-exception
            goto L_0x009a
        L_0x0092:
            r1 = move-exception
            goto L_0x00a6
        L_0x0094:
            r0 = move-exception
            goto L_0x00b2
        L_0x0096:
            r10 = move-exception
            r9 = r1
            r1 = r10
            r10 = r9
        L_0x009a:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x008d }
            com.tapjoy.TapjoyLog.m33198v(r0, r1)     // Catch:{ all -> 0x008d }
            goto L_0x00ad
        L_0x00a2:
            r10 = move-exception
            r9 = r1
            r1 = r10
            r10 = r9
        L_0x00a6:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x008d }
            com.tapjoy.TapjoyLog.m33198v(r0, r1)     // Catch:{ all -> 0x008d }
        L_0x00ad:
            com.tapjoy.internal.C11687gp.m33922a(r10)
            r10 = 0
            return r10
        L_0x00b2:
            com.tapjoy.internal.C11687gp.m33922a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.m33165c(java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.tapjoy.internal.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m33167d(java.lang.String r4) {
        /*
            java.lang.String r0 = "TapjoyConnect"
            r1 = 0
            com.tapjoy.internal.bh r4 = com.tapjoy.internal.C11452bh.m33266b(r4)     // Catch:{ IOException -> 0x0039, RuntimeException -> 0x002d, all -> 0x002b }
            boolean r2 = r4.mo72211a()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            if (r2 == 0) goto L_0x001d
            r4.mo72234s()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            java.lang.String r2 = "Successfully sent completed Pay-Per-Action to Tapjoy server."
            com.tapjoy.TapjoyLog.m33194d(r0, r2)     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            r4.close()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            com.tapjoy.internal.C11687gp.m33922a(r1)
            r4 = 1
            return r4
        L_0x001d:
            r4.close()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            com.tapjoy.internal.C11687gp.m33922a(r1)
            goto L_0x0047
        L_0x0024:
            r0 = move-exception
            r1 = r4
            goto L_0x0055
        L_0x0027:
            r1 = move-exception
            goto L_0x0031
        L_0x0029:
            r1 = move-exception
            goto L_0x003d
        L_0x002b:
            r0 = move-exception
            goto L_0x0055
        L_0x002d:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L_0x0031:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0024 }
            com.tapjoy.TapjoyLog.m33198v(r0, r1)     // Catch:{ all -> 0x0024 }
            goto L_0x0044
        L_0x0039:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L_0x003d:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0024 }
            com.tapjoy.TapjoyLog.m33198v(r0, r1)     // Catch:{ all -> 0x0024 }
        L_0x0044:
            com.tapjoy.internal.C11687gp.m33922a(r4)
        L_0x0047:
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR
            java.lang.String r2 = "Completed Pay-Per-Action call failed."
            r4.<init>(r1, r2)
            com.tapjoy.TapjoyLog.m33195e((java.lang.String) r0, (com.tapjoy.TapjoyErrorMessage) r4)
            r4 = 0
            return r4
        L_0x0055:
            com.tapjoy.internal.C11687gp.m33922a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.m33167d(java.lang.String):boolean");
    }

    public void release() {
        f27595j = null;
        f27596k = null;
        TapjoyLog.m33194d("TapjoyConnect", "Releasing core static instance.");
    }

    public static String getAppID() {
        return f27609x;
    }

    public static String getLimitedAppID() {
        return f27558aS;
    }

    public static String getUserID() {
        return f27517E;
    }

    public static String getHostURL() {
        return getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL);
    }

    public static String getPlacementURL() {
        return getConnectFlagValue(TapjoyConnectFlag.PLACEMENT_URL);
    }

    public static String getRedirectDomain() {
        return f27531S;
    }

    public static String getCarrierName() {
        return f27520H;
    }

    public static String getConnectionType() {
        String str = "";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f27593h.getSystemService("connectivity");
            if (!(connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null)) {
                int type = connectivityManager.getActiveNetworkInfo().getType();
                str = (type == 1 || type == 6) ? TapjoyConstants.TJC_CONNECTION_TYPE_WIFI : TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE;
                TapjoyLog.m33194d("TapjoyConnect", "connectivity: " + connectivityManager.getActiveNetworkInfo().getType());
                TapjoyLog.m33194d("TapjoyConnect", "connection_type: ".concat(str));
            }
        } catch (Exception e) {
            TapjoyLog.m33196e("TapjoyConnect", "getConnectionType error: " + e.toString());
        }
        return str;
    }

    public static String getConnectionSubType() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f27593h.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "";
            }
            String subtypeName = connectivityManager.getActiveNetworkInfo().getSubtypeName();
            TapjoyLog.m33194d("TapjoyConnect", "connection_sub_type: ".concat(String.valueOf(subtypeName)));
            return subtypeName;
        } catch (Exception e) {
            TapjoyLog.m33196e("TapjoyConnect", "getConnectionSubType error: " + e.toString());
            return "";
        }
    }

    /* renamed from: e */
    private static boolean m33169e(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str.length() > 0) {
            return false;
        }
        intent.setData(Uri.parse("market://details"));
        if (f27567ag.queryIntentActivities(intent, 0).size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private static String m33148K() {
        TapjoyLog.m33197i("TapjoyConnect", "generating sessionID...");
        String str = null;
        try {
            str = TapjoyUtil.SHA256((System.currentTimeMillis() / 1000) + f27609x);
            f27565ad = System.currentTimeMillis();
            return str;
        } catch (Exception e) {
            TapjoyLog.m33196e("TapjoyConnect", "unable to generate session id: " + e.toString());
            return str;
        }
    }

    public static Context getContext() {
        return f27593h;
    }

    /* renamed from: L */
    private static String m33149L() {
        if (m33145H()) {
            return f27588c;
        }
        if (m33146I() || !m33147J()) {
            String str = f27602q;
            if (str != null && str.length() > 0) {
                return f27602q;
            }
        }
        TapjoyLog.m33196e("TapjoyConnect", "Error -- no valid device identifier");
        return null;
    }

    /* renamed from: a */
    private static String m33151a(long j) {
        try {
            return TapjoyUtil.SHA256(f27609x + CertificateUtil.DELIMITER + m33149L() + CertificateUtil.DELIMITER + j + CertificateUtil.DELIMITER + f27527O);
        } catch (Exception e) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            TapjoyLog.m33195e("TapjoyConnect", new TapjoyErrorMessage(errorType, "Error in computing verifier value -- " + e.toString()));
            return "";
        }
    }

    /* renamed from: b */
    private static String m33162b(long j) {
        try {
            return TapjoyUtil.SHA256(f27558aS + CertificateUtil.DELIMITER + m33149L() + CertificateUtil.DELIMITER + j + CertificateUtil.DELIMITER + f27559aT);
        } catch (Exception e) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            TapjoyLog.m33195e("TapjoyConnect", new TapjoyErrorMessage(errorType, "Error in computing verifier value -- " + e.toString()));
            return "";
        }
    }

    public static String getAwardCurrencyVerifier(long j, int i, String str) {
        try {
            return TapjoyUtil.SHA256(f27609x + CertificateUtil.DELIMITER + m33149L() + CertificateUtil.DELIMITER + j + CertificateUtil.DELIMITER + f27527O + CertificateUtil.DELIMITER + i + CertificateUtil.DELIMITER + str);
        } catch (Exception e) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            TapjoyLog.m33195e("TapjoyConnect", new TapjoyErrorMessage(errorType, "Error in computing awardCurrencyVerifier -- " + e.toString()));
            return "";
        }
    }

    public boolean isInitialized() {
        return this.f27614ae;
    }

    public static void setPlugin(String str) {
        f27529Q = str;
    }

    public static void setSDKType(String str) {
        f27530R = str;
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        f27517E = str;
        f27598m = tJSetUserIDListener;
        TapjoyLog.m33194d("TapjoyConnect", "URL parameters: " + getURLParams());
        new Thread(new Runnable() {
            public final void run() {
                TapjoyLog.m33197i("TapjoyConnect", "Setting userID to " + TapjoyConnectCore.f27517E);
                String hostURL = TapjoyConnectCore.getHostURL();
                TapjoyURLConnection d = TapjoyConnectCore.f27596k;
                TapjoyHttpURLResponse responseFromURL = d.getResponseFromURL(hostURL + TapjoyConstants.TJC_USER_ID_URL_PATH, TapjoyConnectCore.getURLParams());
                boolean a = responseFromURL.response != null ? TapjoyConnectCore.m33159a(responseFromURL.response) : false;
                if (a || TapjoyConnectCore.f27600o || hostURL.equalsIgnoreCase(TapjoyConnectCore.getHostURL())) {
                    TapjoyConnectCore.m33157a(a);
                    return;
                }
                boolean unused = TapjoyConnectCore.f27600o = true;
                TapjoyConnectCore.setUserID(TapjoyConnectCore.f27517E, TapjoyConnectCore.f27598m);
            }
        }).start();
    }

    public static void viewDidClose(String str) {
        TapjoyLog.m33194d("TapjoyConnect", "viewDidClose: ".concat(String.valueOf(str)));
        f27570aj.remove(str);
        C11647fu.f28328e.notifyObservers();
    }

    public static void viewWillOpen(String str, int i) {
        TapjoyLog.m33194d("TapjoyConnect", "viewWillOpen: ".concat(String.valueOf(str)));
        f27570aj.put(str, Integer.valueOf(i));
    }

    public static boolean isViewOpen() {
        TapjoyLog.m33194d("TapjoyConnect", "isViewOpen: " + f27570aj.size());
        return !f27570aj.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isFullScreenViewOpen() {
        /*
            java.util.Map<java.lang.String, java.lang.Integer> r0 = f27570aj
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 1
            if (r1 == r2) goto L_0x0021
            r3 = 2
            if (r1 == r3) goto L_0x0021
            goto L_0x000a
        L_0x0021:
            return r2
        L_0x0022:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.isFullScreenViewOpen():boolean");
    }

    public static void setViewShowing(boolean z) {
        if (z) {
            f27570aj.put("", 1);
        } else {
            f27570aj.clear();
        }
    }

    /* renamed from: a */
    private static void m33155a(String str, String str2) {
        if ((str.equals(TapjoyConnectFlag.SERVICE_URL) || str.equals(TapjoyConnectFlag.PLACEMENT_URL)) && !str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        f27569ai.put(str, str2);
    }

    public void actionComplete(String str) {
        TapjoyLog.m33197i("TapjoyConnect", "actionComplete: ".concat(String.valueOf(str)));
        Map<String, String> k = m33175k();
        TapjoyUtil.safePut(k, "app_id", str, true);
        k.putAll(getTimeStampAndVerifierParams());
        TapjoyLog.m33194d("TapjoyConnect", "PPA URL parameters: ".concat(String.valueOf(k)));
        new Thread(new PPAThread(k)).start();
    }

    public void completeConnectCall() {
        boolean z;
        String connectResult;
        TapjoyLog.m33194d("TapjoyConnect", "starting connect call...");
        String hostURL = getHostURL() != TapjoyConfig.TJC_SERVICE_URL ? getHostURL() : TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        if (isConnected() || (connectResult = TapjoyAppSettings.getInstance().getConnectResult(m33150M(), C11841u.m34410b())) == null || !m33160a(connectResult, true)) {
            z = false;
        } else {
            TapjoyLog.m33197i("TapjoyConnect", "Connect using stored connect result");
            f27566af = true;
            TJConnectListener tJConnectListener = f27597l;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectSuccess();
            }
            C11647fu.f28324a.notifyObservers();
            z = true;
        }
        TapjoyHttpURLResponse responseFromURL = f27596k.getResponseFromURL(hostURL + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map<String, String>) null, (Map<String, String>) null, getURLParams());
        if (responseFromURL == null || responseFromURL.statusCode != 200) {
            if (!z) {
                m33173i();
            }
            C11647fu.f28325b.notifyObservers(Boolean.FALSE);
        } else if (m33160a(responseFromURL.response, false)) {
            TapjoyLog.m33197i("TapjoyConnect", "Successfully connected to Tapjoy");
            f27566af = true;
            for (Map.Entry next : getGenericURLParams().entrySet()) {
                TapjoyLog.m33194d("TapjoyConnect", ((String) next.getKey()) + ": " + ((String) next.getValue()));
            }
            if (!z) {
                TJConnectListener tJConnectListener2 = f27597l;
                if (tJConnectListener2 != null) {
                    tJConnectListener2.onConnectSuccess();
                }
                C11647fu.f28324a.notifyObservers();
            }
            C11647fu.f28325b.notifyObservers(Boolean.TRUE);
        } else {
            if (!z) {
                m33173i();
            }
            C11647fu.f28325b.notifyObservers(Boolean.FALSE);
        }
    }

    public void completeLimitedConnectCall() {
        String hostURL = getHostURL() != TapjoyConfig.TJC_SERVICE_URL ? getHostURL() : TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        Map<String, String> limitedURLParams = getLimitedURLParams();
        TapjoyURLConnection tapjoyURLConnection = f27596k;
        TapjoyHttpURLResponse responseFromURL = tapjoyURLConnection.getResponseFromURL(hostURL + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map<String, String>) null, (Map<String, String>) null, limitedURLParams);
        if (responseFromURL == null || responseFromURL.statusCode != 200) {
            m33174j();
            C11647fu.f28325b.notifyObservers(Boolean.FALSE);
        } else if (m33165c(responseFromURL.response)) {
            TapjoyLog.m33197i("TapjoyConnect", "Successfully connected to Tapjoy");
            f27561aV = true;
            for (Map.Entry next : getLimitedGenericURLParams().entrySet()) {
                TapjoyLog.m33194d("TapjoyConnect", ((String) next.getKey()) + ": " + ((String) next.getValue()));
            }
            TJConnectListener tJConnectListener = f27562aW;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectSuccess();
            }
            C11647fu.f28324a.notifyObservers();
            C11647fu.f28325b.notifyObservers(Boolean.TRUE);
        } else {
            m33174j();
            C11647fu.f28325b.notifyObservers(Boolean.FALSE);
        }
    }

    public class PPAThread implements Runnable {

        /* renamed from: b */
        private Map<String, String> f27624b;

        public PPAThread(Map<String, String> map) {
            this.f27624b = map;
        }

        public void run() {
            TapjoyURLConnection d = TapjoyConnectCore.f27596k;
            TapjoyHttpURLResponse responseFromURL = d.getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map<String, String>) null, (Map<String, String>) null, this.f27624b);
            if (responseFromURL.response != null) {
                boolean unused = TapjoyConnectCore.m33167d(responseFromURL.response);
            }
        }
    }

    public void setCurrencyMultiplier(float f) {
        TapjoyLog.m33197i("TapjoyConnect", "setVirtualCurrencyMultiplier: ".concat(String.valueOf(f)));
        f27532T = f;
    }

    public float getCurrencyMultiplier() {
        return f27532T;
    }

    public static String getConnectFlagValue(String str) {
        Hashtable<String, Object> hashtable = f27569ai;
        return (hashtable == null || hashtable.get(str) == null) ? "" : f27569ai.get(str).toString();
    }

    public static String getSecretKey() {
        return f27527O;
    }

    public static String getAndroidID() {
        return f27602q;
    }

    public static float getDeviceScreenDensityScale() {
        return f27515C;
    }

    public static String getSupportURL(String str) {
        if (str == null) {
            str = f27609x;
        }
        return getHostURL() + "support_requests/new?currency_id=" + str + "&app_id=" + f27609x + "&udid=" + f27537Y + "&language_code=" + Locale.getDefault().getLanguage();
    }

    public static String getUserToken() {
        Map<String, Object> map = f27538Z;
        if (map != null && !map.isEmpty()) {
            Map<String, Object> map2 = f27538Z;
            HashMap hashMap = new HashMap();
            for (String next : map2.keySet()) {
                TapjoyUtil.safePut(hashMap, next, String.valueOf(map2.get(next)), true);
            }
            if (!TextUtils.isEmpty(f27517E)) {
                TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_TOKEN_PARAM_USER_ID, f27517E, true);
            }
            return Base64.encodeToString(TapjoyUtil.convertURLParams((Map<String, String>) hashMap, false).getBytes(), 2);
        } else if (TextUtils.isEmpty(f27517E)) {
            return f27537Y;
        } else {
            return f27537Y + CertificateUtil.DELIMITER + f27517E;
        }
    }

    public static boolean isConnected() {
        return f27566af;
    }

    public static boolean isLimitedConnected() {
        return f27561aV;
    }

    public static boolean isUnitTestMode() {
        return getConnectFlagValue("unit_test_mode") == "true";
    }

    /* renamed from: M */
    private static String m33150M() {
        String str = f27609x + f27610y + f27611z + f27588c + f27604s;
        try {
            return TapjoyUtil.SHA1(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void optOutAdvertisingID(Context context, boolean z) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
            edit.putBoolean(TapjoyConstants.PREF_OPTOUT_ADVERTISING_ID, z);
            edit.apply();
            if (z) {
                f27588c = "";
                TapjoyGpsHelper tapjoyGpsHelper = f27568ah;
                if (tapjoyGpsHelper != null) {
                    tapjoyGpsHelper.resetAdvertisingID();
                    C11714hj.m33999a().mo72618a(f27588c, true);
                }
            } else if (C11690gs.m33928c(f27588c) || f27588c.equals("00000000-0000-0000-0000-000000000000")) {
                if (f27595j == null) {
                    f27595j = new TapjoyConnectCore();
                }
                f27563aX = false;
                new Thread(new Runnable() {
                    public final void run() {
                        TapjoyConnectCore unused = TapjoyConnectCore.f27595j;
                        TapjoyConnectCore.m33152a();
                    }
                }).start();
            }
        }
    }

    public static void setCustomParameter(String str) {
        f27518F = str;
    }

    public static String getCustomParameter() {
        return f27518F;
    }

    /* renamed from: a */
    static /* synthetic */ void m33152a() {
        if (!f27563aX) {
            try {
                boolean z = false;
                f27568ah.loadAdvertisingId(!m33146I());
                if (f27568ah.isGooglePlayServicesAvailable() && f27568ah.isGooglePlayManifestConfigured()) {
                    f27587b = f27568ah.getDeviceGooglePlayServicesVersion();
                    f27539a = f27568ah.getPackagedGooglePlayServicesVersion();
                }
                if (f27568ah.isAdIdAvailable()) {
                    f27589d = f27568ah.isAdTrackingEnabled();
                    f27588c = f27568ah.getAdvertisingId();
                    C11714hj a = C11714hj.m33999a();
                    String str = f27588c;
                    if (!f27589d) {
                        z = true;
                    }
                    a.mo72618a(str, z);
                }
            } catch (Exception e) {
                TapjoyLog.m33197i("TapjoyConnect", "Error fetching advertising id: " + e.toString());
                e.printStackTrace();
            }
            f27563aX = true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m33154a(TapjoyConnectCore tapjoyConnectCore, Context context, final TJTaskHandler tJTaskHandler) {
        try {
            Class.forName("com.google.android.gms.appset.AppSet");
            AppSet.getClient(context.getApplicationContext()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() {
                public final /* synthetic */ void onSuccess(Object obj) {
                    AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                    int scope = appSetIdInfo.getScope();
                    TapjoyConnectCore.f27592g = appSetIdInfo.getId();
                    TapjoyLog.m33194d("TapjoyConnect", String.format(Locale.ENGLISH, "Scope: %d. AppSetId: %s", new Object[]{Integer.valueOf(scope), TapjoyConnectCore.f27592g}));
                    tJTaskHandler.onComplete();
                }
            });
        } catch (Exception e) {
            TapjoyLog.m33194d("TapjoyConnect", String.format(Locale.ENGLISH, "AppSetId class not found: %s", new Object[]{e.getMessage()}));
            tJTaskHandler.onComplete();
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m33159a(String str) {
        Document buildDocument = TapjoyUtil.buildDocument(str);
        if (buildDocument == null) {
            return true;
        }
        String nodeTrimValue = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName(InitializationStatus.SUCCESS));
        return nodeTrimValue != null && nodeTrimValue.equals("true");
    }

    /* renamed from: a */
    static /* synthetic */ void m33157a(boolean z) {
        if (z) {
            TapjoyLog.m33197i("TapjoyConnect", "Set userID is successful");
            TJSetUserIDListener tJSetUserIDListener = f27598m;
            if (tJSetUserIDListener != null) {
                tJSetUserIDListener.onSetUserIDSuccess();
                return;
            }
            return;
        }
        TapjoyLog.m33195e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to set userID"));
        TJSetUserIDListener tJSetUserIDListener2 = f27598m;
        if (tJSetUserIDListener2 != null) {
            tJSetUserIDListener2.onSetUserIDFailure("Failed to set userID");
        }
        f27599n = true;
    }
}
