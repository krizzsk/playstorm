package com.ogury.p376ed.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.ogury.ed.internal.gz */
public final class C10577gz {

    /* renamed from: a */
    public static final C10577gz f26704a = new C10577gz();

    private C10577gz() {
    }

    /* renamed from: a */
    public static void m32145a(Context context, String str) {
        C10765mq.m32773b(context, "context");
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            try {
                Uri parse = Uri.parse(str);
                C10765mq.m32770a((Object) parse, "uri");
                m32144a(context, parse);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m32147b(Context context, String str) {
        C10765mq.m32773b(context, "context");
        try {
            Intent a = m32142a(str);
            if (a == null) {
                return false;
            }
            m32143a(context, a);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m32148c(Context context, String str) {
        C10765mq.m32773b(context, "context");
        try {
            Intent a = m32142a(str);
            if (a == null) {
                return false;
            }
            return m32146b(context, a);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Intent m32142a(String str) {
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        return Intent.parseUri(str, 0);
    }

    /* renamed from: a */
    private static void m32144a(Context context, Uri uri) {
        m32143a(context, new Intent("android.intent.action.VIEW", uri));
    }

    /* renamed from: a */
    private static void m32143a(Context context, Intent intent) {
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: b */
    private static boolean m32146b(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
