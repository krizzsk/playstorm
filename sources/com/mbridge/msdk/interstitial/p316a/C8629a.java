package com.mbridge.msdk.interstitial.p316a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8405f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p310f.C8482b;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interstitial.p317b.C8633a;
import com.mbridge.msdk.interstitial.p318c.C8634a;
import com.mbridge.msdk.interstitial.p319d.C8639a;
import com.mbridge.msdk.interstitial.p319d.C8640b;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2294d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.interstitial.a.a */
/* compiled from: IntersAdapter */
public final class C8629a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f20874a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f20875b;

    /* renamed from: c */
    private String f20876c;

    /* renamed from: d */
    private int f20877d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f20878e;

    /* renamed from: f */
    private int f20879f;

    /* renamed from: g */
    private String f20880g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8634a.C8636a f20881h;

    /* renamed from: i */
    private C2294d f20882i;

    /* renamed from: j */
    private Handler f20883j;

    public C8629a(Context context, String str, String str2, String str3, boolean z) {
        this.f20874a = context;
        this.f20875b = str;
        this.f20876c = str2;
        this.f20880g = str3;
        this.f20878e = z;
        C2294d e = C2283b.m5275a().mo15569e(C2350a.m5601e().mo15793h(), str);
        this.f20882i = e;
        if (e == null) {
            this.f20882i = C2294d.m5327f(this.f20875b);
        }
        this.f20883j = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                try {
                    int i = message.what;
                    if (i != 3) {
                        if (i == 4) {
                            if (C8629a.this.f20881h != null && message.obj != null && (message.obj instanceof String)) {
                                C8629a.this.f20881h.mo57847b(C8629a.this.f20878e, (String) message.obj);
                            }
                        }
                    } else if (C8629a.this.f20881h != null && message.obj != null && (message.obj instanceof String)) {
                        C8629a.this.f20881h.mo57846a(C8629a.this.f20878e, (String) message.obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public final CampaignEx mo57827a() {
        try {
            if (TextUtils.isEmpty(this.f20875b)) {
                return null;
            }
            m24992e();
            List<CampaignEx> f = m24993f();
            if (f != null) {
                if (f.size() > 0) {
                    for (int i = 0; i < f.size(); i++) {
                        CampaignEx campaignEx = f.get(i);
                        if (campaignEx != null && (!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || !TextUtils.isEmpty(campaignEx.getMraid()))) {
                            return campaignEx;
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo57829b() {
        if (this.f20874a == null) {
            m24986b("context is null");
        } else if (TextUtils.isEmpty(this.f20875b)) {
            m24986b("unitid is null");
        } else {
            C2294d dVar = this.f20882i;
            if (dVar == null) {
                m24986b("unitSetting is null please call load");
            } else if (dVar.mo15601o() <= 0) {
                m24986b("controller don't request ad");
            } else {
                m24992e();
                List<CampaignEx> f = m24993f();
                String str = "";
                if (f == null || f.size() <= 0) {
                    try {
                        if (this.f20874a == null) {
                            m24986b("context is null");
                        } else if (TextUtils.isEmpty(this.f20875b)) {
                            m24986b("unitid is null");
                        } else if (this.f20882i == null) {
                            m24986b("unitSetting is null please call load");
                        } else {
                            String h = C2350a.m5601e().mo15793h();
                            String md5 = SameMD5.getMD5(C2350a.m5601e().mo15793h() + C2350a.m5601e().mo15794i());
                            int i = this.f20878e ? 3 : 2;
                            this.f20879f = 1;
                            if (this.f20882i.mo15602p() > 0) {
                                this.f20879f = this.f20882i.mo15602p();
                            }
                            int o = this.f20882i.mo15601o() > 0 ? this.f20882i.mo15601o() : 1;
                            String a = C8417d.m24306a(this.f20875b, "interstitial");
                            this.f20877d = m24995h();
                            String j = m24997j();
                            if (TextUtils.isEmpty(this.f20880g)) {
                                this.f20880g = "0";
                            }
                            C8494d dVar2 = new C8494d();
                            C8482b.m24484a(dVar2, "app_id", h);
                            C8482b.m24484a(dVar2, MBridgeConstans.PROPERTIES_UNIT_ID, this.f20875b);
                            if (!TextUtils.isEmpty(this.f20876c)) {
                                C8482b.m24484a(dVar2, MBridgeConstans.PLACEMENT_ID, this.f20876c);
                            }
                            C8482b.m24484a(dVar2, "sign", md5);
                            C8482b.m24484a(dVar2, "category", this.f20880g);
                            C8482b.m24484a(dVar2, "req_type", i + str);
                            C8482b.m24484a(dVar2, "ad_num", o + str);
                            C8482b.m24484a(dVar2, "tnum", this.f20879f + str);
                            C8482b.m24484a(dVar2, "only_impression", "1" + str);
                            C8482b.m24484a(dVar2, "ping_mode", "1");
                            C8482b.m24484a(dVar2, C8494d.f20561b, a);
                            C8482b.m24484a(dVar2, C8494d.f20562c, m24989d());
                            C8482b.m24484a(dVar2, CampaignEx.JSON_KEY_AD_SOURCE_ID, 1 + str);
                            C8482b.m24484a(dVar2, C8494d.f20560a, j);
                            C8482b.m24484a(dVar2, "ad_type", 279 + str);
                            C8482b.m24484a(dVar2, "offset", this.f20877d + str);
                            String e = C8613y.m24945e(this.f20875b);
                            if (!TextUtils.isEmpty(e)) {
                                dVar2.mo57606a("j", e);
                            }
                            C8639a aVar = new C8639a(this.f20874a);
                            C86312 r1 = new C8640b() {
                                /* renamed from: a */
                                public final void mo57833a(CampaignUnit campaignUnit) {
                                    try {
                                        C8629a.m24980a(C8629a.this, campaignUnit);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        C8629a.this.m24986b("can't show because unknow error");
                                        C8629a.this.m24996i();
                                    }
                                }

                                /* renamed from: a */
                                public final void mo57832a(int i, String str) {
                                    C8608u.m24884d("IntersAdapter", str);
                                    C8629a.this.m24986b(str);
                                    C8629a.this.m24996i();
                                }
                            };
                            r1.f20497d = this.f20875b;
                            r1.f20498e = this.f20876c;
                            r1.f20499f = 279;
                            aVar.mo57598a(1, dVar2, (C8476e) r1, str);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        m24986b("can't show because unknow error");
                        m24996i();
                    }
                } else {
                    CampaignEx campaignEx = f.get(0);
                    if (campaignEx != null) {
                        str = campaignEx.getRequestId();
                    }
                    m24982a(str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24982a(String str) {
        if (this.f20883j != null) {
            Message obtain = Message.obtain();
            obtain.obj = str;
            obtain.what = 3;
            this.f20883j.sendMessage(obtain);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24986b(String str) {
        try {
            if (this.f20883j != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 4;
                this.f20883j.sendMessage(obtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private String m24989d() {
        String str = "";
        try {
            JSONArray a = C8613y.m24920a(this.f20874a, this.f20875b);
            if (a.length() > 0) {
                str = C8613y.m24918a(a);
            }
            C8608u.m24882b("IntersAdapter", "get excludes:" + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: e */
    private void m24992e() {
        try {
            if (C8633a.m25004a() != null) {
                C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
                if (b == null) {
                    b = C2283b.m5275a().mo15562b();
                }
                C8633a.m25004a().mo57836a(b.mo15442P() * 1000, this.f20875b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private List<CampaignEx> m24993f() {
        try {
            if (C8633a.m25004a() != null) {
                return C8633a.m25004a().mo57835a(this.f20875b, 1);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo57828a(C8634a.C8636a aVar) {
        this.f20881h = aVar;
    }

    /* renamed from: a */
    private List<CampaignEx> m24979a(List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int p = this.f20882i.mo15602p();
                    int i = 0;
                    while (true) {
                        if (i >= list.size() || i >= this.f20879f) {
                            break;
                        } else if (arrayList.size() >= p) {
                            break;
                        } else {
                            CampaignEx campaignEx = list.get(i);
                            if (campaignEx == null || campaignEx.getOfferType() != 1 || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                if (campaignEx != null && ((!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || campaignEx.isMraid()) && campaignEx.getOfferType() != 99)) {
                                    if (C8613y.m24935b(campaignEx)) {
                                        campaignEx.setRtinsType(C8613y.m24940c(this.f20874a, campaignEx.getPackageName()) ? 1 : 2);
                                    }
                                    if (campaignEx.getWtick() != 1) {
                                        if (C8613y.m24940c(this.f20874a, campaignEx.getPackageName())) {
                                            if (C8613y.m24935b(campaignEx)) {
                                                arrayList.add(campaignEx);
                                            } else {
                                                C8613y.m24923a(this.f20875b, campaignEx, C8413a.f20340v);
                                            }
                                        }
                                    }
                                    arrayList.add(campaignEx);
                                }
                            }
                            i++;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf A[SYNTHETIC, Splitter:B:29:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00eb A[SYNTHETIC, Splitter:B:41:0x00eb] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> m24983b(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "5"
            java.lang.String r1 = ""
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r11.size()
            r2.<init>(r3)
            java.util.Iterator r11 = r11.iterator()
        L_0x0011:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r3 = r11.next()
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            boolean r4 = r3.isMraid()
            if (r4 == 0) goto L_0x00f4
            java.lang.String r4 = r3.getMraid()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00f4
            r4 = 0
            com.mbridge.msdk.foundation.same.b.c r5 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_HTML     // Catch:{ Exception -> 0x00ad }
            java.lang.String r5 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r5)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = r3.getMraid()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = com.mbridge.msdk.foundation.tools.C8557ad.m24739a(r6)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r6)     // Catch:{ Exception -> 0x00ad }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00ad }
            if (r7 == 0) goto L_0x004e
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00ad }
        L_0x004e:
            java.lang.String r7 = ".html"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Exception -> 0x00ad }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x00ad }
            r7.<init>(r5, r6)     // Catch:{ Exception -> 0x00ad }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00ad }
            r5.<init>(r7)     // Catch:{ Exception -> 0x00ad }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4.<init>()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            com.mbridge.msdk.c.b.a r6 = com.mbridge.msdk.p054c.p056b.C2284a.m5293a()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r6 = r6.mo15574b()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            if (r8 != 0) goto L_0x007e
            java.lang.String r8 = "<script>"
            r4.append(r8)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4.append(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r6 = "</script>"
            r4.append(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
        L_0x007e:
            java.lang.String r6 = r3.getMraid()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r4.append(r6)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r5.write(r4)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r5.flush()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r3.setMraid(r4)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            java.lang.String r4 = r10.f20875b     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            com.mbridge.msdk.foundation.same.report.C8524c.m24634a(r3, r1, r4, r0)     // Catch:{ Exception -> 0x00a6, all -> 0x00a3 }
            r5.close()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c7
        L_0x00a3:
            r11 = move-exception
            r4 = r5
            goto L_0x00e9
        L_0x00a6:
            r4 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
            goto L_0x00ae
        L_0x00ab:
            r11 = move-exception
            goto L_0x00e9
        L_0x00ad:
            r5 = move-exception
        L_0x00ae:
            r5.printStackTrace()     // Catch:{ all -> 0x00ab }
            r3.setMraid(r1)     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = r10.f20875b     // Catch:{ all -> 0x00ab }
            com.mbridge.msdk.foundation.same.report.C8524c.m24634a(r3, r5, r6, r0)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x00c7
            r4.close()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c7
        L_0x00c3:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00c7:
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.getMraid()
            r4.<init>(r5)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x00e2
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L_0x00e2
            boolean r4 = r4.canRead()
            if (r4 != 0) goto L_0x00f4
        L_0x00e2:
            java.lang.String r3 = "mraid resource write fail"
            r10.m24986b((java.lang.String) r3)
            goto L_0x0011
        L_0x00e9:
            if (r4 == 0) goto L_0x00f3
            r4.close()     // Catch:{ Exception -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00f3:
            throw r11
        L_0x00f4:
            r2.add(r3)
            goto L_0x0011
        L_0x00f9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.interstitial.p316a.C8629a.m24983b(java.util.List):java.util.List");
    }

    /* renamed from: g */
    private int m24994g() {
        try {
            Map<String, Integer> map = C8634a.f20894d;
            int intValue = (TextUtils.isEmpty(this.f20875b) || map == null || !map.containsKey(this.f20875b)) ? 1 : map.get(this.f20875b).intValue();
            if (intValue <= 0) {
                return 1;
            }
            return intValue;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* renamed from: h */
    private int m24995h() {
        int i = 0;
        try {
            int a = !TextUtils.isEmpty(this.f20875b) ? C8634a.m25010a(this.f20875b) : 0;
            if (a <= m24994g()) {
                i = a;
            }
            C8608u.m24882b("IntersAdapter", "getCurrentOffset:" + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m24996i() {
        try {
            if (!TextUtils.isEmpty(this.f20875b)) {
                C8634a.m25015a(this.f20875b, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    private String m24997j() {
        try {
            if (!TextUtils.isEmpty(C8634a.f20892a)) {
                return C8634a.f20892a;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public final boolean mo57830c() {
        return this.f20878e;
    }

    /* renamed from: a */
    static /* synthetic */ void m24980a(C8629a aVar, CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            aVar.m24986b("no server ads available");
            return;
        }
        final ArrayList<CampaignEx> ads = campaignUnit.getAds();
        final List<CampaignEx> a = aVar.m24979a((List<CampaignEx>) ads);
        if (campaignUnit != null) {
            String sessionId = campaignUnit.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                C8608u.m24882b("IntersAdapter", "onload sessionId:" + sessionId);
                C8634a.f20892a = sessionId;
            }
        }
        try {
            aVar.f20877d += aVar.f20879f;
            if (aVar.f20877d > aVar.m24994g()) {
                aVar.f20877d = 0;
            }
            if (!TextUtils.isEmpty(aVar.f20875b)) {
                C8634a.m25015a(aVar.f20875b, aVar.f20877d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            public final void run() {
                List list = a;
                if (list == null || list.size() <= 0) {
                    C8629a.this.m24986b("no ads available");
                } else {
                    String d = C8629a.this.f20875b;
                    List<CampaignEx> a = C8629a.this.m24983b((List<CampaignEx>) a);
                    if (C8633a.m25004a() != null) {
                        C8633a a2 = C8633a.m25004a();
                        try {
                            if (!TextUtils.isEmpty(d) && a != null && a.size() > 0) {
                                for (CampaignEx b : a) {
                                    a2.mo57839b(b, d);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    CampaignEx campaignEx = (CampaignEx) a.get(0);
                    C8629a.this.m24982a(campaignEx != null ? campaignEx.getRequestId() : "");
                }
                C2379j.m5740a((C2374f) C2376g.m5723a(C8629a.this.f20874a)).mo15909b();
                List list2 = ads;
                if (list2 != null && list2.size() > 0) {
                    C8629a.m24985b(C8629a.this, ads);
                }
            }
        }).start();
    }

    /* renamed from: b */
    static /* synthetic */ void m24985b(C8629a aVar, List list) {
        if (aVar.f20874a != null && list != null && list.size() != 0) {
            C2379j a = C2379j.m5740a((C2374f) C2376g.m5723a(aVar.f20874a));
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) list.get(i);
                if (!(campaignEx == null || a == null || a.mo15907a(campaignEx.getId()))) {
                    C8405f fVar = new C8405f();
                    fVar.mo57347a(campaignEx.getId());
                    fVar.mo57345a(campaignEx.getFca());
                    fVar.mo57349b(campaignEx.getFcb());
                    fVar.mo57353d(0);
                    fVar.mo57351c(0);
                    fVar.mo57346a(System.currentTimeMillis());
                    a.mo15906a(fVar);
                }
            }
        }
    }
}
