package com.smaato.sdk.rewarded;

import android.content.Context;
import android.os.Handler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Supplier;
import com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository;
import com.smaato.sdk.rewarded.widget.RewardedInterstitialAdActivity;
import java.util.Objects;

class RewardedInterstitialAdImpl extends RewardedInterstitialAd {
    private boolean closeButtonEnabled = false;
    private final Context context;
    /* access modifiers changed from: private */
    public final EventListener eventListener;
    /* access modifiers changed from: private */
    public final Handler handler;
    private final Logger logger;
    private final RetainedAdPresenterRepository retainedAdPresenterRepository;
    private final RewardedAdPresenter rewardedAdPresenter;
    private final Supplier<String> uniqueKeySupplier;
    private final RewardedAdPresenter.Listener videoAdPresenterListener;

    /* JADX WARNING: type inference failed for: r9v0, types: [com.smaato.sdk.core.util.fi.Supplier<java.lang.String>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    RewardedInterstitialAdImpl(android.content.Context r3, android.os.Handler r4, com.smaato.sdk.core.log.Logger r5, com.smaato.sdk.core.p378ad.RewardedAdPresenter r6, com.smaato.sdk.rewarded.EventListener r7, com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository r8, com.smaato.sdk.core.util.p382fi.Supplier<java.lang.String> r9) {
        /*
            r2 = this;
            r2.<init>()
            com.smaato.sdk.rewarded.RewardedInterstitialAdImpl$1 r0 = new com.smaato.sdk.rewarded.RewardedInterstitialAdImpl$1
            r0.<init>()
            r2.videoAdPresenterListener = r0
            r1 = 0
            r2.closeButtonEnabled = r1
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            android.content.Context r3 = (android.content.Context) r3
            r2.context = r3
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            android.os.Handler r3 = (android.os.Handler) r3
            r2.handler = r3
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.core.log.Logger r3 = (com.smaato.sdk.core.log.Logger) r3
            r2.logger = r3
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            com.smaato.sdk.core.ad.RewardedAdPresenter r3 = (com.smaato.sdk.core.p378ad.RewardedAdPresenter) r3
            r2.rewardedAdPresenter = r3
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r7)
            com.smaato.sdk.rewarded.EventListener r3 = (com.smaato.sdk.rewarded.EventListener) r3
            r2.eventListener = r3
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r8)
            com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository r3 = (com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository) r3
            r2.retainedAdPresenterRepository = r3
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r9)
            com.smaato.sdk.core.util.fi.Supplier r3 = (com.smaato.sdk.core.util.p382fi.Supplier) r3
            r2.uniqueKeySupplier = r3
            r6.setListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.rewarded.RewardedInterstitialAdImpl.<init>(android.content.Context, android.os.Handler, com.smaato.sdk.core.log.Logger, com.smaato.sdk.core.ad.RewardedAdPresenter, com.smaato.sdk.rewarded.EventListener, com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository, com.smaato.sdk.core.util.fi.Supplier):void");
    }

    public String getAdSpaceId() {
        return this.rewardedAdPresenter.getAdSpaceId();
    }

    public String getSessionId() {
        return this.rewardedAdPresenter.getSessionId();
    }

    public String getCreativeId() {
        return this.rewardedAdPresenter.getCreativeId();
    }

    public void setCloseButtonEnabled(boolean z) {
        Threads.runOnHandlerThreadBlocking(this.handler, new Supplier(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final Object get() {
                return RewardedInterstitialAdImpl.this.lambda$setCloseButtonEnabled$0$RewardedInterstitialAdImpl(this.f$1);
            }
        });
    }

    public /* synthetic */ Boolean lambda$setCloseButtonEnabled$0$RewardedInterstitialAdImpl(boolean z) {
        this.closeButtonEnabled = z;
        return Boolean.valueOf(z);
    }

    public boolean isAvailableForPresentation() {
        Handler handler2 = this.handler;
        RewardedAdPresenter rewardedAdPresenter2 = this.rewardedAdPresenter;
        Objects.requireNonNull(rewardedAdPresenter2);
        return ((Boolean) Threads.runOnHandlerThreadBlocking(handler2, new Supplier() {
            public final Object get() {
                return Boolean.valueOf(RewardedAdPresenter.this.isValid());
            }
        })).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void showAdInternal() {
        Threads.runOnHandlerThreadBlocking(this.handler, (Runnable) new Runnable() {
            public final void run() {
                RewardedInterstitialAdImpl.this.lambda$showAdInternal$1$RewardedInterstitialAdImpl();
            }
        });
    }

    public /* synthetic */ void lambda$showAdInternal$1$RewardedInterstitialAdImpl() {
        if (this.rewardedAdPresenter.isValid()) {
            String str = this.uniqueKeySupplier.get();
            this.retainedAdPresenterRepository.put(this.rewardedAdPresenter, str);
            RewardedInterstitialAdActivity.start(this.context, str, this.closeButtonEnabled);
            return;
        }
        this.logger.debug(LogDomain.REWARDED, "RewardedInterstitialAd is already shown on screen or expired. Please request new one.", new Object[0]);
    }
}
