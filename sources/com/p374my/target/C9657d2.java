package com.p374my.target;

/* renamed from: com.my.target.d2 */
public class C9657d2 extends C9625b2 {
    public String source;
    public float timeToReward;

    public static C9657d2 fromCompanion(C9600a2 a2Var) {
        C9657d2 newBanner = newBanner();
        newBanner.setId(a2Var.getId());
        newBanner.setSource(a2Var.getHtmlResource());
        newBanner.getStatHolder().mo63677a(a2Var.getStatHolder(), 0.0f);
        newBanner.trackingLink = a2Var.trackingLink;
        return newBanner;
    }

    public static C9657d2 newBanner() {
        return new C9657d2();
    }

    public String getSource() {
        return this.source;
    }

    public float getTimeToReward() {
        return this.timeToReward;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTimeToReward(float f) {
        this.timeToReward = f;
    }
}
