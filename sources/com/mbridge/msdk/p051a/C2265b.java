package com.mbridge.msdk.p051a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.Omid;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.AdSessionConfiguration;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.CreativeType;
import com.iab.omid.library.mmadbridge.adsession.ImpressionType;
import com.iab.omid.library.mmadbridge.adsession.Owner;
import com.iab.omid.library.mmadbridge.adsession.Partner;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p306b.C8454a;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p300b.C8420c;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.out.MBConfiguration;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.a.b */
/* compiled from: OmsdkUtils */
public final class C2265b {
    /* renamed from: a */
    public static void m5118a(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = "";
            new C8526d(context).mo57696a("", "", "", "", "fetch OM failed, OMID_JS_SERVICE_URL null");
        } else if (context != null) {
            try {
                new C2264a(context.getApplicationContext()).mo57600a(0, MBridgeConstans.OMID_JS_SERVICE_URL, (C8494d) null, (C8476e) new C8454a() {
                    /* renamed from: a */
                    public final void mo15406a(String str) {
                        MBridgeConstans.OMID_JS_SERVICE_CONTENT = str;
                        C8608u.m24880a("OMSDK", "fetch OMJSContent success, content = " + str);
                        new Thread(new Runnable(str) {

                            /* renamed from: a */
                            final /* synthetic */ String f4505a;

                            {
                                this.f4505a = r1;
                            }

                            public final void run() {
                                try {
                                    File file = new File(C8422e.m24335b(C8420c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    C8602s.m24868a(this.f4505a.getBytes(), file);
                                } catch (Exception e) {
                                    C8608u.m24880a("OMSDK", e.getMessage());
                                }
                            }
                        }).start();
                    }

                    /* renamed from: b */
                    public final void mo15407b(String str) {
                        C8608u.m24880a("OMSDK", "fetch OMJSContent failed, errorCode = " + str);
                        new C8526d(context).mo57696a("", "", "", "", "fetch OM failed, request failed");
                    }
                });
            } catch (Exception e) {
                C8608u.m24884d("OMSDK", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m5120b(final Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_URL)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = "";
            new C8526d(context).mo57696a("", "", "", "", "fetch OM failed, OMID_JS_H5_URL null");
        } else if (context != null) {
            try {
                new C2264a(context.getApplicationContext()).mo57600a(0, MBridgeConstans.OMID_JS_H5_URL, (C8494d) null, (C8476e) new C8454a() {
                    /* renamed from: a */
                    public final void mo15406a(String str) {
                        MBridgeConstans.OMID_JS_H5_CONTENT = str;
                        C8608u.m24880a("OMSDK", "fetch OMJSH5Content success, content = " + str);
                        new Thread(new Runnable(str) {

                            /* renamed from: a */
                            final /* synthetic */ String f4506a;

                            {
                                this.f4506a = r1;
                            }

                            public final void run() {
                                try {
                                    File file = new File(C8422e.m24335b(C8420c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    C8602s.m24868a(this.f4506a.getBytes(), file);
                                } catch (Exception e) {
                                    C8608u.m24880a("OMSDK", e.getMessage());
                                }
                            }
                        }).start();
                    }

                    /* renamed from: b */
                    public final void mo15407b(String str) {
                        C8608u.m24880a("OMSDK", "fetch OMJSH5Content failed, errorCode = " + str);
                        new C8526d(context).mo57696a("", "", "", "", "fetch OM H5 failed, request failed");
                    }
                });
            } catch (Exception e) {
                C8608u.m24884d("OMSDK", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    private static void m5121c(Context context) {
        if (!Omid.isActive()) {
            Omid.activate(context);
        }
    }

    /* renamed from: a */
    private static List<VerificationScriptResource> m5117a(String str, Context context, String str2, String str3, String str4, String str5) {
        VerificationScriptResource verificationScriptResource;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (str != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("vkey", "");
                    URL url = new URL(optJSONObject.optString("et_url", ""));
                    String optString2 = optJSONObject.optString("verification_p", "");
                    if (!TextUtils.isEmpty(optString2)) {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(optString, url, optString2);
                    } else if (TextUtils.isEmpty(optString)) {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                    } else {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                    }
                    arrayList.add(verificationScriptResource);
                }
            }
        } catch (IllegalArgumentException e) {
            C8608u.m24884d("OMSDK", e.getMessage());
            C8526d dVar = new C8526d(context);
            dVar.mo57696a(str2, str5, str3, str4, "failed, exception " + e.getMessage());
        } catch (MalformedURLException e2) {
            C8608u.m24884d("OMSDK", e2.getMessage());
            C8526d dVar2 = new C8526d(context);
            dVar2.mo57696a(str2, str5, str3, str4, "failed, exception " + e2.getMessage());
        } catch (JSONException e3) {
            C8608u.m24884d("OMSDK", e3.getMessage());
            C8526d dVar3 = new C8526d(context);
            dVar3.mo57696a(str2, str5, str3, str4, "failed, exception " + e3.getMessage());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static AdSession m5113a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = m5115a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = m5119b();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) || TextUtils.isEmpty(campaignEx.getOmid())) {
            C8608u.m24880a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(campaignEx.getOmid()) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
            new C8526d(context).mo57696a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), campaignEx.getCampaignUnitId(), "failed, OMID_JS_SERVICE_CONTENT null or omid null");
            return null;
        }
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        m5121c(context);
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.JAVASCRIPT, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.DEFINED_BY_JAVASCRIPT) ? Owner.NONE : Owner.NATIVE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION), webView, (String) null, (String) null));
        createAdSession.registerAdView(webView);
        return createAdSession;
    }

    /* renamed from: a */
    public static AdSession m5114a(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        Context context2 = context;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = m5115a();
        }
        AdSession adSession = null;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) || TextUtils.isEmpty(str)) {
            String str7 = str2;
            C8608u.m24880a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
            new C8526d(context2).mo57696a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
            return null;
        }
        try {
            m5121c(context);
            try {
                adSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, z ? Owner.NONE : Owner.NATIVE, false), AdSessionContext.createNativeAdSessionContext(Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION), MBridgeConstans.OMID_JS_SERVICE_CONTENT, m5117a(str, context, str2, str3, str4, str6), str5, str2));
                C8608u.m24880a("OMSDK", "adSession create success");
                return adSession;
            } catch (IllegalArgumentException e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
                C8608u.m24884d("OMSDK", e.getMessage());
                C8526d dVar = new C8526d(context2);
                dVar.mo57696a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return adSession;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            String str8 = str2;
            C8608u.m24884d("OMSDK", e.getMessage());
            C8526d dVar2 = new C8526d(context2);
            dVar2.mo57696a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
            return adSession;
        } catch (Exception e4) {
            e = e4;
            String str9 = str2;
            C8608u.m24884d("OMSDK", e.getMessage());
            C8526d dVar3 = new C8526d(context2);
            dVar3.mo57696a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
            return adSession;
        }
    }

    /* renamed from: a */
    private static String m5115a() {
        try {
            return C8602s.m24862a(new File(C8422e.m24335b(C8420c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e) {
            C8608u.m24880a("OMSDK", e.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    private static String m5119b() {
        try {
            File file = new File(C8422e.m24335b(C8420c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            if (file.exists()) {
                return C8602s.m24862a(file);
            }
            return "";
        } catch (Exception e) {
            C8608u.m24880a("OMSDK", e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public static String m5116a(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = m5119b();
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", "https://s3-us-west-2.amazonaws.com/omsdk-files/compliance-js/omid-validation-verification-script-v1.js");
    }
}
