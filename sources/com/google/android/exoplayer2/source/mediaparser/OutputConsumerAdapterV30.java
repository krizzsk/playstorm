package com.google.android.exoplayer2.source.mediaparser;

import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DummyExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.collect.ImmutableList;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class OutputConsumerAdapterV30 implements MediaParser.OutputConsumer {
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final Pattern REGEX_CRYPTO_INFO_PATTERN = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> SEEK_POINT_PAIR_START = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);
    private static final String TAG = "OutputConsumerAdapterV30";
    private String containerMimeType;
    private MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private ExtractorOutput extractorOutput;
    private ChunkIndex lastChunkIndex;
    private final ArrayList<TrackOutput.CryptoData> lastOutputCryptoDatas;
    private final ArrayList<MediaCodec.CryptoInfo> lastReceivedCryptoInfos;
    private MediaParser.SeekMap lastSeekMap;
    private List<Format> muxedCaptionFormats;
    private int primaryTrackIndex;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;
    private TimestampAdjuster timestampAdjuster;
    private final ArrayList<Format> trackFormats;
    private final ArrayList<TrackOutput> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;

    public OutputConsumerAdapterV30() {
        this((Format) null, 7, false);
    }

    public OutputConsumerAdapterV30(Format format, int i, boolean z) {
        this.expectDummySeekMap = z;
        this.primaryTrackManifestFormat = format;
        this.primaryTrackType = i;
        this.trackOutputs = new ArrayList<>();
        this.trackFormats = new ArrayList<>();
        this.lastReceivedCryptoInfos = new ArrayList<>();
        this.lastOutputCryptoDatas = new ArrayList<>();
        this.scratchDataReaderAdapter = new DataReaderAdapter();
        this.extractorOutput = new DummyExtractorOutput();
        this.sampleTimestampUpperLimitFilterUs = -9223372036854775807L;
        this.muxedCaptionFormats = ImmutableList.m20745of();
    }

    public void setSampleTimestampUpperLimitFilterUs(long j) {
        this.sampleTimestampUpperLimitFilterUs = j;
    }

    public void setTimestampAdjuster(TimestampAdjuster timestampAdjuster2) {
        this.timestampAdjuster = timestampAdjuster2;
    }

    public void setExtractorOutput(ExtractorOutput extractorOutput2) {
        this.extractorOutput = extractorOutput2;
    }

    public void setMuxedCaptionFormats(List<Format> list) {
        this.muxedCaptionFormats = list;
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    public MediaParser.SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    public ChunkIndex getChunkIndex() {
        return this.lastChunkIndex;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long j) {
        MediaParser.SeekMap seekMap = this.lastSeekMap;
        return seekMap != null ? seekMap.getSeekPoints(j) : SEEK_POINT_PAIR_START;
    }

    public void setSelectedParserName(String str) {
        this.containerMimeType = getMimeType(str);
    }

    public Format[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        Format[] formatArr = new Format[this.trackFormats.size()];
        for (int i = 0; i < this.trackFormats.size(); i++) {
            formatArr[i] = (Format) Assertions.checkNotNull(this.trackFormats.get(i));
        }
        return formatArr;
    }

    public void onTrackCountFound(int i) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        SeekMap seekMap2;
        if (!this.expectDummySeekMap || this.dummySeekMap != null) {
            this.lastSeekMap = seekMap;
            long durationMicros = seekMap.getDurationMicros();
            ExtractorOutput extractorOutput2 = this.extractorOutput;
            if (this.seekingDisabled) {
                if (durationMicros == -2147483648L) {
                    durationMicros = -9223372036854775807L;
                }
                seekMap2 = new SeekMap.Unseekable(durationMicros);
            } else {
                seekMap2 = new SeekMapAdapter(seekMap);
            }
            extractorOutput2.seekMap(seekMap2);
            return;
        }
        this.dummySeekMap = seekMap;
    }

    public void onTrackDataFound(int i, MediaParser.TrackData trackData) {
        String str;
        if (!maybeObtainChunkIndex(trackData.mediaFormat)) {
            ensureSpaceForTrackIndex(i);
            TrackOutput trackOutput = this.trackOutputs.get(i);
            if (trackOutput == null) {
                String string = trackData.mediaFormat.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
                if (string != null) {
                    str = string;
                } else {
                    str = trackData.mediaFormat.getString("mime");
                }
                int trackTypeConstant = toTrackTypeConstant(str);
                if (trackTypeConstant == this.primaryTrackType) {
                    this.primaryTrackIndex = i;
                }
                TrackOutput track = this.extractorOutput.track(i, trackTypeConstant);
                this.trackOutputs.set(i, track);
                if (string == null) {
                    trackOutput = track;
                } else {
                    return;
                }
            }
            Format exoPlayerFormat = toExoPlayerFormat(trackData);
            Format format = this.primaryTrackManifestFormat;
            trackOutput.format((format == null || i != this.primaryTrackIndex) ? exoPlayerFormat : exoPlayerFormat.withManifestFormatInfo(format));
            this.trackFormats.set(i, exoPlayerFormat);
            maybeEndTracks();
        }
    }

    public void onSampleDataFound(int i, MediaParser.InputReader inputReader) throws IOException {
        ensureSpaceForTrackIndex(i);
        this.scratchDataReaderAdapter.input = inputReader;
        TrackOutput trackOutput = this.trackOutputs.get(i);
        if (trackOutput == null) {
            trackOutput = this.extractorOutput.track(i, -1);
            this.trackOutputs.set(i, trackOutput);
        }
        trackOutput.sampleData((DataReader) this.scratchDataReaderAdapter, (int) inputReader.getLength(), true);
    }

    public void onSampleCompleted(int i, long j, int i2, int i3, int i4, MediaCodec.CryptoInfo cryptoInfo) {
        long j2 = this.sampleTimestampUpperLimitFilterUs;
        if (j2 == -9223372036854775807L || j < j2) {
            TimestampAdjuster timestampAdjuster2 = this.timestampAdjuster;
            if (timestampAdjuster2 != null) {
                j = timestampAdjuster2.adjustSampleTimestamp(j);
            }
            ((TrackOutput) Assertions.checkNotNull(this.trackOutputs.get(i))).sampleMetadata(j, i2, i3, i4, toExoPlayerCryptoData(i, cryptoInfo));
        }
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer asLongBuffer = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS))).asLongBuffer();
        LongBuffer asLongBuffer2 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS))).asLongBuffer();
        LongBuffer asLongBuffer3 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES))).asLongBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        long[] jArr = new long[asLongBuffer.remaining()];
        long[] jArr2 = new long[asLongBuffer2.remaining()];
        long[] jArr3 = new long[asLongBuffer3.remaining()];
        asIntBuffer.get(iArr);
        asLongBuffer.get(jArr);
        asLongBuffer2.get(jArr2);
        asLongBuffer3.get(jArr3);
        ChunkIndex chunkIndex = new ChunkIndex(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = chunkIndex;
        this.extractorOutput.seekMap(chunkIndex);
        return true;
    }

    private void ensureSpaceForTrackIndex(int i) {
        for (int size = this.trackOutputs.size(); size <= i; size++) {
            this.trackOutputs.add((Object) null);
            this.trackFormats.add((Object) null);
            this.lastReceivedCryptoInfos.add((Object) null);
            this.lastOutputCryptoDatas.add((Object) null);
        }
    }

    private TrackOutput.CryptoData toExoPlayerCryptoData(int i, MediaCodec.CryptoInfo cryptoInfo) {
        int i2;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i) == cryptoInfo) {
            return (TrackOutput.CryptoData) Assertions.checkNotNull(this.lastOutputCryptoDatas.get(i));
        }
        int i3 = 0;
        try {
            Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            int parseInt = Integer.parseInt((String) Util.castNonNull(matcher.group(1)));
            i2 = Integer.parseInt((String) Util.castNonNull(matcher.group(2)));
            i3 = parseInt;
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(cryptoInfo);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("Unexpected error while parsing CryptoInfo: ");
            sb.append(valueOf);
            Log.m16946e(TAG, sb.toString(), e);
            i2 = 0;
        }
        TrackOutput.CryptoData cryptoData = new TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i3, i2);
        this.lastReceivedCryptoInfos.set(i, cryptoInfo);
        this.lastOutputCryptoDatas.set(i, cryptoData);
        return cryptoData;
    }

    private void maybeEndTracks() {
        if (this.tracksFoundCalled && !this.tracksEnded) {
            int size = this.trackOutputs.size();
            int i = 0;
            while (i < size) {
                if (this.trackOutputs.get(i) != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.extractorOutput.endTracks();
            this.tracksEnded = true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int toTrackTypeConstant(java.lang.String r6) {
        /*
            r0 = -1
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -450004177: goto L_0x0038;
                case -284840886: goto L_0x002e;
                case 3556653: goto L_0x0024;
                case 93166550: goto L_0x001a;
                case 112202875: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0042
        L_0x0010:
            java.lang.String r1 = "video"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0042
            r1 = r5
            goto L_0x0043
        L_0x001a:
            java.lang.String r1 = "audio"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0042
            r1 = 0
            goto L_0x0043
        L_0x0024:
            java.lang.String r1 = "text"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0042
            r1 = r4
            goto L_0x0043
        L_0x002e:
            java.lang.String r1 = "unknown"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0042
            r1 = r2
            goto L_0x0043
        L_0x0038:
            java.lang.String r1 = "metadata"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0042
            r1 = r3
            goto L_0x0043
        L_0x0042:
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0057
            if (r1 == r5) goto L_0x0056
            if (r1 == r4) goto L_0x0055
            if (r1 == r3) goto L_0x0053
            if (r1 == r2) goto L_0x0052
            int r6 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r6)
            return r6
        L_0x0052:
            return r0
        L_0x0053:
            r6 = 5
            return r6
        L_0x0055:
            return r3
        L_0x0056:
            return r4
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.toTrackTypeConstant(java.lang.String):int");
    }

    private Format toExoPlayerFormat(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        int i = 0;
        Format.Builder accessibilityChannel = new Format.Builder().setDrmInitData(toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).setContainerMimeType(this.containerMimeType).setPeakBitrate(mediaFormat.getInteger(MediaFile.BITRATE, -1)).setChannelCount(mediaFormat.getInteger("channel-count", -1)).setColorInfo(getColorInfo(mediaFormat)).setSampleMimeType(string).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(mediaFormat.getFloat("frame-rate", -1.0f)).setWidth(mediaFormat.getInteger("width", -1)).setHeight(mediaFormat.getInteger("height", -1)).setInitializationData(getInitializationData(mediaFormat)).setLanguage(mediaFormat.getString("language")).setMaxInputSize(mediaFormat.getInteger("max-input-size", -1)).setPcmEncoding(mediaFormat.getInteger("exo-pcm-encoding", -1)).setRotationDegrees(mediaFormat.getInteger("rotation-degrees", 0)).setSampleRate(mediaFormat.getInteger("sample-rate", -1)).setSelectionFlags(getSelectionFlags(mediaFormat)).setEncoderDelay(mediaFormat.getInteger("encoder-delay", 0)).setEncoderPadding(mediaFormat.getInteger("encoder-padding", 0)).setPixelWidthHeightRatio(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).setSubsampleOffsetUs(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).setAccessibilityChannel(integer);
        while (true) {
            if (i >= this.muxedCaptionFormats.size()) {
                break;
            }
            Format format = this.muxedCaptionFormats.get(i);
            if (Util.areEqual(format.sampleMimeType, string) && format.accessibilityChannel == integer) {
                accessibilityChannel.setLanguage(format.language).setRoleFlags(format.roleFlags).setSelectionFlags(format.selectionFlags).setLabel(format.label).setMetadata(format.metadata);
                break;
            }
            i++;
        }
        return accessibilityChannel.build();
    }

    private static DrmInitData toExoPlayerDrmInitData(String str, android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i = 0; i < schemeInitDataCount; i++) {
            DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i);
            schemeDataArr[i] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new com.google.android.exoplayer2.drm.DrmInitData(str, schemeDataArr);
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | 0 | getFlag(mediaFormat, "is-default", 1);
    }

    private static int getFlag(MediaFormat mediaFormat, String str, int i) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i;
        }
        return 0;
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(getArray(byteBuffer));
            i = i2;
        }
    }

    private static ColorInfo getColorInfo(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        int integer = mediaFormat.getInteger("color-transfer", -1);
        int integer2 = mediaFormat.getInteger("color-range", -1);
        int integer3 = mediaFormat.getInteger("color-standard", -1);
        if (array == null && integer == -1 && integer2 == -1 && integer3 == -1) {
            return null;
        }
        return new ColorInfo(integer3, integer2, integer, array);
    }

    private static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMimeType(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -2063506020: goto L_0x0095;
                case -1870824006: goto L_0x008a;
                case -1566427438: goto L_0x0080;
                case -900207883: goto L_0x0076;
                case -589864617: goto L_0x006b;
                case 52265814: goto L_0x0060;
                case 116768877: goto L_0x0056;
                case 376876796: goto L_0x004c;
                case 703268017: goto L_0x0041;
                case 768643067: goto L_0x0036;
                case 965962719: goto L_0x002b;
                case 1264380477: goto L_0x001f;
                case 1343957595: goto L_0x0014;
                case 2063134683: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x009f
        L_0x0009:
            java.lang.String r0 = "android.media.mediaparser.FlvParser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 7
            goto L_0x00a0
        L_0x0014:
            java.lang.String r0 = "android.media.mediaparser.Mp3Parser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 3
            goto L_0x00a0
        L_0x001f:
            java.lang.String r0 = "android.media.mediaparser.Ac4Parser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 12
            goto L_0x00a0
        L_0x002b:
            java.lang.String r0 = "android.media.mediaparser.MatroskaParser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 0
            goto L_0x00a0
        L_0x0036:
            java.lang.String r0 = "android.media.mediaparser.FlacParser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 13
            goto L_0x00a0
        L_0x0041:
            java.lang.String r0 = "android.media.mediaparser.AmrParser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 11
            goto L_0x00a0
        L_0x004c:
            java.lang.String r0 = "android.media.mediaparser.Ac3Parser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 5
            goto L_0x00a0
        L_0x0056:
            java.lang.String r0 = "android.media.mediaparser.FragmentedMp4Parser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 1
            goto L_0x00a0
        L_0x0060:
            java.lang.String r0 = "android.media.mediaparser.PsParser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 9
            goto L_0x00a0
        L_0x006b:
            java.lang.String r0 = "android.media.mediaparser.WavParser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 10
            goto L_0x00a0
        L_0x0076:
            java.lang.String r0 = "android.media.mediaparser.AdtsParser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 4
            goto L_0x00a0
        L_0x0080:
            java.lang.String r0 = "android.media.mediaparser.TsParser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 6
            goto L_0x00a0
        L_0x008a:
            java.lang.String r0 = "android.media.mediaparser.OggParser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 8
            goto L_0x00a0
        L_0x0095:
            java.lang.String r0 = "android.media.mediaparser.Mp4Parser"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 2
            goto L_0x00a0
        L_0x009f:
            r0 = -1
        L_0x00a0:
            switch(r0) {
                case 0: goto L_0x00da;
                case 1: goto L_0x00d7;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00d1;
                case 5: goto L_0x00ce;
                case 6: goto L_0x00cb;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00c5;
                case 9: goto L_0x00c2;
                case 10: goto L_0x00bf;
                case 11: goto L_0x00bc;
                case 12: goto L_0x00b9;
                case 13: goto L_0x00b6;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Illegal parser name: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r2 = r3.length()
            if (r2 == 0) goto L_0x00dd
            java.lang.String r3 = r1.concat(r3)
            goto L_0x00e2
        L_0x00b6:
            java.lang.String r3 = "audio/flac"
            return r3
        L_0x00b9:
            java.lang.String r3 = "audio/ac4"
            return r3
        L_0x00bc:
            java.lang.String r3 = "audio/amr"
            return r3
        L_0x00bf:
            java.lang.String r3 = "audio/raw"
            return r3
        L_0x00c2:
            java.lang.String r3 = "video/mp2p"
            return r3
        L_0x00c5:
            java.lang.String r3 = "audio/ogg"
            return r3
        L_0x00c8:
            java.lang.String r3 = "video/x-flv"
            return r3
        L_0x00cb:
            java.lang.String r3 = "video/mp2t"
            return r3
        L_0x00ce:
            java.lang.String r3 = "audio/ac3"
            return r3
        L_0x00d1:
            java.lang.String r3 = "audio/mp4a-latm"
            return r3
        L_0x00d4:
            java.lang.String r3 = "audio/mpeg"
            return r3
        L_0x00d7:
            java.lang.String r3 = "video/mp4"
            return r3
        L_0x00da:
            java.lang.String r3 = "video/webm"
            return r3
        L_0x00dd:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L_0x00e2:
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.getMimeType(java.lang.String):java.lang.String");
    }

    private static final class SeekMapAdapter implements SeekMap {
        private final MediaParser.SeekMap adaptedSeekMap;

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.adaptedSeekMap = seekMap;
        }

        public boolean isSeekable() {
            return this.adaptedSeekMap.isSeekable();
        }

        public long getDurationUs() {
            long durationMicros = this.adaptedSeekMap.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        public SeekMap.SeekPoints getSeekPoints(long j) {
            Pair seekPoints = this.adaptedSeekMap.getSeekPoints(j);
            if (seekPoints.first == seekPoints.second) {
                return new SeekMap.SeekPoints(asExoPlayerSeekPoint((MediaParser.SeekPoint) seekPoints.first));
            }
            return new SeekMap.SeekPoints(asExoPlayerSeekPoint((MediaParser.SeekPoint) seekPoints.first), asExoPlayerSeekPoint((MediaParser.SeekPoint) seekPoints.second));
        }

        private static SeekPoint asExoPlayerSeekPoint(MediaParser.SeekPoint seekPoint) {
            return new SeekPoint(seekPoint.timeMicros, seekPoint.position);
        }
    }

    private static final class DataReaderAdapter implements DataReader {
        public MediaParser.InputReader input;

        private DataReaderAdapter() {
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            return ((MediaParser.InputReader) Util.castNonNull(this.input)).read(bArr, i, i2);
        }
    }
}
