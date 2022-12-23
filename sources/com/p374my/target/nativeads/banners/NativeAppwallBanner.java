package com.p374my.target.nativeads.banners;

import com.p374my.target.C9795k2;
import com.p374my.target.common.models.ImageData;

/* renamed from: com.my.target.nativeads.banners.NativeAppwallBanner */
public class NativeAppwallBanner {
    private final boolean appInstalled;
    private final ImageData bubbleIcon;
    private final String bubbleId;
    private final int coins;
    private final ImageData coinsIcon;
    private final int coinsIconBgColor;
    private final int coinsIconTextColor;
    private final ImageData crossNotifIcon;
    private final String description;
    private final ImageData gotoAppIcon;
    private boolean hasNotification;
    private final ImageData icon;

    /* renamed from: id */
    private final String f24407id;
    private final boolean isBanner;
    private final boolean isItemHighlight;
    private final boolean isMain;
    private final boolean isRequireCategoryHighlight;
    private final boolean isRequireWifi;
    private final boolean isSubItem;
    private final ImageData itemHighlightIcon;
    private final ImageData labelIcon;
    private final String labelType;
    private final int mrgsId;
    private final String paidType;
    private final float rating;
    private final String status;
    private final ImageData statusIcon;
    private final String title;
    private final int votes;

    private NativeAppwallBanner(C9795k2 k2Var) {
        this.f24407id = k2Var.getId();
        this.description = k2Var.getDescription();
        this.title = k2Var.getTitle();
        this.bubbleId = k2Var.getBubbleId();
        this.labelType = k2Var.getLabelType();
        this.status = k2Var.getStatus();
        this.paidType = k2Var.getPaidType();
        this.mrgsId = k2Var.getMrgsId();
        this.coins = k2Var.getCoins();
        this.coinsIconBgColor = k2Var.getCoinsIconBgColor();
        this.coinsIconTextColor = k2Var.getCoinsIconTextColor();
        this.votes = k2Var.getVotes();
        this.rating = k2Var.getRating();
        this.hasNotification = k2Var.isHasNotification();
        this.isMain = k2Var.isMain();
        this.isRequireCategoryHighlight = k2Var.isRequireCategoryHighlight();
        this.isItemHighlight = k2Var.isItemHighlight();
        this.isBanner = k2Var.isBanner();
        this.isRequireWifi = k2Var.isRequireWifi();
        this.isSubItem = k2Var.isSubItem();
        this.appInstalled = k2Var.isAppInstalled();
        this.icon = k2Var.getIcon();
        this.coinsIcon = k2Var.getCoinsIcon();
        this.labelIcon = k2Var.getLabelIcon();
        this.gotoAppIcon = k2Var.getGotoAppIcon();
        this.statusIcon = k2Var.getStatusIcon();
        this.bubbleIcon = k2Var.getBubbleIcon();
        this.itemHighlightIcon = k2Var.getItemHighlightIcon();
        this.crossNotifIcon = k2Var.getCrossNotifIcon();
    }

    public static NativeAppwallBanner newBanner(C9795k2 k2Var) {
        return new NativeAppwallBanner(k2Var);
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

    public String getDescription() {
        return this.description;
    }

    public ImageData getGotoAppIcon() {
        return this.gotoAppIcon;
    }

    public ImageData getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f24407id;
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

    public String getPaidType() {
        return this.paidType;
    }

    public float getRating() {
        return this.rating;
    }

    public String getStatus() {
        return this.status;
    }

    public ImageData getStatusIcon() {
        return this.statusIcon;
    }

    public String getTitle() {
        return this.title;
    }

    public int getVotes() {
        return this.votes;
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

    public void setHasNotification(boolean z) {
        this.hasNotification = z;
    }
}
