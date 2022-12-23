package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.moffer.C9323b;
import com.mbridge.msdk.video.dynview.moffer.C9325d;

public class MBridgeRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C9325d f22686a;

    /* renamed from: b */
    private boolean f22687b;

    /* renamed from: c */
    private AnimatorSet f22688c;

    /* renamed from: d */
    private boolean f22689d;

    /* renamed from: e */
    private C9323b f22690e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f22688c = animatorSet;
    }

    public void setMoreOfferShowFailedCallBack(C9325d dVar) {
        this.f22686a = dVar;
    }

    public void setMoreOfferCacheReportCallBack(C9323b bVar) {
        this.f22690e = bVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f22688c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C9325d dVar;
        super.onDetachedFromWindow();
        if (!this.f22687b && (dVar = this.f22686a) != null) {
            this.f22687b = true;
            dVar.mo62516a();
        }
        AnimatorSet animatorSet = this.f22688c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C9323b bVar;
        super.onVisibilityChanged(view, i);
        if ((view instanceof MBridgeRelativeLayout) && i == 0 && (bVar = this.f22690e) != null && !this.f22689d) {
            this.f22689d = true;
            bVar.mo62515a();
        }
    }
}
