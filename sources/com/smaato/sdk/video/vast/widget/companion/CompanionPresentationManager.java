package com.smaato.sdk.video.vast.widget.companion;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Size;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;
import com.smaato.sdk.video.vast.utils.VastScenarioResourceDataConverter;
import com.smaato.sdk.video.vast.widget.element.VastElementException;
import com.smaato.sdk.video.vast.widget.element.VastElementLoadingException;
import com.smaato.sdk.video.vast.widget.element.VastElementPresentationManager;
import com.smaato.sdk.video.vast.widget.element.VastElementView;

final class CompanionPresentationManager implements VastElementPresentationManager {
    private final Logger logger;
    private final VastScenarioResourceDataConverter resourceDataConverter;
    private final VastCompanionScenario vastCompanionScenario;

    CompanionPresentationManager(Logger logger2, VastCompanionScenario vastCompanionScenario2, VastScenarioResourceDataConverter vastScenarioResourceDataConverter) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.vastCompanionScenario = (VastCompanionScenario) Objects.requireNonNull(vastCompanionScenario2);
        this.resourceDataConverter = (VastScenarioResourceDataConverter) Objects.requireNonNull(vastScenarioResourceDataConverter);
    }

    public void prepare(VastElementView vastElementView, Consumer<VastElementException> consumer) {
        Size calculateCompanionSizes = calculateCompanionSizes(this.vastCompanionScenario);
        VastScenarioResourceData vastScenarioResourceData = this.vastCompanionScenario.resourceData;
        String uriFromResources = this.resourceDataConverter.getUriFromResources(vastScenarioResourceData, calculateCompanionSizes.width, calculateCompanionSizes.height);
        if (TextUtils.isEmpty(uriFromResources)) {
            consumer.accept(new VastElementLoadingException(String.format("Error while preparing Companion. Unable to convert Companion resource: %s", new Object[]{vastScenarioResourceData})));
            return;
        }
        vastElementView.load(uriFromResources);
        vastElementView.setSize(calculateCompanionSizes.width, calculateCompanionSizes.height);
    }

    private Size calculateCompanionSizes(VastCompanionScenario vastCompanionScenario2) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        float dpToPx = (float) UIUtils.dpToPx(UIUtils.getNormalizedSize(vastCompanionScenario2.width), f);
        float dpToPx2 = (float) UIUtils.dpToPx(UIUtils.getNormalizedSize(vastCompanionScenario2.height), f);
        if (dpToPx <= 0.0f) {
            dpToPx = (float) i;
        }
        if (dpToPx2 <= 0.0f) {
            dpToPx2 = (float) i2;
        }
        float f2 = (float) i;
        if (dpToPx > f2) {
            dpToPx2 = (dpToPx2 / dpToPx) * f2;
            dpToPx = f2;
        }
        float f3 = (float) i2;
        if (dpToPx2 > f3) {
            dpToPx = (dpToPx / dpToPx2) * f3;
            dpToPx2 = f3;
        }
        return new Size((int) dpToPx, (int) dpToPx2);
    }
}
