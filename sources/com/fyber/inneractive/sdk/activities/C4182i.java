package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.activities.i */
public class C4182i implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f10349a;

    public C4182i(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f10349a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m16699a("Error: video can not be played.", new Object[0]);
        this.f10349a.finish();
        return false;
    }
}
