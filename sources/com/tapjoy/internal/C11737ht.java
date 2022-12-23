package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.adjust.sdk.Constants;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.io.IOException;

/* renamed from: com.tapjoy.internal.ht */
public final class C11737ht {

    /* renamed from: A */
    final C11832n f28562A = new C11832n(this.f28567b, "idfa");

    /* renamed from: B */
    final C11655g f28563B = new C11655g(this.f28567b, "idfa.optout");

    /* renamed from: C */
    final C11655g f28564C = new C11655g(this.f28567b, "push.optout");

    /* renamed from: D */
    final C11832n f28565D = new C11832n(this.f28567b, "appId");

    /* renamed from: a */
    final Context f28566a;

    /* renamed from: b */
    final SharedPreferences f28567b;

    /* renamed from: c */
    final C11832n f28568c = new C11832n(this.f28567b, "sdk");

    /* renamed from: d */
    final C11832n f28569d = new C11832n(this.f28567b, "ir");

    /* renamed from: e */
    final C11798j f28570e = new C11798j(this.f28567b, "fql", 0);

    /* renamed from: f */
    final C11798j f28571f = new C11798j(this.f28567b, "fq", 0);

    /* renamed from: g */
    final C11832n f28572g = new C11832n(this.f28567b, Constants.PUSH);

    /* renamed from: h */
    final C11798j f28573h = new C11798j(this.f28567b, "ss", 0);

    /* renamed from: i */
    final C11829k f28574i = new C11829k(this.f28567b, "std");

    /* renamed from: j */
    final C11829k f28575j = new C11829k(this.f28567b, "slt");

    /* renamed from: k */
    final C11829k f28576k = new C11829k(this.f28567b, "sld");

    /* renamed from: l */
    final C11832n f28577l = new C11832n(this.f28567b, "ptc");

    /* renamed from: m */
    final C11798j f28578m = new C11798j(this.f28567b, "pc", 0);

    /* renamed from: n */
    final C11750i f28579n = new C11750i(this.f28567b, "ptp");

    /* renamed from: o */
    final C11829k f28580o = new C11829k(this.f28567b, "lpt");

    /* renamed from: p */
    final C11750i f28581p = new C11750i(this.f28567b, "plp");

    /* renamed from: q */
    final C11832n f28582q = new C11832n(this.f28567b, "adv");

    /* renamed from: r */
    final C11832n f28583r = new C11832n(this.f28567b, "ui");

    /* renamed from: s */
    final C11798j f28584s = new C11798j(this.f28567b, "ul", -1);

    /* renamed from: t */
    final C11798j f28585t = new C11798j(this.f28567b, "uf", -1);

    /* renamed from: u */
    final C11832n f28586u = new C11832n(this.f28567b, TapjoyConstants.TJC_USER_VARIABLE_1);

    /* renamed from: v */
    final C11832n f28587v = new C11832n(this.f28567b, TapjoyConstants.TJC_USER_VARIABLE_2);

    /* renamed from: w */
    final C11832n f28588w = new C11832n(this.f28567b, TapjoyConstants.TJC_USER_VARIABLE_3);

    /* renamed from: x */
    final C11832n f28589x = new C11832n(this.f28567b, TapjoyConstants.TJC_USER_VARIABLE_4);

    /* renamed from: y */
    final C11832n f28590y = new C11832n(this.f28567b, TapjoyConstants.TJC_USER_VARIABLE_5);

    /* renamed from: z */
    final C11832n f28591z = new C11832n(this.f28567b, "utags");

    /* renamed from: a */
    public static C11737ht m34105a(Context context) {
        return new C11737ht(context);
    }

    private C11737ht(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f28566a = applicationContext;
        this.f28567b = applicationContext.getSharedPreferences("fiverocks", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SharedPreferences.Editor mo72667a() {
        return this.f28567b.edit();
    }

    /* renamed from: b */
    public final String mo72669b() {
        String string = this.f28567b.getString("ir", (String) null);
        if (string == null) {
            File file = new File(C11714hj.m34004c(this.f28566a), "referrer");
            if (file.exists()) {
                try {
                    string = C11442ba.m33242a(file, C11418af.f27664c);
                } catch (IOException unused) {
                }
            }
            this.f28567b.edit().putString("ir", string != null ? string : "").apply();
            if (string == null || string.length() <= 0) {
                return null;
            }
            return string;
        } else if (string.length() > 0) {
            return string;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo72668a(boolean z) {
        C11831m.m34392a(this.f28567b, "gcm.onServer", z);
    }
}
