package com.applovin.impl.mediation.ads;

import android.app.Activity;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2078k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.mediation.ads.a */
public abstract class C1604a {

    /* renamed from: a */
    private static C1959m f2174a;
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected final Map<String, Object> extraParameters = Collections.synchronizedMap(new HashMap());
    protected final Map<String, Object> localExtraParameters = Collections.synchronizedMap(new HashMap());
    protected final C2092v logger;
    protected MaxAdRevenueListener revenueListener;
    protected final C1959m sdk;
    protected final String tag;

    /* renamed from: com.applovin.impl.mediation.ads.a$a */
    public interface C1605a extends MaxAdListener, MaxAdRevenueListener {
    }

    protected C1604a(String str, MaxAdFormat maxAdFormat, String str2, C1959m mVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = mVar;
        this.tag = str2;
        this.logger = mVar.mo14286A();
    }

    public static void logApiCall(String str, String str2) {
        if (f2174a == null) {
            for (AppLovinSdk appLovinSdk : AppLovinSdk.m5781a()) {
                C1959m mVar = appLovinSdk.coreSdk;
                if (!mVar.mo14352e()) {
                    if (C2092v.m5047a()) {
                        mVar.mo14286A().mo14789b(str, str2);
                    }
                    f2174a = mVar;
                }
            }
        } else if (C2092v.m5047a()) {
            f2174a.mo14286A().mo14789b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13299a(C1573a aVar) {
        if (C2092v.m5047a()) {
            C2078k kVar = new C2078k();
            kVar.mo14712a().mo14718a("MAX Ad").mo14715a(aVar).mo14712a();
            this.logger.mo14789b(this.tag, kVar.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (C2092v.m5047a()) {
            this.logger.mo14789b(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str = this.tag;
            vVar.mo14789b(str, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str != null) {
            if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
                int parseInt = Integer.parseInt(str2);
                if (((long) parseInt) > TimeUnit.MINUTES.toSeconds(2) && C2092v.m5047a()) {
                    String str3 = this.tag;
                    C2092v.m5053i(str3, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + parseInt + "s) - this will be ignored");
                }
            }
            this.extraParameters.put(str, str2);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str = this.tag;
            vVar.mo14789b(str, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        } else if (!(obj instanceof Activity)) {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            this.localExtraParameters.put(str, obj);
        } else if (C2092v.m5047a()) {
            this.logger.mo14793e(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
        }
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str = this.tag;
            vVar.mo14789b(str, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }
}
