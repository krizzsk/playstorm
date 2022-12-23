package com.ogury.p375cm.internal;

import android.content.Context;
import java.io.Serializable;

/* renamed from: com.ogury.cm.internal.bbacb */
public final class bbacb {

    /* renamed from: com.ogury.cm.internal.bbacb$aaaaa */
    public static final class aaaaa implements Serializable {

        /* renamed from: a */
        public boolean f25923a;

        public final String toString() {
            return String.valueOf(this.f25923a);
        }
    }

    /* renamed from: com.ogury.cm.internal.bbacb$aaaab */
    public static final class aaaab<T> implements Serializable {

        /* renamed from: a */
        public T f25924a;

        public final String toString() {
            return String.valueOf(this.f25924a);
        }
    }

    /* renamed from: a */
    public static boolean m30944a(Context context) {
        bbabc.m30943b(context, "context");
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
