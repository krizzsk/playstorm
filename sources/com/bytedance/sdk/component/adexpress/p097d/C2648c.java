package com.bytedance.sdk.component.adexpress.p097d;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.adexpress.d.c */
/* compiled from: TTAndroidObjectProxy */
public class C2648c {

    /* renamed from: a */
    private WeakReference<C2647b> f5722a;

    public C2648c(C2647b bVar) {
        this.f5722a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo16841a(C2647b bVar) {
        this.f5722a = new WeakReference<>(bVar);
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<C2647b> weakReference = this.f5722a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C2647b) this.f5722a.get()).adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<C2647b> weakReference = this.f5722a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C2647b) this.f5722a.get()).appInfo();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<C2647b> weakReference = this.f5722a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C2647b) this.f5722a.get()).getTemplateInfo();
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<C2647b> weakReference = this.f5722a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2647b) this.f5722a.get()).renderDidFinish(str);
        }
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<C2647b> weakReference = this.f5722a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2647b) this.f5722a.get()).mo16828a(str);
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<C2647b> weakReference = this.f5722a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2647b) this.f5722a.get()).muteVideo(str);
        }
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<C2647b> weakReference = this.f5722a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2647b) this.f5722a.get()).dynamicTrack(str);
        }
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<C2647b> weakReference = this.f5722a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2647b) this.f5722a.get()).changeVideoState(str);
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<C2647b> weakReference = this.f5722a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2647b) this.f5722a.get()).clickEvent(str);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<C2647b> weakReference = this.f5722a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2647b) this.f5722a.get()).skipVideo();
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<C2647b> weakReference = this.f5722a;
        return (weakReference == null || weakReference.get() == null) ? "" : ((C2647b) this.f5722a.get()).getCurrentVideoState();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<C2647b> weakReference = this.f5722a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2647b) this.f5722a.get()).initRenderFinish();
        }
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<C2647b> weakReference = this.f5722a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2647b) this.f5722a.get()).mo16831b(str);
        }
    }
}
