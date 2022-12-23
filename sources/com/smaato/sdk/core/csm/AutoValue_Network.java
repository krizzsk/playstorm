package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.csm.Network;

final class AutoValue_Network extends Network {
    private final String adUnitId;
    private final String className;
    private final String clickUrl;
    private final String customData;
    private final int height;
    private final String impression;
    private final String name;
    private final int priority;
    private final int width;

    private AutoValue_Network(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        this.name = str;
        this.impression = str2;
        this.clickUrl = str3;
        this.adUnitId = str4;
        this.className = str5;
        this.customData = str6;
        this.priority = i;
        this.width = i2;
        this.height = i3;
    }

    public String getName() {
        return this.name;
    }

    public String getImpression() {
        return this.impression;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public String getClassName() {
        return this.className;
    }

    public String getCustomData() {
        return this.customData;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String toString() {
        return "Network{name=" + this.name + ", impression=" + this.impression + ", clickUrl=" + this.clickUrl + ", adUnitId=" + this.adUnitId + ", className=" + this.className + ", customData=" + this.customData + ", priority=" + this.priority + ", width=" + this.width + ", height=" + this.height + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        if (!this.name.equals(network.getName()) || !this.impression.equals(network.getImpression()) || !this.clickUrl.equals(network.getClickUrl()) || ((str = this.adUnitId) != null ? !str.equals(network.getAdUnitId()) : network.getAdUnitId() != null) || ((str2 = this.className) != null ? !str2.equals(network.getClassName()) : network.getClassName() != null) || ((str3 = this.customData) != null ? !str3.equals(network.getCustomData()) : network.getCustomData() != null) || this.priority != network.getPriority() || this.width != network.getWidth() || this.height != network.getHeight()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.impression.hashCode()) * 1000003) ^ this.clickUrl.hashCode()) * 1000003;
        String str = this.adUnitId;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.className;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.customData;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((hashCode3 ^ i) * 1000003) ^ this.priority) * 1000003) ^ this.width) * 1000003) ^ this.height;
    }

    static final class Builder extends Network.Builder {
        private String adUnitId;
        private String className;
        private String clickUrl;
        private String customData;
        private Integer height;
        private String impression;
        private String name;
        private Integer priority;
        private Integer width;

        Builder() {
        }

        public Network.Builder setName(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public Network.Builder setImpression(String str) {
            if (str != null) {
                this.impression = str;
                return this;
            }
            throw new NullPointerException("Null impression");
        }

        public Network.Builder setClickUrl(String str) {
            if (str != null) {
                this.clickUrl = str;
                return this;
            }
            throw new NullPointerException("Null clickUrl");
        }

        public Network.Builder setAdUnitId(String str) {
            this.adUnitId = str;
            return this;
        }

        public Network.Builder setClassName(String str) {
            this.className = str;
            return this;
        }

        public Network.Builder setCustomData(String str) {
            this.customData = str;
            return this;
        }

        public Network.Builder setPriority(int i) {
            this.priority = Integer.valueOf(i);
            return this;
        }

        public Network.Builder setWidth(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }

        public Network.Builder setHeight(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        public Network build() {
            String str = "";
            if (this.name == null) {
                str = str + " name";
            }
            if (this.impression == null) {
                str = str + " impression";
            }
            if (this.clickUrl == null) {
                str = str + " clickUrl";
            }
            if (this.priority == null) {
                str = str + " priority";
            }
            if (this.width == null) {
                str = str + " width";
            }
            if (this.height == null) {
                str = str + " height";
            }
            if (str.isEmpty()) {
                return new AutoValue_Network(this.name, this.impression, this.clickUrl, this.adUnitId, this.className, this.customData, this.priority.intValue(), this.width.intValue(), this.height.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
