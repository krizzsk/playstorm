package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.component.reward.p144b.C3329c;
import com.bytedance.sdk.openadsdk.component.reward.top.C3379b;
import com.bytedance.sdk.openadsdk.core.C3423b;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3639p;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.p151e.C3485l;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p130b.p132b.p133a.C3133a;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3150o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class TTFullScreenVideoActivity extends TTBaseVideoActivity {

    /* renamed from: S */
    private static TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f7078S;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f7079R;

    /* renamed from: T */
    private boolean f7080T;

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo18416H() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m8781b(bundle)) {
            mo18460s();
            mo18461t();
            mo18433d();
            mo18419a();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        f7078S = this.f7079R;
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m8783c(final String str) {
        C2952e.m8317c(new C2955g("FullScreen_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.mo18418a(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.f7011d, str);
                } catch (Throwable th) {
                    C2975l.m8388c("TTFullScreenVideoActivity", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18420a(Intent intent) {
        super.mo18420a(intent);
        if (intent != null) {
            this.f6979F = intent.getBooleanExtra("is_verity_playable", false);
        }
    }

    /* renamed from: b */
    private boolean m8781b(Bundle bundle) {
        String stringExtra;
        if (C3953b.m12901c()) {
            Intent intent = getIntent();
            if (!(intent == null || (stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA)) == null)) {
                try {
                    this.f7010c = C3423b.m10208a(new JSONObject(stringExtra));
                } catch (Exception e) {
                    C2975l.m8388c("TTFullScreenVideoActivity", "initData MultiGlobalInfo throws ", e);
                }
            }
        } else {
            this.f7010c = C3645t.m11590a().mo20225c();
            this.f7079R = C3645t.m11590a().mo20227e();
        }
        if (!C3953b.m12901c()) {
            C3645t.m11590a().mo20230h();
        }
        if (bundle != null) {
            if (this.f7079R == null) {
                this.f7079R = f7078S;
                f7078S = null;
            }
            try {
                this.f7010c = C3423b.m10208a(new JSONObject(bundle.getString("material_meta")));
                this.f7030w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.f7030w.get()) {
                    this.f7018k.mo19037d(true);
                    m8776M();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f7010c == null) {
            C2975l.m8391e("TTFullScreenVideoActivity", "mMaterialMeta is null , no data to display ,the TTFullScreenVideoActivity finished !!");
            finish();
            return false;
        }
        this.f7021n.mo18996a(this.f7010c, this.f7000a);
        this.f7021n.mo18994a();
        this.f7010c.mo19628a(this.f7010c.mo19708g(), 8);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo18415G() {
        View k = this.f7016i.mo19328k();
        if (k != null) {
            k.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTFullScreenVideoActivity.this.f7022o.mo19130r();
                    TTFullScreenVideoActivity.this.mo18459r();
                    TTFullScreenVideoActivity.this.finish();
                }
            });
        }
        this.f7018k.mo19026a((C3379b) new C3379b() {
            /* renamed from: a */
            public void mo18524a(View view) {
                if (C3501p.m10769i(TTFullScreenVideoActivity.this.f7010c) || (C3485l.m10537a(TTFullScreenVideoActivity.this.f7010c) && !TTFullScreenVideoActivity.this.f7014g.get())) {
                    if (C3953b.m12901c()) {
                        TTFullScreenVideoActivity.this.m8783c("onSkippedVideo");
                    } else if (TTFullScreenVideoActivity.this.f7079R != null) {
                        TTFullScreenVideoActivity.this.f7079R.onSkippedVideo();
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                C3150o.C3151a aVar = new C3150o.C3151a();
                aVar.mo18721a(TTFullScreenVideoActivity.this.f7020m.mo19088s());
                aVar.mo18728c(TTFullScreenVideoActivity.this.f7020m.mo19090u());
                aVar.mo18725b(TTFullScreenVideoActivity.this.f7020m.mo19079j());
                aVar.mo18732e(3);
                aVar.mo18734f(TTFullScreenVideoActivity.this.f7020m.mo19087r());
                C3133a.m9043a(TTFullScreenVideoActivity.this.f7020m.mo19071c(), aVar, TTFullScreenVideoActivity.this.f7020m.mo19055a());
                C3639p.m11565c(TTFullScreenVideoActivity.this.f7027t);
                TTFullScreenVideoActivity.this.f7020m.mo19062a("skip", (Map<String, Object>) null);
                TTFullScreenVideoActivity.this.f7018k.mo19037d(false);
                if (C3953b.m12901c()) {
                    TTFullScreenVideoActivity.this.m8783c("onSkippedVideo");
                } else if (TTFullScreenVideoActivity.this.f7079R != null) {
                    TTFullScreenVideoActivity.this.f7079R.onSkippedVideo();
                }
                if (TTFullScreenVideoActivity.this.mo18439h()) {
                    TTFullScreenVideoActivity.this.mo18423a(true);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                if (TTFullScreenVideoActivity.this.f7010c != null && TTFullScreenVideoActivity.this.f7010c.mo19680ax() != null && TTFullScreenVideoActivity.this.f7020m != null) {
                    TTFullScreenVideoActivity.this.f7010c.mo19680ax().mo19977a().mo20054f(TTFullScreenVideoActivity.this.f7020m.mo19088s());
                    TTFullScreenVideoActivity.this.f7010c.mo19680ax().mo19977a().mo20052e(TTFullScreenVideoActivity.this.f7020m.mo19088s());
                }
            }

            /* renamed from: b */
            public void mo18525b(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f7025r = !tTFullScreenVideoActivity.f7025r;
                if (!(TTFullScreenVideoActivity.this.f6985L == null || TTFullScreenVideoActivity.this.f6985L.mo19168a() == null)) {
                    TTFullScreenVideoActivity.this.f6985L.mo19168a().mo19177a(TTFullScreenVideoActivity.this.f7025r);
                }
                TTFullScreenVideoActivity.this.f7020m.mo19069b(TTFullScreenVideoActivity.this.f7025r);
                if (!C3501p.m10770j(TTFullScreenVideoActivity.this.f7010c) || TTFullScreenVideoActivity.this.f7029v.get()) {
                    if (C3501p.m10761a(TTFullScreenVideoActivity.this.f7010c)) {
                        TTFullScreenVideoActivity.this.f6978E.mo20621a(TTFullScreenVideoActivity.this.f7025r, true);
                    }
                    TTFullScreenVideoActivity.this.f7022o.mo19116d(TTFullScreenVideoActivity.this.f7025r);
                    if (TTFullScreenVideoActivity.this.f7010c != null && TTFullScreenVideoActivity.this.f7010c.mo19680ax() != null && TTFullScreenVideoActivity.this.f7010c.mo19680ax().mo19977a() != null && TTFullScreenVideoActivity.this.f7020m != null) {
                        if (TTFullScreenVideoActivity.this.f7025r) {
                            TTFullScreenVideoActivity.this.f7010c.mo19680ax().mo19977a().mo20058h(TTFullScreenVideoActivity.this.f7020m.mo19088s());
                        } else {
                            TTFullScreenVideoActivity.this.f7010c.mo19680ax().mo19977a().mo20060i(TTFullScreenVideoActivity.this.f7020m.mo19088s());
                        }
                    }
                }
            }

            /* renamed from: c */
            public void mo18526c(View view) {
                TTFullScreenVideoActivity.this.mo18414F();
            }
        });
    }

    /* renamed from: a */
    public boolean mo18514a(long j, boolean z) {
        C3167j jVar = new C3167j();
        jVar.mo18770a(System.currentTimeMillis(), 1.0f);
        if (this.f6985L == null || !(this.f6985L instanceof C3329c)) {
            this.f7020m.mo19058a(this.f7016i.mo19325h(), this.f7010c, this.f7000a, mo18416H(), jVar);
        } else {
            this.f7020m.mo19058a(((C3329c) this.f6985L).mo19185d(), this.f7010c, this.f7000a, mo18416H(), jVar);
        }
        HashMap hashMap = null;
        if (!TextUtils.isEmpty(this.f6977D)) {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.f6977D);
        }
        this.f7020m.mo19063a((Map<String, Object>) hashMap);
        C30664 r1 = new C2526c.C2527a() {
            /* renamed from: a */
            public void mo16463a(long j, int i) {
                TTFullScreenVideoActivity.this.f7024q.removeMessages(300);
                TTFullScreenVideoActivity.this.mo18412D();
                TTFullScreenVideoActivity.this.mo18517L();
                if (C3485l.m10539b(TTFullScreenVideoActivity.this.f7010c)) {
                    TTFullScreenVideoActivity.this.mo18444m();
                    TTFullScreenVideoActivity.this.f6987N.set(true);
                } else if (TTFullScreenVideoActivity.this.mo18439h()) {
                    TTFullScreenVideoActivity.this.mo18423a(false);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            /* renamed from: b */
            public void mo16465b(long j, int i) {
                TTFullScreenVideoActivity.this.f7024q.removeMessages(300);
                TTFullScreenVideoActivity.this.mo18411C();
                if (!TTFullScreenVideoActivity.this.f7020m.mo19070b()) {
                    TTFullScreenVideoActivity.this.mo18412D();
                    TTFullScreenVideoActivity.this.f7020m.mo19082m();
                    C2975l.m8391e("TTFullScreenVideoActivity", "onError、、、、、、、、");
                    if (TTFullScreenVideoActivity.this.mo18439h()) {
                        TTFullScreenVideoActivity.this.mo18424a(false, true);
                        TTFullScreenVideoActivity.this.f7020m.mo19056a(TTFullScreenVideoActivity.this.f7020m.mo19051B() ^ true ? 1 : 0, 2);
                        return;
                    }
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            /* renamed from: a */
            public void mo16462a() {
                TTFullScreenVideoActivity.this.f7024q.removeMessages(300);
                TTFullScreenVideoActivity.this.mo18412D();
                C2975l.m8384b("TTFullScreenVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenVideoActivity.this.mo18439h()) {
                    TTFullScreenVideoActivity.this.mo18424a(false, true);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                TTFullScreenVideoActivity.this.f7020m.mo19056a(TTFullScreenVideoActivity.this.f7020m.mo19051B() ^ true ? 1 : 0, true ^ TTFullScreenVideoActivity.this.f7020m.mo19051B() ? 1 : 0);
                TTFullScreenVideoActivity.this.f7020m.mo19082m();
            }

            /* renamed from: a */
            public void mo16464a(long j, long j2) {
                if (!TTFullScreenVideoActivity.this.f6981H && TTFullScreenVideoActivity.this.f7020m.mo19070b()) {
                    TTFullScreenVideoActivity.this.f7020m.mo19084o();
                }
                if (!TTFullScreenVideoActivity.this.f7029v.get()) {
                    TTFullScreenVideoActivity.this.f7024q.removeMessages(300);
                    if (j != TTFullScreenVideoActivity.this.f7020m.mo19075f()) {
                        TTFullScreenVideoActivity.this.mo18412D();
                    }
                    TTFullScreenVideoActivity.this.f7020m.mo19057a(j);
                    TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                    long j3 = j / 1000;
                    tTFullScreenVideoActivity.f7026s = (int) (tTFullScreenVideoActivity.f7020m.mo19052C() - ((double) j3));
                    int i = (int) j3;
                    if ((TTFullScreenVideoActivity.this.f6974A.get() || TTFullScreenVideoActivity.this.f7032y.get()) && TTFullScreenVideoActivity.this.f7020m.mo19070b()) {
                        TTFullScreenVideoActivity.this.f7020m.mo19084o();
                    }
                    TTFullScreenVideoActivity.this.mo18518e(i);
                    if (TTFullScreenVideoActivity.this.f7026s >= 0) {
                        TTFullScreenVideoActivity.this.f7018k.mo19027a(String.valueOf(TTFullScreenVideoActivity.this.f7026s), (CharSequence) null);
                    }
                    if (TTFullScreenVideoActivity.this.f7026s <= 0) {
                        TTFullScreenVideoActivity.this.f6987N.set(true);
                        C2975l.m8384b("TTFullScreenVideoActivity", "onProgressUpdate、、、、、、、、");
                        if (TTFullScreenVideoActivity.this.mo18439h()) {
                            TTFullScreenVideoActivity.this.mo18423a(false);
                        } else {
                            TTFullScreenVideoActivity.this.finish();
                        }
                    }
                }
            }
        };
        this.f7020m.mo19059a((C2526c.C2527a) r1);
        if (this.f7016i.f8170x != null) {
            this.f7016i.f8170x.mo19573a((C2526c.C2527a) r1);
        }
        return mo18426a(j, z, (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo18518e(int i) {
        int e = C3578m.m11241h().mo19937e(this.f7027t);
        if (e < 0) {
            e = 5;
        }
        if (C3578m.m11241h().mo19933c(String.valueOf(this.f7027t)) && (C3498n.m10583c(this.f7010c) || mo18439h())) {
            if (!this.f7030w.getAndSet(true)) {
                this.f7018k.mo19037d(true);
            }
            if (i <= e) {
                m8784g(e - i);
                this.f7018k.mo19038e(false);
                return;
            }
            m8776M();
        } else if (i >= e) {
            if (!this.f7030w.getAndSet(true)) {
                this.f7018k.mo19037d(true);
            }
            m8776M();
        }
    }

    /* renamed from: M */
    private void m8776M() {
        if (C3498n.m10583c(this.f7010c) || mo18439h()) {
            this.f7018k.mo19027a((String) null, (CharSequence) C3537f.f8808c);
        } else {
            this.f7018k.mo19027a((String) null, (CharSequence) "X");
        }
        this.f7018k.mo19038e(true);
    }

    /* renamed from: g */
    private void m8784g(int i) {
        this.f7018k.mo19027a((String) null, (CharSequence) new SpannableStringBuilder(String.format(C2984t.m8425a(C3578m.m11231a(), "tt_skip_ad_time_text"), new Object[]{Integer.valueOf(i)})));
    }

    public void onRewardBarClick(View view) {
        if (!(this.f7010c == null || this.f7010c.mo19670an() == 100.0f)) {
            this.f7080T = true;
        }
        if (C3953b.m12901c()) {
            m8783c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f7079R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* renamed from: J */
    public void mo18515J() {
        if (C3953b.m12901c()) {
            m8783c("onAdShow");
        } else {
            TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f7079R;
            if (fullScreenVideoAdInteractionListener != null) {
                fullScreenVideoAdInteractionListener.onAdShow();
            }
        }
        if (mo18417I()) {
            this.f7019l.mo19301j();
        }
    }

    /* renamed from: K */
    public void mo18516K() {
        if (C3953b.m12901c()) {
            m8783c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f7079R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* renamed from: f */
    public void mo18519f(int i) {
        if (i == 10002) {
            mo18517L();
        }
    }

    public void finish() {
        this.f7023p.mo19011b(this.f6979F);
        try {
            m8777N();
        } catch (Exception unused) {
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m8777N();
        if (C3953b.m12901c()) {
            m8783c("recycleRes");
        }
        this.f7079R = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        f7078S = null;
    }

    /* renamed from: N */
    private void m8777N() {
        if (!this.f6980G) {
            this.f6980G = true;
            if (C3953b.m12901c()) {
                m8783c("onAdClose");
                return;
            }
            TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f7079R;
            if (fullScreenVideoAdInteractionListener != null) {
                fullScreenVideoAdInteractionListener.onAdClose();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo18517L() {
        if (C3953b.m12901c()) {
            m8783c("onVideoComplete");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f7079R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onVideoComplete();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (m8782b(this.f7010c) && !m8780a(this.f7010c)) {
            if (this.f7080T) {
                this.f7080T = false;
                finish();
            } else if (this.f7022o.mo19136x()) {
                finish();
            }
        }
    }

    /* renamed from: a */
    private boolean m8780a(C3498n nVar) {
        return nVar == null || nVar.mo19670an() == 100.0f;
    }

    /* renamed from: b */
    private boolean m8782b(C3498n nVar) {
        if (nVar == null) {
            return false;
        }
        return C3578m.m11241h().mo19945g(this.f7027t);
    }
}
