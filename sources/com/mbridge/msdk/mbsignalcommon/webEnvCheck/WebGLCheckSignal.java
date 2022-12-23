package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import org.json.JSONException;
import org.json.JSONObject;

public class WebGLCheckSignal extends AbsFeedBackForH5 {
    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C2350a.m5601e().mo15788c(jSONObject.optInt("webgl"));
            C2350a.m5601e().mo15782a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
