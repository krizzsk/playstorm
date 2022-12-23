package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.video.module.p365a.p366a.C9391f;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";

    /* renamed from: a */
    protected Context f22693a;

    /* renamed from: b */
    protected CampaignEx f22694b;

    /* renamed from: c */
    protected LayoutInflater f22695c;

    /* renamed from: d */
    protected int f22696d;

    /* renamed from: e */
    protected C9384a f22697e;

    /* renamed from: f */
    protected boolean f22698f;

    /* renamed from: g */
    protected float f22699g;

    /* renamed from: h */
    protected float f22700h;

    /* renamed from: i */
    protected boolean f22701i;

    /* renamed from: j */
    protected int f22702j;

    /* renamed from: k */
    protected boolean f22703k;

    /* renamed from: l */
    protected int f22704l;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62563c() {
    }

    public abstract void init(Context context);

    public MBridgeBaseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2) {
        super(context, attributeSet);
        this.f22696d = 1;
        this.f22697e = new C9391f();
        this.f22698f = false;
        this.f22704l = 1;
        this.f22693a = context;
        this.f22695c = LayoutInflater.from(context);
        this.f22701i = z;
        this.f22702j = i;
        this.f22703k = z2;
        this.f22704l = i2;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22696d = 1;
        this.f22697e = new C9391f();
        this.f22698f = false;
        this.f22704l = 1;
        this.f22693a = context;
        this.f22695c = LayoutInflater.from(context);
        init(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f22696d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f22696d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setNotifyListener(C9384a aVar) {
        this.f22697e = aVar;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f22694b = campaignEx;
    }

    public int findID(String str) {
        return C8594o.m24812a(this.f22693a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C8594o.m24812a(this.f22693a.getApplicationContext(), str, "layout");
    }

    public int findColor(String str) {
        return C8594o.m24812a(this.f22693a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return C8594o.m24812a(this.f22693a.getApplicationContext(), str, "drawable");
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
        return this.f22693a.getResources().getConfiguration().orientation == 2;
    }

    public void setLayoutCenter(int i, int i2) {
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
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
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

    public CampaignEx getCampaign() {
        return this.f22694b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22699g = motionEvent.getRawX();
        this.f22700h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo62564d() {
        return mo62562a(0).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JSONObject mo62562a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C8413a.f20323e, C8613y.m24912a(C2350a.m5601e().mo15792g(), this.f22699g));
                jSONObject2.put(C8413a.f20324f, C8613y.m24912a(C2350a.m5601e().mo15792g(), this.f22700h));
                jSONObject2.put(C8413a.f20326h, i);
                try {
                    this.f22696d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C8413a.f20327i, this.f22696d);
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
}
