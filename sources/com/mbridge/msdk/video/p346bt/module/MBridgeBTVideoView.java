package com.mbridge.msdk.video.p346bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.p051a.C2265b;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.p346bt.p347a.C9196c;
import com.mbridge.msdk.video.widget.SoundImageView;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.p373d.C9548a;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView */
public class MBridgeBTVideoView extends BTBaseView {
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static boolean f22324J = false;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public MediaEvents f22325A;

    /* renamed from: B */
    private AdEvents f22326B;

    /* renamed from: C */
    private C9231a f22327C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f22328D = 2;

    /* renamed from: E */
    private int f22329E;

    /* renamed from: F */
    private boolean f22330F = false;

    /* renamed from: G */
    private int f22331G = 2;

    /* renamed from: H */
    private int f22332H = 1;

    /* renamed from: I */
    private String f22333I;

    /* renamed from: K */
    private boolean f22334K = false;

    /* renamed from: L */
    private boolean f22335L = false;

    /* renamed from: M */
    private boolean f22336M = false;

    /* renamed from: N */
    private RelativeLayout f22337N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public ProgressBar f22338O;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public PlayerView f22339p;

    /* renamed from: q */
    private SoundImageView f22340q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public TextView f22341r;

    /* renamed from: s */
    private View f22342s;

    /* renamed from: t */
    private FeedBackButton f22343t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public WebView f22344u;

    /* renamed from: v */
    private C9552a f22345v;

    /* renamed from: w */
    private int f22346w = 0;

    /* renamed from: x */
    private int f22347x = 0;

    /* renamed from: y */
    private int f22348y = 0;

    /* renamed from: z */
    private AdSession f22349z;

    public void setCreateWebView(WebView webView) {
        this.f22344u = webView;
    }

    public void setOrientation(int i) {
        this.f22332H = i;
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx == null || campaignEx.getVideoCompleteTime() <= 0) {
            this.f22341r.setBackgroundResource(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_reward_shape_progress", "drawable"));
            this.f22341r.setWidth(C8613y.m24929b(C2350a.m5601e().mo15792g(), 30.0f));
            return;
        }
        this.f22341r.setBackgroundResource(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_reward_video_time_count_num_bg", "drawable"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C8613y.m24929b(C2350a.m5601e().mo15792g(), 30.0f));
        int b = C8613y.m24929b(C2350a.m5601e().mo15792g(), 5.0f);
        layoutParams.setMargins(b, 0, 0, 0);
        this.f22341r.setPadding(b, 0, b, 0);
        this.f22341r.setLayoutParams(layoutParams);
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.f22197h) {
            this.f22328D = i;
            if (i == 1) {
                this.f22340q.setSoundStatus(false);
                this.f22339p.closeSound();
            } else if (i == 2) {
                this.f22340q.setSoundStatus(true);
                this.f22339p.openSound();
            }
            if (i2 == 1) {
                this.f22340q.setVisibility(8);
            } else if (i2 == 2) {
                this.f22340q.setVisibility(0);
            }
        }
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f22195f.inflate(findLayout, this);
            this.f22197h = m26399b();
            if (!this.f22197h) {
                C8608u.m24884d(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            mo62172a();
        }
        f22324J = false;
    }

    public void onResume() {
        PlayerView playerView = this.f22339p;
        if (playerView != null) {
            playerView.setIsCovered(false);
            this.f22339p.setDesk(true);
            if (this.f22335L) {
                this.f22339p.start(true);
            }
        }
    }

    public void onPause() {
        PlayerView playerView = this.f22339p;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f22335L = isPlayIng;
            this.f22339p.setIsBTVideoPlaying(isPlayIng);
            this.f22339p.onPause();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f22339p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        View rootView;
        super.onAttachedToWindow();
        if (!this.f22336M) {
            this.f22331G = C9196c.m26194a().mo62143e(this.f22192c);
        }
        View view = this.f22342s;
        int i = 8;
        if (view != null) {
            view.setVisibility(this.f22347x == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f22340q;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f22348y == 0 ? 8 : 0);
        }
        TextView textView = this.f22341r;
        if (textView != null) {
            if (this.f22346w != 0) {
                i = 0;
            }
            textView.setVisibility(i);
            if (this.f22341r.getVisibility() == 0 && C2347b.m5579a().mo15773b()) {
                this.f22191b.setCampaignUnitId(this.f22192c);
                C2347b.m5579a().mo15768a(this.f22192c + "_" + 1, this.f22191b);
                C2347b.m5579a().mo15769a(this.f22192c + "_" + 1, this.f22343t);
            }
        }
        if (this.f22349z != null && (rootView = getRootView()) != null) {
            this.f22349z.removeFriendlyObstruction(rootView);
        }
    }

    public boolean playMute() {
        try {
            if (!(this.f22339p == null || this.f22344u == null)) {
                this.f22339p.closeSound();
                this.f22340q.setSoundStatus(false);
                this.f22328D = 1;
                try {
                    if (this.f22325A != null) {
                        this.f22325A.volumeChange(0.0f);
                    }
                } catch (IllegalArgumentException e) {
                    C8608u.m24880a("OMSDK", e.getMessage());
                }
                m26261a(this.f22344u, "onPlayerMute", this.f22193d);
                return true;
            }
        } catch (Exception e2) {
            C8608u.m24884d(BTBaseView.TAG, e2.getMessage());
        }
        return false;
    }

    public int getMute() {
        return this.f22328D;
    }

    public boolean playUnMute() {
        try {
            if (this.f22339p == null || this.f22344u == null) {
                return false;
            }
            this.f22339p.openSound();
            this.f22340q.setSoundStatus(true);
            this.f22328D = 2;
            try {
                if (this.f22325A != null) {
                    this.f22325A.volumeChange(1.0f);
                }
            } catch (IllegalArgumentException e) {
                C8608u.m24880a("OMSDK", e.getMessage());
            }
            m26261a(this.f22344u, "onUnmute", this.f22193d);
            return true;
        } catch (Exception e2) {
            C8608u.m24884d(BTBaseView.TAG, e2.getMessage());
            return false;
        }
    }

    public void play() {
        try {
            if (!this.f22336M) {
                String c = m26401c();
                this.f22333I = c;
                this.f22339p.initVFPData(c, this.f22191b.getVideoUrlEncode(), this.f22327C);
                if (this.f22331G == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                try {
                    if (this.f22326B != null) {
                        this.f22326B.impressionOccurred();
                    }
                    if (this.f22325A != null) {
                        float duration = (float) this.f22339p.getDuration();
                        float f = 0.0f;
                        if (duration == 0.0f && this.f22191b != null) {
                            duration = (float) this.f22191b.getVideoLength();
                        }
                        MediaEvents mediaEvents = this.f22325A;
                        if (getMute() == 2) {
                            f = 1.0f;
                        }
                        mediaEvents.start(duration, f);
                        C8608u.m24880a("omsdk", "play: videoEvents.start()");
                    }
                } catch (IllegalArgumentException e) {
                    C8608u.m24880a(BTBaseView.TAG, e.getMessage());
                }
                if (!this.f22339p.playVideo() && this.f22327C != null) {
                    this.f22327C.onPlayError("play video failed");
                }
                this.f22336M = true;
                return;
            }
            if (this.f22330F) {
                this.f22339p.playVideo(0);
                this.f22330F = false;
            } else {
                this.f22339p.start(false);
            }
            try {
                if (this.f22325A != null) {
                    this.f22325A.resume();
                    C8608u.m24880a("omsdk", "play:  videoEvents.resume()");
                }
            } catch (IllegalArgumentException e2) {
                C8608u.m24880a(BTBaseView.TAG, e2.getMessage());
            }
            if (this.f22344u != null) {
                m26261a(this.f22344u, "onPlayerPlay", this.f22193d);
            }
        } catch (Exception e3) {
            C8608u.m24881a(BTBaseView.TAG, e3.getMessage(), e3);
        }
    }

    public void resume() {
        try {
            if (this.f22339p != null) {
                if (this.f22330F) {
                    this.f22339p.playVideo(0);
                    this.f22330F = false;
                } else {
                    this.f22339p.onResume();
                }
                try {
                    if (this.f22325A != null) {
                        this.f22325A.resume();
                        C8608u.m24880a("omsdk", "play:  videoEvents.resume()");
                    }
                } catch (IllegalArgumentException e) {
                    C8608u.m24880a(BTBaseView.TAG, e.getMessage());
                }
                if (this.f22344u != null) {
                    m26261a(this.f22344u, "onPlayerResume", this.f22193d);
                }
            }
        } catch (Exception e2) {
            C8608u.m24884d(BTBaseView.TAG, e2.getMessage());
        }
    }

    public void pause() {
        try {
            if (this.f22339p != null) {
                this.f22339p.pause();
                if (this.f22325A != null) {
                    this.f22325A.pause();
                    C8608u.m24880a("omsdk", "play:  videoEvents.pause()");
                }
                if (this.f22344u != null) {
                    m26261a(this.f22344u, "onPlayerPause", this.f22193d);
                }
            }
        } catch (Exception e) {
            C8608u.m24881a(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void stop() {
        try {
            if (this.f22339p != null) {
                this.f22339p.pause();
                this.f22339p.stop();
                this.f22330F = true;
                if (this.f22344u != null) {
                    m26261a(this.f22344u, "onPlayerStop", this.f22193d);
                }
            }
        } catch (Exception e) {
            C8608u.m24881a(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void onDestory() {
        try {
            if (this.f22339p != null) {
                this.f22339p.setOnClickListener((View.OnClickListener) null);
                this.f22339p.release();
                this.f22339p = null;
            }
            if (this.f22340q != null) {
                this.f22340q.setOnClickListener((View.OnClickListener) null);
            }
            if (this.f22342s != null) {
                this.f22342s.setOnClickListener((View.OnClickListener) null);
            }
            if (this.f22344u != null) {
                this.f22344u = null;
            }
            if (this.f22349z != null) {
                this.f22349z = null;
            }
            if (this.f22325A != null) {
                this.f22325A = null;
            }
            setOnClickListener((View.OnClickListener) null);
        } catch (Throwable th) {
            C8608u.m24880a(BTBaseView.TAG, th.getMessage());
        }
    }

    /* renamed from: b */
    private boolean m26399b() {
        try {
            this.f22339p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f22340q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f22341r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f22342s = findViewById(findID("mbridge_rl_playing_close"));
            this.f22337N = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.f22338O = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f22343t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f22339p.setIsBTVideo(true);
            return isNotNULL(this.f22339p, this.f22340q, this.f22341r, this.f22342s);
        } catch (Throwable th) {
            C8608u.m24881a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: c */
    private String m26401c() {
        try {
            String videoUrlEncode = this.f22191b.getVideoUrlEncode();
            if (this.f22345v == null) {
                return videoUrlEncode;
            }
            String d = this.f22345v.mo63207d();
            if (C8556ac.m24737a(d) || !new File(d).exists()) {
                return videoUrlEncode;
            }
            return d;
        } catch (Throwable th) {
            C8608u.m24881a(BTBaseView.TAG, th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: d */
    private int m26402d() {
        int i = 5;
        try {
            C9548a b = C9549b.m27299a().mo63129b();
            if (b == null) {
                C9549b.m27299a().mo63130c();
            }
            if (b != null) {
                i = (int) b.mo63118f();
            }
            C8608u.m24882b(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62172a() {
        super.mo62172a();
        if (this.f22197h) {
            this.f22340q.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    boolean isSilent = MBridgeBTVideoView.this.f22339p.isSilent();
                    if (MBridgeBTVideoView.this.f22344u != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f22188n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f22193d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("mute", MBridgeBTVideoView.this.f22328D);
                            jSONObject.put("data", jSONObject2);
                            C8824g.m25670a().mo58310a(MBridgeBTVideoView.this.f22344u, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            C8608u.m24880a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + MBridgeBTVideoView.this.f22328D);
                        } catch (Exception e) {
                            C9196c.m26194a().mo62125a(MBridgeBTVideoView.this.f22344u, e.getMessage());
                        }
                    }
                }
            });
            this.f22342s.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f22344u != null) {
                        BTBaseView.m26261a(MBridgeBTVideoView.this.f22344u, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f22193d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f22325A != null) {
                        MBridgeBTVideoView.this.f22325A.adUserInteraction(InteractionType.CLICK);
                    }
                    if (MBridgeBTVideoView.this.f22344u != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f22188n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f22193d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            C8824g.m25670a().mo58310a(MBridgeBTVideoView.this.f22344u, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            C9196c.m26194a().mo62126a(MBridgeBTVideoView.this.f22344u, "onClicked", MBridgeBTVideoView.this.f22193d);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView$a */
    private static final class C9231a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a */
        private MBridgeBTVideoView f22353a;

        /* renamed from: b */
        private WebView f22354b;

        /* renamed from: c */
        private MediaEvents f22355c;

        /* renamed from: d */
        private String f22356d;

        /* renamed from: e */
        private String f22357e;

        /* renamed from: f */
        private int f22358f;

        /* renamed from: g */
        private int f22359g;

        /* renamed from: h */
        private boolean f22360h;

        /* renamed from: i */
        private boolean f22361i = false;

        /* renamed from: j */
        private boolean f22362j = false;

        /* renamed from: k */
        private boolean f22363k = false;

        /* renamed from: l */
        private int f22364l;

        /* renamed from: m */
        private int f22365m;

        /* renamed from: n */
        private boolean f22366n = false;

        public C9231a(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, MediaEvents mediaEvents) {
            this.f22353a = mBridgeBTVideoView;
            this.f22354b = webView;
            this.f22355c = mediaEvents;
            if (mBridgeBTVideoView != null) {
                this.f22356d = mBridgeBTVideoView.f22193d;
                this.f22357e = mBridgeBTVideoView.f22192c;
            }
        }

        /* renamed from: a */
        public final void mo62333a(int i, int i2) {
            this.f22364l = i;
            this.f22365m = i2;
        }

        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f22360h) {
                this.f22353a.f22338O.setMax(i);
                WebView webView = this.f22354b;
                if (webView != null) {
                    BTBaseView.m26261a(webView, "onPlayerPlay", this.f22356d);
                }
                this.f22360h = true;
            }
            boolean unused = MBridgeBTVideoView.f22324J = false;
        }

        public final void onPlayCompleted() {
            super.onPlayCompleted();
            if (this.f22353a.f22191b == null) {
                this.f22353a.f22341r.setText("0");
            } else if (this.f22353a.f22191b.getVideoCompleteTime() > 0) {
                this.f22353a.f22341r.setText(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_reward_video_view_reward_time_complete", "string"));
            } else {
                this.f22353a.f22341r.setText("0");
            }
            this.f22353a.f22339p.setClickable(false);
            WebView webView = this.f22354b;
            if (webView != null) {
                BTBaseView.m26261a(webView, "onPlayerFinish", this.f22356d);
            }
            MediaEvents mediaEvents = this.f22355c;
            if (mediaEvents != null) {
                mediaEvents.complete();
                C8608u.m24880a("omsdk", "play:  videoEvents.complete()");
            }
            this.f22358f = this.f22359g;
            boolean unused = MBridgeBTVideoView.f22324J = true;
            this.f22353a.stop();
        }

        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f22354b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f22189o);
                    jSONObject.put("id", this.f22356d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f22356d);
                    jSONObject.put("data", jSONObject2);
                    C8824g.m25670a().mo58310a(this.f22354b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C9196c.m26194a().mo62125a(this.f22354b, e.getMessage());
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:67:0x0217 A[Catch:{ Exception -> 0x0236 }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPlayProgress(int r9, int r10) {
            /*
                r8 = this;
                java.lang.String r0 = "id"
                java.lang.String r1 = "DefaultVideoPlayerStatusListener"
                super.onPlayProgress(r9, r10)
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22353a
                boolean r2 = r2.f22197h
                r3 = 1
                if (r2 == 0) goto L_0x00b5
                r2 = 0
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r8.f22353a
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f22191b
                if (r4 == 0) goto L_0x0040
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22353a
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f22191b
                int r2 = r2.getVideoCompleteTime()
                com.mbridge.msdk.foundation.b.b r4 = com.mbridge.msdk.foundation.p064b.C2347b.m5579a()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r6 = r8.f22353a
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r6.f22191b
                java.lang.String r6 = r6.getCampaignUnitId()
                r5.append(r6)
                java.lang.String r6 = "_"
                r5.append(r6)
                r5.append(r3)
                java.lang.String r5 = r5.toString()
                r4.mo15772b(r5, r9)
            L_0x0040:
                if (r2 <= r10) goto L_0x0043
                r2 = r10
            L_0x0043:
                if (r2 > 0) goto L_0x0048
                int r4 = r10 - r9
                goto L_0x004a
            L_0x0048:
                int r4 = r2 - r9
            L_0x004a:
                java.lang.String r5 = "string"
                if (r4 > 0) goto L_0x0072
                if (r2 > 0) goto L_0x0053
                java.lang.String r2 = "0"
                goto L_0x00ac
            L_0x0053:
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22353a
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
                android.content.Context r4 = r4.mo15792g()
                java.lang.String r6 = "mbridge_reward_video_view_reward_time_complete"
                int r4 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r4, r6, r5)
                java.lang.CharSequence r2 = r2.getText(r4)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x00ac
            L_0x0072:
                if (r2 > 0) goto L_0x007f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                java.lang.String r4 = ""
                goto L_0x00a5
            L_0x007f:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r8.f22353a
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
                android.content.Context r6 = r6.mo15792g()
                java.lang.String r7 = "mbridge_reward_video_view_reward_time_left"
                int r5 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r6, r7, r5)
                java.lang.CharSequence r4 = r4.getText(r5)
                java.lang.String r4 = (java.lang.String) r4
            L_0x00a5:
                r2.append(r4)
                java.lang.String r2 = r2.toString()
            L_0x00ac:
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r8.f22353a
                android.widget.TextView r4 = r4.f22341r
                r4.setText(r2)
            L_0x00b5:
                r8.f22359g = r10
                r8.f22358f = r9
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22353a
                android.widget.ProgressBar r2 = r2.f22338O
                int r4 = r8.f22359g
                r2.setMax(r4)
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r2 = r8.f22353a
                android.widget.ProgressBar r2 = r2.f22338O
                int r4 = r8.f22358f
                r2.setProgress(r4)
                android.webkit.WebView r2 = r8.f22354b
                if (r2 == 0) goto L_0x0135
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0127 }
                r2.<init>()     // Catch:{ Exception -> 0x0127 }
                java.lang.String r4 = "code"
                int r5 = com.mbridge.msdk.video.p346bt.module.BTBaseView.f22188n     // Catch:{ Exception -> 0x0127 }
                r2.put(r4, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r4 = r8.f22356d     // Catch:{ Exception -> 0x0127 }
                r2.put(r0, r4)     // Catch:{ Exception -> 0x0127 }
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0127 }
                r4.<init>()     // Catch:{ Exception -> 0x0127 }
                java.lang.String r5 = r8.f22356d     // Catch:{ Exception -> 0x0127 }
                r4.put(r0, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r0 = "progress"
                java.lang.String r5 = com.mbridge.msdk.video.p346bt.module.MBridgeBTVideoView.m26398b(r9, r10)     // Catch:{ Exception -> 0x0127 }
                r4.put(r0, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r0 = "time"
                java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0127 }
                r4.put(r0, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r0 = "duration"
                java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0127 }
                r4.put(r0, r5)     // Catch:{ Exception -> 0x0127 }
                java.lang.String r0 = "data"
                r2.put(r0, r4)     // Catch:{ Exception -> 0x0127 }
                com.mbridge.msdk.mbsignalcommon.windvane.g r0 = com.mbridge.msdk.mbsignalcommon.windvane.C8824g.m25670a()     // Catch:{ Exception -> 0x0127 }
                android.webkit.WebView r4 = r8.f22354b     // Catch:{ Exception -> 0x0127 }
                java.lang.String r5 = "onPlayerProgressChanged"
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0127 }
                byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0127 }
                r6 = 2
                java.lang.String r2 = android.util.Base64.encodeToString(r2, r6)     // Catch:{ Exception -> 0x0127 }
                r0.mo58310a((android.webkit.WebView) r4, (java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0127 }
                goto L_0x0135
            L_0x0127:
                r0 = move-exception
                com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p346bt.p347a.C9196c.m26194a()
                android.webkit.WebView r4 = r8.f22354b
                java.lang.String r0 = r0.getMessage()
                r2.mo62125a((android.webkit.WebView) r4, (java.lang.String) r0)
            L_0x0135:
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r0 = r8.f22355c
                r2 = 100
                if (r0 == 0) goto L_0x0186
                int r4 = r9 * 100
                int r4 = r4 / r10
                int r5 = r9 + 1
                int r5 = r5 * r2
                int r5 = r5 / r10
                r6 = 25
                java.lang.String r7 = "omsdk"
                if (r4 > r6) goto L_0x0159
                if (r6 >= r5) goto L_0x0159
                boolean r6 = r8.f22361i
                if (r6 != 0) goto L_0x0159
                r8.f22361i = r3
                r0.firstQuartile()
                java.lang.String r0 = "play:  videoEvents.firstQuartile()"
                com.mbridge.msdk.foundation.tools.C8608u.m24880a(r7, r0)
                goto L_0x0186
            L_0x0159:
                r0 = 50
                if (r4 > r0) goto L_0x0170
                if (r0 >= r5) goto L_0x0170
                boolean r0 = r8.f22362j
                if (r0 != 0) goto L_0x0170
                r8.f22362j = r3
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r0 = r8.f22355c
                r0.midpoint()
                java.lang.String r0 = "play:  videoEvents.midpoint()"
                com.mbridge.msdk.foundation.tools.C8608u.m24880a(r7, r0)
                goto L_0x0186
            L_0x0170:
                r0 = 75
                if (r4 > r0) goto L_0x0186
                if (r0 >= r5) goto L_0x0186
                boolean r0 = r8.f22363k
                if (r0 != 0) goto L_0x0186
                r8.f22363k = r3
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r0 = r8.f22355c
                r0.thirdQuartile()
                java.lang.String r0 = "play:  videoEvents.thirdQuartile()"
                com.mbridge.msdk.foundation.tools.C8608u.m24880a(r7, r0)
            L_0x0186:
                int r0 = r8.f22364l     // Catch:{ Exception -> 0x0236 }
                if (r0 == r2) goto L_0x023e
                boolean r0 = r8.f22366n     // Catch:{ Exception -> 0x0236 }
                if (r0 != 0) goto L_0x023e
                int r0 = r8.f22364l     // Catch:{ Exception -> 0x0236 }
                if (r0 != 0) goto L_0x0193
                return
            L_0x0193:
                int r0 = r8.f22365m     // Catch:{ Exception -> 0x0236 }
                if (r0 < 0) goto L_0x023e
                int r0 = r8.f22365m     // Catch:{ Exception -> 0x0236 }
                int r10 = r10 * r0
                int r10 = r10 / r2
                if (r9 < r10) goto L_0x023e
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r9 = r8.f22353a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r9 = r9.f22191b     // Catch:{ Exception -> 0x0236 }
                int r9 = r9.getAdType()     // Catch:{ Exception -> 0x0236 }
                r0 = 94
                if (r9 == r0) goto L_0x01e1
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r9 = r8.f22353a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r9 = r9.f22191b     // Catch:{ Exception -> 0x0236 }
                int r9 = r9.getAdType()     // Catch:{ Exception -> 0x0236 }
                r0 = 287(0x11f, float:4.02E-43)
                if (r9 != r0) goto L_0x01b6
                goto L_0x01e1
            L_0x01b6:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0236 }
                r9.<init>()     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22353a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22191b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22353a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22191b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22353a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22191b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getBidToken()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0236 }
                goto L_0x020b
            L_0x01e1:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0236 }
                r9.<init>()     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22353a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22191b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getRequestId()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22353a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22191b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r0 = r8.f22353a     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22191b     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ Exception -> 0x0236 }
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0236 }
            L_0x020b:
                com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9556c.getInstance()     // Catch:{ Exception -> 0x0236 }
                java.lang.String r2 = r8.f22357e     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.videocommon.download.a r9 = r0.mo63224a(r2, r9)     // Catch:{ Exception -> 0x0236 }
                if (r9 == 0) goto L_0x023e
                r9.mo63215j()     // Catch:{ Exception -> 0x0236 }
                r8.f22366n = r3     // Catch:{ Exception -> 0x0236 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0236 }
                r9.<init>()     // Catch:{ Exception -> 0x0236 }
                java.lang.String r0 = "CDRate is : "
                r9.append(r0)     // Catch:{ Exception -> 0x0236 }
                r9.append(r10)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r10 = " and start download !"
                r9.append(r10)     // Catch:{ Exception -> 0x0236 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0236 }
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r9)     // Catch:{ Exception -> 0x0236 }
                goto L_0x023e
            L_0x0236:
                r9 = move-exception
                java.lang.String r9 = r9.getMessage()
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r9)
            L_0x023e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p346bt.module.MBridgeBTVideoView.C9231a.onPlayProgress(int, int):void");
        }

        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f22355c != null) {
                    this.f22355c.bufferStart();
                }
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.f22354b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f22188n);
                        jSONObject.put("id", this.f22356d);
                        jSONObject.put("data", new JSONObject());
                        C8824g.m25670a().mo58310a(this.f22354b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C9196c.m26194a().mo62125a(this.f22354b, e.getMessage());
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f22355c != null) {
                    this.f22355c.bufferFinish();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }
    }

    public void setSoundImageViewVisble(int i) {
        this.f22340q.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.f22341r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCloseViewVisable(int i) {
        this.f22342s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setShowClose(int i) {
        this.f22347x = i;
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.f22338O;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
        }
    }

    public void setShowMute(int i) {
        this.f22348y = i;
    }

    public void setShowTime(int i) {
        this.f22346w = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m26398b(int i, int i2) {
        if (i2 != 0) {
            double d = (double) (((float) i) / ((float) i2));
            try {
                return C8613y.m24910a(Double.valueOf(d)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    public void setVolume(float f, float f2) {
        PlayerView playerView = this.f22339p;
        if (playerView != null) {
            playerView.setVolume(f, f2);
        }
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.f22339p;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = this.f22337N.getPaddingLeft();
        }
        if (i2 <= 0) {
            i2 = this.f22337N.getPaddingRight();
        }
        if (i3 <= 0) {
            i3 = this.f22337N.getPaddingTop();
        }
        if (i4 <= 0) {
            i4 = this.f22337N.getPaddingBottom();
        }
        C8608u.m24884d(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        this.f22337N.setPadding(i, i3, i2, i4);
    }

    public void preLoadData() {
        String str;
        int i;
        if (this.f22191b.getAdType() == 94 || this.f22191b.getAdType() == 287) {
            str = this.f22191b.getRequestId() + this.f22191b.getId() + this.f22191b.getVideoUrlEncode();
        } else {
            str = this.f22191b.getId() + this.f22191b.getVideoUrlEncode() + this.f22191b.getBidToken();
        }
        C9552a a = C9556c.getInstance().mo63224a(this.f22192c, str);
        if (a != null) {
            this.f22345v = a;
        }
        this.f22329E = m26402d();
        try {
            if (this.f22191b != null && this.f22191b.isActiveOm()) {
                this.f22349z = C2265b.m5114a(getContext(), false, this.f22191b.getOmid(), this.f22191b.getRequestId(), this.f22191b.getId(), this.f22192c, "", this.f22191b.getRequestIdNotice());
            }
            if (this.f22349z != null) {
                if (this.f22339p != null) {
                    this.f22349z.registerAdView(this.f22339p);
                }
                if (this.f22340q != null) {
                    this.f22349z.addFriendlyObstruction(this.f22340q, FriendlyObstructionPurpose.OTHER, (String) null);
                }
                if (this.f22341r != null) {
                    this.f22349z.addFriendlyObstruction(this.f22341r, FriendlyObstructionPurpose.OTHER, (String) null);
                }
                if (this.f22342s != null) {
                    this.f22349z.addFriendlyObstruction(this.f22342s, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
                }
                this.f22326B = AdEvents.createAdEvents(this.f22349z);
                this.f22325A = MediaEvents.createMediaEvents(this.f22349z);
                this.f22349z.start();
                this.f22326B.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
            }
        } catch (Throwable th) {
            C8608u.m24880a(BTBaseView.TAG, th.getMessage());
        }
        this.f22333I = m26401c();
        if (this.f22197h && !TextUtils.isEmpty(this.f22333I) && this.f22191b != null) {
            AdSession adSession = this.f22349z;
            if (adSession != null) {
                adSession.registerAdView(this.f22339p);
                this.f22349z.addFriendlyObstruction(this.f22340q, FriendlyObstructionPurpose.OTHER, (String) null);
                this.f22349z.addFriendlyObstruction(this.f22341r, FriendlyObstructionPurpose.OTHER, (String) null);
                this.f22349z.addFriendlyObstruction(this.f22342s, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
            }
            C9231a aVar = new C9231a(this, this.f22344u, this.f22325A);
            this.f22327C = aVar;
            CampaignEx campaignEx = this.f22191b;
            if (campaignEx == null) {
                i = C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f22192c, false).mo63170p();
            } else if (campaignEx.getReady_rate() != -1) {
                i = campaignEx.getReady_rate();
            } else {
                i = C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f22192c, false).mo63170p();
            }
            aVar.mo62333a(i, C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f22192c, false).mo63172q());
            this.f22339p.setDesk(false);
            this.f22339p.initBufferIngParam(this.f22329E);
            soundOperate(this.f22328D, -1, (String) null);
        }
        f22324J = false;
    }
}
