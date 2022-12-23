package com.p374my.target;

import android.view.View;
import com.p374my.target.nativeads.INativeAd;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.my.target.q8 */
public class C9927q8 {

    /* renamed from: a */
    public static final WeakHashMap<View, WeakReference<INativeAd>> f24580a = new WeakHashMap<>();

    /* renamed from: a */
    public static void m29115a(View view, INativeAd iNativeAd) {
        INativeAd iNativeAd2;
        m29116a(iNativeAd);
        WeakHashMap<View, WeakReference<INativeAd>> weakHashMap = f24580a;
        WeakReference weakReference = weakHashMap.get(view);
        if (!(weakReference == null || (iNativeAd2 = (INativeAd) weakReference.get()) == null)) {
            iNativeAd2.unregisterView();
        }
        weakHashMap.put(view, new WeakReference(iNativeAd));
    }

    /* renamed from: a */
    public static void m29116a(INativeAd iNativeAd) {
        INativeAd iNativeAd2;
        for (Map.Entry next : f24580a.entrySet()) {
            View view = (View) next.getKey();
            WeakReference weakReference = (WeakReference) next.getValue();
            if (weakReference != null && ((iNativeAd2 = (INativeAd) weakReference.get()) == null || iNativeAd2 == iNativeAd)) {
                f24580a.remove(view);
                return;
            }
        }
    }
}
