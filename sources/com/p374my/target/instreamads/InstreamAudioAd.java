package com.p374my.target.instreamads;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.target.C9600a2;
import com.p374my.target.C9672e0;
import com.p374my.target.C9711g2;
import com.p374my.target.C9741i;
import com.p374my.target.C9864n8;
import com.p374my.target.C9916q2;
import com.p374my.target.C9945s2;
import com.p374my.target.C9980u0;
import com.p374my.target.C9984u2;
import com.p374my.target.common.BaseAd;
import com.p374my.target.common.models.AudioData;
import com.p374my.target.common.models.ShareButtonData;
import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.instreamads.InstreamAudioAd */
public final class InstreamAudioAd extends BaseAd {
    private static final int DEFAULT_LOADING_TIMEOUT_SECONDS = 10;
    private static final int MIN_LOADING_TIMEOUT_SECONDS = 5;
    private float audioDuration;
    private final Context context;
    private C9980u0 engine;
    private InstreamAudioAdListener listener;
    private int loadingTimeoutSeconds = 10;
    private float[] midpoints;
    private InstreamAudioAdPlayer player;
    private C9945s2 section;
    private float[] userMidpoints;
    private float volume = 1.0f;

    /* renamed from: com.my.target.instreamads.InstreamAudioAd$InstreamAdCompanionBanner */
    public static final class InstreamAdCompanionBanner {
        public final String adSlotID;
        public final String apiFramework;
        public final int assetHeight;
        public final int assetWidth;
        public final int expandedHeight;
        public final int expandedWidth;
        public final int height;
        public final String htmlResource;
        public final String iframeResource;
        public final boolean isClickable;
        public final String required;
        public final String staticResource;
        public final int width;

        private InstreamAdCompanionBanner(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
            this.width = i;
            this.height = i2;
            this.assetWidth = i3;
            this.assetHeight = i4;
            this.expandedWidth = i5;
            this.expandedHeight = i6;
            this.isClickable = z;
            this.staticResource = str;
            this.iframeResource = str2;
            this.htmlResource = str3;
            this.apiFramework = str4;
            this.adSlotID = str5;
            this.required = str6;
        }

        public static InstreamAdCompanionBanner newBanner(C9600a2 a2Var) {
            return new InstreamAdCompanionBanner(a2Var.getWidth(), a2Var.getHeight(), a2Var.getAssetWidth(), a2Var.getAssetHeight(), a2Var.getExpandedWidth(), a2Var.getExpandedHeight(), !TextUtils.isEmpty(a2Var.getTrackingLink()), a2Var.getStaticResource(), a2Var.getIframeResource(), a2Var.getHtmlResource(), a2Var.getApiFramework(), a2Var.getAdSlotID(), a2Var.getRequired());
        }
    }

    /* renamed from: com.my.target.instreamads.InstreamAudioAd$InstreamAudioAdBanner */
    public static final class InstreamAudioAdBanner {
        public final String adText;
        public final boolean allowPause;
        public final boolean allowSeek;
        public final boolean allowSkip;
        public final boolean allowTrackChange;
        public final List<InstreamAdCompanionBanner> companionBanners;
        public final float duration;
        public final ArrayList<ShareButtonData> shareButtonDatas;

        private InstreamAudioAdBanner(boolean z, boolean z2, boolean z3, float f, String str, boolean z4, ArrayList<ShareButtonData> arrayList, List<InstreamAdCompanionBanner> list) {
            this.allowSeek = z;
            this.allowSkip = z2;
            this.allowPause = z4;
            this.allowTrackChange = z3;
            this.duration = f;
            this.adText = str;
            this.shareButtonDatas = arrayList;
            this.companionBanners = list;
        }

        public static InstreamAudioAdBanner newBanner(C9711g2<AudioData> g2Var) {
            ArrayList arrayList = new ArrayList();
            Iterator<C9600a2> it = g2Var.getCompanionBanners().iterator();
            while (it.hasNext()) {
                arrayList.add(InstreamAdCompanionBanner.newBanner(it.next()));
            }
            return new InstreamAudioAdBanner(g2Var.isAllowSeek(), g2Var.isAllowSkip(), g2Var.isAllowTrackChange(), g2Var.getDuration(), g2Var.getAdText(), g2Var.isAllowPause(), g2Var.getShareButtonDatas(), arrayList);
        }
    }

    /* renamed from: com.my.target.instreamads.InstreamAudioAd$InstreamAudioAdListener */
    public interface InstreamAudioAdListener {
        void onBannerComplete(InstreamAudioAd instreamAudioAd, InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerStart(InstreamAudioAd instreamAudioAd, InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerTimeLeftChange(float f, float f2, InstreamAudioAd instreamAudioAd);

        void onComplete(String str, InstreamAudioAd instreamAudioAd);

        void onError(String str, InstreamAudioAd instreamAudioAd);

        void onLoad(InstreamAudioAd instreamAudioAd);

        void onNoAd(String str, InstreamAudioAd instreamAudioAd);
    }

    public InstreamAudioAd(int i, Context context2) {
        super(i, "instreamaudioads");
        this.context = context2;
        C9672e0.m27884c("InstreamAudioAd created. Version: 5.15.0");
    }

    /* access modifiers changed from: private */
    public void handleResult(C9945s2 s2Var, String str) {
        if (this.listener != null) {
            if (s2Var == null || !s2Var.mo65357d()) {
                InstreamAudioAdListener instreamAudioAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                instreamAudioAdListener.onNoAd(str, this);
                return;
            }
            this.section = s2Var;
            C9980u0 a = C9980u0.m29401a(this, s2Var, this.adConfig, this.metricFactory);
            this.engine = a;
            a.mo65496a(this.loadingTimeoutSeconds);
            this.engine.mo65495a(this.volume);
            InstreamAudioAdPlayer instreamAudioAdPlayer = this.player;
            if (instreamAudioAdPlayer != null) {
                this.engine.mo65499a(instreamAudioAdPlayer);
            }
            configureMidpoints(this.audioDuration, this.userMidpoints);
            this.listener.onLoad(this);
        }
    }

    private void start(String str) {
        C9980u0 u0Var = this.engine;
        if (u0Var == null) {
            C9672e0.m27882a("Unable to start ad: not loaded yet");
        } else if (u0Var.mo65512c() == null) {
            C9672e0.m27882a("Unable to start ad: player has not set");
        } else {
            this.engine.mo65505a(str);
        }
    }

    public void configureMidpoints(float f) {
        configureMidpoints(f, (float[]) null);
    }

    public void configureMidpoints(float f, float[] fArr) {
        C9984u2<AudioData> a;
        String str;
        if (f <= 0.0f) {
            str = "midpoints are not configured, duration is not set or <= zero";
        } else if (this.midpoints != null) {
            str = "midpoints already configured";
        } else {
            this.userMidpoints = fArr;
            this.audioDuration = f;
            C9945s2 s2Var = this.section;
            if (s2Var != null && (a = s2Var.mo65355a("midroll")) != null) {
                float[] a2 = C9864n8.m28846a(a, this.userMidpoints, f);
                this.midpoints = a2;
                C9980u0 u0Var = this.engine;
                if (u0Var != null) {
                    u0Var.mo65507a(a2);
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
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65494a();
        }
    }

    public InstreamAudioAdBanner getCurrentBanner() {
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            return u0Var.mo65508b();
        }
        return null;
    }

    public InstreamAudioAdListener getListener() {
        return this.listener;
    }

    public int getLoadingTimeout() {
        return this.loadingTimeoutSeconds;
    }

    public float[] getMidPoints() {
        float[] fArr = this.midpoints;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    public InstreamAudioAdPlayer getPlayer() {
        return this.player;
    }

    public float getVolume() {
        C9980u0 u0Var = this.engine;
        return u0Var != null ? u0Var.mo65514d() : this.volume;
    }

    public void handleCompanionClick(InstreamAdCompanionBanner instreamAdCompanionBanner) {
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65510b(instreamAdCompanionBanner);
        }
    }

    public void handleCompanionClick(InstreamAdCompanionBanner instreamAdCompanionBanner, Context context2) {
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65498a(instreamAdCompanionBanner, context2);
        }
    }

    public void handleCompanionShow(InstreamAdCompanionBanner instreamAdCompanionBanner) {
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65513c(instreamAdCompanionBanner);
        }
    }

    public void load() {
        if (isLoadCalled()) {
            C9672e0.m27882a("InstreamAudioAd doesn't support multiple load");
            return;
        }
        C9741i.m28170a(this.adConfig, this.metricFactory, this.loadingTimeoutSeconds).mo63560a(new C9741i.C9744c() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                InstreamAudioAd.this.handleResult((C9945s2) q2Var, str);
            }
        }).mo63567b(this.metricFactory.mo64679a(), this.context);
    }

    public void pause() {
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65515e();
        }
    }

    public void resume() {
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65517g();
        }
    }

    public void setListener(InstreamAudioAdListener instreamAudioAdListener) {
        this.listener = instreamAudioAdListener;
    }

    public void setLoadingTimeout(int i) {
        if (i < 5) {
            C9672e0.m27882a("unable to set ad loading timeout < 5, set to 5 seconds");
            this.loadingTimeoutSeconds = 5;
        } else {
            C9672e0.m27882a("ad loading timeout set to " + i + " seconds");
            this.loadingTimeoutSeconds = i;
        }
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65496a(this.loadingTimeoutSeconds);
        }
    }

    public void setPlayer(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        this.player = instreamAudioAdPlayer;
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65499a(instreamAudioAdPlayer);
        }
    }

    public void setVolume(float f) {
        if (Float.compare(f, 0.0f) < 0 || Float.compare(f, 1.0f) > 0) {
            C9672e0.m27882a("unable to set volume" + f + ", volume must be in range [0..1]");
            return;
        }
        this.volume = f;
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65495a(f);
        }
    }

    public void skip() {
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65518h();
        }
    }

    public void skipBanner() {
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65519i();
        }
    }

    public void startMidroll(float f) {
        C9980u0 u0Var = this.engine;
        if (u0Var == null) {
            C9672e0.m27882a("Unable to start ad: not loaded yet");
        } else if (u0Var.mo65512c() == null) {
            C9672e0.m27882a("Unable to start ad: player has not set");
        } else {
            this.engine.mo65509b(f);
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
        C9980u0 u0Var = this.engine;
        if (u0Var != null) {
            u0Var.mo65520j();
        }
    }
}
