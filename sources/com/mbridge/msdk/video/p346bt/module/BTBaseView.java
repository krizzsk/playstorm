package com.mbridge.msdk.video.p346bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.video.p346bt.p347a.C9196c;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.BTBaseView */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n */
    protected static int f22188n = 0;

    /* renamed from: o */
    protected static int f22189o = 1;

    /* renamed from: a */
    protected Context f22190a;

    /* renamed from: b */
    protected CampaignEx f22191b;

    /* renamed from: c */
    protected String f22192c;

    /* renamed from: d */
    protected String f22193d;

    /* renamed from: e */
    protected C9551c f22194e;

    /* renamed from: f */
    protected LayoutInflater f22195f;

    /* renamed from: g */
    protected int f22196g;

    /* renamed from: h */
    protected boolean f22197h;

    /* renamed from: i */
    protected float f22198i;

    /* renamed from: j */
    protected float f22199j;

    /* renamed from: k */
    protected Rect f22200k;

    /* renamed from: l */
    protected int f22201l;

    /* renamed from: m */
    protected int f22202m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62172a() {
    }

    public abstract void init(Context context);

    public abstract void onDestory();

    public String getUnitId() {
        return this.f22192c;
    }

    public void setUnitId(String str) {
        this.f22192c = str;
    }

    public String getInstanceId() {
        return this.f22193d;
    }

    public void setInstanceId(String str) {
        this.f22193d = str;
    }

    public BTBaseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22193d = "";
        this.f22196g = 1;
        this.f22197h = false;
        this.f22190a = context;
        this.f22195f = LayoutInflater.from(context);
        init(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f22196g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f22196g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f22191b = campaignEx;
    }

    public void setRewardUnitSetting(C9551c cVar) {
        this.f22194e = cVar;
    }

    public int findID(String str) {
        return C8594o.m24812a(this.f22190a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C8594o.m24812a(this.f22190a.getApplicationContext(), str, "layout");
    }

    public int findColor(String str) {
        return C8594o.m24812a(this.f22190a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return C8594o.m24812a(this.f22190a.getApplicationContext(), str, "drawable");
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return;
        }
        layoutParams.height = -2;
        layoutParams.width = -2;
    }

    public void defaultShow() {
        C8608u.m24880a(TAG, "defaultShow");
    }

    public boolean isLandscape() {
        return this.f22190a.getResources().getConfiguration().orientation == 2;
    }

    public void setLayoutCenter(int i, int i2) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentRelativeLayoutParams.height = i2;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentLinearLayoutParams.height = i2;
            }
            setLayoutParams(parentLinearLayoutParams);
        } else if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i != -999) {
                parentFrameLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentFrameLayoutParams.height = i2;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i2;
            parentRelativeLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentRelativeLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentRelativeLayoutParams.height = i4;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i2;
            parentLinearLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentLinearLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentLinearLayoutParams.height = i4;
            }
            setLayoutParams(parentLinearLayoutParams);
        } else if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i2;
            parentFrameLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentFrameLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentFrameLayoutParams.height = i4;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public CampaignEx getCampaign() {
        return this.f22191b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22198i = motionEvent.getRawX();
        this.f22199j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JSONObject mo62171a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C8413a.f20323e, C8613y.m24912a(C2350a.m5601e().mo15792g(), this.f22198i));
                jSONObject2.put(C8413a.f20324f, C8613y.m24912a(C2350a.m5601e().mo15792g(), this.f22199j));
                jSONObject2.put(C8413a.f20326h, i);
                try {
                    this.f22196g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C8413a.f20327i, this.f22196g);
                jSONObject2.put(C8413a.f20328j, (double) C8613y.m24941d(getContext()));
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            return jSONObject;
        }
    }

    public Rect getRect() {
        return this.f22200k;
    }

    public void setRect(Rect rect) {
        this.f22200k = rect;
    }

    public void setLayout(int i, int i2) {
        this.f22201l = i;
        this.f22202m = i2;
    }

    public int getViewWidth() {
        return this.f22201l;
    }

    public int getViewHeight() {
        return this.f22202m;
    }

    /* renamed from: a */
    protected static void m26261a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f22188n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            C8824g.m25670a().mo58310a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C9196c.m26194a().mo62125a(webView, e.getMessage());
            C8608u.m24880a(TAG, e.getMessage());
        }
    }
}
