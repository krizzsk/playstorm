package com.p374my.target;

import android.view.View;
import com.p374my.target.nativeads.NativeAd;
import com.p374my.target.nativeads.banners.NativePromoBanner;
import com.p374my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.q0 */
public interface C9914q0 {
    /* renamed from: a */
    void mo63573a(View view, List<View> list, int i, MediaAdView mediaAdView);

    /* renamed from: a */
    void mo63576a(NativeAd.NativeAdMediaListener nativeAdMediaListener);

    /* renamed from: c */
    String mo63981c();

    /* renamed from: d */
    float mo63982d();

    /* renamed from: g */
    NativePromoBanner mo63579g();

    void unregisterView();
}
