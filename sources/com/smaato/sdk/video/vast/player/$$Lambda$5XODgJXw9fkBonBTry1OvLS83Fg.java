package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.player.VastVideoPlayer;

/* renamed from: com.smaato.sdk.video.vast.player.-$$Lambda$5XODgJXw9fkBonBTry1OvLS83Fg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$5XODgJXw9fkBonBTry1OvLS83Fg implements Consumer {
    public static final /* synthetic */ $$Lambda$5XODgJXw9fkBonBTry1OvLS83Fg INSTANCE = new $$Lambda$5XODgJXw9fkBonBTry1OvLS83Fg();

    private /* synthetic */ $$Lambda$5XODgJXw9fkBonBTry1OvLS83Fg() {
    }

    public final void accept(Object obj) {
        ((VastVideoPlayer.EventListener) obj).onComplete();
    }
}
