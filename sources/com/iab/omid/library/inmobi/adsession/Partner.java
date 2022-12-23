package com.iab.omid.library.inmobi.adsession;

import com.iab.omid.library.inmobi.p253d.C7859e;

public class Partner {
    private final String name;
    private final String version;

    private Partner(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public static Partner createPartner(String str, String str2) {
        C7859e.m22172a(str, "Name is null or empty");
        C7859e.m22172a(str2, "Version is null or empty");
        return new Partner(str, str2);
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }
}
