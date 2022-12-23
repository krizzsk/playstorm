package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.w */
/* compiled from: Thread.kt */
public class C10296w {

    /* renamed from: a */
    private final int f26091a;

    /* renamed from: b */
    private final String f26092b;

    /* renamed from: com.ogury.core.internal.w$a */
    /* compiled from: Thread.kt */
    public static final class C10297a extends Thread {

        /* renamed from: a */
        private /* synthetic */ C10215ae f26093a;

        C10297a(C10215ae aeVar) {
            this.f26093a = aeVar;
        }

        public final void run() {
            this.f26093a.mo66778a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Thread m31136a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, C10215ae<C10277g> aeVar) {
        C10219ai.m31036b(aeVar, "block");
        C10297a aVar = new C10297a(aeVar);
        if (z2) {
            aVar.setDaemon(true);
        }
        if (i > 0) {
            aVar.setPriority(i);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar.start();
        }
        return aVar;
    }

    /* renamed from: a */
    public int mo66930a() {
        return this.f26091a;
    }

    /* renamed from: b */
    public String mo66931b() {
        return this.f26092b;
    }

    public C10296w(int i, String str) {
        C10219ai.m31036b(str, "name");
        this.f26091a = i;
        this.f26092b = str;
    }
}
