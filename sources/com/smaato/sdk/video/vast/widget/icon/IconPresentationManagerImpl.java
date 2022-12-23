package com.smaato.sdk.video.vast.widget.icon;

import android.content.res.Resources;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.utils.VastScenarioResourceDataConverter;
import com.smaato.sdk.video.vast.widget.element.VastElementException;
import com.smaato.sdk.video.vast.widget.element.VastElementLoadingException;
import com.smaato.sdk.video.vast.widget.element.VastElementPresentationManager;
import com.smaato.sdk.video.vast.widget.element.VastElementView;

final class IconPresentationManagerImpl implements VastElementPresentationManager {
    private final VastIconScenario iconScenario;
    private final Logger logger;
    private final VastScenarioResourceDataConverter resourceDataConverter;

    IconPresentationManagerImpl(Logger logger2, VastIconScenario vastIconScenario, VastScenarioResourceDataConverter vastScenarioResourceDataConverter) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.iconScenario = (VastIconScenario) Objects.requireNonNull(vastIconScenario);
        this.resourceDataConverter = (VastScenarioResourceDataConverter) Objects.requireNonNull(vastScenarioResourceDataConverter);
    }

    public void prepare(VastElementView vastElementView, Consumer<VastElementException> consumer) {
        float f = Resources.getSystem().getDisplayMetrics().density;
        float max = Math.max(Math.min(UIUtils.getNormalizedSize(this.iconScenario.width), 50.0f), 12.0f);
        float max2 = Math.max(Math.min(UIUtils.getNormalizedSize(this.iconScenario.height), 50.0f), 12.0f);
        int dpToPx = UIUtils.dpToPx(max, f);
        int dpToPx2 = UIUtils.dpToPx(max2, f);
        String uriFromResources = this.resourceDataConverter.getUriFromResources(this.iconScenario.resourceData, dpToPx, dpToPx2);
        if (TextUtils.isEmpty(uriFromResources)) {
            consumer.accept(new VastElementLoadingException(String.format("Error while preparing Icon. Unable to convert Icon resource: %s", new Object[]{uriFromResources})));
            return;
        }
        vastElementView.load(uriFromResources);
        vastElementView.setSize(dpToPx, dpToPx2);
    }
}
