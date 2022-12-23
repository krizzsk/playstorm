package com.smaato.sdk.core;

import com.smaato.sdk.core.AutoValue_UbErrorReporting_Param;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoader;

public interface UbErrorReporting {
    void report(AdLoader.Error error, Param param);

    public static abstract class Param {

        public static abstract class Builder {
            public abstract Param build();

            public abstract Builder setAdFormat(AdFormat adFormat);

            public abstract Builder setAdSpaceId(String str);

            public abstract Builder setCreativeId(String str);

            public abstract Builder setPublisherId(String str);

            public abstract Builder setRequestTimestamp(Long l);

            public abstract Builder setSessionId(String str);
        }

        public abstract AdFormat adFormat();

        public abstract String adSpaceId();

        public abstract String creativeId();

        public abstract String publisherId();

        public abstract Long requestTimestamp();

        public abstract String sessionId();

        public static Builder builder() {
            return new AutoValue_UbErrorReporting_Param.Builder();
        }
    }
}
