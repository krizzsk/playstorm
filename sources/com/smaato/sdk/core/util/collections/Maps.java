package com.smaato.sdk.core.util.collections;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.BiConsumer;
import com.smaato.sdk.core.util.p382fi.BiFunction;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.Predicate;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Maps {
    private Maps() {
    }

    public static <F, K, V> Map<K, V> toMap(Iterable<F> iterable, Function<F, K> function, Function<F, V> function2) {
        HashMap hashMap = new HashMap();
        for (F next : iterable) {
            hashMap.put(function.apply(next), function2.apply(next));
        }
        return hashMap;
    }

    public static <F, K, V> Map<K, V> toMapWithOrder(Iterable<F> iterable, Function<F, K> function, Function<F, V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (F next : iterable) {
            linkedHashMap.put(function.apply(next), function2.apply(next));
        }
        return linkedHashMap;
    }

    public static <K, V> List<K> filteredKeys(Map<K, V> map, Predicate<V> predicate) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            if (predicate.test(next.getValue())) {
                arrayList.add(next.getKey());
            }
        }
        return arrayList;
    }

    public static <K, V> K firstMatchedKey(Map<K, V> map, Predicate<V> predicate) {
        for (Map.Entry next : map.entrySet()) {
            if (predicate.test(next.getValue())) {
                return next.getKey();
            }
        }
        return null;
    }

    public static <K, V> Map.Entry<K, V> firstMatchedEntry(Map<K, V> map, Predicate<V> predicate) {
        for (Map.Entry<K, V> next : map.entrySet()) {
            if (predicate.test(next.getValue())) {
                return next;
            }
        }
        return null;
    }

    public static <K, V> Map<K, V> filter(Map<K, V> map, Predicate<V> predicate) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            if (predicate.test(value)) {
                hashMap.put(next.getKey(), value);
            }
        }
        return hashMap;
    }

    public static <K, V> Map<K, V> toImmutableMap(Map<? extends K, ? extends V> map) {
        if (map == null || map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static <K, V> void forEach(Map<K, V> map, BiConsumer<? super K, ? super V> biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry next : map.entrySet()) {
            try {
                biConsumer.accept(next.getKey(), next.getValue());
            } catch (IllegalStateException e) {
                throw new ConcurrentModificationException(e.getMessage());
            }
        }
    }

    @SafeVarargs
    public static <K, V> Map<K, V> mapOf(Map.Entry<K, V>... entryArr) {
        return Collections.unmodifiableMap(mutableMapOf(entryArr));
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    @SafeVarargs
    private static <K, V> Map<K, V> mutableMapOf(Map.Entry<K, V>... entryArr) {
        Objects.requireNonNull(entryArr, "entries is null");
        HashMap hashMap = new HashMap();
        for (int i = 0; i < entryArr.length; i++) {
            Map.Entry<K, V> entry = entryArr[i];
            Objects.requireNonNull(entry, "entry at index " + i + "is null");
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public static <K, V, R> R reduce(Map<K, V> map, R r, BiFunction<Map.Entry<K, V>, R, R> biFunction) {
        Objects.requireNonNull(biFunction);
        for (Map.Entry<K, V> apply : map.entrySet()) {
            r = biFunction.apply(apply, r);
        }
        return r;
    }

    @SafeVarargs
    public static <K, V> Map<K, V> merge(Map<K, V>... mapArr) {
        HashMap hashMap = new HashMap();
        for (Map<K, V> putAll : mapArr) {
            hashMap.putAll(putAll);
        }
        return hashMap;
    }
}
