package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.nativex.listener.C8833a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.view.MyImageView;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {

    /* renamed from: F */
    private static Handler f21586F = new Handler();

    /* renamed from: A */
    private String f21587A;

    /* renamed from: B */
    private String f21588B;

    /* renamed from: C */
    private CampaignEx f21589C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C8833a f21590D;

    /* renamed from: E */
    private Timer f21591E;

    /* renamed from: G */
    private C9552a f21592G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public VideoNativePlayer f21593H;

    /* renamed from: I */
    private C8871a f21594I;

    /* renamed from: J */
    private AdSession f21595J = null;

    /* renamed from: K */
    private MediaEvents f21596K = null;

    /* renamed from: L */
    private boolean f21597L = false;

    /* renamed from: a */
    private boolean f21598a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f21599b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f21600c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21601d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f21602e = false;

    /* renamed from: f */
    private boolean f21603f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f21604g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f21605h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f21606i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f21607j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f21608k = false;

    /* renamed from: l */
    private volatile int f21609l = -1;

    /* renamed from: m */
    private boolean f21610m = true;

    /* renamed from: n */
    private boolean f21611n = true;

    /* renamed from: o */
    private TextureView f21612o;

    /* renamed from: p */
    private LinearLayout f21613p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Surface f21614q;

    /* renamed from: r */
    private ProgressBar f21615r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public MyImageView f21616s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public ImageView f21617t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public ImageView f21618u;

    /* renamed from: v */
    private ImageView f21619v;

    /* renamed from: w */
    private ImageView f21620w;

    /* renamed from: x */
    private View f21621x;

    /* renamed from: y */
    private AnimationDrawable f21622y;

    /* renamed from: z */
    private AlphaAnimation f21623z;

    public void onBufferingEnd() {
    }

    public void onBufferingStart(String str) {
    }

    public void setMediaViewPlayListener(C8871a aVar) {
        this.f21594I = aVar;
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        m25816a();
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25816a();
    }

    /* renamed from: a */
    private void m25816a() {
        try {
            m25823c();
            m25820b();
        } catch (Exception e) {
            C8608u.m24884d("MediaViewPlayerView", e.getMessage());
        }
    }

    /* renamed from: b */
    private void m25820b() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.f21593H = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    /* renamed from: c */
    private void m25823c() {
        try {
            View inflate = LayoutInflater.from(getContext()).inflate(C8594o.m24812a(getContext(), "mbridge_nativex_playerview", "layout"), (ViewGroup) null);
            if (inflate != null) {
                this.f21613p = (LinearLayout) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_textureview", "id"));
                this.f21612o = textureView;
                textureView.setKeepScreenOn(true);
                this.f21612o.setSurfaceTextureListener(new C8872b());
                this.f21615r = (ProgressBar) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_progress", "id"));
                this.f21616s = (MyImageView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.f21617t = (ImageView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_iv_play", "id"));
                this.f21618u = (ImageView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_iv_pause", "id"));
                this.f21619v = (ImageView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_iv_sound", "id"));
                this.f21621x = inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.f21620w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.f21622y = animationDrawable;
                animationDrawable.start();
                m25825d();
                addView(inflate, -1, -1);
            }
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z, VideoPlayerStatusListener videoPlayerStatusListener, C9552a aVar, String str2) {
        CampaignEx campaignEx2 = campaignEx;
        try {
            if (TextUtils.isEmpty(str) || campaignEx2 == null) {
                return false;
            }
            this.f21588B = str;
            this.f21599b = z;
            this.f21589C = campaignEx2;
            this.f21592G = aVar;
            this.f21587A = str2;
            this.f21593H.initParameter(campaignEx.getVideoUrlEncode(), true, this.f21607j, this.f21616s, videoPlayerStatusListener);
            try {
                if (this.f21589C != null) {
                    String imageUrl = this.f21589C.getImageUrl();
                    if (!C8556ac.m24737a(imageUrl)) {
                        if (getContext() != null) {
                            if (C8425b.m24339a(getContext()).mo57507b(imageUrl)) {
                                Bitmap a = C8425b.m24339a(C2350a.m5601e().mo15792g()).mo57503a(imageUrl);
                                if (!(this.f21616s == null || a == null)) {
                                    this.f21616s.setImageUrl(imageUrl);
                                    this.f21616s.setImageBitmap(a);
                                    this.f21616s.setVisibility(0);
                                }
                            } else {
                                C8425b.m24339a(getContext()).mo57506a(imageUrl, (C8428c) new C8428c() {
                                    public final void onFailedLoad(String str, String str2) {
                                    }

                                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                                        if (MediaViewPlayerView.this.f21616s != null && bitmap != null) {
                                            MediaViewPlayerView.this.f21616s.setImageUrl(str);
                                            MediaViewPlayerView.this.f21616s.setImageBitmap(bitmap);
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d("MediaViewPlayerView", th.getMessage());
            }
            this.f21598a = true;
            return true;
        } catch (Exception e) {
            C8608u.m24884d("MediaViewPlayerView", e.getMessage());
            this.f21598a = false;
        }
    }

    public void playVideo() {
        try {
            if (!this.f21598a || this.f21593H == null) {
                return;
            }
            if (!this.f21604g) {
                m25828e();
                return;
            }
            if ((!TextUtils.isEmpty(this.f21588B) && this.f21588B.startsWith("http")) || this.f21588B.startsWith("https")) {
                this.f21588B = m25845m();
            }
            m25832f();
            this.f21593H.play(getContext(), this.f21588B, this.f21614q);
            if ((this.f21603f || this.f21602e) && this.f21596K != null) {
                this.f21603f = false;
                this.f21596K.resume();
            }
            if (this.f21608k) {
                this.f21593H.openSound();
            } else {
                this.f21593H.closeSound();
            }
            this.f21600c = false;
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void startOrPlayVideo() {
        try {
            if (!this.f21604g) {
                m25828e();
            } else if (!hasPrepare()) {
                playVideo();
            } else {
                try {
                    if (this.f21593H != null) {
                        m25832f();
                        if (this.f21606i) {
                            this.f21593H.start(this.f21614q);
                            this.f21606i = false;
                        } else {
                            this.f21593H.start();
                        }
                        if ((this.f21603f || this.f21602e) && this.f21596K != null) {
                            this.f21603f = false;
                            this.f21596K.resume();
                        }
                    }
                } catch (Throwable th) {
                    C8608u.m24881a("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        } catch (Exception e) {
            C8608u.m24884d("MediaViewPlayerView", e.getMessage());
        }
    }

    public void pause() {
        try {
            if (this.f21593H != null) {
                this.f21593H.pause();
                this.f21603f = true;
            }
            if (this.f21596K != null) {
                this.f21596K.pause();
            }
            m25835h();
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void stop() {
        try {
            if (this.f21593H != null) {
                this.f21593H.stop();
            }
            m25835h();
        } catch (Exception e) {
            C8608u.m24884d("MediaViewPlayerView", e.getMessage());
        }
    }

    public void release() {
        try {
            if (this.f21593H != null) {
                this.f21593H.releasePlayer();
                this.f21593H = null;
            }
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean hasPrepare() {
        try {
            if (this.f21593H != null) {
                return this.f21593H.hasPrepare();
            }
            return false;
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isComplete() {
        try {
            if (this.f21593H != null) {
                return this.f21593H.isComplete();
            }
            return false;
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            if (this.f21593H != null) {
                return this.f21593H.isPlaying();
            }
            return false;
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public void openSound() {
        this.f21608k = true;
        try {
            if (this.f21593H != null) {
                this.f21619v.setImageResource(C8594o.m24812a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.f21593H.openSound();
            }
            if (this.f21596K != null) {
                this.f21596K.volumeChange(1.0f);
            }
        } catch (IllegalArgumentException e) {
            C8608u.m24880a("OMSDK", e.getMessage());
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void closeSound() {
        this.f21608k = false;
        try {
            if (this.f21593H != null) {
                this.f21619v.setImageResource(C8594o.m24812a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.f21593H.closeSound();
            }
            if (this.f21596K != null) {
                this.f21596K.volumeChange(0.0f);
            }
        } catch (IllegalArgumentException e) {
            C8608u.m24880a("OMSDK", e.getMessage());
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z) {
        try {
            if (this.f21593H != null) {
                this.f21593H.setIsFrontDesk(z);
            }
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            if (this.f21593H == null || !this.f21593H.loadingViewIsVisible()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public void setIsComplete(boolean z) {
        try {
            if (this.f21593H != null) {
                this.f21593H.setIsComplete(z);
            }
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setEnterFullScreen() {
        try {
            C8608u.m24882b("MediaViewPlayerView", "setEnterFullScreen");
            this.f21601d = true;
            this.f21605h = true;
            this.f21619v.setVisibility(0);
            m25835h();
        } catch (Throwable th) {
            C8608u.m24881a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setExitFullScreen() {
        try {
            this.f21601d = false;
            this.f21600c = false;
            this.f21619v.setVisibility(8);
            m25833g();
            m25832f();
        } catch (Throwable th) {
            C8608u.m24881a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public boolean curIsFullScreen() {
        return this.f21601d;
    }

    public void setIsActivePause(boolean z) {
        this.f21602e = z;
    }

    public boolean getIsActiviePause() {
        return this.f21602e;
    }

    public Campaign getCampaign() {
        return this.f21589C;
    }

    public void setAllowLoopPlay(boolean z) {
        this.f21607j = z;
    }

    public void setOnMediaViewPlayerViewListener(C8833a aVar) {
        this.f21590D = aVar;
    }

    /* renamed from: d */
    private void m25825d() {
        this.f21619v.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                try {
                    if (MediaViewPlayerView.this.f21608k) {
                        MediaViewPlayerView.this.closeSound();
                        if (MediaViewPlayerView.this.f21590D != null) {
                            MediaViewPlayerView.this.f21590D.mo58327a();
                            return;
                        }
                        return;
                    }
                    MediaViewPlayerView.this.openSound();
                    if (MediaViewPlayerView.this.f21590D != null) {
                        MediaViewPlayerView.this.f21590D.mo58329b();
                    }
                } catch (Throwable th) {
                    C8608u.m24884d("MediaViewPlayerView", th.getMessage());
                }
            }
        });
        this.f21618u.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                try {
                    MediaViewPlayerView.this.pause();
                    MediaViewPlayerView.this.f21617t.setVisibility(0);
                    MediaViewPlayerView.this.m25838i();
                    MediaViewPlayerView.this.m25841k();
                    if (MediaViewPlayerView.this.f21590D != null) {
                        MediaViewPlayerView.this.f21590D.mo58331c();
                    }
                    boolean unused = MediaViewPlayerView.this.f21602e = true;
                } catch (Throwable th) {
                    C8608u.m24881a("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        });
        this.f21617t.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MediaViewPlayerView.this.onClickPlayButton();
            }
        });
    }

    public void onClickPlayButton() {
        try {
            m25832f();
            m25839j();
            setIsComplete(false);
            if (this.f21603f) {
                this.f21593H.play();
            } else if (!hasPrepare() || this.f21600c) {
                C8608u.m24882b("MediaViewPlayerView", "点击播放 playVideo()");
                this.f21593H.replaySameSource(getContext(), this.f21588B, this.f21614q);
            } else {
                C8608u.m24882b("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.f21600c);
                startOrPlayVideo();
            }
            if (this.f21602e && this.f21590D != null) {
                this.f21590D.mo58332d();
            }
            this.f21602e = false;
        } catch (Throwable th) {
            C8608u.m24881a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void onClickPlayerView() {
        try {
            if ((this.f21616s != null && this.f21616s.getVisibility() == 0) || !isPlaying() || this.f21618u == null) {
                return;
            }
            if (this.f21618u.getVisibility() == 0) {
                gonePauseView();
                m25843l();
                return;
            }
            if (this.f21623z != null) {
                this.f21623z.cancel();
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            this.f21623z = alphaAnimation;
            alphaAnimation.setDuration(300);
            this.f21623z.setInterpolator(new DecelerateInterpolator());
            this.f21623z.setAnimationListener(new Animation.AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    MediaViewPlayerView.this.f21618u.setVisibility(0);
                    MediaViewPlayerView.m25834g(MediaViewPlayerView.this);
                }
            });
            m25838i();
            this.f21621x.startAnimation(this.f21623z);
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    public void showPlayView() {
        this.f21617t.setVisibility(0);
    }

    public void gonePauseView() {
        Handler handler = f21586F;
        if (handler != null) {
            handler.post(new Runnable() {
                public final void run() {
                    try {
                        MediaViewPlayerView.this.m25841k();
                        MediaViewPlayerView.this.m25839j();
                    } catch (Exception e) {
                        C8608u.m24884d("MediaViewPlayerView", e.getMessage());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25828e() {
        try {
            this.f21616s.setVisibility(0);
            this.f21617t.setVisibility(0);
            m25838i();
            m25841k();
            this.f21615r.setVisibility(8);
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    /* renamed from: f */
    private void m25832f() {
        try {
            this.f21616s.setVisibility(8);
            this.f21617t.setVisibility(8);
            m25839j();
            showProgressView(this.f21611n);
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    /* renamed from: g */
    private void m25833g() {
        ImageView imageView;
        if (!this.f21601d && (imageView = this.f21620w) != null && imageView.getVisibility() != 0 && this.f21610m) {
            this.f21620w.setVisibility(0);
        }
    }

    /* renamed from: h */
    private void m25835h() {
        if (this.f21620w.getVisibility() == 0) {
            this.f21620w.setVisibility(8);
        }
    }

    public void showProgressView(boolean z) {
        this.f21611n = z;
        ProgressBar progressBar = this.f21615r;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 4);
        }
    }

    public void showSoundIndicator(boolean z) {
        this.f21610m = z;
        if (z) {
            m25833g();
        } else {
            m25835h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m25838i() {
        this.f21621x.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m25839j() {
        if (this.f21617t.getVisibility() != 0) {
            this.f21621x.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m25841k() {
        this.f21618u.setVisibility(8);
    }

    public void onPlayStarted(int i) {
        if (this.f21590D != null && !TextUtils.isEmpty(this.f21588B)) {
            this.f21590D.mo58328a(this.f21588B);
        }
    }

    public void onPlayProgress(int i, int i2) {
        try {
            m25832f();
            m25833g();
            this.f21602e = false;
            this.f21600c = false;
            this.f21609l = i;
        } catch (Throwable th) {
            C8608u.m24881a("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void onPlayCompleted() {
        if (this.f21590D != null && !TextUtils.isEmpty(this.f21588B)) {
            this.f21590D.mo58330b(this.f21588B);
        }
        C8871a aVar = this.f21594I;
        if (aVar != null) {
            aVar.mo58383a();
            return;
        }
        try {
            if (!this.f21607j) {
                this.f21600c = true;
                m25828e();
            }
        } catch (Exception e) {
            C8608u.m24884d("MediaViewPlayerView", e.getMessage());
        }
    }

    public void onPlayError(String str) {
        try {
            this.f21600c = true;
            m25828e();
            if (!this.f21597L) {
                this.f21593H.play(getContext(), this.f21588B, this.f21614q);
                this.f21597L = true;
            }
        } catch (Exception e) {
            C8608u.m24884d("MediaViewPlayerView", e.getMessage());
        }
    }

    public void onPlaySetDataSourceError(String str) {
        try {
            this.f21600c = true;
            try {
                if (!URLUtil.isNetworkUrl(this.f21588B)) {
                    String videoUrlEncode = this.f21589C.getVideoUrlEncode();
                    if (C8556ac.m24738b(videoUrlEncode)) {
                        this.f21588B = videoUrlEncode;
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d("MediaViewPlayerView", th.getMessage());
            }
        } catch (Exception e) {
            C8608u.m24884d("MediaViewPlayerView", e.getMessage());
        }
    }

    /* renamed from: l */
    private void m25843l() {
        try {
            if (f21586F != null) {
                f21586F.removeCallbacksAndMessages((Object) null);
            }
            if (this.f21591E != null) {
                this.f21591E.cancel();
            }
        } catch (Exception e) {
            C8608u.m24884d("MediaViewPlayerView", e.getMessage());
        }
    }

    /* renamed from: m */
    private String m25845m() {
        String str;
        try {
            if (this.f21589C == null) {
                return null;
            }
            try {
                if (this.f21592G == null) {
                    if (this.f21589C.getAdType() != 287) {
                        if (this.f21589C.getAdType() != 94) {
                            str = this.f21589C.getId() + this.f21589C.getVideoUrlEncode() + this.f21589C.getBidToken();
                            this.f21592G = C9556c.getInstance().mo63224a(this.f21587A, str);
                        }
                    }
                    str = this.f21589C.getRequestId() + this.f21589C.getId() + this.f21589C.getVideoUrlEncode();
                    this.f21592G = C9556c.getInstance().mo63224a(this.f21587A, str);
                }
            } catch (Exception e) {
                C8608u.m24884d("MediaViewPlayerView", e.getMessage());
            }
            if (this.f21592G != null && this.f21592G.mo63211f() == 5) {
                String d = this.f21592G.mo63207d();
                if (new File(d).exists()) {
                    return d;
                }
            }
            String videoUrlEncode = this.f21589C.getVideoUrlEncode();
            if (C8556ac.m24738b(videoUrlEncode)) {
                return videoUrlEncode;
            }
            return null;
        } catch (Exception e2) {
            C8608u.m24884d("MediaViewPlayerView", e2.getMessage());
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$a */
    public static class C8871a {

        /* renamed from: a */
        private MediaViewPlayerView f21631a;

        public C8871a(MediaViewPlayerView mediaViewPlayerView) {
            this.f21631a = mediaViewPlayerView;
        }

        /* renamed from: a */
        public void mo58383a() {
            try {
                if (this.f21631a != null && !this.f21631a.f21607j) {
                    C8608u.m24882b("MediaViewPlayerView", "play end and display endcardView");
                    this.f21631a.m25828e();
                }
            } catch (Exception e) {
                C8608u.m24884d("MediaViewPlayerView", e.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MediaViewPlayerView$b */
    private class C8872b implements TextureView.SurfaceTextureListener {
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private C8872b() {
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            try {
                Surface unused = MediaViewPlayerView.this.f21614q = new Surface(surfaceTexture);
                boolean unused2 = MediaViewPlayerView.this.f21604g = true;
                boolean unused3 = MediaViewPlayerView.this.f21606i = true;
                if (MediaViewPlayerView.this.f21601d) {
                    if (MediaViewPlayerView.this.f21605h) {
                        boolean unused4 = MediaViewPlayerView.this.f21600c = false;
                        boolean unused5 = MediaViewPlayerView.this.f21605h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete()) {
                        if (!MediaViewPlayerView.this.f21602e) {
                            MediaViewPlayerView.this.startOrPlayVideo();
                            return;
                        }
                    }
                    MediaViewPlayerView.this.m25828e();
                } else if (MediaViewPlayerView.this.f21599b) {
                    if (MediaViewPlayerView.this.hasPrepare()) {
                        if (MediaViewPlayerView.this.isComplete()) {
                            MediaViewPlayerView.this.m25828e();
                            return;
                        }
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                } else {
                    if (MediaViewPlayerView.this.hasPrepare()) {
                        if (!MediaViewPlayerView.this.isComplete()) {
                            MediaViewPlayerView.this.startOrPlayVideo();
                            return;
                        }
                    }
                    MediaViewPlayerView.this.m25828e();
                }
            } catch (Exception e) {
                C8608u.m24884d("MediaViewPlayerView", e.getMessage());
            }
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C8608u.m24882b("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.f21593H != null && MediaViewPlayerView.this.f21593H.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                boolean unused = MediaViewPlayerView.this.f21600c = true;
                boolean unused2 = MediaViewPlayerView.this.f21604g = false;
            } catch (Throwable th) {
                C8608u.m24884d("MediaViewPlayerView", th.getMessage());
            }
            return true;
        }
    }

    public void registerView(AdSession adSession) {
        this.f21595J = adSession;
        if (adSession != null) {
            adSession.registerAdView(this);
            adSession.addFriendlyObstruction(this.f21613p, FriendlyObstructionPurpose.OTHER, (String) null);
            adSession.addFriendlyObstruction(this.f21615r, FriendlyObstructionPurpose.OTHER, (String) null);
            adSession.addFriendlyObstruction(this.f21616s, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
            adSession.addFriendlyObstruction(this.f21617t, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
            adSession.addFriendlyObstruction(this.f21618u, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
            adSession.addFriendlyObstruction(this.f21619v, FriendlyObstructionPurpose.OTHER, (String) null);
        }
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f21596K = mediaEvents;
    }

    public void unregisterView() {
        AdSession adSession = this.f21595J;
        if (adSession != null) {
            adSession.removeAllFriendlyObstructions();
        }
    }

    public void onPlayProgressMS(int i, int i2) {
        try {
            if (this.f21615r != null && this.f21615r.getVisibility() == 0) {
                if (i2 > 0) {
                    this.f21615r.setMax(i2);
                }
                if (i >= 0) {
                    this.f21615r.setProgress(i + 1);
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d("MediaViewPlayerView", th.getMessage());
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m25834g(MediaViewPlayerView mediaViewPlayerView) {
        mediaViewPlayerView.m25843l();
        mediaViewPlayerView.f21591E = new Timer();
        mediaViewPlayerView.f21591E.schedule(new TimerTask() {
            public final void run() {
                try {
                    MediaViewPlayerView.this.gonePauseView();
                } catch (Throwable th) {
                    C8608u.m24881a("MediaViewPlayerView", th.getMessage(), th);
                }
            }
        }, 2000);
    }
}
