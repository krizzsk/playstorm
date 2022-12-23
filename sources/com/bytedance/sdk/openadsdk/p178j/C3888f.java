package com.bytedance.sdk.openadsdk.p178j;

/* renamed from: com.bytedance.sdk.openadsdk.j.f */
/* compiled from: PlayableLog */
public class C3888f {

    /* renamed from: a */
    private static C3889a f10017a;

    /* renamed from: com.bytedance.sdk.openadsdk.j.f$a */
    /* compiled from: PlayableLog */
    public interface C3889a {
        /* renamed from: a */
        void mo18560a(String str, String str2);

        /* renamed from: a */
        void mo18561a(String str, String str2, Throwable th);
    }

    /* renamed from: a */
    public static void m12720a(C3889a aVar) {
        f10017a = aVar;
    }

    /* renamed from: a */
    public static boolean m12723a() {
        return f10017a != null;
    }

    /* renamed from: a */
    public static void m12721a(String str, String str2) {
        C3889a aVar = f10017a;
        if (aVar != null) {
            aVar.mo18560a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m12722a(String str, String str2, Throwable th) {
        if (f10017a != null) {
            if (th == null) {
                th = new Throwable();
            }
            f10017a.mo18561a(str, str2, th);
        }
    }
}
