package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;

/* renamed from: com.inmobi.media.c */
/* compiled from: BannerRefreshHandler */
public final class C5912c extends Handler {

    /* renamed from: a */
    private static final String f14969a = C5912c.class.getSimpleName();

    /* renamed from: b */
    private InMobiBanner f14970b;

    public C5912c(InMobiBanner inMobiBanner) {
        this.f14970b = inMobiBanner;
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            int i = message.what;
            return;
        }
        InMobiBanner inMobiBanner = this.f14970b;
        inMobiBanner.mo56308a((PublisherCallbacks) inMobiBanner.f19345e, true);
    }
}
