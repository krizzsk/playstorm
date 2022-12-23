package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.ad.-$$Lambda$AdLoader$VGMbGdMRP7IPBytK4r2U3JgAH20  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$AdLoader$VGMbGdMRP7IPBytK4r2U3JgAH20 implements Consumer {
    public static final /* synthetic */ $$Lambda$AdLoader$VGMbGdMRP7IPBytK4r2U3JgAH20 INSTANCE = new $$Lambda$AdLoader$VGMbGdMRP7IPBytK4r2U3JgAH20();

    private /* synthetic */ $$Lambda$AdLoader$VGMbGdMRP7IPBytK4r2U3JgAH20() {
    }

    public final void accept(Object obj) {
        ((AdLoader.AdRequestHolder) obj).call.cancel();
    }
}
