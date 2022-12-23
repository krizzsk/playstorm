package com.inmobi.media;

import android.graphics.Point;
import android.webkit.URLUtil;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.media.C5916cc;
import com.inmobi.media.C5988dm;
import com.smaato.sdk.video.vast.model.Verification;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bx */
/* compiled from: NativeDataModel */
public class C5907bx {

    /* renamed from: m */
    private static final String f14934m = C5907bx.class.getSimpleName();

    /* renamed from: a */
    public byte f14935a;

    /* renamed from: b */
    public boolean f14936b;

    /* renamed from: c */
    public boolean f14937c;

    /* renamed from: d */
    public C5903bv f14938d;

    /* renamed from: e */
    public JSONArray f14939e;

    /* renamed from: f */
    public C5907bx f14940f;

    /* renamed from: g */
    public Map<String, String> f14941g;

    /* renamed from: h */
    public C6000ds f14942h;

    /* renamed from: i */
    public C5908a f14943i;

    /* renamed from: j */
    public boolean f14944j;

    /* renamed from: k */
    public C5925ch f14945k;

    /* renamed from: l */
    HashMap<String, String> f14946l;

    /* renamed from: n */
    private JSONObject f14947n;

    /* renamed from: o */
    private JSONObject f14948o;

    /* renamed from: p */
    private Map<String, List<C5901bt>> f14949p;

    /* renamed from: q */
    private Map<String, C5901bt> f14950q;

    /* renamed from: r */
    private Map<String, String> f14951r;

    /* renamed from: s */
    private C6125fq f14952s;

    /* renamed from: t */
    private int f14953t;

    /* renamed from: u */
    private boolean f14954u;

    /* renamed from: com.inmobi.media.bx$a */
    /* compiled from: NativeDataModel */
    public class C5908a {

        /* renamed from: a */
        public JSONObject f14955a;

        /* renamed from: b */
        public C5909a f14956b = new C5909a();

        /* renamed from: c */
        public C5901bt f14957c;

        public C5908a() {
        }

        /* renamed from: com.inmobi.media.bx$a$a */
        /* compiled from: NativeDataModel */
        public class C5909a {

            /* renamed from: a */
            public String f14959a;

            /* renamed from: b */
            public String f14960b;

            /* renamed from: c */
            public String f14961c;

            /* renamed from: d */
            public String f14962d;

            /* renamed from: e */
            public float f14963e;

            /* renamed from: f */
            public String f14964f;

            /* renamed from: g */
            public boolean f14965g;

            public C5909a() {
            }
        }
    }

    public C5907bx() {
        this.f14940f = null;
    }

    public C5907bx(int i, JSONObject jSONObject, C6125fq fqVar, HashMap<String, String> hashMap, C6000ds dsVar) {
        this(i, jSONObject, (C5907bx) null, false, fqVar, hashMap, dsVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5907bx(int i, JSONObject jSONObject, C5907bx bxVar, boolean z, C6125fq fqVar) {
        this(i, jSONObject, bxVar, z, fqVar, bxVar == null ? null : bxVar.f14946l, (C6000ds) null);
    }

    private C5907bx(int i, JSONObject jSONObject, C5907bx bxVar, boolean z, C6125fq fqVar, HashMap<String, String> hashMap, C6000ds dsVar) {
        this.f14953t = i;
        this.f14940f = bxVar;
        this.f14952s = fqVar;
        this.f14947n = jSONObject;
        this.f14935a = 0;
        this.f14936b = false;
        this.f14942h = dsVar;
        this.f14950q = new HashMap();
        this.f14951r = new HashMap();
        this.f14949p = new HashMap();
        this.f14943i = new C5908a();
        this.f14954u = z;
        this.f14946l = hashMap;
        m17693i();
    }

    /* renamed from: a */
    public final HashMap<String, String> mo34895a() {
        HashMap<String, String> hashMap = this.f14946l;
        return hashMap == null ? new HashMap<>() : hashMap;
    }

    /* renamed from: b */
    public final JSONObject mo34897b() {
        try {
            return this.f14939e.getJSONObject(0);
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    /* renamed from: f */
    private C5903bv m17683f() {
        Iterator<C5901bt> it = this.f14938d.iterator();
        while (it.hasNext()) {
            C5901bt next = it.next();
            if (next.f14895d.equalsIgnoreCase("card_scrollable")) {
                return (C5903bv) next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final int mo34898c() {
        C5903bv bvVar = this.f14938d;
        if (bvVar == null) {
            return 0;
        }
        Iterator<C5901bt> it = bvVar.iterator();
        while (it.hasNext()) {
            C5901bt next = it.next();
            if (next.f14895d.equalsIgnoreCase("card_scrollable")) {
                return ((C5903bv) next).f14930C;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final C5903bv mo34894a(int i) {
        Iterator<C5901bt> it = this.f14938d.iterator();
        while (it.hasNext()) {
            C5901bt next = it.next();
            if (next.f14895d.equalsIgnoreCase("card_scrollable")) {
                C5903bv bvVar = (C5903bv) next;
                if (i >= bvVar.f14930C) {
                    return null;
                }
                return (C5903bv) bvVar.mo34887a(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C5903bv m17665a(C5901bt btVar) {
        if (btVar instanceof C5903bv) {
            C5903bv bvVar = (C5903bv) btVar;
            if (m17671a(bvVar)) {
                return bvVar;
            }
        }
        for (C5903bv bvVar2 = (C5903bv) btVar.f14911t; bvVar2 != null; bvVar2 = (C5903bv) bvVar2.f14911t) {
            if (m17671a(bvVar2)) {
                return bvVar2;
            }
        }
        return null;
    }

    /* renamed from: g */
    private void m17688g() {
        C5901bt a;
        List<C5988dm.C5989a> list;
        for (C5901bt next : mo34899c(ShareConstants.IMAGE_URL)) {
            if (!URLUtil.isValidUrl((String) next.f14896e) && (a = m17662a(this, next)) != null) {
                if (a.f14893b.equals(next.f14893b)) {
                    next.f14896e = a.f14896e;
                } else if (ShareConstants.VIDEO_URL.equals(a.f14893b) && 1 != a.f14904m && 2 == a.f14904m) {
                    C5923cg cgVar = (C5923cg) a;
                    C6001dt b = cgVar.mo34920b();
                    C5988dm a2 = C5987dl.m17867a(cgVar, next);
                    C5988dm.C5989a aVar = null;
                    if (a2 == null) {
                        list = null;
                    } else {
                        list = a2.mo35092a(1);
                    }
                    if (list != null) {
                        Iterator<C5988dm.C5989a> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C5988dm.C5989a next2 = it.next();
                            if (URLUtil.isValidUrl(next2.f15221b)) {
                                aVar = next2;
                                break;
                            }
                        }
                    }
                    if (a2 != null && aVar != null) {
                        b.mo35107a(a2);
                        next.f14896e = aVar.f15221b;
                        next.mo34878a(a2.mo35093a("creativeView"));
                        for (C5922cf next3 : cgVar.f14912u) {
                            if ("error".equals(next3.f15004d)) {
                                next.f14912u.add(next3);
                            }
                        }
                    } else if (b.mo35111e().size() > 0) {
                        m17670a(cgVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0107  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17691h() {
        /*
            r12 = this;
            java.lang.String r0 = "WEBVIEW"
            java.util.List r0 = r12.mo34899c((java.lang.String) r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0110
            java.lang.Object r1 = r0.next()
            com.inmobi.media.bt r1 = (com.inmobi.media.C5901bt) r1
            r2 = r1
            com.inmobi.media.ch r2 = (com.inmobi.media.C5925ch) r2
            java.lang.String r3 = r2.f15018z
            java.lang.String r4 = "URL"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x000a
            java.lang.String r3 = r2.f15018z
            java.lang.String r4 = "HTML"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x000a
            com.inmobi.media.bt r3 = m17662a((com.inmobi.media.C5907bx) r12, (com.inmobi.media.C5901bt) r1)
            if (r3 == 0) goto L_0x000a
            java.lang.String r4 = r3.f14893b
            java.lang.String r5 = r1.f14893b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0042
            java.lang.Object r2 = r3.f14896e
            r1.f14896e = r2
            goto L_0x000a
        L_0x0042:
            java.lang.String r4 = r3.f14893b
            java.lang.String r5 = "VIDEO"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x000a
            byte r4 = r3.f14904m
            r5 = 2
            if (r5 != r4) goto L_0x000a
            com.inmobi.media.cg r3 = (com.inmobi.media.C5923cg) r3
            com.inmobi.media.dt r4 = r3.mo34920b()
            com.inmobi.media.dm r6 = com.inmobi.media.C5987dl.m17867a(r3, r1)
            java.lang.String r7 = "REF_HTML"
            java.lang.String r8 = "REF_IFRAME"
            if (r6 == 0) goto L_0x00d1
            java.lang.String r9 = r2.f15018z
            boolean r9 = r7.equals(r9)
            r10 = 3
            r11 = 0
            if (r9 == 0) goto L_0x0099
            java.util.List r5 = r6.mo35092a((int) r5)
            int r9 = r5.size()
            if (r9 <= 0) goto L_0x007e
            java.lang.Object r5 = r5.get(r11)
            com.inmobi.media.dm$a r5 = (com.inmobi.media.C5988dm.C5989a) r5
            java.lang.String r5 = r5.f15221b
            goto L_0x00d2
        L_0x007e:
            java.util.List r5 = r6.mo35092a((int) r10)
            int r9 = r5.size()
            if (r9 <= 0) goto L_0x00d1
            java.lang.Object r5 = r5.get(r11)
            com.inmobi.media.dm$a r5 = (com.inmobi.media.C5988dm.C5989a) r5
            java.lang.String r5 = r5.f15221b
            boolean r9 = android.webkit.URLUtil.isValidUrl(r5)
            if (r9 == 0) goto L_0x00d1
            r2.f15018z = r8
            goto L_0x00d2
        L_0x0099:
            java.lang.String r9 = r2.f15018z
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00d1
            java.util.List r9 = r6.mo35092a((int) r10)
            int r10 = r9.size()
            if (r10 <= 0) goto L_0x00bc
            java.lang.Object r5 = r9.get(r11)
            com.inmobi.media.dm$a r5 = (com.inmobi.media.C5988dm.C5989a) r5
            java.lang.String r5 = r5.f15221b
            boolean r9 = android.webkit.URLUtil.isValidUrl(r5)
            if (r9 == 0) goto L_0x00d1
            r2.f15018z = r8
            goto L_0x00d2
        L_0x00bc:
            java.util.List r5 = r6.mo35092a((int) r5)
            int r9 = r5.size()
            if (r9 <= 0) goto L_0x00d1
            r2.f15018z = r7
            java.lang.Object r5 = r5.get(r11)
            com.inmobi.media.dm$a r5 = (com.inmobi.media.C5988dm.C5989a) r5
            java.lang.String r5 = r5.f15221b
            goto L_0x00d2
        L_0x00d1:
            r5 = 0
        L_0x00d2:
            java.lang.String r9 = r2.f15018z
            boolean r8 = r8.equals(r9)
            java.lang.String r9 = r2.f15018z
            boolean r7 = r7.equals(r9)
            if (r6 == 0) goto L_0x00fd
            if (r8 == 0) goto L_0x00e8
            boolean r8 = android.webkit.URLUtil.isValidUrl(r5)
            if (r8 == 0) goto L_0x00fd
        L_0x00e8:
            if (r7 == 0) goto L_0x00ed
            if (r5 != 0) goto L_0x00ed
            goto L_0x00fd
        L_0x00ed:
            r4.mo35107a(r6)
            r1.f14896e = r5
            java.lang.String r2 = "creativeView"
            java.util.List r2 = r6.mo35093a((java.lang.String) r2)
            r1.mo34878a((java.util.List<com.inmobi.media.C5922cf>) r2)
            goto L_0x000a
        L_0x00fd:
            java.util.List r1 = r4.mo35111e()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x010a
            m17670a((com.inmobi.media.C5923cg) r3)
        L_0x010a:
            java.lang.String r1 = "UNKNOWN"
            r2.f15018z = r1
            goto L_0x000a
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17691h():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:39|40|41|42|(2:44|45)(1:46)|47|(1:49)|50|51|52|(1:54)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0151 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0240 A[Catch:{ JSONException -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x029a A[Catch:{ JSONException -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a2 A[Catch:{ JSONException -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ JSONException -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[Catch:{ JSONException -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[Catch:{ JSONException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011a A[Catch:{ JSONException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0157 A[Catch:{ JSONException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0172 A[Catch:{ JSONException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0199 A[Catch:{ JSONException -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a8 A[Catch:{ JSONException -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c3 A[Catch:{ JSONException -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x023c A[Catch:{ JSONException -> 0x02ab }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17693i() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "fallbackUrl"
            java.lang.String r2 = "action"
            java.lang.String r3 = "pages"
            java.lang.String r4 = "openMode"
            java.lang.String r5 = "itemUrl"
            java.lang.String r6 = "onClick"
            java.lang.String r7 = "adContent"
            java.lang.String r8 = "passThroughJson"
            java.lang.String r9 = "orientation"
            org.json.JSONObject r10 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r11 = "styleRefs"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ JSONException -> 0x02ab }
            r1.f14948o = r10     // Catch:{ JSONException -> 0x02ab }
            org.json.JSONObject r10 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            boolean r10 = r10.isNull(r9)     // Catch:{ JSONException -> 0x02ab }
            r12 = 2
            r13 = 1
            r14 = 0
            if (r10 == 0) goto L_0x002b
        L_0x0029:
            r9 = r14
            goto L_0x0077
        L_0x002b:
            org.json.JSONObject r10 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r9 = r10.getString(r9)     // Catch:{ JSONException -> 0x02ab }
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r9 = r9.trim()     // Catch:{ JSONException -> 0x02ab }
            int r10 = r9.hashCode()     // Catch:{ JSONException -> 0x02ab }
            r15 = -1626174665(0xffffffff9f128b37, float:-3.103186E-20)
            r11 = 3
            if (r10 == r15) goto L_0x0064
            r15 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r10 == r15) goto L_0x005a
            r15 = 1430647483(0x5545f2bb, float:1.36028944E13)
            if (r10 == r15) goto L_0x0050
            goto L_0x006e
        L_0x0050:
            java.lang.String r10 = "landscape"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x02ab }
            if (r9 == 0) goto L_0x006e
            r9 = r11
            goto L_0x006f
        L_0x005a:
            java.lang.String r10 = "portrait"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x02ab }
            if (r9 == 0) goto L_0x006e
            r9 = r12
            goto L_0x006f
        L_0x0064:
            java.lang.String r10 = "unspecified"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x02ab }
            if (r9 == 0) goto L_0x006e
            r9 = r13
            goto L_0x006f
        L_0x006e:
            r9 = -1
        L_0x006f:
            if (r9 == r12) goto L_0x0076
            if (r9 == r11) goto L_0x0074
            goto L_0x0029
        L_0x0074:
            r9 = r12
            goto L_0x0077
        L_0x0076:
            r9 = r13
        L_0x0077:
            r1.f14935a = r9     // Catch:{ JSONException -> 0x02ab }
            org.json.JSONObject r9 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r10 = "shouldAutoOpenLandingPage"
            boolean r9 = r9.optBoolean(r10, r13)     // Catch:{ JSONException -> 0x02ab }
            r1.f14944j = r9     // Catch:{ JSONException -> 0x02ab }
            org.json.JSONObject r9 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r10 = "disableBackButton"
            boolean r9 = r9.optBoolean(r10, r14)     // Catch:{ JSONException -> 0x02ab }
            r1.f14936b = r9     // Catch:{ JSONException -> 0x02ab }
            org.json.JSONObject r9 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r10 = "rootContainer"
            org.json.JSONObject r9 = r9.getJSONObject(r10)     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r10 = "CONTAINER"
            java.lang.String r11 = "/rootContainer"
            com.inmobi.media.bt r9 = r1.m17663a((org.json.JSONObject) r9, (java.lang.String) r10, (java.lang.String) r11)     // Catch:{ JSONException -> 0x02ab }
            com.inmobi.media.bv r9 = (com.inmobi.media.C5903bv) r9     // Catch:{ JSONException -> 0x02ab }
            r1.f14938d = r9     // Catch:{ JSONException -> 0x02ab }
            org.json.JSONObject r9 = r1.f14947n     // Catch:{ JSONException -> 0x0180 }
            boolean r9 = r9.isNull(r8)     // Catch:{ JSONException -> 0x0180 }
            if (r9 != 0) goto L_0x00b3
            com.inmobi.media.bx$a r9 = r1.f14943i     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r10 = r1.f14947n     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r8 = r10.getJSONObject(r8)     // Catch:{ JSONException -> 0x0180 }
            r9.f14955a = r8     // Catch:{ JSONException -> 0x0180 }
        L_0x00b3:
            org.json.JSONObject r8 = r1.f14947n     // Catch:{ JSONException -> 0x0180 }
            boolean r8 = r8.isNull(r7)     // Catch:{ JSONException -> 0x0180 }
            if (r8 != 0) goto L_0x010d
            org.json.JSONObject r8 = r1.f14947n     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r7 = r8.getJSONObject(r7)     // Catch:{ JSONException -> 0x0180 }
            if (r7 == 0) goto L_0x010d
            com.inmobi.media.bx$a$a r8 = new com.inmobi.media.bx$a$a     // Catch:{ JSONException -> 0x0180 }
            com.inmobi.media.bx$a r9 = r1.f14943i     // Catch:{ JSONException -> 0x0180 }
            java.util.Objects.requireNonNull(r9)     // Catch:{ JSONException -> 0x0180 }
            r8.<init>()     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "title"
            r10 = 0
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f14959a = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "description"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f14960b = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "ctaText"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f14962d = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "iconUrl"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f14961c = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "rating"
            r12 = 0
            long r12 = r7.optLong(r9, r12)     // Catch:{ JSONException -> 0x0180 }
            float r9 = (float) r12     // Catch:{ JSONException -> 0x0180 }
            r8.f14963e = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "landingPageUrl"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f14964f = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "isApp"
            boolean r7 = r7.optBoolean(r9)     // Catch:{ JSONException -> 0x0180 }
            r8.f14965g = r7     // Catch:{ JSONException -> 0x0180 }
            com.inmobi.media.bx$a r7 = r1.f14943i     // Catch:{ JSONException -> 0x0180 }
            r7.f14956b = r8     // Catch:{ JSONException -> 0x0180 }
        L_0x010d:
            com.inmobi.media.bt r7 = new com.inmobi.media.bt     // Catch:{ JSONException -> 0x0180 }
            r7.<init>()     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r8 = r1.f14947n     // Catch:{ JSONException -> 0x0180 }
            boolean r8 = r8.isNull(r6)     // Catch:{ JSONException -> 0x0180 }
            if (r8 != 0) goto L_0x0168
            org.json.JSONObject r8 = r1.f14947n     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r6 = r8.getJSONObject(r6)     // Catch:{ JSONException -> 0x0180 }
            boolean r8 = r6.isNull(r5)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x012e
            java.lang.String r5 = r6.getString(r5)     // Catch:{ JSONException -> 0x0151 }
            r8 = 1
            goto L_0x0130
        L_0x012e:
            r5 = r9
            r8 = r14
        L_0x0130:
            boolean r10 = r6.isNull(r2)     // Catch:{ JSONException -> 0x0151 }
            if (r10 != 0) goto L_0x013b
            java.lang.String r9 = r6.getString(r2)     // Catch:{ JSONException -> 0x0151 }
            r8 = 1
        L_0x013b:
            r7.mo34876a((java.lang.String) r5)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r2 = r6.optString(r0)     // Catch:{ JSONException -> 0x0151 }
            r7.mo34879b(r2)     // Catch:{ JSONException -> 0x0151 }
            r7.f14901j = r9     // Catch:{ JSONException -> 0x0151 }
            r7.f14899h = r8     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r2 = "appBundleId"
            java.lang.String r2 = r6.optString(r2)     // Catch:{ JSONException -> 0x0151 }
            r7.f14914w = r2     // Catch:{ JSONException -> 0x0151 }
        L_0x0151:
            boolean r2 = r6.isNull(r4)     // Catch:{ JSONException -> 0x0180 }
            if (r2 != 0) goto L_0x0168
            java.lang.String r2 = r6.getString(r4)     // Catch:{ JSONException -> 0x0180 }
            byte r2 = m17679d((java.lang.String) r2)     // Catch:{ JSONException -> 0x0180 }
            r7.f14900i = r2     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x0180 }
            r7.mo34879b(r0)     // Catch:{ JSONException -> 0x0180 }
        L_0x0168:
            org.json.JSONObject r0 = r1.f14947n     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r2 = "trackers"
            boolean r0 = r0.isNull(r2)     // Catch:{ JSONException -> 0x0180 }
            if (r0 != 0) goto L_0x017b
            org.json.JSONObject r0 = r1.f14947n     // Catch:{ JSONException -> 0x0180 }
            java.util.List r0 = m17676b((org.json.JSONObject) r0)     // Catch:{ JSONException -> 0x0180 }
            r7.mo34878a((java.util.List<com.inmobi.media.C5922cf>) r0)     // Catch:{ JSONException -> 0x0180 }
        L_0x017b:
            com.inmobi.media.bx$a r0 = r1.f14943i     // Catch:{ JSONException -> 0x0180 }
            r0.f14957c = r7     // Catch:{ JSONException -> 0x0180 }
            goto L_0x018d
        L_0x0180:
            r0 = move-exception
            com.inmobi.media.gg r2 = com.inmobi.media.C6181gg.m18398a()     // Catch:{ JSONException -> 0x02ab }
            com.inmobi.media.hg r4 = new com.inmobi.media.hg     // Catch:{ JSONException -> 0x02ab }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x02ab }
            r2.mo35357a((com.inmobi.media.C6217hg) r4)     // Catch:{ JSONException -> 0x02ab }
        L_0x018d:
            r1.f14937c = r14     // Catch:{ JSONException -> 0x02ab }
            org.json.JSONObject r0 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r2 = "rewards"
            boolean r0 = r0.has(r2)     // Catch:{ JSONException -> 0x02ab }
            if (r0 == 0) goto L_0x01a0
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x02ab }
            r0.<init>()     // Catch:{ JSONException -> 0x02ab }
            r1.f14941g = r0     // Catch:{ JSONException -> 0x02ab }
        L_0x01a0:
            org.json.JSONObject r0 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            java.util.Map r0 = com.inmobi.media.C5838au.m17399b((org.json.JSONObject) r0)     // Catch:{ JSONException -> 0x02ab }
            if (r0 == 0) goto L_0x01ad
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f14941g     // Catch:{ JSONException -> 0x02ab }
            r2.putAll(r0)     // Catch:{ JSONException -> 0x02ab }
        L_0x01ad:
            r16.m17688g()     // Catch:{ JSONException -> 0x02ab }
            r16.m17691h()     // Catch:{ JSONException -> 0x02ab }
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f14951r     // Catch:{ JSONException -> 0x02ab }
            java.util.Set r0 = r0.entrySet()     // Catch:{ JSONException -> 0x02ab }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x02ab }
        L_0x01bd:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x02ab }
            if (r0 == 0) goto L_0x0292
            java.lang.Object r0 = r2.next()     // Catch:{ JSONException -> 0x02ab }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ JSONException -> 0x02ab }
            java.lang.Object r4 = r0.getValue()     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x02ab }
            java.util.Map<java.lang.String, com.inmobi.media.bt> r5 = r1.f14950q     // Catch:{ JSONException -> 0x02ab }
            java.lang.Object r0 = r0.getKey()     // Catch:{ JSONException -> 0x02ab }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ JSONException -> 0x02ab }
            r5 = r0
            com.inmobi.media.bt r5 = (com.inmobi.media.C5901bt) r5     // Catch:{ JSONException -> 0x02ab }
            if (r5 == 0) goto L_0x028d
            byte r0 = r5.f14905n     // Catch:{ JSONException -> 0x02ab }
            r6 = 4
            if (r6 != r0) goto L_0x028d
            int r0 = r5.f14906o     // Catch:{ JSONException -> 0x02ab }
            r7 = -1
            if (r0 != r7) goto L_0x01f1
            int r0 = r5.f14907p     // Catch:{ JSONException -> 0x02ab }
            if (r0 == r7) goto L_0x01ed
            goto L_0x01f1
        L_0x01ed:
            r13 = r7
            r7 = 1
            r9 = 2
            goto L_0x01bd
        L_0x01f1:
            java.util.Map<java.lang.String, com.inmobi.media.bt> r0 = r1.f14950q     // Catch:{ JSONException -> 0x02ab }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ JSONException -> 0x02ab }
            r4 = r0
            com.inmobi.media.bt r4 = (com.inmobi.media.C5901bt) r4     // Catch:{ JSONException -> 0x02ab }
            if (r4 == 0) goto L_0x028d
            java.lang.String r0 = "VIDEO"
            java.lang.String r7 = r4.f14893b     // Catch:{ JSONException -> 0x02ab }
            boolean r0 = r0.equals(r7)     // Catch:{ JSONException -> 0x02ab }
            if (r0 == 0) goto L_0x028d
            r0 = r4
            com.inmobi.media.cg r0 = (com.inmobi.media.C5923cg) r0     // Catch:{ JSONException -> 0x02ab }
            com.inmobi.media.dt r0 = r0.mo34920b()     // Catch:{ JSONException -> 0x02ab }
            com.inmobi.media.ds r0 = (com.inmobi.media.C6000ds) r0     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r0 = r0.f15260b     // Catch:{ JSONException -> 0x02ab }
            java.lang.String r7 = ":"
            java.lang.String[] r0 = r0.split(r7)     // Catch:{ JSONException -> 0x02ab }
            r7 = 1
            r8 = r0[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x022b }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x022b }
            int r8 = r8 * 60
            r9 = 2
            r0 = r0[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0229 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0229 }
            int r8 = r8 + r0
            goto L_0x023a
        L_0x0229:
            r0 = move-exception
            goto L_0x022d
        L_0x022b:
            r0 = move-exception
            r9 = 2
        L_0x022d:
            com.inmobi.media.gg r8 = com.inmobi.media.C6181gg.m18398a()     // Catch:{ JSONException -> 0x02ab }
            com.inmobi.media.hg r10 = new com.inmobi.media.hg     // Catch:{ JSONException -> 0x02ab }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x02ab }
            r8.mo35357a((com.inmobi.media.C6217hg) r10)     // Catch:{ JSONException -> 0x02ab }
            r8 = r14
        L_0x023a:
            if (r8 != 0) goto L_0x0240
            r5.f14906o = r14     // Catch:{ JSONException -> 0x02ab }
            r13 = -1
            goto L_0x0284
        L_0x0240:
            int r0 = r5.f14906o     // Catch:{ JSONException -> 0x02ab }
            r10 = 100
            r11 = 75
            r12 = 50
            r13 = -1
            if (r0 == r13) goto L_0x0265
            if (r0 == 0) goto L_0x0265
            if (r0 == r12) goto L_0x0261
            if (r0 == r11) goto L_0x025b
            if (r0 == r10) goto L_0x0258
            int r0 = r8 / 4
            r5.f14906o = r0     // Catch:{ JSONException -> 0x02ab }
            goto L_0x0265
        L_0x0258:
            r5.f14906o = r8     // Catch:{ JSONException -> 0x02ab }
            goto L_0x0265
        L_0x025b:
            int r0 = r8 * 3
            int r0 = r0 / r6
            r5.f14906o = r0     // Catch:{ JSONException -> 0x02ab }
            goto L_0x0265
        L_0x0261:
            int r0 = r8 / 2
            r5.f14906o = r0     // Catch:{ JSONException -> 0x02ab }
        L_0x0265:
            int r0 = r5.f14907p     // Catch:{ JSONException -> 0x02ab }
            r13 = -1
            if (r0 == r13) goto L_0x0284
            if (r0 == 0) goto L_0x0284
            if (r0 == r12) goto L_0x0280
            if (r0 == r11) goto L_0x027a
            if (r0 == r10) goto L_0x0277
            int r8 = r8 / 4
            r5.f14907p = r8     // Catch:{ JSONException -> 0x02ab }
            goto L_0x0284
        L_0x0277:
            r5.f14907p = r8     // Catch:{ JSONException -> 0x02ab }
            goto L_0x0284
        L_0x027a:
            int r8 = r8 * 3
            int r8 = r8 / r6
            r5.f14907p = r8     // Catch:{ JSONException -> 0x02ab }
            goto L_0x0284
        L_0x0280:
            int r8 = r8 / 2
            r5.f14907p = r8     // Catch:{ JSONException -> 0x02ab }
        L_0x0284:
            com.inmobi.media.cg r4 = (com.inmobi.media.C5923cg) r4     // Catch:{ JSONException -> 0x02ab }
            java.util.List<com.inmobi.media.bt> r0 = r4.f15015z     // Catch:{ JSONException -> 0x02ab }
            r0.add(r5)     // Catch:{ JSONException -> 0x02ab }
            goto L_0x01bd
        L_0x028d:
            r7 = 1
            r9 = 2
            r13 = -1
            goto L_0x01bd
        L_0x0292:
            org.json.JSONObject r0 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            boolean r0 = r0.isNull(r3)     // Catch:{ JSONException -> 0x02ab }
            if (r0 == 0) goto L_0x02a2
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02ab }
            r0.<init>()     // Catch:{ JSONException -> 0x02ab }
            r1.f14939e = r0     // Catch:{ JSONException -> 0x02ab }
            return
        L_0x02a2:
            org.json.JSONObject r0 = r1.f14947n     // Catch:{ JSONException -> 0x02ab }
            org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x02ab }
            r1.f14939e = r0     // Catch:{ JSONException -> 0x02ab }
            return
        L_0x02ab:
            r0 = move-exception
            com.inmobi.media.gg r2 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r3 = new com.inmobi.media.hg
            r3.<init>(r0)
            r2.mo35357a((com.inmobi.media.C6217hg) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17693i():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte m17659a(java.lang.String r5) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r5 = r5.trim()
            int r0 = r5.hashCode()
            r1 = -1412832500(0xffffffffabc9e30c, float:-1.4344927E-12)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0032
            if (r0 == 0) goto L_0x0028
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x001e
            goto L_0x003c
        L_0x001e:
            java.lang.String r0 = "video"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003c
            r5 = r3
            goto L_0x003d
        L_0x0028:
            java.lang.String r0 = ""
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003c
            r5 = r4
            goto L_0x003d
        L_0x0032:
            java.lang.String r0 = "companion"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003c
            r5 = r2
            goto L_0x003d
        L_0x003c:
            r5 = -1
        L_0x003d:
            if (r5 == r4) goto L_0x0046
            if (r5 == r3) goto L_0x0046
            if (r5 == r2) goto L_0x0045
            r5 = 0
            return r5
        L_0x0045:
            return r3
        L_0x0046:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17659a(java.lang.String):byte");
    }

    /* renamed from: d */
    public final boolean mo34900d() {
        if (this.f14938d == null) {
            return false;
        }
        if (m17683f() == null) {
            return m17695j();
        }
        if (mo34898c() <= 0) {
            return false;
        }
        return m17695j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m17695j() {
        /*
            r5 = this;
            java.lang.String r0 = "VIDEO"
            java.util.List r0 = r5.mo34899c((java.lang.String) r0)
            r1 = 1
            if (r0 == 0) goto L_0x0062
            int r2 = r0.size()
            if (r2 > 0) goto L_0x0010
            goto L_0x0062
        L_0x0010:
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()
            com.inmobi.media.bt r2 = (com.inmobi.media.C5901bt) r2
            java.lang.String r3 = r2.f14892a
            r3.length()
            com.inmobi.media.cg r2 = (com.inmobi.media.C5923cg) r2
            com.inmobi.media.dt r3 = r2.mo34920b()
            r4 = 0
            if (r3 != 0) goto L_0x002f
            return r4
        L_0x002f:
            com.inmobi.media.dt r3 = r2.mo34920b()
            java.util.List r3 = r3.mo35109c()
            if (r3 == 0) goto L_0x0061
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0040
            goto L_0x0061
        L_0x0040:
            com.inmobi.media.dt r3 = r2.mo34920b()
            java.lang.String r3 = r3.mo35108b()
            if (r3 == 0) goto L_0x0050
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0014
        L_0x0050:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "[ERRORCODE]"
            java.lang.String r3 = "403"
            r0.put(r1, r3)
            java.lang.String r1 = "error"
            r2.mo34877a((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.String>) r0)
        L_0x0061:
            return r4
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17695j():boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: com.inmobi.media.cd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: com.inmobi.media.ch} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: com.inmobi.media.cg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: com.inmobi.media.bw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: com.inmobi.media.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: com.inmobi.media.cg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: com.inmobi.media.bw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: com.inmobi.media.bw} */
    /* JADX WARNING: type inference failed for: r2v21, types: [com.inmobi.media.cb, com.inmobi.media.bt] */
    /* JADX WARNING: type inference failed for: r1v20, types: [com.inmobi.media.bz, com.inmobi.media.bt] */
    /* JADX WARNING: type inference failed for: r0v48, types: [com.inmobi.media.bt] */
    /* JADX WARNING: type inference failed for: r2v55, types: [com.inmobi.media.bt] */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: type inference failed for: r2v58, types: [com.inmobi.media.bt] */
    /* JADX WARNING: type inference failed for: r6v88, types: [com.inmobi.media.bt] */
    /* JADX WARNING: type inference failed for: r6v89, types: [com.inmobi.media.bt] */
    /* JADX WARNING: type inference failed for: r8v30, types: [com.inmobi.media.by] */
    /* JADX WARNING: type inference failed for: r8v31, types: [com.inmobi.media.ca] */
    /* JADX WARNING: type inference failed for: r8v32, types: [com.inmobi.media.by] */
    /* JADX WARNING: type inference failed for: r8v33, types: [com.inmobi.media.ca] */
    /* JADX WARNING: type inference failed for: r2v61 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r1 = m17679d(r15.getJSONObject("assetOnclick").getString("openMode"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a1, code lost:
        r6 = r46;
        r26 = r12;
        r32 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a8, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r2 = r15.getJSONObject("assetOnclick").optString("fallbackUrl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b1, code lost:
        if (r18 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b7, code lost:
        if (r18.size() != 0) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01bc, code lost:
        r8 = r8;
        r7 = r25;
        r6 = r24;
        r4 = r12;
        r5 = r49;
        r32 = r13;
        r14 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r8 = new com.inmobi.media.C5905bw(r12, r10, r0, r27, r18, r14, r47);
        r15 = r1;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01d5, code lost:
        r5 = r49;
        r4 = r12;
        r32 = r13;
        r6 = r24;
        r7 = r25;
        r8 = new com.inmobi.media.C5905bw(r4, r10, r0, r27, r1, r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01eb, code lost:
        r3.f14898g = r5;
        m17669a((com.inmobi.media.C5901bt) r3, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01f0, code lost:
        if (r2 == null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f2, code lost:
        r3.mo34879b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f5, code lost:
        r21 = r3;
        r26 = r4;
        r44 = r6;
        r43 = r7;
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0201, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0202, code lost:
        r26 = r4;
        r44 = r6;
        r43 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x020a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x020b, code lost:
        r32 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x020e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x020f, code lost:
        r32 = r19;
        r31 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0213, code lost:
        r6 = r46;
        r26 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0219, code lost:
        r32 = r19;
        r31 = r20;
        r6 = r46;
        r26 = r12;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0223, code lost:
        r44 = r24;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0225, code lost:
        r43 = r25;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0229, code lost:
        r1 = r46;
        r14 = r49;
        r13 = r12;
        r32 = r19;
        r31 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r1.f14949p.get(r28);
        r33 = new com.inmobi.media.C5923cg.C5924a(r2.x, r2.y, r3.x, r3.y, r4.x, r4.y, r5.x, r5.y, m17704s(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x026a, code lost:
        if (r1.f14942h != null) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x026c, code lost:
        r2 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r0 = m17667a(r15, r27, (com.inmobi.media.C5901bt) r2);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0275, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0276, code lost:
        r44 = r6;
        r43 = r7;
        r26 = r13;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x027f, code lost:
        r2 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r0 = r1.f14942h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0283, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0286, code lost:
        r24 = r6;
        r25 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0296, code lost:
        if (r1.f14953t != 0) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0298, code lost:
        if (r2 == 0) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02a8, code lost:
        if (((java.lang.Boolean) r2.f14913v.get("didRequestFullScreen")).booleanValue() != false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02ac, code lost:
        if (r1.f14954u == false) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02af, code lost:
        r17 = r10;
        r0 = Integer.MAX_VALUE;
        r3 = 0;
        r4 = false;
        r5 = true;
        r6 = true;
        r7 = true;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02bd, code lost:
        r0 = r15.optBoolean("loop", false);
        r4 = r15.optBoolean("showProgress", true);
        r3 = r15.optBoolean("soundOn", true);
        r7 = r15.optBoolean("showMute", true);
        r6 = r15.optBoolean("autoPlay", true);
        r8 = r2.f15011E;
        r17 = r3;
        r16 = r4;
        r3 = (int) r15.optDouble("pauseAfter", 0.0d);
        r4 = r0;
        r0 = r8;
        r5 = r16;
        r16 = r17;
        r17 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02ed, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02ee, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02f1, code lost:
        r0 = r15.optBoolean("loop", true);
        r4 = r15.optBoolean("showProgress", false);
        r3 = r15.optBoolean("soundOn", false);
        r6 = r15.optBoolean("showMute", false);
        r7 = r15.optBoolean("autoPlay", true);
        r8 = r15.optInt("completeAfter", Integer.MAX_VALUE);
        r17 = r3;
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x031b, code lost:
        r3 = (int) r15.optDouble("pauseAfter", 0.0d);
        r4 = r0;
        r0 = r8;
        r5 = r16;
        r16 = r17;
        r17 = r10;
        r45 = r7;
        r7 = r6;
        r6 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r0 = r15.optBoolean("loop", false);
        r4 = r15.optBoolean("showProgress", true);
        r3 = r15.optBoolean("soundOn", true);
        r7 = r15.optBoolean("showMute", true);
        r6 = r15.optBoolean("autoPlay", true);
        r8 = r15.optInt("completeAfter", Integer.MAX_VALUE);
        r17 = r10;
        r16 = r3;
        r3 = (int) r15.optDouble("pauseAfter", 0.0d);
        r5 = r4;
        r4 = r0;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0358, code lost:
        r10 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0363, code lost:
        if (r15.isNull("videoViewabilityConfig") != false) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r8 = r15.getJSONObject("videoViewabilityConfig");
        r9 = r8.keys();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0373, code lost:
        if (r9.hasNext() == false) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0375, code lost:
        r20 = r9;
        r9 = r9.next();
        r10.put(r9, r8.get(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0386, code lost:
        r14 = r49;
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0393, code lost:
        r8 = r8;
        r20 = r1.f14952s.rendering.enablePubMuteControl;
        r1 = r10;
        r26 = r13;
        r27 = r2;
        r23 = r3;
        r2 = r8;
        r3 = r49;
        r14 = r7;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r8 = new com.inmobi.media.C5923cg(r13, r17, r33, r12, r16, r14, r4, r5, r6, r18, r47, r20);
        r2.f15013G = new java.util.HashMap(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03bb, code lost:
        if (r0 > 0) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03bd, code lost:
        r7 = Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c0, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c1, code lost:
        r2.f15011E = r7;
        r2.f14898g = r3;
        r6 = r27;
        r2.f14916y = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c9, code lost:
        if (r6 == null) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03cb, code lost:
        r6.f14916y = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03cd, code lost:
        if (r23 == 0) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03cf, code lost:
        r2.f15012F = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d3, code lost:
        r6 = r46;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d9, code lost:
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03db, code lost:
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03df, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e0, code lost:
        r44 = r6;
        r43 = r7;
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03e8, code lost:
        r17 = r10;
        r26 = r12;
        r32 = r19;
        r31 = r20;
        r0 = r27;
        r10 = r3;
        r3 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f6, code lost:
        if (r0 != null) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f9, code lost:
        r9 = com.inmobi.media.C5925ch.m17729c(m17690h(r47));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0407, code lost:
        if ("URL".equals(r9) == false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x040d, code lost:
        if (android.webkit.URLUtil.isValidUrl(r0) != false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x040f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0410, code lost:
        r13 = r46;
        r12 = r3;
        r7 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r1 = new com.inmobi.media.C5925ch(r26, r17, m17664a(r2, r10, r4, r5, r8), r0, r15.optBoolean("isScrollable"));
        r1.f15018z = r9;
        r1.f14898g = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0439, code lost:
        if (r15.optBoolean("preload", false) == false) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x043b, code lost:
        r1.f15016A = true;
        r13.f14945k = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0440, code lost:
        r44 = r7;
        r1 = r1;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0446, code lost:
        r44 = r7;
        r21 = r1;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x044d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x044e, code lost:
        r44 = r7;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0453, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0454, code lost:
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0458, code lost:
        r13 = r46;
        r17 = r10;
        r26 = r12;
        r32 = r19;
        r31 = r20;
        r14 = 0;
        r12 = r49;
        r43 = r25;
        r10 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        r1 = m17664a(r2, r3, r4, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0479, code lost:
        if (m17701p(r47) == false) goto L_0x04a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0483, code lost:
        if (r15.getJSONObject("assetOnclick").isNull("openMode") != false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0485, code lost:
        r2 = m17679d(r15.getJSONObject("assetOnclick").getString("openMode"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0492, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0493, code lost:
        r3 = r15.getJSONObject("assetOnclick").optString("fallbackUrl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x049b, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x049d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04a0, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04a2, code lost:
        if (r18 == null) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04a8, code lost:
        if (r18.size() != 0) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04b1, code lost:
        if (com.facebook.share.internal.ShareConstants.IMAGE_URL.equals(r48) == false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04b9, code lost:
        r8 = r8;
        r6 = r10;
        r4 = r12;
        r2 = r13;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        r8 = new com.inmobi.media.C5913ca(r26, r17, r1, m17678c(r47), r18, r14, r47);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04cc, code lost:
        r6 = r10;
        r4 = r12;
        r2 = r13;
        r5 = r15;
        r8 = new com.inmobi.media.C5910by(r26, r17, r1, m17678c(r47), r18, r14, r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04e4, code lost:
        r6 = r10;
        r4 = r12;
        r2 = r13;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ee, code lost:
        if (com.facebook.share.internal.ShareConstants.IMAGE_URL.equals(r48) == false) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04f0, code lost:
        r8 = new com.inmobi.media.C5913ca(r26, r17, r1, m17678c(r47), r14, r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0503, code lost:
        r8 = new com.inmobi.media.C5910by(r26, r17, r1, m17678c(r47), r14, r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0515, code lost:
        r0.f14898g = r4;
        m17669a((com.inmobi.media.C5901bt) r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x051a, code lost:
        if (r3 == null) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x051c, code lost:
        r0.mo34879b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x051f, code lost:
        r1 = r0;
        r44 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0525, code lost:
        r21 = r0;
        r44 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x052c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x052d, code lost:
        r44 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x052f, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0532, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0533, code lost:
        r7 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0535, code lost:
        r44 = r10;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x053a, code lost:
        r11 = r49;
        r17 = r10;
        r26 = r12;
        r7 = r14;
        r9 = r15;
        r32 = r19;
        r31 = r20;
        r43 = r25;
        r15 = r46;
        r10 = r3;
        r12 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        r0 = m17664a(r2, r3, r4, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x055c, code lost:
        if (r9.has("startOffset") == false) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x055e, code lost:
        r1 = r15.m17702q(r9.getJSONObject("startOffset"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0569, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0571, code lost:
        if (r9.has("timerDuration") == false) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0573, code lost:
        r2 = r15.m17702q(r9.getJSONObject("timerDuration"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x057e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0580, code lost:
        r3 = r9.optBoolean("displayTimer", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x058e, code lost:
        r13 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        r1 = new com.inmobi.media.C5918cd(r13, r17, r0, new com.inmobi.media.C5916cc(r1, r2));
        r1.f14983z = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x059d, code lost:
        if (r9.has("assetOnFinish") == false) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x059f, code lost:
        r0 = (org.json.JSONObject) r9.get("assetOnFinish");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05ad, code lost:
        if (r0.has("action") == false) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05af, code lost:
        r0 = r0.getString("action").toUpperCase(java.util.Locale.US).trim();
        r2 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05c6, code lost:
        if (r2 == 2142494) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05cb, code lost:
        if (r2 == 2402104) goto L_0x05ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05d4, code lost:
        if (r0.equals("NONE") == false) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05d6, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05de, code lost:
        if (r0.equals("EXIT") == false) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05e0, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05e2, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05e5, code lost:
        if (r0 == 2) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05e7, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05e9, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05ea, code lost:
        r1.f14902k = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05ec, code lost:
        r1.f14898g = r11;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05ef, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05f0, code lost:
        r44 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05f4, code lost:
        r6 = r10;
        r13 = r12;
        r7 = r14;
        r9 = r15;
        r32 = r19;
        r31 = r20;
        r12 = r24;
        r43 = r25;
        r15 = r46;
        r10 = r3;
        r1 = new com.inmobi.media.C5911bz(r13, r6, m17664a(r2, r3, r4, r5, r8), m17678c(r47));
        r1.f14898g = r49;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0619, code lost:
        r15 = r46;
        r13 = r12;
        r7 = r14;
        r32 = r19;
        r31 = r20;
        r12 = r24;
        r43 = r25;
        r14 = r10;
        r10 = r3;
        r2 = new com.inmobi.media.C5914cb(r13, r14, m17675b(r2, r3, r4, r5, r8), r27);
        r2.f14898g = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0639, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x063a, code lost:
        r44 = r12;
        r26 = r13;
        r6 = r15;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0641, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0642, code lost:
        r44 = r12;
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0646, code lost:
        r6 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0649, code lost:
        r16 = r10;
        r26 = r12;
        r32 = r19;
        r31 = r20;
        r44 = r24;
        r43 = r25;
        r12 = r28;
        r10 = r3;
        r3 = r15;
        r15 = r46;
        r15 = r3;
        r19 = "CONTAINER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:?, code lost:
        r1 = m17664a(r2, r10, r4, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x066d, code lost:
        if (m17701p(r47) == false) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0677, code lost:
        if (r15.getJSONObject("assetOnclick").isNull("openMode") != false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0679, code lost:
        r2 = m17679d(r15.getJSONObject("assetOnclick").getString("openMode"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0686, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0687, code lost:
        r3 = r15.getJSONObject("assetOnclick").optString("fallbackUrl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0690, code lost:
        r2 = 0;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0699, code lost:
        if (r8.has("transitionEffect") == false) goto L_0x06d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x069b, code lost:
        r4 = r8.getString("transitionEffect").trim();
        r5 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06ac, code lost:
        if (r5 == 3151468) goto L_0x06bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06b1, code lost:
        if (r5 == 106426293) goto L_0x06b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06ba, code lost:
        if (r4.equals("paged") == false) goto L_0x06ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06bc, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06c5, code lost:
        if (r4.equals("free") == false) goto L_0x06ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06c7, code lost:
        r4 = 2;
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06ca, code lost:
        r6 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06cc, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06cd, code lost:
        if (r6 == r4) goto L_0x06d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06d0, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06d3, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06d4, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06d5, code lost:
        if (r18 == null) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06db, code lost:
        if (r18.size() != 0) goto L_0x06de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06e0, code lost:
        r8 = r8;
        r17 = r29;
        r20 = r30;
        r23 = r12;
        r12 = r18;
        r18 = r4;
        r4 = r13;
        r13 = r2;
        r2 = r46;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        r8 = new com.inmobi.media.C5903bv(r26, r16, r1, r12, r13, r47, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06fe, code lost:
        r15 = 0;
        r1 = r8;
        r6 = r2;
        r2 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0704, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0707, code lost:
        r6 = r46;
        r18 = r4;
        r23 = r12;
        r4 = r13;
        r7 = r15;
        r17 = r29;
        r20 = r30;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        r2 = r49;
        r1 = new com.inmobi.media.C5903bv(r26, r16, r1, r2, r47, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0728, code lost:
        r1.f14898g = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x072a, code lost:
        if (r3 == null) goto L_0x072f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x072c, code lost:
        r1.mo34879b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x072f, code lost:
        m17669a((com.inmobi.media.C5901bt) r1, r7);
        r3 = r7.getJSONArray("assetValue");
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x073d, code lost:
        if (r5 >= r3.length()) goto L_0x0851;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x073f, code lost:
        r7 = r2 + ".assetValue[" + r5 + "]";
        r8 = r3.getJSONObject(r5);
        r9 = m17685f(r8).toLowerCase(java.util.Locale.US).trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x076e, code lost:
        switch(r9.hashCode()) {
            case -938102371: goto L_0x07d1;
            case -410956671: goto L_0x07c7;
            case 98832: goto L_0x07bd;
            case 102340: goto L_0x07b2;
            case 3226745: goto L_0x07a7;
            case 3556653: goto L_0x079d;
            case 100313435: goto L_0x0793;
            case 110364485: goto L_0x0788;
            case 112202875: goto L_0x077e;
            case 1224424441: goto L_0x0773;
            default: goto L_0x0771;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0779, code lost:
        if (r9.equals("webview") == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x077b, code lost:
        r9 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0784, code lost:
        if (r9.equals("video") == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0786, code lost:
        r9 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x078e, code lost:
        if (r9.equals("timer") == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0790, code lost:
        r9 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0799, code lost:
        if (r9.equals("image") == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x079b, code lost:
        r9 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07a3, code lost:
        if (r9.equals("text") == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x07a5, code lost:
        r9 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07ad, code lost:
        if (r9.equals(com.mbridge.msdk.foundation.entity.RewardPlus.ICON) == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07af, code lost:
        r9 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x07b8, code lost:
        if (r9.equals("gif") == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x07ba, code lost:
        r9 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x07c3, code lost:
        if (r9.equals(com.facebook.gamingservices.cloudgaming.internal.SDKConstants.PARAM_GAME_REQUESTS_CTA) == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x07c5, code lost:
        r9 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07cd, code lost:
        if (r9.equals(com.google.android.exoplayer2.text.ttml.TtmlNode.RUBY_CONTAINER) == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x07cf, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07d7, code lost:
        if (r9.equals(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_STAR) == false) goto L_0x07db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x07d9, code lost:
        r9 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07db, code lost:
        r9 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07dd, code lost:
        switch(r9) {
            case 2: goto L_0x07f7;
            case 3: goto L_0x07f5;
            case 4: goto L_0x07f2;
            case 5: goto L_0x07ef;
            case 6: goto L_0x07ec;
            case 7: goto L_0x07e9;
            case 8: goto L_0x07e6;
            case 9: goto L_0x07e3;
            case 10: goto L_0x07e1;
            default: goto L_0x07e0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07e1, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07e3, code lost:
        r13 = "WEBVIEW";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07e6, code lost:
        r13 = "TIMER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x07e9, code lost:
        r13 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07ec, code lost:
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07ef, code lost:
        r13 = "TEXT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07f2, code lost:
        r13 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07f5, code lost:
        r13 = com.facebook.share.internal.ShareConstants.IMAGE_URL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x07f7, code lost:
        r13 = "ICON";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07fa, code lost:
        r13 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07fc, code lost:
        r8 = r6.m17663a(r8, r13, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0800, code lost:
        if (r8 == null) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0802, code lost:
        r8.f14898g = r7;
        r8.f14911t = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x080a, code lost:
        if (r1.f14930C >= 16) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0811, code lost:
        if (r1.f14930C != r1.f14929B.length) goto L_0x0823;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0813, code lost:
        r7 = new com.inmobi.media.C5901bt[(r1.f14929B.length * 2)];
        java.lang.System.arraycopy(r1.f14929B, r15, r7, r15, r1.f14930C);
        r1.f14929B = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0823, code lost:
        r7 = r1.f14929B;
        r9 = r1.f14930C;
        r1.f14930C = r9 + 1;
        r7[r9] = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x082d, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0831, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0833, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0834, code lost:
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x014b, code lost:
        r28 = com.facebook.share.internal.ShareConstants.VIDEO_URL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015c, code lost:
        r29 = "RATING";
        r30 = "CTA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0166, code lost:
        switch(r1) {
            case 0: goto L_0x0649;
            case 1: goto L_0x0619;
            case 2: goto L_0x05f4;
            case 3: goto L_0x053a;
            case 4: goto L_0x0458;
            case 5: goto L_0x0458;
            case 6: goto L_0x03e8;
            case 7: goto L_0x0229;
            case 8: goto L_0x0219;
            case 9: goto L_0x0177;
            default: goto L_0x0169;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0169, code lost:
        r6 = r46;
        r26 = r12;
        r32 = r19;
        r31 = r20;
        r44 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0173, code lost:
        r43 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x017b, code lost:
        if (m17701p(r47) != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017e, code lost:
        r13 = r19;
        r31 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r0 = m17677c(r2, r3, r4, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0191, code lost:
        if (r15.getJSONObject("assetOnclick").isNull("openMode") != false) goto L_0x01a8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0853  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1 A[Catch:{ JSONException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9 A[Catch:{ JSONException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0103 A[Catch:{ JSONException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010b A[Catch:{ JSONException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0117 A[Catch:{ JSONException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0132 A[Catch:{ JSONException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013a A[Catch:{ JSONException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0143 A[Catch:{ JSONException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014e A[Catch:{ JSONException -> 0x0123 }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.inmobi.media.C5901bt m17663a(org.json.JSONObject r47, java.lang.String r48, java.lang.String r49) {
        /*
            r46 = this;
            r7 = r46
            r15 = r47
            r14 = r48
            r13 = r49
            java.lang.String r12 = m17680d((org.json.JSONObject) r47)
            java.lang.String r10 = m17682e((org.json.JSONObject) r47)
            org.json.JSONObject r8 = r46.m17692i(r47)
            boolean r0 = m17673a((org.json.JSONObject) r8, (java.lang.String) r14)
            r21 = 0
            if (r0 != 0) goto L_0x001d
            return r21
        L_0x001d:
            android.graphics.Point r2 = r46.m17694j(r47)
            android.graphics.Point r4 = r7.m17661a((org.json.JSONObject) r15, (android.graphics.Point) r2)
            android.graphics.Point r3 = r46.m17696k(r47)
            android.graphics.Point r5 = r7.m17674b(r15, r3)
            java.util.List r18 = m17676b((org.json.JSONObject) r47)
            byte r11 = m17697l(r47)
            r9 = 1
            int r6 = m17660a((org.json.JSONObject) r15, (boolean) r9)
            r1 = 0
            int r9 = m17660a((org.json.JSONObject) r15, (boolean) r1)
            java.lang.String r1 = m17698m(r47)
            java.lang.String r0 = m17687g((org.json.JSONObject) r47)
            java.lang.String r0 = r0.trim()
            r19 = r1
            int r1 = r0.hashCode()
            r20 = r6
            r6 = -925155509(0xffffffffc8db3f4b, float:-449018.34)
            r22 = -1
            r13 = 2
            if (r1 == r6) goto L_0x006b
            r6 = 1728122231(0x67010d77, float:6.0943366E23)
            if (r1 == r6) goto L_0x0061
            goto L_0x0075
        L_0x0061:
            java.lang.String r1 = "absolute"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0075
            r0 = 1
            goto L_0x0077
        L_0x006b:
            java.lang.String r1 = "reference"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0075
            r0 = r13
            goto L_0x0077
        L_0x0075:
            r0 = r22
        L_0x0077:
            if (r0 == r13) goto L_0x007b
            r0 = 0
            goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            org.json.JSONArray r1 = m17700o(r47)
            if (r1 == 0) goto L_0x00c7
            int r6 = r1.length()
            if (r6 == 0) goto L_0x00c7
            r6 = 0
            java.lang.String r1 = r1.getString(r6)     // Catch:{ JSONException -> 0x00b2 }
            boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00ae }
            if (r6 == 0) goto L_0x0094
            return r21
        L_0x0094:
            r6 = 1
            if (r0 != r6) goto L_0x00aa
            com.inmobi.media.bt r6 = r7.mo34896b((java.lang.String) r1)     // Catch:{ JSONException -> 0x00ae }
            if (r6 != 0) goto L_0x00ac
            com.inmobi.media.bx r0 = r7.f14940f     // Catch:{ JSONException -> 0x00a8 }
            if (r0 == 0) goto L_0x00ac
            com.inmobi.media.bx r0 = r7.f14940f     // Catch:{ JSONException -> 0x00a8 }
            com.inmobi.media.bt r6 = r0.mo34896b((java.lang.String) r1)     // Catch:{ JSONException -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            goto L_0x00b6
        L_0x00aa:
            r6 = r21
        L_0x00ac:
            r0 = r1
            goto L_0x00ca
        L_0x00ae:
            r0 = move-exception
            r6 = r21
            goto L_0x00b6
        L_0x00b2:
            r0 = move-exception
            r1 = r21
            r6 = r1
        L_0x00b6:
            com.inmobi.media.gg r13 = com.inmobi.media.C6181gg.m18398a()
            r24 = r1
            com.inmobi.media.hg r1 = new com.inmobi.media.hg
            r1.<init>(r0)
            r13.mo35357a((com.inmobi.media.C6217hg) r1)
            r0 = r24
            goto L_0x00ca
        L_0x00c7:
            r0 = r21
            r6 = r0
        L_0x00ca:
            int r1 = r48.hashCode()     // Catch:{ JSONException -> 0x0837 }
            java.lang.String r13 = "GIF"
            r24 = r11
            java.lang.String r11 = "CTA"
            r25 = r9
            java.lang.String r9 = "RATING"
            r26 = r6
            java.lang.String r6 = "CONTAINER"
            java.lang.String r7 = "VIDEO"
            r27 = r0
            java.lang.String r0 = "IMAGE"
            switch(r1) {
                case -1919329183: goto L_0x014e;
                case -1884772963: goto L_0x0143;
                case 67056: goto L_0x013a;
                case 70564: goto L_0x0132;
                case 2241657: goto L_0x0117;
                case 2571565: goto L_0x010b;
                case 69775675: goto L_0x0103;
                case 79826725: goto L_0x00f9;
                case 81665115: goto L_0x00f1;
                case 1942407129: goto L_0x00e7;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            goto L_0x0158
        L_0x00e7:
            java.lang.String r1 = "WEBVIEW"
            boolean r1 = r14.equals(r1)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r1 = 6
            goto L_0x014b
        L_0x00f1:
            boolean r1 = r14.equals(r7)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r1 = 7
            goto L_0x014b
        L_0x00f9:
            java.lang.String r1 = "TIMER"
            boolean r1 = r14.equals(r1)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r1 = 3
            goto L_0x014b
        L_0x0103:
            boolean r1 = r14.equals(r0)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r1 = 4
            goto L_0x014b
        L_0x010b:
            java.lang.String r1 = "TEXT"
            boolean r1 = r14.equals(r1)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r28 = r7
            r1 = 1
            goto L_0x015c
        L_0x0117:
            java.lang.String r1 = "ICON"
            boolean r1 = r14.equals(r1)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r28 = r7
            r1 = 2
            goto L_0x015c
        L_0x0123:
            r0 = move-exception
            r6 = r46
            r26 = r12
            r32 = r19
            r31 = r20
        L_0x012c:
            r44 = r24
        L_0x012e:
            r43 = r25
            goto L_0x0843
        L_0x0132:
            boolean r1 = r14.equals(r13)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r1 = 5
            goto L_0x014b
        L_0x013a:
            boolean r1 = r14.equals(r11)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r1 = 9
            goto L_0x014b
        L_0x0143:
            boolean r1 = r14.equals(r9)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r1 = 8
        L_0x014b:
            r28 = r7
            goto L_0x015c
        L_0x014e:
            boolean r1 = r14.equals(r6)     // Catch:{ JSONException -> 0x0123 }
            if (r1 == 0) goto L_0x0158
            r28 = r7
            r1 = 0
            goto L_0x015c
        L_0x0158:
            r28 = r7
            r1 = r22
        L_0x015c:
            java.lang.String r7 = "fallbackUrl"
            r29 = r9
            java.lang.String r9 = "openMode"
            r30 = r11
            java.lang.String r11 = "assetOnclick"
            switch(r1) {
                case 0: goto L_0x0649;
                case 1: goto L_0x0619;
                case 2: goto L_0x05f4;
                case 3: goto L_0x053a;
                case 4: goto L_0x0458;
                case 5: goto L_0x0458;
                case 6: goto L_0x03e8;
                case 7: goto L_0x0229;
                case 8: goto L_0x0219;
                case 9: goto L_0x0177;
                default: goto L_0x0169;
            }
        L_0x0169:
            r6 = r46
            r26 = r12
            r32 = r19
            r31 = r20
            r44 = r24
        L_0x0173:
            r43 = r25
            goto L_0x084f
        L_0x0177:
            boolean r0 = m17701p(r47)     // Catch:{ JSONException -> 0x020e }
            if (r0 != 0) goto L_0x017e
            return r21
        L_0x017e:
            r13 = r19
            r1 = r46
            r31 = r20
            r6 = r8
            com.inmobi.media.cb$a r0 = r1.m17677c(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x020a }
            org.json.JSONObject r1 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x020a }
            boolean r1 = r1.isNull(r9)     // Catch:{ JSONException -> 0x020a }
            if (r1 != 0) goto L_0x01a8
            org.json.JSONObject r1 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x01a0 }
            java.lang.String r1 = r1.getString(r9)     // Catch:{ JSONException -> 0x01a0 }
            byte r1 = m17679d((java.lang.String) r1)     // Catch:{ JSONException -> 0x01a0 }
            goto L_0x01a9
        L_0x01a0:
            r0 = move-exception
            r6 = r46
            r26 = r12
            r32 = r13
            goto L_0x012c
        L_0x01a8:
            r1 = 2
        L_0x01a9:
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x020a }
            java.lang.String r2 = r2.optString(r7)     // Catch:{ JSONException -> 0x020a }
            if (r18 == 0) goto L_0x01d5
            int r3 = r18.size()     // Catch:{ JSONException -> 0x020a }
            if (r3 != 0) goto L_0x01ba
            goto L_0x01d5
        L_0x01ba:
            com.inmobi.media.bw r3 = new com.inmobi.media.bw     // Catch:{ JSONException -> 0x020a }
            r8 = r3
            r7 = r25
            r9 = r12
            r6 = r24
            r11 = r0
            r4 = r12
            r12 = r27
            r5 = r49
            r32 = r13
            r13 = r18
            r14 = r1
            r1 = r15
            r15 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x0201 }
            r15 = r1
            goto L_0x01eb
        L_0x01d5:
            r5 = r49
            r4 = r12
            r32 = r13
            r6 = r24
            r7 = r25
            com.inmobi.media.bw r3 = new com.inmobi.media.bw     // Catch:{ JSONException -> 0x0201 }
            r8 = r3
            r9 = r4
            r11 = r0
            r12 = r27
            r13 = r1
            r14 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0201 }
        L_0x01eb:
            r3.f14898g = r5     // Catch:{ JSONException -> 0x0201 }
            m17669a((com.inmobi.media.C5901bt) r3, (org.json.JSONObject) r15)     // Catch:{ JSONException -> 0x0201 }
            if (r2 == 0) goto L_0x01f5
            r3.mo34879b(r2)     // Catch:{ JSONException -> 0x0201 }
        L_0x01f5:
            r21 = r3
            r26 = r4
            r44 = r6
            r43 = r7
            r6 = r46
            goto L_0x084f
        L_0x0201:
            r0 = move-exception
            r26 = r4
            r44 = r6
            r43 = r7
            goto L_0x0834
        L_0x020a:
            r0 = move-exception
            r32 = r13
            goto L_0x0213
        L_0x020e:
            r0 = move-exception
            r32 = r19
            r31 = r20
        L_0x0213:
            r6 = r46
            r26 = r12
            goto L_0x012c
        L_0x0219:
            r32 = r19
            r31 = r20
            r6 = r46
            r26 = r12
            r1 = r21
        L_0x0223:
            r44 = r24
        L_0x0225:
            r43 = r25
            goto L_0x0851
        L_0x0229:
            r1 = r46
            r14 = r49
            r13 = r12
            r32 = r19
            r31 = r20
            r6 = r24
            r7 = r25
            r12 = r28
            java.util.Map<java.lang.String, java.util.List<com.inmobi.media.bt>> r0 = r1.f14949p     // Catch:{ JSONException -> 0x03df }
            r0.get(r12)     // Catch:{ JSONException -> 0x03df }
            com.inmobi.media.cc r42 = r1.m17704s(r8)     // Catch:{ JSONException -> 0x03df }
            com.inmobi.media.cg$a r11 = new com.inmobi.media.cg$a     // Catch:{ JSONException -> 0x03df }
            int r0 = r2.x     // Catch:{ JSONException -> 0x03df }
            int r2 = r2.y     // Catch:{ JSONException -> 0x03df }
            int r8 = r3.x     // Catch:{ JSONException -> 0x03df }
            int r3 = r3.y     // Catch:{ JSONException -> 0x03df }
            int r9 = r4.x     // Catch:{ JSONException -> 0x03df }
            int r4 = r4.y     // Catch:{ JSONException -> 0x03df }
            int r12 = r5.x     // Catch:{ JSONException -> 0x03df }
            int r5 = r5.y     // Catch:{ JSONException -> 0x03df }
            r33 = r11
            r34 = r0
            r35 = r2
            r36 = r8
            r37 = r3
            r38 = r9
            r39 = r4
            r40 = r12
            r41 = r5
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ JSONException -> 0x03df }
            com.inmobi.media.ds r0 = r1.f14942h     // Catch:{ JSONException -> 0x03df }
            if (r0 != 0) goto L_0x027f
            r2 = r26
            r0 = r27
            com.inmobi.media.dt r0 = r1.m17667a((org.json.JSONObject) r15, (java.lang.String) r0, (com.inmobi.media.C5901bt) r2)     // Catch:{ JSONException -> 0x0275 }
            goto L_0x0283
        L_0x0275:
            r0 = move-exception
            r44 = r6
            r43 = r7
            r26 = r13
            r6 = r1
            goto L_0x0843
        L_0x027f:
            r2 = r26
            com.inmobi.media.ds r0 = r1.f14942h     // Catch:{ JSONException -> 0x03df }
        L_0x0283:
            r12 = r0
            int r0 = r1.f14953t     // Catch:{ JSONException -> 0x03df }
            java.lang.String r5 = "pauseAfter"
            java.lang.String r8 = "autoPlay"
            java.lang.String r9 = "showMute"
            java.lang.String r3 = "soundOn"
            java.lang.String r4 = "showProgress"
            r24 = r6
            java.lang.String r6 = "loop"
            r25 = r7
            if (r0 != 0) goto L_0x032a
            if (r2 == 0) goto L_0x02f1
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f14913v     // Catch:{ JSONException -> 0x02ed }
            java.lang.String r7 = "didRequestFullScreen"
            java.lang.Object r0 = r0.get(r7)     // Catch:{ JSONException -> 0x02ed }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02ed }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02ed }
            if (r0 != 0) goto L_0x02bd
            boolean r0 = r1.f14954u     // Catch:{ JSONException -> 0x02ed }
            if (r0 == 0) goto L_0x02af
            goto L_0x02bd
        L_0x02af:
            r17 = r10
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 1
            r7 = 1
            r16 = 1
            goto L_0x0358
        L_0x02bd:
            r7 = 0
            boolean r0 = r15.optBoolean(r6, r7)     // Catch:{ JSONException -> 0x02ed }
            r6 = 1
            boolean r4 = r15.optBoolean(r4, r6)     // Catch:{ JSONException -> 0x02ed }
            boolean r3 = r15.optBoolean(r3, r6)     // Catch:{ JSONException -> 0x02ed }
            boolean r7 = r15.optBoolean(r9, r6)     // Catch:{ JSONException -> 0x02ed }
            boolean r6 = r15.optBoolean(r8, r6)     // Catch:{ JSONException -> 0x02ed }
            r8 = r2
            com.inmobi.media.cg r8 = (com.inmobi.media.C5923cg) r8     // Catch:{ JSONException -> 0x02ed }
            int r8 = r8.f15011E     // Catch:{ JSONException -> 0x02ed }
            r17 = r3
            r16 = r4
            r3 = 0
            double r3 = r15.optDouble(r5, r3)     // Catch:{ JSONException -> 0x02ed }
            int r3 = (int) r3     // Catch:{ JSONException -> 0x02ed }
            r4 = r0
            r0 = r8
            r5 = r16
            r16 = r17
            r17 = r10
            goto L_0x0358
        L_0x02ed:
            r0 = move-exception
            r6 = r1
            goto L_0x03db
        L_0x02f1:
            r7 = 1
            boolean r0 = r15.optBoolean(r6, r7)     // Catch:{ JSONException -> 0x02ed }
            r6 = 0
            boolean r4 = r15.optBoolean(r4, r6)     // Catch:{ JSONException -> 0x02ed }
            boolean r3 = r15.optBoolean(r3, r6)     // Catch:{ JSONException -> 0x02ed }
            boolean r6 = r15.optBoolean(r9, r6)     // Catch:{ JSONException -> 0x02ed }
            r7 = 1
            boolean r7 = r15.optBoolean(r8, r7)     // Catch:{ JSONException -> 0x02ed }
            java.lang.String r8 = "completeAfter"
            r9 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r15.optInt(r8, r9)     // Catch:{ JSONException -> 0x02ed }
            r17 = r3
            r16 = r4
            r3 = 0
            double r3 = r15.optDouble(r5, r3)     // Catch:{ JSONException -> 0x02ed }
            int r3 = (int) r3
            r4 = r0
            r0 = r8
            r5 = r16
            r16 = r17
            r17 = r10
            r45 = r7
            r7 = r6
            r6 = r45
            goto L_0x0358
        L_0x032a:
            r7 = 0
            boolean r0 = r15.optBoolean(r6, r7)     // Catch:{ JSONException -> 0x03d8 }
            r6 = 1
            boolean r4 = r15.optBoolean(r4, r6)     // Catch:{ JSONException -> 0x03d8 }
            boolean r3 = r15.optBoolean(r3, r6)     // Catch:{ JSONException -> 0x03d8 }
            boolean r7 = r15.optBoolean(r9, r6)     // Catch:{ JSONException -> 0x03d8 }
            boolean r6 = r15.optBoolean(r8, r6)     // Catch:{ JSONException -> 0x03d8 }
            java.lang.String r8 = "completeAfter"
            r9 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r15.optInt(r8, r9)     // Catch:{ JSONException -> 0x03d8 }
            r17 = r10
            r9 = 0
            double r9 = r15.optDouble(r5, r9)     // Catch:{ JSONException -> 0x03d8 }
            int r5 = (int) r9     // Catch:{ JSONException -> 0x03d8 }
            r16 = r3
            r3 = r5
            r5 = r4
            r4 = r0
            r0 = r8
        L_0x0358:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ JSONException -> 0x03d8 }
            r10.<init>()     // Catch:{ JSONException -> 0x03d8 }
            java.lang.String r8 = "videoViewabilityConfig"
            boolean r8 = r15.isNull(r8)     // Catch:{ JSONException -> 0x03d8 }
            if (r8 != 0) goto L_0x038b
            java.lang.String r8 = "videoViewabilityConfig"
            org.json.JSONObject r8 = r15.getJSONObject(r8)     // Catch:{ JSONException -> 0x02ed }
            java.util.Iterator r9 = r8.keys()     // Catch:{ JSONException -> 0x02ed }
        L_0x036f:
            boolean r19 = r9.hasNext()     // Catch:{ JSONException -> 0x02ed }
            if (r19 == 0) goto L_0x038b
            java.lang.Object r19 = r9.next()     // Catch:{ JSONException -> 0x02ed }
            r20 = r9
            r9 = r19
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x02ed }
            java.lang.Object r14 = r8.get(r9)     // Catch:{ JSONException -> 0x02ed }
            r10.put(r9, r14)     // Catch:{ JSONException -> 0x02ed }
            r14 = r49
            r9 = r20
            goto L_0x036f
        L_0x038b:
            com.inmobi.media.cg r14 = new com.inmobi.media.cg     // Catch:{ JSONException -> 0x03d8 }
            com.inmobi.media.fq r8 = r1.f14952s     // Catch:{ JSONException -> 0x03d8 }
            com.inmobi.media.fq$i r8 = r8.rendering     // Catch:{ JSONException -> 0x03d8 }
            boolean r9 = r8.enablePubMuteControl     // Catch:{ JSONException -> 0x03d8 }
            r8 = r14
            r20 = r9
            r22 = 2147483647(0x7fffffff, float:NaN)
            r9 = r13
            r1 = r10
            r10 = r17
            r26 = r13
            r13 = r16
            r27 = r2
            r23 = r3
            r2 = r14
            r3 = r49
            r14 = r7
            r7 = r15
            r15 = r4
            r16 = r5
            r17 = r6
            r19 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ JSONException -> 0x0453 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ JSONException -> 0x0453 }
            r4.<init>(r1)     // Catch:{ JSONException -> 0x0453 }
            r2.f15013G = r4     // Catch:{ JSONException -> 0x0453 }
            if (r0 > 0) goto L_0x03c0
            r7 = r22
            goto L_0x03c1
        L_0x03c0:
            r7 = r0
        L_0x03c1:
            r2.f15011E = r7     // Catch:{ JSONException -> 0x0453 }
            r2.f14898g = r3     // Catch:{ JSONException -> 0x0453 }
            r6 = r27
            r2.f14916y = r6     // Catch:{ JSONException -> 0x0453 }
            if (r6 == 0) goto L_0x03cd
            r6.f14916y = r2     // Catch:{ JSONException -> 0x0453 }
        L_0x03cd:
            if (r23 == 0) goto L_0x03d3
            r3 = r23
            r2.f15012F = r3     // Catch:{ JSONException -> 0x0453 }
        L_0x03d3:
            r6 = r46
            r1 = r2
            goto L_0x0223
        L_0x03d8:
            r0 = move-exception
            r6 = r46
        L_0x03db:
            r26 = r13
            goto L_0x012c
        L_0x03df:
            r0 = move-exception
            r44 = r6
            r43 = r7
            r26 = r13
            goto L_0x0834
        L_0x03e8:
            r17 = r10
            r26 = r12
            r32 = r19
            r31 = r20
            r0 = r27
            r7 = 0
            r10 = r3
            r3 = r49
            if (r0 != 0) goto L_0x03f9
            return r21
        L_0x03f9:
            java.lang.String r1 = m17690h((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x0453 }
            java.lang.String r9 = com.inmobi.media.C5925ch.m17729c(r1)     // Catch:{ JSONException -> 0x0453 }
            java.lang.String r1 = "URL"
            boolean r1 = r1.equals(r9)     // Catch:{ JSONException -> 0x0453 }
            if (r1 == 0) goto L_0x0410
            boolean r1 = android.webkit.URLUtil.isValidUrl(r0)     // Catch:{ JSONException -> 0x0453 }
            if (r1 != 0) goto L_0x0410
            return r21
        L_0x0410:
            r13 = r46
            r14 = r7
            r1 = r46
            r12 = r3
            r3 = r10
            r7 = r24
            r6 = r8
            com.inmobi.media.bu r4 = r1.m17664a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x044d }
            com.inmobi.media.ch r8 = new com.inmobi.media.ch     // Catch:{ JSONException -> 0x044d }
            java.lang.String r1 = "isScrollable"
            boolean r6 = r15.optBoolean(r1)     // Catch:{ JSONException -> 0x044d }
            r1 = r8
            r2 = r26
            r3 = r17
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x044d }
            r8.f15018z = r9     // Catch:{ JSONException -> 0x044d }
            r8.f14898g = r12     // Catch:{ JSONException -> 0x044d }
            java.lang.String r0 = "preload"
            boolean r0 = r15.optBoolean(r0, r14)     // Catch:{ JSONException -> 0x044d }
            if (r0 == 0) goto L_0x0446
            r1 = 1
            r8.f15016A = r1     // Catch:{ JSONException -> 0x044d }
            r13.f14945k = r8     // Catch:{ JSONException -> 0x044d }
            r44 = r7
            r1 = r8
            r6 = r13
            goto L_0x0225
        L_0x0446:
            r44 = r7
            r21 = r8
            r6 = r13
            goto L_0x0173
        L_0x044d:
            r0 = move-exception
            r44 = r7
            r6 = r13
            goto L_0x012e
        L_0x0453:
            r0 = move-exception
            r6 = r46
            goto L_0x012c
        L_0x0458:
            r13 = r46
            r17 = r10
            r26 = r12
            r32 = r19
            r31 = r20
            r6 = r24
            r14 = 0
            r12 = r49
            r10 = r3
            r3 = r25
            r1 = r46
            r43 = r3
            r3 = r10
            r10 = r6
            r6 = r8
            com.inmobi.media.bu r1 = r1.m17664a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x0532 }
            boolean r2 = m17701p(r47)     // Catch:{ JSONException -> 0x0532 }
            if (r2 == 0) goto L_0x04a0
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x049d }
            boolean r2 = r2.isNull(r9)     // Catch:{ JSONException -> 0x049d }
            if (r2 != 0) goto L_0x0492
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x049d }
            java.lang.String r2 = r2.getString(r9)     // Catch:{ JSONException -> 0x049d }
            byte r2 = m17679d((java.lang.String) r2)     // Catch:{ JSONException -> 0x049d }
            goto L_0x0493
        L_0x0492:
            r2 = 2
        L_0x0493:
            org.json.JSONObject r3 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x049d }
            java.lang.String r3 = r3.optString(r7)     // Catch:{ JSONException -> 0x049d }
            r14 = r2
            goto L_0x04a2
        L_0x049d:
            r0 = move-exception
            goto L_0x0535
        L_0x04a0:
            r3 = r21
        L_0x04a2:
            if (r18 == 0) goto L_0x04e4
            int r2 = r18.size()     // Catch:{ JSONException -> 0x0532 }
            if (r2 != 0) goto L_0x04ab
            goto L_0x04e4
        L_0x04ab:
            r7 = r48
            boolean r0 = r0.equals(r7)     // Catch:{ JSONException -> 0x049d }
            if (r0 == 0) goto L_0x04cc
            com.inmobi.media.ca r0 = new com.inmobi.media.ca     // Catch:{ JSONException -> 0x049d }
            java.lang.String r2 = m17678c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x049d }
            r8 = r0
            r9 = r26
            r6 = r10
            r10 = r17
            r11 = r1
            r4 = r12
            r12 = r2
            r2 = r13
            r13 = r18
            r5 = r15
            r15 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x052c }
            goto L_0x0515
        L_0x04cc:
            r6 = r10
            r4 = r12
            r2 = r13
            r5 = r15
            com.inmobi.media.by r0 = new com.inmobi.media.by     // Catch:{ JSONException -> 0x052c }
            java.lang.String r12 = m17678c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x052c }
            r8 = r0
            r9 = r26
            r10 = r17
            r11 = r1
            r13 = r18
            r15 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x052c }
            goto L_0x0515
        L_0x04e4:
            r7 = r48
            r6 = r10
            r4 = r12
            r2 = r13
            r5 = r15
            boolean r0 = r0.equals(r7)     // Catch:{ JSONException -> 0x052c }
            if (r0 == 0) goto L_0x0503
            com.inmobi.media.ca r0 = new com.inmobi.media.ca     // Catch:{ JSONException -> 0x052c }
            java.lang.String r12 = m17678c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x052c }
            r8 = r0
            r9 = r26
            r10 = r17
            r11 = r1
            r13 = r14
            r14 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x052c }
            goto L_0x0515
        L_0x0503:
            com.inmobi.media.by r0 = new com.inmobi.media.by     // Catch:{ JSONException -> 0x052c }
            java.lang.String r12 = m17678c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x052c }
            r8 = r0
            r9 = r26
            r10 = r17
            r11 = r1
            r13 = r14
            r14 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x052c }
        L_0x0515:
            r0.f14898g = r4     // Catch:{ JSONException -> 0x052c }
            m17669a((com.inmobi.media.C5901bt) r0, (org.json.JSONObject) r5)     // Catch:{ JSONException -> 0x052c }
            if (r3 == 0) goto L_0x0525
            r0.mo34879b(r3)     // Catch:{ JSONException -> 0x052c }
            r1 = r0
            r44 = r6
            r6 = r2
            goto L_0x0851
        L_0x0525:
            r21 = r0
            r44 = r6
            r6 = r2
            goto L_0x084f
        L_0x052c:
            r0 = move-exception
            r44 = r6
        L_0x052f:
            r6 = r2
            goto L_0x0843
        L_0x0532:
            r0 = move-exception
            r7 = r48
        L_0x0535:
            r44 = r10
            r6 = r13
            goto L_0x0843
        L_0x053a:
            r11 = r49
            r17 = r10
            r26 = r12
            r7 = r14
            r9 = r15
            r32 = r19
            r31 = r20
            r6 = r24
            r43 = r25
            r14 = 0
            r15 = r46
            r10 = r3
            r1 = r46
            r12 = r6
            r6 = r8
            com.inmobi.media.bu r0 = r1.m17664a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x05ef }
            java.lang.String r1 = "startOffset"
            boolean r1 = r9.has(r1)     // Catch:{ JSONException -> 0x05ef }
            if (r1 == 0) goto L_0x0569
            java.lang.String r1 = "startOffset"
            org.json.JSONObject r1 = r9.getJSONObject(r1)     // Catch:{ JSONException -> 0x05ef }
            com.inmobi.media.cc$a r1 = r15.m17702q(r1)     // Catch:{ JSONException -> 0x05ef }
            goto L_0x056b
        L_0x0569:
            r1 = r21
        L_0x056b:
            java.lang.String r2 = "timerDuration"
            boolean r2 = r9.has(r2)     // Catch:{ JSONException -> 0x05ef }
            if (r2 == 0) goto L_0x057e
            java.lang.String r2 = "timerDuration"
            org.json.JSONObject r2 = r9.getJSONObject(r2)     // Catch:{ JSONException -> 0x05ef }
            com.inmobi.media.cc$a r2 = r15.m17702q(r2)     // Catch:{ JSONException -> 0x05ef }
            goto L_0x0580
        L_0x057e:
            r2 = r21
        L_0x0580:
            java.lang.String r3 = "displayTimer"
            r4 = 1
            boolean r3 = r9.optBoolean(r3, r4)     // Catch:{ JSONException -> 0x05ef }
            com.inmobi.media.cc r5 = new com.inmobi.media.cc     // Catch:{ JSONException -> 0x05ef }
            r5.<init>(r1, r2)     // Catch:{ JSONException -> 0x05ef }
            com.inmobi.media.cd r1 = new com.inmobi.media.cd     // Catch:{ JSONException -> 0x05ef }
            r6 = r17
            r13 = r26
            r1.<init>(r13, r6, r0, r5)     // Catch:{ JSONException -> 0x0641 }
            r1.f14983z = r3     // Catch:{ JSONException -> 0x0641 }
            java.lang.String r0 = "assetOnFinish"
            boolean r0 = r9.has(r0)     // Catch:{ JSONException -> 0x0641 }
            if (r0 == 0) goto L_0x05ec
            java.lang.String r0 = "assetOnFinish"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ JSONException -> 0x0641 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0641 }
            java.lang.String r2 = "action"
            boolean r2 = r0.has(r2)     // Catch:{ JSONException -> 0x0641 }
            if (r2 == 0) goto L_0x05ec
            java.lang.String r2 = "action"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0641 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ JSONException -> 0x0641 }
            java.lang.String r0 = r0.toUpperCase(r2)     // Catch:{ JSONException -> 0x0641 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x0641 }
            int r2 = r0.hashCode()     // Catch:{ JSONException -> 0x0641 }
            r3 = 2142494(0x20b11e, float:3.002274E-39)
            if (r2 == r3) goto L_0x05d8
            r3 = 2402104(0x24a738, float:3.366065E-39)
            if (r2 == r3) goto L_0x05ce
            goto L_0x05e2
        L_0x05ce:
            java.lang.String r2 = "NONE"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x0641 }
            if (r0 == 0) goto L_0x05e2
            r0 = r4
            goto L_0x05e4
        L_0x05d8:
            java.lang.String r2 = "EXIT"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x0641 }
            if (r0 == 0) goto L_0x05e2
            r0 = 2
            goto L_0x05e4
        L_0x05e2:
            r0 = r22
        L_0x05e4:
            r2 = 2
            if (r0 == r2) goto L_0x05e9
            r9 = r14
            goto L_0x05ea
        L_0x05e9:
            r9 = r4
        L_0x05ea:
            r1.f14902k = r9     // Catch:{ JSONException -> 0x0641 }
        L_0x05ec:
            r1.f14898g = r11     // Catch:{ JSONException -> 0x0641 }
            goto L_0x063a
        L_0x05ef:
            r0 = move-exception
            r44 = r12
            goto L_0x0646
        L_0x05f4:
            r11 = r49
            r6 = r10
            r13 = r12
            r7 = r14
            r9 = r15
            r32 = r19
            r31 = r20
            r12 = r24
            r43 = r25
            r15 = r46
            r10 = r3
            r1 = r46
            r14 = r6
            r6 = r8
            com.inmobi.media.bu r0 = r1.m17664a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x0641 }
            com.inmobi.media.bz r1 = new com.inmobi.media.bz     // Catch:{ JSONException -> 0x0641 }
            java.lang.String r2 = m17678c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x0641 }
            r1.<init>(r13, r14, r0, r2)     // Catch:{ JSONException -> 0x0641 }
            r1.f14898g = r11     // Catch:{ JSONException -> 0x0641 }
            goto L_0x063a
        L_0x0619:
            r15 = r46
            r11 = r49
            r13 = r12
            r7 = r14
            r32 = r19
            r31 = r20
            r12 = r24
            r43 = r25
            r0 = r27
            r14 = r10
            r10 = r3
            r1 = r46
            r6 = r8
            com.inmobi.media.cb$a r1 = r1.m17675b(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x0641 }
            com.inmobi.media.cb r2 = new com.inmobi.media.cb     // Catch:{ JSONException -> 0x0641 }
            r2.<init>(r13, r14, r1, r0)     // Catch:{ JSONException -> 0x0641 }
            r2.f14898g = r11     // Catch:{ JSONException -> 0x0641 }
            r1 = r2
        L_0x063a:
            r44 = r12
            r26 = r13
            r6 = r15
            goto L_0x0851
        L_0x0641:
            r0 = move-exception
            r44 = r12
            r26 = r13
        L_0x0646:
            r6 = r15
            goto L_0x0843
        L_0x0649:
            r16 = r10
            r26 = r12
            r32 = r19
            r31 = r20
            r44 = r24
            r43 = r25
            r12 = r28
            r14 = 0
            r17 = 1
            r10 = r3
            r3 = r15
            r15 = r46
            r1 = r46
            r15 = r3
            r3 = r10
            r19 = r6
            r6 = r8
            com.inmobi.media.bu r1 = r1.m17664a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x0833 }
            boolean r2 = m17701p(r47)     // Catch:{ JSONException -> 0x0833 }
            if (r2 == 0) goto L_0x0690
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x0833 }
            boolean r2 = r2.isNull(r9)     // Catch:{ JSONException -> 0x0833 }
            if (r2 != 0) goto L_0x0686
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x0833 }
            java.lang.String r2 = r2.getString(r9)     // Catch:{ JSONException -> 0x0833 }
            byte r2 = m17679d((java.lang.String) r2)     // Catch:{ JSONException -> 0x0833 }
            goto L_0x0687
        L_0x0686:
            r2 = 2
        L_0x0687:
            org.json.JSONObject r3 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x0833 }
            java.lang.String r3 = r3.optString(r7)     // Catch:{ JSONException -> 0x0833 }
            goto L_0x0693
        L_0x0690:
            r2 = r14
            r3 = r21
        L_0x0693:
            java.lang.String r4 = "transitionEffect"
            boolean r4 = r8.has(r4)     // Catch:{ JSONException -> 0x0833 }
            if (r4 == 0) goto L_0x06d3
            java.lang.String r4 = "transitionEffect"
            java.lang.String r4 = r8.getString(r4)     // Catch:{ JSONException -> 0x0833 }
            java.lang.String r4 = r4.trim()     // Catch:{ JSONException -> 0x0833 }
            int r5 = r4.hashCode()     // Catch:{ JSONException -> 0x0833 }
            r6 = 3151468(0x30166c, float:4.416147E-39)
            if (r5 == r6) goto L_0x06bf
            r6 = 106426293(0x657efb5, float:4.0613115E-35)
            if (r5 == r6) goto L_0x06b4
            goto L_0x06ca
        L_0x06b4:
            java.lang.String r5 = "paged"
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x0833 }
            if (r4 == 0) goto L_0x06ca
            r6 = r17
            goto L_0x06cc
        L_0x06bf:
            java.lang.String r5 = "free"
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x0833 }
            if (r4 == 0) goto L_0x06ca
            r4 = 2
            r6 = 2
            goto L_0x06cd
        L_0x06ca:
            r6 = r22
        L_0x06cc:
            r4 = 2
        L_0x06cd:
            if (r6 == r4) goto L_0x06d0
            goto L_0x06d4
        L_0x06d0:
            r5 = r17
            goto L_0x06d5
        L_0x06d3:
            r4 = 2
        L_0x06d4:
            r5 = r14
        L_0x06d5:
            if (r18 == 0) goto L_0x0707
            int r6 = r18.size()     // Catch:{ JSONException -> 0x0833 }
            if (r6 != 0) goto L_0x06de
            goto L_0x0707
        L_0x06de:
            com.inmobi.media.bv r6 = new com.inmobi.media.bv     // Catch:{ JSONException -> 0x0833 }
            r8 = r6
            r7 = r17
            r17 = r29
            r9 = r26
            r10 = r16
            r20 = r30
            r11 = r1
            r23 = r12
            r12 = r18
            r18 = r4
            r4 = r13
            r13 = r2
            r1 = r14
            r14 = r47
            r2 = r46
            r7 = r15
            r15 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x0704 }
            r15 = r1
            r1 = r6
            r6 = r2
            r2 = r49
            goto L_0x0728
        L_0x0704:
            r0 = move-exception
            goto L_0x052f
        L_0x0707:
            r6 = r46
            r18 = r4
            r23 = r12
            r4 = r13
            r7 = r15
            r17 = r29
            r20 = r30
            r15 = r14
            com.inmobi.media.bv r25 = new com.inmobi.media.bv     // Catch:{ JSONException -> 0x0831 }
            r8 = r25
            r9 = r26
            r10 = r16
            r11 = r1
            r12 = r2
            r13 = r47
            r14 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0831 }
            r2 = r49
            r1 = r25
        L_0x0728:
            r1.f14898g = r2     // Catch:{ JSONException -> 0x0831 }
            if (r3 == 0) goto L_0x072f
            r1.mo34879b(r3)     // Catch:{ JSONException -> 0x0831 }
        L_0x072f:
            m17669a((com.inmobi.media.C5901bt) r1, (org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x0831 }
            java.lang.String r3 = "assetValue"
            org.json.JSONArray r3 = r7.getJSONArray(r3)     // Catch:{ JSONException -> 0x0831 }
            r5 = r15
        L_0x0739:
            int r7 = r3.length()     // Catch:{ JSONException -> 0x0831 }
            if (r5 >= r7) goto L_0x0851
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0831 }
            r7.<init>()     // Catch:{ JSONException -> 0x0831 }
            r7.append(r2)     // Catch:{ JSONException -> 0x0831 }
            java.lang.String r8 = ".assetValue["
            r7.append(r8)     // Catch:{ JSONException -> 0x0831 }
            r7.append(r5)     // Catch:{ JSONException -> 0x0831 }
            java.lang.String r8 = "]"
            r7.append(r8)     // Catch:{ JSONException -> 0x0831 }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x0831 }
            org.json.JSONObject r8 = r3.getJSONObject(r5)     // Catch:{ JSONException -> 0x0831 }
            java.lang.String r9 = m17685f((org.json.JSONObject) r8)     // Catch:{ JSONException -> 0x0831 }
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ JSONException -> 0x0831 }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ JSONException -> 0x0831 }
            java.lang.String r9 = r9.trim()     // Catch:{ JSONException -> 0x0831 }
            int r10 = r9.hashCode()     // Catch:{ JSONException -> 0x0831 }
            switch(r10) {
                case -938102371: goto L_0x07d1;
                case -410956671: goto L_0x07c7;
                case 98832: goto L_0x07bd;
                case 102340: goto L_0x07b2;
                case 3226745: goto L_0x07a7;
                case 3556653: goto L_0x079d;
                case 100313435: goto L_0x0793;
                case 110364485: goto L_0x0788;
                case 112202875: goto L_0x077e;
                case 1224424441: goto L_0x0773;
                default: goto L_0x0771;
            }     // Catch:{ JSONException -> 0x0831 }
        L_0x0771:
            goto L_0x07db
        L_0x0773:
            java.lang.String r10 = "webview"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = 9
            goto L_0x07dd
        L_0x077e:
            java.lang.String r10 = "video"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = 4
            goto L_0x07dd
        L_0x0788:
            java.lang.String r10 = "timer"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = 8
            goto L_0x07dd
        L_0x0793:
            java.lang.String r10 = "image"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = 3
            goto L_0x07dd
        L_0x079d:
            java.lang.String r10 = "text"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = 5
            goto L_0x07dd
        L_0x07a7:
            java.lang.String r10 = "icon"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = r18
            goto L_0x07dd
        L_0x07b2:
            java.lang.String r10 = "gif"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = 10
            goto L_0x07dd
        L_0x07bd:
            java.lang.String r10 = "cta"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = 6
            goto L_0x07dd
        L_0x07c7:
            java.lang.String r10 = "container"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = 1
            goto L_0x07dd
        L_0x07d1:
            java.lang.String r10 = "rating"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0831 }
            if (r9 == 0) goto L_0x07db
            r9 = 7
            goto L_0x07dd
        L_0x07db:
            r9 = r22
        L_0x07dd:
            switch(r9) {
                case 2: goto L_0x07f7;
                case 3: goto L_0x07f5;
                case 4: goto L_0x07f2;
                case 5: goto L_0x07ef;
                case 6: goto L_0x07ec;
                case 7: goto L_0x07e9;
                case 8: goto L_0x07e6;
                case 9: goto L_0x07e3;
                case 10: goto L_0x07e1;
                default: goto L_0x07e0;
            }     // Catch:{ JSONException -> 0x0831 }
        L_0x07e0:
            goto L_0x07fa
        L_0x07e1:
            r13 = r4
            goto L_0x07fc
        L_0x07e3:
            java.lang.String r13 = "WEBVIEW"
            goto L_0x07fc
        L_0x07e6:
            java.lang.String r13 = "TIMER"
            goto L_0x07fc
        L_0x07e9:
            r13 = r17
            goto L_0x07fc
        L_0x07ec:
            r13 = r20
            goto L_0x07fc
        L_0x07ef:
            java.lang.String r13 = "TEXT"
            goto L_0x07fc
        L_0x07f2:
            r13 = r23
            goto L_0x07fc
        L_0x07f5:
            r13 = r0
            goto L_0x07fc
        L_0x07f7:
            java.lang.String r13 = "ICON"
            goto L_0x07fc
        L_0x07fa:
            r13 = r19
        L_0x07fc:
            com.inmobi.media.bt r8 = r6.m17663a((org.json.JSONObject) r8, (java.lang.String) r13, (java.lang.String) r7)     // Catch:{ JSONException -> 0x0831 }
            if (r8 == 0) goto L_0x082d
            r8.f14898g = r7     // Catch:{ JSONException -> 0x0831 }
            r8.f14911t = r1     // Catch:{ JSONException -> 0x0831 }
            int r7 = r1.f14930C     // Catch:{ JSONException -> 0x0831 }
            r9 = 16
            if (r7 >= r9) goto L_0x082d
            int r7 = r1.f14930C     // Catch:{ JSONException -> 0x0831 }
            com.inmobi.media.bt[] r9 = r1.f14929B     // Catch:{ JSONException -> 0x0831 }
            int r9 = r9.length     // Catch:{ JSONException -> 0x0831 }
            if (r7 != r9) goto L_0x0823
            com.inmobi.media.bt[] r7 = r1.f14929B     // Catch:{ JSONException -> 0x0831 }
            int r7 = r7.length     // Catch:{ JSONException -> 0x0831 }
            int r7 = r7 * 2
            com.inmobi.media.bt[] r7 = new com.inmobi.media.C5901bt[r7]     // Catch:{ JSONException -> 0x0831 }
            com.inmobi.media.bt[] r9 = r1.f14929B     // Catch:{ JSONException -> 0x0831 }
            int r10 = r1.f14930C     // Catch:{ JSONException -> 0x0831 }
            java.lang.System.arraycopy(r9, r15, r7, r15, r10)     // Catch:{ JSONException -> 0x0831 }
            r1.f14929B = r7     // Catch:{ JSONException -> 0x0831 }
        L_0x0823:
            com.inmobi.media.bt[] r7 = r1.f14929B     // Catch:{ JSONException -> 0x0831 }
            int r9 = r1.f14930C     // Catch:{ JSONException -> 0x0831 }
            int r10 = r9 + 1
            r1.f14930C = r10     // Catch:{ JSONException -> 0x0831 }
            r7[r9] = r8     // Catch:{ JSONException -> 0x0831 }
        L_0x082d:
            int r5 = r5 + 1
            goto L_0x0739
        L_0x0831:
            r0 = move-exception
            goto L_0x0843
        L_0x0833:
            r0 = move-exception
        L_0x0834:
            r6 = r46
            goto L_0x0843
        L_0x0837:
            r0 = move-exception
            r6 = r7
            r43 = r9
            r44 = r11
            r26 = r12
            r32 = r19
            r31 = r20
        L_0x0843:
            com.inmobi.media.gg r1 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r2 = new com.inmobi.media.hg
            r2.<init>(r0)
            r1.mo35357a((com.inmobi.media.C6217hg) r2)
        L_0x084f:
            r1 = r21
        L_0x0851:
            if (r1 == 0) goto L_0x08ab
            r2 = r44
            r1.f14905n = r2
            r2 = r31
            r1.f14906o = r2
            r2 = r43
            r1.f14907p = r2
            r2 = r32
            r1.f14908q = r2
            if (r2 == 0) goto L_0x0873
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0873
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f14951r
            r3 = r26
            r0.put(r3, r2)
            goto L_0x0875
        L_0x0873:
            r3 = r26
        L_0x0875:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0888
            java.util.Map<java.lang.String, com.inmobi.media.bt> r0 = r6.f14950q
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x0888
            java.util.Map<java.lang.String, com.inmobi.media.bt> r0 = r6.f14950q
            r0.put(r3, r1)
        L_0x0888:
            java.util.Map<java.lang.String, java.util.List<com.inmobi.media.bt>> r0 = r6.f14949p
            r2 = r48
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x089e
            java.util.Map<java.lang.String, java.util.List<com.inmobi.media.bt>> r0 = r6.f14949p
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x08ab
        L_0x089e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            java.util.Map<java.lang.String, java.util.List<com.inmobi.media.bt>> r3 = r6.f14949p
            r3.put(r2, r0)
        L_0x08ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17663a(org.json.JSONObject, java.lang.String, java.lang.String):com.inmobi.media.bt");
    }

    /* renamed from: a */
    private static void m17669a(C5901bt btVar, JSONObject jSONObject) throws JSONException {
        String str;
        boolean z;
        String str2;
        boolean z2 = true;
        String str3 = "";
        if (m17701p(jSONObject)) {
            if (!jSONObject.getJSONObject("assetOnclick").isNull("itemUrl")) {
                str2 = jSONObject.getJSONObject("assetOnclick").getString("itemUrl");
                z = true;
            } else {
                z = false;
                str2 = str3;
            }
            if (!jSONObject.getJSONObject("assetOnclick").isNull("action")) {
                str = jSONObject.getJSONObject("assetOnclick").getString("action");
                str3 = str2;
            } else {
                str = str3;
                str3 = str2;
                z2 = z;
            }
        } else {
            str = str3;
            z2 = false;
        }
        btVar.mo34876a(str3);
        btVar.f14901j = str;
        btVar.f14899h = z2;
    }

    /* renamed from: b */
    public final C5901bt mo34896b(String str) {
        if (!(str == null || str.length() == 0)) {
            if (this.f14950q.get(str) != null) {
                return this.f14950q.get(str);
            }
            C5907bx bxVar = this.f14940f;
            if (bxVar != null) {
                return bxVar.f14950q.get(str);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final List<String> mo34901e() {
        return new ArrayList(this.f14949p.keySet());
    }

    /* renamed from: c */
    public final List<C5901bt> mo34899c(String str) {
        if (this.f14949p.containsKey(str)) {
            return this.f14949p.get(str);
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    private static boolean m17673a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull("geometry")) {
            return false;
        }
        try {
            if (!m17672a(jSONObject.getJSONArray("geometry"))) {
                return false;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1919329183:
                    if (str.equals("CONTAINER")) {
                        c = 1;
                        break;
                    }
                    break;
                case 67056:
                    if (str.equals("CTA")) {
                        c = 9;
                        break;
                    }
                    break;
                case 70564:
                    if (str.equals("GIF")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2241657:
                    if (str.equals("ICON")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2571565:
                    if (str.equals("TEXT")) {
                        c = 8;
                        break;
                    }
                    break;
                case 69775675:
                    if (str.equals(ShareConstants.IMAGE_URL)) {
                        c = 3;
                        break;
                    }
                    break;
                case 79826725:
                    if (str.equals("TIMER")) {
                        c = 5;
                        break;
                    }
                    break;
                case 81665115:
                    if (str.equals(ShareConstants.VIDEO_URL)) {
                        c = 4;
                        break;
                    }
                    break;
                case 1942407129:
                    if (str.equals("WEBVIEW")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                case 8:
                case 9:
                    if (jSONObject.isNull("text")) {
                        return false;
                    }
                    try {
                        if (((int) Double.parseDouble(jSONObject.getJSONObject("text").getString("size"))) > 0) {
                            return true;
                        }
                        return false;
                    } catch (NumberFormatException e) {
                        C6181gg.m18398a().mo35357a(new C6217hg(e));
                        return false;
                    }
                default:
                    return false;
            }
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return false;
        } catch (JSONException e2) {
            C6181gg.m18398a().mo35357a(new C6217hg(e2));
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m17672a(JSONArray jSONArray) {
        try {
            int i = jSONArray.getInt(2);
            int i2 = jSONArray.getInt(3);
            if (i <= 0 || i2 <= 0) {
                return false;
            }
            return true;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return false;
        }
    }

    /* renamed from: a */
    private static C5922cf m17666a(int i, String str, JSONObject jSONObject) throws JSONException {
        String trim = jSONObject.isNull("url") ? "" : jSONObject.getString("url").trim();
        HashMap hashMap = new HashMap();
        if ("VideoImpression".equals(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray("events");
            if ((trim.length() == 0 || ((trim.startsWith("http") && !URLUtil.isValidUrl(trim)) || !trim.startsWith("http"))) && optJSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String a = C5922cf.m17725a(optJSONArray.getString(i2));
                    if ("creativeView".equals(a) || "start".equals(a) || "Impression".equals(a)) {
                        arrayList.add(a);
                    }
                }
            }
            hashMap.put("referencedEvents", arrayList);
        } else if (trim.length() == 0 || !URLUtil.isValidUrl(trim)) {
            return null;
        }
        HashMap hashMap2 = new HashMap();
        try {
            if (!jSONObject.isNull("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject2.getString(next));
                }
            }
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
        C5922cf cfVar = new C5922cf(trim, i, str, hashMap2);
        cfVar.f15006f = new HashMap(hashMap);
        return cfVar;
    }

    /* renamed from: a */
    private static List<C5922cf> m17668a(JSONObject jSONObject) {
        LinkedList linkedList = new LinkedList();
        try {
            HashMap hashMap = new HashMap();
            if (!jSONObject.isNull("macros")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("macros");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
            }
            JSONArray jSONArray = jSONObject.getJSONArray("adVerifications");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (!jSONObject3.isNull("url")) {
                    linkedList.add(new C6036em(jSONObject3.optString(Verification.VENDOR), jSONObject3.optString("verificationParams"), jSONObject3.getString("url"), "OMID_VIEWABILITY", hashMap));
                }
            }
            if (linkedList.isEmpty()) {
                linkedList.add(new C5922cf("", 0, "OMID_VIEWABILITY", hashMap));
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
        return linkedList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0159, code lost:
        if (r5 == 2) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x015b, code lost:
        if (r5 == 3) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x015e, code lost:
        if (r5 == 4) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0160, code lost:
        r15 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0162, code lost:
        r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_ERROR";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0165, code lost:
        r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0168, code lost:
        r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADING";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0156, code lost:
        r5 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0157, code lost:
        if (r5 == 1) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0187 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[Catch:{ JSONException -> 0x018d }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.inmobi.media.C5922cf> m17676b(org.json.JSONObject r17) {
        /*
            r0 = r17
            java.lang.String r1 = "uiEvent"
            java.lang.String r2 = "trackerType"
            java.lang.String r3 = "trackers"
            boolean r4 = r0.isNull(r3)
            if (r4 == 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x018d }
            int r3 = r0.length()     // Catch:{ JSONException -> 0x018d }
            if (r3 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r5 = 0
            r6 = r5
        L_0x0022:
            if (r6 >= r3) goto L_0x018c
            org.json.JSONObject r7 = r0.getJSONObject(r6)     // Catch:{ JSONException -> 0x018d }
            boolean r8 = r7.isNull(r2)     // Catch:{ JSONException -> 0x018d }
            if (r8 != 0) goto L_0x0187
            java.lang.String r8 = r7.getString(r2)     // Catch:{ JSONException -> 0x018d }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ JSONException -> 0x018d }
            java.lang.String r8 = r8.toUpperCase(r9)     // Catch:{ JSONException -> 0x018d }
            java.lang.String r8 = r8.trim()     // Catch:{ JSONException -> 0x018d }
            int r9 = r8.hashCode()     // Catch:{ JSONException -> 0x018d }
            r10 = -1430070305(0xffffffffaac2dbdf, float:-3.461389E-13)
            r12 = 3
            r13 = 2
            r14 = 1
            if (r9 == r10) goto L_0x0067
            r10 = -158113182(0xfffffffff6936262, float:-1.4946545E33)
            if (r9 == r10) goto L_0x005d
            r10 = 1110926088(0x42376308, float:45.84671)
            if (r9 == r10) goto L_0x0053
            goto L_0x0071
        L_0x0053:
            java.lang.String r9 = "URL_WEBVIEW_PING"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x018d }
            if (r8 == 0) goto L_0x0071
            r8 = r13
            goto L_0x0072
        L_0x005d:
            java.lang.String r9 = "URL_PING"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x018d }
            if (r8 == 0) goto L_0x0071
            r8 = r14
            goto L_0x0072
        L_0x0067:
            java.lang.String r9 = "HTML_SCRIPT"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x018d }
            if (r8 == 0) goto L_0x0071
            r8 = r12
            goto L_0x0072
        L_0x0071:
            r8 = -1
        L_0x0072:
            java.lang.String r9 = "url_ping"
            java.lang.String r10 = "unknown"
            if (r8 == r14) goto L_0x0084
            if (r8 == r13) goto L_0x0081
            if (r8 == r12) goto L_0x007e
            r8 = r10
            goto L_0x0085
        L_0x007e:
            java.lang.String r8 = "html_script"
            goto L_0x0085
        L_0x0081:
            java.lang.String r8 = "webview_ping"
            goto L_0x0085
        L_0x0084:
            r8 = r9
        L_0x0085:
            boolean r8 = r9.equals(r8)     // Catch:{ JSONException -> 0x018d }
            if (r8 == 0) goto L_0x0187
            java.lang.String r8 = "eventId"
            int r8 = r7.optInt(r8, r5)     // Catch:{ JSONException -> 0x018d }
            boolean r9 = r7.isNull(r1)     // Catch:{ JSONException -> 0x018d }
            if (r9 != 0) goto L_0x0187
            java.lang.String r9 = r7.getString(r1)     // Catch:{ JSONException -> 0x018d }
            java.util.Locale r15 = java.util.Locale.US     // Catch:{ JSONException -> 0x018d }
            java.lang.String r15 = r9.toUpperCase(r15)     // Catch:{ JSONException -> 0x018d }
            java.lang.String r15 = r15.trim()     // Catch:{ JSONException -> 0x018d }
            int r16 = r15.hashCode()     // Catch:{ JSONException -> 0x018d }
            java.lang.String r11 = "OMID_VIEWABILITY"
            switch(r16) {
                case -1881262698: goto L_0x00f4;
                case -825499301: goto L_0x00e9;
                case 2342118: goto L_0x00df;
                case 2634405: goto L_0x00d5;
                case 64212328: goto L_0x00cb;
                case 368426751: goto L_0x00c3;
                case 1963885793: goto L_0x00b9;
                case 2008409463: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00fe
        L_0x00af:
            java.lang.String r5 = "CLIENT_FILL"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x00fe
            r5 = r13
            goto L_0x00ff
        L_0x00b9:
            java.lang.String r5 = "VIDEO_VIEWABILITY"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x00fe
            r5 = 6
            goto L_0x00ff
        L_0x00c3:
            boolean r5 = r15.equals(r11)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x00fe
            r5 = 7
            goto L_0x00ff
        L_0x00cb:
            java.lang.String r5 = "CLICK"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x00fe
            r5 = 5
            goto L_0x00ff
        L_0x00d5:
            java.lang.String r5 = "VIEW"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x00fe
            r5 = 4
            goto L_0x00ff
        L_0x00df:
            java.lang.String r5 = "LOAD"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x00fe
            r5 = r14
            goto L_0x00ff
        L_0x00e9:
            java.lang.String r5 = "FALLBACK_URL_CLICK"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x00fe
            r5 = 8
            goto L_0x00ff
        L_0x00f4:
            java.lang.String r5 = "RENDER"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x00fe
            r5 = r12
            goto L_0x00ff
        L_0x00fe:
            r5 = -1
        L_0x00ff:
            java.lang.String r15 = "TRACKER_EVENT_TYPE_FALLBACK_URL"
            switch(r5) {
                case 1: goto L_0x011b;
                case 2: goto L_0x0118;
                case 3: goto L_0x0115;
                case 4: goto L_0x0112;
                case 5: goto L_0x010e;
                case 6: goto L_0x010a;
                case 7: goto L_0x0107;
                case 8: goto L_0x016a;
                default: goto L_0x0104;
            }
        L_0x0104:
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ JSONException -> 0x018d }
            goto L_0x011e
        L_0x0107:
            r15 = r11
            goto L_0x016a
        L_0x010a:
            java.lang.String r15 = "VideoImpression"
            goto L_0x016a
        L_0x010e:
            java.lang.String r15 = "click"
            goto L_0x016a
        L_0x0112:
            java.lang.String r15 = "page_view"
            goto L_0x016a
        L_0x0115:
            java.lang.String r15 = "Impression"
            goto L_0x016a
        L_0x0118:
            java.lang.String r15 = "client_fill"
            goto L_0x016a
        L_0x011b:
            java.lang.String r15 = "load"
            goto L_0x016a
        L_0x011e:
            java.lang.String r5 = r9.toUpperCase(r5)     // Catch:{ JSONException -> 0x018d }
            java.lang.String r5 = r5.trim()     // Catch:{ JSONException -> 0x018d }
            int r9 = r5.hashCode()     // Catch:{ JSONException -> 0x018d }
            switch(r9) {
                case -1836567951: goto L_0x014c;
                case -1099027408: goto L_0x0142;
                case 1331888222: goto L_0x0138;
                case 1346121898: goto L_0x012e;
                default: goto L_0x012d;
            }     // Catch:{ JSONException -> 0x018d }
        L_0x012d:
            goto L_0x0156
        L_0x012e:
            java.lang.String r9 = "DOWNLOADER_INITIALIZED"
            boolean r5 = r5.equals(r9)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x0156
            r5 = r14
            goto L_0x0157
        L_0x0138:
            java.lang.String r9 = "DOWNLOADER_ERROR"
            boolean r5 = r5.equals(r9)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x0156
            r5 = 4
            goto L_0x0157
        L_0x0142:
            java.lang.String r9 = "DOWNLOADER_DOWNLOADING"
            boolean r5 = r5.equals(r9)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x0156
            r5 = r13
            goto L_0x0157
        L_0x014c:
            java.lang.String r9 = "DOWNLOADER_DOWNLOADED"
            boolean r5 = r5.equals(r9)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x0156
            r5 = r12
            goto L_0x0157
        L_0x0156:
            r5 = -1
        L_0x0157:
            if (r5 == r14) goto L_0x016a
            if (r5 == r13) goto L_0x0168
            if (r5 == r12) goto L_0x0165
            r9 = 4
            if (r5 == r9) goto L_0x0162
            r15 = r10
            goto L_0x016a
        L_0x0162:
            java.lang.String r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_ERROR"
            goto L_0x016a
        L_0x0165:
            java.lang.String r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADED"
            goto L_0x016a
        L_0x0168:
            java.lang.String r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADING"
        L_0x016a:
            boolean r5 = r10.equals(r15)     // Catch:{ JSONException -> 0x018d }
            if (r5 != 0) goto L_0x0187
            boolean r5 = r11.equals(r15)     // Catch:{ JSONException -> 0x018d }
            if (r5 != 0) goto L_0x0180
            com.inmobi.media.cf r5 = m17666a((int) r8, (java.lang.String) r15, (org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x018d }
            if (r5 == 0) goto L_0x0187
            r4.add(r5)     // Catch:{ JSONException -> 0x018d }
            goto L_0x0187
        L_0x0180:
            java.util.List r5 = m17668a((org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x018d }
            r4.addAll(r5)     // Catch:{ JSONException -> 0x018d }
        L_0x0187:
            int r6 = r6 + 1
            r5 = 0
            goto L_0x0022
        L_0x018c:
            return r4
        L_0x018d:
            r0 = move-exception
            com.inmobi.media.gg r1 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r2 = new com.inmobi.media.hg
            r2.<init>(r0)
            r1.mo35357a((com.inmobi.media.C6217hg) r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17676b(org.json.JSONObject):java.util.List");
    }

    /* renamed from: a */
    private C6001dt m17667a(JSONObject jSONObject, String str, C5901bt btVar) {
        if (m17685f(jSONObject).equalsIgnoreCase(ShareConstants.VIDEO_URL)) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
                if (jSONArray != null) {
                    if (jSONArray.length() != 0) {
                        if (btVar instanceof C5923cg) {
                            return (C6001dt) btVar.f14896e;
                        }
                        return new C5994dp(this.f14952s.vastVideo).mo35102a(str);
                    }
                }
                return null;
            } catch (JSONException e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
        }
        return null;
    }

    /* renamed from: c */
    private static String m17678c(JSONObject jSONObject) {
        try {
            if ((m17685f(jSONObject).equalsIgnoreCase("ICON") || m17685f(jSONObject).equalsIgnoreCase(ShareConstants.IMAGE_URL) || m17685f(jSONObject).equalsIgnoreCase("GIF")) && jSONObject.getJSONArray("assetValue").getString(0).length() != 0) {
                return jSONObject.getJSONArray("assetValue").getString(0);
            }
            return "";
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }

    /* renamed from: d */
    private static String m17680d(JSONObject jSONObject) {
        try {
            return jSONObject.getString("assetId");
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return Integer.toString(jSONObject.hashCode());
        }
    }

    /* renamed from: e */
    private static String m17682e(JSONObject jSONObject) {
        try {
            return jSONObject.getString("assetName");
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }

    /* renamed from: f */
    private static String m17685f(JSONObject jSONObject) {
        try {
            return jSONObject.getString("assetType");
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }

    /* renamed from: g */
    private static String m17687g(JSONObject jSONObject) {
        try {
            return jSONObject.getString("valueType");
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }

    /* renamed from: h */
    private static String m17690h(JSONObject jSONObject) {
        try {
            return jSONObject.getString("dataType");
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }

    /* renamed from: i */
    private JSONObject m17692i(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        try {
            if (jSONObject.isNull("assetStyle")) {
                jSONObject2 = null;
            } else {
                jSONObject2 = jSONObject.getJSONObject("assetStyle");
            }
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            if (jSONObject.isNull("assetStyleRef")) {
                return new JSONObject();
            }
            String string = jSONObject.getString("assetStyleRef");
            if (this.f14948o == null) {
                jSONObject3 = new JSONObject();
            } else {
                jSONObject3 = this.f14948o.getJSONObject(string);
            }
            return jSONObject3;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return new JSONObject();
        }
    }

    /* renamed from: j */
    private Point m17694j(JSONObject jSONObject) {
        Point point = new Point();
        try {
            JSONObject i = m17692i(jSONObject);
            if (i.isNull("geometry")) {
                return point;
            }
            JSONArray jSONArray = i.getJSONArray("geometry");
            point.x = C6252ic.m18654a(jSONArray.getInt(0));
            point.y = C6252ic.m18654a(jSONArray.getInt(1));
            return point;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    /* renamed from: a */
    private Point m17661a(JSONObject jSONObject, Point point) {
        try {
            JSONObject i = m17692i(jSONObject);
            if (i.isNull("finalGeometry")) {
                return point;
            }
            Point point2 = new Point();
            JSONArray jSONArray = i.getJSONArray("finalGeometry");
            point2.x = C6252ic.m18654a(jSONArray.getInt(0));
            point2.y = C6252ic.m18654a(jSONArray.getInt(1));
            return point2;
        } catch (JSONException unused) {
            return point;
        }
    }

    /* renamed from: k */
    private Point m17696k(JSONObject jSONObject) {
        Point point = new Point();
        try {
            JSONObject i = m17692i(jSONObject);
            if (i.isNull("geometry")) {
                return point;
            }
            JSONArray jSONArray = i.getJSONArray("geometry");
            point.x = C6252ic.m18654a(jSONArray.getInt(2));
            point.y = C6252ic.m18654a(jSONArray.getInt(3));
            return point;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    /* renamed from: b */
    private Point m17674b(JSONObject jSONObject, Point point) {
        try {
            JSONObject i = m17692i(jSONObject);
            if (i.isNull("finalGeometry")) {
                return point;
            }
            Point point2 = new Point();
            JSONArray jSONArray = i.getJSONArray("finalGeometry");
            point2.x = C6252ic.m18654a(jSONArray.getInt(2));
            point2.y = C6252ic.m18654a(jSONArray.getInt(3));
            return point2;
        } catch (JSONException unused) {
            return point;
        }
    }

    /* renamed from: l */
    private static byte m17697l(JSONObject jSONObject) {
        try {
            JSONObject n = m17699n(jSONObject);
            if (n.isNull("type")) {
                return 2;
            }
            String lowerCase = n.getString("type").trim().toLowerCase(Locale.US);
            char c = 65535;
            int hashCode = lowerCase.hashCode();
            if (hashCode != -921832806) {
                if (hashCode != -284840886) {
                    if (hashCode == 1728122231) {
                        if (lowerCase.equals(Constants.PATH_TYPE_ABSOLUTE)) {
                            c = 2;
                        }
                    }
                } else if (lowerCase.equals("unknown")) {
                    c = 1;
                }
            } else if (lowerCase.equals("percentage")) {
                c = 3;
            }
            if (c != 2) {
                return c != 3 ? (byte) 1 : 4;
            }
            return 3;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return 2;
        }
    }

    /* renamed from: a */
    private static int m17660a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject n = m17699n(jSONObject);
            String str = AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY;
            if (n.isNull(z ? str : "hideAfterDelay")) {
                return -1;
            }
            if (!z) {
                str = "hideAfterDelay";
            }
            int i = n.getInt(str);
            if (3 == m17697l(jSONObject)) {
                return i;
            }
            if (4 == m17697l(jSONObject)) {
                if (i == 0) {
                    return i;
                }
                if (i > 0 && i <= 100) {
                    int[] iArr = {25, 50, 75, 100};
                    double d = Double.MAX_VALUE;
                    int i2 = -1;
                    for (int i3 = 0; i3 < 4; i3++) {
                        int i4 = i - iArr[i3];
                        double d2 = (double) (i4 * i4);
                        if (d2 < d) {
                            i2 = i3;
                            d = d2;
                        }
                    }
                    return iArr[i2];
                }
            }
            return -1;
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return -1;
        }
    }

    /* renamed from: m */
    private static String m17698m(JSONObject jSONObject) {
        try {
            JSONObject n = m17699n(jSONObject);
            if (n.isNull("reference")) {
                return "";
            }
            return n.getString("reference");
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }

    /* renamed from: n */
    private static JSONObject m17699n(JSONObject jSONObject) {
        if (jSONObject.isNull("display")) {
            return new JSONObject();
        }
        try {
            return jSONObject.getJSONObject("display");
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return new JSONObject();
        }
    }

    /* renamed from: o */
    private static JSONArray m17700o(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONArray("assetValue");
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return new JSONArray();
        }
    }

    /* renamed from: p */
    private static boolean m17701p(JSONObject jSONObject) {
        return !jSONObject.isNull("assetOnclick");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m17679d(java.lang.String r5) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toUpperCase(r0)
            java.lang.String r5 = r5.trim()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r0) {
                case -2084521848: goto L_0x0034;
                case -1038134325: goto L_0x002a;
                case 69805756: goto L_0x0020;
                case 1411860198: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x003e
        L_0x0016:
            java.lang.String r0 = "DEEPLINK"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r3
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "INAPP"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r4
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "EXTERNAL"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r1
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "DOWNLOAD"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r2
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == r4) goto L_0x0048
            if (r5 == r3) goto L_0x0047
            if (r5 == r2) goto L_0x0046
            return r4
        L_0x0046:
            return r2
        L_0x0047:
            return r3
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17679d(java.lang.String):byte");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m17681e(java.lang.String r10) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r10 = r10.toLowerCase(r0)
            java.lang.String r10 = r10.trim()
            int r0 = r10.hashCode()
            java.lang.String r1 = "none"
            java.lang.String r2 = "bold"
            java.lang.String r3 = "strike"
            java.lang.String r4 = "underline"
            java.lang.String r5 = "italic"
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            switch(r0) {
                case -1178781136: goto L_0x0040;
                case -1026963764: goto L_0x0038;
                case -891985998: goto L_0x0030;
                case 3029637: goto L_0x0028;
                case 3387192: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0048
        L_0x0020:
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x0048
            r10 = 1
            goto L_0x0049
        L_0x0028:
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0048
            r10 = r9
            goto L_0x0049
        L_0x0030:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0048
            r10 = r7
            goto L_0x0049
        L_0x0038:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x0048
            r10 = r6
            goto L_0x0049
        L_0x0040:
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x0048
            r10 = r8
            goto L_0x0049
        L_0x0048:
            r10 = -1
        L_0x0049:
            if (r10 == r9) goto L_0x0055
            if (r10 == r8) goto L_0x0054
            if (r10 == r7) goto L_0x0053
            if (r10 == r6) goto L_0x0052
            return r1
        L_0x0052:
            return r4
        L_0x0053:
            return r3
        L_0x0054:
            return r5
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17681e(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032 A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m17684f(java.lang.String r5) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r5 = r5.trim()
            int r0 = r5.hashCode()
            r1 = 3321844(0x32aff4, float:4.654895E-39)
            java.lang.String r2 = "none"
            java.lang.String r3 = "line"
            r4 = 2
            if (r0 == r1) goto L_0x0026
            r1 = 3387192(0x33af38, float:4.746467E-39)
            if (r0 == r1) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x0026:
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x002e
            r5 = r4
            goto L_0x002f
        L_0x002e:
            r5 = -1
        L_0x002f:
            if (r5 == r4) goto L_0x0032
            return r2
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17684f(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032 A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m17686g(java.lang.String r5) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r5 = r5.trim()
            int r0 = r5.hashCode()
            r1 = -1349116587(0xffffffffaf961d55, float:-2.7305683E-10)
            java.lang.String r2 = "straight"
            java.lang.String r3 = "curved"
            r4 = 2
            if (r0 == r1) goto L_0x0026
            r1 = 1787472634(0x6a8aaafa, float:8.381959E25)
            if (r0 == r1) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x0026:
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x002e
            r5 = r4
            goto L_0x002f
        L_0x002e:
            r5 = -1
        L_0x002f:
            if (r5 == r4) goto L_0x0032
            return r2
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17686g(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m17689h(java.lang.String r8) {
        /*
            java.lang.String r8 = r8.trim()
            int r0 = r8.hashCode()
            java.lang.String r1 = "aspectFill"
            java.lang.String r2 = "fill"
            java.lang.String r3 = "aspectFit"
            java.lang.String r4 = "unspecified"
            r5 = 4
            r6 = 3
            r7 = 2
            switch(r0) {
                case -1626174665: goto L_0x002f;
                case -1362001767: goto L_0x0027;
                case 3143043: goto L_0x001f;
                case 727618043: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0037
        L_0x0017:
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0037
            r8 = r6
            goto L_0x0038
        L_0x001f:
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0037
            r8 = r7
            goto L_0x0038
        L_0x0027:
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0037
            r8 = r5
            goto L_0x0038
        L_0x002f:
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0037
            r8 = 1
            goto L_0x0038
        L_0x0037:
            r8 = -1
        L_0x0038:
            if (r8 == r7) goto L_0x0041
            if (r8 == r6) goto L_0x0040
            if (r8 == r5) goto L_0x003f
            return r4
        L_0x003f:
            return r3
        L_0x0040:
            return r1
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17689h(java.lang.String):java.lang.String");
    }

    /* renamed from: q */
    private C5916cc.C5917a m17702q(JSONObject jSONObject) {
        return new C5916cc.C5917a(jSONObject.optLong(Constants.PATH_TYPE_ABSOLUTE), jSONObject.optLong("percentage"), jSONObject.optString("reference"), this);
    }

    /* renamed from: r */
    private C5916cc.C5917a m17703r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C5916cc.C5917a(jSONObject.optLong(Constants.PATH_TYPE_ABSOLUTE), jSONObject.optLong("percentage"), jSONObject.optString("reference"), this);
    }

    /* renamed from: a */
    private C5902bu m17664a(Point point, Point point2, Point point3, Point point4, JSONObject jSONObject) throws JSONException {
        String str;
        Point point5 = point;
        Point point6 = point2;
        Point point7 = point3;
        Point point8 = point4;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "none";
        String str3 = "#ff000000";
        String str4 = "straight";
        if (!jSONObject2.isNull("border")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("border");
            if (!jSONObject3.isNull("style")) {
                str2 = m17684f(jSONObject3.getString("style"));
                if (!jSONObject3.isNull("corner")) {
                    str4 = m17686g(jSONObject3.getString("corner"));
                }
                if (!jSONObject3.isNull("color")) {
                    str3 = jSONObject3.getString("color").trim();
                }
            }
        }
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        if (jSONObject2.isNull("backgroundColor")) {
            str = "#00000000";
        } else {
            str = jSONObject2.getString("backgroundColor").trim();
        }
        String str8 = str;
        return new C5902bu(point5.x, point5.y, point6.x, point6.y, point7.x, point7.y, point8.x, point8.y, !jSONObject2.isNull("contentMode") ? m17689h(jSONObject2.getString("contentMode")) : "fill", str5, str7, str6, str8, m17704s(jSONObject2));
    }

    /* renamed from: s */
    private C5916cc m17704s(JSONObject jSONObject) throws JSONException {
        C5916cc.C5917a aVar = null;
        C5916cc.C5917a r = !jSONObject.isNull("startOffset") ? m17703r(jSONObject.optJSONObject("startOffset")) : null;
        if (!jSONObject.isNull("timerDuration")) {
            aVar = m17703r(jSONObject.optJSONObject("timerDuration"));
        }
        return new C5916cc(r, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ec  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.inmobi.media.C5914cb.C5915a m17675b(android.graphics.Point r32, android.graphics.Point r33, android.graphics.Point r34, android.graphics.Point r35, org.json.JSONObject r36) throws org.json.JSONException {
        /*
            r31 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            java.lang.String r5 = "border"
            boolean r6 = r4.isNull(r5)
            java.lang.String r7 = "straight"
            java.lang.String r8 = "color"
            java.lang.String r9 = "#ff000000"
            java.lang.String r10 = "none"
            java.lang.String r11 = "style"
            if (r6 == 0) goto L_0x0023
        L_0x001c:
            r22 = r7
            r23 = r9
            r21 = r10
            goto L_0x0062
        L_0x0023:
            org.json.JSONObject r5 = r4.getJSONObject(r5)
            boolean r6 = r5.isNull(r11)
            if (r6 == 0) goto L_0x002e
            goto L_0x001c
        L_0x002e:
            java.lang.String r6 = r5.getString(r11)
            java.lang.String r6 = m17684f((java.lang.String) r6)
            java.lang.String r12 = "corner"
            boolean r13 = r5.isNull(r12)
            if (r13 == 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            java.lang.String r7 = r5.getString(r12)
            java.lang.String r7 = m17686g((java.lang.String) r7)
        L_0x0047:
            boolean r12 = r5.isNull(r8)
            if (r12 == 0) goto L_0x0054
            r21 = r6
            r22 = r7
            r23 = r9
            goto L_0x0062
        L_0x0054:
            java.lang.String r5 = r5.getString(r8)
            java.lang.String r5 = r5.trim()
            r23 = r5
            r21 = r6
            r22 = r7
        L_0x0062:
            java.lang.String r5 = "backgroundColor"
            boolean r6 = r4.isNull(r5)
            if (r6 == 0) goto L_0x006d
            java.lang.String r5 = "#00000000"
            goto L_0x0075
        L_0x006d:
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r5 = r5.trim()
        L_0x0075:
            r24 = r5
            java.lang.String r5 = "text"
            org.json.JSONObject r5 = r4.getJSONObject(r5)
            java.lang.String r6 = "size"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ NumberFormatException -> 0x015c }
            double r6 = java.lang.Double.parseDouble(r6)     // Catch:{ NumberFormatException -> 0x015c }
            int r6 = (int) r6
            java.lang.String r7 = "length"
            boolean r12 = r5.isNull(r7)
            if (r12 == 0) goto L_0x0094
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x009c
        L_0x0094:
            java.lang.String r7 = r5.getString(r7)
            int r7 = java.lang.Integer.parseInt(r7)
        L_0x009c:
            r27 = r7
            boolean r7 = r5.isNull(r8)
            if (r7 == 0) goto L_0x00a5
            goto L_0x00ad
        L_0x00a5:
            java.lang.String r7 = r5.getString(r8)
            java.lang.String r9 = r7.trim()
        L_0x00ad:
            r28 = r9
            boolean r7 = r5.isNull(r11)
            r8 = 0
            if (r7 == 0) goto L_0x00bd
            java.lang.String[] r7 = new java.lang.String[]{r10}
        L_0x00ba:
            r29 = r7
            goto L_0x00e4
        L_0x00bd:
            org.json.JSONArray r7 = r5.getJSONArray(r11)
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00cc
            java.lang.String[] r7 = new java.lang.String[]{r10}
            goto L_0x00ba
        L_0x00cc:
            java.lang.String[] r9 = new java.lang.String[r7]
            r10 = r8
        L_0x00cf:
            if (r10 >= r7) goto L_0x00e2
            org.json.JSONArray r12 = r5.getJSONArray(r11)
            java.lang.String r12 = r12.getString(r10)
            java.lang.String r12 = m17681e((java.lang.String) r12)
            r9[r10] = r12
            int r10 = r10 + 1
            goto L_0x00cf
        L_0x00e2:
            r29 = r9
        L_0x00e4:
            java.lang.String r7 = "align"
            boolean r9 = r5.isNull(r7)
            if (r9 != 0) goto L_0x0131
            java.lang.String r5 = r5.getString(r7)
            java.lang.String r5 = r5.trim()
            r7 = -1
            int r9 = r5.hashCode()
            r10 = -1364013605(0xffffffffaeb2cddb, float:-8.13107E-11)
            r11 = 3
            r12 = 2
            r13 = 1
            if (r9 == r10) goto L_0x0120
            r10 = 3317767(0x32a007, float:4.649182E-39)
            if (r9 == r10) goto L_0x0116
            r10 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r9 == r10) goto L_0x010c
            goto L_0x0129
        L_0x010c:
            java.lang.String r9 = "right"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0129
            r7 = r12
            goto L_0x0129
        L_0x0116:
            java.lang.String r9 = "left"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0129
            r7 = r13
            goto L_0x0129
        L_0x0120:
            java.lang.String r9 = "centre"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0129
            r7 = r11
        L_0x0129:
            if (r7 == r12) goto L_0x0130
            if (r7 == r11) goto L_0x012e
            goto L_0x0131
        L_0x012e:
            r8 = r12
            goto L_0x0131
        L_0x0130:
            r8 = r13
        L_0x0131:
            r5 = r31
            r26 = r8
            com.inmobi.media.cc r30 = r5.m17704s(r4)
            com.inmobi.media.cb$a r4 = new com.inmobi.media.cb$a
            r12 = r4
            int r13 = r0.x
            int r14 = r0.y
            int r15 = r1.x
            int r0 = r1.y
            r16 = r0
            int r0 = r2.x
            r17 = r0
            int r0 = r2.y
            r18 = r0
            int r0 = r3.x
            r19 = r0
            int r0 = r3.y
            r20 = r0
            r25 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r4
        L_0x015c:
            r0 = move-exception
            r5 = r31
            org.json.JSONException r1 = new org.json.JSONException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            com.inmobi.media.gg r2 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r3 = new com.inmobi.media.hg
            r3.<init>(r0)
            r2.mo35357a((com.inmobi.media.C6217hg) r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17675b(android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point, org.json.JSONObject):com.inmobi.media.cb$a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.inmobi.media.C5914cb.C5915a m17677c(android.graphics.Point r30, android.graphics.Point r31, android.graphics.Point r32, android.graphics.Point r33, org.json.JSONObject r34) throws org.json.JSONException {
        /*
            r29 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            java.lang.String r5 = "border"
            boolean r6 = r4.isNull(r5)
            java.lang.String r7 = "straight"
            java.lang.String r8 = "color"
            java.lang.String r9 = "#ff000000"
            java.lang.String r10 = "none"
            java.lang.String r11 = "style"
            if (r6 == 0) goto L_0x0023
        L_0x001c:
            r22 = r7
            r23 = r9
            r21 = r10
            goto L_0x0062
        L_0x0023:
            org.json.JSONObject r5 = r4.getJSONObject(r5)
            boolean r6 = r5.isNull(r11)
            if (r6 == 0) goto L_0x002e
            goto L_0x001c
        L_0x002e:
            java.lang.String r6 = r5.getString(r11)
            java.lang.String r6 = m17684f((java.lang.String) r6)
            java.lang.String r12 = "corner"
            boolean r13 = r5.isNull(r12)
            if (r13 == 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            java.lang.String r7 = r5.getString(r12)
            java.lang.String r7 = m17686g((java.lang.String) r7)
        L_0x0047:
            boolean r12 = r5.isNull(r8)
            if (r12 == 0) goto L_0x0054
            r21 = r6
            r22 = r7
            r23 = r9
            goto L_0x0062
        L_0x0054:
            java.lang.String r5 = r5.getString(r8)
            java.lang.String r5 = r5.trim()
            r23 = r5
            r21 = r6
            r22 = r7
        L_0x0062:
            java.lang.String r5 = "backgroundColor"
            boolean r6 = r4.isNull(r5)
            if (r6 == 0) goto L_0x006d
            java.lang.String r5 = "#00000000"
            goto L_0x0075
        L_0x006d:
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r5 = r5.trim()
        L_0x0075:
            r24 = r5
            java.lang.String r5 = "text"
            org.json.JSONObject r5 = r4.getJSONObject(r5)
            java.lang.String r6 = "size"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ NumberFormatException -> 0x00f8 }
            double r6 = java.lang.Double.parseDouble(r6)     // Catch:{ NumberFormatException -> 0x00f8 }
            int r6 = (int) r6
            boolean r7 = r5.isNull(r8)
            if (r7 == 0) goto L_0x008f
            goto L_0x0097
        L_0x008f:
            java.lang.String r7 = r5.getString(r8)
            java.lang.String r9 = r7.trim()
        L_0x0097:
            r26 = r9
            boolean r7 = r5.isNull(r11)
            if (r7 == 0) goto L_0x00a8
            java.lang.String[] r5 = new java.lang.String[]{r10}
        L_0x00a3:
            r27 = r5
            r5 = r29
            goto L_0x00d1
        L_0x00a8:
            org.json.JSONArray r7 = r5.getJSONArray(r11)
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00b7
            java.lang.String[] r5 = new java.lang.String[]{r10}
            goto L_0x00a3
        L_0x00b7:
            java.lang.String[] r8 = new java.lang.String[r7]
            r9 = 0
        L_0x00ba:
            if (r9 >= r7) goto L_0x00cd
            org.json.JSONArray r10 = r5.getJSONArray(r11)
            java.lang.String r10 = r10.getString(r9)
            java.lang.String r10 = m17681e((java.lang.String) r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x00ba
        L_0x00cd:
            r5 = r29
            r27 = r8
        L_0x00d1:
            com.inmobi.media.cc r28 = r5.m17704s(r4)
            com.inmobi.media.bw$a r4 = new com.inmobi.media.bw$a
            r12 = r4
            int r13 = r0.x
            int r14 = r0.y
            int r15 = r1.x
            int r0 = r1.y
            r16 = r0
            int r0 = r2.x
            r17 = r0
            int r0 = r2.y
            r18 = r0
            int r0 = r3.x
            r19 = r0
            int r0 = r3.y
            r20 = r0
            r25 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r4
        L_0x00f8:
            r0 = move-exception
            r5 = r29
            org.json.JSONException r1 = new org.json.JSONException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            com.inmobi.media.gg r2 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r3 = new com.inmobi.media.hg
            r3.<init>(r0)
            r2.mo35357a((com.inmobi.media.C6217hg) r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5907bx.m17677c(android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point, org.json.JSONObject):com.inmobi.media.cb$a");
    }

    /* renamed from: a */
    private static boolean m17671a(C5903bv bvVar) {
        return "card_scrollable".equalsIgnoreCase(bvVar.f14895d);
    }

    /* renamed from: a */
    private static void m17670a(C5923cg cgVar) {
        cgVar.f14915x = 8;
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", "601");
        cgVar.mo34877a("error", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private static C5901bt m17662a(C5907bx bxVar, C5901bt btVar) {
        do {
            String str = (String) btVar.f14896e;
            if (str == null || str.length() == 0) {
                return null;
            }
            String[] split = str.split("\\|");
            C5901bt b = bxVar.mo34896b(split[0]);
            if (b == null) {
                bxVar = bxVar.f14940f;
            } else if (b.equals(btVar)) {
                return null;
            } else {
                if (1 == split.length) {
                    b.f14904m = 1;
                    return b;
                }
                b.f14904m = m17659a(split[1]);
                return b;
            }
        } while (bxVar != null);
        return null;
    }
}
