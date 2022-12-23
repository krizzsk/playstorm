package com.ogury.p376ed.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.p376ed.OguryAdImpressionListener;

/* renamed from: com.ogury.ed.internal.e */
public final class C10480e implements C10679k {

    /* renamed from: a */
    public static final C10481a f26475a = new C10481a((byte) 0);

    /* renamed from: b */
    private final OguryAdImpressionListener f26476b;

    public C10480e(OguryAdImpressionListener oguryAdImpressionListener) {
        C10765mq.m32773b(oguryAdImpressionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26476b = oguryAdImpressionListener;
    }

    /* renamed from: com.ogury.ed.internal.e$a */
    public static final class C10481a {
        public /* synthetic */ C10481a(byte b) {
            this();
        }

        private C10481a() {
        }

        /* renamed from: a */
        public static C10480e m31685a(OguryAdImpressionListener oguryAdImpressionListener) {
            if (oguryAdImpressionListener != null) {
                return new C10480e(oguryAdImpressionListener);
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo67211a() {
        this.f26476b.onAdImpression();
    }
}
