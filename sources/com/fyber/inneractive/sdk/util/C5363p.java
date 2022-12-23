package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.fyber.inneractive.sdk.util.p */
public class C5363p {
    /* renamed from: a */
    public static boolean m16775a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        try {
            return !context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0).isEmpty();
        } catch (Exception unused) {
            IAlog.m16699a("%sFyberDeepLink: Invalid url ", uri);
            return false;
        }
    }
}
