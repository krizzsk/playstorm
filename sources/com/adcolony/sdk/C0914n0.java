package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.n0 */
class C0914n0 {

    /* renamed from: a */
    private final int f625a;

    /* renamed from: b */
    private final List<C0915a> f626b = new ArrayList();

    /* renamed from: com.adcolony.sdk.n0$a */
    static class C0915a {

        /* renamed from: a */
        private final String f627a;

        /* renamed from: b */
        private final String f628b;

        /* renamed from: c */
        private final int f629c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String[] f630d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String[] f631e;

        /* renamed from: f */
        private final List<C0916b> f632f = new ArrayList();

        /* renamed from: g */
        private final List<C0917c> f633g = new ArrayList();

        /* renamed from: h */
        private final C0918d f634h;

        /* renamed from: i */
        private final Map<String, String> f635i;

        C0915a(C0823f1 f1Var) throws JSONException {
            this.f627a = f1Var.mo10734e("stream");
            this.f628b = f1Var.mo10734e("table_name");
            this.f629c = f1Var.mo10713a("max_rows", 10000);
            C0819e1 l = f1Var.mo10743l("event_types");
            this.f630d = l != null ? C0764c0.m321a(l) : new String[0];
            C0819e1 l2 = f1Var.mo10743l("request_types");
            this.f631e = l2 != null ? C0764c0.m321a(l2) : new String[0];
            for (C0823f1 bVar : C0764c0.m329b(f1Var.mo10730c("columns"))) {
                this.f632f.add(new C0916b(bVar));
            }
            for (C0823f1 cVar : C0764c0.m329b(f1Var.mo10730c("indexes"))) {
                this.f633g.add(new C0917c(cVar, this.f628b));
            }
            C0823f1 n = f1Var.mo10745n("ttl");
            this.f634h = n != null ? new C0918d(n) : null;
            this.f635i = f1Var.mo10744m("queries").mo10736f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo10900c() {
            return this.f629c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo10901d() {
            return this.f627a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map<String, String> mo10902e() {
            return this.f635i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo10903f() {
            return this.f628b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0918d mo10904g() {
            return this.f634h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C0916b> mo10898a() {
            return this.f632f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<C0917c> mo10899b() {
            return this.f633g;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$b */
    static class C0916b {

        /* renamed from: a */
        private final String f636a;

        /* renamed from: b */
        private final String f637b;

        /* renamed from: c */
        private final Object f638c;

        C0916b(C0823f1 f1Var) throws JSONException {
            this.f636a = f1Var.mo10734e("name");
            this.f637b = f1Var.mo10734e("type");
            this.f638c = f1Var.mo10746o("default");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo10905a() {
            return this.f638c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo10906b() {
            return this.f636a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo10907c() {
            return this.f637b;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$c */
    static class C0917c {

        /* renamed from: a */
        private final String f639a;

        /* renamed from: b */
        private final String[] f640b;

        C0917c(C0823f1 f1Var, String str) throws JSONException {
            this.f639a = str + "_" + f1Var.mo10734e("name");
            this.f640b = C0764c0.m321a(f1Var.mo10730c("columns"));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String[] mo10908a() {
            return this.f640b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo10909b() {
            return this.f639a;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$d */
    static class C0918d {

        /* renamed from: a */
        private final long f641a;

        /* renamed from: b */
        private final String f642b;

        C0918d(C0823f1 f1Var) throws JSONException {
            this.f641a = f1Var.mo10733d("seconds");
            this.f642b = f1Var.mo10734e("column");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo10910a() {
            return this.f642b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo10911b() {
            return this.f641a;
        }
    }

    C0914n0(C0823f1 f1Var) throws JSONException {
        this.f625a = f1Var.mo10724b("version");
        for (C0823f1 aVar : C0764c0.m329b(f1Var.mo10730c("streams"))) {
            this.f626b.add(new C0915a(aVar));
        }
    }

    /* renamed from: a */
    static C0914n0 m792a(C0823f1 f1Var) {
        try {
            return new C0914n0(f1Var);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10897b() {
        return this.f625a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0915a> mo10896a() {
        return this.f626b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0915a mo10895a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (C0915a next : this.f626b) {
            int i = 0;
            for (String equals : next.f630d) {
                if (str.equals(equals)) {
                    return next;
                }
            }
            String[] b = next.f631e;
            int length = b.length;
            while (true) {
                if (i < length) {
                    if (str.equals(b[i])) {
                        return next;
                    }
                    i++;
                }
            }
        }
        return null;
    }
}
