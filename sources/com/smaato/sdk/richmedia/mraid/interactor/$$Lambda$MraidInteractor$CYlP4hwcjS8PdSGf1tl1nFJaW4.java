package com.smaato.sdk.richmedia.mraid.interactor;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.richmedia.mraid.interactor.MraidInteractor;

/* renamed from: com.smaato.sdk.richmedia.mraid.interactor.-$$Lambda$MraidInteractor$CYlP4hwcjS-8PdSGf1tl1nFJaW4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MraidInteractor$CYlP4hwcjS8PdSGf1tl1nFJaW4 implements Consumer {
    public static final /* synthetic */ $$Lambda$MraidInteractor$CYlP4hwcjS8PdSGf1tl1nFJaW4 INSTANCE = new $$Lambda$MraidInteractor$CYlP4hwcjS8PdSGf1tl1nFJaW4();

    private /* synthetic */ $$Lambda$MraidInteractor$CYlP4hwcjS8PdSGf1tl1nFJaW4() {
    }

    public final void accept(Object obj) {
        ((MraidInteractor.Callback) obj).processError(MraidJsMethods.RESIZE, "Resize properties should be set before resize");
    }
}
