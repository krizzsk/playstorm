package com.p374my.target;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.my.target.u8 */
public class C9993u8 {

    /* renamed from: a */
    public static volatile C9993u8 f24796a;

    /* renamed from: b */
    public final SharedPreferences f24797b;

    public C9993u8(SharedPreferences sharedPreferences) {
        this.f24797b = sharedPreferences;
    }

    /* renamed from: a */
    public static C9993u8 m29506a(Context context) {
        C9993u8 u8Var = f24796a;
        if (u8Var == null) {
            synchronized (C9993u8.class) {
                u8Var = f24796a;
                if (u8Var == null) {
                    u8Var = new C9993u8(context.getSharedPreferences("mytarget_prefs", 0));
                    f24796a = u8Var;
                }
            }
        }
        return u8Var;
    }

    /* renamed from: a */
    public int mo65565a() {
        return mo65566a("sdk_flags");
    }

    /* renamed from: a */
    public final int mo65566a(String str) {
        try {
            return this.f24797b.getInt(str, -1);
        } catch (Throwable th) {
            C9672e0.m27884c("PrefsCache exception: " + th);
            return 0;
        }
    }

    /* renamed from: a */
    public void mo65567a(int i) {
        mo65568a("sdk_flags", i);
    }

    /* renamed from: a */
    public final void mo65568a(String str, int i) {
        try {
            SharedPreferences.Editor edit = this.f24797b.edit();
            edit.putInt(str, i);
            edit.commit();
        } catch (Throwable th) {
            C9672e0.m27884c("PrefsCache exception: " + th);
        }
    }

    /* renamed from: a */
    public final void mo65569a(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.f24797b.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Throwable th) {
            C9672e0.m27884c("PrefsCache exception: " + th);
        }
    }

    /* renamed from: b */
    public String mo65570b() {
        return mo65571b("hlimit");
    }

    /* renamed from: b */
    public final String mo65571b(String str) {
        try {
            String string = this.f24797b.getString(str, (String) null);
            return string != null ? string : "";
        } catch (Throwable th) {
            C9672e0.m27884c("PrefsCache exception: " + th);
            return "";
        }
    }

    /* renamed from: c */
    public String mo65572c() {
        return mo65571b("hoaid");
    }

    /* renamed from: c */
    public void mo65573c(String str) {
        mo65569a("hoaid", str);
    }

    /* renamed from: d */
    public String mo65574d() {
        return mo65571b("instanceId");
    }

    /* renamed from: d */
    public void mo65575d(String str) {
        mo65569a("hlimit", str);
    }

    /* renamed from: e */
    public void mo65576e(String str) {
        mo65569a("instanceId", str);
    }
}
