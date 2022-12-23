package p394io.presage.interstitial.optinvideo;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.p376ed.OguryAdClickCallback;
import com.ogury.p376ed.internal.C10366bm;
import com.ogury.p376ed.internal.C10491ej;
import com.ogury.p376ed.internal.C10568gs;
import com.ogury.p376ed.internal.C10574gw;
import com.ogury.p376ed.internal.C10578h;
import com.ogury.p376ed.internal.C10684ke;
import com.ogury.p376ed.internal.C10730lk;
import com.ogury.p376ed.internal.C10765mq;
import com.ogury.p376ed.internal.C10766mr;
import com.ogury.p376ed.internal.C10832t;
import p394io.presage.common.AdConfig;
import p394io.presage.common.network.models.RewardItem;
import p394io.presage.interstitial.PresageInterstitialCallback;

@Deprecated
/* renamed from: io.presage.interstitial.optinvideo.PresageOptinVideo */
public final class PresageOptinVideo {

    /* renamed from: a */
    private final C10366bm f29344a;

    /* renamed from: b */
    private final C10568gs f29345b;

    private PresageOptinVideo(C10366bm bmVar) {
        this.f29344a = bmVar;
        this.f29345b = new C10568gs();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresageOptinVideo(Context context, AdConfig adConfig) {
        this(new C10366bm(context, adConfig, C10491ej.OPTIN_VIDEO));
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(adConfig, "adConfig");
    }

    public final boolean isLoaded() {
        return this.f29344a.mo67104b();
    }

    /* renamed from: io.presage.interstitial.optinvideo.PresageOptinVideo$a */
    static final class C12362a extends C10766mr implements C10730lk<RewardItem, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ PresageOptinVideoCallback f29346a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12362a(PresageOptinVideoCallback presageOptinVideoCallback) {
            super(1);
            this.f29346a = presageOptinVideoCallback;
        }

        /* renamed from: a */
        private void m34610a(RewardItem rewardItem) {
            C10765mq.m32773b(rewardItem, "rewardItem");
            PresageOptinVideoCallback presageOptinVideoCallback = this.f29346a;
            if (presageOptinVideoCallback != null) {
                presageOptinVideoCallback.onAdRewarded(rewardItem);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m34610a((RewardItem) obj);
            return C10684ke.f26938a;
        }
    }

    public final void setOptinVideoCallback(PresageOptinVideoCallback presageOptinVideoCallback) {
        this.f29344a.mo67098a((C10578h) this.f29345b.mo67507a((PresageInterstitialCallback) presageOptinVideoCallback));
        this.f29344a.mo67100a((C10730lk<? super RewardItem, C10684ke>) new C12362a(presageOptinVideoCallback));
    }

    public final void setOnAdClickedCallback(OguryAdClickCallback oguryAdClickCallback) {
        this.f29345b.mo67508a(oguryAdClickCallback);
    }

    public final void load() {
        this.f29344a.mo67097a();
    }

    public final void show() {
        this.f29344a.mo67101a((C10832t) C10574gw.f26698a);
    }

    public final void setUserId(String str) {
        C10765mq.m32773b(str, DataKeys.USER_ID);
        this.f29344a.mo67102a(str);
    }
}
