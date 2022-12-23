package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2959b;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.component.reward.p144b.C3329c;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3927f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p182b.C3938c;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import com.bytedance.sdk.openadsdk.utils.C4010q;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.k */
/* compiled from: TTFullScreenVideoAdImpl */
class C3369k implements TTFullScreenVideoAd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f8054a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3498n f8055b;

    /* renamed from: c */
    private final AdSlot f8056c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f8057d;

    /* renamed from: e */
    private C4026c f8058e;

    /* renamed from: f */
    private boolean f8059f = true;

    /* renamed from: g */
    private boolean f8060g;

    /* renamed from: h */
    private String f8061h;

    /* renamed from: i */
    private String f8062i;

    /* renamed from: j */
    private AtomicBoolean f8063j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f8064k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f8065l;

    /* renamed from: m */
    private boolean f8066m;

    /* renamed from: n */
    private boolean f8067n;

    /* renamed from: o */
    private Double f8068o = null;

    C3369k(Context context, C3498n nVar, AdSlot adSlot) {
        this.f8054a = context;
        this.f8055b = nVar;
        this.f8056c = adSlot;
        if (getInteractionType() == 4) {
            this.f8058e = C4027d.m13342a(this.f8054a, this.f8055b, "fullscreen_interstitial_ad");
        }
        this.f8060g = false;
        this.f8065l = C4002l.m13120a();
    }

    /* renamed from: a */
    public void mo19237a(boolean z) {
        this.f8064k = z;
    }

    /* renamed from: a */
    public void mo19236a(String str) {
        if (!this.f8063j.get()) {
            this.f8060g = true;
            this.f8061h = str;
        }
    }

    public void setFullScreenVideoAdInteractionListener(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f8057d = fullScreenVideoAdInteractionListener;
        m10015a(1);
    }

    public int getInteractionType() {
        C3498n nVar = this.f8055b;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19609L();
    }

    public void showFullScreenVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            C2975l.m8391e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C3156e.m9183a(this.f8055b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            C2975l.m8391e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        } else if (!this.f8063j.get()) {
            this.f8063j.set(true);
            C3498n nVar = this.f8055b;
            if (nVar == null || (nVar.mo19607J() == null && this.f8055b.mo19613P() == null)) {
                C3156e.m9183a(this.f8055b, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context context = activity == null ? this.f8054a : activity;
            if (context == null) {
                context = C3578m.m11231a();
            }
            if (this.f8055b.mo19724l() != 2 || this.f8055b.mo19705f() == 5 || this.f8055b.mo19705f() == 6) {
                if (C3329c.m9897a(this.f8055b)) {
                    intent = new Intent(context, TTInterstitialActivity.class);
                } else {
                    intent = new Intent(context, TTFullScreenVideoActivity.class);
                }
            } else if (C3329c.m9897a(this.f8055b)) {
                intent = new Intent(context, TTInterstitialExpressActivity.class);
            } else {
                intent = new Intent(context, TTFullScreenExpressVideoActivity.class);
            }
            if (activity == null) {
                intent.addFlags(268435456);
            }
            int i = 0;
            try {
                i = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception unused) {
            }
            intent.putExtra("orientation_angle", i);
            intent.putExtra("show_download_bar", this.f8059f);
            intent.putExtra("is_verity_playable", this.f8064k);
            Double d = this.f8068o;
            intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d == null ? "" : String.valueOf(d));
            if (!TextUtils.isEmpty(this.f8062i)) {
                intent.putExtra("rit_scene", this.f8062i);
            }
            if (this.f8060g) {
                intent.putExtra("video_cache_url", this.f8061h);
            }
            if (C3953b.m12901c()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f8055b.mo19674ar().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f8065l);
            } else {
                C3645t.m11590a().mo20230h();
                C3645t.m11590a().mo20220a(this.f8055b);
                C3645t.m11590a().mo20218a(this.f8057d);
                C3645t.m11590a().mo20221a(this.f8058e);
                this.f8057d = null;
            }
            C2959b.m8339a(context, intent, new C2959b.C2960a() {
                /* renamed from: a */
                public void mo17887a() {
                    if (C3369k.this.f8064k) {
                        try {
                            C3815b.m12552a().mo20660a(C3369k.this.f8055b.mo19607J().mo16362j());
                        } catch (Throwable unused) {
                        }
                    }
                }

                /* renamed from: a */
                public void mo17888a(Throwable th) {
                    C2975l.m8388c("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                    if (C3369k.this.f8064k) {
                        try {
                            C3815b.m12552a().mo20661a(C3369k.this.f8055b.mo19607J().mo16362j(), -1, th != null ? th.getMessage() : "playable tool error open");
                        } catch (Throwable unused) {
                        }
                    }
                    C3156e.m9183a(C3369k.this.f8055b, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            String a = C4014u.m13184a(this.f8055b, (String) null);
            if (a != null) {
                try {
                    AdSlot b = C3332d.m9916a(this.f8054a).mo19190b(a);
                    C3332d.m9916a(this.f8054a).mo19189a(a);
                    if (b == null) {
                        return;
                    }
                    if (!this.f8060g || TextUtils.isEmpty(this.f8061h)) {
                        C3332d.m9916a(this.f8054a).mo19187a(b);
                    } else {
                        C3332d.m9916a(this.f8054a).mo19192b(b);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public void showFullScreenVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            C2975l.m8391e("TTFullScreenVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.f8062i = str;
        } else {
            this.f8062i = ritScenes.getScenesName();
        }
        showFullScreenVideoAd(activity);
    }

    public void setShowDownLoadBar(boolean z) {
        this.f8059f = z;
    }

    public Map<String, Object> getMediaExtraInfo() {
        C3498n nVar = this.f8055b;
        if (nVar != null) {
            return nVar.mo19666aj();
        }
        return null;
    }

    public int getFullVideoAdType() {
        C3498n nVar = this.f8055b;
        if (nVar == null) {
            return -1;
        }
        if (C3501p.m10769i(nVar)) {
            return 2;
        }
        return C3501p.m10770j(this.f8055b) ? 1 : 0;
    }

    public String getAdCreativeToken() {
        return this.f8055b.mo19730n();
    }

    /* renamed from: a */
    private void m10015a(final int i) {
        if (C3953b.m12901c()) {
            C2952e.m8317c(new C2955g("FullScreen_registerMultiProcessListener") {
                public void run() {
                    C3917a a = C3917a.m12866a(C3369k.this.f8054a);
                    if (i == 1 && C3369k.this.f8057d != null) {
                        C2975l.m8384b("MultiProcess", "start registerFullScreenVideoListener ! ");
                        C3938c cVar = new C3938c(C3369k.this.f8057d);
                        IListenerManager asInterface = C3927f.asInterface(a.mo20811a(1));
                        if (asInterface != null) {
                            try {
                                asInterface.registerFullVideoListener(C3369k.this.f8065l, cVar);
                                C2975l.m8384b("MultiProcess", "end registerFullScreenVideoListener ! ");
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    public void win(Double d) {
        if (!this.f8066m) {
            C4010q.m13163a(this.f8055b, d);
            this.f8066m = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f8067n) {
            C4010q.m13164a(this.f8055b, d, str, str2);
            this.f8067n = true;
        }
    }

    public void setPrice(Double d) {
        this.f8068o = d;
    }
}
