package com.p374my.target.nativeads;

import android.view.View;
import com.p374my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.nativeads.MediationHelper */
public final class MediationHelper {
    public static void registerView(NativeAd nativeAd, View view, List<View> list, MediaAdView mediaAdView) {
        nativeAd.registerView(view, list, mediaAdView);
    }
}
