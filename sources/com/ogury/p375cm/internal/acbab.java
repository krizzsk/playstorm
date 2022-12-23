package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: com.ogury.cm.internal.acbab */
public final class acbab implements acbaa {

    /* renamed from: a */
    public static final aaaaa f25844a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acbab$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo66626a(Context context) {
        bbabc.m30943b(context, "context");
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("CCPAF")) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
            abbba abbba2 = abbba.f25716a;
            edit.putString("IABUSPrivacy_String", abbba.m30722c().mo66561d().mo66568a());
            edit.apply();
        }
    }
}
