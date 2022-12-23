package com.p374my.target;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p374my.target.C9651c9;
import com.p374my.target.instreamads.InstreamAdPlayer;

/* renamed from: com.my.target.t5 */
public class C9971t5 extends FrameLayout implements InstreamAdPlayer, C9651c9.C9652a {

    /* renamed from: a */
    public final C10055y5 f24682a;

    /* renamed from: b */
    public boolean f24683b;

    /* renamed from: c */
    public InstreamAdPlayer.AdPlayerListener f24684c;

    /* renamed from: d */
    public int f24685d;

    /* renamed from: e */
    public int f24686e;

    /* renamed from: f */
    public boolean f24687f;

    /* renamed from: g */
    public boolean f24688g;

    /* renamed from: h */
    public C9651c9 f24689h;

    public C9971t5(Context context) {
        this(context, (AttributeSet) null);
    }

    public C9971t5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9971t5(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new C10055y5(context));
    }

    public C9971t5(Context context, AttributeSet attributeSet, int i, C10055y5 y5Var) {
        super(context, attributeSet, i);
        this.f24683b = true;
        this.f24682a = y5Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(y5Var, layoutParams);
    }

    /* renamed from: a */
    public void mo63745a(float f) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f24684c;
        if (adPlayerListener != null) {
            adPlayerListener.onVolumeChanged(f);
        }
    }

    /* renamed from: a */
    public void mo63746a(float f, float f2) {
    }

    /* renamed from: a */
    public void mo63747a(String str) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f24684c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoError(str);
        }
    }

    public void destroy() {
        C9651c9 c9Var = this.f24689h;
        if (c9Var != null) {
            c9Var.destroy();
        }
    }

    /* renamed from: f */
    public void mo63748f() {
        this.f24688g = true;
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f24684c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoPaused();
        }
    }

    /* renamed from: g */
    public void mo63749g() {
    }

    public InstreamAdPlayer.AdPlayerListener getAdPlayerListener() {
        return this.f24684c;
    }

    public float getAdVideoDuration() {
        C9651c9 c9Var = this.f24689h;
        if (c9Var != null) {
            return c9Var.mo63741m();
        }
        return 0.0f;
    }

    public float getAdVideoPosition() {
        C9651c9 c9Var = this.f24689h;
        if (c9Var != null) {
            return ((float) c9Var.mo63742n()) / 1000.0f;
        }
        return 0.0f;
    }

    public int getPlaceholderHeight() {
        return this.f24686e;
    }

    public int getPlaceholderWidth() {
        return this.f24685d;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo63750h() {
        if (this.f24688g) {
            InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f24684c;
            if (adPlayerListener != null) {
                adPlayerListener.onAdVideoResumed();
            }
            this.f24688g = false;
        }
    }

    /* renamed from: j */
    public void mo63751j() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f24684c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoStopped();
        }
    }

    /* renamed from: l */
    public void mo63752l() {
    }

    /* renamed from: o */
    public void mo63753o() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener;
        if (!this.f24687f && (adPlayerListener = this.f24684c) != null) {
            adPlayerListener.onAdVideoStarted();
            this.f24687f = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r9 > r1) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r9 > r3) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r9 > r1) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        r3 = java.lang.Math.round(((float) r1) / r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        if (r9 > r3) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0078, code lost:
        r1 = java.lang.Math.round(((float) r3) * r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x0015
            r0 = r4
        L_0x0015:
            if (r2 != 0) goto L_0x0018
            r2 = r4
        L_0x0018:
            int r5 = r7.f24686e
            if (r5 == 0) goto L_0x008d
            int r6 = r7.f24685d
            if (r6 != 0) goto L_0x0022
            goto L_0x008d
        L_0x0022:
            float r8 = (float) r6
            float r9 = (float) r5
            float r8 = r8 / r9
            r9 = 0
            if (r3 == 0) goto L_0x002b
            float r9 = (float) r1
            float r5 = (float) r3
            float r9 = r9 / r5
        L_0x002b:
            r5 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r0 != r6) goto L_0x0033
            if (r2 != r6) goto L_0x0033
            goto L_0x0081
        L_0x0033:
            if (r0 != r4) goto L_0x0053
            if (r2 != r4) goto L_0x0053
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0046
            float r9 = (float) r3
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            if (r1 <= 0) goto L_0x0068
            if (r9 <= r1) goto L_0x0068
            goto L_0x0061
        L_0x0046:
            float r9 = (float) r1
            float r9 = r9 / r8
            int r9 = java.lang.Math.round(r9)
            if (r3 <= 0) goto L_0x0051
            if (r9 <= r3) goto L_0x0051
            goto L_0x0078
        L_0x0051:
            r3 = r9
            goto L_0x0081
        L_0x0053:
            if (r0 != r4) goto L_0x006a
            if (r2 != r6) goto L_0x006a
            float r9 = (float) r3
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            if (r1 <= 0) goto L_0x0068
            if (r9 <= r1) goto L_0x0068
        L_0x0061:
            float r9 = (float) r1
            float r9 = r9 / r8
            int r3 = java.lang.Math.round(r9)
            goto L_0x0081
        L_0x0068:
            r1 = r9
            goto L_0x0081
        L_0x006a:
            if (r0 != r6) goto L_0x007f
            if (r2 != r4) goto L_0x007f
            float r9 = (float) r1
            float r9 = r9 / r8
            int r9 = java.lang.Math.round(r9)
            if (r3 <= 0) goto L_0x0051
            if (r9 <= r3) goto L_0x0051
        L_0x0078:
            float r9 = (float) r3
            float r9 = r9 * r8
            int r1 = java.lang.Math.round(r9)
            goto L_0x0081
        L_0x007f:
            r1 = r5
            r3 = r1
        L_0x0081:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            super.onMeasure(r8, r9)
            return
        L_0x008d:
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9971t5.onMeasure(int, int):void");
    }

    public void onVideoCompleted() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f24684c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoCompleted();
        }
    }

    public void pauseAdVideo() {
        C9651c9 c9Var = this.f24689h;
        if (c9Var != null) {
            c9Var.mo63729b();
        }
    }

    public void playAdVideo(Uri uri, int i, int i2) {
        this.f24685d = i;
        this.f24686e = i2;
        this.f24687f = false;
        if (this.f24689h == null) {
            C9651c9 p = (!this.f24683b || !C9864n8.m28843a()) ? C9668d9.m27851p() : C9687e9.m27944a(getContext());
            this.f24689h = p;
            p.mo63727a((C9651c9.C9652a) this);
        }
        this.f24682a.mo65764a(i, i2);
        this.f24689h.mo63726a(uri, this.f24682a);
    }

    public void playAdVideo(Uri uri, int i, int i2, float f) {
        playAdVideo(uri, i, i2);
        C9651c9 c9Var = this.f24689h;
        if (c9Var != null) {
            c9Var.mo63724a((long) (f * 1000.0f));
        }
    }

    public void resumeAdVideo() {
        C9651c9 c9Var = this.f24689h;
        if (c9Var != null) {
            c9Var.mo63723a();
        }
    }

    public void setAdPlayerListener(InstreamAdPlayer.AdPlayerListener adPlayerListener) {
        this.f24684c = adPlayerListener;
    }

    public void setUseExoPlayer(boolean z) {
        this.f24683b = z;
    }

    public void setVideoPlayer(C9687e9 e9Var) {
        this.f24689h = e9Var;
    }

    public void setVolume(float f) {
        C9651c9 c9Var = this.f24689h;
        if (c9Var != null) {
            c9Var.setVolume(f);
        }
    }

    public void stopAdVideo() {
        C9651c9 c9Var = this.f24689h;
        if (c9Var != null) {
            c9Var.mo63733e();
        }
    }
}
