package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.hls.-$$Lambda$MediaParserHlsMediaChunkExtractor$SJ03B_qeMhhiX8sHszYTiuofDLM */
/* compiled from: lambda */
public final /* synthetic */ class C5636xddf9d4ff implements HlsExtractorFactory {
    public static final /* synthetic */ C5636xddf9d4ff INSTANCE = new C5636xddf9d4ff();

    private /* synthetic */ C5636xddf9d4ff() {
    }

    public final HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput) {
        return MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput);
    }
}
