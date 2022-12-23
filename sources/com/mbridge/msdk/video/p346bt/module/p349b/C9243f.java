package com.mbridge.msdk.video.p346bt.module.p349b;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8410k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2382m;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.video.bt.module.b.f */
/* compiled from: RewardReport */
public class C9243f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f22395a = C9243f.class.getName();

    /* renamed from: a */
    private static void m26462a(final Context context, final String str, String str2) {
        if (C2350a.m5601e().mo15792g() != null) {
            context = C2350a.m5601e().mo15792g();
        }
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                C8540a aVar = new C8540a(context);
                C8494d a = C8542e.m24691a(str, context, str2);
                a.mo57606a("r_stid", C9549b.m27299a().mo63129b().mo63105a());
                aVar.mo57603c(0, C8487d.m24492a().f20531a, a, new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d(C9243f.f22395a, str);
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        C8410k kVar = new C8410k();
                        kVar.mo57423c(str);
                        kVar.mo57418a(System.currentTimeMillis());
                        kVar.mo57417a(0);
                        kVar.mo57421b(ShareTarget.METHOD_POST);
                        kVar.mo57419a(C8487d.m24492a().f20531a);
                        C2382m.m5755a((C2374f) C2376g.m5723a(context)).mo15920a(kVar);
                        C8608u.m24884d(C9243f.f22395a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8608u.m24884d(f22395a, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m26460a(Context context, CampaignEx campaignEx, String str) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("reason=&");
                    stringBuffer.append("result=2&");
                    if (campaignEx == null || campaignEx.getAdType() != 287) {
                        if (campaignEx != null) {
                            if (campaignEx.getAdType() == 94) {
                                stringBuffer.append("ad_type=1&");
                            }
                        }
                        stringBuffer.append("ad_type=1&");
                    } else {
                        stringBuffer.append("ad_type=3&");
                    }
                    String str2 = campaignEx.getendcard_url();
                    if (!TextUtils.isEmpty(str2)) {
                        stringBuffer.append("creative=" + URLEncoder.encode(str2) + "&");
                    }
                    stringBuffer.append("devid=" + C8596q.m24839i() + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                        stringBuffer.append("&");
                        stringBuffer.append("&adspace_t=");
                        stringBuffer.append(campaignEx.getAdSpaceT());
                    }
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m26462a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m26461a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null && campaignEx != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("result=1&");
                    if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                        stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                    }
                    stringBuffer.append("devid=" + C8596q.m24839i() + "&");
                    if (campaignEx == null || campaignEx.getAdType() != 287) {
                        if (campaignEx != null) {
                            if (campaignEx.getAdType() == 94) {
                                stringBuffer.append("ad_type=1&");
                            }
                        }
                        stringBuffer.append("ad_type=1&");
                    } else {
                        stringBuffer.append("ad_type=3&");
                    }
                    if (campaignEx != null) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                        stringBuffer.append("&");
                        stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                    }
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m26462a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
