package com.iab.omid.library.fyber;

import android.content.Context;

public final class Omid {
    private static C7788b INSTANCE = new C7788b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo54997a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo54996a();
    }

    public static boolean isActive() {
        return INSTANCE.mo54999b();
    }
}
