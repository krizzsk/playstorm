package com.bytedance.sdk.component.p120e.p124d;

/* renamed from: com.bytedance.sdk.component.e.d.b */
/* compiled from: Logger */
public class C2933b {

    /* renamed from: a */
    private C2935a f6668a;

    /* renamed from: b */
    private C2936b f6669b;

    /* renamed from: com.bytedance.sdk.component.e.d.b$a */
    /* compiled from: Logger */
    public enum C2935a {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* renamed from: com.bytedance.sdk.component.e.d.b$b */
    /* compiled from: Logger */
    public interface C2936b {
        /* renamed from: a */
        void mo17845a(String str, String str2);

        /* renamed from: b */
        void mo17846b(String str, String str2);
    }

    /* renamed from: com.bytedance.sdk.component.e.d.b$c */
    /* compiled from: Logger */
    private static class C2937c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2933b f6675a = new C2933b();
    }

    private C2933b() {
        this.f6668a = C2935a.OFF;
        this.f6669b = new C2932a();
    }

    /* renamed from: a */
    public static void m8264a(C2935a aVar) {
        synchronized (C2933b.class) {
            C2937c.f6675a.f6668a = aVar;
        }
    }

    /* renamed from: a */
    public static void m8265a(String str, String str2) {
        if (C2937c.f6675a.f6668a.compareTo(C2935a.ERROR) <= 0) {
            C2937c.f6675a.f6669b.mo17845a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m8266b(String str, String str2) {
        if (C2937c.f6675a.f6668a.compareTo(C2935a.DEBUG) <= 0) {
            C2937c.f6675a.f6669b.mo17846b(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0026;
            case 56: goto L_0x0026;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b1655274989200dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0026;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p120e.p124d.C2933b.b1655274989200dc(java.lang.String):java.lang.String");
    }
}
