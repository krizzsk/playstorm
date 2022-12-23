package com.smaato.sdk.core.util;

import com.smaato.sdk.core.util.p382fi.CheckedRunnable;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Function;
import java.util.Arrays;
import java.util.Map;

public final class Objects {
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static <T> T notNull(T t, T t2) {
        return t != null ? t : t2;
    }

    private Objects() {
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(Object... objArr) {
        if (objArr.length != 1) {
            return Arrays.hashCode(objArr);
        }
        Object obj = objArr[0];
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean notEquals(Object obj, Object obj2) {
        return !equals(obj, obj2);
    }

    public static <T> T requireNonNull(T t) {
        return requireNonNull(t, (String) null);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static <T> void onNotNull(T t, Consumer<T> consumer) {
        requireNonNull(consumer);
        if (t != null) {
            consumer.accept(t);
        }
    }

    public static <T, R> R transformOrNull(T t, Function<T, R> function) {
        requireNonNull(function);
        if (t != null) {
            return function.apply(t);
        }
        return null;
    }

    public static void doSilently(CheckedRunnable checkedRunnable) {
        if (checkedRunnable != null) {
            try {
                checkedRunnable.run();
            } catch (Exception unused) {
            }
        }
    }

    public static int getIntValueFromMap(Map<String, Integer> map, String str) {
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
