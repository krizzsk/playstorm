package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.NullableSupplier;
import java.util.HashMap;
import java.util.UUID;

final class InterstitialAdPresenterStorage {
    private HashMap<UUID, InterstitialAdPresenter> storage = new HashMap<>();

    InterstitialAdPresenterStorage() {
    }

    public /* synthetic */ InterstitialAdPresenter lambda$putAdPresenter$0$InterstitialAdPresenterStorage(UUID uuid, InterstitialAdPresenter interstitialAdPresenter) {
        return this.storage.put(uuid, interstitialAdPresenter);
    }

    /* access modifiers changed from: package-private */
    public void putAdPresenter(UUID uuid, InterstitialAdPresenter interstitialAdPresenter) {
        Threads.runOnUiBlocking(new NullableSupplier(uuid, interstitialAdPresenter) {
            public final /* synthetic */ UUID f$1;
            public final /* synthetic */ InterstitialAdPresenter f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object get() {
                return InterstitialAdPresenterStorage.this.lambda$putAdPresenter$0$InterstitialAdPresenterStorage(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public InterstitialAdPresenter getAdPresenter(UUID uuid) {
        return (InterstitialAdPresenter) Threads.runOnUiBlocking(new NullableSupplier(uuid) {
            public final /* synthetic */ UUID f$1;

            {
                this.f$1 = r2;
            }

            public final Object get() {
                return InterstitialAdPresenterStorage.this.lambda$getAdPresenter$1$InterstitialAdPresenterStorage(this.f$1);
            }
        });
    }

    public /* synthetic */ InterstitialAdPresenter lambda$getAdPresenter$1$InterstitialAdPresenterStorage(UUID uuid) {
        return this.storage.get(uuid);
    }

    public /* synthetic */ InterstitialAdPresenter lambda$removeAdPresenter$2$InterstitialAdPresenterStorage(UUID uuid) {
        return this.storage.remove(uuid);
    }

    /* access modifiers changed from: package-private */
    public void removeAdPresenter(UUID uuid) {
        Threads.runOnUiBlocking(new NullableSupplier(uuid) {
            public final /* synthetic */ UUID f$1;

            {
                this.f$1 = r2;
            }

            public final Object get() {
                return InterstitialAdPresenterStorage.this.lambda$removeAdPresenter$2$InterstitialAdPresenterStorage(this.f$1);
            }
        });
    }
}
