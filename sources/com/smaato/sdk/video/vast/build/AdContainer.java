package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.C11286Ad;

class AdContainer<VastModel> {

    /* renamed from: ad */
    public final C11286Ad f27158ad;
    public final VastModel model;

    AdContainer(C11286Ad ad, VastModel vastmodel) {
        Objects.requireNonNull(ad, "Parameter ad cannot be null for AdContainer::new");
        Objects.requireNonNull(vastmodel, "Parameter model cannot be null for AdContainer::new");
        this.f27158ad = ad;
        this.model = vastmodel;
    }
}
