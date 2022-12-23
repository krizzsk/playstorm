package com.bytedance.sdk.openadsdk.component.p137b;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p087e.C2531a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.core.C3513g;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.video.p165d.C3687a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.component.b.a */
/* compiled from: FeedAdManager */
public class C3262a {

    /* renamed from: a */
    private static volatile C3262a f7723a;

    /* renamed from: b */
    private final C3581n f7724b = C3578m.m11239f();

    /* renamed from: a */
    public static C3262a m9510a() {
        if (f7723a == null) {
            synchronized (C3262a.class) {
                if (f7723a == null) {
                    f7723a = new C3262a();
                }
            }
        }
        return f7723a;
    }

    private C3262a() {
    }

    /* renamed from: a */
    public void mo18943a(Context context, AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        final TTAdNative.FeedAdListener feedAdListener2 = feedAdListener;
        final Context context2 = context;
        final AdSlot adSlot2 = adSlot;
        this.f7724b.mo20073a(adSlot, new C3500o(), 5, new C3581n.C3582a() {
            /* renamed from: a */
            public void mo18544a(int i, String str) {
                feedAdListener2.onError(i, str);
            }

            /* renamed from: a */
            public void mo18545a(C3469a aVar, C3470b bVar) {
                if (aVar.mo19477b() == null || aVar.mo19477b().isEmpty()) {
                    feedAdListener2.onError(-3, C3513g.m10825a(-3));
                    bVar.mo19482a(-3);
                    C3470b.m10407a(bVar);
                    return;
                }
                List<C3498n> b = aVar.mo19477b();
                ArrayList arrayList = new ArrayList(b.size());
                for (C3498n next : b) {
                    if (C3498n.m10583c(next)) {
                        arrayList.add(new C3264b(context2, next, 5, adSlot2));
                    } else if (next.mo19671ao()) {
                        arrayList.add(new C3264b(context2, next, 5, adSlot2));
                    }
                    if (!(!C3498n.m10583c(next) || next.mo19607J() == null || next.mo19607J().mo16360i() == null)) {
                        if (C3578m.m11241h().mo19930b(String.valueOf(C4014u.m13223f(next))) && C3578m.m11241h().mo19920G()) {
                            if (next.mo19607J() != null) {
                                next.mo19607J().mo16354f(1);
                            }
                            if (next.mo19652aF() != null) {
                                next.mo19652aF().mo16354f(1);
                            }
                            C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(next.mo19650aD()).mo16068a(), next);
                            a.mo16377a("material_meta", next);
                            a.mo16377a("ad_slot", adSlot2);
                            C3687a.m11850a(a, (C2531a.C2532a) null);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    AdSlot adSlot = adSlot2;
                    if (adSlot == null) {
                        C3156e.m9191b(context2, b.get(0), C4014u.m13198b(5), currentTimeMillis);
                    } else if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        C3156e.m9181a(b.get(0), "embeded_ad", System.currentTimeMillis() - currentTimeMillis);
                    } else {
                        C3156e.m9191b(context2, b.get(0), C4014u.m13198b(adSlot2.getDurationSlotType()), currentTimeMillis);
                    }
                    feedAdListener2.onFeedAdLoad(arrayList);
                    if (bVar.mo19490e() != null && !bVar.mo19490e().isEmpty()) {
                        C3470b.m10407a(bVar);
                        return;
                    }
                    return;
                }
                feedAdListener2.onError(-4, C3513g.m10825a(-4));
                bVar.mo19482a(-4);
                C3470b.m10407a(bVar);
            }
        });
    }
}
