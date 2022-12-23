package p394io.presage.interstitial;

import android.content.Context;
import com.ogury.p376ed.OguryAdClickCallback;
import com.ogury.p376ed.internal.C10366bm;
import com.ogury.p376ed.internal.C10491ej;
import com.ogury.p376ed.internal.C10568gs;
import com.ogury.p376ed.internal.C10574gw;
import com.ogury.p376ed.internal.C10578h;
import com.ogury.p376ed.internal.C10765mq;
import com.ogury.p376ed.internal.C10832t;
import p394io.presage.common.AdConfig;

@Deprecated
/* renamed from: io.presage.interstitial.PresageInterstitial */
public final class PresageInterstitial {

    /* renamed from: a */
    private final C10366bm f29342a;

    /* renamed from: b */
    private final C10568gs f29343b;

    private PresageInterstitial(C10366bm bmVar) {
        this.f29342a = bmVar;
        this.f29343b = new C10568gs();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresageInterstitial(Context context) {
        this(context, (AdConfig) null);
        C10765mq.m32773b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresageInterstitial(Context context, AdConfig adConfig) {
        this(new C10366bm(context, adConfig, C10491ej.INTERSTITIAL));
        C10765mq.m32773b(context, "context");
    }

    public final boolean isLoaded() {
        return this.f29342a.mo67104b();
    }

    public final void setInterstitialCallback(PresageInterstitialCallback presageInterstitialCallback) {
        this.f29342a.mo67098a((C10578h) this.f29343b.mo67507a(presageInterstitialCallback));
    }

    public final void setOnAdClickedCallback(OguryAdClickCallback oguryAdClickCallback) {
        this.f29343b.mo67508a(oguryAdClickCallback);
    }

    public final void load() {
        this.f29342a.mo67097a();
    }

    public final void show() {
        this.f29342a.mo67101a((C10832t) C10574gw.f26698a);
    }
}
