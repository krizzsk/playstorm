package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.chunk.-$$Lambda$BundledChunkExtractor$hcsWJL5DYVWIyXAFnRKV4t2qwQA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BundledChunkExtractor$hcsWJL5DYVWIyXAFnRKV4t2qwQA implements ChunkExtractor.Factory {
    public static final /* synthetic */ $$Lambda$BundledChunkExtractor$hcsWJL5DYVWIyXAFnRKV4t2qwQA INSTANCE = new $$Lambda$BundledChunkExtractor$hcsWJL5DYVWIyXAFnRKV4t2qwQA();

    private /* synthetic */ $$Lambda$BundledChunkExtractor$hcsWJL5DYVWIyXAFnRKV4t2qwQA() {
    }

    public final ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput) {
        return BundledChunkExtractor.lambda$static$0(i, format, z, list, trackOutput);
    }
}
