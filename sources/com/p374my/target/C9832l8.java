package com.p374my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.my.target.l8 */
public class C9832l8 {
    /* renamed from: a */
    public static void m28605a(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            C9672e0.m27882a("Unable to open link: " + th.getMessage());
        }
    }
}
