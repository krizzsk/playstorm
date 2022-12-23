package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.p048c.C1860e;

/* renamed from: com.applovin.impl.sdk.j */
public class C1944j {

    /* renamed from: a */
    private static final C1945a f3616a = new C1945a("Age Restricted User", C1859d.f3351l);

    /* renamed from: b */
    private static final C1945a f3617b = new C1945a("Has User Consent", C1859d.f3350k);

    /* renamed from: c */
    private static final C1945a f3618c = new C1945a("\"Do Not Sell\"", C1859d.f3352m);

    /* renamed from: com.applovin.impl.sdk.j$a */
    public static class C1945a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f3619a;

        /* renamed from: b */
        private final C1859d<Boolean> f3620b;

        C1945a(String str, C1859d<Boolean> dVar) {
            this.f3619a = str;
            this.f3620b = dVar;
        }

        /* renamed from: a */
        public Boolean mo14266a(Context context) {
            if (context != null) {
                return (Boolean) C1860e.m4046b(this.f3620b, null, context);
            }
            if (C2092v.m5047a()) {
                C2092v.m5053i("AppLovinSdk", "Failed to get value for key: " + this.f3620b);
            }
            return null;
        }

        /* renamed from: a */
        public String mo14267a() {
            return this.f3619a;
        }

        /* renamed from: b */
        public String mo14268b(Context context) {
            Boolean a = mo14266a(context);
            return a != null ? a.toString() : "No value set";
        }
    }

    /* renamed from: a */
    public static C1945a m4361a() {
        return f3616a;
    }

    /* renamed from: a */
    public static String m4362a(Context context) {
        return m4363a(f3616a, context) + m4363a(f3617b, context) + m4363a(f3618c, context);
    }

    /* renamed from: a */
    private static String m4363a(C1945a aVar, Context context) {
        return "\n" + aVar.f3619a + " - " + aVar.mo14268b(context);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.applovin.impl.sdk.c.d, java.lang.Object, com.applovin.impl.sdk.c.d<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m4364a(com.applovin.impl.sdk.p048c.C1859d<java.lang.Boolean> r2, java.lang.Boolean r3, android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0020
            boolean r3 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r3 == 0) goto L_0x001f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to update compliance value for key: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AppLovinSdk"
            com.applovin.impl.sdk.C2092v.m5053i(r3, r2)
        L_0x001f:
            return r0
        L_0x0020:
            r1 = 0
            java.lang.Object r1 = com.applovin.impl.sdk.p048c.C1860e.m4046b(r2, r1, (android.content.Context) r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            com.applovin.impl.sdk.p048c.C1860e.m4044a(r2, r3, (android.content.Context) r4)
            r2 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0030
            r0 = r2
        L_0x0030:
            return r0
        L_0x0031:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1944j.m4364a(com.applovin.impl.sdk.c.d, java.lang.Boolean, android.content.Context):boolean");
    }

    /* renamed from: a */
    public static boolean m4365a(boolean z, Context context) {
        return m4364a(C1859d.f3351l, Boolean.valueOf(z), context);
    }

    /* renamed from: b */
    public static C1945a m4366b() {
        return f3617b;
    }

    /* renamed from: b */
    public static boolean m4367b(boolean z, Context context) {
        return m4364a(C1859d.f3350k, Boolean.valueOf(z), context);
    }

    /* renamed from: c */
    public static C1945a m4368c() {
        return f3618c;
    }

    /* renamed from: c */
    public static boolean m4369c(boolean z, Context context) {
        return m4364a(C1859d.f3352m, Boolean.valueOf(z), context);
    }
}
