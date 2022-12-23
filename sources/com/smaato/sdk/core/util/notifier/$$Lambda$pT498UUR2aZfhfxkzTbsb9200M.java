package com.smaato.sdk.core.util.notifier;

import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.util.notifier.-$$Lambda$pT498UUR2aZ-fhfxkzTbsb9200M  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pT498UUR2aZfhfxkzTbsb9200M implements Consumer {
    public static final /* synthetic */ $$Lambda$pT498UUR2aZfhfxkzTbsb9200M INSTANCE = new $$Lambda$pT498UUR2aZfhfxkzTbsb9200M();

    private /* synthetic */ $$Lambda$pT498UUR2aZfhfxkzTbsb9200M() {
    }

    public final void accept(Object obj) {
        ((Timer.Listener) obj).onTimePassed();
    }
}
