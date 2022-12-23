package com.ogury.p376ed.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.core.OguryError;
import com.ogury.p376ed.OguryAdListener;

/* renamed from: com.ogury.ed.internal.f */
public final class C10512f implements C10578h {

    /* renamed from: a */
    public static final C10513a f26570a = new C10513a((byte) 0);

    /* renamed from: b */
    private final OguryAdListener f26571b;

    /* renamed from: b */
    public final void mo67349b() {
    }

    /* renamed from: com.ogury.ed.internal.f$a */
    public static final class C10513a {
        public /* synthetic */ C10513a(byte b) {
            this();
        }

        private C10513a() {
        }

        /* renamed from: a */
        public static C10512f m31885a(OguryAdListener oguryAdListener) {
            if (oguryAdListener != null) {
                return new C10512f(oguryAdListener);
            }
            return null;
        }
    }

    public C10512f(OguryAdListener oguryAdListener) {
        C10765mq.m32773b(oguryAdListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26571b = oguryAdListener;
    }

    /* renamed from: c */
    public final void mo67350c() {
        this.f26571b.onAdError(new OguryError(2008, "The ad server doesn't have an ad to present to the user"));
    }

    /* renamed from: d */
    public final void mo67351d() {
        this.f26571b.onAdLoaded();
    }

    /* renamed from: e */
    public final void mo67352e() {
        this.f26571b.onAdError(new OguryError(2009, "The loading of the ad failed"));
    }

    /* renamed from: f */
    public final void mo67353f() {
        this.f26571b.onAdDisplayed();
    }

    /* renamed from: g */
    public final void mo67354g() {
        this.f26571b.onAdClosed();
    }

    /* renamed from: a */
    public final void mo67348a(int i) {
        C10426d dVar = C10426d.f26369a;
        this.f26571b.onAdError(C10426d.m31543a(i));
    }

    /* renamed from: a */
    public final void mo67087a() {
        this.f26571b.onAdClicked();
    }
}
