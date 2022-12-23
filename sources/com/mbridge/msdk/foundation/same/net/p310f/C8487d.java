package com.mbridge.msdk.foundation.same.net.p310f;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8595p;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.d */
/* compiled from: RequestUrlUtil */
public final class C8487d {

    /* renamed from: A */
    public String f20509A;

    /* renamed from: B */
    public String f20510B;

    /* renamed from: C */
    public int f20511C;

    /* renamed from: D */
    public int f20512D;

    /* renamed from: E */
    public boolean f20513E;

    /* renamed from: F */
    public ArrayList<String> f20514F;

    /* renamed from: G */
    public ArrayList<String> f20515G;

    /* renamed from: H */
    private final String f20516H;

    /* renamed from: I */
    private boolean f20517I;

    /* renamed from: J */
    private int f20518J;

    /* renamed from: K */
    private String f20519K;

    /* renamed from: L */
    private String f20520L;

    /* renamed from: M */
    private String f20521M;

    /* renamed from: N */
    private String f20522N;

    /* renamed from: O */
    private String f20523O;

    /* renamed from: P */
    private String f20524P;

    /* renamed from: Q */
    private String f20525Q;

    /* renamed from: R */
    private String f20526R;

    /* renamed from: S */
    private String f20527S;

    /* renamed from: T */
    private String f20528T;

    /* renamed from: U */
    private String f20529U;

    /* renamed from: V */
    private String f20530V;

    /* renamed from: a */
    public String f20531a;

    /* renamed from: b */
    public String f20532b;

    /* renamed from: c */
    public String f20533c;

    /* renamed from: d */
    public String f20534d;

    /* renamed from: e */
    public String f20535e;

    /* renamed from: f */
    public int f20536f;

    /* renamed from: g */
    public int f20537g;

    /* renamed from: h */
    public boolean f20538h;

    /* renamed from: i */
    public int f20539i;

    /* renamed from: j */
    public String f20540j;

    /* renamed from: k */
    public String f20541k;

    /* renamed from: l */
    public String f20542l;

    /* renamed from: m */
    public String f20543m;

    /* renamed from: n */
    public String f20544n;

    /* renamed from: o */
    public String f20545o;

    /* renamed from: p */
    public String f20546p;

    /* renamed from: q */
    public String f20547q;

    /* renamed from: r */
    public String f20548r;

    /* renamed from: s */
    public String f20549s;

    /* renamed from: t */
    public String f20550t;

    /* renamed from: u */
    public String f20551u;

    /* renamed from: v */
    public String f20552v;

    /* renamed from: w */
    public String f20553w;

    /* renamed from: x */
    public String f20554x;

    /* renamed from: y */
    public String f20555y;

    /* renamed from: z */
    public String f20556z;

    /* renamed from: com.mbridge.msdk.foundation.same.net.f.d$a */
    /* compiled from: RequestUrlUtil */
    private static class C8489a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8487d f20557a = new C8487d();
    }

    private C8487d() {
        this.f20516H = "RequestUrlUtil";
        this.f20517I = true;
        this.f20518J = 0;
        this.f20519K = "https://{}hb.rayjump.com";
        this.f20531a = "https://analytics.rayjump.com";
        this.f20532b = "https://net.rayjump.com";
        this.f20533c = "https://configure.rayjump.com";
        this.f20534d = "configure-tcp.rayjump.com";
        this.f20535e = C8595p.m24815b("DkPtYdQTLkfAW+xUhoPwLkPTHkJBDkM/Yr5T");
        this.f20536f = 9377;
        this.f20537g = 9377;
        this.f20538h = false;
        this.f20539i = 1;
        this.f20520L = "/bid";
        this.f20521M = "/load";
        this.f20522N = "/openapi/ad/v3";
        this.f20523O = "/openapi/ad/v4";
        this.f20524P = "/openapi/ad/v5";
        this.f20525Q = "/image";
        this.f20526R = "/mapping";
        this.f20527S = "/setting";
        this.f20528T = "/sdk/customid";
        this.f20529U = "/rewardsetting";
        this.f20530V = "/appwall/setting";
        this.f20540j = this.f20519K + this.f20520L;
        this.f20541k = this.f20519K + this.f20521M;
        this.f20542l = this.f20532b + this.f20522N;
        this.f20543m = this.f20532b + this.f20523O;
        this.f20544n = this.f20532b + this.f20524P;
        this.f20545o = this.f20532b + this.f20525Q;
        this.f20546p = this.f20533c + this.f20527S;
        this.f20547q = this.f20533c + this.f20528T;
        this.f20548r = this.f20533c + this.f20529U;
        this.f20549s = this.f20533c + this.f20526R;
        this.f20550t = this.f20533c + this.f20530V;
        this.f20551u = this.f20534d + this.f20527S;
        this.f20552v = this.f20534d + this.f20528T;
        this.f20553w = this.f20534d + this.f20529U;
        this.f20554x = this.f20534d + this.f20526R;
        this.f20555y = this.f20534d + this.f20530V;
        this.f20556z = "https://detect.rayjump.com/mapi/find";
        this.f20509A = "https://detect.rayjump.com/mapi/result";
        this.f20510B = "https://d1tru86qrby720.cloudfront.net/hostsetting";
        this.f20511C = 0;
        this.f20512D = 0;
        this.f20513E = false;
        this.f20514F = new ArrayList<>(Arrays.asList(new String[]{"https://configure.rayjump.com", "https://policy.rayjump.com", "https://lazy.rayjump.com", "https://check.rayjump.com"}));
        this.f20515G = new ArrayList<>(Arrays.asList(new String[]{"configure-tcp.rayjump.com", "policy-tcp.rayjump.com", "lazy-tcp.rayjump.com", "check-tcp.rayjump.com"}));
    }

    /* renamed from: a */
    public static C8487d m24492a() {
        return C8489a.f20557a;
    }

    /* renamed from: b */
    public final int mo57593b() {
        return this.f20518J;
    }

    /* renamed from: a */
    public final void mo57592a(int i) {
        this.f20518J = i;
    }

    /* renamed from: a */
    public final String mo57590a(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return mo57591a(true, split[1]);
                }
                return mo57591a(true, "");
            }
        } catch (Exception e) {
            C8608u.m24884d("RequestUrlUtil", e.getMessage());
        }
        return i % 2 == 0 ? this.f20544n : this.f20542l;
    }

    /* renamed from: a */
    public final String mo57591a(boolean z, String str) {
        if (!z) {
            return this.f20540j.replace(JsonUtils.EMPTY_JSON, "");
        }
        if (!this.f20541k.contains(JsonUtils.EMPTY_JSON) || TextUtils.isEmpty(str)) {
            return this.f20541k.replace(JsonUtils.EMPTY_JSON, "");
        }
        String str2 = this.f20541k;
        return str2.replace(JsonUtils.EMPTY_JSON, str + "-");
    }

    /* renamed from: c */
    public final void mo57594c() {
        HashMap<String, String> ax;
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        if (b != null) {
            this.f20538h = b.mo15460aC() == 2;
            this.f20539i = b.mo15460aC();
            this.f20517I = !b.mo15514i(2);
            if (b.mo15485ax() != null && b.mo15485ax().size() > 0 && (ax = b.mo15485ax()) != null && ax.size() > 0) {
                if (ax.containsKey("v") && !TextUtils.isEmpty(ax.get("v")) && m24493a(ax.get("v"))) {
                    this.f20532b = ax.get("v");
                    this.f20542l = this.f20532b + this.f20522N;
                    this.f20543m = this.f20532b + this.f20523O;
                    this.f20544n = this.f20532b + this.f20524P;
                    this.f20545o = this.f20532b + this.f20525Q;
                }
                if (ax.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(ax.get(CampaignEx.JSON_KEY_HB)) && m24493a(ax.get(CampaignEx.JSON_KEY_HB))) {
                    this.f20519K = ax.get(CampaignEx.JSON_KEY_HB);
                    this.f20540j = this.f20519K + this.f20520L;
                    this.f20541k = this.f20519K + this.f20521M;
                }
                if (ax.containsKey("lg") && !TextUtils.isEmpty(ax.get("lg"))) {
                    String str = ax.get("lg");
                    if (m24493a(str)) {
                        this.f20531a = str;
                    } else {
                        this.f20535e = str;
                    }
                }
                if (ax.containsKey("dr") && !TextUtils.isEmpty(ax.get("dr")) && m24493a(ax.get("dr"))) {
                    this.f20509A = ax.get("dr");
                }
                if (ax.containsKey("df") && !TextUtils.isEmpty(ax.get("df")) && m24493a(ax.get("df"))) {
                    this.f20556z = ax.get("df");
                }
            }
            String x = b.mo15544x();
            if (!TextUtils.isEmpty(x)) {
                this.f20533c = x;
                mo57596e();
                this.f20514F.add(0, x);
            }
            String y = b.mo15546y();
            if (!TextUtils.isEmpty(y)) {
                this.f20534d = y;
                mo57597f();
                this.f20515G.add(0, y);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo57595d() {
        try {
            if (!this.f20538h) {
                if (this.f20514F != null && this.f20511C <= this.f20514F.size() - 1) {
                    this.f20533c = this.f20514F.get(this.f20511C);
                    mo57596e();
                    return true;
                }
            } else if (this.f20515G != null && this.f20512D <= this.f20515G.size() - 1) {
                if (!m24493a(this.f20515G.get(this.f20512D))) {
                    this.f20534d = this.f20515G.get(this.f20512D);
                    mo57597f();
                }
                return true;
            }
            if (this.f20513E) {
                this.f20511C = 0;
                this.f20512D = 0;
            }
            return false;
        } catch (Throwable th) {
            C8608u.m24880a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private boolean m24493a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    /* renamed from: e */
    public final void mo57596e() {
        this.f20546p = this.f20533c + this.f20527S;
        this.f20547q = this.f20533c + this.f20528T;
        this.f20548r = this.f20533c + this.f20529U;
        this.f20549s = this.f20533c + this.f20526R;
        this.f20550t = this.f20533c + this.f20530V;
    }

    /* renamed from: f */
    public final void mo57597f() {
        this.f20551u = this.f20534d + this.f20527S;
        this.f20552v = this.f20534d + this.f20528T;
        this.f20553w = this.f20534d + this.f20529U;
        this.f20554x = this.f20534d + this.f20526R;
        this.f20555y = this.f20534d + this.f20530V;
    }
}
