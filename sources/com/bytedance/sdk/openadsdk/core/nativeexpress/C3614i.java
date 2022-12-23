package com.bytedance.sdk.openadsdk.core.nativeexpress;

import com.bytedance.sdk.component.adexpress.p095b.C2628h;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3185u;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.i */
/* compiled from: ExpressRenderEventMonitor */
public class C3614i implements C2628h {

    /* renamed from: a */
    private C3185u f9155a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f9156b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3498n f9157c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f9158d;

    /* renamed from: e */
    private long f9159e;

    /* renamed from: f */
    private long f9160f;

    public C3614i(C3185u uVar, String str, C3498n nVar, String str2) {
        this.f9155a = uVar;
        this.f9156b = str;
        this.f9158d = str2;
        this.f9157c = nVar;
    }

    /* renamed from: a */
    public void mo16723a() {
        this.f9155a.mo18807a();
        C2975l.m8384b("ExpressRenderEvent", "start render ");
    }

    /* renamed from: a */
    public void mo16726a(boolean z) {
        this.f9155a.mo18815b(z ? 1 : 0);
        C2975l.m8384b("ExpressRenderEvent", "webview start request");
    }

    /* renamed from: b */
    public void mo16727b() {
        C2975l.m8384b("ExpressRenderEvent", "WebView start load");
    }

    /* renamed from: c */
    public void mo16729c() {
        C2975l.m8384b("ExpressRenderEvent", "webview render success");
        this.f9155a.mo18814b();
    }

    /* renamed from: a */
    public void mo16724a(int i) {
        this.f9155a.mo18808a(i);
        C3613h.m11430a(i, this.f9156b, this.f9158d, this.f9157c);
        C2975l.m8384b("ExpressRenderEvent", "WebView render fail");
    }

    /* renamed from: b */
    public void mo16728b(int i) {
        C2975l.m8384b("ExpressRenderEvent", "dynamic start render");
        this.f9159e = System.currentTimeMillis();
        if (i == 3) {
            this.f9155a.mo18821c("dynamic_render2_start");
        } else {
            this.f9155a.mo18821c("dynamic_render_start");
        }
    }

    /* renamed from: c */
    public void mo16730c(int i) {
        if (i == 3) {
            this.f9155a.mo18823d("dynamic_sub_analysis2_start");
        } else {
            this.f9155a.mo18823d("dynamic_sub_analysis_start");
        }
    }

    /* renamed from: d */
    public void mo16732d(int i) {
        if (i == 3) {
            this.f9155a.mo18823d("dynamic_sub_analysis2_end");
        } else {
            this.f9155a.mo18823d("dynamic_sub_analysis_end");
        }
    }

    /* renamed from: e */
    public void mo16734e(int i) {
        if (i == 3) {
            this.f9155a.mo18823d("dynamic_sub_render2_start");
        } else {
            this.f9155a.mo18823d("dynamic_sub_render_start");
        }
    }

    /* renamed from: f */
    public void mo16736f(int i) {
        if (i == 3) {
            this.f9155a.mo18823d("dynamic_sub_render2_end");
        } else {
            this.f9155a.mo18823d("dynamic_sub_render_end");
        }
    }

    /* renamed from: g */
    public void mo16738g(int i) {
        final String str;
        this.f9160f = System.currentTimeMillis();
        C2975l.m8384b("ExpressRenderEvent", "dynamic render success render type: " + i + "; ****cost time(ms): " + (this.f9160f - this.f9159e) + "****");
        if (i == 3) {
            this.f9155a.mo18825e("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.f9155a.mo18825e("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.f9155a.mo18813a(true);
        C2952e.m8313b((C2955g) new C2955g("dynamic_success") {
            public void run() {
                C3156e.m9198c(C3578m.m11231a(), C3614i.this.f9157c, C3614i.this.f9156b, str, (Map<String, Object>) null);
            }
        });
    }

    /* renamed from: a */
    public void mo16725a(int i, int i2, boolean z) {
        C2975l.m8384b("ExpressRenderEvent", "dynamic fail");
        if (!z) {
            this.f9155a.mo18813a(true);
        }
        if (i == 3) {
            this.f9155a.mo18816b(i2, "dynamic_render2_error");
        } else {
            this.f9155a.mo18816b(i2, "dynamic_render_error");
        }
        C3613h.m11430a(i2, this.f9156b, this.f9158d, this.f9157c);
    }

    /* renamed from: d */
    public void mo16731d() {
        C2975l.m8384b("ExpressRenderEvent", "native render start");
        this.f9155a.mo18820c();
    }

    /* renamed from: e */
    public void mo16733e() {
        C2975l.m8384b("ExpressRenderEvent", "native success");
        this.f9155a.mo18813a(true);
        this.f9155a.mo18834n();
        C2952e.m8313b((C2955g) new C2955g("native_success") {
            public void run() {
                C3613h.m11431a(C3614i.this.f9156b, C3614i.this.f9158d, C3614i.this.f9157c);
                C3156e.m9198c(C3578m.m11231a(), C3614i.this.f9157c, C3614i.this.f9156b, "dynamic_backup_render", (Map<String, Object>) null);
            }
        });
    }

    /* renamed from: f */
    public void mo16735f() {
        C2975l.m8384b("ExpressRenderEvent", "no native render");
        this.f9155a.mo18835o();
    }

    /* renamed from: g */
    public void mo16737g() {
        C2975l.m8384b("ExpressRenderEvent", "render fail");
        this.f9155a.mo18836p();
    }

    /* renamed from: h */
    public void mo16739h() {
        C2975l.m8384b("ExpressRenderEvent", "render success");
        this.f9155a.mo18814b();
    }

    /* renamed from: i */
    public void mo20184i() {
        this.f9155a.mo18832l();
        this.f9155a.mo18833m();
    }
}
