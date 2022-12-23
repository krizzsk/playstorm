package com.ironsource.sdk.controller;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C8252x;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* renamed from: com.ironsource.sdk.controller.d */
class C8190d {

    /* renamed from: b */
    private static final String f19553b = C8190d.class.getSimpleName();

    /* renamed from: a */
    final C8252x.C8275d f19554a;

    C8190d(C8252x.C8275d dVar) {
        this.f19554a = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo56510a(String str, String str2) {
        if (this.f19554a == null) {
            Logger.m24026e(f19553b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = C8252x.C8275d.class.getDeclaredMethod(str, new Class[]{String.class});
        if (Build.VERSION.SDK_INT >= 17) {
            if (!declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
                throw new AccessControlException("Trying to access a private function: " + str);
            }
        }
        declaredMethod.invoke(this.f19554a, new Object[]{str2});
    }
}
