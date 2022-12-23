package com.bytedance.sdk.openadsdk.p135c;

import android.util.SparseArray;
import com.bytedance.sdk.component.utils.C2975l;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.openadsdk.c.a */
/* compiled from: BaseHook */
public abstract class C3214a implements C3216c {

    /* renamed from: a */
    private SparseArray<Method> f7603a;

    /* renamed from: b */
    private Object f7604b;

    /* renamed from: a */
    public abstract String mo18866a();

    /* renamed from: a */
    public <T> T mo18865a(int i, Object... objArr) {
        Object obj;
        Method method = this.f7603a.get(i);
        if (method == null || (obj = this.f7604b) == null) {
            String a = mo18866a();
            C2975l.m8390d(a, "call method " + i + " failed for null ");
            return null;
        }
        try {
            if (obj instanceof Class) {
                return method.invoke((Object) null, objArr);
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            String a2 = mo18866a();
            C2975l.m8390d(a2, "call method " + i + " failed: " + th.getMessage());
            return null;
        }
    }
}
