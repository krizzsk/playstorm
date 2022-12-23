package com.ogury.core.internal.crash;

import android.content.Context;
import android.content.SharedPreferences;
import com.ogury.core.internal.C10219ai;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ogury.core.internal.crash.f */
/* compiled from: CrashReportDao.kt */
public final class C10252f {

    /* renamed from: a */
    private final SharedPreferences f26036a;

    static {
        new C10253a((byte) 0);
    }

    public C10252f(Context context) {
        C10219ai.m31036b(context, "context");
        this.f26036a = context.getSharedPreferences("crash_report", 0);
    }

    /* renamed from: com.ogury.core.internal.crash.f$a */
    /* compiled from: CrashReportDao.kt */
    public static final class C10253a {
        private C10253a() {
        }

        public /* synthetic */ C10253a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo66820a(String str, String str2) {
        C10219ai.m31036b(str, "sdkKey");
        C10219ai.m31036b(str2, "uploadUrl");
        this.f26036a.edit().putString(m31081e(str), str2).apply();
    }

    /* renamed from: a */
    public final String mo66818a(String str) {
        C10219ai.m31036b(str, "sdkKey");
        String string = this.f26036a.getString(m31081e(str), "");
        return string == null ? "" : string;
    }

    /* renamed from: e */
    private static String m31081e(String str) {
        return "url_" + str;
    }

    /* renamed from: a */
    public final void mo66821a(String str, boolean z) {
        C10219ai.m31036b(str, "sdkKey");
        this.f26036a.edit().putBoolean(m31082f(str), z).apply();
    }

    /* renamed from: b */
    public final boolean mo66823b(String str) {
        C10219ai.m31036b(str, "sdkKey");
        return this.f26036a.getBoolean(m31082f(str), false);
    }

    /* renamed from: f */
    private static String m31082f(String str) {
        return "sdk_state_" + str;
    }

    /* renamed from: b */
    public final void mo66822b(String str, String str2) {
        C10219ai.m31036b(str, "packageName");
        C10219ai.m31036b(str2, "sdkKey");
        this.f26036a.edit().putString(m31083g(str), str2).apply();
    }

    /* renamed from: c */
    public final String mo66824c(String str) {
        C10219ai.m31036b(str, "packageName");
        return this.f26036a.getString(m31083g(str), (String) null);
    }

    /* renamed from: g */
    private static String m31083g(String str) {
        return "package_" + str;
    }

    /* renamed from: d */
    public final void mo66825d(String str) {
        C10219ai.m31036b(str, "packageName");
        Set<String> a = mo66819a();
        if (a == null) {
            a = new LinkedHashSet<>();
        }
        if (!a.contains(str)) {
            a.add(str);
            this.f26036a.edit().putStringSet("sdk_packages", a).apply();
        }
    }

    /* renamed from: a */
    public final Set<String> mo66819a() {
        return this.f26036a.getStringSet("sdk_packages", (Set) null);
    }
}
