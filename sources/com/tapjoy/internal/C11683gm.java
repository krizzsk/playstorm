package com.tapjoy.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;

/* renamed from: com.tapjoy.internal.gm */
public class C11683gm extends Observable {

    /* renamed from: b */
    public final List<C11684a> f28432b = new ArrayList();

    /* renamed from: com.tapjoy.internal.gm$a */
    public class C11684a {

        /* renamed from: a */
        public final String f28433a;

        /* renamed from: b */
        public volatile Map<String, Object> f28434b;

        C11684a(String str) {
            this.f28433a = str;
        }

        /* renamed from: a */
        public final Object mo72581a(String str) {
            Map<String, Object> map = this.f28434b;
            if (map != null) {
                return map.get(str);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11684a mo72576a(String str) {
        C11684a aVar = new C11684a(str);
        this.f28432b.add(aVar);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void setChanged() {
        super.setChanged();
        notifyObservers();
    }

    /* renamed from: a */
    public final boolean mo72577a(String str, boolean z) {
        for (C11684a a : this.f28432b) {
            Object a2 = a.mo72581a(str);
            if (a2 != null) {
                if (a2 instanceof Boolean) {
                    return ((Boolean) a2).booleanValue();
                }
                if (!(a2 instanceof String)) {
                    continue;
                } else if ("true".equals(a2)) {
                    return true;
                } else {
                    if ("false".equals(a2)) {
                        return false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public final long mo72578b(String str) {
        for (C11684a a : this.f28432b) {
            Object a2 = a.mo72581a(str);
            if (a2 != null) {
                if (a2 instanceof Number) {
                    return ((Number) a2).longValue();
                }
                if (a2 instanceof String) {
                    try {
                        return Long.parseLong((String) a2);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static long m33913a(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final C11682gl mo72579c(String str) {
        double parseDouble;
        for (C11684a a : this.f28432b) {
            Object a2 = a.mo72581a(str);
            if (a2 instanceof List) {
                List list = (List) a2;
                try {
                    long a3 = m33913a(list.get(0));
                    long a4 = m33913a(list.get(1));
                    long a5 = m33913a(list.get(2));
                    Object obj = list.get(3);
                    if (obj instanceof Number) {
                        parseDouble = ((Number) obj).doubleValue();
                    } else if (obj instanceof String) {
                        parseDouble = Double.parseDouble((String) obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    return new C11682gl(a3, a4, a5, parseDouble);
                } catch (RuntimeException unused) {
                }
            }
        }
        return C11682gl.f28426a;
    }
}
