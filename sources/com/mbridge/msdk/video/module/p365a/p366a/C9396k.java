package com.mbridge.msdk.video.module.p365a.p366a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.click.p057a.C2302a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.entity.C8402c;
import com.mbridge.msdk.foundation.entity.C8404e;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2369b;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2378i;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.p066db.C2385p;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.same.report.C8524c;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.video.module.p367b.C9410b;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.p370a.C9538a;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.module.a.a.k */
/* compiled from: StatisticsOnNotifyListener */
public class C9396k extends C9391f {

    /* renamed from: a */
    protected boolean f22973a;

    /* renamed from: b */
    protected CampaignEx f22974b;

    /* renamed from: c */
    protected boolean f22975c = false;

    /* renamed from: d */
    protected C9552a f22976d;

    /* renamed from: e */
    protected C9541c f22977e;

    /* renamed from: f */
    protected String f22978f;

    /* renamed from: g */
    protected String f22979g;

    /* renamed from: h */
    protected C9384a f22980h = new C9391f();

    /* renamed from: i */
    protected int f22981i = 1;

    /* renamed from: j */
    private boolean f22982j = false;

    /* renamed from: k */
    private boolean f22983k = false;

    /* renamed from: l */
    private boolean f22984l = false;

    public C9396k(CampaignEx campaignEx, C9552a aVar, C9541c cVar, String str, String str2, C9384a aVar2, int i, boolean z) {
        if (!z && campaignEx != null && C8556ac.m24738b(str2) && aVar != null && aVar2 != null) {
            this.f22974b = campaignEx;
            this.f22979g = str;
            this.f22978f = str2;
            this.f22976d = aVar;
            this.f22977e = cVar;
            this.f22980h = aVar2;
            this.f22973a = true;
            this.f22981i = i;
            this.f22975c = false;
        } else if (z && campaignEx != null && C8556ac.m24738b(str2) && aVar2 != null) {
            this.f22974b = campaignEx;
            this.f22979g = str;
            this.f22978f = str2;
            this.f22976d = aVar;
            this.f22977e = cVar;
            this.f22980h = aVar2;
            this.f22973a = true;
            this.f22981i = i;
            this.f22975c = true;
        }
    }

    /* renamed from: a */
    public void mo62252a(int i, Object obj) {
        super.mo62252a(i, obj);
        this.f22980h.mo62252a(i, obj);
    }

    /* renamed from: a */
    public final void mo62782a(int i) {
        if (this.f22974b == null) {
            return;
        }
        if (i == 1 || i == 2) {
            C9410b.m26944a(C2350a.m5601e().mo15792g(), this.f22974b, i, this.f22981i);
        }
    }

    /* renamed from: a */
    public final void mo62781a() {
        if (this.f22973a && this.f22974b != null) {
            C8412m mVar = new C8412m("2000061", this.f22974b.getId(), this.f22974b.getRequestId(), this.f22974b.getRequestIdNotice(), this.f22978f, C8596q.m24849n(C2350a.m5601e().mo15792g()));
            mVar.mo57439a(this.f22974b.isMraid() ? C8412m.f20281a : C8412m.f20282b);
            C8524c.m24639b(mVar, C2350a.m5601e().mo15792g(), this.f22978f);
        }
    }

    /* renamed from: a */
    public final void mo62783a(int i, String str) {
        if (this.f22974b != null) {
            C8524c.m24641c(new C8412m("2000062", this.f22974b.getId(), this.f22974b.getRequestId(), this.f22974b.getRequestIdNotice(), this.f22978f, C8596q.m24849n(C2350a.m5601e().mo15792g()), i, str), C2350a.m5601e().mo15792g(), this.f22978f);
        }
    }

    /* renamed from: b */
    public final void mo62786b(int i) {
        CampaignEx campaignEx = this.f22974b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i == 1 || i == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i);
                    }
                    noticeUrl = sb.toString();
                } else if (i == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f22974b.setNoticeUrl(noticeUrl);
            }
        }
    }

    /* renamed from: b */
    public final void mo62785b() {
        C93971 r0 = new Runnable() {
            public final void run() {
                try {
                    if (C9396k.this.f22973a && C9396k.this.f22974b != null && C8556ac.m24738b(C9396k.this.f22978f) && C2350a.m5601e().mo15792g() != null) {
                        C2378i a = C2378i.m5736a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                        C8404e eVar = new C8404e();
                        eVar.mo57338a(System.currentTimeMillis());
                        eVar.mo57341b(C9396k.this.f22978f);
                        eVar.mo57339a(C9396k.this.f22974b.getId());
                        a.mo15904a(eVar);
                    }
                } catch (Throwable th) {
                    C8608u.m24881a("NotifyListener", th.getMessage(), th);
                }
            }
        };
        if (C2358b.m5644a().mo15829d()) {
            C8442b.m24388a().execute(r0);
        } else {
            r0.run();
        }
    }

    /* renamed from: c */
    public final void mo62787c() {
        try {
            C93982 r0 = new Runnable() {
                public final void run() {
                    try {
                        if (C9396k.this.f22973a && C9396k.this.f22974b != null && C8556ac.m24738b(C9396k.this.f22978f)) {
                            C9538a.m27238a().mo63083a(C9396k.this.f22974b, C9396k.this.f22978f);
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        C9538a.m27238a().mo63094c(C9396k.this.f22979g, C9396k.this.f22974b.getAdType());
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    } catch (Throwable th) {
                        C8608u.m24880a("NotifyListener", th.getMessage());
                    }
                }
            };
            if (C2358b.m5644a().mo15829d()) {
                C8442b.m24388a().execute(r0);
            } else {
                r0.run();
            }
        } catch (Throwable th) {
            C8608u.m24881a("NotifyListener", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62788d() {
        C9552a aVar = this.f22976d;
        if (aVar != null) {
            aVar.mo63203b(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo62789e() {
        String str;
        try {
            if (this.f22974b != null && this.f22974b.isDynamicView() && this.f22975c && !this.f22974b.isCampaignIsFiltered()) {
                this.f22983k = true;
            } else if (this.f22973a && !TextUtils.isEmpty(this.f22974b.getOnlyImpressionURL()) && C8417d.f20351a != null && !C8417d.f20351a.containsKey(this.f22974b.getOnlyImpressionURL()) && !this.f22983k) {
                C8417d.f20351a.put(this.f22974b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                String onlyImpressionURL = this.f22974b.getOnlyImpressionURL();
                if (this.f22974b.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + this.f22974b.getCbt() + "&tmorl=" + this.f22981i;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + this.f22974b.getCbt() + "&tmorl=" + this.f22981i;
                }
                String str2 = str;
                if (!this.f22975c || this.f22974b.isCampaignIsFiltered()) {
                    C2295a.m5361a(C2350a.m5601e().mo15792g(), this.f22974b, this.f22978f, str2, false, true, C2302a.f4734h);
                    mo62787c();
                }
                this.f22983k = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo62790f() {
        String str;
        try {
            if (this.f22973a && !this.f22982j && !TextUtils.isEmpty(this.f22974b.getImpressionURL())) {
                this.f22982j = true;
                if (this.f22974b.isBidCampaign() && this.f22974b != null) {
                    HashMap hashMap = new HashMap();
                    List<C8402c> b = C2369b.m5662a(C2350a.m5601e().mo15792g()).mo15850b(this.f22974b.getCampaignUnitId(), this.f22974b.getRequestId());
                    if (!(b == null || b.size() <= 0 || b.get(0) == null)) {
                        if (b.get(0).mo57315d() == 1) {
                            hashMap.put("encrypt_p=", "encrypt_p=" + b.get(0).mo57310b());
                            hashMap.put("irlfa=", "irlfa=" + 1);
                            for (Map.Entry entry : hashMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                String str3 = (String) entry.getValue();
                                this.f22974b.setImpressionURL(this.f22974b.getImpressionURL().replaceAll(str2, str3));
                                this.f22974b.setOnlyImpressionURL(this.f22974b.getOnlyImpressionURL().replaceAll(str2, str3));
                            }
                        }
                        C8608u.m24880a("BidReplaceCampignDao", "removeReplace count " + C2369b.m5662a(C2350a.m5601e().mo15792g()).mo15846a(this.f22974b.getRequestId()));
                    }
                }
                String impressionURL = this.f22974b.getImpressionURL();
                if (this.f22974b.getSpareOfferFlag() == 1) {
                    str = impressionURL + "&to=1&cbt=" + this.f22974b.getCbt() + "&tmorl=" + this.f22981i;
                } else {
                    str = impressionURL + "&to=0&cbt=" + this.f22974b.getCbt() + "&tmorl=" + this.f22981i;
                }
                C2295a.m5361a(C2350a.m5601e().mo15792g(), this.f22974b, this.f22978f, str, false, true, C2302a.f4733g);
                C9410b.m26943a(C2350a.m5601e().mo15792g(), this.f22974b);
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C2379j.m5740a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g())).mo15910b(C9396k.this.f22974b.getId());
                        } catch (Throwable th) {
                            C8608u.m24881a("NotifyListener", th.getMessage(), th);
                        }
                    }
                }).start();
                if (this.f22973a && C8417d.f20354d != null && !TextUtils.isEmpty(this.f22974b.getId())) {
                    C8417d.m24308a(this.f22978f, this.f22974b, "reward");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            C8608u.m24881a("NotifyListener", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo62791g() {
        List<String> pv_urls;
        try {
            if (this.f22973a && !this.f22984l && this.f22974b != null) {
                this.f22984l = true;
                if ((!this.f22974b.isDynamicView() || !this.f22975c || this.f22974b.isCampaignIsFiltered()) && (pv_urls = this.f22974b.getPv_urls()) != null && pv_urls.size() > 0) {
                    for (String a : pv_urls) {
                        C2295a.m5360a(C2350a.m5601e().mo15792g(), this.f22974b, this.f22978f, a, false, true);
                    }
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d("NotifyListener", th.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo62792h() {
        CampaignEx campaignEx = this.f22974b;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && this.f22974b.getNativeVideoTracking() != null && this.f22974b.getNativeVideoTracking().mo57390h() != null) {
            Context g = C2350a.m5601e().mo15792g();
            CampaignEx campaignEx2 = this.f22974b;
            C2295a.m5362a(g, campaignEx2, campaignEx2.getCampaignUnitId(), this.f22974b.getNativeVideoTracking().mo57390h(), false, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62784a(String str) {
        try {
            if (this.f22973a) {
                C2385p a = C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                C8412m mVar = null;
                if (!TextUtils.isEmpty(this.f22974b.getNoticeUrl())) {
                    int n = C8596q.m24849n(C2350a.m5601e().mo15792g());
                    mVar = new C8412m("2000021", n, this.f22974b.getNoticeUrl(), str, C8596q.m24818a(C2350a.m5601e().mo15792g(), n));
                } else if (!TextUtils.isEmpty(this.f22974b.getClickURL())) {
                    int n2 = C8596q.m24849n(C2350a.m5601e().mo15792g());
                    mVar = new C8412m("2000021", n2, this.f22974b.getClickURL(), str, C8596q.m24818a(C2350a.m5601e().mo15792g(), n2));
                }
                if (mVar != null) {
                    mVar.mo57469n(this.f22974b.getId());
                    mVar.mo57451e(this.f22974b.getVideoUrlEncode());
                    mVar.mo57473p(str);
                    mVar.mo57463k(this.f22974b.getRequestId());
                    mVar.mo57465l(this.f22974b.getRequestIdNotice());
                    mVar.mo57467m(this.f22978f);
                    a.mo15934a(mVar);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
