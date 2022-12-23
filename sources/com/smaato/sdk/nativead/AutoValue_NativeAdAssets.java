package com.smaato.sdk.nativead;

import com.smaato.sdk.nativead.NativeAdAssets;
import java.util.List;

final class AutoValue_NativeAdAssets extends NativeAdAssets {
    private final String cta;
    private final NativeAdAssets.Image icon;
    private final List<NativeAdAssets.Image> images;
    private final String mraidJs;
    private final Double rating;
    private final String sponsored;
    private final String text;
    private final String title;
    private final String vastTag;

    private AutoValue_NativeAdAssets(String str, String str2, String str3, String str4, String str5, String str6, NativeAdAssets.Image image, List<NativeAdAssets.Image> list, Double d) {
        this.title = str;
        this.mraidJs = str2;
        this.vastTag = str3;
        this.text = str4;
        this.sponsored = str5;
        this.cta = str6;
        this.icon = image;
        this.images = list;
        this.rating = d;
    }

    public String title() {
        return this.title;
    }

    public String mraidJs() {
        return this.mraidJs;
    }

    public String vastTag() {
        return this.vastTag;
    }

    public String text() {
        return this.text;
    }

    public String sponsored() {
        return this.sponsored;
    }

    public String cta() {
        return this.cta;
    }

    public NativeAdAssets.Image icon() {
        return this.icon;
    }

    public List<NativeAdAssets.Image> images() {
        return this.images;
    }

    public Double rating() {
        return this.rating;
    }

    public String toString() {
        return "NativeAdAssets{title=" + this.title + ", mraidJs=" + this.mraidJs + ", vastTag=" + this.vastTag + ", text=" + this.text + ", sponsored=" + this.sponsored + ", cta=" + this.cta + ", icon=" + this.icon + ", images=" + this.images + ", rating=" + this.rating + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdAssets)) {
            return false;
        }
        NativeAdAssets nativeAdAssets = (NativeAdAssets) obj;
        String str = this.title;
        if (str != null ? str.equals(nativeAdAssets.title()) : nativeAdAssets.title() == null) {
            String str2 = this.mraidJs;
            if (str2 != null ? str2.equals(nativeAdAssets.mraidJs()) : nativeAdAssets.mraidJs() == null) {
                String str3 = this.vastTag;
                if (str3 != null ? str3.equals(nativeAdAssets.vastTag()) : nativeAdAssets.vastTag() == null) {
                    String str4 = this.text;
                    if (str4 != null ? str4.equals(nativeAdAssets.text()) : nativeAdAssets.text() == null) {
                        String str5 = this.sponsored;
                        if (str5 != null ? str5.equals(nativeAdAssets.sponsored()) : nativeAdAssets.sponsored() == null) {
                            String str6 = this.cta;
                            if (str6 != null ? str6.equals(nativeAdAssets.cta()) : nativeAdAssets.cta() == null) {
                                NativeAdAssets.Image image = this.icon;
                                if (image != null ? image.equals(nativeAdAssets.icon()) : nativeAdAssets.icon() == null) {
                                    if (this.images.equals(nativeAdAssets.images())) {
                                        Double d = this.rating;
                                        if (d == null) {
                                            if (nativeAdAssets.rating() == null) {
                                                return true;
                                            }
                                        } else if (d.equals(nativeAdAssets.rating())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mraidJs;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.vastTag;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.text;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.sponsored;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.cta;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        NativeAdAssets.Image image = this.icon;
        int hashCode7 = (((hashCode6 ^ (image == null ? 0 : image.hashCode())) * 1000003) ^ this.images.hashCode()) * 1000003;
        Double d = this.rating;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode7 ^ i;
    }

    static final class Builder extends NativeAdAssets.Builder {
        private String cta;
        private NativeAdAssets.Image icon;
        private List<NativeAdAssets.Image> images;
        private String mraidJs;
        private Double rating;
        private String sponsored;
        private String text;
        private String title;
        private String vastTag;

        Builder() {
        }

        public NativeAdAssets.Builder title(String str) {
            this.title = str;
            return this;
        }

        public NativeAdAssets.Builder mraidJs(String str) {
            this.mraidJs = str;
            return this;
        }

        public NativeAdAssets.Builder vastTag(String str) {
            this.vastTag = str;
            return this;
        }

        public NativeAdAssets.Builder text(String str) {
            this.text = str;
            return this;
        }

        public NativeAdAssets.Builder sponsored(String str) {
            this.sponsored = str;
            return this;
        }

        public NativeAdAssets.Builder cta(String str) {
            this.cta = str;
            return this;
        }

        public NativeAdAssets.Builder icon(NativeAdAssets.Image image) {
            this.icon = image;
            return this;
        }

        public NativeAdAssets.Builder images(List<NativeAdAssets.Image> list) {
            if (list != null) {
                this.images = list;
                return this;
            }
            throw new NullPointerException("Null images");
        }

        public NativeAdAssets.Builder rating(Double d) {
            this.rating = d;
            return this;
        }

        public NativeAdAssets build() {
            String str = "";
            if (this.images == null) {
                str = str + " images";
            }
            if (str.isEmpty()) {
                return new AutoValue_NativeAdAssets(this.title, this.mraidJs, this.vastTag, this.text, this.sponsored, this.cta, this.icon, this.images, this.rating);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
