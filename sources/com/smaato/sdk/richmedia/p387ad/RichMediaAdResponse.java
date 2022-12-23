package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdResponse */
final class RichMediaAdResponse {
    private final List<String> clickTrackingUrls;
    private final String content;
    private final Object extensions;
    private final int height;
    private final ImpressionCountingType impressionCountingType;
    private final List<String> impressionTrackingUrls;
    private final int width;

    private RichMediaAdResponse(String str, int i, int i2, List<String> list, List<String> list2, Object obj, ImpressionCountingType impressionCountingType2) {
        this.content = (String) Objects.requireNonNull(str);
        this.width = i;
        this.height = i2;
        this.impressionTrackingUrls = (List) Objects.requireNonNull(list);
        this.clickTrackingUrls = (List) Objects.requireNonNull(list2);
        this.extensions = obj;
        this.impressionCountingType = impressionCountingType2;
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
        return this.impressionTrackingUrls;
    }

    public List<String> getClickTrackingUrls() {
        return this.clickTrackingUrls;
    }

    public String toString() {
        return "RichMediaAdResponse{content='" + this.content + '\'' + ", width=" + this.width + ", height=" + this.height + ", impressionTrackingUrls=" + this.impressionTrackingUrls + ", clickTrackingUrls=" + this.clickTrackingUrls + ", extensions=" + this.extensions + '}';
    }

    public Object getExtensions() {
        return this.extensions;
    }

    public ImpressionCountingType getImpressionCountingType() {
        return this.impressionCountingType;
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdResponse$Builder */
    public static final class Builder {
        private List<String> clickTrackingUrls;
        private String content;
        private Object extensions;
        private int height;
        private ImpressionCountingType impressionCountingType;
        private List<String> impressionTrackingUrls;
        private int width;

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

        public Builder setImpressionCountingType(ImpressionCountingType impressionCountingType2) {
            this.impressionCountingType = impressionCountingType2;
            return this;
        }

        public RichMediaAdResponse build() {
            ArrayList arrayList = new ArrayList();
            if (this.content == null) {
                arrayList.add("content");
            }
            if (this.impressionTrackingUrls == null) {
                arrayList.add("impressionTrackingUrls");
            }
            if (this.clickTrackingUrls == null) {
                arrayList.add("clickTrackingUrls");
            }
            if (arrayList.isEmpty()) {
                List<String> list = this.impressionTrackingUrls;
                if (list == null || !list.isEmpty()) {
                    List<String> list2 = this.clickTrackingUrls;
                    if (list2 == null || !list2.isEmpty()) {
                        return new RichMediaAdResponse(this.content, this.width, this.height, this.impressionTrackingUrls, this.clickTrackingUrls, this.extensions, this.impressionCountingType);
                    }
                    throw new IllegalStateException("clickTrackingUrls cannot be empty");
                }
                throw new IllegalStateException("impressionTrackingUrls cannot be empty");
            }
            throw new IllegalStateException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
        }
    }
}
