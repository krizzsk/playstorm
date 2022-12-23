package com.smaato.sdk.richmedia.mraid.interactor;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.richmedia.mraid.interactor.MraidInteractor;

/* renamed from: com.smaato.sdk.richmedia.mraid.interactor.-$$Lambda$MraidInteractor$RTlfqUP3NpGTc_DIAdT0lJfGyVo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MraidInteractor$RTlfqUP3NpGTc_DIAdT0lJfGyVo implements Consumer {
    public static final /* synthetic */ $$Lambda$MraidInteractor$RTlfqUP3NpGTc_DIAdT0lJfGyVo INSTANCE = new $$Lambda$MraidInteractor$RTlfqUP3NpGTc_DIAdT0lJfGyVo();

    private /* synthetic */ $$Lambda$MraidInteractor$RTlfqUP3NpGTc_DIAdT0lJfGyVo() {
    }

    public final void accept(Object obj) {
        ((MraidInteractor.Callback) obj).processError(MraidJsMethods.RESIZE, "MRAID 3.0 specs violation (4.2.1 Ad States transition: expanded -> resized)");
    }
}
