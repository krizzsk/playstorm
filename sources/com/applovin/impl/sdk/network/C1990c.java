package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p048c.C1857b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.c */
public class C1990c<T> {

    /* renamed from: a */
    private String f3788a;

    /* renamed from: b */
    private String f3789b;

    /* renamed from: c */
    private Map<String, String> f3790c;

    /* renamed from: d */
    private Map<String, String> f3791d;

    /* renamed from: e */
    private final JSONObject f3792e;

    /* renamed from: f */
    private String f3793f;

    /* renamed from: g */
    private final T f3794g;

    /* renamed from: h */
    private final int f3795h;

    /* renamed from: i */
    private int f3796i;

    /* renamed from: j */
    private final int f3797j;

    /* renamed from: k */
    private final int f3798k;

    /* renamed from: l */
    private final boolean f3799l;

    /* renamed from: m */
    private final boolean f3800m;

    /* renamed from: n */
    private final boolean f3801n;

    /* renamed from: o */
    private final boolean f3802o;

    /* renamed from: com.applovin.impl.sdk.network.c$a */
    public static class C1991a<T> {

        /* renamed from: a */
        String f3803a;

        /* renamed from: b */
        String f3804b;

        /* renamed from: c */
        String f3805c;

        /* renamed from: d */
        Map<String, String> f3806d;

        /* renamed from: e */
        Map<String, String> f3807e;

        /* renamed from: f */
        JSONObject f3808f;

        /* renamed from: g */
        T f3809g;

        /* renamed from: h */
        int f3810h = 1;

        /* renamed from: i */
        int f3811i;

        /* renamed from: j */
        int f3812j;

        /* renamed from: k */
        boolean f3813k;

        /* renamed from: l */
        boolean f3814l;

        /* renamed from: m */
        boolean f3815m;

        /* renamed from: n */
        boolean f3816n;

        public C1991a(C1959m mVar) {
            this.f3811i = ((Integer) mVar.mo14311a(C1857b.f3190cO)).intValue();
            this.f3812j = ((Integer) mVar.mo14311a(C1857b.f3189cN)).intValue();
            this.f3814l = ((Boolean) mVar.mo14311a(C1857b.f3188cM)).booleanValue();
            this.f3815m = ((Boolean) mVar.mo14311a(C1857b.f3319ep)).booleanValue();
            this.f3816n = ((Boolean) mVar.mo14311a(C1857b.f3324eu)).booleanValue();
            this.f3806d = new HashMap();
        }

        /* renamed from: a */
        public C1991a<T> mo14499a(int i) {
            this.f3810h = i;
            return this;
        }

        /* renamed from: a */
        public C1991a<T> mo14500a(T t) {
            this.f3809g = t;
            return this;
        }

        /* renamed from: a */
        public C1991a<T> mo14501a(String str) {
            this.f3804b = str;
            return this;
        }

        /* renamed from: a */
        public C1991a<T> mo14502a(Map<String, String> map) {
            this.f3806d = map;
            return this;
        }

        /* renamed from: a */
        public C1991a<T> mo14503a(JSONObject jSONObject) {
            this.f3808f = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C1991a<T> mo14504a(boolean z) {
            this.f3813k = z;
            return this;
        }

        /* renamed from: a */
        public C1990c<T> mo14505a() {
            return new C1990c<>(this);
        }

        /* renamed from: b */
        public C1991a<T> mo14506b(int i) {
            this.f3811i = i;
            return this;
        }

        /* renamed from: b */
        public C1991a<T> mo14507b(String str) {
            this.f3803a = str;
            return this;
        }

        /* renamed from: b */
        public C1991a<T> mo14508b(Map<String, String> map) {
            this.f3807e = map;
            return this;
        }

        /* renamed from: b */
        public C1991a<T> mo14509b(boolean z) {
            this.f3814l = z;
            return this;
        }

        /* renamed from: c */
        public C1991a<T> mo14510c(int i) {
            this.f3812j = i;
            return this;
        }

        /* renamed from: c */
        public C1991a<T> mo14511c(String str) {
            this.f3805c = str;
            return this;
        }

        /* renamed from: c */
        public C1991a<T> mo14512c(boolean z) {
            this.f3815m = z;
            return this;
        }

        /* renamed from: d */
        public C1991a<T> mo14513d(boolean z) {
            this.f3816n = z;
            return this;
        }
    }

    protected C1990c(C1991a<T> aVar) {
        this.f3788a = aVar.f3804b;
        this.f3789b = aVar.f3803a;
        this.f3790c = aVar.f3806d;
        this.f3791d = aVar.f3807e;
        this.f3792e = aVar.f3808f;
        this.f3793f = aVar.f3805c;
        this.f3794g = aVar.f3809g;
        this.f3795h = aVar.f3810h;
        this.f3796i = aVar.f3810h;
        this.f3797j = aVar.f3811i;
        this.f3798k = aVar.f3812j;
        this.f3799l = aVar.f3813k;
        this.f3800m = aVar.f3814l;
        this.f3801n = aVar.f3815m;
        this.f3802o = aVar.f3816n;
    }

    /* renamed from: a */
    public static <T> C1991a<T> m4570a(C1959m mVar) {
        return new C1991a<>(mVar);
    }

    /* renamed from: a */
    public String mo14478a() {
        return this.f3788a;
    }

    /* renamed from: a */
    public void mo14479a(int i) {
        this.f3796i = i;
    }

    /* renamed from: a */
    public void mo14480a(String str) {
        this.f3788a = str;
    }

    /* renamed from: b */
    public String mo14481b() {
        return this.f3789b;
    }

    /* renamed from: b */
    public void mo14482b(String str) {
        this.f3789b = str;
    }

    /* renamed from: c */
    public Map<String, String> mo14483c() {
        return this.f3790c;
    }

    /* renamed from: d */
    public Map<String, String> mo14484d() {
        return this.f3791d;
    }

    /* renamed from: e */
    public JSONObject mo14485e() {
        return this.f3792e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1990c)) {
            return false;
        }
        C1990c cVar = (C1990c) obj;
        String str = this.f3788a;
        if (str == null ? cVar.f3788a != null : !str.equals(cVar.f3788a)) {
            return false;
        }
        Map<String, String> map = this.f3790c;
        if (map == null ? cVar.f3790c != null : !map.equals(cVar.f3790c)) {
            return false;
        }
        Map<String, String> map2 = this.f3791d;
        if (map2 == null ? cVar.f3791d != null : !map2.equals(cVar.f3791d)) {
            return false;
        }
        String str2 = this.f3793f;
        if (str2 == null ? cVar.f3793f != null : !str2.equals(cVar.f3793f)) {
            return false;
        }
        String str3 = this.f3789b;
        if (str3 == null ? cVar.f3789b != null : !str3.equals(cVar.f3789b)) {
            return false;
        }
        JSONObject jSONObject = this.f3792e;
        if (jSONObject == null ? cVar.f3792e != null : !jSONObject.equals(cVar.f3792e)) {
            return false;
        }
        T t = this.f3794g;
        if (t == null ? cVar.f3794g == null : t.equals(cVar.f3794g)) {
            return this.f3795h == cVar.f3795h && this.f3796i == cVar.f3796i && this.f3797j == cVar.f3797j && this.f3798k == cVar.f3798k && this.f3799l == cVar.f3799l && this.f3800m == cVar.f3800m && this.f3801n == cVar.f3801n && this.f3802o == cVar.f3802o;
        }
        return false;
    }

    /* renamed from: f */
    public String mo14487f() {
        return this.f3793f;
    }

    /* renamed from: g */
    public T mo14488g() {
        return this.f3794g;
    }

    /* renamed from: h */
    public int mo14489h() {
        return this.f3796i;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3788a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3793f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3789b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t = this.f3794g;
        if (t != null) {
            i = t.hashCode();
        }
        int i2 = ((((((((((((((((hashCode4 + i) * 31) + this.f3795h) * 31) + this.f3796i) * 31) + this.f3797j) * 31) + this.f3798k) * 31) + (this.f3799l ? 1 : 0)) * 31) + (this.f3800m ? 1 : 0)) * 31) + (this.f3801n ? 1 : 0)) * 31) + (this.f3802o ? 1 : 0);
        Map<String, String> map = this.f3790c;
        if (map != null) {
            i2 = (i2 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f3791d;
        if (map2 != null) {
            i2 = (i2 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f3792e;
        if (jSONObject == null) {
            return i2;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (i2 * 31) + new String(charArray).hashCode();
    }

    /* renamed from: i */
    public int mo14491i() {
        return this.f3795h - this.f3796i;
    }

    /* renamed from: j */
    public int mo14492j() {
        return this.f3797j;
    }

    /* renamed from: k */
    public int mo14493k() {
        return this.f3798k;
    }

    /* renamed from: l */
    public boolean mo14494l() {
        return this.f3799l;
    }

    /* renamed from: m */
    public boolean mo14495m() {
        return this.f3800m;
    }

    /* renamed from: n */
    public boolean mo14496n() {
        return this.f3801n;
    }

    /* renamed from: o */
    public boolean mo14497o() {
        return this.f3802o;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f3788a + ", backupEndpoint=" + this.f3793f + ", httpMethod=" + this.f3789b + ", httpHeaders=" + this.f3791d + ", body=" + this.f3792e + ", emptyResponse=" + this.f3794g + ", initialRetryAttempts=" + this.f3795h + ", retryAttemptsLeft=" + this.f3796i + ", timeoutMillis=" + this.f3797j + ", retryDelayMillis=" + this.f3798k + ", exponentialRetries=" + this.f3799l + ", retryOnAllErrors=" + this.f3800m + ", encodingEnabled=" + this.f3801n + ", gzipBodyEncoding=" + this.f3802o + '}';
    }
}
