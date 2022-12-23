package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.C9413a;
import com.mbridge.msdk.video.signal.C9431b;
import com.mbridge.msdk.video.signal.C9432c;
import com.mbridge.msdk.video.signal.C9526e;
import com.mbridge.msdk.video.signal.C9527f;
import com.mbridge.msdk.video.signal.C9531h;
import com.mbridge.msdk.video.signal.C9532i;
import com.mbridge.msdk.video.signal.factory.C9528a;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.p369a.C9425j;
import com.mbridge.msdk.videocommon.C9536a;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import org.json.JSONObject;

public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: a */
    private int f23336a = 0;

    /* renamed from: b */
    private int f23337b = 1;
    /* access modifiers changed from: protected */

    /* renamed from: j */
    public Activity f23338j;
    /* access modifiers changed from: protected */

    /* renamed from: k */
    public String f23339k;
    /* access modifiers changed from: protected */

    /* renamed from: l */
    public String f23340l;
    /* access modifiers changed from: protected */

    /* renamed from: m */
    public C9551c f23341m;

    /* renamed from: n */
    protected String f23342n;

    /* renamed from: o */
    protected C9541c f23343o;

    /* renamed from: p */
    protected String f23344p;

    /* renamed from: q */
    protected int f23345q = 2;
    /* access modifiers changed from: protected */

    /* renamed from: r */
    public boolean f23346r = false;

    /* renamed from: s */
    protected boolean f23347s = false;

    /* renamed from: t */
    protected int f23348t;

    /* renamed from: u */
    protected int f23349u;

    /* renamed from: v */
    protected int f23350v;
    /* access modifiers changed from: protected */

    /* renamed from: w */
    public boolean f23351w = false;

    /* renamed from: x */
    protected IJSFactory f23352x = new C9528a();

    public AbstractJSContainer(Context context) {
        super(context);
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f23352x = iJSFactory;
    }

    public void onResume() {
        if (!C2347b.f4898c) {
            if (getJSCommon().mo62821b()) {
                getActivityProxy().mo62803b();
            }
            getActivityProxy().mo62801a(0);
        }
    }

    public void onPause() {
        if (getJSCommon().mo62821b()) {
            getActivityProxy().mo62800a();
        }
        getActivityProxy().mo62801a(1);
    }

    public void onStop() {
        if (getJSCommon().mo62821b()) {
            getActivityProxy().mo62804c();
        }
        getActivityProxy().mo62801a(3);
    }

    public void onRestart() {
        if (getJSCommon().mo62821b()) {
            getActivityProxy().mo62806e();
        }
        getActivityProxy().mo62801a(4);
    }

    public void onStart() {
        if (getJSCommon().mo62821b()) {
            getActivityProxy().mo62805d();
        }
        getActivityProxy().mo62801a(2);
    }

    public void onDestroy() {
        if (getJSCommon().mo62821b()) {
            getActivityProxy().mo62807f();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().mo62821b()) {
            getActivityProxy().mo62802a(configuration);
        }
    }

    public C9413a getActivityProxy() {
        return this.f23352x.getActivityProxy();
    }

    public C9432c getJSCommon() {
        return this.f23352x.getJSCommon();
    }

    public C9532i getJSVideoModule() {
        return this.f23352x.getJSVideoModule();
    }

    public C9527f getJSNotifyProxy() {
        return this.f23352x.getJSNotifyProxy();
    }

    public C9526e getJSContainerModule() {
        return this.f23352x.getJSContainerModule();
    }

    public C9531h getIJSRewardVideoV1() {
        return this.f23352x.getIJSRewardVideoV1();
    }

    public C9431b getJSBTModule() {
        return this.f23352x.getJSBTModule();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63045a(Object obj) {
        C8824g.m25670a().mo58311a(obj, m27202a(this.f23336a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63046a(Object obj, String str) {
        C8824g.m25670a().mo58313b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    /* renamed from: a */
    private String m27202a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8608u.m24884d("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    public void setRewardId(String str) {
        this.f23344p = str;
    }

    public void setUserId(String str) {
        this.f23342n = str;
    }

    public void setUnitId(String str) {
        this.f23339k = str;
    }

    public String getUnitId() {
        return this.f23339k;
    }

    public String getPlacementId() {
        return this.f23340l;
    }

    public void setPlacementId(String str) {
        this.f23340l = str;
    }

    public void setActivity(Activity activity) {
        this.f23338j = activity;
    }

    public void setReward(C9541c cVar) {
        this.f23343o = cVar;
    }

    public void setMute(int i) {
        this.f23345q = i;
    }

    public void setIV(boolean z) {
        this.f23346r = z;
    }

    public void setBidCampaign(boolean z) {
        this.f23347s = z;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f23348t = i;
        this.f23349u = i2;
        this.f23350v = i3;
    }

    public void setBigOffer(boolean z) {
        this.f23351w = z;
    }

    public void setRewardUnitSetting(C9551c cVar) {
        this.f23341m = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62204a(String str) {
        C8608u.m24884d("AbstractJSContainer", str);
        Activity activity = this.f23338j;
        if (activity != null) {
            activity.finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9425j mo63047b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        C9536a.C9537a a = C9536a.m27221a(this.f23346r ? 287 : 94, campaignEx);
        if (a != null && a.mo63075c()) {
            WindVaneWebView a2 = a.mo63070a();
            if (a2.getObject() instanceof C9425j) {
                return (C9425j) a2.getObject();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo63049c(CampaignEx campaignEx) {
        C9425j b = mo63047b(campaignEx);
        if (b != null) {
            return b.mo62837l();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63044a(C9551c cVar, CampaignEx campaignEx) {
        CampaignEx.C8398c rewardTemplateMode;
        if (mo63049c(campaignEx) != 1) {
            boolean z = false;
            if (!(campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null)) {
                z = m27203b(rewardTemplateMode.mo57203c());
            }
            if (!z && cVar != null) {
                m27203b(this.f23341m.mo63144c());
            }
        }
    }

    /* renamed from: b */
    private boolean m27203b(int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f23338j.setRequestedOrientation(11);
                } else {
                    this.f23338j.setRequestedOrientation(0);
                }
            } catch (Throwable th) {
                C8608u.m24881a("AbstractJSContainer", th.getMessage(), th);
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.f23338j.setRequestedOrientation(12);
        } else {
            this.f23338j.setRequestedOrientation(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo63048b() {
        C9551c cVar;
        if (!TextUtils.isEmpty(this.f23340l) || (cVar = this.f23341m) == null || TextUtils.isEmpty(cVar.mo63188y())) {
            return this.f23340l;
        }
        return this.f23341m.mo63188y();
    }
}
