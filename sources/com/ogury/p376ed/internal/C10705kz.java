package com.ogury.p376ed.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ogury.ed.internal.kz */
final class C10705kz implements C10772mx, Serializable, Map {

    /* renamed from: a */
    public static final C10705kz f26943a = new C10705kz();
    private static final long serialVersionUID = 8246714829545688274L;

    /* renamed from: a */
    private static boolean m32666a(Void voidR) {
        C10765mq.m32773b(voidR, "value");
        return false;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return JsonUtils.EMPTY_JSON;
    }

    private C10705kz() {
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m32666a((Void) obj);
    }

    public final Set<Map.Entry> entrySet() {
        return m32665a();
    }

    public final Set<Object> keySet() {
        return m32667b();
    }

    public final Collection values() {
        return m32668c();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: a */
    private static Set<Map.Entry> m32665a() {
        return C10720la.f26977a;
    }

    /* renamed from: b */
    private static Set<Object> m32667b() {
        return C10720la.f26977a;
    }

    /* renamed from: c */
    private static Collection m32668c() {
        return C10704ky.f26942a;
    }

    private final Object readResolve() {
        return f26943a;
    }
}
