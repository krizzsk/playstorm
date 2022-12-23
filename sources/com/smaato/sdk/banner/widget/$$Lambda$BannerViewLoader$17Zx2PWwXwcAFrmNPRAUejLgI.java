package com.smaato.sdk.banner.widget;

import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Function1;
import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.p378ad.AdLoaderException;

/* renamed from: com.smaato.sdk.banner.widget.-$$Lambda$BannerViewLoader$17Zx2PWwXwcAFrmN--PRAUejLgI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BannerViewLoader$17Zx2PWwXwcAFrmNPRAUejLgI implements Function1 {
    public static final /* synthetic */ $$Lambda$BannerViewLoader$17Zx2PWwXwcAFrmNPRAUejLgI INSTANCE = new $$Lambda$BannerViewLoader$17Zx2PWwXwcAFrmNPRAUejLgI();

    private /* synthetic */ $$Lambda$BannerViewLoader$17Zx2PWwXwcAFrmNPRAUejLgI() {
    }

    public final Object apply(Object obj) {
        return Flow.error((Throwable) new AdLoaderException(AdLoader.Error.BAD_REQUEST, new Exception((Throwable) obj)));
    }
}
