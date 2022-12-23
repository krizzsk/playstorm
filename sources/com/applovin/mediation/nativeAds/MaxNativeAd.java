package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import com.applovin.mediation.MaxAdFormat;

public class MaxNativeAd {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final String title;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public MaxAdFormat f4434a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f4435b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f4436c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f4437d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f4438e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public MaxNativeAdImage f4439f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public View f4440g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public View f4441h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public View f4442i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public MaxNativeAdImage f4443j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public float f4444k;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f4434a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f4436c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f4437d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f4438e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f4439f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f4440g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f4443j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f) {
            this.f4444k = f;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f4442i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f4441h = view;
            return this;
        }

        public Builder setTitle(String str) {
            this.f4435b = str;
            return this;
        }
    }

    public static class MaxNativeAdImage {

        /* renamed from: a */
        private Drawable f4445a;

        /* renamed from: b */
        private Uri f4446b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f4445a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f4446b = uri;
        }

        public Drawable getDrawable() {
            return this.f4445a;
        }

        public Uri getUri() {
            return this.f4446b;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f4434a;
        this.title = builder.f4435b;
        this.advertiser = builder.f4436c;
        this.body = builder.f4437d;
        this.callToAction = builder.f4438e;
        this.icon = builder.f4439f;
        this.iconView = builder.f4440g;
        this.optionsView = builder.f4441h;
        this.mediaView = builder.f4442i;
        this.mainImage = builder.f4443j;
        this.mediaContentAspectRatio = builder.f4444k;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView != null && (callToActionButton = maxNativeAdView.getCallToActionButton()) != null) {
            callToActionButton.performClick();
        }
    }

    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }
}
