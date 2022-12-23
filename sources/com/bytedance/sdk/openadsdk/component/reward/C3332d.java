package com.bytedance.sdk.openadsdk.component.reward;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2521b;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p087e.C2533b;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2535b;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2968h;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.reward.C3317b;
import com.bytedance.sdk.openadsdk.core.C3513g;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.video.p163b.C3661a;
import com.bytedance.sdk.openadsdk.core.video.p165d.C3687a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p176i.C3852b;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.d */
/* compiled from: FullScreenVideoLoadManager */
public class C3332d {

    /* renamed from: a */
    private static volatile C3332d f7953a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f7954b;

    /* renamed from: c */
    private final C3581n f7955c = C3578m.m11239f();

    /* renamed from: d */
    private AtomicBoolean f7956d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C3340a> f7957e = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2955g f7958f;

    /* renamed from: g */
    private final BroadcastReceiver f7959g = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (C3332d.this.f7958f == null) {
                    C2955g unused = C3332d.this.f7958f = new C3284a("fsv net connect task", C3332d.this.f7957e);
                }
                C2968h.m8366a().post(C3332d.this.f7958f);
            }
        }
    };

    /* renamed from: a */
    public static C3332d m9916a(Context context) {
        if (f7953a == null) {
            synchronized (C3332d.class) {
                if (f7953a == null) {
                    f7953a = new C3332d(context);
                }
            }
        }
        return f7953a;
    }

    private C3332d(Context context) {
        this.f7954b = context == null ? C3578m.m11231a() : context.getApplicationContext();
        m9923c();
    }

    /* renamed from: a */
    public void mo19186a() {
        try {
            C3317b.m9843a(this.f7954b).mo19156a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo19191b() {
        AdSlot b = C3317b.m9843a(this.f7954b).mo19161b();
        if (b != null && !TextUtils.isEmpty(b.getCodeId()) && C3317b.m9843a(this.f7954b).mo19164c(b.getCodeId()) == null) {
            mo19192b(b);
        }
    }

    /* renamed from: a */
    public void mo19187a(AdSlot adSlot) {
        C3317b.m9843a(this.f7954b).mo19163b(adSlot);
    }

    /* renamed from: a */
    public void mo19188a(AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        C2975l.m8384b("FullScreenVideoLoadManager", "load full screen video: " + String.valueOf(adSlot));
        C2975l.m8384b("bidding", "load full video: BidAdm->MD5->" + C2535b.m6426a(adSlot.getBidAdm()));
        C3317b.m9843a(this.f7954b).mo19157a(adSlot);
        m9917a(adSlot, false, fullScreenVideoAdListener);
    }

    /* renamed from: b */
    public void mo19192b(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            C2975l.m8384b("FullScreenVideoLoadManager", "preload full screen video: " + String.valueOf(adSlot));
            m9917a(adSlot, true, (TTAdNative.FullScreenVideoAdListener) null);
            return;
        }
        C2975l.m8384b("bidding", "preload not request bidding ：BidAdm->MD5->" + C2535b.m6426a(adSlot.getBidAdm()));
    }

    /* renamed from: a */
    private void m9917a(AdSlot adSlot, boolean z, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            m9918a(adSlot, true, fullScreenVideoAdListener, currentTimeMillis);
            return;
        }
        C3498n c = C3317b.m9843a(this.f7954b).mo19164c(adSlot.getCodeId());
        if (c != null) {
            C3369k kVar = new C3369k(this.f7954b, c, adSlot);
            if (!C3501p.m10769i(c)) {
                kVar.mo19236a(C3317b.m9843a(this.f7954b).mo19154a(c));
            }
            C3156e.m9179a(c);
            if (fullScreenVideoAdListener != null) {
                fullScreenVideoAdListener.onFullScreenVideoAdLoad(kVar);
                if (!C3501p.m10769i(c)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final C2521b J = c.mo19607J();
                        C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(c.mo19650aD()).mo16072b(), c);
                        a.mo16377a("material_meta", c);
                        a.mo16377a("ad_slot", adSlot);
                        final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2 = fullScreenVideoAdListener;
                        final C3498n nVar = c;
                        final AdSlot adSlot2 = adSlot;
                        final long j = currentTimeMillis;
                        C3687a.m11850a(a, new C2533b() {
                            /* renamed from: a */
                            public void mo16474a(C2522c cVar, int i) {
                                if (fullScreenVideoAdListener2 != null) {
                                    C3156e.m9191b(C3332d.this.f7954b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j);
                                    fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onFullScreenVideoCached");
                                }
                            }

                            /* renamed from: a */
                            public void mo16475a(C2522c cVar, int i, String str) {
                                C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail");
                                if (fullScreenVideoAdListener2 != null && J.mo16371s()) {
                                    C3156e.m9191b(C3332d.this.f7954b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j);
                                    fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail and exec onFullScreenVideoCached");
                                }
                            }
                        });
                    } else {
                        C3156e.m9191b(this.f7954b, c, C4014u.m13198b(adSlot.getDurationSlotType()), currentTimeMillis);
                        fullScreenVideoAdListener.onFullScreenVideoCached();
                    }
                }
            }
            final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener3 = fullScreenVideoAdListener;
            final C3498n nVar2 = c;
            final AdSlot adSlot3 = adSlot;
            final long j2 = currentTimeMillis;
            C3661a.m11659a().mo20257a(c, (C3661a.C3666a) new C3661a.C3666a() {
                /* renamed from: a */
                public void mo19194a(boolean z) {
                    if (fullScreenVideoAdListener3 != null && C3501p.m10769i(nVar2)) {
                        C3156e.m9191b(C3332d.this.f7954b, nVar2, C4014u.m13198b(adSlot3.getDurationSlotType()), j2);
                        fullScreenVideoAdListener3.onFullScreenVideoCached();
                    }
                }
            });
            C2975l.m8384b("FullScreenVideoLoadManager", "get cache data success");
            C2975l.m8384b("bidding", "full video get cache data success");
            return;
        }
        m9918a(adSlot, false, fullScreenVideoAdListener, currentTimeMillis);
    }

    /* renamed from: a */
    private void m9918a(AdSlot adSlot, boolean z, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener, long j) {
        C2975l.m8384b("bidding", "full video doNetwork , get new materials:BidAdm->MD5->" + C2535b.m6426a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        C3500o oVar = new C3500o();
        oVar.f8657c = z ? 2 : 1;
        if (C3578m.m11241h().mo19948h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f8660f = 2;
        }
        final boolean z2 = z;
        final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2 = fullScreenVideoAdListener;
        final AdSlot adSlot2 = adSlot;
        final long j2 = j;
        AdSlot adSlot3 = adSlot;
        this.f7955c.mo20073a(adSlot, oVar, 8, new C3581n.C3582a() {
            /* renamed from: a */
            public void mo18544a(int i, String str) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener;
                if (!z2 && (fullScreenVideoAdListener = fullScreenVideoAdListener2) != null) {
                    fullScreenVideoAdListener.onError(i, str);
                }
            }

            /* renamed from: a */
            public void mo18545a(C3469a aVar, C3470b bVar) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener;
                if (aVar.mo19477b() != null && !aVar.mo19477b().isEmpty()) {
                    C2975l.m8384b("FullScreenVideoLoadManager", "get material data success isPreload=" + z2);
                    final C3498n nVar = aVar.mo19477b().get(0);
                    try {
                        if (nVar.mo19610M() != null && !TextUtils.isEmpty(nVar.mo19610M().mo19559a())) {
                            C3852b bVar2 = new C3852b(true);
                            bVar2.mo20699a(adSlot2.getCodeId());
                            bVar2.mo20698a(8);
                            bVar2.mo20701c(nVar.mo19622Y());
                            bVar2.mo20702d(nVar.mo19659ac());
                            bVar2.mo20700b(C4014u.m13235h(nVar));
                            C3769a.m12387a(nVar.mo19610M()).mo17711a((C2902n) bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final C3369k kVar = new C3369k(C3332d.this.f7954b, nVar, adSlot2);
                    if (!z2 && fullScreenVideoAdListener2 != null) {
                        if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            C3156e.m9181a(nVar, "fullscreen_interstitial_ad", System.currentTimeMillis() - currentTimeMillis);
                        }
                        fullScreenVideoAdListener2.onFullScreenVideoAdLoad(kVar);
                    }
                    C3661a.m11659a().mo20257a(nVar, (C3661a.C3666a) new C3661a.C3666a() {
                        /* renamed from: a */
                        public void mo19194a(boolean z) {
                            C3498n nVar;
                            if (!z2 && fullScreenVideoAdListener2 != null && (nVar = nVar) != null && C3501p.m10769i(nVar)) {
                                C3156e.m9191b(C3332d.this.f7954b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j2);
                                fullScreenVideoAdListener2.onFullScreenVideoCached();
                            }
                        }
                    });
                    if (z2 && !C3501p.m10769i(nVar) && C3578m.m11241h().mo19962n(adSlot2.getCodeId()).f8771d == 1 && !C2979o.m8410d(C3332d.this.f7954b)) {
                        C3332d.this.m9919a(new C3340a(nVar, adSlot2));
                    } else if (C3501p.m10769i(nVar)) {
                        C3317b.m9843a(C3332d.this.f7954b).mo19158a(adSlot2, nVar);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        final C2521b J = nVar.mo19607J();
                        if (J != null) {
                            C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(nVar.mo19650aD()).mo16072b(), nVar);
                            a.mo16377a("material_meta", nVar);
                            a.mo16377a("ad_slot", adSlot2);
                            SystemClock.elapsedRealtime();
                            C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                            C3687a.m11850a(a, new C2533b() {
                                /* renamed from: a */
                                public void mo16474a(C2522c cVar, int i) {
                                    C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadSuccess");
                                    if (!z2) {
                                        if (fullScreenVideoAdListener2 != null) {
                                            C3156e.m9191b(C3332d.this.f7954b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j2);
                                            fullScreenVideoAdListener2.onFullScreenVideoCached();
                                        }
                                        C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: onFullScreenVideoCached");
                                        return;
                                    }
                                    C3317b.m9843a(C3332d.this.f7954b).mo19158a(adSlot2, nVar);
                                    C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog:  ad json save");
                                }

                                /* renamed from: a */
                                public void mo16475a(C2522c cVar, int i, String str) {
                                    C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail");
                                    if (fullScreenVideoAdListener2 != null && J.mo16371s()) {
                                        C3156e.m9191b(C3332d.this.f7954b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j2);
                                        fullScreenVideoAdListener2.onFullScreenVideoCached();
                                        C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail and exec onFullScreenVideoCached");
                                    }
                                }
                            });
                        }
                    } else {
                        C3317b.m9843a(C3332d.this.f7954b).mo19159a(nVar, (C3317b.C3321a<Object>) new C3317b.C3321a<Object>() {
                            /* renamed from: a */
                            public void mo19167a(boolean z, Object obj) {
                                C2975l.m8384b("FullScreenVideoLoadManager", "download video file: " + z + ", preload: " + z2);
                                if (z) {
                                    kVar.mo19236a(C3317b.m9843a(C3332d.this.f7954b).mo19154a(nVar));
                                }
                                if (!z2) {
                                    C3156e.m9179a(nVar);
                                    if (z && fullScreenVideoAdListener2 != null) {
                                        C3156e.m9191b(C3332d.this.f7954b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j2);
                                        fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    }
                                } else if (z) {
                                    C3317b.m9843a(C3332d.this.f7954b).mo19158a(adSlot2, nVar);
                                }
                            }
                        });
                    }
                } else if (!z2 && (fullScreenVideoAdListener = fullScreenVideoAdListener2) != null) {
                    fullScreenVideoAdListener.onError(-3, C3513g.m10825a(-3));
                    bVar.mo19482a(-3);
                    C3470b.m10407a(bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo19189a(String str) {
        C3317b.m9843a(this.f7954b).mo19160a(str);
    }

    /* renamed from: b */
    public AdSlot mo19190b(String str) {
        return C3317b.m9843a(this.f7954b).mo19162b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9919a(C3340a aVar) {
        if (aVar != null) {
            if (this.f7957e.size() >= 1) {
                this.f7957e.remove(0);
            }
            this.f7957e.add(aVar);
        }
    }

    /* renamed from: c */
    private void m9923c() {
        if (!this.f7956d.get()) {
            this.f7956d.set(true);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                this.f7954b.registerReceiver(this.f7959g, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private void m9924d() {
        if (this.f7956d.get()) {
            this.f7956d.set(false);
            try {
                this.f7954b.unregisterReceiver(this.f7959g);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f7958f != null) {
            try {
                C2968h.m8366a().removeCallbacks(this.f7958f);
            } catch (Exception unused) {
            }
            this.f7958f = null;
        }
        m9924d();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.d$a */
    /* compiled from: FullScreenVideoLoadManager */
    private static class C3340a extends C2955g {

        /* renamed from: a */
        C3498n f7986a;

        /* renamed from: b */
        AdSlot f7987b;

        C3340a(C3498n nVar, AdSlot adSlot) {
            super("Fullscreen Task");
            this.f7986a = nVar;
            this.f7987b = adSlot;
        }

        public void run() {
            if (this.f7986a != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    C3317b.m9843a(C3578m.m11231a()).mo19159a(this.f7986a, (C3317b.C3321a<Object>) new C3317b.C3321a<Object>() {
                        /* renamed from: a */
                        public void mo19167a(boolean z, Object obj) {
                            if (z) {
                                C3317b.m9843a(C3578m.m11231a()).mo19158a(C3340a.this.f7987b, C3340a.this.f7986a);
                                C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                                return;
                            }
                            C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail ");
                        }
                    });
                } else if (this.f7986a.mo19607J() != null) {
                    C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(this.f7986a.mo19650aD()).mo16072b(), this.f7986a);
                    a.mo16377a("material_meta", this.f7986a);
                    a.mo16377a("ad_slot", this.f7987b);
                    C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                    C3687a.m11850a(a, new C2533b() {
                        /* renamed from: a */
                        public void mo16474a(C2522c cVar, int i) {
                            C3317b.m9843a(C3578m.m11231a()).mo19158a(C3340a.this.f7987b, C3340a.this.f7986a);
                            C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                        }

                        /* renamed from: a */
                        public void mo16475a(C2522c cVar, int i, String str) {
                            C2975l.m8387c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail with net change ");
                        }
                    });
                }
            }
        }
    }
}
