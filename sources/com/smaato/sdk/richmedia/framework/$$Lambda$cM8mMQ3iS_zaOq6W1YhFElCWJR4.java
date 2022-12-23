package com.smaato.sdk.richmedia.framework;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.framework.OrientationChangeWatcher;

/* renamed from: com.smaato.sdk.richmedia.framework.-$$Lambda$cM8mMQ3iS_zaOq6W1YhFElCWJR4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$cM8mMQ3iS_zaOq6W1YhFElCWJR4 implements Consumer {
    public static final /* synthetic */ $$Lambda$cM8mMQ3iS_zaOq6W1YhFElCWJR4 INSTANCE = new $$Lambda$cM8mMQ3iS_zaOq6W1YhFElCWJR4();

    private /* synthetic */ $$Lambda$cM8mMQ3iS_zaOq6W1YhFElCWJR4() {
    }

    public final void accept(Object obj) {
        ((OrientationChangeWatcher.Listener) obj).onOrientationChange();
    }
}
