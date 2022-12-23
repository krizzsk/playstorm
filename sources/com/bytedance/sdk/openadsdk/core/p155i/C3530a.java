package com.bytedance.sdk.openadsdk.core.p155i;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.a */
/* compiled from: AdSlotSetter */
public class C3530a {

    /* renamed from: A */
    public int f8767A = 5;

    /* renamed from: a */
    public String f8768a;

    /* renamed from: b */
    public int f8769b = 1;

    /* renamed from: c */
    public int f8770c = 1;

    /* renamed from: d */
    public int f8771d = 2;

    /* renamed from: e */
    public int f8772e = 1;

    /* renamed from: f */
    public int f8773f = 100;

    /* renamed from: g */
    public int f8774g = 0;

    /* renamed from: h */
    public int f8775h = 2;

    /* renamed from: i */
    public int f8776i = 1;

    /* renamed from: j */
    public int f8777j = 3;

    /* renamed from: k */
    public int f8778k = -1;

    /* renamed from: l */
    public int f8779l = 1;

    /* renamed from: m */
    public int f8780m = 1;

    /* renamed from: n */
    public int f8781n = 2;

    /* renamed from: o */
    public int f8782o = 1500;

    /* renamed from: p */
    public int f8783p = 2;

    /* renamed from: q */
    public int f8784q = -1;

    /* renamed from: r */
    public int f8785r = 0;

    /* renamed from: s */
    public int f8786s = 5;

    /* renamed from: t */
    public boolean f8787t = false;

    /* renamed from: u */
    public int f8788u = 0;

    /* renamed from: v */
    public List<String> f8789v;

    /* renamed from: w */
    public int f8790w = 2;

    /* renamed from: x */
    public int f8791x = -1;

    /* renamed from: y */
    public int f8792y = 0;

    /* renamed from: z */
    public int f8793z = 0;

    /* renamed from: a */
    public static C3530a m10917a() {
        return new C3530a();
    }

    private C3530a() {
    }

    /* renamed from: a */
    public C3530a mo19881a(int i) {
        this.f8791x = i;
        return this;
    }

    /* renamed from: b */
    public C3530a mo19885b(int i) {
        this.f8785r = i;
        return this;
    }

    /* renamed from: c */
    public C3530a mo19886c(int i) {
        this.f8788u = i;
        return this;
    }

    /* renamed from: d */
    public C3530a mo19887d(int i) {
        this.f8784q = i;
        return this;
    }

    /* renamed from: e */
    public C3530a mo19888e(int i) {
        this.f8781n = i;
        return this;
    }

    /* renamed from: f */
    public C3530a mo19889f(int i) {
        this.f8782o = i;
        return this;
    }

    /* renamed from: g */
    public C3530a mo19890g(int i) {
        this.f8783p = i;
        return this;
    }

    /* renamed from: h */
    public C3530a mo19891h(int i) {
        this.f8779l = i;
        return this;
    }

    /* renamed from: i */
    public C3530a mo19892i(int i) {
        this.f8778k = i;
        return this;
    }

    /* renamed from: j */
    public C3530a mo19893j(int i) {
        this.f8777j = i;
        return this;
    }

    /* renamed from: a */
    public C3530a mo19882a(String str) {
        this.f8768a = str;
        return this;
    }

    /* renamed from: k */
    public C3530a mo19894k(int i) {
        this.f8769b = i;
        return this;
    }

    /* renamed from: l */
    public C3530a mo19895l(int i) {
        this.f8770c = i;
        return this;
    }

    /* renamed from: m */
    public C3530a mo19896m(int i) {
        this.f8771d = i;
        return this;
    }

    /* renamed from: n */
    public C3530a mo19897n(int i) {
        this.f8772e = i;
        return this;
    }

    /* renamed from: o */
    public C3530a mo19898o(int i) {
        this.f8773f = i;
        return this;
    }

    /* renamed from: p */
    public C3530a mo19899p(int i) {
        this.f8774g = i;
        return this;
    }

    /* renamed from: q */
    public C3530a mo19900q(int i) {
        this.f8775h = i;
        return this;
    }

    /* renamed from: r */
    public C3530a mo19901r(int i) {
        this.f8776i = i;
        return this;
    }

    /* renamed from: s */
    public C3530a mo19902s(int i) {
        this.f8780m = i;
        return this;
    }

    /* renamed from: t */
    public C3530a mo19903t(int i) {
        this.f8790w = i;
        return this;
    }

    /* renamed from: a */
    public C3530a mo19883a(JSONArray jSONArray) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            this.f8789v = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    this.f8789v.add(jSONArray.get(i).toString());
                    i++;
                } catch (Exception unused) {
                }
            }
        }
        return this;
    }

    /* renamed from: u */
    public C3530a mo19904u(int i) {
        this.f8786s = i;
        return this;
    }

    /* renamed from: a */
    public C3530a mo19884a(boolean z) {
        this.f8787t = z;
        return this;
    }

    /* renamed from: v */
    public C3530a mo19905v(int i) {
        this.f8792y = i;
        return this;
    }

    /* renamed from: w */
    public C3530a mo19906w(int i) {
        this.f8793z = i;
        return this;
    }

    /* renamed from: x */
    public C3530a mo19907x(int i) {
        this.f8767A = i;
        return this;
    }
}
