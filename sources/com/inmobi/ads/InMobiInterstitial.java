package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.C5808am;
import com.inmobi.media.C5894bm;
import com.inmobi.media.C6009e;
import com.inmobi.media.C6181gg;
import com.inmobi.media.C6217hg;
import com.inmobi.media.C6227ho;
import com.inmobi.media.C6228hp;
import com.inmobi.media.C6238hu;
import com.inmobi.media.C6252ic;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiInterstitial {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f19361b = InMobiInterstitial.class.getSimpleName();

    /* renamed from: a */
    public InterstitialAdEventListener f19362a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5808am f19363c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f19364d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f19365e = false;

    /* renamed from: f */
    private WeakReference<Context> f19366f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5894bm f19367g = new C5894bm();

    /* renamed from: h */
    private C8139a f19368h = new C8139a(this);

    /* renamed from: i */
    private PreloadManager f19369i = new PreloadManager() {

        /* renamed from: b */
        private C6009e f19371b = new C6009e(InMobiInterstitial.this);

        public final void preload() {
            boolean unused = InMobiInterstitial.this.f19365e = true;
            InMobiInterstitial.this.f19367g.f14883e = "NonAB";
            InMobiInterstitial.this.f19363c.mo34670a(InMobiInterstitial.this.f19367g, InMobiInterstitial.this.f19364d);
            InMobiInterstitial.this.f19363c.mo34669a((PublisherCallbacks) this.f19371b);
        }

        public final void load() {
            try {
                InMobiInterstitial.this.f19363c.mo34671l();
            } catch (IllegalStateException e) {
                C6238hu.m18605a((byte) 1, InMobiInterstitial.f19361b, e.getMessage());
                InMobiInterstitial.this.f19362a.onAdLoadFailed(InMobiInterstitial.this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    };

    public InMobiInterstitial(Context context, long j, InterstitialAdEventListener interstitialAdEventListener) throws SdkNotInitializedException {
        if (C6227ho.m18550b()) {
            this.f19364d = context.getApplicationContext();
            this.f19367g.f14879a = j;
            this.f19366f = new WeakReference<>(context);
            this.f19362a = interstitialAdEventListener;
            this.f19363c = new C5808am();
            return;
        }
        throw new SdkNotInitializedException(f19361b);
    }

    public final void setListener(InterstitialAdEventListener interstitialAdEventListener) {
        this.f19362a = interstitialAdEventListener;
    }

    public final void setKeywords(String str) {
        this.f19367g.f14880b = str;
    }

    public final void getSignals() {
        this.f19363c.mo34670a(this.f19367g, this.f19364d);
        this.f19363c.mo34710b((PublisherCallbacks) this.f19368h);
    }

    public final PreloadManager getPreloadManager() {
        return this.f19369i;
    }

    public final void load(byte[] bArr) {
        this.f19365e = true;
        this.f19367g.f14883e = "AB";
        this.f19363c.mo34670a(this.f19367g, this.f19364d);
        if (Build.VERSION.SDK_INT >= 29) {
            WeakReference<Context> weakReference = this.f19366f;
            C6252ic.m18657a(weakReference == null ? null : (Context) weakReference.get());
        }
        this.f19363c.mo34638a(bArr, (PublisherCallbacks) this.f19368h);
    }

    public final void load() {
        try {
            this.f19365e = true;
            this.f19367g.f14883e = "NonAB";
            this.f19363c.mo34670a(this.f19367g, this.f19364d);
            if (Build.VERSION.SDK_INT >= 29) {
                C6252ic.m18657a(this.f19366f == null ? null : (Context) this.f19366f.get());
            }
            this.f19363c.mo34669a((PublisherCallbacks) this.f19368h);
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19361b, "Unable to load ad; SDK encountered an unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    public final void show() {
        try {
            if (!this.f19365e) {
                C6238hu.m18605a((byte) 1, f19361b, "load() must be called before trying to show the ad");
            } else {
                this.f19363c.mo34673o();
            }
        } catch (Exception e) {
            C6238hu.m18605a((byte) 1, f19361b, "Unable to show ad; SDK encountered an unexpected error");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    @Deprecated
    public final void show(int i, int i2) {
        C6238hu.m18605a((byte) 1, f19361b, String.format("The %s API has been deprecated and API will be removed in the subsequent versions", new Object[]{"show(int, int)"}));
        show();
    }

    public final boolean isReady() {
        return this.f19363c.mo34672n();
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f19363c.mo34706D();
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f19363c.mo34705C();
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            C6228hp.m18573a(map.get("tp"));
            C6228hp.m18575b(map.get("tp-ver"));
        }
        this.f19367g.f14881c = map;
    }

    public final void setContentUrl(String str) {
        this.f19367g.f14884f = str;
    }

    public final void disableHardwareAcceleration() {
        this.f19367g.f14882d = true;
    }

    /* renamed from: com.inmobi.ads.InMobiInterstitial$a */
    public static final class C8139a extends C6009e {
        public final byte getType() {
            return 0;
        }

        C8139a(InMobiInterstitial inMobiInterstitial) {
            super(inMobiInterstitial);
        }

        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15282a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.f19363c.mo34671l();
                } catch (IllegalStateException e) {
                    C6238hu.m18605a((byte) 1, InMobiInterstitial.f19361b, e.getMessage());
                    inMobiInterstitial.f19362a.onAdLoadFailed(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }

        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) this.f15282a.get();
            if (inMobiInterstitial != null && inMobiInterstitial.f19362a != null) {
                inMobiInterstitial.f19362a.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
            }
        }
    }
}
