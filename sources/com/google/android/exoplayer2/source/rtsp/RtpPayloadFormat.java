package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public final class RtpPayloadFormat {
    private static final String RTP_MEDIA_AC3 = "AC3";
    private static final String RTP_MEDIA_H264 = "H264";
    private static final String RTP_MEDIA_MPEG4_GENERIC = "MPEG4-GENERIC";
    public final int clockRate;
    public final ImmutableMap<String, String> fmtpParameters;
    public final Format format;
    public final int rtpPayloadType;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isFormatSupported(com.google.android.exoplayer2.source.rtsp.MediaDescription r5) {
        /*
            com.google.android.exoplayer2.source.rtsp.MediaDescription$RtpMapAttribute r5 = r5.rtpMapAttribute
            java.lang.String r5 = r5.mediaEncoding
            java.lang.String r5 = com.google.common.base.Ascii.toUpperCase((java.lang.String) r5)
            int r0 = r5.hashCode()
            r1 = -1922091719(0xffffffff8d6f3539, float:-7.3711626E-31)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0033
            r1 = 64593(0xfc51, float:9.0514E-41)
            if (r0 == r1) goto L_0x0029
            r1 = 2194728(0x217d28, float:3.075469E-39)
            if (r0 == r1) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.lang.String r0 = "H264"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003d
            r5 = r4
            goto L_0x003e
        L_0x0029:
            java.lang.String r0 = "AC3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003d
            r5 = r2
            goto L_0x003e
        L_0x0033:
            java.lang.String r0 = "MPEG4-GENERIC"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003d
            r5 = r3
            goto L_0x003e
        L_0x003d:
            r5 = -1
        L_0x003e:
            if (r5 == 0) goto L_0x0045
            if (r5 == r4) goto L_0x0045
            if (r5 == r3) goto L_0x0045
            return r2
        L_0x0045:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat.isFormatSupported(com.google.android.exoplayer2.source.rtsp.MediaDescription):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMimeTypeFromRtpMediaType(java.lang.String r5) {
        /*
            java.lang.String r0 = com.google.common.base.Ascii.toUpperCase((java.lang.String) r5)
            int r1 = r0.hashCode()
            r2 = -1922091719(0xffffffff8d6f3539, float:-7.3711626E-31)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002e
            r2 = 64593(0xfc51, float:9.0514E-41)
            if (r1 == r2) goto L_0x0024
            r2 = 2194728(0x217d28, float:3.075469E-39)
            if (r1 == r2) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r1 = "H264"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = r4
            goto L_0x0039
        L_0x0024:
            java.lang.String r1 = "AC3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 0
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = "MPEG4-GENERIC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = r3
            goto L_0x0039
        L_0x0038:
            r0 = -1
        L_0x0039:
            if (r0 == 0) goto L_0x004b
            if (r0 == r4) goto L_0x0048
            if (r0 != r3) goto L_0x0042
            java.lang.String r5 = "audio/mp4a-latm"
            return r5
        L_0x0042:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x0048:
            java.lang.String r5 = "video/avc"
            return r5
        L_0x004b:
            java.lang.String r5 = "audio/ac3"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat.getMimeTypeFromRtpMediaType(java.lang.String):java.lang.String");
    }

    public RtpPayloadFormat(Format format2, int i, int i2, Map<String, String> map) {
        this.rtpPayloadType = i;
        this.clockRate = i2;
        this.format = format2;
        this.fmtpParameters = ImmutableMap.copyOf(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RtpPayloadFormat rtpPayloadFormat = (RtpPayloadFormat) obj;
        if (this.rtpPayloadType != rtpPayloadFormat.rtpPayloadType || this.clockRate != rtpPayloadFormat.clockRate || !this.format.equals(rtpPayloadFormat.format) || !this.fmtpParameters.equals(rtpPayloadFormat.fmtpParameters)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((217 + this.rtpPayloadType) * 31) + this.clockRate) * 31) + this.format.hashCode()) * 31) + this.fmtpParameters.hashCode();
    }
}
