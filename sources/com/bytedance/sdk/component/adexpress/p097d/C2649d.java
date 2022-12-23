package com.bytedance.sdk.component.adexpress.p097d;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.p090a.C2596z;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.adexpress.d.d */
/* compiled from: WebViewBridgeProxy */
public class C2649d {

    /* renamed from: a */
    private WeakReference<C2596z> f5723a;

    public C2649d(C2596z zVar) {
        this.f5723a = new WeakReference<>(zVar);
    }

    /* renamed from: a */
    public void mo16855a(C2596z zVar) {
        this.f5723a = new WeakReference<>(zVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<C2596z> weakReference = this.f5723a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2596z) this.f5723a.get()).invokeMethod(str);
        }
    }
}
