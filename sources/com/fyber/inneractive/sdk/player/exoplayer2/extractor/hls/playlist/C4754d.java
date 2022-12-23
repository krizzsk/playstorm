package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5020y;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d */
public final class C4754d implements C5020y.C5021a<C4753c> {

    /* renamed from: a */
    public static final Pattern f12077a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    public static final Pattern f12078b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: c */
    public static final Pattern f12079c = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: d */
    public static final Pattern f12080d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: e */
    public static final Pattern f12081e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: f */
    public static final Pattern f12082f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: g */
    public static final Pattern f12083g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: h */
    public static final Pattern f12084h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: i */
    public static final Pattern f12085i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: j */
    public static final Pattern f12086j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: k */
    public static final Pattern f12087k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: l */
    public static final Pattern f12088l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: m */
    public static final Pattern f12089m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* renamed from: n */
    public static final Pattern f12090n = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: o */
    public static final Pattern f12091o = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: p */
    public static final Pattern f12092p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: q */
    public static final Pattern f12093q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: r */
    public static final Pattern f12094r = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: s */
    public static final Pattern f12095s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: t */
    public static final Pattern f12096t = m14614a("AUTOSELECT");

    /* renamed from: u */
    public static final Pattern f12097u = m14614a("DEFAULT");

    /* renamed from: v */
    public static final Pattern f12098v = m14614a("FORCED");

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a */
    public static class C4755a {

        /* renamed from: a */
        public final BufferedReader f12099a;

        /* renamed from: b */
        public final Queue<String> f12100b;

        /* renamed from: c */
        public String f12101c;

        public C4755a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f12100b = queue;
            this.f12099a = bufferedReader;
        }

        /* renamed from: a */
        public boolean mo25228a() throws IOException {
            String trim;
            if (this.f12101c != null) {
                return true;
            }
            if (!this.f12100b.isEmpty()) {
                this.f12101c = this.f12100b.poll();
                return true;
            }
            do {
                String readLine = this.f12099a.readLine();
                this.f12101c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f12101c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String mo25229b() throws IOException {
            if (!mo25228a()) {
                return null;
            }
            String str = this.f12101c;
            this.f12101c = null;
            return str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4751b m14616b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4754d.C4755a r63, java.lang.String r64) throws java.io.IOException {
        /*
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r0 = 2
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            r8 = 0
            r9 = 1
            r10 = r1
            r20 = r10
            r12 = r6
            r24 = r12
            r44 = r24
            r47 = r44
            r1 = r8
            r2 = r1
            r16 = r2
            r17 = r16
            r18 = r17
            r22 = r18
            r26 = r22
            r42 = r26
            r19 = r9
            r23 = 0
            r40 = -1
        L_0x0032:
            r43 = 0
            r46 = 0
        L_0x0036:
            boolean r27 = r63.mo25228a()
            if (r27 == 0) goto L_0x0309
            java.lang.String r5 = r63.mo25229b()
            java.lang.String r3 = "#EXT-X-PLAYLIST-TYPE"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x0066
            java.util.regex.Pattern r3 = f12083g
            java.lang.String r3 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            java.lang.String r4 = "VOD"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0058
            r1 = r9
            goto L_0x0036
        L_0x0058:
            java.lang.String r4 = "EVENT"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0062
            r1 = r0
            goto L_0x0036
        L_0x0062:
            r3 = -1
            goto L_0x0304
        L_0x0066:
            java.lang.String r3 = "#EXT-X-START"
            boolean r3 = r5.startsWith(r3)
            r27 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r3 == 0) goto L_0x0081
            java.util.regex.Pattern r3 = f12086j
            java.lang.String r3 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            double r3 = java.lang.Double.parseDouble(r3)
            double r3 = r3 * r27
            long r10 = (long) r3
            goto L_0x0036
        L_0x0081:
            java.lang.String r3 = "#EXT-X-MAP"
            boolean r3 = r5.startsWith(r3)
            java.lang.String r4 = "@"
            if (r3 == 0) goto L_0x00cc
            java.util.regex.Pattern r3 = f12090n
            java.lang.String r50 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            java.util.regex.Pattern r3 = f12088l
            java.lang.String r3 = m14613a((java.lang.String) r5, (java.util.regex.Pattern) r3)
            if (r3 == 0) goto L_0x00ac
            java.lang.String[] r3 = r3.split(r4)
            r4 = r3[r8]
            long r40 = java.lang.Long.parseLong(r4)
            int r4 = r3.length
            if (r4 <= r9) goto L_0x00ac
            r3 = r3[r9]
            long r24 = java.lang.Long.parseLong(r3)
        L_0x00ac:
            r59 = r24
            r61 = r40
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r23 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a
            r51 = 0
            r53 = -1
            r54 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r56 = 0
            r57 = 0
            r58 = 0
            r49 = r23
            r49.<init>(r50, r51, r53, r54, r56, r57, r58, r59, r61)
            r24 = r6
            r40 = -1
            goto L_0x0036
        L_0x00cc:
            java.lang.String r3 = "#EXT-X-TARGETDURATION"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x00e6
            java.util.regex.Pattern r3 = f12081e
            java.lang.String r3 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            int r3 = java.lang.Integer.parseInt(r3)
            long r3 = (long) r3
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r20 = r20 * r3
            goto L_0x0036
        L_0x00e6:
            java.lang.String r3 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x00fc
            java.util.regex.Pattern r3 = f12084h
            java.lang.String r3 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            int r26 = java.lang.Integer.parseInt(r3)
            r18 = r26
            goto L_0x0036
        L_0x00fc:
            java.lang.String r3 = "#EXT-X-VERSION"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x0110
            java.util.regex.Pattern r3 = f12082f
            java.lang.String r3 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            int r19 = java.lang.Integer.parseInt(r3)
            goto L_0x0036
        L_0x0110:
            java.lang.String r3 = "#EXTINF"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x0129
            java.util.regex.Pattern r3 = f12085i
            java.lang.String r3 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            double r3 = java.lang.Double.parseDouble(r3)
            double r3 = r3 * r27
            long r3 = (long) r3
            r47 = r3
            goto L_0x0036
        L_0x0129:
            java.lang.String r3 = "#EXT-X-KEY"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x014d
            java.util.regex.Pattern r3 = f12089m
            java.lang.String r3 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            java.lang.String r4 = "AES-128"
            boolean r42 = r4.equals(r3)
            if (r42 == 0) goto L_0x0032
            java.util.regex.Pattern r3 = f12090n
            java.lang.String r46 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            java.util.regex.Pattern r3 = f12091o
            java.lang.String r43 = m14613a((java.lang.String) r5, (java.util.regex.Pattern) r3)
            goto L_0x0036
        L_0x014d:
            java.lang.String r3 = "#EXT-X-BYTERANGE"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x0170
            java.util.regex.Pattern r3 = f12087k
            java.lang.String r3 = m14617b((java.lang.String) r5, (java.util.regex.Pattern) r3)
            java.lang.String[] r3 = r3.split(r4)
            r4 = r3[r8]
            long r40 = java.lang.Long.parseLong(r4)
            int r4 = r3.length
            if (r4 <= r9) goto L_0x0036
            r3 = r3[r9]
            long r24 = java.lang.Long.parseLong(r3)
            goto L_0x0036
        L_0x0170:
            java.lang.String r3 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r3 = r5.startsWith(r3)
            r4 = 58
            if (r3 == 0) goto L_0x018b
            int r3 = r5.indexOf(r4)
            int r3 = r3 + r9
            java.lang.String r3 = r5.substring(r3)
            int r17 = java.lang.Integer.parseInt(r3)
            r16 = r9
            goto L_0x0036
        L_0x018b:
            java.lang.String r3 = "#EXT-X-DISCONTINUITY"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0197
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0197:
            java.lang.String r3 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x029d
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0062
            int r3 = r5.indexOf(r4)
            int r3 = r3 + r9
            java.lang.String r3 = r5.substring(r3)
            java.util.regex.Pattern r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13476f
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r5 = r4.matches()
            if (r5 == 0) goto L_0x0286
            r3 = 9
            java.lang.String r5 = r4.group(r3)
            if (r5 != 0) goto L_0x01c1
            goto L_0x01cd
        L_0x01c1:
            java.lang.String r3 = r4.group(r3)
            java.lang.String r5 = "Z"
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L_0x01cf
        L_0x01cd:
            r3 = r8
            goto L_0x01f6
        L_0x01cf:
            r3 = 12
            java.lang.String r3 = r4.group(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            int r3 = r3 * 60
            r5 = 13
            java.lang.String r5 = r4.group(r5)
            int r5 = java.lang.Integer.parseInt(r5)
            int r3 = r3 + r5
            r5 = 11
            java.lang.String r5 = r4.group(r5)
            java.lang.String r12 = "-"
            boolean r5 = r5.equals(r12)
            if (r5 == 0) goto L_0x01f6
            int r3 = r3 * -1
        L_0x01f6:
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar
            java.lang.String r12 = "GMT"
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r12)
            r5.<init>(r12)
            r5.clear()
            java.lang.String r12 = r4.group(r9)
            int r28 = java.lang.Integer.parseInt(r12)
            java.lang.String r12 = r4.group(r0)
            int r12 = java.lang.Integer.parseInt(r12)
            int r29 = r12 + -1
            r12 = 3
            java.lang.String r13 = r4.group(r12)
            int r30 = java.lang.Integer.parseInt(r13)
            r13 = 4
            java.lang.String r13 = r4.group(r13)
            int r31 = java.lang.Integer.parseInt(r13)
            r13 = 5
            java.lang.String r13 = r4.group(r13)
            int r32 = java.lang.Integer.parseInt(r13)
            r13 = 6
            java.lang.String r13 = r4.group(r13)
            int r33 = java.lang.Integer.parseInt(r13)
            r27 = r5
            r27.set(r28, r29, r30, r31, r32, r33)
            r13 = 8
            java.lang.String r27 = r4.group(r13)
            boolean r27 = android.text.TextUtils.isEmpty(r27)
            if (r27 != 0) goto L_0x0272
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "0."
            r8.append(r9)
            java.lang.String r4 = r4.group(r13)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r0.<init>(r4)
            java.math.BigDecimal r0 = r0.movePointRight(r12)
            int r0 = r0.intValue()
            r4 = 14
            r5.set(r4, r0)
        L_0x0272:
            long r4 = r5.getTimeInMillis()
            if (r3 == 0) goto L_0x027e
            r0 = 60000(0xea60, float:8.4078E-41)
            int r3 = r3 * r0
            long r8 = (long) r3
            long r4 = r4 - r8
        L_0x027e:
            long r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4695b.m14454a(r4)
            long r12 = r3 - r44
            goto L_0x0304
        L_0x0286:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid date/time format: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x029d:
            java.lang.String r0 = "#EXT-X-DATERANGE"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x02aa
            r14.add(r5)
            goto L_0x0062
        L_0x02aa:
            java.lang.String r0 = "#"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L_0x02f3
            if (r42 != 0) goto L_0x02b7
            r35 = 0
            goto L_0x02c2
        L_0x02b7:
            if (r43 == 0) goto L_0x02bc
            r35 = r43
            goto L_0x02c2
        L_0x02bc:
            java.lang.String r0 = java.lang.Integer.toHexString(r26)
            r35 = r0
        L_0x02c2:
            int r0 = r26 + 1
            r3 = -1
            int r8 = (r40 > r3 ? 1 : (r40 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x02cc
            r24 = r6
        L_0x02cc:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r9 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a
            r26 = r9
            r27 = r5
            r28 = r47
            r30 = r2
            r31 = r44
            r33 = r42
            r34 = r46
            r36 = r24
            r38 = r40
            r26.<init>(r27, r28, r30, r31, r33, r34, r35, r36, r38)
            r15.add(r9)
            long r44 = r44 + r47
            if (r8 == 0) goto L_0x02ec
            long r24 = r24 + r40
        L_0x02ec:
            r26 = r0
            r40 = r3
            r47 = r6
            goto L_0x0304
        L_0x02f3:
            r3 = -1
            java.lang.String r0 = "#EXT-X-ENDLIST"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0304
            r0 = 2
            r8 = 0
            r9 = 1
            r22 = 1
            goto L_0x0036
        L_0x0304:
            r0 = 2
            r8 = 0
            r9 = 1
            goto L_0x0036
        L_0x0309:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r24 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0312
            r50 = 1
            goto L_0x0314
        L_0x0312:
            r50 = 0
        L_0x0314:
            r0 = r24
            r2 = r64
            r3 = r10
            r5 = r12
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r13 = r22
            r17 = r14
            r14 = r50
            r16 = r15
            r15 = r23
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4754d.m14616b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        r9.add(r1);
        r8 = m14616b(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4754d.C4755a(r9, r0), r8.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068 A[Catch:{ all -> 0x00fe }, LOOP:3: B:29:0x0068->B:74:0x0068, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f6 A[SYNTHETIC, Splitter:B:60:0x00f6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo25227a(android.net.Uri r8, java.io.InputStream r9) throws java.io.IOException {
        /*
            r7 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r9)
            r0.<init>(r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            r2 = 239(0xef, float:3.35E-43)
            r3 = 0
            if (r1 != r2) goto L_0x002d
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            r2 = 187(0xbb, float:2.62E-43)
            if (r1 != r2) goto L_0x0066
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            r2 = 191(0xbf, float:2.68E-43)
            if (r1 == r2) goto L_0x0029
            goto L_0x0066
        L_0x0029:
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
        L_0x002d:
            r2 = -1
            if (r1 == r2) goto L_0x003b
            boolean r4 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x00fe }
            if (r4 == 0) goto L_0x003b
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            goto L_0x002d
        L_0x003b:
            r4 = 7
            r5 = r3
        L_0x003d:
            if (r5 >= r4) goto L_0x004f
            java.lang.String r6 = "#EXTM3U"
            char r6 = r6.charAt(r5)     // Catch:{ all -> 0x00fe }
            if (r1 == r6) goto L_0x0048
            goto L_0x0066
        L_0x0048:
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            int r5 = r5 + 1
            goto L_0x003d
        L_0x004f:
            if (r1 == r2) goto L_0x0062
            boolean r3 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x00fe }
            if (r3 == 0) goto L_0x0062
            boolean r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15397b((int) r1)     // Catch:{ all -> 0x00fe }
            if (r3 != 0) goto L_0x0062
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            goto L_0x004f
        L_0x0062:
            boolean r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15397b((int) r1)     // Catch:{ all -> 0x00fe }
        L_0x0066:
            if (r3 == 0) goto L_0x00f6
        L_0x0068:
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x00fe }
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x00fe }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00fe }
            if (r2 == 0) goto L_0x0079
            goto L_0x0068
        L_0x0079:
            java.lang.String r2 = "#EXT-X-STREAM-INF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 == 0) goto L_0x0092
            r9.add(r1)     // Catch:{ all -> 0x00fe }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a     // Catch:{ all -> 0x00fe }
            r1.<init>(r9, r0)     // Catch:{ all -> 0x00fe }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00fe }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a r8 = m14612a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4754d.C4755a) r1, (java.lang.String) r8)     // Catch:{ all -> 0x00fe }
            goto L_0x00e7
        L_0x0092:
            java.lang.String r2 = "#EXT-X-TARGETDURATION"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXTINF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-KEY"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-BYTERANGE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-DISCONTINUITY"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-ENDLIST"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00fe }
            if (r2 == 0) goto L_0x00d3
            goto L_0x00d7
        L_0x00d3:
            r9.add(r1)     // Catch:{ all -> 0x00fe }
            goto L_0x0068
        L_0x00d7:
            r9.add(r1)     // Catch:{ all -> 0x00fe }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a     // Catch:{ all -> 0x00fe }
            r1.<init>(r9, r0)     // Catch:{ all -> 0x00fe }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00fe }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r8 = m14616b((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4754d.C4755a) r1, (java.lang.String) r8)     // Catch:{ all -> 0x00fe }
        L_0x00e7:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r0)
            return r8
        L_0x00eb:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r0)
            com.fyber.inneractive.sdk.player.exoplayer2.l r8 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r9 = "Failed to parse the playlist, could not identify any tags."
            r8.<init>((java.lang.String) r9)
            throw r8
        L_0x00f6:
            com.fyber.inneractive.sdk.player.exoplayer2.source.t r9 = new com.fyber.inneractive.sdk.player.exoplayer2.source.t     // Catch:{ all -> 0x00fe }
            java.lang.String r1 = "Input does not start with the #EXTM3U header."
            r9.<init>(r1, r8)     // Catch:{ all -> 0x00fe }
            throw r9     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r8 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15391a((java.io.Closeable) r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4754d.mo25227a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ac  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a m14612a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4754d.C4755a r70, java.lang.String r71) throws java.io.IOException {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1 = 0
            r2 = 0
            r6 = r1
            r7 = r2
        L_0x0018:
            boolean r8 = r70.mo25228a()
            if (r8 == 0) goto L_0x01f5
            java.lang.String r8 = r70.mo25229b()
            java.lang.String r9 = "#EXT-X-MEDIA"
            boolean r9 = r8.startsWith(r9)
            r10 = 1
            if (r9 == 0) goto L_0x014b
            java.util.regex.Pattern r9 = f12097u
            boolean r9 = m14615a(r8, r9, r2)
            java.util.regex.Pattern r12 = f12098v
            boolean r12 = m14615a(r8, r12, r2)
            r13 = 2
            if (r12 == 0) goto L_0x003c
            r12 = r13
            goto L_0x003d
        L_0x003c:
            r12 = r2
        L_0x003d:
            r9 = r9 | r12
            java.util.regex.Pattern r12 = f12096t
            boolean r12 = m14615a(r8, r12, r2)
            if (r12 == 0) goto L_0x0048
            r12 = 4
            goto L_0x0049
        L_0x0048:
            r12 = r2
        L_0x0049:
            r9 = r9 | r12
            java.util.regex.Pattern r12 = f12090n
            java.lang.String r12 = m14613a((java.lang.String) r8, (java.util.regex.Pattern) r12)
            java.util.regex.Pattern r14 = f12094r
            java.lang.String r15 = m14617b((java.lang.String) r8, (java.util.regex.Pattern) r14)
            java.util.regex.Pattern r14 = f12093q
            java.lang.String r35 = m14613a((java.lang.String) r8, (java.util.regex.Pattern) r14)
            java.util.regex.Pattern r14 = f12092p
            java.lang.String r14 = m14617b((java.lang.String) r8, (java.util.regex.Pattern) r14)
            r14.getClass()
            int r11 = r14.hashCode()
            r2 = -959297733(0xffffffffc6d2473b, float:-26915.615)
            if (r11 == r2) goto L_0x008f
            r2 = -333210994(0xffffffffec239a8e, float:-7.911391E26)
            if (r11 == r2) goto L_0x0084
            r2 = 62628790(0x3bba3b6, float:1.1028458E-36)
            if (r11 == r2) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            java.lang.String r2 = "AUDIO"
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L_0x0082
            goto L_0x0097
        L_0x0082:
            r11 = r13
            goto L_0x009a
        L_0x0084:
            java.lang.String r2 = "CLOSED-CAPTIONS"
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L_0x008d
            goto L_0x0097
        L_0x008d:
            r11 = r10
            goto L_0x009a
        L_0x008f:
            java.lang.String r2 = "SUBTITLES"
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L_0x0099
        L_0x0097:
            r11 = -1
            goto L_0x009a
        L_0x0099:
            r11 = 0
        L_0x009a:
            if (r11 == 0) goto L_0x012d
            if (r11 == r10) goto L_0x00eb
            if (r11 == r13) goto L_0x00a2
            goto L_0x01f1
        L_0x00a2:
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r14 = r2
            r17 = 0
            r18 = 0
            r19 = -1
            r20 = -1
            r21 = -1
            r22 = -1
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            r25 = -1082130432(0xffffffffbf800000, float:-1.0)
            r26 = 0
            r27 = -1
            r28 = 0
            r29 = -1
            r30 = -1
            r31 = -1
            r32 = -1
            r33 = -1
            r36 = -1
            r37 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r39 = 0
            r40 = 0
            r41 = 0
            java.lang.String r16 = "application/x-mpegURL"
            r34 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40, r41)
            if (r12 != 0) goto L_0x00e1
            r6 = r2
        L_0x00de:
            r2 = 0
            goto L_0x0018
        L_0x00e1:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a
            r8.<init>(r12, r2)
            r4.add(r8)
            goto L_0x01f1
        L_0x00eb:
            java.util.regex.Pattern r2 = f12095s
            java.lang.String r2 = m14617b((java.lang.String) r8, (java.util.regex.Pattern) r2)
            java.lang.String r8 = "CC"
            boolean r8 = r2.startsWith(r8)
            if (r8 == 0) goto L_0x0104
            java.lang.String r2 = r2.substring(r13)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r8 = "application/cea-608"
            goto L_0x010f
        L_0x0104:
            r8 = 7
            java.lang.String r2 = r2.substring(r8)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r8 = "application/cea-708"
        L_0x010f:
            r21 = r2
            r16 = r8
            if (r1 != 0) goto L_0x011a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x011a:
            r2 = 0
            r17 = 0
            r18 = -1
            r14 = r15
            r15 = r2
            r19 = r9
            r20 = r35
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14980a(r14, r15, r16, r17, r18, r19, r20, r21)
            r1.add(r2)
            goto L_0x00de
        L_0x012d:
            r17 = 0
            r18 = -1
            r21 = -1
            java.lang.String r2 = "application/x-mpegURL"
            java.lang.String r16 = "text/vtt"
            r14 = r15
            r15 = r2
            r19 = r9
            r20 = r35
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14980a(r14, r15, r16, r17, r18, r19, r20, r21)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a
            r8.<init>(r12, r2)
            r5.add(r8)
            goto L_0x01f1
        L_0x014b:
            java.lang.String r2 = "#EXT-X-STREAM-INF"
            boolean r2 = r8.startsWith(r2)
            if (r2 == 0) goto L_0x01f1
            java.util.regex.Pattern r2 = f12078b
            java.lang.String r2 = m14617b((java.lang.String) r8, (java.util.regex.Pattern) r2)
            int r2 = java.lang.Integer.parseInt(r2)
            java.util.regex.Pattern r9 = f12077a
            java.lang.String r9 = m14613a((java.lang.String) r8, (java.util.regex.Pattern) r9)
            if (r9 == 0) goto L_0x0169
            int r2 = java.lang.Integer.parseInt(r9)
        L_0x0169:
            r47 = r2
            java.util.regex.Pattern r2 = f12079c
            java.lang.String r46 = m14613a((java.lang.String) r8, (java.util.regex.Pattern) r2)
            java.util.regex.Pattern r2 = f12080d
            java.lang.String r2 = m14613a((java.lang.String) r8, (java.util.regex.Pattern) r2)
            java.lang.String r9 = "CLOSED-CAPTIONS=NONE"
            boolean r8 = r8.contains(r9)
            r7 = r7 | r8
            if (r2 == 0) goto L_0x019d
            java.lang.String r8 = "x"
            java.lang.String[] r2 = r2.split(r8)
            r8 = 0
            r9 = r2[r8]
            int r9 = java.lang.Integer.parseInt(r9)
            r2 = r2[r10]
            int r2 = java.lang.Integer.parseInt(r2)
            if (r9 <= 0) goto L_0x019e
            if (r2 > 0) goto L_0x0198
            goto L_0x019e
        L_0x0198:
            r50 = r2
            r49 = r9
            goto L_0x01a2
        L_0x019d:
            r8 = 0
        L_0x019e:
            r49 = -1
            r50 = -1
        L_0x01a2:
            java.lang.String r2 = r70.mo25229b()
            boolean r9 = r0.add(r2)
            if (r9 == 0) goto L_0x01f2
            int r9 = r3.size()
            java.lang.String r43 = java.lang.Integer.toString(r9)
            com.fyber.inneractive.sdk.player.exoplayer2.i r9 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r42 = r9
            r45 = 0
            r48 = -1
            r51 = -1082130432(0xffffffffbf800000, float:-1.0)
            r52 = -1
            r53 = -1082130432(0xffffffffbf800000, float:-1.0)
            r54 = 0
            r55 = -1
            r56 = 0
            r57 = -1
            r58 = -1
            r59 = -1
            r60 = -1
            r61 = -1
            r62 = 0
            r63 = 0
            r64 = -1
            r65 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r67 = 0
            r68 = 0
            r69 = 0
            java.lang.String r44 = "application/x-mpegURL"
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r67, r68, r69)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a
            r10.<init>(r2, r9)
            r3.add(r10)
            goto L_0x01f2
        L_0x01f1:
            r8 = 0
        L_0x01f2:
            r2 = r8
            goto L_0x0018
        L_0x01f5:
            if (r7 == 0) goto L_0x01fd
            java.util.List r0 = java.util.Collections.emptyList()
            r7 = r0
            goto L_0x01fe
        L_0x01fd:
            r7 = r1
        L_0x01fe:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a
            r1 = r0
            r2 = r71
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4754d.m14612a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a");
    }

    /* renamed from: b */
    public static String m14617b(String str, Pattern pattern) throws C4873l {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new C4873l("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* renamed from: a */
    public static String m14613a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m14615a(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z;
    }

    /* renamed from: a */
    public static Pattern m14614a(String str) {
        return Pattern.compile(str + "=(" + "NO" + "|" + "YES" + ")");
    }
}
