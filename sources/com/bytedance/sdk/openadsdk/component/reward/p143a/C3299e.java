package com.bytedance.sdk.openadsdk.component.reward.p143a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p068vk.openvk.component.video.api.C2515a;
import com.bykv.p068vk.openvk.component.video.api.p084b.C2519a;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.C3331c;
import com.bytedance.sdk.openadsdk.component.reward.C3332d;
import com.bytedance.sdk.openadsdk.component.reward.C3356h;
import com.bytedance.sdk.openadsdk.component.reward.C3357i;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3485l;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.p164c.C3670a;
import com.bytedance.sdk.openadsdk.core.video.p164c.C3685b;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p130b.p132b.p133a.C3133a;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3150o;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.e */
/* compiled from: RewardFullVideoPlayerManager */
public class C3299e {

    /* renamed from: a */
    long f7839a;

    /* renamed from: b */
    protected boolean f7840b = false;

    /* renamed from: c */
    boolean f7841c = false;

    /* renamed from: d */
    String f7842d;

    /* renamed from: e */
    boolean f7843e;

    /* renamed from: f */
    protected boolean f7844f = false;

    /* renamed from: g */
    C2526c f7845g;

    /* renamed from: h */
    long f7846h;

    /* renamed from: i */
    private Activity f7847i;

    /* renamed from: j */
    private C3498n f7848j;

    /* renamed from: k */
    private FrameLayout f7849k;

    /* renamed from: l */
    private String f7850l;

    /* renamed from: m */
    private boolean f7851m = false;

    /* renamed from: n */
    private C3167j f7852n;

    /* renamed from: a */
    public C3167j mo19055a() {
        return this.f7852n;
    }

    public C3299e(Activity activity) {
        this.f7847i = activity;
    }

    /* renamed from: a */
    public void mo19058a(FrameLayout frameLayout, C3498n nVar, String str, boolean z, C3167j jVar) {
        if (!this.f7851m) {
            this.f7851m = true;
            this.f7848j = nVar;
            this.f7849k = frameLayout;
            this.f7850l = str;
            this.f7843e = z;
            this.f7852n = jVar;
            if (z) {
                this.f7845g = new C3356h(this.f7847i, this.f7849k, this.f7848j, jVar);
            } else {
                this.f7845g = new C3331c(this.f7847i, this.f7849k, this.f7848j, jVar);
            }
        }
    }

    /* renamed from: b */
    public boolean mo19070b() {
        C2526c cVar = this.f7845g;
        return (cVar == null || cVar.mo16456n() == null || !this.f7845g.mo16456n().mo16292l()) ? false : true;
    }

    /* renamed from: c */
    public C2519a mo19071c() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            return cVar.mo16457o();
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo19073d() {
        C2526c cVar = this.f7845g;
        return (cVar == null || cVar.mo16456n() == null || !this.f7845g.mo16456n().mo16293m()) ? false : true;
    }

    /* renamed from: e */
    public boolean mo19074e() {
        C2526c cVar = this.f7845g;
        return cVar != null && cVar.mo16460r();
    }

    /* renamed from: a */
    public void mo19057a(long j) {
        this.f7846h = j;
    }

    /* renamed from: f */
    public long mo19075f() {
        return this.f7846h;
    }

    /* renamed from: g */
    public boolean mo19076g() {
        return this.f7840b;
    }

    /* renamed from: h */
    public long mo19077h() {
        return this.f7839a;
    }

    /* renamed from: b */
    public void mo19068b(long j) {
        this.f7839a = j;
    }

    /* renamed from: a */
    public void mo19064a(boolean z) {
        this.f7840b = z;
    }

    /* renamed from: i */
    public void mo19078i() {
        try {
            if (mo19070b()) {
                this.f7845g.mo16437b();
            }
        } catch (Throwable th) {
            C2975l.m8383b("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo19056a(int i, int i2) {
        if (this.f7845g != null) {
            C3150o.C3151a aVar = new C3150o.C3151a();
            aVar.mo18725b(mo19079j());
            aVar.mo18728c(mo19090u());
            aVar.mo18721a(mo19088s());
            aVar.mo18727c(i);
            aVar.mo18730d(i2);
            C3133a.m9059d(this.f7845g.mo16457o(), aVar);
        }
    }

    /* renamed from: j */
    public long mo19079j() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            return cVar.mo16450h();
        }
        return 0;
    }

    /* renamed from: F */
    private void m9688F() {
        C2526c cVar = this.f7845g;
        if (cVar != null && cVar.mo16456n() != null) {
            this.f7839a = this.f7845g.mo16449g();
            if (this.f7845g.mo16456n().mo16289i() || !this.f7845g.mo16456n().mo16288h()) {
                this.f7845g.mo16437b();
                this.f7845g.mo16446e();
                this.f7840b = true;
            }
        }
    }

    /* renamed from: k */
    public void mo19080k() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            cVar.mo16446e();
            this.f7845g = null;
        }
    }

    /* renamed from: l */
    public void mo19081l() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            cVar.mo16441c();
            this.f7845g.mo16448f();
        }
    }

    /* renamed from: m */
    public void mo19082m() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            cVar.mo16448f();
        }
    }

    /* renamed from: n */
    public void mo19083n() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            cVar.mo16444d();
        }
    }

    /* renamed from: o */
    public void mo19084o() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            cVar.mo16437b();
        }
    }

    /* renamed from: a */
    public void mo19063a(Map<String, Object> map) {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            cVar.mo16433a(map);
        }
    }

    /* renamed from: a */
    public void mo19059a(C2526c.C2527a aVar) {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            cVar.mo16430a(aVar);
        }
    }

    /* renamed from: b */
    public void mo19069b(boolean z) {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            cVar.mo16440b(z);
        }
    }

    /* renamed from: p */
    public long mo19085p() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            return cVar.mo16452j();
        }
        return 0;
    }

    /* renamed from: q */
    public int mo19086q() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            return cVar.mo16454l();
        }
        return 0;
    }

    /* renamed from: r */
    public int mo19087r() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            return cVar.mo16451i();
        }
        return 0;
    }

    /* renamed from: s */
    public long mo19088s() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            return cVar.mo16449g();
        }
        return this.f7839a;
    }

    /* renamed from: t */
    public void mo19089t() {
        C2526c cVar = this.f7845g;
        if (cVar != null && cVar.mo16456n() != null) {
            this.f7845g.mo16456n().mo16283c();
        }
    }

    /* renamed from: u */
    public long mo19090u() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            return cVar.mo16452j() + this.f7845g.mo16450h();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo19062a(String str, Map<String, Object> map) {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            Map<String, Object> a = C4014u.m13186a(this.f7848j, cVar.mo16450h(), this.f7845g.mo16456n());
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    a.put(next.getKey(), next.getValue());
                }
            }
            C3156e.m9170a((Context) this.f7847i, this.f7848j, this.f7850l, str, mo19090u(), mo19086q(), a, this.f7852n);
            C2975l.m8384b("TTBaseVideoActivity", "event tag:" + this.f7850l + ", TotalPlayDuration=" + mo19090u() + ",mBasevideoController.getPct()=" + mo19086q());
        }
    }

    /* renamed from: v */
    public long mo19091v() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            return cVar.mo16452j();
        }
        return 0;
    }

    /* renamed from: w */
    public boolean mo19092w() {
        C2526c cVar = this.f7845g;
        if (cVar != null) {
            if (cVar.mo16456n() != null) {
                C2515a n = this.f7845g.mo16456n();
                if (n.mo16293m() || n.mo16294n()) {
                    ((C3670a) this.f7845g).mo20270I();
                    return true;
                }
            } else if (mo19076g()) {
                mo19064a(false);
                ((C3670a) this.f7845g).mo20270I();
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public boolean mo19093x() {
        return this.f7845g != null;
    }

    /* renamed from: y */
    public boolean mo19094y() {
        C2526c cVar = this.f7845g;
        return cVar != null && cVar.mo16456n() == null;
    }

    /* renamed from: a */
    public boolean mo19067a(long j, boolean z) {
        C2975l.m8384b("TTBaseVideoActivity", "playVideo start");
        if (this.f7845g == null || this.f7848j.mo19607J() == null) {
            C2975l.m8384b("TTBaseVideoActivity", "playVideo controller is Empty");
            return false;
        }
        File file = new File(CacheDirFactory.getICacheDir(this.f7848j.mo19650aD()).mo16072b(), this.f7848j.mo19607J().mo16364l());
        if (file.exists() && file.length() > 0) {
            this.f7841c = true;
        }
        C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(this.f7848j.mo19650aD()).mo16072b(), this.f7848j);
        a.mo16382b(this.f7848j.mo19622Y());
        a.mo16374a(this.f7849k.getWidth());
        a.mo16381b(this.f7849k.getHeight());
        a.mo16385c(this.f7848j.mo19659ac());
        a.mo16375a(j);
        a.mo16379a(z);
        return this.f7845g.mo16436a(a);
    }

    /* renamed from: a */
    public void mo19061a(String str) {
        this.f7842d = str;
    }

    /* renamed from: z */
    public String mo19095z() {
        return this.f7842d;
    }

    /* renamed from: c */
    public void mo19072c(boolean z) {
        mo19080k();
        if (!TextUtils.isEmpty(this.f7842d)) {
            return;
        }
        if (z) {
            C3357i.m9973a(C3578m.m11231a()).mo19217a();
        } else {
            C3332d.m9916a(C3578m.m11231a()).mo19191b();
        }
    }

    /* renamed from: A */
    public void mo19050A() {
        try {
            if (mo19070b()) {
                this.f7844f = true;
                mo19084o();
            }
        } catch (Throwable th) {
            C2975l.m8391e("TTBaseVideoActivity", "onPause throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo19065a(boolean z, C3685b bVar) {
        try {
            this.f7844f = false;
            if (mo19076g()) {
                m9688F();
                mo19060a(bVar);
            } else if (mo19073d()) {
                mo19083n();
            }
        } catch (Throwable th) {
            C2975l.m8391e("TTBaseVideoActivity", "onContinue throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo19066a(boolean z, C3685b bVar, boolean z2) {
        if (z2 && !z && !this.f7844f) {
            if (mo19073d()) {
                mo19083n();
                Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: continue play");
                return;
            }
            m9688F();
            mo19060a(bVar);
            Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }

    /* renamed from: B */
    public boolean mo19051B() {
        C2526c cVar = this.f7845g;
        if (cVar == null || cVar.mo16456n() == null) {
            return false;
        }
        return this.f7845g.mo16456n().mo16285e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19060a(C3685b bVar) {
        if (mo19092w() && bVar != null) {
            bVar.mo18514a(mo19077h(), true);
        }
    }

    /* renamed from: C */
    public double mo19052C() {
        if (C3485l.m10541c(this.f7848j)) {
            return (double) this.f7848j.mo19624a().mo19592b();
        }
        C3498n nVar = this.f7848j;
        if (nVar == null || nVar.mo19607J() == null) {
            return 0.0d;
        }
        return this.f7848j.mo19607J().mo16353f();
    }

    /* renamed from: D */
    public void mo19053D() {
        C2526c cVar = this.f7845g;
        if (cVar instanceof C3670a) {
            ((C3670a) cVar).mo20269H();
        }
    }

    /* renamed from: E */
    public View mo19054E() {
        C2526c cVar = this.f7845g;
        if (cVar instanceof C3670a) {
            return (View) ((C3670a) cVar).mo20271J();
        }
        return null;
    }
}
