package com.smaato.sdk.video.vast.widget.companion;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.browser.VastWebComponentSecurityPolicy;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.utils.VastScenarioResourceDataConverter;
import com.smaato.sdk.video.vast.widget.element.NoOpVastElementPresenter;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;

public final class CompanionPresenterFactory {
    private final CompanionErrorCodeStrategy errorCodeStrategy;
    private final VastScenarioResourceDataConverter resourceDataConverter;
    private final VastWebComponentSecurityPolicy securityPolicy;
    private final VisibilityTrackerCreator visibilityTrackerCreator;

    public CompanionPresenterFactory(VastScenarioResourceDataConverter vastScenarioResourceDataConverter, VisibilityTrackerCreator visibilityTrackerCreator2, VastWebComponentSecurityPolicy vastWebComponentSecurityPolicy, CompanionErrorCodeStrategy companionErrorCodeStrategy) {
        this.resourceDataConverter = (VastScenarioResourceDataConverter) Objects.requireNonNull(vastScenarioResourceDataConverter);
        this.visibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator2);
        this.securityPolicy = (VastWebComponentSecurityPolicy) Objects.requireNonNull(vastWebComponentSecurityPolicy);
        this.errorCodeStrategy = (CompanionErrorCodeStrategy) Objects.requireNonNull(companionErrorCodeStrategy);
    }

    public VastElementPresenter create(Logger logger, VastScenario vastScenario, ImpressionCountingType impressionCountingType) {
        Objects.requireNonNull(logger);
        VastCompanionScenario vastCompanionScenario = vastScenario.vastCompanionScenario;
        if (vastCompanionScenario == null) {
            return new NoOpVastElementPresenter();
        }
        return new CompanionPresenterImpl(logger, new CompanionPresentationManager(logger, vastCompanionScenario, this.resourceDataConverter), this.securityPolicy, this.visibilityTrackerCreator, this.errorCodeStrategy, vastCompanionScenario, impressionCountingType);
    }
}
