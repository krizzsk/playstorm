package com.mbridge.msdk.mbbanner.p321a;

import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.tools.C8560af;
import com.mbridge.msdk.mbbanner.common.p322a.C8667b;
import com.mbridge.msdk.mbbanner.common.p323b.C8671b;
import com.mbridge.msdk.mbbanner.common.p323b.C8672c;
import com.mbridge.msdk.mbbanner.common.p324c.C8684a;
import com.mbridge.msdk.mbbanner.common.p324c.C8691c;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C8815a;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2290c;
import com.mbridge.msdk.p054c.C2294d;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbbanner.a.a */
/* compiled from: BannerController */
public final class C8663a {

    /* renamed from: a */
    private static String f20957a = "BannerController";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f20958b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f20959c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public MBridgeIds f20960d;

    /* renamed from: e */
    private boolean f20961e;

    /* renamed from: f */
    private int f20962f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MBBannerView f20963g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f20964h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f20965i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f20966j;

    /* renamed from: k */
    private int f20967k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public BannerAdListener f20968l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public CampaignUnit f20969m;

    /* renamed from: n */
    private C8691c f20970n;

    /* renamed from: o */
    private C2294d f20971o;

    /* renamed from: p */
    private C2290c f20972p;

    /* renamed from: q */
    private boolean f20973q;

    /* renamed from: r */
    private boolean f20974r;

    /* renamed from: s */
    private boolean f20975s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f20976t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f20977u;

    /* renamed from: v */
    private C8672c f20978v = new C8672c() {
        /* renamed from: a */
        public final void mo57957a(List<CampaignEx> list) {
            if (C8663a.this.f20968l != null) {
                C8663a.this.f20968l.onLoadSuccessed(C8663a.this.f20960d);
            }
        }

        /* renamed from: a */
        public final void mo57955a(CampaignEx campaignEx) {
            C8663a.this.mo57950c();
            if (C8663a.this.f20968l != null) {
                C8663a.this.f20968l.onLogImpression(C8663a.this.f20960d);
            }
        }

        /* renamed from: a */
        public final void mo57956a(String str) {
            C8663a.this.m25095b(str);
        }

        /* renamed from: a */
        public final void mo57954a() {
            if (C8663a.this.f20968l != null) {
                C8663a.this.f20968l.onClick(C8663a.this.f20960d);
            }
        }

        /* renamed from: b */
        public final void mo57958b() {
            if (C8663a.this.f20968l != null) {
                C8663a.this.f20968l.onLeaveApp(C8663a.this.f20960d);
            }
        }

        /* renamed from: c */
        public final void mo57959c() {
            if (C8663a.this.f20968l != null) {
                C8663a.this.f20968l.showFullScreen(C8663a.this.f20960d);
                boolean unused = C8663a.this.f20977u = true;
                C8684a.m25209a().mo58014a(2, C8663a.this.f20959c, C8663a.this.f20958b, (C8667b) null, (C8671b) null);
            }
        }

        /* renamed from: d */
        public final void mo57960d() {
            if (C8663a.this.f20968l != null) {
                C8663a.this.f20968l.closeFullScreen(C8663a.this.f20960d);
                boolean unused = C8663a.this.f20977u = false;
                C8684a a = C8684a.m25209a();
                String c = C8663a.this.f20959c;
                String d = C8663a.this.f20958b;
                a.mo58014a(3, c, d, new C8667b(C8663a.this.f20965i + "x" + C8663a.this.f20964h, C8663a.this.f20966j * 1000), C8663a.this.f20979w);
            }
        }

        /* renamed from: e */
        public final void mo57961e() {
            if (C8663a.this.f20968l != null) {
                C8663a.this.f20968l.onCloseBanner(C8663a.this.f20960d);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C8671b f20979w = new C8671b() {
        /* renamed from: a */
        public final void mo57962a(String str, CampaignUnit campaignUnit, boolean z) {
            CampaignUnit unused = C8663a.this.f20969m = campaignUnit;
        }

        /* renamed from: a */
        public final void mo57963a(String str, String str2, boolean z) {
            if (C8663a.this.f20968l != null) {
                C8663a.this.f20968l.onLoadFailed(C8663a.this.f20960d, str2);
            }
            C8663a.this.mo57950c();
            C8542e.m24703a(C2350a.m5601e().mo15792g(), str2, C8663a.this.f20958b, z);
        }

        /* renamed from: a */
        public final void mo57964a(String str, boolean z) {
            if (C8663a.this.f20969m != null) {
                C8542e.m24705a(C2350a.m5601e().mo15792g(), (List<CampaignEx>) C8663a.this.f20969m.getAds(), C8663a.this.f20958b, z);
            }
            if (C8663a.this.f20963g != null) {
                boolean unused = C8663a.this.f20976t = true;
                C8663a.this.m25103g();
            }
        }

        /* renamed from: b */
        public final void mo57965b(String str, boolean z) {
            if (C8663a.this.f20968l != null) {
                C8663a.this.f20968l.onLoadFailed(C8663a.this.f20960d, "banner res load failed");
            }
            C8663a.this.mo57950c();
            C8542e.m24703a(C2350a.m5601e().mo15792g(), "banner res load failed", C8663a.this.f20958b, z);
        }
    };

    /* renamed from: b */
    private int m25093b(int i) {
        if (i <= 0) {
            return i;
        }
        if (i < 10) {
            return 10;
        }
        if (i > 180) {
            return 180;
        }
        return i;
    }

    /* renamed from: a */
    public final String mo57941a() {
        CampaignUnit campaignUnit = this.f20969m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f20969m.getRequestId();
    }

    public C8663a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f20963g = mBBannerView;
        if (bannerSize != null) {
            this.f20964h = bannerSize.getHeight();
            this.f20965i = bannerSize.getWidth();
        }
        this.f20958b = str2;
        this.f20959c = str;
        this.f20960d = new MBridgeIds(str, str2);
        String h = C2350a.m5601e().mo15793h();
        String i = C2350a.m5601e().mo15794i();
        if (this.f20972p == null) {
            this.f20972p = new C2290c();
        }
        this.f20972p.mo15580a(C2350a.m5601e().mo15792g(), h, i, this.f20958b);
        m25101f();
    }

    /* renamed from: a */
    public final void mo57945a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f20964h = bannerSize.getHeight();
            this.f20965i = bannerSize.getWidth();
        }
    }

    /* renamed from: a */
    public final void mo57942a(int i) {
        int b = m25093b(i);
        this.f20967k = b;
        this.f20966j = b;
    }

    /* renamed from: a */
    public final void mo57947a(boolean z) {
        this.f20961e = z;
        this.f20962f = z ? 1 : 2;
    }

    /* renamed from: f */
    private void m25101f() {
        C2294d e = C2283b.m5275a().mo15569e(C2350a.m5601e().mo15793h(), this.f20958b);
        this.f20971o = e;
        if (e == null) {
            this.f20971o = C2294d.m5325d(this.f20958b);
        }
        if (this.f20967k == -1) {
            this.f20966j = m25093b(this.f20971o.mo15586b());
        }
        if (this.f20962f == 0) {
            boolean z = true;
            if (this.f20971o.mo15588c() != 1) {
                z = false;
            }
            this.f20961e = z;
            C8691c cVar = this.f20970n;
            if (cVar != null) {
                cVar.mo58030a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo57946a(String str) {
        if (this.f20964h < 1 || this.f20965i < 1) {
            BannerAdListener bannerAdListener = this.f20968l;
            if (bannerAdListener != null) {
                bannerAdListener.onLoadFailed(this.f20960d, "banner load failed because params are exception");
                return;
            }
            return;
        }
        boolean z = false;
        try {
            z = C8815a.m25647a(C2350a.m5601e().mo15792g());
        } catch (Exception unused) {
        }
        if (!z) {
            BannerAdListener bannerAdListener2 = this.f20968l;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onLoadFailed(this.f20960d, "banner load failed because WebView is not available");
                return;
            }
            return;
        }
        C8667b bVar = new C8667b(this.f20965i + "x" + this.f20964h, this.f20966j * 1000);
        bVar.mo57977a(str);
        bVar.mo57979b(this.f20959c);
        C8684a.m25209a().mo58016a(this.f20959c, this.f20958b, bVar, this.f20979w);
        C8684a.m25209a().mo58014a(1, this.f20959c, this.f20958b, bVar, this.f20979w);
    }

    /* renamed from: a */
    public final void mo57944a(BannerAdListener bannerAdListener) {
        this.f20968l = bannerAdListener;
    }

    /* renamed from: b */
    public final void mo57948b() {
        this.f20975s = true;
        if (this.f20968l != null) {
            this.f20968l = null;
        }
        if (this.f20979w != null) {
            this.f20979w = null;
        }
        if (this.f20978v != null) {
            this.f20978v = null;
        }
        if (this.f20963g != null) {
            this.f20963g = null;
        }
        C8684a.m25209a().mo58014a(4, this.f20959c, this.f20958b, (C8667b) null, (C8671b) null);
        C8684a.m25209a().mo58015a(this.f20958b);
        C8684a.m25209a().mo58017b();
        C8691c cVar = this.f20970n;
        if (cVar != null) {
            cVar.mo58026a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m25103g() {
        if (!this.f20975s && this.f20976t) {
            if (this.f20969m != null) {
                if (this.f20970n == null) {
                    this.f20970n = new C8691c(this.f20963g, this.f20978v, this.f20959c, this.f20958b, this.f20961e, this.f20971o);
                }
                this.f20970n.mo58032b(this.f20973q);
                this.f20970n.mo58033c(this.f20974r);
                this.f20970n.mo58031a(this.f20961e, this.f20962f);
                this.f20970n.mo58029a(this.f20969m);
            } else {
                m25095b("banner show failed because campain is exception");
            }
            this.f20976t = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25095b(String str) {
        BannerAdListener bannerAdListener = this.f20968l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f20960d, str);
        }
        mo57950c();
    }

    /* renamed from: c */
    public final void mo57950c() {
        if (!this.f20975s) {
            m25105h();
            m25101f();
            C8667b bVar = new C8667b(this.f20965i + "x" + this.f20964h, this.f20966j * 1000);
            bVar.mo57979b(this.f20959c);
            C8684a.m25209a().mo58018b(this.f20959c, this.f20958b, bVar, this.f20979w);
        }
    }

    /* renamed from: b */
    public final void mo57949b(boolean z) {
        this.f20973q = z;
        m25107i();
        m25103g();
    }

    /* renamed from: c */
    public final void mo57951c(boolean z) {
        this.f20974r = z;
        m25107i();
    }

    /* renamed from: h */
    private void m25105h() {
        MBBannerView mBBannerView = this.f20963g;
        if (mBBannerView != null) {
            if (!this.f20973q || !this.f20974r || this.f20977u || C8560af.m24752a(mBBannerView)) {
                C8684a.m25209a().mo58014a(2, this.f20959c, this.f20958b, (C8667b) null, (C8671b) null);
            } else {
                C8684a a = C8684a.m25209a();
                String str = this.f20959c;
                String str2 = this.f20958b;
                a.mo58014a(3, str, str2, new C8667b(this.f20965i + "x" + this.f20964h, this.f20966j * 1000), this.f20979w);
            }
            if (!this.f20973q) {
                C8684a.m25209a().mo58014a(4, this.f20959c, this.f20958b, (C8667b) null, (C8671b) null);
                C8684a.m25209a().mo58015a(this.f20958b);
            }
        }
    }

    /* renamed from: i */
    private void m25107i() {
        m25105h();
        C8691c cVar = this.f20970n;
        if (cVar != null) {
            cVar.mo58032b(this.f20973q);
            this.f20970n.mo58033c(this.f20974r);
        }
    }

    /* renamed from: a */
    public final void mo57943a(int i, int i2, int i3, int i4) {
        C8691c cVar = this.f20970n;
        if (cVar != null) {
            cVar.mo58027a(i, i2, i3, i4);
        }
    }

    /* renamed from: d */
    public final void mo57952d() {
        C8684a a = C8684a.m25209a();
        String str = this.f20959c;
        String str2 = this.f20958b;
        a.mo58014a(4, str, str2, new C8667b(this.f20965i + "x" + this.f20964h, this.f20966j * 1000), this.f20979w);
    }

    /* renamed from: e */
    public final void mo57953e() {
        C8684a a = C8684a.m25209a();
        String str = this.f20959c;
        String str2 = this.f20958b;
        a.mo58014a(3, str, str2, new C8667b(this.f20965i + "x" + this.f20964h, this.f20966j * 1000), this.f20979w);
    }
}
