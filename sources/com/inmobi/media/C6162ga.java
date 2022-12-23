package com.inmobi.media;

import com.inmobi.media.C6164gc;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ga */
/* compiled from: CrashConfig */
public class C6162ga extends C6144fr {
    private static final boolean DEFAULT_CATCH_ENABLED = false;
    private static final boolean DEFAULT_CRASH_ENABLED = true;
    private static final long DEFAULT_EVENT_TTL_SEC = 259200;
    private static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    private static final int DEFAULT_MAX_BATCH_SIZE = 2;
    private static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 50;
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_MIN_BATCH_SIZE = 1;
    private static final long DEFAULT_PROCESSING_INTERVAL_SEC = 60;
    private static final long DEFAULT_RETRY_INTERVAL_SEC = 10;
    private static final String DEFAULT_URL = "https://crash-metrics.sdk.inmobi.com/trace";
    public boolean catchEnabled = false;
    public boolean crashEnabled = true;
    public long eventTTL = DEFAULT_EVENT_TTL_SEC;
    public int maxEventsToPersist = 50;
    public int maxRetryCount = 3;
    public C6164gc networkType;
    public long processingInterval = DEFAULT_PROCESSING_INTERVAL_SEC;
    public long txLatency = DEFAULT_INGESTION_LATENCY_SEC;
    public String url = DEFAULT_URL;

    /* renamed from: b */
    public String mo35325b() {
        return "crashReporting";
    }

    /* renamed from: a */
    public static C6262ij<C6162ga> m18366a() {
        return new C6262ij<>();
    }

    C6162ga(String str) {
        super(str);
        C6164gc gcVar = new C6164gc();
        this.networkType = gcVar;
        gcVar.wifi = new C6164gc.C6165a();
        this.networkType.wifi.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.wifi.minBatchSize = 1;
        this.networkType.wifi.maxBatchSize = 2;
        this.networkType.others = new C6164gc.C6165a();
        this.networkType.others.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.others.minBatchSize = 1;
        this.networkType.others.maxBatchSize = 2;
    }

    /* renamed from: d */
    public boolean mo35327d() {
        if (this.url.trim().length() != 0 && (this.url.startsWith("http://") || this.url.startsWith("https://"))) {
            long j = this.txLatency;
            if (j < this.processingInterval || j > this.eventTTL || !this.networkType.mo35345a(this.maxEventsToPersist) || this.processingInterval <= 0 || this.maxRetryCount < 0 || this.txLatency <= 0 || this.eventTTL <= 0 || this.maxEventsToPersist <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public JSONObject mo35326c() {
        return new C6262ij().mo35468a(this);
    }
}
