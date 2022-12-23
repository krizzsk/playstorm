package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.build.VastScenarioResult;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.VastRawScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Wrapper;
import java.util.HashSet;

public class VastScenarioPicker {
    private final InLineAdContainerPicker inLineAdContainerPicker;
    private final VastScenarioMapper vastScenarioMapper;
    private final VastScenarioWrapperMapper vastScenarioWrapperMapper;
    private final VastScenarioWrapperMerger vastScenarioWrapperMerger;
    private final WrapperAdContainerPicker wrapperAdContainerPicker;

    public VastScenarioPicker(InLineAdContainerPicker inLineAdContainerPicker2, WrapperAdContainerPicker wrapperAdContainerPicker2, VastScenarioWrapperMerger vastScenarioWrapperMerger2, VastScenarioMapper vastScenarioMapper2, VastScenarioWrapperMapper vastScenarioWrapperMapper2) {
        this.inLineAdContainerPicker = (InLineAdContainerPicker) Objects.requireNonNull(inLineAdContainerPicker2, "Parameter inLineAdContainerPicker should be null for VastScenarioPicker::new");
        this.wrapperAdContainerPicker = (WrapperAdContainerPicker) Objects.requireNonNull(wrapperAdContainerPicker2, "Parameter wrapperAdContainerPicker should be null for VastScenarioPicker::new");
        this.vastScenarioWrapperMerger = (VastScenarioWrapperMerger) Objects.requireNonNull(vastScenarioWrapperMerger2, "Parameter vastScenarioWrapperMerger should be null for VastScenarioPicker::new");
        this.vastScenarioMapper = (VastScenarioMapper) Objects.requireNonNull(vastScenarioMapper2, "Parameter vastScenarioMapper should be null for VastScenarioPicker::new");
        this.vastScenarioWrapperMapper = (VastScenarioWrapperMapper) Objects.requireNonNull(vastScenarioWrapperMapper2, "Parameter vastScenarioWrapperMapper should be null for VastScenarioPicker::new");
    }

    public VastScenarioResult pickVastScenario(Logger logger, VastTree vastTree, VastConfigurationSettings vastConfigurationSettings) {
        Objects.requireNonNull(logger, "Parameter logger should not be null for VastScenarioPicker::pickVastScenario");
        Objects.requireNonNull(vastTree, "Parameter vastTree should not be null for VastScenarioPicker::pickVastScenario");
        Objects.requireNonNull(vastConfigurationSettings, "Parameter vastConfigurationSettings should not be null for VastScenarioPicker::pickVastScenario");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet(vastTree.errors);
        VastScenarioResult.Builder errorUrls = new VastScenarioResult.Builder().setErrors(hashSet).setErrorUrls(hashSet2);
        if (vastTree.ads.isEmpty()) {
            return errorUrls.build();
        }
        AdContainer<InLine> pickInLineContainer = this.inLineAdContainerPicker.pickInLineContainer(vastTree.ads);
        if (pickInLineContainer != null) {
            VastScenarioResult mapVastScenario = this.vastScenarioMapper.mapVastScenario(logger, (InLine) pickInLineContainer.model, vastConfigurationSettings);
            hashSet.addAll(mapVastScenario.errors);
            hashSet2.addAll(mapVastScenario.errorUrls);
            return errorUrls.setVastScenario(mapVastScenario.vastScenario).build();
        }
        AdContainer<Wrapper> pickWrapperContainer = this.wrapperAdContainerPicker.pickWrapperContainer(vastTree.ads);
        if (pickWrapperContainer != null) {
            Wrapper wrapper = (Wrapper) pickWrapperContainer.model;
            hashSet2.addAll(wrapper.errors);
            if (wrapper.vastTree != null) {
                VastRawScenario mapVastScenarioForWrapper = this.vastScenarioWrapperMapper.mapVastScenarioForWrapper(logger, wrapper, vastConfigurationSettings);
                hashSet2.addAll(mapVastScenarioForWrapper.errors);
                VastScenarioResult pickVastScenario = pickVastScenario(logger, wrapper.vastTree, vastConfigurationSettings);
                hashSet.addAll(pickVastScenario.errors);
                hashSet2.addAll(pickVastScenario.errorUrls);
                VastScenario vastScenario = pickVastScenario.vastScenario;
                if (vastScenario != null) {
                    errorUrls.setVastScenario(this.vastScenarioWrapperMerger.merge(vastScenario, mapVastScenarioForWrapper, vastConfigurationSettings));
                }
            }
        }
        return errorUrls.build();
    }
}
