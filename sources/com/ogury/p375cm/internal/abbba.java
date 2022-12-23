package com.ogury.p375cm.internal;

import com.ogury.core.OguryError;
import com.ogury.p375cm.internal.bacab;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.abbba */
public final class abbba {

    /* renamed from: a */
    public static final abbba f25716a = new abbba();

    /* renamed from: b */
    private static int f25717b = 2;

    /* renamed from: c */
    private static int f25718c = 1;

    /* renamed from: d */
    private static abbcb f25719d = new abbcb((abcab) null, (abcaa) null, 3, (bbabb) null);

    /* renamed from: e */
    private static acacc f25720e = new acacc((acbac) null, (acbab) null, 3, (bbabb) null);

    /* renamed from: f */
    private static accba f25721f = new accba((accca) null, (accbc) null, 3, (bbabb) null);

    /* renamed from: g */
    private static acbbb f25722g = new acbbb((accab) null, (accaa) null, 3, (bbabb) null);

    /* renamed from: h */
    private static abbcc f25723h = new abbcc();

    /* renamed from: i */
    private static Date f25724i = new Date();

    /* renamed from: j */
    private static acbcc f25725j = new acbcc(true, (OguryError) null, 2, (bbabb) null);

    /* renamed from: k */
    private static String f25726k = "";

    /* renamed from: l */
    private static String f25727l = "";

    /* renamed from: m */
    private static String f25728m = "";

    /* renamed from: n */
    private static String[] f25729n = new String[0];

    /* renamed from: o */
    private static String f25730o = "";

    /* renamed from: p */
    private static String f25731p = "";

    private abbba() {
    }

    /* renamed from: a */
    public static int m30710a() {
        return f25717b;
    }

    /* renamed from: a */
    public static void m30711a(int i) {
        f25718c = 1;
    }

    /* renamed from: a */
    public static void m30712a(long j) {
        f25724i.setTime(j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m30713a(abbba abbba, int i, int i2, Object obj) {
        f25717b = 2;
        f25719d = new abbcb((abcab) null, (abcaa) null, 3, (bbabb) null);
        f25720e = new acacc((acbac) null, (acbab) null, 3, (bbabb) null);
        f25721f = new accba((accca) null, (accbc) null, 3, (bbabb) null);
        f25722g = new acbbb((accab) null, (accaa) null, 3, (bbabb) null);
    }

    /* renamed from: a */
    public static void m30715a(acbcc acbcc) {
        bbabc.m30943b(acbcc, "<set-?>");
        f25725j = acbcc;
    }

    /* renamed from: a */
    public static void m30716a(String str) {
        bbabc.m30943b(str, "<set-?>");
        f25726k = str;
    }

    /* renamed from: a */
    public static void m30717a(Date date) {
        bbabc.m30943b(date, "<set-?>");
        f25724i = date;
    }

    /* renamed from: a */
    public static void m30718a(String[] strArr) {
        bbabc.m30943b(strArr, "value");
        bbabc.m30943b(strArr, "frameworksInResponse");
        String[] strArr2 = f25729n;
        int length = strArr2.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!bacab.aaaaa.m30920a(strArr, strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m30720b(m30741r());
        }
        f25729n = strArr;
    }

    /* renamed from: b */
    public static int m30719b() {
        return f25718c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m30720b(abbcb abbcb) {
        bbabc.m30943b(abbcb, "consentResult");
        m30739p();
        f25723h = new abbcc();
        f25724i = new Date();
        f25726k = "";
        f25727l = "";
        f25728m = "";
        f25719d = abbcb;
    }

    /* renamed from: b */
    public static void m30721b(String str) {
        bbabc.m30943b(str, "<set-?>");
        f25727l = str;
    }

    /* renamed from: c */
    public static abbcb m30722c() {
        return f25719d;
    }

    /* renamed from: c */
    public static void m30723c(String str) {
        bbabc.m30943b(str, "<set-?>");
        f25728m = str;
    }

    /* renamed from: d */
    public static acacc m30724d() {
        return f25720e;
    }

    /* renamed from: d */
    public static void m30725d(String str) {
        bbabc.m30943b(str, "<set-?>");
        f25730o = str;
    }

    /* renamed from: e */
    public static accba m30726e() {
        return f25721f;
    }

    /* renamed from: e */
    public static void m30727e(String str) {
        bbabc.m30943b(str, "<set-?>");
        f25731p = str;
    }

    /* renamed from: f */
    public static acbbb m30728f() {
        return f25722g;
    }

    /* renamed from: f */
    public static boolean m30729f(String str) {
        bbabc.m30943b(str, "frameworkToCheck");
        return bacab.aaaaa.m30920a(f25729n, str);
    }

    /* renamed from: g */
    public static abbcc m30730g() {
        return f25723h;
    }

    /* renamed from: h */
    public static Date m30731h() {
        return f25724i;
    }

    /* renamed from: i */
    public static acbcc m30732i() {
        return f25725j;
    }

    /* renamed from: j */
    public static String m30733j() {
        return f25726k;
    }

    /* renamed from: k */
    public static String m30734k() {
        return f25727l;
    }

    /* renamed from: l */
    public static String m30735l() {
        return f25728m;
    }

    /* renamed from: m */
    public static String[] m30736m() {
        return f25729n;
    }

    /* renamed from: n */
    public static String m30737n() {
        return f25730o;
    }

    /* renamed from: o */
    public static String m30738o() {
        return f25731p;
    }

    /* renamed from: p */
    public static void m30739p() {
        f25725j = new acbcc(true, (OguryError) null, 2, (bbabb) null);
    }

    /* renamed from: q */
    public static boolean m30740q() {
        return f25725j.mo66629a();
    }

    /* renamed from: r */
    private static abbcb m30741r() {
        return new abbcb(f25717b != 2 ? new abcac() : new abcac(), new abcaa());
    }

    /* renamed from: a */
    public final void mo66554a(abbcb abbcb) {
        bbabc.m30943b(abbcb, "consentResult");
        m30720b(abbcb);
        m30718a(new String[0]);
        f25730o = "";
        f25731p = "";
        f25722g = new acbbb((accab) null, (accaa) null, 3, (bbabb) null);
        f25721f = new accba((accca) null, (accbc) null, 3, (bbabb) null);
        f25720e = new acacc((acbac) null, (acbab) null, 3, (bbabb) null);
    }
}
