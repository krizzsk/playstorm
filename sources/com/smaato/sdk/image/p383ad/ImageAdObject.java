package com.smaato.sdk.image.p383ad;

import android.graphics.Bitmap;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.p378ad.AdObject;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.smaato.sdk.image.ad.ImageAdObject */
public final class ImageAdObject implements AdObject {
    private final Bitmap bitmap;
    private final List<String> clickTrackingUrls;
    private final String clickUrl;
    private final Object extensions;
    private final int height;
    private final String imageUrl;
    private final ImpressionCountingType impressionCountingType;
    private final List<String> impressionTrackingUrls;
    private final SomaApiContext somaApiContext;
    private final int width;

    private ImageAdObject(SomaApiContext somaApiContext2, String str, Bitmap bitmap2, int i, int i2, String str2, List<String> list, List<String> list2, Object obj, ImpressionCountingType impressionCountingType2) {
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.imageUrl = (String) Objects.requireNonNull(str);
        this.bitmap = (Bitmap) Objects.requireNonNull(bitmap2);
        this.width = i;
        this.height = i2;
        this.clickUrl = (String) Objects.requireNonNull(str2);
        this.impressionTrackingUrls = (List) Objects.requireNonNull(list);
        this.clickTrackingUrls = (List) Objects.requireNonNull(list2);
        this.extensions = obj;
        this.impressionCountingType = impressionCountingType2;
    }

    public SomaApiContext getSomaApiContext() {
        return this.somaApiContext;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
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

    public Object getExtensions() {
        return this.extensions;
    }

    public ImpressionCountingType getImpressionCountingType() {
        return this.impressionCountingType;
    }

    public String toString() {
        return "ImageAdObject{somaApiContext=" + this.somaApiContext + ", imageUrl='" + this.imageUrl + '\'' + ", bitmap=" + this.bitmap + ", width=" + this.width + ", height=" + this.height + ", clickUrl='" + this.clickUrl + '\'' + ", impressionTrackingUrls=" + this.impressionTrackingUrls + ", clickTrackingUrls=" + this.clickTrackingUrls + ", extensions=" + this.extensions + ", impressionCountingType=" + this.impressionCountingType + '}';
    }

    /* renamed from: com.smaato.sdk.image.ad.ImageAdObject$Builder */
    public static final class Builder {
        private Bitmap bitmap;
        private List<String> clickTrackingUrls;
        private String clickUrl;
        private Object extensions;
        private int height;
        private String imageUrl;
        private ImpressionCountingType impressionCountingType;
        private List<String> impressionTrackingUrls;
        private SomaApiContext somaApiContext;
        private int width;

        public Builder setImageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public Builder setSomaApiContext(SomaApiContext somaApiContext2) {
            this.somaApiContext = somaApiContext2;
            return this;
        }

        public Builder setBitmap(Bitmap bitmap2) {
            this.bitmap = bitmap2;
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

        public ImageAdObject build() {
            ArrayList arrayList = new ArrayList();
            if (this.somaApiContext == null) {
                arrayList.add("somaApiContext");
            }
            if (this.imageUrl == null) {
                arrayList.add("imageUrl");
            }
            if (this.bitmap == null) {
                arrayList.add("bitmap");
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
                        return new ImageAdObject(this.somaApiContext, this.imageUrl, this.bitmap, this.width, this.height, this.clickUrl, this.impressionTrackingUrls, this.clickTrackingUrls, this.extensions, this.impressionCountingType);
                    }
                    throw new IllegalStateException("clickTrackingUrls cannot be empty");
                }
                throw new IllegalStateException("impressionTrackingUrls cannot be empty");
            }
            throw new IllegalStateException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
        }
    }
}
