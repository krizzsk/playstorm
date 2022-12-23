package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.video.signal.factory.C9529b;
import com.mbridge.msdk.videocommon.download.C9563g;
import org.json.JSONObject;

public class MBridgeClickMiniCardView extends MBridgeH5EndCardView {

    /* renamed from: x */
    private boolean f22721x = false;

    public MBridgeClickMiniCardView(Context context) {
        super(context);
    }

    public MBridgeClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f22698f) {
            m26761a(this.f22776m);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final RelativeLayout.LayoutParams mo62559b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo62591e() {
        super.mo62591e();
        if (this.f22698f) {
            setBackgroundResource(findColor("mbridge_reward_minicard_bg"));
            m26761a(this.f22776m);
            setClickable(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo62558a() {
        String str = null;
        if (this.f22694b == null) {
            return null;
        }
        CampaignEx.C8398c rewardTemplateMode = this.f22694b.getRewardTemplateMode();
        if (rewardTemplateMode != null) {
            str = rewardTemplateMode.mo57204d();
        }
        if (TextUtils.isEmpty(str) || !str.contains(".zip")) {
            return str;
        }
        String b = C9563g.m27460a().mo63242b(str);
        return !TextUtils.isEmpty(b) ? b : str;
    }

    public void preLoadData(C9529b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void webviewshow() {
        if (this.f22779p != null) {
            this.f22779p.post(new Runnable() {
                public final void run() {
                    try {
                        C8608u.m24880a(MBridgeBaseView.TAG, "webviewshow");
                        String str = "";
                        try {
                            int[] iArr = new int[2];
                            MBridgeClickMiniCardView.this.f22779p.getLocationOnScreen(iArr);
                            C8608u.m24884d(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", C8613y.m24912a(C2350a.m5601e().mo15792g(), (float) iArr[0]));
                            jSONObject.put("startY", C8613y.m24912a(C2350a.m5601e().mo15792g(), (float) iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
                        }
                        C8824g.m25670a().mo58310a((WebView) MBridgeClickMiniCardView.this.f22779p, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m26761a(View view) {
        int h = C8613y.m24950h(this.f22693a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((((float) h) * 0.7f) + 0.5f);
        layoutParams.height = (int) ((((float) C8613y.m24948g(this.f22693a)) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMBridgeClickMiniCardViewClickable(boolean z) {
        setClickable(z);
    }

    public void setMiniCardLocation(int i, int i2, int i3, int i4) {
        this.f22721x = true;
        resizeMiniCard(i3, i4);
    }

    public void resizeMiniCard(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 11) {
            View findViewById = ((Activity) this.f22693a).getWindow().findViewById(16908290);
            int width = findViewById.getWidth();
            int height = findViewById.getHeight();
            if (i > 0 && i2 > 0 && i <= width && i2 <= height) {
                ViewGroup.LayoutParams layoutParams = this.f22776m.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i2;
                this.f22776m.setLayoutParams(layoutParams);
            }
        }
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float) C8613y.m24929b(getContext(), (float) i));
            gradientDrawable.setColor(-1);
            if (Build.VERSION.SDK_INT >= 16) {
                this.f22779p.setBackground(gradientDrawable);
            } else {
                this.f22779p.setBackgroundDrawable(gradientDrawable);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f22779p.setClipToOutline(true);
            }
        }
    }
}
