package com.smaato.sdk.interstitial.csm;

import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.interstitial.csm.-$$Lambda$LYTOrFBYlBnoT5osEe5BDDbB_7U  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LYTOrFBYlBnoT5osEe5BDDbB_7U implements Consumer {
    public static final /* synthetic */ $$Lambda$LYTOrFBYlBnoT5osEe5BDDbB_7U INSTANCE = new $$Lambda$LYTOrFBYlBnoT5osEe5BDDbB_7U();

    private /* synthetic */ $$Lambda$LYTOrFBYlBnoT5osEe5BDDbB_7U() {
    }

    public final void accept(Object obj) {
        ((SMAInterstitialNetworkEvent) obj).onDestroy();
    }
}
