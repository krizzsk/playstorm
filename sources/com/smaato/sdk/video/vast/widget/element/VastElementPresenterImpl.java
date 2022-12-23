package com.smaato.sdk.video.vast.widget.element;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTracker;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.tracker.VisibilityTrackerListener;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.browser.VastWebComponentSecurityPolicy;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;
import java.lang.ref.WeakReference;

public class VastElementPresenterImpl implements VastElementPresenter {
    private final VastElementErrorCodeStrategy errorCodeStrategy;
    private ImpressionCountingType impressionCountingType;
    private VastElementPresenter.Listener listener;
    private final Logger logger;
    private final VastElementPresentationManager presentationManager;
    private final VastWebComponentSecurityPolicy securityPolicy;
    private VisibilityTracker visibilityTracker;
    private final VisibilityTrackerCreator visibilityTrackerCreator;
    private WeakReference<VastElementView> weakView = new WeakReference<>((Object) null);

    public void onContentStartedToLoad() {
    }

    public VastElementPresenterImpl(Logger logger2, VastElementPresentationManager vastElementPresentationManager, VastWebComponentSecurityPolicy vastWebComponentSecurityPolicy, VisibilityTrackerCreator visibilityTrackerCreator2, VastElementErrorCodeStrategy vastElementErrorCodeStrategy, ImpressionCountingType impressionCountingType2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.presentationManager = (VastElementPresentationManager) Objects.requireNonNull(vastElementPresentationManager);
        this.securityPolicy = (VastWebComponentSecurityPolicy) Objects.requireNonNull(vastWebComponentSecurityPolicy);
        this.visibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator2);
        this.errorCodeStrategy = (VastElementErrorCodeStrategy) Objects.requireNonNull(vastElementErrorCodeStrategy);
        this.impressionCountingType = impressionCountingType2;
    }

    public boolean isValidUrl(String str) {
        if (this.securityPolicy.validateUrl(str)) {
            return true;
        }
        onError(new SecurityViolationException());
        return false;
    }

    public void onContentLoaded() {
        Objects.onNotNull((VastElementView) this.weakView.get(), new Consumer() {
            public final void accept(Object obj) {
                VastElementPresenterImpl.this.lambda$onContentLoaded$1$VastElementPresenterImpl((VastElementView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onContentLoaded$1$VastElementPresenterImpl(VastElementView vastElementView) {
        this.visibilityTracker = this.visibilityTrackerCreator.createTracker(vastElementView, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                VastElementPresenterImpl.this.lambda$onContentLoaded$0$VastElementPresenterImpl();
            }
        }, this.impressionCountingType);
    }

    public /* synthetic */ void lambda$onContentLoaded$0$VastElementPresenterImpl() {
        Objects.onNotNull(this.listener, $$Lambda$ZYG3zl19ehiXJxD0lLZ5rSa7jbI.INSTANCE);
    }

    public void onConfigurationChanged() {
        Objects.onNotNull((VastElementView) this.weakView.get(), new Consumer() {
            public final void accept(Object obj) {
                VastElementPresenterImpl.this.lambda$onConfigurationChanged$2$VastElementPresenterImpl((VastElementView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onConfigurationChanged$2$VastElementPresenterImpl(VastElementView vastElementView) {
        this.presentationManager.prepare(vastElementView, new Consumer() {
            public final void accept(Object obj) {
                VastElementPresenterImpl.this.onError((VastElementException) obj);
            }
        });
    }

    public void attachView(VastElementView vastElementView) {
        this.weakView = new WeakReference<>(vastElementView);
        this.presentationManager.prepare(vastElementView, new Consumer() {
            public final void accept(Object obj) {
                VastElementPresenterImpl.this.onError((VastElementException) obj);
            }
        });
    }

    public void detachView() {
        this.weakView.clear();
        Objects.onNotNull(this.visibilityTracker, $$Lambda$VastElementPresenterImpl$180cT8NvrkJZ64YGAeZod3HsJqI.INSTANCE);
    }

    public void onClicked(String str) {
        Objects.onNotNull(this.listener, new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((VastElementPresenter.Listener) obj).onVastElementClicked(this.f$0);
            }
        });
    }

    public void onError(VastElementException vastElementException) {
        this.logger.debug(LogDomain.VAST, String.format("VastElement error: %s", new Object[]{vastElementException.toString()}), new Object[0]);
        Objects.onNotNull(this.listener, new Consumer(vastElementException) {
            public final /* synthetic */ VastElementException f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                VastElementPresenterImpl.this.lambda$onError$4$VastElementPresenterImpl(this.f$1, (VastElementPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onError$4$VastElementPresenterImpl(VastElementException vastElementException, VastElementPresenter.Listener listener2) {
        listener2.onVastElementError(this.errorCodeStrategy.getVastErrorCode(vastElementException));
    }

    /* access modifiers changed from: protected */
    public VastElementView getView() {
        return (VastElementView) this.weakView.get();
    }

    public void setListener(VastElementPresenter.Listener listener2) {
        this.listener = listener2;
    }

    public void onRenderProcessGone() {
        Objects.onNotNull(this.listener, $$Lambda$k_4PMag9ZoV_6iAJ3PP2g68so.INSTANCE);
    }
}
