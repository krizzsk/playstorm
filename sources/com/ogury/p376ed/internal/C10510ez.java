package com.ogury.p376ed.internal;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ogury.ed.internal.ez */
public final class C10510ez {

    /* renamed from: a */
    public static final C10511a f26564a = new C10511a((byte) 0);

    /* renamed from: b */
    private final Context f26565b;

    /* renamed from: c */
    private final TimeZone f26566c;

    /* renamed from: d */
    private final DisplayMetrics f26567d;

    /* renamed from: e */
    private final String f26568e;

    /* renamed from: f */
    private final String f26569f;

    private C10510ez(Context context, TimeZone timeZone, DisplayMetrics displayMetrics) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(timeZone, "utcTimezone");
        C10765mq.m32773b(displayMetrics, "displayMetrics");
        this.f26565b = context;
        this.f26566c = timeZone;
        this.f26567d = displayMetrics;
        String str = Build.MANUFACTURER;
        C10765mq.m32770a((Object) str, "MANUFACTURER");
        this.f26568e = str;
        this.f26569f = Build.MODEL;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ C10510ez(android.content.Context r3, java.util.TimeZone r4) {
        /*
            r2 = this;
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r1 = "getSystem().displayMetrics"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r0, (java.lang.String) r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10510ez.<init>(android.content.Context, java.util.TimeZone):void");
    }

    /* renamed from: com.ogury.ed.internal.ez$a */
    public static final class C10511a {
        public /* synthetic */ C10511a(byte b) {
            this();
        }

        private C10511a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10510ez(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p376ed.internal.C10765mq.m32773b(r3, r0)
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.lang.String r1 = "getTimeZone(\"UTC\")"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r0, (java.lang.String) r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10510ez.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static String m31858a() {
        String str = Build.VERSION.RELEASE;
        C10765mq.m32770a((Object) str, "RELEASE");
        return str;
    }

    /* renamed from: b */
    public static int m31861b() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: c */
    public static String m31862c() {
        String property = System.getProperty("java.vm.version");
        return property == null ? "" : property;
    }

    /* renamed from: d */
    public static String m31863d() {
        String property = System.getProperty("java.vm.name");
        return property == null ? "" : property;
    }

    /* renamed from: e */
    public static String m31864e() {
        String property = System.getProperty("os.arch");
        return property == null ? "" : property;
    }

    /* renamed from: f */
    public static String m31865f() {
        try {
            String format = new SimpleDateFormat("Z", Locale.US).format(new Date());
            StringBuilder sb = new StringBuilder();
            C10765mq.m32770a((Object) format, "formattedTime");
            String substring = format.substring(0, 3);
            C10765mq.m32770a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(':');
            String substring2 = format.substring(3, format.length());
            C10765mq.m32770a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring2);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    public final String mo67338g() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(this.f26566c);
        String format = simpleDateFormat.format(date);
        C10765mq.m32770a((Object) format, "format.format(currentLocalDate)");
        return format;
    }

    /* renamed from: h */
    public final boolean mo67339h() {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                if (Build.VERSION.SDK_INT < 21) {
                    if (Build.VERSION.SDK_INT < 17 || Settings.Global.getInt(this.f26565b.getContentResolver(), "install_non_market_apps", 0) != 1) {
                        return false;
                    }
                    return true;
                }
            }
            if (Settings.Secure.getInt(this.f26565b.getContentResolver(), "install_non_market_apps", 0) != 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = m31860a(r3.f26568e, r0);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo67340i() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f26569f
            java.lang.String r1 = "Unknown"
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.String r2 = r3.f26568e
            java.lang.String r0 = m31860a(r2, r0)
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10510ez.mo67340i():java.lang.String");
    }

    /* renamed from: a */
    private static String m31860a(String str, String str2) {
        if (C10814oc.m32844b(str2, str)) {
            return str2;
        }
        return str + ' ' + str2;
    }

    /* renamed from: j */
    public final String mo67341j() {
        try {
            NetworkInfo a = C10541fw.m32048a(this.f26565b);
            return a != null ? m31859a(a) : "UNKNOWN";
        } catch (Exception unused) {
            return "NONE";
        }
    }

    /* renamed from: a */
    private static String m31859a(NetworkInfo networkInfo) {
        if (C10541fw.m32049a(networkInfo)) {
            String typeName = networkInfo.getTypeName();
            C10765mq.m32770a((Object) typeName, "{\n            info.typeName\n        }");
            return typeName;
        }
        return networkInfo.getTypeName() + " - " + networkInfo.getSubtypeName();
    }

    /* renamed from: k */
    public final int mo67342k() {
        return this.f26567d.widthPixels;
    }

    /* renamed from: l */
    public final int mo67343l() {
        return this.f26567d.heightPixels;
    }

    /* renamed from: a */
    public final Rect mo67337a(View view) {
        C10765mq.m32773b(view, "view");
        Rect rect = new Rect(0, 0, this.f26567d.widthPixels, this.f26567d.heightPixels);
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (Exception unused) {
        }
        return rect;
    }

    /* renamed from: m */
    public final int mo67344m() {
        Object systemService = this.f26565b.getSystemService("audio");
        if (systemService != null) {
            return ((AudioManager) systemService).getStreamVolume(3);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }

    /* renamed from: n */
    public final String mo67345n() {
        return this.f26565b.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
    }

    /* renamed from: o */
    public final float mo67346o() {
        return this.f26567d.density;
    }

    /* renamed from: p */
    public final boolean mo67347p() {
        return this.f26565b.getResources().getConfiguration().orientation == 1;
    }
}
