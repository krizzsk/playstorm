package com.smaato.sdk.richmedia.mraid.interactor;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.interactor.MraidInteractor;

/* renamed from: com.smaato.sdk.richmedia.mraid.interactor.-$$Lambda$MraidInteractor$xNgCqaPa-YpwWrmNzhN7f-5WPL4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MraidInteractor$xNgCqaPaYpwWrmNzhN7f5WPL4 implements Consumer {
    public static final /* synthetic */ $$Lambda$MraidInteractor$xNgCqaPaYpwWrmNzhN7f5WPL4 INSTANCE = new $$Lambda$MraidInteractor$xNgCqaPaYpwWrmNzhN7f5WPL4();

    private /* synthetic */ $$Lambda$MraidInteractor$xNgCqaPaYpwWrmNzhN7f5WPL4() {
    }

    public final void accept(Object obj) {
        ((MraidInteractor.Callback) obj).processError("open", "An empty URL received");
    }
}
