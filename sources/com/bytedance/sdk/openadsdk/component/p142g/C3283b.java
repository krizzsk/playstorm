package com.bytedance.sdk.openadsdk.component.p142g;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.component.p141f.C3281a;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3150o;
import com.bytedance.sdk.openadsdk.utils.C4014u;

/* renamed from: com.bytedance.sdk.openadsdk.component.g.b */
/* compiled from: TTAppOpenVideoManager */
public class C3283b {

    /* renamed from: a */
    private Context f7782a;

    /* renamed from: b */
    private FrameLayout f7783b;

    /* renamed from: c */
    private C3498n f7784c;

    /* renamed from: d */
    private C3282a f7785d;

    public C3283b(Context context) {
        this.f7782a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo18982a(FrameLayout frameLayout, C3498n nVar) {
        this.f7783b = frameLayout;
        this.f7784c = nVar;
        this.f7785d = new C3282a(this.f7782a, this.f7783b, this.f7784c);
    }

    /* renamed from: a */
    public boolean mo18984a() {
        String str;
        int f = C4014u.m13223f(this.f7784c);
        if (Build.VERSION.SDK_INT >= 23) {
            str = C3281a.m9586a(C3578m.m11231a(), f);
        } else {
            try {
                str = C3281a.m9585a();
            } catch (Throwable unused) {
                str = "";
            }
        }
        C2522c a = C3498n.m10578a(str, this.f7784c);
        a.mo16382b(this.f7784c.mo19622Y());
        a.mo16374a(this.f7783b.getWidth());
        a.mo16381b(this.f7783b.getHeight());
        a.mo16385c(this.f7784c.mo19659ac());
        a.mo16375a(0);
        a.mo16379a(true);
        return this.f7785d.mo16436a(a);
    }

    /* renamed from: b */
    public boolean mo18985b() {
        C3282a aVar = this.f7785d;
        return (aVar == null || aVar.mo16456n() == null || !this.f7785d.mo16456n().mo16292l()) ? false : true;
    }

    /* renamed from: c */
    public boolean mo18986c() {
        C3282a aVar = this.f7785d;
        return (aVar == null || aVar.mo16456n() == null || !this.f7785d.mo16456n().mo16293m()) ? false : true;
    }

    /* renamed from: a */
    public void mo18983a(C2526c.C2527a aVar) {
        C3282a aVar2 = this.f7785d;
        if (aVar2 != null) {
            aVar2.mo16430a(aVar);
        }
    }

    /* renamed from: d */
    public void mo18987d() {
        try {
            if (mo18985b()) {
                this.f7785d.mo16437b();
            }
        } catch (Throwable th) {
            C2975l.m8383b("AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    /* renamed from: e */
    public void mo18988e() {
        C3282a aVar = this.f7785d;
        if (aVar != null) {
            aVar.mo16444d();
        }
    }

    /* renamed from: f */
    public void mo18989f() {
        C3282a aVar = this.f7785d;
        if (aVar != null) {
            this.f7782a = null;
            aVar.mo16446e();
            this.f7785d = null;
        }
    }

    /* renamed from: g */
    public long mo18990g() {
        C3282a aVar = this.f7785d;
        if (aVar != null) {
            return aVar.mo16449g();
        }
        return 0;
    }

    /* renamed from: h */
    public long mo18991h() {
        C3282a aVar = this.f7785d;
        if (aVar != null) {
            return aVar.mo16450h();
        }
        return 0;
    }

    /* renamed from: i */
    public long mo18992i() {
        C3282a aVar = this.f7785d;
        if (aVar != null) {
            return aVar.mo16452j() + this.f7785d.mo16450h();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo18981a(int i) {
        if (this.f7785d != null) {
            C3150o.C3151a aVar = new C3150o.C3151a();
            aVar.mo18721a(mo18990g());
            aVar.mo18728c(mo18992i());
            aVar.mo18725b(mo18991h());
            aVar.mo18732e(i);
            aVar.mo18734f(this.f7785d.mo16451i());
            this.f7785d.mo18973a(aVar);
        }
    }
}
