package com.ogury.p376ed;

import android.app.Activity;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10379bv;
import com.ogury.p376ed.internal.C10387bz;
import com.ogury.p376ed.internal.C10480e;
import com.ogury.p376ed.internal.C10512f;
import com.ogury.p376ed.internal.C10568gs;
import com.ogury.p376ed.internal.C10578h;
import com.ogury.p376ed.internal.C10679k;
import com.ogury.p376ed.internal.C10765mq;
import p394io.presage.interstitial.PresageInterstitialCallback;

/* renamed from: com.ogury.ed.OguryThumbnailAd */
public final class OguryThumbnailAd {

    /* renamed from: a */
    private final C10379bv f26104a;

    /* renamed from: b */
    private final C10568gs f26105b;

    private OguryThumbnailAd(C10379bv bvVar) {
        this.f26104a = bvVar;
        this.f26105b = new C10568gs();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OguryThumbnailAd(android.content.Context r3, p394io.presage.common.AdConfig r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p376ed.internal.C10765mq.m32773b(r3, r0)
            java.lang.String r0 = "adConfig"
            com.ogury.p376ed.internal.C10765mq.m32773b(r4, r0)
            com.ogury.ed.internal.bv r0 = new com.ogury.ed.internal.bv
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r3, (java.lang.String) r1)
            r0.<init>(r3, r4)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.OguryThumbnailAd.<init>(android.content.Context, io.presage.common.AdConfig):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OguryThumbnailAd(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p376ed.internal.C10765mq.m32773b(r3, r0)
            java.lang.String r0 = "adUnitId"
            com.ogury.p376ed.internal.C10765mq.m32773b(r4, r0)
            com.ogury.ed.internal.bv r0 = new com.ogury.ed.internal.bv
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r3, (java.lang.String) r1)
            io.presage.common.AdConfig r1 = new io.presage.common.AdConfig
            r1.<init>(r4)
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.OguryThumbnailAd.<init>(android.content.Context, java.lang.String):void");
    }

    private final void setCampaignId(String str) {
        this.f26104a.mo67126a(str);
    }

    private final void setCreativeId(String str) {
        this.f26104a.mo67132b(str);
    }

    @Deprecated
    public final void setCallback(OguryThumbnailAdCallback oguryThumbnailAdCallback) {
        this.f26104a.mo67124a((C10578h) this.f26105b.mo67507a((PresageInterstitialCallback) oguryThumbnailAdCallback));
    }

    @Deprecated
    public final void setOnAdClickedCallback(OguryAdClickCallback oguryAdClickCallback) {
        this.f26105b.mo67508a(oguryAdClickCallback);
    }

    public final void setListener(OguryThumbnailAdListener oguryThumbnailAdListener) {
        OguryIntegrationLogger.m30996d("[Ads] Thumbnail Ad - setListener() called");
        C10379bv bvVar = this.f26104a;
        C10512f.C10513a aVar = C10512f.f26570a;
        bvVar.mo67124a((C10578h) C10512f.C10513a.m31885a(oguryThumbnailAdListener));
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C10379bv bvVar = this.f26104a;
        C10480e.C10481a aVar = C10480e.f26475a;
        bvVar.mo67125a((C10679k) C10480e.C10481a.m31685a(oguryAdImpressionListener));
    }

    public final void load(int i, int i2) {
        OguryIntegrationLogger.m30996d("[Ads] Thumbnail Ad - load() called with maxWidth: " + i + " maxHeight: " + i2);
        this.f26104a.mo67121a(i, i2);
    }

    public final void load() {
        OguryIntegrationLogger.m30996d("[Ads] Thumbnail Ad - load() called");
        this.f26104a.mo67130b();
    }

    public final void show(Activity activity, int i, int i2) {
        C10765mq.m32773b(activity, "activity");
        OguryIntegrationLogger.m30996d("[Ads] Thumbnail Ad - show() called with activity: " + activity.getClass().getName() + " leftMargin: " + i + " topMargin: " + i2);
        this.f26104a.mo67123a(activity, new C10387bz(OguryThumbnailGravity.TOP_LEFT.getValue(), i, i2));
    }

    public final void show(Activity activity) {
        C10765mq.m32773b(activity, "activity");
        OguryIntegrationLogger.m30996d(C10765mq.m32765a("[Ads] Thumbnail Ad - show() called with activity: ", (Object) activity.getClass().getName()));
        this.f26104a.mo67122a(activity);
    }

    public final void show(Activity activity, OguryThumbnailGravity oguryThumbnailGravity, int i, int i2) {
        C10765mq.m32773b(activity, "activity");
        C10765mq.m32773b(oguryThumbnailGravity, "gravity");
        OguryIntegrationLogger.m30996d("[Ads] Thumbnail Ad - show() called with activity: " + activity.getClass().getName() + " gravity: " + oguryThumbnailGravity.ordinal() + " xMargin: " + i + " yMargin: " + i2);
        this.f26104a.mo67123a(activity, new C10387bz(oguryThumbnailGravity.getValue(), i, i2));
    }

    public final boolean isLoaded() {
        return this.f26104a.mo67129a();
    }

    public final void setWhiteListPackages(String... strArr) {
        C10765mq.m32773b(strArr, "packages");
        this.f26104a.mo67128a(strArr);
    }

    @SafeVarargs
    public final void setBlackListActivities(Class<? extends Activity>... clsArr) {
        C10765mq.m32773b(clsArr, "activities");
        this.f26104a.mo67127a(clsArr);
    }

    public final void setWhiteListFragmentPackages(String... strArr) {
        C10765mq.m32773b(strArr, "packages");
        this.f26104a.mo67134b(strArr);
    }

    @SafeVarargs
    public final void setBlackListFragments(Class<? extends Object>... clsArr) {
        C10765mq.m32773b(clsArr, "fragments");
        this.f26104a.mo67133b(clsArr);
    }

    public final void logWhiteListedActivities(Activity activity) {
        C10765mq.m32773b(activity, "activity");
        this.f26104a.mo67131b(activity);
    }
}
