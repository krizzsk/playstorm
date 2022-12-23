package com.p374my.target;

import com.p374my.target.common.models.ImageData;

/* renamed from: com.my.target.z1 */
public abstract class C10066z1 {
    public C9894p1 adChoices;
    public String advertisingLabel = "";
    public String ageRestrictions = "";
    public boolean appInWhiteList = false;
    public String bundleId;
    public String category = "";
    public C9929r1 clickArea = C9929r1.f24581a;
    public String ctaText;
    public String deeplink;
    public String description = "";
    public boolean directLink = false;
    public String disclaimer = "";
    public String domain = "";
    public float duration;
    public int height;
    public ImageData icon;

    /* renamed from: id */
    public String f25051id = "";
    public ImageData image;
    public boolean logErrors = true;
    public String navigationType = "web";
    public C9879o2 omData;
    public boolean openInBrowser = false;
    public String paidType;
    public float rating;
    public final C9641c3 statHolder = C9641c3.m27738f();
    public String subCategory = "";
    public String title = "";
    public String trackingLink;
    public String type = "";
    public String urlscheme;
    public final C10044y1 viewability = C10044y1.m29754d();
    public int votes;
    public int width;

    public C9894p1 getAdChoices() {
        return this.adChoices;
    }

    public String getAdvertisingLabel() {
        return this.advertisingLabel;
    }

    public String getAgeRestrictions() {
        return this.ageRestrictions;
    }

    public String getBundleId() {
        return this.bundleId;
    }

    public String getCategory() {
        return this.category;
    }

    public C9929r1 getClickArea() {
        return this.clickArea;
    }

    public String getCtaText() {
        String str = this.ctaText;
        return str == null ? "store".equals(this.navigationType) ? "Install" : "Visit" : str;
    }

    public String getDeeplink() {
        return this.deeplink;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisclaimer() {
        return this.disclaimer;
    }

    public String getDomain() {
        return this.domain;
    }

    public float getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public ImageData getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f25051id;
    }

    public ImageData getImage() {
        return this.image;
    }

    public String getNavigationType() {
        return this.navigationType;
    }

    public C9879o2 getOmData() {
        return this.omData;
    }

    public String getPaidType() {
        return this.paidType;
    }

    public float getRating() {
        return this.rating;
    }

    public C9641c3 getStatHolder() {
        return this.statHolder;
    }

    public String getSubCategory() {
        return this.subCategory;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingLink() {
        return this.trackingLink;
    }

    public String getType() {
        return this.type;
    }

    public String getUrlscheme() {
        return this.urlscheme;
    }

    public C10044y1 getViewability() {
        return this.viewability;
    }

    public int getVotes() {
        return this.votes;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAppInWhiteList() {
        return this.appInWhiteList;
    }

    public boolean isDirectLink() {
        return this.directLink;
    }

    public boolean isLogErrors() {
        return this.logErrors;
    }

    public boolean isOpenInBrowser() {
        return this.openInBrowser;
    }

    public void setAdChoices(C9894p1 p1Var) {
        this.adChoices = p1Var;
    }

    public void setAdvertisingLabel(String str) {
        this.advertisingLabel = str;
    }

    public void setAgeRestrictions(String str) {
        this.ageRestrictions = str;
    }

    public void setAppInWhiteList(boolean z) {
        this.appInWhiteList = z;
    }

    public void setBundleId(String str) {
        this.bundleId = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setClickArea(C9929r1 r1Var) {
        this.clickArea = r1Var;
    }

    public void setCtaText(String str) {
        this.ctaText = str;
    }

    public void setDeeplink(String str) {
        this.deeplink = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDirectLink(boolean z) {
        this.directLink = z;
    }

    public void setDisclaimer(String str) {
        this.disclaimer = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setDuration(float f) {
        this.duration = f;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIcon(ImageData imageData) {
        this.icon = imageData;
    }

    public void setId(String str) {
        this.f25051id = str;
    }

    public void setImage(ImageData imageData) {
        this.image = imageData;
    }

    public void setLogErrors(boolean z) {
        this.logErrors = z;
    }

    public void setNavigationType(String str) {
        this.navigationType = str;
    }

    public void setOmData(C9879o2 o2Var) {
        this.omData = o2Var;
    }

    public void setOpenInBrowser(boolean z) {
        this.openInBrowser = z;
    }

    public void setPaidType(String str) {
        this.paidType = str;
    }

    public void setRating(float f) {
        this.rating = f;
    }

    public void setSubCategory(String str) {
        this.subCategory = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackingLink(String str) {
        this.trackingLink = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrlscheme(String str) {
        this.urlscheme = str;
    }

    public void setVotes(int i) {
        this.votes = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
