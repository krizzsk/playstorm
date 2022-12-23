package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.p378ad.AdPresenter;

public abstract class AdTypeStrategy {
    public abstract Class<? extends AdPresenter> getAdPresenterClass();

    public abstract String getUniqueKey();
}
