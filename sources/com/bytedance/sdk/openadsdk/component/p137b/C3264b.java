package com.bytedance.sdk.openadsdk.component.p137b;

import android.content.Context;
import android.view.View;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p152f.C3510a;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.multipro.p183b.C3954a;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.component.b.b */
/* compiled from: TTFeedAdImpl */
class C3264b extends C3510a implements C2526c.C2529c, C2526c.C2530d, TTFeedAd, C3954a.C3955a {

    /* renamed from: a */
    C3954a f7730a;

    /* renamed from: b */
    boolean f7731b = false;

    /* renamed from: c */
    boolean f7732c = true;

    /* renamed from: d */
    int f7733d;

    /* renamed from: e */
    AdSlot f7734e;

    /* renamed from: f */
    int f7735f;

    /* renamed from: m */
    private TTFeedAd.VideoAdListener f7736m;

    /* renamed from: n */
    private WeakReference<NativeVideoTsView> f7737n;

    C3264b(Context context, C3498n nVar, int i, AdSlot adSlot) {
        super(context, nVar, i);
        this.f7735f = i;
        this.f7734e = adSlot;
        this.f7730a = new C3954a();
        int f = C4014u.m13223f(this.f8701h);
        this.f7733d = f;
        m9515a(f);
        mo18944a("embeded_ad");
    }

    public View getAdView() {
        NativeVideoTsView nativeVideoTsView;
        if (!(this.f8701h == null || this.f8702i == null)) {
            if (C3498n.m10583c(this.f8701h)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.f8702i, this.f8701h, this.f8700g.mo20065a());
                    this.f7737n = new WeakReference<>(nativeVideoTsView);
                    nativeVideoTsView.setVideoAdClickListenerTTNativeAd(this);
                    nativeVideoTsView.setAdCreativeClickListener(new NativeVideoTsView.C3692a() {
                        /* renamed from: a */
                        public void mo18946a(View view, int i) {
                            if (C3264b.this.f8700g != null) {
                                C3264b.this.f8700g.mo20066a(view, i);
                            }
                        }
                    });
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.C3693b() {
                        /* renamed from: a */
                        public void mo18947a(boolean z, long j, long j2, long j3, boolean z2) {
                            C3264b.this.f7730a.f10168a = z;
                            C3264b.this.f7730a.f10172e = j;
                            C3264b.this.f7730a.f10173f = j2;
                            C3264b.this.f7730a.f10174g = j3;
                            C3264b.this.f7730a.f10171d = z2;
                        }
                    });
                    nativeVideoTsView.setVideoAdLoadListener(this);
                    nativeVideoTsView.setVideoAdInteractionListener(this);
                    if (5 == this.f7735f) {
                        nativeVideoTsView.setIsAutoPlay(this.f7731b ? this.f7734e.isAutoPlay() : this.f7732c);
                    } else {
                        nativeVideoTsView.setIsAutoPlay(this.f7732c);
                    }
                    nativeVideoTsView.setIsQuiet(C3578m.m11241h().mo19927a(this.f7733d));
                } catch (Exception unused) {
                }
                if (C3498n.m10583c(this.f8701h) || nativeVideoTsView == null || !nativeVideoTsView.mo20296a(0, true, false)) {
                    return null;
                }
                return nativeVideoTsView;
            }
            nativeVideoTsView = null;
            if (C3498n.m10583c(this.f8701h)) {
            }
        }
        return null;
    }

    public void play() {
        try {
            if (this.f7737n != null && this.f7737n.get() != null && this.f7731b) {
                ((NativeVideoTsView) this.f7737n.get()).mo20307m();
            }
        } catch (Throwable unused) {
        }
    }

    public void pause() {
        try {
            if (this.f7737n != null && this.f7737n.get() != null && this.f7731b) {
                ((NativeVideoTsView) this.f7737n.get()).mo20305k();
            }
        } catch (Throwable unused) {
        }
    }

    public double currentPlayTime() {
        try {
            if (this.f7737n == null || this.f7737n.get() == null || !this.f7731b) {
                return 0.0d;
            }
            return ((NativeVideoTsView) this.f7737n.get()).getCurrentPlayTime();
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* renamed from: a */
    private void m9515a(int i) {
        int c = C3578m.m11241h().mo19931c(i);
        if (3 == c) {
            this.f7731b = false;
            this.f7732c = false;
        } else if (4 == c) {
            this.f7731b = true;
        } else {
            int c2 = C2979o.m8409c(C3578m.m11231a());
            if (1 == c && C4014u.m13222e(c2)) {
                this.f7731b = false;
                this.f7732c = true;
            } else if (2 == c) {
                if (C4014u.m13227f(c2) || C4014u.m13222e(c2) || C4014u.m13232g(c2)) {
                    this.f7731b = false;
                    this.f7732c = true;
                }
            } else if (5 != c) {
            } else {
                if (C4014u.m13222e(c2) || C4014u.m13232g(c2)) {
                    this.f7732c = true;
                }
            }
        }
    }

    public void setVideoAdListener(TTFeedAd.VideoAdListener videoAdListener) {
        this.f7736m = videoAdListener;
    }

    public double getVideoDuration() {
        if (this.f8701h == null || this.f8701h.mo19607J() == null) {
            return 0.0d;
        }
        return this.f8701h.mo19607J().mo16353f();
    }

    /* renamed from: e_ */
    public void mo16473e_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7736m;
        if (videoAdListener != null) {
            videoAdListener.onVideoLoad(this);
        }
    }

    /* renamed from: a */
    public void mo16472a(int i, int i2) {
        TTFeedAd.VideoAdListener videoAdListener = this.f7736m;
        if (videoAdListener != null) {
            videoAdListener.onVideoError(i, i2);
        }
    }

    /* renamed from: a_ */
    public void mo16468a_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7736m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdStartPlay(this);
        }
    }

    /* renamed from: b_ */
    public void mo16469b_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7736m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdPaused(this);
        }
    }

    /* renamed from: c_ */
    public void mo16470c_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7736m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdContinuePlay(this);
        }
    }

    /* renamed from: a */
    public void mo16467a(long j, long j2) {
        TTFeedAd.VideoAdListener videoAdListener = this.f7736m;
        if (videoAdListener != null) {
            videoAdListener.onProgressUpdate(j, j2);
        }
    }

    /* renamed from: d_ */
    public void mo16471d_() {
        TTFeedAd.VideoAdListener videoAdListener = this.f7736m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdComplete(this);
        }
    }

    /* renamed from: f */
    public C3954a mo18945f() {
        return this.f7730a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18944a(String str) {
        super.mo18944a(str);
    }
}
