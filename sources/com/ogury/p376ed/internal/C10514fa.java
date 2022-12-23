package com.ogury.p376ed.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ogury.p376ed.internal.C10527fk;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.MissingResourceException;

/* renamed from: com.ogury.ed.internal.fa */
public final class C10514fa {

    /* renamed from: a */
    public static final C10515a f26572a = new C10515a((byte) 0);

    /* renamed from: b */
    private final Context f26573b;

    /* renamed from: c */
    private final C10527fk f26574c;

    private C10514fa(Context context, C10527fk fkVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(fkVar, "profigDao");
        this.f26573b = context;
        this.f26574c = fkVar;
    }

    /* renamed from: a */
    public final Context mo67355a() {
        return this.f26573b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10514fa(Context context) {
        this(context, C10527fk.C10528a.m31966a(context));
        C10527fk.C10528a aVar = C10527fk.f26610a;
    }

    /* renamed from: com.ogury.ed.internal.fa$a */
    public static final class C10515a {
        public /* synthetic */ C10515a(byte b) {
            this();
        }

        private C10515a() {
        }
    }

    /* renamed from: a */
    public final boolean mo67356a(String str) {
        C10765mq.m32773b(str, "permission");
        return C10555gh.m32084a(this.f26573b, str);
    }

    /* renamed from: b */
    public final String mo67357b() {
        return this.f26574c.mo67405i();
    }

    /* renamed from: c */
    public final String mo67358c() {
        if (Build.VERSION.SDK_INT >= 24) {
            String language = this.f26573b.getResources().getConfiguration().getLocales().get(0).getLanguage();
            C10765mq.m32770a((Object) language, "{\n            context.re…les[0].language\n        }");
            return language;
        }
        String language2 = this.f26573b.getResources().getConfiguration().locale.getLanguage();
        C10765mq.m32770a((Object) language2, "{\n            context.re…locale.language\n        }");
        return language2;
    }

    /* renamed from: d */
    public final String mo67359d() {
        String j = m31887j();
        if (j == null || j.length() != 3) {
            return m31888k();
        }
        return j;
    }

    /* renamed from: j */
    private final String m31887j() {
        try {
            Object systemService = this.f26573b.getSystemService("phone");
            if (systemService != null) {
                return new Locale("", ((TelephonyManager) systemService).getNetworkCountryIso()).getISO3Country();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    private final String m31888k() {
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                str = this.f26573b.getResources().getConfiguration().getLocales().get(0).getISO3Country();
            } else {
                str = this.f26573b.getResources().getConfiguration().locale.getISO3Country();
            }
            C10765mq.m32770a((Object) str, "{\n            if (Build.…y\n            }\n        }");
            return str;
        } catch (MissingResourceException unused) {
            return "ZZZ";
        }
    }

    /* renamed from: e */
    public final String mo67360e() {
        return "4.2.0/" + mo67357b() + '/' + Build.VERSION.RELEASE;
    }

    /* renamed from: f */
    public final String mo67361f() {
        String packageName = this.f26573b.getPackageName();
        C10765mq.m32770a((Object) packageName, "context.packageName");
        return packageName;
    }

    /* renamed from: g */
    public final String mo67362g() {
        String str;
        Constructor<WebSettings> declaredConstructor;
        if (Build.VERSION.SDK_INT >= 17) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f26573b);
            C10765mq.m32770a((Object) defaultUserAgent, "{\n            WebSetting…rAgent(context)\n        }");
            return defaultUserAgent;
        }
        try {
            declaredConstructor = WebSettings.class.getDeclaredConstructor(new Class[]{Context.class, WebView.class});
            C10765mq.m32770a((Object) declaredConstructor, "WebSettings::class.java.…ava, WebView::class.java)");
            declaredConstructor.setAccessible(true);
            WebSettings newInstance = declaredConstructor.newInstance(new Object[]{this.f26573b, null});
            C10765mq.m32770a((Object) newInstance, "constructor.newInstance(context, null)");
            str = newInstance.getUserAgentString();
            declaredConstructor.setAccessible(false);
        } catch (Exception unused) {
            str = new WebView(this.f26573b).getSettings().getUserAgentString();
        } catch (Throwable th) {
            declaredConstructor.setAccessible(false);
            throw th;
        }
        C10765mq.m32770a((Object) str, "try {\n            val co…userAgentString\n        }");
        return str;
    }

    /* renamed from: h */
    public final int mo67363h() {
        try {
            return this.f26573b.getPackageManager().getApplicationInfo(this.f26573b.getPackageName(), 128).targetSdkVersion;
        } catch (Exception unused) {
            return 14;
        }
    }

    /* renamed from: i */
    public final String mo67364i() {
        return m31886a(this.f26573b);
    }

    /* renamed from: a */
    private static String m31886a(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            C10765mq.m32770a((Object) str, "{\n            val packag…nfo.versionName\n        }");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }
}
