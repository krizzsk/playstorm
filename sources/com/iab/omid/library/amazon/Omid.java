package com.iab.omid.library.amazon;

import android.content.Context;

public final class Omid {
    private static C7637b INSTANCE = new C7637b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo54405a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo54404a();
    }

    public static boolean isActive() {
        return INSTANCE.mo54407b();
    }
}
