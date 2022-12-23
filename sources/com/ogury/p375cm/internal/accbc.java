package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.accbc */
public final class accbc implements accbb {

    /* renamed from: a */
    public static final aaaaa f25865a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accbc$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    private static abcaa m30865a() {
        abbba abbba = abbba.f25716a;
        return abbba.m30722c().mo66561d();
    }

    /* renamed from: a */
    public final void mo66638a(Context context) {
        bbabc.m30943b(context, "context");
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("CCPAF")) {
            SharedPreferences.Editor edit = context.getSharedPreferences("cacheConsentCcpaf", 0).edit();
            edit.putString("uspString", m30865a().mo66568a());
            edit.putBoolean("explicitNotice", m30865a().mo66572b());
            edit.putBoolean("optOutSale", m30865a().mo66574c());
            edit.putBoolean("lspa", m30865a().mo66576d());
            edit.putBoolean("ccpaApplies", m30865a().mo66577e());
            edit.apply();
        }
    }

    /* renamed from: b */
    public final void mo66639b(Context context) {
        bbabc.m30943b(context, "context");
        context.getSharedPreferences("cacheConsentCcpaf", 0).edit().clear().apply();
        abbba abbba = abbba.f25716a;
        abbba.m30717a(new Date());
    }

    /* renamed from: c */
    public final void mo66640c(Context context) {
        bbabc.m30943b(context, "context");
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("CCPAF")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("cacheConsentCcpaf", 0);
            abcaa a = m30865a();
            String string = sharedPreferences.getString("uspString", "");
            bbabc.m30940a((Object) string, "prefs.getString(USP_STRING, \"\")");
            a.mo66569a(string);
            a.mo66570a(sharedPreferences.getBoolean("explicitNotice", false));
            a.mo66571b(sharedPreferences.getBoolean("optOutSale", false));
            a.mo66573c(sharedPreferences.getBoolean("lspa", false));
            a.mo66575d(sharedPreferences.getBoolean("ccpaApplies", false));
        }
    }
}
