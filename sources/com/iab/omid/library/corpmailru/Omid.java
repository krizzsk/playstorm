package com.iab.omid.library.corpmailru;

import android.content.Context;

public final class Omid {
    private static C7737b INSTANCE = new C7737b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo54799a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo54798a();
    }

    public static boolean isActive() {
        return INSTANCE.mo54801b();
    }
}
