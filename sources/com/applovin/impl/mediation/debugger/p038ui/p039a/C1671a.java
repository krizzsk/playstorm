package com.applovin.impl.mediation.debugger.p038ui.p039a;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.p033a.C1651a;
import com.applovin.impl.mediation.debugger.p033a.C1653b;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1655a;
import com.applovin.impl.mediation.debugger.p034b.p035a.C1656b;
import com.applovin.impl.mediation.debugger.p038ui.C1668a;
import com.applovin.impl.mediation.debugger.p038ui.p039a.C1677b;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1705a;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1711d;
import com.applovin.impl.mediation.debugger.p038ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2392R;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.a */
public class C1671a extends C1668a implements C1651a.C1652a, AdControlButton.C1720a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private C1959m f2404a;

    /* renamed from: b */
    private C1655a f2405b;

    /* renamed from: c */
    private C1677b f2406c;

    /* renamed from: d */
    private C1656b f2407d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MaxAdView f2408e;

    /* renamed from: f */
    private MaxInterstitialAd f2409f;

    /* renamed from: g */
    private MaxRewardedInterstitialAd f2410g;

    /* renamed from: h */
    private MaxRewardedAd f2411h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public MaxNativeAdView f2412i;

    /* renamed from: j */
    private MaxNativeAdLoader f2413j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1684d f2414k;

    /* renamed from: l */
    private ListView f2415l;

    /* renamed from: m */
    private View f2416m;

    /* renamed from: n */
    private AdControlButton f2417n;

    /* renamed from: o */
    private TextView f2418o;

    /* renamed from: p */
    private C1651a f2419p;

    /* renamed from: a */
    private void m3426a() {
        String a = this.f2405b.mo13399a();
        if (this.f2405b.mo13403d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(a, this.f2405b.mo13403d(), this.f2404a.mo14309Y(), this);
            this.f2408e = maxAdView;
            maxAdView.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f2405b.mo13403d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(a, this.f2404a.mo14309Y(), this);
            this.f2409f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f2405b.mo13403d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(a, this.f2404a.mo14309Y(), this);
            this.f2410g = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f2405b.mo13403d()) {
            MaxRewardedAd instance = MaxRewardedAd.getInstance(a, this.f2404a.mo14309Y(), this);
            this.f2411h = instance;
            instance.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f2405b.mo13403d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(a, this.f2404a.mo14309Y(), this);
            this.f2413j = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
                public void onNativeAdClicked(MaxAd maxAd) {
                    C1671a.this.onAdClicked(maxAd);
                }

                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    C1671a.this.onAdLoadFailed(str, maxError);
                }

                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    MaxNativeAdView unused = C1671a.this.f2412i = maxNativeAdView;
                    C1671a.this.onAdLoaded(maxAd);
                }
            });
            this.f2413j.setRevenueListener(this);
        }
    }

    /* renamed from: a */
    private void m3427a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.f2414k == null) {
            C1684d dVar = new C1684d(viewGroup, size, this);
            this.f2414k = dVar;
            dVar.setOnShowListener(onShowListener);
            this.f2414k.setOnDismissListener(new DialogInterface.OnDismissListener() {
                public void onDismiss(DialogInterface dialogInterface) {
                    ViewGroup viewGroup = viewGroup;
                    if (viewGroup instanceof MaxAdView) {
                        ((MaxAdView) viewGroup).stopAutoRefresh();
                    }
                    C1684d unused = C1671a.this.f2414k = null;
                }
            });
            this.f2414k.show();
        }
    }

    /* renamed from: a */
    private void m3429a(MaxAdFormat maxAdFormat) {
        if (this.f2407d != null) {
            this.f2404a.mo14295J().mo13580a(this.f2407d.mo13406a().mo13416a());
            this.f2404a.mo14295J().mo13582a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f2408e.setPlacement("[Mediation Debugger Live Ad]");
            this.f2408e.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.f2405b.mo13403d()) {
            this.f2409f.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f2405b.mo13403d()) {
            this.f2410g.loadAd();
        } else if (MaxAdFormat.REWARDED == this.f2405b.mo13403d()) {
            this.f2411h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f2405b.mo13403d()) {
            this.f2413j.setPlacement("[Mediation Debugger Live Ad]");
            this.f2413j.loadAd();
        } else {
            Utils.showToast("Live ads currently unavailable for ad format", this);
        }
    }

    /* renamed from: b */
    private void m3430b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            m3427a(this.f2408e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    C1671a.this.f2408e.startAutoRefresh();
                }
            });
        } else if (MaxAdFormat.INTERSTITIAL == this.f2405b.mo13403d()) {
            this.f2409f.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f2405b.mo13403d()) {
            this.f2410g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f2405b.mo13403d()) {
            this.f2411h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f2405b.mo13403d()) {
            m3427a(this.f2412i, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public C1959m getSdk() {
        return this.f2404a;
    }

    public void initialize(final C1655a aVar, C1656b bVar, final C1959m mVar) {
        this.f2404a = mVar;
        this.f2405b = aVar;
        this.f2407d = bVar;
        C1677b bVar2 = new C1677b(aVar, bVar, this);
        this.f2406c = bVar2;
        bVar2.mo13554a((C1711d.C1713a) new C1711d.C1713a() {
            /* renamed from: a */
            public void mo13476a(C1705a aVar, final C1707c cVar) {
                if (cVar instanceof C1677b.C1678a) {
                    C1671a.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, mVar.mo14333af(), new C1668a.C1670a<MaxDebuggerAdUnitDetailActivity>() {
                        /* renamed from: a */
                        public void mo13473a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            maxDebuggerAdUnitDetailActivity.initialize(aVar, ((C1677b.C1678a) cVar).mo13485a(), mVar);
                        }
                    });
                }
            }
        });
        m3426a();
        List<C1653b> d = aVar.mo13404e().mo13414d();
        if (d != null && d.size() > 0) {
            if (bVar == null || bVar.mo13406a().mo13418c().mo13453x()) {
                this.f2419p = new C1651a(d, aVar.mo13403d(), (C1651a.C1652a) this);
            }
        }
    }

    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f2417n.setControlState(AdControlButton.C1721b.LOAD);
        this.f2418o.setText("");
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f2408e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2409f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f2410g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2411h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f2413j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        m3429a(maxAdFormat);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f2417n.setControlState(AdControlButton.C1721b.LOAD);
        this.f2418o.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        Utils.showAlert("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.f2418o;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.f2417n.setControlState(AdControlButton.C1721b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            m3427a(this.f2408e, maxAd.getFormat().getSize(), (DialogInterface.OnShowListener) null);
        } else if (MaxAdFormat.NATIVE == this.f2405b.mo13403d()) {
            m3427a(this.f2412i, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f2408e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2409f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f2410g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2411h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f2413j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        m3429a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    public void onClick(AdControlButton adControlButton) {
        if (this.f2404a.mo14295J().mo13583a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        MaxAdFormat d = this.f2405b.mo13403d();
        if (AdControlButton.C1721b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.C1721b.LOADING);
            C1651a aVar = this.f2419p;
            if (aVar != null) {
                aVar.mo13394a();
            } else {
                m3429a(d);
            }
        } else if (AdControlButton.C1721b.SHOW == adControlButton.getControlState()) {
            if (!d.isAdViewAd() && d != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(AdControlButton.C1721b.LOAD);
            }
            m3430b(d);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2392R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f2406c.mo13481a());
        this.f2415l = (ListView) findViewById(C2392R.C2394id.listView);
        this.f2416m = findViewById(C2392R.C2394id.ad_presenter_view);
        this.f2417n = (AdControlButton) findViewById(C2392R.C2394id.ad_control_button);
        this.f2418o = (TextView) findViewById(C2392R.C2394id.status_textview);
        this.f2415l.setAdapter(this.f2406c);
        this.f2418o.setText(this.f2404a.mo14295J().mo13583a() ? "Not Supported while Test Mode is enabled" : "Tap to load an ad");
        this.f2418o.setTypeface(Typeface.DEFAULT_BOLD);
        this.f2417n.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer((float) 10, 0.0f, (float) -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f2416m.setBackground(layerDrawable);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f2407d != null) {
            this.f2404a.mo14295J().mo13580a((String) null);
            this.f2404a.mo14295J().mo13582a(false);
        }
        MaxAdView maxAdView = this.f2408e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f2409f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f2411h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }
}
