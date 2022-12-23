package com.p374my.target;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.n2 */
public final class C9858n2 {

    /* renamed from: a */
    public final String f24379a;

    /* renamed from: b */
    public final String f24380b;

    /* renamed from: c */
    public final String f24381c;

    /* renamed from: d */
    public final C9641c3 f24382d = C9641c3.m27738f();

    /* renamed from: e */
    public final HashMap<String, String> f24383e = new HashMap<>();

    /* renamed from: f */
    public String f24384f;

    /* renamed from: g */
    public C9916q2 f24385g;

    /* renamed from: h */
    public int f24386h = 10000;

    /* renamed from: i */
    public float f24387i = 0.0f;

    public C9858n2(String str, String str2, String str3) {
        this.f24379a = str;
        this.f24380b = str2;
        this.f24381c = str3;
    }

    /* renamed from: a */
    public static C9858n2 m28799a(String str, String str2, String str3) {
        return new C9858n2(str, str2, str3);
    }

    /* renamed from: a */
    public String mo64836a() {
        return this.f24381c;
    }

    /* renamed from: a */
    public void mo64837a(float f) {
        this.f24387i = f;
    }

    /* renamed from: a */
    public void mo64838a(int i) {
        this.f24386h = i;
    }

    /* renamed from: a */
    public void mo64839a(C9916q2 q2Var) {
        this.f24385g = q2Var;
    }

    /* renamed from: a */
    public void mo64840a(String str) {
        this.f24384f = str;
    }

    /* renamed from: a */
    public void mo64841a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str2 == null) {
                this.f24383e.remove(str);
            } else {
                this.f24383e.put(str, str2);
            }
        }
    }

    /* renamed from: b */
    public String mo64842b() {
        return this.f24379a;
    }

    /* renamed from: c */
    public Map<String, String> mo64843c() {
        return new HashMap(this.f24383e);
    }

    /* renamed from: d */
    public String mo64844d() {
        return this.f24384f;
    }

    /* renamed from: e */
    public String mo64845e() {
        return this.f24380b;
    }

    /* renamed from: f */
    public float mo64846f() {
        return this.f24387i;
    }

    /* renamed from: g */
    public C9916q2 mo64847g() {
        return this.f24385g;
    }

    /* renamed from: h */
    public C9641c3 mo64848h() {
        return this.f24382d;
    }

    /* renamed from: i */
    public int mo64849i() {
        return this.f24386h;
    }
}
