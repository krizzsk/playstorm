package com.tapjoy.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hq */
public abstract class C11734hq {

    /* renamed from: c */
    long f28550c;

    /* renamed from: d */
    boolean f28551d;

    /* renamed from: e */
    public C11703hc f28552e;

    /* renamed from: f */
    public String f28553f;

    /* renamed from: g */
    C11644fs f28554g;

    /* renamed from: a */
    public abstract void mo72591a(C11716hk hkVar, C11652fy fyVar);

    /* renamed from: b */
    public abstract void mo72592b();

    /* renamed from: c */
    public boolean mo72593c() {
        return true;
    }

    /* renamed from: a */
    static void m34095a(Context context, @Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused) {
            }
        }
    }
}
