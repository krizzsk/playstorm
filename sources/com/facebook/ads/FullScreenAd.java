package com.facebook.ads;

import com.facebook.ads.C4033Ad;

public interface FullScreenAd extends C4033Ad {

    public interface ShowAdConfig {
    }

    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    C4033Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
