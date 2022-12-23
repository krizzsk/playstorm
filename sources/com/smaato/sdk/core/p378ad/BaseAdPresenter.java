package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.util.Threads;

/* renamed from: com.smaato.sdk.core.ad.BaseAdPresenter */
public abstract class BaseAdPresenter implements AdPresenter {
    private final AdInteractor<? extends AdObject> adInteractor;

    /* access modifiers changed from: protected */
    public abstract void onDestroy();

    public BaseAdPresenter(AdInteractor<? extends AdObject> adInteractor2) {
        this.adInteractor = adInteractor2;
    }

    public final AdInteractor<? extends AdObject> getAdInteractor() {
        return this.adInteractor;
    }

    public final String getPublisherId() {
        return this.adInteractor.getPublisherId();
    }

    public final String getAdSpaceId() {
        return this.adInteractor.getAdSpaceId();
    }

    public final String getSessionId() {
        return this.adInteractor.getSessionId();
    }

    public final String getCreativeId() {
        return this.adInteractor.getCreativeId();
    }

    public boolean isValid() {
        return this.adInteractor.isValid();
    }

    public final void release() {
        Threads.ensureMainThread();
        onDestroy();
    }
}
