package com.smaato.sdk.video.vast.widget.element;

import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;

public class NoOpVastElementPresenter implements VastElementPresenter {
    public void attachView(VastElementView vastElementView) {
    }

    public void detachView() {
    }

    public boolean isValidUrl(String str) {
        return false;
    }

    public void onClicked(String str) {
    }

    public void onConfigurationChanged() {
    }

    public void onContentLoaded() {
    }

    public void onContentStartedToLoad() {
    }

    public void onError(VastElementException vastElementException) {
    }

    public void onRenderProcessGone() {
    }

    public void setListener(VastElementPresenter.Listener listener) {
    }
}
