package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.dynview.C9247a;
import com.mbridge.msdk.video.dynview.C9249b;
import com.mbridge.msdk.video.dynview.p352c.C9256a;
import com.mbridge.msdk.video.dynview.p353d.C9260d;
import com.mbridge.msdk.video.dynview.p364j.C9311c;
import com.mbridge.msdk.video.module.p365a.p366a.C9389e;
import com.mbridge.msdk.video.signal.factory.C9529b;
import com.mbridge.msdk.widget.C9587a;
import org.json.JSONException;
import org.json.JSONObject;

public class MBridgeClickCTAView extends MBridgeBaseView {

    /* renamed from: m */
    private ViewGroup f22705m;

    /* renamed from: n */
    private ImageView f22706n;

    /* renamed from: o */
    private TextView f22707o;

    /* renamed from: p */
    private TextView f22708p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public TextView f22709q;

    /* renamed from: r */
    private String f22710r;

    /* renamed from: s */
    private float f22711s;

    /* renamed from: t */
    private float f22712t;

    /* renamed from: u */
    private int f22713u;

    /* renamed from: v */
    private ObjectAnimator f22714v;

    public void init(Context context) {
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f22714v = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f22710r = str;
    }

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62563c() {
        super.mo62563c();
        if (this.f22698f) {
            if (this.f22694b != null && this.f22694b.isDynamicView()) {
                setOnClickListener(new C9587a() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo58122a(View view) {
                        MBridgeClickCTAView.m26753b(MBridgeClickCTAView.this);
                    }
                });
            }
            this.f22708p.setOnClickListener(new C9587a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo58122a(View view) {
                    MBridgeClickCTAView.m26753b(MBridgeClickCTAView.this);
                }
            });
            ImageView imageView = this.f22706n;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    public void preLoadData(C9529b bVar) {
        if (this.f22694b != null) {
            if (this.f22694b.isDynamicView()) {
                C9249b.m26477a().mo62361a(new C9311c().mo62511b(this, this.f22694b), new C9260d() {
                    /* renamed from: a */
                    public final void mo62280a(C9247a aVar) {
                        if (aVar != null) {
                            this.addView(aVar.mo62357a());
                            MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                            mBridgeClickCTAView.f22698f = mBridgeClickCTAView.m26754b();
                            MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                            TextView unused = mBridgeClickCTAView2.f22709q = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                            MBridgeClickCTAView.this.mo62563c();
                        }
                    }

                    /* renamed from: a */
                    public final void mo62281a(C9256a aVar) {
                        C8608u.m24884d(MBridgeBaseView.TAG, "errorMsg:" + aVar.mo62387b());
                    }
                });
            } else {
                int findLayout = findLayout("mbridge_reward_clickable_cta");
                if (findLayout >= 0) {
                    this.f22695c.inflate(findLayout, this);
                    this.f22698f = m26754b();
                    mo62563c();
                    setWrapContent();
                }
            }
            if (this.f22698f) {
                this.f22708p.setText(this.f22694b.getAdCall());
                if (!TextUtils.isEmpty(this.f22694b.getIconUrl())) {
                    this.f22707o.setText(this.f22694b.getAppName());
                    TextView textView = this.f22709q;
                    if (textView != null) {
                        textView.setText(this.f22694b.getAppDesc());
                    }
                    C8425b.m24339a(this.f22693a.getApplicationContext()).mo57506a(this.f22694b.getIconUrl(), (C8428c) new C9389e(this.f22706n, this.f22694b, this.f22710r) {
                        public final void onFailedLoad(String str, String str2) {
                            super.onFailedLoad(str, str2);
                            MBridgeClickCTAView.this.m26751a();
                        }
                    });
                    return;
                }
                m26751a();
            }
        }
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f22713u = configuration.orientation;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26751a() {
        this.f22705m.setBackgroundColor(0);
        ImageView imageView = this.f22706n;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.f22709q;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m26754b() {
        this.f22705m = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f22706n = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f22707o = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.f22708p = textView;
        return isNotNULL(this.f22705m, this.f22706n, this.f22707o, textView);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22711s = motionEvent.getRawX();
        this.f22712t = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f22714v;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f22714v;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m26753b(MBridgeClickCTAView mBridgeClickCTAView) {
        JSONObject jSONObject;
        JSONException e;
        if (mBridgeClickCTAView.f22694b != null && mBridgeClickCTAView.f22694b.isDynamicView()) {
            try {
                CampaignEx.C8398c rewardTemplateMode = mBridgeClickCTAView.f22694b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.mo57202b() + str;
                }
                C8542e.m24704a(mBridgeClickCTAView.f22693a, "cta_click", mBridgeClickCTAView.f22694b.getCampaignUnitId(), mBridgeClickCTAView.f22694b.isBidCampaign(), mBridgeClickCTAView.f22694b.getRequestId(), mBridgeClickCTAView.f22694b.getRequestIdNotice(), mBridgeClickCTAView.f22694b.getId(), str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C8413a.f20325g, mBridgeClickCTAView.mo62562a(0));
            } catch (JSONException e3) {
                e = e3;
            }
        } catch (JSONException e4) {
            JSONException jSONException = e4;
            jSONObject = null;
            e = jSONException;
            e.printStackTrace();
            mBridgeClickCTAView.f22697e.mo62252a(105, jSONObject);
        }
        mBridgeClickCTAView.f22697e.mo62252a(105, jSONObject);
    }
}
