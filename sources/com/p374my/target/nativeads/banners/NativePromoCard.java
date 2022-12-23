package com.p374my.target.nativeads.banners;

import android.text.TextUtils;
import com.p374my.target.C9751i2;
import com.p374my.target.common.models.ImageData;

/* renamed from: com.my.target.nativeads.banners.NativePromoCard */
public class NativePromoCard {
    private final String ctaText;
    private final String description;
    private final ImageData image;
    private final String title;

    private NativePromoCard(C9751i2 i2Var) {
        if (!TextUtils.isEmpty(i2Var.getTitle())) {
            this.title = i2Var.getTitle();
        } else {
            this.title = null;
        }
        if (!TextUtils.isEmpty(i2Var.getDescription())) {
            this.description = i2Var.getDescription();
        } else {
            this.description = null;
        }
        if (!TextUtils.isEmpty(i2Var.getCtaText())) {
            this.ctaText = i2Var.getCtaText();
        } else {
            this.ctaText = null;
        }
        this.image = i2Var.getImage();
    }

    public static NativePromoCard newCard(C9751i2 i2Var) {
        return new NativePromoCard(i2Var);
    }

    public String getCtaText() {
        return this.ctaText;
    }

    public String getDescription() {
        return this.description;
    }

    public ImageData getImage() {
        return this.image;
    }

    public String getTitle() {
        return this.title;
    }
}
