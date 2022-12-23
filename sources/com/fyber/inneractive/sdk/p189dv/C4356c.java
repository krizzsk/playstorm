package com.fyber.inneractive.sdk.p189dv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.C4394a;
import com.fyber.inneractive.sdk.factories.C4397b;
import com.fyber.inneractive.sdk.factories.C4400c;
import com.fyber.inneractive.sdk.interfaces.C4452a;
import com.fyber.inneractive.sdk.interfaces.C4454b;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.p189dv.banner.C4355b;
import com.fyber.inneractive.sdk.p189dv.interstitial.C4378d;
import com.fyber.inneractive.sdk.p189dv.rewarded.C4386c;
import com.fyber.inneractive.sdk.response.C5287a;
import com.fyber.inneractive.sdk.response.C5288b;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.dv.c */
public class C4356c extends BroadcastReceiver {

    /* renamed from: com.fyber.inneractive.sdk.dv.c$a */
    public class C4357a implements C4397b.C4399b {
        public C4357a(C4356c cVar) {
        }

        /* renamed from: a */
        public C4452a mo24387a() {
            return new C4351b();
        }

        /* renamed from: b */
        public C5288b mo24388b() {
            return new C4361e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.c$b */
    public class C4358b implements C4400c.C4401a {
        public C4358b(C4356c cVar) {
        }

        /* renamed from: a */
        public boolean mo24389a(InneractiveAdSpot inneractiveAdSpot) {
            return IAConfigManager.f10525J.f10531E != null && (inneractiveAdSpot.getAdContent() instanceof C4350a);
        }

        /* renamed from: b */
        public C4455c mo24390b(InneractiveAdSpot inneractiveAdSpot) {
            InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f10913a;
            boolean z = inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen();
            if (!inneractiveAdSpot.getAdContent().mo24373d() || !z) {
                return null;
            }
            if (inneractiveAdSpot.getAdContent().mo24367c().f14079n == UnitDisplayType.INTERSTITIAL) {
                return new C4378d();
            }
            return new C4386c();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.c$c */
    public class C4359c implements C4394a.C4395a {
        public C4359c() {
        }

        /* renamed from: a */
        public boolean mo24391a(InneractiveAdSpot inneractiveAdSpot) {
            return C4356c.m13597a(C4356c.this, inneractiveAdSpot);
        }

        /* renamed from: b */
        public C4454b mo24392b(InneractiveAdSpot inneractiveAdSpot) {
            return new C4355b();
        }
    }

    /* renamed from: a */
    public static boolean m13597a(C4356c cVar, InneractiveAdSpot inneractiveAdSpot) {
        cVar.getClass();
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C4350a);
    }

    public void onReceive(Context context, Intent intent) {
        IAlog.m16699a("DVKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        C4397b.C4398a.f10858a.mo24560a(C5287a.RETURNED_ADTYPE_MOBILE_ADS, new C4357a(this));
        C4400c cVar = C4400c.C4402b.f10860a;
        cVar.f10859a.add(new C4358b(this));
        C4394a aVar = C4394a.C4396b.f10856a;
        aVar.f10855a.add(new C4359c());
    }
}
