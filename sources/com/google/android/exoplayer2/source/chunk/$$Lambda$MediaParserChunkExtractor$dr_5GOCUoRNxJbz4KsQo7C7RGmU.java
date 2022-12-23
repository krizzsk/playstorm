package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.chunk.-$$Lambda$MediaParserChunkExtractor$dr_5GOCUoRNxJbz4KsQo7C7RGmU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MediaParserChunkExtractor$dr_5GOCUoRNxJbz4KsQo7C7RGmU implements ChunkExtractor.Factory {
    public static final /* synthetic */ $$Lambda$MediaParserChunkExtractor$dr_5GOCUoRNxJbz4KsQo7C7RGmU INSTANCE = new $$Lambda$MediaParserChunkExtractor$dr_5GOCUoRNxJbz4KsQo7C7RGmU();

    private /* synthetic */ $$Lambda$MediaParserChunkExtractor$dr_5GOCUoRNxJbz4KsQo7C7RGmU() {
    }

    public final ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput) {
        return MediaParserChunkExtractor.lambda$static$0(i, format, z, list, trackOutput);
    }
}
