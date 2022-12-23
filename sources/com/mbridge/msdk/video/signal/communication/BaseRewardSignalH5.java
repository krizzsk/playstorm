package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.communication.C8805b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8818a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseRewardSignalH5 implements IRewardCommunication {

    /* renamed from: a */
    protected IJSFactory f23058a;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f23058a = (IJSFactory) context;
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f23058a = (IJSFactory) obj;
        }
    }

    public void getEndScreenInfo(Object obj, String str) {
        String str2;
        try {
            if (this.f23058a != null) {
                String a = this.f23058a.getIJSRewardVideoV1().mo62844a();
                if (!TextUtils.isEmpty(a)) {
                    str2 = Base64.encodeToString(a.getBytes(), 2);
                    C8608u.m24880a("JS-Reward-Communication", "getEndScreenInfo success");
                } else {
                    str2 = "";
                    C8608u.m24880a("JS-Reward-Communication", "getEndScreenInfo failed");
                }
                C8824g.m25670a().mo58311a(obj, str2);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Communication", "getEndScreenInfo", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            if (this.f23058a != null) {
                C8608u.m24880a("JS-Reward-Communication", "install:" + str);
                if (this.f23058a.getJSContainerModule().endCardShowing()) {
                    this.f23058a.getJSCommon().click(3, str);
                } else {
                    this.f23058a.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Communication", "install", th);
        }
    }

    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        C8608u.m24884d("JS-Reward-Communication", "openURL:" + str);
        Context g = C2350a.m5601e().mo15792g();
        if (!TextUtils.isEmpty(str)) {
            if (g == null) {
                try {
                    if ((obj instanceof C8818a) && (windVaneWebView = ((C8818a) obj).f21444a) != null) {
                        g = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C8608u.m24884d("JS-Reward-Communication", e.getMessage());
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
                    C8608u.m24884d("JS-Reward-Communication", e2.getMessage());
                } catch (Throwable th) {
                    C8608u.m24884d("JS-Reward-Communication", th.getMessage());
                }
            }
        }
    }

    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f23058a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C8608u.m24880a("JS-Reward-Communication", "notifyCloseBtn,state:" + str);
                this.f23058a.getIJSRewardVideoV1().notifyCloseBtn(optInt);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Communication", "notifyCloseBtn", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f23058a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C8608u.m24880a("JS-Reward-Communication", "toggleCloseBtn,state:" + str);
                this.f23058a.getIJSRewardVideoV1().toggleCloseBtn(optInt);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Communication", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f23058a != null && !TextUtils.isEmpty(str)) {
                C8824g.m25670a().mo58311a(obj, m27107a(0));
                this.f23058a.getIJSRewardVideoV1().mo62845a(new JSONObject(str).optString("state"));
                C8608u.m24880a("JS-Reward-Communication", "triggerCloseBtn,state:" + str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Communication", "triggerCloseBtn", th);
            C8824g.m25670a().mo58311a(obj, m27107a(-1));
        }
    }

    public void setOrientation(Object obj, String str) {
        try {
            if (this.f23058a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                C8608u.m24880a("JS-Reward-Communication", "setOrientation,state:" + str);
                this.f23058a.getIJSRewardVideoV1().mo62846b(optString);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Communication", "setOrientation", th);
        }
    }

    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f23058a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("msg");
                C8608u.m24880a("JS-Reward-Communication", "handlerPlayableException,msg:" + str);
                this.f23058a.getIJSRewardVideoV1().mo62847c(optString);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Communication", "setOrientation", th);
        }
    }

    /* renamed from: a */
    private String m27107a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8608u.m24884d("JS-Reward-Communication", "code to string is error");
            return "";
        }
    }

    public void cai(Object obj, String str) {
        C8608u.m24880a("JS-Reward-Communication", "cai:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                String optString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(optString)) {
                    C8805b.m25604a(obj, "packageName is empty");
                }
                int i = C8613y.m24940c(C2350a.m5601e().mo15792g(), optString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", C8805b.f21411b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, i);
                    jSONObject.put("data", jSONObject2);
                    C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C8805b.m25604a(obj, e.getMessage());
                    C8608u.m24880a("JS-Reward-Communication", e.getMessage());
                }
            } catch (JSONException e2) {
                C8805b.m25604a(obj, "exception: " + e2.getLocalizedMessage());
                C8608u.m24881a("JS-Reward-Communication", "cai", e2);
            } catch (Throwable th) {
                C8805b.m25604a(obj, "exception: " + th.getLocalizedMessage());
                C8608u.m24881a("JS-Reward-Communication", "cai", th);
            }
        }
    }
}
