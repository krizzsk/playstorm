package com.iab.omid.library.vungle;

import android.content.Context;

public final class Omid {
    private static C8090b INSTANCE = new C8090b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo56179a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo56178a();
    }

    public static boolean isActive() {
        return INSTANCE.mo56181b();
    }
}
