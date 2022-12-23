package com.applovin.impl.adview.activity.p027b;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
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
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.f */
public class C1476f extends C1440a implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    protected long f1773A;

    /* renamed from: B */
    protected boolean f1774B;

    /* renamed from: C */
    private final C1434c f1775C = new C1434c(this.f1680a, this.f1684e, this.f1681b);
    /* access modifiers changed from: private */

    /* renamed from: D */
    public MediaPlayer f1776D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C1489b f1777E = new C1489b();

    /* renamed from: F */
    private final C1488a f1778F = new C1488a();

    /* renamed from: G */
    private final Handler f1779G = new Handler(Looper.getMainLooper());

    /* renamed from: H */
    private final boolean f1780H = this.f1680a.mo12626f();

    /* renamed from: I */
    private int f1781I;

    /* renamed from: J */
    private int f1782J = -1;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f1783K;

    /* renamed from: L */
    private final AtomicBoolean f1784L = new AtomicBoolean();

    /* renamed from: M */
    private final AtomicBoolean f1785M = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public long f1786N = -2;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public long f1787O = 0;

    /* renamed from: s */
    protected final AppLovinVideoView f1788s;

    /* renamed from: t */
    protected final C1423a f1789t;

    /* renamed from: u */
    protected final C1540m f1790u;

    /* renamed from: v */
    protected final ImageView f1791v;

    /* renamed from: w */
    protected final C1554t f1792w;

    /* renamed from: x */
    protected final ProgressBar f1793x;

    /* renamed from: y */
    protected final C1527j f1794y = new C1527j(this.f1779G, this.f1681b);

    /* renamed from: z */
    protected boolean f1795z = Utils.isVideoMutedInitially(this.f1681b);

    /* renamed from: com.applovin.impl.adview.activity.b.f$a */
    private class C1488a implements C1555u.C1556a {
        private C1488a() {
        }

        /* renamed from: a */
        public void mo12838a(C1554t tVar) {
            if (C2092v.m5047a()) {
                C1476f.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            C1476f.this.mo12817a(tVar.getAndClearLastClickLocation());
        }

        /* renamed from: b */
        public void mo12839b(C1554t tVar) {
            if (C2092v.m5047a()) {
                C1476f.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            C1476f.this.mo12776h();
        }

        /* renamed from: c */
        public void mo12840c(C1554t tVar) {
            if (C2092v.m5047a()) {
                C1476f.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            C1476f.this.mo12808c();
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.f$b */
    private class C1489b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private C1489b() {
        }

        public void onClick(View view, PointF pointF) {
            C1476f.this.mo12817a(pointF);
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (C2092v.m5047a()) {
                C1476f.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Video completed");
            }
            boolean unused = C1476f.this.f1783K = true;
            C1476f.this.mo12823y();
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C1476f fVar = C1476f.this;
            fVar.mo12819c("Video view error (" + i + "," + i2 + ")");
            C1476f.this.f1788s.start();
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (C2092v.m5047a()) {
                C2092v vVar = C1476f.this.f1682c;
                vVar.mo14789b("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                C1476f.this.mo12820v();
                C1476f.this.f1683d.mo14112g();
                return false;
            } else if (i == 3) {
                C1476f.this.f1794y.mo12964a();
                if (C1476f.this.f1790u != null) {
                    C1476f.this.m2637A();
                }
                C1476f.this.mo12821w();
                if (!C1476f.this.f1696q.mo14042c()) {
                    return false;
                }
                C1476f.this.mo12773e();
                return false;
            } else if (i != 702) {
                return false;
            } else {
                C1476f.this.mo12821w();
                return false;
            }
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer unused = C1476f.this.f1776D = mediaPlayer;
            mediaPlayer.setOnInfoListener(C1476f.this.f1777E);
            mediaPlayer.setOnErrorListener(C1476f.this.f1777E);
            float f = C1476f.this.f1795z ^ true ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            C1476f.this.mo12818c((long) mediaPlayer.getDuration());
            C1476f.this.mo12789u();
            if (C2092v.m5047a()) {
                C2092v vVar = C1476f.this.f1682c;
                vVar.mo14789b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C1476f.this.f1776D);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.f$c */
    private class C1490c implements View.OnClickListener {
        private C1490c() {
        }

        public void onClick(View view) {
            if (view == C1476f.this.f1790u) {
                if (C1476f.this.mo12787s()) {
                    C1476f.this.mo12773e();
                    C1476f.this.mo12784p();
                    C1476f.this.f1696q.mo14041b();
                    return;
                }
                C1476f.this.mo12808c();
            } else if (view == C1476f.this.f1791v) {
                C1476f.this.mo12822x();
            } else if (C2092v.m5047a()) {
                C2092v vVar = C1476f.this.f1682c;
                vVar.mo14793e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C1476f(C1829e eVar, Activity activity, C1959m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        if (eVar.hasVideoUrl()) {
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.f1788s = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(this.f1777E);
            this.f1788s.setOnCompletionListener(this.f1777E);
            this.f1788s.setOnErrorListener(this.f1777E);
            this.f1788s.setOnTouchListener(new AppLovinTouchToClickListener(mVar, C1857b.f3083aM, activity, this.f1777E));
            C1490c cVar = new C1490c();
            if (eVar.mo14010q() >= 0) {
                C1540m mVar2 = new C1540m(eVar.mo14016w(), activity);
                this.f1790u = mVar2;
                mVar2.setVisibility(8);
                this.f1790u.setOnClickListener(cVar);
            } else {
                this.f1790u = null;
            }
            if (m2644a(this.f1795z, mVar)) {
                ImageView imageView = new ImageView(activity);
                this.f1791v = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f1791v.setClickable(true);
                this.f1791v.setOnClickListener(cVar);
                m2650e(this.f1795z);
            } else {
                this.f1791v = null;
            }
            String B = eVar.mo13940B();
            if (StringUtils.isValidString(B)) {
                C1555u uVar = new C1555u(mVar);
                uVar.mo13021a(new WeakReference(this.f1778F));
                C1554t tVar = new C1554t(uVar, activity);
                this.f1792w = tVar;
                tVar.mo13020a(B);
            } else {
                this.f1792w = null;
            }
            if (this.f1780H) {
                C1423a aVar = new C1423a(activity, ((Integer) mVar.mo14311a(C1857b.f3177cB)).intValue(), 16842874);
                this.f1789t = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                this.f1789t.setBackgroundColor(Color.parseColor("#00000000"));
                this.f1789t.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            } else {
                this.f1789t = null;
            }
            if (eVar.mo13952O()) {
                ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
                this.f1793x = progressBar;
                progressBar.setMax(10000);
                this.f1793x.setPadding(0, 0, 0, 0);
                if (C2039g.m4885d()) {
                    this.f1793x.setProgressTintList(ColorStateList.valueOf(eVar.mo13953P()));
                }
                this.f1794y.mo12965a("PROGRESS_BAR", ((Long) mVar.mo14311a(C1857b.f3226cy)).longValue(), (C1527j.C1529a) new C1527j.C1529a() {
                    /* renamed from: a */
                    public void mo12815a() {
                        if (C1476f.this.f1774B) {
                            C1476f.this.f1793x.setVisibility(8);
                            return;
                        }
                        C1476f.this.f1793x.setProgress((int) ((((float) C1476f.this.f1788s.getCurrentPosition()) / ((float) C1476f.this.f1773A)) * 10000.0f));
                    }

                    /* renamed from: b */
                    public boolean mo12816b() {
                        return !C1476f.this.f1774B;
                    }
                });
                return;
            }
            this.f1793x = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m2637A() {
        if (this.f1785M.compareAndSet(false, true)) {
            mo12762a(this.f1790u, this.f1680a.mo14010q(), new Runnable() {
                public void run() {
                    long unused = C1476f.this.f1786N = -1;
                    long unused2 = C1476f.this.f1787O = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* renamed from: B */
    private void m2638B() {
        C1554t tVar;
        C1553s C = this.f1680a.mo13941C();
        if (C != null && C.mo13011e() && !this.f1774B && (tVar = this.f1792w) != null) {
            final boolean z = tVar.getVisibility() == 4;
            final long f = C.mo13013f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    if (z) {
                        C2085q.m5018a((View) C1476f.this.f1792w, f, (Runnable) null);
                    } else {
                        C2085q.m5023b(C1476f.this.f1792w, f, (Runnable) null);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m2639C() {
        if (this.f1774B) {
            if (C2092v.m5047a()) {
                this.f1682c.mo14792d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f1681b.mo14331ad().mo14802a()) {
            if (C2092v.m5047a()) {
                this.f1682c.mo14792d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else if (this.f1782J >= 0) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1682c;
                vVar.mo14789b("AppLovinFullscreenActivity", "Resuming video at position " + this.f1782J + "ms for MediaPlayer: " + this.f1776D);
            }
            this.f1788s.seekTo(this.f1782J);
            this.f1788s.start();
            this.f1794y.mo12964a();
            this.f1782J = -1;
            mo12763a((Runnable) new Runnable() {
                public void run() {
                    if (C1476f.this.f1789t != null) {
                        C1476f.this.f1789t.mo12732a();
                        C1476f.this.mo12763a((Runnable) new Runnable() {
                            public void run() {
                                C1476f.this.f1789t.mo12733b();
                            }
                        }, 2000);
                    }
                }
            }, 250);
        } else if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Invalid last video position");
        }
    }

    /* renamed from: a */
    private static boolean m2644a(boolean z, C1959m mVar) {
        if (!((Boolean) mVar.mo14311a(C1857b.f3218cq)).booleanValue()) {
            return false;
        }
        if (!((Boolean) mVar.mo14311a(C1857b.f3219cr)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) mVar.mo14311a(C1857b.f3221ct)).booleanValue();
    }

    /* renamed from: d */
    private void m2649d(boolean z) {
        this.f1781I = mo12845z();
        if (z) {
            this.f1788s.pause();
        } else {
            this.f1788s.stopPlayback();
        }
    }

    /* renamed from: e */
    private void m2650e(boolean z) {
        if (C2039g.m4885d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f1684e.getDrawable(z ? C2392R.C2393drawable.unmute_to_mute : C2392R.C2393drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f1791v.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f1791v.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z ? this.f1680a.mo13971aC() : this.f1680a.mo13972aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f1791v.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
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
                C1476f.this.m2639C();
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12817a(PointF pointF) {
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
        m2638B();
    }

    /* renamed from: a */
    public void mo12761a(ViewGroup viewGroup) {
        String str;
        this.f1775C.mo12750a(this.f1791v, this.f1790u, this.f1792w, this.f1789t, this.f1793x, this.f1788s, this.f1685f, viewGroup);
        if (C2039g.m4888g() && (str = this.f1681b.mo14363p().getExtraParameters().get("audio_focus_request")) != null) {
            this.f1788s.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        mo12766a(!this.f1780H);
        this.f1788s.setVideoURI(this.f1680a.mo12630h());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f1680a.mo13993am()) {
            this.f1696q.mo14039a(this.f1680a, (Runnable) new Runnable() {
                public void run() {
                    C1476f.this.mo12759a(250);
                }
            });
        }
        this.f1788s.start();
        if (this.f1780H) {
            mo12820v();
        }
        this.f1685f.renderAd(this.f1680a);
        this.f1683d.mo14105b(this.f1780H ? 1 : 0);
        if (this.f1790u != null) {
            this.f1681b.mo14303S().mo14208a(new C1934z(this.f1681b, new Runnable() {
                public void run() {
                    C1476f.this.m2637A();
                }
            }), C1908o.C1910a.MAIN, this.f1680a.mo14011r(), true);
        }
        super.mo12770b(this.f1795z);
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
        this.f1786N = SystemClock.elapsedRealtime() - this.f1787O;
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.f1786N + "ms");
        }
        this.f1683d.mo14111f();
        this.f1689j++;
        if (this.f1680a.mo14017x()) {
            mo12776h();
        } else {
            mo12823y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12818c(long j) {
        this.f1773A = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12819c(String str) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1682c;
            vVar.mo14793e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f1680a);
        }
        if (this.f1784L.compareAndSet(false, true)) {
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
        } else if (!this.f1774B) {
            mo12773e();
        }
    }

    /* renamed from: d */
    public void mo12772d() {
        mo12761a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo12773e() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f1782J = this.f1788s.getCurrentPosition();
        this.f1788s.pause();
        this.f1794y.mo12967c();
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1682c;
            vVar.mo14789b("AppLovinFullscreenActivity", "Paused video at position " + this.f1782J + "ms");
        }
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    /* renamed from: h */
    public void mo12776h() {
        this.f1794y.mo12966b();
        this.f1779G.removeCallbacksAndMessages((Object) null);
        mo12781m();
        super.mo12776h();
    }

    /* renamed from: k */
    public void mo12779k() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14791c("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.f1780H) {
                AppLovinCommunicator.getInstance(this.f1684e).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            }
            if (this.f1788s != null) {
                this.f1788s.pause();
                this.f1788s.stopPlayback();
            }
            if (this.f1776D != null) {
                this.f1776D.release();
            }
        } catch (Throwable th) {
            Log.e("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.mo12779k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo12781m() {
        super.mo12758a(mo12845z(), this.f1780H, mo12786r(), this.f1786N);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f1681b.mo14311a(C1857b.f3292eM)).booleanValue() && j == this.f1680a.getAdIdNumber() && this.f1780H) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i < 200 || i >= 300) && !this.f1783K && !this.f1788s.isPlaying()) {
                    mo12819c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo12786r() {
        return mo12845z() >= this.f1680a.mo13954Q();
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
                long j3 = this.f1773A;
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
    public void mo12820v() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1476f.this.f1789t != null) {
                    C1476f.this.f1789t.mo12732a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo12821w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1476f.this.f1789t != null) {
                    C1476f.this.f1789t.mo12733b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo12822x() {
        if (this.f1776D != null) {
            try {
                boolean z = false;
                float f = (float) (!this.f1795z ? 0 : 1);
                this.f1776D.setVolume(f, f);
                if (!this.f1795z) {
                    z = true;
                }
                this.f1795z = z;
                m2650e(z);
                mo12767a(this.f1795z, 0);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: y */
    public void mo12823y() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Showing postitial...");
        }
        m2649d(this.f1680a.mo13978aJ());
        this.f1775C.mo12751a(this.f1686g, this.f1685f);
        mo12765a("javascript:al_onPoststitialShow(" + this.f1689j + "," + this.f1690k + ");", (long) this.f1680a.mo13956S());
        if (this.f1686g != null) {
            if (this.f1680a.mo14012s() >= 0) {
                mo12762a(this.f1686g, this.f1680a.mo14012s(), new Runnable() {
                    public void run() {
                        C1476f.this.f1688i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f1686g.setVisibility(0);
            }
        }
        this.f1774B = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo12845z() {
        long currentPosition = (long) this.f1788s.getCurrentPosition();
        if (this.f1783K) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f1773A)) * 100.0f) : this.f1781I;
    }
}
