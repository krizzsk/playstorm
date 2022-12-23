package com.smaato.sdk.core.p378ad;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;

/* renamed from: com.smaato.sdk.core.ad.-$$Lambda$DiAdLayer$qS1hwS1jvq0hYodhyB4I3SsxbDM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiAdLayer$qS1hwS1jvq0hYodhyB4I3SsxbDM implements ClassFactory {
    public static final /* synthetic */ $$Lambda$DiAdLayer$qS1hwS1jvq0hYodhyB4I3SsxbDM INSTANCE = new $$Lambda$DiAdLayer$qS1hwS1jvq0hYodhyB4I3SsxbDM();

    private /* synthetic */ $$Lambda$DiAdLayer$qS1hwS1jvq0hYodhyB4I3SsxbDM() {
    }

    public final Object get(DiConstructor diConstructor) {
        return PreferenceManager.getDefaultSharedPreferences((Context) diConstructor.get(Application.class));
    }
}
