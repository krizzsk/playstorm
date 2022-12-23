package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.Icon;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import java.util.List;

public class VastIconScenarioPicker {
    private final VastIconScenarioMapper vastIconScenarioMapper;

    public VastIconScenarioPicker(VastIconScenarioMapper vastIconScenarioMapper2) {
        this.vastIconScenarioMapper = (VastIconScenarioMapper) Objects.requireNonNull(vastIconScenarioMapper2);
    }

    public VastIconScenario pickIconScenario(Logger logger, List<Icon> list) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(list);
        VastIconScenario vastIconScenario = null;
        if (list.isEmpty()) {
            return null;
        }
        for (Icon next : list) {
            if ((!next.staticResources.isEmpty() || !next.iFrameResources.isEmpty() || !next.htmlResources.isEmpty()) && (vastIconScenario = this.vastIconScenarioMapper.mapVastIconScenario(logger, next)) != null) {
                break;
            }
        }
        return vastIconScenario;
    }
}
