package com.mbridge.msdk.click.p058b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8518b;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.vungle.warren.model.Advertisement;
import java.io.File;

/* renamed from: com.mbridge.msdk.click.b.a */
/* compiled from: DspFilterUtils */
public final class C2312a {

    /* renamed from: a */
    public static int f4767a = 1;

    /* renamed from: b */
    public static int f4768b = 2;

    /* renamed from: c */
    public static int f4769c = 1500;

    /* renamed from: d */
    private static String f4770d = "2000109";

    /* renamed from: e */
    private static String f4771e = "DspFilterUtils";

    /* renamed from: a */
    public static boolean m5453a(CampaignEx campaignEx, String str, int i) {
        boolean z = false;
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            if (campaignEx.getFac() != 0) {
                z = true;
            }
            try {
                Context g = C2350a.m5601e().mo15792g();
                if (!(g == null || campaignEx == null)) {
                    if (URLUtil.isFileUrl(str)) {
                        File file = new File(str.replace("file:////", "").replace("file:///", "").replace(Advertisement.FILE_SCHEME, ""));
                        if (file.exists()) {
                            str = C8602s.m24862a(file);
                        }
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=" + f4770d + "&");
                    stringBuffer.append("type=" + i + "&");
                    stringBuffer.append("html=" + str + "&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(g) + "&");
                    stringBuffer.append("unit_id=" + campaignEx.getCampaignUnitId() + "&");
                    String requestId = campaignEx.getRequestId();
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(requestId);
                        stringBuffer.append("&");
                    }
                    if (campaignEx.isBidCampaign()) {
                        stringBuffer.append("hb=");
                        stringBuffer.append("1");
                        stringBuffer.append("&");
                    }
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    if (!TextUtils.isEmpty(requestIdNotice)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(requestIdNotice);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("cid=" + campaignEx.getId());
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        C8542e.m24711b(g, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d(f4771e, th.getMessage());
            }
        }
        return z;
    }
}
