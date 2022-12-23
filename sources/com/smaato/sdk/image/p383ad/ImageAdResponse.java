package com.smaato.sdk.image.p383ad;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.smaato.sdk.image.ad.ImageAdResponse */
public final class ImageAdResponse {
    private final List<String> clickTrackingUrls;
    private final String clickUrl;
    private final Object extensions;
    private final int height;
    private final String imageUrl;
    private final ImpressionCountingType impressionCountingType;
    private final List<String> impressionTrackingUrls;
    private final int width;

    private ImageAdResponse(String str, int i, int i2, String str2, List<String> list, List<String> list2, Object obj, ImpressionCountingType impressionCountingType2) {
        this.imageUrl = (String) Objects.requireNonNull(str);
        this.width = i;
        this.height = i2;
        this.clickUrl = (String) Objects.requireNonNull(str2);
        this.impressionTrackingUrls = (List) Objects.requireNonNull(list);
        this.clickTrackingUrls = (List) Objects.requireNonNull(list2);
        this.extensions = obj;
        this.impressionCountingType = impressionCountingType2;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public List<String> getImpressionTrackingUrls() {
        return this.impressionTrackingUrls;
    }

    public List<String> getClickTrackingUrls() {
        return this.clickTrackingUrls;
    }

    public ImpressionCountingType getImpressionCountingType() {
        return this.impressionCountingType;
    }

    public String toString() {
        return "ImageAdResponse{imageUrl='" + this.imageUrl + '\'' + ", width=" + this.width + ", height=" + this.height + ", clickUrl='" + this.clickUrl + '\'' + ", impressionTrackingUrls=" + this.impressionTrackingUrls + ", clickTrackingUrls=" + this.clickTrackingUrls + ", extensions=" + this.extensions + ", impressionCountingType=" + this.impressionCountingType + '}';
    }

    public Object getExtensions() {
        return this.extensions;
    }

    /* renamed from: com.smaato.sdk.image.ad.ImageAdResponse$Builder */
    public static final class Builder {
        private List<String> clickTrackingUrls;
        private String clickUrl;
        private Object extensions;
        private int height;
        private String imageUrl;
        private ImpressionCountingType impressionCountingType;
        private List<String> impressionTrackingUrls;
        private int width;

        public Builder setImageUrl(String str) {
            this.imageUrl = str;
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

        public Builder setClickUrl(String str) {
            this.clickUrl = str;
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

        public ImageAdResponse build() {
            ArrayList arrayList = new ArrayList();
            if (this.imageUrl == null) {
                arrayList.add("imageUrl");
            }
            if (this.clickUrl == null) {
                arrayList.add("clickUrl");
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
                        if (this.impressionCountingType == null) {
                            this.impressionCountingType = ImpressionCountingType.STANDARD;
                        }
                        return new ImageAdResponse(this.imageUrl, this.width, this.height, this.clickUrl, this.impressionTrackingUrls, this.clickTrackingUrls, this.extensions, this.impressionCountingType);
                    }
                    throw new IllegalStateException("clickTrackingUrls cannot be empty");
                }
                throw new IllegalStateException("impressionTrackingUrls cannot be empty");
            }
            throw new IllegalStateException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
        }
    }
}
