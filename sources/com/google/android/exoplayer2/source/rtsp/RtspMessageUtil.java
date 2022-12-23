package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class RtspMessageUtil {
    private static final Pattern CONTENT_LENGTH_HEADER_PATTERN = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    private static final String CRLF = new String(new byte[]{Ascii.f17935CR, 10});
    public static final long DEFAULT_RTSP_TIMEOUT_MS = 60000;

    /* renamed from: LF */
    private static final String f14487LF = new String(new byte[]{10});
    private static final Pattern REQUEST_LINE_PATTERN = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    private static final String RTSP_VERSION = "RTSP/1.0";
    private static final Pattern SESSION_HEADER_PATTERN = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    private static final Pattern STATUS_LINE_PATTERN = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    private static final Pattern WWW_AUTHENTICATION_HEADER_BASIC_PATTERN = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
    private static final Pattern WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    public static final class RtspSessionHeader {
        public final String sessionId;
        public final long timeoutMs;

        public RtspSessionHeader(String str, long j) {
            this.sessionId = str;
            this.timeoutMs = j;
        }
    }

    public static final class RtspAuthUserInfo {
        public final String password;
        public final String username;

        public RtspAuthUserInfo(String str, String str2) {
            this.username = str;
            this.password = str2;
        }
    }

    public static ImmutableList<String> serializeRequest(RtspRequest rtspRequest) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.add((Object) Util.formatInvariant("%s %s %s", toMethodString(rtspRequest.method), rtspRequest.uri, RTSP_VERSION));
        ImmutableListMultimap<String, String> asMultiMap = rtspRequest.headers.asMultiMap();
        UnmodifiableIterator<String> it = asMultiMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList immutableList = asMultiMap.get((Object) next);
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add((Object) Util.formatInvariant("%s: %s", next, immutableList.get(i)));
            }
        }
        builder.add((Object) "");
        builder.add((Object) rtspRequest.messageBody);
        return builder.build();
    }

    public static ImmutableList<String> serializeResponse(RtspResponse rtspResponse) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.add((Object) Util.formatInvariant("%s %s %s", RTSP_VERSION, Integer.valueOf(rtspResponse.status), getRtspStatusReasonPhrase(rtspResponse.status)));
        ImmutableListMultimap<String, String> asMultiMap = rtspResponse.headers.asMultiMap();
        UnmodifiableIterator<String> it = asMultiMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList immutableList = asMultiMap.get((Object) next);
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add((Object) Util.formatInvariant("%s: %s", next, immutableList.get(i)));
            }
        }
        builder.add((Object) "");
        builder.add((Object) rtspResponse.messageBody);
        return builder.build();
    }

    public static byte[] convertMessageToByteArray(List<String> list) {
        return Joiner.m20715on(CRLF).join((Iterable<?>) list).getBytes(RtspMessageChannel.CHARSET);
    }

    public static Uri removeUserInfo(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) Assertions.checkNotNull(uri.getAuthority());
        Assertions.checkArgument(str.contains("@"));
        return uri.buildUpon().encodedAuthority(Util.split(str, "@")[1]).build();
    }

    public static RtspAuthUserInfo parseUserInfo(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(CertificateUtil.DELIMITER)) {
            return null;
        }
        String[] splitAtFirst = Util.splitAtFirst(userInfo, CertificateUtil.DELIMITER);
        return new RtspAuthUserInfo(splitAtFirst[0], splitAtFirst[1]);
    }

    public static byte[] getStringBytes(String str) {
        return str.getBytes(RtspMessageChannel.CHARSET);
    }

    public static String toMethodString(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int parseMethodString(java.lang.String r12) {
        /*
            int r0 = r12.hashCode()
            r1 = 11
            r2 = 10
            r3 = 9
            r4 = 8
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r0) {
                case -1881579439: goto L_0x0089;
                case -880847356: goto L_0x007f;
                case -702888512: goto L_0x0075;
                case -531492226: goto L_0x006b;
                case -84360524: goto L_0x0061;
                case 2458420: goto L_0x0057;
                case 6481884: goto L_0x004d;
                case 71242700: goto L_0x0043;
                case 75902422: goto L_0x0039;
                case 78791261: goto L_0x002e;
                case 133006441: goto L_0x0023;
                case 1800840907: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0093
        L_0x0018:
            java.lang.String r0 = "DESCRIBE"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r11
            goto L_0x0094
        L_0x0023:
            java.lang.String r0 = "ANNOUNCE"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = 0
            goto L_0x0094
        L_0x002e:
            java.lang.String r0 = "SETUP"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r3
            goto L_0x0094
        L_0x0039:
            java.lang.String r0 = "PAUSE"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r8
            goto L_0x0094
        L_0x0043:
            java.lang.String r0 = "SET_PARAMETER"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r2
            goto L_0x0094
        L_0x004d:
            java.lang.String r0 = "REDIRECT"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r4
            goto L_0x0094
        L_0x0057:
            java.lang.String r0 = "PLAY"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r7
            goto L_0x0094
        L_0x0061:
            java.lang.String r0 = "PLAY_NOTIFY"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r6
            goto L_0x0094
        L_0x006b:
            java.lang.String r0 = "OPTIONS"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r9
            goto L_0x0094
        L_0x0075:
            java.lang.String r0 = "GET_PARAMETER"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r10
            goto L_0x0094
        L_0x007f:
            java.lang.String r0 = "TEARDOWN"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r1
            goto L_0x0094
        L_0x0089:
            java.lang.String r0 = "RECORD"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x0093
            r12 = r5
            goto L_0x0094
        L_0x0093:
            r12 = -1
        L_0x0094:
            switch(r12) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a9;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a7;
                case 4: goto L_0x00a6;
                case 5: goto L_0x00a5;
                case 6: goto L_0x00a4;
                case 7: goto L_0x00a3;
                case 8: goto L_0x00a2;
                case 9: goto L_0x00a1;
                case 10: goto L_0x00a0;
                case 11: goto L_0x009d;
                default: goto L_0x0097;
            }
        L_0x0097:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L_0x009d:
            r12 = 12
            return r12
        L_0x00a0:
            return r1
        L_0x00a1:
            return r2
        L_0x00a2:
            return r3
        L_0x00a3:
            return r4
        L_0x00a4:
            return r5
        L_0x00a5:
            return r6
        L_0x00a6:
            return r7
        L_0x00a7:
            return r8
        L_0x00a8:
            return r9
        L_0x00a9:
            return r10
        L_0x00aa:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtspMessageUtil.parseMethodString(java.lang.String):int");
    }

    public static RtspResponse parseResponse(List<String> list) {
        boolean z = false;
        Matcher matcher = STATUS_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
        int indexOf = list.indexOf("");
        if (indexOf > 0) {
            z = true;
        }
        Assertions.checkArgument(z);
        return new RtspResponse(parseInt, new RtspHeaders.Builder().addAll(list.subList(1, indexOf)).build(), Joiner.m20715on(CRLF).join((Iterable<?>) list.subList(indexOf + 1, list.size())));
    }

    public static RtspRequest parseRequest(List<String> list) {
        boolean z = false;
        Matcher matcher = REQUEST_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int parseMethodString = parseMethodString((String) Assertions.checkNotNull(matcher.group(1)));
        Uri parse = Uri.parse((String) Assertions.checkNotNull(matcher.group(2)));
        int indexOf = list.indexOf("");
        if (indexOf > 0) {
            z = true;
        }
        Assertions.checkArgument(z);
        return new RtspRequest(parse, parseMethodString, new RtspHeaders.Builder().addAll(list.subList(1, indexOf)).build(), Joiner.m20715on(CRLF).join((Iterable<?>) list.subList(indexOf + 1, list.size())));
    }

    public static boolean isRtspStartLine(String str) {
        return REQUEST_LINE_PATTERN.matcher(str).matches() || STATUS_LINE_PATTERN.matcher(str).matches();
    }

    public static String[] splitRtspMessageBody(String str) {
        return Util.split(str, str.contains(CRLF) ? CRLF : f14487LF);
    }

    public static long parseContentLengthHeader(String str) throws ParserException {
        try {
            Matcher matcher = CONTENT_LENGTH_HEADER_PATTERN.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    public static ImmutableList<Integer> parsePublicHeader(String str) {
        if (str == null) {
            return ImmutableList.m20745of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (String parseMethodString : Util.split(str, ",\\s?")) {
            builder.add((Object) Integer.valueOf(parseMethodString(parseMethodString)));
        }
        return builder.build();
    }

    public static RtspSessionHeader parseSessionHeader(String str) throws ParserException {
        Matcher matcher = SESSION_HEADER_PATTERN.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(1));
            long j = 60000;
            String group = matcher.group(2);
            if (group != null) {
                try {
                    j = ((long) Integer.parseInt(group)) * 1000;
                } catch (NumberFormatException e) {
                    throw ParserException.createForMalformedManifest(str, e);
                }
            }
            return new RtspSessionHeader(str2, j);
        }
        throw ParserException.createForMalformedManifest(str, (Throwable) null);
    }

    public static RtspAuthenticationInfo parseWwwAuthenticateHeader(String str) throws ParserException {
        Matcher matcher = WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN.matcher(str);
        if (matcher.find()) {
            return new RtspAuthenticationInfo(2, (String) Assertions.checkNotNull(matcher.group(1)), (String) Assertions.checkNotNull(matcher.group(3)), Strings.nullToEmpty(matcher.group(4)));
        }
        Matcher matcher2 = WWW_AUTHENTICATION_HEADER_BASIC_PATTERN.matcher(str);
        if (matcher2.matches()) {
            return new RtspAuthenticationInfo(1, (String) Assertions.checkNotNull(matcher2.group(1)), "", "");
        }
        String valueOf = String.valueOf(str);
        throw ParserException.createForMalformedManifest(valueOf.length() != 0 ? "Invalid WWW-Authenticate header ".concat(valueOf) : new String("Invalid WWW-Authenticate header "), (Throwable) null);
    }

    private static String getRtspStatusReasonPhrase(int i) {
        if (i == 200) {
            return "OK";
        }
        if (i == 461) {
            return "Unsupported Transport";
        }
        if (i == 500) {
            return "Internal Server Error";
        }
        if (i == 505) {
            return "RTSP Version Not Supported";
        }
        if (i == 400) {
            return "Bad Request";
        }
        if (i == 401) {
            return "Unauthorized";
        }
        if (i == 404) {
            return "Not Found";
        }
        if (i == 405) {
            return "Method Not Allowed";
        }
        switch (i) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int parseInt(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    private RtspMessageUtil() {
    }
}
