package com.bytedance.sdk.openadsdk.core.p151e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.a */
/* compiled from: AdInfo */
public class C3469a {

    /* renamed from: a */
    private String f8407a;

    /* renamed from: b */
    private int f8408b;

    /* renamed from: c */
    private String f8409c;

    /* renamed from: d */
    private List<C3498n> f8410d = new ArrayList();

    /* renamed from: e */
    private String f8411e;

    /* renamed from: f */
    private long f8412f;

    /* renamed from: a */
    public static Map<String, C3498n> m10397a(C3469a aVar) {
        if (aVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C3498n next : aVar.mo19477b()) {
            if (!TextUtils.isEmpty(next.mo19662af())) {
                hashMap.put(next.mo19662af(), next);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    /* renamed from: a */
    public int mo19472a() {
        return this.f8408b;
    }

    /* renamed from: a */
    public void mo19473a(int i) {
        this.f8408b = i;
    }

    /* renamed from: a */
    public void mo19474a(long j) {
        this.f8412f = j;
    }

    /* renamed from: a */
    public void mo19475a(C3498n nVar) {
        this.f8410d.add(nVar);
    }

    /* renamed from: a */
    public void mo19476a(String str) {
        this.f8407a = str;
    }

    /* renamed from: b */
    public List<C3498n> mo19477b() {
        return this.f8410d;
    }

    /* renamed from: b */
    public void mo19478b(String str) {
        this.f8409c = str;
    }

    /* renamed from: c */
    public String mo19479c() {
        return this.f8411e;
    }

    /* renamed from: c */
    public void mo19480c(String str) {
        this.f8411e = str;
    }
}
