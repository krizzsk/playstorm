package com.smaato.sdk.banner.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.smaato.sdk.banner.p377ad.AutoReloadInterval;
import com.smaato.sdk.banner.p377ad.BannerAdSize;
import com.smaato.sdk.banner.widget.BannerView;
import com.smaato.sdk.banner.widget.BannerViewLoader;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.KeyValuePairs;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.Map;

public class BannerView extends FrameLayout {
    private static final String LOG_TAG = BannerView.class.getSimpleName();
    @Inject
    protected BannerViewLoader bannerViewLoader;
    private EventListener eventListener;
    @Inject
    private Logger logger;
    private String mediationAdapterVersion;
    private String mediationNetworkName;
    private String mediationNetworkSDKVersion;
    private final Handler uiHandler = Threads.newUiHandler();

    public interface EventListener {
        void onAdClicked(BannerView bannerView);

        void onAdFailedToLoad(BannerView bannerView, BannerError bannerError);

        void onAdImpression(BannerView bannerView);

        void onAdLoaded(BannerView bannerView);

        void onAdTTLExpired(BannerView bannerView);
    }

    public BannerView(Context context) {
        super(context);
        init();
    }

    public BannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public BannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    private void init() {
        AndroidsInjector.inject((View) this);
        BannerViewLoader bannerViewLoader2 = this.bannerViewLoader;
        if (bannerViewLoader2 == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized.");
        } else {
            bannerViewLoader2.setView(this);
        }
        if (!SmaatoSdk.isGPSEnabled()) {
            Log.w(LOG_TAG, "Usage of the GPS coordinates for advertising purposes is disabled. You can change that by setting setGPSLocation to TRUE.");
        }
    }

    public void setEventListener(EventListener eventListener2) {
        this.eventListener = eventListener2;
    }

    public String getSessionId() {
        if (isViewInitializedProperly()) {
            return this.bannerViewLoader.getSessionId();
        }
        return null;
    }

    public String getCreativeId() {
        if (isViewInitializedProperly()) {
            return this.bannerViewLoader.getCreativeId();
        }
        return null;
    }

    public String getAdSpaceId() {
        BannerViewLoader.LoadAdParams loadAdParams;
        if (!isViewInitializedProperly() || (loadAdParams = this.bannerViewLoader.getLoadAdParams()) == null) {
            return null;
        }
        return loadAdParams.adSpaceId;
    }

    public BannerAdSize getBannerAdSize() {
        BannerViewLoader.LoadAdParams loadAdParams;
        if (!isViewInitializedProperly() || (loadAdParams = this.bannerViewLoader.getLoadAdParams()) == null) {
            return null;
        }
        return loadAdParams.bannerAdSize;
    }

    public void loadAd(String str, BannerAdSize bannerAdSize) {
        loadAd(str, bannerAdSize, (AdRequestParams) null);
    }

    public void loadAd(String str, BannerAdSize bannerAdSize, AdRequestParams adRequestParams) {
        if (isViewInitializedProperly()) {
            Objects.onNotNull(this.bannerViewLoader, new Consumer() {
                public final void accept(Object obj) {
                    ((BannerViewLoader) obj).loadAd(BannerViewLoader.LoadAdParams.this);
                }
            });
        }
    }

    public void setMediationNetworkName(String str) {
        this.mediationNetworkName = str;
    }

    public void setMediationNetworkSDKVersion(String str) {
        this.mediationNetworkSDKVersion = str;
    }

    public void setMediationAdapterVersion(String str) {
        this.mediationAdapterVersion = str;
    }

    public KeyValuePairs getKeyValuePairs() {
        if (!isViewInitializedProperly()) {
            return null;
        }
        return this.bannerViewLoader.getKeyValuePairs();
    }

    public void setKeyValuePairs(KeyValuePairs keyValuePairs) {
        if (isViewInitializedProperly()) {
            this.bannerViewLoader.setKeyValuePairs(keyValuePairs);
        }
    }

    private boolean isViewInitializedProperly() {
        if (this.bannerViewLoader != null) {
            return true;
        }
        Log.e(LOG_TAG, "SmaatoSdk is not initialized. SmaatoSdk.init() should be called before ad request");
        return false;
    }

    public AutoReloadInterval getAutoReloadInterval() {
        if (!isViewInitializedProperly()) {
            return null;
        }
        int autoReloadInterval = this.bannerViewLoader.getAutoReloadInterval();
        for (AutoReloadInterval autoReloadInterval2 : AutoReloadInterval.values()) {
            if (autoReloadInterval2.getSeconds() == autoReloadInterval) {
                return autoReloadInterval2;
            }
        }
        return null;
    }

    public void setAutoReloadInterval(AutoReloadInterval autoReloadInterval) {
        if (autoReloadInterval == null) {
            Log.e(LOG_TAG, "bannerAutoReloadInterval can not be null");
        } else if (isViewInitializedProperly()) {
            Objects.onNotNull(this.bannerViewLoader, new Consumer() {
                public final void accept(Object obj) {
                    ((BannerViewLoader) obj).setAutoReloadInterval(AutoReloadInterval.this.getSeconds());
                }
            });
        }
    }

    public void setObjectExtras(Map<String, Object> map) {
        if (isViewInitializedProperly() && map != null) {
            this.bannerViewLoader.setObjectExtras(map);
        }
    }

    public void destroy() {
        Objects.onNotNull(this.bannerViewLoader, $$Lambda$7a0MOmBAFo15KAViHAVshuTmaI.INSTANCE);
        Threads.ensureInvokedOnHandlerThread(this.uiHandler, new Runnable() {
            public final void run() {
                BannerView.this.removeAllViews();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onAdLoaded() {
        Threads.ensureInvokedOnHandlerThread(this.uiHandler, new Runnable() {
            public final void run() {
                BannerView.this.lambda$onAdLoaded$3$BannerView();
            }
        });
    }

    public /* synthetic */ void lambda$onAdLoaded$2$BannerView(EventListener eventListener2) {
        eventListener2.onAdLoaded(this);
    }

    public /* synthetic */ void lambda$onAdLoaded$3$BannerView() {
        Objects.onNotNull(this.eventListener, new Consumer() {
            public final void accept(Object obj) {
                BannerView.this.lambda$onAdLoaded$2$BannerView((BannerView.EventListener) obj);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onAdClicked() {
        Threads.ensureInvokedOnHandlerThread(this.uiHandler, new Runnable() {
            public final void run() {
                BannerView.this.lambda$onAdClicked$5$BannerView();
            }
        });
    }

    public /* synthetic */ void lambda$onAdClicked$4$BannerView(EventListener eventListener2) {
        eventListener2.onAdClicked(this);
    }

    public /* synthetic */ void lambda$onAdClicked$5$BannerView() {
        Objects.onNotNull(this.eventListener, new Consumer() {
            public final void accept(Object obj) {
                BannerView.this.lambda$onAdClicked$4$BannerView((BannerView.EventListener) obj);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onAdFailedToLoad(BannerError bannerError) {
        Threads.ensureInvokedOnHandlerThread(this.uiHandler, new Runnable(bannerError) {
            public final /* synthetic */ BannerError f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                BannerView.this.lambda$onAdFailedToLoad$7$BannerView(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$onAdFailedToLoad$7$BannerView(BannerError bannerError) {
        this.logger.error(LogDomain.WIDGET, "Error loading ad. %s", bannerError);
        Objects.onNotNull(this.eventListener, new Consumer(bannerError) {
            public final /* synthetic */ BannerError f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                BannerView.this.lambda$onAdFailedToLoad$6$BannerView(this.f$1, (BannerView.EventListener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdFailedToLoad$6$BannerView(BannerError bannerError, EventListener eventListener2) {
        eventListener2.onAdFailedToLoad(this, bannerError);
    }

    /* access modifiers changed from: package-private */
    public void onAdImpression() {
        Threads.ensureInvokedOnHandlerThread(this.uiHandler, new Runnable() {
            public final void run() {
                BannerView.this.lambda$onAdImpression$9$BannerView();
            }
        });
    }

    public /* synthetic */ void lambda$onAdImpression$8$BannerView(EventListener eventListener2) {
        eventListener2.onAdImpression(this);
    }

    public /* synthetic */ void lambda$onAdImpression$9$BannerView() {
        Objects.onNotNull(this.eventListener, new Consumer() {
            public final void accept(Object obj) {
                BannerView.this.lambda$onAdImpression$8$BannerView((BannerView.EventListener) obj);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onTTLExpired() {
        Threads.ensureInvokedOnHandlerThread(this.uiHandler, new Runnable() {
            public final void run() {
                BannerView.this.lambda$onTTLExpired$11$BannerView();
            }
        });
    }

    public /* synthetic */ void lambda$onTTLExpired$10$BannerView(EventListener eventListener2) {
        eventListener2.onAdTTLExpired(this);
    }

    public /* synthetic */ void lambda$onTTLExpired$11$BannerView() {
        Objects.onNotNull(this.eventListener, new Consumer() {
            public final void accept(Object obj) {
                BannerView.this.lambda$onTTLExpired$10$BannerView((BannerView.EventListener) obj);
            }
        });
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Objects.onNotNull(this.bannerViewLoader, new Consumer(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((BannerViewLoader) obj).bannersWindowFocusChanged(this.f$0);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void initWithAdPresenter(AdPresenter adPresenter) {
        removeAllViews();
        final AdContentView adContentView = adPresenter.getAdContentView(getContext());
        if (adContentView == null) {
            onAdFailedToLoad(BannerError.INTERNAL_ERROR);
            return;
        }
        adContentView.setVisibility(4);
        addView(adContentView);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                BannerView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                int measuredWidth = BannerView.this.getMeasuredWidth();
                int measuredHeight = BannerView.this.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = adContentView.getLayoutParams();
                int i = layoutParams.width;
                int i2 = layoutParams.height;
                if (i > measuredWidth || i2 > measuredHeight) {
                    Objects.onNotNull(BannerView.this.bannerViewLoader, new Consumer(i, i2, measuredWidth, measuredHeight) {
                        public final /* synthetic */ int f$0;
                        public final /* synthetic */ int f$1;
                        public final /* synthetic */ int f$2;
                        public final /* synthetic */ int f$3;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void accept(Object obj) {
                            ((BannerViewLoader) obj).reportWrongContentSize(this.f$0, this.f$1, this.f$2, this.f$3);
                        }
                    });
                }
                adContentView.setVisibility(0);
                BannerView.this.setWillNotDraw(false);
                return true;
            }
        });
    }
}
