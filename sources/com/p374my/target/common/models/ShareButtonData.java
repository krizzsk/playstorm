package com.p374my.target.common.models;

/* renamed from: com.my.target.common.models.ShareButtonData */
public class ShareButtonData {
    public String imageUrl;
    public String name;
    public String url;

    private ShareButtonData() {
    }

    public static ShareButtonData newData() {
        return new ShareButtonData();
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
