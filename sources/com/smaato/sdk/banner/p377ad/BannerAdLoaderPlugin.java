package com.smaato.sdk.banner.p377ad;

import com.smaato.sdk.core.api.AdRequestExtrasProvider;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.ApiAdRequestExtras;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import com.smaato.sdk.core.util.p382fi.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.smaato.sdk.banner.ad.BannerAdLoaderPlugin */
public class BannerAdLoaderPlugin implements AdLoaderPlugin {
    private NullableFunction<AdPresenterModuleInterface, AdLoaderPlugin> adLoaderPluginResolvingFunction;
    private AdRequestExtrasProvider adRequestExtrasProvider;
    private final boolean isAllBannerModulesPresent;
    private final boolean isAtLeastOneBannerModulePresent;
    private final String missingBannerModulesMessage;
    private final ArrayList<AdFormat> possibleBannerModuleAdFormats;
    private final Iterable<? extends AdPresenterModuleInterface> validAdPresenterInterfaces;

    public BannerAdLoaderPlugin(Iterable<? extends AdPresenterModuleInterface> iterable, NullableFunction<AdPresenterModuleInterface, AdLoaderPlugin> nullableFunction, List<AdFormat> list, String str, AdRequestExtrasProvider adRequestExtrasProvider2) {
        ArrayList<AdFormat> arrayList = new ArrayList<>();
        this.possibleBannerModuleAdFormats = arrayList;
        this.validAdPresenterInterfaces = (Iterable) Objects.requireNonNull(iterable);
        this.adLoaderPluginResolvingFunction = nullableFunction;
        arrayList.addAll((Collection) Objects.requireNonNull(list));
        this.isAtLeastOneBannerModulePresent = Lists.any(arrayList, new Predicate() {
            public final boolean test(Object obj) {
                return BannerAdLoaderPlugin.this.isAdPresenterModulePresentsForAdFormat((AdFormat) obj);
            }
        });
        this.isAllBannerModulesPresent = Lists.all(arrayList, new Predicate() {
            public final boolean test(Object obj) {
                return BannerAdLoaderPlugin.this.isAdPresenterModulePresentsForAdFormat((AdFormat) obj);
            }
        });
        this.missingBannerModulesMessage = str;
        this.adRequestExtrasProvider = adRequestExtrasProvider2;
    }

    public AdPresenterBuilder getAdPresenterBuilder(AdFormat adFormat, Class<? extends AdPresenter> cls, Logger logger) {
        AdLoaderPlugin apply;
        AdPresenterBuilder adPresenterBuilder;
        if (!BannerAdPresenter.class.isAssignableFrom(cls)) {
            return null;
        }
        for (AdPresenterModuleInterface adPresenterModuleInterface : this.validAdPresenterInterfaces) {
            if (adPresenterModuleInterface.isFormatSupported(adFormat, BannerAdPresenter.class) && (apply = this.adLoaderPluginResolvingFunction.apply(adPresenterModuleInterface)) != null && (adPresenterBuilder = apply.getAdPresenterBuilder(adFormat, cls, logger)) != null) {
                return adPresenterBuilder;
            }
        }
        return null;
    }

    public void addApiAdRequestExtras(ApiAdRequestExtras apiAdRequestExtras, Logger logger) {
        this.adRequestExtrasProvider.addApiAdRequestExtras(apiAdRequestExtras);
        Iterator<AdFormat> it = this.possibleBannerModuleAdFormats.iterator();
        while (it.hasNext()) {
            addApiAdRequestExtrasByAdPresenterModules(it.next(), apiAdRequestExtras, logger);
        }
    }

    public AdFormat resolveAdFormatToServerAdFormat(AdFormat adFormat, Logger logger) {
        AdFormat adFormat2 = AdFormat.DISPLAY;
        if (adFormat != adFormat2) {
            return resolveAdFormatByAdPresenterModules(adFormat, logger);
        }
        if (!this.isAtLeastOneBannerModulePresent) {
            logger.error(LogDomain.FRAMEWORK, this.missingBannerModulesMessage, new Object[0]);
            return null;
        } else if (this.isAllBannerModulesPresent) {
            return adFormat2;
        } else {
            Iterator<AdFormat> it = this.possibleBannerModuleAdFormats.iterator();
            while (it.hasNext()) {
                AdFormat resolveAdFormatByAdPresenterModules = resolveAdFormatByAdPresenterModules(it.next(), logger);
                if (resolveAdFormatByAdPresenterModules != null) {
                    return resolveAdFormatByAdPresenterModules;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    public boolean isAdPresenterModulePresentsForAdFormat(AdFormat adFormat) {
        for (AdPresenterModuleInterface isFormatSupported : this.validAdPresenterInterfaces) {
            if (isFormatSupported.isFormatSupported(adFormat, BannerAdPresenter.class)) {
                return true;
            }
        }
        return false;
    }

    private void addApiAdRequestExtrasByAdPresenterModules(AdFormat adFormat, ApiAdRequestExtras apiAdRequestExtras, Logger logger) {
        AdLoaderPlugin apply;
        for (AdPresenterModuleInterface adPresenterModuleInterface : this.validAdPresenterInterfaces) {
            if (adPresenterModuleInterface.isFormatSupported(adFormat, BannerAdPresenter.class) && (apply = this.adLoaderPluginResolvingFunction.apply(adPresenterModuleInterface)) != null) {
                apply.addApiAdRequestExtras(apiAdRequestExtras, logger);
            }
        }
    }

    private AdFormat resolveAdFormatByAdPresenterModules(AdFormat adFormat, Logger logger) {
        AdLoaderPlugin apply;
        for (AdPresenterModuleInterface adPresenterModuleInterface : this.validAdPresenterInterfaces) {
            if (adPresenterModuleInterface.isFormatSupported(adFormat, BannerAdPresenter.class) && (apply = this.adLoaderPluginResolvingFunction.apply(adPresenterModuleInterface)) != null) {
                return apply.resolveAdFormatToServerAdFormat(adFormat, logger);
            }
        }
        return null;
    }
}
