package com.iab.omid.library.inmobi;

import android.content.Context;

public final class Omid {
    private static C7839b INSTANCE = new C7839b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55192a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo55191a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55194b();
    }
}
