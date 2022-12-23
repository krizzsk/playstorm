package com.ironsource.sdk;

import com.ironsource.sdk.p296j.C8360a;
import java.util.Map;

/* renamed from: com.ironsource.sdk.b */
public final class C8158b {

    /* renamed from: a */
    public final boolean f19442a;

    /* renamed from: b */
    public String f19443b;

    /* renamed from: c */
    public String f19444c;

    /* renamed from: d */
    public boolean f19445d;

    /* renamed from: e */
    public C8149a f19446e;

    /* renamed from: f */
    public Map<String, String> f19447f;

    /* renamed from: g */
    public C8360a f19448g;

    /* renamed from: h */
    public boolean f19449h = false;

    C8158b(String str, String str2, boolean z, boolean z2, Map<String, String> map, C8360a aVar, C8149a aVar2) {
        this.f19443b = str;
        this.f19444c = str2;
        this.f19442a = z;
        this.f19445d = z2;
        this.f19447f = map;
        this.f19448g = aVar;
        this.f19446e = aVar2;
    }

    /* renamed from: a */
    public final boolean mo56419a() {
        C8149a aVar = this.f19446e;
        if (aVar != null) {
            if (aVar.f19408b > 0 && aVar.f19407a > 0) {
                return true;
            }
        }
        return false;
    }
}
