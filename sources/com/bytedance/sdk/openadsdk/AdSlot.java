package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2535b;
import com.bytedance.sdk.component.utils.C2975l;
import org.json.JSONObject;

public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_BANNER_NATIVE = 10;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_DRAW_FEED = 9;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f6791a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f6792b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f6793c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f6794d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f6795e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f6796f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f6797g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f6798h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f6799i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f6800j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f6801k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f6802l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6803m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f6804n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f6805o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f6806p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f6807q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f6808r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f6809s;

    /* renamed from: t */
    private int f6810t;

    /* renamed from: u */
    private int f6811u;

    /* renamed from: v */
    private int f6812v;

    /* renamed from: w */
    private int f6813w;

    private AdSlot() {
        this.f6803m = true;
        this.f6804n = false;
        this.f6810t = 0;
        this.f6811u = 0;
        this.f6812v = 0;
    }

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", (String) null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", (String) null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", (String) null));
            builder.setUserID(jSONObject.optString("mUserID", (String) null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
        } catch (Exception unused) {
        }
        return builder.build();
    }

    public int getAdCount() {
        return this.f6796f;
    }

    public String getAdId() {
        return this.f6806p;
    }

    public String getBidAdm() {
        return this.f6805o;
    }

    public String getCodeId() {
        return this.f6791a;
    }

    public String getCreativeId() {
        return this.f6807q;
    }

    public int getDurationSlotType() {
        return this.f6813w;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f6795e;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f6794d;
    }

    public String getExt() {
        return this.f6808r;
    }

    public int getImgAcceptedHeight() {
        return this.f6793c;
    }

    public int getImgAcceptedWidth() {
        return this.f6792b;
    }

    public int getIsRotateBanner() {
        return this.f6810t;
    }

    public String getMediaExtra() {
        return this.f6800j;
    }

    public int getNativeAdType() {
        return this.f6802l;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.f6799i;
    }

    @Deprecated
    public String getRewardName() {
        return this.f6798h;
    }

    public int getRotateOrder() {
        return this.f6812v;
    }

    public int getRotateTime() {
        return this.f6811u;
    }

    public String getUserData() {
        return this.f6809s;
    }

    public String getUserID() {
        return this.f6801k;
    }

    public boolean isAutoPlay() {
        return this.f6803m;
    }

    public boolean isExpressAd() {
        return this.f6804n;
    }

    public boolean isSupportDeepLink() {
        return this.f6797g;
    }

    public void setAdCount(int i) {
        this.f6796f = i;
    }

    public void setDurationSlotType(int i) {
        this.f6813w = i;
    }

    public void setIsRotateBanner(int i) {
        this.f6810t = i;
    }

    public void setNativeAdType(int i) {
        this.f6802l = i;
    }

    public void setRotateOrder(int i) {
        this.f6812v = i;
    }

    public void setRotateTime(int i) {
        this.f6811u = i;
    }

    public void setUserData(String str) {
        this.f6809s = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.f6791a);
            jSONObject.put("mAdCount", this.f6796f);
            jSONObject.put("mIsAutoPlay", this.f6803m);
            jSONObject.put("mImgAcceptedWidth", this.f6792b);
            jSONObject.put("mImgAcceptedHeight", this.f6793c);
            jSONObject.put("mExpressViewAcceptedWidth", (double) this.f6794d);
            jSONObject.put("mExpressViewAcceptedHeight", (double) this.f6795e);
            jSONObject.put("mSupportDeepLink", this.f6797g);
            jSONObject.put("mRewardName", this.f6798h);
            jSONObject.put("mRewardAmount", this.f6799i);
            jSONObject.put("mMediaExtra", this.f6800j);
            jSONObject.put("mUserID", this.f6801k);
            jSONObject.put("mNativeAdType", this.f6802l);
            jSONObject.put("mIsExpressAd", this.f6804n);
            jSONObject.put("mAdId", this.f6806p);
            jSONObject.put("mCreativeId", this.f6807q);
            jSONObject.put("mExt", this.f6808r);
            jSONObject.put("mBidAdm", this.f6805o);
            jSONObject.put("mUserData", this.f6809s);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "AdSlot{mCodeId='" + this.f6791a + '\'' + ", mImgAcceptedWidth=" + this.f6792b + ", mImgAcceptedHeight=" + this.f6793c + ", mExpressViewAcceptedWidth=" + this.f6794d + ", mExpressViewAcceptedHeight=" + this.f6795e + ", mAdCount=" + this.f6796f + ", mSupportDeepLink=" + this.f6797g + ", mRewardName='" + this.f6798h + '\'' + ", mRewardAmount=" + this.f6799i + ", mMediaExtra='" + this.f6800j + '\'' + ", mUserID='" + this.f6801k + '\'' + ", mNativeAdType=" + this.f6802l + ", mIsAutoPlay=" + this.f6803m + ", mAdId" + this.f6806p + ", mCreativeId" + this.f6807q + ", mExt" + this.f6808r + ", mUserData" + this.f6809s + '}';
    }

    public static class Builder {

        /* renamed from: a */
        private String f6814a;

        /* renamed from: b */
        private int f6815b = 640;

        /* renamed from: c */
        private int f6816c = 320;

        /* renamed from: d */
        private boolean f6817d = true;

        /* renamed from: e */
        private int f6818e = 1;

        /* renamed from: f */
        private String f6819f = "";

        /* renamed from: g */
        private int f6820g = 0;

        /* renamed from: h */
        private String f6821h;

        /* renamed from: i */
        private String f6822i = "defaultUser";

        /* renamed from: j */
        private int f6823j;

        /* renamed from: k */
        private float f6824k;

        /* renamed from: l */
        private float f6825l;

        /* renamed from: m */
        private boolean f6826m;

        /* renamed from: n */
        private String f6827n;

        /* renamed from: o */
        private String f6828o;

        /* renamed from: p */
        private String f6829p;

        /* renamed from: q */
        private String f6830q;

        /* renamed from: r */
        private String f6831r;

        /* renamed from: s */
        private boolean f6832s = true;

        @Deprecated
        public Builder setRewardAmount(int i) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.f6828o = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f6829p = str;
            return this;
        }

        public Builder setExt(String str) {
            this.f6830q = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.f6832s = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.f6814a = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.f6826m = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.f6815b = i;
            this.f6816c = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.f6824k = f;
            this.f6825l = f2;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
                C2975l.m8387c(TTAdConstant.TAG, "setAdCount: adCount must greater than 0 ");
            }
            if (i > 20) {
                C2975l.m8387c(TTAdConstant.TAG, "setAdCount: adCount must less than or equal to 20 ");
                i = 20;
            }
            this.f6818e = i;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f6821h = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.f6822i = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.f6823j = i;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            C2975l.m8387c("bidding", "AdSlot -> bidAdm=" + C2535b.m6426a(str));
            this.f6827n = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.f6831r = str;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            String unused = adSlot.f6791a = this.f6814a;
            int unused2 = adSlot.f6796f = this.f6818e;
            boolean unused3 = adSlot.f6797g = this.f6817d;
            int unused4 = adSlot.f6792b = this.f6815b;
            int unused5 = adSlot.f6793c = this.f6816c;
            float f = this.f6824k;
            if (f <= 0.0f) {
                float unused6 = adSlot.f6794d = (float) this.f6815b;
                float unused7 = adSlot.f6795e = (float) this.f6816c;
            } else {
                float unused8 = adSlot.f6794d = f;
                float unused9 = adSlot.f6795e = this.f6825l;
            }
            String unused10 = adSlot.f6798h = this.f6819f;
            int unused11 = adSlot.f6799i = this.f6820g;
            String unused12 = adSlot.f6800j = this.f6821h;
            String unused13 = adSlot.f6801k = this.f6822i;
            int unused14 = adSlot.f6802l = this.f6823j;
            boolean unused15 = adSlot.f6803m = this.f6832s;
            boolean unused16 = adSlot.f6804n = this.f6826m;
            String unused17 = adSlot.f6805o = this.f6827n;
            String unused18 = adSlot.f6806p = this.f6828o;
            String unused19 = adSlot.f6807q = this.f6829p;
            String unused20 = adSlot.f6808r = this.f6830q;
            String unused21 = adSlot.f6809s = this.f6831r;
            return adSlot;
        }
    }
}
