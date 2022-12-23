package com.smaato.sdk.rewarded.csm;

import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.rewarded.csm.-$$Lambda$t4XVjiO-x5EbqMl2om8stnSclAQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$t4XVjiOx5EbqMl2om8stnSclAQ implements Consumer {
    public static final /* synthetic */ $$Lambda$t4XVjiOx5EbqMl2om8stnSclAQ INSTANCE = new $$Lambda$t4XVjiOx5EbqMl2om8stnSclAQ();

    private /* synthetic */ $$Lambda$t4XVjiOx5EbqMl2om8stnSclAQ() {
    }

    public final void accept(Object obj) {
        ((SMARewardedNetworkEvent) obj).onDestroy();
    }
}
