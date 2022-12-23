package com.fyber.inneractive.sdk.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.C4394a;
import com.fyber.inneractive.sdk.factories.C4397b;
import com.fyber.inneractive.sdk.factories.C4400c;
import com.fyber.inneractive.sdk.flow.C4415h;
import com.fyber.inneractive.sdk.flow.C4437u;
import com.fyber.inneractive.sdk.interfaces.C4452a;
import com.fyber.inneractive.sdk.interfaces.C4454b;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.renderers.C5274g;
import com.fyber.inneractive.sdk.renderers.C5281k;
import com.fyber.inneractive.sdk.response.C5287a;
import com.fyber.inneractive.sdk.response.C5288b;
import com.fyber.inneractive.sdk.response.C5289c;
import com.fyber.inneractive.sdk.util.C5373t;
import com.fyber.inneractive.sdk.util.C5375u;
import com.fyber.inneractive.sdk.util.IAlog;

public class IAMraidKit extends BroadcastReceiver {
    private static final C5373t sProvider = new C4497a();

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$a */
    public class C4497a implements C5373t {
        /* renamed from: a */
        public C5375u mo24704a() {
            return C5375u.Mraid;
        }

        /* renamed from: a */
        public boolean mo24705a(String str) {
            return false;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$b */
    public class C4498b implements C4397b.C4399b {
        public C4498b(IAMraidKit iAMraidKit) {
        }

        /* renamed from: a */
        public C4452a mo24387a() {
            return new C4415h();
        }

        /* renamed from: b */
        public C5288b mo24388b() {
            return new C5289c();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$c */
    public class C4499c implements C4400c.C4401a {
        public C4499c() {
        }

        /* renamed from: a */
        public boolean mo24389a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        /* renamed from: b */
        public C4455c mo24390b(InneractiveAdSpot inneractiveAdSpot) {
            return new C5281k();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$d */
    public class C4500d implements C4394a.C4395a {
        public C4500d() {
        }

        /* renamed from: a */
        public boolean mo24391a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        /* renamed from: b */
        public C4454b mo24392b(InneractiveAdSpot inneractiveAdSpot) {
            return new C5274g();
        }
    }

    /* access modifiers changed from: private */
    public boolean isMRaidSpotContent(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C4437u);
    }

    public void onReceive(Context context, Intent intent) {
        IAlog.m16699a("IAMraidKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        C5373t tVar = sProvider;
        IAConfigManager.f10525J.f10534H.put(tVar.mo24704a(), tVar);
        C4498b bVar = new C4498b(this);
        C4397b.C4398a.f10858a.mo24560a(C5287a.RETURNED_ADTYPE_HTML, bVar);
        C4397b.C4398a.f10858a.mo24560a(C5287a.RETURNED_ADTYPE_MRAID, bVar);
        C4400c cVar = C4400c.C4402b.f10860a;
        cVar.f10859a.add(new C4499c());
        C4394a aVar = C4394a.C4396b.f10856a;
        aVar.f10855a.add(new C4500d());
    }
}
