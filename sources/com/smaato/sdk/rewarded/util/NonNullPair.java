package com.smaato.sdk.rewarded.util;

import android.util.Pair;
import com.smaato.sdk.core.util.Objects;

public class NonNullPair<T1, T2> extends Pair<T1, T2> {
    public NonNullPair(T1 t1, T2 t2) {
        super(Objects.requireNonNull(t1), Objects.requireNonNull(t2));
    }
}
