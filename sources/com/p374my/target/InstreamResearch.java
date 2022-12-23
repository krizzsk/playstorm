package com.p374my.target;

import android.content.Context;
import android.view.View;
import com.p374my.target.C9809l;
import com.p374my.target.common.BaseAd;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.InstreamResearch */
public class InstreamResearch extends BaseAd {
    private C9944s1 banner;
    private final Context context;
    private final int duration;
    private int lastPosition = -1;
    private InstreamResearchListener listener;
    private C10062z researchProgressTracker;
    private C9597a0 researchViewabilityTracker;
    private int state = 0;

    /* renamed from: com.my.target.InstreamResearch$InstreamResearchListener */
    public interface InstreamResearchListener {
        void onLoad(InstreamResearch instreamResearch);

        void onNoData(InstreamResearch instreamResearch, String str);
    }

    private InstreamResearch(int i, int i2, Context context2) {
        super(i, "instreamresearch");
        this.duration = i2;
        this.context = context2;
        C9672e0.m27884c("InstreamResearch created. Version: 5.15.0");
    }

    private String getReadableState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown" : "completed" : TJAdUnitConstants.String.VIDEO_PAUSED : "started" : "idle";
    }

    /* access modifiers changed from: private */
    public void handleResult(C9962t1 t1Var, String str) {
        if (t1Var != null) {
            C9944s1 c = t1Var.mo65445c();
            this.banner = c;
            if (c != null) {
                this.researchProgressTracker = C10062z.m29851a(c.getStatHolder());
                this.researchViewabilityTracker = C9597a0.m27569a(this.banner.getStatHolder());
                InstreamResearchListener instreamResearchListener = this.listener;
                if (instreamResearchListener != null) {
                    instreamResearchListener.onLoad(this);
                    return;
                }
                return;
            }
        }
        InstreamResearchListener instreamResearchListener2 = this.listener;
        if (instreamResearchListener2 != null) {
            instreamResearchListener2.onNoData(this, str);
        }
    }

    public static InstreamResearch newResearch(int i, int i2, Context context2) {
        return new InstreamResearch(i, i2, context2);
    }

    private void trackEvent(String str) {
        C9944s1 s1Var = this.banner;
        if (s1Var != null) {
            ArrayList<C9626b3> a = s1Var.getStatHolder().mo63675a(str);
            if (!a.isEmpty()) {
                C10039x8.m29720c((List<C9626b3>) a, this.context);
            }
        }
    }

    public void load() {
        C9809l.m28522a(this.adConfig, this.metricFactory, this.duration).mo63560a(new C9809l.C9811b() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                InstreamResearch.this.handleResult((C9962t1) q2Var, str);
            }
        }).mo63567b(this.metricFactory.mo64679a(), this.context);
    }

    public void registerPlayerView(View view) {
        C9597a0 a0Var = this.researchViewabilityTracker;
        if (a0Var != null) {
            a0Var.mo63406a(view);
        }
    }

    public void setListener(InstreamResearchListener instreamResearchListener) {
        this.listener = instreamResearchListener;
    }

    public void trackFullscreen(boolean z) {
        trackEvent(z ? "fullscreenOn" : "fullscreenOff");
    }

    public void trackMute(boolean z) {
        trackEvent(z ? "volumeOff" : "volumeOn");
    }

    public void trackPause() {
        if (this.state != 1) {
            C9672e0.m27883b("Unable to track pause, wrong state " + getReadableState(this.state));
            return;
        }
        trackEvent("playbackPaused");
        this.state = 2;
    }

    public void trackProgress(float f) {
        if (this.state < 1) {
            trackEvent("playbackStarted");
            this.state = 1;
        }
        if (this.state > 1) {
            C9672e0.m27882a("Unable to track progress while state is: " + getReadableState(this.state));
            return;
        }
        int round = Math.round(f);
        int i = this.lastPosition;
        if (round < i) {
            trackEvent("rewind");
        } else if (round == i) {
            return;
        }
        this.lastPosition = round;
        C9597a0 a0Var = this.researchViewabilityTracker;
        if (a0Var != null) {
            a0Var.mo63409b(round);
        }
        C10062z zVar = this.researchProgressTracker;
        if (zVar != null) {
            zVar.mo65781a(round, this.duration, this.context);
        }
    }

    public void trackResume() {
        if (this.state != 2) {
            C9672e0.m27883b("VideoAdTracker error: unable to track resume, wrong state " + getReadableState(this.state));
            return;
        }
        trackEvent("playbackResumed");
        this.state = 1;
    }

    public void unregisterPlayerView() {
        C9597a0 a0Var = this.researchViewabilityTracker;
        if (a0Var != null) {
            a0Var.mo63406a((View) null);
        }
    }
}
