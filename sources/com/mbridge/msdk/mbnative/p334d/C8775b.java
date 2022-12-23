package com.mbridge.msdk.mbnative.p334d;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.click.p057a.C2302a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.p333c.C8738a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.mbridge.msdk.mbnative.d.b */
/* compiled from: NativeReportUtils */
public final class C8775b {
    /* renamed from: a */
    public static synchronized void m25513a(CampaignEx campaignEx, Context context, String str, C8738a aVar) {
        synchronized (C8775b.class) {
            if (!campaignEx.isReport()) {
                campaignEx.setReport(true);
                m25512a(campaignEx, context, str);
                m25515c(campaignEx, context, str);
                List<String> a = m25511a(campaignEx);
                if (a != null) {
                    if (a.size() != 0) {
                        for (int i = 0; i < a.size(); i++) {
                            String str2 = a.get(i);
                            if (!TextUtils.isEmpty(str2)) {
                                C2295a.m5360a(context, campaignEx, str, str2, false, false);
                            }
                        }
                    }
                }
                m25514b(campaignEx, context, str);
            }
            if (aVar != null && !campaignEx.isCallBackImpression()) {
                campaignEx.setCallBackImpression(true);
                aVar.onLoggingImpression(campaignEx.getType());
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m25512a(final CampaignEx campaignEx, final Context context, String str) {
        synchronized (C8775b.class) {
            C2350a.m5601e().mo15778a(context);
            if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
                C8442b.m24388a().execute(new Runnable() {
                    public final void run() {
                        try {
                            C2379j.m5740a((C2374f) C2376g.m5723a(context)).mo15910b(campaignEx.getId());
                        } catch (Exception unused) {
                            C8608u.m24884d("NativeReportUtils", "campain can't insert db");
                        }
                    }
                });
                C2295a.m5361a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, C2302a.f4733g);
            }
            if (!(TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().mo57392i() == null)) {
                C2295a.m5362a(context, campaignEx, str, campaignEx.getNativeVideoTracking().mo57392i(), false, false);
            }
        }
    }

    /* renamed from: b */
    private static synchronized void m25514b(CampaignEx campaignEx, Context context, String str) {
        synchronized (C8775b.class) {
            if (campaignEx != null) {
                try {
                    List<String> pv_urls = campaignEx.getPv_urls();
                    if (pv_urls != null && pv_urls.size() > 0) {
                        for (String a : pv_urls) {
                            C2295a.m5360a(context, campaignEx, str, a, false, true);
                        }
                    }
                } catch (Throwable th) {
                    C8608u.m24880a("NativeReportUtils", th.getMessage());
                }
            }
        }
        return;
    }

    /* renamed from: c */
    private static synchronized void m25515c(CampaignEx campaignEx, Context context, String str) {
        synchronized (C8775b.class) {
            if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && NativeController.f21187c != null && !NativeController.f21187c.containsKey(campaignEx.getOnlyImpressionURL())) {
                NativeController.f21187c.put(campaignEx.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                C2295a.m5361a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, C2302a.f4734h);
            }
        }
    }

    /* renamed from: a */
    private static List<String> m25511a(CampaignEx campaignEx) {
        ArrayList arrayList = new ArrayList();
        if (campaignEx == null) {
            return arrayList;
        }
        String ad_url_list = campaignEx.getAd_url_list();
        if (TextUtils.isEmpty(ad_url_list)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(ad_url_list);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add((String) jSONArray.get(i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
