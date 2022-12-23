package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1240h;

/* renamed from: com.apm.insight.runtime.t */
public final class C1392t {

    /* renamed from: a */
    private String f1480a = null;

    /* renamed from: b */
    private int f1481b = -1;

    public C1392t(Context context) {
    }

    /* renamed from: a */
    public String mo12521a() {
        if (!TextUtils.isEmpty(this.f1480a) && !"0".equals(this.f1480a)) {
            return this.f1480a;
        }
        String d = C1240h.m1542a().mo12492d();
        this.f1480a = d;
        if (!TextUtils.isEmpty(d) && !"0".equals(this.f1480a)) {
            return this.f1480a;
        }
        String b = C1389s.m2276a().mo12516b();
        this.f1480a = b;
        return b;
    }

    /* renamed from: a */
    public void mo12522a(String str) {
        this.f1480a = str;
        C1389s.m2276a().mo12518b(str);
    }

    /* renamed from: b */
    public boolean mo12523b() {
        return this.f1480a != null;
    }
}
