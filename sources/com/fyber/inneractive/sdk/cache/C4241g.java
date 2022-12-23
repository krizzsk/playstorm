package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C4543f0;
import com.fyber.inneractive.sdk.network.C4559m0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.cache.g */
public class C4241g {

    /* renamed from: a */
    public long f10485a;

    /* renamed from: b */
    public String f10486b;

    /* renamed from: c */
    public String f10487c;

    /* renamed from: d */
    public String f10488d;

    /* renamed from: a */
    public void mo24246a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f10485a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.f10525J;
            if (iAConfigManager.f10557v.f10660b.mo24347a("use_js_inline", false)) {
                Application application = C5350l.f14216a;
                if (application == null) {
                    IAlog.m16703e("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f10485a = System.currentTimeMillis();
                C4543f0 f0Var = new C4543f0(new C4238d(this), application, new C4237c("https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js", "MRAID-VIDEO.js"));
                iAConfigManager.f10555t.f11387a.offer(f0Var);
                C4559m0 m0Var = C4559m0.QUEUED;
                f0Var.mo24717a(m0Var);
                C4543f0 f0Var2 = new C4543f0(new C4239e(this), application, new C4237c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css"));
                iAConfigManager.f10555t.f11387a.offer(f0Var2);
                f0Var2.mo24717a(m0Var);
                C4543f0 f0Var3 = new C4543f0(new C4240f(this), application, new C4237c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js"));
                iAConfigManager.f10555t.f11387a.offer(f0Var3);
                f0Var3.mo24717a(m0Var);
            }
        }
    }
}
