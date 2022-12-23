package com.smaato.sdk.core;

import android.util.Log;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.LogLevel;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class Config {
    private final AdContentRating adContentRating;
    private final boolean disableSessionTracking;
    private final boolean enableLogging;
    private List<ExtensionConfiguration> extensionConfigurations;
    private final boolean httpsOnly;
    private final LogLevel logLevel;
    private String mUnityVersion;

    private Config(LogLevel logLevel2, AdContentRating adContentRating2, boolean z, boolean z2, boolean z3, String str, List<ExtensionConfiguration> list) {
        this.mUnityVersion = "";
        this.logLevel = (LogLevel) Objects.requireNonNull(logLevel2);
        this.adContentRating = (AdContentRating) Objects.requireNonNull(adContentRating2);
        this.enableLogging = z;
        this.disableSessionTracking = z2;
        this.httpsOnly = z3;
        this.mUnityVersion = str;
        this.extensionConfigurations = list;
    }

    public static ConfigBuilder builder() {
        return new ConfigBuilder();
    }

    public boolean loggingEnabled() {
        return this.enableLogging;
    }

    public LogLevel getConsoleLogLevel() {
        return this.logLevel;
    }

    public boolean isHttpsOnly() {
        return this.httpsOnly;
    }

    public AdContentRating getAdContentRating() {
        return this.adContentRating;
    }

    public String getUnityVersion() {
        return this.mUnityVersion;
    }

    public List<ExtensionConfiguration> getExtensionConfigurations() {
        return this.extensionConfigurations;
    }

    public boolean sessionTrackingDisabled() {
        return this.disableSessionTracking;
    }

    public static class ConfigBuilder {
        private AdContentRating adContentRating = AdContentRating.MAX_AD_CONTENT_RATING_UNDEFINED;
        private boolean disableSessionTracking;
        private boolean enableLogging;
        private final List<ExtensionConfiguration> extensionConfigurations = new ArrayList();
        private boolean httpsOnly;
        private LogLevel logLevel = LogLevel.INFO;
        private String mUnityVersion = "";

        public ConfigBuilder enableLogging(boolean z) {
            this.enableLogging = z;
            return this;
        }

        public ConfigBuilder disableSessionTracking(boolean z) {
            this.disableSessionTracking = z;
            return this;
        }

        public ConfigBuilder setLogLevel(LogLevel logLevel2) {
            if (logLevel2 != null) {
                this.logLevel = logLevel2;
            } else {
                Log.w(LogDomain.CORE.name(), String.format("Setting logLevel to null is ignored, current value = %s", new Object[]{this.logLevel}));
            }
            return this;
        }

        public ConfigBuilder setHttpsOnly(boolean z) {
            this.httpsOnly = z;
            return this;
        }

        public ConfigBuilder setAdContentRating(AdContentRating adContentRating2) {
            if (adContentRating2 != null) {
                this.adContentRating = adContentRating2;
            } else {
                Log.w(LogDomain.CORE.name(), String.format("Setting adContentRating to null is ignored, current value = %s", new Object[]{this.adContentRating}));
            }
            return this;
        }

        public ConfigBuilder setUnityVersion(String str) {
            this.mUnityVersion = str;
            return this;
        }

        public ConfigBuilder addExtensionConfiguration(ExtensionConfiguration extensionConfiguration) {
            this.extensionConfigurations.add(extensionConfiguration);
            return this;
        }

        public Config build() {
            return new Config(this.logLevel, this.adContentRating, this.enableLogging, this.disableSessionTracking, this.httpsOnly, this.mUnityVersion, this.extensionConfigurations);
        }
    }
}
