package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.util.Assertions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class SessionDescriptionParser {
    private static final Pattern ATTRIBUTE_PATTERN = Pattern.compile("([0-9A-Za-z-]+)(?::(.*))?");
    private static final String ATTRIBUTE_TYPE = "a";
    private static final String BANDWIDTH_TYPE = "b";
    private static final String CONNECTION_TYPE = "c";
    private static final String EMAIL_TYPE = "e";
    private static final String INFORMATION_TYPE = "i";
    private static final String KEY_TYPE = "k";
    private static final Pattern MEDIA_DESCRIPTION_PATTERN = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");
    private static final String MEDIA_TYPE = "m";
    private static final String ORIGIN_TYPE = "o";
    private static final String PHONE_NUMBER_TYPE = "p";
    private static final String REPEAT_TYPE = "r";
    private static final Pattern SDP_LINE_PATTERN = Pattern.compile("([a-z])=\\s?(.+)");
    private static final String SESSION_TYPE = "s";
    private static final String TIMING_TYPE = "t";
    private static final String URI_TYPE = "u";
    private static final String VERSION_TYPE = "v";
    private static final String ZONE_TYPE = "z";

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d3, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.source.rtsp.SessionDescription parse(java.lang.String r13) throws com.google.android.exoplayer2.ParserException {
        /*
            com.google.android.exoplayer2.source.rtsp.SessionDescription$Builder r0 = new com.google.android.exoplayer2.source.rtsp.SessionDescription$Builder
            r0.<init>()
            java.lang.String[] r13 = com.google.android.exoplayer2.source.rtsp.RtspMessageUtil.splitRtspMessageBody(r13)
            int r1 = r13.length
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
        L_0x000e:
            if (r4 >= r1) goto L_0x01d7
            r6 = r13[r4]
            java.lang.String r7 = ""
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x001c
            goto L_0x01d3
        L_0x001c:
            java.util.regex.Pattern r7 = SDP_LINE_PATTERN
            java.util.regex.Matcher r7 = r7.matcher(r6)
            boolean r8 = r7.matches()
            if (r8 != 0) goto L_0x0044
            java.lang.String r13 = "Malformed SDP line: "
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0039
            java.lang.String r13 = r13.concat(r0)
            goto L_0x003f
        L_0x0039:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13)
            r13 = r0
        L_0x003f:
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r13, r3)
            throw r13
        L_0x0044:
            r8 = 1
            java.lang.String r9 = r7.group(r8)
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            java.lang.String r9 = (java.lang.String) r9
            r10 = 2
            java.lang.String r7 = r7.group(r10)
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            java.lang.String r7 = (java.lang.String) r7
            r11 = -1
            int r12 = r9.hashCode()
            switch(r12) {
                case 97: goto L_0x00fb;
                case 98: goto L_0x00f0;
                case 99: goto L_0x00e6;
                case 100: goto L_0x0062;
                case 101: goto L_0x00dc;
                case 102: goto L_0x0062;
                case 103: goto L_0x0062;
                case 104: goto L_0x0062;
                case 105: goto L_0x00d2;
                case 106: goto L_0x0062;
                case 107: goto L_0x00c7;
                case 108: goto L_0x0062;
                case 109: goto L_0x00bc;
                case 110: goto L_0x0062;
                case 111: goto L_0x00b2;
                case 112: goto L_0x00a8;
                case 113: goto L_0x0062;
                case 114: goto L_0x009d;
                case 115: goto L_0x0092;
                case 116: goto L_0x0086;
                case 117: goto L_0x007b;
                case 118: goto L_0x0070;
                case 119: goto L_0x0062;
                case 120: goto L_0x0062;
                case 121: goto L_0x0062;
                case 122: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x0105
        L_0x0064:
            java.lang.String r12 = "z"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 14
            goto L_0x0105
        L_0x0070:
            java.lang.String r12 = "v"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = r2
            goto L_0x0105
        L_0x007b:
            java.lang.String r12 = "u"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 4
            goto L_0x0105
        L_0x0086:
            java.lang.String r12 = "t"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 9
            goto L_0x0105
        L_0x0092:
            java.lang.String r12 = "s"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = r10
            goto L_0x0105
        L_0x009d:
            java.lang.String r12 = "r"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 13
            goto L_0x0105
        L_0x00a8:
            java.lang.String r12 = "p"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 6
            goto L_0x0105
        L_0x00b2:
            java.lang.String r12 = "o"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = r8
            goto L_0x0105
        L_0x00bc:
            java.lang.String r12 = "m"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 12
            goto L_0x0105
        L_0x00c7:
            java.lang.String r12 = "k"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 10
            goto L_0x0105
        L_0x00d2:
            java.lang.String r12 = "i"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 3
            goto L_0x0105
        L_0x00dc:
            java.lang.String r12 = "e"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 5
            goto L_0x0105
        L_0x00e6:
            java.lang.String r12 = "c"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 7
            goto L_0x0105
        L_0x00f0:
            java.lang.String r12 = "b"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 8
            goto L_0x0105
        L_0x00fb:
            java.lang.String r12 = "a"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0105
            r11 = 11
        L_0x0105:
            switch(r11) {
                case 0: goto L_0x01bb;
                case 1: goto L_0x01b7;
                case 2: goto L_0x01b3;
                case 3: goto L_0x01a9;
                case 4: goto L_0x01a1;
                case 5: goto L_0x019d;
                case 6: goto L_0x0199;
                case 7: goto L_0x018f;
                case 8: goto L_0x016c;
                case 9: goto L_0x0167;
                case 10: goto L_0x015b;
                case 11: goto L_0x0115;
                case 12: goto L_0x010a;
                default: goto L_0x0108;
            }
        L_0x0108:
            goto L_0x01d3
        L_0x010a:
            if (r5 == 0) goto L_0x010f
            addMediaDescriptionToSession(r0, r5)
        L_0x010f:
            com.google.android.exoplayer2.source.rtsp.MediaDescription$Builder r5 = parseMediaDescriptionLine(r7)
            goto L_0x01d3
        L_0x0115:
            java.util.regex.Pattern r9 = ATTRIBUTE_PATTERN
            java.util.regex.Matcher r7 = r9.matcher(r7)
            boolean r9 = r7.matches()
            if (r9 != 0) goto L_0x013d
            java.lang.String r13 = "Malformed Attribute line: "
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0132
            java.lang.String r13 = r13.concat(r0)
            goto L_0x0138
        L_0x0132:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13)
            r13 = r0
        L_0x0138:
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r13, r3)
            throw r13
        L_0x013d:
            java.lang.String r6 = r7.group(r8)
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r7.group(r10)
            java.lang.String r7 = com.google.common.base.Strings.nullToEmpty(r7)
            if (r5 != 0) goto L_0x0156
            r0.addAttribute(r6, r7)
            goto L_0x01d3
        L_0x0156:
            r5.addAttribute(r6, r7)
            goto L_0x01d3
        L_0x015b:
            if (r5 != 0) goto L_0x0162
            r0.setKey(r7)
            goto L_0x01d3
        L_0x0162:
            r5.setKey(r7)
            goto L_0x01d3
        L_0x0167:
            r0.setTiming(r7)
            goto L_0x01d3
        L_0x016c:
            java.lang.String r6 = ":\\s?"
            java.lang.String[] r6 = com.google.android.exoplayer2.util.Util.split(r7, r6)
            int r7 = r6.length
            if (r7 != r10) goto L_0x0177
            r7 = r8
            goto L_0x0178
        L_0x0177:
            r7 = r2
        L_0x0178:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r7)
            r6 = r6[r8]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r5 != 0) goto L_0x0189
            int r6 = r6 * 1000
            r0.setBitrate(r6)
            goto L_0x01d3
        L_0x0189:
            int r6 = r6 * 1000
            r5.setBitrate(r6)
            goto L_0x01d3
        L_0x018f:
            if (r5 != 0) goto L_0x0195
            r0.setConnection(r7)
            goto L_0x01d3
        L_0x0195:
            r5.setConnection(r7)
            goto L_0x01d3
        L_0x0199:
            r0.setPhoneNumber(r7)
            goto L_0x01d3
        L_0x019d:
            r0.setEmailAddress(r7)
            goto L_0x01d3
        L_0x01a1:
            android.net.Uri r6 = android.net.Uri.parse(r7)
            r0.setUri(r6)
            goto L_0x01d3
        L_0x01a9:
            if (r5 != 0) goto L_0x01af
            r0.setSessionInfo(r7)
            goto L_0x01d3
        L_0x01af:
            r5.setMediaTitle(r7)
            goto L_0x01d3
        L_0x01b3:
            r0.setSessionName(r7)
            goto L_0x01d3
        L_0x01b7:
            r0.setOrigin(r7)
            goto L_0x01d3
        L_0x01bb:
            java.lang.String r6 = "0"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01c4
            goto L_0x01d3
        L_0x01c4:
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r2] = r7
            java.lang.String r0 = "SDP version %s is not supported."
            java.lang.String r13 = java.lang.String.format(r0, r13)
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r13, r3)
            throw r13
        L_0x01d3:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x01d7:
            if (r5 == 0) goto L_0x01dc
            addMediaDescriptionToSession(r0, r5)
        L_0x01dc:
            com.google.android.exoplayer2.source.rtsp.SessionDescription r13 = r0.build()     // Catch:{ IllegalArgumentException -> 0x01e3, IllegalStateException -> 0x01e1 }
            return r13
        L_0x01e1:
            r13 = move-exception
            goto L_0x01e4
        L_0x01e3:
            r13 = move-exception
        L_0x01e4:
            com.google.android.exoplayer2.ParserException r13 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r3, r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.SessionDescriptionParser.parse(java.lang.String):com.google.android.exoplayer2.source.rtsp.SessionDescription");
    }

    private static void addMediaDescriptionToSession(SessionDescription.Builder builder, MediaDescription.Builder builder2) throws ParserException {
        try {
            builder.addMediaDescription(builder2.build());
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.createForMalformedManifest((String) null, e);
        }
    }

    private static MediaDescription.Builder parseMediaDescriptionLine(String str) throws ParserException {
        Matcher matcher = MEDIA_DESCRIPTION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw ParserException.createForMalformedManifest(valueOf.length() != 0 ? "Malformed SDP media description line: ".concat(valueOf) : new String("Malformed SDP media description line: "), (Throwable) null);
        }
        try {
            return new MediaDescription.Builder((String) Assertions.checkNotNull(matcher.group(1)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))), (String) Assertions.checkNotNull(matcher.group(3)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4))));
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(str);
            throw ParserException.createForMalformedManifest(valueOf2.length() != 0 ? "Malformed SDP media description line: ".concat(valueOf2) : new String("Malformed SDP media description line: "), e);
        }
    }

    private SessionDescriptionParser() {
    }
}
