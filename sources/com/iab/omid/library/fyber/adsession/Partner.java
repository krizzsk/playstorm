package com.iab.omid.library.fyber.adsession;

import com.iab.omid.library.fyber.p247d.C7808e;

public class Partner {
    private final String name;
    private final String version;

    private Partner(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public static Partner createPartner(String str, String str2) {
        C7808e.m21946a(str, "Name is null or empty");
        C7808e.m21946a(str2, "Version is null or empty");
        return new Partner(str, str2);
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }
}
