package com.ogury.p376ed.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: com.ogury.ed.internal.hu */
public final class C10606hu {

    /* renamed from: a */
    public static final C10607a f26765a = new C10607a((byte) 0);

    /* renamed from: b */
    private final Context f26766b;

    /* renamed from: c */
    private final SharedPreferences f26767c;

    public C10606hu(Context context) {
        C10765mq.m32773b(context, "context");
        this.f26766b = context;
        this.f26767c = context.getSharedPreferences("PERSISTED_SETS", 0);
    }

    /* renamed from: com.ogury.ed.internal.hu$a */
    public static final class C10607a {
        public /* synthetic */ C10607a(byte b) {
            this();
        }

        private C10607a() {
        }
    }

    /* renamed from: a */
    public final boolean mo67574a(String str) {
        C10765mq.m32773b(str, "identifier");
        Set<String> stringSet = this.f26767c.getStringSet("shortcutIdentifierList", (Set) null);
        if (stringSet == null) {
            return false;
        }
        return stringSet.contains(str);
    }

    /* renamed from: a */
    public final String mo67573a(String str, String str2) {
        C10765mq.m32773b(str, "id");
        C10765mq.m32773b(str2, "argsJson");
        this.f26767c.edit().putString(C10765mq.m32765a("argsJson:", (Object) str), str2).apply();
        return str;
    }

    /* renamed from: b */
    public final String mo67575b(String str) {
        C10765mq.m32773b(str, "id");
        String string = this.f26767c.getString(C10765mq.m32765a("argsJson:", (Object) str), "");
        return string == null ? "" : string;
    }

    /* renamed from: c */
    public final boolean mo67576c(String str) {
        C10765mq.m32773b(str, "id");
        String string = this.f26767c.getString(C10765mq.m32765a("argsJson:", (Object) str), "");
        return string != null && string.length() > 0;
    }
}
