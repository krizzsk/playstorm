package com.iab.omid.library.oguryco.adsession.media;

import com.adjust.sdk.Constants;

public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL(Constants.NORMAL),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");
    
    private final String playerState;

    private PlayerState(String str) {
        this.playerState = str;
    }

    public final String toString() {
        return this.playerState;
    }
}
