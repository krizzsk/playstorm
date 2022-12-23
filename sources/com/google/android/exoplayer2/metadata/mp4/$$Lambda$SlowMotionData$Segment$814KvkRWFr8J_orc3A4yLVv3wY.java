package com.google.android.exoplayer2.metadata.mp4;

import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.metadata.mp4.-$$Lambda$SlowMotionData$Segment$814KvkRWFr8J_orc3A4y-LVv3wY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$SlowMotionData$Segment$814KvkRWFr8J_orc3A4yLVv3wY implements Comparator {
    public static final /* synthetic */ $$Lambda$SlowMotionData$Segment$814KvkRWFr8J_orc3A4yLVv3wY INSTANCE = new $$Lambda$SlowMotionData$Segment$814KvkRWFr8J_orc3A4yLVv3wY();

    private /* synthetic */ $$Lambda$SlowMotionData$Segment$814KvkRWFr8J_orc3A4yLVv3wY() {
    }

    public final int compare(Object obj, Object obj2) {
        return ComparisonChain.start().compare(((SlowMotionData.Segment) obj).startTimeMs, ((SlowMotionData.Segment) obj2).startTimeMs).compare(((SlowMotionData.Segment) obj).endTimeMs, ((SlowMotionData.Segment) obj2).endTimeMs).compare(((SlowMotionData.Segment) obj).speedDivisor, ((SlowMotionData.Segment) obj2).speedDivisor).result();
    }
}
