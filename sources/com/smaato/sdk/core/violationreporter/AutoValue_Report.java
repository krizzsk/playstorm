package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.violationreporter.Report;
import java.util.List;

final class AutoValue_Report extends Report {
    private final String adMarkup;
    private final String adSpace;
    private final String apiKey;
    private final String apiVersion;
    private final String asnId;
    private final String bundleId;
    private final String clickUrl;
    private final String creativeId;
    private final String error;
    private final String originalUrl;
    private final String platform;
    private final String publisher;
    private final String redirectUrl;
    private final String sci;
    private final String sdkVersion;
    private final String sessionId;
    private final String timestamp;
    private final List<String> traceUrls;
    private final String type;
    private final String violatedUrl;

    private AutoValue_Report(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List<String> list) {
        this.type = str;
        this.sci = str2;
        this.timestamp = str3;
        this.error = str4;
        this.sdkVersion = str5;
        this.bundleId = str6;
        this.violatedUrl = str7;
        this.publisher = str8;
        this.platform = str9;
        this.adSpace = str10;
        this.sessionId = str11;
        this.apiKey = str12;
        this.apiVersion = str13;
        this.originalUrl = str14;
        this.creativeId = str15;
        this.asnId = str16;
        this.redirectUrl = str17;
        this.clickUrl = str18;
        this.adMarkup = str19;
        this.traceUrls = list;
    }

    public String getType() {
        return this.type;
    }

    public String getSci() {
        return this.sci;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getError() {
        return this.error;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getBundleId() {
        return this.bundleId;
    }

    public String getViolatedUrl() {
        return this.violatedUrl;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getAdSpace() {
        return this.adSpace;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public String getOriginalUrl() {
        return this.originalUrl;
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public String getAsnId() {
        return this.asnId;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getAdMarkup() {
        return this.adMarkup;
    }

    public List<String> getTraceUrls() {
        return this.traceUrls;
    }

    public String toString() {
        return "Report{type=" + this.type + ", sci=" + this.sci + ", timestamp=" + this.timestamp + ", error=" + this.error + ", sdkVersion=" + this.sdkVersion + ", bundleId=" + this.bundleId + ", violatedUrl=" + this.violatedUrl + ", publisher=" + this.publisher + ", platform=" + this.platform + ", adSpace=" + this.adSpace + ", sessionId=" + this.sessionId + ", apiKey=" + this.apiKey + ", apiVersion=" + this.apiVersion + ", originalUrl=" + this.originalUrl + ", creativeId=" + this.creativeId + ", asnId=" + this.asnId + ", redirectUrl=" + this.redirectUrl + ", clickUrl=" + this.clickUrl + ", adMarkup=" + this.adMarkup + ", traceUrls=" + this.traceUrls + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Report)) {
            return false;
        }
        Report report = (Report) obj;
        if (!this.type.equals(report.getType()) || !this.sci.equals(report.getSci()) || !this.timestamp.equals(report.getTimestamp()) || !this.error.equals(report.getError()) || !this.sdkVersion.equals(report.getSdkVersion()) || !this.bundleId.equals(report.getBundleId()) || !this.violatedUrl.equals(report.getViolatedUrl()) || !this.publisher.equals(report.getPublisher()) || !this.platform.equals(report.getPlatform()) || !this.adSpace.equals(report.getAdSpace()) || !this.sessionId.equals(report.getSessionId()) || !this.apiKey.equals(report.getApiKey()) || !this.apiVersion.equals(report.getApiVersion()) || !this.originalUrl.equals(report.getOriginalUrl()) || !this.creativeId.equals(report.getCreativeId()) || !this.asnId.equals(report.getAsnId()) || !this.redirectUrl.equals(report.getRedirectUrl()) || !this.clickUrl.equals(report.getClickUrl()) || !this.adMarkup.equals(report.getAdMarkup()) || !this.traceUrls.equals(report.getTraceUrls())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.sci.hashCode()) * 1000003) ^ this.timestamp.hashCode()) * 1000003) ^ this.error.hashCode()) * 1000003) ^ this.sdkVersion.hashCode()) * 1000003) ^ this.bundleId.hashCode()) * 1000003) ^ this.violatedUrl.hashCode()) * 1000003) ^ this.publisher.hashCode()) * 1000003) ^ this.platform.hashCode()) * 1000003) ^ this.adSpace.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.apiKey.hashCode()) * 1000003) ^ this.apiVersion.hashCode()) * 1000003) ^ this.originalUrl.hashCode()) * 1000003) ^ this.creativeId.hashCode()) * 1000003) ^ this.asnId.hashCode()) * 1000003) ^ this.redirectUrl.hashCode()) * 1000003) ^ this.clickUrl.hashCode()) * 1000003) ^ this.adMarkup.hashCode()) * 1000003) ^ this.traceUrls.hashCode();
    }

    static final class Builder extends Report.Builder {
        private String adMarkup;
        private String adSpace;
        private String apiKey;
        private String apiVersion;
        private String asnId;
        private String bundleId;
        private String clickUrl;
        private String creativeId;
        private String error;
        private String originalUrl;
        private String platform;
        private String publisher;
        private String redirectUrl;
        private String sci;
        private String sdkVersion;
        private String sessionId;
        private String timestamp;
        private List<String> traceUrls;
        private String type;
        private String violatedUrl;

        Builder() {
        }

        public Report.Builder setType(String str) {
            if (str != null) {
                this.type = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public Report.Builder setSci(String str) {
            if (str != null) {
                this.sci = str;
                return this;
            }
            throw new NullPointerException("Null sci");
        }

        public Report.Builder setTimestamp(String str) {
            if (str != null) {
                this.timestamp = str;
                return this;
            }
            throw new NullPointerException("Null timestamp");
        }

        public Report.Builder setError(String str) {
            if (str != null) {
                this.error = str;
                return this;
            }
            throw new NullPointerException("Null error");
        }

        public Report.Builder setSdkVersion(String str) {
            if (str != null) {
                this.sdkVersion = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        public Report.Builder setBundleId(String str) {
            if (str != null) {
                this.bundleId = str;
                return this;
            }
            throw new NullPointerException("Null bundleId");
        }

        public Report.Builder setViolatedUrl(String str) {
            if (str != null) {
                this.violatedUrl = str;
                return this;
            }
            throw new NullPointerException("Null violatedUrl");
        }

        public Report.Builder setPublisher(String str) {
            if (str != null) {
                this.publisher = str;
                return this;
            }
            throw new NullPointerException("Null publisher");
        }

        public Report.Builder setPlatform(String str) {
            if (str != null) {
                this.platform = str;
                return this;
            }
            throw new NullPointerException("Null platform");
        }

        public Report.Builder setAdSpace(String str) {
            if (str != null) {
                this.adSpace = str;
                return this;
            }
            throw new NullPointerException("Null adSpace");
        }

        public Report.Builder setSessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public Report.Builder setApiKey(String str) {
            if (str != null) {
                this.apiKey = str;
                return this;
            }
            throw new NullPointerException("Null apiKey");
        }

        public Report.Builder setApiVersion(String str) {
            if (str != null) {
                this.apiVersion = str;
                return this;
            }
            throw new NullPointerException("Null apiVersion");
        }

        public Report.Builder setOriginalUrl(String str) {
            if (str != null) {
                this.originalUrl = str;
                return this;
            }
            throw new NullPointerException("Null originalUrl");
        }

        public Report.Builder setCreativeId(String str) {
            if (str != null) {
                this.creativeId = str;
                return this;
            }
            throw new NullPointerException("Null creativeId");
        }

        public Report.Builder setAsnId(String str) {
            if (str != null) {
                this.asnId = str;
                return this;
            }
            throw new NullPointerException("Null asnId");
        }

        public Report.Builder setRedirectUrl(String str) {
            if (str != null) {
                this.redirectUrl = str;
                return this;
            }
            throw new NullPointerException("Null redirectUrl");
        }

        public Report.Builder setClickUrl(String str) {
            if (str != null) {
                this.clickUrl = str;
                return this;
            }
            throw new NullPointerException("Null clickUrl");
        }

        public Report.Builder setAdMarkup(String str) {
            if (str != null) {
                this.adMarkup = str;
                return this;
            }
            throw new NullPointerException("Null adMarkup");
        }

        public Report.Builder setTraceUrls(List<String> list) {
            if (list != null) {
                this.traceUrls = list;
                return this;
            }
            throw new NullPointerException("Null traceUrls");
        }

        public Report build() {
            String str = "";
            if (this.type == null) {
                str = str + " type";
            }
            if (this.sci == null) {
                str = str + " sci";
            }
            if (this.timestamp == null) {
                str = str + " timestamp";
            }
            if (this.error == null) {
                str = str + " error";
            }
            if (this.sdkVersion == null) {
                str = str + " sdkVersion";
            }
            if (this.bundleId == null) {
                str = str + " bundleId";
            }
            if (this.violatedUrl == null) {
                str = str + " violatedUrl";
            }
            if (this.publisher == null) {
                str = str + " publisher";
            }
            if (this.platform == null) {
                str = str + " platform";
            }
            if (this.adSpace == null) {
                str = str + " adSpace";
            }
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (this.apiKey == null) {
                str = str + " apiKey";
            }
            if (this.apiVersion == null) {
                str = str + " apiVersion";
            }
            if (this.originalUrl == null) {
                str = str + " originalUrl";
            }
            if (this.creativeId == null) {
                str = str + " creativeId";
            }
            if (this.asnId == null) {
                str = str + " asnId";
            }
            if (this.redirectUrl == null) {
                str = str + " redirectUrl";
            }
            if (this.clickUrl == null) {
                str = str + " clickUrl";
            }
            if (this.adMarkup == null) {
                str = str + " adMarkup";
            }
            if (this.traceUrls == null) {
                str = str + " traceUrls";
            }
            if (str.isEmpty()) {
                return new AutoValue_Report(this.type, this.sci, this.timestamp, this.error, this.sdkVersion, this.bundleId, this.violatedUrl, this.publisher, this.platform, this.adSpace, this.sessionId, this.apiKey, this.apiVersion, this.originalUrl, this.creativeId, this.asnId, this.redirectUrl, this.clickUrl, this.adMarkup, this.traceUrls);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
