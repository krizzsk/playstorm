package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.hu */
public abstract class C11738hu {

    /* renamed from: a */
    protected static C11739a f28592a;

    /* renamed from: b */
    private static C11738hu f28593b;

    /* renamed from: com.tapjoy.internal.hu$a */
    public static class C11739a {

        /* renamed from: a */
        public final String f28594a;

        /* renamed from: b */
        public final String f28595b;

        /* renamed from: c */
        public final C11630fk f28596c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo72524a(C11739a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo72525b();

    /* renamed from: a */
    public static void m34109a(C11738hu huVar) {
        synchronized (C11738hu.class) {
            f28593b = huVar;
            C11739a aVar = f28592a;
            if (aVar != null) {
                f28592a = null;
                huVar.mo72524a(aVar);
            }
        }
    }

    /* renamed from: c */
    public static boolean m34110c() {
        C11738hu huVar = f28593b;
        if (huVar != null && huVar.mo72525b()) {
            return true;
        }
        C11739a aVar = f28592a;
        if (aVar == null || aVar.f28596c.mo72492a()) {
            return false;
        }
        return true;
    }
}
