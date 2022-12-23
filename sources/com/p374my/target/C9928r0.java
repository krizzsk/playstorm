package com.p374my.target;

import android.view.View;
import com.p374my.target.nativeads.NativeBannerAd;
import com.p374my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.r0 */
public interface C9928r0 {
    /* renamed from: a */
    void mo63658a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener);

    /* renamed from: c */
    String mo64147c();

    /* renamed from: d */
    float mo64148d();

    /* renamed from: h */
    NativeBanner mo63661h();

    void registerView(View view, List<View> list, int i);

    void unregisterView();
}
