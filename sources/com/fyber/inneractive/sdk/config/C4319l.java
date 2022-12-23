package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import com.fyber.inneractive.sdk.config.C4311i;
import com.fyber.inneractive.sdk.network.C4534c;

/* renamed from: com.fyber.inneractive.sdk.config.l */
public class C4319l implements C4311i.C4313b {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10672a;

    public C4319l(IAConfigManager iAConfigManager) {
        this.f10672a = iAConfigManager;
    }

    public void onGlobalConfigChanged(C4311i iVar, C4310h hVar) {
        this.f10672a.f10532F.mo24246a();
        C4534c cVar = this.f10672a.f10533G;
        cVar.getClass();
        int i = 30;
        int a = IAConfigManager.f10525J.f10557v.f10660b.mo24345a("send_events_batch_interval", 30, -1);
        if (a >= 0) {
            i = a;
        }
        cVar.f11204f = true;
        cVar.f11203e = i;
        Handler handler = cVar.f11202d;
        if (handler != null && handler.hasMessages(12312329)) {
            cVar.f11202d.removeMessages(12312329);
        }
        cVar.mo24733a(12312329, (long) (cVar.f11203e * 1000));
    }
}
