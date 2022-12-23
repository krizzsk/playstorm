package com.ogury.p376ed;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10303a;
import com.ogury.p376ed.internal.C10307ac;
import com.ogury.p376ed.internal.C10388c;
import com.ogury.p376ed.internal.C10480e;
import com.ogury.p376ed.internal.C10491ej;
import com.ogury.p376ed.internal.C10512f;
import com.ogury.p376ed.internal.C10537ft;
import com.ogury.p376ed.internal.C10578h;
import com.ogury.p376ed.internal.C10679k;
import com.ogury.p376ed.internal.C10761mm;
import com.ogury.p376ed.internal.C10765mq;
import com.ogury.p376ed.internal.C10838w;
import p394io.presage.C12358R;
import p394io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.OguryBannerAdView */
public final class OguryBannerAdView extends FrameLayout implements C10307ac {

    /* renamed from: a */
    private C10838w f26096a;

    /* renamed from: b */
    private OguryBannerAdSize f26097b;

    /* renamed from: c */
    private AdConfig f26098c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C10761mm) null);
        C10765mq.m32773b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C10761mm) null);
        C10765mq.m32773b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OguryBannerAdView(Context context, AttributeSet attributeSet, int i, int i2, C10761mm mmVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context.getApplicationContext(), attributeSet, i);
        C10765mq.m32773b(context, "context");
        Context applicationContext = context.getApplicationContext();
        C10765mq.m32770a((Object) applicationContext, "context.applicationContext");
        this.f26096a = new C10838w(applicationContext, this);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C12358R.styleable.BannerLayout, 0, 0);
        String string = obtainStyledAttributes.getString(C12358R.styleable.BannerLayout_adUnit);
        this.f26098c = new AdConfig(string == null ? "" : string);
        int i2 = obtainStyledAttributes.getInt(C12358R.styleable.BannerLayout_bannerAdSize, 0);
        if (i2 == OguryBannerAdSize.SMALL_BANNER_320x50.getHeight()) {
            setAdSize(OguryBannerAdSize.SMALL_BANNER_320x50);
        } else if (i2 == OguryBannerAdSize.MPU_300x250.getHeight()) {
            setAdSize(OguryBannerAdSize.MPU_300x250);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setAdUnit(String str) {
        C10765mq.m32773b(str, "adUnitId");
        this.f26098c = new AdConfig(str);
    }

    public final void setAdSize(OguryBannerAdSize oguryBannerAdSize) {
        C10765mq.m32773b(oguryBannerAdSize, "adSize");
        OguryIntegrationLogger.m30996d(C10765mq.m32765a("[Ads] Banner Ad View - setAdSize() called with adSize: ", (Object) oguryBannerAdSize.name()));
        this.f26097b = oguryBannerAdSize;
    }

    private final void setCampaignId(String str) {
        C10537ft.m32041a(this.f26098c, str);
    }

    private final void setCreativeId(String str) {
        C10537ft.m32042b(this.f26098c, str);
    }

    @Deprecated
    public final void setCallback(OguryBannerCallback oguryBannerCallback) {
        this.f26096a.mo67892a((C10578h) C10388c.m31449a(oguryBannerCallback));
    }

    public final void setListener(OguryBannerAdListener oguryBannerAdListener) {
        OguryIntegrationLogger.m30996d("[Ads] Banner Ad View - setListener() called");
        C10838w wVar = this.f26096a;
        C10512f.C10513a aVar = C10512f.f26570a;
        wVar.mo67892a((C10578h) C10512f.C10513a.m31885a(oguryBannerAdListener));
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C10838w wVar = this.f26096a;
        C10480e.C10481a aVar = C10480e.f26475a;
        wVar.mo67893a((C10679k) C10480e.C10481a.m31685a(oguryAdImpressionListener));
    }

    public final void loadAd() {
        OguryIntegrationLogger.m30996d("[Ads] Banner Ad View - load() called");
        C10303a aVar = C10303a.f26109a;
        C10491ej a = C10303a.m31147a(this.f26097b);
        C10303a aVar2 = C10303a.f26109a;
        this.f26096a.mo67894a(this.f26098c, a, C10303a.m31148b(this.f26097b));
    }

    public final boolean isBannerExpanded() {
        return this.f26096a.mo67896c();
    }

    public final void destroy() {
        ViewGroup container = getContainer();
        if (container != null) {
            container.removeView(this);
        }
        removeAllViews();
        this.f26096a.mo67895b();
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m31143a()) {
            this.f26096a.mo67891a();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        this.f26096a.mo67891a();
    }

    /* renamed from: a */
    private final boolean m31143a() {
        return getChildCount() > 0;
    }

    private final ViewGroup getContainer() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26096a.mo67891a();
    }
}
