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
import com.bytedance.sdk.openadsdk.component.reward.C3351g;
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

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.i */
/* compiled from: RewardVideoLoadManager */
public class C3357i {

    /* renamed from: a */
    private static volatile C3357i f8015a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f8016b;

    /* renamed from: c */
    private final C3581n f8017c = C3578m.m11239f();

    /* renamed from: d */
    private AtomicBoolean f8018d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C3365a> f8019e = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2955g f8020f;

    /* renamed from: g */
    private final BroadcastReceiver f8021g = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (C3357i.this.f8020f == null) {
                    C2955g unused = C3357i.this.f8020f = new C3284a("net connect task", C3357i.this.f8019e);
                }
                C2968h.m8366a().post(C3357i.this.f8020f);
            }
        }
    };

    /* renamed from: a */
    public static C3357i m9973a(Context context) {
        if (f8015a == null) {
            synchronized (C3357i.class) {
                if (f8015a == null) {
                    f8015a = new C3357i(context);
                }
            }
        }
        return f8015a;
    }

    private C3357i(Context context) {
        this.f8016b = context == null ? C3578m.m11231a() : context.getApplicationContext();
        m9980c();
    }

    /* renamed from: a */
    public void mo19217a() {
        AdSlot b = C3351g.m9945a(this.f8016b).mo19210b();
        if (b != null && !TextUtils.isEmpty(b.getCodeId()) && C3351g.m9945a(this.f8016b).mo19213c(b.getCodeId()) == null) {
            mo19223b(b);
        }
    }

    /* renamed from: a */
    public void mo19218a(AdSlot adSlot) {
        C3351g.m9945a(this.f8016b).mo19212b(adSlot);
    }

    /* renamed from: b */
    public void mo19222b() {
        try {
            C3351g.m9945a(this.f8016b).mo19205a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo19219a(AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        C2975l.m8384b("RewardVideoLoadManager", "load reward vide: " + String.valueOf(adSlot));
        C2975l.m8384b("bidding", "load reward vide: BidAdm->MD5->" + C2535b.m6426a(adSlot.getBidAdm()));
        C3351g.m9945a(this.f8016b).mo19206a(adSlot);
        m9974a(adSlot, false, rewardVideoAdListener);
    }

    /* renamed from: b */
    public void mo19223b(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            C2975l.m8384b("RewardVideoLoadManager", "preload reward video: " + String.valueOf(adSlot));
            m9974a(adSlot, true, (TTAdNative.RewardVideoAdListener) null);
            return;
        }
        C2975l.m8384b("bidding", "preload not request bidding：BidAdm->MD5->" + C2535b.m6426a(adSlot.getBidAdm()));
    }

    /* renamed from: a */
    private void m9974a(AdSlot adSlot, boolean z, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            m9975a(adSlot, true, rewardVideoAdListener, currentTimeMillis);
            return;
        }
        C3498n c = C3351g.m9945a(this.f8016b).mo19213c(adSlot.getCodeId());
        if (c != null) {
            C3372l lVar = new C3372l(this.f8016b, c, adSlot);
            if (!C3501p.m10769i(c)) {
                lVar.mo19239a(C3351g.m9945a(this.f8016b).mo19203a(c));
            }
            C3156e.m9179a(c);
            if (rewardVideoAdListener != null) {
                rewardVideoAdListener.onRewardVideoAdLoad(lVar);
                if (!C3501p.m10769i(c)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final C2521b J = c.mo19607J();
                        C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(c.mo19650aD()).mo16072b(), c);
                        a.mo16377a("material_meta", c);
                        a.mo16377a("ad_slot", adSlot);
                        final TTAdNative.RewardVideoAdListener rewardVideoAdListener2 = rewardVideoAdListener;
                        final C3498n nVar = c;
                        final AdSlot adSlot2 = adSlot;
                        final long j = currentTimeMillis;
                        C3687a.m11850a(a, new C2533b() {
                            /* renamed from: a */
                            public void mo16474a(C2522c cVar, int i) {
                                if (rewardVideoAdListener2 != null) {
                                    C3156e.m9191b(C3357i.this.f8016b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j);
                                    rewardVideoAdListener2.onRewardVideoCached();
                                    C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onRewardVideoCached");
                                }
                            }

                            /* renamed from: a */
                            public void mo16475a(C2522c cVar, int i, String str) {
                                C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail");
                                if (rewardVideoAdListener2 != null && J.mo16371s()) {
                                    C3156e.m9191b(C3357i.this.f8016b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j);
                                    rewardVideoAdListener2.onRewardVideoCached();
                                    C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail and exec onRewardVideoCached");
                                }
                            }
                        });
                    } else {
                        C3156e.m9191b(this.f8016b, c, C4014u.m13198b(adSlot.getDurationSlotType()), currentTimeMillis);
                        rewardVideoAdListener.onRewardVideoCached();
                    }
                }
            }
            final TTAdNative.RewardVideoAdListener rewardVideoAdListener3 = rewardVideoAdListener;
            final C3498n nVar2 = c;
            final AdSlot adSlot3 = adSlot;
            final long j2 = currentTimeMillis;
            C3661a.m11659a().mo20257a(c, (C3661a.C3666a) new C3661a.C3666a() {
                /* renamed from: a */
                public void mo19194a(boolean z) {
                    if (rewardVideoAdListener3 != null && C3501p.m10769i(nVar2)) {
                        C3156e.m9191b(C3357i.this.f8016b, nVar2, C4014u.m13198b(adSlot3.getDurationSlotType()), j2);
                        rewardVideoAdListener3.onRewardVideoCached();
                    }
                }
            });
            C2975l.m8384b("RewardVideoLoadManager", "get cache data success");
            C2975l.m8384b("bidding", "reward video get cache data success");
            return;
        }
        m9975a(adSlot, false, rewardVideoAdListener, currentTimeMillis);
    }

    /* renamed from: a */
    private void m9975a(AdSlot adSlot, boolean z, TTAdNative.RewardVideoAdListener rewardVideoAdListener, long j) {
        C2975l.m8384b("bidding", "reward video doNetwork , get new materials:BidAdm->MD5->" + C2535b.m6426a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        C3500o oVar = new C3500o();
        oVar.f8656b = z ? 2 : 1;
        if (C3578m.m11241h().mo19948h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f8660f = 2;
        }
        final boolean z2 = z;
        final TTAdNative.RewardVideoAdListener rewardVideoAdListener2 = rewardVideoAdListener;
        final AdSlot adSlot2 = adSlot;
        final long j2 = j;
        AdSlot adSlot3 = adSlot;
        this.f8017c.mo20073a(adSlot, oVar, 7, new C3581n.C3582a() {
            /* renamed from: a */
            public void mo18544a(int i, String str) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener;
                if (!z2 && (rewardVideoAdListener = rewardVideoAdListener2) != null) {
                    rewardVideoAdListener.onError(i, str);
                }
            }

            /* renamed from: a */
            public void mo18545a(C3469a aVar, C3470b bVar) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener;
                if (aVar.mo19477b() != null && !aVar.mo19477b().isEmpty()) {
                    C2975l.m8384b("RewardVideoLoadManager", "get material data success isPreload=" + z2);
                    final C3498n nVar = aVar.mo19477b().get(0);
                    try {
                        if (nVar.mo19610M() != null && !TextUtils.isEmpty(nVar.mo19610M().mo19559a())) {
                            C3852b bVar2 = new C3852b(true);
                            bVar2.mo20699a(adSlot2.getCodeId());
                            bVar2.mo20698a(7);
                            bVar2.mo20701c(nVar.mo19622Y());
                            bVar2.mo20702d(nVar.mo19659ac());
                            bVar2.mo20700b(C4014u.m13235h(nVar));
                            C3769a.m12387a(nVar.mo19610M()).mo17711a((C2902n) bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final C3372l lVar = new C3372l(C3357i.this.f8016b, nVar, adSlot2);
                    if (!z2 && rewardVideoAdListener2 != null) {
                        if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            C3156e.m9181a(nVar, "rewarded_video", System.currentTimeMillis() - currentTimeMillis);
                        }
                        rewardVideoAdListener2.onRewardVideoAdLoad(lVar);
                    }
                    C3661a.m11659a().mo20257a(nVar, (C3661a.C3666a) new C3661a.C3666a() {
                        /* renamed from: a */
                        public void mo19194a(boolean z) {
                            C3498n nVar;
                            if (!z2 && rewardVideoAdListener2 != null && (nVar = nVar) != null && C3501p.m10769i(nVar)) {
                                C3156e.m9191b(C3357i.this.f8016b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j2);
                                rewardVideoAdListener2.onRewardVideoCached();
                            }
                        }
                    });
                    if (z2 && !C3501p.m10769i(nVar) && C3578m.m11241h().mo19962n(adSlot2.getCodeId()).f8771d == 1 && !C2979o.m8410d(C3357i.this.f8016b)) {
                        C3357i.this.m9976a(new C3365a(nVar, adSlot2));
                    } else if (C3501p.m10769i(nVar)) {
                        C3351g.m9945a(C3357i.this.f8016b).mo19207a(adSlot2, nVar);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        final C2521b J = nVar.mo19607J();
                        if (J != null) {
                            C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(nVar.mo19650aD()).mo16072b(), nVar);
                            a.mo16377a("material_meta", nVar);
                            a.mo16377a("ad_slot", adSlot2);
                            SystemClock.elapsedRealtime();
                            C3687a.m11850a(a, new C2533b() {
                                /* renamed from: a */
                                public void mo16474a(C2522c cVar, int i) {
                                    C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess");
                                    if (z2) {
                                        C3351g.m9945a(C3357i.this.f8016b).mo19207a(adSlot2, nVar);
                                        C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: ad json save");
                                    } else if (rewardVideoAdListener2 != null) {
                                        C3156e.m9191b(C3357i.this.f8016b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                        C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: onRewardVideoCached");
                                    }
                                }

                                /* renamed from: a */
                                public void mo16475a(C2522c cVar, int i, String str) {
                                    C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail");
                                    if (rewardVideoAdListener2 != null && J.mo16371s()) {
                                        C3156e.m9191b(C3357i.this.f8016b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                        C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog:  onVideoPreloadFail and exec onRewardVideoCached");
                                    }
                                }
                            });
                        }
                    } else {
                        C3351g.m9945a(C3357i.this.f8016b).mo19208a(nVar, (C3351g.C3355a<Object>) new C3351g.C3355a<Object>() {
                            /* renamed from: a */
                            public void mo19216a(boolean z, Object obj) {
                                C2975l.m8384b("RewardVideoLoadManager", "download video file: " + z + ", preload: " + z2);
                                if (z) {
                                    lVar.mo19239a(C3351g.m9945a(C3357i.this.f8016b).mo19203a(nVar));
                                }
                                if (!z2) {
                                    C3156e.m9179a(nVar);
                                    if (z && rewardVideoAdListener2 != null) {
                                        C3156e.m9191b(C3357i.this.f8016b, nVar, C4014u.m13198b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                    }
                                } else if (z) {
                                    C3351g.m9945a(C3357i.this.f8016b).mo19207a(adSlot2, nVar);
                                }
                            }
                        });
                    }
                } else if (!z2 && (rewardVideoAdListener = rewardVideoAdListener2) != null) {
                    rewardVideoAdListener.onError(-3, C3513g.m10825a(-3));
                    bVar.mo19482a(-3);
                    C3470b.m10407a(bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo19220a(String str) {
        C3351g.m9945a(this.f8016b).mo19209a(str);
    }

    /* renamed from: b */
    public AdSlot mo19221b(String str) {
        return C3351g.m9945a(this.f8016b).mo19211b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9976a(C3365a aVar) {
        if (aVar != null) {
            if (this.f8019e.size() >= 1) {
                this.f8019e.remove(0);
            }
            this.f8019e.add(aVar);
        }
    }

    /* renamed from: c */
    private void m9980c() {
        if (!this.f8018d.get()) {
            this.f8018d.set(true);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                this.f8016b.registerReceiver(this.f8021g, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private void m9981d() {
        if (this.f8018d.get()) {
            this.f8018d.set(false);
            try {
                this.f8016b.unregisterReceiver(this.f8021g);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f8020f != null) {
            try {
                C2968h.m8366a().removeCallbacks(this.f8020f);
            } catch (Exception unused) {
            }
            this.f8020f = null;
        }
        m9981d();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.i$a */
    /* compiled from: RewardVideoLoadManager */
    public static class C3365a extends C2955g {

        /* renamed from: a */
        C3498n f8048a;

        /* renamed from: b */
        AdSlot f8049b;

        C3365a(C3498n nVar, AdSlot adSlot) {
            super("Reward Task");
            this.f8048a = nVar;
            this.f8049b = adSlot;
        }

        public void run() {
            if (this.f8048a != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    C3351g.m9945a(C3578m.m11231a()).mo19208a(this.f8048a, (C3351g.C3355a<Object>) new C3351g.C3355a<Object>() {
                        /* renamed from: a */
                        public void mo19216a(boolean z, Object obj) {
                            if (z) {
                                C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                                C3351g.m9945a(C3578m.m11231a()).mo19207a(C3365a.this.f8049b, C3365a.this.f8048a);
                                return;
                            }
                            C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                        }
                    });
                } else if (this.f8048a.mo19607J() != null) {
                    C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(this.f8048a.mo19650aD()).mo16072b(), this.f8048a);
                    a.mo16377a("material_meta", this.f8048a);
                    a.mo16377a("ad_slot", this.f8049b);
                    C3687a.m11850a(a, new C2533b() {
                        /* renamed from: a */
                        public void mo16474a(C2522c cVar, int i) {
                            C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                            C3351g.m9945a(C3578m.m11231a()).mo19207a(C3365a.this.f8049b, C3365a.this.f8048a);
                        }

                        /* renamed from: a */
                        public void mo16475a(C2522c cVar, int i, String str) {
                            C2975l.m8387c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                        }
                    });
                }
            }
        }
    }
}
