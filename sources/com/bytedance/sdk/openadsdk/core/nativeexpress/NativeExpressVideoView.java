package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.adexpress.C2618b;
import com.bytedance.sdk.component.adexpress.p095b.C2623d;
import com.bytedance.sdk.component.adexpress.p095b.C2635m;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundFrameLayout;
import com.bytedance.sdk.openadsdk.multipro.p183b.C3954a;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class NativeExpressVideoView extends NativeExpressView implements C2526c.C2529c, C2526c.C2530d, C3617j {

    /* renamed from: a */
    int f9035a = 1;

    /* renamed from: b */
    boolean f9036b = false;

    /* renamed from: c */
    boolean f9037c = true;

    /* renamed from: d */
    int f9038d;

    /* renamed from: e */
    boolean f9039e = true;

    /* renamed from: u */
    private ExpressVideoView f9040u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C3954a f9041v;

    /* renamed from: w */
    private long f9042w;

    /* renamed from: x */
    private long f9043x;

    /* renamed from: b */
    public void mo18496b() {
    }

    /* renamed from: e */
    public void mo18500e() {
    }

    public NativeExpressVideoView(Context context, C3498n nVar, AdSlot adSlot, String str) {
        super(context, nVar, adSlot, str, false);
        mo20109h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo20109h() {
        this.f9081k = new RoundFrameLayout(this.f9076f);
        int f = C4014u.m13223f(this.f9079i);
        this.f9038d = f;
        mo20107c(f);
        m11282o();
        addView(this.f9081k, new FrameLayout.LayoutParams(-1, -1));
        super.mo19268g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    /* renamed from: o */
    private void m11282o() {
        try {
            this.f9041v = new C3954a();
            ExpressVideoView expressVideoView = new ExpressVideoView(this.f9076f, this.f9079i, this.f9077g, this.f9087r);
            this.f9040u = expressVideoView;
            expressVideoView.setShouldCheckNetChange(false);
            this.f9040u.setControllerStatusCallBack(new NativeVideoTsView.C3693b() {
                /* renamed from: a */
                public void mo18947a(boolean z, long j, long j2, long j3, boolean z2) {
                    NativeExpressVideoView.this.f9041v.f10168a = z;
                    NativeExpressVideoView.this.f9041v.f10172e = j;
                    NativeExpressVideoView.this.f9041v.f10173f = j2;
                    NativeExpressVideoView.this.f9041v.f10174g = j3;
                    NativeExpressVideoView.this.f9041v.f10171d = z2;
                }
            });
            this.f9040u.setVideoAdLoadListener(this);
            this.f9040u.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.f9077g)) {
                this.f9040u.setIsAutoPlay(this.f9036b ? this.f9078h.isAutoPlay() : this.f9037c);
            } else if ("open_ad".equals(this.f9077g)) {
                this.f9040u.setIsAutoPlay(true);
            } else {
                this.f9040u.setIsAutoPlay(this.f9037c);
            }
            if ("open_ad".equals(this.f9077g)) {
                this.f9040u.setIsQuiet(true);
            } else {
                this.f9040u.setIsQuiet(C3578m.m11241h().mo19927a(this.f9038d));
            }
            this.f9040u.mo20096d();
        } catch (Exception unused) {
            this.f9040u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo20107c(int i) {
        int c = C3578m.m11241h().mo19931c(i);
        if (3 == c) {
            this.f9036b = false;
            this.f9037c = false;
        } else if (4 == c) {
            this.f9036b = true;
        } else {
            int c2 = C2979o.m8409c(C3578m.m11231a());
            if (1 == c) {
                this.f9036b = false;
                this.f9037c = C4014u.m13222e(c2);
            } else if (2 == c) {
                if (C4014u.m13227f(c2) || C4014u.m13222e(c2) || C4014u.m13232g(c2)) {
                    this.f9036b = false;
                    this.f9037c = true;
                }
            } else if (5 == c && (C4014u.m13222e(c2) || C4014u.m13232g(c2))) {
                this.f9036b = false;
                this.f9037c = true;
            }
        }
        if (!this.f9037c) {
            this.f9035a = 3;
        }
        C2975l.m8387c("NativeVideoAdView", "mIsAutoPlay=" + this.f9037c + ",status=" + c);
    }

    public C3954a getVideoModel() {
        return this.f9041v;
    }

    public void setCanInterruptVideoPlay(boolean z) {
        ExpressVideoView expressVideoView = this.f9040u;
        if (expressVideoView != null) {
            expressVideoView.setCanInterruptVideoPlay(z);
        }
    }

    private void setShowAdInteractionView(boolean z) {
        ExpressVideoView expressVideoView = this.f9040u;
        if (expressVideoView != null) {
            expressVideoView.setShowAdInteractionView(z);
        }
    }

    /* renamed from: a */
    public void mo16808a(C2623d<? extends View> dVar, C2635m mVar) {
        this.f9089t = dVar;
        if ((this.f9089t instanceof C3624o) && ((C3624o) this.f9089t).mo20199p() != null) {
            ((C3624o) this.f9089t).mo20199p().mo20427a((C3617j) this);
        }
        if (mVar != null && mVar.mo16786a()) {
            m11279a(mVar);
        }
        super.mo16808a(dVar, mVar);
    }

    /* renamed from: a */
    private void m11279a(final C2635m mVar) {
        if (mVar != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m11281b(mVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        NativeExpressVideoView.this.m11281b(mVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11281b(C2635m mVar) {
        if (mVar != null) {
            double d = mVar.mo16795d();
            double e = mVar.mo16798e();
            double f = mVar.mo16800f();
            double g = mVar.mo16802g();
            int b = (int) C4020v.m13297b(this.f9076f, (float) d);
            int b2 = (int) C4020v.m13297b(this.f9076f, (float) e);
            int b3 = (int) C4020v.m13297b(this.f9076f, (float) f);
            int b4 = (int) C4020v.m13297b(this.f9076f, (float) g);
            float b5 = C4020v.m13297b(this.f9076f, mVar.mo16804i());
            float b6 = C4020v.m13297b(this.f9076f, mVar.mo16805j());
            float b7 = C4020v.m13297b(this.f9076f, mVar.mo16806k());
            float b8 = C4020v.m13297b(this.f9076f, mVar.mo16807l());
            C2975l.m8384b("ExpressView", "videoWidth:" + f);
            C2975l.m8384b("ExpressView", "videoHeight:" + g);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9081k.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(b3, b4);
            }
            layoutParams.width = b3;
            layoutParams.height = b4;
            layoutParams.topMargin = b2;
            layoutParams.leftMargin = b;
            this.f9081k.setLayoutParams(layoutParams);
            this.f9081k.removeAllViews();
            if (this.f9040u != null) {
                this.f9081k.addView(this.f9040u);
                ((RoundFrameLayout) this.f9081k).mo20483a(b5, b6, b7, b8);
                this.f9040u.mo20296a(0, true, false);
                mo20107c(this.f9038d);
                if (!C2979o.m8410d(this.f9076f) && !this.f9037c && this.f9039e) {
                    this.f9040u.mo20097e();
                }
                setShowAdInteractionView(false);
            }
        }
    }

    /* renamed from: a */
    public void mo18495a(boolean z) {
        C2975l.m8384b("NativeExpressVideoView", "onMuteVideo,mute:" + z);
        ExpressVideoView expressVideoView = this.f9040u;
        if (expressVideoView != null) {
            expressVideoView.setIsQuiet(z);
            setSoundMute(z);
        }
    }

    /* renamed from: a */
    public void mo18493a() {
        C2975l.m8384b("NativeExpressVideoView", "onSkipVideo");
    }

    /* renamed from: a */
    public void mo18494a(int i) {
        C2975l.m8384b("NativeExpressVideoView", "onChangeVideoState,stateType:" + i);
        ExpressVideoView expressVideoView = this.f9040u;
        if (expressVideoView == null) {
            C2975l.m8391e("NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
        } else if (i == 1) {
            expressVideoView.mo20296a(0, true, false);
        } else if (i == 2 || i == 3) {
            this.f9040u.setCanInterruptVideoPlay(true);
            this.f9040u.performClick();
        } else if (i == 4) {
            expressVideoView.getNativeVideoController().mo16448f();
        } else if (i == 5) {
            expressVideoView.mo20296a(0, true, false);
        }
    }

    /* renamed from: a */
    public void mo16722a(View view, int i, C2618b bVar) {
        if (i != -1 && bVar != null) {
            if (i != 4) {
                if (i != 11) {
                    super.mo16722a(view, i, bVar);
                    return;
                }
            } else if (this.f9077g == "draw_ad") {
                ExpressVideoView expressVideoView = this.f9040u;
                if (expressVideoView != null) {
                    expressVideoView.performClick();
                    return;
                }
                return;
            }
            try {
                if (this.f9040u != null) {
                    this.f9040u.setCanInterruptVideoPlay(true);
                    this.f9040u.performClick();
                    if (this.f9082l) {
                        this.f9040u.findViewById(C2984t.m8432e(this.f9040u.getContext(), "tt_video_play")).setVisibility(0);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public long mo18498c() {
        return this.f9042w;
    }

    /* renamed from: d */
    public int mo18499d() {
        ExpressVideoView expressVideoView;
        if (this.f9035a == 3 && (expressVideoView = this.f9040u) != null) {
            expressVideoView.mo20096d();
        }
        ExpressVideoView expressVideoView2 = this.f9040u;
        if (expressVideoView2 == null || !expressVideoView2.getNativeVideoController().mo16460r()) {
            return this.f9035a;
        }
        return 1;
    }

    /* renamed from: a_ */
    public void mo16468a_() {
        this.f9039e = false;
        C2975l.m8384b("NativeExpressVideoView", "onVideoAdStartPlay");
        if (this.f9080j != null) {
            this.f9080j.onVideoAdStartPlay();
        }
        this.f9035a = 2;
    }

    /* renamed from: b_ */
    public void mo16469b_() {
        this.f9039e = false;
        C2975l.m8384b("NativeExpressVideoView", "onVideoAdPaused");
        if (this.f9080j != null) {
            this.f9080j.onVideoAdPaused();
        }
        this.f9082l = true;
        this.f9035a = 3;
    }

    /* renamed from: c_ */
    public void mo16470c_() {
        this.f9039e = false;
        C2975l.m8384b("NativeExpressVideoView", "onVideoAdContinuePlay");
        if (this.f9080j != null) {
            this.f9080j.onVideoAdContinuePlay();
        }
        this.f9082l = false;
        this.f9035a = 2;
    }

    /* renamed from: a */
    public void mo16467a(long j, long j2) {
        this.f9039e = false;
        if (this.f9080j != null) {
            this.f9080j.onProgressUpdate(j, j2);
        }
        int i = this.f9035a;
        if (!(i == 5 || i == 3 || j <= this.f9042w)) {
            this.f9035a = 2;
        }
        this.f9042w = j;
        this.f9043x = j2;
        if (this.f9088s != null && this.f9088s.mo16715d() != null) {
            this.f9088s.mo16715d().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
    }

    /* renamed from: d_ */
    public void mo16471d_() {
        this.f9039e = false;
        C2975l.m8384b("NativeExpressVideoView", "onVideoComplete");
        if (this.f9080j != null) {
            this.f9080j.onVideoAdComplete();
        }
        this.f9035a = 5;
        if (this.f9088s != null && this.f9088s.mo16715d() != null) {
            this.f9088s.mo16715d().mo17176f();
        }
    }

    /* renamed from: e_ */
    public void mo16473e_() {
        C2975l.m8384b("NativeExpressVideoView", "onVideoLoad");
        if (this.f9080j != null) {
            this.f9080j.onVideoLoad();
        }
    }

    /* renamed from: a */
    public void mo16472a(int i, int i2) {
        C2975l.m8384b("NativeExpressVideoView", "onVideoError,errorCode:" + i + ",extraCode:" + i2);
        if (this.f9080j != null) {
            this.f9080j.onVideoError(i, i2);
        }
        this.f9042w = this.f9043x;
        this.f9035a = 4;
    }
}
