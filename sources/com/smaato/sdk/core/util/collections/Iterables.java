package com.smaato.sdk.core.util.collections;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.BiFunction;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.Predicate;
import java.util.Iterator;

public final class Iterables {
    private Iterables() {
    }

    static /* synthetic */ Iterator lambda$map$0(Iterable iterable, final Function function) {
        return new MappedIterator(iterable.iterator()) {
            /* access modifiers changed from: package-private */
            public Object map(Object obj) {
                return function.apply(obj);
            }
        };
    }

    public static <F, T> Iterable<T> map(Iterable<F> iterable, Function<F, T> function) {
        return new Iterable(iterable, function) {
            public final /* synthetic */ Iterable f$0;
            public final /* synthetic */ Function f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Iterator iterator() {
                return Iterables.lambda$map$0(this.f$0, this.f$1);
            }
        };
    }

    public static <T> void forEach(Iterable<T> iterable, Consumer<T> consumer) {
        Objects.requireNonNull(iterable);
        Objects.requireNonNull(consumer);
        for (T accept : iterable) {
            consumer.accept(accept);
        }
    }

    public static <K, R> R reduce(Iterable<K> iterable, R r, BiFunction<K, R, R> biFunction) {
        Objects.requireNonNull(biFunction);
        for (K apply : iterable) {
            r = biFunction.apply(apply, r);
        }
        return r;
    }

    public static <T> T filterFirst(Iterable<T> iterable, Predicate<T> predicate) {
        for (T next : iterable) {
            if (predicate.test(next)) {
                return next;
            }
        }
        return null;
    }
}
