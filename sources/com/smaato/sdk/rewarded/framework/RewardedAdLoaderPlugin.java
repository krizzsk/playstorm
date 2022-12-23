package com.smaato.sdk.rewarded.framework;

import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.ApiAdRequestExtras;
import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import java.util.List;

public class RewardedAdLoaderPlugin implements AdLoaderPlugin {
    private static final List<AdFormat> POSSIBLE_REWARDED_MODULE_AD_FORMATS = Lists.toImmutableListOf(AdFormat.VIDEO, AdFormat.CSM);
    private NullableFunction<AdPresenterModuleInterface, AdLoaderPlugin> adLoaderPluginResolvingFunction;
    private final boolean isAtLeastOneRewardedModulePresent = isAdPresenterModulePresentsForAdFormat(AdFormat.VIDEO);
    private final String missingRewardedModulesMessage;
    private final Iterable<? extends AdPresenterModuleInterface> validAdPresenterInterfaces;
    private final AdRequestExtrasProvider videoApiAdRequestExtrasProvider;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.NullableFunction<com.smaato.sdk.core.framework.AdPresenterModuleInterface, com.smaato.sdk.core.ad.AdLoaderPlugin>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    RewardedAdLoaderPlugin(java.lang.Iterable<? extends com.smaato.sdk.core.framework.AdPresenterModuleInterface> r1, com.smaato.sdk.core.util.p382fi.NullableFunction<com.smaato.sdk.core.framework.AdPresenterModuleInterface, com.smaato.sdk.core.p378ad.AdLoaderPlugin> r2, com.smaato.sdk.core.api.AdRequestExtrasProvider r3, java.lang.String r4) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r0.validAdPresenterInterfaces = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.core.util.fi.NullableFunction r1 = (com.smaato.sdk.core.util.p382fi.NullableFunction) r1
            r0.adLoaderPluginResolvingFunction = r1
            com.smaato.sdk.core.ad.AdFormat r1 = com.smaato.sdk.core.p378ad.AdFormat.VIDEO
            boolean r1 = r0.isAdPresenterModulePresentsForAdFormat(r1)
            r0.isAtLeastOneRewardedModulePresent = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.api.AdRequestExtrasProvider r1 = (com.smaato.sdk.core.api.AdRequestExtrasProvider) r1
            r0.videoApiAdRequestExtrasProvider = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            java.lang.String r1 = (java.lang.String) r1
            r0.missingRewardedModulesMessage = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.rewarded.framework.RewardedAdLoaderPlugin.<init>(java.lang.Iterable, com.smaato.sdk.core.util.fi.NullableFunction, com.smaato.sdk.core.api.AdRequestExtrasProvider, java.lang.String):void");
    }

    public AdPresenterBuilder getAdPresenterBuilder(AdFormat adFormat, Class<? extends AdPresenter> cls, Logger logger) {
        AdLoaderPlugin apply;
        AdPresenterBuilder adPresenterBuilder;
        if (!RewardedAdPresenter.class.isAssignableFrom(cls)) {
            return null;
        }
        for (AdPresenterModuleInterface adPresenterModuleInterface : this.validAdPresenterInterfaces) {
            if (adPresenterModuleInterface.isFormatSupported(adFormat, RewardedAdPresenter.class) && (apply = this.adLoaderPluginResolvingFunction.apply(adPresenterModuleInterface)) != null && (adPresenterBuilder = apply.getAdPresenterBuilder(adFormat, cls, logger)) != null) {
                return adPresenterBuilder;
            }
        }
        return null;
    }

    public void addApiAdRequestExtras(ApiAdRequestExtras apiAdRequestExtras, Logger logger) {
        this.videoApiAdRequestExtrasProvider.addApiAdRequestExtras(apiAdRequestExtras);
        for (AdFormat addApiAdRequestExtrasByAdPresenterModules : POSSIBLE_REWARDED_MODULE_AD_FORMATS) {
            addApiAdRequestExtrasByAdPresenterModules(addApiAdRequestExtrasByAdPresenterModules, apiAdRequestExtras, logger);
        }
    }

    public AdFormat resolveAdFormatToServerAdFormat(AdFormat adFormat, Logger logger) {
        AdFormat adFormat2 = AdFormat.VIDEO;
        if (adFormat != adFormat2) {
            return resolveAdFormatByAdPresenterModules(adFormat, logger);
        }
        if (this.isAtLeastOneRewardedModulePresent) {
            return adFormat2;
        }
        logger.error(LogDomain.FRAMEWORK, this.missingRewardedModulesMessage, new Object[0]);
        return null;
    }

    private boolean isAdPresenterModulePresentsForAdFormat(AdFormat adFormat) {
        for (AdPresenterModuleInterface isFormatSupported : this.validAdPresenterInterfaces) {
            if (isFormatSupported.isFormatSupported(adFormat, RewardedAdPresenter.class)) {
                return true;
            }
        }
        return false;
    }

    private void addApiAdRequestExtrasByAdPresenterModules(AdFormat adFormat, ApiAdRequestExtras apiAdRequestExtras, Logger logger) {
        AdLoaderPlugin apply;
        for (AdPresenterModuleInterface adPresenterModuleInterface : this.validAdPresenterInterfaces) {
            if (adPresenterModuleInterface.isFormatSupported(adFormat, RewardedAdPresenter.class) && (apply = this.adLoaderPluginResolvingFunction.apply(adPresenterModuleInterface)) != null) {
                apply.addApiAdRequestExtras(apiAdRequestExtras, logger);
            }
        }
    }

    private AdFormat resolveAdFormatByAdPresenterModules(AdFormat adFormat, Logger logger) {
        AdLoaderPlugin apply;
        for (AdPresenterModuleInterface adPresenterModuleInterface : this.validAdPresenterInterfaces) {
            if (adPresenterModuleInterface.isFormatSupported(adFormat, RewardedAdPresenter.class) && (apply = this.adLoaderPluginResolvingFunction.apply(adPresenterModuleInterface)) != null) {
                return apply.resolveAdFormatToServerAdFormat(adFormat, logger);
            }
        }
        return null;
    }
}
