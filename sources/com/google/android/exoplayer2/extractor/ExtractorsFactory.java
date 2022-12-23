package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = $$Lambda$ExtractorsFactory$CehnqwqJF4uRY8luGzji5IUgWC0.INSTANCE;

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[0];
    }

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }
}
