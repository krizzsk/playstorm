package com.inmobi.media;

import android.webkit.URLUtil;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ge */
/* compiled from: SignalsConfig */
public class C6171ge extends C6144fr {
    public JSONObject ext = null;
    public C6174b ice = new C6174b();
    public C6175c unifiedIdServiceConfig = new C6175c();

    /* renamed from: com.inmobi.media.ge$b */
    /* compiled from: SignalsConfig */
    public static class C6174b {

        /* renamed from: c */
        public C6173a f15621c = new C6173a();
        public boolean locationEnabled = false;
        public int sampleInterval = 300;
        public boolean sessionEnabled = false;
        public int stopRequestTimeout = 3;

        /* renamed from: w */
        public C6176d f15622w = new C6176d();
    }

    /* renamed from: com.inmobi.media.ge$c */
    /* compiled from: SignalsConfig */
    public static class C6175c {
        public boolean enabled = false;
        public int maxRetries = 0;
        public int retryInterval = 0;
        public int timeout = 10;
        public String url = "https://unif-id.ssp.inmobi.com/fetch";
    }

    /* renamed from: b */
    public String mo35325b() {
        return "signals";
    }

    /* renamed from: a */
    public static C6262ij<C6171ge> m18389a() {
        return new C6262ij<>();
    }

    C6171ge(String str) {
        super(str);
    }

    /* renamed from: d */
    public boolean mo35327d() {
        return this.ice.sampleInterval >= 0 && this.ice.stopRequestTimeout >= 0 && this.ice.f15622w.f15623wf >= 0 && this.ice.f15621c.cof >= 0 && URLUtil.isValidUrl(this.unifiedIdServiceConfig.url) && this.unifiedIdServiceConfig.maxRetries >= 0 && this.unifiedIdServiceConfig.timeout >= 0 && this.unifiedIdServiceConfig.retryInterval >= 0;
    }

    /* renamed from: com.inmobi.media.ge$d */
    /* compiled from: SignalsConfig */
    public static final class C6176d {
        public boolean cwe;
        public boolean vwe;

        /* renamed from: wf */
        public int f15623wf;

        private C6176d() {
            this.f15623wf = 0;
            this.vwe = false;
            this.cwe = false;
        }
    }

    /* renamed from: com.inmobi.media.ge$a */
    /* compiled from: SignalsConfig */
    public static final class C6173a {
        public boolean cce;
        public int cof;

        /* renamed from: oe */
        public boolean f15620oe;
        public boolean vce;

        private C6173a() {
            this.cof = 0;
            this.f15620oe = false;
            this.vce = false;
            this.cce = false;
        }
    }

    /* renamed from: c */
    public JSONObject mo35326c() {
        return new C6262ij().mo35468a(this);
    }
}
