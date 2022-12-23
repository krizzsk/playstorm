package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;

/* renamed from: com.ironsource.mediationsdk.ab */
public final class C6561ab {

    /* renamed from: b */
    private static final C6561ab f16977b = new C6561ab();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyRewardedVideoListener f16978a = null;

    private C6561ab() {
    }

    /* renamed from: a */
    public static C6561ab m19971a() {
        return f16977b;
    }

    /* renamed from: a */
    public final void mo36407a(final String str, final IronSourceError ironSourceError) {
        if (this.f16978a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6561ab.this.f16978a.onRewardedVideoAdLoadFailed(str, ironSourceError);
                    C6561ab abVar = C6561ab.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36408b(final String str, final IronSourceError ironSourceError) {
        if (this.f16978a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6561ab.this.f16978a.onRewardedVideoAdShowFailed(str, ironSourceError);
                    C6561ab abVar = C6561ab.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
