package com.smaato.sdk.interstitial.csm;

import android.app.Activity;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.interstitial.EventListener;
import com.smaato.sdk.interstitial.InterstitialAd;
import com.smaato.sdk.interstitial.InterstitialError;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdImpl;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdPresenter;

public final class InterstitialCsmAdImpl extends InterstitialAd {
    /* access modifiers changed from: private */
    public final InterstitialCsmAdPresenter adPresenter;
    /* access modifiers changed from: private */
    public final EventListener eventListener;
    private final InterstitialCsmAdPresenter.Listener listener;

    public InterstitialCsmAdImpl(InterstitialCsmAdPresenter interstitialCsmAdPresenter, EventListener eventListener2) {
        C111251 r0 = new InterstitialCsmAdPresenter.Listener() {
            public /* synthetic */ void lambda$onAdOpened$0$InterstitialCsmAdImpl$1() {
                InterstitialCsmAdImpl.this.eventListener.onAdOpened(InterstitialCsmAdImpl.this);
            }

            public void onAdOpened(InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
                Threads.runOnUi(new Runnable() {
                    public final void run() {
                        InterstitialCsmAdImpl.C111251.this.lambda$onAdOpened$0$InterstitialCsmAdImpl$1();
                    }
                });
            }

            public void onAdClosed(InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
                Threads.runOnUi(new Runnable() {
                    public final void run() {
                        InterstitialCsmAdImpl.C111251.this.lambda$onAdClosed$1$InterstitialCsmAdImpl$1();
                    }
                });
            }

            public /* synthetic */ void lambda$onAdClosed$1$InterstitialCsmAdImpl$1() {
                InterstitialCsmAdImpl.this.adPresenter.release();
                InterstitialCsmAdImpl.this.eventListener.onAdClosed(InterstitialCsmAdImpl.this);
            }

            public void onAdImpressed(InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
                Threads.runOnUi(new Runnable() {
                    public final void run() {
                        InterstitialCsmAdImpl.C111251.this.lambda$onAdImpressed$2$InterstitialCsmAdImpl$1();
                    }
                });
            }

            public /* synthetic */ void lambda$onAdImpressed$2$InterstitialCsmAdImpl$1() {
                InterstitialCsmAdImpl.this.eventListener.onAdImpression(InterstitialCsmAdImpl.this);
            }

            public void onAdClicked(InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
                Threads.runOnUi(new Runnable() {
                    public final void run() {
                        InterstitialCsmAdImpl.C111251.this.lambda$onAdClicked$3$InterstitialCsmAdImpl$1();
                    }
                });
            }

            public /* synthetic */ void lambda$onAdClicked$3$InterstitialCsmAdImpl$1() {
                InterstitialCsmAdImpl.this.eventListener.onAdClicked(InterstitialCsmAdImpl.this);
            }

            public void onAdError(InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
                Threads.runOnUi(new Runnable() {
                    public final void run() {
                        InterstitialCsmAdImpl.C111251.this.lambda$onAdError$4$InterstitialCsmAdImpl$1();
                    }
                });
            }

            public /* synthetic */ void lambda$onAdError$4$InterstitialCsmAdImpl$1() {
                InterstitialCsmAdImpl.this.eventListener.onAdError(InterstitialCsmAdImpl.this, InterstitialError.INTERNAL_ERROR);
            }

            public void onTTLExpired(InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
                Threads.runOnUi(new Runnable() {
                    public final void run() {
                        InterstitialCsmAdImpl.C111251.this.lambda$onTTLExpired$5$InterstitialCsmAdImpl$1();
                    }
                });
            }

            public /* synthetic */ void lambda$onTTLExpired$5$InterstitialCsmAdImpl$1() {
                InterstitialCsmAdImpl.this.eventListener.onAdTTLExpired(InterstitialCsmAdImpl.this);
            }
        };
        this.listener = r0;
        this.adPresenter = (InterstitialCsmAdPresenter) Objects.requireNonNull(interstitialCsmAdPresenter);
        this.eventListener = (EventListener) Objects.requireNonNull(eventListener2);
        interstitialCsmAdPresenter.setInterstitialAdListener(r0);
    }

    /* access modifiers changed from: protected */
    public void showAdInternal(Activity activity, boolean z) {
        Threads.runOnUi(new Runnable() {
            public final void run() {
                InterstitialCsmAdImpl.this.lambda$showAdInternal$0$InterstitialCsmAdImpl();
            }
        });
    }

    public /* synthetic */ void lambda$showAdInternal$0$InterstitialCsmAdImpl() {
        if (this.adPresenter.isValid()) {
            this.adPresenter.showAd();
        } else {
            this.eventListener.onAdError(this, InterstitialError.INTERNAL_ERROR);
        }
    }

    public String getSessionId() {
        return this.adPresenter.getSessionId();
    }

    public String getCreativeId() {
        return this.adPresenter.getCreativeId();
    }

    public String getAdSpaceId() {
        return this.adPresenter.getAdSpaceId();
    }

    public boolean isAvailableForPresentation() {
        return this.adPresenter.isValid();
    }
}
