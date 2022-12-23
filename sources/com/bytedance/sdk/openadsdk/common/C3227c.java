package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;

/* renamed from: com.bytedance.sdk.openadsdk.common.c */
/* compiled from: LandingPageNewStyleManager */
public class C3227c {

    /* renamed from: a */
    private C3498n f7625a;

    /* renamed from: b */
    private RelativeLayout f7626b;

    /* renamed from: c */
    private final Context f7627c;

    /* renamed from: d */
    private SSWebView f7628d;

    /* renamed from: e */
    private ImageView f7629e;

    /* renamed from: f */
    private final String f7630f;

    /* renamed from: g */
    private C3238f f7631g;

    /* renamed from: h */
    private C3228d f7632h;

    public C3227c(Context context, C3498n nVar, String str) {
        this.f7627c = context;
        this.f7625a = nVar;
        this.f7630f = str;
        m9416f();
    }

    /* renamed from: f */
    private void m9416f() {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f7627c).inflate(C2984t.m8433f(this.f7627c, "tt_activity_endcard_landingpage_newstyle"), (ViewGroup) null, false);
        this.f7626b = relativeLayout;
        this.f7628d = (SSWebView) relativeLayout.findViewById(C2984t.m8432e(this.f7627c, "tt_browser_webview"));
        C3238f fVar = new C3238f(this.f7627c, (RelativeLayout) this.f7626b.findViewById(C2984t.m8432e(this.f7627c, "tt_title_bar")), this.f7625a);
        this.f7631g = fVar;
        this.f7629e = fVar.mo18902c();
        this.f7632h = new C3228d(this.f7627c, (LinearLayout) this.f7626b.findViewById(C2984t.m8432e(this.f7627c, "tt_bottom_bar")), this.f7628d, this.f7625a, this.f7630f);
    }

    /* renamed from: a */
    public void mo18879a() {
        C3238f fVar = this.f7631g;
        if (fVar != null) {
            fVar.mo18899a();
        }
        C3228d dVar = this.f7632h;
        if (dVar != null) {
            dVar.mo18885a();
        }
    }

    /* renamed from: b */
    public void mo18881b() {
        C3238f fVar = this.f7631g;
        if (fVar != null) {
            fVar.mo18901b();
        }
        C3228d dVar = this.f7632h;
        if (dVar != null) {
            dVar.mo18887b();
        }
    }

    /* renamed from: c */
    public ImageView mo18882c() {
        return this.f7629e;
    }

    /* renamed from: d */
    public SSWebView mo18883d() {
        return this.f7628d;
    }

    /* renamed from: e */
    public View mo18884e() {
        return this.f7626b;
    }

    /* renamed from: a */
    public void mo18880a(WebView webView, int i) {
        C3238f fVar = this.f7631g;
        if (fVar != null) {
            fVar.mo18900a(webView, i);
        }
        C3228d dVar = this.f7632h;
        if (dVar != null) {
            dVar.mo18886a(webView);
        }
    }
}
