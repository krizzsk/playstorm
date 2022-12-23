package com.fyber.inneractive.sdk.player.mediaplayer;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.c */
public class C5091c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5076a f13617a;

    public C5091c(C5076a aVar) {
        this.f13617a = aVar;
    }

    public void run() {
        C5076a aVar = this.f13617a;
        String c = aVar.mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) aVar.f13579a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        IAlog.m16699a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", aVar.mo25690c(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        aVar.setVolume(f, f);
        IAlog.m16702d(c + "timelog: " + "unmute" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
