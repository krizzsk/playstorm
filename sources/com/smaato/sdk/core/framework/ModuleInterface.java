package com.smaato.sdk.core.framework;

import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoaderPlugin;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiRegistry;

public interface ModuleInterface {
    ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory();

    ExpectedManifestEntries getExpectedManifestEntries();

    Class<? extends AdPresenter> getSupportedAdPresenterInterface();

    void init(ClassLoader classLoader);

    boolean isFormatSupported(AdFormat adFormat, Logger logger);

    boolean isInitialised();

    String moduleDiName();

    DiRegistry moduleDiRegistry();

    String version();
}
