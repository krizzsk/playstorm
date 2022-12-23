package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5177j0;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.m0 */
public class C5192m0 implements C5189l0 {
    /* renamed from: a */
    public Map<?, ?> mo26151a(Object obj) {
        return (C5181k0) obj;
    }

    /* renamed from: b */
    public Object mo26152b(Object obj) {
        C5181k0 k0Var = C5181k0.f13828b;
        return k0Var.isEmpty() ? new C5181k0() : new C5181k0(k0Var);
    }

    /* renamed from: c */
    public Map<?, ?> mo26153c(Object obj) {
        return (C5181k0) obj;
    }

    /* renamed from: d */
    public boolean mo26154d(Object obj) {
        return !((C5181k0) obj).f13829a;
    }

    /* renamed from: e */
    public Object mo26155e(Object obj) {
        ((C5181k0) obj).f13829a = false;
        return obj;
    }

    /* renamed from: f */
    public C5177j0.C5178a<?, ?> mo26156f(Object obj) {
        ((C5177j0) obj).getClass();
        return null;
    }

    /* renamed from: a */
    public Object mo26150a(Object obj, Object obj2) {
        C5181k0 k0Var = (C5181k0) obj;
        C5181k0 k0Var2 = (C5181k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.f13829a) {
                k0Var = k0Var.isEmpty() ? new C5181k0() : new C5181k0(k0Var);
            }
            k0Var.mo26108a();
            if (!k0Var2.isEmpty()) {
                k0Var.putAll(k0Var2);
            }
        }
        return k0Var;
    }

    /* renamed from: a */
    public int mo26149a(int i, Object obj, Object obj2) {
        C5181k0 k0Var = (C5181k0) obj;
        C5177j0 j0Var = (C5177j0) obj2;
        if (k0Var.isEmpty()) {
            return 0;
        }
        Iterator it = k0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        j0Var.getClass();
        C5183l.m16034b(i);
        throw null;
    }
}
