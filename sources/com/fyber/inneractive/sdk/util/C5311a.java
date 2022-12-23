package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.util.a */
public class C5311a {

    /* renamed from: a */
    public InneractiveAdSpot f14140a;

    /* renamed from: b */
    public boolean f14141b = false;

    /* renamed from: c */
    public boolean f14142c;

    /* renamed from: d */
    public long f14143d = 0;

    /* renamed from: e */
    public long f14144e = 0;

    /* renamed from: f */
    public long f14145f = 0;

    /* renamed from: a */
    public void mo26437a(boolean z) {
        String str = "skip";
        if (!this.f14141b) {
            Object[] objArr = new Object[2];
            objArr[0] = "AdExperienceLatency: ";
            if (!z) {
                str = "close";
            }
            objArr[1] = str;
            IAlog.m16699a("%s%s timer started", objArr);
            this.f14143d = System.currentTimeMillis();
            this.f14141b = true;
            this.f14142c = z;
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = "AdExperienceLatency: ";
        if (!z) {
            str = "close";
        }
        objArr2[1] = str;
        IAlog.m16699a("%s%s timer could not start. Timer is in action!", objArr2);
    }

    /* renamed from: b */
    public void mo26438b() {
        if (this.f14141b && this.f14144e > 0) {
            this.f14145f += System.currentTimeMillis() - this.f14144e;
            this.f14144e = 0;
        }
    }

    /* renamed from: c */
    public void mo26439c() {
        C4309s sVar;
        if (this.f14141b) {
            String a = C5318c0.m16712a(this.f14143d, this.f14145f);
            InneractiveAdSpot inneractiveAdSpot = this.f14140a;
            C4419j adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            C4567p pVar = this.f14142c ? C4567p.USER_SKIP_ACTION_LATENCY : C4567p.USER_CLOSE_ACTION_LATENCY;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f10913a : null;
            C5291e c = adContent != null ? adContent.mo24367c() : null;
            JSONArray c2 = (adContent == null || (sVar = adContent.f10915c) == null) ? null : sVar.mo24342c();
            C4569q.C4570a aVar = new C4569q.C4570a(c);
            aVar.f11365c = pVar;
            aVar.f11363a = inneractiveAdRequest;
            aVar.f11366d = c2;
            Object[] objArr = new Object[2];
            objArr[0] = this.f14142c ? "skip_action_latency" : "close_action_latency";
            objArr[1] = a;
            aVar.mo24767a(objArr);
            aVar.mo24768a((String) null);
            mo26436a();
        }
    }

    /* renamed from: a */
    public void mo26436a() {
        this.f14143d = 0;
        this.f14144e = 0;
        this.f14145f = 0;
        this.f14141b = false;
    }
}
