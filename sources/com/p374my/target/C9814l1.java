package com.p374my.target;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.media.C5976de;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p374my.target.C9755i6;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.net.URI;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.my.target.l1 */
public class C9814l1 {

    /* renamed from: a */
    public final String f24231a;

    /* renamed from: b */
    public final WebViewClient f24232b = new C9817c();

    /* renamed from: c */
    public C9816b f24233c;

    /* renamed from: d */
    public C9755i6 f24234d;

    /* renamed from: e */
    public boolean f24235e;

    /* renamed from: f */
    public boolean f24236f;

    /* renamed from: com.my.target.l1$b */
    public interface C9816b {
        /* renamed from: a */
        void mo64647a(C9814l1 l1Var, WebView webView);

        /* renamed from: a */
        void mo64648a(boolean z);

        /* renamed from: a */
        boolean mo64649a(float f, float f2);

        /* renamed from: a */
        boolean mo64650a(int i, int i2, int i3, int i4, boolean z, int i5);

        /* renamed from: a */
        boolean mo64651a(Uri uri);

        /* renamed from: a */
        boolean mo64652a(ConsoleMessage consoleMessage, C9814l1 l1Var);

        /* renamed from: a */
        boolean mo64653a(String str);

        /* renamed from: a */
        boolean mo64654a(String str, JsResult jsResult);

        /* renamed from: a */
        boolean mo64655a(boolean z, C9857n1 n1Var);

        /* renamed from: b */
        void mo64656b(Uri uri);

        /* renamed from: c */
        void mo64657c();

        /* renamed from: d */
        void mo64658d();

        /* renamed from: f */
        boolean mo64659f();

        /* renamed from: g */
        void mo64660g();
    }

    /* renamed from: com.my.target.l1$c */
    public class C9817c extends WebViewClient {
        public C9817c() {
        }

        public void onPageFinished(WebView webView, String str) {
            C9814l1.this.mo64640b();
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C9672e0.m27882a("Error: " + str);
            super.onReceivedError(webView, i, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C9814l1.this.mo64630a(webResourceRequest.getUrl());
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C9814l1.this.mo64630a(Uri.parse(str));
            return true;
        }
    }

    /* renamed from: com.my.target.l1$d */
    public static class C9818d {
        /* renamed from: a */
        public static int m28577a(String str) {
            if (str == null) {
                return 53;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1314880604:
                    if (str.equals(C5976de.DEFAULT_POSITION)) {
                        c = 6;
                        break;
                    }
                    break;
                case -1012429441:
                    if (str.equals("top-left")) {
                        c = 0;
                        break;
                    }
                    break;
                case -655373719:
                    if (str.equals("bottom-left")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1163912186:
                    if (str.equals("bottom-right")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1288627767:
                    if (str.equals("bottom-center")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1755462605:
                    if (str.equals("top-center")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return 51;
            }
            if (c == 1) {
                return 17;
            }
            if (c == 2) {
                return 83;
            }
            if (c == 3) {
                return 85;
            }
            if (c != 4) {
                return c != 5 ? 53 : 81;
            }
            return 49;
        }
    }

    /* renamed from: com.my.target.l1$e */
    public class C9819e extends WebChromeClient {
        public C9819e() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            int lineNumber = consoleMessage.lineNumber();
            C9672e0.m27882a("js console message: " + message + " at line: " + lineNumber);
            return C9814l1.this.f24233c != null ? C9814l1.this.f24233c.mo64652a(consoleMessage, C9814l1.this) : super.onConsoleMessage(consoleMessage);
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return C9814l1.this.f24233c != null ? C9814l1.this.f24233c.mo64654a(str2, jsResult) : super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    /* renamed from: com.my.target.l1$f */
    public class C9820f implements C9755i6.C9756a {
        public C9820f() {
        }

        /* renamed from: a */
        public void mo64285a(boolean z) {
            if (C9814l1.this.f24233c != null) {
                C9814l1.this.f24233c.mo64648a(z);
            }
        }

        /* renamed from: c */
        public void mo64286c() {
            if (C9814l1.this.f24233c != null) {
                C9814l1.this.f24233c.mo64657c();
            }
        }
    }

    public C9814l1(String str) {
        this.f24231a = str;
    }

    /* renamed from: b */
    public static C9814l1 m28543b(String str) {
        return new C9814l1(str);
    }

    /* renamed from: a */
    public final String mo64628a(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    /* renamed from: a */
    public void mo64629a() {
        this.f24234d = null;
    }

    /* renamed from: a */
    public void mo64630a(Uri uri) {
        C9816b bVar;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if ("mytarget".equals(scheme)) {
            if ("onloadmraidjs".equals(host)) {
                C9672e0.m27882a("MraidBridge: JS call onLoad");
            }
            C9672e0.m27882a("MraidBridge: got mytarget scheme " + uri);
        } else if (CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
            if (host.contains(",")) {
                host = host.substring(0, host.indexOf(",")).trim();
            }
            C9672e0.m27882a("Got mraid command " + uri);
            String uri2 = uri.toString();
            JSONObject jSONObject = null;
            C9838m1 m1Var = new C9838m1(host, this.f24231a);
            mo64641c(m1Var.toString());
            int indexOf = uri2.indexOf("{");
            int lastIndexOf = uri2.lastIndexOf("}") + 1;
            if (indexOf >= 0 && lastIndexOf > 0 && indexOf < lastIndexOf) {
                try {
                    if (lastIndexOf <= uri2.length()) {
                        jSONObject = new JSONObject(uri2.substring(indexOf, lastIndexOf));
                    }
                } catch (Throwable th) {
                    mo64635a(m1Var.toString(), th.getMessage());
                    return;
                }
            }
            mo64638a(m1Var, jSONObject);
        } else {
            try {
                new URI(uri.toString());
                C9755i6 i6Var = this.f24234d;
                if (i6Var != null && i6Var.mo64280g() && (bVar = this.f24233c) != null) {
                    bVar.mo64656b(uri);
                }
            } catch (Throwable unused) {
                C9672e0.m27882a("Invalid MRAID URL: " + uri);
                mo64635a("", "Mraid command sent an invalid URL");
            }
        }
    }

    /* renamed from: a */
    public void mo64631a(C9755i6 i6Var) {
        this.f24234d = i6Var;
        WebSettings settings = i6Var.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            if (Build.VERSION.SDK_INT >= 17 && "interstitial".equals(this.f24231a)) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        }
        this.f24234d.setScrollContainer(false);
        this.f24234d.setVerticalScrollBarEnabled(false);
        this.f24234d.setHorizontalScrollBarEnabled(false);
        this.f24234d.setWebViewClient(this.f24232b);
        this.f24234d.setWebChromeClient(new C9819e());
        this.f24234d.setVisibilityChangedListener(new C9820f());
    }

    /* renamed from: a */
    public void mo64632a(C9816b bVar) {
        this.f24233c = bVar;
    }

    /* renamed from: a */
    public void mo64633a(C9878o1 o1Var) {
        mo64634a("mraidbridge.setScreenSize(" + mo64639b(o1Var.mo65154d()) + ");window.mraidbridge.setMaxSize(" + mo64639b(o1Var.mo65152c()) + ");window.mraidbridge.setCurrentPosition(" + mo64628a(o1Var.mo65147a()) + ");window.mraidbridge.setDefaultPosition(" + mo64628a(o1Var.mo65150b()) + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("mraidbridge.fireSizeChangeEvent(");
        sb.append(mo64639b(o1Var.mo65147a()));
        sb.append(")");
        mo64634a(sb.toString());
    }

    /* renamed from: a */
    public final void mo64634a(String str) {
        if (this.f24234d == null) {
            C9672e0.m27882a("Attempted to inject Javascript into MRAID WebView while was not attached:\n\t" + str);
            return;
        }
        String str2 = "javascript:window." + str + ";";
        C9672e0.m27882a("Injecting Javascript into MRAID WebView " + hashCode() + ": " + str2);
        this.f24234d.mo63460a(str2);
    }

    /* renamed from: a */
    public void mo64635a(String str, String str2) {
        mo64634a("mraidbridge.fireErrorEvent(" + JSONObject.quote(str2) + ", " + JSONObject.quote(str) + ")");
    }

    /* renamed from: a */
    public void mo64636a(ArrayList<String> arrayList) {
        mo64634a("mraidbridge.setSupports(" + TextUtils.join(",", arrayList) + ")");
    }

    /* renamed from: a */
    public void mo64637a(boolean z) {
        if (z != this.f24236f) {
            mo64634a("mraidbridge.setIsViewable(" + z + ")");
        }
        this.f24236f = z;
    }

    /* renamed from: a */
    public boolean mo64638a(C9838m1 m1Var, JSONObject jSONObject) {
        C9755i6 i6Var;
        String m1Var2 = m1Var.toString();
        if (m1Var.f24286a && (i6Var = this.f24234d) != null && !i6Var.mo64280g()) {
            mo64635a(m1Var2, "Cannot execute this command unless the user clicks");
            return false;
        } else if (this.f24233c == null) {
            mo64635a(m1Var2, "Invalid state to execute this command");
            return false;
        } else if (this.f24234d == null) {
            mo64635a(m1Var2, "The current WebView is being destroyed");
            return false;
        } else {
            m1Var2.hashCode();
            char c = 65535;
            switch (m1Var2.hashCode()) {
                case -1910759310:
                    if (m1Var2.equals("vpaidInit")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1886160473:
                    if (m1Var2.equals(MraidJsMethods.PLAY_VIDEO)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1289167206:
                    if (m1Var2.equals(MraidJsMethods.EXPAND)) {
                        c = 2;
                        break;
                    }
                    break;
                case -934437708:
                    if (m1Var2.equals(MraidJsMethods.RESIZE)) {
                        c = 3;
                        break;
                    }
                    break;
                case -733616544:
                    if (m1Var2.equals("createCalendarEvent")) {
                        c = 4;
                        break;
                    }
                    break;
                case 0:
                    if (m1Var2.equals("")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3417674:
                    if (m1Var2.equals("open")) {
                        c = 6;
                        break;
                    }
                    break;
                case 94756344:
                    if (m1Var2.equals("close")) {
                        c = 7;
                        break;
                    }
                    break;
                case 133423073:
                    if (m1Var2.equals("setOrientationProperties")) {
                        c = 8;
                        break;
                    }
                    break;
                case 459238621:
                    if (m1Var2.equals("storePicture")) {
                        c = 9;
                        break;
                    }
                    break;
                case 624734601:
                    if (m1Var2.equals("setResizeProperties")) {
                        c = 10;
                        break;
                    }
                    break;
                case 892543864:
                    if (m1Var2.equals("vpaidEvent")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1797992422:
                    if (m1Var2.equals("playheadEvent")) {
                        c = 12;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f24233c.mo64660g();
                    break;
                case 1:
                    C9672e0.m27882a("playVideo is currently unsupported");
                    return false;
                case 2:
                    Uri uri = null;
                    if (jSONObject != null) {
                        uri = Uri.parse(jSONObject.getString("url"));
                    }
                    return this.f24233c.mo64651a(uri);
                case 3:
                    return this.f24233c.mo64659f();
                case 4:
                    C9672e0.m27882a("createCalendarEvent is currently unsupported");
                    return false;
                case 5:
                    mo64635a(m1Var2, "Unspecified MRAID Javascript command");
                    return false;
                case 6:
                    if (jSONObject != null) {
                        this.f24233c.mo64656b(Uri.parse(jSONObject.getString("url")));
                        break;
                    } else {
                        mo64635a(m1Var2, "open params cannot be null");
                        return false;
                    }
                case 7:
                    this.f24233c.mo64658d();
                    break;
                case 8:
                    if (jSONObject == null) {
                        mo64635a(m1Var2, "setOrientationProperties params cannot be null");
                        return false;
                    }
                    boolean z = jSONObject.getBoolean("allowOrientationChange");
                    String string = jSONObject.getString("forceOrientation");
                    C9857n1 a = C9857n1.m28796a(string);
                    if (a != null) {
                        return this.f24233c.mo64655a(z, a);
                    }
                    mo64635a(m1Var2, "wrong orientation " + string);
                    return false;
                case 9:
                    C9672e0.m27882a("storePicture is currently unsupported");
                    return false;
                case 10:
                    if (jSONObject == null) {
                        mo64635a(m1Var2, "setResizeProperties params cannot be null");
                        return false;
                    }
                    return this.f24233c.mo64650a(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt("offsetX"), jSONObject.getInt("offsetY"), jSONObject.optBoolean("allowOffscreen", false), C9818d.m28577a(jSONObject.optString("customClosePosition")));
                case 11:
                    if (jSONObject == null) {
                        mo64635a(m1Var2, "vpaidEvent params cannot be null");
                        return false;
                    }
                    return this.f24233c.mo64653a(jSONObject.getString("event"));
                case 12:
                    if (jSONObject == null) {
                        mo64635a(m1Var2, "playheadEvent params cannot be null");
                        return false;
                    }
                    return this.f24233c.mo64649a((float) jSONObject.getDouble("remain"), (float) jSONObject.getDouble("duration"));
            }
            return true;
        }
    }

    /* renamed from: b */
    public final String mo64639b(Rect rect) {
        return rect.width() + "," + rect.height();
    }

    /* renamed from: b */
    public final void mo64640b() {
        if (!this.f24235e) {
            this.f24235e = true;
            C9816b bVar = this.f24233c;
            if (bVar != null) {
                bVar.mo64647a(this, this.f24234d.getWebView());
            }
        }
    }

    /* renamed from: c */
    public final void mo64641c(String str) {
        mo64634a("mraidbridge.nativeComplete(" + JSONObject.quote(str) + ")");
    }

    /* renamed from: c */
    public boolean mo64642c() {
        C9755i6 i6Var = this.f24234d;
        return i6Var != null && i6Var.mo64281h();
    }

    /* renamed from: d */
    public void mo64643d() {
        mo64634a("mraidbridge.fireReadyEvent()");
    }

    /* renamed from: d */
    public void mo64644d(String str) {
        mo64634a("mraidbridge.setPlacementType(" + JSONObject.quote(str) + ")");
    }

    /* renamed from: e */
    public void mo64645e(String str) {
        mo64634a("mraidbridge.setState(" + JSONObject.quote(str) + ")");
    }

    /* renamed from: f */
    public void mo64646f(String str) {
        C9755i6 i6Var = this.f24234d;
        if (i6Var == null) {
            C9672e0.m27882a("MRAID bridge called setContentHtml before WebView was attached");
            return;
        }
        this.f24235e = false;
        i6Var.mo63461a("https://ad.mail.ru/", str, "text/html", "UTF-8", (String) null);
    }
}
