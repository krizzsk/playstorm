package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.accca */
public abstract class accca implements accbb {

    /* renamed from: a */
    public static final aaaaa f25866a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accca$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public abstract String mo66641a();

    /* renamed from: a */
    public void mo66638a(Context context) {
        bbabc.m30943b(context, "context");
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("TCF")) {
            SharedPreferences.Editor edit = context.getSharedPreferences(mo66641a(), 0).edit();
            abbba abbba2 = abbba.f25716a;
            edit.putString("iabString", abbba.m30722c().mo66560c().mo66578a());
            abbba abbba3 = abbba.f25716a;
            edit.putBoolean("gdprApplies", abbba.m30722c().mo66560c().mo66581b());
            edit.apply();
        }
    }

    /* renamed from: b */
    public final void mo66639b(Context context) {
        bbabc.m30943b(context, "context");
        context.getSharedPreferences(mo66641a(), 0).edit().clear().apply();
        abbba abbba = abbba.f25716a;
        abbba.m30717a(new Date());
    }

    /* renamed from: c */
    public void mo66640c(Context context) {
        bbabc.m30943b(context, "context");
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("TCF")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(mo66641a(), 0);
            abbba abbba2 = abbba.f25716a;
            abcab c = abbba.m30722c().mo66560c();
            String string = sharedPreferences.getString("iabString", "");
            bbabc.m30940a((Object) string, "prefs.getString(IAB_STRING_KEY, \"\")");
            c.mo66579a(string);
            abbba abbba3 = abbba.f25716a;
            abbba.m30722c().mo66560c().mo66580a(sharedPreferences.getBoolean("gdprApplies", true));
        }
    }
}
