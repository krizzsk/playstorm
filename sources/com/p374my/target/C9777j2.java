package com.p374my.target;

/* renamed from: com.my.target.j2 */
public class C9777j2 extends C10066z1 {
    public final String source;

    public C9777j2(String str) {
        this.source = str;
    }

    public static C9777j2 newContent(C9733h2 h2Var, String str) {
        C9777j2 j2Var = new C9777j2(str);
        j2Var.f25051id = h2Var.f25051id;
        j2Var.trackingLink = h2Var.trackingLink;
        j2Var.deeplink = h2Var.deeplink;
        j2Var.urlscheme = h2Var.urlscheme;
        j2Var.bundleId = h2Var.bundleId;
        j2Var.navigationType = h2Var.navigationType;
        j2Var.directLink = h2Var.directLink;
        j2Var.openInBrowser = h2Var.openInBrowser;
        return j2Var;
    }

    public String getSource() {
        return this.source;
    }
}
