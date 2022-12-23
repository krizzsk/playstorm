package com.p374my.target;

import android.content.Context;

/* renamed from: com.my.target.w8 */
public class C10023w8 {

    /* renamed from: a */
    public static int f24877a;

    static {
        if (C9864n8.m28843a()) {
            f24877a |= 2;
        }
        if (m29660b()) {
            f24877a |= 1;
        }
    }

    /* renamed from: a */
    public static int m29655a() {
        return f24877a;
    }

    /* renamed from: a */
    public static void m29657a(boolean z) {
        f24877a = z ? f24877a | 16 : f24877a & -17;
    }

    /* renamed from: b */
    public static void m29658b(Context context) {
        C9693f0.m27981b(new Runnable(context) {
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C9993u8.m29506a(this.f$0).mo65567a(C10023w8.f24877a);
            }
        });
    }

    /* renamed from: b */
    public static void m29659b(boolean z) {
        f24877a = z ? f24877a | 32 : f24877a & -33;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        java.lang.Runtime.getRuntime().loadLibrary(com.tapjoy.TapjoyConstants.TJC_PLUGIN_UNITY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m29660b() {
        /*
            r0 = 1
            java.lang.String r1 = "com.unity3d.player.UnityPlayerActivity"
            java.lang.Class.forName(r1)     // Catch:{ all -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0011 }
            java.lang.String r2 = "unity"
            r1.loadLibrary(r2)     // Catch:{ all -> 0x0011 }
            return r0
        L_0x0011:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C10023w8.m29660b():boolean");
    }

    /* renamed from: c */
    public static void m29661c() {
        f24877a |= 8;
    }

    /* renamed from: d */
    public static void m29662d() {
        f24877a |= 4;
    }

    /* renamed from: e */
    public static void m29663e() {
        f24877a |= 64;
    }

    /* renamed from: f */
    public static void m29664f() {
        f24877a |= 128;
    }

    /* renamed from: g */
    public static void m29665g() {
        f24877a &= -3;
    }
}
