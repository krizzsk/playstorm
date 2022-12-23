package com.smaato.sdk.image.framework;

import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import java.util.concurrent.Executors;

/* renamed from: com.smaato.sdk.image.framework.-$$Lambda$ImageModuleInterface$tdgxTXP9jvqG3gj_LU0Lnsqku7g  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ImageModuleInterface$tdgxTXP9jvqG3gj_LU0Lnsqku7g implements ClassFactory {
    public static final /* synthetic */ $$Lambda$ImageModuleInterface$tdgxTXP9jvqG3gj_LU0Lnsqku7g INSTANCE = new $$Lambda$ImageModuleInterface$tdgxTXP9jvqG3gj_LU0Lnsqku7g();

    private /* synthetic */ $$Lambda$ImageModuleInterface$tdgxTXP9jvqG3gj_LU0Lnsqku7g() {
    }

    public final Object get(DiConstructor diConstructor) {
        return Executors.newFixedThreadPool(2);
    }
}
