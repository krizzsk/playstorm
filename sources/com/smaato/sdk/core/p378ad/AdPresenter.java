package com.smaato.sdk.core.p378ad;

import android.content.Context;
import com.smaato.sdk.core.p381ui.AdContentView;

/* renamed from: com.smaato.sdk.core.ad.AdPresenter */
public interface AdPresenter {

    /* renamed from: com.smaato.sdk.core.ad.AdPresenter$Listener */
    public interface Listener<T extends AdPresenter> {
        void onAdClicked(T t);

        void onAdError(T t);

        void onAdImpressed(T t);

        void onTTLExpired(T t);
    }

    AdContentView getAdContentView(Context context);

    AdInteractor<? extends AdObject> getAdInteractor();

    String getAdSpaceId();

    String getCreativeId();

    String getPublisherId();

    String getSessionId();

    boolean isValid();

    void release();
}
