package com.smaato.sdk.core.gdpr.tcfv2.model.gvl;

public class Purpose extends GVLMapItem {
    private Boolean consentable;
    private String description;
    private String descriptionLegal;

    /* renamed from: id */
    private int f27139id;
    private String name;
    private Boolean rightToObject;

    public Purpose() {
        Boolean bool = Boolean.TRUE;
        this.consentable = bool;
        this.rightToObject = bool;
    }

    public void setId(int i) {
        this.f27139id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getDescriptionLegal() {
        return this.descriptionLegal;
    }

    public void setDescriptionLegal(String str) {
        this.descriptionLegal = str;
    }

    public Boolean getConsentable() {
        return this.consentable;
    }

    public void setConsentable(Boolean bool) {
        this.consentable = bool;
    }

    public Boolean getRightToObject() {
        return this.rightToObject;
    }

    public void setRightToObject(Boolean bool) {
        this.rightToObject = bool;
    }
}
