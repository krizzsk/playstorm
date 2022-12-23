package com.ironsource.sdk.p286a;

import com.ogury.p376ed.OguryAdFormatErrorCode;

/* renamed from: com.ironsource.sdk.a.f */
public final class C8156f {

    /* renamed from: a */
    public static C8157a f19419a = new C8157a(2001, m23448a("initsdk"));

    /* renamed from: b */
    public static C8157a f19420b = new C8157a(2002, m23448a("createcontrollerweb"));

    /* renamed from: c */
    public static C8157a f19421c = new C8157a(2003, m23448a("createcontrollernative"));

    /* renamed from: d */
    public static C8157a f19422d = new C8157a(2004, m23448a("controllerstageready"));

    /* renamed from: e */
    public static C8157a f19423e = new C8157a(2005, m23448a("loadad"));

    /* renamed from: f */
    public static C8157a f19424f = new C8157a(2006, m23448a("loadadfailed"));

    /* renamed from: g */
    public static C8157a f19425g = new C8157a(2007, m23448a("initproduct"));

    /* renamed from: h */
    public static C8157a f19426h = new C8157a(2008, m23448a("initproductfailed"));

    /* renamed from: i */
    public static C8157a f19427i = new C8157a(2009, m23448a("loadproduct"));

    /* renamed from: j */
    public static C8157a f19428j = new C8157a(OguryAdFormatErrorCode.SHOW_FAILED, m23448a("parseadmfailed"));

    /* renamed from: k */
    public static C8157a f19429k = new C8157a(2011, m23448a("loadadsuccess"));

    /* renamed from: l */
    public static C8157a f19430l = new C8157a(2013, m23448a("controllerfailed"));

    /* renamed from: m */
    public static C8157a f19431m = new C8157a(2015, m23448a("appendnativefeaturesdatafailed"));

    /* renamed from: n */
    public static C8157a f19432n = new C8157a(2016, m23448a("adunitcouldnotloadtowebview"));

    /* renamed from: o */
    public static C8157a f19433o = new C8157a(2017, m23448a("webviewcleanupfailed"));

    /* renamed from: p */
    public static C8157a f19434p = new C8157a(2018, m23448a("removewebviewfailed"));

    /* renamed from: q */
    public static C8157a f19435q = new C8157a(2021, m23448a("fialedregactlifecycle"));

    /* renamed from: r */
    public static C8157a f19436r = new C8157a(2022, m23448a("loadcontrollerhtml"));

    /* renamed from: s */
    public static C8157a f19437s = new C8157a(2023, m23448a("controllerhtmlsuccess"));

    /* renamed from: t */
    public static C8157a f19438t = new C8157a(2024, m23448a("controllerhtmlfailed"));

    /* renamed from: u */
    public static C8157a f19439u = new C8157a(2025, m23448a("webviewcrashrpg"));

    /* renamed from: com.ironsource.sdk.a.f$a */
    public static class C8157a {

        /* renamed from: a */
        String f19440a;

        /* renamed from: b */
        int f19441b;

        C8157a(int i, String str) {
            this.f19441b = i;
            this.f19440a = str;
        }
    }

    static {
        new C8157a(2014, m23448a("extractinstalledpackagesfailed"));
        new C8157a(2019, m23448a("adunitcouldnotloadtowebviewbanners"));
        new C8157a(2020, m23448a("banneralreadydestroyed"));
    }

    /* renamed from: a */
    private static String m23448a(String str) {
        return "n_" + str;
    }
}
