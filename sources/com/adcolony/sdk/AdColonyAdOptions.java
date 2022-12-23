package com.adcolony.sdk;

public class AdColonyAdOptions {

    /* renamed from: a */
    boolean f83a;

    /* renamed from: b */
    boolean f84b;

    /* renamed from: c */
    AdColonyUserMetadata f85c;

    /* renamed from: d */
    C0823f1 f86d = C0764c0.m322b();

    public AdColonyAdOptions enableConfirmationDialog(boolean z) {
        this.f83a = z;
        C0764c0.m328b(this.f86d, "confirmation_enabled", true);
        return this;
    }

    public AdColonyAdOptions enableResultsDialog(boolean z) {
        this.f84b = z;
        C0764c0.m328b(this.f86d, "results_enabled", true);
        return this;
    }

    public Object getOption(String str) {
        return C0764c0.m335g(this.f86d, str);
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f85c;
    }

    public AdColonyAdOptions setOption(String str, boolean z) {
        if (C1038z0.m1213e(str)) {
            C0764c0.m328b(this.f86d, str, z);
        }
        return this;
    }

    @Deprecated
    public AdColonyAdOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f85c = adColonyUserMetadata;
        C0764c0.m318a(this.f86d, "user_metadata", adColonyUserMetadata.f163b);
        return this;
    }

    public AdColonyAdOptions setOption(String str, double d) {
        if (C1038z0.m1213e(str)) {
            C0764c0.m316a(this.f86d, str, d);
        }
        return this;
    }

    public AdColonyAdOptions setOption(String str, String str2) {
        if (str != null) {
            C0764c0.m319a(this.f86d, str, str2);
        }
        return this;
    }
}
