package com.bytedance.sdk.openadsdk.component.reward.p143a;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.a */
/* compiled from: RewardFullDownloadManager */
public class C3285a {

    /* renamed from: a */
    C4026c f7787a;

    /* renamed from: b */
    private Activity f7788b;

    /* renamed from: c */
    private C3498n f7789c;

    /* renamed from: d */
    private String f7790d;

    /* renamed from: e */
    private boolean f7791e = false;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.a$a */
    /* compiled from: RewardFullDownloadManager */
    public interface C3286a {
        /* renamed from: a */
        void mo18481a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, int i, int i2, int i3);

        /* renamed from: a */
        void mo18482a(String str, JSONObject jSONObject);
    }

    public C3285a(Activity activity) {
        this.f7788b = activity;
    }

    /* renamed from: a */
    public void mo18996a(C3498n nVar, String str) {
        if (!this.f7791e) {
            this.f7791e = true;
            this.f7789c = nVar;
            this.f7790d = str;
            m9611d();
        }
    }

    /* renamed from: d */
    private void m9611d() {
        if (C3953b.m12901c()) {
            C3498n nVar = this.f7789c;
            if (nVar != null && nVar.mo19609L() == 4) {
                this.f7787a = C4027d.m13342a(this.f7788b, this.f7789c, this.f7790d);
                return;
            }
            return;
        }
        this.f7787a = C3645t.m11590a().mo20229g();
    }

    /* renamed from: a */
    public void mo18994a() {
        C3498n nVar;
        if (this.f7787a == null && (nVar = this.f7789c) != null) {
            this.f7787a = C4027d.m13342a(this.f7788b, nVar, this.f7790d);
        }
    }

    /* renamed from: b */
    public void mo18997b() {
        C4026c cVar = this.f7787a;
        if (cVar != null) {
            cVar.mo20934d();
        }
    }

    /* renamed from: c */
    public C4026c mo18998c() {
        return this.f7787a;
    }

    /* renamed from: a */
    public void mo18995a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, int i, int i2, int i3, C3286a aVar) {
        C3286a aVar2 = aVar;
        if (this.f7787a == null) {
            aVar.mo18481a(view, f, f2, f3, f4, sparseArray, i, i2, i3);
        } else if (view.getId() == C2984t.m8432e(this.f7788b, "tt_rb_score")) {
            aVar2.mo18482a("click_play_star_level", (JSONObject) null);
        } else if (view.getId() == C2984t.m8432e(this.f7788b, "tt_comment_vertical")) {
            aVar2.mo18482a("click_play_star_nums", (JSONObject) null);
        } else if (view.getId() == C2984t.m8432e(this.f7788b, "tt_reward_ad_appname")) {
            aVar2.mo18482a("click_play_source", (JSONObject) null);
        } else if (view.getId() == C2984t.m8432e(this.f7788b, "tt_reward_ad_icon")) {
            aVar2.mo18482a("click_play_logo", (JSONObject) null);
        }
    }
}
