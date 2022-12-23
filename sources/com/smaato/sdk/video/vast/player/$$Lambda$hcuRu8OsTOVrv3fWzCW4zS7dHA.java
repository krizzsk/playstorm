package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.player.VastVideoPlayer;

/* renamed from: com.smaato.sdk.video.vast.player.-$$Lambda$hcuRu-8OsTOVrv3fWzCW4zS7dHA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hcuRu8OsTOVrv3fWzCW4zS7dHA implements Consumer {
    public static final /* synthetic */ $$Lambda$hcuRu8OsTOVrv3fWzCW4zS7dHA INSTANCE = new $$Lambda$hcuRu8OsTOVrv3fWzCW4zS7dHA();

    private /* synthetic */ $$Lambda$hcuRu8OsTOVrv3fWzCW4zS7dHA() {
    }

    public final void accept(Object obj) {
        ((VastVideoPlayer.EventListener) obj).onClose();
    }
}
