package com.smaato.sdk.video.p390fi;

import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.video.fi.CheckedFunctionUtils */
public final class CheckedFunctionUtils {
    static /* synthetic */ Object lambda$identity$0(Object obj) throws Exception {
        return obj;
    }

    private CheckedFunctionUtils() {
    }

    public static <T> CheckedFunction<T, T> identity() {
        return $$Lambda$CheckedFunctionUtils$3Snovvdz1T971Cb8RjKZY_gjGo4.INSTANCE;
    }

    public static <V, T, R> CheckedFunction<V, R> compose(CheckedFunction<? super T, ? extends R> checkedFunction, CheckedFunction<? super V, ? extends T> checkedFunction2) {
        Objects.requireNonNull(checkedFunction2);
        return new CheckedFunction(checkedFunction2) {
            public final /* synthetic */ CheckedFunction f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return CheckedFunction.this.apply(this.f$1.apply(obj));
            }
        };
    }

    public static <V, T, R> CheckedFunction<T, V> andThen(CheckedFunction<? super T, ? extends R> checkedFunction, CheckedFunction<? super R, ? extends V> checkedFunction2) {
        Objects.requireNonNull(checkedFunction2);
        return new CheckedFunction(checkedFunction) {
            public final /* synthetic */ CheckedFunction f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return CheckedFunction.this.apply(this.f$1.apply(obj));
            }
        };
    }
}
