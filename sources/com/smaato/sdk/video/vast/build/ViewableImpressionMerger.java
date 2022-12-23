package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.model.ViewableImpression;

public class ViewableImpressionMerger {
    public ViewableImpression merge(ViewableImpression viewableImpression, ViewableImpression viewableImpression2) {
        if (viewableImpression == null) {
            return viewableImpression2;
        }
        if (viewableImpression2 == null) {
            return viewableImpression;
        }
        return new ViewableImpression.Builder().setId(viewableImpression.f27183id).setViewable(VastScenarioMergeUtils.merge(viewableImpression.viewable, viewableImpression2.viewable)).setNotViewable(VastScenarioMergeUtils.merge(viewableImpression.notViewable, viewableImpression2.notViewable)).setViewUndetermined(VastScenarioMergeUtils.merge(viewableImpression.viewUndetermined, viewableImpression2.viewUndetermined)).build();
    }
}
