package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Function1;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterBuilderException;

/* renamed from: com.smaato.sdk.richmedia.ad.-$$Lambda$RichMediaAdPresenterBuilder$YsEF-HgZn1sVgnFujvD9BNOFxGY */
/* compiled from: lambda */
public final /* synthetic */ class C11228x5f3f1f6b implements Function1 {
    public static final /* synthetic */ C11228x5f3f1f6b INSTANCE = new C11228x5f3f1f6b();

    private /* synthetic */ C11228x5f3f1f6b() {
    }

    public final Object apply(Object obj) {
        return Flow.error((Throwable) new AdPresenterBuilderException(AdPresenterBuilder.Error.GENERIC, (Exception) ((Throwable) obj)));
    }
}
