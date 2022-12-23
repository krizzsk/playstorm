package com.ogury.p376ed.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ogury.ed.internal.fk */
public final class C10527fk {

    /* renamed from: a */
    public static final C10528a f26610a = new C10528a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C10527fk f26611c;

    /* renamed from: b */
    private final SharedPreferences f26612b;

    public /* synthetic */ C10527fk(Context context, byte b) {
        this(context);
    }

    private C10527fk(Context context) {
        this.f26612b = context.getSharedPreferences("profig", 0);
    }

    /* renamed from: com.ogury.ed.internal.fk$a */
    public static final class C10528a {
        public /* synthetic */ C10528a(byte b) {
            this();
        }

        private C10528a() {
        }

        /* renamed from: a */
        public static C10527fk m31966a(Context context) {
            C10765mq.m32773b(context, "context");
            if (C10527fk.f26611c == null) {
                Context applicationContext = context.getApplicationContext();
                C10765mq.m32770a((Object) applicationContext, "context.applicationContext");
                C10527fk.f26611c = new C10527fk(applicationContext, (byte) 0);
            }
            C10527fk l = C10527fk.f26611c;
            C10765mq.m32769a((Object) l);
            return l;
        }
    }

    /* renamed from: a */
    public final void mo67391a(int i) {
        this.f26612b.edit().putInt("numberOfProfigApiCalls", i).apply();
    }

    /* renamed from: a */
    public final int mo67390a() {
        return this.f26612b.getInt("numberOfProfigApiCalls", 0);
    }

    /* renamed from: b */
    public final String mo67394b() {
        SharedPreferences sharedPreferences = this.f26612b;
        C10765mq.m32770a((Object) sharedPreferences, "sharedPref");
        return C10558gk.m32091a(sharedPreferences, "md5Profig", "");
    }

    /* renamed from: a */
    public final void mo67393a(String str) {
        C10765mq.m32773b(str, "md5Profig");
        this.f26612b.edit().putString("md5Profig", str).apply();
    }

    /* renamed from: b */
    public final void mo67395b(String str) {
        C10765mq.m32773b(str, "aaid");
        this.f26612b.edit().putString("aaid", str).apply();
    }

    /* renamed from: c */
    public final String mo67396c() {
        SharedPreferences sharedPreferences = this.f26612b;
        C10765mq.m32770a((Object) sharedPreferences, "sharedPref");
        return C10558gk.m32091a(sharedPreferences, "aaid", "");
    }

    /* renamed from: c */
    public final void mo67397c(String str) {
        C10765mq.m32773b(str, "fullProfigResponse");
        this.f26612b.edit().putString("fullProfigResponseJson", str).apply();
    }

    /* renamed from: d */
    public final String mo67398d() {
        SharedPreferences sharedPreferences = this.f26612b;
        C10765mq.m32770a((Object) sharedPreferences, "sharedPref");
        return C10558gk.m32091a(sharedPreferences, "fullProfigResponseJson", "");
    }

    /* renamed from: e */
    public final void mo67400e() {
        this.f26612b.edit().putLong("numberOfDays", System.currentTimeMillis() / TimeUnit.DAYS.toMillis(1)).apply();
    }

    /* renamed from: f */
    public final long mo67402f() {
        return this.f26612b.getLong("numberOfDays", 0);
    }

    /* renamed from: d */
    public final void mo67399d(String str) {
        C10765mq.m32773b(str, "appVersion");
        this.f26612b.edit().putString("appVersion", str).apply();
    }

    /* renamed from: g */
    public final String mo67403g() {
        String string = this.f26612b.getString("appVersion", C10563go.m32099a());
        return string == null ? "" : string;
    }

    /* renamed from: a */
    public final void mo67392a(long j) {
        this.f26612b.edit().putLong("last_profig_sync", j).apply();
    }

    /* renamed from: h */
    public final long mo67404h() {
        return this.f26612b.getLong("last_profig_sync", 0);
    }

    /* renamed from: e */
    public final void mo67401e(String str) {
        C10765mq.m32773b(str, "apiKey");
        this.f26612b.edit().putString(TapjoyConstants.TJC_API_KEY, str).apply();
    }

    /* renamed from: i */
    public final String mo67405i() {
        SharedPreferences sharedPreferences = this.f26612b;
        C10765mq.m32770a((Object) sharedPreferences, "sharedPref");
        return C10558gk.m32091a(sharedPreferences, TapjoyConstants.TJC_API_KEY, "");
    }

    /* renamed from: j */
    public final void mo67406j() {
        this.f26612b.edit().putLong("profigSyncRequired", System.currentTimeMillis()).apply();
    }

    /* renamed from: k */
    public final boolean mo67407k() {
        return this.f26612b.getLong("profigSyncRequired", 0) >= mo67404h();
    }
}
