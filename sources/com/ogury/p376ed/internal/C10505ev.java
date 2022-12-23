package com.ogury.p376ed.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.ogury.ed.internal.ev */
public final class C10505ev {

    /* renamed from: a */
    public static final C10506a f26560a = new C10506a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C10505ev f26561c;

    /* renamed from: b */
    private final SharedPreferences f26562b;

    public /* synthetic */ C10505ev(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ogury.ed.internal.ev$a */
    public static final class C10506a {
        public /* synthetic */ C10506a(byte b) {
            this();
        }

        private C10506a() {
        }

        /* renamed from: a */
        public static C10505ev m31852a(Context context) {
            C10765mq.m32773b(context, "context");
            if (C10505ev.f26561c == null) {
                Context applicationContext = context.getApplicationContext();
                C10765mq.m32770a((Object) applicationContext, "context.applicationContext");
                C10505ev.f26561c = new C10505ev(applicationContext, (byte) 0);
            }
            C10505ev c = C10505ev.f26561c;
            C10765mq.m32769a((Object) c);
            return c;
        }
    }

    private C10505ev(Context context) {
        this.f26562b = context.getSharedPreferences("ogury_mraid", 0);
    }

    /* renamed from: a */
    public final void mo67333a(String str) {
        C10765mq.m32773b(str, "mraidJs");
        this.f26562b.edit().putString("mraid_js", str).commit();
    }

    /* renamed from: b */
    public final void mo67335b(String str) {
        C10765mq.m32773b(str, "mraidDownloadUrl");
        this.f26562b.edit().putString("mraid_download_url", str).apply();
    }

    /* renamed from: a */
    public final String mo67332a() {
        SharedPreferences sharedPreferences = this.f26562b;
        C10765mq.m32770a((Object) sharedPreferences, "sharedPref");
        return C10558gk.m32091a(sharedPreferences, "mraid_download_url", "");
    }

    /* renamed from: b */
    public final String mo67334b() {
        SharedPreferences sharedPreferences = this.f26562b;
        C10765mq.m32770a((Object) sharedPreferences, "sharedPref");
        return C10558gk.m32091a(sharedPreferences, "mraid_js", "");
    }
}
