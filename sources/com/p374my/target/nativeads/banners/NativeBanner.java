package com.p374my.target.nativeads.banners;

import android.text.TextUtils;
import com.p374my.target.C9733h2;
import com.p374my.target.common.models.ImageData;

/* renamed from: com.my.target.nativeads.banners.NativeBanner */
public class NativeBanner {
    /* access modifiers changed from: private */
    public String advertisingLabel;
    /* access modifiers changed from: private */
    public String ageRestrictions;
    /* access modifiers changed from: private */
    public String ctaText;
    /* access modifiers changed from: private */
    public String description;
    /* access modifiers changed from: private */
    public String disclaimer;
    /* access modifiers changed from: private */
    public String domain;
    /* access modifiers changed from: private */
    public ImageData icon;
    /* access modifiers changed from: private */
    public String navigationType = "web";
    /* access modifiers changed from: private */
    public float rating;
    /* access modifiers changed from: private */
    public String title;
    /* access modifiers changed from: private */
    public int votes;

    /* renamed from: com.my.target.nativeads.banners.NativeBanner$Builder */
    public static final class Builder {
        public final NativeBanner banner = new NativeBanner();

        private Builder() {
        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public NativeBanner build() {
            return this.banner;
        }

        public Builder setAdvertisingLabel(String str) {
            String unused = this.banner.advertisingLabel = str;
            return this;
        }

        public Builder setAgeRestrictions(String str) {
            String unused = this.banner.ageRestrictions = str;
            return this;
        }

        public Builder setCtaText(String str) {
            String unused = this.banner.ctaText = str;
            return this;
        }

        public Builder setDescription(String str) {
            String unused = this.banner.description = str;
            return this;
        }

        public Builder setDisclaimer(String str) {
            String unused = this.banner.disclaimer = str;
            return this;
        }

        public Builder setDomain(String str) {
            String unused = this.banner.domain = str;
            return this;
        }

        public Builder setIcon(ImageData imageData) {
            ImageData unused = this.banner.icon = imageData;
            return this;
        }

        public Builder setNavigationType(String str) {
            if ("web".equals(str) || "store".equals(str)) {
                String unused = this.banner.navigationType = str;
            }
            return this;
        }

        public Builder setRating(float f) {
            float unused = this.banner.rating = f;
            return this;
        }

        public Builder setTitle(String str) {
            String unused = this.banner.title = str;
            return this;
        }

        public Builder setVotes(int i) {
            int unused = this.banner.votes = i;
            return this;
        }
    }

    public NativeBanner() {
    }

    public NativeBanner(C9733h2 h2Var) {
        this.navigationType = h2Var.getNavigationType();
        this.rating = h2Var.getRating();
        this.votes = h2Var.getVotes();
        String title2 = h2Var.getTitle();
        String str = null;
        this.title = TextUtils.isEmpty(title2) ? null : title2;
        String ctaText2 = h2Var.getCtaText();
        this.ctaText = TextUtils.isEmpty(ctaText2) ? null : ctaText2;
        String description2 = h2Var.getDescription();
        this.description = TextUtils.isEmpty(description2) ? null : description2;
        String disclaimer2 = h2Var.getDisclaimer();
        this.disclaimer = TextUtils.isEmpty(disclaimer2) ? null : disclaimer2;
        String ageRestrictions2 = h2Var.getAgeRestrictions();
        this.ageRestrictions = TextUtils.isEmpty(ageRestrictions2) ? null : ageRestrictions2;
        String domain2 = h2Var.getDomain();
        this.domain = TextUtils.isEmpty(domain2) ? null : domain2;
        String advertisingLabel2 = h2Var.getAdvertisingLabel();
        this.advertisingLabel = !TextUtils.isEmpty(advertisingLabel2) ? advertisingLabel2 : str;
        this.icon = h2Var.getIcon();
    }

    public NativeBanner(String str, String str2, String str3, String str4, String str5, ImageData imageData, float f, String str6, String str7, int i, String str8) {
        this.title = str;
        this.ctaText = str2;
        this.description = str3;
        this.domain = str4;
        this.advertisingLabel = str5;
        this.icon = imageData;
        this.rating = f;
        this.ageRestrictions = str6;
        this.disclaimer = str7;
        this.votes = i;
        this.navigationType = str8;
    }

    public static NativeBanner newBanner(C9733h2 h2Var) {
        return new NativeBanner(h2Var);
    }

    public String getAdvertisingLabel() {
        return this.advertisingLabel;
    }

    public String getAgeRestrictions() {
        return this.ageRestrictions;
    }

    public String getCtaText() {
        return this.ctaText;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisclaimer() {
        return this.disclaimer;
    }

    public String getDomain() {
        return this.domain;
    }

    public ImageData getIcon() {
        return this.icon;
    }

    public String getNavigationType() {
        return this.navigationType;
    }

    public float getRating() {
        return this.rating;
    }

    public String getTitle() {
        return this.title;
    }

    public int getVotes() {
        return this.votes;
    }
}
