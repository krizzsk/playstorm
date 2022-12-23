package com.bytedance.sdk.component.p090a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.p090a.C2570k;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.a.j */
/* compiled from: Environment */
public class C2569j {

    /* renamed from: a */
    WebView f5484a;

    /* renamed from: b */
    C2554a f5485b;

    /* renamed from: c */
    String f5486c = "IESJSBridge";

    /* renamed from: d */
    C2567h f5487d;

    /* renamed from: e */
    Context f5488e;

    /* renamed from: f */
    boolean f5489f;

    /* renamed from: g */
    boolean f5490g;

    /* renamed from: h */
    boolean f5491h;

    /* renamed from: i */
    C2575m f5492i;

    /* renamed from: j */
    C2576n f5493j;

    /* renamed from: k */
    String f5494k = "host";

    /* renamed from: l */
    final Set<String> f5495l = new LinkedHashSet();

    /* renamed from: m */
    final Set<String> f5496m = new LinkedHashSet();

    /* renamed from: n */
    boolean f5497n;

    /* renamed from: o */
    boolean f5498o;

    /* renamed from: p */
    C2570k.C2573b f5499p;

    C2569j(WebView webView) {
        this.f5484a = webView;
    }

    C2569j() {
    }

    /* renamed from: a */
    public C2569j mo16572a(C2554a aVar) {
        this.f5485b = aVar;
        return this;
    }

    /* renamed from: a */
    public C2569j mo16574a(String str) {
        this.f5486c = str;
        return this;
    }

    /* renamed from: a */
    public C2569j mo16573a(C2574l lVar) {
        this.f5487d = C2567h.m6518a(lVar);
        return this;
    }

    /* renamed from: a */
    public C2569j mo16575a(boolean z) {
        this.f5489f = z;
        return this;
    }

    /* renamed from: b */
    public C2569j mo16576b(boolean z) {
        this.f5490g = z;
        return this;
    }

    /* renamed from: a */
    public C2569j mo16571a() {
        this.f5498o = true;
        return this;
    }

    /* renamed from: b */
    public C2582r mo16577b() {
        m6528c();
        return new C2582r(this);
    }

    /* renamed from: c */
    private void m6528c() {
        if ((this.f5484a == null && !this.f5497n && this.f5485b == null) || ((TextUtils.isEmpty(this.f5486c) && this.f5484a != null) || this.f5487d == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
