package com.p374my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.p374my.target.C9672e0;
import com.p374my.target.C9997v2;
import com.p374my.target.common.CustomParams;
import com.p374my.target.mediation.MediationNativeAdAdapter;
import com.p374my.target.nativeads.NativeAd;
import com.p374my.target.nativeads.banners.NativePromoBanner;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.mediation.MyTargetNativeAdAdapter */
public final class MyTargetNativeAdAdapter implements MediationNativeAdAdapter {

    /* renamed from: ad */
    private NativeAd f24353ad;
    private C9997v2 section;

    /* renamed from: com.my.target.mediation.MyTargetNativeAdAdapter$AdListener */
    public class AdListener implements NativeAd.NativeAdListener {
        private final MediationNativeAdAdapter.MediationNativeAdListener mediationListener;

        public AdListener(MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener) {
            this.mediationListener = mediationNativeAdListener;
        }

        public void onClick(NativeAd nativeAd) {
            C9672e0.m27882a("MyTargetNativeAdAdapter: ad clicked");
            this.mediationListener.onClick(MyTargetNativeAdAdapter.this);
        }

        public void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd) {
            C9672e0.m27882a("MyTargetNativeAdAdapter: ad loaded");
            this.mediationListener.onLoad(nativePromoBanner, MyTargetNativeAdAdapter.this);
        }

        public void onNoAd(String str, NativeAd nativeAd) {
            C9672e0.m27882a("MyTargetNativeAdAdapter: no ad (" + str + ")");
            this.mediationListener.onNoAd(str, MyTargetNativeAdAdapter.this);
        }

        public void onShow(NativeAd nativeAd) {
            C9672e0.m27882a("MyTargetNativeAdAdapter: ad shown");
            this.mediationListener.onShow(MyTargetNativeAdAdapter.this);
        }

        public void onVideoComplete(NativeAd nativeAd) {
            C9672e0.m27882a("MyTargetNativeAdAdapter: video completed");
            this.mediationListener.onVideoComplete(MyTargetNativeAdAdapter.this);
        }

        public void onVideoPause(NativeAd nativeAd) {
            C9672e0.m27882a("MyTargetNativeAdAdapter: video paused");
            this.mediationListener.onVideoPause(MyTargetNativeAdAdapter.this);
        }

        public void onVideoPlay(NativeAd nativeAd) {
            C9672e0.m27882a("MyTargetNativeAdAdapter: video playing");
            this.mediationListener.onVideoPlay(MyTargetNativeAdAdapter.this);
        }
    }

    public void destroy() {
        NativeAd nativeAd = this.f24353ad;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.f24353ad.setListener((NativeAd.NativeAdListener) null);
            this.f24353ad = null;
        }
    }

    public View getMediaView(Context context) {
        return null;
    }

    public void load(MediationNativeAdConfig mediationNativeAdConfig, MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener, Context context) {
        String placementId = mediationNativeAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            NativeAd nativeAd = new NativeAd(parseInt, context);
            this.f24353ad = nativeAd;
            nativeAd.setMediationEnabled(false);
            this.f24353ad.setListener(new AdListener(mediationNativeAdListener));
            this.f24353ad.setCachePolicy(mediationNativeAdConfig.getCachePolicy());
            CustomParams customParams = this.f24353ad.getCustomParams();
            customParams.setAge(mediationNativeAdConfig.getAge());
            customParams.setGender(mediationNativeAdConfig.getGender());
            for (Map.Entry next : mediationNativeAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam((String) next.getKey(), (String) next.getValue());
            }
            String payload = mediationNativeAdConfig.getPayload();
            if (this.section != null) {
                C9672e0.m27882a("MyTargetNativeAdAdapter: got banner from mediation response");
                this.f24353ad.handleSection(this.section);
            } else if (TextUtils.isEmpty(payload)) {
                C9672e0.m27882a("MyTargetNativeAdAdapter: load id " + parseInt);
                this.f24353ad.load();
            } else {
                C9672e0.m27882a("MyTargetNativeAdAdapter: load id " + parseInt + " from BID " + payload);
                this.f24353ad.loadFromBid(payload);
            }
        } catch (Throwable unused) {
            String str = "failed to request ad, unable to convert slotId " + placementId + " to int";
            C9672e0.m27883b("MyTargetNativeAdAdapter error: " + str);
            mediationNativeAdListener.onNoAd(str, this);
        }
    }

    public void registerView(View view, List<View> list, int i) {
        NativeAd nativeAd = this.f24353ad;
        if (nativeAd != null) {
            nativeAd.setAdChoicesPlacement(i);
            this.f24353ad.registerView(view, list);
        }
    }

    public void setSection(C9997v2 v2Var) {
        this.section = v2Var;
    }

    public void unregisterView() {
        NativeAd nativeAd = this.f24353ad;
        if (nativeAd != null) {
            nativeAd.unregisterView();
        }
    }
}
