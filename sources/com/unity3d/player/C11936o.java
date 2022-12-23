package com.unity3d.player;

import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: com.unity3d.player.o */
final class C11936o {

    /* renamed from: a */
    private HashMap f29233a = new HashMap();

    /* renamed from: b */
    private Class f29234b = null;

    /* renamed from: c */
    private Object f29235c = null;

    /* renamed from: com.unity3d.player.o$a */
    class C11937a {

        /* renamed from: a */
        public Class[] f29236a;

        /* renamed from: b */
        public Method f29237b = null;

        public C11937a(Class[] clsArr) {
            this.f29236a = clsArr;
        }
    }

    public C11936o(Class cls, Object obj) {
        this.f29234b = cls;
        this.f29235c = obj;
    }

    /* renamed from: a */
    private void m34569a(String str, C11937a aVar) {
        try {
            aVar.f29237b = this.f29234b.getMethod(str, aVar.f29236a);
        } catch (Exception e) {
            C11922g.Log(6, "Exception while trying to get method " + str + ". " + e.getLocalizedMessage());
            aVar.f29237b = null;
        }
    }

    /* renamed from: a */
    public final Object mo73078a(String str, Object... objArr) {
        StringBuilder sb;
        if (!this.f29233a.containsKey(str)) {
            sb = new StringBuilder("No definition for method ");
            sb.append(str);
            str = " can be found";
        } else {
            C11937a aVar = (C11937a) this.f29233a.get(str);
            if (aVar.f29237b == null) {
                m34569a(str, aVar);
            }
            if (aVar.f29237b == null) {
                sb = new StringBuilder("Unable to create method: ");
            } else {
                try {
                    return objArr.length == 0 ? aVar.f29237b.invoke(this.f29235c, new Object[0]) : aVar.f29237b.invoke(this.f29235c, objArr);
                } catch (Exception e) {
                    C11922g.Log(6, "Error trying to call delegated method " + str + ". " + e.getLocalizedMessage());
                    return null;
                }
            }
        }
        sb.append(str);
        C11922g.Log(6, sb.toString());
        return null;
    }

    /* renamed from: a */
    public final void mo73079a(String str, Class[] clsArr) {
        this.f29233a.put(str, new C11937a(clsArr));
    }
}
