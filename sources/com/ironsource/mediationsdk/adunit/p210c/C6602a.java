package com.ironsource.mediationsdk.adunit.p210c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.C6765c;
import java.util.List;

/* renamed from: com.ironsource.mediationsdk.adunit.c.a */
public final class C6602a {

    /* renamed from: a */
    IronSource.AD_UNIT f17118a;

    /* renamed from: b */
    String f17119b;

    /* renamed from: c */
    List<NetworkSettings> f17120c;

    /* renamed from: d */
    C6765c f17121d;

    /* renamed from: e */
    int f17122e;

    /* renamed from: f */
    int f17123f;

    /* renamed from: g */
    int f17124g;

    /* renamed from: h */
    C6607a f17125h;

    /* renamed from: i */
    int f17126i;

    public C6602a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, C6765c cVar, int i, int i2, int i3, int i4, C6607a aVar) {
        this.f17118a = ad_unit;
        this.f17119b = str;
        this.f17120c = list;
        this.f17121d = cVar;
        this.f17122e = i;
        this.f17124g = i2;
        this.f17123f = i3;
        this.f17125h = aVar;
        this.f17126i = i4;
    }

    /* renamed from: a */
    public final NetworkSettings mo36549a(String str) {
        for (NetworkSettings next : this.f17120c) {
            if (next.getProviderInstanceName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo36550a() {
        return this.f17121d.f17673e > 0;
    }
}
