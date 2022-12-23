package com.ogury.p376ed.internal;

import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ci */
public final class C10399ci {

    /* renamed from: a */
    private final C10396cg f26328a;

    public C10399ci(C10396cg cgVar) {
        C10765mq.m32773b(cgVar, "filterSettings");
        this.f26328a = cgVar;
    }

    /* renamed from: a */
    public final boolean mo67154a(List<? extends Object> list) {
        C10765mq.m32773b(list, "fragments");
        Iterable<Object> iterable = list;
        for (Object a : iterable) {
            if (m31471a(a)) {
                return false;
            }
        }
        for (Object b : iterable) {
            if (m31472b(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m31471a(Object obj) {
        String a = C10392cc.m31456a(obj);
        Iterable<String> b = this.f26328a.mo67153b();
        if ((b instanceof Collection) && ((Collection) b).isEmpty()) {
            return false;
        }
        for (String a2 : b) {
            if (C10765mq.m32772a((Object) a2, (Object) a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m31472b(Object obj) {
        String a = C10392cc.m31456a(obj);
        Iterable<String> a2 = this.f26328a.mo67152a();
        if ((a2 instanceof Collection) && ((Collection) a2).isEmpty()) {
            return false;
        }
        for (String b : a2) {
            if (C10814oc.m32844b(a, b)) {
                return true;
            }
        }
        return false;
    }
}
