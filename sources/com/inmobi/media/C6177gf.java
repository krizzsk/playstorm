package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import com.inmobi.media.C6164gc;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gf */
/* compiled from: TelemetryConfig */
public class C6177gf extends C6144fr {
    private static final boolean DEFAULT_DISABLE_GENERAL_EVENTS = false;
    private static final long DEFAULT_EVENT_TTL_SEC = 604800;
    private static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    private static final boolean DEFAULT_IS_ENABLED = true;
    private static final int DEFAULT_MAX_BATCH_SIZE = 20;
    private static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 1000;
    private static final int DEFAULT_MAX_RETRIES = 1;
    private static final int DEFAULT_MIN_BATCH_SIZE = 5;
    private static final long DEFAULT_PROCESSING_INTERVAL_SEC = 30;
    private static final long DEFAULT_RETRY_INTERVAL_SEC = 60;
    private static final double DEFAULT_SAMPLING_FACTOR = 0.0d;
    private static final String DEFAULT_URL = "https://telemetry.sdk.inmobi.com/metrics";
    public C6179a assetReporting;
    public C6180b base;
    public boolean disableAllGeneralEvents = false;
    private long eventTTL = DEFAULT_EVENT_TTL_SEC;
    public int maxEventsToPersist = 1000;
    private int maxRetryCount = 1;
    public C6164gc networkType;
    public List<String> priorityEvents;
    private long processingInterval = DEFAULT_PROCESSING_INTERVAL_SEC;
    public double samplingFactor = DEFAULT_SAMPLING_FACTOR;
    public String telemetryUrl = DEFAULT_URL;
    private long txLatency = DEFAULT_INGESTION_LATENCY_SEC;

    /* renamed from: com.inmobi.media.gf$a */
    /* compiled from: TelemetryConfig */
    public static final class C6179a {
        public boolean gif;
        public boolean image;
        public boolean video;
    }

    /* renamed from: b */
    public String mo35325b() {
        return "telemetry";
    }

    /* renamed from: a */
    public static C6262ij<C6177gf> m18393a() {
        return new C6262ij().mo35466a(new C6267io("priorityEvents", C6177gf.class), (C6266in) new C6264il(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new LinkedList();
            }
        }, String.class));
    }

    C6177gf(String str) {
        super(str);
        LinkedList linkedList = new LinkedList();
        linkedList.add("SessionStarted");
        linkedList.add("ServerFill");
        linkedList.add("ServerNoFill");
        linkedList.add("ServerError");
        linkedList.add("AdLoadFailed");
        linkedList.add("AdLoadSuccessful");
        linkedList.add("BlockAutoRedirection");
        linkedList.add("AssetDownloaded");
        linkedList.add("CrashEventOccurred");
        linkedList.add("InvalidConfig");
        linkedList.add("ConfigFetched");
        linkedList.add("SdkInitialized");
        linkedList.add("AdGetSignalsFailed");
        linkedList.add("AdGetSignalsSucceeded");
        linkedList.add("AdShowFailed");
        linkedList.add("AdLoadCalled");
        linkedList.add("AdLoadDroppedAtSDK");
        linkedList.add("AdShowCalled");
        linkedList.add("AdShowSuccessful");
        this.priorityEvents = linkedList;
        this.base = new C6180b();
        C6164gc gcVar = new C6164gc();
        this.networkType = gcVar;
        gcVar.wifi = new C6164gc.C6165a();
        this.networkType.wifi.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.wifi.minBatchSize = 5;
        this.networkType.wifi.maxBatchSize = 20;
        this.networkType.others = new C6164gc.C6165a();
        this.networkType.others.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.others.minBatchSize = 5;
        this.networkType.others.maxBatchSize = 20;
        C6179a aVar = new C6179a();
        aVar.video = true;
        aVar.image = false;
        aVar.gif = false;
        this.assetReporting = aVar;
    }

    /* renamed from: d */
    public boolean mo35327d() {
        if (this.telemetryUrl.trim().length() != 0 && (this.telemetryUrl.startsWith("http://") || this.telemetryUrl.startsWith("https://"))) {
            long j = this.txLatency;
            if (j < this.processingInterval || j > this.eventTTL || !this.networkType.mo35345a(this.maxEventsToPersist) || this.processingInterval <= 0 || this.maxRetryCount < 0 || this.txLatency <= 0 || this.eventTTL <= 0 || this.maxEventsToPersist <= 0 || this.samplingFactor < DEFAULT_SAMPLING_FACTOR) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public JSONObject mo35326c() {
        return m18393a().mo35468a(this);
    }

    /* renamed from: e */
    public final C6187gk mo35355e() {
        return new C6187gk(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, this.networkType.wifi.minBatchSize, this.networkType.wifi.maxBatchSize, this.networkType.others.minBatchSize, this.networkType.others.maxBatchSize, this.networkType.wifi.retryInterval, this.networkType.others.retryInterval);
    }

    /* renamed from: com.inmobi.media.gf$b */
    /* compiled from: TelemetryConfig */
    public static final class C6180b {
        public boolean enabled;

        private C6180b() {
            this.enabled = true;
        }
    }
}
