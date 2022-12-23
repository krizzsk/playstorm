package com.mbridge.msdk.playercommon.exoplayer2.extractor.p340ts;

import android.util.Pair;
import com.google.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.p340ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.H262Reader */
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private final CsdBuffer csdBuffer = new CsdBuffer(128);
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags = new boolean[4];
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;

    public final void packetFinished() {
    }

    public final void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        this.totalBytesWritten = 0;
        this.startedFirstSample = false;
    }

    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
    }

    public final void packetStarted(long j, boolean z) {
        this.pesTimeUs = j;
    }

    public final void consume(ParsableByteArray parsableByteArray) {
        boolean z;
        boolean z2;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] bArr = parsableByteArray2.data;
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray2, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = NalUnitUtil.findNalUnit(bArr, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                break;
            }
            int i = findNalUnit + 3;
            byte b = parsableByteArray2.data[i] & 255;
            if (!this.hasOutputFormat) {
                int i2 = findNalUnit - position;
                if (i2 > 0) {
                    this.csdBuffer.onData(bArr, position, findNalUnit);
                }
                if (this.csdBuffer.onStartCode(b, i2 < 0 ? -i2 : 0)) {
                    Pair<Format, Long> parseCsdBuffer = parseCsdBuffer(this.csdBuffer, this.formatId);
                    this.output.format((Format) parseCsdBuffer.first);
                    this.frameDurationUs = ((Long) parseCsdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            if (b == 0 || b == START_SEQUENCE_HEADER) {
                int i3 = limit - findNalUnit;
                if (this.startedFirstSample && this.sampleHasPicture && this.hasOutputFormat) {
                    this.output.sampleMetadata(this.sampleTimeUs, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i3, i3, (TrackOutput.CryptoData) null);
                }
                if (!this.startedFirstSample || this.sampleHasPicture) {
                    this.samplePosition = this.totalBytesWritten - ((long) i3);
                    long j = this.pesTimeUs;
                    if (j == -9223372036854775807L) {
                        j = this.startedFirstSample ? this.sampleTimeUs + this.frameDurationUs : 0;
                    }
                    this.sampleTimeUs = j;
                    z2 = false;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = -9223372036854775807L;
                    z = true;
                    this.startedFirstSample = true;
                } else {
                    z2 = false;
                    z = true;
                }
                this.sampleHasPicture = b == 0 ? z : z2;
            } else if (b == START_GROUP) {
                this.sampleIsKeyframe = true;
            }
            position = i;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(bArr, position, limit);
        }
    }

    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer2, String str) {
        int i;
        float f;
        float f2;
        CsdBuffer csdBuffer3 = csdBuffer2;
        byte[] copyOf = Arrays.copyOf(csdBuffer3.data, csdBuffer3.length);
        byte b = copyOf[5] & 255;
        int i2 = ((copyOf[4] & 255) << 4) | (b >> 4);
        byte b2 = ((b & Ascii.f17944SI) << 8) | (copyOf[6] & 255);
        int i3 = (copyOf[7] & 240) >> 4;
        if (i3 != 2) {
            if (i3 == 3) {
                f = (float) (b2 * Ascii.DLE);
                i = i2 * 9;
            } else if (i3 != 4) {
                f2 = 1.0f;
            } else {
                f = (float) (b2 * 121);
                i = i2 * 100;
            }
            f2 = f / ((float) i);
        } else {
            f = (float) (b2 * 4);
            i = i2 * 3;
            f2 = f / ((float) i);
        }
        Format createVideoSampleFormat = Format.createVideoSampleFormat(str, "video/mpeg2", (String) null, -1, -1, i2, b2, -1.0f, Collections.singletonList(copyOf), -1, f2, (DrmInitData) null);
        long j = 0;
        int i4 = (copyOf[7] & Ascii.f17944SI) - 1;
        if (i4 >= 0) {
            double[] dArr = FRAME_RATE_VALUES;
            if (i4 < dArr.length) {
                double d = dArr[i4];
                int i5 = csdBuffer3.sequenceExtensionPosition + 9;
                int i6 = (copyOf[i5] & 96) >> 5;
                byte b3 = copyOf[i5] & Ascii.f17947US;
                if (i6 != b3) {
                    d *= (((double) i6) + 1.0d) / ((double) (b3 + 1));
                }
                j = (long) (1000000.0d / d);
            }
        }
        return Pair.create(createVideoSampleFormat, Long.valueOf(j));
    }

    /* renamed from: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.H262Reader$CsdBuffer */
    private static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i) {
            this.data = new byte[i];
        }

        public final void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }

        public final boolean onStartCode(int i, int i2) {
            if (this.isFilling) {
                int i3 = this.length - i2;
                this.length = i3;
                if (this.sequenceExtensionPosition == 0 && i == H262Reader.START_EXTENSION) {
                    this.sequenceExtensionPosition = i3;
                } else {
                    this.isFilling = false;
                    return true;
                }
            } else if (i == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public final void onData(byte[] bArr, int i, int i2) {
            if (this.isFilling) {
                int i3 = i2 - i;
                byte[] bArr2 = this.data;
                int length2 = bArr2.length;
                int i4 = this.length;
                if (length2 < i4 + i3) {
                    this.data = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.data, this.length, i3);
                this.length += i3;
            }
        }
    }
}
