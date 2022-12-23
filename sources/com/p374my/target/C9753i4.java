package com.p374my.target;

import android.text.TextUtils;
import android.util.Xml;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p374my.target.C9983u1;
import com.p374my.target.common.models.AudioData;
import com.p374my.target.common.models.VideoData;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.VideoClicks;
import com.tapjoy.TJAdUnitConstants;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.my.target.i4 */
public class C9753i4<T extends C9983u1> {

    /* renamed from: a */
    public static final String[] f24042a = {"video/mp4", "application/vnd.apple.mpegurl", "application/x-mpegurl"};

    /* renamed from: b */
    public static final String[] f24043b = {"AdVerifications", "linkTxt"};

    /* renamed from: c */
    public final C9596a f24044c;

    /* renamed from: d */
    public final C9915q1 f24045d;

    /* renamed from: e */
    public final ArrayList<C9626b3> f24046e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<C9601a3> f24047f = new ArrayList<>();

    /* renamed from: g */
    public final ArrayList<C9600a2> f24048g = new ArrayList<>();

    /* renamed from: h */
    public final ArrayList<C9626b3> f24049h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<C9711g2<T>> f24050i = new ArrayList<>();

    /* renamed from: j */
    public boolean f24051j;

    /* renamed from: k */
    public String f24052k;

    /* renamed from: l */
    public C9915q1 f24053l;

    /* renamed from: m */
    public C9879o2 f24054m;

    public C9753i4(C9596a aVar, C9915q1 q1Var) {
        this.f24044c = aVar;
        this.f24045d = q1Var;
        this.f24054m = q1Var.mo65281p();
    }

    /* renamed from: a */
    public static <T extends C9983u1> C9753i4<T> m28226a(C9596a aVar, C9915q1 q1Var) {
        return new C9753i4<>(aVar, q1Var);
    }

    /* renamed from: a */
    public static String m28227a(String str) {
        return str.replaceAll("&amp;", "&").replaceAll("&lt;", "<").replaceAll("&gt;", ">").trim();
    }

    /* renamed from: a */
    public static String m28228a(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getAttributeValue((String) null, str);
    }

    /* renamed from: j */
    public static int m28229j(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.getEventType();
        } catch (Throwable th) {
            C9672e0.m27882a(th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: k */
    public static int m28230k(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (Throwable th) {
            C9672e0.m27882a(th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: l */
    public static int m28231l(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (Throwable th) {
            C9672e0.m27882a(th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: m */
    public static String m28232m(XmlPullParser xmlPullParser) {
        String str;
        if (m28230k(xmlPullParser) == 4) {
            str = xmlPullParser.getText();
            m28231l(xmlPullParser);
        } else {
            C9672e0.m27882a("No text: " + xmlPullParser.getName());
            str = "";
        }
        return str.trim();
    }

    /* renamed from: n */
    public static void m28233n(XmlPullParser xmlPullParser) {
        if (m28229j(xmlPullParser) == 2) {
            int i = 1;
            while (i != 0) {
                int k = m28230k(xmlPullParser);
                if (k == 2) {
                    i++;
                } else if (k == 3) {
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64238a() {
        ArrayList<C9626b3> n = this.f24045d.mo65279n();
        if (n != null) {
            this.f24046e.addAll(n);
        }
        ArrayList<C9600a2> i = this.f24045d.mo65274i();
        if (i != null) {
            this.f24048g.addAll(i);
        }
    }

    /* renamed from: a */
    public final void mo64239a(float f, String str, C10066z1 z1Var) {
        C9601a3 a = C9601a3.m27586a(str);
        if (z1Var == null || z1Var.getDuration() <= 0.0f) {
            a.mo63447a(f);
            this.f24047f.add(a);
            return;
        }
        a.mo63448b(z1Var.getDuration() * (f / 100.0f));
        z1Var.getStatHolder().mo63676a((C9626b3) a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64240a(com.p374my.target.C9711g2 r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L_0x0063
            java.lang.String r0 = "%"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r5.length()
            int r0 = r0 + -1
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Linear skipoffset is "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " [%]"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.p374my.target.C9672e0.m27882a(r5)
            float r5 = r4.getDuration()
            r1 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r1
            float r0 = (float) r0
            float r5 = r5 * r0
            goto L_0x0065
        L_0x003c:
            java.lang.String r0 = ":"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0063
            float r5 = r3.mo64250b((java.lang.String) r5)     // Catch:{ all -> 0x0049 }
            goto L_0x0065
        L_0x0049:
            java.lang.String r0 = r4.getId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to convert ISO time skipoffset string "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "Bad value"
            r3.mo64242a((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r5)
        L_0x0063:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0065:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006d
            r4.setAllowCloseDelay(r5)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9753i4.mo64240a(com.my.target.g2, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo64241a(String str, String str2, C10066z1 z1Var) {
        float f;
        try {
            f = mo64250b(str);
        } catch (Throwable unused) {
            f = -1.0f;
        }
        if (f >= 0.0f) {
            C9601a3 a = C9601a3.m27586a(str2);
            a.mo63448b(f);
            if (z1Var != null) {
                z1Var.getStatHolder().mo63676a((C9626b3) a);
            } else {
                this.f24049h.add(a);
            }
        } else {
            C9672e0.m27882a("Unable to parse progress stat with value " + str);
        }
    }

    /* renamed from: a */
    public final void mo64242a(String str, String str2, String str3) {
        C9672e0.m27882a("Vast parser error " + str2 + " with banner Id " + str + ": " + str3);
    }

    /* renamed from: a */
    public final void mo64243a(XmlPullParser xmlPullParser) {
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Wrapper".equals(name)) {
                    this.f24051j = true;
                    C9672e0.m27882a("VAST file contains wrapped ad information.");
                    int v = this.f24045d.mo65287v();
                    if (v < 5) {
                        mo64244a(xmlPullParser, v);
                    } else {
                        C9672e0.m27882a("got VAST wrapper, but max redirects limit exceeded");
                    }
                } else if ("InLine".equals(name)) {
                    this.f24051j = false;
                    C9672e0.m27882a("VAST file contains inline ad information.");
                    mo64267g(xmlPullParser);
                }
                m28233n(xmlPullParser);
            }
        }
    }

    /* renamed from: a */
    public final void mo64244a(XmlPullParser xmlPullParser, int i) {
        String str = null;
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Impression".equals(name)) {
                    mo64266f(xmlPullParser);
                } else if ("Creatives".equals(name)) {
                    mo64259c(xmlPullParser);
                } else if ("Extensions".equals(name)) {
                    mo64264e(xmlPullParser);
                } else if ("VASTAdTagURI".equals(name)) {
                    str = m28232m(xmlPullParser);
                } else if ("AdVerifications".equals(name)) {
                    mo64253b(xmlPullParser);
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
        if (str != null) {
            String j = this.f24045d.mo65275j();
            C9915q1 b = C9915q1.m29023b(str);
            this.f24053l = b;
            b.mo65263d(i + 1);
            this.f24053l.mo65260c(this.f24046e);
            this.f24053l.mo65243a(this.f24054m);
            C9915q1 q1Var = this.f24053l;
            if (TextUtils.isEmpty(j)) {
                j = this.f24052k;
            }
            q1Var.mo65259c(j);
            this.f24053l.mo65253b(this.f24048g);
            this.f24053l.mo65245a(this.f24045d.mo65238a());
            this.f24053l.mo65252b(this.f24045d.mo65255c());
            this.f24053l.mo65264d(this.f24045d.mo65266e());
            this.f24053l.mo65267e(this.f24045d.mo65268f());
            this.f24053l.mo65269f(this.f24045d.mo65270g());
            this.f24053l.mo65271g(this.f24045d.mo65276k());
            this.f24053l.mo65273h(this.f24045d.mo65283r());
            this.f24053l.mo65240a(this.f24045d.mo65248b());
            this.f24053l.mo65258c(this.f24045d.mo65262d());
            C9641c3 h = this.f24053l.mo65272h();
            h.mo63679a((List<C9626b3>) this.f24049h);
            h.mo63678a(this.f24047f);
            h.mo63677a(this.f24045d.mo65272h(), -1.0f);
            this.f24045d.mo65244a(this.f24053l);
            return;
        }
        C9672e0.m27882a("got VAST wrapper, but no vastAdTagUri");
    }

    /* renamed from: a */
    public final void mo64245a(XmlPullParser xmlPullParser, C9711g2 g2Var, String str) {
        while (m28231l(xmlPullParser) == 2) {
            String name = xmlPullParser.getName();
            if (m28229j(xmlPullParser) == 2) {
                if (Linear.DURATION.equals(name)) {
                    if (g2Var == null) {
                        continue;
                    } else if (mo64249a(xmlPullParser, g2Var)) {
                        mo64240a(g2Var, str);
                    } else {
                        return;
                    }
                } else if ("TrackingEvents".equals(name)) {
                    mo64246a(xmlPullParser, (C10066z1) g2Var);
                } else if (Linear.MEDIA_FILES.equals(name)) {
                    if (g2Var == null) {
                        continue;
                    } else {
                        mo64254b(xmlPullParser, g2Var);
                        if (g2Var.getMediaData() == null) {
                            C9672e0.m27882a("Unable to find valid mediafile!");
                            return;
                        }
                    }
                } else if ("VideoClicks".equals(name)) {
                    mo64260c(xmlPullParser, g2Var);
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64246a(XmlPullParser xmlPullParser, C10066z1 z1Var) {
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                if (Tracking.NAME.equals(xmlPullParser.getName())) {
                    String a = m28228a("event", xmlPullParser);
                    String a2 = m28228a("offset", xmlPullParser);
                    if (a != null) {
                        if (!NotificationCompat.CATEGORY_PROGRESS.equals(a) || TextUtils.isEmpty(a2)) {
                            mo64258c(a, m28232m(xmlPullParser), z1Var);
                        } else if (a2.endsWith("%")) {
                            try {
                                mo64239a((float) Integer.parseInt(a2.replace("%", "")), m28232m(xmlPullParser), z1Var);
                            } catch (Throwable unused) {
                                C9672e0.m27882a("Unable to parse progress stat with value " + a2);
                            }
                        } else {
                            mo64241a(a2, m28232m(xmlPullParser), z1Var);
                        }
                    }
                    C9672e0.m27882a("Added VAST tracking \"" + a + "\"");
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.my.target.g2} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64247a(org.xmlpull.v1.XmlPullParser r5, java.lang.String r6) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = m28231l(r5)
            r1 = 2
            if (r0 != r1) goto L_0x00ab
            int r0 = m28229j(r5)
            if (r0 == r1) goto L_0x000e
            goto L_0x0000
        L_0x000e:
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "Linear"
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto L_0x005f
            boolean r0 = r4.f24051j
            if (r0 != 0) goto L_0x002c
            com.my.target.g2 r2 = com.p374my.target.C9711g2.newBanner()
            if (r6 == 0) goto L_0x0027
            r0 = r6
            goto L_0x0029
        L_0x0027:
            java.lang.String r0 = ""
        L_0x0029:
            r2.setId(r0)
        L_0x002c:
            java.lang.String r0 = "skipoffset"
            java.lang.String r0 = m28228a((java.lang.String) r0, (org.xmlpull.v1.XmlPullParser) r5)
            r4.mo64245a((org.xmlpull.v1.XmlPullParser) r5, (com.p374my.target.C9711g2) r2, (java.lang.String) r0)
            if (r2 == 0) goto L_0x0000
            float r0 = r2.getDuration()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            java.lang.String r1 = "Required field"
            if (r0 <= 0) goto L_0x0055
            com.my.target.u1 r0 = r2.getMediaData()
            if (r0 == 0) goto L_0x004e
            java.util.ArrayList<com.my.target.g2<T>> r0 = r4.f24050i
            r0.add(r2)
            goto L_0x0000
        L_0x004e:
            java.lang.String r0 = r2.getId()
            java.lang.String r2 = "VAST has no valid mediaData"
            goto L_0x005b
        L_0x0055:
            java.lang.String r0 = r2.getId()
            java.lang.String r2 = "VAST has no valid Duration"
        L_0x005b:
            r4.mo64242a((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r2)
            goto L_0x0000
        L_0x005f:
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "CompanionAds"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "required"
            java.lang.String r0 = m28228a((java.lang.String) r0, (org.xmlpull.v1.XmlPullParser) r5)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = "all"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = "any"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = "none"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Wrong companion required attribute:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Bad value"
            r4.mo64242a((java.lang.String) r6, (java.lang.String) r1, (java.lang.String) r0)
            goto L_0x00a1
        L_0x00a0:
            r2 = r0
        L_0x00a1:
            r4.mo64255b((org.xmlpull.v1.XmlPullParser) r5, (java.lang.String) r6, (java.lang.String) r2)
            goto L_0x0000
        L_0x00a6:
            m28233n(r5)
            goto L_0x0000
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9753i4.mo64247a(org.xmlpull.v1.XmlPullParser, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo64248a(XmlPullParser xmlPullParser, String str, String str2) {
        if (m28229j(xmlPullParser) == 2) {
            String name = xmlPullParser.getName();
            if (name == null || !name.equals("Companion")) {
                m28233n(xmlPullParser);
                return;
            }
            String a = m28228a("width", xmlPullParser);
            String a2 = m28228a("height", xmlPullParser);
            String a3 = m28228a("id", xmlPullParser);
            C9600a2 newBanner = C9600a2.newBanner();
            if (a3 == null) {
                a3 = "";
            }
            newBanner.setId(a3);
            try {
                newBanner.setWidth(Integer.parseInt(a));
                newBanner.setHeight(Integer.parseInt(a2));
            } catch (Throwable unused) {
                mo64242a(str, "Bad value", "Unable  to convert required companion attributes, width = " + a + " height = " + a2);
            }
            newBanner.setRequired(str2);
            String a4 = m28228a(Companion.ASSET_WIDTH, xmlPullParser);
            String a5 = m28228a(Companion.ASSET_HEIGHT, xmlPullParser);
            try {
                if (!TextUtils.isEmpty(a4)) {
                    newBanner.setAssetWidth(Integer.parseInt(a4));
                }
                if (!TextUtils.isEmpty(a5)) {
                    newBanner.setAssetHeight(Integer.parseInt(a5));
                }
            } catch (Throwable th) {
                C9672e0.m27882a("wrong VAST asset dimensions: " + th.getMessage());
            }
            String a6 = m28228a(Companion.EXPANDED_WIDTH, xmlPullParser);
            String a7 = m28228a(Companion.EXPANDED_HEIGHT, xmlPullParser);
            try {
                if (!TextUtils.isEmpty(a6)) {
                    newBanner.setExpandedWidth(Integer.parseInt(a6));
                }
                if (!TextUtils.isEmpty(a7)) {
                    newBanner.setExpandedHeight(Integer.parseInt(a7));
                }
            } catch (Throwable th2) {
                C9672e0.m27882a("wrong VAST expanded dimensions " + th2.getMessage());
            }
            newBanner.setAdSlotID(m28228a(Companion.AD_SLOT_ID, xmlPullParser));
            newBanner.setApiFramework(m28228a("apiFramework", xmlPullParser));
            this.f24048g.add(newBanner);
            while (m28231l(xmlPullParser) == 2) {
                String name2 = xmlPullParser.getName();
                if ("StaticResource".equals(name2)) {
                    newBanner.setStaticResource(C10082z8.m29919a(m28232m(xmlPullParser)));
                } else if ("HTMLResource".equals(name2)) {
                    newBanner.setHtmlResource(C10082z8.m29919a(m28232m(xmlPullParser)));
                } else if ("IFrameResource".equals(name2)) {
                    newBanner.setIframeResource(C10082z8.m29919a(m28232m(xmlPullParser)));
                } else if (Companion.COMPANION_CLICK_THROUGH.equals(name2)) {
                    String m = m28232m(xmlPullParser);
                    if (!TextUtils.isEmpty(m)) {
                        newBanner.setTrackingLink(m28227a(m));
                    }
                } else if (Companion.COMPANION_CLICK_TRACKING.equals(name2)) {
                    String m2 = m28232m(xmlPullParser);
                    if (!TextUtils.isEmpty(m2)) {
                        newBanner.getStatHolder().mo63676a(C9626b3.m27668a("click", m2));
                    }
                } else if ("TrackingEvents".equals(name2)) {
                    mo64246a(xmlPullParser, (C10066z1) newBanner);
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo64249a(XmlPullParser xmlPullParser, C9711g2 g2Var) {
        float f;
        try {
            f = mo64250b(m28232m(xmlPullParser));
        } catch (Throwable unused) {
            f = 0.0f;
        }
        if (f <= 0.0f) {
            return false;
        }
        g2Var.setDuration(f);
        return true;
    }

    /* renamed from: b */
    public float mo64250b(String str) {
        long j;
        String str2 = str;
        try {
            if (str2.contains(".")) {
                int indexOf = str2.indexOf(".");
                j = Long.parseLong(str2.substring(indexOf + 1));
                if (j > 1000) {
                    return -1.0f;
                }
                str2 = str2.substring(0, indexOf);
            } else {
                j = 0;
            }
            String[] split = str2.split(CertificateUtil.DELIMITER, 3);
            long parseInt = (long) Integer.parseInt(split[0]);
            long parseInt2 = (long) Integer.parseInt(split[1]);
            long parseInt3 = (long) Integer.parseInt(split[2]);
            if (parseInt >= 24 || parseInt2 >= 60 || parseInt3 >= 60) {
                return -1.0f;
            }
            return ((float) (((j + (parseInt3 * 1000)) + (parseInt2 * 60000)) + (parseInt * 3600000))) / 1000.0f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    /* renamed from: b */
    public final void mo64251b() {
        for (int i = 0; i < this.f24050i.size(); i++) {
            C9711g2 g2Var = this.f24050i.get(i);
            C9641c3 statHolder = g2Var.getStatHolder();
            statHolder.mo63677a(this.f24045d.mo65272h(), g2Var.getDuration());
            String j = this.f24045d.mo65275j();
            if (TextUtils.isEmpty(j)) {
                j = this.f24052k;
            }
            g2Var.setCtaText(j);
            Iterator<C9601a3> it = this.f24047f.iterator();
            while (it.hasNext()) {
                C9601a3 next = it.next();
                mo64239a(next.mo63449d(), next.mo63604b(), (C10066z1) g2Var);
            }
            statHolder.mo63679a((List<C9626b3>) this.f24049h);
            Iterator<C9600a2> it2 = this.f24048g.iterator();
            while (it2.hasNext()) {
                g2Var.addCompanion(it2.next());
            }
            if (i == 0) {
                statHolder.mo63679a((List<C9626b3>) this.f24046e);
            }
            g2Var.setOmData(this.f24054m);
        }
    }

    /* renamed from: b */
    public final void mo64252b(String str, String str2, C10066z1 z1Var) {
        if (z1Var != null) {
            z1Var.getStatHolder().mo63676a(C9626b3.m27668a(str, str2));
            return;
        }
        this.f24049h.add(C9626b3.m27668a(str, str2));
    }

    /* renamed from: b */
    public final void mo64253b(XmlPullParser xmlPullParser) {
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                if (Verification.NAME.equals(xmlPullParser.getName())) {
                    mo64269i(xmlPullParser);
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo64254b(XmlPullParser xmlPullParser, C9711g2 g2Var) {
        if ("instreamads".equals(this.f24044c.getFormat()) || "fullscreen".equals(this.f24044c.getFormat()) || "rewarded".equals(this.f24044c.getFormat())) {
            mo64265e(xmlPullParser, g2Var);
        } else if ("instreamaudioads".equals(this.f24044c.getFormat())) {
            mo64263d(xmlPullParser, g2Var);
        }
    }

    /* renamed from: b */
    public final void mo64255b(XmlPullParser xmlPullParser, String str, String str2) {
        while (m28231l(xmlPullParser) == 2) {
            mo64248a(xmlPullParser, str, str2);
        }
    }

    /* renamed from: c */
    public ArrayList<C9711g2<T>> mo64256c() {
        return this.f24050i;
    }

    /* renamed from: c */
    public void mo64257c(String str) {
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(new StringReader(str));
            mo64238a();
            int j = m28229j(newPullParser);
            while (j != 1 && j != Integer.MIN_VALUE) {
                if (j == 2 && VastTree.VAST.equalsIgnoreCase(newPullParser.getName())) {
                    mo64268h(newPullParser);
                }
                j = m28230k(newPullParser);
            }
        } catch (Throwable th) {
            C9672e0.m27882a("Unable to parse VAST: " + th.getMessage());
        }
    }

    /* renamed from: c */
    public final void mo64258c(String str, String str2, C10066z1 z1Var) {
        float f;
        String str3 = "error";
        if (!"start".equalsIgnoreCase(str)) {
            if (TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE.equalsIgnoreCase(str)) {
                f = 25.0f;
            } else if ("midpoint".equalsIgnoreCase(str)) {
                f = 50.0f;
            } else if (TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE.equalsIgnoreCase(str)) {
                f = 75.0f;
            } else if ("complete".equalsIgnoreCase(str)) {
                f = 100.0f;
            } else if (!"creativeView".equalsIgnoreCase(str)) {
                if ("mute".equalsIgnoreCase(str)) {
                    str3 = "volumeOff";
                } else if ("unmute".equalsIgnoreCase(str)) {
                    str3 = "volumeOn";
                } else if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equalsIgnoreCase(str)) {
                    str3 = "playbackPaused";
                } else if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equalsIgnoreCase(str)) {
                    str3 = "playbackResumed";
                } else if ("fullscreen".equalsIgnoreCase(str)) {
                    str3 = "fullscreenOn";
                } else if ("exitFullscreen".equalsIgnoreCase(str)) {
                    str3 = "fullscreenOff";
                } else {
                    if (!"skip".equalsIgnoreCase(str)) {
                        if (!str3.equalsIgnoreCase(str)) {
                            if (VideoClicks.CLICK_TRACKING.equalsIgnoreCase(str)) {
                                str3 = "click";
                            } else if (!"close".equalsIgnoreCase(str) && !"closeLinear".equalsIgnoreCase(str)) {
                                return;
                            }
                        }
                    }
                    str3 = "closedByUser";
                }
                mo64252b(str3, str2, z1Var);
            }
            mo64239a(f, str2, z1Var);
            return;
        }
        str3 = "playbackStarted";
        mo64252b(str3, str2, z1Var);
    }

    /* renamed from: c */
    public final void mo64259c(XmlPullParser xmlPullParser) {
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                if (Creative.NAME.equals(xmlPullParser.getName())) {
                    mo64247a(xmlPullParser, m28228a("id", xmlPullParser));
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo64260c(XmlPullParser xmlPullParser, C9711g2 g2Var) {
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if (VideoClicks.CLICK_THROUGH.equals(name)) {
                    if (g2Var != null) {
                        String m = m28232m(xmlPullParser);
                        if (!TextUtils.isEmpty(m)) {
                            g2Var.setTrackingLink(m28227a(m));
                        }
                    }
                } else if (VideoClicks.CLICK_TRACKING.equals(name)) {
                    String m2 = m28232m(xmlPullParser);
                    if (!TextUtils.isEmpty(m2)) {
                        this.f24049h.add(C9626b3.m27668a("click", m2));
                    }
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: d */
    public C9915q1 mo64261d() {
        return this.f24053l;
    }

    /* renamed from: d */
    public final void mo64262d(XmlPullParser xmlPullParser) {
        String a = m28228a("type", xmlPullParser);
        if (a == null || Arrays.binarySearch(f24043b, a) < 0) {
            m28233n(xmlPullParser);
        } else if ("linkTxt".equals(a)) {
            String m = m28232m(xmlPullParser);
            this.f24052k = C10082z8.m29919a(m);
            C9672e0.m27882a("VAST linkTxt raw text: " + m);
            m28233n(xmlPullParser);
        } else {
            while (m28231l(xmlPullParser) == 2) {
                if (m28229j(xmlPullParser) == 2) {
                    if ("AdVerifications".equals(xmlPullParser.getName())) {
                        mo64253b(xmlPullParser);
                    } else {
                        m28233n(xmlPullParser);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo64263d(XmlPullParser xmlPullParser, C9711g2<AudioData> g2Var) {
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                if (MediaFile.NAME.equals(xmlPullParser.getName())) {
                    String a = m28228a("type", xmlPullParser);
                    String a2 = m28228a(MediaFile.BITRATE, xmlPullParser);
                    String a3 = m28227a(m28232m(xmlPullParser));
                    AudioData audioData = null;
                    if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(a3) && a.toLowerCase(Locale.ROOT).trim().startsWith("audio")) {
                        int i = 0;
                        if (a2 != null) {
                            try {
                                i = Integer.parseInt(a2);
                            } catch (Throwable unused) {
                            }
                        }
                        AudioData newAudioData = AudioData.newAudioData(a3);
                        newAudioData.setBitrate(i);
                        audioData = newAudioData;
                    }
                    if (audioData == null) {
                        C9672e0.m27882a("Skipping unsupported VAST file (mimetype=" + a + ",url=" + a3);
                    } else {
                        g2Var.setMediaData(audioData);
                    }
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo64264e(XmlPullParser xmlPullParser) {
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                if (Extension.NAME.equals(xmlPullParser.getName())) {
                    mo64262d(xmlPullParser);
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo64265e(XmlPullParser xmlPullParser, C9711g2<VideoData> g2Var) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                if (MediaFile.NAME.equals(xmlPullParser.getName())) {
                    String a = m28228a("type", xmlPullParser);
                    String a2 = m28228a(MediaFile.BITRATE, xmlPullParser);
                    String a3 = m28228a("width", xmlPullParser);
                    String a4 = m28228a("height", xmlPullParser);
                    String a5 = m28227a(m28232m(xmlPullParser));
                    VideoData videoData = null;
                    if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(a5)) {
                        String[] strArr = f24042a;
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            } else if (strArr[i4].equals(a)) {
                                if (a3 != null) {
                                    try {
                                        i2 = Integer.parseInt(a3);
                                    } catch (Throwable unused) {
                                        i2 = 0;
                                        i = 0;
                                    }
                                } else {
                                    i2 = 0;
                                }
                                if (a4 != null) {
                                    try {
                                        i = Integer.parseInt(a4);
                                    } catch (Throwable unused2) {
                                        i = 0;
                                    }
                                } else {
                                    i = 0;
                                }
                                if (a2 != null) {
                                    try {
                                        i3 = Integer.parseInt(a2);
                                    } catch (Throwable unused3) {
                                    }
                                }
                                if (i2 > 0 && i > 0) {
                                    videoData = VideoData.newVideoData(a5, i2, i);
                                    videoData.setBitrate(i3);
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (videoData == null) {
                        C9672e0.m27882a("Skipping unsupported VAST file (mimeType=" + a + ",width=" + a3 + ",height=" + a4 + ",url=" + a5);
                    } else {
                        arrayList.add(videoData);
                    }
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
        g2Var.setMediaData(VideoData.chooseBest(arrayList, this.f24044c.getVideoQuality()));
    }

    /* renamed from: f */
    public final void mo64266f(XmlPullParser xmlPullParser) {
        String m = m28232m(xmlPullParser);
        if (!TextUtils.isEmpty(m)) {
            this.f24046e.add(C9626b3.m27668a("playbackStarted", m));
            C9672e0.m27882a("Impression tracker url for wrapper: " + m);
        }
    }

    /* renamed from: g */
    public final void mo64267g(XmlPullParser xmlPullParser) {
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Impression".equals(name)) {
                    mo64266f(xmlPullParser);
                } else if ("Creatives".equals(name)) {
                    mo64259c(xmlPullParser);
                } else if ("Extensions".equals(name)) {
                    mo64264e(xmlPullParser);
                } else if ("AdVerifications".equals(name)) {
                    mo64253b(xmlPullParser);
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
        mo64251b();
    }

    /* renamed from: h */
    public final void mo64268h(XmlPullParser xmlPullParser) {
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2 && "Ad".equals(xmlPullParser.getName())) {
                mo64243a(xmlPullParser);
            }
        }
    }

    /* renamed from: i */
    public final void mo64269i(XmlPullParser xmlPullParser) {
        String a = m28228a(Verification.VENDOR, xmlPullParser);
        String str = null;
        String str2 = null;
        while (m28231l(xmlPullParser) == 2) {
            if (m28229j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    str = m28232m(xmlPullParser);
                } else if (Verification.VERIFICATION_PARAMETERS.equals(name)) {
                    str2 = m28232m(xmlPullParser);
                } else {
                    m28233n(xmlPullParser);
                }
            }
        }
        if (str != null) {
            if (this.f24054m == null) {
                this.f24054m = C9879o2.m28890a((String) null, (String) null);
            }
            this.f24054m.f24430c.add((TextUtils.isEmpty(a) || TextUtils.isEmpty(str2)) ? C9896p2.m28955a(str) : C9896p2.m28956a(str, a, str2));
        }
    }
}
