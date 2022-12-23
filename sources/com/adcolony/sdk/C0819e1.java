package com.adcolony.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.e1 */
class C0819e1 {

    /* renamed from: a */
    private final JSONArray f438a;

    C0819e1() {
        this(new JSONArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo10687a(int i) throws JSONException {
        return this.f438a.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10691b(int i) throws JSONException {
        return this.f438a.getInt(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0823f1 mo10693c(int i) {
        C0823f1 f1Var;
        synchronized (this.f438a) {
            JSONObject optJSONObject = this.f438a.optJSONObject(i);
            f1Var = optJSONObject != null ? new C0823f1(optJSONObject) : new C0823f1();
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo10695d(int i) {
        String optString;
        synchronized (this.f438a) {
            optString = this.f438a.optString(i);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo10697e(int i) {
        synchronized (this.f438a) {
            if (!this.f438a.isNull(i)) {
                Object opt = this.f438a.opt(i);
                if (opt instanceof String) {
                    String str = (String) opt;
                    return str;
                } else if (opt != null) {
                    String valueOf = String.valueOf(opt);
                    return valueOf;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0819e1 mo10698f(int i) {
        synchronized (this.f438a) {
            this.f438a.put(i);
        }
        return this;
    }

    public String toString() {
        String jSONArray;
        synchronized (this.f438a) {
            jSONArray = this.f438a.toString();
        }
        return jSONArray;
    }

    C0819e1(String str) throws JSONException {
        this(new JSONArray(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0819e1 mo10686a(C0823f1 f1Var) {
        synchronized (this.f438a) {
            this.f438a.put(f1Var.mo10718a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0819e1 mo10692b(String str) {
        synchronized (this.f438a) {
            this.f438a.put(str);
        }
        return this;
    }

    C0819e1(JSONArray jSONArray) throws NullPointerException {
        jSONArray.getClass();
        this.f438a = jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String[] mo10696d() {
        String[] strArr;
        synchronized (this.f438a) {
            strArr = new String[this.f438a.length()];
            for (int i = 0; i < this.f438a.length(); i++) {
                strArr[i] = mo10695d(i);
            }
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10689a(String str) {
        boolean z;
        synchronized (this.f438a) {
            z = false;
            int i = 0;
            while (true) {
                if (i >= this.f438a.length()) {
                    break;
                } else if (mo10695d(i).equals(str)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10690b() {
        return this.f438a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0823f1[] mo10694c() {
        C0823f1[] f1VarArr;
        synchronized (this.f438a) {
            f1VarArr = new C0823f1[this.f438a.length()];
            for (int i = 0; i < this.f438a.length(); i++) {
                f1VarArr[i] = mo10693c(i);
            }
        }
        return f1VarArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo10688a() {
        return this.f438a;
    }
}
