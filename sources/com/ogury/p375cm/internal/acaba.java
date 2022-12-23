package com.ogury.p375cm.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;

/* renamed from: com.ogury.cm.internal.acaba */
public final class acaba {

    /* renamed from: a */
    private String f25830a = "";

    /* renamed from: b */
    private String f25831b = "";

    /* renamed from: c */
    private String f25832c = "";

    /* renamed from: d */
    private acabb f25833d;

    /* renamed from: e */
    private ArrayList<babbc<String, String>> f25834e;

    /* renamed from: a */
    public final acaba mo66614a(acabb acabb) {
        this.f25833d = acabb;
        return this;
    }

    /* renamed from: a */
    public final acaba mo66615a(String str) {
        bbabc.m30943b(str, "requestMethod");
        this.f25830a = str;
        return this;
    }

    /* renamed from: a */
    public final acaba mo66616a(String str, String str2) {
        bbabc.m30943b(str, SDKConstants.PARAM_KEY);
        bbabc.m30943b(str2, "value");
        if (this.f25834e == null) {
            this.f25834e = new ArrayList<>();
        }
        babbc babbc = new babbc(str, str2);
        ArrayList<babbc<String, String>> arrayList = this.f25834e;
        if (arrayList != null) {
            arrayList.add(babbc);
        }
        return this;
    }

    /* renamed from: a */
    public final String mo66617a() {
        return this.f25830a;
    }

    /* renamed from: b */
    public final acaba mo66618b(String str) {
        bbabc.m30943b(str, "requestBody");
        this.f25831b = str;
        return this;
    }

    /* renamed from: b */
    public final String mo66619b() {
        return this.f25831b;
    }

    /* renamed from: c */
    public final acaba mo66620c(String str) {
        bbabc.m30943b(str, "url");
        this.f25832c = str;
        return this;
    }

    /* renamed from: c */
    public final String mo66621c() {
        return this.f25832c;
    }

    /* renamed from: d */
    public final acabb mo66622d() {
        return this.f25833d;
    }

    /* renamed from: e */
    public final ArrayList<babbc<String, String>> mo66623e() {
        return this.f25834e;
    }

    /* renamed from: f */
    public final abccc mo66624f() {
        return new abccc(this);
    }
}
