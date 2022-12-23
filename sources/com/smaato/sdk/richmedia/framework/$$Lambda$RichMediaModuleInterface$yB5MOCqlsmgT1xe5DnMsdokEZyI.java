package com.smaato.sdk.richmedia.framework;

import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidSupportsProperties;

/* renamed from: com.smaato.sdk.richmedia.framework.-$$Lambda$RichMediaModuleInterface$yB5MOCqlsmgT1xe5DnMsdokEZyI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RichMediaModuleInterface$yB5MOCqlsmgT1xe5DnMsdokEZyI implements Consumer {
    public static final /* synthetic */ $$Lambda$RichMediaModuleInterface$yB5MOCqlsmgT1xe5DnMsdokEZyI INSTANCE = new $$Lambda$RichMediaModuleInterface$yB5MOCqlsmgT1xe5DnMsdokEZyI();

    private /* synthetic */ $$Lambda$RichMediaModuleInterface$yB5MOCqlsmgT1xe5DnMsdokEZyI() {
    }

    public final void accept(Object obj) {
        ((DiRegistry) obj).registerFactory(MraidSupportsProperties.class, $$Lambda$RichMediaModuleInterface$LRbZbhw5oXwhNOcOKQ4E7kLmWIo.INSTANCE);
    }
}
