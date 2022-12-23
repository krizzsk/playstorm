package com.smaato.sdk.banner.widget;

import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.banner.widget.-$$Lambda$BannerViewLoader$-0uyAnMbDcpj7pKF_IP8IRSXO60  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BannerViewLoader$0uyAnMbDcpj7pKF_IP8IRSXO60 implements Consumer {
    public static final /* synthetic */ $$Lambda$BannerViewLoader$0uyAnMbDcpj7pKF_IP8IRSXO60 INSTANCE = new $$Lambda$BannerViewLoader$0uyAnMbDcpj7pKF_IP8IRSXO60();

    private /* synthetic */ $$Lambda$BannerViewLoader$0uyAnMbDcpj7pKF_IP8IRSXO60() {
    }

    public final void accept(Object obj) {
        ((BannerView) obj).onAdFailedToLoad(BannerError.INTERNAL_ERROR);
    }
}
