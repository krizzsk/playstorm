package com.p374my.target.nativeads.factories;

import android.content.Context;
import android.util.AttributeSet;
import com.p374my.target.nativeads.views.IconAdView;
import com.p374my.target.nativeads.views.MediaAdView;
import com.p374my.target.nativeads.views.NativeAdCardView;
import com.p374my.target.nativeads.views.NativeAdChoicesView;
import com.p374my.target.nativeads.views.NativeAdView;
import com.p374my.target.nativeads.views.NativeBannerAdView;
import com.p374my.target.nativeads.views.PromoCardRecyclerView;

/* renamed from: com.my.target.nativeads.factories.NativeViewsFactory */
public class NativeViewsFactory {
    public static IconAdView getIconAdView(Context context) {
        return new IconAdView(context);
    }

    public static MediaAdView getMediaAdView(Context context) {
        return new MediaAdView(context);
    }

    public static NativeAdCardView getNativeAdCardView(Context context) {
        return new NativeAdCardView(context);
    }

    public static NativeAdChoicesView getNativeAdChoicesView(Context context) {
        return new NativeAdChoicesView(context);
    }

    public static NativeAdView getNativeAdView(Context context) {
        return new NativeAdView(context, (AttributeSet) null, 0, false);
    }

    public static NativeAdView getNativeAdViewWithExtendedCards(Context context) {
        return new NativeAdView(context, (AttributeSet) null, 0, true);
    }

    public static NativeBannerAdView getNativeBannerAdView(Context context) {
        return new NativeBannerAdView(context);
    }

    public static PromoCardRecyclerView getPromoCardRecyclerView(Context context) {
        return new PromoCardRecyclerView(context);
    }
}
