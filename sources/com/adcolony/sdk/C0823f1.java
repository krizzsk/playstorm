package com.adcolony.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.f1 */
class C0823f1 {

    /* renamed from: a */
    private final JSONObject f446a;

    C0823f1() {
        this(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10720a(C0823f1 f1Var) {
        if (f1Var != null) {
            synchronized (this.f446a) {
                synchronized (f1Var.f446a) {
                    Iterator<String> c = f1Var.m481c();
                    while (c.hasNext()) {
                        String next = c.next();
                        try {
                            this.f446a.put(next, f1Var.f446a.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10724b(String str) throws JSONException {
        int i;
        synchronized (this.f446a) {
            i = this.f446a.getInt(str);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0819e1 mo10730c(String str) throws JSONException {
        C0819e1 e1Var;
        synchronized (this.f446a) {
            e1Var = new C0819e1(this.f446a.getJSONArray(str));
        }
        return e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo10733d(String str) throws JSONException {
        long j;
        synchronized (this.f446a) {
            j = this.f446a.getLong(str);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo10734e(String str) throws JSONException {
        String string;
        synchronized (this.f446a) {
            string = this.f446a.getString(str);
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10737f(String str) {
        boolean optBoolean;
        synchronized (this.f446a) {
            optBoolean = this.f446a.optBoolean(str);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Boolean mo10738g(String str) {
        Boolean valueOf;
        try {
            synchronized (this.f446a) {
                valueOf = Boolean.valueOf(this.f446a.getBoolean(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public double mo10739h(String str) {
        double optDouble;
        synchronized (this.f446a) {
            optDouble = this.f446a.optDouble(str);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Integer mo10740i(String str) {
        Integer valueOf;
        try {
            synchronized (this.f446a) {
                valueOf = Integer.valueOf(this.f446a.getInt(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo10741j(String str) {
        int optInt;
        synchronized (this.f446a) {
            optInt = this.f446a.optInt(str);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0819e1 mo10742k(String str) {
        C0819e1 e1Var;
        synchronized (this.f446a) {
            JSONArray optJSONArray = this.f446a.optJSONArray(str);
            e1Var = optJSONArray != null ? new C0819e1(optJSONArray) : new C0819e1();
        }
        return e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0819e1 mo10743l(String str) {
        C0819e1 e1Var;
        synchronized (this.f446a) {
            JSONArray optJSONArray = this.f446a.optJSONArray(str);
            e1Var = optJSONArray != null ? new C0819e1(optJSONArray) : null;
        }
        return e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0823f1 mo10744m(String str) {
        C0823f1 f1Var;
        synchronized (this.f446a) {
            JSONObject optJSONObject = this.f446a.optJSONObject(str);
            f1Var = optJSONObject != null ? new C0823f1(optJSONObject) : new C0823f1();
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0823f1 mo10745n(String str) {
        C0823f1 f1Var;
        synchronized (this.f446a) {
            JSONObject optJSONObject = this.f446a.optJSONObject(str);
            f1Var = optJSONObject != null ? new C0823f1(optJSONObject) : null;
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Object mo10746o(String str) {
        Object opt;
        synchronized (this.f446a) {
            opt = this.f446a.isNull(str) ? null : this.f446a.opt(str);
        }
        return opt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo10747p(String str) {
        String optString;
        synchronized (this.f446a) {
            optString = this.f446a.optString(str);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        return null;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo10748q(java.lang.String r3) {
        /*
            r2 = this;
            org.json.JSONObject r0 = r2.f446a
            monitor-enter(r0)
            org.json.JSONObject r1 = r2.f446a     // Catch:{ all -> 0x0024 }
            boolean r1 = r1.isNull(r3)     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0021
            org.json.JSONObject r1 = r2.f446a     // Catch:{ all -> 0x0024 }
            java.lang.Object r3 = r1.opt(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof java.lang.String     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0019:
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            r3 = 0
            return r3
        L_0x0024:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0823f1.mo10748q(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10749r(String str) {
        synchronized (this.f446a) {
            this.f446a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f446a) {
            jSONObject = this.f446a.toString();
        }
        return jSONObject;
    }

    C0823f1(String str) throws JSONException {
        this(new JSONObject(str));
    }

    C0823f1(Map<?, ?> map) {
        this(new JSONObject(map));
    }

    C0823f1(JSONObject jSONObject) throws NullPointerException {
        jSONObject.getClass();
        this.f446a = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0823f1 mo10728b(String str, boolean z) throws JSONException {
        synchronized (this.f446a) {
            this.f446a.put(str, z);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10731c(String str, int i) throws JSONException {
        synchronized (this.f446a) {
            if (this.f446a.has(str)) {
                return false;
            }
            this.f446a.put(str, i);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo10732d() {
        return this.f446a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10735e() {
        synchronized (this.f446a) {
            Iterator<String> c = m481c();
            while (c.hasNext()) {
                Object o = mo10746o(c.next());
                if (o == null || (((o instanceof JSONArray) && ((JSONArray) o).length() == 0) || (((o instanceof JSONObject) && ((JSONObject) o).length() == 0) || o.equals("")))) {
                    c.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, String> mo10736f() {
        HashMap hashMap = new HashMap();
        synchronized (this.f446a) {
            Iterator<String> c = m481c();
            while (c.hasNext()) {
                String next = c.next();
                hashMap.put(next, mo10747p(next));
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0823f1 mo10726b(String str, int i) throws JSONException {
        synchronized (this.f446a) {
            this.f446a.put(str, i);
        }
        return this;
    }

    /* renamed from: c */
    private Iterator<String> m481c() {
        return this.f446a.keys();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0823f1 mo10727b(String str, long j) throws JSONException {
        synchronized (this.f446a) {
            this.f446a.put(str, j);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0823f1 mo10725b(String str, double d) throws JSONException {
        synchronized (this.f446a) {
            this.f446a.put(str, d);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10722a(String str) {
        boolean z;
        synchronized (this.f446a) {
            Iterator<String> c = m481c();
            while (true) {
                if (c.hasNext()) {
                    if (str.equals(c.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10729b() {
        return mo10732d() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10723a(String str, boolean z) {
        boolean optBoolean;
        synchronized (this.f446a) {
            optBoolean = this.f446a.optBoolean(str, z);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10713a(String str, int i) {
        int optInt;
        synchronized (this.f446a) {
            optInt = this.f446a.optInt(str, i);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo10714a(String str, long j) {
        long optLong;
        synchronized (this.f446a) {
            optLong = this.f446a.optLong(str, j);
        }
        return optLong;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo10712a(String str, double d) {
        double optDouble;
        synchronized (this.f446a) {
            optDouble = this.f446a.optDouble(str, d);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0823f1 mo10717a(String str, String str2) throws JSONException {
        synchronized (this.f446a) {
            this.f446a.put(str, str2);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0823f1 mo10716a(String str, C0823f1 f1Var) throws JSONException {
        synchronized (this.f446a) {
            this.f446a.put(str, f1Var.mo10718a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0823f1 mo10715a(String str, C0819e1 e1Var) throws JSONException {
        synchronized (this.f446a) {
            this.f446a.put(str, e1Var.mo10688a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10721a(String[] strArr) {
        synchronized (this.f446a) {
            for (String remove : strArr) {
                this.f446a.remove(remove);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10719a(C0819e1 e1Var) {
        synchronized (this.f446a) {
            Iterator<String> c = m481c();
            while (c.hasNext()) {
                if (!e1Var.mo10689a(c.next())) {
                    c.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo10718a() {
        return this.f446a;
    }
}
