package com.mbridge.msdk.video.module.p367b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8595p;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.module.p368c.C9412a;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.module.b.b */
/* compiled from: VideoViewReport */
public final class C9410b {

    /* renamed from: a */
    public static HashMap<String, ArrayList<String>> f23015a = new HashMap<>();

    /* renamed from: a */
    public static void m26949a(String str) {
        f23015a.remove(str);
    }

    /* renamed from: a */
    public static void m26950a(String str, String str2) {
        try {
            if (C2350a.m5601e().mo15792g() != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C8540a aVar = new C8540a(C2350a.m5601e().mo15792g());
                C8494d a = C8542e.m24691a(str, C2350a.m5601e().mo15792g(), str2);
                a.mo57606a("r_stid", C9549b.m27299a().mo63129b().mo63105a());
                aVar.mo57603c(0, C8487d.m24492a().f20531a, a, new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d("VideoViewReport", str);
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        C8608u.m24884d("VideoViewReport", str);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            C8608u.m24884d("VideoViewReport", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m26943a(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57392i() != null) {
            C2295a.m5362a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57392i(), false, false);
        }
    }

    /* renamed from: b */
    public static void m26951b(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57380c() != null) {
            C2295a.m5362a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57380c(), false, false);
        }
    }

    /* renamed from: c */
    public static void m26952c(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57382d() != null) {
            C2295a.m5362a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57382d(), false, false);
        }
    }

    /* renamed from: d */
    public static void m26953d(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57384e() != null) {
            String campaignUnitId = campaignEx.getCampaignUnitId();
            ArrayList arrayList = f23015a.get(campaignUnitId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                f23015a.put(campaignUnitId, arrayList);
            }
            if (!arrayList.contains(campaignEx.getId())) {
                C2295a.m5362a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57384e(), false, false);
                arrayList.add(campaignEx.getId());
            }
        }
    }

    /* renamed from: a */
    public static void m26944a(Context context, CampaignEx campaignEx, int i, int i2) {
        String str;
        try {
            String[] j = campaignEx.getNativeVideoTracking().mo57394j();
            if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && j != null) {
                String[] strArr = new String[j.length];
                for (int i3 = 0; i3 < j.length; i3++) {
                    String str2 = j[i3];
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("endscreen_type", i);
                    String jSONObject2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        jSONObject2 = C8595p.m24814a(jSONObject2);
                    }
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        str2 = str2 + "&value=" + URLEncoder.encode(jSONObject2);
                    }
                    if (campaignEx.getSpareOfferFlag() == 1) {
                        str = str2 + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2;
                    } else {
                        str = str2 + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2;
                    }
                    strArr[i3] = str;
                }
                C2295a.m5362a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
            }
        } catch (Throwable unused) {
            C8608u.m24884d("VideoViewReport", "reportEndcardshowData error");
        }
    }

    /* renamed from: e */
    public static void m26954e(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57396k() != null) {
            C2295a.m5362a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57396k(), false, false);
        }
    }

    /* renamed from: f */
    public static void m26955f(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57386f() != null) {
            C2295a.m5362a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57386f(), false, false);
        }
    }

    /* renamed from: a */
    public static void m26945a(Context context, CampaignEx campaignEx, int i, int i2, int i3) {
        String str;
        int i4 = i3;
        if (i2 != 0 && context != null && campaignEx != null) {
            try {
                List<Map<Integer, String>> b = campaignEx.getNativeVideoTracking().mo57377b();
                int i5 = ((i + 1) * 100) / i2;
                if (b != null) {
                    int i6 = 0;
                    while (i6 < b.size()) {
                        Map map = b.get(i6);
                        if (map != null && map.size() > 0) {
                            Iterator it = map.entrySet().iterator();
                            int i7 = i6;
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                int intValue = ((Integer) entry.getKey()).intValue();
                                String str2 = (String) entry.getValue();
                                if (campaignEx.getSpareOfferFlag() == 1) {
                                    str = str2 + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i4;
                                } else {
                                    str = str2 + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i4;
                                }
                                if (intValue <= i5 && !TextUtils.isEmpty(str)) {
                                    C2295a.m5362a(context, campaignEx, campaignEx.getCampaignUnitId(), new String[]{str}, false, true);
                                    it.remove();
                                    b.remove(i7);
                                    i7--;
                                }
                            }
                            i6 = i7;
                        }
                        i6++;
                    }
                }
            } catch (Throwable unused) {
                C8608u.m24884d("VideoViewReport", "reportPlayPercentageData error");
            }
        }
    }

    /* renamed from: a */
    public static void m26948a(CampaignEx campaignEx, Map<Integer, String> map, String str, int i) {
        if (campaignEx != null && map != null) {
            try {
                if (map.size() > 0) {
                    Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        String str2 = (String) next.getValue();
                        if (i == ((Integer) next.getKey()).intValue() && !TextUtils.isEmpty(str2)) {
                            C2295a.m5360a(C2350a.m5601e().mo15792g(), campaignEx, str, str2, false, false);
                            it.remove();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m26947a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAdUrlList() != null && campaignEx.getAdUrlList().size() > 0) {
                    for (String next : campaignEx.getAdUrlList()) {
                        if (!TextUtils.isEmpty(next)) {
                            C2295a.m5360a(C2350a.m5601e().mo15792g(), campaignEx, str, next, false, false);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m26946a(CampaignEx campaignEx, C9541c cVar, String str, String str2, String str3) {
        String str4 = "&";
        String str5 = "";
        if (campaignEx != null && cVar != null) {
            try {
                C9412a aVar = new C9412a(C2350a.m5601e().mo15792g());
                C8494d dVar = new C8494d();
                dVar.mo57606a("user_id", C8595p.m24814a(str2));
                dVar.mo57606a("cb_type", "1");
                dVar.mo57606a(CampaignEx.JSON_KEY_REWARD_NAME, cVar.mo63097a());
                dVar.mo57606a(CampaignEx.JSON_KEY_REWARD_AMOUNT, cVar.mo63100b() + str5);
                dVar.mo57606a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                dVar.mo57606a("click_id", campaignEx.getRequestIdNotice());
                if (!TextUtils.isEmpty(str3)) {
                    dVar.mo57606a("extra", str3);
                }
                aVar.mo15557a(str5, dVar);
                String str6 = campaignEx.getHost() + "/addReward?";
                String trim = dVar.mo57604a().trim();
                if (!TextUtils.isEmpty(trim)) {
                    if (!str6.endsWith("?") && !str6.endsWith(str4)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str6);
                        if (!str6.contains("?")) {
                            str4 = "?";
                        }
                        sb.append(str4);
                        str6 = sb.toString();
                    }
                    str5 = str6 + trim;
                }
                String str7 = str5;
                C8608u.m24884d("VideoViewReport", "rewardUrl:" + str7);
                C2295a.m5360a(C2350a.m5601e().mo15792g(), campaignEx, campaignEx.getCampaignUnitId(), str7, false, false);
            } catch (Throwable th) {
                C8608u.m24881a("VideoViewReport", th.getMessage(), th);
            }
        }
    }
}
