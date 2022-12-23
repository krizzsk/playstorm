package com.smaato.sdk.core;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

public enum Gender {
    FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
    MALE(InneractiveMediationDefs.GENDER_MALE),
    OTHER("o");
    
    private final String gender;

    private Gender(String str) {
        this.gender = str;
    }

    public String toString() {
        return this.gender;
    }
}
