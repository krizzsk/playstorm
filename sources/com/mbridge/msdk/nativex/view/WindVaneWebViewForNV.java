package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8524c;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.listener.C8834b;
import org.json.JSONObject;

public class WindVaneWebViewForNV extends WindVaneWebView {

    /* renamed from: e */
    private static String f21633e = "WindVaneWebViewForNV";

    /* renamed from: f */
    private C8834b f21634f;

    /* renamed from: g */
    private boolean f21635g = false;

    public void setInterceptTouch(boolean z) {
        this.f21635g = z;
    }

    public void setBackListener(C8834b bVar) {
        this.f21634f = bVar;
    }

    public WindVaneWebViewForNV(Context context) {
        super(context);
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f21635g) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C8834b bVar;
        if (i != 4 || (bVar = this.f21634f) == null) {
            return super.onKeyDown(i, keyEvent);
        }
        bVar.mo58333a();
        return true;
    }

    public void webViewShow(CampaignEx campaignEx, String str) {
        try {
            C8824g.m25670a().mo58310a((WebView) this, "webviewshow", "");
            C8412m mVar = new C8412m();
            mVar.mo57463k(campaignEx.getRequestId());
            mVar.mo57465l(campaignEx.getRequestIdNotice());
            if (getContext() == null) {
                return;
            }
            if (getContext().getApplicationContext() != null) {
                mVar.mo57469n(campaignEx.getId());
                mVar.mo57439a(campaignEx.isMraid() ? C8412m.f20281a : C8412m.f20282b);
                C8524c.m24635a(mVar, getContext().getApplicationContext(), str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void orientation(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            C8824g.m25670a().mo58310a((WebView) this, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
