package com.ironsource.sdk.p286a;

import com.ironsource.mediationsdk.adunit.p208a.C6590a;
import com.ironsource.sdk.p293g.C8342c;
import com.ironsource.sdk.p293g.C8343d;

/* renamed from: com.ironsource.sdk.a.e */
public class C8155e {

    /* renamed from: a */
    private C6590a f19418a = new C6590a();

    /* renamed from: a */
    public static C8343d.C8348e m23443a(C8342c cVar, C8343d.C8348e eVar) {
        return (cVar == null || cVar.f20022d == null || cVar.f20022d.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.f20022d.get("rewarded")) ? C8343d.C8348e.RewardedVideo : C8343d.C8348e.Interstitial;
    }

    /* renamed from: a */
    public static boolean m23444a(C8342c cVar) {
        if (cVar == null || cVar.f20022d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.f20022d.get("inAppBidding"));
    }

    /* renamed from: a */
    public void mo56416a(int i) {
        C6590a.m20031a("sdia", (Object) Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo56417b(int i) {
        C6590a.m20031a("sdra", (Object) Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo56418c(int i) {
        C6590a.m20031a("sdba", (Object) Integer.valueOf(i));
    }
}
