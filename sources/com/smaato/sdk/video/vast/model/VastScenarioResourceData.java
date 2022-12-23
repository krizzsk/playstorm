package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;

public final class VastScenarioResourceData {
    public final String htmlResources;
    public final String iFrameResources;
    public final StaticResource staticResources;

    private VastScenarioResourceData(StaticResource staticResource, String str, String str2) {
        this.staticResources = staticResource;
        this.iFrameResources = str;
        this.htmlResources = str2;
    }

    public static class Builder {
        private String htmlResources;
        private String iFrameResources;
        private StaticResource staticResources;

        public Builder setStaticResource(StaticResource staticResource) {
            this.staticResources = staticResource;
            return this;
        }

        public Builder setIFrameResources(String str) {
            this.iFrameResources = str;
            return this;
        }

        public Builder setHtmlResources(String str) {
            this.htmlResources = str;
            return this;
        }

        public VastScenarioResourceData build() throws VastElementMissingException {
            StaticResource staticResource = this.staticResources;
            if (staticResource != null || this.iFrameResources != null || this.htmlResources != null) {
                return new VastScenarioResourceData(staticResource, this.iFrameResources, this.htmlResources);
            }
            throw new VastElementMissingException("Cannot build VastScenarioResourceData: staticResources, iFrameResources and htmlResources are missing");
        }
    }
}
