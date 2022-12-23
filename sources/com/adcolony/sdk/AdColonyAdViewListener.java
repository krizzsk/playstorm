package com.adcolony.sdk;

public abstract class AdColonyAdViewListener {

    /* renamed from: a */
    String f114a = "";

    /* renamed from: b */
    AdColonyAdSize f115b;

    /* renamed from: c */
    C0930p0 f116c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdSize mo10306a() {
        return this.f115b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0930p0 mo10310b() {
        return this.f116c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo10311c() {
        return this.f114a;
    }

    public void onClicked(AdColonyAdView adColonyAdView) {
    }

    public void onClosed(AdColonyAdView adColonyAdView) {
    }

    public void onLeftApplication(AdColonyAdView adColonyAdView) {
    }

    public void onOpened(AdColonyAdView adColonyAdView) {
    }

    public abstract void onRequestFilled(AdColonyAdView adColonyAdView);

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
    }

    public void onShow(AdColonyAdView adColonyAdView) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10308a(C0930p0 p0Var) {
        this.f116c = p0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10309a(String str) {
        this.f114a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10307a(AdColonyAdSize adColonyAdSize) {
        this.f115b = adColonyAdSize;
    }
}
