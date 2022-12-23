package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p048c.C1857b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.i */
public class C2010i<T> extends C1990c {

    /* renamed from: a */
    private String f3892a;

    /* renamed from: b */
    private boolean f3893b;

    /* renamed from: com.applovin.impl.sdk.network.i$a */
    public static class C2011a<T> extends C1990c.C1991a<T> {
        /* access modifiers changed from: private */

        /* renamed from: o */
        public String f3894o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f3895p;

        public C2011a(C1959m mVar) {
            super(mVar);
            this.f3810h = ((Integer) mVar.mo14311a(C1857b.f3184cI)).intValue();
            this.f3811i = ((Integer) mVar.mo14311a(C1857b.f3183cH)).intValue();
            this.f3812j = ((Integer) mVar.mo14311a(C1857b.f3189cN)).intValue();
        }

        /* renamed from: b */
        public C2011a mo14500a(T t) {
            this.f3809g = t;
            return this;
        }

        /* renamed from: b */
        public C2011a mo14503a(JSONObject jSONObject) {
            this.f3808f = jSONObject;
            return this;
        }

        /* renamed from: b */
        public C2010i<T> mo14505a() {
            return new C2010i<>(this);
        }

        /* renamed from: c */
        public C2011a mo14502a(Map<String, String> map) {
            this.f3806d = map;
            return this;
        }

        /* renamed from: d */
        public C2011a mo14499a(int i) {
            this.f3810h = i;
            return this;
        }

        /* renamed from: d */
        public C2011a mo14501a(String str) {
            this.f3804b = str;
            return this;
        }

        /* renamed from: d */
        public C2011a mo14508b(Map<String, String> map) {
            this.f3807e = map;
            return this;
        }

        /* renamed from: e */
        public C2011a mo14506b(int i) {
            this.f3811i = i;
            return this;
        }

        /* renamed from: e */
        public C2011a mo14511c(String str) {
            this.f3805c = str;
            return this;
        }

        /* renamed from: e */
        public C2011a mo14512c(boolean z) {
            this.f3815m = z;
            return this;
        }

        /* renamed from: f */
        public C2011a mo14510c(int i) {
            this.f3812j = i;
            return this;
        }

        /* renamed from: f */
        public C2011a mo14507b(String str) {
            this.f3803a = str;
            return this;
        }

        /* renamed from: f */
        public C2011a mo14513d(boolean z) {
            this.f3816n = z;
            return this;
        }

        /* renamed from: g */
        public C2011a mo14595g(String str) {
            this.f3894o = str;
            return this;
        }

        /* renamed from: g */
        public C2011a mo14596g(boolean z) {
            this.f3895p = z;
            return this;
        }
    }

    protected C2010i(C2011a aVar) {
        super(aVar);
        this.f3892a = aVar.f3894o;
        this.f3893b = aVar.f3895p;
    }

    /* renamed from: b */
    public static C2011a m4714b(C1959m mVar) {
        return new C2011a(mVar);
    }

    /* renamed from: p */
    public boolean mo14579p() {
        return this.f3892a != null;
    }

    /* renamed from: q */
    public String mo14580q() {
        return this.f3892a;
    }

    /* renamed from: r */
    public boolean mo14581r() {
        return this.f3893b;
    }
}
