package com.iab.omid.library.adcolony;

import android.content.Context;

public final class Omid {
    private static C7587b INSTANCE = new C7587b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo54206a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo54205a();
    }

    public static boolean isActive() {
        return INSTANCE.mo54208b();
    }
}
