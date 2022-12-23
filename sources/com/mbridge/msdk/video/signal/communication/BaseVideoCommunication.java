package com.mbridge.msdk.video.signal.communication;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.C5849bb;
import com.inmobi.unification.sdk.InitializationStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.entity.C8402c;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.same.p300b.C8420c;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.mbsignalcommon.communication.C8805b;
import com.mbridge.msdk.mbsignalcommon.p338b.C8789a;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.C8818a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.video.p346bt.p347a.C9193b;
import com.mbridge.msdk.video.p346bt.p347a.C9196c;
import com.mbridge.msdk.video.signal.C9432c;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.p369a.C9425j;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseVideoCommunication extends AbsFeedBackForH5 implements IVideoCommunication {

    /* renamed from: d */
    protected IJSFactory f23059d;

    /* renamed from: e */
    private FastKV f23060e = null;

    /* renamed from: a */
    private String m27108a(int i) {
        switch (i) {
            case 1:
                return "sdk_info";
            case 2:
                return MBridgeConstans.PROPERTIES_UNIT_ID;
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return "device";
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.f23059d = (IJSFactory) obj;
        }
    }

    public void init(Object obj, String str) {
        C8608u.m24882b("JS-Video-Brigde", "init");
        try {
            boolean z = false;
            int i = 1;
            if (this.f23059d != null) {
                String c = this.f23059d.getJSCommon().mo62822c();
                if (!TextUtils.isEmpty(c)) {
                    c = Base64.encodeToString(c.getBytes(), 2);
                }
                C8824g.m25670a().mo58311a(obj, c);
                this.f23059d.getJSCommon().mo62820b(true);
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("showTransparent");
                    int optInt2 = jSONObject.optInt("mute");
                    int optInt3 = jSONObject.optInt("closeType");
                    int optInt4 = jSONObject.optInt("orientationType");
                    int optInt5 = jSONObject.optInt("webfront");
                    int optInt6 = jSONObject.optInt("showAlertRole");
                    C9432c jSCommon = this.f23059d.getJSCommon();
                    if (optInt == 1) {
                        z = true;
                    }
                    jSCommon.mo62817a(z);
                    this.f23059d.getJSCommon().mo62818b(optInt2);
                    this.f23059d.getJSCommon().mo62823c(optInt3);
                    this.f23059d.getJSCommon().mo62825d(optInt4);
                    this.f23059d.getJSCommon().mo62827e(optInt5);
                    C9432c jSCommon2 = this.f23059d.getJSCommon();
                    if (optInt6 != 0) {
                        i = optInt6;
                    }
                    jSCommon2.mo62833h(i);
                }
            } else if (obj != null) {
                C8818a aVar = (C8818a) obj;
                if (aVar.f21444a.getObject() instanceof C9425j) {
                    C9425j jVar = (C9425j) aVar.f21444a.getObject();
                    String c2 = jVar.mo62822c();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int optInt7 = jSONObject2.optInt("showTransparent");
                        int optInt8 = jSONObject2.optInt("mute");
                        int optInt9 = jSONObject2.optInt("closeType");
                        int optInt10 = jSONObject2.optInt("orientationType");
                        int optInt11 = jSONObject2.optInt("webfront");
                        int optInt12 = jSONObject2.optInt("showAlertRole");
                        if (optInt7 == 1) {
                            z = true;
                        }
                        jVar.mo62817a(z);
                        jVar.mo62818b(optInt8);
                        jVar.mo62823c(optInt9);
                        jVar.mo62825d(optInt10);
                        jVar.mo62827e(optInt11);
                        if (optInt12 != 0) {
                            i = optInt12;
                        }
                        jVar.mo62833h(i);
                        C8608u.m24882b("JS-Video-Brigde", "init jsCommon.setIsShowingTransparent = " + optInt7);
                    }
                    C8824g.m25670a().mo58311a(obj, Base64.encodeToString(c2.getBytes(), 2));
                }
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "init error", th);
        }
    }

    public void click(Object obj, String str) {
        int i;
        String str2;
        C9425j jVar;
        C8608u.m24882b("JS-Video-Brigde", "click");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                i = jSONObject.optInt("type");
                str2 = jSONObject.optString("pt");
                if (this.f23059d != null) {
                    this.f23059d.getJSCommon().click(i, str2);
                } else if (obj != null) {
                    C8818a aVar = (C8818a) obj;
                    if ((aVar.f21444a.getObject() instanceof C9425j) && (jVar = (C9425j) aVar.f21444a.getObject()) != null) {
                        jVar.click(i, str2);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            i = 1;
            str2 = "";
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "click error", th);
        }
    }

    public void statistics(Object obj, String str) {
        C8608u.m24882b("JS-Video-Brigde", "statistics,params:" + str);
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                this.f23059d.getJSCommon().mo62812a(jSONObject.optInt("type"), jSONObject.optString("data"));
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "statistics error", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        C8608u.m24882b("JS-Video-Brigde", "triggerCloseBtn");
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str) && new JSONObject(str).optString("state").equals("click")) {
                this.f23059d.getJSVideoModule().closeVideoOperate(1, -1);
                C8824g.m25670a().mo58311a(obj, m27110b(0));
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "triggerCloseBtn error", th);
        }
    }

    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("margin_top", 0);
                int optInt2 = jSONObject.optInt("margin_left", 0);
                int optInt3 = jSONObject.optInt("view_width", 0);
                int optInt4 = jSONObject.optInt("view_height", 0);
                int optInt5 = jSONObject.optInt("radius", 0);
                int optInt6 = jSONObject.optInt("border_top", 0);
                int optInt7 = jSONObject.optInt("border_left", 0);
                int optInt8 = jSONObject.optInt("border_width", 0);
                int optInt9 = jSONObject.optInt("border_height", 0);
                C8608u.m24882b("JS-Video-Brigde", "showVideoLocation,margin_top:" + optInt + ",marginLeft:" + optInt2 + ",viewWidth:" + optInt3 + ",viewHeight:" + optInt4 + ",radius:" + optInt5 + ",borderTop: " + optInt6 + ",borderLeft: " + optInt7 + ",borderWidth: " + optInt8 + ",borderHeight: " + optInt9);
                this.f23059d.getJSVideoModule().showVideoLocation(optInt, optInt2, optInt3, optInt4, optInt5, optInt6, optInt7, optInt8, optInt9);
                this.f23059d.getJSCommon().mo62828f();
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "showVideoLocation error", th);
        }
    }

    public void soundOperate(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("mute");
                int optInt2 = jSONObject.optInt("view_visible");
                String optString = jSONObject.optString("pt", "");
                C8608u.m24882b("JS-Video-Brigde", "soundOperate,mute:" + optInt + ",viewVisible:" + optInt2 + ",pt:" + optString);
                if (TextUtils.isEmpty(optString)) {
                    this.f23059d.getJSVideoModule().soundOperate(optInt, optInt2);
                } else {
                    this.f23059d.getJSVideoModule().soundOperate(optInt, optInt2, optString);
                }
                C8824g.m25670a().mo58311a(obj, m27110b(0));
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "soundOperate error", th);
        }
    }

    public void videoOperate(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("pause_or_resume");
                C8608u.m24882b("JS-Video-Brigde", "videoOperate,pauseOrResume:" + optInt);
                this.f23059d.getJSVideoModule().videoOperate(optInt);
                C8824g.m25670a().mo58311a(obj, m27110b(0));
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "videoOperate error", th);
        }
    }

    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("close");
                int optInt2 = jSONObject.optInt("view_visible");
                C8608u.m24882b("JS-Video-Brigde", "closeVideoOperte,close:" + optInt + ",viewVisible:" + optInt2);
                this.f23059d.getJSVideoModule().closeVideoOperate(optInt, optInt2);
                C8824g.m25670a().mo58311a(obj, m27110b(0));
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "closeOperte error", th);
        }
    }

    public void progressOperate(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_PROGRESS);
                int optInt2 = jSONObject.optInt("view_visible");
                C8608u.m24882b("JS-Video-Brigde", "progressOperate,progress:" + optInt + ",viewVisible:" + optInt2);
                this.f23059d.getJSVideoModule().progressOperate(optInt, optInt2);
                C8824g.m25670a().mo58311a(obj, m27110b(0));
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "progressOperate error", th);
        }
    }

    public void progressBarOperate(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                this.f23059d.getJSVideoModule().progressBarOperate(new JSONObject(str).optInt("view_visible"));
                C8824g.m25670a().mo58311a(obj, m27110b(0));
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "progressOperate error", th);
        }
    }

    public void getCurrentProgress(Object obj, String str) {
        try {
            if (this.f23059d != null) {
                String currentProgress = this.f23059d.getJSVideoModule().getCurrentProgress();
                C8608u.m24882b("JS-Video-Brigde", "getCurrentProgress:" + currentProgress);
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                C8824g.m25670a().mo58311a(obj, currentProgress);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "getCurrentProgress error", th);
        }
    }

    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("type");
                C8608u.m24882b("JS-Video-Brigde", "showVideoClickView,type:" + optInt);
                this.f23059d.getJSContainerModule().showVideoClickView(optInt);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("fitxy");
                C8608u.m24882b("JS-Video-Brigde", "setScaleFitXY,type:" + optInt);
                this.f23059d.getJSVideoModule().setScaleFitXY(optInt);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C8608u.m24882b("JS-Video-Brigde", "notifyCloseBtn,result:" + optInt);
                this.f23059d.getJSVideoModule().notifyCloseBtn(optInt);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "notifyCloseBtn", th);
        }
    }

    public void openURL(Object obj, String str) {
        C8608u.m24884d("JS-Video-Brigde", "openURL:" + str);
        if (!TextUtils.isEmpty(str)) {
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
                C8608u.m24884d("JS-Video-Brigde", e.getMessage());
            } catch (Throwable th) {
                C8608u.m24884d("JS-Video-Brigde", th.getMessage());
            }
        }
    }

    public void showAlertView(Object obj, String str) {
        C8608u.m24882b("JS-Video-Brigde", "showAlertView");
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                this.f23059d.getJSVideoModule().showIVRewardAlertView(str);
                C8824g.m25670a().mo58312a(obj, "showAlertView", "");
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "showAlertView", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C8608u.m24882b("JS-Video-Brigde", "toggleCloseBtn,result:" + optInt);
                int i = 2;
                if (optInt != 1) {
                    i = optInt == 2 ? 1 : 0;
                }
                this.f23059d.getJSVideoModule().closeVideoOperate(0, i);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "toggleCloseBtn", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.f23059d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                C8608u.m24882b("JS-Video-Brigde", "handlerH5Exception,params:" + str);
                this.f23059d.getJSCommon().handlerH5Exception(jSONObject.optInt("code", -999), jSONObject.optString("message", "h5 error"));
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "handlerH5Exception", th);
        }
    }

    public void isSystemResume(Object obj, String str) {
        try {
            if (this.f23059d != null) {
                C8608u.m24882b("JS-Video-Brigde", "isSystemResume,params:" + str);
                C8824g.m25670a().mo58311a(obj, m27110b(this.f23059d.getActivityProxy().mo62809h()));
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "isSystemResume", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                C8818a aVar = (C8818a) obj;
                int optInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.f21444a.getObject() instanceof C9425j) {
                    ((C9425j) aVar.f21444a.getObject()).mo62854i(optInt);
                }
                if (aVar.f21444a != null) {
                    WindVaneWebView windVaneWebView = aVar.f21444a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        windVaneWebView.getWebViewListener().mo57899a((WebView) windVaneWebView, optInt);
                    }
                }
            } catch (Throwable th) {
                C8608u.m24881a("JS-Video-Brigde", "readyStatus", th);
            }
        }
    }

    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str) && this.f23059d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("type");
                C8608u.m24882b("JS-Video-Brigde", "playVideoFinishOperate,type: " + optInt);
                this.f23059d.getJSCommon().mo62829f(optInt);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "playVideoFinishOperate error", th);
        }
    }

    /* renamed from: b */
    private String m27110b(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8608u.m24884d("JS-Video-Brigde", "code to string is error");
            return "";
        }
    }

    public void reactDeveloper(Object obj, String str) {
        C8608u.m24880a("JS-Video-Brigde", "reactDeveloper");
        try {
            if (this.f23059d == null || TextUtils.isEmpty(str)) {
                C8824g.m25670a().mo58313b(obj, m27110b(1));
            } else {
                this.f23059d.getJSBTModule().reactDeveloper(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "reactDeveloper error " + th);
        }
    }

    public void reportUrls(Object obj, String str) {
        C8608u.m24880a("JS-Video-Brigde", "reportUrls");
        try {
            if (!TextUtils.isEmpty(str)) {
                C9196c.m26194a().mo62136b(obj, str);
            } else {
                C8824g.m25670a().mo58313b(obj, m27110b(1));
            }
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "reportUrls error " + th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62121N(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "getFileInfo error", th);
        }
    }

    public void getSDKInfo(Object obj, String str) {
        C8608u.m24882b("JS-Video-Brigde", "getSDKInfo");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
                JSONObject jSONObject = new JSONObject();
                int i = 0;
                if (this.f23059d != null) {
                    while (i < jSONArray.length()) {
                        int i2 = jSONArray.getInt(i);
                        jSONObject.put(m27108a(i2), this.f23059d.getJSCommon().mo62831g(i2));
                        i++;
                    }
                } else if (obj != null) {
                    while (i < jSONArray.length()) {
                        int i3 = jSONArray.getInt(i);
                        C8818a aVar = (C8818a) obj;
                        if (aVar.f21444a.getObject() instanceof C9425j) {
                            jSONObject.put(m27108a(i3), ((C9425j) aVar.f21444a.getObject()).mo62831g(i3));
                        }
                        i++;
                    }
                }
                C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                return;
            }
            C8824g.m25670a().mo58313b(obj, "params is null");
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "getSDKInfo error", th);
            C8824g.m25670a().mo58313b(obj, "exception");
        }
    }

    public void loadads(Object obj, String str) {
        int i;
        int i2;
        String str2;
        String str3;
        C8608u.m24882b("JS-Video-Brigde", "loadads");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString(MBridgeConstans.PLACEMENT_ID);
                String optString2 = jSONObject.optString("unitId");
                int optInt = jSONObject.optInt("type", 1);
                if (optInt > 2) {
                    optInt = 1;
                }
                str2 = optString2;
                i = jSONObject.optInt("adtype", 1);
                i2 = optInt;
                str3 = optString;
            } else {
                i2 = 1;
                i = 1;
                str3 = "";
                str2 = str3;
            }
            if (TextUtils.isEmpty(str2)) {
                C8824g.m25670a().mo58311a(obj, m27110b(1));
                return;
            }
            if (obj != null) {
                C8818a aVar = (C8818a) obj;
                if (aVar.f21444a instanceof WindVaneWebView) {
                    WindVaneWebView windVaneWebView = aVar.f21444a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((C8789a) windVaneWebView.getWebViewListener()).mo58184a(windVaneWebView, str3, str2, i2, i);
                    }
                }
            }
            C8824g.m25670a().mo58311a(obj, m27110b(0));
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "loadads error", th);
            C8824g.m25670a().mo58311a(obj, m27110b(1));
        }
    }

    /* renamed from: a */
    private void m27109a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "params is null");
                C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e) {
            C8608u.m24880a("JS-Video-Brigde", e.getMessage());
        }
    }

    public void createWebview(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62137b(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "createWebview error " + th);
        }
    }

    public void createView(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62128a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "createView error " + th);
        }
    }

    public void createPlayerView(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62140c(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "createPlayerView error " + th);
        }
    }

    public void createSubPlayTemplateView(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62141d(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "createSubPlayTemplateView error " + th);
        }
    }

    public void destroyComponent(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62144e(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "destroyComponent error " + th);
        }
    }

    public void getComponentOptions(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62145f(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "getComponentOptions error " + th);
        }
    }

    public void setViewRect(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62147g(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "setViewRect error " + th);
        }
    }

    public void removeFromSuperView(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62149h(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "removeFromSuperView error " + th);
        }
    }

    public void appendSubView(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62150i(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "appendSubView error " + th);
        }
    }

    public void appendViewTo(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62151j(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "appendViewTo error " + th);
        }
    }

    public void onlyAppendSubView(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62152k(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "appendSubView error " + th);
        }
    }

    public void onlyAppendViewTo(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62153l(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "appendViewTo error " + th);
        }
    }

    public void bringViewToFront(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62154m(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "bringViewToFront error " + th);
        }
    }

    public void hideView(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62155n(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "hideView error " + th);
        }
    }

    public void showView(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62156o(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "showView error " + th);
        }
    }

    public void setViewBgColor(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62157p(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "setViewBgColor error " + th);
        }
    }

    public void setViewAlpha(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62158q(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "setViewAlpha error " + th);
        }
    }

    public void setViewScale(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62159r(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "setViewScale error " + th);
        }
    }

    public void insertViewAbove(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62129a(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "insertViewAbove error " + th);
        }
    }

    public void insertViewBelow(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62138b(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "insertViewBelow error " + th);
        }
    }

    public void onlyInsertViewAbove(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62160s(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "insertViewAbove error " + th);
        }
    }

    public void onlyInsertViewBelow(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62138b(obj, new JSONObject(str), false);
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "insertViewBelow error " + th);
        }
    }

    public void webviewLoad(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62161t(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "webviewLoad error " + th);
        }
    }

    public void webviewReload(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62162u(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "webviewReload error " + th);
        }
    }

    public void webviewGoBack(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62163v(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "webviewGoBack error " + th);
        }
    }

    public void webviewGoForward(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62164w(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "webviewGoForward error " + th);
        }
    }

    public void playerPlay(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62165x(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerPlay error " + th);
        }
    }

    public void playerPause(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62166y(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerPause error " + th);
        }
    }

    public void playerResume(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62167z(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerResume error " + th);
        }
    }

    public void playerStop(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62108A(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerStop error " + th);
        }
    }

    public void playerUpdateFrame(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62109B(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerUpdateFrame error " + th);
        }
    }

    public void playerMute(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62110C(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerMute error " + th);
        }
    }

    public void playerUnmute(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62111D(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerUnmute error " + th);
        }
    }

    public void playerGetMuteState(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62112E(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerGetMuteState error " + th);
        }
    }

    public void playerSetSource(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62113F(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerSetSource error " + th);
        }
    }

    public void playerSetRenderType(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62114G(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "playerSetRenderType error " + th);
        }
    }

    public void preloadSubPlayTemplateView(Object obj, String str) {
        m27109a(obj, str);
        try {
            if (this.f23059d != null) {
                C9196c.m26194a().mo62115H(obj, new JSONObject(str));
                return;
            }
            C8818a aVar = (C8818a) obj;
            if (aVar.f21444a instanceof WindVaneWebView) {
                WindVaneWebView windVaneWebView = aVar.f21444a;
                if (windVaneWebView.getWebViewListener() != null) {
                    ((C8789a) windVaneWebView.getWebViewListener()).mo58186a(obj, str);
                    C8608u.m24880a("JS-Video-Brigde", "preloadSubPlayTemplateView: RVWebViewListener");
                    return;
                }
                C8608u.m24880a("JS-Video-Brigde", "preloadSubPlayTemplateView: failed");
            }
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "preloadSubPlayTemplateView error " + th);
        }
    }

    public void closeAd(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62116I(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "closeAd error " + th);
        }
    }

    public void broadcast(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62117J(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "broadcast error " + th);
        }
    }

    public void closeWeb(Object obj, String str) {
        C8608u.m24884d("JS-Video-Brigde", "type" + str);
        try {
            if (!TextUtils.isEmpty(str) && this.f23059d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("status");
                this.f23059d.getJSContainerModule().hideAlertWebview();
                this.f23059d.getJSVideoModule().hideAlertView(optInt);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "closeWeb", th);
        }
    }

    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        C8608u.m24884d("JS-Video-Brigde", "ivRewardAdsWithoutVideo ： params" + str);
        try {
            if (!TextUtils.isEmpty(str) && this.f23059d != null && !TextUtils.isEmpty(str)) {
                this.f23059d.getJSContainerModule().ivRewardAdsWithoutVideo(str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("JS-Video-Brigde", "ivRewardAdsWithoutVideo", th);
        }
    }

    public void setSubPlayTemplateInfo(Object obj, String str) {
        C8608u.m24884d("JS-Video-Brigde", "setSubPlayTemplateInfo : " + str);
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62118K(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "setSubPlayTemplateInfo error " + th);
        }
    }

    public void webviewFireEvent(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62119L(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "setSubPlayTemplateInfo error " + th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62120M(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "increaseOfferFrequence error " + th);
        }
    }

    public void handleNativeObject(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9193b.m26189a().mo62107a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "handleNativeObject error " + th);
        }
    }

    public void loadingResourceStatus(Object obj, String str) {
        m27109a(obj, str);
        if (obj != null) {
            try {
                C8818a aVar = (C8818a) obj;
                int optInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.f21444a != null) {
                    WindVaneWebView windVaneWebView = aVar.f21444a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        windVaneWebView.getWebViewListener().mo57906c(windVaneWebView, optInt);
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d("JS-Video-Brigde", "loadingResourceStatus error " + th);
            }
        }
    }

    public void createNativeEC(Object obj, String str) {
        m27109a(obj, str);
        try {
            C9196c.m26194a().mo62122O(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "createNativeEC error " + th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2 A[Catch:{ all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fe A[ADDED_TO_REGION, Catch:{ all -> 0x0128 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCacheItem(java.lang.Object r12, java.lang.String r13) {
        /*
            r11 = this;
            com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C2358b.m5644a()
            boolean r0 = r0.mo15829d()
            java.lang.String r1 = "MBridgeH5CacheSP"
            if (r0 == 0) goto L_0x0025
            com.mbridge.msdk.foundation.tools.FastKV r0 = r11.f23060e
            if (r0 != 0) goto L_0x0025
            com.mbridge.msdk.foundation.tools.FastKV$Builder r0 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x0022 }
            com.mbridge.msdk.foundation.same.b.c r2 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x0022 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r2)     // Catch:{ Exception -> 0x0022 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0022 }
            com.mbridge.msdk.foundation.tools.FastKV r0 = r0.build()     // Catch:{ Exception -> 0x0022 }
            r11.f23060e = r0     // Catch:{ Exception -> 0x0022 }
            goto L_0x0025
        L_0x0022:
            r0 = 0
            r11.f23060e = r0
        L_0x0025:
            com.mbridge.msdk.foundation.tools.FastKV r0 = r11.f23060e
            java.lang.String r2 = "Save Success"
            java.lang.String r3 = "value"
            java.lang.String r4 = "key"
            java.lang.String r5 = "Save Error, reason is : "
            r6 = 1
            java.lang.String r7 = "setCacheItem error "
            java.lang.String r8 = "JS-Video-Brigde"
            r9 = 0
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x0060
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0064 }
            r0.<init>(r13)     // Catch:{ all -> 0x0064 }
            java.lang.String r13 = r0.getString(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = r0.getString(r3)     // Catch:{ all -> 0x0064 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x005d
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x005d
            com.mbridge.msdk.foundation.tools.FastKV r1 = r11.f23060e     // Catch:{ Exception -> 0x005d }
            r1.putString(r13, r0)     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            r13 = r6
            goto L_0x00e9
        L_0x0060:
            r13 = r9
            r2 = r10
            goto L_0x00e9
        L_0x0064:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r2 = r0.toString()
            goto L_0x00e8
        L_0x008b:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x00c2 }
            android.content.Context r0 = r0.mo15792g()     // Catch:{ all -> 0x00c2 }
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r9)     // Catch:{ all -> 0x00c2 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x00c2 }
            if (r1 != 0) goto L_0x0060
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00c2 }
            r1.<init>(r13)     // Catch:{ all -> 0x00c2 }
            java.lang.String r13 = r1.getString(r4)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = r1.getString(r3)     // Catch:{ all -> 0x00c2 }
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x00c2 }
            if (r3 != 0) goto L_0x005d
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00c2 }
            if (r3 != 0) goto L_0x005d
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x00c2 }
            android.content.SharedPreferences$Editor r13 = r0.putString(r13, r1)     // Catch:{ all -> 0x00c2 }
            r13.apply()     // Catch:{ all -> 0x00c2 }
            goto L_0x005d
        L_0x00c2:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r2 = r0.toString()
        L_0x00e8:
            r13 = r9
        L_0x00e9:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0128 }
            r0.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r1 = "code"
            if (r13 == 0) goto L_0x00f3
            r6 = r9
        L_0x00f3:
            r0.put(r1, r6)     // Catch:{ all -> 0x0128 }
            java.lang.String r1 = "message"
            r0.put(r1, r2)     // Catch:{ all -> 0x0128 }
            r1 = 2
            if (r12 == 0) goto L_0x0114
            if (r13 == 0) goto L_0x0114
            com.mbridge.msdk.mbsignalcommon.windvane.g r13 = com.mbridge.msdk.mbsignalcommon.windvane.C8824g.m25670a()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0128 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ all -> 0x0128 }
            r13.mo58311a(r12, r0)     // Catch:{ all -> 0x0128 }
            goto L_0x012b
        L_0x0114:
            com.mbridge.msdk.mbsignalcommon.windvane.g r13 = com.mbridge.msdk.mbsignalcommon.windvane.C8824g.m25670a()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0128 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ all -> 0x0128 }
            r13.mo58313b(r12, r0)     // Catch:{ all -> 0x0128 }
            goto L_0x012b
        L_0x0128:
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r8, r7)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.setCacheItem(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc A[Catch:{ all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8 A[ADDED_TO_REGION, Catch:{ all -> 0x0112 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeCacheItem(java.lang.Object r11, java.lang.String r12) {
        /*
            r10 = this;
            com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C2358b.m5644a()
            boolean r0 = r0.mo15829d()
            java.lang.String r1 = "MBridgeH5CacheSP"
            if (r0 == 0) goto L_0x0025
            com.mbridge.msdk.foundation.tools.FastKV r0 = r10.f23060e
            if (r0 != 0) goto L_0x0025
            com.mbridge.msdk.foundation.tools.FastKV$Builder r0 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x0022 }
            com.mbridge.msdk.foundation.same.b.c r2 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x0022 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r2)     // Catch:{ Exception -> 0x0022 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0022 }
            com.mbridge.msdk.foundation.tools.FastKV r0 = r0.build()     // Catch:{ Exception -> 0x0022 }
            r10.f23060e = r0     // Catch:{ Exception -> 0x0022 }
            goto L_0x0025
        L_0x0022:
            r0 = 0
            r10.f23060e = r0
        L_0x0025:
            com.mbridge.msdk.foundation.tools.FastKV r0 = r10.f23060e
            java.lang.String r2 = "Delete Success"
            java.lang.String r3 = "key"
            java.lang.String r4 = "Delete Error, reason is : "
            r5 = 1
            java.lang.String r6 = "removeCacheItem error "
            java.lang.String r7 = "JS-Video-Brigde"
            r8 = 0
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x007f
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0054
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0058 }
            r0.<init>(r12)     // Catch:{ all -> 0x0058 }
            java.lang.String r12 = r0.getString(r3)     // Catch:{ all -> 0x0058 }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0051
            com.mbridge.msdk.foundation.tools.FastKV r0 = r10.f23060e     // Catch:{ Exception -> 0x0051 }
            r0.remove(r12)     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            r12 = r5
            goto L_0x00d3
        L_0x0054:
            r12 = r8
            r2 = r9
            goto L_0x00d3
        L_0x0058:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r2 = r0.toString()
            goto L_0x00d2
        L_0x007f:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x00ac }
            android.content.Context r0 = r0.mo15792g()     // Catch:{ all -> 0x00ac }
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r8)     // Catch:{ all -> 0x00ac }
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x00ac }
            if (r1 != 0) goto L_0x0054
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00ac }
            r1.<init>(r12)     // Catch:{ all -> 0x00ac }
            java.lang.String r12 = r1.getString(r3)     // Catch:{ all -> 0x00ac }
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x00ac }
            if (r1 != 0) goto L_0x0051
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x00ac }
            android.content.SharedPreferences$Editor r12 = r0.remove(r12)     // Catch:{ all -> 0x00ac }
            r12.apply()     // Catch:{ all -> 0x00ac }
            goto L_0x0051
        L_0x00ac:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r2 = r0.toString()
        L_0x00d2:
            r12 = r8
        L_0x00d3:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0112 }
            r0.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "code"
            if (r12 == 0) goto L_0x00dd
            r5 = r8
        L_0x00dd:
            r0.put(r1, r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "message"
            r0.put(r1, r2)     // Catch:{ all -> 0x0112 }
            r1 = 2
            if (r11 == 0) goto L_0x00fe
            if (r12 == 0) goto L_0x00fe
            com.mbridge.msdk.mbsignalcommon.windvane.g r12 = com.mbridge.msdk.mbsignalcommon.windvane.C8824g.m25670a()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0112 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ all -> 0x0112 }
            r12.mo58311a(r11, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x0115
        L_0x00fe:
            com.mbridge.msdk.mbsignalcommon.windvane.g r12 = com.mbridge.msdk.mbsignalcommon.windvane.C8824g.m25670a()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0112 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ all -> 0x0112 }
            r12.mo58313b(r11, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x0115
        L_0x0112:
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r7, r6)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.removeCacheItem(java.lang.Object, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0102 A[SYNTHETIC, Splitter:B:42:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106 A[Catch:{ all -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d A[Catch:{ all -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getAllCache(java.lang.Object r9, java.lang.String r10) {
        /*
            r8 = this;
            com.mbridge.msdk.foundation.controller.b r10 = com.mbridge.msdk.foundation.controller.C2358b.m5644a()
            boolean r10 = r10.mo15829d()
            java.lang.String r0 = "MBridgeH5CacheSP"
            r1 = 0
            if (r10 == 0) goto L_0x0025
            com.mbridge.msdk.foundation.tools.FastKV r10 = r8.f23060e
            if (r10 != 0) goto L_0x0025
            com.mbridge.msdk.foundation.tools.FastKV$Builder r10 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x0023 }
            com.mbridge.msdk.foundation.same.b.c r2 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x0023 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r2)     // Catch:{ Exception -> 0x0023 }
            r10.<init>(r2, r0)     // Catch:{ Exception -> 0x0023 }
            com.mbridge.msdk.foundation.tools.FastKV r10 = r10.build()     // Catch:{ Exception -> 0x0023 }
            r8.f23060e = r10     // Catch:{ Exception -> 0x0023 }
            goto L_0x0025
        L_0x0023:
            r8.f23060e = r1
        L_0x0025:
            com.mbridge.msdk.foundation.tools.FastKV r10 = r8.f23060e
            java.lang.String r2 = "getAllCache Success"
            r3 = 0
            java.lang.String r4 = "getAllCache Error, reason is : "
            java.lang.String r5 = "getAllCache error "
            java.lang.String r6 = "JS-Video-Brigde"
            if (r10 == 0) goto L_0x008c
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x0065 }
            r10.<init>()     // Catch:{ all -> 0x0065 }
            com.mbridge.msdk.foundation.tools.FastKV r0 = r8.f23060e     // Catch:{ Exception -> 0x0041 }
            java.util.Map r1 = r0.getAll()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0041
        L_0x003e:
            r0 = move-exception
            r1 = r10
            goto L_0x0066
        L_0x0041:
            if (r1 == 0) goto L_0x00ef
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x003e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003e }
        L_0x004b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x00ef
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003e }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x003e }
            java.lang.Object r7 = r1.getKey()     // Catch:{ all -> 0x003e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x003e }
            r10.put(r7, r1)     // Catch:{ all -> 0x003e }
            goto L_0x004b
        L_0x0065:
            r0 = move-exception
        L_0x0066:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r6, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            java.lang.String r0 = r0.getMessage()
            r10.append(r0)
            java.lang.String r2 = r10.toString()
            goto L_0x00ee
        L_0x008c:
            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x00c8 }
            android.content.Context r10 = r10.mo15792g()     // Catch:{ all -> 0x00c8 }
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r0, r3)     // Catch:{ all -> 0x00c8 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00c8 }
            r0.<init>()     // Catch:{ all -> 0x00c8 }
            java.util.Map r10 = r10.getAll()     // Catch:{ all -> 0x00c5 }
            java.util.Set r10 = r10.entrySet()     // Catch:{ all -> 0x00c5 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x00c5 }
        L_0x00a9:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00c3
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x00c5 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x00c5 }
            java.lang.Object r7 = r1.getKey()     // Catch:{ all -> 0x00c5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00c5 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00c5 }
            r0.put(r7, r1)     // Catch:{ all -> 0x00c5 }
            goto L_0x00a9
        L_0x00c3:
            r10 = r0
            goto L_0x00ef
        L_0x00c5:
            r10 = move-exception
            r1 = r0
            goto L_0x00c9
        L_0x00c8:
            r10 = move-exception
        L_0x00c9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r2 = r0.toString()
        L_0x00ee:
            r10 = r1
        L_0x00ef:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0122 }
            r0.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "code"
            r0.put(r1, r3)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "message"
            r0.put(r1, r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "data"
            if (r10 == 0) goto L_0x0106
            r0.put(r1, r10)     // Catch:{ all -> 0x0122 }
            goto L_0x010b
        L_0x0106:
            java.lang.String r10 = "{}"
            r0.put(r1, r10)     // Catch:{ all -> 0x0122 }
        L_0x010b:
            if (r9 == 0) goto L_0x0135
            com.mbridge.msdk.mbsignalcommon.windvane.g r10 = com.mbridge.msdk.mbsignalcommon.windvane.C8824g.m25670a()     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0122 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0122 }
            r1 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ all -> 0x0122 }
            r10.mo58311a(r9, r0)     // Catch:{ all -> 0x0122 }
            goto L_0x0135
        L_0x0122:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r6, r9)
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.getAllCache(java.lang.Object, java.lang.String):void");
    }

    public void clearAllCache(Object obj, String str) {
        if (C2358b.m5644a().mo15829d() && this.f23060e == null) {
            try {
                this.f23060e = new FastKV.Builder(C8422e.m24335b(C8420c.MBRIDGE_700_CONFIG), "MBridgeH5CacheSP").build();
            } catch (Exception unused) {
                this.f23060e = null;
            }
        }
        FastKV fastKV = this.f23060e;
        if (fastKV != null) {
            try {
                fastKV.clear();
            } catch (Exception unused2) {
            }
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", 0);
                    jSONObject.put("message", InitializationStatus.SUCCESS);
                    C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Throwable th) {
                    C8608u.m24884d("JS-Video-Brigde", "getAllCache error " + th);
                }
            }
        } else {
            try {
                C2350a.m5601e().mo15792g().getSharedPreferences("MBridgeH5CacheSP", 0).edit().clear().apply();
                if (obj != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", InitializationStatus.SUCCESS);
                    C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                }
            } catch (Throwable th2) {
                C8608u.m24884d("JS-Video-Brigde", "getAllCache error " + th2);
            }
        }
    }

    public void getCutout(Object obj, String str) {
        try {
            String i = this.f23059d.getJSCommon().mo62834i();
            C8608u.m24884d("JS-Video-Brigde", i);
            if (obj == null || TextUtils.isEmpty(i)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "No notch data, plz try again later.");
                C8824g.m25670a().mo58313b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                return;
            }
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(i.getBytes(), 2));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "getCutout error : " + th.getMessage());
        }
    }

    public void cai(Object obj, String str) {
        C8608u.m24880a("JS-Video-Brigde", "cai:" + str);
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
                    C8608u.m24880a("JS-Video-Brigde", e.getMessage());
                }
            } catch (JSONException e2) {
                C8805b.m25604a(obj, "exception: " + e2.getLocalizedMessage());
                C8608u.m24881a("JS-Video-Brigde", "cai", e2);
            } catch (Throwable th) {
                C8805b.m25604a(obj, "exception: " + th.getLocalizedMessage());
                C8608u.m24881a("JS-Video-Brigde", "cai", th);
            }
        }
    }

    public void getAppSetting(Object obj, String str) {
        JSONObject jSONObject;
        try {
            String optString = new JSONObject(str).optString("appid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString)) {
                String c = C2283b.m5275a().mo15566c(optString);
                if (TextUtils.isEmpty(c)) {
                    jSONObject = new JSONObject(C2283b.m5275a().mo15562b().mo15461aD());
                } else {
                    jSONObject = new JSONObject(c);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", InitializationStatus.SUCCESS);
                    jSONObject2.put("data", jSONObject);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "Get App Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "Get App Setting error, because must give a appId.");
            }
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "getAppSetting error : " + th.getMessage());
        }
    }

    public void getRewardSetting(Object obj, String str) {
        try {
            JSONObject j = C9549b.m27299a().mo63129b().mo63122j();
            JSONObject jSONObject = new JSONObject();
            if (obj == null || j == null) {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Get Reward Setting error, plz try again later.");
            } else {
                jSONObject.put("code", 0);
                jSONObject.put("message", InitializationStatus.SUCCESS);
                jSONObject.put("data", j);
            }
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "getRewardSetting error : " + th.getMessage());
        }
    }

    public void getRewardUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("appid", "");
            String optString2 = jSONObject.optString("unitid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString)) {
                if (!TextUtils.isEmpty(optString2)) {
                    JSONObject D = C9549b.m27299a().mo63123a(optString, optString2).mo63134D();
                    if (obj == null || D == null) {
                        jSONObject2.put("code", 1);
                        jSONObject2.put("message", "Get Reward Unit Setting error, plz try again later.");
                    } else {
                        jSONObject2.put("code", 0);
                        jSONObject2.put("message", InitializationStatus.SUCCESS);
                        jSONObject2.put("data", D);
                    }
                    C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                }
            }
            jSONObject2.put("code", 1);
            jSONObject2.put("message", "Get reward unit Setting error, because must give appId and unitId.");
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "getRewardUnitSetting error : " + th.getMessage());
        }
    }

    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("message", "Get Unit Setting error, RV/IV can not support this method.");
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "getUnitSetting error : " + th.getMessage());
        }
    }

    public void getEncryptPrice(Object obj, String str) {
        String str2;
        String str3 = "not replaced";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            int i = 1;
            if (TextUtils.isEmpty(str)) {
                str2 = "params is null";
            } else {
                JSONObject jSONObject3 = new JSONObject(str);
                String optString = jSONObject3.optString("unitid", "");
                String optString2 = jSONObject3.optString(C5849bb.KEY_REQUEST_ID, "");
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                    str2 = "params parsing exception";
                } else {
                    C8402c c = C8417d.m24314c(optString, optString2);
                    if (c != null && c.mo57315d() == 1) {
                        str3 = "success";
                        jSONObject2.put("encrypt_p", c.mo57310b());
                        jSONObject2.put(CampaignUnit.KEY_IRLFA, 1);
                        i = 0;
                    }
                    str2 = str3;
                }
            }
            jSONObject.put("code", i);
            jSONObject.put("message", str2);
            jSONObject.put("data", jSONObject2);
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C8608u.m24884d("JS-Video-Brigde", "getEncryptPrice error : " + th.getMessage());
        }
    }
}
