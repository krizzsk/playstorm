package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.player.VideoPlayerPresenter;

/* renamed from: com.smaato.sdk.video.vast.player.-$$Lambda$kWGw60ziXycWUiyXA1FvlxdP_zo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kWGw60ziXycWUiyXA1FvlxdP_zo implements Consumer {
    public static final /* synthetic */ $$Lambda$kWGw60ziXycWUiyXA1FvlxdP_zo INSTANCE = new $$Lambda$kWGw60ziXycWUiyXA1FvlxdP_zo();

    private /* synthetic */ $$Lambda$kWGw60ziXycWUiyXA1FvlxdP_zo() {
    }

    public final void accept(Object obj) {
        ((VideoPlayerPresenter.Listener) obj).onVideoCompleted();
    }
}
