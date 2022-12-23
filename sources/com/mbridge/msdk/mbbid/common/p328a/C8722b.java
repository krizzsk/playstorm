package com.mbridge.msdk.mbbid.common.p328a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.common.p329b.C8725a;
import com.mbridge.msdk.mbbid.common.p330c.C8727a;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.mbbid.common.a.b */
/* compiled from: RequesManager */
public final class C8722b {

    /* renamed from: a */
    private String f21142a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f21143b;

    /* renamed from: c */
    private String f21144c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f21145d;

    /* renamed from: e */
    private BidListennning f21146e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public BidResponsedEx f21147f;

    /* renamed from: g */
    private int f21148g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f21149h = false;

    /* renamed from: i */
    private long f21150i;

    /* renamed from: j */
    private long f21151j;

    /* renamed from: k */
    private boolean f21152k;

    /* renamed from: l */
    private int f21153l;

    /* renamed from: a */
    public final void mo58063a(boolean z) {
        this.f21152k = z;
    }

    /* renamed from: a */
    public final void mo58060a(int i) {
        this.f21153l = i;
    }

    /* renamed from: b */
    public final void mo58064b(int i) {
        this.f21148g = i;
    }

    /* renamed from: a */
    public final void mo58061a(long j) {
        this.f21150i = j;
    }

    /* renamed from: b */
    public final void mo58065b(long j) {
        this.f21151j = j;
    }

    public C8722b(String str, String str2, String str3) {
        this.f21142a = str;
        this.f21143b = str2;
        this.f21144c = str3;
        this.f21145d = C2350a.m5601e().mo15792g();
    }

    /* renamed from: b */
    public final void mo58066b(boolean z) {
        try {
            if (!this.f21149h) {
                this.f21149h = true;
                if (this.f21145d == null) {
                    m25315a("context is null");
                }
                C8725a aVar = new C8725a(this.f21145d);
                C8494d dVar = new C8494d();
                String h = C2350a.m5601e().mo15793h();
                dVar.mo57606a("app_id", h);
                dVar.mo57606a("sign", SameMD5.getMD5(h + C2350a.m5601e().mo15794i()));
                dVar.mo57606a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21143b);
                if (!TextUtils.isEmpty(this.f21142a)) {
                    dVar.mo57606a(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, this.f21142a);
                }
                dVar.mo57606a("bid_floor", this.f21144c);
                dVar.mo57606a(C8494d.f20562c, C8613y.m24931b(this.f21145d, this.f21143b));
                dVar.mo57606a(C8494d.f20561b, C8417d.m24306a(this.f21143b, ""));
                String str = "1";
                dVar.mo57606a("req_type", this.f21152k ? str : "2");
                dVar.mo57606a("orientation", C8596q.m24828d(this.f21145d) + "");
                if (this.f21148g == 296) {
                    if (this.f21150i <= 0 || this.f21151j <= 0) {
                        m25315a("bid required param is missing or error");
                        return;
                    }
                    dVar.mo57606a(CampaignUnit.JSON_KEY_UNIT_SIZE, this.f21151j + "x" + this.f21150i);
                    Method method = Class.forName("com.mbridge.msdk.mbbanner.common.util.BannerUtils").getMethod("getCloseIds", new Class[]{String.class});
                    if (method.invoke((Object) null, new Object[]{this.f21143b}) instanceof String) {
                        dVar.mo57606a("close_id", method.invoke((Object) null, new Object[]{this.f21143b}).toString());
                    }
                } else if (this.f21148g == 297) {
                    if (this.f21150i <= 0 || this.f21151j <= 0) {
                        m25315a("ad display area is too small");
                        return;
                    }
                    dVar.mo57606a(CampaignUnit.JSON_KEY_UNIT_SIZE, this.f21151j + "x" + this.f21150i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f21153l);
                    sb.append("");
                    dVar.mo57606a("orientation", sb.toString());
                } else if (this.f21148g != 298) {
                    if (!z) {
                        str = "0";
                    }
                    dVar.mo57606a("rw_plus", str);
                } else if (this.f21150i <= 0 || this.f21151j <= 0) {
                    m25315a("bid required param is missing or error");
                    return;
                } else {
                    dVar.mo57606a(CampaignUnit.JSON_KEY_UNIT_SIZE, this.f21151j + "x" + this.f21150i);
                }
                C87231 r15 = new C8721a(this.f21142a, this.f21143b) {
                    /* renamed from: a */
                    public final void mo58068a(BidResponsedEx bidResponsedEx) {
                        boolean unused = C8722b.this.f21149h = false;
                        BidResponsedEx unused2 = C8722b.this.f21147f = bidResponsedEx;
                        C8727a.m25333a(C8722b.this.f21145d, C8722b.this.f21143b, bidResponsedEx.getBidId());
                        C8722b.m25313a(C8722b.this, (BidResponsed) bidResponsedEx);
                    }

                    /* renamed from: a */
                    public final void mo58067a(int i, String str) {
                        boolean unused = C8722b.this.f21149h = false;
                        C8727a.m25334b(C8722b.this.f21145d, C8722b.this.f21143b, str);
                        C8722b.this.m25315a(str);
                    }
                };
                r15.f20497d = this.f21143b;
                r15.f20498e = this.f21142a;
                aVar.mo57600a(1, C8487d.m24492a().mo57591a(false, ""), dVar, (C8476e) r15);
                return;
            }
            m25315a("current unit is biding");
        } catch (Exception unused) {
            m25315a("banner module is miss");
        } catch (Throwable th) {
            m25315a(th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo58062a(BidListennning bidListennning) {
        this.f21146e = bidListennning;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25315a(String str) {
        BidListennning bidListennning = this.f21146e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25313a(C8722b bVar, BidResponsed bidResponsed) {
        BidListennning bidListennning = bVar.f21146e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
