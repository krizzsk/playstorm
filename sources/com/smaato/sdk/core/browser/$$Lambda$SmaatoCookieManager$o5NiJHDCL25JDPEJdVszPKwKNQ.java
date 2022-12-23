package com.smaato.sdk.core.browser;

import android.webkit.CookieSyncManager;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.browser.-$$Lambda$SmaatoCookieManager$o5NiJHDCL25JDPEJdV-szPKwKNQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$SmaatoCookieManager$o5NiJHDCL25JDPEJdVszPKwKNQ implements Consumer {
    public static final /* synthetic */ $$Lambda$SmaatoCookieManager$o5NiJHDCL25JDPEJdVszPKwKNQ INSTANCE = new $$Lambda$SmaatoCookieManager$o5NiJHDCL25JDPEJdVszPKwKNQ();

    private /* synthetic */ $$Lambda$SmaatoCookieManager$o5NiJHDCL25JDPEJdVszPKwKNQ() {
    }

    public final void accept(Object obj) {
        ((CookieSyncManager) obj).stopSync();
    }
}
