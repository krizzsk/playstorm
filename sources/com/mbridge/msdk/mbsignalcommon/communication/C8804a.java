package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.windvane.C8818a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.communication.a */
/* compiled from: CommonBannerSignalCommunicationImp */
public abstract class C8804a implements C8807c {

    /* renamed from: a */
    public static final String f21409a = C8804a.class.getSimpleName();

    /* renamed from: f */
    public void mo58236f(Object obj, String str) {
        try {
            if (obj instanceof C8818a) {
                C8824g.m25670a().mo58309a(((C8818a) obj).f21444a);
            }
        } catch (Throwable th) {
            C8608u.m24881a(f21409a, "onSignalCommunication", th);
        }
    }

    /* renamed from: c */
    public void mo58008c(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "readyStatus: " + str);
    }

    /* renamed from: a */
    public void mo58005a(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "init: " + str);
    }

    /* renamed from: b */
    public void mo58007b(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "click: " + str);
    }

    /* renamed from: d */
    public void mo58009d(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "toggleCloseBtn: " + str);
    }

    /* renamed from: e */
    public void mo58010e(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "triggerCloseBtn: " + str);
    }

    /* renamed from: i */
    public void mo58011i(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "sendImpressions: " + str);
    }

    /* renamed from: k */
    public final void mo58239k(Object obj, String str) {
        C8608u.m24880a(f21409a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            C8805b.m25604a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int optInt = jSONObject.optInt("type");
                    String optString = jSONObject.optString("url");
                    int optInt2 = jSONObject.optInt(ReportDBAdapter.ReportColumns.TABLE_NAME);
                    if (optInt2 == 0) {
                        C2295a.m5360a(C2350a.m5601e().mo15792g(), (CampaignEx) null, "", optString, false, optInt != 0);
                    } else {
                        C2295a.m5361a(C2350a.m5601e().mo15792g(), (CampaignEx) null, "", optString, false, optInt != 0, optInt2);
                    }
                }
                C8824g.m25670a().mo58311a(obj, C8805b.m25603a(0));
            } catch (Throwable th) {
                C8608u.m24881a(f21409a, "reportUrls", th);
            }
        }
    }

    /* renamed from: l */
    public final void mo58240l(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "increaseOfferFrequence:" + str);
        if (TextUtils.isEmpty(str)) {
            C8805b.m25604a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                C8805b.m25605a(obj, new JSONObject(str));
            } catch (Throwable th) {
                C8608u.m24881a(f21409a, "increaseOfferFrequence", th);
            }
        }
    }

    /* renamed from: h */
    public void mo58238h(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "resetCountdown: " + str);
    }

    /* renamed from: m */
    public final void mo58241m(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "handlerH5Exception: " + str);
    }

    /* renamed from: g */
    public void mo58237g(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "install: " + str);
    }

    /* renamed from: n */
    public final void mo58242n(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        String str2 = f21409a;
        C8608u.m24884d(str2, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C8805b.m25604a(obj, "params is null");
            return;
        }
        Context g = C2350a.m5601e().mo15792g();
        if (!TextUtils.isEmpty(str)) {
            if (g == null) {
                try {
                    if ((obj instanceof C8818a) && (windVaneWebView = ((C8818a) obj).f21444a) != null) {
                        g = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C8608u.m24884d(f21409a, e.getMessage());
                }
            }
            if (g != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("url");
                    int optInt = jSONObject.optInt("type");
                    if (optInt == 1) {
                        C2309b.m5447a(g, optString);
                    } else if (optInt == 2) {
                        C2309b.m5449b(g, optString);
                    }
                } catch (JSONException e2) {
                    C8608u.m24884d(f21409a, e2.getMessage());
                } catch (Throwable th) {
                    C8608u.m24884d(f21409a, th.getMessage());
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo58243o(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        String str2 = f21409a;
        C8608u.m24884d(str2, "getNetstat:" + str);
        if (TextUtils.isEmpty(str)) {
            C8805b.m25604a(obj, "params is null");
            return;
        }
        Context g = C2350a.m5601e().mo15792g();
        if (!TextUtils.isEmpty(str)) {
            if (g == null) {
                try {
                    if ((obj instanceof C8818a) && (windVaneWebView = ((C8818a) obj).f21444a) != null) {
                        g = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C8608u.m24884d(f21409a, e.getMessage());
                }
            }
            if (g == null) {
                C8824g.m25670a().mo58311a(obj, C8805b.m25603a(1));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", C8596q.m24849n(g));
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = Base64.encodeToString(jSONObject2.getBytes(), 2);
                }
                C8824g.m25670a().mo58311a(obj, jSONObject2);
            } catch (Throwable th) {
                C8608u.m24884d(f21409a, th.getMessage());
                C8824g.m25670a().mo58311a(obj, C8805b.m25603a(1));
            }
        }
    }

    /* renamed from: j */
    public void mo58012j(Object obj, String str) {
        String str2 = f21409a;
        C8608u.m24880a(str2, "getFileInfo:" + str);
    }
}
