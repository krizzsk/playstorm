package com.ogury.core.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: com.ogury.core.internal.e */
/* compiled from: OguryTokenManager.kt */
public final class C10274e {

    /* renamed from: a */
    private final SharedPreferences f26073a;

    static {
        new C10275a((byte) 0);
    }

    public C10274e(Context context) {
        C10219ai.m31036b(context, "context");
        this.f26073a = context.getSharedPreferences("ogury_core_token_file", 0);
    }

    /* renamed from: com.ogury.core.internal.e$a */
    /* compiled from: OguryTokenManager.kt */
    public static final class C10275a {
        private C10275a() {
        }

        public /* synthetic */ C10275a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo66847a(String str) {
        C10219ai.m31036b(str, "keyName");
        String string = this.f26073a.getString(str, (String) null);
        CharSequence charSequence = string;
        if (!(charSequence == null || charSequence.length() == 0)) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        C10219ai.m31034a((Object) uuid, "UUID.randomUUID().toString()");
        C10219ai.m31036b(str, "keyName");
        C10219ai.m31036b(uuid, "keyValue");
        this.f26073a.edit().putString(str, uuid).apply();
        return uuid;
    }
}
