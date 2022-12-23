package com.mbridge.msdk.video.p346bt.p347a;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.p337a.C8786a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.a.b */
/* compiled from: HandlerH5MessageManager */
public final class C9193b {

    /* renamed from: a */
    int f22150a;

    /* renamed from: b */
    int f22151b;

    /* renamed from: c */
    private String f22152c;

    /* renamed from: com.mbridge.msdk.video.bt.a.b$a */
    /* compiled from: HandlerH5MessageManager */
    private static final class C9195a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C9193b f22153a = new C9193b();
    }

    private C9193b() {
        this.f22152c = "handlerNativeResult";
        this.f22150a = 0;
        this.f22151b = 1;
    }

    /* renamed from: a */
    public static C9193b m26189a() {
        return C9195a.f22153a;
    }

    /* renamed from: a */
    public final void mo62107a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String optString = jSONObject.optString("uniqueIdentifier");
                    String optString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString)) {
                        if (!TextUtils.isEmpty(optString2)) {
                            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                            JSONObject optJSONObject = jSONObject.optJSONObject(IronSourceConstants.EVENTS_RESULT);
                            int i = 0;
                            if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                                i = optJSONObject.optInt("type", 0);
                            }
                            m26190a(this.f22150a, "receivedMessage", obj);
                            if (optString.equalsIgnoreCase("reporter")) {
                                C8786a.m25543a().mo58183a(obj, optString2, optJSONArray, i);
                                return;
                            } else if (optString.equalsIgnoreCase("MediaPlayer")) {
                                C9191a.m26183a().mo62104a(obj, optString2, optJSONArray, i);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    m26190a(this.f22151b, "module or method is null", obj);
                    return;
                }
            } catch (Exception e) {
                C8608u.m24880a("HandlerH5MessageManager", e.getMessage());
                m26190a(this.f22151b, e.getMessage(), obj);
                return;
            } catch (Throwable th) {
                C8608u.m24880a("HandlerH5MessageManager", th.getMessage());
                m26190a(this.f22151b, th.getMessage(), obj);
                return;
            }
        }
        m26190a(this.f22151b, "params is null", obj);
    }

    /* renamed from: a */
    private void m26190a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            C8608u.m24880a("HandlerH5MessageManager", e.getMessage());
        } catch (Throwable th) {
            C8608u.m24880a("HandlerH5MessageManager", th.getMessage());
        }
    }
}
