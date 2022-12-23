package com.ogury.p376ed.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* renamed from: com.ogury.ed.internal.hm */
public final class C10593hm {

    /* renamed from: a */
    private final Context f26722a;

    /* renamed from: b */
    private final FrameLayout f26723b;

    /* renamed from: c */
    private final C10483eb f26724c;

    public C10593hm(Context context, FrameLayout frameLayout, C10483eb ebVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(frameLayout, "activityRoot");
        C10765mq.m32773b(ebVar, "ad");
        this.f26722a = context;
        this.f26723b = frameLayout;
        this.f26724c = ebVar;
    }

    /* renamed from: a */
    public final C10660jh mo67545a(C10608hv hvVar) {
        C10765mq.m32773b(hvVar, "webViewArgs");
        FrameLayout.LayoutParams b = m32221a(hvVar, (FrameLayout.LayoutParams) null);
        C10660jh a = C10663jk.m32604a(this.f26722a, this.f26724c);
        if (a == null) {
            return null;
        }
        a.setTag(hvVar.mo67585c());
        C10594hn.m32228a(a);
        this.f26723b.addView(a, b);
        return a;
    }

    /* renamed from: a */
    public static void m32222a(WebView webView, C10608hv hvVar) {
        C10765mq.m32773b(webView, "webView");
        C10765mq.m32773b(hvVar, "webViewArgs");
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        webView.setLayoutParams(m32221a(hvVar, layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null));
    }

    /* renamed from: a */
    public final void mo67546a(WebView webView) {
        C10765mq.m32773b(webView, "webView");
        this.f26723b.removeView(webView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static FrameLayout.LayoutParams m32221a(C10608hv hvVar, FrameLayout.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        m32225b(hvVar, layoutParams);
        m32223a(layoutParams, hvVar);
        return layoutParams;
    }

    /* renamed from: b */
    private static void m32225b(C10608hv hvVar, FrameLayout.LayoutParams layoutParams) {
        if (hvVar.mo67593g() != -1) {
            layoutParams.leftMargin = C10556gi.m32087b(hvVar.mo67593g());
        }
        if (hvVar.mo67592f() != -1) {
            layoutParams.topMargin = C10556gi.m32087b(hvVar.mo67592f());
        }
    }

    /* renamed from: a */
    private static void m32223a(FrameLayout.LayoutParams layoutParams, C10608hv hvVar) {
        int i = -1;
        layoutParams.width = hvVar.mo67591e() <= 0 ? -1 : C10556gi.m32087b(hvVar.mo67591e());
        if (hvVar.mo67589d() > 0) {
            i = C10556gi.m32087b(hvVar.mo67589d());
        }
        layoutParams.height = i;
    }
}
