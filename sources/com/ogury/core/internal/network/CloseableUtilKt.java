package com.ogury.core.internal.network;

import com.ogury.core.internal.C10219ai;
import java.io.Closeable;

/* compiled from: CloseableUtil.kt */
public final class CloseableUtilKt {
    public static final void closeSafely(Closeable closeable) {
        C10219ai.m31036b(closeable, "$this$closeSafely");
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }
}
