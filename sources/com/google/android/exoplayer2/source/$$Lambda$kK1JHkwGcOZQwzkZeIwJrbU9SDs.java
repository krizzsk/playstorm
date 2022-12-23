package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;

/* renamed from: com.google.android.exoplayer2.source.-$$Lambda$kK1JHkwGcOZQwzkZeIwJrbU9SDs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kK1JHkwGcOZQwzkZeIwJrbU9SDs implements ProgressiveMediaExtractor.Factory {
    public static final /* synthetic */ $$Lambda$kK1JHkwGcOZQwzkZeIwJrbU9SDs INSTANCE = new $$Lambda$kK1JHkwGcOZQwzkZeIwJrbU9SDs();

    private /* synthetic */ $$Lambda$kK1JHkwGcOZQwzkZeIwJrbU9SDs() {
    }

    public final ProgressiveMediaExtractor createProgressiveMediaExtractor() {
        return new MediaParserExtractorAdapter();
    }
}
