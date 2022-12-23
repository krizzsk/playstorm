package com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p156j.C3539a;
import com.bytedance.sdk.openadsdk.core.p156j.p157a.C3540a;
import com.bytedance.sdk.openadsdk.core.p156j.p157a.C3546b;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a.d */
/* compiled from: VastXmlPullParser */
public class C3544d extends C3546b {

    /* renamed from: f */
    public static final String f8898f = null;

    public C3544d(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[SYNTHETIC, Splitter:B:24:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048 A[SYNTHETIC, Splitter:B:31:0x0048] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.core.p156j.C3539a mo19999b(java.lang.String r6, java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 0
            f8906e = r1
            android.content.Context r2 = r5.f8908b
            r3 = 0
            if (r2 != 0) goto L_0x000e
            r6 = -1
            f8906e = r6
            return r3
        L_0x000e:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x0018
            r6 = -2
            f8906e = r6
            return r3
        L_0x0018:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            byte[] r6 = r6.getBytes(r0)     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch:{ Exception -> 0x003b }
            java.lang.String r4 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r6.setFeature(r4, r1)     // Catch:{ Exception -> 0x003b }
            r6.setInput(r2, r0)     // Catch:{ Exception -> 0x003b }
            r6.nextTag()     // Catch:{ Exception -> 0x003b }
            com.bytedance.sdk.openadsdk.core.j.a r6 = r5.m11085a((org.xmlpull.v1.XmlPullParser) r6, (java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r7)     // Catch:{ Exception -> 0x003b }
            r2.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            return r6
        L_0x0038:
            r6 = move-exception
            goto L_0x0046
        L_0x003a:
            r2 = r3
        L_0x003b:
            r6 = -3
            f8906e = r6     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            return r3
        L_0x0044:
            r6 = move-exception
            r3 = r2
        L_0x0046:
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.mo19999b(java.lang.String, java.util.List):com.bytedance.sdk.openadsdk.core.j.a");
    }

    /* renamed from: a */
    private C3539a m11085a(XmlPullParser xmlPullParser, List<C3553c> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, f8898f, VastTree.VAST);
        boolean z = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = m11092b(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (mo20005a(xmlPullParser.getAttributeValue(f8898f, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            } else if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    C3539a a = C3542b.m11076a(this.f8908b, xmlPullParser, list, this.f8909c, this.f8910d);
                                    if (a != null) {
                                        if (!TextUtils.isEmpty(a.mo19993g())) {
                                            return a;
                                        }
                                        f8906e = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    C3539a b = m11091b(xmlPullParser, list);
                                    if (b != null) {
                                        return b;
                                    }
                                } else {
                                    m11088a(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        m11088a(xmlPullParser);
                    }
                    z = true;
                } else {
                    m11088a(xmlPullParser);
                }
            }
        }
        if (!z) {
            f8906e = -4;
            m11093c(str);
        }
        if (f8906e == 0) {
            f8906e = -5;
        }
        return null;
    }

    /* renamed from: c */
    private void m11093c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3553c.m11117a(C3553c.m11114a(Collections.singletonList(new C3553c.C3555a(str).mo20022a()), this.f8907a > 0 ? C3540a.NO_ADS_VAST_RESPONSE : C3540a.UNDEFINED_ERROR, -1, (String) null));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a.d$a */
    /* compiled from: VastXmlPullParser */
    static class C3545a {

        /* renamed from: a */
        String f8899a;

        /* renamed from: b */
        C3559a.C3562a f8900b;

        /* renamed from: c */
        C3559a.C3563b f8901c;

        /* renamed from: d */
        String f8902d;

        /* renamed from: e */
        final List<C3553c> f8903e = new ArrayList();

        /* renamed from: f */
        final List<C3553c> f8904f = new ArrayList();

        /* renamed from: g */
        float f8905g = Float.MIN_VALUE;

        public C3545a() {
        }

        public C3545a(String str, C3559a.C3562a aVar, C3559a.C3563b bVar) {
            mo20001a(str, aVar, bVar);
        }

        /* renamed from: a */
        public void mo20001a(String str, C3559a.C3562a aVar, C3559a.C3563b bVar) {
            this.f8899a = str;
            this.f8900b = aVar;
            this.f8901c = bVar;
        }

        /* renamed from: a */
        public void mo20000a(String str) {
            this.f8903e.add(new C3553c.C3555a(str).mo20022a());
        }

        /* renamed from: b */
        public void mo20002b(String str) {
            this.f8904f.add(new C3553c.C3555a(str).mo20022a());
        }
    }

    /* renamed from: a */
    public static List<C3553c> m11087a(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return m11094d(m11092b(xmlPullParser, str));
    }

    /* renamed from: b */
    public static int m11090b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: b */
    public static String m11092b(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        xmlPullParser.require(2, f8898f, str);
        if (xmlPullParser.next() == 4) {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            str2 = "";
        }
        xmlPullParser.require(3, f8898f, str);
        return str2;
    }

    /* renamed from: a */
    public static void m11088a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static void m11089a(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (!str.equals(xmlPullParser.getName()) || xmlPullParser.getEventType() != i) {
                xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.sdk.openadsdk.core.p156j.C3539a m11091b(org.xmlpull.v1.XmlPullParser r18, java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c> r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.f8907a
            r4 = 5
            r5 = 0
            if (r3 < r4) goto L_0x0010
            m11088a(r18)
            return r5
        L_0x0010:
            com.bytedance.sdk.openadsdk.core.j.d r3 = new com.bytedance.sdk.openadsdk.core.j.d
            r3.<init>(r5)
            r6 = r5
            r7 = r6
        L_0x0017:
            int r8 = r18.getEventType()
            java.lang.String r9 = "Wrapper"
            r10 = 3
            if (r8 != r10) goto L_0x0042
            java.lang.String r8 = r18.getName()
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x002b
            goto L_0x0042
        L_0x002b:
            com.bytedance.sdk.openadsdk.core.j.a r1 = r0.mo19999b((java.lang.String) r6, (java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r2)
            if (r1 == 0) goto L_0x0041
            com.bytedance.sdk.openadsdk.core.j.c r2 = r1.mo19985c()
            if (r2 != 0) goto L_0x003a
            r1.mo19981a((com.bytedance.sdk.openadsdk.core.p156j.C3557c) r7)
        L_0x003a:
            com.bytedance.sdk.openadsdk.core.j.d r2 = r1.mo19977a()
            r2.mo20040a((com.bytedance.sdk.openadsdk.core.p156j.C3567d) r3)
        L_0x0041:
            return r1
        L_0x0042:
            r18.next()
            int r8 = r18.getEventType()
            r11 = 2
            if (r8 == r11) goto L_0x004d
            goto L_0x0017
        L_0x004d:
            java.lang.String r8 = r18.getName()
            int r13 = r8.hashCode()
            java.lang.String r14 = "ClickTracking"
            java.lang.String r15 = "Error"
            java.lang.String r12 = "VASTAdTagURI"
            r5 = 4
            r4 = 1
            switch(r13) {
                case -587420703: goto L_0x008f;
                case 67232232: goto L_0x0087;
                case 611554000: goto L_0x007d;
                case 1150879268: goto L_0x0073;
                case 2107600959: goto L_0x006b;
                case 2114088489: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0097
        L_0x0061:
            java.lang.String r13 = "Impression"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0097
            r13 = r11
            goto L_0x0098
        L_0x006b:
            boolean r13 = r8.equals(r14)
            if (r13 == 0) goto L_0x0097
            r13 = r5
            goto L_0x0098
        L_0x0073:
            java.lang.String r13 = "CompanionAds"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0097
            r13 = 5
            goto L_0x0098
        L_0x007d:
            java.lang.String r13 = "TrackingEvents"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0097
            r13 = r10
            goto L_0x0098
        L_0x0087:
            boolean r13 = r8.equals(r15)
            if (r13 == 0) goto L_0x0097
            r13 = r4
            goto L_0x0098
        L_0x008f:
            boolean r13 = r8.equals(r12)
            if (r13 == 0) goto L_0x0097
            r13 = 0
            goto L_0x0098
        L_0x0097:
            r13 = -1
        L_0x0098:
            if (r13 == 0) goto L_0x00d9
            if (r13 == r4) goto L_0x00c5
            if (r13 == r11) goto L_0x00bc
            if (r13 == r10) goto L_0x00b7
            if (r13 == r5) goto L_0x00ae
            r4 = 5
            if (r13 == r4) goto L_0x00a6
            goto L_0x00d6
        L_0x00a6:
            android.content.Context r5 = r0.f8908b
            com.bytedance.sdk.openadsdk.core.j.c r5 = com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3541a.m11075a(r5, r1)
            r7 = r5
            goto L_0x00d6
        L_0x00ae:
            r4 = 5
            java.util.List r5 = m11087a((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r14)
            r3.mo20057g((java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r5)
            goto L_0x00d6
        L_0x00b7:
            r4 = 5
            com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3543c.m11082a((org.xmlpull.v1.XmlPullParser) r1, (com.bytedance.sdk.openadsdk.core.p156j.C3567d) r3)
            goto L_0x00d6
        L_0x00bc:
            r4 = 5
            java.util.List r5 = m11087a((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r8)
            r3.mo20044a((java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r5)
            goto L_0x00d6
        L_0x00c5:
            r4 = 5
            com.bytedance.sdk.openadsdk.core.j.b.c$a r5 = new com.bytedance.sdk.openadsdk.core.j.b.c$a
            java.lang.String r8 = m11092b((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r15)
            r5.<init>(r8)
            com.bytedance.sdk.openadsdk.core.j.b.c r5 = r5.mo20022a()
            r2.add(r5)
        L_0x00d6:
            r5 = r6
        L_0x00d7:
            r6 = 0
            goto L_0x00ed
        L_0x00d9:
            r4 = 5
            java.lang.String r5 = m11092b((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r12)
            java.lang.String r5 = r0.mo20003a((java.lang.String) r5, (java.util.List<com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c>) r2)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x00d7
            m11089a(r1, r9, r10)
            r6 = 0
            return r6
        L_0x00ed:
            r16 = r6
            r6 = r5
            r5 = r16
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d.m11091b(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.j.a");
    }

    /* renamed from: a */
    private static List<C3553c> m11086a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new C3553c.C3555a(str).mo20021a(z).mo20022a());
    }

    /* renamed from: d */
    private static List<C3553c> m11094d(String str) {
        return m11086a(str, false);
    }
}
