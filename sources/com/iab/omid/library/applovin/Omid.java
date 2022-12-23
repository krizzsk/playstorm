package com.iab.omid.library.applovin;

import android.content.Context;

public final class Omid {
    private static C7687b INSTANCE = new C7687b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo54604a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo54603a();
    }

    public static boolean isActive() {
        return INSTANCE.mo54606b();
    }
}
