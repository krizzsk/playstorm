package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentExceptionUtil;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import com.smaato.sdk.core.violationreporter.ImageAdLoadingViolationException;

/* renamed from: com.smaato.sdk.core.ad.AdLoaderAdQualityViolationUtils */
public final class AdLoaderAdQualityViolationUtils {
    private final AdQualityViolationReporter adQualityViolationReporter;

    public AdLoaderAdQualityViolationUtils(AdQualityViolationReporter adQualityViolationReporter2) {
        this.adQualityViolationReporter = (AdQualityViolationReporter) Objects.requireNonNull(adQualityViolationReporter2);
    }

    /* access modifiers changed from: package-private */
    public void handleImageAdLoadingViolationIfRequired(AdPresenterBuilderException adPresenterBuilderException) {
        Exception rootReason = SdkComponentExceptionUtil.getRootReason(adPresenterBuilderException);
        if (rootReason instanceof ImageAdLoadingViolationException) {
            this.adQualityViolationReporter.reportImageLoadingAdViolation((ImageAdLoadingViolationException) rootReason);
        }
    }
}
