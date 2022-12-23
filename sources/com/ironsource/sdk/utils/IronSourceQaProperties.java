package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

public class IronSourceQaProperties {

    /* renamed from: a */
    private static IronSourceQaProperties f20115a;

    /* renamed from: b */
    private static Map<String, String> f20116b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f20115a == null) {
            f20115a = new IronSourceQaProperties();
        }
        return f20115a;
    }

    public static boolean isInitialized() {
        return f20115a != null;
    }

    public Map<String, String> getParameters() {
        return f20116b;
    }

    public void setQaParameter(String str, String str2) {
        if (str != null && str2 != null) {
            f20116b.put(str, str2);
        }
    }
}
