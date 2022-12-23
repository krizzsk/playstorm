package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;

/* renamed from: com.bytedance.sdk.openadsdk.utils.o */
/* compiled from: SlotUtils */
public class C4008o {
    /* renamed from: a */
    public static boolean m13154a(C3498n nVar) {
        int e;
        if (nVar == null || (e = C4014u.m13219e(nVar)) == 8 || e == 7 || nVar.mo19604G() == null || Build.VERSION.SDK_INT > 27) {
            return false;
        }
        return true;
    }
}
