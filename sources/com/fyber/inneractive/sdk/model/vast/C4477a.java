package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* renamed from: com.fyber.inneractive.sdk.model.vast.a */
public class C4477a {

    /* renamed from: a */
    public final String f11056a;

    /* renamed from: b */
    public final String f11057b;

    /* renamed from: c */
    public final String f11058c;

    /* renamed from: d */
    public final boolean f11059d;

    public C4477a(String str, String str2, String str3) {
        String str4 = null;
        String trim = str != null ? str.trim() : null;
        this.f11056a = trim;
        String trim2 = str2 != null ? str2.trim() : null;
        this.f11057b = trim2;
        str4 = str3 != null ? str3.trim() : str4;
        this.f11058c = str4;
        this.f11059d = !TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(str4) && str4.contains("[TIME]");
    }
}
