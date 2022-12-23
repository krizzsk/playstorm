package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader;

public final class DefaultRtpPayloadReaderFactory implements RtpPayloadReader.Factory {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader createPayloadReader(com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat r6) {
        /*
            r5 = this;
            com.google.android.exoplayer2.Format r0 = r6.format
            java.lang.String r0 = r0.sampleMimeType
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.hashCode()
            r2 = -53558318(0xfffffffffccec3d2, float:-8.588679E36)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0034
            r2 = 187078296(0xb269698, float:3.208373E-32)
            if (r1 == r2) goto L_0x002a
            r2 = 1331836730(0x4f62373a, float:3.79527014E9)
            if (r1 == r2) goto L_0x0020
            goto L_0x003e
        L_0x0020:
            java.lang.String r1 = "video/avc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = r3
            goto L_0x003f
        L_0x002a:
            java.lang.String r1 = "audio/ac3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x0034:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = r4
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            if (r0 == 0) goto L_0x0053
            if (r0 == r4) goto L_0x004d
            if (r0 == r3) goto L_0x0047
            r6 = 0
            return r6
        L_0x0047:
            com.google.android.exoplayer2.source.rtsp.reader.RtpH264Reader r0 = new com.google.android.exoplayer2.source.rtsp.reader.RtpH264Reader
            r0.<init>(r6)
            return r0
        L_0x004d:
            com.google.android.exoplayer2.source.rtsp.reader.RtpAacReader r0 = new com.google.android.exoplayer2.source.rtsp.reader.RtpAacReader
            r0.<init>(r6)
            return r0
        L_0x0053:
            com.google.android.exoplayer2.source.rtsp.reader.RtpAc3Reader r0 = new com.google.android.exoplayer2.source.rtsp.reader.RtpAc3Reader
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.reader.DefaultRtpPayloadReaderFactory.createPayloadReader(com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat):com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader");
    }
}
