package com.smaato.sdk.core.util.collections;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.Predicate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Sets {
    private Sets() {
    }

    public static <T> Set<T> retainToSet(Collection<T> collection, Predicate<T> predicate) {
        HashSet hashSet = new HashSet();
        for (T next : collection) {
            if (predicate.test(next)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    public static <E> Set<E> toSet(Iterable<E> iterable) {
        HashSet hashSet = new HashSet();
        for (E add : iterable) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public static <E, R> Set<R> toSet(Iterable<E> iterable, Function<E, R> function) {
        HashSet hashSet = new HashSet();
        for (E next : iterable) {
            if (next != null) {
                hashSet.add(function.apply(next));
            }
        }
        return hashSet;
    }

    public static <E> Set<E> toImmutableSet(Collection<E> collection) {
        if (collection == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(collection));
    }

    @SafeVarargs
    public static <E> Set<E> toImmutableSetOf(E... eArr) {
        Objects.requireNonNull(eArr);
        return toImmutableSet(Arrays.asList(eArr));
    }

    /* renamed from: of */
    public static <E> Set<E> m32967of(E... eArr) {
        return new HashSet(Arrays.asList(eArr));
    }
}
