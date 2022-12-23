package com.smaato.sdk.core.framework;

import android.app.Application;
import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;

public interface CoreModuleLoaderInterface extends BaseModuleInterface {
    ExpectedManifestEntries getExpectedManifestEntries();

    void setApplication(Application application);
}
