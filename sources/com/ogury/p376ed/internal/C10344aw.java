package com.ogury.p376ed.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ogury.ed.internal.aw */
public final class C10344aw {

    /* renamed from: a */
    public static final C10344aw f26217a = new C10344aw();

    /* renamed from: b */
    private static final Map<String, C10343av> f26218b;

    private C10344aw() {
    }

    static {
        Map<String, C10343av> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C10765mq.m32770a((Object) synchronizedMap, "synchronizedMap(mutableMapOf())");
        f26218b = synchronizedMap;
    }

    /* renamed from: a */
    public static String m31301a(C10343av avVar) {
        C10765mq.m32773b(avVar, "item");
        String uuid = UUID.randomUUID().toString();
        C10765mq.m32770a((Object) uuid, "randomUUID().toString()");
        f26218b.put(uuid, avVar);
        return uuid;
    }

    /* renamed from: a */
    public static C10343av m31300a(String str) {
        Map<String, C10343av> map = f26218b;
        if (map != null) {
            return (C10343av) C10771mw.m32793c(map).remove(str);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }
}
