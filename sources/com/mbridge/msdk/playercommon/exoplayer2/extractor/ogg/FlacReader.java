package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.FlacStreamInfo;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

final class FlacReader extends StreamReader {
    private static final byte AUDIO_PACKET_TYPE = -1;
    private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;
    private static final byte SEEKTABLE_PACKET_TYPE = 3;
    private FlacOggSeeker flacOggSeeker;
    /* access modifiers changed from: private */
    public FlacStreamInfo streamInfo;

    FlacReader() {
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        return parsableByteArray.bytesLeft() >= 5 && parsableByteArray.readUnsignedByte() == 127 && parsableByteArray.readUnsignedInt() == 1179402563;
    }

    /* access modifiers changed from: protected */
    public final void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.streamInfo = null;
            this.flacOggSeeker = null;
        }
    }

    private static boolean isAudioPacket(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final long preparePayload(ParsableByteArray parsableByteArray) {
        if (!isAudioPacket(parsableByteArray.data)) {
            return -1;
        }
        return (long) getFlacFrameBlockSize(parsableByteArray);
    }

    /* access modifiers changed from: protected */
    public final boolean readHeaders(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) throws IOException, InterruptedException {
        byte[] bArr = parsableByteArray.data;
        if (this.streamInfo == null) {
            this.streamInfo = new FlacStreamInfo(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, parsableByteArray.limit());
            copyOfRange[4] = Byte.MIN_VALUE;
            setupData.format = Format.createAudioSampleFormat((String) null, "audio/flac", (String) null, -1, this.streamInfo.bitRate(), this.streamInfo.channels, this.streamInfo.sampleRate, Collections.singletonList(copyOfRange), (DrmInitData) null, 0, (String) null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            FlacOggSeeker flacOggSeeker2 = new FlacOggSeeker();
            this.flacOggSeeker = flacOggSeeker2;
            flacOggSeeker2.parseSeekTable(parsableByteArray);
            return true;
        } else if (!isAudioPacket(bArr)) {
            return true;
        } else {
            FlacOggSeeker flacOggSeeker3 = this.flacOggSeeker;
            if (flacOggSeeker3 != null) {
                flacOggSeeker3.setFirstFrameOffset(j);
                setupData.oggSeeker = this.flacOggSeeker;
            }
            return false;
        }
    }

    private int getFlacFrameBlockSize(ParsableByteArray parsableByteArray) {
        int i;
        int i2;
        int i3 = (parsableByteArray.data[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                break;
            case 6:
            case 7:
                parsableByteArray.skipBytes(4);
                parsableByteArray.readUtf8EncodedLong();
                int readUnsignedByte = i3 == 6 ? parsableByteArray.readUnsignedByte() : parsableByteArray.readUnsignedShort();
                parsableByteArray.setPosition(0);
                return readUnsignedByte + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i3 - 8;
                break;
            default:
                return -1;
        }
        return i << i2;
    }

    private class FlacOggSeeker implements SeekMap, OggSeeker {
        private static final int METADATA_LENGTH_OFFSET = 1;
        private static final int SEEK_POINT_SIZE = 18;
        private long firstFrameOffset = -1;
        private long pendingSeekGranule = -1;
        private long[] seekPointGranules;
        private long[] seekPointOffsets;

        public SeekMap createSeekMap() {
            return this;
        }

        public boolean isSeekable() {
            return true;
        }

        public FlacOggSeeker() {
        }

        public void setFirstFrameOffset(long j) {
            this.firstFrameOffset = j;
        }

        public void parseSeekTable(ParsableByteArray parsableByteArray) {
            parsableByteArray.skipBytes(1);
            int readUnsignedInt24 = parsableByteArray.readUnsignedInt24() / 18;
            this.seekPointGranules = new long[readUnsignedInt24];
            this.seekPointOffsets = new long[readUnsignedInt24];
            for (int i = 0; i < readUnsignedInt24; i++) {
                this.seekPointGranules[i] = parsableByteArray.readLong();
                this.seekPointOffsets[i] = parsableByteArray.readLong();
                parsableByteArray.skipBytes(2);
            }
        }

        public long read(ExtractorInput extractorInput) throws IOException, InterruptedException {
            long j = this.pendingSeekGranule;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.pendingSeekGranule = -1;
            return j2;
        }

        public long startSeek(long j) {
            long convertTimeToGranule = FlacReader.this.convertTimeToGranule(j);
            this.pendingSeekGranule = this.seekPointGranules[Util.binarySearchFloor(this.seekPointGranules, convertTimeToGranule, true, true)];
            return convertTimeToGranule;
        }

        public SeekMap.SeekPoints getSeekPoints(long j) {
            int binarySearchFloor = Util.binarySearchFloor(this.seekPointGranules, FlacReader.this.convertTimeToGranule(j), true, true);
            long convertGranuleToTime = FlacReader.this.convertGranuleToTime(this.seekPointGranules[binarySearchFloor]);
            SeekPoint seekPoint = new SeekPoint(convertGranuleToTime, this.firstFrameOffset + this.seekPointOffsets[binarySearchFloor]);
            if (convertGranuleToTime < j) {
                long[] jArr = this.seekPointGranules;
                if (binarySearchFloor != jArr.length - 1) {
                    int i = binarySearchFloor + 1;
                    return new SeekMap.SeekPoints(seekPoint, new SeekPoint(FlacReader.this.convertGranuleToTime(jArr[i]), this.firstFrameOffset + this.seekPointOffsets[i]));
                }
            }
            return new SeekMap.SeekPoints(seekPoint);
        }

        public long getDurationUs() {
            return FlacReader.this.streamInfo.durationUs();
        }
    }
}
