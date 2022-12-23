package com.smaato.sdk.banner.widget;

import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Function1;
import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.p378ad.AdLoaderException;

/* renamed from: com.smaato.sdk.banner.widget.-$$Lambda$BannerViewLoader$EGelGyU7lbNmC7WIYTj6zHQfIiw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BannerViewLoader$EGelGyU7lbNmC7WIYTj6zHQfIiw implements Function1 {
    public static final /* synthetic */ $$Lambda$BannerViewLoader$EGelGyU7lbNmC7WIYTj6zHQfIiw INSTANCE = new $$Lambda$BannerViewLoader$EGelGyU7lbNmC7WIYTj6zHQfIiw();

    private /* synthetic */ $$Lambda$BannerViewLoader$EGelGyU7lbNmC7WIYTj6zHQfIiw() {
    }

    public final Object apply(Object obj) {
        return Flow.error((Throwable) new AdLoaderException(AdLoader.Error.BAD_REQUEST, new Exception((Throwable) obj)));
    }
}
