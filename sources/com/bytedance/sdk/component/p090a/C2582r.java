package com.bytedance.sdk.component.p090a;

import android.webkit.WebView;
import com.bytedance.sdk.component.p090a.C2558d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.a.r */
/* compiled from: JsBridge2 */
public class C2582r {

    /* renamed from: a */
    static C2592w f5516a;

    /* renamed from: b */
    private final C2554a f5517b;

    /* renamed from: c */
    private final WebView f5518c;

    /* renamed from: d */
    private final C2569j f5519d;

    /* renamed from: e */
    private final List<C2576n> f5520e = new ArrayList();

    /* renamed from: f */
    private C2577o f5521f;

    /* renamed from: g */
    private volatile boolean f5522g = false;

    /* renamed from: a */
    public static C2569j m6570a(WebView webView) {
        return new C2569j(webView);
    }

    /* renamed from: a */
    public C2582r mo16603a(String str, C2561e<?, ?> eVar) {
        return mo16605a(str, (String) null, eVar);
    }

    /* renamed from: a */
    public C2582r mo16605a(String str, String str2, C2561e<?, ?> eVar) {
        m6571b();
        this.f5517b.f5452g.mo16568a(str, eVar);
        C2577o oVar = this.f5521f;
        if (oVar != null) {
            oVar.mo16590a(str);
        }
        return this;
    }

    /* renamed from: a */
    public C2582r mo16602a(String str, C2558d.C2560b bVar) {
        return mo16604a(str, (String) null, bVar);
    }

    /* renamed from: a */
    public C2582r mo16604a(String str, String str2, C2558d.C2560b bVar) {
        m6571b();
        this.f5517b.f5452g.mo16567a(str, bVar);
        C2577o oVar = this.f5521f;
        if (oVar != null) {
            oVar.mo16590a(str);
        }
        return this;
    }

    /* renamed from: a */
    public void mo16606a() {
        if (!this.f5522g) {
            this.f5517b.mo16544b();
            this.f5522g = true;
            for (C2576n next : this.f5520e) {
                if (next != null) {
                    next.mo16589a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = f5516a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2582r(com.bytedance.sdk.component.p090a.C2569j r3) {
        /*
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5520e = r0
            r0 = 0
            r2.f5522g = r0
            r2.f5519d = r3
            boolean r0 = r3.f5491h
            if (r0 == 0) goto L_0x001e
            com.bytedance.sdk.component.a.w r0 = f5516a
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r3.f5494k
            com.bytedance.sdk.component.a.v r0 = r0.mo16615a((java.lang.String) r1)
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            android.webkit.WebView r1 = r3.f5484a
            if (r1 == 0) goto L_0x0034
            com.bytedance.sdk.component.a.a r1 = r3.f5485b
            if (r1 != 0) goto L_0x002f
            com.bytedance.sdk.component.a.z r1 = new com.bytedance.sdk.component.a.z
            r1.<init>()
            r2.f5517b = r1
            goto L_0x0038
        L_0x002f:
            com.bytedance.sdk.component.a.a r1 = r3.f5485b
            r2.f5517b = r1
            goto L_0x0038
        L_0x0034:
            com.bytedance.sdk.component.a.a r1 = r3.f5485b
            r2.f5517b = r1
        L_0x0038:
            com.bytedance.sdk.component.a.a r1 = r2.f5517b
            r1.mo16540a((com.bytedance.sdk.component.p090a.C2569j) r3, (com.bytedance.sdk.component.p090a.C2587v) r0)
            android.webkit.WebView r0 = r3.f5484a
            r2.f5518c = r0
            java.util.List<com.bytedance.sdk.component.a.n> r0 = r2.f5520e
            com.bytedance.sdk.component.a.n r1 = r3.f5493j
            r0.add(r1)
            boolean r0 = r3.f5489f
            com.bytedance.sdk.component.p090a.C2568i.m6525a((boolean) r0)
            boolean r3 = r3.f5490g
            com.bytedance.sdk.component.p090a.C2595y.m6600a((boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p090a.C2582r.<init>(com.bytedance.sdk.component.a.j):void");
    }

    /* renamed from: b */
    private void m6571b() {
        if (this.f5522g) {
            C2568i.m6522a((RuntimeException) new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}
