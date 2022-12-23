package com.smaato.sdk.interstitial.p385ad;

import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.ApiAdRequestExtras;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.smaato.sdk.interstitial.ad.InterstitialAdLoaderPlugin */
public class InterstitialAdLoaderPlugin implements AdLoaderPlugin {
    private final NullableFunction<AdPresenterModuleInterface, AdLoaderPlugin> adLoaderPluginResolvingFunction;
    private final AdRequestExtrasProvider adRequestExtrasProvider;
    private final boolean isAllInterstitialModulesPresent;
    private final boolean isAtLeastOneInterstitialModulePresent;
    private final String missingInterstitialModulesMessage;
    private final ArrayList<AdFormat> possibleInterstitialModuleAdFormats;
    private final NullableFunction<Collection<AdFormat>, AdFormat> serverAdFormatResolvingFunction;
    private final Iterable<? extends AdPresenterModuleInterface> validAdPresenterInterfaces;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.NullableFunction<com.smaato.sdk.core.framework.AdPresenterModuleInterface, com.smaato.sdk.core.ad.AdLoaderPlugin>] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.smaato.sdk.core.util.fi.NullableFunction<java.util.Collection<com.smaato.sdk.core.ad.AdFormat>, com.smaato.sdk.core.ad.AdFormat>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InterstitialAdLoaderPlugin(java.lang.Iterable<? extends com.smaato.sdk.core.framework.AdPresenterModuleInterface> r2, com.smaato.sdk.core.util.p382fi.NullableFunction<com.smaato.sdk.core.framework.AdPresenterModuleInterface, com.smaato.sdk.core.p378ad.AdLoaderPlugin> r3, com.smaato.sdk.core.util.p382fi.NullableFunction<java.util.Collection<com.smaato.sdk.core.p378ad.AdFormat>, com.smaato.sdk.core.p378ad.AdFormat> r4, com.smaato.sdk.core.api.AdRequestExtrasProvider r5, java.util.List<com.smaato.sdk.core.p378ad.AdFormat> r6, java.lang.String r7) {
        /*
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.possibleInterstitialModuleAdFormats = r0
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r1.validAdPresenterInterfaces = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.util.fi.NullableFunction r2 = (com.smaato.sdk.core.util.p382fi.NullableFunction) r2
            r1.adLoaderPluginResolvingFunction = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.core.api.AdRequestExtrasProvider r2 = (com.smaato.sdk.core.api.AdRequestExtrasProvider) r2
            r1.adRequestExtrasProvider = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.util.fi.NullableFunction r2 = (com.smaato.sdk.core.util.p382fi.NullableFunction) r2
            r1.serverAdFormatResolvingFunction = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
            com.smaato.sdk.interstitial.ad.-$$Lambda$InterstitialAdLoaderPlugin$wM3GIdgS4nPZFvJ7IWvdQa37mQ8 r2 = new com.smaato.sdk.interstitial.ad.-$$Lambda$InterstitialAdLoaderPlugin$wM3GIdgS4nPZFvJ7IWvdQa37mQ8
            r2.<init>()
            boolean r2 = com.smaato.sdk.core.util.collections.Lists.any(r0, r2)
            r1.isAtLeastOneInterstitialModulePresent = r2
            com.smaato.sdk.interstitial.ad.-$$Lambda$InterstitialAdLoaderPlugin$wM3GIdgS4nPZFvJ7IWvdQa37mQ8 r2 = new com.smaato.sdk.interstitial.ad.-$$Lambda$InterstitialAdLoaderPlugin$wM3GIdgS4nPZFvJ7IWvdQa37mQ8
            r2.<init>()
            boolean r2 = com.smaato.sdk.core.util.collections.Lists.all(r0, r2)
            r1.isAllInterstitialModulesPresent = r2
            r1.missingInterstitialModulesMessage = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.interstitial.p385ad.InterstitialAdLoaderPlugin.<init>(java.lang.Iterable, com.smaato.sdk.core.util.fi.NullableFunction, com.smaato.sdk.core.util.fi.NullableFunction, com.smaato.sdk.core.api.AdRequestExtrasProvider, java.util.List, java.lang.String):void");
    }

    public AdPresenterBuilder getAdPresenterBuilder(AdFormat adFormat, Class<? extends AdPresenter> cls, Logger logger) {
        AdLoaderPlugin apply;
        AdPresenterBuilder adPresenterBuilder;
        if (!InterstitialAdPresenter.class.isAssignableFrom(cls)) {
            return null;
        }
        for (AdPresenterModuleInterface adPresenterModuleInterface : this.validAdPresenterInterfaces) {
            if (adPresenterModuleInterface.isFormatSupported(adFormat, InterstitialAdPresenter.class) && (apply = this.adLoaderPluginResolvingFunction.apply(adPresenterModuleInterface)) != null && (adPresenterBuilder = apply.getAdPresenterBuilder(adFormat, cls, logger)) != null) {
                return adPresenterBuilder;
            }
        }
        return null;
    }

    public void addApiAdRequestExtras(ApiAdRequestExtras apiAdRequestExtras, Logger logger) {
        this.adRequestExtrasProvider.addApiAdRequestExtras(apiAdRequestExtras);
        Iterator<AdFormat> it = this.possibleInterstitialModuleAdFormats.iterator();
        while (it.hasNext()) {
            addApiAdRequestExtrasByAdPresenterModules(it.next(), apiAdRequestExtras, logger);
        }
    }

    public AdFormat resolveAdFormatToServerAdFormat(AdFormat adFormat, Logger logger) {
        AdFormat adFormat2 = AdFormat.INTERSTITIAL;
        if (adFormat != adFormat2) {
            return resolveAdFormatByAdPresenterModules(adFormat, logger);
        }
        if (!this.isAtLeastOneInterstitialModulePresent) {
            logger.error(LogDomain.FRAMEWORK, this.missingInterstitialModulesMessage, new Object[0]);
            return null;
        } else if (this.isAllInterstitialModulesPresent) {
            return adFormat2;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<AdFormat> it = this.possibleInterstitialModuleAdFormats.iterator();
            while (it.hasNext()) {
                AdFormat resolveAdFormatByAdPresenterModules = resolveAdFormatByAdPresenterModules(it.next(), logger);
                if (resolveAdFormatByAdPresenterModules != null) {
                    arrayList.add(resolveAdFormatByAdPresenterModules);
                }
            }
            return this.serverAdFormatResolvingFunction.apply(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public boolean isAdPresenterModulePresentsForAdFormat(AdFormat adFormat) {
        for (AdPresenterModuleInterface isFormatSupported : this.validAdPresenterInterfaces) {
            if (isFormatSupported.isFormatSupported(adFormat, InterstitialAdPresenter.class)) {
                return true;
            }
        }
        return false;
    }

    private void addApiAdRequestExtrasByAdPresenterModules(AdFormat adFormat, ApiAdRequestExtras apiAdRequestExtras, Logger logger) {
        AdLoaderPlugin apply;
        for (AdPresenterModuleInterface adPresenterModuleInterface : this.validAdPresenterInterfaces) {
            if (adPresenterModuleInterface.isFormatSupported(adFormat, InterstitialAdPresenter.class) && (apply = this.adLoaderPluginResolvingFunction.apply(adPresenterModuleInterface)) != null) {
                apply.addApiAdRequestExtras(apiAdRequestExtras, logger);
            }
        }
    }

    private AdFormat resolveAdFormatByAdPresenterModules(AdFormat adFormat, Logger logger) {
        AdLoaderPlugin apply;
        for (AdPresenterModuleInterface adPresenterModuleInterface : this.validAdPresenterInterfaces) {
            if (adPresenterModuleInterface.isFormatSupported(adFormat, InterstitialAdPresenter.class) && (apply = this.adLoaderPluginResolvingFunction.apply(adPresenterModuleInterface)) != null) {
                return apply.resolveAdFormatToServerAdFormat(adFormat, logger);
            }
        }
        return null;
    }
}
