package com.smaato.sdk.core.webview;

import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebViewClient;

/* renamed from: com.smaato.sdk.core.webview.-$$Lambda$bSVuxij1dwzUrJgQd-2IEdzwsD0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$bSVuxij1dwzUrJgQd2IEdzwsD0 implements Consumer {
    public static final /* synthetic */ $$Lambda$bSVuxij1dwzUrJgQd2IEdzwsD0 INSTANCE = new $$Lambda$bSVuxij1dwzUrJgQd2IEdzwsD0();

    private /* synthetic */ $$Lambda$bSVuxij1dwzUrJgQd2IEdzwsD0() {
    }

    public final void accept(Object obj) {
        ((BaseWebViewClient.WebViewClientCallback) obj).onRenderProcessGone();
    }
}
