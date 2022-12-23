package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.messaging.Constants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import com.mbridge.msdk.foundation.entity.C8410k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2382m;
import com.mbridge.msdk.foundation.same.net.C8447Aa;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8554aa;
import com.mbridge.msdk.foundation.tools.C8595p;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.e */
/* compiled from: ReportUtil */
public class C8542e extends C8516a {

    /* renamed from: a */
    public static final String f20688a = C8542e.class.getSimpleName();

    /* renamed from: c */
    private static String m24713c(Context context, String str) {
        if (context == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pf", "1");
            jSONObject.put("ov", C8596q.m24832f());
            jSONObject.put("pn", C8596q.m24843k(context));
            jSONObject.put("vn", C8596q.m24833f(context));
            jSONObject.put("vc", C8596q.m24830e(context));
            jSONObject.put("ot", C8596q.m24828d(context));
            jSONObject.put("dm", C8596q.m24817a());
            jSONObject.put("bd", C8596q.m24825c());
            jSONObject.put(VungleApiClient.GAID, C8596q.m24839i());
            int n = C8596q.m24849n(context);
            jSONObject.put("nt", n);
            jSONObject.put("nts", C8596q.m24818a(context, n));
            jSONObject.put("l", C8596q.m24826c(context));
            jSONObject.put("tz", C8596q.m24831e());
            jSONObject.put("ua", C8596q.m24829d());
            jSONObject.put("app_id", C2350a.m5601e().mo15793h());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sv", MBConfiguration.SDK_VERSION);
            jSONObject.put("ss", C8596q.m24837h(context) + "x" + C8596q.m24838i(context));
            if (C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h()) != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    String k = C8596q.m24842k();
                    if (!TextUtils.isEmpty(k)) {
                        jSONObject2.put("manufacturer", k);
                    }
                    int h = C8596q.m24836h();
                    if (h != -1) {
                        jSONObject2.put("sdkint", h);
                    }
                    String o = C8596q.m24851o(context);
                    if (!TextUtils.isEmpty(o)) {
                        jSONObject2.put("is24H", o);
                    }
                    String l = C8596q.m24844l();
                    if (!TextUtils.isEmpty(l)) {
                        jSONObject2.put("totalram", l);
                    }
                    String p = C8596q.m24853p(context);
                    if (!TextUtils.isEmpty(p)) {
                        jSONObject2.put("totalmemory", p);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!TextUtils.isEmpty(jSONObject2.toString())) {
                    String a = C8595p.m24814a(jSONObject2.toString());
                    if (!TextUtils.isEmpty(a)) {
                        jSONObject.put("dvi", URLEncoder.encode(a, "utf-8"));
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e3) {
            e3.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m24693a(Campaign campaign, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put("action", str);
            jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, i);
            if (campaign != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put("title", campaign.getAppName());
                jSONObject.put("value", jSONObject2);
            } else {
                jSONObject.put("value", "");
            }
        } catch (Exception e) {
            C8608u.m24884d(f20688a, e.getMessage());
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static C8494d m24692a(String str, String str2, Context context, String str3) {
        String str4;
        if (context != null) {
            context = context.getApplicationContext();
        }
        C8494d dVar = new C8494d();
        dVar.mo57606a("m_device_info", m24713c(context, str3));
        dVar.mo57606a("m_action", str);
        try {
            if (!TextUtils.isEmpty(str2)) {
                String a = C8447Aa.m24392a();
                String str5 = "";
                if (a == null) {
                    a = str5;
                }
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("channel", a);
                String str6 = C2350a.f4905c.get(str3);
                if (!TextUtils.isEmpty(str6)) {
                    if (str6 != null) {
                        str5 = str6;
                    }
                    jSONObject.put("u_stid", str5);
                }
                str4 = jSONObject.toString();
            } else {
                JSONObject jSONObject2 = new JSONObject();
                String str7 = C2350a.f4905c.get(str3);
                if (!TextUtils.isEmpty(str7)) {
                    jSONObject2.put("u_stid", str7);
                }
                str4 = jSONObject2.toString();
            }
            str2 = str4;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        dVar.mo57606a("m_data", str2);
        dVar.mo57606a("m_sdk", "msdk");
        return dVar;
    }

    /* renamed from: a */
    public static C8494d m24688a(Context context) {
        C8494d dVar = new C8494d();
        try {
            dVar.mo57606a(TapjoyConstants.TJC_PLATFORM, "1");
            dVar.mo57606a(CampaignEx.JSON_KEY_PACKAGE_NAME, URLEncoder.encode(C8596q.m24843k(context)));
            if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                dVar.mo57606a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
                dVar.mo57606a("brand", URLEncoder.encode(C8596q.m24825c()));
                dVar.mo57606a(DeviceRequestsHelper.DEVICE_INFO_MODEL, URLEncoder.encode(C8596q.m24817a()));
                dVar.mo57606a(VungleApiClient.GAID, C8596q.m24839i());
                int n = C8596q.m24849n(context);
                dVar.mo57606a("network_type", n + "");
                dVar.mo57606a("network_str", C8596q.m24818a(context, n));
                dVar.mo57606a("language", URLEncoder.encode(C8596q.m24826c(context)));
                dVar.mo57606a(TapjoyConstants.TJC_DEVICE_TIMEZONE, URLEncoder.encode(C8596q.m24831e()));
                dVar.mo57606a("ua", URLEncoder.encode(C8596q.m24829d()));
            }
            dVar.mo57606a("sdk_version", MBConfiguration.SDK_VERSION);
            dVar.mo57606a("app_version_name", URLEncoder.encode(C8596q.m24833f(context)));
            dVar.mo57606a("orientation", URLEncoder.encode(C8596q.m24828d(context) + ""));
            dVar.mo57606a("screen_size", C8596q.m24837h(context) + "x" + C8596q.m24838i(context));
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b == null) {
                b = C2283b.m5275a().mo15562b();
            }
            if (b != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                        String k = C8596q.m24842k();
                        if (!TextUtils.isEmpty(k)) {
                            jSONObject.put("manufacturer", k);
                        }
                        int h = C8596q.m24836h();
                        if (h != -1) {
                            jSONObject.put("sdkint", h);
                        }
                        String o = C8596q.m24851o(context);
                        if (!TextUtils.isEmpty(o)) {
                            jSONObject.put("is24H", o);
                        }
                        String l = C8596q.m24844l();
                        if (!TextUtils.isEmpty(l)) {
                            jSONObject.put("totalram", l);
                        }
                        String p = C8596q.m24853p(context);
                        if (!TextUtils.isEmpty(p)) {
                            jSONObject.put("totalmemory", p);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String a = C8595p.m24814a(jSONObject.toString());
                    if (!TextUtils.isEmpty(a)) {
                        dVar.mo57606a("dvi", a);
                    }
                }
            }
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                e3.printStackTrace();
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public static C8494d m24689a(Context context, String str) {
        C8494d a = m24688a(context);
        a.mo57606a("app_id", C2350a.m5601e().mo15793h() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                a.mo57606a("data", URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    /* renamed from: a */
    public static C8494d m24691a(String str, Context context, String str2) {
        C8494d a = m24688a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(C2350a.m5601e().mo15793h());
        String str3 = "";
        sb.append(str3);
        a.mo57606a("app_id", sb.toString());
        a.mo57606a(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
        try {
            if (!TextUtils.isEmpty(str2)) {
                String str4 = C2350a.f4905c.get(str2);
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("&");
                    sb2.append("u_stid");
                    sb2.append("=");
                    if (str4 != null) {
                        str3 = str4;
                    }
                    sb2.append(str3);
                    str = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("u_stid=");
                    if (str4 != null) {
                        str3 = str4;
                    }
                    sb3.append(str3);
                    str = sb3.toString();
                }
            }
            a.mo57606a("data", URLEncoder.encode(str, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        a.mo57606a("m_sdk", "msdk");
        return a;
    }

    /* renamed from: a */
    public static C8494d m24690a(String str, Context context) {
        C8494d a = m24688a(context);
        a.mo57606a("app_id", C2350a.m5601e().mo15793h() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                a.mo57606a("data", URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        a.mo57606a("m_sdk", "msdk");
        return a;
    }

    /* renamed from: a */
    public static String m24694a(String str, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("key=" + str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                sb.append("&" + ((String) next.getKey()) + "=" + next.getValue());
            }
        }
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m24708a() {
        try {
            if (System.currentTimeMillis() - 86400000 > ((Long) C8554aa.m24733b(C2350a.m5601e().mo15792g(), "privateAuthorityTimesTamp", 0L)).longValue()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static void m24709b() {
        try {
            C8554aa.m24732a(C2350a.m5601e().mo15792g(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m24703a(Context context, String str, String str2, boolean z) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000047&");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = C2350a.f4905c.get(str2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("u_stid=");
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb.append(str3);
                        sb.append("&");
                        stringBuffer.append(sb.toString());
                    }
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("hb=");
                    stringBuffer.append(z ? 1 : 0);
                    stringBuffer.append("&");
                    stringBuffer.append("reason=" + str);
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24714d(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24704a(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000104&");
                    if (!TextUtils.isEmpty(str2)) {
                        String str7 = C2350a.f4905c.get(str2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("u_stid=");
                        if (str7 == null) {
                            str7 = "";
                        }
                        sb.append(str7);
                        sb.append("&");
                        stringBuffer.append(sb.toString());
                    }
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid=" + str3 + "&");
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        stringBuffer.append("rid_n=" + str4 + "&");
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        stringBuffer.append("cid=" + str4 + "&");
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        stringBuffer.append("template_id=" + str6 + "&");
                    }
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("hb=");
                    stringBuffer.append(z ? 1 : 0);
                    stringBuffer.append("&");
                    stringBuffer.append("reason=" + str);
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24714d(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24705a(Context context, List<CampaignEx> list, String str, boolean z) {
        if (context != null && list != null) {
            try {
                if (list.size() > 0 && !TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000048&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    CampaignEx campaignEx = list.get(0);
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    if (z) {
                        stringBuffer.append("hb=");
                        stringBuffer.append(1);
                        stringBuffer.append("&");
                    }
                    String requestId = campaignEx.getRequestId();
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(requestId);
                        stringBuffer.append("&");
                    }
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    if (!TextUtils.isEmpty(requestIdNotice)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(requestIdNotice);
                        stringBuffer.append("&");
                    }
                    StringBuilder sb = new StringBuilder("rtins_type=");
                    for (int i = 0; i < list.size(); i++) {
                        CampaignEx campaignEx2 = list.get(i);
                        if (i < list.size() - 1) {
                            sb.append(campaignEx2.getRtinsType());
                            sb.append(",");
                        } else {
                            sb.append(campaignEx2.getRtinsType());
                        }
                    }
                    stringBuffer.append(sb);
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24700a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d(f20688a, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m24696a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=");
                    stringBuffer.append(C8596q.m24849n(context));
                    stringBuffer.append("&");
                    stringBuffer.append("unit_id=");
                    stringBuffer.append(str);
                    stringBuffer.append("&");
                    stringBuffer.append("cid=");
                    stringBuffer.append(campaignEx.getId());
                    stringBuffer.append("&");
                    stringBuffer.append("reason=&");
                    stringBuffer.append("result=2&");
                    if (!TextUtils.isEmpty(str2)) {
                        stringBuffer.append(str2);
                    }
                    if (campaignEx.getAdType() == 287) {
                        stringBuffer.append("creative=");
                        stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                        stringBuffer.append("&");
                        stringBuffer.append("ad_type=3&");
                    } else if (campaignEx.getAdType() == 94) {
                        stringBuffer.append("creative=");
                        stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                        stringBuffer.append("&");
                        stringBuffer.append("ad_type=1&");
                    } else if (campaignEx.getAdType() == 296) {
                        stringBuffer.append("ad_type=5&");
                        stringBuffer.append("creative=");
                        stringBuffer.append(campaignEx.getCreativeId());
                        stringBuffer.append("&");
                    } else if (campaignEx.getAdType() == 297) {
                        stringBuffer.append("ad_type=6&");
                        stringBuffer.append("creative=");
                        stringBuffer.append(campaignEx.getCreativeId());
                        stringBuffer.append("&");
                    } else if (campaignEx.getAdType() == 298) {
                        stringBuffer.append("ad_type=7&");
                        stringBuffer.append("creative=");
                        stringBuffer.append(campaignEx.getCreativeId());
                        stringBuffer.append("&");
                    } else {
                        stringBuffer.append("creative=");
                        stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                        stringBuffer.append("&");
                        stringBuffer.append("ad_type=1&");
                    }
                    stringBuffer.append("devid=");
                    stringBuffer.append(C8596q.m24839i());
                    stringBuffer.append("&");
                    if (campaignEx != null) {
                        if (campaignEx.isBidCampaign()) {
                            stringBuffer.append("hb=1&");
                        }
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(campaignEx.getRequestIdNotice());
                        stringBuffer.append("&");
                        stringBuffer.append("adspace_t=");
                        stringBuffer.append(campaignEx.getAdSpaceT());
                    }
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24700a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m24710b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("result=1&");
                    stringBuffer.append("devid=" + C8596q.m24839i() + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("cid=" + campaignEx.getId() + "&");
                        if (campaignEx.getAdType() == 287) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=3&");
                        } else if (campaignEx.getAdType() == 94) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        } else if (campaignEx.getAdType() == 296) {
                            stringBuffer.append("ad_type=5&");
                            stringBuffer.append("creative=" + campaignEx.getCreativeId() + "&");
                        } else if (campaignEx.getAdType() == 297) {
                            stringBuffer.append("ad_type=6&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else if (campaignEx.getAdType() == 298) {
                            stringBuffer.append("ad_type=7&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        }
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    }
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24700a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24702a(Context context, String str, String str2, String str3, CampaignEx campaignEx) {
        if (campaignEx != null && context != null) {
            try {
                String campaignUnitId = campaignEx.getCampaignUnitId();
                boolean isBidCampaign = campaignEx.isBidCampaign();
                String requestId = campaignEx.getRequestId();
                String id = campaignEx.getId();
                int template = campaignEx.getTemplate();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(campaignUnitId)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000108&");
                    if (!TextUtils.isEmpty(campaignUnitId)) {
                        String str4 = C2350a.f4905c.get(campaignUnitId);
                        StringBuilder sb = new StringBuilder();
                        sb.append("u_stid=");
                        if (str4 == null) {
                            str4 = "";
                        }
                        sb.append(str4);
                        sb.append("&");
                        stringBuffer.append(sb.toString());
                    }
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=" + requestId + "&");
                    }
                    if (!TextUtils.isEmpty(id)) {
                        stringBuffer.append("cid=" + id + "&");
                    }
                    stringBuffer.append("template_id=" + template + "&");
                    if (!TextUtils.isEmpty(str)) {
                        stringBuffer.append("ad_type=" + str + "&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("process=" + str3 + "&");
                    }
                    stringBuffer.append("unit_id=" + campaignUnitId + "&");
                    stringBuffer.append("hb=");
                    stringBuffer.append(isBidCampaign ? 1 : 0);
                    stringBuffer.append("&");
                    stringBuffer.append("reason=" + str2);
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24714d(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24699a(Context context, CampaignEx campaignEx, String str, String str2, int i, String str3) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000073&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("reason=" + str3 + "&");
                    stringBuffer.append("result=" + i + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24700a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24697a(Context context, CampaignEx campaignEx, String str, String str2, int i) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000074&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("type=" + i + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24700a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24698a(Context context, CampaignEx campaignEx, String str, String str2, int i, int i2) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000075&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("type=" + i + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                    stringBuffer.append("statue=" + i2 + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24700a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m24701a(Context context, String str, String str2, int i, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000076&");
                    stringBuffer.append("network_type=" + C8596q.m24849n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("reason=" + str3 + "&");
                    stringBuffer.append("result=" + i + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C8518b.m24607a().mo57681c()) {
                        C8518b.m24607a().mo57679a(stringBuffer.toString());
                    } else {
                        m24700a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m24700a(final Context context, final String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                new C8540a(context).mo57603c(0, C8487d.m24492a().f20531a, m24691a(str, context, str2), new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d(C8542e.f20688a, str);
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
                        C8608u.m24884d(C8542e.f20688a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8608u.m24884d(f20688a, e.getMessage());
            }
        }
    }

    /* renamed from: d */
    private static void m24714d(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C8540a(context).mo57603c(0, C8487d.m24492a().f20531a, m24690a(str, context), new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d(C8542e.f20688a, str);
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
                        C8608u.m24884d(C8542e.f20688a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8608u.m24884d(f20688a, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m24707a(String str) {
        C8540a aVar = new C8540a(C2350a.m5601e().mo15792g());
        String str2 = "key=2000088&state=" + str;
        C8608u.m24884d(f20688a, str2);
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        if (b == null || m24599a(b, str2)) {
            aVar.mo57603c(0, C8487d.m24492a().f20531a, m24691a(str2, C2350a.m5601e().mo15792g(), ""), (C8476e) null);
        }
    }

    /* renamed from: a */
    public static void m24695a(int i, String str, String str2) {
        try {
            C8540a aVar = new C8540a(C2350a.m5601e().mo15792g());
            aVar.mo57603c(0, C8487d.m24492a().f20531a, m24691a("key=" + "2000080" + "&" + "reason=" + str2 + "&" + "ad_type=" + i + "&" + "url=" + URLEncoder.encode(str, "utf-8"), C2350a.m5601e().mo15792g(), ""), (C8476e) null);
        } catch (Exception e) {
            C8608u.m24884d(f20688a, e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m24712b(String str) {
        try {
            C8540a aVar = new C8540a(C2350a.m5601e().mo15792g());
            StringBuilder sb = new StringBuilder();
            sb.append("key=");
            sb.append("2000090");
            sb.append("&");
            sb.append("reason=");
            sb.append(TextUtils.isEmpty(str) ? "" : str);
            sb.append("&");
            sb.append("result=");
            sb.append(!TextUtils.isEmpty(str));
            aVar.mo57603c(0, C8487d.m24492a().f20531a, m24691a(sb.toString(), C2350a.m5601e().mo15792g(), ""), (C8476e) null);
        } catch (Exception e) {
            C8608u.m24884d(f20688a, e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m24706a(CampaignEx campaignEx, String str, int i, int i2, String str2, int i3, int i4, int i5) {
        try {
            C8540a aVar = new C8540a(C2350a.m5601e().mo15792g());
            StringBuilder sb = new StringBuilder();
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000094", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getId(), "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("video_prg");
            sb.append("=");
            sb.append(i);
            sb.append("&");
            sb.append("phase");
            sb.append("=");
            sb.append(i2);
            sb.append("&");
            sb.append("feedback_content");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append("feedback_close");
            sb.append("=");
            sb.append(i3);
            sb.append("&");
            sb.append("type");
            sb.append("=");
            sb.append(i5);
            sb.append("&");
            sb.append("ad_type");
            sb.append("=");
            sb.append(i4);
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(String.valueOf(C8596q.m24849n(C2350a.m5601e().mo15792g())), "utf-8"));
            if (i3 == 1) {
                sb.append("&");
                sb.append("campaign");
                sb.append("=");
                sb.append(URLEncoder.encode(CampaignEx.campaignToJsonObject(campaignEx).toString(), "utf-8"));
            }
            if (MBridgeConstans.DEBUG && i3 == 1) {
                String str3 = f20688a;
                C8608u.m24884d(str3, "2000094:" + sb);
            }
            if (C8518b.m24607a().mo57681c()) {
                C8518b.m24607a().mo57679a(sb.toString());
                return;
            }
            aVar.mo57603c(0, C8487d.m24492a().f20531a, m24691a(sb.toString(), C2350a.m5601e().mo15792g(), str), new C8541b() {
                /* renamed from: a */
                public final void mo15651a(String str) {
                    C8608u.m24880a("", "FLBClick REPORT SUCCESS");
                }

                /* renamed from: b */
                public final void mo15652b(String str) {
                    C8608u.m24880a("", "FLBClick REPORT FAILED");
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m24711b(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C8540a(context).mo57603c(0, C8487d.m24492a().f20531a, m24690a(str, context), new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        C8608u.m24884d(C8542e.f20688a, str);
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        C8608u.m24884d(C8542e.f20688a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C8608u.m24884d(f20688a, e.getMessage());
            }
        }
    }
}
