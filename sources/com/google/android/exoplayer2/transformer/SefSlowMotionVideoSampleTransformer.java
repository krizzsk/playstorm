package com.google.android.exoplayer2.transformer;

import com.google.android.exoplayer2.C5487C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class SefSlowMotionVideoSampleTransformer implements SampleTransformer {
    static final int INPUT_FRAME_RATE = 30;
    private static final int NAL_START_CODE_LENGTH = NalUnitUtil.NAL_START_CODE.length;
    private static final int NAL_UNIT_TYPE_PREFIX = 14;
    private static final int TARGET_OUTPUT_FRAME_RATE = 30;
    private final float captureFrameRate;
    private SegmentInfo currentSegmentInfo;
    private long frameTimeDeltaUs;
    private final int inputMaxLayer;
    private SegmentInfo nextSegmentInfo;
    private final int normalSpeedMaxLayer;
    private final byte[] scratch = new byte[NAL_START_CODE_LENGTH];
    private final Iterator<SlowMotionData.Segment> segmentIterator;
    private final SlowMotionData slowMotionData;

    private static final class MetadataInfo {
        public float captureFrameRate = -3.4028235E38f;
        public int inputMaxLayer = -1;
        public int normalSpeedMaxLayer = -1;
        public SlowMotionData slowMotionData;
    }

    public SefSlowMotionVideoSampleTransformer(Format format) {
        MetadataInfo metadataInfo = getMetadataInfo(format.metadata);
        SlowMotionData slowMotionData2 = metadataInfo.slowMotionData;
        this.slowMotionData = slowMotionData2;
        this.segmentIterator = (slowMotionData2 != null ? slowMotionData2.segments : ImmutableList.m20745of()).iterator();
        this.captureFrameRate = metadataInfo.captureFrameRate;
        this.inputMaxLayer = metadataInfo.inputMaxLayer;
        this.normalSpeedMaxLayer = metadataInfo.normalSpeedMaxLayer;
        this.nextSegmentInfo = this.segmentIterator.hasNext() ? new SegmentInfo(this.segmentIterator.next(), this.inputMaxLayer, this.normalSpeedMaxLayer) : null;
        if (this.slowMotionData != null) {
            boolean equals = "video/avc".equals(format.sampleMimeType);
            String valueOf = String.valueOf(format.sampleMimeType);
            Assertions.checkArgument(equals, valueOf.length() != 0 ? "Unsupported MIME type for SEF slow motion video track: ".concat(valueOf) : new String("Unsupported MIME type for SEF slow motion video track: "));
        }
    }

    public void transformSample(DecoderInputBuffer decoderInputBuffer) {
        if (this.slowMotionData != null) {
            ByteBuffer byteBuffer = (ByteBuffer) Util.castNonNull(decoderInputBuffer.data);
            byteBuffer.position(byteBuffer.position() + NAL_START_CODE_LENGTH);
            boolean z = false;
            byteBuffer.get(this.scratch, 0, 4);
            byte[] bArr = this.scratch;
            byte b = bArr[0] & Ascii.f17947US;
            boolean z2 = ((bArr[1] & 255) >> 7) == 1;
            if (b == 14 && z2) {
                z = true;
            }
            Assertions.checkState(z, "Missing SVC extension prefix NAL unit.");
            if (processCurrentFrame((this.scratch[3] & 255) >> 5, decoderInputBuffer.timeUs)) {
                decoderInputBuffer.timeUs = getCurrentFrameOutputTimeUs(decoderInputBuffer.timeUs);
                skipToNextNalUnit(byteBuffer);
                return;
            }
            decoderInputBuffer.data = null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean processCurrentFrame(int i, long j) {
        while (true) {
            SegmentInfo segmentInfo = this.nextSegmentInfo;
            if (segmentInfo == null || j < segmentInfo.endTimeUs) {
                SegmentInfo segmentInfo2 = this.nextSegmentInfo;
            } else {
                enterNextSegment();
            }
        }
        SegmentInfo segmentInfo22 = this.nextSegmentInfo;
        if (segmentInfo22 == null || j < segmentInfo22.startTimeUs) {
            SegmentInfo segmentInfo3 = this.currentSegmentInfo;
            if (segmentInfo3 != null && j >= segmentInfo3.endTimeUs) {
                leaveCurrentSegment();
            }
        } else {
            enterNextSegment();
        }
        SegmentInfo segmentInfo4 = this.currentSegmentInfo;
        return i <= (segmentInfo4 != null ? segmentInfo4.maxLayer : this.normalSpeedMaxLayer) || shouldKeepFrameForOutputValidity(i, j);
    }

    private void enterNextSegment() {
        if (this.currentSegmentInfo != null) {
            leaveCurrentSegment();
        }
        this.currentSegmentInfo = this.nextSegmentInfo;
        this.nextSegmentInfo = this.segmentIterator.hasNext() ? new SegmentInfo(this.segmentIterator.next(), this.inputMaxLayer, this.normalSpeedMaxLayer) : null;
    }

    @RequiresNonNull({"currentSegmentInfo"})
    private void leaveCurrentSegment() {
        this.frameTimeDeltaUs += (this.currentSegmentInfo.endTimeUs - this.currentSegmentInfo.startTimeUs) * ((long) (this.currentSegmentInfo.speedDivisor - 1));
        this.currentSegmentInfo = null;
    }

    private boolean shouldKeepFrameForOutputValidity(int i, long j) {
        SegmentInfo segmentInfo = this.nextSegmentInfo;
        if (segmentInfo != null && i < segmentInfo.maxLayer) {
            long j2 = ((this.nextSegmentInfo.startTimeUs - j) * 30) / 1000000;
            float f = ((float) (-(1 << (this.inputMaxLayer - this.nextSegmentInfo.maxLayer)))) + 0.45f;
            int i2 = 1;
            while (i2 < this.nextSegmentInfo.maxLayer && ((float) j2) < ((float) (1 << (this.inputMaxLayer - i2))) + f) {
                if (i <= i2) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public long getCurrentFrameOutputTimeUs(long j) {
        long j2 = this.frameTimeDeltaUs + j;
        SegmentInfo segmentInfo = this.currentSegmentInfo;
        if (segmentInfo != null) {
            j2 += (j - segmentInfo.startTimeUs) * ((long) (this.currentSegmentInfo.speedDivisor - 1));
        }
        return (long) Math.round(((float) (j2 * 30)) / this.captureFrameRate);
    }

    private void skipToNextNalUnit(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        while (true) {
            int remaining = byteBuffer.remaining();
            int i = NAL_START_CODE_LENGTH;
            if (remaining >= i) {
                byteBuffer.get(this.scratch, 0, i);
                if (Arrays.equals(this.scratch, NalUnitUtil.NAL_START_CODE)) {
                    byteBuffer.position(position);
                    return;
                } else {
                    position++;
                    byteBuffer.position(position);
                }
            } else {
                throw new IllegalStateException("Could not find NAL unit start code.");
            }
        }
    }

    private static MetadataInfo getMetadataInfo(Metadata metadata) {
        MetadataInfo metadataInfo = new MetadataInfo();
        if (metadata == null) {
            return metadataInfo;
        }
        boolean z = false;
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof SmtaMetadataEntry) {
                SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) entry;
                metadataInfo.captureFrameRate = smtaMetadataEntry.captureFrameRate;
                metadataInfo.inputMaxLayer = smtaMetadataEntry.svcTemporalLayerCount - 1;
            } else if (entry instanceof SlowMotionData) {
                metadataInfo.slowMotionData = (SlowMotionData) entry;
            }
        }
        if (metadataInfo.slowMotionData == null) {
            return metadataInfo;
        }
        Assertions.checkState(metadataInfo.inputMaxLayer != -1, "SVC temporal layer count not found.");
        Assertions.checkState(metadataInfo.captureFrameRate != -3.4028235E38f, "Capture frame rate not found.");
        boolean z2 = metadataInfo.captureFrameRate % 1.0f == 0.0f && metadataInfo.captureFrameRate % 30.0f == 0.0f;
        float f = metadataInfo.captureFrameRate;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Invalid capture frame rate: ");
        sb.append(f);
        Assertions.checkState(z2, sb.toString());
        int i2 = ((int) metadataInfo.captureFrameRate) / 30;
        int i3 = metadataInfo.inputMaxLayer;
        while (true) {
            if (i3 < 0) {
                break;
            } else if ((i2 & 1) == 1) {
                if ((i2 >> 1) == 0) {
                    z = true;
                }
                float f2 = metadataInfo.captureFrameRate;
                StringBuilder sb2 = new StringBuilder(84);
                sb2.append("Could not compute normal speed max SVC layer for capture frame rate  ");
                sb2.append(f2);
                Assertions.checkState(z, sb2.toString());
                metadataInfo.normalSpeedMaxLayer = i3;
            } else {
                i2 >>= 1;
                i3--;
            }
        }
        return metadataInfo;
    }

    private static final class SegmentInfo {
        public final long endTimeUs;
        public final int maxLayer;
        public final int speedDivisor;
        public final long startTimeUs;

        public SegmentInfo(SlowMotionData.Segment segment, int i, int i2) {
            this.startTimeUs = C5487C.msToUs(segment.startTimeMs);
            this.endTimeUs = C5487C.msToUs(segment.endTimeMs);
            int i3 = segment.speedDivisor;
            this.speedDivisor = i3;
            this.maxLayer = getSlowMotionMaxLayer(i3, i, i2);
        }

        private static int getSlowMotionMaxLayer(int i, int i2, int i3) {
            int i4 = i;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                boolean z = true;
                if ((i4 & 1) == 1) {
                    if ((i4 >> 1) != 0) {
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Invalid speed divisor: ");
                    sb.append(i);
                    Assertions.checkState(z, sb.toString());
                } else {
                    i3++;
                    i4 >>= 1;
                }
            }
            return Math.min(i3, i2);
        }
    }
}
