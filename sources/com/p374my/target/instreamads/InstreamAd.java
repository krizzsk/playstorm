package com.p374my.target.instreamads;

import android.content.Context;
import com.p374my.target.C9672e0;
import com.p374my.target.C9689f;
import com.p374my.target.C9711g2;
import com.p374my.target.C9864n8;
import com.p374my.target.C9916q2;
import com.p374my.target.C9930r2;
import com.p374my.target.C9959t0;
import com.p374my.target.C9971t5;
import com.p374my.target.C9984u2;
import com.p374my.target.common.BaseAd;
import com.p374my.target.common.models.VideoData;
import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.instreamads.InstreamAd */
public final class InstreamAd extends BaseAd {
    private static final int DEFAULT_LOADING_TIMEOUT_SECONDS = 10;
    private static final int MIN_LOADING_TIMEOUT_SECONDS = 5;
    private final Context context;
    private C9959t0 engine;
    private boolean isFullscreen;
    private InstreamAdListener listener;
    private int loadingTimeoutSeconds = 10;
    private float[] midpoints;
    private InstreamAdPlayer player;
    private C9930r2 section;
    private float[] userMidpoints;
    private float videoDuration;
    private float volume = 1.0f;

    /* renamed from: com.my.target.instreamads.InstreamAd$InstreamAdBanner */
    public static final class InstreamAdBanner {
        public final boolean allowClose;
        public final float allowCloseDelay;
        public final boolean allowPause;
        public final String ctaText;
        public final float duration;

        /* renamed from: id */
        public final String f24092id;
        public final int videoHeight;
        public final int videoWidth;

        private InstreamAdBanner(String str, boolean z, float f, float f2, int i, int i2, String str2, boolean z2) {
            this.f24092id = str;
            this.allowClose = z;
            this.allowCloseDelay = f;
            this.duration = f2;
            this.videoHeight = i2;
            this.videoWidth = i;
            this.ctaText = str2;
            this.allowPause = z2;
        }

        public static InstreamAdBanner newBanner(C9711g2 g2Var) {
            return new InstreamAdBanner(g2Var.getId(), g2Var.isAllowClose(), g2Var.getAllowCloseDelay(), g2Var.getDuration(), g2Var.getWidth(), g2Var.getHeight(), g2Var.getCtaText(), g2Var.isAllowPause());
        }
    }

    /* renamed from: com.my.target.instreamads.InstreamAd$InstreamAdListener */
    public interface InstreamAdListener {
        void onBannerComplete(InstreamAd instreamAd, InstreamAdBanner instreamAdBanner);

        void onBannerPause(InstreamAd instreamAd, InstreamAdBanner instreamAdBanner);

        void onBannerResume(InstreamAd instreamAd, InstreamAdBanner instreamAdBanner);

        void onBannerStart(InstreamAd instreamAd, InstreamAdBanner instreamAdBanner);

        void onBannerTimeLeftChange(float f, float f2, InstreamAd instreamAd);

        void onComplete(String str, InstreamAd instreamAd);

        void onError(String str, InstreamAd instreamAd);

        void onLoad(InstreamAd instreamAd);

        void onNoAd(String str, InstreamAd instreamAd);
    }

    public InstreamAd(int i, Context context2) {
        super(i, "instreamads");
        this.context = context2;
        C9672e0.m27884c("InstreamAd created. Version: 5.15.0");
    }

    /* access modifiers changed from: private */
    public void handleResult(C9930r2 r2Var, String str) {
        if (this.listener != null) {
            if (r2Var == null || !r2Var.mo65323d()) {
                InstreamAdListener instreamAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                instreamAdListener.onNoAd(str, this);
                return;
            }
            this.section = r2Var;
            C9959t0 a = C9959t0.m29280a(this, r2Var, this.adConfig, this.metricFactory);
            this.engine = a;
            a.mo65420a(this.loadingTimeoutSeconds);
            this.engine.mo65419a(this.volume);
            InstreamAdPlayer instreamAdPlayer = this.player;
            if (instreamAdPlayer != null) {
                this.engine.mo65422a(instreamAdPlayer);
            }
            configureMidpoints(this.videoDuration, this.userMidpoints);
            this.listener.onLoad(this);
        }
    }

    private void start(String str) {
        C9959t0 t0Var = this.engine;
        if (t0Var == null) {
            C9672e0.m27882a("Unable to start ad: not loaded yet");
        } else if (t0Var.mo65432b() == null) {
            C9672e0.m27882a("Unable to start ad: player has not set");
        } else {
            this.engine.mo65428a(str);
        }
    }

    public void configureMidpoints(float f) {
        configureMidpoints(f, (float[]) null);
    }

    public void configureMidpoints(float f, float[] fArr) {
        C9984u2<VideoData> a;
        String str;
        if (f <= 0.0f) {
            str = "midpoints are not configured, duration is not set or <= zero";
        } else if (this.midpoints != null) {
            str = "midpoints already configured";
        } else {
            this.userMidpoints = fArr;
            this.videoDuration = f;
            C9930r2 r2Var = this.section;
            if (r2Var != null && (a = r2Var.mo65321a("midroll")) != null) {
                float[] a2 = C9864n8.m28846a(a, this.userMidpoints, f);
                this.midpoints = a2;
                C9959t0 t0Var = this.engine;
                if (t0Var != null) {
                    t0Var.mo65431a(a2);
                    return;
                }
                return;
            }
            return;
        }
        C9672e0.m27882a(str);
    }

    public void configureMidpointsPercents(float f, float[] fArr) {
        if (fArr == null) {
            configureMidpoints(f);
        } else {
            configureMidpoints(f, C9864n8.m28844a(f, fArr));
        }
    }

    public void destroy() {
        this.listener = null;
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65418a();
        }
    }

    public InstreamAdListener getListener() {
        return this.listener;
    }

    public int getLoadingTimeout() {
        return this.loadingTimeoutSeconds;
    }

    public float[] getMidPoints() {
        float[] fArr = this.midpoints;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    public InstreamAdPlayer getPlayer() {
        return this.player;
    }

    public int getVideoQuality() {
        return this.adConfig.getVideoQuality();
    }

    public List<String> getVideoSectionNames() {
        if (this.section == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<C9984u2<VideoData>> c = this.section.mo65322c();
        if (c.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        Iterator<C9984u2<VideoData>> it = c.iterator();
        while (it.hasNext()) {
            C9984u2 next = it.next();
            if (next.mo65292a() > 0 || next.mo65539i()) {
                arrayList.add(next.mo65538h());
            }
        }
        return arrayList;
    }

    public float getVolume() {
        C9959t0 t0Var = this.engine;
        return t0Var != null ? t0Var.mo65436c() : this.volume;
    }

    public void handleClick() {
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65437d();
        }
    }

    public boolean isFullscreen() {
        return this.isFullscreen;
    }

    public void load() {
        if (isLoadCalled()) {
            C9672e0.m27882a("InstreamAd doesn't support multiple load");
            return;
        }
        C9689f.m27967a(this.adConfig, this.metricFactory, this.loadingTimeoutSeconds).mo63560a(new C9689f.C9692c() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                InstreamAd.this.handleResult((C9930r2) q2Var, str);
            }
        }).mo63567b(this.metricFactory.mo64679a(), this.context);
    }

    public void pause() {
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65438e();
        }
    }

    public void resume() {
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65440g();
        }
    }

    public void setFullscreen(boolean z) {
        this.isFullscreen = z;
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65430a(z);
        }
    }

    public void setListener(InstreamAdListener instreamAdListener) {
        this.listener = instreamAdListener;
    }

    public void setLoadingTimeout(int i) {
        if (i < 5) {
            C9672e0.m27882a("unable to set ad loading timeout < 5, set to 5 seconds");
            this.loadingTimeoutSeconds = 5;
        } else {
            C9672e0.m27882a("ad loading timeout set to " + i + " seconds");
            this.loadingTimeoutSeconds = i;
        }
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65420a(this.loadingTimeoutSeconds);
        }
    }

    public void setPlayer(InstreamAdPlayer instreamAdPlayer) {
        this.player = instreamAdPlayer;
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65422a(instreamAdPlayer);
        }
    }

    public void setVideoQuality(int i) {
        this.adConfig.setVideoQuality(i);
    }

    public void setVolume(float f) {
        if (Float.compare(f, 0.0f) < 0 || Float.compare(f, 1.0f) > 0) {
            C9672e0.m27882a("unable to set volume" + f + ", volume must be in range [0..1]");
            return;
        }
        this.volume = f;
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65419a(f);
        }
    }

    public void skip() {
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65441h();
        }
    }

    public void skipBanner() {
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65442i();
        }
    }

    public void startMidroll(float f) {
        C9959t0 t0Var = this.engine;
        if (t0Var == null) {
            C9672e0.m27882a("Unable to start ad: not loaded yet");
        } else if (t0Var.mo65432b() == null) {
            C9672e0.m27882a("Unable to start ad: player has not set");
        } else {
            this.engine.mo65433b(f);
        }
    }

    public void startPauseroll() {
        start("pauseroll");
    }

    public void startPostroll() {
        start(Advertisement.KEY_POSTROLL);
    }

    public void startPreroll() {
        start("preroll");
    }

    public void stop() {
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65443j();
        }
    }

    public void swapPlayer(InstreamAdPlayer instreamAdPlayer) {
        this.player = instreamAdPlayer;
        C9959t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo65434b(instreamAdPlayer);
        }
    }

    public void useDefaultPlayer() {
        useDefaultPlayer(true);
    }

    public void useDefaultPlayer(boolean z) {
        C9971t5 t5Var = new C9971t5(this.context);
        t5Var.setUseExoPlayer(z);
        setPlayer(t5Var);
    }
}
