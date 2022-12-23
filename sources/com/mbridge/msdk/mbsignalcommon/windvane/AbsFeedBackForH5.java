package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.tools.C8608u;
import org.json.JSONObject;

public abstract class AbsFeedBackForH5 extends C8825h {

    /* renamed from: e */
    private static int f21429e = 0;

    /* renamed from: f */
    private static int f21430f = 1;

    /* renamed from: d */
    private String f21431d = "AbsFeedBackForH5";

    public void feedbackOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C8818a aVar = (C8818a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                C2347b.m5579a().mo15765a(jSONObject.optString(SDKConstants.PARAM_KEY, ""), optInt == 1 ? 8 : 0, (ViewGroup) aVar.f21444a);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        Object obj2 = obj;
        try {
            if (!TextUtils.isEmpty(str)) {
                C8818a aVar = (C8818a) obj2;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("width", -1);
                int optInt2 = jSONObject.optInt("height", -1);
                int optInt3 = jSONObject.optInt("left", -1);
                int optInt4 = jSONObject.optInt("top", -1);
                double optDouble = jSONObject.optDouble("opacity", 1.0d);
                int optInt5 = jSONObject.optInt("radius", 20);
                String optString = jSONObject.optString("fontColor", "");
                String optString2 = jSONObject.optString("bgColor", "");
                String optString3 = jSONObject.optString(SDKConstants.PARAM_KEY, "");
                double optDouble2 = jSONObject.optDouble("fontSize", -1.0d);
                float f = (float) optDouble;
                float f2 = (float) optDouble2;
                C2347b.m5579a().mo15763a(optString3, optInt, optInt2, optInt5, (float) optInt3, (float) optInt4, f, optString, optString2, f2, jSONObject.optJSONArray("padding"));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj2, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C8818a aVar = (C8818a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                C2347b.m5579a().mo15762a(jSONObject.optString(SDKConstants.PARAM_KEY, ""), optInt);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21429e);
            jSONObject.put("message", "");
            jSONObject.put("data", new JSONObject());
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            C8608u.m24880a(this.f21431d, e.getMessage());
        }
    }

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21430f);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C8608u.m24880a(this.f21431d, e.getMessage());
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f21429e);
            jSONObject2.put("message", "");
            jSONObject2.put("data", jSONObject);
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            C8608u.m24880a(this.f21431d, e.getMessage());
        }
    }
}
