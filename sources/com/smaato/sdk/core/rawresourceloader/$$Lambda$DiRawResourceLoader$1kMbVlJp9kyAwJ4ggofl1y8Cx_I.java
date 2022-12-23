package com.smaato.sdk.core.rawresourceloader;

import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.rawresourceloader.-$$Lambda$DiRawResourceLoader$1kMbVlJp9kyAwJ4ggofl1y8Cx_I  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiRawResourceLoader$1kMbVlJp9kyAwJ4ggofl1y8Cx_I implements Consumer {
    public static final /* synthetic */ $$Lambda$DiRawResourceLoader$1kMbVlJp9kyAwJ4ggofl1y8Cx_I INSTANCE = new $$Lambda$DiRawResourceLoader$1kMbVlJp9kyAwJ4ggofl1y8Cx_I();

    private /* synthetic */ $$Lambda$DiRawResourceLoader$1kMbVlJp9kyAwJ4ggofl1y8Cx_I() {
    }

    public final void accept(Object obj) {
        ((DiRegistry) obj).registerSingletonFactory(RawResourceLoader.class, $$Lambda$DiRawResourceLoader$9O3cj9mrQnTOj9IH82dC4O4Z8h0.INSTANCE);
    }
}
