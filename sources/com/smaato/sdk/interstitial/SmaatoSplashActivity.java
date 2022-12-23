package com.smaato.sdk.interstitial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;

public abstract class SmaatoSplashActivity extends Activity {
    EventListener splashActivityEventListener = new EventListener() {
        public void onAdLoaded(InterstitialAd interstitialAd) {
            SmaatoSplashActivity.this.findViewById(C11097R.C11099id.smaato_sdk_interstitial_loading).setVisibility(8);
            interstitialAd.showAdInternal(SmaatoSplashActivity.this, true);
        }

        public void onAdFailedToLoad(InterstitialRequestError interstitialRequestError) {
            SmaatoSplashActivity.this.findViewById(C11097R.C11099id.smaato_sdk_interstitial_loading).setVisibility(8);
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdFailedToLoad(InterstitialRequestError.this);
                }
            });
            SmaatoSplashActivity.this.gotoNextActivity();
        }

        public void onAdError(InterstitialAd interstitialAd, InterstitialError interstitialError) {
            SmaatoSplashActivity.this.findViewById(C11097R.C11099id.smaato_sdk_interstitial_loading).setVisibility(8);
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer(interstitialError) {
                public final /* synthetic */ InterstitialError f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ((EventListener) obj).onAdError(InterstitialAd.this, this.f$1);
                }
            });
            SmaatoSplashActivity.this.gotoNextActivity();
        }

        public void onAdOpened(InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdOpened(InterstitialAd.this);
                }
            });
        }

        public void onAdClosed(InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdClosed(InterstitialAd.this);
                }
            });
            SmaatoSplashActivity.this.gotoNextActivity();
        }

        public void onAdClicked(InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdClicked(InterstitialAd.this);
                }
            });
        }

        public void onAdImpression(InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdImpression(InterstitialAd.this);
                }
            });
        }

        public void onAdTTLExpired(InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() {
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdTTLExpired(InterstitialAd.this);
                }
            });
        }
    };

    /* access modifiers changed from: protected */
    public abstract String getAdSpaceId();

    /* access modifiers changed from: protected */
    public EventListener getEventListener() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Class<? extends Activity> getNextActivity();

    /* access modifiers changed from: private */
    public void gotoNextActivity() {
        startActivity(new Intent(this, getNextActivity()));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11097R.layout.smaato_sdk_interstitial_splash_activity);
        findViewById(C11097R.C11099id.smaato_sdk_interstitial_loading).setVisibility(0);
        Interstitial.loadAd(getAdSpaceId(), this.splashActivityEventListener);
    }
}
