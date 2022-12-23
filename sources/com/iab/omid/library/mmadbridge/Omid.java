package com.iab.omid.library.mmadbridge;

import android.content.Context;

public final class Omid {
    private static C7939b INSTANCE = new C7939b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55576a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo55575a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55578b();
    }
}
