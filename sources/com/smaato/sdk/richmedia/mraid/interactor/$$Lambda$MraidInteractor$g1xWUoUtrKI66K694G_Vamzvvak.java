package com.smaato.sdk.richmedia.mraid.interactor;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.richmedia.mraid.interactor.MraidInteractor;

/* renamed from: com.smaato.sdk.richmedia.mraid.interactor.-$$Lambda$MraidInteractor$g1xWUoUtrKI66K694G_Vamzvvak  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MraidInteractor$g1xWUoUtrKI66K694G_Vamzvvak implements Consumer {
    public static final /* synthetic */ $$Lambda$MraidInteractor$g1xWUoUtrKI66K694G_Vamzvvak INSTANCE = new $$Lambda$MraidInteractor$g1xWUoUtrKI66K694G_Vamzvvak();

    private /* synthetic */ $$Lambda$MraidInteractor$g1xWUoUtrKI66K694G_Vamzvvak() {
    }

    public final void accept(Object obj) {
        ((MraidInteractor.Callback) obj).processError(MraidJsMethods.PLAY_VIDEO, "An empty URL received");
    }
}
