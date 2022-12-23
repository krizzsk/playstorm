package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C8608u;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.k */
/* compiled from: WindVaneWebViewChromeClient */
public final class C8828k extends WebChromeClient {

    /* renamed from: a */
    WindVaneWebView f21483a;

    /* renamed from: b */
    private C8821d f21484b;

    public C8828k(WindVaneWebView windVaneWebView) {
        this.f21483a = windVaneWebView;
    }

    /* renamed from: a */
    public final void mo58316a(C8821d dVar) {
        this.f21484b = dVar;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C8608u.m24884d("H5_ENTRY", str2 + "");
        C8820c signalCommunication = this.f21483a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.mo58301a(str3)) {
            return false;
        }
        signalCommunication.mo58302b(str2);
        jsPromptResult.confirm("");
        return true;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C8821d dVar = this.f21484b;
        if (dVar != null) {
            dVar.mo57904b(webView, i);
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        C8820c signalCommunication = this.f21483a.getSignalCommunication();
        if (!(signalCommunication == null || consoleMessage == null)) {
            String message = consoleMessage.message();
            if (TextUtils.isEmpty(message) || !message.startsWith("mv://")) {
                return false;
            }
            C8608u.m24880a("H5_ENTRY", "onConsoleMessage: message.length() = " + message.length() + " " + message);
            if (message.contains("wv_hybrid:") && signalCommunication.mo58301a("wv_hybrid:")) {
                String substring = message.substring(0, message.lastIndexOf(" ") + 1);
                C8608u.m24880a("H5_ENTRY", "message = " + substring);
                signalCommunication.mo58302b(substring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
