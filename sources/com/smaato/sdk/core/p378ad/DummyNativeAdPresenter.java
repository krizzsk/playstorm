package com.smaato.sdk.core.p378ad;

import android.content.Context;
import com.smaato.sdk.core.p381ui.AdContentView;

/* renamed from: com.smaato.sdk.core.ad.DummyNativeAdPresenter */
public final class DummyNativeAdPresenter implements AdPresenter {
    private final RuntimeException shouldNotBeCalledException = new RuntimeException("Dummy Ad Presenter: Method should not be called");

    private DummyNativeAdPresenter() {
    }

    public AdContentView getAdContentView(Context context) {
        throw this.shouldNotBeCalledException;
    }

    public AdInteractor<? extends AdObject> getAdInteractor() {
        throw this.shouldNotBeCalledException;
    }

    public String getPublisherId() {
        throw this.shouldNotBeCalledException;
    }

    public String getAdSpaceId() {
        throw this.shouldNotBeCalledException;
    }

    public String getSessionId() {
        throw this.shouldNotBeCalledException;
    }

    public String getCreativeId() {
        throw this.shouldNotBeCalledException;
    }

    public boolean isValid() {
        throw this.shouldNotBeCalledException;
    }

    public void release() {
        throw this.shouldNotBeCalledException;
    }
}
