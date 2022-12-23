package com.bytedance.sdk.component.widget.p127a;

/* renamed from: com.bytedance.sdk.component.widget.a.a */
/* compiled from: BaseAdapterInstance */
public class C2995a {

    /* renamed from: b */
    private static volatile C2995a f6786b;

    /* renamed from: a */
    private volatile C2996b f6787a;

    private C2995a() {
    }

    /* renamed from: a */
    public static C2995a m8507a() {
        if (f6786b == null) {
            synchronized (C2995a.class) {
                if (f6786b == null) {
                    f6786b = new C2995a();
                }
            }
        }
        return f6786b;
    }

    /* renamed from: a */
    public void mo17995a(C2996b bVar) {
        this.f6787a = bVar;
    }

    /* renamed from: b */
    public C2996b mo17996b() {
        return this.f6787a;
    }
}
