package com.ogury.core.internal.crash;

import com.ogury.core.internal.C10219ai;

/* renamed from: com.ogury.core.internal.crash.o */
/* compiled from: PhoneInfo.kt */
public final class C10267o {

    /* renamed from: a */
    public static final C10268a f26061a = new C10268a((byte) 0);

    /* renamed from: b */
    private final String f26062b;

    /* renamed from: c */
    private final String f26063c;

    /* renamed from: d */
    private final C10269p f26064d;

    /* renamed from: com.ogury.core.internal.crash.o$a */
    /* compiled from: PhoneInfo.kt */
    public static final class C10268a {
        private C10268a() {
        }

        public /* synthetic */ C10268a(byte b) {
            this();
        }
    }

    public C10267o(String str, String str2, C10269p pVar) {
        C10219ai.m31036b(str, "phoneModel");
        C10219ai.m31036b(str2, "androidVersion");
        C10219ai.m31036b(pVar, "memory");
        this.f26062b = str;
        this.f26063c = str2;
        this.f26064d = pVar;
    }

    /* renamed from: a */
    public final String mo66838a() {
        return this.f26062b;
    }

    /* renamed from: b */
    public final String mo66839b() {
        return this.f26063c;
    }

    /* renamed from: c */
    public final C10269p mo66840c() {
        return this.f26064d;
    }
}
