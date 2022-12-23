package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3924c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.utils.c */
/* compiled from: CommonDialogHelper */
public class C3978c {

    /* renamed from: a */
    private static final Map<String, C3980a> f10208a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static IListenerManager f10209b;

    /* renamed from: com.bytedance.sdk.openadsdk.utils.c$a */
    /* compiled from: CommonDialogHelper */
    public interface C3980a {
        /* renamed from: a */
        void mo20901a();

        /* renamed from: b */
        void mo20902b();

        /* renamed from: c */
        void mo20903c();
    }

    /* renamed from: a */
    public static void m13034a(String str) {
        m13035a(str, 1);
    }

    /* renamed from: b */
    public static void m13037b(String str) {
        m13035a(str, 2);
    }

    /* renamed from: c */
    public static void m13038c(String str) {
        m13035a(str, 3);
    }

    /* renamed from: d */
    public static C3980a m13039d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f10208a.remove(str);
    }

    /* renamed from: a */
    private static void m13035a(final String str, final int i) {
        if (!TextUtils.isEmpty(str)) {
            if (C3953b.m12901c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            C3978c.m13036b().broadcastDialogListener(str, i);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            C3980a d = m13039d(str);
            if (d != null) {
                if (i == 1) {
                    d.mo20901a();
                } else if (i == 2) {
                    d.mo20902b();
                } else if (i != 3) {
                    d.mo20903c();
                } else {
                    d.mo20903c();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static IListenerManager m13036b() {
        if (f10209b == null) {
            f10209b = C3924c.asInterface(C3917a.m12866a(C3578m.m11231a()).mo20811a(2));
        }
        return f10209b;
    }
}
