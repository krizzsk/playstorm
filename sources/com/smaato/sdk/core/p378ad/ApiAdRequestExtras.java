package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.ad.ApiAdRequestExtras */
public class ApiAdRequestExtras {
    private final AdFormat adFormat;
    private final Map<String, Object> apiAdRequestExtras = new HashMap();

    public ApiAdRequestExtras(AdFormat adFormat2) {
        this.adFormat = (AdFormat) Objects.requireNonNull(adFormat2);
    }

    public AdFormat adFormat() {
        return this.adFormat;
    }

    public void addApiParamExtra(String str, Object obj) {
        this.apiAdRequestExtras.put(str, obj);
    }

    public Map<String, Object> toMap() {
        return new HashMap(this.apiAdRequestExtras);
    }
}
