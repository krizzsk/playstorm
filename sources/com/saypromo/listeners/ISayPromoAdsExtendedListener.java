package com.saypromo.listeners;

import com.saypromo.SPAdManager;

public interface ISayPromoAdsExtendedListener extends ISayPromoAdsListener {
    void onSayPromoAdsClick(String str);

    void onSayPromoAdsPlacementStateChanged(String str, SPAdManager.PlacementState placementState, SPAdManager.PlacementState placementState2);
}
