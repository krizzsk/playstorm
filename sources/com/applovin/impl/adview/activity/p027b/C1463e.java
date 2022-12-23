package com.applovin.impl.adview.activity.p027b;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.C1423a;
import com.applovin.impl.adview.C1527j;
import com.applovin.impl.adview.C1540m;
import com.applovin.impl.adview.C1553s;
import com.applovin.impl.adview.C1554t;
import com.applovin.impl.adview.C1555u;
import com.applovin.impl.adview.activity.p026a.C1434c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p046ad.C1836g;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.C2085q;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2392R;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.p195ui.PlayerControlView;
import com.google.android.exoplayer2.p195ui.PlayerView;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.e */
public class C1463e extends C1440a implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    protected boolean f1737A = Utils.isVideoMutedInitially(this.f1681b);

    /* renamed from: B */
    protected long f1738B;

    /* renamed from: C */
    protected int f1739C;

    /* renamed from: D */
    protected boolean f1740D;

    /* renamed from: E */
    protected boolean f1741E;

    /* renamed from: F */
    private final C1434c f1742F = new C1434c(this.f1680a, this.f1684e, this.f1681b);

    /* renamed from: G */
    private final C1473a f1743G = new C1473a();

    /* renamed from: H */
    private final Handler f1744H = new Handler(Looper.getMainLooper());

    /* renamed from: I */
    private final boolean f1745I = this.f1680a.mo12626f();

    /* renamed from: J */
    private long f1746J = -1;

    /* renamed from: K */
    private final AtomicBoolean f1747K = new AtomicBoolean();

    /* renamed from: L */
    private final AtomicBoolean f1748L = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public long f1749M = -2;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public long f1750N = 0;

    /* renamed from: s */
    protected final PlayerView f1751s;

    /* renamed from: t */
    protected final SimpleExoPlayer f1752t;

    /* renamed from: u */
    protected final C1423a f1753u;

    /* renamed from: v */
    protected final C1540m f1754v;

    /* renamed from: w */
    protected final ImageView f1755w;

    /* renamed from: x */
    protected final C1554t f1756x;

    /* renamed from: y */
    protected final ProgressBar f1757y;

    /* renamed from: z */
    protected final C1527j f1758z = new C1527j(this.f1744H, this.f1681b);

    /* renamed from: com.applovin.impl.adview.activity.b.e$a */
    private class C1473a implements C1555u.C1556a {
        private C1473a() {
        }

        /* renamed from: a */
        public void mo12838a(C1554t tVar) {
            if (C2092v.m5047a()) {
                C1463e.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            C1463e.this.mo12807a(tVar.getAndClearLastClickLocation());
        }

        /* renamed from: b */
        public void mo12839b(C1554t tVar) {
            if (C2092v.m5047a()) {
                C1463e.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            C1463e.this.mo12776h();
        }

        /* renamed from: c */
        public void mo12840c(C1554t tVar) {
            if (C2092v.m5047a()) {
                C1463e.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            C1463e.this.mo12808c();
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.e$b */
    private class C1474b implements AppLovinTouchToClickListener.OnClickListener, Player.EventListener, PlayerControlView.VisibilityListener {
        private C1474b() {
        }

        public void onClick(View view, PointF pointF) {
            C1463e.this.mo12807a(pointF);
        }

        public void onPlaybackStateChanged(int i) {
            if (C2092v.m5047a()) {
                C2092v vVar = C1463e.this.f1682c;
                vVar.mo14789b("AppLovinFullscreenActivity", "Player state changed to state " + i + " and will play when ready: " + C1463e.this.f1752t.getPlayWhenReady());
            }
            if (i == 2) {
                C1463e.this.mo12811v();
                C1463e.this.f1683d.mo14112g();
            } else if (i == 3) {
                C1463e.this.f1752t.setVolume(C1463e.this.f1737A ^ true ? 1.0f : 0.0f);
                C1463e eVar = C1463e.this;
                eVar.mo12809c(eVar.f1752t.getDuration());
                C1463e.this.mo12789u();
                if (C2092v.m5047a()) {
                    C2092v vVar2 = C1463e.this.f1682c;
                    vVar2.mo14789b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C1463e.this.f1752t);
                }
                C1463e.this.f1758z.mo12964a();
                if (C1463e.this.f1754v != null) {
                    C1463e.this.mo12824A();
                }
                C1463e.this.mo12812w();
                if (C1463e.this.f1696q.mo14042c()) {
                    C1463e.this.mo12773e();
                }
            } else if (i == 4) {
                if (C2092v.m5047a()) {
                    C1463e.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Video completed");
                }
                C1463e.this.f1741E = true;
                C1463e.this.mo12814y();
            }
        }

        public void onPlayerError(PlaybackException playbackException) {
            C1463e eVar = C1463e.this;
            eVar.mo12810c("Video view error (" + playbackException + ")");
            C1463e.this.mo12776h();
        }

        public void onVisibilityChange(int i) {
            if (i == 0) {
                C1463e.this.f1751s.hideController();
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.e$c */
    private class C1475c implements View.OnClickListener {
        private C1475c() {
        }

        public void onClick(View view) {
            if (view == C1463e.this.f1754v) {
                if (C1463e.this.mo12787s()) {
                    C1463e.this.mo12773e();
                    C1463e.this.mo12784p();
                    C1463e.this.f1696q.mo14041b();
                    return;
                }
                C1463e.this.mo12808c();
            } else if (view == C1463e.this.f1755w) {
                C1463e.this.mo12813x();
            } else if (C2092v.m5047a()) {
                C2092v vVar = C1463e.this.f1682c;
                vVar.mo14793e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C1463e(C1829e eVar, Activity activity, C1959m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        if (eVar.hasVideoUrl()) {
            C1475c cVar = new C1475c();
            if (eVar.mo14010q() >= 0) {
                C1540m mVar2 = new C1540m(eVar.mo14016w(), activity);
                this.f1754v = mVar2;
                mVar2.setVisibility(8);
                this.f1754v.setOnClickListener(cVar);
            } else {
                this.f1754v = null;
            }
            if (m2603a(this.f1737A, mVar)) {
                ImageView imageView = new ImageView(activity);
                this.f1755w = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f1755w.setClickable(true);
                this.f1755w.setOnClickListener(cVar);
                mo12828d(this.f1737A);
            } else {
                this.f1755w = null;
            }
            String B = eVar.mo13940B();
            if (StringUtils.isValidString(B)) {
                C1555u uVar = new C1555u(mVar);
                uVar.mo13021a(new WeakReference(this.f1743G));
                C1554t tVar = new C1554t(uVar, activity);
                this.f1756x = tVar;
                tVar.mo13020a(B);
            } else {
                this.f1756x = null;
            }
            if (this.f1745I) {
                C1423a aVar = new C1423a(activity, ((Integer) mVar.mo14311a(C1857b.f3177cB)).intValue(), 16842874);
                this.f1753u = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                this.f1753u.setBackgroundColor(Color.parseColor("#00000000"));
                this.f1753u.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            } else {
                this.f1753u = null;
            }
            if (eVar.mo13952O()) {
                ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
                this.f1757y = progressBar;
                progressBar.setMax(10000);
                this.f1757y.setPadding(0, 0, 0, 0);
                if (C2039g.m4885d()) {
                    this.f1757y.setProgressTintList(ColorStateList.valueOf(eVar.mo13953P()));
                }
                this.f1758z.mo12965a("PROGRESS_BAR", ((Long) mVar.mo14311a(C1857b.f3226cy)).longValue(), (C1527j.C1529a) new C1527j.C1529a() {
                    /* renamed from: a */
                    public void mo12815a() {
                        if (C1463e.this.f1740D) {
                            C1463e.this.f1757y.setVisibility(8);
                            return;
                        }
                        C1463e.this.f1757y.setProgress((int) ((((float) C1463e.this.f1752t.getCurrentPosition()) / ((float) C1463e.this.f1738B)) * 10000.0f));
                    }

                    /* renamed from: b */
                    public boolean mo12816b() {
                        return !C1463e.this.f1740D;
                    }
                });
            } else {
                this.f1757y = null;
            }
            this.f1752t = new SimpleExoPlayer.Builder(activity).build();
            C1474b bVar = new C1474b();
            this.f1752t.addListener((Player.EventListener) bVar);
            this.f1752t.setRepeatMode(0);
            PlayerView playerView = new PlayerView(activity);
            this.f1751s = playerView;
            playerView.hideController();
            this.f1751s.setControllerVisibilityListener(bVar);
            this.f1751s.setPlayer(this.f1752t);
            this.f1751s.setOnTouchListener(new AppLovinTouchToClickListener(mVar, C1857b.f3083aM, activity, bVar));
            mo12829z();
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* renamed from: E */
    private void m2601E() {
        C1554t tVar;
        C1553s C = this.f1680a.mo13941C();
        if (C != null && C.mo13011e() && !this.f1740D && (tVar = this.f1756x) != null) {
            final boolean z = tVar.getVisibility() == 4;
            final long f = C.mo13013f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    if (z) {
                        C2085q.m5018a((View) C1463e.this.f1756x, f, (Runnable) null);
                    } else {
                        C2085q.m5023b(C1463e.this.f1756x, f, (Runnable) null);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static boolean m2603a(boolean z, C1959m mVar) {
        if (!((Boolean) mVar.mo14311a(C1857b.f3218cq)).booleanValue()) {
            return false;
        }
        if (!((Boolean) mVar.mo14311a(C1857b.f3219cr)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) mVar.mo14311a(C1857b.f3221ct)).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo12824A() {
        if (this.f1748L.compareAndSet(false, true)) {
            mo12762a(this.f1754v, this.f1680a.mo14010q(), new Runnable() {
                public void run() {
                    long unused = C1463e.this.f1749M = -1;
                    long unused2 = C1463e.this.f1750N = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo12825B() {
        this.f1739C = mo12827D();
        this.f1752t.setPlayWhenReady(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo12826C() {
        if (this.f1740D) {
            if (C2092v.m5047a()) {
                this.f1682c.mo14792d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (!this.f1681b.mo14331ad().mo14802a()) {
            long j = this.f1746J;
            if (j >= 0) {
                if (C2092v.m5047a()) {
                    C2092v vVar = this.f1682c;
                    vVar.mo14789b("AppLovinFullscreenActivity", "Resuming video at position " + j + "ms for MediaPlayer: " + this.f1752t);
                }
                this.f1752t.setPlayWhenReady(true);
                this.f1758z.mo12964a();
                this.f1746J = -1;
                if (!this.f1752t.isPlaying()) {
                    mo12811v();
                }
            } else if (C2092v.m5047a()) {
                C2092v vVar2 = this.f1682c;
                vVar2.mo14789b("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.f1752t.isPlaying());
            }
        } else if (C2092v.m5047a()) {
            this.f1682c.mo14792d("AppLovinFullscreenActivity", "Skip video resume - app paused");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo12827D() {
        SimpleExoPlayer simpleExoPlayer = this.f1752t;
        if (simpleExoPlayer == null) {
            return 0;
        }
        long currentPosition = simpleExoPlayer.getCurrentPosition();
        if (this.f1741E) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f1738B)) * 100.0f) : this.f1739C;
    }

    /* renamed from: a */
    public void mo12802a() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    /* renamed from: a */
    public void mo12759a(long j) {
        mo12763a((Runnable) new Runnable() {
            public void run() {
                C1463e.this.mo12826C();
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12807a(PointF pointF) {
        if (this.f1680a.mo12608D()) {
            if (C2092v.m5047a()) {
                this.f1682c.mo14789b("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri k = this.f1680a.mo12636k();
            if (k != null) {
                this.f1681b.mo14369u().trackAndLaunchVideoClick(this.f1680a, k, pointF, this, this.f1685f != null ? this.f1685f.getContext() : this.f1681b.mo14297L());
                C2043j.m4940a(this.f1693n, (AppLovinAd) this.f1680a);
                this.f1683d.mo14104b();
                this.f1690k++;
                return;
            }
            return;
        }
        m2601E();
    }

    /* renamed from: a */
    public void mo12761a(ViewGroup viewGroup) {
        this.f1742F.mo12750a(this.f1755w, this.f1754v, this.f1756x, this.f1753u, this.f1757y, this.f1751s, this.f1685f, viewGroup);
        this.f1752t.setPlayWhenReady(true);
        if (this.f1680a.mo13993am()) {
            this.f1696q.mo14039a(this.f1680a, (Runnable) new Runnable() {
                public void run() {
                    C1463e.this.mo12759a(250);
                }
            });
        }
        if (this.f1745I) {
            mo12811v();
        }
        this.f1685f.renderAd(this.f1680a);
        this.f1683d.mo14105b(this.f1745I ? 1 : 0);
        if (this.f1754v != null) {
            this.f1681b.mo14303S().mo14208a(new C1934z(this.f1681b, new Runnable() {
                public void run() {
                    C1463e.this.mo12824A();
                }
            }), C1908o.C1910a.MAIN, this.f1680a.mo14011r(), true);
        }
        super.mo12770b(this.f1737A);
    }

    /* renamed from: b */
    public void mo12803b() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        mo12808c();
    }

    /* renamed from: c */
    public void mo12808c() {
        this.f1749M = SystemClock.elapsedRealtime() - this.f1750N;
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.f1749M + "ms");
        }
        this.f1683d.mo14111f();
        this.f1689j++;
        if (this.f1680a.mo14017x()) {
            mo12776h();
        } else {
            mo12814y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12809c(long j) {
        this.f1738B = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12810c(String str) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1682c;
            vVar.mo14793e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f1680a);
        }
        if (this.f1747K.compareAndSet(false, true)) {
            if (this.f1694o instanceof C1836g) {
                ((C1836g) this.f1694o).onAdDisplayFailed(str);
            }
            mo12776h();
        }
    }

    /* renamed from: c */
    public void mo12771c(boolean z) {
        super.mo12771c(z);
        if (z) {
            mo12759a(0);
        } else if (!this.f1740D) {
            mo12773e();
        }
    }

    /* renamed from: d */
    public void mo12772d() {
        mo12761a((ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo12828d(boolean z) {
        if (C2039g.m4885d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f1684e.getDrawable(z ? C2392R.C2393drawable.unmute_to_mute : C2392R.C2393drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f1755w.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f1755w.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z ? this.f1680a.mo13971aC() : this.f1680a.mo13972aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f1755w.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: e */
    public void mo12773e() {
        String str;
        C2092v vVar;
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.f1752t.isPlaying()) {
            this.f1746J = this.f1752t.getCurrentPosition();
            this.f1752t.setPlayWhenReady(false);
            this.f1758z.mo12967c();
            if (C2092v.m5047a()) {
                vVar = this.f1682c;
                str = "Paused video at position " + this.f1746J + "ms";
            } else {
                return;
            }
        } else if (C2092v.m5047a()) {
            vVar = this.f1682c;
            str = "Nothing to pause";
        } else {
            return;
        }
        vVar.mo14789b("AppLovinFullscreenActivity", str);
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    /* renamed from: h */
    public void mo12776h() {
        this.f1758z.mo12966b();
        this.f1744H.removeCallbacksAndMessages((Object) null);
        mo12781m();
        super.mo12776h();
    }

    /* renamed from: k */
    public void mo12779k() {
        this.f1752t.release();
        if (this.f1745I) {
            AppLovinCommunicator.getInstance(this.f1684e).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
        }
        super.mo12779k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo12781m() {
        super.mo12758a(mo12827D(), this.f1745I, mo12786r(), this.f1749M);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f1681b.mo14311a(C1857b.f3292eM)).booleanValue() && j == this.f1680a.getAdIdNumber() && this.f1745I) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i < 200 || i >= 300) && !this.f1741E && !this.f1752t.isPlaying()) {
                    mo12810c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo12786r() {
        return this.f1680a != null && mo12827D() >= this.f1680a.mo13954Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo12787s() {
        return mo12788t() && !mo12786r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo12789u() {
        long j;
        long millis;
        long j2 = 0;
        if (this.f1680a.mo13984ad() >= 0 || this.f1680a.mo13985ae() >= 0) {
            if (this.f1680a.mo13984ad() >= 0) {
                j = this.f1680a.mo13984ad();
            } else {
                C1824a aVar = (C1824a) this.f1680a;
                long j3 = this.f1738B;
                if (j3 > 0) {
                    j2 = 0 + j3;
                }
                if (aVar.mo13986af()) {
                    int l = (int) ((C1824a) this.f1680a).mo13919l();
                    if (l > 0) {
                        millis = TimeUnit.SECONDS.toMillis((long) l);
                    } else {
                        int s = (int) aVar.mo14012s();
                        if (s > 0) {
                            millis = TimeUnit.SECONDS.toMillis((long) s);
                        }
                    }
                    j2 += millis;
                }
                j = (long) (((double) j2) * (((double) this.f1680a.mo13985ae()) / 100.0d));
            }
            mo12768b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo12811v() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1463e.this.f1753u != null) {
                    C1463e.this.f1753u.mo12732a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo12812w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1463e.this.f1753u != null) {
                    C1463e.this.f1753u.mo12733b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo12813x() {
        boolean z = !this.f1737A;
        this.f1737A = z;
        this.f1752t.setVolume(z ^ true ? 1.0f : 0.0f);
        mo12828d(this.f1737A);
        mo12767a(this.f1737A, 0);
    }

    /* renamed from: y */
    public void mo12814y() {
        mo12825B();
        this.f1742F.mo12751a(this.f1686g, this.f1685f);
        mo12765a("javascript:al_onPoststitialShow(" + this.f1689j + "," + this.f1690k + ");", (long) this.f1680a.mo13956S());
        if (this.f1686g != null) {
            if (this.f1680a.mo14012s() >= 0) {
                mo12762a(this.f1686g, this.f1680a.mo14012s(), new Runnable() {
                    public void run() {
                        C1463e.this.f1688i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f1686g.setVisibility(0);
            }
        }
        this.f1740D = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo12829z() {
        mo12766a(!this.f1745I);
        ProgressiveMediaSource createMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSourceFactory((Context) this.f1684e, Util.getUserAgent(this.f1684e, "com.applovin.sdk"))).createMediaSource(MediaItem.fromUri(this.f1680a.mo12630h()));
        this.f1752t.setVolume(this.f1737A ^ true ? 1.0f : 0.0f);
        this.f1752t.setMediaSource(createMediaSource);
        this.f1752t.prepare();
        this.f1752t.setPlayWhenReady(false);
    }
}
