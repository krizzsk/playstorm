package com.smaato.sdk.core.csm;

import android.content.Context;
import com.smaato.sdk.core.p378ad.AdPresenter;
import java.util.Map;

public interface CsmAdPresenter extends AdPresenter {

    public interface Listener {
        void onAdFailedToLoad(CsmAdPresenter csmAdPresenter);

        void onAdLoaded(CsmAdPresenter csmAdPresenter);
    }

    void requestAd(Context context, Map<String, String> map, Map<String, Object> map2);

    void setAdLoadedListener(Listener listener);
}
