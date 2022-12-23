package com.iab.omid.library.smaato.adsession;

import com.iab.omid.library.smaato.p277d.C8060e;

public class Partner {
    private final String name;
    private final String version;

    private Partner(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public static Partner createPartner(String str, String str2) {
        C8060e.m23076a(str, "Name is null or empty");
        C8060e.m23076a(str2, "Version is null or empty");
        return new Partner(str, str2);
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }
}
