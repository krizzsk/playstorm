package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        Atom.ContainerAtom containerAtom2 = containerAtom;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerAtom2.containerChildren.size(); i++) {
            Atom.ContainerAtom containerAtom3 = containerAtom2.containerChildren.get(i);
            if (containerAtom3.type != 1953653099) {
                GaplessInfoHolder gaplessInfoHolder2 = gaplessInfoHolder;
                Function<Track, Track> function2 = function;
            } else {
                Track apply = function.apply(parseTrak(containerAtom3, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd)), j, drmInitData, z, z2));
                if (apply == null) {
                    GaplessInfoHolder gaplessInfoHolder3 = gaplessInfoHolder;
                } else {
                    GaplessInfoHolder gaplessInfoHolder4 = gaplessInfoHolder;
                    arrayList.add(parseStbl(apply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom3.getContainerAtomOfType(Atom.TYPE_mdia))).getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl)), gaplessInfoHolder));
                }
            }
        }
        return arrayList;
    }

    public static Pair<Metadata, Metadata> parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = null;
        Metadata metadata2 = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = parseUdtaMeta(parsableByteArray, position + readInt);
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata2 = parseSmta(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return Pair.create(metadata, metadata2);
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_hdlr);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_keys);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_ilst);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i] = parsableByteArray.readString(readInt2 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 < 0 || readInt4 >= readInt) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(readInt4);
                Log.m16949w(TAG, sb.toString());
            } else {
                MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long j2;
        Atom.LeafAtom leafAtom2;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> parseEdts;
        Atom.ContainerAtom containerAtom2 = containerAtom;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom3.getLeafAtomOfType(Atom.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_tkhd))).data);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            leafAtom2 = leafAtom;
            j2 = parseTkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long parseMvhd = parseMvhd(leafAtom2.data);
        if (j2 != -9223372036854775807L) {
            j3 = Util.scaleLargeTimestamp(j2, 1000000, parseMvhd);
        }
        long j4 = j3;
        Pair<Long, String> parseMdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom3.getLeafAtomOfType(Atom.TYPE_mdhd))).data);
        StsdData parseStsd = parseStsd(((Atom.LeafAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom3.getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl))).getLeafAtomOfType(Atom.TYPE_stsd))).data, parseTkhd.f14463id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom2.getContainerAtomOfType(Atom.TYPE_edts)) == null || (parseEdts = parseEdts(containerAtomOfType)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr = (long[]) parseEdts.second;
            jArr2 = (long[]) parseEdts.first;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new Track(parseTkhd.f14463id, trackTypeForHdlr, ((Long) parseMdhd.first).longValue(), parseMvhd, j4, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr2, jArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.extractor.mp4.TrackSampleTable parseStbl(com.google.android.exoplayer2.extractor.mp4.Track r37, com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r38, com.google.android.exoplayer2.extractor.GaplessInfoHolder r39) throws com.google.android.exoplayer2.ParserException {
        /*
            r1 = r37
            r0 = r38
            r2 = r39
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r3 = r0.getLeafAtomOfType(r3)
            if (r3 == 0) goto L_0x0017
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$StszSampleSizeBox r5 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$StszSampleSizeBox
            com.google.android.exoplayer2.Format r6 = r1.format
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r3 = r0.getLeafAtomOfType(r3)
            if (r3 == 0) goto L_0x052e
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$Stz2SampleSizeBox r5 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$Stz2SampleSizeBox
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.getSampleCount()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            r4 = 0
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r7 = 0
            r0 = r9
            r1 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r7 = r0.getLeafAtomOfType(r7)
            r8 = 1
            if (r7 != 0) goto L_0x0059
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r7 = r0.getLeafAtomOfType(r7)
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r7 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r7
            r9 = r8
            goto L_0x005a
        L_0x0059:
            r9 = r6
        L_0x005a:
            com.google.android.exoplayer2.util.ParsableByteArray r7 = r7.data
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r10 = r0.getLeafAtomOfType(r10)
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r10 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r10
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r10.data
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r11 = r0.getLeafAtomOfType(r11)
            java.lang.Object r11 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r11 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r11
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r11.data
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r12 = r0.getLeafAtomOfType(r12)
            if (r12 == 0) goto L_0x0086
            com.google.android.exoplayer2.util.ParsableByteArray r12 = r12.data
            goto L_0x0087
        L_0x0086:
            r12 = 0
        L_0x0087:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r0 = r0.getLeafAtomOfType(r13)
            if (r0 == 0) goto L_0x0093
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r0.data
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$ChunkIterator r13 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$ChunkIterator
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.setPosition(r7)
            int r9 = r11.readUnsignedIntToInt()
            int r9 = r9 - r8
            int r10 = r11.readUnsignedIntToInt()
            int r14 = r11.readUnsignedIntToInt()
            if (r0 == 0) goto L_0x00b5
            r0.setPosition(r7)
            int r15 = r0.readUnsignedIntToInt()
            goto L_0x00b6
        L_0x00b5:
            r15 = r6
        L_0x00b6:
            r4 = -1
            if (r12 == 0) goto L_0x00cd
            r12.setPosition(r7)
            int r7 = r12.readUnsignedIntToInt()
            if (r7 <= 0) goto L_0x00c9
            int r16 = r12.readUnsignedIntToInt()
            int r16 = r16 + -1
            goto L_0x00d0
        L_0x00c9:
            r16 = r4
            r12 = 0
            goto L_0x00d0
        L_0x00cd:
            r16 = r4
            r7 = r6
        L_0x00d0:
            int r6 = r5.getFixedSampleSize()
            com.google.android.exoplayer2.Format r8 = r1.format
            java.lang.String r8 = r8.sampleMimeType
            if (r6 == r4) goto L_0x00fc
            java.lang.String r4 = "audio/raw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f2
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f2
            java.lang.String r4 = "audio/g711-alaw"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00fc
        L_0x00f2:
            if (r9 != 0) goto L_0x00fc
            if (r15 != 0) goto L_0x00fc
            if (r7 != 0) goto L_0x00fc
            r38 = r7
            r4 = 1
            goto L_0x00ff
        L_0x00fc:
            r38 = r7
            r4 = 0
        L_0x00ff:
            if (r4 == 0) goto L_0x0137
            int r0 = r13.length
            long[] r0 = new long[r0]
            int r4 = r13.length
            int[] r4 = new int[r4]
        L_0x0109:
            boolean r5 = r13.moveNext()
            if (r5 == 0) goto L_0x011c
            int r5 = r13.index
            long r9 = r13.offset
            r0[r5] = r9
            int r5 = r13.index
            int r9 = r13.numSamples
            r4[r5] = r9
            goto L_0x0109
        L_0x011c:
            long r9 = (long) r14
            com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker$Results r0 = com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker.rechunk(r6, r0, r4, r9)
            long[] r4 = r0.offsets
            int[] r5 = r0.sizes
            int r6 = r0.maximumSize
            long[] r9 = r0.timestamps
            int[] r10 = r0.flags
            long r11 = r0.duration
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r13 = r9
            r14 = r10
            r15 = r11
            r5 = r1
            goto L_0x02b1
        L_0x0137:
            long[] r4 = new long[r3]
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            int[] r8 = new int[r3]
            r23 = r11
            r2 = r16
            r1 = 0
            r11 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r16 = r15
            r15 = r14
            r14 = r10
            r36 = r9
            r9 = r38
        L_0x0157:
            r38 = r36
            java.lang.String r10 = "AtomParsers"
            if (r1 >= r3) goto L_0x021f
            r27 = r26
            r26 = r21
            r21 = 1
        L_0x0163:
            if (r26 != 0) goto L_0x0180
            boolean r21 = r13.moveNext()
            if (r21 == 0) goto L_0x0180
            r29 = r14
            r30 = r15
            long r14 = r13.offset
            r31 = r3
            int r3 = r13.numSamples
            r26 = r3
            r27 = r14
            r14 = r29
            r15 = r30
            r3 = r31
            goto L_0x0163
        L_0x0180:
            r31 = r3
            r29 = r14
            r30 = r15
            if (r21 != 0) goto L_0x01a4
            java.lang.String r2 = "Unexpected end of chunk data"
            com.google.android.exoplayer2.util.Log.m16949w(r10, r2)
            long[] r4 = java.util.Arrays.copyOf(r4, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r8 = java.util.Arrays.copyOf(r8, r1)
            r3 = r1
            r2 = r20
            r1 = r26
            goto L_0x0227
        L_0x01a4:
            if (r0 == 0) goto L_0x01b7
        L_0x01a6:
            if (r22 != 0) goto L_0x01b5
            if (r16 <= 0) goto L_0x01b5
            int r22 = r0.readUnsignedIntToInt()
            int r20 = r0.readInt()
            int r16 = r16 + -1
            goto L_0x01a6
        L_0x01b5:
            int r22 = r22 + -1
        L_0x01b7:
            r3 = r20
            r4[r1] = r27
            int r10 = r5.readNextSampleSize()
            r6[r1] = r10
            r10 = r6[r1]
            if (r10 <= r11) goto L_0x01c8
            r10 = r6[r1]
            r11 = r10
        L_0x01c8:
            long r14 = (long) r3
            long r14 = r24 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x01d1
            r10 = 1
            goto L_0x01d2
        L_0x01d1:
            r10 = 0
        L_0x01d2:
            r8[r1] = r10
            if (r1 != r2) goto L_0x01e8
            r10 = 1
            r8[r1] = r10
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x01e8
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r12)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = (com.google.android.exoplayer2.util.ParsableByteArray) r2
            int r2 = r2.readUnsignedIntToInt()
            int r2 = r2 - r10
        L_0x01e8:
            r15 = r2
            r10 = r3
            r14 = r30
            long r2 = (long) r14
            long r24 = r24 + r2
            int r2 = r29 + -1
            if (r2 != 0) goto L_0x0200
            if (r38 <= 0) goto L_0x0200
            int r2 = r23.readUnsignedIntToInt()
            int r3 = r23.readInt()
            int r14 = r38 + -1
            goto L_0x0203
        L_0x0200:
            r3 = r14
            r14 = r38
        L_0x0203:
            r38 = r2
            r2 = r6[r1]
            r20 = r3
            long r2 = (long) r2
            long r2 = r27 + r2
            int r21 = r26 + -1
            int r1 = r1 + 1
            r26 = r2
            r2 = r15
            r15 = r20
            r3 = r31
            r20 = r10
            r36 = r14
            r14 = r38
            goto L_0x0157
        L_0x021f:
            r31 = r3
            r29 = r14
            r2 = r20
            r1 = r21
        L_0x0227:
            long r12 = (long) r2
            long r12 = r24 + r12
            if (r0 == 0) goto L_0x023c
        L_0x022c:
            if (r16 <= 0) goto L_0x023c
            int r2 = r0.readUnsignedIntToInt()
            if (r2 == 0) goto L_0x0236
            r0 = 0
            goto L_0x023d
        L_0x0236:
            r0.readInt()
            int r16 = r16 + -1
            goto L_0x022c
        L_0x023c:
            r0 = 1
        L_0x023d:
            if (r9 != 0) goto L_0x0251
            if (r29 != 0) goto L_0x0251
            if (r1 != 0) goto L_0x0251
            if (r38 != 0) goto L_0x0251
            r2 = r22
            if (r2 != 0) goto L_0x0253
            if (r0 != 0) goto L_0x024c
            goto L_0x0253
        L_0x024c:
            r5 = r37
            r16 = r3
            goto L_0x02a9
        L_0x0251:
            r2 = r22
        L_0x0253:
            r5 = r37
            int r14 = r5.f14464id
            if (r0 != 0) goto L_0x025c
            java.lang.String r0 = ", ctts invalid"
            goto L_0x025e
        L_0x025c:
            java.lang.String r0 = ""
        L_0x025e:
            int r15 = r0.length()
            int r15 = r15 + 262
            r16 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r15)
            java.lang.String r15 = "Inconsistent stbl box for track "
            r3.append(r15)
            r3.append(r14)
            java.lang.String r14 = ": remainingSynchronizationSamples "
            r3.append(r14)
            r3.append(r9)
            java.lang.String r9 = ", remainingSamplesAtTimestampDelta "
            r3.append(r9)
            r9 = r29
            r3.append(r9)
            java.lang.String r9 = ", remainingSamplesInChunk "
            r3.append(r9)
            r3.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r3.append(r1)
            r14 = r38
            r3.append(r14)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r3.append(r1)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.exoplayer2.util.Log.m16949w(r10, r0)
        L_0x02a9:
            r2 = r4
            r3 = r6
            r14 = r8
            r4 = r11
            r0 = r16
            r15 = r12
            r13 = r7
        L_0x02b1:
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r5.timescale
            r6 = r15
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r6, r8, r10)
            long[] r1 = r5.editListDurations
            r11 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02d2
            long r0 = r5.timescale
            com.google.android.exoplayer2.util.Util.scaleLargeTimestampsInPlace(r13, r11, r0)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r9
            r1 = r37
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02d2:
            long[] r1 = r5.editListDurations
            int r1 = r1.length
            r6 = 1
            if (r1 != r6) goto L_0x0372
            int r1 = r5.type
            if (r1 != r6) goto L_0x0372
            int r1 = r13.length
            r6 = 2
            if (r1 < r6) goto L_0x0372
            long[] r1 = r5.editListMediaTimes
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            long[] r1 = (long[]) r1
            r6 = 0
            r20 = r1[r6]
            long[] r1 = r5.editListDurations
            r22 = r1[r6]
            long r6 = r5.timescale
            long r8 = r5.movieTimescale
            r24 = r6
            r26 = r8
            long r6 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r22, r24, r26)
            long r22 = r20 + r6
            r6 = r13
            r7 = r15
            r9 = r20
            r24 = r0
            r0 = r11
            r11 = r22
            boolean r6 = canApplyEditWithGaplessInfo(r6, r7, r9, r11)
            if (r6 == 0) goto L_0x0374
            long r7 = r15 - r22
            r6 = 0
            r9 = r13[r6]
            long r25 = r20 - r9
            com.google.android.exoplayer2.Format r6 = r5.format
            int r6 = r6.sampleRate
            long r9 = (long) r6
            long r11 = r5.timescale
            r27 = r9
            r29 = r11
            long r11 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r25, r27, r29)
            com.google.android.exoplayer2.Format r6 = r5.format
            int r6 = r6.sampleRate
            long r9 = (long) r6
            long r0 = r5.timescale
            r38 = r14
            r22 = r15
            r14 = r11
            r11 = r0
            long r0 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r7, r9, r11)
            r6 = 0
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x033d
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0378
        L_0x033d:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0378
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0378
            int r6 = (int) r14
            r7 = r39
            r7.encoderDelay = r6
            int r0 = (int) r0
            r7.encoderPadding = r0
            long r0 = r5.timescale
            r6 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.exoplayer2.util.Util.scaleLargeTimestampsInPlace(r13, r6, r0)
            long[] r0 = r5.editListDurations
            r1 = 0
            r6 = r0[r1]
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r5.movieTimescale
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r6, r8, r10)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r9
            r1 = r37
            r5 = r13
            r6 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0372:
            r24 = r0
        L_0x0374:
            r38 = r14
            r22 = r15
        L_0x0378:
            long[] r0 = r5.editListDurations
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L_0x03c4
            long[] r0 = r5.editListDurations
            r1 = 0
            r6 = r0[r1]
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x03c4
            long[] r0 = r5.editListMediaTimes
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            long[] r0 = (long[]) r0
            r6 = r0[r1]
            r0 = 0
        L_0x0394:
            int r1 = r13.length
            if (r0 >= r1) goto L_0x03ab
            r8 = r13[r0]
            long r14 = r8 - r6
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r5.timescale
            r18 = r8
            long r8 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r14, r16, r18)
            r13[r0] = r8
            int r0 = r0 + 1
            goto L_0x0394
        L_0x03ab:
            long r14 = r22 - r6
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r5.timescale
            r18 = r0
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r14, r16, r18)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r9
            r1 = r37
            r5 = r13
            r6 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03c4:
            int r0 = r5.type
            r1 = 1
            if (r0 != r1) goto L_0x03cb
            r10 = 1
            goto L_0x03cc
        L_0x03cb:
            r10 = 0
        L_0x03cc:
            long[] r0 = r5.editListDurations
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r1 = r5.editListDurations
            int r1 = r1.length
            int[] r1 = new int[r1]
            long[] r6 = r5.editListMediaTimes
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            long[] r6 = (long[]) r6
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
        L_0x03e2:
            long[] r12 = r5.editListDurations
            int r12 = r12.length
            if (r7 >= r12) goto L_0x044c
            r14 = r6[r7]
            r20 = -1
            int r12 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r12 == 0) goto L_0x043d
            long[] r12 = r5.editListDurations
            r25 = r12[r7]
            r12 = r3
            r16 = r4
            long r3 = r5.timescale
            r20 = r11
            r21 = r12
            long r11 = r5.movieTimescale
            r27 = r3
            r29 = r11
            long r3 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r25, r27, r29)
            r11 = 1
            int r12 = com.google.android.exoplayer2.util.Util.binarySearchFloor((long[]) r13, (long) r14, (boolean) r11, (boolean) r11)
            r0[r7] = r12
            long r14 = r14 + r3
            r3 = 0
            int r4 = com.google.android.exoplayer2.util.Util.binarySearchCeil((long[]) r13, (long) r14, (boolean) r10, (boolean) r3)
            r1[r7] = r4
        L_0x0415:
            r4 = r0[r7]
            r12 = r1[r7]
            if (r4 >= r12) goto L_0x0428
            r4 = r0[r7]
            r4 = r38[r4]
            r4 = r4 & r11
            if (r4 != 0) goto L_0x0428
            r4 = r0[r7]
            int r4 = r4 + r11
            r0[r7] = r4
            goto L_0x0415
        L_0x0428:
            r4 = r1[r7]
            r12 = r0[r7]
            int r4 = r4 - r12
            int r9 = r9 + r4
            r4 = r0[r7]
            r12 = r20
            if (r12 == r4) goto L_0x0436
            r4 = r11
            goto L_0x0437
        L_0x0436:
            r4 = r3
        L_0x0437:
            r4 = r4 | r8
            r8 = r1[r7]
            r12 = r8
            r8 = r4
            goto L_0x0444
        L_0x043d:
            r21 = r3
            r16 = r4
            r12 = r11
            r3 = 0
            r11 = 1
        L_0x0444:
            int r7 = r7 + 1
            r11 = r12
            r4 = r16
            r3 = r21
            goto L_0x03e2
        L_0x044c:
            r21 = r3
            r16 = r4
            r4 = r24
            r3 = 0
            r11 = 1
            if (r9 == r4) goto L_0x0457
            goto L_0x0458
        L_0x0457:
            r11 = r3
        L_0x0458:
            r4 = r8 | r11
            if (r4 == 0) goto L_0x045f
            long[] r6 = new long[r9]
            goto L_0x0460
        L_0x045f:
            r6 = r2
        L_0x0460:
            if (r4 == 0) goto L_0x0465
            int[] r7 = new int[r9]
            goto L_0x0467
        L_0x0465:
            r7 = r21
        L_0x0467:
            if (r4 == 0) goto L_0x046b
            r16 = r3
        L_0x046b:
            if (r4 == 0) goto L_0x0470
            int[] r8 = new int[r9]
            goto L_0x0472
        L_0x0470:
            r8 = r38
        L_0x0472:
            long[] r9 = new long[r9]
            r12 = r3
            r10 = 0
        L_0x0477:
            long[] r14 = r5.editListDurations
            int r14 = r14.length
            if (r3 >= r14) goto L_0x050d
            long[] r14 = r5.editListMediaTimes
            r17 = r14[r3]
            r14 = r0[r3]
            r15 = r1[r3]
            r20 = r0
            if (r4 == 0) goto L_0x049c
            int r0 = r15 - r14
            java.lang.System.arraycopy(r2, r14, r6, r12, r0)
            r28 = r1
            r1 = r21
            java.lang.System.arraycopy(r1, r14, r7, r12, r0)
            r21 = r2
            r2 = r38
            java.lang.System.arraycopy(r2, r14, r8, r12, r0)
            goto L_0x04a4
        L_0x049c:
            r28 = r1
            r1 = r21
            r21 = r2
            r2 = r38
        L_0x04a4:
            r0 = r16
        L_0x04a6:
            if (r14 >= r15) goto L_0x04ed
            r24 = 1000000(0xf4240, double:4.940656E-318)
            r38 = r2
            r29 = r3
            long r2 = r5.movieTimescale
            r22 = r10
            r26 = r2
            long r2 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r22, r24, r26)
            r22 = r13[r14]
            r24 = r10
            long r10 = r22 - r17
            r22 = r13
            r16 = r14
            r13 = 0
            long r30 = java.lang.Math.max(r13, r10)
            r32 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r5.timescale
            r34 = r10
            long r10 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r30, r32, r34)
            long r2 = r2 + r10
            r9[r12] = r2
            if (r4 == 0) goto L_0x04df
            r2 = r7[r12]
            if (r2 <= r0) goto L_0x04df
            r0 = r1[r16]
        L_0x04df:
            int r12 = r12 + 1
            int r2 = r16 + 1
            r14 = r2
            r13 = r22
            r10 = r24
            r3 = r29
            r2 = r38
            goto L_0x04a6
        L_0x04ed:
            r38 = r2
            r29 = r3
            r24 = r10
            r22 = r13
            r13 = 0
            long[] r2 = r5.editListDurations
            r10 = r2[r29]
            long r10 = r24 + r10
            int r3 = r29 + 1
            r16 = r0
            r0 = r20
            r2 = r21
            r13 = r22
            r21 = r1
            r1 = r28
            goto L_0x0477
        L_0x050d:
            r24 = r10
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r5.movieTimescale
            r22 = r24
            r24 = r0
            r26 = r2
            long r10 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r22, r24, r26)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r12 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r12
            r1 = r37
            r2 = r6
            r3 = r7
            r4 = r16
            r5 = r9
            r6 = r8
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r12
        L_0x052e:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseStbl(com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom, com.google.android.exoplayer2.extractor.GaplessInfoHolder):com.google.android.exoplayer2.extractor.mp4.TrackSampleTable");
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() != 1935766900) {
                parsableByteArray.setPosition(position + readInt);
            } else if (readInt < 14) {
                return null;
            } else {
                parsableByteArray.skipBytes(5);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if (readUnsignedByte != 12 && readUnsignedByte != 13) {
                    return null;
                }
                float f = readUnsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f, parsableByteArray.readUnsignedByte()));
            }
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        int i = 8;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0) {
            i = 16;
        }
        parsableByteArray.skipBytes(i);
        return parsableByteArray.readUnsignedInt();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        boolean z;
        int i = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        if (parseFullAtomVersion == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (parsableByteArray.getData()[position + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            parsableByteArray.skipBytes(i);
        } else {
            long readUnsignedInt = parseFullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
            if (readUnsignedInt != 0) {
                j = readUnsignedInt;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i2 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i2 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i2 = 180;
        }
        return new TkhdData(readInt, j, i2);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        int i = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            i = 4;
        }
        parsableByteArray.skipBytes(i);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) (((readUnsignedShort >> 10) & 31) + 96));
        sb.append((char) (((readUnsignedShort >> 5) & 31) + 96));
        sb.append((char) ((readUnsignedShort & 31) + 96));
        return Pair.create(Long.valueOf(readUnsignedInt), sb.toString());
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        int i3;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int i4 = i;
        parsableByteArray2.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521) {
                i3 = position;
                parseVideoSampleEntry(parsableByteArray, readInt3, i3, readInt2, i, i2, drmInitData, stsdData, i5);
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667) {
                i3 = position;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData, i5);
            } else {
                if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
                } else if (readInt3 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray2, readInt3, position, i4, stsdData);
                } else if (readInt3 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i4).setSampleMimeType("application/x-camera-motion").build();
                }
                i3 = position;
            }
            parsableByteArray2.setPosition(i3 + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableList = ImmutableList.m20746of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableList).build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0190, code lost:
        if (r1 != 3) goto L_0x00e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseVideoSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r20, int r21, int r22, int r23, int r24, int r25, com.google.android.exoplayer2.drm.DrmInitData r26, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r27, int r28) throws com.google.android.exoplayer2.ParserException {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r26
            r4 = r27
            int r5 = r1 + 8
            int r5 = r5 + 8
            r0.setPosition(r5)
            r5 = 16
            r0.skipBytes(r5)
            int r5 = r20.readUnsignedShort()
            int r6 = r20.readUnsignedShort()
            r7 = 50
            r0.skipBytes(r7)
            int r7 = r20.getPosition()
            r9 = 1701733238(0x656e6376, float:7.035987E22)
            r10 = r21
            if (r10 != r9) goto L_0x0055
            android.util.Pair r9 = parseSampleEntryEncryptionData(r0, r1, r2)
            if (r9 == 0) goto L_0x0052
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r3 != 0) goto L_0x0040
            r3 = 0
            goto L_0x004a
        L_0x0040:
            java.lang.Object r11 = r9.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r11 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r11
            java.lang.String r11 = r11.schemeType
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.copyWithSchemeType(r11)
        L_0x004a:
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r11 = r4.trackEncryptionBoxes
            java.lang.Object r9 = r9.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r9 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r9
            r11[r28] = r9
        L_0x0052:
            r0.setPosition(r7)
        L_0x0055:
            r9 = 1831958048(0x6d317620, float:3.4326032E27)
            java.lang.String r11 = "video/3gpp"
            if (r10 != r9) goto L_0x005f
            java.lang.String r9 = "video/mpeg"
            goto L_0x0067
        L_0x005f:
            r9 = 1211250227(0x48323633, float:182488.8)
            if (r10 != r9) goto L_0x0066
            r9 = r11
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            r12 = -1
            r14 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0072:
            int r8 = r7 - r1
            if (r8 >= r2) goto L_0x021e
            r0.setPosition(r7)
            int r8 = r20.getPosition()
            r26 = r11
            int r11 = r20.readInt()
            if (r11 != 0) goto L_0x0091
            int r19 = r20.getPosition()
            r28 = r3
            int r3 = r19 - r1
            if (r3 != r2) goto L_0x0093
            goto L_0x0220
        L_0x0091:
            r28 = r3
        L_0x0093:
            if (r11 <= 0) goto L_0x0097
            r3 = 1
            goto L_0x0098
        L_0x0097:
            r3 = 0
        L_0x0098:
            java.lang.String r1 = "childAtomSize must be positive"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r1)
            int r1 = r20.readInt()
            r3 = 1635148611(0x61766343, float:2.8406573E20)
            if (r1 != r3) goto L_0x00c7
            r1 = 0
            if (r9 != 0) goto L_0x00ab
            r3 = 1
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r1)
            int r8 = r8 + 8
            r0.setPosition(r8)
            com.google.android.exoplayer2.video.AvcConfig r1 = com.google.android.exoplayer2.video.AvcConfig.parse(r20)
            java.util.List<byte[]> r15 = r1.initializationData
            int r3 = r1.nalUnitLengthFieldLength
            r4.nalUnitLengthFieldLength = r3
            if (r18 != 0) goto L_0x00c2
            float r14 = r1.pixelWidthAspectRatio
        L_0x00c2:
            java.lang.String r13 = r1.codecs
            java.lang.String r1 = "video/avc"
            goto L_0x00e8
        L_0x00c7:
            r3 = 1752589123(0x68766343, float:4.6541328E24)
            if (r1 != r3) goto L_0x00ec
            r1 = 0
            if (r9 != 0) goto L_0x00d1
            r3 = 1
            goto L_0x00d2
        L_0x00d1:
            r3 = 0
        L_0x00d2:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r1)
            int r8 = r8 + 8
            r0.setPosition(r8)
            com.google.android.exoplayer2.video.HevcConfig r1 = com.google.android.exoplayer2.video.HevcConfig.parse(r20)
            java.util.List<byte[]> r15 = r1.initializationData
            int r3 = r1.nalUnitLengthFieldLength
            r4.nalUnitLengthFieldLength = r3
            java.lang.String r13 = r1.codecs
            java.lang.String r1 = "video/hevc"
        L_0x00e8:
            r9 = r1
        L_0x00e9:
            r0 = 0
            goto L_0x0211
        L_0x00ec:
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 == r3) goto L_0x0206
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 != r3) goto L_0x00f8
            goto L_0x0206
        L_0x00f8:
            r3 = 1987076931(0x76706343, float:1.21891066E33)
            if (r1 != r3) goto L_0x0111
            r1 = 0
            if (r9 != 0) goto L_0x0102
            r3 = 1
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r1)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r10 != r1) goto L_0x010e
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x00e8
        L_0x010e:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x00e8
        L_0x0111:
            r3 = 1635135811(0x61763143, float:2.8384055E20)
            if (r1 != r3) goto L_0x0125
            r1 = 0
            if (r9 != 0) goto L_0x011b
            r3 = 1
            goto L_0x011c
        L_0x011b:
            r3 = 0
        L_0x011c:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r1)
            java.lang.String r3 = "video/av01"
            r0 = r1
            r9 = r3
            goto L_0x0211
        L_0x0125:
            r3 = 1681012275(0x64323633, float:1.3149704E22)
            if (r1 != r3) goto L_0x0138
            r1 = 0
            if (r9 != 0) goto L_0x012f
            r3 = 1
            goto L_0x0130
        L_0x012f:
            r3 = 0
        L_0x0130:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r1)
            r9 = r26
            r0 = r1
            goto L_0x0211
        L_0x0138:
            r3 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 != r3) goto L_0x015a
            r1 = 0
            if (r9 != 0) goto L_0x0142
            r3 = 1
            goto L_0x0143
        L_0x0142:
            r3 = 0
        L_0x0143:
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r3, r1)
            android.util.Pair r1 = parseEsdsFromParent(r0, r8)
            java.lang.Object r3 = r1.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0158
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.m20746of(r1)
        L_0x0158:
            r9 = r3
            goto L_0x00e9
        L_0x015a:
            r3 = 1885434736(0x70617370, float:2.7909473E29)
            if (r1 != r3) goto L_0x0169
            float r1 = parsePaspFromParent(r0, r8)
            r14 = r1
            r0 = 0
            r18 = 1
            goto L_0x0211
        L_0x0169:
            r3 = 1937126244(0x73763364, float:1.9506033E31)
            if (r1 != r3) goto L_0x0174
            byte[] r16 = parseProjFromParent(r0, r8, r11)
            goto L_0x00e9
        L_0x0174:
            r3 = 1936995172(0x73743364, float:1.9347576E31)
            r8 = 2
            if (r1 != r3) goto L_0x019d
            int r1 = r20.readUnsignedByte()
            r3 = 3
            r0.skipBytes(r3)
            if (r1 != 0) goto L_0x00e9
            int r1 = r20.readUnsignedByte()
            if (r1 == 0) goto L_0x019a
            r3 = 1
            if (r1 == r3) goto L_0x0197
            if (r1 == r8) goto L_0x0194
            r3 = 3
            if (r1 == r3) goto L_0x0197
            goto L_0x00e9
        L_0x0194:
            r12 = r8
            goto L_0x00e9
        L_0x0197:
            r12 = r3
            goto L_0x00e9
        L_0x019a:
            r12 = 0
            goto L_0x00e9
        L_0x019d:
            r3 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r1 != r3) goto L_0x00e9
            int r1 = r20.readInt()
            r3 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r1 != r3) goto L_0x01ad
            r3 = 1
            goto L_0x01ae
        L_0x01ad:
            r3 = 0
        L_0x01ae:
            if (r3 != 0) goto L_0x01d7
            r8 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r1 != r8) goto L_0x01b6
            goto L_0x01d7
        L_0x01b6:
            java.lang.String r3 = "Unsupported color type: "
            java.lang.String r1 = com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r8 = r1.length()
            if (r8 == 0) goto L_0x01cb
            java.lang.String r1 = r3.concat(r1)
            goto L_0x01d0
        L_0x01cb:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x01d0:
            java.lang.String r3 = "AtomParsers"
            com.google.android.exoplayer2.util.Log.m16949w(r3, r1)
            goto L_0x00e9
        L_0x01d7:
            int r1 = r20.readUnsignedShort()
            int r8 = r20.readUnsignedShort()
            r2 = 2
            r0.skipBytes(r2)
            if (r3 == 0) goto L_0x01ef
            int r3 = r20.readUnsignedByte()
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x01ef
            r3 = 1
            goto L_0x01f0
        L_0x01ef:
            r3 = 0
        L_0x01f0:
            com.google.android.exoplayer2.video.ColorInfo r2 = new com.google.android.exoplayer2.video.ColorInfo
            int r1 = com.google.android.exoplayer2.video.ColorInfo.isoColorPrimariesToColorSpace(r1)
            if (r3 == 0) goto L_0x01fa
            r3 = 1
            goto L_0x01fb
        L_0x01fa:
            r3 = 2
        L_0x01fb:
            int r8 = com.google.android.exoplayer2.video.ColorInfo.isoTransferCharacteristicsToColorTransfer(r8)
            r0 = 0
            r2.<init>(r1, r3, r8, r0)
            r17 = r2
            goto L_0x0211
        L_0x0206:
            r0 = 0
            com.google.android.exoplayer2.video.DolbyVisionConfig r1 = com.google.android.exoplayer2.video.DolbyVisionConfig.parse(r20)
            if (r1 == 0) goto L_0x0211
            java.lang.String r13 = r1.codecs
            java.lang.String r9 = "video/dolby-vision"
        L_0x0211:
            int r7 = r7 + r11
            r0 = r20
            r1 = r22
            r2 = r23
            r11 = r26
            r3 = r28
            goto L_0x0072
        L_0x021e:
            r28 = r3
        L_0x0220:
            if (r9 != 0) goto L_0x0223
            return
        L_0x0223:
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            r1 = r24
            com.google.android.exoplayer2.Format$Builder r0 = r0.setId((int) r1)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r9)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setCodecs(r13)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setWidth(r5)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setHeight(r6)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setPixelWidthHeightRatio(r14)
            r1 = r25
            com.google.android.exoplayer2.Format$Builder r0 = r0.setRotationDegrees(r1)
            r8 = r16
            com.google.android.exoplayer2.Format$Builder r0 = r0.setProjectionData(r8)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setStereoMode(r12)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setInitializationData(r15)
            r3 = r28
            com.google.android.exoplayer2.Format$Builder r0 = r0.setDrmInitData(r3)
            r8 = r17
            com.google.android.exoplayer2.Format$Builder r0 = r0.setColorInfo(r8)
            com.google.android.exoplayer2.Format r0 = r0.build()
            r4.format = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseVideoSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray, int, int, int, int, int, com.google.android.exoplayer2.drm.DrmInitData, com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData, int):void");
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 8 + 8);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        int i = 0;
        while (i < readUnsignedIntToInt) {
            jArr[i] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : (long) parsableByteArray.readInt();
            if (parsableByteArray.readShort() == 1) {
                parsableByteArray.skipBytes(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return ((float) parsableByteArray.readUnsignedIntToInt()) / ((float) parsableByteArray.readUnsignedIntToInt());
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.google.android.exoplayer2.drm.DrmInitData r27, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r28, int r29) throws com.google.android.exoplayer2.ParserException {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            r6 = r28
            int r7 = r1 + 8
            r8 = 8
            int r7 = r7 + r8
            r0.setPosition(r7)
            r7 = 6
            if (r26 == 0) goto L_0x0021
            int r8 = r20.readUnsignedShort()
            r0.skipBytes(r7)
            goto L_0x0025
        L_0x0021:
            r0.skipBytes(r8)
            r8 = 0
        L_0x0025:
            r10 = 16
            r11 = 2
            r12 = 1
            if (r8 == 0) goto L_0x0047
            if (r8 != r12) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            if (r8 != r11) goto L_0x0046
            r0.skipBytes(r10)
            double r7 = r20.readDouble()
            long r7 = java.lang.Math.round(r7)
            int r7 = (int) r7
            int r8 = r20.readUnsignedIntToInt()
            r10 = 20
            r0.skipBytes(r10)
            goto L_0x0058
        L_0x0046:
            return
        L_0x0047:
            int r13 = r20.readUnsignedShort()
            r0.skipBytes(r7)
            int r7 = r20.readUnsignedFixedPoint1616()
            if (r8 != r12) goto L_0x0057
            r0.skipBytes(r10)
        L_0x0057:
            r8 = r13
        L_0x0058:
            int r10 = r20.getPosition()
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            r15 = r21
            if (r15 != r13) goto L_0x008e
            android.util.Pair r13 = parseSampleEntryEncryptionData(r0, r1, r2)
            if (r13 == 0) goto L_0x0089
            java.lang.Object r15 = r13.first
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r5 != 0) goto L_0x0075
            r14 = 0
            goto L_0x0080
        L_0x0075:
            java.lang.Object r14 = r13.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r14 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r14
            java.lang.String r14 = r14.schemeType
            com.google.android.exoplayer2.drm.DrmInitData r5 = r5.copyWithSchemeType(r14)
            r14 = r5
        L_0x0080:
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r5 = r6.trackEncryptionBoxes
            java.lang.Object r13 = r13.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r13 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r13
            r5[r29] = r13
            goto L_0x008a
        L_0x0089:
            r14 = r5
        L_0x008a:
            r0.setPosition(r10)
            goto L_0x008f
        L_0x008e:
            r14 = r5
        L_0x008f:
            r5 = 1633889587(0x61632d33, float:2.6191674E20)
            r13 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r17 = "audio/raw"
            if (r15 != r5) goto L_0x009e
            java.lang.String r17 = "audio/ac3"
        L_0x009b:
            r5 = -1
            goto L_0x0147
        L_0x009e:
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r15 != r5) goto L_0x00a6
            java.lang.String r17 = "audio/eac3"
            goto L_0x009b
        L_0x00a6:
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r15 != r5) goto L_0x00ae
            java.lang.String r17 = "audio/ac4"
            goto L_0x009b
        L_0x00ae:
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r15 != r5) goto L_0x00b6
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x009b
        L_0x00b6:
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r15 == r5) goto L_0x0143
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r15 != r5) goto L_0x00c2
            goto L_0x0143
        L_0x00c2:
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r15 != r5) goto L_0x00ca
            java.lang.String r17 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009b
        L_0x00ca:
            r5 = 1685353336(0x64747378, float:1.8037304E22)
            if (r15 != r5) goto L_0x00d2
            java.lang.String r17 = "audio/vnd.dts.uhd"
            goto L_0x009b
        L_0x00d2:
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r15 != r5) goto L_0x00da
            java.lang.String r17 = "audio/3gpp"
            goto L_0x009b
        L_0x00da:
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r15 != r5) goto L_0x00e2
            java.lang.String r17 = "audio/amr-wb"
            goto L_0x009b
        L_0x00e2:
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r15 == r5) goto L_0x0141
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r15 != r5) goto L_0x00ed
            goto L_0x0141
        L_0x00ed:
            r5 = 1953984371(0x74776f73, float:7.841539E31)
            if (r15 != r5) goto L_0x00f5
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0147
        L_0x00f5:
            r5 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r15 == r5) goto L_0x013d
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r15 != r5) goto L_0x0100
            goto L_0x013d
        L_0x0100:
            r5 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r15 != r5) goto L_0x0108
            java.lang.String r17 = "audio/mha1"
            goto L_0x009b
        L_0x0108:
            r5 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r15 != r5) goto L_0x0110
            java.lang.String r17 = "audio/mhm1"
            goto L_0x009b
        L_0x0110:
            if (r15 != r13) goto L_0x0115
            java.lang.String r17 = "audio/alac"
            goto L_0x009b
        L_0x0115:
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r15 != r5) goto L_0x011e
            java.lang.String r17 = "audio/g711-alaw"
            goto L_0x009b
        L_0x011e:
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r15 != r5) goto L_0x0127
            java.lang.String r17 = "audio/g711-mlaw"
            goto L_0x009b
        L_0x0127:
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r15 != r5) goto L_0x0130
            java.lang.String r17 = "audio/opus"
            goto L_0x009b
        L_0x0130:
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r15 != r5) goto L_0x0139
            java.lang.String r17 = "audio/flac"
            goto L_0x009b
        L_0x0139:
            r5 = -1
            r17 = 0
            goto L_0x0147
        L_0x013d:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x009b
        L_0x0141:
            r5 = 2
            goto L_0x0147
        L_0x0143:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x009b
        L_0x0147:
            r11 = r17
            r15 = 0
            r19 = 0
        L_0x014c:
            int r13 = r10 - r1
            if (r13 >= r2) goto L_0x02d8
            r0.setPosition(r10)
            int r13 = r20.readInt()
            if (r13 <= 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r12 = 0
        L_0x015b:
            java.lang.String r9 = "childAtomSize must be positive"
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(r12, r9)
            int r9 = r20.readInt()
            r12 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r9 != r12) goto L_0x0187
            int r9 = r13 + -13
            byte[] r12 = new byte[r9]
            int r1 = r10 + 13
            r0.setPosition(r1)
            r1 = 0
            r0.readBytes(r12, r1, r9)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m20746of(r12)
        L_0x017a:
            r19 = r1
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r17 = 0
            r18 = 2
            goto L_0x02d1
        L_0x0187:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r1) goto L_0x0297
            if (r26 == 0) goto L_0x0195
            r12 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r12) goto L_0x0195
            goto L_0x0297
        L_0x0195:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r1) goto L_0x01b3
            int r1 = r10 + 8
            r0.setPosition(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.audio.Ac3Util.parseAc3AnnexFFormat(r0, r1, r4, r14)
            r6.format = r1
        L_0x01a9:
            r9 = 0
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r18 = 2
            goto L_0x0294
        L_0x01b3:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r1) goto L_0x01c8
            int r1 = r10 + 8
            r0.setPosition(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.audio.Ac3Util.parseEAc3AnnexFFormat(r0, r1, r4, r14)
            r6.format = r1
            goto L_0x01a9
        L_0x01c8:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r1) goto L_0x01dd
            int r1 = r10 + 8
            r0.setPosition(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.audio.Ac4Util.parseAc4AnnexEFormat(r0, r1, r4, r14)
            r6.format = r1
            goto L_0x01a9
        L_0x01dd:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 != r1) goto L_0x0206
            com.google.android.exoplayer2.Format$Builder r1 = new com.google.android.exoplayer2.Format$Builder
            r1.<init>()
            com.google.android.exoplayer2.Format$Builder r1 = r1.setId((int) r3)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleMimeType(r11)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setChannelCount(r8)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setSampleRate(r7)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r14)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r4)
            com.google.android.exoplayer2.Format r1 = r1.build()
            r6.format = r1
            goto L_0x01a9
        L_0x0206:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r1) goto L_0x0226
            int r1 = r13 + -8
            byte[] r9 = opusMagic
            int r12 = r9.length
            int r12 = r12 + r1
            byte[] r9 = java.util.Arrays.copyOf(r9, r12)
            int r12 = r10 + 8
            r0.setPosition(r12)
            byte[] r12 = opusMagic
            int r12 = r12.length
            r0.readBytes(r9, r12, r1)
            java.util.List r1 = com.google.android.exoplayer2.audio.OpusUtil.buildInitializationData(r9)
            goto L_0x017a
        L_0x0226:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r1) goto L_0x025e
            int r1 = r13 + -12
            int r9 = r1 + 4
            byte[] r9 = new byte[r9]
            r12 = 102(0x66, float:1.43E-43)
            r17 = 0
            r9[r17] = r12
            r12 = 76
            r16 = 1
            r9[r16] = r12
            r12 = 97
            r18 = 2
            r9[r18] = r12
            r12 = 3
            r19 = 67
            r9[r12] = r19
            int r12 = r10 + 12
            r0.setPosition(r12)
            r12 = 4
            r0.readBytes(r9, r12, r1)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m20746of(r9)
            r19 = r1
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            r17 = 0
            goto L_0x02d1
        L_0x025e:
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r18 = 2
            if (r9 != r12) goto L_0x0293
            int r1 = r13 + -12
            byte[] r7 = new byte[r1]
            int r8 = r10 + 12
            r0.setPosition(r8)
            r9 = 0
            r0.readBytes(r7, r9, r1)
            android.util.Pair r1 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.parseAlacAudioSpecificConfig(r7)
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.m20746of(r7)
            r19 = r7
            r7 = r8
            r17 = r9
            r8 = r1
            goto L_0x02d1
        L_0x0293:
            r9 = 0
        L_0x0294:
            r17 = r9
            goto L_0x02d1
        L_0x0297:
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r17 = 0
            r18 = 2
            if (r9 != r1) goto L_0x02a4
            r1 = r10
            goto L_0x02a8
        L_0x02a4:
            int r1 = findEsdsPosition(r0, r10, r13)
        L_0x02a8:
            r9 = -1
            if (r1 == r9) goto L_0x02d1
            android.util.Pair r1 = parseEsdsFromParent(r0, r1)
            java.lang.Object r11 = r1.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x02d1
            java.lang.String r9 = "audio/mp4a-latm"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x02cd
            com.google.android.exoplayer2.audio.AacUtil$Config r7 = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(r1)
            int r8 = r7.sampleRateHz
            int r9 = r7.channelCount
            java.lang.String r15 = r7.codecs
            r7 = r8
            r8 = r9
        L_0x02cd:
            com.google.common.collect.ImmutableList r19 = com.google.common.collect.ImmutableList.m20746of(r1)
        L_0x02d1:
            int r10 = r10 + r13
            r1 = r22
            r12 = r16
            goto L_0x014c
        L_0x02d8:
            com.google.android.exoplayer2.Format r0 = r6.format
            if (r0 != 0) goto L_0x030f
            if (r11 == 0) goto L_0x030f
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r0 = r0.setId((int) r3)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r11)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setCodecs(r15)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setChannelCount(r8)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleRate(r7)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setPcmEncoding(r5)
            r1 = r19
            com.google.android.exoplayer2.Format$Builder r0 = r0.setInitializationData(r1)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setDrmInitData(r14)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setLanguage(r4)
            com.google.android.exoplayer2.Format r0 = r0.build()
            r6.format = r0
        L_0x030f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData, int):void");
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702061171) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8 + 4);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, (Object) null);
        }
        parsableByteArray.skipBytes(12);
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        boolean z = false;
        int i4 = -1;
        String str = null;
        Integer num = null;
        int i5 = 0;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        if (parseSchiFromParent != null) {
            z = true;
        }
        ExtractorUtil.checkContainerInput(z, "tenc atom is mandatory");
        return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += readInt;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int constrainValue = Util.constrainValue(4, 0, length);
        int constrainValue2 = Util.constrainValue(jArr.length - 4, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[constrainValue] || jArr[constrainValue2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }

    private AtomParsers() {
    }

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() != 1 ? false : true, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long j;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                j = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                j = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = j;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private static final class TkhdData {
        /* access modifiers changed from: private */
        public final long duration;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public final int f14463id;
        /* access modifiers changed from: private */
        public final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.f14463id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = this.data.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    StringBuilder sb = new StringBuilder(88);
                    sb.append("Audio sample size mismatch. stsd sample size: ");
                    sb.append(pcmFrameSize);
                    sb.append(", stsz sample size: ");
                    sb.append(readUnsignedIntToInt);
                    Log.m16949w(AtomParsers.TAG, sb.toString());
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = this.data.readUnsignedIntToInt();
        }

        public int getSampleCount() {
            return this.sampleCount;
        }

        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize = (this.data.readUnsignedIntToInt() & 255);
        private final int sampleCount = this.data.readUnsignedIntToInt();
        private int sampleIndex;

        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
        }

        public int getSampleCount() {
            return this.sampleCount;
        }

        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 != 0) {
                return this.currentByte & 15;
            }
            int readUnsignedByte = this.data.readUnsignedByte();
            this.currentByte = readUnsignedByte;
            return (readUnsignedByte & 240) >> 4;
        }
    }
}
