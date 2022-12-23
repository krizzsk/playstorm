package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;

public class WindVaneWebView extends BaseWebView {

    /* renamed from: b */
    protected C8828k f21432b;

    /* renamed from: c */
    protected C8820c f21433c;

    /* renamed from: d */
    protected C8823f f21434d;

    /* renamed from: e */
    private Object f21435e;

    /* renamed from: f */
    private Object f21436f;

    /* renamed from: g */
    private String f21437g;

    /* renamed from: h */
    private C8821d f21438h;

    /* renamed from: i */
    private String f21439i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f21440j = false;

    /* renamed from: k */
    private float f21441k = 0.0f;

    /* renamed from: l */
    private float f21442l = 0.0f;

    public WindVaneWebView(Context context) {
        super(context);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSignalCommunication(C8820c cVar) {
        this.f21433c = cVar;
        cVar.mo58300a(this);
    }

    public C8820c getSignalCommunication() {
        return this.f21433c;
    }

    public void setRid(String str) {
        this.f21439i = str;
    }

    public String getRid() {
        return this.f21439i;
    }

    public Object getJsObject(String str) {
        C8823f fVar = this.f21434d;
        if (fVar == null) {
            return null;
        }
        return fVar.mo58305a(str);
    }

    public void registerWindVanePlugin(Class cls) {
        C8823f fVar = this.f21434d;
        if (fVar != null) {
            fVar.mo58308a(cls.getSimpleName(), cls);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58199a() {
        super.mo58199a();
        getSettings().setSavePassword(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f21432b == null) {
            this.f21432b = new C8828k(this);
        }
        setWebViewChromeClient(this.f21432b);
        this.mWebViewClient = new C8829l();
        setWebViewClient(this.mWebViewClient);
        if (this.f21433c == null) {
            C8826i iVar = new C8826i(this.f21384a);
            this.f21433c = iVar;
            setSignalCommunication(iVar);
        }
        this.f21434d = new C8823f(this.f21384a, this);
    }

    public void setApiManagerContext(Context context) {
        C8823f fVar = this.f21434d;
        if (fVar != null) {
            fVar.mo58306a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        C8823f fVar = this.f21434d;
        if (fVar != null) {
            fVar.mo58307a(obj);
        }
    }

    public void setWebViewChromeClient(C8828k kVar) {
        this.f21432b = kVar;
        setWebChromeClient(kVar);
    }

    public void setObject(Object obj) {
        this.f21435e = obj;
    }

    public Object getObject() {
        return this.f21435e;
    }

    public void setMraidObject(Object obj) {
        this.f21436f = obj;
    }

    public Object getMraidObject() {
        return this.f21436f;
    }

    public void setWebViewListener(C8821d dVar) {
        this.f21438h = dVar;
        C8828k kVar = this.f21432b;
        if (kVar != null) {
            kVar.mo58316a(dVar);
        }
        if (this.mWebViewClient != null) {
            this.mWebViewClient.mo58208a(dVar);
        }
    }

    public C8821d getWebViewListener() {
        return this.f21438h;
    }

    public boolean isDestoryed() {
        return this.f21440j;
    }

    public void release() {
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener((DownloadListener) null);
            this.f21435e = null;
            int m = C8613y.m24958m(getContext());
            if (m == 0) {
                this.f21440j = true;
                destroy();
                return;
            }
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    boolean unused = WindVaneWebView.this.f21440j = true;
                    WindVaneWebView.this.destroy();
                }
            }, (long) (m * 1000));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearWebView() {
        if (!this.f21440j) {
            loadUrl("about:blank");
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    public String getCampaignId() {
        return this.f21437g;
    }

    public void setCampaignId(String str) {
        this.f21437g = str;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mWebViewClient != null && (this.mWebViewClient.mo58209b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f21441k = motionEvent.getRawX();
                    this.f21442l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f21441k;
                    float y = motionEvent.getY() - this.f21442l;
                    if ((rawX >= 0.0f || rawX * -1.0f <= ((float) 48)) && ((rawX <= 0.0f || rawX <= ((float) 48)) && ((y >= 0.0f || -1.0f * y <= ((float) 48)) && (y <= 0.0f || y <= ((float) 48))))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
