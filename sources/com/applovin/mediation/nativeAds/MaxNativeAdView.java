package com.applovin.mediation.nativeAds;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.mediation.ads.C1606b;
import com.applovin.impl.mediation.p028a.C1576d;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.C2392R;
import java.lang.ref.WeakReference;

public class MaxNativeAdView extends FrameLayout {

    /* renamed from: a */
    private final View f4448a;

    /* renamed from: b */
    private final TextView f4449b;

    /* renamed from: c */
    private final TextView f4450c;

    /* renamed from: d */
    private final TextView f4451d;

    /* renamed from: e */
    private final ImageView f4452e;

    /* renamed from: f */
    private final FrameLayout f4453f;

    /* renamed from: g */
    private final ViewGroup f4454g;

    /* renamed from: h */
    private final FrameLayout f4455h;

    /* renamed from: i */
    private final ViewGroup f4456i;

    /* renamed from: j */
    private final FrameLayout f4457j;

    /* renamed from: k */
    private final Button f4458k;

    /* renamed from: l */
    private C1606b f4459l;

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        View inflate;
        boolean z = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        if (maxNativeAdViewBinder.mainView != null) {
            inflate = maxNativeAdViewBinder.mainView;
        } else {
            inflate = LayoutInflater.from(context).inflate(z ? m5100a(maxNativeAdViewBinder.templateType, format) : maxNativeAdViewBinder.layoutResourceId, this, false);
        }
        this.f4448a = inflate;
        addView(this.f4448a);
        this.f4449b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f4450c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f4451d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f4452e = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f4453f = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f4454g = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f4455h = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f4456i = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f4457j = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        this.f4458k = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        if (maxNativeAd != null) {
            m5102a(maxNativeAd);
        }
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(C2392R.C2394id.native_title_text_view).setAdvertiserTextViewId(C2392R.C2394id.native_advertiser_text_view).setBodyTextViewId(C2392R.C2394id.native_body_text_view).setIconImageViewId(C2392R.C2394id.native_icon_image_view).setIconContentViewId(C2392R.C2394id.native_icon_view).setOptionsContentViewGroupId(C2392R.C2394id.options_view).setOptionsContentFrameLayoutId(C2392R.C2394id.options_view).setMediaContentViewGroupId(C2392R.C2394id.native_media_content_view).setMediaContentFrameLayoutId(C2392R.C2394id.native_media_content_view).setCallToActionButtonId(C2392R.C2394id.native_cta_button).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    /* renamed from: a */
    private int m5100a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return C2392R.layout.max_native_ad_small_template_1;
            }
            if ("medium_template_1".equalsIgnoreCase(str)) {
                return C2392R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid format: " + str);
        } else if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? C2392R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? C2392R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? C2392R.layout.max_native_ad_vertical_media_banner_view : C2392R.layout.max_native_ad_banner_view;
        } else {
            if (maxAdFormat == MaxAdFormat.LEADER) {
                return "vertical_leader_template".equals(str) ? C2392R.layout.max_native_ad_vertical_leader_view : C2392R.layout.max_native_ad_leader_view;
            }
            if (maxAdFormat == MaxAdFormat.MREC) {
                return C2392R.layout.max_native_ad_mrec_view;
            }
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    /* renamed from: a */
    private void m5101a() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(C2392R.C2394id.inner_parent_layout);
        if (viewGroup != null) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                final WeakReference weakReference = new WeakReference(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public boolean onPreDraw() {
                        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                            C1959m mVar = AppLovinSdk.getInstance(MaxNativeAdView.this.getContext()).coreSdk;
                            if (C2092v.m5047a()) {
                                mVar.mo14286A().mo14792d("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                            }
                        } else {
                            viewTreeObserver.removeOnPreDrawListener(this);
                        }
                        weakReference.clear();
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                        layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                        viewGroup.setLayoutParams(layoutParams);
                        return true;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m5102a(MaxNativeAd maxNativeAd) {
        this.f4449b.setText(maxNativeAd.getTitle());
        if (this.f4450c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f4450c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f4450c.setVisibility(8);
            }
        }
        if (this.f4451d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f4451d.setText(maxNativeAd.getBody());
            } else {
                this.f4451d.setVisibility(4);
            }
        }
        if (this.f4458k != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f4458k.setText(maxNativeAd.getCallToAction());
            } else {
                this.f4458k.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        if (this.f4453f != null) {
            if (icon == null || this.f4452e == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f4453f.removeAllViews();
                    this.f4453f.addView(iconView);
                }
            } else if (icon.getDrawable() != null) {
                this.f4452e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && StringUtils.isValidString(icon.getUri().toString())) {
                this.f4452e.setImageURI(icon.getUri());
            }
            this.f4453f.setVisibility(8);
        }
        View optionsView = maxNativeAd.getOptionsView();
        if (this.f4455h == null || optionsView == null) {
            FrameLayout frameLayout = this.f4455h;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f4455h.addView(optionsView);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f4457j != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f4457j.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f4457j.setVisibility(8);
            }
        }
        m5101a();
        postDelayed(new Runnable() {
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, 2000);
    }

    /* renamed from: b */
    private void m5103b(MaxNativeAd maxNativeAd) {
        if (this.f4449b != null) {
            if (StringUtils.isValidString(maxNativeAd.getTitle())) {
                this.f4449b.setText(maxNativeAd.getTitle());
            } else {
                this.f4449b.setText((CharSequence) null);
            }
        }
        String body = maxNativeAd.getBody();
        if (this.f4451d != null) {
            if (StringUtils.isValidString(body)) {
                this.f4451d.setText(body);
            } else {
                this.f4451d.setText((CharSequence) null);
            }
        }
        String advertiser = maxNativeAd.getAdvertiser();
        if (this.f4450c != null) {
            if (StringUtils.isValidString(advertiser)) {
                this.f4450c.setText(advertiser);
            } else {
                this.f4450c.setText((CharSequence) null);
            }
        }
        String callToAction = maxNativeAd.getCallToAction();
        if (this.f4458k != null) {
            if (StringUtils.isValidString(callToAction)) {
                this.f4458k.setText(callToAction);
            } else {
                this.f4458k.setText((CharSequence) null);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f4452e;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable((Drawable) null);
            } else if (icon.getDrawable() != null) {
                this.f4452e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                this.f4452e.setImageURI(icon.getUri());
            } else {
                this.f4452e.setImageDrawable((Drawable) null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f4456i;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f4456i.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f4454g;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f4454g.addView(optionsView);
            }
        }
    }

    public C1606b getAdViewTracker() {
        return this.f4459l;
    }

    public TextView getAdvertiserTextView() {
        return this.f4450c;
    }

    public TextView getBodyTextView() {
        return this.f4451d;
    }

    public Button getCallToActionButton() {
        return this.f4458k;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f4453f;
    }

    public ImageView getIconImageView() {
        return this.f4452e;
    }

    public View getMainView() {
        return this.f4448a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f4457j;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f4456i;
        return viewGroup != null ? viewGroup : this.f4457j;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f4455h;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f4454g;
        return viewGroup != null ? viewGroup : this.f4455h;
    }

    public TextView getTitleTextView() {
        return this.f4449b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1606b bVar = this.f4459l;
        if (bVar != null) {
            bVar.mo13307b();
        }
        if (!isHardwareAccelerated() && C2092v.m5047a()) {
            C2092v.m5052h("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
        }
    }

    public void recycle() {
        C1606b bVar = this.f4459l;
        if (bVar != null) {
            bVar.mo13306a();
            this.f4459l = null;
        }
        View view = this.f4448a;
        if (view != null && view.getParent() != this) {
            ViewGroup viewGroup = (ViewGroup) this.f4448a.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                removeView(viewGroup);
            }
            addView(this.f4448a);
        }
    }

    public void render(C1576d dVar, C1604a.C1605a aVar, C1959m mVar) {
        recycle();
        if (!dVar.mo13198y().get() || !dVar.mo13197x().get()) {
            this.f4459l = new C1606b(dVar, aVar, mVar);
        }
        MaxNativeAd nativeAd = dVar.getNativeAd();
        if (StringUtils.isValidString(dVar.mo13195v())) {
            m5102a(nativeAd);
        } else {
            m5103b(nativeAd);
        }
    }
}
