package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.my.tracker.obfuscated.w0 */
public final class C10180w0 {

    /* renamed from: a */
    private static volatile String f25504a;

    /* renamed from: a */
    public static String m30493a(Context context) {
        String str = f25504a;
        if (str == null) {
            synchronized (C10180w0.class) {
                str = f25504a;
                if (str == null) {
                    str = C10121k0.m30104a(context).mo66201i();
                    if (TextUtils.isEmpty(str)) {
                        str = UUID.randomUUID().toString();
                        C10121k0.m30104a(context).mo66206k(str);
                        f25504a = str;
                    }
                }
            }
        }
        return str;
    }
}
