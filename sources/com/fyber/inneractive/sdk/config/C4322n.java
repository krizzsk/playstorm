package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4303m;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.C4531b;
import com.fyber.inneractive.sdk.network.C4542f;
import com.fyber.inneractive.sdk.network.C4543f0;
import com.fyber.inneractive.sdk.network.C4559m0;
import com.fyber.inneractive.sdk.network.C4564n0;
import com.fyber.inneractive.sdk.network.C4579u;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* renamed from: com.fyber.inneractive.sdk.config.n */
public class C4322n implements C4579u<IAConfigManager.C4258a> {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10677a;

    public C4322n(IAConfigManager iAConfigManager) {
        this.f10677a = iAConfigManager;
    }

    /* renamed from: a */
    public void mo24228a(Object obj, Exception exc, boolean z) {
        int i;
        IAConfigManager.C4258a aVar = (IAConfigManager.C4258a) obj;
        boolean z2 = false;
        if (aVar != null) {
            if (aVar.f10565d != null) {
                this.f10677a.getClass();
            }
            if (z) {
                IAConfigManager iAConfigManager = this.f10677a;
                IAConfigManager iAConfigManager2 = IAConfigManager.f10525J;
                iAConfigManager.getClass();
                iAConfigManager.f10540e = aVar.f10564c;
                iAConfigManager.f10539d = aVar.f10563b;
                iAConfigManager.f10536a = aVar.f10566e;
                iAConfigManager.f10537b = aVar.f10567f;
            } else {
                IAConfigManager.f10526K = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f10677a;
                iAConfigManager3.getClass();
                IAlog.m16699a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.f10540e = aVar.f10564c;
                iAConfigManager3.f10539d = aVar.f10563b;
                iAConfigManager3.f10536a = aVar.f10566e;
                iAConfigManager3.f10537b = aVar.f10567f;
            }
        } else if (exc instanceof C4542f) {
            IAConfigManager.f10526K = System.currentTimeMillis();
        }
        if (!z) {
            IAConfigManager iAConfigManager4 = this.f10677a;
            boolean f = IAConfigManager.m13433f();
            iAConfigManager4.getClass();
            if (f) {
                iAConfigManager4.mo24261a((Exception) null);
            } else {
                if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof C4564n0) ? TextUtils.isEmpty(iAConfigManager4.f10538c.trim()) : !((i = ((C4564n0) exc).f11300a) < 400 || i >= 500))) {
                    z2 = true;
                }
                if (z2) {
                    iAConfigManager4.mo24261a(new InvalidAppIdException());
                } else if (exc instanceof C4531b) {
                    iAConfigManager4.mo24261a(exc);
                } else {
                    iAConfigManager4.mo24261a(new IAConfigManager.C4259b());
                }
            }
            if (IAConfigManager.m13433f()) {
                IAConfigManager iAConfigManager5 = this.f10677a;
                if (iAConfigManager5.f10529C == null) {
                    iAConfigManager5.f10529C = new C4543f0(new C4325p(iAConfigManager5), iAConfigManager5.f10541f, new C4303m());
                }
                C4559m0 l = iAConfigManager5.f10529C.mo24728l();
                if (l != C4559m0.RUNNING && l != C4559m0.QUEUED) {
                    iAConfigManager5.f10555t.mo24781c(iAConfigManager5.f10529C);
                }
            }
        }
    }
}
