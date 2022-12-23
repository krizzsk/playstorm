package com.p374my.target;

import com.p374my.target.common.models.ImageData;

/* renamed from: com.my.target.k2 */
public class C9795k2 extends C10066z1 {
    public boolean appInstalled;
    public ImageData bubbleIcon;
    public String bubbleId;
    public int coins;
    public ImageData coinsIcon;
    public int coinsIconBgColor = -552418;
    public int coinsIconTextColor = -1;
    public ImageData crossNotifIcon;
    public ImageData gotoAppIcon;
    public boolean hasNotification;
    public boolean isBanner;
    public boolean isItemHighlight;
    public boolean isMain;
    public boolean isRequireCategoryHighlight;
    public boolean isRequireWifi;
    public boolean isSubItem;
    public ImageData itemHighlightIcon;
    public ImageData labelIcon;
    public String labelType;
    public int mrgsId;
    public String status;
    public ImageData statusIcon;

    public static C9795k2 newBanner() {
        return new C9795k2();
    }

    public ImageData getBubbleIcon() {
        return this.bubbleIcon;
    }

    public String getBubbleId() {
        return this.bubbleId;
    }

    public int getCoins() {
        return this.coins;
    }

    public ImageData getCoinsIcon() {
        return this.coinsIcon;
    }

    public int getCoinsIconBgColor() {
        return this.coinsIconBgColor;
    }

    public int getCoinsIconTextColor() {
        return this.coinsIconTextColor;
    }

    public ImageData getCrossNotifIcon() {
        return this.crossNotifIcon;
    }

    public ImageData getGotoAppIcon() {
        return this.gotoAppIcon;
    }

    public ImageData getItemHighlightIcon() {
        return this.itemHighlightIcon;
    }

    public ImageData getLabelIcon() {
        return this.labelIcon;
    }

    public String getLabelType() {
        return this.labelType;
    }

    public int getMrgsId() {
        return this.mrgsId;
    }

    public String getStatus() {
        return this.status;
    }

    public ImageData getStatusIcon() {
        return this.statusIcon;
    }

    public boolean isAppInstalled() {
        return this.appInstalled;
    }

    public boolean isBanner() {
        return this.isBanner;
    }

    public boolean isHasNotification() {
        return this.hasNotification;
    }

    public boolean isItemHighlight() {
        return this.isItemHighlight;
    }

    public boolean isMain() {
        return this.isMain;
    }

    public boolean isRequireCategoryHighlight() {
        return this.isRequireCategoryHighlight;
    }

    public boolean isRequireWifi() {
        return this.isRequireWifi;
    }

    public boolean isSubItem() {
        return this.isSubItem;
    }

    public void setAppInstalled(boolean z) {
        this.appInstalled = z;
    }

    public void setBanner(boolean z) {
        this.isBanner = z;
    }

    public void setBubbleIcon(ImageData imageData) {
        this.bubbleIcon = imageData;
    }

    public void setBubbleId(String str) {
        this.bubbleId = str;
    }

    public void setCoins(int i) {
        this.coins = i;
    }

    public void setCoinsIcon(ImageData imageData) {
        this.coinsIcon = imageData;
    }

    public void setCoinsIconBgColor(int i) {
        this.coinsIconBgColor = i;
    }

    public void setCoinsIconTextColor(int i) {
        this.coinsIconTextColor = i;
    }

    public void setCrossNotifIcon(ImageData imageData) {
        this.crossNotifIcon = imageData;
    }

    public void setGotoAppIcon(ImageData imageData) {
        this.gotoAppIcon = imageData;
    }

    public void setHasNotification(boolean z) {
        this.hasNotification = z;
    }

    public void setItemHighlight(boolean z) {
        this.isItemHighlight = z;
    }

    public void setItemHighlightIcon(ImageData imageData) {
        this.itemHighlightIcon = imageData;
    }

    public void setLabelIcon(ImageData imageData) {
        this.labelIcon = imageData;
    }

    public void setLabelType(String str) {
        this.labelType = str;
    }

    public void setMain(boolean z) {
        this.isMain = z;
    }

    public void setMrgsId(int i) {
        this.mrgsId = i;
    }

    public void setRequireCategoryHighlight(boolean z) {
        this.isRequireCategoryHighlight = z;
    }

    public void setRequireWifi(boolean z) {
        this.isRequireWifi = z;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setStatusIcon(ImageData imageData) {
        this.statusIcon = imageData;
    }

    public void setSubItem(boolean z) {
        this.isSubItem = z;
    }
}
