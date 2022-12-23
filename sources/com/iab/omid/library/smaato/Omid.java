package com.iab.omid.library.smaato;

import android.content.Context;

public final class Omid {
    private static C8040b INSTANCE = new C8040b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55985a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo55984a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55987b();
    }
}
