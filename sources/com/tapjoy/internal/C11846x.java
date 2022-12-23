package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.x */
public final class C11846x {
    /* renamed from: a */
    public static <V> V m34417a(C11436av<V> avVar) {
        int i = 1;
        while (true) {
            try {
                return avVar.call();
            } catch (OutOfMemoryError e) {
                if (i < 10) {
                    System.gc();
                    i++;
                } else {
                    throw e;
                }
            }
        }
    }
}
