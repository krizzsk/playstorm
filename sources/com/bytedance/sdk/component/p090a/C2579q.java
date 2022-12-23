package com.bytedance.sdk.component.p090a;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.a.q */
/* compiled from: Js2JavaCall */
public class C2579q {

    /* renamed from: a */
    public final int f5501a;

    /* renamed from: b */
    public final String f5502b;

    /* renamed from: c */
    public final String f5503c;

    /* renamed from: d */
    public final String f5504d;

    /* renamed from: e */
    public final String f5505e;

    /* renamed from: f */
    public final String f5506f;

    /* renamed from: g */
    public final String f5507g;

    /* renamed from: h */
    public final String f5508h;

    /* renamed from: a */
    public static C2581a m6552a() {
        return new C2581a();
    }

    /* renamed from: a */
    public static C2579q m6553a(String str, int i) {
        return new C2579q(str, i);
    }

    private C2579q(String str, int i) {
        this.f5502b = null;
        this.f5503c = null;
        this.f5504d = null;
        this.f5505e = null;
        this.f5506f = str;
        this.f5507g = null;
        this.f5501a = i;
        this.f5508h = null;
    }

    private C2579q(C2581a aVar) {
        this.f5502b = aVar.f5509a;
        this.f5503c = aVar.f5510b;
        this.f5504d = aVar.f5511c;
        this.f5505e = aVar.f5512d;
        this.f5506f = aVar.f5513e;
        this.f5507g = aVar.f5514f;
        this.f5501a = 1;
        this.f5508h = aVar.f5515g;
    }

    /* renamed from: a */
    public static boolean m6554a(C2579q qVar) {
        if (qVar == null || qVar.f5501a != 1 || TextUtils.isEmpty(qVar.f5504d) || TextUtils.isEmpty(qVar.f5505e)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "methodName: " + this.f5504d + ", params: " + this.f5505e + ", callbackId: " + this.f5506f + ", type: " + this.f5503c + ", version: " + this.f5502b + ", ";
    }

    /* renamed from: com.bytedance.sdk.component.a.q$a */
    /* compiled from: Js2JavaCall */
    public static final class C2581a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f5509a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f5510b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f5511c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f5512d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f5513e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f5514f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f5515g;

        private C2581a() {
        }

        /* renamed from: a */
        public C2581a mo16594a(String str) {
            this.f5509a = str;
            return this;
        }

        /* renamed from: b */
        public C2581a mo16596b(String str) {
            this.f5510b = str;
            return this;
        }

        /* renamed from: c */
        public C2581a mo16597c(String str) {
            this.f5511c = str;
            return this;
        }

        /* renamed from: d */
        public C2581a mo16598d(String str) {
            this.f5512d = str;
            return this;
        }

        /* renamed from: e */
        public C2581a mo16599e(String str) {
            this.f5513e = str;
            return this;
        }

        /* renamed from: f */
        public C2581a mo16600f(String str) {
            this.f5514f = str;
            return this;
        }

        /* renamed from: g */
        public C2581a mo16601g(String str) {
            this.f5515g = str;
            return this;
        }

        /* renamed from: a */
        public C2579q mo16595a() {
            return new C2579q(this);
        }
    }
}
