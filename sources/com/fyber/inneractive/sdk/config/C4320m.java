package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.measurement.C4461b;
import com.fyber.inneractive.sdk.measurement.C4463d;
import com.fyber.inneractive.sdk.util.C5357n;

/* renamed from: com.fyber.inneractive.sdk.config.m */
public class C4320m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10673a;

    /* renamed from: b */
    public final /* synthetic */ Context f10674b;

    /* renamed from: c */
    public final /* synthetic */ IAConfigManager f10675c;

    /* renamed from: com.fyber.inneractive.sdk.config.m$a */
    public class C4321a implements Runnable {
        public C4321a() {
        }

        public void run() {
            C4320m mVar = C4320m.this;
            IAConfigManager iAConfigManager = mVar.f10675c;
            C4463d dVar = new C4463d();
            iAConfigManager.f10535I = dVar;
            IAConfigManager iAConfigManager2 = mVar.f10673a;
            Context context = mVar.f10674b;
            if (!dVar.f11000a) {
                dVar.f11000a = true;
                C5357n.f14225b.post(new C4461b(dVar, context));
            }
        }
    }

    public C4320m(IAConfigManager iAConfigManager, IAConfigManager iAConfigManager2, Context context) {
        this.f10675c = iAConfigManager;
        this.f10673a = iAConfigManager2;
        this.f10674b = context;
    }

    public void run() {
        try {
            Class.forName("com.iab.omid.library.fyber.Omid");
            C5357n.f14225b.post(new C4321a());
        } catch (Throwable unused) {
        }
    }
}
