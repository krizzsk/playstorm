package com.smaato.sdk.core.util.collections;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import com.smaato.sdk.core.util.p382fi.Predicate;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class Lists {
    private Lists() {
    }

    public static <T> boolean all(Iterable<T> iterable, Predicate<T> predicate) {
        for (T test : iterable) {
            if (!predicate.test(test)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterable<T> iterable, Predicate<T> predicate) {
        for (T test : iterable) {
            if (predicate.test(test)) {
                return true;
            }
        }
        return false;
    }

    public static <F, T> List<T> mapLazy(List<F> list, NullableFunction<? super F, ? extends T> nullableFunction) {
        if (list instanceof RandomAccess) {
            return new MappingRandomAccessList(list, nullableFunction);
        }
        return new MappingSequentialList(list, nullableFunction);
    }

    public static <F, T> List<T> map(List<F> list, Function<? super F, ? extends T> function) {
        Objects.requireNonNull(list);
        Objects.requireNonNull(function);
        ArrayList arrayList = new ArrayList();
        for (F next : list) {
            if (next != null) {
                arrayList.add(function.apply(next));
            }
        }
        return toImmutableList(arrayList);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <T> List<T> m32965of(T... tArr) {
        return Arrays.asList(tArr);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <T> List<T> m32966of(Collection<T>... collectionArr) {
        ArrayList arrayList = new ArrayList();
        for (Collection<T> onNotNull : collectionArr) {
            Objects.onNotNull(onNotNull, new Consumer(arrayList) {
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    this.f$0.addAll((Collection) obj);
                }
            });
        }
        return arrayList;
    }

    public static <T> List<T> filter(Iterable<T> iterable, Predicate<T> predicate) {
        ArrayList arrayList = new ArrayList();
        for (T next : iterable) {
            if (predicate.test(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static <T> List<T> toImmutableList(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static <T> List<T> toImmutableList(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return toImmutableList(arrayList);
    }

    public static <T> List<T> toImmutableListOf(T... tArr) {
        Objects.requireNonNull(tArr);
        return toImmutableList(Arrays.asList(tArr));
    }

    @SafeVarargs
    public static <T> List<T> join(List<T>... listArr) {
        int i = 0;
        for (List<T> size : listArr) {
            i += size.size();
        }
        if (i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(i);
        for (List<T> addAll : listArr) {
            arrayList.addAll(addAll);
        }
        return toImmutableList(arrayList);
    }

    private static class MappingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        final List<F> fromList;
        final NullableFunction<? super F, ? extends T> function;

        MappingSequentialList(List<F> list, NullableFunction<? super F, ? extends T> nullableFunction) {
            this.fromList = (List) Objects.requireNonNull(list);
            this.function = (NullableFunction) Objects.requireNonNull(nullableFunction);
        }

        public void clear() {
            this.fromList.clear();
        }

        public int size() {
            return this.fromList.size();
        }

        public ListIterator<T> listIterator(int i) {
            return new MappedListIterator<F, T>(this.fromList.listIterator(i)) {
                /* access modifiers changed from: package-private */
                public T map(F f) {
                    return MappingSequentialList.this.function.apply(f);
                }
            };
        }
    }

    private static class MappingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        final List<F> fromList;
        final NullableFunction<? super F, ? extends T> function;

        MappingRandomAccessList(List<F> list, NullableFunction<? super F, ? extends T> nullableFunction) {
            this.fromList = (List) Objects.requireNonNull(list);
            this.function = (NullableFunction) Objects.requireNonNull(nullableFunction);
        }

        public void clear() {
            this.fromList.clear();
        }

        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new MappedListIterator<F, T>(this.fromList.listIterator(i)) {
                /* access modifiers changed from: package-private */
                public T map(F f) {
                    return MappingRandomAccessList.this.function.apply(f);
                }
            };
        }

        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        public T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }
}
