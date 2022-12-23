package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.source.dash.-$$Lambda$BaseUrlExclusionList$O5NepfxamIhaXY9wk2v9r4wazhY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BaseUrlExclusionList$O5NepfxamIhaXY9wk2v9r4wazhY implements Comparator {
    public static final /* synthetic */ $$Lambda$BaseUrlExclusionList$O5NepfxamIhaXY9wk2v9r4wazhY INSTANCE = new $$Lambda$BaseUrlExclusionList$O5NepfxamIhaXY9wk2v9r4wazhY();

    private /* synthetic */ $$Lambda$BaseUrlExclusionList$O5NepfxamIhaXY9wk2v9r4wazhY() {
    }

    public final int compare(Object obj, Object obj2) {
        return BaseUrlExclusionList.compareBaseUrl((BaseUrl) obj, (BaseUrl) obj2);
    }
}
