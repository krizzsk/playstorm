package com.ogury.p376ed.internal;

import android.os.Looper;
import com.ogury.core.internal.network.OguryNetworkException;

/* renamed from: com.ogury.ed.internal.gl */
public final class C10559gl {
    /* renamed from: a */
    public static final void m32093a(Throwable th) {
        C10765mq.m32773b(th, "<this>");
    }

    /* renamed from: b */
    public static final boolean m32094b(Throwable th) {
        C10765mq.m32773b(th, "<this>");
        return (th instanceof OguryNetworkException) || (th instanceof C10499eq);
    }

    /* renamed from: a */
    public static final void m32092a(String str) {
        C10765mq.m32773b(str, "methodName");
        if (C10765mq.m32772a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            m32093a((Throwable) new IllegalStateException(C10765mq.m32765a(str, (Object) " cannot be called from the main thread")));
        }
    }
}
