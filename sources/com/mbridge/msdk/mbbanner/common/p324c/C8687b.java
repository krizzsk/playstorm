package com.mbridge.msdk.mbbanner.common.p324c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbbanner.common.p322a.C8667b;
import com.mbridge.msdk.mbbanner.common.p322a.C8668c;
import com.mbridge.msdk.mbbanner.common.p322a.C8669d;
import com.mbridge.msdk.mbbanner.common.p323b.C8671b;
import com.mbridge.msdk.mbbanner.common.p323b.C8673d;
import com.mbridge.msdk.mbbanner.common.p323b.C8674e;
import com.mbridge.msdk.mbbanner.common.p323b.C8675f;
import com.mbridge.msdk.mbbanner.common.p326e.C8706a;
import com.mbridge.msdk.mbbanner.common.p327f.C8707a;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.common.util.C8710a;
import com.mbridge.msdk.videocommon.download.C9563g;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.mbridge.msdk.mbbanner.common.c.b */
/* compiled from: BannerLoader */
public class C8687b {

    /* renamed from: a */
    private static final String f21050a = C8687b.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f21051b;

    /* renamed from: c */
    private int f21052c = 0;

    /* renamed from: d */
    private C8668c f21053d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8710a f21054e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8671b f21055f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8673d f21056g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile boolean f21057h = false;

    /* renamed from: i */
    private Timer f21058i = new Timer();

    /* renamed from: j */
    private volatile List<String> f21059j = new ArrayList();

    /* renamed from: k */
    private volatile boolean f21060k = false;

    /* renamed from: l */
    private volatile boolean f21061l = false;

    /* renamed from: m */
    private volatile boolean f21062m = false;

    public C8687b(Context context, C8668c cVar, C8671b bVar, C8710a aVar) {
        this.f21051b = context.getApplicationContext();
        this.f21053d = cVar;
        this.f21055f = bVar;
        this.f21054e = aVar;
    }

    /* renamed from: a */
    private void m25222a(String str) {
        if (this.f21062m) {
            return;
        }
        if ((this.f21060k || this.f21061l) && this.f21059j.size() == 0) {
            this.f21057h = true;
            this.f21062m = true;
            this.f21058i.cancel();
            this.f21054e.mo58045a(this.f21055f, str);
            this.f21056g.mo57994a(str);
        }
    }

    /* renamed from: a */
    public final void mo58020a(String str, int i, String str2, boolean z) {
        if (!z) {
            this.f21058i.cancel();
            this.f21057h = true;
            this.f21054e.mo58048b(this.f21055f, str);
            this.f21056g.mo57994a(str);
        } else if (i == 1) {
            synchronized (this) {
                this.f21059j.remove(str2);
                if (this.f21059j.size() == 0) {
                    m25222a(str);
                }
            }
        } else if (i == 2) {
            this.f21061l = true;
            m25222a(str);
        } else if (i == 3) {
            this.f21060k = true;
            m25222a(str);
        }
    }

    /* renamed from: a */
    public final void mo58021a(String str, String str2, C8667b bVar, C8673d dVar) {
        boolean z;
        try {
            this.f21056g = dVar;
            C86892 r11 = new C8707a() {
                /* renamed from: a */
                public final void mo58024a(CampaignUnit campaignUnit) {
                    try {
                        C8687b.this.f21054e.mo58044a(C8687b.this.f21055f, campaignUnit, this.f20497d);
                        C8687b.m25221a(C8687b.this, this.f20497d, campaignUnit);
                    } catch (Exception e) {
                        C8687b.this.f21054e.mo58046a(C8687b.this.f21055f, e.getMessage(), this.f20497d);
                        C8687b.this.f21056g.mo57994a(this.f20497d);
                    }
                }

                /* renamed from: a */
                public final void mo58023a(int i, String str) {
                    C8687b.this.f21054e.mo58046a(C8687b.this.f21055f, str, this.f20497d);
                    C8687b.this.f21056g.mo57994a(this.f20497d);
                }
            };
            r11.f20497d = str2;
            r11.f20498e = str;
            r11.f20499f = 296;
            C8706a aVar = new C8706a(this.f21051b);
            this.f21052c = m25226b(str2);
            C8494d a = C8669d.m25157a(false, this.f21051b, str2, this.f21053d.mo57982a(), this.f21052c, bVar);
            String e = C8613y.m24945e(str2);
            if (!TextUtils.isEmpty(e)) {
                a.mo57606a("j", e);
            }
            String c = bVar.mo57980c();
            if (!TextUtils.isEmpty(c)) {
                r11.mo58041a(c);
                z = true;
            } else {
                z = false;
            }
            this.f21054e.mo58047a(z);
            aVar.mo57598a(1, a, (C8476e) r11, c);
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f21054e.mo58046a(this.f21055f, e2.getMessage(), str2);
            this.f21056g.mo57994a(str2);
        }
    }

    /* renamed from: a */
    private List<CampaignEx> m25220a(String str, CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    for (int i = 0; i < ads.size(); i++) {
                        CampaignEx campaignEx = ads.get(i);
                        if (!(campaignEx == null || campaignEx.getOfferType() == 99 || (TextUtils.isEmpty(campaignEx.getBannerUrl()) && TextUtils.isEmpty(campaignEx.getBannerHtml()) && TextUtils.isEmpty(campaignEx.getImageUrl())))) {
                            if (C8613y.m24935b(campaignEx)) {
                                campaignEx.setRtinsType(C8613y.m24940c(this.f21051b, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (campaignEx.getWtick() != 1) {
                                if (C8613y.m24940c(this.f21051b, campaignEx.getPackageName())) {
                                    if (C8613y.m24935b(campaignEx)) {
                                        arrayList.add(campaignEx);
                                    } else {
                                        C8613y.m24923a(str, campaignEx, C8413a.f20340v);
                                    }
                                }
                            }
                            arrayList.add(campaignEx);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m25223a(String str, List<CampaignEx> list) {
        if (list != null && list.size() > 0) {
            for (CampaignEx next : list) {
                if (!TextUtils.isEmpty(next.getImageUrl())) {
                    this.f21059j.add(next.getImageUrl());
                    C8425b.m24339a(this.f21051b).mo57506a(next.getImageUrl(), (C8428c) new C8675f(this, str));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[SYNTHETIC, Splitter:B:24:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[SYNTHETIC, Splitter:B:37:0x0091] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m25219a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x009a
            r0 = 0
            com.mbridge.msdk.foundation.same.b.c r2 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_HTML     // Catch:{ Exception -> 0x005e }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r2)     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8557ad.m24739a(r8)     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r3)     // Catch:{ Exception -> 0x005e }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x005e }
            if (r4 == 0) goto L_0x0025
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x005e }
        L_0x0025:
            java.lang.String r4 = ".html"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ Exception -> 0x005e }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x005e }
            r4.<init>(r2, r3)     // Catch:{ Exception -> 0x005e }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x005e }
            r2.getPath()     // Catch:{ Exception -> 0x005e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005e }
            r2.<init>(r4)     // Catch:{ Exception -> 0x005e }
            byte[] r0 = r8.getBytes()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r2.write(r0)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r2.flush()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r2.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0052:
            r1 = r0
            goto L_0x006c
        L_0x0054:
            r7 = move-exception
            r0 = r2
            goto L_0x008f
        L_0x0057:
            r0 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x005f
        L_0x005c:
            r7 = move-exception
            goto L_0x008f
        L_0x005e:
            r2 = move-exception
        L_0x005f:
            r2.printStackTrace()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x006c
            r0.close()     // Catch:{ Exception -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006c:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r2 = r0.exists()
            r3 = 2
            if (r2 == 0) goto L_0x008a
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L_0x008a
            boolean r0 = r0.canRead()
            if (r0 != 0) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            r0 = 1
            r6.mo58020a((java.lang.String) r7, (int) r3, (java.lang.String) r8, (boolean) r0)
            goto L_0x009a
        L_0x008a:
            r0 = 0
            r6.mo58020a((java.lang.String) r7, (int) r3, (java.lang.String) r8, (boolean) r0)
            goto L_0x009a
        L_0x008f:
            if (r0 == 0) goto L_0x0099
            r0.close()     // Catch:{ Exception -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0099:
            throw r7
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.p324c.C8687b.m25219a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private int m25226b(String str) {
        try {
            int b = this.f21053d.mo57985b();
            if (b > this.f21053d.mo57986c()) {
                return 0;
            }
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25221a(C8687b bVar, final String str, final CampaignUnit campaignUnit) {
        if (campaignUnit == null) {
            bVar.f21054e.mo58046a(bVar.f21055f, "campaignUnit is NULL!", str);
            bVar.f21056g.mo57994a(str);
            return;
        }
        List<CampaignEx> a = bVar.m25220a(str, campaignUnit);
        new Thread(new Runnable() {
            public final void run() {
                C2379j.m5740a((C2374f) C2376g.m5723a(C8687b.this.f21051b)).mo15909b();
                CampaignUnit campaignUnit = campaignUnit;
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    BannerUtils.uisList(C8687b.this.f21051b, campaignUnit.getAds());
                }
            }
        }).start();
        if (a == null || a.size() == 0) {
            bVar.f21054e.mo58046a(bVar.f21055f, "Need show campaign list is NULL!", str);
            bVar.f21056g.mo57994a(str);
            return;
        }
        bVar.f21058i.schedule(new TimerTask() {
            public final void run() {
                if (!C8687b.this.f21057h) {
                    boolean unused = C8687b.this.f21057h = true;
                    C8687b.this.mo58020a(str, -1, "", false);
                }
            }
        }, (long) 60000);
        bVar.f21053d.mo57984a(campaignUnit.getSessionId());
        int i = bVar.f21052c;
        int i2 = 0;
        if (a != null) {
            try {
                if (a.size() > 0) {
                    i += a.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i > bVar.f21053d.mo57986c()) {
            i = 0;
        }
        if (C8556ac.m24738b(str)) {
            bVar.f21053d.mo57983a(i);
        }
        CampaignEx campaignEx = a.get(0);
        String trim = campaignEx.getBannerUrl().trim();
        if (!TextUtils.isEmpty(trim)) {
            if (!TextUtils.isEmpty(trim)) {
                C9563g.m27460a().mo63241a(trim, new C8674e(bVar, str));
            }
            if (a != null && a.size() > 0) {
                while (i2 < a.size()) {
                    a.get(i2).setBannerUrl(campaignEx.getBannerUrl());
                    a.get(i2).setHasMBTplMark(true);
                    i2++;
                }
            }
        } else {
            String trim2 = campaignEx.getBannerHtml().trim();
            if (!TextUtils.isEmpty(trim2)) {
                String a2 = bVar.m25219a(str, trim2);
                if (a != null && a.size() > 0) {
                    while (i2 < a.size()) {
                        a.get(i2).setBannerHtml(a2);
                        a.get(i2).setHasMBTplMark(trim2.contains("<MBTPLMARK>"));
                        i2++;
                    }
                }
            } else {
                bVar.f21061l = true;
                bVar.f21060k = true;
            }
        }
        bVar.m25223a(str, a);
    }
}
