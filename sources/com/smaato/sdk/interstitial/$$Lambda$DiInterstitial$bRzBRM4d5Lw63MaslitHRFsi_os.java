package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.util.notifier.TimerUtils;

/* renamed from: com.smaato.sdk.interstitial.-$$Lambda$DiInterstitial$bRzBRM4d5Lw63MaslitHRFsi_os  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiInterstitial$bRzBRM4d5Lw63MaslitHRFsi_os implements ClassFactory {
    public static final /* synthetic */ $$Lambda$DiInterstitial$bRzBRM4d5Lw63MaslitHRFsi_os INSTANCE = new $$Lambda$DiInterstitial$bRzBRM4d5Lw63MaslitHRFsi_os();

    private /* synthetic */ $$Lambda$DiInterstitial$bRzBRM4d5Lw63MaslitHRFsi_os() {
    }

    public final Object get(DiConstructor diConstructor) {
        return TimerUtils.createSingleTimer(2000);
    }
}
