package com.ogury.core.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.core.internal.d */
/* compiled from: SdkType.kt */
public final class C10272d {

    /* renamed from: a */
    public static final C10273a f26071a = new C10273a((byte) 0);

    /* renamed from: b */
    private final SharedPreferences f26072b;

    public C10272d(Context context) {
        C10219ai.m31036b(context, "context");
        this.f26072b = context.getSharedPreferences("ogury_core_sdk_type_file", 0);
    }

    /* renamed from: com.ogury.core.internal.d$a */
    /* compiled from: SdkType.kt */
    public static final class C10273a {
        private C10273a() {
        }

        public /* synthetic */ C10273a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C10272d m31123a(Context context) {
            C10219ai.m31036b(context, "context");
            return new C10272d(context);
        }
    }

    /* renamed from: a */
    public final void mo66846a(int i) {
        this.f26072b.edit().putInt(TapjoyConstants.TJC_SDK_TYPE, i).apply();
    }

    /* renamed from: a */
    public final int mo66845a() {
        return this.f26072b.getInt(TapjoyConstants.TJC_SDK_TYPE, 0);
    }
}
