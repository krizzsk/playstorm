package com.smaato.sdk.video.vast.widget.icon;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.video.utils.AnimationHelper;
import com.smaato.sdk.video.vast.browser.VastWebComponentSecurityPolicy;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.utils.VastScenarioResourceDataConverter;
import com.smaato.sdk.video.vast.widget.element.NoOpVastElementPresenter;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;

public final class IconPresenterFactory {
    private final AnimationHelper animationHelper;
    private final IconErrorCodeStrategy errorCodeStrategy;
    private final OneTimeActionFactory oneTimeActionFactory;
    private final VastScenarioResourceDataConverter resourceDataConverter;
    private final VastWebComponentSecurityPolicy securityPolicy;
    private final VisibilityTrackerCreator visibilityTrackerCreator;

    public IconPresenterFactory(VastScenarioResourceDataConverter vastScenarioResourceDataConverter, VisibilityTrackerCreator visibilityTrackerCreator2, VastWebComponentSecurityPolicy vastWebComponentSecurityPolicy, OneTimeActionFactory oneTimeActionFactory2, AnimationHelper animationHelper2, IconErrorCodeStrategy iconErrorCodeStrategy) {
        this.resourceDataConverter = (VastScenarioResourceDataConverter) Objects.requireNonNull(vastScenarioResourceDataConverter);
        this.visibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator2);
        this.securityPolicy = (VastWebComponentSecurityPolicy) Objects.requireNonNull(vastWebComponentSecurityPolicy);
        this.oneTimeActionFactory = (OneTimeActionFactory) Objects.requireNonNull(oneTimeActionFactory2);
        this.animationHelper = (AnimationHelper) Objects.requireNonNull(animationHelper2);
        this.errorCodeStrategy = (IconErrorCodeStrategy) Objects.requireNonNull(iconErrorCodeStrategy);
    }

    public VastElementPresenter create(Logger logger, VastMediaFileScenario vastMediaFileScenario, ImpressionCountingType impressionCountingType) {
        VastMediaFileScenario vastMediaFileScenario2 = vastMediaFileScenario;
        VastIconScenario vastIconScenario = vastMediaFileScenario2.vastIconScenario;
        if (vastIconScenario == null) {
            return new NoOpVastElementPresenter();
        }
        Logger logger2 = logger;
        return new IconPresenterImpl(logger, new IconPresentationManagerImpl(logger, vastIconScenario, this.resourceDataConverter), this.securityPolicy, this.visibilityTrackerCreator, this.errorCodeStrategy, vastIconScenario, this.oneTimeActionFactory, this.animationHelper, vastMediaFileScenario2.duration, impressionCountingType);
    }
}
