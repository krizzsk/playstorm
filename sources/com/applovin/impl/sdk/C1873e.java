package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.e */
public class C1873e implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C1959m f3457a;

    /* renamed from: b */
    private final Object f3458b = new Object();

    /* renamed from: c */
    private final LinkedHashMap<String, Bundle> f3459c = new LinkedHashMap<String, Bundle>() {
        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    };

    /* renamed from: d */
    private final Set<C1876a> f3460d = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.applovin.impl.sdk.e$a */
    public interface C1876a {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C1873e(C1959m mVar) {
        this.f3457a = mVar;
        AppLovinCommunicator.getInstance(mVar.mo14297L()).subscribe((AppLovinCommunicatorSubscriber) this, "safedk_ad_info");
    }

    /* renamed from: a */
    public static String m4119a() {
        return m4121d("getVersion");
    }

    /* renamed from: b */
    public static String m4120b() {
        return m4121d("getSdkKey");
    }

    /* renamed from: d */
    private static String m4121d(String str) {
        Class<?> cls;
        try {
            cls = Class.forName("com.applovin.quality.AppLovinQualityService");
        } catch (Throwable unused) {
            return "";
        }
        return (String) cls.getMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* renamed from: a */
    public String mo14135a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return BundleUtils.getString("ad_review_creative_id", mo14137b(str));
    }

    /* renamed from: a */
    public void mo14136a(C1876a aVar) {
        this.f3460d.add(aVar);
    }

    /* renamed from: b */
    public Bundle mo14137b(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f3458b) {
            bundle = this.f3459c.get(str);
        }
        return bundle;
    }

    /* renamed from: b */
    public void mo14138b(C1876a aVar) {
        this.f3460d.remove(aVar);
    }

    /* renamed from: c */
    public void mo14139c(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f3458b) {
                this.f3459c.remove(str);
            }
        }
    }

    public String getCommunicatorId() {
        return C1873e.class.getSimpleName();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle != null) {
                Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
                if (bundle2 == null) {
                    if (C2092v.m5047a()) {
                        this.f3457a.mo14286A().mo14792d("AppLovinSdk", "Received SafeDK ad info without private data");
                    }
                } else if (MaxAdFormat.formatFromString(bundle2.getString(FirebaseAnalytics.Param.AD_FORMAT)) != null) {
                    final String string = bundle2.getString("id");
                    if (!TextUtils.isEmpty(string)) {
                        synchronized (this.f3458b) {
                            C2092v A = this.f3457a.mo14286A();
                            A.mo14789b("AppLovinSdk", "Storing current SafeDK ad info for serve id: " + string);
                            this.f3459c.put(string, bundle);
                        }
                        final String string2 = bundle.getString("ad_review_creative_id");
                        if (StringUtils.isValidString(string2) && !this.f3460d.isEmpty()) {
                            Iterator it = new HashSet(this.f3460d).iterator();
                            while (it.hasNext()) {
                                final C1876a aVar = (C1876a) it.next();
                                this.f3457a.mo14303S().mo14206a((C1877a) new C1934z(this.f3457a, new Runnable() {
                                    public void run() {
                                        aVar.onCreativeIdGenerated(string, string2);
                                    }
                                }), C1908o.C1910a.BACKGROUND);
                            }
                        }
                    } else if (C2092v.m5047a()) {
                        this.f3457a.mo14286A().mo14792d("AppLovinSdk", "Received SafeDK ad info without serve id");
                    }
                } else if (C2092v.m5047a()) {
                    this.f3457a.mo14286A().mo14792d("AppLovinSdk", "Received SafeDK ad info without ad format");
                }
            } else if (C2092v.m5047a()) {
                this.f3457a.mo14286A().mo14792d("AppLovinSdk", "Received SafeDK ad info without public data");
            }
        }
    }
}
