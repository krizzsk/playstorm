package com.iab.omid.library.ironsrc;

import android.content.Context;

public final class Omid {
    private static C7889b INSTANCE = new C7889b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55386a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo55385a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55388b();
    }
}
