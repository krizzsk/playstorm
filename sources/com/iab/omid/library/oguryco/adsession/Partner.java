package com.iab.omid.library.oguryco.adsession;

import com.iab.omid.library.oguryco.p271d.C8010e;

public class Partner {
    private final String name;
    private final String version;

    private Partner(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public static Partner createPartner(String str, String str2) {
        C8010e.m22852a(str, "Name is null or empty");
        C8010e.m22852a(str2, "Version is null or empty");
        return new Partner(str, str2);
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }
}
