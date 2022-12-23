package com.mbridge.msdk.playercommon;

import com.mbridge.msdk.foundation.tools.C8608u;

public class DefaultVideoPlayerStatusListener implements VideoPlayerStatusListener {
    protected static final String TAG = "DefaultVideoPlayerStatusListener";

    public void onPlayStarted(int i) {
        C8608u.m24880a(TAG, "onPlayStarted:" + i);
    }

    public void onPlayCompleted() {
        C8608u.m24880a(TAG, "onPlayCompleted");
    }

    public void onPlayError(String str) {
        C8608u.m24880a(TAG, "onPlayError:" + str);
    }

    public void onPlayProgress(int i, int i2) {
        C8608u.m24880a(TAG, "onPlayProgress:" + i + ",allDuration:" + i2);
    }

    public void onBufferingStart(String str) {
        C8608u.m24880a(TAG, "OnBufferingStart:" + str);
    }

    public void onBufferingEnd() {
        C8608u.m24880a(TAG, "OnBufferingEnd");
    }

    public void onPlaySetDataSourceError(String str) {
        C8608u.m24880a(TAG, "onPlaySetDataSourceError:" + str);
    }

    public void onPlayProgressMS(int i, int i2) {
        C8608u.m24880a(TAG, "onPlayProgressMS:");
    }
}
