package com.ogury.p376ed.internal;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cm */
public final class C10405cm {
    /* renamed from: a */
    public static final C10483eb m31490a(List<C10483eb> list, String str) {
        C10765mq.m32773b(list, "<this>");
        C10765mq.m32773b(str, "nextAdId");
        if (list.isEmpty()) {
            return null;
        }
        if ((str.length() == 0) || C10765mq.m32772a((Object) str, (Object) "null")) {
            return list.remove(0);
        }
        return m31492b(list, str);
    }

    /* renamed from: com.ogury.ed.internal.cm$a */
    static final class C10406a extends C10766mr implements C10730lk<C10483eb, Boolean> {

        /* renamed from: a */
        public static final C10406a f26342a = new C10406a();

        C10406a() {
            super(1);
        }

        /* renamed from: a */
        private static Boolean m31493a(C10483eb ebVar) {
            C10765mq.m32773b(ebVar, "it");
            return Boolean.valueOf(ebVar.mo67262u());
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            return m31493a((C10483eb) obj);
        }
    }

    /* renamed from: a */
    public static final void m31491a(List<C10483eb> list) {
        C10765mq.m32773b(list, "<this>");
        C10692km.m32653a(list, C10406a.f26342a);
    }

    /* renamed from: b */
    private static final C10483eb m31492b(List<C10483eb> list, String str) {
        Iterator<C10483eb> it = list.iterator();
        while (it.hasNext()) {
            C10483eb next = it.next();
            if (C10765mq.m32772a((Object) next.mo67222b(), (Object) str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }
}
