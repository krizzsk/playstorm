package com.ironsource.sdk.controller;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: com.ironsource.sdk.controller.u */
public class C8246u {

    /* renamed from: a */
    private boolean f19717a = false;

    /* renamed from: b */
    private HashSet<String> f19718b = new HashSet<>();

    /* renamed from: c */
    private String f19719c;

    /* renamed from: d */
    private String f19720d;

    /* renamed from: e */
    private boolean f19721e = false;

    /* renamed from: f */
    private int f19722f;

    /* renamed from: g */
    private boolean f19723g = true;

    /* renamed from: a */
    public HashSet<String> mo56596a() {
        return this.f19718b;
    }

    /* renamed from: a */
    public void mo56597a(int i) {
        this.f19722f = i;
    }

    /* renamed from: a */
    public void mo56598a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f19718b.add(str);
        }
    }

    /* renamed from: a */
    public void mo56599a(boolean z) {
        this.f19717a = z;
    }

    /* renamed from: b */
    public void mo56600b(String str) {
        this.f19719c = str;
    }

    /* renamed from: b */
    public void mo56601b(boolean z) {
        this.f19721e = z;
    }

    /* renamed from: b */
    public boolean mo56602b() {
        return this.f19717a;
    }

    /* renamed from: c */
    public String mo56603c() {
        return this.f19719c;
    }

    /* renamed from: c */
    public void mo56604c(String str) {
        this.f19720d = str;
    }

    /* renamed from: c */
    public void mo56605c(boolean z) {
        this.f19723g = z;
    }

    /* renamed from: d */
    public String mo56606d() {
        return this.f19720d;
    }

    /* renamed from: e */
    public boolean mo56607e() {
        return this.f19721e;
    }

    /* renamed from: f */
    public int mo56608f() {
        return this.f19722f;
    }

    /* renamed from: g */
    public boolean mo56609g() {
        return this.f19723g;
    }
}
