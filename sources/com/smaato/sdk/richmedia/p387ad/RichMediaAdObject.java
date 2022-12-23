package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.p378ad.AdObject;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdObject */
public final class RichMediaAdObject implements AdObject {
    public static final String IGNORE_URL = "https://ignore.me.smaato.com";
    private final List<String> clickTrackingUrls;
    private final String content;
    private final Object extensions;
    private final int height;
    private ImpressionCountingType impressionCountingType;
    private final List<String> impressionTrackingUrls;
    private final SomaApiContext somaApiContext;
    private final String webViewKey;
    private final int width;

    private RichMediaAdObject(SomaApiContext somaApiContext2, String str, int i, int i2, List<String> list, List<String> list2, String str2, Object obj, ImpressionCountingType impressionCountingType2) {
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.content = (String) Objects.requireNonNull(str);
        this.width = i;
        this.height = i2;
        this.impressionTrackingUrls = (List) Objects.requireNonNull(list);
        this.clickTrackingUrls = (List) Objects.requireNonNull(list2);
        this.webViewKey = (String) Objects.requireNonNull(str2);
        this.extensions = obj;
        this.impressionCountingType = impressionCountingType2;
    }

    public SomaApiContext getSomaApiContext() {
        return this.somaApiContext;
    }

    public String getContent() {
        return this.content;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public List<String> getImpressionTrackingUrls() {
        return removeIgnoredUrls(this.impressionTrackingUrls);
    }

    public List<String> getClickTrackingUrls() {
        return removeIgnoredUrls(this.clickTrackingUrls);
    }

    public Object getExtensions() {
        return this.extensions;
    }

    public String getWebViewKey() {
        return this.webViewKey;
    }

    public ImpressionCountingType getImpressionCountingType() {
        return this.impressionCountingType;
    }

    public String toString() {
        return "RichMediaAdObject{somaApiContext=" + this.somaApiContext + ", content='" + this.content + '\'' + ", width=" + this.width + ", height=" + this.height + ", impressionTrackingUrls=" + this.impressionTrackingUrls + ", clickTrackingUrls=" + this.clickTrackingUrls + ", extensions=" + this.extensions + ", webViewKey='" + this.webViewKey + '\'' + ", impressionCountingType='" + this.impressionCountingType + '}';
    }

    private List<String> removeIgnoredUrls(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (!next.equals(IGNORE_URL)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdObject$Builder */
    public static final class Builder {
        private List<String> clickTrackingUrls;
        private String content;
        private Object extensions;
        private int height;
        private ImpressionCountingType impressionCountingType;
        private List<String> impressionTrackingUrls;
        private SomaApiContext somaApiContext;
        private String webViewKey;
        private int width;

        public Builder setSomaApiContext(SomaApiContext somaApiContext2) {
            this.somaApiContext = somaApiContext2;
            return this;
        }

        public Builder setContent(String str) {
            this.content = str;
            return this;
        }

        public Builder setWidth(int i) {
            this.width = i;
            return this;
        }

        public Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public Builder setImpressionTrackingUrls(List<String> list) {
            this.impressionTrackingUrls = list;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setExtensions(Object obj) {
            this.extensions = obj;
            return this;
        }

        public Builder setWebViewKey(String str) {
            this.webViewKey = str;
            return this;
        }

        public Builder setImpressionCountingType(ImpressionCountingType impressionCountingType2) {
            this.impressionCountingType = impressionCountingType2;
            return this;
        }

        public RichMediaAdObject build() {
            ArrayList arrayList = new ArrayList();
            if (this.somaApiContext == null) {
                arrayList.add("somaApiContext");
            }
            if (this.content == null) {
                arrayList.add("content");
            }
            if (this.impressionTrackingUrls == null) {
                arrayList.add("impressionTrackingUrls");
            }
            if (this.clickTrackingUrls == null) {
                arrayList.add("clickTrackingUrls");
            }
            if (this.webViewKey == null) {
                arrayList.add("webViewKey");
            }
            if (arrayList.isEmpty()) {
                List<String> list = this.impressionTrackingUrls;
                if (list == null || !list.isEmpty()) {
                    List<String> list2 = this.clickTrackingUrls;
                    if (list2 == null || !list2.isEmpty()) {
                        if (this.impressionCountingType == null) {
                            this.impressionCountingType = ImpressionCountingType.STANDARD;
                        }
                        return new RichMediaAdObject(this.somaApiContext, this.content, this.width, this.height, this.impressionTrackingUrls, this.clickTrackingUrls, this.webViewKey, this.extensions, this.impressionCountingType);
                    }
                    throw new IllegalStateException("clickTrackingUrls cannot be empty");
                }
                throw new IllegalStateException("impressionTrackingUrls cannot be empty");
            }
            throw new IllegalStateException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
        }
    }
}
