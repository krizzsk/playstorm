package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.core.p */
/* compiled from: RitInfo */
public class C3639p {

    /* renamed from: a */
    public static ConcurrentHashMap<Integer, C3639p> f9243a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private String f9244b = "";

    /* renamed from: c */
    private String f9245c = "";

    /* renamed from: d */
    private int f9246d;

    /* renamed from: e */
    private int f9247e;

    /* renamed from: f */
    private String f9248f;

    /* renamed from: a */
    public String mo20204a() {
        return this.f9248f;
    }

    /* renamed from: b */
    public String mo20207b() {
        return this.f9244b;
    }

    /* renamed from: c */
    public String mo20209c() {
        return this.f9245c;
    }

    /* renamed from: d */
    public int mo20210d() {
        return this.f9246d;
    }

    /* renamed from: a */
    public void mo20205a(int i) {
        this.f9246d = i;
    }

    /* renamed from: e */
    public int mo20211e() {
        return this.f9247e;
    }

    /* renamed from: b */
    public void mo20208b(int i) {
        this.f9247e = i;
    }

    /* renamed from: f */
    private void m11567f() {
        this.f9244b = "";
        this.f9245c = "";
        this.f9246d = 0;
        this.f9247e = 0;
    }

    /* renamed from: a */
    public void mo20206a(C3498n nVar) {
        if (nVar != null) {
            String h = C4014u.m13235h(nVar);
            if (!TextUtils.isEmpty(h)) {
                this.f9248f = h;
            }
            String[] split = nVar.mo19612O().split("/");
            if (split.length >= 3) {
                this.f9244b = split[2];
            }
            if (nVar.mo19657aa() != null && !TextUtils.isEmpty(nVar.mo19657aa().mo19498c())) {
                this.f9245c = nVar.mo19657aa().mo19498c();
            }
        }
    }

    /* renamed from: b */
    public static void m11564b(C3498n nVar) {
        if (nVar != null && !TextUtils.isEmpty(nVar.mo19659ac())) {
            Integer valueOf = Integer.valueOf(C4014u.m13223f(nVar));
            if (valueOf.intValue() != 0) {
                C3639p pVar = null;
                if (f9243a == null) {
                    f9243a = new ConcurrentHashMap<>();
                }
                if (f9243a.containsKey(valueOf)) {
                    pVar = f9243a.get(valueOf);
                }
                if (pVar == null) {
                    pVar = new C3639p();
                }
                String h = C4014u.m13235h(nVar);
                if (TextUtils.isEmpty(h) || !h.equals(pVar.mo20204a())) {
                    pVar.m11567f();
                    pVar.mo20206a(nVar);
                    f9243a.put(valueOf, pVar);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m11565c(int i) {
        C3639p pVar;
        if (i != 0) {
            if (f9243a == null) {
                f9243a = new ConcurrentHashMap<>();
            }
            if (f9243a.containsKey(Integer.valueOf(i)) && (pVar = f9243a.get(Integer.valueOf(i))) != null) {
                pVar.mo20208b(1);
            }
        }
    }

    /* renamed from: c */
    public static void m11566c(C3498n nVar) {
        C3639p pVar;
        if (nVar != null) {
            Integer valueOf = Integer.valueOf(C4014u.m13223f(nVar));
            if (valueOf.intValue() != 0) {
                if (f9243a == null) {
                    f9243a = new ConcurrentHashMap<>();
                }
                if (f9243a.containsKey(valueOf) && (pVar = f9243a.get(valueOf)) != null) {
                    pVar.mo20205a(1);
                }
            }
        }
    }
}
