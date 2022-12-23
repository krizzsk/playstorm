package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.C5794ah;
import com.inmobi.media.C5845b;
import com.inmobi.media.C5894bm;
import com.inmobi.media.C5912c;
import com.inmobi.media.C6227ho;
import com.inmobi.media.C6228hp;
import com.inmobi.media.C6238hu;
import com.inmobi.media.C6252ic;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiBanner extends RelativeLayout {

    /* renamed from: a */
    public static final String f19341a = InMobiBanner.class.getSimpleName();

    /* renamed from: b */
    public BannerAdEventListener f19342b;

    /* renamed from: c */
    public C5794ah f19343c;

    /* renamed from: d */
    public AnimationType f19344d = AnimationType.ROTATE_HORIZONTAL_AXIS;

    /* renamed from: e */
    public C8137a f19345e = new C8137a(this);

    /* renamed from: f */
    private int f19346f;

    /* renamed from: g */
    private boolean f19347g = true;

    /* renamed from: h */
    private C5912c f19348h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f19349i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f19350j = 0;

    /* renamed from: k */
    private long f19351k = 0;

    /* renamed from: l */
    private WeakReference<Activity> f19352l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C5894bm f19353m = new C5894bm();

    /* renamed from: n */
    private PreloadManager f19354n = new PreloadManager() {

        /* renamed from: b */
        private C5845b f19356b = new C5845b(InMobiBanner.this);

        public final void preload() {
            InMobiBanner.this.setEnableAutoRefresh(false);
            InMobiBanner.this.f19353m.f14883e = "NonAB";
            InMobiBanner.this.mo56308a((PublisherCallbacks) this.f19356b, false);
        }

        public final void load() {
            try {
                InMobiBanner.this.f19343c.mo34646n();
            } catch (IllegalStateException e) {
                C6238hu.m18605a((byte) 1, InMobiBanner.f19341a, e.getMessage());
                if (InMobiBanner.this.f19342b != null) {
                    InMobiBanner.this.f19342b.onAdLoadFailed(InMobiBanner.this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    };

    public enum AnimationType {
        ANIMATION_OFF,
        ROTATE_HORIZONTAL_AXIS,
        ANIMATION_ALPHA,
        ROTATE_VERTICAL_AXIS
    }

    public InMobiBanner(Context context, AttributeSet attributeSet) throws SdkNotInitializedException {
        super(context, attributeSet);
        if (C6227ho.m18550b()) {
            if (context instanceof Activity) {
                this.f19352l = new WeakReference<>((Activity) context);
            }
            this.f19343c = new C5794ah();
            String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID);
            String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "refreshInterval");
            if (attributeValue != null) {
                long a = m23399a(attributeValue);
                if (a != Long.MIN_VALUE) {
                    this.f19353m.f14879a = a;
                } else {
                    throw new InvalidPlacementIdException();
                }
            }
            m23401a(getContext());
            this.f19346f = this.f19343c.mo34651s();
            this.f19348h = new C5912c(this);
            if (attributeValue2 != null) {
                try {
                    setRefreshInterval(Integer.parseInt(attributeValue2.trim()));
                } catch (NumberFormatException unused) {
                    C6238hu.m18605a((byte) 1, f19341a, "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
                }
            }
        } else {
            throw new SdkNotInitializedException(f19341a);
        }
    }

    /* renamed from: a */
    private static long m23399a(String str) {
        try {
            StringBuilder sb = new StringBuilder(str.trim());
            if ("plid-".equalsIgnoreCase(sb.substring(0, 5))) {
                return Long.parseLong(sb.substring(5, sb.length()).trim());
            }
            C6238hu.m18605a((byte) 1, f19341a, "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            C6238hu.m18605a((byte) 1, f19341a, "Invalid Placement id: ".concat(String.valueOf(str)));
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            C6238hu.m18605a((byte) 1, f19341a, "Placement id value supplied in XML layout is not valid. Banner creation failed.");
            C6238hu.m18605a((byte) 1, f19341a, "Invalid Placement id: ".concat(String.valueOf(str)));
        } catch (StringIndexOutOfBoundsException unused2) {
            C6238hu.m18605a((byte) 1, f19341a, "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            C6238hu.m18605a((byte) 1, f19341a, "Invalid Placement id: ".concat(String.valueOf(str)));
        }
    }

    public InMobiBanner(Context context, long j) throws SdkNotInitializedException {
        super(context);
        if (C6227ho.m18550b()) {
            if (context instanceof Activity) {
                this.f19352l = new WeakReference<>((Activity) context);
            }
            this.f19343c = new C5794ah();
            this.f19353m.f14879a = j;
            m23401a(context);
            this.f19346f = this.f19343c.mo34651s();
            this.f19348h = new C5912c(this);
            return;
        }
        throw new SdkNotInitializedException(f19341a);
    }

    /* renamed from: a */
    private boolean m23402a(boolean z) {
        if (!z || this.f19342b != null) {
            return true;
        }
        C6238hu.m18605a((byte) 1, f19341a, "Listener supplied is null, Ignoring your call.");
        return false;
    }

    public final void getSignals() {
        if (!m23402a(true)) {
            return;
        }
        if (m23405b("getSignals()")) {
            m23401a(getContext());
            setEnableAutoRefresh(false);
            this.f19343c.mo34710b((PublisherCallbacks) this.f19345e);
            return;
        }
        this.f19345e.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
    }

    public final PreloadManager getPreloadManager() {
        return this.f19354n;
    }

    public final void load(byte[] bArr) {
        if (!m23402a(false)) {
            return;
        }
        if (m23405b("load(byte[])")) {
            this.f19353m.f14883e = "AB";
            m23401a(getContext());
            this.f19343c.mo34638a(bArr, (PublisherCallbacks) this.f19345e);
            return;
        }
        this.f19343c.mo34634a((byte) 86);
        this.f19345e.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
    }

    public final void load() {
        if (m23402a(false)) {
            this.f19353m.f14883e = "NonAB";
            mo56308a((PublisherCallbacks) this.f19345e, false);
        }
    }

    /* renamed from: a */
    public final void mo56308a(final PublisherCallbacks publisherCallbacks, final boolean z) {
        try {
            this.f19343c.mo34656x();
            if (z) {
                this.f19353m.f14883e = "NonAB";
            }
            m23401a(getContext());
            if (this.f19343c.mo34652t()) {
                this.f19343c.mo34640b((byte) Ascii.f17944SI);
                if (this.f19342b != null) {
                    this.f19342b.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                C6238hu.m18605a((byte) 1, f19341a, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
            } else if (!m23405b("load")) {
                this.f19343c.mo34634a((byte) 86);
                this.f19343c.mo34584a(this.f19343c.mo34645m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
            } else if (!mo56309a()) {
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        try {
                            if (InMobiBanner.this.mo56309a()) {
                                InMobiBanner.this.m23411f();
                                if (InMobiBanner.this.m23409d()) {
                                    InMobiBanner.this.f19343c.mo34637a(publisherCallbacks, InMobiBanner.this.getFrameSizeString(), z);
                                    return;
                                }
                                return;
                            }
                            C6238hu.m18605a((byte) 1, InMobiBanner.f19341a, "The height or width of the banner can not be determined");
                            InMobiBanner.this.f19343c.mo34634a((byte) 86);
                            InMobiBanner.this.f19343c.mo34584a(InMobiBanner.this.f19343c.mo34645m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                        } catch (Exception unused) {
                            InMobiBanner.this.f19343c.mo34634a((byte) 87);
                            C6238hu.m18605a((byte) 1, InMobiBanner.f19341a, "SDK encountered unexpected error while loading an ad");
                            String unused2 = InMobiBanner.f19341a;
                        }
                    }
                }, 200);
            } else {
                m23411f();
                if (m23409d()) {
                    this.f19343c.mo34637a(publisherCallbacks, getFrameSizeString(), z);
                }
            }
        } catch (Exception unused) {
            this.f19343c.mo34634a((byte) 87);
            C6238hu.m18605a((byte) 1, f19341a, "Unable to load ad; SDK encountered an unexpected error");
        }
    }

    /* renamed from: b */
    private boolean m23405b(String str) {
        if (!mo56309a()) {
            if (getLayoutParams() == null) {
                String str2 = f19341a;
                C6238hu.m18605a((byte) 1, str2, "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
                return false;
            } else if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                C6238hu.m18605a((byte) 1, f19341a, "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ".concat(String.valueOf(str)));
                return false;
            } else {
                m23410e();
            }
        }
        return true;
    }

    public final void load(Context context) {
        if (m23402a(false)) {
            if (context instanceof Activity) {
                this.f19352l = new WeakReference<>((Activity) context);
            } else {
                this.f19352l = null;
            }
            this.f19353m.f14883e = "NonAB";
            mo56308a((PublisherCallbacks) this.f19345e, false);
        }
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f19343c.mo34706D();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m23409d() {
        long j = this.f19351k;
        if (j != 0 && !this.f19343c.mo34639a(j)) {
            return false;
        }
        this.f19351k = SystemClock.elapsedRealtime();
        return true;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            C6228hp.m18573a(map.get("tp"));
            C6228hp.m18575b(map.get("tp-ver"));
        }
        this.f19353m.f14881c = map;
    }

    public final void setKeywords(String str) {
        this.f19353m.f14880b = str;
    }

    public final void setContentUrl(String str) {
        this.f19353m.f14884f = str;
    }

    public final void setListener(BannerAdEventListener bannerAdEventListener) {
        this.f19342b = bannerAdEventListener;
    }

    public final void setEnableAutoRefresh(boolean z) {
        try {
            if (this.f19347g != z) {
                this.f19347g = z;
                if (z) {
                    mo56310b();
                } else {
                    m23411f();
                }
            }
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19341a, "Unable to setup auto-refresh on the ad; SDK encountered an unexpected error");
        }
    }

    public final void setRefreshInterval(int i) {
        try {
            this.f19353m.f14883e = "NonAB";
            m23401a(getContext());
            this.f19346f = this.f19343c.mo34633a(i, this.f19346f);
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19341a, "Unable to set refresh interval for the ad; SDK encountered an unexpected error");
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        this.f19344d = animationType;
    }

    public final void disableHardwareAcceleration() {
        this.f19353m.f14882d = true;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            this.f19343c.mo34654v();
            m23410e();
            if (!mo56309a()) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        try {
                            int unused = InMobiBanner.this.f19349i = C6252ic.m18660b(InMobiBanner.this.getMeasuredWidth());
                            int unused2 = InMobiBanner.this.f19350j = C6252ic.m18660b(InMobiBanner.this.getMeasuredHeight());
                            if (!InMobiBanner.this.mo56309a()) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 16) {
                                InMobiBanner.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            } else {
                                InMobiBanner.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                            }
                        } catch (Exception unused3) {
                            C6238hu.m18605a((byte) 1, InMobiBanner.f19341a, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error");
                            String unused4 = InMobiBanner.f19341a;
                        }
                    }
                });
            }
            mo56310b();
            if (Build.VERSION.SDK_INT >= 29) {
                C6252ic.m18658a(getContext(), getRootWindowInsets());
            }
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19341a, "InMobiBanner#onAttachedToWindow() handler threw unexpected error");
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            m23411f();
            this.f19343c.mo34653u();
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19341a, "InMobiBanner.onDetachedFromWindow() handler threw unexpected error");
        }
    }

    /* renamed from: e */
    private void m23410e() {
        if (getLayoutParams() != null) {
            this.f19349i = C6252ic.m18660b(getLayoutParams().width);
            this.f19350j = C6252ic.m18660b(getLayoutParams().height);
        }
    }

    public final void setBannerSize(int i, int i2) {
        this.f19349i = i;
        this.f19350j = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56309a() {
        return this.f19349i > 0 && this.f19350j > 0;
    }

    /* access modifiers changed from: private */
    public String getFrameSizeString() {
        return this.f19349i + "x" + this.f19350j;
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
            if (i == 0) {
                mo56310b();
            } else {
                m23411f();
            }
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19341a, "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error");
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
            if (z) {
                mo56310b();
            } else {
                m23411f();
            }
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, f19341a, "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error");
        }
    }

    /* renamed from: a */
    private void m23401a(Context context) {
        this.f19343c.mo34635a(context, this.f19353m, getFrameSizeString());
        C5794ah ahVar = this.f19343c;
        int i = this.f19346f;
        this.f19346f = ahVar.mo34633a(i, i);
    }

    /* renamed from: b */
    public final void mo56310b() {
        C5912c cVar;
        if (isShown() && hasWindowFocus()) {
            C5912c cVar2 = this.f19348h;
            if (cVar2 != null) {
                cVar2.removeMessages(1);
            }
            if (this.f19343c.mo34644l() && this.f19347g && (cVar = this.f19348h) != null) {
                cVar.sendEmptyMessageDelayed(1, (long) (this.f19346f * 1000));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m23411f() {
        C5912c cVar = this.f19348h;
        if (cVar != null) {
            cVar.removeMessages(1);
        }
    }

    public final void resume() {
        try {
            if (this.f19352l == null) {
                this.f19343c.mo34649q();
            }
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void pause() {
        try {
            if (this.f19352l == null) {
                this.f19343c.mo34650r();
            }
        } catch (Exception unused) {
            C6238hu.m18605a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f19343c.mo34705C();
    }

    public final void destroy() {
        m23411f();
        removeAllViews();
        this.f19343c.mo34655w();
        this.f19342b = null;
    }

    /* renamed from: com.inmobi.ads.InMobiBanner$a */
    public static final class C8137a extends C5845b {
        public final byte getType() {
            return 0;
        }

        C8137a(InMobiBanner inMobiBanner) {
            super(inMobiBanner);
        }

        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiBanner inMobiBanner = (InMobiBanner) this.f14745a.get();
            if (inMobiBanner != null) {
                try {
                    inMobiBanner.f19343c.mo34646n();
                } catch (IllegalStateException e) {
                    C6238hu.m18605a((byte) 1, InMobiBanner.f19341a, e.getMessage());
                    if (inMobiBanner.f19342b != null) {
                        inMobiBanner.f19342b.onAdLoadFailed(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }

        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiBanner inMobiBanner = (InMobiBanner) this.f14745a.get();
            if (inMobiBanner != null) {
                if (inMobiBanner.f19342b != null) {
                    inMobiBanner.f19342b.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
                }
                inMobiBanner.mo56310b();
            }
        }
    }
}
