package com.bytedance.sdk.component.p110d.p113c.p118c;

import java.io.Closeable;

/* renamed from: com.bytedance.sdk.component.d.c.c.b */
/* compiled from: IOUtils */
public class C2868b {
    /* renamed from: a */
    public static void m7999a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
