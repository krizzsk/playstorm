package com.adcolony.sdk;

import com.adcolony.sdk.C0817e0;
import com.mbridge.msdk.foundation.entity.CampaignEx;

public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;
    @Deprecated
    public static final int NATIVE = 2;

    /* renamed from: a */
    private String f165a;

    /* renamed from: b */
    private String f166b;

    /* renamed from: c */
    private int f167c = 5;

    /* renamed from: d */
    private int f168d;

    /* renamed from: e */
    private int f169e;

    /* renamed from: f */
    private int f170f;

    /* renamed from: g */
    private int f171g;

    /* renamed from: h */
    private int f172h;

    /* renamed from: i */
    private int f173i;

    /* renamed from: j */
    private boolean f174j;

    /* renamed from: k */
    private boolean f175k;

    AdColonyZone(String str) {
        this.f165a = str;
    }

    /* renamed from: a */
    private int m120a(int i) {
        if (C0714a.m139d() && !C0714a.m136b().mo10805E() && !C0714a.m136b().mo10806F()) {
            return i;
        }
        m124b();
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10456b(int i) {
        this.f173i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10457c(int i) {
        this.f167c = i;
    }

    public int getPlayFrequency() {
        return m120a(this.f171g);
    }

    public int getRemainingViewsUntilReward() {
        return m120a(this.f169e);
    }

    public int getRewardAmount() {
        return m120a(this.f172h);
    }

    public String getRewardName() {
        return m121a(this.f166b);
    }

    public int getViewsPerReward() {
        return m120a(this.f170f);
    }

    public String getZoneID() {
        return m121a(this.f165a);
    }

    public int getZoneType() {
        return this.f168d;
    }

    public boolean isRewarded() {
        return this.f175k;
    }

    public boolean isValid() {
        return m123a(this.f174j);
    }

    /* renamed from: b */
    private void m124b() {
        new C0817e0.C0818a().mo10684a("The AdColonyZone API is not available while AdColony is disabled.").mo10685a(C0817e0.f433h);
    }

    /* renamed from: a */
    private boolean m123a(boolean z) {
        if (C0714a.m139d() && !C0714a.m136b().mo10805E() && !C0714a.m136b().mo10806F()) {
            return z;
        }
        m124b();
        return false;
    }

    /* renamed from: a */
    private String m121a(String str) {
        return m122a(str, "");
    }

    /* renamed from: a */
    private String m122a(String str, String str2) {
        if (C0714a.m139d() && !C0714a.m136b().mo10805E() && !C0714a.m136b().mo10806F()) {
            return str;
        }
        m124b();
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10455a(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        C0823f1 f = C0764c0.m334f(a, "reward");
        this.f166b = C0764c0.m336h(f, CampaignEx.JSON_KEY_REWARD_NAME);
        this.f172h = C0764c0.m332d(f, CampaignEx.JSON_KEY_REWARD_AMOUNT);
        this.f170f = C0764c0.m332d(f, "views_per_reward");
        this.f169e = C0764c0.m332d(f, "views_until_reward");
        this.f175k = C0764c0.m325b(a, "rewarded");
        this.f167c = C0764c0.m332d(a, "status");
        this.f168d = C0764c0.m332d(a, "type");
        this.f171g = C0764c0.m332d(a, "play_interval");
        this.f165a = C0764c0.m336h(a, "zone_id");
        boolean z = true;
        if (this.f167c == 1) {
            z = false;
        }
        this.f174j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10454a() {
        return this.f173i;
    }
}
