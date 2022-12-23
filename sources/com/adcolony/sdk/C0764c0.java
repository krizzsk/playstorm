package com.adcolony.sdk;

import com.adcolony.sdk.C0817e0;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.c0 */
class C0764c0 {
    /* renamed from: a */
    static C0823f1 m312a(String str, String str2) {
        String str3;
        try {
            return new C0823f1(str);
        } catch (JSONException e) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2 + ": " + e.toString();
            }
            new C0817e0.C0818a().mo10684a(str3).mo10685a(C0817e0.f434i);
            return new C0823f1();
        }
    }

    /* renamed from: b */
    static C0823f1 m322b() {
        return new C0823f1();
    }

    /* renamed from: c */
    static double m330c(C0823f1 f1Var, String str) {
        return f1Var.mo10712a(str, 0.0d);
    }

    /* renamed from: d */
    static int m332d(C0823f1 f1Var, String str) {
        return f1Var.mo10741j(str);
    }

    /* renamed from: e */
    static C0819e1 m333e(C0823f1 f1Var, String str) {
        return f1Var.mo10743l(str);
    }

    /* renamed from: f */
    static C0823f1 m334f(C0823f1 f1Var, String str) {
        return f1Var.mo10744m(str);
    }

    /* renamed from: g */
    static Object m335g(C0823f1 f1Var, String str) {
        Object o = f1Var.mo10746o(str);
        return o == null ? Boolean.FALSE : o;
    }

    /* renamed from: h */
    static String m336h(C0823f1 f1Var, String str) {
        return f1Var.mo10747p(str);
    }

    /* renamed from: i */
    static String m337i(C0823f1 f1Var, String str) {
        return f1Var.mo10748q(str);
    }

    /* renamed from: j */
    static boolean m338j(C0823f1 f1Var, String str) {
        try {
            C0714a.m136b().mo10845p().mo11101a(str, f1Var.toString(), false);
            return true;
        } catch (IOException e) {
            new C0817e0.C0818a().mo10684a("IOException in ADCJSON's saveObject: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: b */
    static C0823f1 m323b(String str) {
        return m312a(str, (String) null);
    }

    /* renamed from: c */
    static C0823f1 m331c(String str) {
        try {
            String sb = C0714a.m136b().mo10845p().mo11100a(str, false).toString();
            return m312a(sb, "loadObject from filepath " + str);
        } catch (IOException e) {
            new C0817e0.C0818a().mo10684a("IOException in ADCJSON's loadObject: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            return m322b();
        }
    }

    /* renamed from: b */
    static String m324b(C0819e1 e1Var, int i) {
        return e1Var.mo10695d(i);
    }

    /* renamed from: b */
    static boolean m325b(C0823f1 f1Var, String str) {
        return f1Var.mo10737f(str);
    }

    /* renamed from: b */
    static boolean m326b(C0823f1 f1Var, String str, int i) {
        try {
            f1Var.mo10726b(str, i);
            return true;
        } catch (JSONException e) {
            C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("JSON error in ADCJSON putInteger(): ").mo10684a(e.toString());
            C0817e0.C0818a a2 = a.mo10684a(" with key: " + str);
            a2.mo10684a(" and value: " + i).mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: a */
    static C0819e1 m308a() {
        return new C0819e1();
    }

    /* renamed from: a */
    static C0819e1 m310a(String str) {
        try {
            return new C0819e1(str);
        } catch (JSONException e) {
            new C0817e0.C0818a().mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            return new C0819e1();
        }
    }

    /* renamed from: b */
    static boolean m327b(C0823f1 f1Var, String str, long j) {
        try {
            f1Var.mo10727b(str, j);
            return true;
        } catch (JSONException e) {
            C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("JSON error in ADCJSON putLong(): ").mo10684a(e.toString());
            C0817e0.C0818a a2 = a.mo10684a(" with key: " + str);
            a2.mo10684a(" and value: " + j).mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: a */
    static int m306a(C0823f1 f1Var, String str, int i) {
        return f1Var.mo10713a(str, i);
    }

    /* renamed from: a */
    static long m307a(C0823f1 f1Var, String str, long j) {
        return f1Var.mo10714a(str, j);
    }

    /* renamed from: a */
    static boolean m320a(C0823f1 f1Var, String str, boolean z) {
        return f1Var.mo10723a(str, z);
    }

    /* renamed from: a */
    static C0823f1 m311a(C0819e1 e1Var, int i) {
        return e1Var.mo10693c(i);
    }

    /* renamed from: a */
    static C0819e1 m309a(C0823f1 f1Var, String str) {
        return f1Var.mo10742k(str);
    }

    /* renamed from: b */
    static boolean m328b(C0823f1 f1Var, String str, boolean z) {
        try {
            f1Var.mo10728b(str, z);
            return true;
        } catch (JSONException e) {
            C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("JSON error in ADCJSON putBoolean(): ").mo10684a(e.toString());
            C0817e0.C0818a a2 = a.mo10684a(" with key: " + str);
            a2.mo10684a(" and value: " + z).mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m319a(C0823f1 f1Var, String str, String str2) {
        try {
            f1Var.mo10717a(str, str2);
            return true;
        } catch (JSONException e) {
            C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("JSON error in ADCJSON putString(): ").mo10684a(e.toString());
            C0817e0.C0818a a2 = a.mo10684a(" with key: " + str);
            a2.mo10684a(" and value: " + str2).mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: b */
    static C0823f1[] m329b(C0819e1 e1Var) {
        return e1Var.mo10694c();
    }

    /* renamed from: a */
    static boolean m317a(C0823f1 f1Var, String str, C0819e1 e1Var) {
        try {
            f1Var.mo10715a(str, e1Var);
            return true;
        } catch (JSONException e) {
            C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("JSON error in ADCJSON putArray(): ").mo10684a(e.toString());
            C0817e0.C0818a a2 = a.mo10684a(" with key: " + str);
            a2.mo10684a(" and value: " + e1Var).mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m318a(C0823f1 f1Var, String str, C0823f1 f1Var2) {
        try {
            f1Var.mo10716a(str, f1Var2);
            return true;
        } catch (JSONException e) {
            C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("JSON error in ADCJSON putObject(): ").mo10684a(e.toString());
            C0817e0.C0818a a2 = a.mo10684a(" with key: " + str);
            a2.mo10684a(" and value: " + f1Var2).mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m316a(C0823f1 f1Var, String str, double d) {
        try {
            f1Var.mo10725b(str, d);
            return true;
        } catch (JSONException unused) {
            C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("JSON error in ADCJSON putDouble(): ");
            C0817e0.C0818a a2 = a.mo10684a(" with key: " + str);
            a2.mo10684a(" and value: " + d).mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: a */
    static void m315a(C0819e1 e1Var, String str) {
        e1Var.mo10692b(str);
    }

    /* renamed from: a */
    static void m314a(C0819e1 e1Var, C0823f1 f1Var) {
        e1Var.mo10686a(f1Var);
    }

    /* renamed from: a */
    static String[] m321a(C0819e1 e1Var) {
        return e1Var.mo10696d();
    }

    /* renamed from: a */
    static C0823f1 m313a(C0823f1... f1VarArr) {
        C0823f1 f1Var = new C0823f1();
        for (C0823f1 a : f1VarArr) {
            f1Var.mo10720a(a);
        }
        return f1Var;
    }
}
