package com.p374my.target;

/* renamed from: com.my.target.c2 */
public class C9640c2 extends C10066z1 {
    public boolean imageOnly;

    public C9640c2() {
        this.clickArea = C9929r1.f24582b;
    }

    public static C9640c2 newCard(C9625b2 b2Var) {
        C9640c2 c2Var = new C9640c2();
        c2Var.f25051id = b2Var.f25051id;
        c2Var.ctaText = b2Var.ctaText;
        c2Var.navigationType = b2Var.navigationType;
        c2Var.urlscheme = b2Var.urlscheme;
        c2Var.bundleId = b2Var.bundleId;
        c2Var.directLink = b2Var.directLink;
        c2Var.openInBrowser = b2Var.openInBrowser;
        c2Var.deeplink = b2Var.deeplink;
        c2Var.clickArea = b2Var.clickArea;
        c2Var.rating = b2Var.rating;
        c2Var.votes = b2Var.votes;
        c2Var.domain = b2Var.domain;
        c2Var.category = b2Var.category;
        c2Var.subCategory = b2Var.subCategory;
        return c2Var;
    }

    public boolean isImageOnly() {
        return this.imageOnly;
    }

    public void setImageOnly(boolean z) {
        this.imageOnly = z;
    }
}
