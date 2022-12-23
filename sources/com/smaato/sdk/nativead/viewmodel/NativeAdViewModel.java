package com.smaato.sdk.nativead.viewmodel;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.FormatType;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.network.SomaException;
import com.smaato.sdk.core.openmeasurement.ViewabilityTracker;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p382fi.BiConsumer;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.nativead.NativeAd;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.nativead.NativeAdError;
import com.smaato.sdk.nativead.NativeAdException;
import com.smaato.sdk.nativead.NativeAdLink;
import com.smaato.sdk.nativead.NativeAdRequest;
import com.smaato.sdk.nativead.NativeAdResponse;
import com.smaato.sdk.nativead.NativeAdTracker;
import com.smaato.sdk.nativead.repository.NativeAdRepository;
import com.smaato.sdk.nativead.view.NativeAdRendererImpl;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NativeAdViewModel {
    private static final Map<SomaException.Type, NativeAdError> ERROR_MAP;
    /* access modifiers changed from: private */
    @Inject
    public static NativeAdRepository nativeAdRepository;
    private boolean is100PercentVisible;
    private boolean is50PercentVisible;
    private boolean isImpressed;
    private NativeAd.Listener nativeAdListener;
    private NativeAdRequest nativeAdRequest;
    private NativeAdResponse nativeAdResponse;
    /* access modifiers changed from: private */
    public ViewabilityTracker omViewabilityTracker;

    static {
        HashMap hashMap = new HashMap();
        ERROR_MAP = hashMap;
        hashMap.put(SomaException.Type.NO_CONTENT, NativeAdError.NO_AD_AVAILABLE);
        hashMap.put(SomaException.Type.BAD_REQUEST, NativeAdError.INVALID_REQUEST);
        hashMap.put(SomaException.Type.BAD_RESPONSE, NativeAdError.INTERNAL_ERROR);
        hashMap.put(SomaException.Type.TIMEOUT_ERROR, NativeAdError.NETWORK_ERROR);
    }

    public NativeAdViewModel() {
        AndroidsInjector.injectStatic(NativeAdViewModel.class);
    }

    public void loadAd(Lifecycle lifecycle, NativeAdRequest nativeAdRequest2, NativeAd.Listener listener) {
        this.nativeAdRequest = nativeAdRequest2;
        this.nativeAdListener = listener;
        setLifecycleObserver(lifecycle);
        nativeAdRepository.loadAd(nativeAdRequest2, new Consumer() {
            public final void accept(Object obj) {
                NativeAdViewModel.this.onNativeAdLoaded((NativeAdResponse) obj);
            }
        }, new Consumer() {
            public final void accept(Object obj) {
                NativeAdViewModel.this.onLoadingError((Throwable) obj);
            }
        });
    }

    public void onRegisterForImpression(View view) {
        if (this.nativeAdResponse != null) {
            ViewabilityTracker oMViewabilityTracker = nativeAdRepository.getOMViewabilityTracker(view, isRichMediaAd(), getTrackerUrls(NativeAdTracker.Type.OPEN_MEASUREMENT));
            this.omViewabilityTracker = oMViewabilityTracker;
            nativeAdRepository.trackOMAdLoaded(oMViewabilityTracker);
            return;
        }
        throw NativeAdException.noAdLoaded;
    }

    public void onAdImpressed() {
        if (!this.isImpressed) {
            nativeAdRepository.trackOMImpression(this.omViewabilityTracker);
            nativeAdRepository.handleTrackerUrls(getTrackerUrls(NativeAdTracker.Type.IMPRESSION));
            this.isImpressed = true;
            this.nativeAdListener.onAdImpressed(new NativeAd(this.nativeAdRequest));
        }
    }

    public void onUpdateAdView(RichMediaWebView richMediaWebView) {
        nativeAdRepository.trackOMUpdateView(this.omViewabilityTracker, richMediaWebView);
    }

    public void onAdClicked() {
        NativeAdLink link = this.nativeAdResponse.link();
        nativeAdRepository.handleClickThroughUrl(link.url());
        nativeAdRepository.handleTrackerUrls(link.trackers());
        this.nativeAdListener.onAdClicked(new NativeAd(this.nativeAdRequest));
    }

    public BiConsumer<Uri, ImageView> getImageLoader() {
        return nativeAdRepository.getImageLoader();
    }

    public void launchPrivacyUrl() {
        nativeAdRepository.handleUncheckedIntentUrl(this.nativeAdResponse.privacyUrl());
    }

    public void on50PercentVisible() {
        if (!this.is50PercentVisible) {
            nativeAdRepository.handleTrackerUrls(getTrackerUrls(NativeAdTracker.Type.VIEWABLE_MRC_50));
            this.is50PercentVisible = true;
        }
    }

    public void on100PercentVisible() {
        if (!this.is100PercentVisible) {
            nativeAdRepository.handleTrackerUrls(getTrackerUrls(NativeAdTracker.Type.VIEWABLE_MRC_100));
            this.is100PercentVisible = true;
        }
    }

    /* access modifiers changed from: private */
    public void onNativeAdLoaded(NativeAdResponse nativeAdResponse2) {
        this.nativeAdResponse = nativeAdResponse2;
        this.nativeAdListener.onAdLoaded(new NativeAd(this.nativeAdRequest), new NativeAdRendererImpl(nativeAdResponse2.assets(), this, nativeAdResponse2.mraidWrappedVast(), this.nativeAdResponse.impressionCountingType(), getFormatFromResponse(nativeAdResponse2)));
        startTtlTimer();
    }

    private FormatType getFormatFromResponse(NativeAdResponse nativeAdResponse2) {
        if (nativeAdResponse2 == null) {
            return FormatType.IMAGE;
        }
        String mraidWrappedVast = nativeAdResponse2.mraidWrappedVast();
        String mraidJs = nativeAdResponse2.assets().mraidJs();
        List<NativeAdAssets.Image> images = nativeAdResponse2.assets().images();
        if (mraidWrappedVast != null && !mraidWrappedVast.isEmpty()) {
            return FormatType.VIDEO;
        }
        if (mraidJs != null && !mraidJs.isEmpty()) {
            return FormatType.RICHMEDIA;
        }
        if (!images.isEmpty()) {
            return FormatType.IMAGE;
        }
        return FormatType.IMAGE;
    }

    /* access modifiers changed from: private */
    public void onLoadingError(Throwable th) {
        NativeAdError nativeAdError = getNativeAdError(th);
        this.nativeAdListener.onAdFailedToLoad(new NativeAd(this.nativeAdRequest), nativeAdError);
    }

    private NativeAdError getNativeAdError(Throwable th) {
        nativeAdRepository.stopOMTracking(this.omViewabilityTracker);
        NativeAdError nativeAdError = th instanceof SomaException ? ERROR_MAP.get(((SomaException) th).getType()) : null;
        return nativeAdError == null ? NativeAdError.NO_AD_AVAILABLE : nativeAdError;
    }

    private void setLifecycleObserver(Lifecycle lifecycle) {
        lifecycle.addObserver(new Lifecycle.Observer() {
            public void onDestroy(Lifecycle lifecycle) {
                NativeAdViewModel.nativeAdRepository.stopOMTracking(NativeAdViewModel.this.omViewabilityTracker);
            }
        });
    }

    private List<String> getTrackerUrls(NativeAdTracker.Type type) {
        ArrayList arrayList = new ArrayList();
        for (NativeAdTracker next : this.nativeAdResponse.trackers()) {
            if (next.type() == type) {
                arrayList.add(next.url());
            }
        }
        return arrayList;
    }

    private boolean isRichMediaAd() {
        return this.nativeAdResponse.assets().mraidJs() != null;
    }

    private void startTtlTimer() {
        Long ttl = this.nativeAdResponse.ttl();
        if (ttl != null) {
            nativeAdRepository.startTimer(ttl.longValue(), new Runnable() {
                public final void run() {
                    NativeAdViewModel.this.lambda$startTtlTimer$0$NativeAdViewModel();
                }
            });
        }
    }

    public /* synthetic */ void lambda$startTtlTimer$0$NativeAdViewModel() {
        if (!this.isImpressed) {
            this.nativeAdListener.onTtlExpired(new NativeAd(this.nativeAdRequest));
        }
    }
}
