package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.C5817aq;
import com.inmobi.media.C5894bm;
import com.inmobi.media.C6181gg;
import com.inmobi.media.C6217hg;
import com.inmobi.media.C6227ho;
import com.inmobi.media.C6228hp;
import com.inmobi.media.C6238hu;
import com.inmobi.media.C6252ic;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiNative {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f19372a = InMobiNative.class.getSimpleName();

    /* renamed from: b */
    private C5817aq f19373b;

    /* renamed from: c */
    private NativeCallbacks f19374c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public NativeAdEventListener f19375d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public VideoEventListener f19376e;

    /* renamed from: f */
    private WeakReference<View> f19377f;

    /* renamed from: g */
    private boolean f19378g;

    /* renamed from: h */
    private C5894bm f19379h = new C5894bm();

    /* renamed from: i */
    private WeakReference<Context> f19380i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public LockScreenListener f19381j;

    public interface LockScreenListener {
        void onActionRequired(InMobiNative inMobiNative);
    }

    public InMobiNative(Context context, long j, NativeAdEventListener nativeAdEventListener) throws SdkNotInitializedException {
        if (C6227ho.m18550b()) {
            this.f19379h.f14879a = j;
            this.f19380i = new WeakReference<>(context);
            this.f19375d = nativeAdEventListener;
            this.f19374c = new NativeCallbacks(this);
            this.f19373b = new C5817aq(this.f19374c);
            return;
        }
        throw new SdkNotInitializedException(f19372a);
    }

    public final void setListener(NativeAdEventListener nativeAdEventListener) {
        this.f19375d = nativeAdEventListener;
    }

    public final void setVideoEventListener(VideoEventListener videoEventListener) {
        this.f19376e = videoEventListener;
    }

    /* renamed from: a */
    private boolean m23422a(boolean z) {
        if (!z ? this.f19375d != null : !(this.f19373b == null && this.f19375d == null)) {
            WeakReference<Context> weakReference = this.f19380i;
            if (weakReference != null && weakReference.get() != null) {
                return true;
            }
            C6238hu.m18605a((byte) 1, f19372a, "Context supplied is null, your call is ignored.");
            return false;
        }
        C6238hu.m18605a((byte) 1, f19372a, "Listener supplied is null, your call is ignored.");
        return false;
    }

    public final void getSignals() {
        if (m23422a(false)) {
            this.f19374c.mo56382a();
            m23424b();
            this.f19373b.mo34710b((PublisherCallbacks) this.f19374c);
        }
    }

    public final void load(byte[] bArr) {
        if (m23422a(false)) {
            if (Build.VERSION.SDK_INT >= 29) {
                WeakReference<Context> weakReference = this.f19380i;
                C6252ic.m18657a(weakReference == null ? null : (Context) weakReference.get());
            }
            this.f19379h.f14883e = "AB";
            m23424b();
            this.f19374c.mo56382a();
            this.f19373b.mo34638a(bArr, (PublisherCallbacks) this.f19374c);
        }
    }

    /* renamed from: b */
    private void m23424b() {
        WeakReference<Context> weakReference = this.f19380i;
        Context context = weakReference == null ? null : (Context) weakReference.get();
        if (context != null) {
            this.f19373b.mo34681a(this.f19379h, context);
        }
    }

    public final void load() {
        try {
            if (m23422a(true)) {
                this.f19374c.mo56382a();
                if (this.f19378g) {
                    this.f19373b.mo34584a(this.f19373b.mo34645m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
                    C6238hu.m18605a((byte) 1, f19372a, "You can call load() on an instance of InMobiNative only once if the ad request has been successful. Ignoring InMobiNative.load()");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    C6252ic.m18657a(this.f19380i == null ? null : (Context) this.f19380i.get());
                }
                this.f19379h.f14883e = "NonAB";
                m23424b();
                this.f19373b.mo34684n();
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            C6238hu.m18605a((byte) 1, "InMobi", "Could not load ad; SDK encountered an unexpected error");
        }
    }

    public final void load(Context context) {
        if (m23422a(true)) {
            this.f19380i = new WeakReference<>(context);
            load();
        }
    }

    public final void showOnLockScreen(LockScreenListener lockScreenListener) {
        WeakReference<Context> weakReference = this.f19380i;
        if (weakReference == null || weakReference.get() == null) {
            C6238hu.m18605a((byte) 1, f19372a, "InMobiNative is not initialized. Provided context is null. Ignoring showOnLockScreen");
            return;
        }
        try {
            this.f19373b.mo34682b(this.f19379h, (Context) this.f19380i.get());
            this.f19381j = lockScreenListener;
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19372a, "SDK encountered unexpected error in showOnLockScreen");
        }
    }

    public final void takeAction() {
        try {
            this.f19373b.mo34686p();
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19372a, "SDK encountered unexpected error in takeAction");
        }
    }

    public final void pause() {
        try {
            this.f19373b.mo34687q();
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void resume() {
        try {
            this.f19373b.mo34688r();
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A[Catch:{ Exception -> 0x00db }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8 A[Catch:{ Exception -> 0x00db }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getPrimaryViewOfWidth(android.content.Context r7, android.view.View r8, android.view.ViewGroup r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "InMobi"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L_0x000e
            java.lang.String r7 = f19372a     // Catch:{ Exception -> 0x00db }
            java.lang.String r8 = "View can not be rendered using null context"
            com.inmobi.media.C6238hu.m18605a((byte) r1, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            return r2
        L_0x000e:
            com.inmobi.media.aq r3 = r6.f19373b     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.ad r3 = r3.mo34645m()     // Catch:{ Exception -> 0x00db }
            if (r3 != 0) goto L_0x0018
            r3 = r2
            goto L_0x0020
        L_0x0018:
            com.inmobi.media.aq r3 = r6.f19373b     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.ad r3 = r3.mo34645m()     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.ao r3 = (com.inmobi.media.C5814ao) r3     // Catch:{ Exception -> 0x00db }
        L_0x0020:
            if (r3 != 0) goto L_0x002a
            java.lang.String r7 = f19372a     // Catch:{ Exception -> 0x00db }
            java.lang.String r8 = "InMobiNative is not initialized. Ignoring InMobiNative.getPrimaryView()"
            com.inmobi.media.C6238hu.m18605a((byte) r1, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            return r2
        L_0x002a:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00db }
            r4.<init>(r7)     // Catch:{ Exception -> 0x00db }
            r6.f19380i = r4     // Catch:{ Exception -> 0x00db }
            r3.mo34469a(r7)     // Catch:{ Exception -> 0x00db }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00db }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00db }
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00db }
            java.lang.Thread r5 = r5.getThread()     // Catch:{ Exception -> 0x00db }
            if (r4 != r5) goto L_0x00b7
            boolean r4 = com.inmobi.media.C6256ie.m18678h()     // Catch:{ Exception -> 0x00db }
            if (r4 != 0) goto L_0x0050
            r3.mo34607Y()     // Catch:{ Exception -> 0x00db }
        L_0x004d:
            r9 = r2
            goto L_0x00ca
        L_0x0050:
            boolean r4 = r3.mo34547q()     // Catch:{ Exception -> 0x00db }
            if (r4 == 0) goto L_0x005f
            java.lang.String r8 = "Ad has expired, please create a new instance."
            com.inmobi.media.C6238hu.m18605a((byte) r1, (java.lang.String) r0, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            r3.mo34607Y()     // Catch:{ Exception -> 0x00db }
            goto L_0x004d
        L_0x005f:
            boolean r4 = r3.mo34608Z()     // Catch:{ Exception -> 0x00db }
            if (r4 != 0) goto L_0x0092
            byte r4 = r3.mo34537j()     // Catch:{ Exception -> 0x00db }
            r5 = 6
            if (r4 == r5) goto L_0x0092
            java.lang.String r8 = com.inmobi.media.C5814ao.f14656x     // Catch:{ Exception -> 0x00db }
            java.lang.String r9 = "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView()."
            com.inmobi.media.C6238hu.m18605a((byte) r1, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x00db }
            java.lang.ref.WeakReference<android.view.View> r8 = r3.f14658y     // Catch:{ Exception -> 0x00db }
            if (r8 == 0) goto L_0x004d
            java.lang.ref.WeakReference<android.view.View> r8 = r3.f14658y     // Catch:{ Exception -> 0x00db }
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x00db }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x00db }
            if (r8 == 0) goto L_0x004d
            android.view.View r9 = new android.view.View     // Catch:{ Exception -> 0x00db }
            android.content.Context r10 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ Exception -> 0x00db }
            r9.<init>(r10)     // Catch:{ Exception -> 0x00db }
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()     // Catch:{ Exception -> 0x00db }
            r9.setLayoutParams(r8)     // Catch:{ Exception -> 0x00db }
            goto L_0x00ca
        L_0x0092:
            com.inmobi.media.n r4 = r3.f14541g     // Catch:{ Exception -> 0x00db }
            if (r4 == 0) goto L_0x004d
            boolean r5 = r3.f14659z     // Catch:{ Exception -> 0x00db }
            r4.f16017r = r5     // Catch:{ Exception -> 0x00db }
            r4.f16016q = r10     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.dw r10 = r4.getViewableAd()     // Catch:{ Exception -> 0x00db }
            android.view.View r8 = r10.mo35114a(r8, r9, r1)     // Catch:{ Exception -> 0x00db }
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00db }
            r9.<init>(r8)     // Catch:{ Exception -> 0x00db }
            r3.f14658y = r9     // Catch:{ Exception -> 0x00db }
            android.os.Handler r9 = r3.f14543i     // Catch:{ Exception -> 0x00db }
            com.inmobi.media.ao$1 r4 = new com.inmobi.media.ao$1     // Catch:{ Exception -> 0x00db }
            r4.<init>(r10)     // Catch:{ Exception -> 0x00db }
            r9.post(r4)     // Catch:{ Exception -> 0x00db }
            r9 = r8
            goto L_0x00ca
        L_0x00b7:
            java.lang.String r8 = "Please ensure that you call getPrimaryView() on the UI thread"
            com.inmobi.media.C6238hu.m18605a((byte) r1, (java.lang.String) r0, (java.lang.String) r8)     // Catch:{ Exception -> 0x00db }
            com.inmobi.ads.InMobiAdRequestStatus r8 = new com.inmobi.ads.InMobiAdRequestStatus     // Catch:{ Exception -> 0x00db }
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r9 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD     // Catch:{ Exception -> 0x00db }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00db }
            r9 = 0
            r10 = 44
            r3.mo34472a((com.inmobi.ads.InMobiAdRequestStatus) r8, (boolean) r9, (byte) r10)     // Catch:{ Exception -> 0x00db }
            goto L_0x004d
        L_0x00ca:
            r7.<init>(r9)     // Catch:{ Exception -> 0x00db }
            r6.f19377f = r7     // Catch:{ Exception -> 0x00db }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x00db }
            android.view.View r7 = (android.view.View) r7     // Catch:{ Exception -> 0x00db }
            if (r7 != 0) goto L_0x00d8
            return r2
        L_0x00d8:
            r6.f19378g = r1     // Catch:{ Exception -> 0x00db }
            return r7
        L_0x00db:
            r7 = move-exception
            com.inmobi.media.gg r8 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r9 = new com.inmobi.media.hg
            r9.<init>(r7)
            r8.mo35357a((com.inmobi.media.C6217hg) r9)
            java.lang.String r7 = "Could not pause ad; SDK encountered an unexpected error"
            com.inmobi.media.C6238hu.m18605a((byte) r1, (java.lang.String) r0, (java.lang.String) r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiNative.getPrimaryViewOfWidth(android.content.Context, android.view.View, android.view.ViewGroup, int):android.view.View");
    }

    @Deprecated
    public final View getPrimaryViewOfWidth(View view, ViewGroup viewGroup, int i) {
        C6238hu.m18605a((byte) 1, f19372a, String.format("The %s API has been deprecated and API will be removed in the subsequent versions", new Object[]{"getPrimaryViewOfWidth(View, ViewGroup, int)"}));
        WeakReference<Context> weakReference = this.f19380i;
        if (weakReference != null && weakReference.get() != null) {
            return getPrimaryViewOfWidth((Context) this.f19380i.get(), view, viewGroup, i);
        }
        C6238hu.m18605a((byte) 1, f19372a, "InMobiNative is not initialized or provided context is null.");
        return null;
    }

    public final JSONObject getCustomAdContent() {
        try {
            return this.f19373b.mo34689s();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not get the ad customJson ; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    public final String getAdTitle() {
        try {
            return this.f19373b.mo34690t();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not get the ad title; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    public final String getAdDescription() {
        try {
            return this.f19373b.mo34691u();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not get the description; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    public final String getAdIconUrl() {
        try {
            return this.f19373b.mo34692v();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not get the iconUrl; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    public final String getAdLandingPageUrl() {
        try {
            return this.f19373b.mo34693w();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not get the adLandingPageUrl; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    public final String getAdCtaText() {
        try {
            return this.f19373b.mo34694x();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not get the ctaText; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    public final float getAdRating() {
        try {
            return this.f19373b.mo34695y();
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            C6238hu.m18605a((byte) 1, "InMobi", "Could not get rating; SDK encountered an unexpected error");
            return 0.0f;
        }
    }

    public final boolean isAppDownload() {
        try {
            return this.f19373b.mo34696z();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not get isAppDownload; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return false;
        }
    }

    public final Boolean isVideo() {
        try {
            return this.f19373b.mo34679A();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "Could not get isVideo; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return null;
        }
    }

    public final void reportAdClickAndOpenLandingPage() {
        try {
            this.f19373b.mo34680B();
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "reportAdClickAndOpenLandingPage failed; SDK encountered unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    public final boolean isReady() {
        return this.f19373b.mo34683l();
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f19373b.mo34706D();
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            C6228hp.m18573a(map.get("tp"));
            C6228hp.m18575b(map.get("tp-ver"));
        }
        this.f19379h.f14881c = map;
    }

    public final void setKeywords(String str) {
        this.f19379h.f14880b = str;
    }

    public final void setContentUrl(String str) {
        this.f19379h.f14884f = str;
    }

    public final void destroy() {
        try {
            View view = this.f19377f == null ? null : (View) this.f19377f.get();
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
            }
            this.f19373b.mo34685o();
            this.f19375d = null;
            this.f19376e = null;
            this.f19378g = false;
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19372a, "Failed to destroy ad; SDK encountered an unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f19373b.mo34705C();
    }

    public static final class NativeCallbacks extends PublisherCallbacks {

        /* renamed from: a */
        private WeakReference<InMobiNative> f19382a;

        /* renamed from: b */
        private boolean f19383b = true;

        public final byte getType() {
            return 0;
        }

        NativeCallbacks(InMobiNative inMobiNative) {
            this.f19382a = new WeakReference<>(inMobiNative);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo56382a() {
            this.f19383b = false;
        }

        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onAdReceived(inMobiNative);
            }
            if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onAdFetchSuccessful(inMobiNative, adMetaInfo);
            }
        }

        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            onAdLoadFailed(inMobiAdRequestStatus);
        }

        public final void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f19383b) {
                this.f19383b = true;
                if (inMobiNative.f19375d != null) {
                    inMobiNative.f19375d.onAdLoadSucceeded(inMobiNative);
                }
                if (inMobiNative.f19375d != null) {
                    inMobiNative.f19375d.onAdLoadSucceeded(inMobiNative, adMetaInfo);
                }
            }
        }

        public final void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f19383b) {
                this.f19383b = true;
                if (inMobiNative.f19375d != null) {
                    inMobiNative.f19375d.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
                }
            }
        }

        public final void onAdWillDisplay() {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            if (inMobiNative.f19381j != null) {
                inMobiNative.f19381j.onActionRequired(inMobiNative);
            }
            if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onAdFullScreenWillDisplay(inMobiNative);
            }
        }

        public final void onAdDisplayed(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onAdFullScreenDisplayed(inMobiNative);
            }
        }

        public final void onAdDismissed() {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onAdFullScreenDismissed(inMobiNative);
            }
        }

        public final void onAdClicked(Map<Object, Object> map) {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onAdClicked(inMobiNative);
            }
        }

        public final void onUserLeftApplication() {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            if (inMobiNative.f19381j != null) {
                inMobiNative.f19381j.onActionRequired(inMobiNative);
            }
            if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onUserWillLeaveApplication(inMobiNative);
            }
        }

        public final void onAdImpressed() {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onAdImpressed(inMobiNative);
            }
        }

        public final void onVideoCompleted() {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19376e != null) {
                inMobiNative.f19376e.onVideoCompleted(inMobiNative);
            }
        }

        public final void onVideoSkipped() {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19376e != null) {
                inMobiNative.f19376e.onVideoSkipped(inMobiNative);
            }
        }

        public final void onAudioStateChanged(boolean z) {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19376e != null) {
                inMobiNative.f19376e.onAudioStateChanged(inMobiNative, z);
            }
        }

        public final void onRequestPayloadCreated(byte[] bArr) {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onRequestPayloadCreated(bArr);
            }
        }

        public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiNative inMobiNative = (InMobiNative) this.f19382a.get();
            if (inMobiNative == null) {
                C6238hu.m18605a((byte) 1, InMobiNative.f19372a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (inMobiNative.f19375d != null) {
                inMobiNative.f19375d.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
            }
        }
    }
}
