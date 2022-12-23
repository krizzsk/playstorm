package com.smaato.sdk.core.browser;

import android.webkit.CookieSyncManager;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.browser.-$$Lambda$SmaatoCookieManager$3mY5KtXw7WSTiZjpr5J4GiRUs4w  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$SmaatoCookieManager$3mY5KtXw7WSTiZjpr5J4GiRUs4w implements Consumer {
    public static final /* synthetic */ $$Lambda$SmaatoCookieManager$3mY5KtXw7WSTiZjpr5J4GiRUs4w INSTANCE = new $$Lambda$SmaatoCookieManager$3mY5KtXw7WSTiZjpr5J4GiRUs4w();

    private /* synthetic */ $$Lambda$SmaatoCookieManager$3mY5KtXw7WSTiZjpr5J4GiRUs4w() {
    }

    public final void accept(Object obj) {
        ((CookieSyncManager) obj).sync();
    }
}
