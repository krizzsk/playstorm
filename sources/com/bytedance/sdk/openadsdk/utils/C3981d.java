package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3925d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.utils.d */
/* compiled from: CommonPermissionUtils */
public class C3981d {

    /* renamed from: a */
    private static final Map<String, C3984a> f10212a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static IListenerManager f10213b;

    /* renamed from: com.bytedance.sdk.openadsdk.utils.d$a */
    /* compiled from: CommonPermissionUtils */
    public interface C3984a {
        /* renamed from: a */
        void mo20906a();

        /* renamed from: a */
        void mo20907a(String str);
    }

    /* renamed from: a */
    public static void m13044a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C3953b.m12901c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            C2975l.m8384b("MultiProcess", "handleYes-1，key=" + str);
                            C3981d.m13046b().broadcastPermissionListener(str, (String) null);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            C3984a b = m13047b(str);
            if (b != null) {
                b.mo20906a();
            }
        }
    }

    /* renamed from: a */
    public static void m13045a(final String str, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (C3953b.m12901c()) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            C2975l.m8384b("MultiProcess", "handleNo-1，key=" + str + "，permission=" + str2);
                            C3981d.m13046b().broadcastPermissionListener(str, str2);
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
                return;
            }
            C3984a b = m13047b(str);
            if (b != null) {
                b.mo20907a(str2);
            }
        }
    }

    /* renamed from: b */
    private static C3984a m13047b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f10212a.remove(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static IListenerManager m13046b() {
        if (f10213b == null) {
            f10213b = C3925d.asInterface(C3917a.m12866a(C3578m.m11231a()).mo20811a(4));
        }
        return f10213b;
    }
}
