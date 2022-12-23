package com.vungle.warren.utility.platform;

import androidx.core.util.Consumer;

public interface Platform {
    boolean getIsBatterySaverEnabled();

    boolean getIsSDCardPresent();

    boolean getIsSideloaded();

    boolean getIsSoundEnabled();

    String getUserAgent();

    void getUserAgentLazy(Consumer<String> consumer);

    double getVolumeLevel();

    boolean isAtLeastMinimumSDK();
}
