package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.smaato.sdk.richmedia.ad.LoadedWebViewCache */
public final class LoadedWebViewCache {
    private final Map<String, Item> cache = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    public void save(String str, Item item) {
        trim();
        this.cache.put(str, item);
    }

    public RichMediaWebView pop(String str) {
        Item remove = this.cache.remove(str);
        if (remove == null) {
            return null;
        }
        return remove.webView;
    }

    private void trim() {
        Iterator<Map.Entry<String, Item>> it = this.cache.entrySet().iterator();
        while (it.hasNext()) {
            if (((Item) it.next().getValue()).weakAdObject.get() == null) {
                it.remove();
            }
        }
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.LoadedWebViewCache$Item */
    static final class Item {
        /* access modifiers changed from: private */
        public final WeakReference<RichMediaAdObject> weakAdObject;
        /* access modifiers changed from: private */
        public final RichMediaWebView webView;

        /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.lang.ref.WeakReference<com.smaato.sdk.richmedia.ad.RichMediaAdObject>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private Item(com.smaato.sdk.richmedia.widget.RichMediaWebView r1, java.lang.ref.WeakReference<com.smaato.sdk.richmedia.p387ad.RichMediaAdObject> r2) {
            /*
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
                com.smaato.sdk.richmedia.widget.RichMediaWebView r1 = (com.smaato.sdk.richmedia.widget.RichMediaWebView) r1
                r0.webView = r1
                java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                r0.weakAdObject = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p387ad.LoadedWebViewCache.Item.<init>(com.smaato.sdk.richmedia.widget.RichMediaWebView, java.lang.ref.WeakReference):void");
        }

        static Item create(RichMediaWebView richMediaWebView, RichMediaAdObject richMediaAdObject) {
            return new Item(richMediaWebView, new WeakReference(richMediaAdObject));
        }
    }
}
