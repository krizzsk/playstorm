package com.google.android.exoplayer2.text.ttml;

import com.facebook.appevents.UserDataStore;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;

    public TtmlDecoder() {
        super(TAG);
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* access modifiers changed from: protected */
    public Subtitle decode(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        FrameAndTickRate frameAndTickRate;
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new TtmlRegion(""));
            TtsExtent ttsExtent = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRate2 = DEFAULT_FRAME_AND_TICK_RATE;
            CellResolution cellResolution = DEFAULT_CELL_RESOLUTION;
            int i2 = 0;
            TtmlSubtitle ttmlSubtitle = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frameAndTickRate2 = parseFrameAndTickRates(newPullParser);
                            cellResolution = parseCellResolution(newPullParser, DEFAULT_CELL_RESOLUTION);
                            ttsExtent = parseTtsExtent(newPullParser);
                        }
                        TtsExtent ttsExtent2 = ttsExtent;
                        FrameAndTickRate frameAndTickRate3 = frameAndTickRate2;
                        CellResolution cellResolution2 = cellResolution;
                        if (!isSupportedTag(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            Log.m16947i(TAG, valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i2++;
                            frameAndTickRate2 = frameAndTickRate3;
                        } else {
                            if ("head".equals(name)) {
                                frameAndTickRate = frameAndTickRate3;
                                parseHeader(newPullParser, hashMap, cellResolution2, ttsExtent2, hashMap2, hashMap3);
                            } else {
                                frameAndTickRate = frameAndTickRate3;
                                try {
                                    TtmlNode parseNode = parseNode(newPullParser, ttmlNode, hashMap2, frameAndTickRate);
                                    arrayDeque.push(parseNode);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(parseNode);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    Log.m16950w(TAG, "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            frameAndTickRate2 = frameAndTickRate;
                        }
                        ttsExtent = ttsExtent2;
                        cellResolution = cellResolution2;
                    } else if (eventType == 4) {
                        ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (ttmlSubtitle != null) {
                return ttmlSubtitle;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (XmlPullParserException e2) {
            throw new SubtitleDecoderException("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = Util.split(attributeValue2, " ");
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = DEFAULT_FRAME_AND_TICK_RATE.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = DEFAULT_FRAME_AND_TICK_RATE.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(((float) parseInt) * f, i, i2);
    }

    private static CellResolution parseCellResolution(XmlPullParser xmlPullParser, CellResolution cellResolution) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(attributeValue);
            Log.m16949w(TAG, valueOf.length() != 0 ? "Ignoring malformed cell resolution: ".concat(valueOf) : new String("Ignoring malformed cell resolution: "));
            return cellResolution;
        }
        try {
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new CellResolution(parseInt, parseInt2);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(parseInt);
            sb.append(" ");
            sb.append(parseInt2);
            throw new SubtitleDecoderException(sb.toString());
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(attributeValue);
            Log.m16949w(TAG, valueOf2.length() != 0 ? "Ignoring malformed cell resolution: ".concat(valueOf2) : new String("Ignoring malformed cell resolution: "));
            return cellResolution;
        }
    }

    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "extent");
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(attributeValue);
            Log.m16949w(TAG, valueOf.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(valueOf) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(attributeValue);
            Log.m16949w(TAG, valueOf2.length() != 0 ? "Ignoring malformed tts extent: ".concat(valueOf2) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, CellResolution cellResolution, TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        parseStyleAttributes.chain(map.get(str));
                    }
                }
                String id = parseStyleAttributes.getId();
                if (id != null) {
                    map.put(id, parseStyleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion parseRegionAttributes = parseRegionAttributes(xmlPullParser, cellResolution, ttsExtent);
                if (parseRegionAttributes != null) {
                    map2.put(parseRegionAttributes.f14491id, parseRegionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "metadata")) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "head"));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01dc, code lost:
        if (r2 != 2) goto L_0x01e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.text.ttml.TtmlRegion parseRegionAttributes(org.xmlpull.v1.XmlPullParser r17, com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution r18, com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent r19) {
        /*
            r0 = r17
            r1 = r19
            java.lang.String r2 = "id"
            java.lang.String r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r2)
            r2 = 0
            if (r4 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r3 = "origin"
            java.lang.String r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r3)
            java.lang.String r5 = "TtmlDecoder"
            if (r3 == 0) goto L_0x025b
            java.util.regex.Pattern r6 = PERCENTAGE_COORDINATES
            java.util.regex.Matcher r6 = r6.matcher(r3)
            java.util.regex.Pattern r7 = PIXEL_COORDINATES
            java.util.regex.Matcher r7 = r7.matcher(r3)
            boolean r8 = r6.matches()
            java.lang.String r9 = "Ignoring region with malformed origin: "
            java.lang.String r10 = "Ignoring region with missing tts:extent: "
            r11 = 1120403456(0x42c80000, float:100.0)
            r12 = 2
            r13 = 1
            if (r8 == 0) goto L_0x006e
            java.lang.String r7 = r6.group(r13)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = r7 / r11
            java.lang.String r6 = r6.group(r12)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0056 }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x0056 }
            float r6 = r6 / r11
            r16 = r7
            r7 = r6
            r6 = r16
            goto L_0x00b4
        L_0x0056:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = r9.concat(r0)
            goto L_0x006a
        L_0x0065:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9)
        L_0x006a:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        L_0x006e:
            boolean r6 = r7.matches()
            if (r6 == 0) goto L_0x0240
            if (r1 != 0) goto L_0x008e
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0085
            java.lang.String r0 = r10.concat(r0)
            goto L_0x008a
        L_0x0085:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x008a:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        L_0x008e:
            java.lang.String r6 = r7.group(r13)     // Catch:{ NumberFormatException -> 0x0228 }
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch:{ NumberFormatException -> 0x0228 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0228 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0228 }
            java.lang.String r7 = r7.group(r12)     // Catch:{ NumberFormatException -> 0x0228 }
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)     // Catch:{ NumberFormatException -> 0x0228 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0228 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0228 }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x0228 }
            int r8 = r1.width     // Catch:{ NumberFormatException -> 0x0228 }
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x0228 }
            float r6 = r6 / r8
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x0228 }
            int r8 = r1.height     // Catch:{ NumberFormatException -> 0x0228 }
            float r8 = (float) r8
            float r7 = r7 / r8
        L_0x00b4:
            java.lang.String r8 = "extent"
            java.lang.String r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r8)
            if (r8 == 0) goto L_0x0222
            java.util.regex.Pattern r9 = PERCENTAGE_COORDINATES
            java.util.regex.Matcher r9 = r9.matcher(r8)
            java.util.regex.Pattern r14 = PIXEL_COORDINATES
            java.util.regex.Matcher r8 = r14.matcher(r8)
            boolean r14 = r9.matches()
            java.lang.String r15 = "Ignoring region with malformed extent: "
            if (r14 == 0) goto L_0x0109
            java.lang.String r1 = r9.group(r13)     // Catch:{ NumberFormatException -> 0x00f1 }
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch:{ NumberFormatException -> 0x00f1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x00f1 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00f1 }
            float r1 = r1 / r11
            java.lang.String r8 = r9.group(r12)     // Catch:{ NumberFormatException -> 0x00f1 }
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)     // Catch:{ NumberFormatException -> 0x00f1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x00f1 }
            float r2 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x00f1 }
            float r2 = r2 / r11
            r9 = r1
            r10 = r2
            goto L_0x0150
        L_0x00f1:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0100
            java.lang.String r0 = r15.concat(r0)
            goto L_0x0105
        L_0x0100:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r15)
        L_0x0105:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        L_0x0109:
            boolean r9 = r8.matches()
            if (r9 == 0) goto L_0x0207
            if (r1 != 0) goto L_0x0129
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0120
            java.lang.String r0 = r10.concat(r0)
            goto L_0x0125
        L_0x0120:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x0125:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        L_0x0129:
            java.lang.String r9 = r8.group(r13)     // Catch:{ NumberFormatException -> 0x01ef }
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)     // Catch:{ NumberFormatException -> 0x01ef }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01ef }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01ef }
            java.lang.String r8 = r8.group(r12)     // Catch:{ NumberFormatException -> 0x01ef }
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)     // Catch:{ NumberFormatException -> 0x01ef }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01ef }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01ef }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01ef }
            int r10 = r1.width     // Catch:{ NumberFormatException -> 0x01ef }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01ef }
            float r9 = r9 / r10
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x01ef }
            int r1 = r1.height     // Catch:{ NumberFormatException -> 0x01ef }
            float r1 = (float) r1
            float r8 = r8 / r1
            r10 = r8
        L_0x0150:
            java.lang.String r1 = "displayAlign"
            java.lang.String r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r1)
            r2 = -1
            r3 = 0
            if (r1 == 0) goto L_0x0191
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase((java.lang.String) r1)
            int r5 = r1.hashCode()
            r8 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r5 == r8) goto L_0x0177
            r8 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r5 == r8) goto L_0x016d
            goto L_0x0181
        L_0x016d:
            java.lang.String r5 = "after"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0181
            r1 = r13
            goto L_0x0182
        L_0x0177:
            java.lang.String r5 = "center"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0181
            r1 = r3
            goto L_0x0182
        L_0x0181:
            r1 = r2
        L_0x0182:
            if (r1 == 0) goto L_0x018a
            if (r1 == r13) goto L_0x0187
            goto L_0x0191
        L_0x0187:
            float r7 = r7 + r10
            r8 = r12
            goto L_0x0192
        L_0x018a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r10 / r1
            float r7 = r7 + r1
            r8 = r13
            goto L_0x0192
        L_0x0191:
            r8 = r3
        L_0x0192:
            r1 = 1065353216(0x3f800000, float:1.0)
            r5 = r18
            int r5 = r5.rows
            float r5 = (float) r5
            float r1 = r1 / r5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r11 = "writingMode"
            java.lang.String r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r11)
            if (r0 == 0) goto L_0x01e1
            java.lang.String r0 = com.google.common.base.Ascii.toLowerCase((java.lang.String) r0)
            int r11 = r0.hashCode()
            r14 = 3694(0xe6e, float:5.176E-42)
            if (r11 == r14) goto L_0x01cf
            r3 = 3553396(0x363874, float:4.979368E-39)
            if (r11 == r3) goto L_0x01c5
            r3 = 3553576(0x363928, float:4.97962E-39)
            if (r11 == r3) goto L_0x01bb
            goto L_0x01d8
        L_0x01bb:
            java.lang.String r3 = "tbrl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01d8
            r2 = r12
            goto L_0x01d8
        L_0x01c5:
            java.lang.String r3 = "tblr"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01d8
            r2 = r13
            goto L_0x01d8
        L_0x01cf:
            java.lang.String r11 = "tb"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01d8
            r2 = r3
        L_0x01d8:
            if (r2 == 0) goto L_0x01df
            if (r2 == r13) goto L_0x01df
            if (r2 == r12) goto L_0x01e2
            goto L_0x01e1
        L_0x01df:
            r13 = r12
            goto L_0x01e2
        L_0x01e1:
            r13 = r5
        L_0x01e2:
            com.google.android.exoplayer2.text.ttml.TtmlRegion r0 = new com.google.android.exoplayer2.text.ttml.TtmlRegion
            r2 = 0
            r11 = 1
            r3 = r0
            r5 = r6
            r6 = r7
            r7 = r2
            r12 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x01ef:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x01fe
            java.lang.String r0 = r15.concat(r0)
            goto L_0x0203
        L_0x01fe:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r15)
        L_0x0203:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        L_0x0207:
            java.lang.String r0 = "Ignoring region with unsupported extent: "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0218
            java.lang.String r0 = r0.concat(r1)
            goto L_0x021e
        L_0x0218:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x021e:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        L_0x0222:
            java.lang.String r0 = "Ignoring region without an extent"
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        L_0x0228:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0237
            java.lang.String r0 = r9.concat(r0)
            goto L_0x023c
        L_0x0237:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9)
        L_0x023c:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        L_0x0240:
            java.lang.String r0 = "Ignoring region with unsupported origin: "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0251
            java.lang.String r0 = r0.concat(r1)
            goto L_0x0257
        L_0x0251:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x0257:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        L_0x025b:
            java.lang.String r0 = "Ignoring region without an origin"
            com.google.android.exoplayer2.util.Log.m16949w(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.parseRegionAttributes(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution, com.google.android.exoplayer2.text.ttml.TtmlDecoder$TtsExtent):com.google.android.exoplayer2.text.ttml.TtmlRegion");
    }

    private static String[] parseStyleIds(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : Util.split(trim, "\\s+");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.text.ttml.TtmlStyle parseStyleAttributes(org.xmlpull.v1.XmlPullParser r12, com.google.android.exoplayer2.text.ttml.TtmlStyle r13) {
        /*
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = r1
        L_0x0006:
            if (r2 >= r0) goto L_0x0314
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1550943582: goto L_0x00b8;
                case -1224696685: goto L_0x00ae;
                case -1065511464: goto L_0x00a4;
                case -879295043: goto L_0x0099;
                case -734428249: goto L_0x008f;
                case 3355: goto L_0x0085;
                case 3511770: goto L_0x007a;
                case 94842723: goto L_0x0070;
                case 109403361: goto L_0x0065;
                case 110138194: goto L_0x0059;
                case 365601008: goto L_0x004e;
                case 921125321: goto L_0x0042;
                case 1115953443: goto L_0x0036;
                case 1287124693: goto L_0x002b;
                case 1754920356: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00c2
        L_0x001f:
            java.lang.String r5 = "multiRowAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = 8
            goto L_0x00c3
        L_0x002b:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = r11
            goto L_0x00c3
        L_0x0036:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = 11
            goto L_0x00c3
        L_0x0042:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = 13
            goto L_0x00c3
        L_0x004e:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = r7
            goto L_0x00c3
        L_0x0059:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = 9
            goto L_0x00c3
        L_0x0065:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = 14
            goto L_0x00c3
        L_0x0070:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = r10
            goto L_0x00c3
        L_0x007a:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = 10
            goto L_0x00c3
        L_0x0085:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = r1
            goto L_0x00c3
        L_0x008f:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = r6
            goto L_0x00c3
        L_0x0099:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = 12
            goto L_0x00c3
        L_0x00a4:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = 7
            goto L_0x00c3
        L_0x00ae:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = r9
            goto L_0x00c3
        L_0x00b8:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            r4 = 6
            goto L_0x00c3
        L_0x00c2:
            r4 = r8
        L_0x00c3:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x02fc;
                case 1: goto L_0x02d6;
                case 2: goto L_0x02b0;
                case 3: goto L_0x02a7;
                case 4: goto L_0x0284;
                case 5: goto L_0x0274;
                case 6: goto L_0x0264;
                case 7: goto L_0x0256;
                case 8: goto L_0x0248;
                case 9: goto L_0x0208;
                case 10: goto L_0x018b;
                case 11: goto L_0x014b;
                case 12: goto L_0x00e6;
                case 13: goto L_0x00d8;
                case 14: goto L_0x00ca;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x0310
        L_0x00ca:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            float r3 = parseShear(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setShearPercentage(r3)
            goto L_0x0310
        L_0x00d8:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TextEmphasis r3 = com.google.android.exoplayer2.text.ttml.TextEmphasis.parse(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextEmphasis(r3)
            goto L_0x0310
        L_0x00e6:
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase((java.lang.String) r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x0110;
                case -1026963764: goto L_0x0106;
                case 913457136: goto L_0x00fc;
                case 1679736913: goto L_0x00f2;
                default: goto L_0x00f1;
            }
        L_0x00f1:
            goto L_0x0119
        L_0x00f2:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0119
            r8 = r1
            goto L_0x0119
        L_0x00fc:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0119
            r8 = r11
            goto L_0x0119
        L_0x0106:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0119
            r8 = r10
            goto L_0x0119
        L_0x0110:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0119
            r8 = r9
        L_0x0119:
            if (r8 == 0) goto L_0x0141
            if (r8 == r11) goto L_0x0137
            if (r8 == r10) goto L_0x012d
            if (r8 == r9) goto L_0x0123
            goto L_0x0310
        L_0x0123:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setUnderline(r1)
            goto L_0x0310
        L_0x012d:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setUnderline(r11)
            goto L_0x0310
        L_0x0137:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setLinethrough(r1)
            goto L_0x0310
        L_0x0141:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setLinethrough(r11)
            goto L_0x0310
        L_0x014b:
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase((java.lang.String) r3)
            int r4 = r3.hashCode()
            r5 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r4 == r5) goto L_0x0168
            r5 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r4 == r5) goto L_0x015e
            goto L_0x0171
        L_0x015e:
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0171
            r8 = r11
            goto L_0x0171
        L_0x0168:
            java.lang.String r4 = "before"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0171
            r8 = r1
        L_0x0171:
            if (r8 == 0) goto L_0x0181
            if (r8 == r11) goto L_0x0177
            goto L_0x0310
        L_0x0177:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyPosition(r10)
            goto L_0x0310
        L_0x0181:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyPosition(r11)
            goto L_0x0310
        L_0x018b:
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase((java.lang.String) r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L_0x01c9;
                case -410956671: goto L_0x01bf;
                case -250518009: goto L_0x01b5;
                case -136074796: goto L_0x01ab;
                case 3016401: goto L_0x01a1;
                case 3556653: goto L_0x0197;
                default: goto L_0x0196;
            }
        L_0x0196:
            goto L_0x01d2
        L_0x0197:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d2
            r8 = r9
            goto L_0x01d2
        L_0x01a1:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d2
            r8 = r11
            goto L_0x01d2
        L_0x01ab:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d2
            r8 = r7
            goto L_0x01d2
        L_0x01b5:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d2
            r8 = r6
            goto L_0x01d2
        L_0x01bf:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d2
            r8 = r1
            goto L_0x01d2
        L_0x01c9:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d2
            r8 = r10
        L_0x01d2:
            if (r8 == 0) goto L_0x01fe
            if (r8 == r11) goto L_0x01f4
            if (r8 == r10) goto L_0x01f4
            if (r8 == r9) goto L_0x01ea
            if (r8 == r7) goto L_0x01ea
            if (r8 == r6) goto L_0x01e0
            goto L_0x0310
        L_0x01e0:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyType(r7)
            goto L_0x0310
        L_0x01ea:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyType(r9)
            goto L_0x0310
        L_0x01f4:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyType(r10)
            goto L_0x0310
        L_0x01fe:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyType(r11)
            goto L_0x0310
        L_0x0208:
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase((java.lang.String) r3)
            int r4 = r3.hashCode()
            r5 = 96673(0x179a1, float:1.35468E-40)
            if (r4 == r5) goto L_0x0225
            r5 = 3387192(0x33af38, float:4.746467E-39)
            if (r4 == r5) goto L_0x021b
            goto L_0x022e
        L_0x021b:
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x022e
            r8 = r1
            goto L_0x022e
        L_0x0225:
            java.lang.String r4 = "all"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x022e
            r8 = r11
        L_0x022e:
            if (r8 == 0) goto L_0x023e
            if (r8 == r11) goto L_0x0234
            goto L_0x0310
        L_0x0234:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextCombine(r11)
            goto L_0x0310
        L_0x023e:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextCombine(r1)
            goto L_0x0310
        L_0x0248:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            android.text.Layout$Alignment r3 = parseAlignment(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setMultiRowAlign(r3)
            goto L_0x0310
        L_0x0256:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            android.text.Layout$Alignment r3 = parseAlignment(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextAlign(r3)
            goto L_0x0310
        L_0x0264:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setItalic(r3)
            goto L_0x0310
        L_0x0274:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setBold(r3)
            goto L_0x0310
        L_0x0284:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)     // Catch:{ SubtitleDecoderException -> 0x028d }
            parseFontSize(r3, r13)     // Catch:{ SubtitleDecoderException -> 0x028d }
            goto L_0x0310
        L_0x028d:
            java.lang.String r4 = "Failed parsing fontSize value: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x029e
            java.lang.String r3 = r4.concat(r3)
            goto L_0x02a3
        L_0x029e:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L_0x02a3:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r3)
            goto L_0x0310
        L_0x02a7:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setFontFamily(r3)
            goto L_0x0310
        L_0x02b0:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            int r4 = com.google.android.exoplayer2.util.ColorParser.parseTtmlColor(r3)     // Catch:{ IllegalArgumentException -> 0x02bc }
            r13.setFontColor(r4)     // Catch:{ IllegalArgumentException -> 0x02bc }
            goto L_0x0310
        L_0x02bc:
            java.lang.String r4 = "Failed parsing color value: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x02cd
            java.lang.String r3 = r4.concat(r3)
            goto L_0x02d2
        L_0x02cd:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L_0x02d2:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r3)
            goto L_0x0310
        L_0x02d6:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            int r4 = com.google.android.exoplayer2.util.ColorParser.parseTtmlColor(r3)     // Catch:{ IllegalArgumentException -> 0x02e2 }
            r13.setBackgroundColor(r4)     // Catch:{ IllegalArgumentException -> 0x02e2 }
            goto L_0x0310
        L_0x02e2:
            java.lang.String r4 = "Failed parsing background value: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x02f3
            java.lang.String r3 = r4.concat(r3)
            goto L_0x02f8
        L_0x02f3:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L_0x02f8:
            com.google.android.exoplayer2.util.Log.m16949w(r5, r3)
            goto L_0x0310
        L_0x02fc:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0310
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setId(r3)
        L_0x0310:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0314:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.parseStyleAttributes(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlStyle):com.google.android.exoplayer2.text.ttml.TtmlStyle");
    }

    private static TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Layout.Alignment parseAlignment(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.common.base.Ascii.toLowerCase((java.lang.String) r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x0038;
                case 100571: goto L_0x002e;
                case 3317767: goto L_0x0024;
                case 108511772: goto L_0x001a;
                case 109757538: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0042
        L_0x0010:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = r4
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = r3
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 0
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = r2
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = r1
            goto L_0x0043
        L_0x0042:
            r5 = -1
        L_0x0043:
            if (r5 == 0) goto L_0x0055
            if (r5 == r4) goto L_0x0055
            if (r5 == r3) goto L_0x0052
            if (r5 == r2) goto L_0x0052
            if (r5 == r1) goto L_0x004f
            r5 = 0
            return r5
        L_0x004f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L_0x0052:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L_0x0055:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.parseAlignment(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.text.ttml.TtmlNode parseNode(org.xmlpull.v1.XmlPullParser r19, com.google.android.exoplayer2.text.ttml.TtmlNode r20, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r21, com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate r22) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            r0 = r19
            r9 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            com.google.android.exoplayer2.text.ttml.TtmlStyle r5 = parseStyleAttributes(r0, r3)
            java.lang.String r8 = ""
            r11 = r3
            r10 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r11
            r3 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00c2
            java.lang.String r4 = r0.getAttributeName(r3)
            java.lang.String r6 = r0.getAttributeValue(r3)
            int r18 = r4.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0068;
                case 99841: goto L_0x005e;
                case 100571: goto L_0x0054;
                case 93616297: goto L_0x004a;
                case 109780401: goto L_0x0040;
                case 1292595405: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0072
        L_0x0036:
            java.lang.String r7 = "backgroundImage"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 5
            goto L_0x0073
        L_0x0040:
            java.lang.String r7 = "style"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 3
            goto L_0x0073
        L_0x004a:
            java.lang.String r7 = "begin"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 0
            goto L_0x0073
        L_0x0054:
            java.lang.String r7 = "end"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 1
            goto L_0x0073
        L_0x005e:
            java.lang.String r7 = "dur"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 2
            goto L_0x0073
        L_0x0068:
            java.lang.String r7 = "region"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 4
            goto L_0x0073
        L_0x0072:
            r7 = -1
        L_0x0073:
            if (r7 == 0) goto L_0x00b8
            r4 = 1
            if (r7 == r4) goto L_0x00b1
            r4 = 2
            if (r7 == r4) goto L_0x00aa
            r4 = 3
            if (r7 == r4) goto L_0x009f
            r4 = 4
            if (r7 == r4) goto L_0x0095
            r4 = 5
            if (r7 == r4) goto L_0x0085
            goto L_0x0092
        L_0x0085:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L_0x0092
            r4 = 1
            java.lang.String r11 = r6.substring(r4)
        L_0x0092:
            r4 = r21
            goto L_0x00be
        L_0x0095:
            r4 = r21
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L_0x00be
            r10 = r6
            goto L_0x00be
        L_0x009f:
            r4 = r21
            java.lang.String[] r6 = parseStyleIds(r6)
            int r7 = r6.length
            if (r7 <= 0) goto L_0x00be
            r8 = r6
            goto L_0x00be
        L_0x00aa:
            r4 = r21
            long r16 = parseTimeExpression(r6, r1)
            goto L_0x00be
        L_0x00b1:
            r4 = r21
            long r14 = parseTimeExpression(r6, r1)
            goto L_0x00be
        L_0x00b8:
            r4 = r21
            long r12 = parseTimeExpression(r6, r1)
        L_0x00be:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x00c2:
            if (r9 == 0) goto L_0x00de
            long r1 = r9.startTimeUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00e3
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00d6
            long r1 = r9.startTimeUs
            long r12 = r12 + r1
        L_0x00d6:
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00e3
            long r1 = r9.startTimeUs
            long r14 = r14 + r1
            goto L_0x00e3
        L_0x00de:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e3:
            r1 = r12
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00fc
            int r6 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00f1
            long r16 = r1 + r16
            r3 = r16
            goto L_0x00fd
        L_0x00f1:
            if (r9 == 0) goto L_0x00fc
            long r6 = r9.endTimeUs
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00fc
            long r3 = r9.endTimeUs
            goto L_0x00fd
        L_0x00fc:
            r3 = r14
        L_0x00fd:
            java.lang.String r0 = r19.getName()
            r6 = r8
            r7 = r10
            r8 = r11
            r9 = r20
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = com.google.android.exoplayer2.text.ttml.TtmlNode.buildNode(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.parseNode(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlNode, java.util.Map, com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate):com.google.android.exoplayer2.text.ttml.TtmlNode");
    }

    private static boolean isSupportedTag(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] split = Util.split(str, "\\s+");
        if (split.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else if (split.length == 2) {
            matcher = FONT_SIZE.matcher(split[1]);
            Log.m16949w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length = split.length;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(length);
            sb.append(".");
            throw new SubtitleDecoderException(sb.toString());
        }
        if (matcher.matches()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(3));
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592 && str2.equals("px")) {
                        c = 0;
                    }
                } else if (str2.equals(UserDataStore.EMAIL)) {
                    c = 1;
                }
            } else if (str2.equals("%")) {
                c = 2;
            }
            if (c == 0) {
                ttmlStyle.setFontSizeUnit(1);
            } else if (c == 1) {
                ttmlStyle.setFontSizeUnit(2);
            } else if (c == 2) {
                ttmlStyle.setFontSizeUnit(3);
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 30);
                sb2.append("Invalid unit for fontSize: '");
                sb2.append(str2);
                sb2.append("'.");
                throw new SubtitleDecoderException(sb2.toString());
            }
            ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
            return;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 36);
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(str);
        sb3.append("'.");
        throw new SubtitleDecoderException(sb3.toString());
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            Log.m16949w(TAG, valueOf.length() != 0 ? "Invalid value for shear: ".concat(valueOf) : new String("Invalid value for shear: "));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(str);
            Log.m16950w(TAG, valueOf2.length() != 0 ? "Failed to parse shear: ".concat(valueOf2) : new String("Failed to parse shear: "), e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r14.equals("s") != false) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long parseTimeExpression(java.lang.String r14, com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate r15) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            java.util.regex.Pattern r0 = CLOCK_TIME
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0085
            java.lang.String r14 = r0.group(r8)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x0058
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x0059
        L_0x0058:
            r10 = r5
        L_0x0059:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x006a
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.effectiveFrameRate
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x006b
        L_0x006a:
            r10 = r5
        L_0x006b:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x0081
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.subFrameRate
            double r4 = (double) r14
            double r0 = r0 / r4
            float r14 = r15.effectiveFrameRate
            double r14 = (double) r14
            double r5 = r0 / r14
        L_0x0081:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x0085:
            java.util.regex.Pattern r0 = OFFSET_TIME
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x0129
            java.lang.String r14 = r0.group(r8)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            r0 = -1
            int r1 = r14.hashCode()
            r11 = 102(0x66, float:1.43E-43)
            if (r1 == r11) goto L_0x00f8
            r11 = 104(0x68, float:1.46E-43)
            if (r1 == r11) goto L_0x00ee
            r11 = 109(0x6d, float:1.53E-43)
            if (r1 == r11) goto L_0x00e4
            r11 = 3494(0xda6, float:4.896E-42)
            if (r1 == r11) goto L_0x00da
            r11 = 115(0x73, float:1.61E-43)
            if (r1 == r11) goto L_0x00d1
            r7 = 116(0x74, float:1.63E-43)
            if (r1 == r7) goto L_0x00c7
            goto L_0x0102
        L_0x00c7:
            java.lang.String r1 = "t"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0102
            r7 = r4
            goto L_0x0103
        L_0x00d1:
            java.lang.String r1 = "s"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0102
            goto L_0x0103
        L_0x00da:
            java.lang.String r1 = "ms"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0102
            r7 = r6
            goto L_0x0103
        L_0x00e4:
            java.lang.String r1 = "m"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0102
            r7 = r8
            goto L_0x0103
        L_0x00ee:
            java.lang.String r1 = "h"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0102
            r7 = 0
            goto L_0x0103
        L_0x00f8:
            java.lang.String r1 = "f"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0102
            r7 = r5
            goto L_0x0103
        L_0x0102:
            r7 = r0
        L_0x0103:
            if (r7 == 0) goto L_0x0120
            if (r7 == r8) goto L_0x011d
            if (r7 == r6) goto L_0x0116
            if (r7 == r5) goto L_0x0112
            if (r7 == r4) goto L_0x010e
            goto L_0x0126
        L_0x010e:
            int r14 = r15.tickRate
            double r14 = (double) r14
            goto L_0x011b
        L_0x0112:
            float r14 = r15.effectiveFrameRate
            double r14 = (double) r14
            goto L_0x011b
        L_0x0116:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x011b:
            double r9 = r9 / r14
            goto L_0x0126
        L_0x011d:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0125
        L_0x0120:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0125:
            double r9 = r9 * r14
        L_0x0126:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x0129:
            com.google.android.exoplayer2.text.SubtitleDecoderException r15 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r1 = r14.length()
            if (r1 == 0) goto L_0x013c
            java.lang.String r14 = r0.concat(r14)
            goto L_0x0141
        L_0x013c:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r0)
        L_0x0141:
            r15.<init>((java.lang.String) r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.parseTimeExpression(java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate):long");
    }

    private static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    private static final class CellResolution {
        final int columns;
        final int rows;

        CellResolution(int i, int i2) {
            this.columns = i;
            this.rows = i2;
        }
    }

    private static final class TtsExtent {
        final int height;
        final int width;

        TtsExtent(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
