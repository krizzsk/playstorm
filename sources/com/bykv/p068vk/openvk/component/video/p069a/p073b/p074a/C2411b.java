package com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a;

import android.content.Context;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2436d;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c;
import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import com.bytedance.sdk.component.p125f.C2955g;
import java.io.File;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.a.b */
/* compiled from: DiskCache */
public class C2411b extends C2410a {

    /* renamed from: a */
    public final File f5101a;

    /* renamed from: a */
    public void mo16101a() {
        C2482a.m6055a((C2955g) new C2955g("clear") {
            public void run() {
                C2411b.this.mo16102b();
            }
        });
    }

    /* renamed from: b */
    public void mo16102b() {
        C2436d.m5913c().mo16155d();
        Context a = C2446e.m5929a();
        if (a != null) {
            C2427c.m5902a(a).mo16136a(1);
        }
        for (File delete : this.f5101a.listFiles()) {
            try {
                delete.delete();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public File mo16099c(String str) {
        return mo16103e(str);
    }

    /* renamed from: d */
    public File mo16100d(String str) {
        return mo16103e(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public File mo16103e(String str) {
        return new File(this.f5101a, str);
    }
}
