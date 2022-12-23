package com.tapjoy.internal;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.tapjoy.internal.gp */
public final class C11687gp {

    /* renamed from: a */
    static final Logger f28436a = Logger.getLogger(C11687gp.class.getName());

    private C11687gp() {
    }

    /* renamed from: a */
    public static void m33922a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                try {
                    f28436a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    f28436a.log(Level.SEVERE, "IOException should not have been thrown.", e2);
                }
            }
        }
    }
}
