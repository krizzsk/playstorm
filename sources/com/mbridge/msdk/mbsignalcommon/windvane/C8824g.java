package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.mbsignalcommon.base.C8797e;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.g */
/* compiled from: WindVaneCallJs */
public final class C8824g {

    /* renamed from: a */
    private static C8824g f21467a = new C8824g();

    private C8824g() {
    }

    /* renamed from: a */
    public static C8824g m25670a() {
        return f21467a;
    }

    /* renamed from: a */
    public final void mo58312a(Object obj, String str, String str2) {
        String str3;
        if (obj instanceof C8818a) {
            C8818a aVar = (C8818a) obj;
            if (TextUtils.isEmpty(str2)) {
                str3 = String.format("javascript:window.WindVane.fireEvent('%s', '');", new Object[]{str});
            } else {
                str3 = String.format("javascript:window.WindVane.fireEvent('%s','%s');", new Object[]{str, C8827j.m25681c(str2)});
            }
            if (aVar.f21444a != null && !aVar.f21444a.isDestoryed()) {
                try {
                    aVar.f21444a.loadUrl(str3);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58310a(WebView webView, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s', '');", new Object[]{str});
        } else {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s','%s');", new Object[]{str, C8827j.m25681c(str2)});
        }
        if (webView == null) {
            return;
        }
        if (!(webView instanceof WindVaneWebView) || !((WindVaneWebView) webView).isDestoryed()) {
            try {
                webView.loadUrl(str3);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo58311a(Object obj, String str) {
        String str2;
        if (obj instanceof C8818a) {
            C8818a aVar = (C8818a) obj;
            if (TextUtils.isEmpty(str)) {
                str2 = String.format("javascript:window.WindVane.onSuccess(%s,'');", new Object[]{aVar.f21450g});
            } else {
                str2 = String.format("javascript:window.WindVane.onSuccess(%s,'%s');", new Object[]{aVar.f21450g, C8827j.m25681c(str)});
            }
            if (aVar.f21444a != null && !aVar.f21444a.isDestoryed()) {
                try {
                    aVar.f21444a.loadUrl(str2);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo58313b(Object obj, String str) {
        if (obj instanceof C8818a) {
            C8818a aVar = (C8818a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", new Object[]{aVar.f21450g});
            } else {
                str = C8827j.m25681c(str);
            }
            String format = String.format("javascript:window.WindVane.onFailure(%s,'%s');", new Object[]{aVar.f21450g, str});
            if (aVar.f21444a != null && !aVar.f21444a.isDestoryed()) {
                try {
                    aVar.f21444a.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58309a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            f21467a.mo58310a(webView, C8797e.f21400j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            f21467a.mo58310a(webView, C8797e.f21400j, "");
        } catch (Throwable unused2) {
            f21467a.mo58310a(webView, C8797e.f21400j, "");
        }
    }
}
