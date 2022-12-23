package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.component.reward.top.C3379b;
import com.bytedance.sdk.openadsdk.core.C3423b;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.C3627o;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.p151e.C3485l;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.core.widget.C3742a;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TTRewardVideoActivity extends TTBaseVideoActivity {

    /* renamed from: U */
    private static final String f7176U = C2984t.m8425a(C3578m.m11231a(), "tt_reward_msg");

    /* renamed from: V */
    private static final String f7177V = C2984t.m8425a(C3578m.m11231a(), "tt_msgPlayable");

    /* renamed from: W */
    private static final String f7178W = C2984t.m8425a(C3578m.m11231a(), "tt_negtiveBtnBtnText");

    /* renamed from: X */
    private static final String f7179X = C2984t.m8425a(C3578m.m11231a(), "tt_postiveBtnText");

    /* renamed from: Y */
    private static final String f7180Y = C2984t.m8425a(C3578m.m11231a(), "tt_postiveBtnTextPlayable");

    /* renamed from: ad */
    private static TTRewardVideoAd.RewardAdInteractionListener f7181ad;

    /* renamed from: R */
    protected int f7182R;

    /* renamed from: S */
    protected int f7183S;

    /* renamed from: T */
    protected TTRewardVideoAd.RewardAdInteractionListener f7184T;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f7185Z;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public int f7186aa;

    /* renamed from: ab */
    private String f7187ab;

    /* renamed from: ac */
    private String f7188ac;

    /* renamed from: ae */
    private AtomicBoolean f7189ae = new AtomicBoolean(false);

    /* renamed from: af */
    private int f7190af = -1;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0066, code lost:
        if (r3.f7014g.get() == false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0071  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8887N() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.b.b.b.o$a r0 = new com.bytedance.sdk.openadsdk.b.b.b.o$a
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f7020m
            long r1 = r1.mo19088s()
            r0.mo18721a((long) r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f7020m
            long r1 = r1.mo19090u()
            r0.mo18728c((long) r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f7020m
            long r1 = r1.mo19079j()
            r0.mo18725b((long) r1)
            r1 = 3
            r0.mo18732e(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f7020m
            int r1 = r1.mo19087r()
            r0.mo18734f(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f7020m
            com.bykv.vk.openvk.component.video.api.b.a r1 = r1.mo19071c()
            com.bytedance.sdk.openadsdk.component.reward.a.e r2 = r3.f7020m
            com.bytedance.sdk.openadsdk.b.j r2 = r2.mo19055a()
            com.bytedance.sdk.openadsdk.p130b.p132b.p133a.C3133a.m9043a((com.bykv.p068vk.openvk.component.video.api.p084b.C2519a) r1, (com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3150o.C3151a) r0, (com.bytedance.sdk.openadsdk.p130b.C3167j) r2)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f7020m
            r0.mo19082m()
            int r0 = r3.f7027t
            com.bytedance.sdk.openadsdk.core.C3639p.m11565c((int) r0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f7020m
            java.lang.String r1 = "skip"
            r2 = 0
            r0.mo19062a((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.Object>) r2)
            boolean r0 = r3.mo18439h()
            if (r0 == 0) goto L_0x0068
            r0 = 1
            r3.mo18423a((boolean) r0)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f7010c
            boolean r0 = com.bytedance.sdk.openadsdk.core.p151e.C3485l.m10537a((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r0)
            if (r0 == 0) goto L_0x006b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f7014g
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x006b
        L_0x0068:
            r3.finish()
        L_0x006b:
            boolean r0 = com.bytedance.sdk.openadsdk.multipro.C3953b.m12901c()
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "onSkippedVideo"
            r3.mo18578c((java.lang.String) r0)
            goto L_0x007e
        L_0x0077:
            com.bytedance.sdk.openadsdk.TTRewardVideoAd$RewardAdInteractionListener r0 = r3.f7184T
            if (r0 == 0) goto L_0x007e
            r0.onSkippedVideo()
        L_0x007e:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f7010c
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f7010c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.mo19680ax()
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f7020m
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f7010c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.mo19680ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.mo19977a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f7020m
            long r1 = r1.mo19088s()
            r0.mo20054f((long) r1)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f7010c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.mo19680ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.mo19977a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f7020m
            long r1 = r1.mo19088s()
            r0.mo20052e((long) r1)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.m8887N():void");
    }

    /* renamed from: O */
    private JSONObject m8888O() {
        JSONObject jSONObject = new JSONObject();
        int v = (int) this.f7020m.mo19091v();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.f7185Z);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.f7186aa);
            jSONObject.put("network", C2979o.m8409c(this.f7009b));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int F = this.f7010c.mo19603F();
            String str = "unKnow";
            if (F == 2) {
                str = C4014u.m13180a();
            } else if (F == 1) {
                str = C4014u.m13197b();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.f7010c.mo19654aH());
            jSONObject.put("media_extra", this.f7187ab);
            jSONObject.put("video_duration", this.f7010c.mo19607J().mo16353f());
            jSONObject.put("play_start_ts", this.f7182R);
            jSONObject.put("play_end_ts", this.f7183S);
            jSONObject.put("duration", v);
            jSONObject.put("user_id", this.f7188ac);
            jSONObject.put("trans_id", C4002l.m13120a().replace("-", ""));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: P */
    private void m8889P() {
        if (!this.f6980G) {
            this.f6980G = true;
            if (C3953b.m12901c()) {
                mo18578c("onAdClose");
                return;
            }
            TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f7184T;
            if (rewardAdInteractionListener != null) {
                rewardAdInteractionListener.onAdClose();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8893a(String str, boolean z, int i, String str2, int i2, String str3) {
        final String str4 = str;
        final boolean z2 = z;
        final int i3 = i;
        final String str5 = str2;
        final int i4 = i2;
        final String str6 = str3;
        C2952e.m8317c(new C2955g("Reward_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTRewardVideoActivity.this.mo18418a(0).executeRewardVideoCallback(TTRewardVideoActivity.this.f7011d, str4, z2, i3, str5, i4, str6);
                } catch (Throwable th) {
                    C2975l.m8388c("TTRewardVideoActivity", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8895b(final boolean z, final boolean z2) {
        String str;
        C3742a aVar;
        if (!C3578m.m11241h().mo19936d(String.valueOf(this.f7027t))) {
            if (z) {
                if (!z2) {
                    if (C3953b.m12901c()) {
                        mo18578c("onSkippedVideo");
                    } else {
                        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f7184T;
                        if (rewardAdInteractionListener != null) {
                            rewardAdInteractionListener.onSkippedVideo();
                        }
                    }
                }
                finish();
                return;
            }
            m8887N();
        } else if (!this.f7189ae.get()) {
            this.f6974A.set(true);
            this.f7020m.mo19084o();
            if (z) {
                mo18465x();
            }
            final C3742a aVar2 = new C3742a(this);
            this.f6975B = aVar2;
            C3742a aVar3 = this.f6975B;
            if (z) {
                aVar = aVar3.mo20527a(f7177V);
                str = f7180Y;
            } else {
                aVar = aVar3.mo20527a(f7176U);
                str = f7179X;
            }
            aVar.mo20528b(str).mo20529c(f7178W);
            this.f6975B.mo20526a((C3742a.C3745a) new C3742a.C3745a() {
                /* renamed from: a */
                public void mo18582a() {
                    TTRewardVideoActivity.this.f7020m.mo19083n();
                    if (z) {
                        TTRewardVideoActivity.this.mo18466y();
                    }
                    aVar2.dismiss();
                    TTRewardVideoActivity.this.f6974A.set(false);
                }

                /* renamed from: b */
                public void mo18583b() {
                    aVar2.dismiss();
                    TTRewardVideoActivity.this.f6974A.set(false);
                    TTRewardVideoActivity.this.f7023p.mo19014d(Integer.MAX_VALUE);
                    if (z) {
                        TTRewardVideoActivity.this.mo18459r();
                        if (!z2) {
                            if (C3953b.m12901c()) {
                                TTRewardVideoActivity.this.mo18578c("onSkippedVideo");
                            } else if (TTRewardVideoActivity.this.f7184T != null) {
                                TTRewardVideoActivity.this.f7184T.onSkippedVideo();
                            }
                        }
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                    TTRewardVideoActivity.this.m8887N();
                }
            }).show();
        } else if (z) {
            if (!z2) {
                if (C3953b.m12901c()) {
                    mo18578c("onSkippedVideo");
                } else {
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener2 = this.f7184T;
                    if (rewardAdInteractionListener2 != null) {
                        rewardAdInteractionListener2.onSkippedVideo();
                    }
                }
            }
            finish();
        } else {
            m8887N();
        }
    }

    /* renamed from: b */
    private boolean m8896b(Bundle bundle) {
        String stringExtra;
        if (C3953b.m12901c()) {
            Intent intent = getIntent();
            if (!(intent == null || (stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA)) == null)) {
                try {
                    this.f7010c = C3423b.m10208a(new JSONObject(stringExtra));
                } catch (Exception e) {
                    C2975l.m8388c("TTRewardVideoActivity", "TTRewardVideoActivity MultiGlobalInfo throw ", e);
                }
            }
        } else {
            this.f7010c = C3645t.m11590a().mo20225c();
            this.f7184T = C3645t.m11590a().mo20226d();
        }
        if (!C3953b.m12901c()) {
            C3645t.m11590a().mo20230h();
        }
        if (bundle != null) {
            if (this.f7184T == null) {
                this.f7184T = f7181ad;
                f7181ad = null;
            }
            try {
                this.f7010c = C3423b.m10208a(new JSONObject(bundle.getString("material_meta")));
                this.f7030w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.f7030w.get()) {
                    this.f7018k.mo19037d(true);
                    this.f7018k.mo19027a((String) null, (CharSequence) C3537f.f8808c);
                    this.f7018k.mo19038e(true);
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f7010c == null) {
            C2975l.m8391e("TTRewardVideoActivity", "mMaterialMeta is null , no data to display ,the TTRewardVideoActivity finished !!");
            finish();
            return false;
        }
        this.f7021n.mo18996a(this.f7010c, this.f7000a);
        this.f7021n.mo18994a();
        this.f7010c.mo19628a(this.f7010c.mo19708g(), 7);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo18415G() {
        View k = this.f7016i.mo19328k();
        if (k != null) {
            k.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTRewardVideoActivity.this.f7022o.mo19130r();
                    TTRewardVideoActivity.this.mo18459r();
                    if (C3501p.m10769i(TTRewardVideoActivity.this.f7010c)) {
                        TTRewardVideoActivity.this.m8895b(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            });
        }
        this.f7018k.mo19026a((C3379b) new C3379b() {
            /* renamed from: a */
            public void mo18524a(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.m8895b(C3501p.m10769i(tTRewardVideoActivity.f7010c), false);
            }

            /* renamed from: b */
            public void mo18525b(View view) {
                if (!(TTRewardVideoActivity.this.f6985L == null || TTRewardVideoActivity.this.f6985L.mo19168a() == null)) {
                    TTRewardVideoActivity.this.f6985L.mo19168a().mo19177a(TTRewardVideoActivity.this.f7025r);
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.f7025r = !tTRewardVideoActivity.f7025r;
                C2975l.m8384b("TTRewardVideoActivity", "will set is Mute " + TTRewardVideoActivity.this.f7025r + " mLastVolume=" + TTRewardVideoActivity.this.f6978E.mo20622b());
                TTRewardVideoActivity.this.f7020m.mo19069b(TTRewardVideoActivity.this.f7025r);
                if (!C3501p.m10770j(TTRewardVideoActivity.this.f7010c) || TTRewardVideoActivity.this.f7029v.get()) {
                    if (C3501p.m10761a(TTRewardVideoActivity.this.f7010c)) {
                        TTRewardVideoActivity.this.f6978E.mo20621a(TTRewardVideoActivity.this.f7025r, true);
                    }
                    TTRewardVideoActivity.this.f7022o.mo19116d(TTRewardVideoActivity.this.f7025r);
                    if (TTRewardVideoActivity.this.f7010c != null && TTRewardVideoActivity.this.f7010c.mo19680ax() != null && TTRewardVideoActivity.this.f7010c.mo19680ax().mo19977a() != null && TTRewardVideoActivity.this.f7020m != null) {
                        if (TTRewardVideoActivity.this.f7025r) {
                            TTRewardVideoActivity.this.f7010c.mo19680ax().mo19977a().mo20058h(TTRewardVideoActivity.this.f7020m.mo19088s());
                        } else {
                            TTRewardVideoActivity.this.f7010c.mo19680ax().mo19977a().mo20060i(TTRewardVideoActivity.this.f7020m.mo19088s());
                        }
                    }
                }
            }

            /* renamed from: c */
            public void mo18526c(View view) {
                TTRewardVideoActivity.this.mo18414F();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo18416H() {
        return true;
    }

    /* renamed from: J */
    public void mo18515J() {
        if (C3953b.m12901c()) {
            mo18578c("onAdShow");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f7184T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdShow();
        }
    }

    /* renamed from: K */
    public void mo18516K() {
        if (C3953b.m12901c()) {
            mo18578c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f7184T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo18517L() {
        if (!this.f7189ae.get()) {
            this.f7189ae.set(true);
            if (!C3578m.m11241h().mo19958l(String.valueOf(this.f7027t))) {
                C3578m.m11239f().mo20076a(m8888O(), (C3581n.C3583b) new C3581n.C3583b() {
                    /* renamed from: a */
                    public void mo18585a(int i, String str) {
                        if (C3953b.m12901c()) {
                            TTRewardVideoActivity.this.m8893a("onRewardVerify", false, 0, "", i, str);
                        } else if (TTRewardVideoActivity.this.f7184T != null) {
                            TTRewardVideoActivity.this.f7184T.onRewardVerify(false, 0, "", i, str);
                        }
                    }

                    /* renamed from: a */
                    public void mo18586a(final C3627o.C3638b bVar) {
                        final int a = bVar.f9242c.mo19796a();
                        final String b = bVar.f9242c.mo19799b();
                        if (C3953b.m12901c()) {
                            TTRewardVideoActivity.this.m8893a("onRewardVerify", bVar.f9241b, a, b, 0, "");
                        } else {
                            TTRewardVideoActivity.this.f7024q.post(new Runnable() {
                                public void run() {
                                    if (TTRewardVideoActivity.this.f7184T != null) {
                                        TTRewardVideoActivity.this.f7184T.onRewardVerify(bVar.f9241b, a, b, 0, "");
                                    }
                                }
                            });
                        }
                    }
                });
            } else if (C3953b.m12901c()) {
                m8893a("onRewardVerify", true, this.f7186aa, this.f7185Z, 0, "");
            } else {
                this.f7024q.post(new Runnable() {
                    public void run() {
                        if (TTRewardVideoActivity.this.f7184T != null) {
                            TTRewardVideoActivity.this.f7184T.onRewardVerify(true, TTRewardVideoActivity.this.f7186aa, TTRewardVideoActivity.this.f7185Z, 0, "");
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo18576M() {
        if (C3953b.m12901c()) {
            mo18578c("onVideoComplete");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f7184T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onVideoComplete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18577a(long j, long j2) {
        long j3 = j + (((long) this.f6988O) * 1000);
        if (this.f7190af == -1) {
            this.f7190af = C3578m.m11241h().mo19962n(String.valueOf(this.f7027t)).f8773f;
        }
        if (j2 > 0) {
            if (j2 >= 30000 && j3 >= 27000) {
                mo18517L();
            } else if (((float) (j3 * 100)) / ((float) j2) >= ((float) this.f7190af)) {
                mo18517L();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18420a(Intent intent) {
        super.mo18420a(intent);
        if (intent != null) {
            this.f7185Z = intent.getStringExtra(CampaignEx.JSON_KEY_REWARD_NAME);
            this.f7186aa = intent.getIntExtra(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0);
            this.f7187ab = intent.getStringExtra("media_extra");
            this.f7188ac = intent.getStringExtra("user_id");
        }
    }

    /* renamed from: a */
    public boolean mo18514a(long j, boolean z) {
        HashMap hashMap;
        C3167j jVar = new C3167j();
        jVar.mo18770a(System.currentTimeMillis(), 1.0f);
        this.f7020m.mo19058a(this.f7016i.mo19325h(), this.f7010c, this.f7000a, mo18416H(), jVar);
        if (!TextUtils.isEmpty(this.f6977D)) {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.f6977D);
        } else {
            hashMap = null;
        }
        this.f7020m.mo19063a((Map<String, Object>) hashMap);
        C30935 r1 = new C2526c.C2527a() {
            /* renamed from: a */
            public void mo16463a(long j, int i) {
                TTRewardVideoActivity.this.f7024q.removeMessages(300);
                TTRewardVideoActivity.this.mo18412D();
                TTRewardVideoActivity.this.mo18576M();
                TTRewardVideoActivity.this.f6987N.set(true);
                if (TTRewardVideoActivity.this.mo18439h()) {
                    TTRewardVideoActivity.this.mo18423a(false);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.f7183S = (int) (System.currentTimeMillis() / 1000);
                TTRewardVideoActivity.this.mo18517L();
            }

            /* renamed from: b */
            public void mo16465b(long j, int i) {
                TTRewardVideoActivity.this.f7024q.removeMessages(300);
                if (C3953b.m12901c()) {
                    TTRewardVideoActivity.this.mo18578c("onVideoError");
                } else if (TTRewardVideoActivity.this.f7184T != null) {
                    TTRewardVideoActivity.this.f7184T.onVideoError();
                }
                TTRewardVideoActivity.this.mo18411C();
                if (!TTRewardVideoActivity.this.f7020m.mo19070b()) {
                    TTRewardVideoActivity.this.mo18412D();
                    TTRewardVideoActivity.this.f7020m.mo19082m();
                    TTRewardVideoActivity.this.mo18517L();
                    if (TTRewardVideoActivity.this.mo18439h()) {
                        TTRewardVideoActivity.this.mo18424a(false, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                    TTRewardVideoActivity.this.f7020m.mo19056a(true ^ TTRewardVideoActivity.this.f7020m.mo19051B() ? 1 : 0, 2);
                }
            }

            /* renamed from: a */
            public void mo16462a() {
                TTRewardVideoActivity.this.f7024q.removeMessages(300);
                TTRewardVideoActivity.this.mo18412D();
                if (TTRewardVideoActivity.this.mo18439h()) {
                    TTRewardVideoActivity.this.mo18424a(false, true);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.f7020m.mo19056a(TTRewardVideoActivity.this.f7020m.mo19051B() ^ true ? 1 : 0, true ^ TTRewardVideoActivity.this.f7020m.mo19051B() ? 1 : 0);
                TTRewardVideoActivity.this.f7020m.mo19082m();
            }

            /* renamed from: a */
            public void mo16464a(long j, long j2) {
                if (!TTRewardVideoActivity.this.f6981H && TTRewardVideoActivity.this.f7020m.mo19070b()) {
                    TTRewardVideoActivity.this.f7020m.mo19084o();
                }
                if (!TTRewardVideoActivity.this.f7029v.get()) {
                    TTRewardVideoActivity.this.f7024q.removeMessages(300);
                    if (j != TTRewardVideoActivity.this.f7020m.mo19075f()) {
                        TTRewardVideoActivity.this.mo18412D();
                    }
                    TTRewardVideoActivity.this.f7020m.mo19057a(j);
                    TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                    long j3 = j / 1000;
                    double d = (double) j3;
                    tTRewardVideoActivity.f7026s = (int) (tTRewardVideoActivity.f7020m.mo19052C() - d);
                    if (TTRewardVideoActivity.this.f7026s >= 0) {
                        TTRewardVideoActivity.this.f7018k.mo19027a(String.valueOf(TTRewardVideoActivity.this.f7026s), (CharSequence) null);
                    }
                    TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity2.f7026s = (int) (tTRewardVideoActivity2.f7020m.mo19052C() - d);
                    int i = (int) j3;
                    int f = C3578m.m11241h().mo19941f(String.valueOf(TTRewardVideoActivity.this.f7027t));
                    boolean z = f >= 0;
                    if ((TTRewardVideoActivity.this.f6974A.get() || TTRewardVideoActivity.this.f7032y.get()) && TTRewardVideoActivity.this.f7020m.mo19070b()) {
                        TTRewardVideoActivity.this.f7020m.mo19084o();
                    }
                    TTRewardVideoActivity.this.f7016i.mo19319c(i);
                    TTRewardVideoActivity.this.mo18577a(j, j2);
                    if (TTRewardVideoActivity.this.f7026s > 0) {
                        TTRewardVideoActivity.this.f7018k.mo19037d(true);
                        if (!z || i < f) {
                            TTRewardVideoActivity.this.f7018k.mo19027a(String.valueOf(TTRewardVideoActivity.this.f7026s), (CharSequence) null);
                            return;
                        }
                        TTRewardVideoActivity.this.f7030w.getAndSet(true);
                        TTRewardVideoActivity.this.f7018k.mo19027a(String.valueOf(TTRewardVideoActivity.this.f7026s), (CharSequence) C3537f.f8808c);
                        TTRewardVideoActivity.this.f7018k.mo19038e(true);
                    } else if (C3485l.m10541c(TTRewardVideoActivity.this.f7010c) || C3485l.m10539b(TTRewardVideoActivity.this.f7010c)) {
                        TTRewardVideoActivity.this.mo18423a(false);
                    } else if (C3485l.m10537a(TTRewardVideoActivity.this.f7010c) && !TTRewardVideoActivity.this.f7014g.get()) {
                        TTRewardVideoActivity.this.f7030w.getAndSet(true);
                        TTRewardVideoActivity.this.f7018k.mo19037d(true);
                        TTRewardVideoActivity.this.f7018k.mo19038e(true);
                    } else if (TTRewardVideoActivity.this.mo18439h()) {
                        TTRewardVideoActivity.this.mo18423a(false);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            }
        };
        this.f7020m.mo19059a((C2526c.C2527a) r1);
        this.f7020m.mo19059a((C2526c.C2527a) r1);
        if (this.f7016i.f8170x != null) {
            this.f7016i.f8170x.mo19573a((C2526c.C2527a) r1);
        }
        boolean a = mo18426a(j, z, (Map<String, Object>) hashMap);
        if (a && !z) {
            this.f7182R = (int) (System.currentTimeMillis() / 1000);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18578c(String str) {
        m8893a(str, false, 0, "", 0, "");
    }

    /* renamed from: f */
    public void mo18519f(int i) {
        if (i == 10000) {
            mo18517L();
        } else if (i == 10001) {
            mo18576M();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        f7181ad = null;
    }

    public void finish() {
        m8889P();
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m8896b(bundle)) {
            mo18460s();
            mo18461t();
            mo18433d();
            mo18419a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f7019l != null) {
            this.f7019l.mo19297f();
        }
        m8889P();
        if (C3953b.m12901c()) {
            mo18578c("recycleRes");
        }
        this.f7184T = null;
    }

    public void onRewardBarClick(View view) {
        if (C3953b.m12901c()) {
            mo18578c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f7184T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        f7181ad = this.f7184T;
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        if (r12.f7022o.mo19117e().mo20458e() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (((1.0d - (((double) r12.f7026s) / r12.f7020m.mo19052C())) * 100.0d) >= ((double) r0)) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18467z() {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.i.f r0 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()
            int r1 = r12.f7027t
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.i.a r0 = r0.mo19962n(r1)
            int r0 = r0.f8773f
            com.bytedance.sdk.openadsdk.core.e.n r1 = r12.f7010c
            boolean r1 = com.bytedance.sdk.openadsdk.core.p151e.C3501p.m10770j(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0033
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r12.f7020m
            double r8 = r1.mo19052C()
            int r1 = r12.f7026s
            double r10 = (double) r1
            double r10 = r10 / r8
            double r6 = r6 - r10
            double r6 = r6 * r4
            double r0 = (double) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = r3
        L_0x0031:
            r3 = r2
            goto L_0x0072
        L_0x0033:
            r1 = 1120403456(0x42c80000, float:100.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r12.f7010c
            int r5 = r5.mo19676at()
            float r5 = (float) r5
            com.bytedance.sdk.openadsdk.component.reward.a.b r6 = r12.f7023p
            int r6 = r6.mo19022k()
            float r6 = (float) r6
            float r6 = r6 / r5
            float r4 = r4 - r6
            float r4 = r4 * r1
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
            r0 = r2
            goto L_0x0050
        L_0x004f:
            r0 = r3
        L_0x0050:
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()
            int r4 = r12.f7027t
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.mo19923a((java.lang.String) r4)
            if (r1 != 0) goto L_0x006f
            if (r0 == 0) goto L_0x0030
            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = r12.f7022o
            com.bytedance.sdk.openadsdk.core.w r0 = r0.mo19117e()
            boolean r0 = r0.mo20458e()
            if (r0 == 0) goto L_0x0030
            goto L_0x0031
        L_0x006f:
            if (r1 != r2) goto L_0x0072
            r3 = r0
        L_0x0072:
            if (r3 == 0) goto L_0x0079
            r0 = 10000(0x2710, float:1.4013E-41)
            r12.mo18519f(r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.mo18467z():void");
    }
}
