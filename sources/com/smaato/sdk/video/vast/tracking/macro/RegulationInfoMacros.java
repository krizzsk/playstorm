package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p382fi.Supplier;
import com.vungle.warren.model.Cookie;
import java.util.ArrayList;
import java.util.Map;

final class RegulationInfoMacros {
    private final CoppaProvider coppaProvider;
    private final DataCollector dataCollector;
    private final SomaGdprDataSource somaGdprDataSource;

    interface CoppaProvider extends Supplier<Boolean> {
    }

    RegulationInfoMacros(SomaGdprDataSource somaGdprDataSource2, DataCollector dataCollector2, CoppaProvider coppaProvider2) {
        this.somaGdprDataSource = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource2);
        this.dataCollector = (DataCollector) Objects.requireNonNull(dataCollector2);
        this.coppaProvider = (CoppaProvider) Objects.requireNonNull(coppaProvider2);
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> toMap() {
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        return Maps.mapOf(Maps.entryOf("[LIMITADTRACKING]", getGoogleLimitAdTrackingEnabled()), Maps.entryOf("[REGULATIONS]", getRegulations(somaGdprData)), Maps.entryOf("[GDPRCONSENT]", getConsent(somaGdprData)));
    }

    private String getGoogleLimitAdTrackingEnabled() {
        Boolean isGoogleLimitAdTrackingEnabled = this.dataCollector.getSystemInfo().isGoogleLimitAdTrackingEnabled();
        if (isGoogleLimitAdTrackingEnabled == null) {
            return "-2";
        }
        return isGoogleLimitAdTrackingEnabled.booleanValue() ? "1" : "0";
    }

    private String getRegulations(SomaGdprData somaGdprData) {
        ArrayList arrayList = new ArrayList();
        if (((Boolean) this.coppaProvider.get()).booleanValue()) {
            arrayList.add(Cookie.COPPA_KEY);
        }
        Boolean isGdprEnabled = somaGdprData.isGdprEnabled();
        if (!somaGdprData.getConsentString().isEmpty() || (isGdprEnabled != null && isGdprEnabled.booleanValue())) {
            arrayList.add("gdpr");
        }
        return arrayList.isEmpty() ? "-2" : Joiner.join((CharSequence) ",", (Iterable) arrayList);
    }

    private String getConsent(SomaGdprData somaGdprData) {
        String consentString = somaGdprData.getConsentString();
        return TextUtils.isEmpty(consentString) ? "-2" : consentString;
    }
}
