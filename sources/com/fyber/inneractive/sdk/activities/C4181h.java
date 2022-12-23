package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;

/* renamed from: com.fyber.inneractive.sdk.activities.h */
public class C4181h implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f10348a;

    public C4181h(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f10348a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f10348a.finish();
    }
}
