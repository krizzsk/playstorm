package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;

/* renamed from: com.ironsource.mediationsdk.C */
public final class C6456C {

    /* renamed from: b */
    private static final C6456C f16385b = new C6456C();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyInterstitialListener f16386a = null;

    private C6456C() {
    }

    /* renamed from: a */
    public static C6456C m19387a() {
        return f16385b;
    }

    /* renamed from: a */
    public final void mo36004a(final String str, final IronSourceError ironSourceError) {
        if (this.f16386a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6456C.this.f16386a.onInterstitialAdLoadFailed(str, ironSourceError);
                    C6456C c = C6456C.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo36005b(final String str, final IronSourceError ironSourceError) {
        if (this.f16386a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6456C.this.f16386a.onInterstitialAdShowFailed(str, ironSourceError);
                    C6456C c = C6456C.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
