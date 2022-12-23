package com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p156j.C3539a;
import com.bytedance.sdk.openadsdk.core.p156j.C3547b;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import com.bytedance.sdk.openadsdk.core.p156j.p160c.C3566d;
import com.facebook.internal.security.CertificateUtil;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a.c */
/* compiled from: LinearParser */
public class C3543c {
    /* renamed from: a */
    public static void m11081a(XmlPullParser xmlPullParser, C3539a aVar, int i, double d) throws IOException, XmlPullParserException {
        boolean z = false;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("Linear")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (z && TextUtils.isEmpty(aVar.mo19993g())) {
                    C3544d.m11088a(xmlPullParser);
                }
                String name = xmlPullParser.getName();
                char c = 65535;
                switch (name.hashCode()) {
                    case -2049897434:
                        if (name.equals("VideoClicks")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1927368268:
                        if (name.equals(Linear.DURATION)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -385055469:
                        if (name.equals(Linear.MEDIA_FILES)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 70476538:
                        if (name.equals(Linear.ICONS)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 611554000:
                        if (name.equals("TrackingEvents")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    aVar.mo19978a(m11083b(xmlPullParser));
                } else if (c == 1) {
                    m11082a(xmlPullParser, aVar.mo19977a());
                } else if (c == 2) {
                    m11080a(xmlPullParser, aVar);
                } else if (c == 3) {
                    String a = m11079a(xmlPullParser, i, d);
                    if (!TextUtils.isEmpty(a)) {
                        aVar.mo19988d(a);
                    }
                    z = true;
                } else if (c != 4) {
                    C3544d.m11088a(xmlPullParser);
                } else {
                    C3547b a2 = m11078a(xmlPullParser);
                    if (a2 != null && aVar.mo19983b() == null) {
                        aVar.mo19980a(a2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static String m11079a(XmlPullParser xmlPullParser, int i, double d) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(Linear.MEDIA_FILES)) {
                return str;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(MediaFile.NAME)) {
                String attributeValue = xmlPullParser.getAttributeValue(C3544d.f8898f, "type");
                int b = C3544d.m11090b(xmlPullParser.getAttributeValue(C3544d.f8898f, "width"));
                int b2 = C3544d.m11090b(xmlPullParser.getAttributeValue(C3544d.f8898f, "height"));
                int b3 = C3544d.m11090b(xmlPullParser.getAttributeValue(C3544d.f8898f, MediaFile.BITRATE));
                String b4 = C3544d.m11092b(xmlPullParser, MediaFile.NAME);
                if (b > 0 && b2 > 0 && C3566d.f8960a.contains(attributeValue) && !TextUtils.isEmpty(b4)) {
                    double a = C3566d.m11150a(i, d, b, b2, b3, attributeValue);
                    if (a > d2) {
                        str = b4;
                        d2 = a;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.sdk.openadsdk.core.p156j.C3547b m11078a(org.xmlpull.v1.XmlPullParser r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r23
            r2 = 0
        L_0x0003:
            int r3 = r23.getEventType()
            java.lang.String r4 = "Icons"
            r5 = 3
            if (r3 != r5) goto L_0x0018
            java.lang.String r3 = r23.getName()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            return r2
        L_0x0018:
            r23.next()
            int r3 = r23.getEventType()
            r6 = 2
            if (r3 == r6) goto L_0x0024
            goto L_0x0208
        L_0x0024:
            java.lang.String r3 = r23.getName()
            java.lang.String r7 = "Icon"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0208
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.f8898f
            java.lang.String r8 = "width"
            java.lang.String r3 = r0.getAttributeValue(r3, r8)
            int r9 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11090b(r3)
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.f8898f
            java.lang.String r8 = "height"
            java.lang.String r3 = r0.getAttributeValue(r3, r8)
            int r10 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11090b(r3)
            if (r9 <= 0) goto L_0x0202
            r3 = 300(0x12c, float:4.2E-43)
            if (r9 > r3) goto L_0x0202
            if (r10 <= 0) goto L_0x0202
            if (r10 <= r3) goto L_0x0054
            goto L_0x0202
        L_0x0054:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.f8898f
            java.lang.String r8 = "offset"
            java.lang.String r3 = r0.getAttributeValue(r3, r8)
            int r3 = com.bytedance.sdk.openadsdk.core.p156j.p159b.C3548a.m11104a((java.lang.String) r3)
            java.lang.String r8 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.f8898f
            java.lang.String r11 = "duration"
            java.lang.String r8 = r0.getAttributeValue(r8, r11)
            int r8 = com.bytedance.sdk.openadsdk.core.p156j.p159b.C3548a.m11104a((java.lang.String) r8)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r11 = 0
            r20 = 0
        L_0x0079:
            int r12 = r23.next()
            if (r12 != r5) goto L_0x00b7
            java.lang.String r12 = r23.getName()
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x008a
            goto L_0x00b7
        L_0x008a:
            if (r11 == 0) goto L_0x0003
            java.lang.String r6 = r11.f8899a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0003
            com.bytedance.sdk.openadsdk.core.j.b r2 = new com.bytedance.sdk.openadsdk.core.j.b
            long r6 = (long) r3
            r16 = r6
            long r5 = (long) r8
            com.bytedance.sdk.openadsdk.core.j.c.a$a r3 = r11.f8900b
            com.bytedance.sdk.openadsdk.core.j.c.a$b r7 = r11.f8901c
            java.lang.String r14 = r11.f8899a
            r8 = r2
            r11 = r16
            r19 = r13
            r17 = r14
            r13 = r5
            r5 = r15
            r15 = r3
            r16 = r7
            r18 = r5
            r8.<init>(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20)
            r3 = 3
            com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11089a(r0, r4, r3)
            goto L_0x0003
        L_0x00b7:
            r19 = r13
            r5 = r15
            int r12 = r23.getEventType()
            if (r12 == r6) goto L_0x00c5
            r15 = r5
            r13 = r19
            r5 = 3
            goto L_0x0079
        L_0x00c5:
            java.lang.String r12 = r23.getName()
            int r14 = r12.hashCode()
            java.lang.String r15 = "HTMLResource"
            java.lang.String r1 = "IconClicks"
            java.lang.String r13 = "StaticResource"
            java.lang.String r6 = "IFrameResource"
            r21 = r2
            java.lang.String r2 = "IconViewTracking"
            r22 = r3
            r3 = 1
            switch(r14) {
                case -1044238411: goto L_0x0100;
                case -375340334: goto L_0x00f8;
                case 676623548: goto L_0x00f0;
                case 1030746596: goto L_0x00e8;
                case 1928285401: goto L_0x00e0;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x0108
        L_0x00e0:
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x0108
            r12 = 0
            goto L_0x0109
        L_0x00e8:
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0108
            r12 = 3
            goto L_0x0109
        L_0x00f0:
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0108
            r12 = 2
            goto L_0x0109
        L_0x00f8:
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0108
            r12 = r3
            goto L_0x0109
        L_0x0100:
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0108
            r12 = 4
            goto L_0x0109
        L_0x0108:
            r12 = -1
        L_0x0109:
            if (r12 == 0) goto L_0x01da
            if (r12 == r3) goto L_0x01c2
            r3 = 2
            if (r12 == r3) goto L_0x017d
            r3 = 3
            if (r12 == r3) goto L_0x0130
            r3 = 4
            if (r12 == r3) goto L_0x011c
            com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11088a(r23)
            r2 = r19
            goto L_0x012e
        L_0x011c:
            com.bytedance.sdk.openadsdk.core.j.b.c$a r1 = new com.bytedance.sdk.openadsdk.core.j.b.c$a
            java.lang.String r2 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r2)
            r1.<init>(r2)
            com.bytedance.sdk.openadsdk.core.j.b.c r1 = r1.mo20022a()
            r2 = r19
            r2.add(r1)
        L_0x012e:
            r12 = 3
            goto L_0x0144
        L_0x0130:
            r2 = r19
        L_0x0132:
            int r3 = r23.next()
            r12 = 3
            if (r3 != r12) goto L_0x0147
            java.lang.String r3 = r23.getName()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0144
            goto L_0x0147
        L_0x0144:
            r14 = 2
            goto L_0x01f8
        L_0x0147:
            int r3 = r23.getEventType()
            r14 = 2
            if (r3 == r14) goto L_0x014f
            goto L_0x0132
        L_0x014f:
            java.lang.String r3 = r23.getName()
            java.lang.String r6 = "IconClickThrough"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0160
            java.lang.String r20 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r6)
            goto L_0x0132
        L_0x0160:
            java.lang.String r3 = r23.getName()
            java.lang.String r6 = "IconClickTracking"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0132
            com.bytedance.sdk.openadsdk.core.j.b.c$a r3 = new com.bytedance.sdk.openadsdk.core.j.b.c$a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r6)
            r3.<init>(r6)
            com.bytedance.sdk.openadsdk.core.j.b.c r3 = r3.mo20022a()
            r5.add(r3)
            goto L_0x0132
        L_0x017d:
            r14 = r3
            r2 = r19
            r12 = 3
            com.bytedance.sdk.openadsdk.core.j.c.a$a r1 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3562a.NONE
            java.lang.String r1 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.f8898f
            java.lang.String r3 = "creativeType"
            java.lang.String r1 = r0.getAttributeValue(r1, r3)
            java.lang.String r1 = r1.toLowerCase()
            java.util.Set<java.lang.String> r3 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.f8943a
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L_0x01a2
            java.util.Set<java.lang.String> r3 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.f8944b
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r3 = 0
            goto L_0x01a6
        L_0x01a2:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r13)
        L_0x01a6:
            java.util.Set<java.lang.String> r6 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.f8943a
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L_0x01b1
            com.bytedance.sdk.openadsdk.core.j.c.a$a r1 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3562a.IMAGE
            goto L_0x01b3
        L_0x01b1:
            com.bytedance.sdk.openadsdk.core.j.c.a$a r1 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3562a.JAVASCRIPT
        L_0x01b3:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x01f8
            com.bytedance.sdk.openadsdk.core.j.a.a.d$a r6 = new com.bytedance.sdk.openadsdk.core.j.a.a.d$a
            com.bytedance.sdk.openadsdk.core.j.c.a$b r11 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3563b.STATIC_RESOURCE
            r6.<init>(r3, r1, r11)
            r11 = r6
            goto L_0x01f8
        L_0x01c2:
            r2 = r19
            r12 = 3
            r14 = 2
            if (r11 == 0) goto L_0x01cc
            com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11088a(r23)
            goto L_0x01f8
        L_0x01cc:
            com.bytedance.sdk.openadsdk.core.j.a.a.d$a r1 = new com.bytedance.sdk.openadsdk.core.j.a.a.d$a
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r6)
            com.bytedance.sdk.openadsdk.core.j.c.a$a r6 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3562a.NONE
            com.bytedance.sdk.openadsdk.core.j.c.a$b r11 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3563b.IFRAME_RESOURCE
            r1.<init>(r3, r6, r11)
            goto L_0x01f7
        L_0x01da:
            r2 = r19
            r12 = 3
            r14 = 2
            if (r11 == 0) goto L_0x01ea
            com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = r11.f8901c
            com.bytedance.sdk.openadsdk.core.j.c.a$b r3 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3563b.IFRAME_RESOURCE
            if (r1 == r3) goto L_0x01ea
            com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11088a(r23)
            goto L_0x01f8
        L_0x01ea:
            com.bytedance.sdk.openadsdk.core.j.a.a.d$a r1 = new com.bytedance.sdk.openadsdk.core.j.a.a.d$a
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r0, (java.lang.String) r15)
            com.bytedance.sdk.openadsdk.core.j.c.a$a r6 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3562a.NONE
            com.bytedance.sdk.openadsdk.core.j.c.a$b r11 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3563b.HTML_RESOURCE
            r1.<init>(r3, r6, r11)
        L_0x01f7:
            r11 = r1
        L_0x01f8:
            r13 = r2
            r15 = r5
            r5 = r12
            r6 = r14
            r2 = r21
            r3 = r22
            goto L_0x0079
        L_0x0202:
            r21 = r2
            com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11088a(r23)
            goto L_0x020a
        L_0x0208:
            r21 = r2
        L_0x020a:
            r2 = r21
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3543c.m11078a(org.xmlpull.v1.XmlPullParser):com.bytedance.sdk.openadsdk.core.j.b");
    }

    /* renamed from: b */
    public static double m11083b(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String[] split = C3544d.m11092b(xmlPullParser, Linear.DURATION).split(CertificateUtil.DELIMITER);
        if (split.length != 3) {
            return 0.0d;
        }
        try {
            return (double) (((float) ((Integer.parseInt(split[0].trim()) * 60 * 60) + (Integer.parseInt(split[1].trim()) * 60))) + Float.parseFloat(split[2].trim()));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c1, code lost:
        if (r0.equals("midpoint") != false) goto L_0x00c5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11082a(org.xmlpull.v1.XmlPullParser r7, com.bytedance.sdk.openadsdk.core.p156j.C3567d r8) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
        L_0x0000:
            int r0 = r7.next()
            r1 = 3
            if (r0 != r1) goto L_0x0015
            java.lang.String r0 = r7.getName()
            java.lang.String r2 = "TrackingEvents"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            int r0 = r7.getEventType()
            r2 = 2
            if (r0 == r2) goto L_0x001d
            goto L_0x0000
        L_0x001d:
            java.lang.String r0 = r7.getName()
            java.lang.String r3 = "Tracking"
            boolean r0 = r3.equals(r0)
            r4 = 4
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.f8898f
            java.lang.String r5 = "event"
            java.lang.String r0 = r7.getAttributeValue(r0, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x003c
            com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11089a(r7, r3, r1)
            goto L_0x0000
        L_0x003c:
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -1638835128: goto L_0x00bb;
                case -1337830390: goto L_0x00b1;
                case -934426579: goto L_0x00a6;
                case -840405966: goto L_0x009b;
                case -599445191: goto L_0x0091;
                case 3363353: goto L_0x0086;
                case 3532159: goto L_0x007c;
                case 94756344: goto L_0x0072;
                case 106440182: goto L_0x0067;
                case 109757538: goto L_0x005c;
                case 560220243: goto L_0x0051;
                case 1778167540: goto L_0x0046;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x00c4
        L_0x0046:
            java.lang.String r1 = "creativeView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = 0
            goto L_0x00c5
        L_0x0051:
            java.lang.String r1 = "firstQuartile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = r2
            goto L_0x00c5
        L_0x005c:
            java.lang.String r1 = "start"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = 1
            goto L_0x00c5
        L_0x0067:
            java.lang.String r1 = "pause"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = 8
            goto L_0x00c5
        L_0x0072:
            java.lang.String r1 = "close"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = 6
            goto L_0x00c5
        L_0x007c:
            java.lang.String r1 = "skip"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = 7
            goto L_0x00c5
        L_0x0086:
            java.lang.String r1 = "mute"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = 10
            goto L_0x00c5
        L_0x0091:
            java.lang.String r1 = "complete"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = 5
            goto L_0x00c5
        L_0x009b:
            java.lang.String r1 = "unmute"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = 11
            goto L_0x00c5
        L_0x00a6:
            java.lang.String r1 = "resume"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = 9
            goto L_0x00c5
        L_0x00b1:
            java.lang.String r1 = "thirdQuartile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r1 = r4
            goto L_0x00c5
        L_0x00bb:
            java.lang.String r2 = "midpoint"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = r5
        L_0x00c5:
            switch(r1) {
                case 0: goto L_0x012a;
                case 1: goto L_0x012a;
                case 2: goto L_0x011f;
                case 3: goto L_0x0114;
                case 4: goto L_0x0109;
                case 5: goto L_0x0100;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00ee;
                case 8: goto L_0x00e5;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d3;
                case 11: goto L_0x00ca;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x0000
        L_0x00ca:
            java.util.List r0 = m11084c(r7)
            r8.mo20064l(r0)
            goto L_0x0000
        L_0x00d3:
            java.util.List r0 = m11084c(r7)
            r8.mo20063k(r0)
            goto L_0x0000
        L_0x00dc:
            java.util.List r0 = m11084c(r7)
            r8.mo20049c((java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r0)
            goto L_0x0000
        L_0x00e5:
            java.util.List r0 = m11084c(r7)
            r8.mo20047b((java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r0)
            goto L_0x0000
        L_0x00ee:
            java.util.List r0 = m11084c(r7)
            r8.mo20055f((java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r0)
            goto L_0x0000
        L_0x00f7:
            java.util.List r0 = m11084c(r7)
            r8.mo20053e((java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r0)
            goto L_0x0000
        L_0x0100:
            java.util.List r0 = m11084c(r7)
            r8.mo20051d((java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r0)
            goto L_0x0000
        L_0x0109:
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r7, (java.lang.String) r3)
            r1 = 1061158912(0x3f400000, float:0.75)
            r8.mo20042a((java.lang.String) r0, (float) r1)
            goto L_0x0000
        L_0x0114:
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r7, (java.lang.String) r3)
            r1 = 1056964608(0x3f000000, float:0.5)
            r8.mo20042a((java.lang.String) r0, (float) r1)
            goto L_0x0000
        L_0x011f:
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r7, (java.lang.String) r3)
            r1 = 1048576000(0x3e800000, float:0.25)
            r8.mo20042a((java.lang.String) r0, (float) r1)
            goto L_0x0000
        L_0x012a:
            java.lang.String r0 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11092b((org.xmlpull.v1.XmlPullParser) r7, (java.lang.String) r3)
            r1 = 0
            r8.mo20043a((java.lang.String) r0, (long) r1)
            goto L_0x0000
        L_0x0135:
            int r0 = r7.getEventType()
            if (r0 != r4) goto L_0x0140
            r7.nextTag()
            goto L_0x0000
        L_0x0140:
            com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11088a(r7)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3543c.m11082a(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.j.d):void");
    }

    /* renamed from: a */
    private static void m11080a(XmlPullParser xmlPullParser, C3539a aVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != -617879491) {
                    if (hashCode == 2107600959 && name.equals(VideoClicks.CLICK_TRACKING)) {
                        c = 1;
                    }
                } else if (name.equals(VideoClicks.CLICK_THROUGH)) {
                    c = 0;
                }
                if (c == 0) {
                    aVar.mo19986c(C3544d.m11092b(xmlPullParser, VideoClicks.CLICK_THROUGH));
                } else if (c != 1) {
                    C3544d.m11088a(xmlPullParser);
                } else {
                    aVar.mo19977a().mo20057g(C3544d.m11087a(xmlPullParser, VideoClicks.CLICK_TRACKING));
                }
            }
        }
    }

    /* renamed from: c */
    private static List<C3553c> m11084c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return C3544d.m11087a(xmlPullParser, Tracking.NAME);
    }
}
