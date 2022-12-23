package com.mbridge.msdk.mbbanner.common.p325d;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8524c;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.mbbanner.common.p322a.C8666a;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.mbbanner.common.d.a */
/* compiled from: BannerReport */
public final class C8704a {
    /* renamed from: a */
    public static void m25294a(String str, CampaignEx campaignEx, String str2) {
        try {
            C8540a aVar = new C8540a(C2350a.m5601e().mo15792g());
            StringBuilder sb = new StringBuilder();
            if (campaignEx.isBidCampaign()) {
                sb.append("hb=");
                sb.append(1);
                sb.append("&");
            }
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000070", "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getId(), "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("click_url");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(String.valueOf(C8596q.m24849n(C2350a.m5601e().mo15792g())), "utf-8"));
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(sb.toString());
                return;
            }
            aVar.mo57603c(0, C8487d.m24492a().f20531a, C8542e.m24691a(sb.toString(), C2350a.m5601e().mo15792g(), str), new C8541b() {
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
    public static void m25293a(C8666a aVar, String str) {
        if (aVar != null) {
            aVar.mo57967a("2000068");
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(aVar.mo57970b());
            } else {
                C8524c.m24638a(aVar.mo57970b(), C2350a.m5601e().mo15792g(), str);
            }
        }
    }
}
