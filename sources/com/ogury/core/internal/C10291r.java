package com.ogury.core.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ogury.core.internal.r */
/* compiled from: Maps.kt */
final class C10291r implements C10223am, Serializable, Map {

    /* renamed from: a */
    public static final C10291r f26089a = new C10291r();

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

    private C10291r() {
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C10219ai.m31036b((Void) obj, "value");
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return C10292s.f26090a;
    }

    public final /* bridge */ Set<Object> keySet() {
        return C10292s.f26090a;
    }

    public final /* bridge */ Collection values() {
        return C10290q.f26088a;
    }
}
