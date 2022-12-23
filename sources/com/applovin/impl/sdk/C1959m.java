package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.adview.C1513d;
import com.applovin.impl.mediation.C1638d;
import com.applovin.impl.mediation.C1727e;
import com.applovin.impl.mediation.C1728f;
import com.applovin.impl.mediation.C1775h;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.debugger.C1646a;
import com.applovin.impl.mediation.debugger.p038ui.testmode.C1726b;
import com.applovin.impl.mediation.p028a.C1578f;
import com.applovin.impl.mediation.p032d.C1644b;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.C1985b;
import com.applovin.impl.sdk.network.C1992d;
import com.applovin.impl.sdk.network.C2002f;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.p045a.C1801f;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p048c.C1858c;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.p048c.C1860e;
import com.applovin.impl.sdk.p049d.C1867c;
import com.applovin.impl.sdk.p049d.C1871f;
import com.applovin.impl.sdk.p049d.C1872g;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1895i;
import com.applovin.impl.sdk.p050e.C1905n;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.C2081n;
import com.applovin.impl.sdk.utils.C2084p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import com.applovin.sdk.AppLovinUserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.m */
public class C1959m {

    /* renamed from: a */
    protected static Context f3651a;

    /* renamed from: c */
    private static C1788a f3652c;

    /* renamed from: A */
    private C2022q f3653A;

    /* renamed from: B */
    private C1867c f3654B;

    /* renamed from: C */
    private C2096y f3655C;

    /* renamed from: D */
    private C2024s f3656D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C1992d f3657E;

    /* renamed from: F */
    private C1943i f3658F;

    /* renamed from: G */
    private C2081n f3659G;

    /* renamed from: H */
    private C1940h f3660H;

    /* renamed from: I */
    private C1965n f3661I;

    /* renamed from: J */
    private C1801f f3662J;

    /* renamed from: K */
    private C2028u f3663K;

    /* renamed from: L */
    private PostbackServiceImpl f3664L;

    /* renamed from: M */
    private C2002f f3665M;

    /* renamed from: N */
    private C1873e f3666N;

    /* renamed from: O */
    private C1728f f3667O;

    /* renamed from: P */
    private C1727e f3668P;

    /* renamed from: Q */
    private MediationServiceImpl f3669Q;

    /* renamed from: R */
    private C1775h f3670R;

    /* renamed from: S */
    private C1646a f3671S;

    /* renamed from: T */
    private C2094w f3672T;

    /* renamed from: U */
    private C1638d f3673U;

    /* renamed from: V */
    private C1726b f3674V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public List<MaxAdFormat> f3675W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final Object f3676X = new Object();

    /* renamed from: Y */
    private final AtomicBoolean f3677Y = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public boolean f3678Z = false;

    /* renamed from: aa */
    private boolean f3679aa = false;

    /* renamed from: ab */
    private boolean f3680ab = false;

    /* renamed from: ac */
    private boolean f3681ac = false;

    /* renamed from: ad */
    private int f3682ad = 0;

    /* renamed from: ae */
    private AppLovinSdk.SdkInitializationListener f3683ae;

    /* renamed from: af */
    private AppLovinSdk.SdkInitializationListener f3684af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public AppLovinSdkConfiguration f3685ag;

    /* renamed from: b */
    protected C1858c f3686b;

    /* renamed from: d */
    private String f3687d;

    /* renamed from: e */
    private WeakReference<Activity> f3688e;

    /* renamed from: f */
    private long f3689f;

    /* renamed from: g */
    private AppLovinSdkSettings f3690g;

    /* renamed from: h */
    private AppLovinUserSegment f3691h;

    /* renamed from: i */
    private AppLovinTargetingData f3692i;

    /* renamed from: j */
    private String f3693j;

    /* renamed from: k */
    private AppLovinAdServiceImpl f3694k;

    /* renamed from: l */
    private AppLovinNativeAdService f3695l;

    /* renamed from: m */
    private EventServiceImpl f3696m;

    /* renamed from: n */
    private UserServiceImpl f3697n;

    /* renamed from: o */
    private VariableServiceImpl f3698o;

    /* renamed from: p */
    private AppLovinSdk f3699p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C2092v f3700q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1908o f3701r;

    /* renamed from: s */
    private C1985b f3702s;

    /* renamed from: t */
    private C1872g f3703t;

    /* renamed from: u */
    private C2012o f3704u;

    /* renamed from: v */
    private C1860e f3705v;

    /* renamed from: w */
    private C1952l f3706w;

    /* renamed from: x */
    private C2084p f3707x;

    /* renamed from: y */
    private C1855c f3708y;

    /* renamed from: z */
    private C2023r f3709z;

    /* renamed from: M */
    public static Context m4401M() {
        return f3651a;
    }

    /* renamed from: a */
    public static C1788a m4402a(Context context) {
        if (f3652c == null) {
            f3652c = new C1788a(context);
        }
        return f3652c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4406a(JSONObject jSONObject) {
        if (C2092v.m5047a()) {
            for (String i : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
                C2092v.m5053i("AppLovinSdk", i);
            }
        }
    }

    /* renamed from: ao */
    private void m4407ao() {
        this.f3657E.mo14514a((C1992d.C1993a) new C1992d.C1993a() {
            /* renamed from: a */
            public void mo14378a() {
                if (C2092v.m5047a()) {
                    C1959m.this.f3700q.mo14791c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                }
                synchronized (C1959m.this.f3676X) {
                    if (!C1959m.this.f3678Z) {
                        C1959m.this.mo14345b();
                    }
                }
                C1959m.this.f3657E.mo14515b(this);
            }

            /* renamed from: b */
            public void mo14379b() {
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public List<MaxAdFormat> m4409b(JSONObject jSONObject) {
        List<String> asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        for (String formatFromString : asList) {
            MaxAdFormat formatFromString2 = MaxAdFormat.formatFromString(formatFromString);
            if (formatFromString2 != null) {
                arrayList.add(formatFromString2);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public C2092v mo14286A() {
        return this.f3700q;
    }

    /* renamed from: B */
    public C1873e mo14287B() {
        return this.f3666N;
    }

    /* renamed from: C */
    public C1728f mo14288C() {
        return this.f3667O;
    }

    /* renamed from: D */
    public C1727e mo14289D() {
        return this.f3668P;
    }

    /* renamed from: E */
    public MediationServiceImpl mo14290E() {
        return this.f3669Q;
    }

    /* renamed from: F */
    public C2094w mo14291F() {
        return this.f3672T;
    }

    /* renamed from: G */
    public C1646a mo14292G() {
        return this.f3671S;
    }

    /* renamed from: H */
    public C1775h mo14293H() {
        return this.f3670R;
    }

    /* renamed from: I */
    public C1638d mo14294I() {
        return this.f3673U;
    }

    /* renamed from: J */
    public C1726b mo14295J() {
        return this.f3674V;
    }

    /* renamed from: K */
    public C1858c mo14296K() {
        return this.f3686b;
    }

    /* renamed from: L */
    public Context mo14297L() {
        return f3651a;
    }

    /* renamed from: N */
    public Activity mo14298N() {
        WeakReference<Activity> weakReference = this.f3688e;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: O */
    public long mo14299O() {
        return this.f3689f;
    }

    /* renamed from: P */
    public boolean mo14300P() {
        return this.f3680ab;
    }

    /* renamed from: Q */
    public boolean mo14301Q() {
        return this.f3681ac;
    }

    /* renamed from: R */
    public C1985b mo14302R() {
        return this.f3702s;
    }

    /* renamed from: S */
    public C1908o mo14303S() {
        return this.f3701r;
    }

    /* renamed from: T */
    public C1872g mo14304T() {
        return this.f3703t;
    }

    /* renamed from: U */
    public C2002f mo14305U() {
        return this.f3665M;
    }

    /* renamed from: V */
    public C2012o mo14306V() {
        return this.f3704u;
    }

    /* renamed from: W */
    public C1952l mo14307W() {
        return this.f3706w;
    }

    /* renamed from: X */
    public PostbackServiceImpl mo14308X() {
        return this.f3664L;
    }

    /* renamed from: Y */
    public AppLovinSdk mo14309Y() {
        return this.f3699p;
    }

    /* renamed from: Z */
    public C1855c mo14310Z() {
        return this.f3708y;
    }

    /* renamed from: a */
    public <T> T mo14311a(C1857b<T> bVar) {
        return this.f3686b.mo14061a(bVar);
    }

    /* renamed from: a */
    public <T> T mo14312a(C1859d<T> dVar) {
        return mo14342b(dVar, (Object) null);
    }

    /* renamed from: a */
    public <T> T mo14313a(String str, T t, Class<?> cls, SharedPreferences sharedPreferences) {
        return C1860e.m4042a(str, t, (Class) cls, sharedPreferences);
    }

    /* renamed from: a */
    public void mo14314a() {
        synchronized (this.f3676X) {
            if (!this.f3678Z && !this.f3679aa) {
                mo14345b();
            }
        }
    }

    /* renamed from: a */
    public void mo14315a(long j) {
        this.f3706w.mo14276a(j);
    }

    /* renamed from: a */
    public void mo14316a(SharedPreferences sharedPreferences) {
        this.f3705v.mo14073a(sharedPreferences);
    }

    /* renamed from: a */
    public void mo14317a(C1578f fVar) {
        if (!this.f3701r.mo14210a()) {
            List<String> b = mo14344b(C1856a.f3040a);
            if (b.size() > 0 && this.f3668P.mo13595b().containsAll(b)) {
                if (C2092v.m5047a()) {
                    this.f3700q.mo14789b("AppLovinSdk", "All required adapters initialized");
                }
                this.f3701r.mo14213d();
                mo14357j();
            }
        }
    }

    /* renamed from: a */
    public <T> void mo14318a(C1859d<T> dVar, T t) {
        this.f3705v.mo14075a(dVar, t);
    }

    /* renamed from: a */
    public <T> void mo14319a(C1859d<T> dVar, T t, SharedPreferences sharedPreferences) {
        this.f3705v.mo14076a(dVar, t, sharedPreferences);
    }

    /* renamed from: a */
    public void mo14320a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!mo14351d()) {
            this.f3683ae = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    sdkInitializationListener.onSdkInitialized(C1959m.this.f3685ag);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo14321a(AppLovinSdk appLovinSdk) {
        this.f3699p = appLovinSdk;
    }

    /* renamed from: a */
    public void mo14322a(String str) {
        if (C2092v.m5047a()) {
            C2092v.m5050f("AppLovinSdk", "Setting plugin version: " + str);
        }
        this.f3686b.mo14063a((C1857b<?>) C1857b.f3279dz, (Object) str);
    }

    /* renamed from: a */
    public void mo14323a(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        C1860e eVar;
        String str2;
        C1859d<String> dVar;
        this.f3687d = str;
        this.f3689f = System.currentTimeMillis();
        this.f3690g = appLovinSdkSettings;
        this.f3691h = new C1939g();
        this.f3692i = new AppLovinTargetingDataImpl();
        this.f3685ag = new SdkConfigurationImpl(this);
        f3651a = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f3688e = new WeakReference<>((Activity) context);
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f3705v = new C1860e(this);
        this.f3686b = new C1858c(this);
        this.f3700q = new C2092v(this);
        if (((Boolean) mo14311a(C1857b.f3167br)).booleanValue()) {
            this.f3709z = new C2023r(this);
        }
        this.f3653A = new C2022q(this);
        this.f3708y = new C1855c(this);
        this.f3696m = new EventServiceImpl(this);
        this.f3697n = new UserServiceImpl(this);
        this.f3698o = new VariableServiceImpl(this);
        this.f3654B = new C1867c(this);
        this.f3701r = new C1908o(this);
        this.f3702s = new C1985b(this);
        this.f3703t = new C1872g(this);
        this.f3662J = new C1801f(this);
        this.f3704u = new C2012o(this);
        this.f3694k = new AppLovinAdServiceImpl(this);
        this.f3695l = new AppLovinNativeAdService(this);
        this.f3655C = new C2096y(this);
        this.f3656D = new C2024s(this);
        this.f3664L = new PostbackServiceImpl(this);
        this.f3665M = new C2002f(this);
        this.f3666N = new C1873e(this);
        this.f3667O = new C1728f(this);
        this.f3668P = new C1727e(this);
        this.f3669Q = new MediationServiceImpl(this);
        this.f3672T = new C2094w(this);
        this.f3671S = new C1646a(this);
        this.f3670R = new C1775h();
        this.f3673U = new C1638d(this);
        this.f3706w = new C1952l(this);
        this.f3659G = new C2081n(this);
        this.f3660H = new C1940h(this);
        this.f3674V = new C1726b(this);
        this.f3661I = new C1965n(this);
        this.f3663K = new C2028u(this);
        this.f3658F = new C1943i(this);
        this.f3707x = new C2084p(this);
        this.f3668P.mo13592a(MaxAdapter.InitializationStatus.INITIALIZING);
        if (((Boolean) mo14311a(C1857b.f3201cZ)).booleanValue()) {
            this.f3657E = new C1992d(context);
        }
        if (C2092v.m5047a() && TextUtils.isEmpty(str)) {
            C2092v.m5053i("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            C2092v.m5053i("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (str.length() != 86 && Utils.isPubInDebugMode(context, this) && C2092v.m5047a()) {
            C2092v.m5053i("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + str + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if (Utils.isProguardRulesOmitted() && C2092v.m5047a()) {
            C2092v.m5053i("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!Utils.hasAndroidCoreJsonLibrary(this) && C2092v.m5047a()) {
            C2092v.m5053i("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (Utils.isVerboseLoggingEnabled(context)) {
            appLovinSdkSettings.setVerboseLogging(true);
        }
        mo14296K().mo14063a((C1857b<?>) C1857b.f3098ab, (Object) Boolean.valueOf(appLovinSdkSettings.isVerboseLoggingEnabled()));
        C1513d.class.getName();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (TextUtils.isEmpty((String) this.f3705v.mo14080b(C1859d.f3340a, null, defaultSharedPreferences))) {
            this.f3680ab = true;
            eVar = this.f3705v;
            dVar = C1859d.f3340a;
            str2 = Boolean.toString(true);
        } else {
            eVar = this.f3705v;
            dVar = C1859d.f3340a;
            str2 = Boolean.toString(false);
        }
        eVar.mo14076a(dVar, str2, defaultSharedPreferences);
        if (((Boolean) this.f3705v.mo14079b(C1859d.f3341b, false)).booleanValue()) {
            if (C2092v.m5047a()) {
                this.f3700q.mo14789b("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f3681ac = true;
        } else {
            if (C2092v.m5047a()) {
                this.f3700q.mo14789b("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            this.f3705v.mo14075a(C1859d.f3341b, true);
        }
        String str3 = (String) this.f3705v.mo14079b(C1859d.f3342c, null);
        if (!StringUtils.isValidString(str3) || AppLovinSdk.VERSION_CODE > Utils.toVersionCode(str3)) {
            this.f3705v.mo14075a(C1859d.f3342c, AppLovinSdk.VERSION);
        }
        boolean a = C2040h.m4900a(mo14297L());
        if (!((Boolean) mo14311a(C1857b.f3254da)).booleanValue() || a) {
            mo14345b();
        }
        if (((Boolean) mo14311a(C1857b.f3201cZ)).booleanValue() && !a) {
            if (C2092v.m5047a()) {
                this.f3700q.mo14791c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            m4407ao();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    public <T> void mo14324a(String str, T t, SharedPreferences.Editor editor) {
        this.f3705v.mo14077a(str, t, editor);
    }

    /* renamed from: a */
    public void mo14325a(boolean z) {
        synchronized (this.f3676X) {
            this.f3678Z = false;
            this.f3679aa = z;
        }
        if (this.f3686b != null && this.f3701r != null) {
            List<String> b = mo14344b(C1856a.f3040a);
            if (b.isEmpty()) {
                this.f3701r.mo14213d();
                mo14357j();
                return;
            }
            long longValue = ((Long) mo14311a(C1856a.f3041b)).longValue();
            C1934z zVar = new C1934z(this, true, new Runnable() {
                public void run() {
                    if (!C1959m.this.f3701r.mo14210a()) {
                        if (C2092v.m5047a()) {
                            C1959m.this.f3700q.mo14789b("AppLovinSdk", "Timing out adapters init...");
                        }
                        C1959m.this.f3701r.mo14213d();
                        C1959m.this.mo14357j();
                    }
                }
            });
            if (C2092v.m5047a()) {
                C2092v vVar = this.f3700q;
                vVar.mo14789b("AppLovinSdk", "Waiting for required adapters to init: " + b + " - timing out in " + longValue + "ms...");
            }
            this.f3701r.mo14208a(zVar, C1908o.C1910a.MEDIATION_TIMEOUT, longValue, true);
        }
    }

    /* renamed from: a */
    public boolean mo14326a(C1857b<String> bVar, MaxAdFormat maxAdFormat) {
        return mo14348c(bVar).contains(maxAdFormat);
    }

    /* renamed from: a */
    public boolean mo14327a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.f3675W;
        return list != null && list.size() > 0 && !this.f3675W.contains(maxAdFormat);
    }

    /* renamed from: aa */
    public C2023r mo14328aa() {
        return this.f3709z;
    }

    /* renamed from: ab */
    public C2022q mo14329ab() {
        return this.f3653A;
    }

    /* renamed from: ac */
    public C1867c mo14330ac() {
        return this.f3654B;
    }

    /* renamed from: ad */
    public C2096y mo14331ad() {
        return this.f3655C;
    }

    /* renamed from: ae */
    public C2024s mo14332ae() {
        return this.f3656D;
    }

    /* renamed from: af */
    public C1788a mo14333af() {
        return f3652c;
    }

    /* renamed from: ag */
    public C1943i mo14334ag() {
        return this.f3658F;
    }

    /* renamed from: ah */
    public C2081n mo14335ah() {
        return this.f3659G;
    }

    /* renamed from: ai */
    public C1940h mo14336ai() {
        return this.f3660H;
    }

    /* renamed from: aj */
    public AppLovinBroadcastManager mo14337aj() {
        return AppLovinBroadcastManager.getInstance(f3651a);
    }

    /* renamed from: ak */
    public C1965n mo14338ak() {
        return this.f3661I;
    }

    /* renamed from: al */
    public C1801f mo14339al() {
        return this.f3662J;
    }

    /* renamed from: am */
    public C2028u mo14340am() {
        return this.f3663K;
    }

    /* renamed from: an */
    public Activity mo14341an() {
        Activity a = m4402a(f3651a).mo13822a();
        if (a != null) {
            return a;
        }
        Activity N = mo14298N();
        if (N != null) {
            return N;
        }
        return null;
    }

    /* renamed from: b */
    public <T> T mo14342b(C1859d<T> dVar, T t) {
        return this.f3705v.mo14079b(dVar, t);
    }

    /* renamed from: b */
    public <T> T mo14343b(C1859d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return this.f3705v.mo14080b(dVar, t, sharedPreferences);
    }

    /* renamed from: b */
    public List<String> mo14344b(C1857b<String> bVar) {
        return this.f3686b.mo14065b(bVar);
    }

    /* renamed from: b */
    public void mo14345b() {
        synchronized (this.f3676X) {
            this.f3678Z = true;
            mo14303S().mo14212c();
            int i = this.f3682ad + 1;
            this.f3682ad = i;
            mo14303S().mo14207a((C1877a) new C1895i(i, this, new C1895i.C1897a() {
                /* renamed from: a */
                public void mo14197a(JSONObject jSONObject) {
                    boolean z = jSONObject.length() > 0;
                    C2040h.m4905d(jSONObject, C1959m.this);
                    C2040h.m4904c(jSONObject, C1959m.this);
                    C1935f.m4330a(C1959m.this);
                    C2040h.m4907e(jSONObject, C1959m.this);
                    C2040h.m4897a(jSONObject, z, C1959m.this);
                    C1644b.m3307a(jSONObject, C1959m.this);
                    C1644b.m3309b(jSONObject, C1959m.this);
                    C1959m.this.mo14292G().mo13387a(JsonUtils.getBoolean(jSONObject, "smd", false).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
                    C1959m mVar = C1959m.this;
                    List unused = mVar.f3675W = mVar.m4409b(jSONObject);
                    C2040h.m4909f(jSONObject, C1959m.this);
                    C1959m.this.mo14295J().mo13581a(jSONObject);
                    C1959m.this.m4406a(jSONObject);
                    C1959m.this.mo14303S().mo14205a((C1877a) new C1905n(C1959m.this));
                }
            }), C1908o.C1910a.MAIN, (long) ((Integer) mo14311a(C1857b.f3249dV)).intValue());
        }
    }

    /* renamed from: b */
    public <T> void mo14346b(C1859d<T> dVar) {
        this.f3705v.mo14074a(dVar);
    }

    /* renamed from: b */
    public void mo14347b(String str) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f3700q;
            vVar.mo14789b("AppLovinSdk", "Setting user id: " + str);
        }
        if (StringUtils.isValidString(str) && str.length() > Utils.kilobytesToByes(8)) {
            C2092v.m5053i("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + Utils.kilobytesToByes(8) + " maximum)");
        }
        this.f3707x.mo14756a(str);
    }

    /* renamed from: c */
    public List<MaxAdFormat> mo14348c(C1857b<String> bVar) {
        return this.f3686b.mo14067c(bVar);
    }

    /* renamed from: c */
    public void mo14349c(String str) {
        this.f3693j = str;
        mo14346b(C1859d.f3337A);
    }

    /* renamed from: c */
    public boolean mo14350c() {
        boolean z;
        synchronized (this.f3676X) {
            z = this.f3678Z;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo14351d() {
        boolean z;
        synchronized (this.f3676X) {
            z = this.f3679aa;
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo14352e() {
        return "HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(mo14374z());
    }

    /* renamed from: f */
    public boolean mo14353f() {
        return StringUtils.containsIgnoreCase(mo14367t(), "max");
    }

    /* renamed from: g */
    public boolean mo14354g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    /* renamed from: h */
    public void mo14355h() {
        String str = (String) this.f3705v.mo14079b(C1859d.f3342c, null);
        if (StringUtils.isValidString(str) && AppLovinSdk.VERSION_CODE < Utils.toVersionCode(str) && C2092v.m5047a()) {
            C2092v.m5053i("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
        }
    }

    /* renamed from: i */
    public void mo14356i() {
        this.f3658F.mo14256a();
    }

    /* renamed from: j */
    public void mo14357j() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.f3683ae;
        if (sdkInitializationListener != null) {
            if (mo14351d()) {
                this.f3683ae = null;
                this.f3684af = null;
                this.f3668P.mo13592a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else if (this.f3684af != sdkInitializationListener) {
                this.f3668P.mo13592a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) mo14311a(C1857b.f3106aj)).booleanValue()) {
                    this.f3683ae = null;
                } else {
                    this.f3684af = sdkInitializationListener;
                }
            } else {
                return;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (C2092v.m5047a()) {
                        C1959m.this.f3700q.mo14789b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                    }
                    sdkInitializationListener.onSdkInitialized(C1959m.this.f3685ag);
                }
            }, Math.max(0, ((Long) mo14311a(C1857b.f3107ak)).longValue()));
        }
    }

    /* renamed from: k */
    public void mo14358k() {
        if (C2092v.m5047a()) {
            C2092v.m5053i("AppLovinSdk", "Resetting SDK state...");
        }
        long b = this.f3703t.mo14131b(C1871f.f3442g);
        this.f3686b.mo14068c();
        this.f3686b.mo14062a();
        this.f3703t.mo14130a();
        this.f3703t.mo14133b(C1871f.f3442g, b + 1);
        if (this.f3677Y.compareAndSet(true, false)) {
            mo14345b();
        } else {
            this.f3677Y.set(true);
        }
    }

    /* renamed from: l */
    public void mo14359l() {
        this.f3671S.mo13389c();
    }

    /* renamed from: m */
    public String mo14360m() {
        return this.f3707x.mo14755a();
    }

    /* renamed from: n */
    public String mo14361n() {
        return this.f3707x.mo14757b();
    }

    /* renamed from: o */
    public String mo14362o() {
        return this.f3707x.mo14758c();
    }

    /* renamed from: p */
    public AppLovinSdkSettings mo14363p() {
        return this.f3690g;
    }

    /* renamed from: q */
    public AppLovinUserSegment mo14364q() {
        return this.f3691h;
    }

    /* renamed from: r */
    public AppLovinTargetingDataImpl mo14365r() {
        return (AppLovinTargetingDataImpl) this.f3692i;
    }

    /* renamed from: s */
    public AppLovinSdkConfiguration mo14366s() {
        return this.f3685ag;
    }

    /* renamed from: t */
    public String mo14367t() {
        String str = (String) mo14312a(C1859d.f3337A);
        return StringUtils.isValidString(str) ? str : this.f3693j;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f3687d + '\'' + ", enabled=" + this.f3679aa + ", isFirstSession=" + this.f3680ab + '}';
    }

    /* renamed from: u */
    public AppLovinAdServiceImpl mo14369u() {
        return this.f3694k;
    }

    /* renamed from: v */
    public AppLovinNativeAdService mo14370v() {
        return this.f3695l;
    }

    /* renamed from: w */
    public AppLovinEventService mo14371w() {
        return this.f3696m;
    }

    /* renamed from: x */
    public AppLovinUserService mo14372x() {
        return this.f3697n;
    }

    /* renamed from: y */
    public VariableServiceImpl mo14373y() {
        return this.f3698o;
    }

    /* renamed from: z */
    public String mo14374z() {
        return this.f3687d;
    }
}
