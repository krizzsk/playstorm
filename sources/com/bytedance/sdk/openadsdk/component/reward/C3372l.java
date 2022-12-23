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
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3929h;
import com.bytedance.sdk.openadsdk.multipro.aidl.p182b.C3944d;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import com.bytedance.sdk.openadsdk.utils.C4010q;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.l */
/* compiled from: TTRewardVideoAdImpl */
class C3372l implements TTRewardVideoAd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f8072a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3498n f8073b;

    /* renamed from: c */
    private final AdSlot f8074c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTRewardVideoAd.RewardAdInteractionListener f8075d;

    /* renamed from: e */
    private C4026c f8076e;

    /* renamed from: f */
    private boolean f8077f = true;

    /* renamed from: g */
    private boolean f8078g;

    /* renamed from: h */
    private String f8079h;

    /* renamed from: i */
    private String f8080i;

    /* renamed from: j */
    private AtomicBoolean f8081j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f8082k;

    /* renamed from: l */
    private boolean f8083l;

    /* renamed from: m */
    private boolean f8084m;

    /* renamed from: n */
    private Double f8085n = null;

    C3372l(Context context, C3498n nVar, AdSlot adSlot) {
        this.f8072a = context;
        this.f8073b = nVar;
        this.f8074c = adSlot;
        if (getInteractionType() == 4) {
            this.f8076e = C4027d.m13342a(this.f8072a, this.f8073b, "rewarded_video");
        }
        this.f8078g = false;
        this.f8082k = C4002l.m13120a();
    }

    /* renamed from: a */
    public void mo19239a(String str) {
        if (!this.f8081j.get()) {
            this.f8078g = true;
            this.f8079h = str;
        }
    }

    public void setRewardAdInteractionListener(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f8075d = rewardAdInteractionListener;
        m10026a(0);
    }

    public int getInteractionType() {
        C3498n nVar = this.f8073b;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19609L();
    }

    public void setShowDownLoadBar(boolean z) {
        this.f8077f = z;
    }

    public int getRewardVideoAdType() {
        C3498n nVar = this.f8073b;
        if (nVar == null) {
            return -1;
        }
        if (C3501p.m10769i(nVar)) {
            return 2;
        }
        return C3501p.m10770j(this.f8073b) ? 1 : 0;
    }

    public String getAdCreativeToken() {
        return this.f8073b.mo19730n();
    }

    public void showRewardVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            C2975l.m8391e("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C3156e.m9183a(this.f8073b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            C2975l.m8391e("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        } else if (!this.f8081j.get()) {
            this.f8081j.set(true);
            C3498n nVar = this.f8073b;
            if (nVar == null || nVar.mo19607J() == null) {
                C3156e.m9183a(this.f8073b, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context context = activity == null ? this.f8072a : activity;
            if (context == null) {
                context = C3578m.m11231a();
            }
            if (this.f8073b.mo19724l() != 2 || this.f8073b.mo19705f() == 5 || this.f8073b.mo19705f() == 6) {
                intent = new Intent(context, TTRewardVideoActivity.class);
            } else {
                intent = new Intent(context, TTRewardExpressVideoActivity.class);
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
            intent.putExtra(CampaignEx.JSON_KEY_REWARD_NAME, this.f8073b.mo19718j());
            intent.putExtra(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.f8073b.mo19721k());
            intent.putExtra("media_extra", this.f8074c.getMediaExtra());
            intent.putExtra("user_id", this.f8074c.getUserID());
            intent.putExtra("show_download_bar", this.f8077f);
            Double d = this.f8085n;
            intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d == null ? "" : String.valueOf(d));
            if (!TextUtils.isEmpty(this.f8080i)) {
                intent.putExtra("rit_scene", this.f8080i);
            }
            if (this.f8078g) {
                intent.putExtra("video_cache_url", this.f8079h);
            }
            if (C3953b.m12901c()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f8073b.mo19674ar().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f8082k);
            } else {
                C3645t.m11590a().mo20230h();
                C3645t.m11590a().mo20220a(this.f8073b);
                C3645t.m11590a().mo20219a(this.f8075d);
                C3645t.m11590a().mo20221a(this.f8076e);
                this.f8075d = null;
            }
            C2959b.m8339a(context, intent, new C2959b.C2960a() {
                /* renamed from: a */
                public void mo17887a() {
                }

                /* renamed from: a */
                public void mo17888a(Throwable th) {
                    C2975l.m8388c("TTRewardVideoAdImpl", "show reward video error: ", th);
                    C3156e.m9183a(C3372l.this.f8073b, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            String a = C4014u.m13184a(this.f8073b, (String) null);
            if (a != null) {
                try {
                    AdSlot b = C3357i.m9973a(this.f8072a).mo19221b(a);
                    C3357i.m9973a(this.f8072a).mo19220a(a);
                    if (b == null) {
                        return;
                    }
                    if (!this.f8078g || TextUtils.isEmpty(this.f8079h)) {
                        C3357i.m9973a(this.f8072a).mo19218a(b);
                    } else {
                        C3357i.m9973a(this.f8072a).mo19223b(b);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public Map<String, Object> getMediaExtraInfo() {
        C3498n nVar = this.f8073b;
        if (nVar != null) {
            return nVar.mo19666aj();
        }
        return null;
    }

    public void showRewardVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            C2975l.m8391e("TTRewardVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.f8080i = str;
        } else {
            this.f8080i = ritScenes.getScenesName();
        }
        showRewardVideoAd(activity);
    }

    /* renamed from: a */
    private void m10026a(final int i) {
        if (C3953b.m12901c()) {
            C2952e.m8317c(new C2955g("Reward_registerMultiProcessListener") {
                public void run() {
                    C3917a a = C3917a.m12866a(C3372l.this.f8072a);
                    if (i == 0 && C3372l.this.f8075d != null) {
                        C2975l.m8384b("MultiProcess", "start registerRewardVideoListener ! ");
                        C3944d dVar = new C3944d(C3372l.this.f8075d);
                        IListenerManager asInterface = C3929h.asInterface(a.mo20811a(0));
                        if (asInterface != null) {
                            try {
                                asInterface.registerRewardVideoListener(C3372l.this.f8082k, dVar);
                                C2975l.m8384b("MultiProcess", "end registerRewardVideoListener ! ");
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
        if (!this.f8083l) {
            C4010q.m13163a(this.f8073b, d);
            this.f8083l = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f8084m) {
            C4010q.m13164a(this.f8073b, d, str, str2);
            this.f8084m = true;
        }
    }

    public void setPrice(Double d) {
        this.f8085n = d;
    }
}
