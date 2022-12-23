package com.smaato.sdk.core.util.reflection;

public final class Reflections {
    private Reflections() {
    }

    public static boolean isClassInClasspath(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
