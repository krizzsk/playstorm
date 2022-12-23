package com.p374my.target.nativeads.banners;

import android.text.TextUtils;
import com.p374my.target.C9733h2;
import com.p374my.target.C9751i2;
import com.p374my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.nativeads.banners.NativePromoBanner */
public class NativePromoBanner extends NativeBanner {
    private String category;
    private boolean hasVideo;
    private ImageData image;
    private ArrayList<NativePromoCard> nativePromoCards;
    private String subCategory;

    /* renamed from: com.my.target.nativeads.banners.NativePromoBanner$Builder */
    public static final class Builder {
        private String advertisingLabel;
        private String ageRestrictions;
        private String ctaText;
        private String description;
        private String disclaimer;
        private String domain;
        private boolean hasVideo;
        private ImageData icon;
        private ImageData image;
        private String navigationType = "web";
        private float rating;
        private String title;
        private int votes;

        private Builder() {
        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public NativePromoBanner build() {
            return new NativePromoBanner(this.title, this.ctaText, this.domain, this.advertisingLabel, this.icon, this.rating, this.ageRestrictions, this.disclaimer, this.votes, this.navigationType, this.hasVideo, this.description, this.image);
        }

        public Builder setAdvertisingLabel(String str) {
            this.advertisingLabel = str;
            return this;
        }

        public Builder setAgeRestrictions(String str) {
            this.ageRestrictions = str;
            return this;
        }

        public Builder setCtaText(String str) {
            this.ctaText = str;
            return this;
        }

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setDisclaimer(String str) {
            this.disclaimer = str;
            return this;
        }

        public Builder setDomain(String str) {
            this.domain = str;
            return this;
        }

        public Builder setHasVideo(boolean z) {
            this.hasVideo = z;
            return this;
        }

        public Builder setIcon(ImageData imageData) {
            this.icon = imageData;
            return this;
        }

        public Builder setImage(ImageData imageData) {
            this.image = imageData;
            return this;
        }

        public Builder setNavigationType(String str) {
            if ("web".equals(str) || "store".equals(str)) {
                this.navigationType = str;
            }
            return this;
        }

        public Builder setRating(float f) {
            this.rating = f;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVotes(int i) {
            this.votes = i;
            return this;
        }
    }

    private NativePromoBanner(C9733h2 h2Var) {
        super(h2Var);
        this.nativePromoCards = new ArrayList<>();
        this.hasVideo = h2Var.getVideoBanner() != null;
        String category2 = h2Var.getCategory();
        String str = null;
        this.category = TextUtils.isEmpty(category2) ? null : category2;
        String subCategory2 = h2Var.getSubCategory();
        this.subCategory = !TextUtils.isEmpty(subCategory2) ? subCategory2 : str;
        this.image = h2Var.getImage();
        processCards(h2Var);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NativePromoBanner(String str, String str2, String str3, String str4, ImageData imageData, float f, String str5, String str6, int i, String str7, boolean z, String str8, ImageData imageData2) {
        super(str, str2, str8, str3, str4, imageData, f, str5, str6, i, str7);
        this.nativePromoCards = new ArrayList<>();
        this.hasVideo = z;
        this.image = imageData2;
    }

    public static NativePromoBanner newBanner(C9733h2 h2Var) {
        return new NativePromoBanner(h2Var);
    }

    private void processCards(C9733h2 h2Var) {
        if (!this.hasVideo) {
            List<C9751i2> nativeAdCards = h2Var.getNativeAdCards();
            if (!nativeAdCards.isEmpty()) {
                for (C9751i2 newCard : nativeAdCards) {
                    this.nativePromoCards.add(NativePromoCard.newCard(newCard));
                }
            }
        }
    }

    public ArrayList<NativePromoCard> getCards() {
        return this.nativePromoCards;
    }

    public String getCategory() {
        return this.category;
    }

    public ImageData getImage() {
        return this.image;
    }

    public String getSubCategory() {
        return this.subCategory;
    }

    public boolean hasVideo() {
        return this.hasVideo;
    }
}
