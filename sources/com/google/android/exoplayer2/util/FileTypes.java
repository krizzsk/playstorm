package com.google.android.exoplayer2.util;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

public final class FileTypes {
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    private static final String EXTENSION_AAC = ".aac";
    private static final String EXTENSION_AC3 = ".ac3";
    private static final String EXTENSION_AC4 = ".ac4";
    private static final String EXTENSION_ADTS = ".adts";
    private static final String EXTENSION_AMR = ".amr";
    private static final String EXTENSION_EC3 = ".ec3";
    private static final String EXTENSION_FLAC = ".flac";
    private static final String EXTENSION_FLV = ".flv";
    private static final String EXTENSION_JPEG = ".jpeg";
    private static final String EXTENSION_JPG = ".jpg";
    private static final String EXTENSION_M2P = ".m2p";
    private static final String EXTENSION_MP3 = ".mp3";
    private static final String EXTENSION_MP4 = ".mp4";
    private static final String EXTENSION_MPEG = ".mpeg";
    private static final String EXTENSION_MPG = ".mpg";
    private static final String EXTENSION_OPUS = ".opus";
    private static final String EXTENSION_PREFIX_CMF = ".cmf";
    private static final String EXTENSION_PREFIX_M4 = ".m4";
    private static final String EXTENSION_PREFIX_MK = ".mk";
    private static final String EXTENSION_PREFIX_MP4 = ".mp4";
    private static final String EXTENSION_PREFIX_OG = ".og";
    private static final String EXTENSION_PREFIX_TS = ".ts";
    private static final String EXTENSION_PS = ".ps";
    private static final String EXTENSION_TS = ".ts";
    private static final String EXTENSION_VTT = ".vtt";
    private static final String EXTENSION_WAV = ".wav";
    private static final String EXTENSION_WAVE = ".wave";
    private static final String EXTENSION_WEBM = ".webm";
    private static final String EXTENSION_WEBVTT = ".webvtt";
    public static final int FLAC = 4;
    public static final int FLV = 5;
    static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final int JPEG = 14;
    public static final int MATROSKA = 6;
    public static final int MP3 = 7;
    public static final int MP4 = 8;
    public static final int OGG = 9;

    /* renamed from: PS */
    public static final int f14496PS = 10;

    /* renamed from: TS */
    public static final int f14497TS = 11;
    public static final int UNKNOWN = -1;
    public static final int WAV = 12;
    public static final int WEBVTT = 13;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private FileTypes() {
    }

    public static int inferFileTypeFromResponseHeaders(Map<String, List<String>> map) {
        List list = map.get("Content-Type");
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int inferFileTypeFromMimeType(java.lang.String r17) {
        /*
            r0 = -1
            if (r17 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = com.google.android.exoplayer2.util.MimeTypes.normalizeMimeType(r17)
            int r2 = r1.hashCode()
            r3 = 14
            r4 = 13
            r5 = 12
            r6 = 11
            r7 = 10
            r8 = 9
            r9 = 8
            r10 = 7
            r11 = 6
            r12 = 5
            r13 = 4
            r14 = 3
            r15 = 1
            r16 = 0
            switch(r2) {
                case -2123537834: goto L_0x0126;
                case -1662384011: goto L_0x011b;
                case -1662384007: goto L_0x0110;
                case -1662095187: goto L_0x0106;
                case -1606874997: goto L_0x00fc;
                case -1487394660: goto L_0x00f1;
                case -1248337486: goto L_0x00e6;
                case -1004728940: goto L_0x00db;
                case -387023398: goto L_0x00d1;
                case -43467528: goto L_0x00c6;
                case 13915911: goto L_0x00bb;
                case 187078296: goto L_0x00af;
                case 187078297: goto L_0x00a4;
                case 187078669: goto L_0x0099;
                case 187090232: goto L_0x008d;
                case 187091926: goto L_0x0081;
                case 187099443: goto L_0x0075;
                case 1331848029: goto L_0x0069;
                case 1503095341: goto L_0x005e;
                case 1504578661: goto L_0x0053;
                case 1504619009: goto L_0x0048;
                case 1504831518: goto L_0x003d;
                case 1505118770: goto L_0x0032;
                case 2039520277: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0130
        L_0x0027:
            java.lang.String r2 = "video/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r8
            goto L_0x0131
        L_0x0032:
            java.lang.String r2 = "audio/webm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r5
            goto L_0x0131
        L_0x003d:
            java.lang.String r2 = "audio/mpeg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r3
            goto L_0x0131
        L_0x0048:
            java.lang.String r2 = "audio/flac"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r10
            goto L_0x0131
        L_0x0053:
            java.lang.String r2 = "audio/eac3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r15
            goto L_0x0131
        L_0x005e:
            java.lang.String r2 = "audio/3gpp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r12
            goto L_0x0131
        L_0x0069:
            java.lang.String r2 = "video/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 15
            goto L_0x0131
        L_0x0075:
            java.lang.String r2 = "audio/wav"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 21
            goto L_0x0131
        L_0x0081:
            java.lang.String r2 = "audio/ogg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 18
            goto L_0x0131
        L_0x008d:
            java.lang.String r2 = "audio/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 16
            goto L_0x0131
        L_0x0099:
            java.lang.String r2 = "audio/amr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r13
            goto L_0x0131
        L_0x00a4:
            java.lang.String r2 = "audio/ac4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r14
            goto L_0x0131
        L_0x00af:
            java.lang.String r2 = "audio/ac3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r16
            goto L_0x0131
        L_0x00bb:
            java.lang.String r2 = "video/x-flv"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r9
            goto L_0x0131
        L_0x00c6:
            java.lang.String r2 = "application/webm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r4
            goto L_0x0131
        L_0x00d1:
            java.lang.String r2 = "audio/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r7
            goto L_0x0131
        L_0x00db:
            java.lang.String r2 = "text/vtt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 22
            goto L_0x0131
        L_0x00e6:
            java.lang.String r2 = "application/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 17
            goto L_0x0131
        L_0x00f1:
            java.lang.String r2 = "image/jpeg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 23
            goto L_0x0131
        L_0x00fc:
            java.lang.String r2 = "audio/amr-wb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r11
            goto L_0x0131
        L_0x0106:
            java.lang.String r2 = "video/webm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = r6
            goto L_0x0131
        L_0x0110:
            java.lang.String r2 = "video/mp2t"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 20
            goto L_0x0131
        L_0x011b:
            java.lang.String r2 = "video/mp2p"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 19
            goto L_0x0131
        L_0x0126:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0130
            r1 = 2
            goto L_0x0131
        L_0x0130:
            r1 = r0
        L_0x0131:
            switch(r1) {
                case 0: goto L_0x0142;
                case 1: goto L_0x0142;
                case 2: goto L_0x0142;
                case 3: goto L_0x0141;
                case 4: goto L_0x0140;
                case 5: goto L_0x0140;
                case 6: goto L_0x0140;
                case 7: goto L_0x013f;
                case 8: goto L_0x013e;
                case 9: goto L_0x013d;
                case 10: goto L_0x013d;
                case 11: goto L_0x013d;
                case 12: goto L_0x013d;
                case 13: goto L_0x013d;
                case 14: goto L_0x013c;
                case 15: goto L_0x013b;
                case 16: goto L_0x013b;
                case 17: goto L_0x013b;
                case 18: goto L_0x013a;
                case 19: goto L_0x0139;
                case 20: goto L_0x0138;
                case 21: goto L_0x0137;
                case 22: goto L_0x0136;
                case 23: goto L_0x0135;
                default: goto L_0x0134;
            }
        L_0x0134:
            return r0
        L_0x0135:
            return r3
        L_0x0136:
            return r4
        L_0x0137:
            return r5
        L_0x0138:
            return r6
        L_0x0139:
            return r7
        L_0x013a:
            return r8
        L_0x013b:
            return r9
        L_0x013c:
            return r10
        L_0x013d:
            return r11
        L_0x013e:
            return r12
        L_0x013f:
            return r13
        L_0x0140:
            return r14
        L_0x0141:
            return r15
        L_0x0142:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.FileTypes.inferFileTypeFromMimeType(java.lang.String):int");
    }

    public static int inferFileTypeFromUri(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC3) || lastPathSegment.endsWith(EXTENSION_EC3)) {
            return 0;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC4)) {
            return 1;
        }
        if (lastPathSegment.endsWith(EXTENSION_ADTS) || lastPathSegment.endsWith(EXTENSION_AAC)) {
            return 2;
        }
        if (lastPathSegment.endsWith(EXTENSION_AMR)) {
            return 3;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLAC)) {
            return 4;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLV)) {
            return 5;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_MK, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_WEBM)) {
            return 6;
        }
        if (lastPathSegment.endsWith(EXTENSION_MP3)) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(EXTENSION_PREFIX_M4, lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(EXTENSION_PREFIX_CMF, lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_OG, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_OPUS)) {
            return 9;
        }
        if (lastPathSegment.endsWith(EXTENSION_PS) || lastPathSegment.endsWith(EXTENSION_MPEG) || lastPathSegment.endsWith(EXTENSION_MPG) || lastPathSegment.endsWith(EXTENSION_M2P)) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(EXTENSION_WAV) || lastPathSegment.endsWith(EXTENSION_WAVE)) {
            return 12;
        }
        if (lastPathSegment.endsWith(EXTENSION_VTT) || lastPathSegment.endsWith(EXTENSION_WEBVTT)) {
            return 13;
        }
        if (lastPathSegment.endsWith(EXTENSION_JPG) || lastPathSegment.endsWith(EXTENSION_JPEG)) {
            return 14;
        }
        return -1;
    }
}
