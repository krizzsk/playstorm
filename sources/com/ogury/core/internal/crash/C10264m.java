package com.ogury.core.internal.crash;

import android.content.Context;
import com.facebook.share.internal.ShareInternalUtility;
import com.ogury.core.internal.C10212ab;
import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.C10233au;
import java.io.File;
import java.io.PrintWriter;
import org.json.JSONArray;

/* renamed from: com.ogury.core.internal.crash.m */
/* compiled from: FileStore.kt */
public final class C10264m {

    /* renamed from: a */
    private final File f26059a;

    static {
        new C10265a((byte) 0);
    }

    public C10264m(Context context) {
        C10219ai.m31036b(context, "context");
        File file = new File(context.getFilesDir(), "oguryCrashDir");
        this.f26059a = file;
        file.mkdirs();
    }

    /* renamed from: com.ogury.core.internal.crash.m$a */
    /* compiled from: FileStore.kt */
    public static final class C10265a {
        private C10265a() {
        }

        public /* synthetic */ C10265a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo66834a(String str) {
        C10219ai.m31036b(str, "sdkKey");
        new File(this.f26059a, m31106d(str)).createNewFile();
        new File(this.f26059a, m31107e(str)).createNewFile();
    }

    /* renamed from: d */
    private static String m31106d(String str) {
        return "crash_" + str;
    }

    /* renamed from: e */
    private static String m31107e(String str) {
        return "crash_level_two_crashes_" + str;
    }

    /* renamed from: a */
    public static void m31104a(File file) {
        C10219ai.m31036b(file, ShareInternalUtility.STAGING_PARAM);
        try {
            new PrintWriter(file).print("");
        } catch (Exception e) {
            C10256i iVar = C10256i.f26043a;
            C10256i.m31098a(e);
        }
    }

    /* renamed from: b */
    public final File mo66835b(String str) {
        C10219ai.m31036b(str, "sdkKey");
        return new File(this.f26059a, m31107e(str));
    }

    /* renamed from: c */
    public final File mo66836c(String str) {
        C10219ai.m31036b(str, "sdkKey");
        return new File(this.f26059a, m31106d(str));
    }

    /* renamed from: a */
    public final File mo66833a(String str, int i) {
        C10219ai.m31036b(str, "sdkKey");
        if (i == 1) {
            return mo66836c(str);
        }
        if (i == 2) {
            return mo66835b(str);
        }
        return null;
    }

    /* renamed from: b */
    public static JSONArray m31105b(File file) throws Exception {
        C10219ai.m31036b(file, ShareInternalUtility.STAGING_PARAM);
        try {
            return new JSONArray(C10212ab.m31025a(file, C10233au.f26004a));
        } catch (Exception e) {
            C10256i iVar = C10256i.f26043a;
            C10256i.m31098a(e);
            return new JSONArray();
        }
    }
}
