package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

public class BannerSignalPlugin extends AbsFeedBackForH5 {

    /* renamed from: d */
    private final String f21407d = "BannerSignalPlugin";

    /* renamed from: e */
    private C8807c f21408e;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof C8807c) {
                this.f21408e = (C8807c) context;
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof C8807c)) {
                this.f21408e = (C8807c) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "initialize", th);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "onSignalCommunication");
            if (this.f21408e != null) {
                this.f21408e.mo58236f(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "onSignalCommunication", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "readyStatus");
            if (this.f21408e != null) {
                this.f21408e.mo58008c(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "readyStatus", th);
        }
    }

    public void init(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "init");
            if (this.f21408e != null) {
                this.f21408e.mo58005a(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "init", th);
        }
    }

    public void click(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "click");
            if (this.f21408e != null) {
                this.f21408e.mo58007b(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "click", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "toggleCloseBtn");
            if (this.f21408e != null) {
                this.f21408e.mo58009d(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "triggerCloseBtn");
            if (this.f21408e != null) {
                this.f21408e.mo58010e(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "triggerCloseBtn", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "sendImpressions");
            if (this.f21408e != null) {
                this.f21408e.mo58011i(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "sendImpressions", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "reportUrls");
            if (this.f21408e != null) {
                this.f21408e.mo58239k(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "reportUrls", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "increaseOfferFrequence");
            if (this.f21408e != null) {
                this.f21408e.mo58240l(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "increaseOfferFrequence", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "resetCountdown");
            if (this.f21408e != null) {
                this.f21408e.mo58238h(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "resetCountdown", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "handlerH5Exception");
            if (this.f21408e != null) {
                this.f21408e.mo58241m(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "handlerH5Exception", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "install");
            if (this.f21408e != null) {
                this.f21408e.mo58237g(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "install", th);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "getNetstat");
            if (this.f21408e != null) {
                this.f21408e.mo58243o(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "getNetstat", th);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "openURL");
            if (this.f21408e != null) {
                this.f21408e.mo58242n(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "openURL", th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            C8608u.m24884d("BannerSignalPlugin", "getFileInfo");
            if (this.f21408e != null) {
                this.f21408e.mo58012j(obj, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalPlugin", "getFileInfo", th);
        }
    }
}
