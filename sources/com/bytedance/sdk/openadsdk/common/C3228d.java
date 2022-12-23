package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.C2959b;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.common.d */
/* compiled from: TTBottomNewStyleManager */
public class C3228d {

    /* renamed from: a */
    private final LinearLayout f7633a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SSWebView f7634b;

    /* renamed from: c */
    private final C3498n f7635c;

    /* renamed from: d */
    private final String f7636d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f7637e;

    /* renamed from: f */
    private ImageView f7638f;

    /* renamed from: g */
    private ImageView f7639g;

    /* renamed from: h */
    private ImageView f7640h;

    /* renamed from: i */
    private ImageView f7641i;

    public C3228d(Context context, LinearLayout linearLayout, SSWebView sSWebView, C3498n nVar, String str) {
        this.f7637e = context;
        this.f7633a = linearLayout;
        this.f7634b = sSWebView;
        this.f7635c = nVar;
        this.f7636d = str;
        m9429c();
    }

    /* renamed from: c */
    private void m9429c() {
        this.f7638f = (ImageView) this.f7633a.findViewById(C2984t.m8432e(this.f7637e, "tt_bottom_bar_back"));
        this.f7639g = (ImageView) this.f7633a.findViewById(C2984t.m8432e(this.f7637e, "tt_bottom_bar_forward"));
        this.f7640h = (ImageView) this.f7633a.findViewById(C2984t.m8432e(this.f7637e, "tt_bottom_bar_refresh"));
        this.f7641i = (ImageView) this.f7633a.findViewById(C2984t.m8432e(this.f7637e, "tt_bottom_bar_go_to_browser"));
        this.f7638f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3228d.this.f7634b != null && C3228d.this.f7634b.mo17936e()) {
                    C3228d.this.m9425a("backward");
                    C3228d.this.f7634b.mo17937f();
                }
            }
        });
        this.f7639g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3228d.this.f7634b != null && C3228d.this.f7634b.mo17938g()) {
                    C3228d.this.m9425a("forward");
                    C3228d.this.f7634b.mo17947h();
                }
            }
        });
        this.f7640h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3228d.this.f7634b != null) {
                    C3228d.this.m9428b("refresh");
                    C3228d.this.f7634b.mo17934d();
                }
            }
        });
        this.f7641i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3228d.this.f7634b != null) {
                    C3228d.this.m9428b("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = C3228d.this.f7634b.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        C2959b.m8339a(C3228d.this.f7637e, intent, (C2959b.C2960a) null);
                    }
                }
            }
        });
        this.f7633a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.f7638f.setClickable(false);
        this.f7639g.setClickable(false);
        this.f7638f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.f7639g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    /* renamed from: a */
    public void mo18886a(WebView webView) {
        try {
            if (this.f7638f != null) {
                if (webView.canGoBack()) {
                    this.f7638f.setClickable(true);
                    this.f7638f.clearColorFilter();
                } else {
                    this.f7638f.setClickable(false);
                    this.f7638f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.f7639g == null) {
                return;
            }
            if (webView.canGoForward()) {
                this.f7639g.setClickable(true);
                this.f7639g.clearColorFilter();
                return;
            }
            this.f7639g.setClickable(false);
            this.f7639g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo18885a() {
        if (this.f7633a.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.f7633a, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
        }
    }

    /* renamed from: b */
    public void mo18887b() {
        if (this.f7633a.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.f7633a, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9425a(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(this.f7634b.getWebView() == null || (copyBackForwardList = this.f7634b.getWebView().copyBackForwardList()) == null)) {
                int currentIndex = copyBackForwardList.getCurrentIndex();
                String url = copyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f7634b.getUrl();
                }
                String str2 = "";
                if (str.equals("backward")) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i = 1;
                if (str.equals("forward")) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", str2);
                if (copyBackForwardList.getCurrentIndex() != 0) {
                    i = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        C3156e.m9199c(C3578m.m11231a(), this.f7635c, this.f7636d, str, jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9428b(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(this.f7634b.getWebView() == null || (copyBackForwardList = this.f7634b.getWebView().copyBackForwardList()) == null)) {
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f7634b.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", Integer.valueOf(copyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        C3156e.m9199c(C3578m.m11231a(), this.f7635c, this.f7636d, str, jSONObject);
    }
}
