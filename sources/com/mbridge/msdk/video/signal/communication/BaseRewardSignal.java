package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.communication.C8805b;
import com.mbridge.msdk.mbsignalcommon.p338b.C8789a;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.C8818a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.p369a.C9425j;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseRewardSignal extends AbsFeedBackForH5 implements IRewardCommunication {

    /* renamed from: d */
    protected IRewardCommunication f23057d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean z;
        super.initialize(context, windVaneWebView);
        try {
            z = Class.forName("com.mbridge.msdk.video.signal.factory.IJSFactory").isInstance(context);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        if (z) {
            try {
                Class<?> cls = Class.forName("com.mbridge.msdk.video.signal.communication.BaseRewardSignalH5");
                this.f23057d = (IRewardCommunication) cls.newInstance();
                cls.getMethod("initialize", new Class[]{Context.class, WindVaneWebView.class}).invoke(this.f23057d, new Object[]{context, windVaneWebView});
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IRewardCommunication)) {
            this.f23057d = (IRewardCommunication) windVaneWebView.getObject();
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean z;
        super.initialize(obj, windVaneWebView);
        try {
            z = Class.forName("com.mbridge.msdk.video.signal.factory.IJSFactory").isInstance(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        if (z) {
            try {
                Class<?> cls = Class.forName("com.mbridge.msdk.video.signal.communication.BaseRewardSignalH5");
                this.f23057d = (IRewardCommunication) cls.newInstance();
                cls.getMethod("initialize", new Class[]{Object.class, WindVaneWebView.class}).invoke(this.f23057d, new Object[]{obj, windVaneWebView});
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IRewardCommunication)) {
            this.f23057d = (IRewardCommunication) windVaneWebView.getObject();
        }
    }

    public void getEndScreenInfo(Object obj, String str) {
        try {
            if (this.f23057d != null) {
                this.f23057d.getEndScreenInfo(obj, str);
                C8608u.m24884d("JS-Reward-Brigde", "getEndScreenInfo factory is true");
                return;
            }
            C8608u.m24884d("JS-Reward-Brigde", "getEndScreenInfo factory is null");
            if (obj != null) {
                C8818a aVar = (C8818a) obj;
                if (aVar.f21444a instanceof WindVaneWebView) {
                    WindVaneWebView windVaneWebView = aVar.f21444a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((C8789a) windVaneWebView.getWebViewListener()).mo58185a(obj);
                    }
                }
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Brigde", "getEndScreenInfo", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            if (this.f23057d != null) {
                this.f23057d.install(obj, str);
            } else if (!TextUtils.isEmpty(str)) {
                if (obj != null) {
                    C8818a aVar = (C8818a) obj;
                    if (aVar.f21444a.getObject() instanceof C9425j) {
                        ((C9425j) aVar.f21444a.getObject()).click(1, str);
                        C8608u.m24884d("JS-Reward-Brigde", "JSCommon install jump success");
                    }
                }
                C8608u.m24884d("JS-Reward-Brigde", "JSCommon install failed");
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Brigde", "install", th);
        }
    }

    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f23057d != null && !TextUtils.isEmpty(str)) {
                this.f23057d.notifyCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Brigde", "notifyCloseBtn", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f23057d != null && !TextUtils.isEmpty(str)) {
                this.f23057d.toggleCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Brigde", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f23057d != null && !TextUtils.isEmpty(str)) {
                this.f23057d.triggerCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Brigde", "triggerCloseBtn", th);
            C8824g.m25670a().mo58311a(obj, m27106a(-1));
        }
    }

    public void setOrientation(Object obj, String str) {
        try {
            if (this.f23057d != null && !TextUtils.isEmpty(str)) {
                this.f23057d.setOrientation(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Brigde", "setOrientation", th);
        }
    }

    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f23057d != null && !TextUtils.isEmpty(str)) {
                this.f23057d.handlerPlayableException(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Reward-Brigde", "handlerPlayableException", th);
        }
    }

    /* renamed from: a */
    private String m27106a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8608u.m24884d("JS-Reward-Brigde", "code to string is error");
            return "";
        }
    }

    public void openURL(Object obj, String str) {
        C8608u.m24884d("JS-Reward-Brigde", "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C8805b.m25604a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    C2309b.m5447a(this.f21468a, optString);
                } else if (optInt == 2) {
                    C2309b.m5449b(this.f21468a, optString);
                }
            } catch (JSONException e) {
                C8608u.m24884d("JS-Reward-Brigde", e.getMessage());
            } catch (Throwable th) {
                C8608u.m24884d("JS-Reward-Brigde", th.getMessage());
            }
        }
    }

    public void cai(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C8805b.m25604a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
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
                    C8608u.m24880a("JS-Reward-Brigde", e.getMessage());
                }
            } catch (JSONException e2) {
                C8805b.m25604a(obj, "exception: " + e2.getLocalizedMessage());
                C8608u.m24881a("JS-Reward-Brigde", "cai", e2);
            } catch (Throwable th) {
                C8805b.m25604a(obj, "exception: " + th.getLocalizedMessage());
                C8608u.m24881a("JS-Reward-Brigde", "cai", th);
            }
        }
    }
}
