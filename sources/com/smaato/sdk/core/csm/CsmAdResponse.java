package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.csm.AutoValue_CsmAdResponse;
import java.util.List;

public abstract class CsmAdResponse {

    public static abstract class Builder {
        public abstract CsmAdResponse build();

        public abstract Builder setImpressionCountingType(ImpressionCountingType impressionCountingType);

        public abstract Builder setNetworks(List<Network> list);

        public abstract Builder setPassback(String str);

        public abstract Builder setSessionId(String str);
    }

    public abstract ImpressionCountingType getImpressionCountingType();

    public abstract List<Network> getNetworks();

    public abstract String getPassback();

    public abstract String getSessionId();

    public static Builder builder() {
        return new AutoValue_CsmAdResponse.Builder();
    }
}
