package com.saypromo.listeners;

import com.saypromo.SPAdManager;

public interface ISayPromoAdsListener {
    void onSayPromoAdsError(SPAdManager.SayPromoAdsError sayPromoAdsError, String str);

    void onSayPromoAdsFinish(String str, SPAdManager.FinishState finishState);

    void onSayPromoAdsReady(String str);

    void onSayPromoAdsStart(String str);
}
