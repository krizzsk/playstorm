package com.iab.omid.library.oguryco;

import android.content.Context;

public final class Omid {
    private static C7989b INSTANCE = new C7989b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo55796a(context.getApplicationContext());
    }

    public static boolean activateWithOmidApiVersion(String str, Context context) {
        INSTANCE.mo55796a(context.getApplicationContext());
        return true;
    }

    public static String getVersion() {
        return INSTANCE.mo55795a();
    }

    public static boolean isActive() {
        return INSTANCE.mo55799b();
    }

    public static boolean isCompatibleWithOmidApiVersion(String str) {
        return INSTANCE.mo55798a(str);
    }
}
