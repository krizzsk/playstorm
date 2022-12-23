package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.C4394a;
import com.fyber.inneractive.sdk.factories.C4397b;
import com.fyber.inneractive.sdk.factories.C4400c;
import com.fyber.inneractive.sdk.flow.C4418i;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.interfaces.C4452a;
import com.fyber.inneractive.sdk.interfaces.C4454b;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.player.cache.C4629n;
import com.fyber.inneractive.sdk.renderers.C5276h;
import com.fyber.inneractive.sdk.renderers.C5280j;
import com.fyber.inneractive.sdk.renderers.C5284m;
import com.fyber.inneractive.sdk.response.C5287a;
import com.fyber.inneractive.sdk.response.C5288b;
import com.fyber.inneractive.sdk.response.C5290d;
import com.fyber.inneractive.sdk.util.C5373t;
import com.fyber.inneractive.sdk.util.C5375u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class IAVideoKit extends BroadcastReceiver {
    private static final C5373t sProvider = new C5392a();

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$b */
    public class C5393b implements C4397b.C4399b {
        public C5393b(IAVideoKit iAVideoKit) {
        }

        /* renamed from: a */
        public C4452a mo24387a() {
            return new C4418i(IronSourceConstants.INTERSTITIAL_AD_UNIT);
        }

        /* renamed from: b */
        public C5288b mo24388b() {
            return new C5290d();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$c */
    public class C5394c implements C4400c.C4401a {
        public C5394c(IAVideoKit iAVideoKit) {
        }

        /* renamed from: a */
        public boolean mo24389a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C4450y);
        }

        /* renamed from: b */
        public C4455c mo24390b(InneractiveAdSpot inneractiveAdSpot) {
            InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f10913a;
            boolean z = inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen();
            if (!inneractiveAdSpot.getAdContent().mo24373d() || !z) {
                return new C5280j();
            }
            return new C5284m();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$d */
    public class C5395d implements C4394a.C4395a {
        public C5395d(IAVideoKit iAVideoKit) {
        }

        /* renamed from: a */
        public boolean mo24391a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C4450y);
        }

        /* renamed from: b */
        public C4454b mo24392b(InneractiveAdSpot inneractiveAdSpot) {
            return new C5276h();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C5373t tVar = sProvider;
        IAConfigManager.f10525J.f10534H.put(tVar.mo24704a(), tVar);
        C4629n nVar = C4629n.f11534f;
        Context applicationContext = context.getApplicationContext();
        nVar.getClass();
        if (applicationContext == null) {
            IAlog.m16703e("context is null, would not start the video cache.", new Object[0]);
        } else if (!nVar.mo24853a()) {
            nVar.f11535a = applicationContext;
            new Thread(nVar.f11539e, "VideoCache").start();
        }
        IAlog.m16699a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        C4397b.C4398a.f10858a.mo24560a(C5287a.RETURNED_ADTYPE_VAST, new C5393b(this));
        C4400c cVar = C4400c.C4402b.f10860a;
        cVar.f10859a.add(new C5394c(this));
        C4394a aVar = C4394a.C4396b.f10856a;
        aVar.f10855a.add(new C5395d(this));
    }

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$a */
    public class C5392a implements C5373t {
        /* renamed from: a */
        public boolean mo24705a(String str) {
            if (TextUtils.equals(str, "vid_cache")) {
                return C4629n.f11534f.mo24853a();
            }
            return false;
        }

        /* renamed from: a */
        public C5375u mo24704a() {
            return C5375u.Video;
        }
    }
}
