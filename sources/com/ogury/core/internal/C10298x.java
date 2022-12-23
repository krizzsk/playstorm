package com.ogury.core.internal;

import java.lang.reflect.Method;

/* renamed from: com.ogury.core.internal.x */
/* compiled from: PlatformImplementations.kt */
public class C10298x {

    /* renamed from: com.ogury.core.internal.x$a */
    /* compiled from: PlatformImplementations.kt */
    static final class C10299a {

        /* renamed from: a */
        public static final Method f26094a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r6v6 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
            if (com.ogury.core.internal.C10219ai.m31035a((java.lang.Object) (java.lang.Class) r6, (java.lang.Object) r0) != false) goto L_0x0047;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                com.ogury.core.internal.x$a r0 = new com.ogury.core.internal.x$a
                r0.<init>()
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                com.ogury.core.internal.C10219ai.m31034a((java.lang.Object) r1, (java.lang.String) r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x0013:
                java.lang.String r5 = "it"
                r6 = 0
                if (r4 >= r2) goto L_0x004e
                r7 = r1[r4]
                com.ogury.core.internal.C10219ai.m31034a((java.lang.Object) r7, (java.lang.String) r5)
                java.lang.String r8 = r7.getName()
                java.lang.String r9 = "addSuppressed"
                boolean r8 = com.ogury.core.internal.C10219ai.m31035a((java.lang.Object) r8, (java.lang.Object) r9)
                r9 = 1
                if (r8 == 0) goto L_0x0046
                java.lang.Class[] r8 = r7.getParameterTypes()
                java.lang.String r10 = "it.parameterTypes"
                com.ogury.core.internal.C10219ai.m31034a((java.lang.Object) r8, (java.lang.String) r10)
                java.lang.String r10 = "$this$singleOrNull"
                com.ogury.core.internal.C10219ai.m31036b(r8, r10)
                int r10 = r8.length
                if (r10 != r9) goto L_0x003d
                r6 = r8[r3]
            L_0x003d:
                java.lang.Class r6 = (java.lang.Class) r6
                boolean r6 = com.ogury.core.internal.C10219ai.m31035a((java.lang.Object) r6, (java.lang.Object) r0)
                if (r6 == 0) goto L_0x0046
                goto L_0x0047
            L_0x0046:
                r9 = r3
            L_0x0047:
                if (r9 == 0) goto L_0x004b
                r6 = r7
                goto L_0x004e
            L_0x004b:
                int r4 = r4 + 1
                goto L_0x0013
            L_0x004e:
                f26094a = r6
                int r0 = r1.length
            L_0x0051:
                if (r3 >= r0) goto L_0x0067
                r2 = r1[r3]
                com.ogury.core.internal.C10219ai.m31034a((java.lang.Object) r2, (java.lang.String) r5)
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = com.ogury.core.internal.C10219ai.m31035a((java.lang.Object) r2, (java.lang.Object) r4)
                if (r2 != 0) goto L_0x0067
                int r3 = r3 + 1
                goto L_0x0051
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogury.core.internal.C10298x.C10299a.<clinit>():void");
        }

        private C10299a() {
        }
    }

    /* renamed from: a */
    public void mo66933a(Throwable th, Throwable th2) {
        C10219ai.m31036b(th, "cause");
        C10219ai.m31036b(th2, "exception");
        Method method = C10299a.f26094a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }
}
