package com.tapjoy.internal;

import com.tapjoy.internal.C11787it;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.hr */
public final class C11735hr implements C11475bz<C11787it.C11788a> {

    /* renamed from: a */
    public final C11714hj f28555a;

    /* renamed from: b */
    private final Map<String, C11734hq> f28556b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private final Map<String, C11787it> f28557c = new HashMap();

    /* renamed from: d */
    private Set<String> f28558d = null;

    public C11735hr(C11714hj hjVar) {
        this.f28555a = hjVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72665a() {
        synchronized (this) {
            this.f28558d = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo72265a(C11470bu<C11787it.C11788a> buVar, C11787it.C11788a aVar) {
        if (buVar instanceof C11787it) {
            if (aVar.f28768b != null) {
                List<String> list = aVar.f28768b;
                synchronized (this) {
                    this.f28558d = new HashSet(list);
                }
            }
            C11787it itVar = (C11787it) buVar;
            String str = itVar.f28760c;
            boolean z = itVar.f28761d;
            this.f28557c.remove(str);
            if (!z) {
                this.f28556b.put(str, aVar.f28767a);
            }
            C11734hq hqVar = aVar.f28767a;
            C11716hk hkVar = this.f28555a.f28494o;
            if (hqVar instanceof C11733hp) {
                C11710hg.m33977a("No content for \"{}\"", str);
                hkVar.mo71656a(str);
                return;
            }
            C11710hg.m33977a("New content for \"{}\" is ready", str);
            if (z) {
                hqVar.mo72591a(hkVar, new C11652fy());
            } else {
                hkVar.mo71659b(str);
            }
        } else {
            throw new IllegalStateException(buVar.getClass().getName());
        }
    }

    /* renamed from: a */
    public final void mo72264a(C11470bu<C11787it.C11788a> buVar) {
        mo72265a(buVar, new C11787it.C11788a(new C11733hp(), (List<String>) null));
    }
}
