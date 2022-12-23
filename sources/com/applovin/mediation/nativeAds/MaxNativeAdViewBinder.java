package com.applovin.mediation.nativeAds;

import android.view.View;

public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a */
        private final View f4464a;

        /* renamed from: b */
        private final int f4465b;

        /* renamed from: c */
        private int f4466c;

        /* renamed from: d */
        private int f4467d;

        /* renamed from: e */
        private int f4468e;

        /* renamed from: f */
        private int f4469f;

        /* renamed from: g */
        private int f4470g;

        /* renamed from: h */
        private int f4471h;

        /* renamed from: i */
        private int f4472i;

        /* renamed from: j */
        private int f4473j;

        /* renamed from: k */
        private int f4474k;

        /* renamed from: l */
        private int f4475l;

        /* renamed from: m */
        private String f4476m;

        public Builder(int i) {
            this(i, (View) null);
        }

        private Builder(int i, View view) {
            this.f4466c = -1;
            this.f4467d = -1;
            this.f4468e = -1;
            this.f4469f = -1;
            this.f4470g = -1;
            this.f4471h = -1;
            this.f4472i = -1;
            this.f4473j = -1;
            this.f4474k = -1;
            this.f4475l = -1;
            this.f4465b = i;
            this.f4464a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f4464a, this.f4465b, this.f4466c, this.f4467d, this.f4468e, this.f4469f, this.f4470g, this.f4471h, this.f4472i, this.f4473j, this.f4474k, this.f4475l, this.f4476m);
        }

        public Builder setAdvertiserTextViewId(int i) {
            this.f4467d = i;
            return this;
        }

        public Builder setBodyTextViewId(int i) {
            this.f4468e = i;
            return this;
        }

        public Builder setCallToActionButtonId(int i) {
            this.f4475l = i;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setIconContentViewId(int i) {
            this.f4470g = i;
            return this;
        }

        public Builder setIconImageViewId(int i) {
            this.f4469f = i;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i) {
            this.f4474k = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i) {
            this.f4473j = i;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i) {
            this.f4472i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i) {
            this.f4471h = i;
            return this;
        }

        /* access modifiers changed from: protected */
        public Builder setTemplateType(String str) {
            this.f4476m = str;
            return this;
        }

        public Builder setTitleTextViewId(int i) {
            this.f4466c = i;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.optionsContentViewGroupId = i7;
        this.optionsContentFrameLayoutId = i8;
        this.mediaContentViewGroupId = i9;
        this.mediaContentFrameLayoutId = i10;
        this.callToActionButtonId = i11;
        this.templateType = str;
    }
}
