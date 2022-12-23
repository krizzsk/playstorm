package com.apm.insight.runtime;

import com.apm.insight.C1240h;
import com.apm.insight.entity.Header;

/* renamed from: com.apm.insight.runtime.f */
public class C1365f {

    /* renamed from: b */
    private static final C1365f f1424b = new C1365f() {

        /* renamed from: a */
        Header f1426a = null;

        /* renamed from: b */
        public Object mo12500b(String str) {
            if (this.f1426a == null) {
                this.f1426a = Header.m1387b(C1240h.m1558g());
            }
            return this.f1426a.mo12241f().opt(str);
        }
    };

    /* renamed from: a */
    private C1365f f1425a;

    C1365f() {
        this(f1424b);
    }

    C1365f(C1365f fVar) {
        this.f1425a = null;
        this.f1425a = fVar;
    }

    /* renamed from: a */
    public Object mo12446a(String str) {
        C1365f fVar = this.f1425a;
        if (fVar != null) {
            return fVar.mo12446a(str);
        }
        return null;
    }

    /* renamed from: b */
    public Object mo12500b(String str) {
        C1365f fVar = this.f1425a;
        if (fVar != null) {
            return fVar.mo12500b(str);
        }
        return null;
    }
}
