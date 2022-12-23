package com.p374my.target.ads;

/* renamed from: com.my.target.ads.Reward */
public class Reward {
    public static final String DEFAULT = "default";
    public final String type;

    private Reward(String str) {
        this.type = str;
    }

    public static Reward getDefault() {
        return new Reward("default");
    }
}
