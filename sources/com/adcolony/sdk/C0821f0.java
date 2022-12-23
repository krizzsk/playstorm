package com.adcolony.sdk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.adcolony.sdk.f0 */
class C0821f0 {

    /* renamed from: e */
    static final SimpleDateFormat f440e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Date f441a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f442b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0732b0 f443c;

    /* renamed from: d */
    protected String f444d;

    /* renamed from: com.adcolony.sdk.f0$a */
    static class C0822a {

        /* renamed from: a */
        protected C0821f0 f445a = new C0821f0();

        C0822a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0822a mo10708a(int i) {
            int unused = this.f445a.f442b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0822a mo10709a(C0732b0 b0Var) {
            C0732b0 unused = this.f445a.f443c = b0Var;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0822a mo10710a(String str) {
            this.f445a.f444d = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0821f0 mo10711a() {
            if (this.f445a.f441a == null) {
                Date unused = this.f445a.f441a = new Date(System.currentTimeMillis());
            }
            return this.f445a;
        }
    }

    C0821f0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo10704b() {
        int i = this.f442b;
        if (i == -1) {
            return "Fatal";
        }
        if (i == 0) {
            return "Error";
        }
        if (i == 1) {
            return "Warn";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN LOG LEVEL" : "Debug";
        }
        return "Info";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo10705c() {
        return this.f444d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo10706d() {
        return f440e.format(this.f441a);
    }

    public String toString() {
        return mo10706d() + " " + mo10704b() + "/" + mo10703a().mo10498a() + ": " + mo10705c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0732b0 mo10703a() {
        return this.f443c;
    }
}
