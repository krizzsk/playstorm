package com.smaato.sdk.core.framework;

import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiRegistry;

public interface AdPresenterModuleInterface extends BaseModuleInterface {
    ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory();

    ExpectedManifestEntries getExpectedManifestEntries();

    boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls);

    DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper);

    String moduleDiName();

    DiRegistry moduleDiRegistry();

    String version();
}
