package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import com.mbridge.msdk.foundation.entity.C8403d;
import com.mbridge.msdk.foundation.entity.C8410k;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2382m;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import java.io.File;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.foundation.same.report.d */
/* compiled from: ReportController */
public class C8526d {

    /* renamed from: a */
    public static final String f20665a = C8526d.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f20666b;

    /* renamed from: c */
    private int f20667c = 0;

    public C8526d(Context context, int i) {
        this.f20666b = context;
        this.f20667c = i;
    }

    public C8526d(Context context) {
        this.f20666b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo57690a(int i, String str) {
        new C8540a(this.f20666b).mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24692a("event", C8542e.m24693a((Campaign) null, i, "request"), this.f20666b, str), new C8541b() {
            /* renamed from: a */
            public final void mo15651a(String str) {
            }

            /* renamed from: b */
            public final void mo15652b(String str) {
            }
        });
    }

    /* renamed from: a */
    public final void mo57691a(final C8410k kVar, final Boolean bool) {
        if (kVar == null) {
            return;
        }
        if (kVar.mo57422c().equals(ShareTarget.METHOD_GET)) {
            new C8540a(this.f20666b).mo57600a(0, kVar.mo57420b(), (C8494d) null, (C8476e) new C8541b() {
                /* renamed from: b */
                public final void mo15652b(String str) {
                }

                /* renamed from: a */
                public final void mo15651a(String str) {
                    C2382m.m5755a((C2374f) C2376g.m5723a(C8526d.this.f20666b)).mo15918a(kVar.mo57420b());
                    if (bool.booleanValue() && C2382m.m5755a((C2374f) C2376g.m5723a(C8526d.this.f20666b)).mo15922b() > 20) {
                        C2358b.m5644a().mo15828c();
                    }
                }
            });
        } else if (kVar.mo57422c().equals(ShareTarget.METHOD_POST)) {
            C8540a aVar = new C8540a(this.f20666b);
            if (!TextUtils.isEmpty(kVar.mo57424d())) {
                C8494d a = C8542e.m24691a(kVar.mo57424d(), this.f20666b, kVar.mo57416a());
                if (kVar.mo57425e() > 0) {
                    a.mo57606a(TapjoyConstants.TJC_RETRY, kVar.mo57425e() + "");
                }
                aVar.mo57603c(0, kVar.mo57420b(), a, new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C2382m.m5755a((C2374f) C2376g.m5723a(C8526d.this.f20666b)).mo15919a(kVar.mo57424d(), kVar.mo57420b(), kVar.mo57426f());
                        if (bool.booleanValue() && C2382m.m5755a((C2374f) C2376g.m5723a(C8526d.this.f20666b)).mo15917a() > 0) {
                            C2358b.m5644a().mo15828c();
                        }
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        C2382m.m5755a((C2374f) C2376g.m5723a(C8526d.this.f20666b)).mo15920a(kVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo57694a(String str, String str2, String str3) {
        try {
            C8540a aVar = new C8540a(this.f20666b);
            String str4 = "click_type=" + URLEncoder.encode("1", "utf-8") + "&" + BidResponsedEx.KEY_CID + "=" + URLEncoder.encode(str, "utf-8") + "&" + MBridgeConstans.PROPERTIES_UNIT_ID + "=" + URLEncoder.encode(str2, "utf-8") + "&" + SDKConstants.PARAM_KEY + "=" + URLEncoder.encode("2000027", "utf-8") + "&" + "http_url" + "=" + URLEncoder.encode(str3, "utf-8");
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(str4);
                return;
            }
            aVar.mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(str4, this.f20666b, str2), new C8541b() {
                /* renamed from: a */
                public final void mo15651a(String str) {
                }

                /* renamed from: b */
                public final void mo15652b(String str) {
                }
            });
        } catch (Exception e) {
            C8608u.m24884d(f20665a, e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo57693a(String str, final File file) {
        new C8540a(this.f20666b).mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24689a(this.f20666b, str), new C8541b() {
            /* renamed from: b */
            public final void mo15652b(String str) {
            }

            /* renamed from: a */
            public final void mo15651a(String str) {
                File file = file;
                if (file != null) {
                    file.delete();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo57695a(final String str, String str2, String str3, Frame frame) {
        C8540a aVar = new C8540a(this.f20666b);
        C8494d a = C8542e.m24691a(str2, this.f20666b, str3);
        if (frame != null) {
            a.mo57606a("session_id", frame.getSessionId());
            a.mo57606a(CampaignUnit.JSON_KEY_PARENT_SESSION_ID, frame.getParentSessionId());
        }
        aVar.mo57603c(0, C8487d.m24492a().f20531a, a, new C8541b() {
            /* renamed from: b */
            public final void mo15652b(String str) {
            }

            /* renamed from: a */
            public final void mo15651a(String str) {
                if ("click_duration".equals(str) || "load_duration".equals(str)) {
                    C2358b.m5644a().mo15828c();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo57692a(String str, C8403d dVar, String str2) {
        C8540a aVar = new C8540a(this.f20666b);
        String a = C8403d.m24102a(dVar);
        if (!TextUtils.isEmpty(a)) {
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(a);
                return;
            }
            aVar.mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(a, this.f20666b, str2), new C8541b() {
                /* renamed from: a */
                public final void mo15651a(String str) {
                }

                /* renamed from: b */
                public final void mo15652b(String str) {
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo57687a() {
        try {
            if (C8542e.m24708a()) {
                C8540a aVar = new C8540a(this.f20666b);
                String h = C2350a.m5601e().mo15793h();
                C2278a b = C2283b.m5275a().mo15563b(h);
                if (b == null) {
                    b = C2283b.m5275a().mo15562b();
                }
                int E = b.mo15431E();
                String str = "key=2000053&Appid=" + h + "&" + "uptips2" + "=" + b.mo15430D() + "&" + "info_status" + "=" + C2357a.m5633a().mo15822c() + "&" + "iseu" + "=" + E;
                String i = C8596q.m24839i();
                if (!TextUtils.isEmpty(i)) {
                    str = str + "&" + VungleApiClient.GAID + "=" + i;
                }
                String str2 = str + "&" + "GDPR_area" + "=" + b.mo15482au() + "&" + "GDPR_consent" + "=" + C2357a.m5633a().mo15824e();
                if (C8518b.m24607a().mo57681c()) {
                    C8518b.m24607a().mo57679a(str2);
                    return;
                }
                aVar.mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(str2, this.f20666b, ""), new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                    }
                });
                C8542e.m24709b();
            }
        } catch (Throwable th) {
            C8608u.m24884d(f20665a, th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo57689a(int i, int i2, String str, String str2, String str3) {
        try {
            C8540a aVar = new C8540a(this.f20666b);
            StringBuilder sb = new StringBuilder();
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000058", "utf-8"));
            sb.append("&");
            sb.append("appid");
            sb.append("=");
            sb.append(URLEncoder.encode(C2350a.m5601e().mo15793h(), "utf-8"));
            sb.append("&");
            sb.append("dl_type");
            sb.append("=");
            sb.append(URLEncoder.encode(i + "", "utf-8"));
            sb.append("&");
            sb.append("dl_link_type");
            sb.append("=");
            sb.append(URLEncoder.encode(i2 + "", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append("tgt_v");
            sb.append("=");
            sb.append(URLEncoder.encode(C8596q.m24835g(this.f20666b) + "", "utf-8"));
            sb.append("&");
            sb.append("app_v_n");
            sb.append("=");
            sb.append(URLEncoder.encode(C8596q.m24833f(this.f20666b) + "", "utf-8"));
            sb.append("&");
            sb.append("app_v_c");
            sb.append("=");
            sb.append(URLEncoder.encode(C8596q.m24830e(this.f20666b) + "", "utf-8"));
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(sb.toString());
                return;
            }
            aVar.mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(sb.toString(), this.f20666b, ""), new C8541b() {
                /* renamed from: a */
                public final void mo15651a(String str) {
                }

                /* renamed from: b */
                public final void mo15652b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo57697a(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            if (!TextUtils.isEmpty(str5)) {
                C8540a aVar = new C8540a(this.f20666b);
                StringBuilder sb = new StringBuilder();
                if (z) {
                    sb.append("hb=");
                    sb.append(1);
                    sb.append("&");
                }
                sb.append(SDKConstants.PARAM_KEY);
                sb.append("=");
                sb.append(URLEncoder.encode("2000066", "utf-8"));
                sb.append("&");
                sb.append("rid");
                sb.append("=");
                sb.append(URLEncoder.encode(str, "utf-8"));
                sb.append("&");
                sb.append("rid_n");
                sb.append("=");
                sb.append(URLEncoder.encode(str2, "utf-8"));
                sb.append("&");
                sb.append(BidResponsedEx.KEY_CID);
                sb.append("=");
                sb.append(URLEncoder.encode(str3, "utf-8"));
                sb.append("&");
                sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
                sb.append("=");
                sb.append(URLEncoder.encode(str4, "utf-8"));
                sb.append("&");
                sb.append("err_method");
                sb.append("=");
                sb.append(str5);
                if (C8518b.m24607a().mo57681c()) {
                    C8518b.m24607a().mo57679a(sb.toString());
                    return;
                }
                aVar.mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(sb.toString(), this.f20666b, str4), new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo57698b(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            C8540a aVar = new C8540a(this.f20666b);
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("hb=");
                sb.append(1);
                sb.append("&");
            }
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000065", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str4, "utf-8"));
            sb.append("&");
            sb.append("click_url");
            sb.append("=");
            sb.append(URLEncoder.encode(str5, "utf-8"));
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(sb.toString());
                return;
            }
            aVar.mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(sb.toString(), this.f20666b, str4), new C8541b() {
                /* renamed from: a */
                public final void mo15651a(String str) {
                }

                /* renamed from: b */
                public final void mo15652b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo57696a(String str, String str2, String str3, String str4, String str5) {
        try {
            C8540a aVar = new C8540a(this.f20666b);
            StringBuilder sb = new StringBuilder();
            int n = C8596q.m24849n(this.f20666b);
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000071", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str4, "utf-8"));
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_ERROR_REASON);
            sb.append("=");
            sb.append(URLEncoder.encode(str5, "utf-8"));
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(n + "", "utf-8"));
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_RESULT);
            sb.append("=");
            sb.append(URLEncoder.encode("0", "utf-8"));
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(sb.toString());
                return;
            }
            aVar.mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(sb.toString(), this.f20666b, str4), new C8541b() {
                /* renamed from: a */
                public final void mo15651a(String str) {
                }

                /* renamed from: b */
                public final void mo15652b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo57688a(int i, int i2, String str, String str2) {
        try {
            C8540a aVar = new C8540a(this.f20666b);
            StringBuilder sb = new StringBuilder();
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append("2000112");
            sb.append("&");
            sb.append("st_net");
            sb.append("=");
            sb.append(i2);
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_RESULT);
            sb.append("=");
            sb.append(i);
            sb.append("&");
            sb.append("url");
            sb.append("=");
            sb.append(str2);
            sb.append("&");
            sb.append(IronSourceConstants.EVENTS_ERROR_REASON);
            sb.append("=");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            sb.append(str);
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(sb.toString());
                return;
            }
            aVar.mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(sb.toString(), this.f20666b, ""), new C8541b() {
                /* renamed from: a */
                public final void mo15651a(String str) {
                    C8608u.m24880a("", "reportSettingLoadFailed onSuccess");
                }

                /* renamed from: b */
                public final void mo15652b(String str) {
                    C8608u.m24880a("", "reportSettingLoadFailed onFailed:" + str);
                }
            });
        } catch (Throwable unused) {
            C8608u.m24884d(f20665a, "reportSettingLoadFailed onFailed");
        }
    }
}
