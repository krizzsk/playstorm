package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.p058b.C2312a;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.mraid.C8808a;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.C8818a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import org.json.JSONObject;

public class MraidSignalCommunication extends AbsFeedBackForH5 {

    /* renamed from: d */
    private C8810b f21414d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof C8810b) {
                this.f21414d = (C8810b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof C8810b)) {
                this.f21414d = (C8810b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() != null && (windVaneWebView.getMraidObject() instanceof C8810b)) {
                this.f21414d = (C8810b) windVaneWebView.getMraidObject();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof C8818a) {
            C8818a aVar = (C8818a) obj;
            windVaneWebView = aVar.f21444a;
            C8808a.C8809a.f21415a.mo58255a((WebView) aVar.f21444a, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            C8608u.m24884d("MraidSignalCommunication", "MRAID Open " + optString);
            if (this.f21414d != null && !TextUtils.isEmpty(optString)) {
                if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= ((long) C2312a.f4769c) || !C2312a.m5453a(this.f21414d.getMraidCampaign(), windVaneWebView.getUrl(), C2312a.f4767a)) {
                    this.f21414d.open(optString);
                }
            }
        } catch (Throwable th) {
            C8608u.m24881a("MraidSignalCommunication", "MRAID Open", th);
        }
    }

    public void close(Object obj, String str) {
        if (obj instanceof C8818a) {
            C8808a.C8809a.f21415a.mo58255a((WebView) ((C8818a) obj).f21444a, "close");
        }
        try {
            C8608u.m24884d("MraidSignalCommunication", "MRAID close");
            if (this.f21414d != null) {
                this.f21414d.close();
            }
        } catch (Throwable th) {
            C8608u.m24881a("MraidSignalCommunication", "MRAID close", th);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof C8818a) {
            C8808a.C8809a.f21415a.mo58255a((WebView) ((C8818a) obj).f21444a, MraidJsMethods.UNLOAD);
        }
        try {
            C8608u.m24884d("MraidSignalCommunication", "MRAID unload");
            if (this.f21414d != null) {
                this.f21414d.unload();
            }
        } catch (Throwable th) {
            C8608u.m24881a("MraidSignalCommunication", "MRAID unload", th);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof C8818a) {
            C8808a.C8809a.f21415a.mo58255a((WebView) ((C8818a) obj).f21444a, "useCustomClose");
        }
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            C8608u.m24884d("MraidSignalCommunication", "MRAID useCustomClose " + optString);
            if (!TextUtils.isEmpty(optString) && this.f21414d != null) {
                this.f21414d.useCustomClose(optString.toLowerCase().equals("true"));
            }
        } catch (Throwable th) {
            C8608u.m24881a("MraidSignalCommunication", "MRAID useCustomClose", th);
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof C8818a) {
            C8808a.C8809a.f21415a.mo58255a((WebView) ((C8818a) obj).f21444a, MraidJsMethods.EXPAND);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            C8608u.m24884d("MraidSignalCommunication", "MRAID expand " + optString + " " + optString2);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f21414d != null) {
                this.f21414d.expand(optString, optString2.toLowerCase().equals("true"));
            }
        } catch (Throwable th) {
            C8608u.m24881a("MraidSignalCommunication", "MRAID expand", th);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof C8818a) {
            C8808a.C8809a.f21415a.mo58255a((WebView) ((C8818a) obj).f21444a, "setOrientationProperties");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            C8608u.m24884d("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f21414d != null) {
                optString.toLowerCase().equals("true");
                String lowerCase = optString2.toLowerCase();
                int hashCode = lowerCase.hashCode();
                if (hashCode == 729267099) {
                    str2 = "portrait";
                } else if (hashCode == 1430647483) {
                    str2 = "landscape";
                } else {
                    return;
                }
                boolean equals = lowerCase.equals(str2);
            }
        } catch (Throwable th) {
            C8608u.m24881a("MraidSignalCommunication", "MRAID setOrientationProperties", th);
        }
    }
}
