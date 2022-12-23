package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.h */
public class C2007h {

    /* renamed from: a */
    private String f3870a;

    /* renamed from: b */
    private String f3871b;

    /* renamed from: c */
    private String f3872c;

    /* renamed from: d */
    private String f3873d;

    /* renamed from: e */
    private Map<String, String> f3874e;

    /* renamed from: f */
    private Map<String, String> f3875f;

    /* renamed from: g */
    private Map<String, Object> f3876g;

    /* renamed from: h */
    private boolean f3877h;

    /* renamed from: i */
    private boolean f3878i;

    /* renamed from: j */
    private boolean f3879j;

    /* renamed from: k */
    private String f3880k;

    /* renamed from: l */
    private int f3881l;

    /* renamed from: com.applovin.impl.sdk.network.h$a */
    public static class C2009a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f3882a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f3883b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f3884c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f3885d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Map<String, String> f3886e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Map<String, String> f3887f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Map<String, Object> f3888g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f3889h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f3890i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f3891j;

        /* renamed from: a */
        public C2009a mo14568a(String str) {
            this.f3882a = str;
            return this;
        }

        /* renamed from: a */
        public C2009a mo14569a(Map<String, String> map) {
            this.f3886e = map;
            return this;
        }

        /* renamed from: a */
        public C2009a mo14570a(boolean z) {
            this.f3889h = z;
            return this;
        }

        /* renamed from: a */
        public C2007h mo14571a() {
            return new C2007h(this);
        }

        /* renamed from: b */
        public C2009a mo14572b(String str) {
            this.f3883b = str;
            return this;
        }

        /* renamed from: b */
        public C2009a mo14573b(Map<String, String> map) {
            this.f3887f = map;
            return this;
        }

        /* renamed from: b */
        public C2009a mo14574b(boolean z) {
            this.f3890i = z;
            return this;
        }

        /* renamed from: c */
        public C2009a mo14575c(String str) {
            this.f3884c = str;
            return this;
        }

        /* renamed from: c */
        public C2009a mo14576c(Map<String, Object> map) {
            this.f3888g = map;
            return this;
        }

        /* renamed from: c */
        public C2009a mo14577c(boolean z) {
            this.f3891j = z;
            return this;
        }

        /* renamed from: d */
        public C2009a mo14578d(String str) {
            this.f3885d = str;
            return this;
        }
    }

    private C2007h(C2009a aVar) {
        this.f3870a = UUID.randomUUID().toString();
        this.f3871b = aVar.f3883b;
        this.f3872c = aVar.f3884c;
        this.f3873d = aVar.f3885d;
        this.f3874e = aVar.f3886e;
        this.f3875f = aVar.f3887f;
        this.f3876g = aVar.f3888g;
        this.f3877h = aVar.f3889h;
        this.f3878i = aVar.f3890i;
        this.f3879j = aVar.f3891j;
        this.f3880k = aVar.f3882a;
        this.f3881l = 0;
    }

    C2007h(JSONObject jSONObject, C1959m mVar) throws Exception {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        JsonUtils.getString(jSONObject, "httpMethod", "");
        String string3 = jSONObject.getString("targetUrl");
        String string4 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        Map<String, String> synchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap<>(0);
        Map<String, String> synchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap<>(0);
        Map<String, Object> synchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap<>(0);
        this.f3870a = string;
        this.f3880k = string2;
        this.f3872c = string3;
        this.f3873d = string4;
        this.f3874e = synchronizedMap;
        this.f3875f = synchronizedMap2;
        this.f3876g = synchronizedMap3;
        this.f3877h = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f3878i = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f3879j = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f3881l = i;
    }

    /* renamed from: o */
    public static C2009a m4678o() {
        return new C2009a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo14551a() {
        return this.f3871b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo14552b() {
        return this.f3872c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo14553c() {
        return this.f3873d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, String> mo14554d() {
        return this.f3874e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> mo14555e() {
        return this.f3875f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3870a.equals(((C2007h) obj).f3870a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, Object> mo14557f() {
        return this.f3876g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo14558g() {
        return this.f3877h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo14559h() {
        return this.f3878i;
    }

    public int hashCode() {
        return this.f3870a.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo14561i() {
        return this.f3879j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo14562j() {
        return this.f3880k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo14563k() {
        return this.f3881l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo14564l() {
        this.f3881l++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo14565m() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.f3874e;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f3874e = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public JSONObject mo14566n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f3870a);
        jSONObject.put("communicatorRequestId", this.f3880k);
        jSONObject.put("httpMethod", this.f3871b);
        jSONObject.put("targetUrl", this.f3872c);
        jSONObject.put("backupUrl", this.f3873d);
        jSONObject.put("isEncodingEnabled", this.f3877h);
        jSONObject.put("gzipBodyEncoding", this.f3878i);
        jSONObject.put("attemptNumber", this.f3881l);
        if (this.f3874e != null) {
            jSONObject.put("parameters", new JSONObject(this.f3874e));
        }
        if (this.f3875f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f3875f));
        }
        if (this.f3876g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f3876g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f3870a + '\'' + ", communicatorRequestId='" + this.f3880k + '\'' + ", httpMethod='" + this.f3871b + '\'' + ", targetUrl='" + this.f3872c + '\'' + ", backupUrl='" + this.f3873d + '\'' + ", attemptNumber=" + this.f3881l + ", isEncodingEnabled=" + this.f3877h + ", isGzipBodyEncoding=" + this.f3878i + '}';
    }
}
