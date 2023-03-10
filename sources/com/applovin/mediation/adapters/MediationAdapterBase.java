package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public abstract class MediationAdapterBase implements MaxAdapter, MaxInterstitialAdViewAdapter, MaxNativeAdAdapter, MaxRewardedAdViewAdapter {
    private static final ExecutorService sCachingExecutorService = Executors.newFixedThreadPool(4);
    private boolean alwaysRewardUser;
    private final C2092v mLogger;
    private final C1959m mSdk;
    private final String mTag = getClass().getSimpleName();
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        C1959m mVar = appLovinSdk.coreSdk;
        this.mSdk = mVar;
        this.mLogger = mVar.mo14286A();
    }

    protected static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    /* access modifiers changed from: protected */
    public void checkActivities(Context context, Class<?>... clsArr) {
    }

    /* access modifiers changed from: protected */
    public void checkExistence(Class<?>... clsArr) {
        if (clsArr != null && clsArr.length > 0 && C2092v.m5047a()) {
            for (Class<?> cls : clsArr) {
                log("Found: " + cls.getName());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i = BundleUtils.getInt("amount", 0, serverParameters);
        String string = BundleUtils.getString("currency", "", serverParameters);
        if (C2092v.m5047a()) {
            log("Creating reward: " + i + " " + string);
        }
        this.reward = MaxRewardImpl.create(i, string);
    }

    /* access modifiers changed from: protected */
    public Future<Drawable> createDrawableFuture(final String str, final Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() {
            public Drawable call() throws Exception {
                InputStream openStream = new URL(str).openStream();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(openStream));
                openStream.close();
                return bitmapDrawable;
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15008d(String str) {
        this.mLogger.mo14789b(this.mTag, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15009e(String str) {
        this.mLogger.mo14793e(this.mTag, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15010e(String str, Throwable th) {
        this.mLogger.mo14790b(this.mTag, str, th);
    }

    /* access modifiers changed from: protected */
    public Context getApplicationContext() {
        return this.mSdk.mo14297L();
    }

    /* access modifiers changed from: protected */
    public ExecutorService getCachingExecutorService() {
        return sCachingExecutorService;
    }

    /* access modifiers changed from: protected */
    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    /* access modifiers changed from: package-private */
    public String getVersionString(Class cls, String str) {
        String string = Utils.getString(cls, str);
        if (string == null && C2092v.m5047a()) {
            log("Failed to retrieve version string.");
        }
        return string;
    }

    /* access modifiers changed from: protected */
    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo15016i(String str) {
        this.mLogger.mo14791c(this.mTag, str);
    }

    public boolean isBeta() {
        return false;
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (C2092v.m5047a()) {
            mo15008d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        }
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    /* access modifiers changed from: protected */
    public void log(String str) {
        if (C2092v.m5047a()) {
            this.mLogger.mo14791c(this.mTag, str);
        }
    }

    /* access modifiers changed from: protected */
    public void log(String str, Throwable th) {
        if (C2092v.m5047a()) {
            this.mLogger.mo14790b(this.mTag, str, th);
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        if (C2092v.m5047a()) {
            mo15008d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        }
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        if (C2092v.m5047a()) {
            mo15008d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        }
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    /* access modifiers changed from: protected */
    public void userError(String str) {
        userError(str, (Throwable) null);
    }

    /* access modifiers changed from: protected */
    public void userError(String str, Throwable th) {
        if (C2092v.m5047a()) {
            C2092v.m5049c(this.mTag, str, th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo15022w(String str) {
        this.mLogger.mo14792d(this.mTag, str);
    }
}
