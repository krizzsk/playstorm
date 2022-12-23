package com.smaato.sdk.video.vast.model;

public class Advertiser {

    /* renamed from: ID */
    public static final String f27162ID = "id";
    public static final String NAME = "Advertiser";

    /* renamed from: id */
    public final String f27163id;
    public final String name;

    Advertiser(String str, String str2) {
        this.f27163id = str;
        this.name = str2;
    }

    public static class Builder {

        /* renamed from: id */
        private String f27164id;
        private String name;

        public Builder setId(String str) {
            this.f27164id = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Advertiser build() {
            return new Advertiser(this.f27164id, this.name);
        }
    }
}
