package com.inmobi.media;

import android.graphics.Color;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.util.MimeTypes;
import com.inmobi.commons.utils.json.Constructor;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.p374my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fq */
/* compiled from: AdConfig */
public final class C6125fq extends C6144fr {
    private static final String ALLOWED_CONTENT_TYPE = "allowedContentType";
    private static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    private static final boolean DEFAULT_CCT_ENABLED = true;
    private static final int DEFAULT_FETCH_TIMEOUT = 60;
    private static final int DEFAULT_MAX_POOL_SIZE = 10;
    private static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    private static final int DEFAULT_REFRESH_INTERVAL = 60;
    private static final String GESTURE_LIST = "gestures";
    /* access modifiers changed from: private */
    public static final String TAG = C6125fq.class.getSimpleName();
    public C6130a assetCache = new C6130a();
    private Map<String, C6133d> cache;
    public boolean cctEnabled = true;
    public int defaultRefreshInterval = 60;
    public int fetchTimeout = 60;
    public C6134e imai = new C6134e();
    public int maxPoolSize = 10;
    public int minimumRefreshInterval = 20;
    public C6136g mraid = new C6136g();
    public C6138i rendering = new C6138i();
    public C6305jh timeouts = C6305jh.m18842a();
    public String url = DEFAULT_AD_SERVER_URL;
    public C6140k vastVideo = new C6140k();
    public C6142m viewability = new C6142m();

    /* renamed from: com.inmobi.media.fq$a */
    /* compiled from: AdConfig */
    public static final class C6130a {
        public long maxCacheSize = 104857600;
        int maxCachedAssets = 10;
        public int maxRetries = 3;
        public int retryInterval = 1;
        public long timeToLive = 259200;
    }

    /* renamed from: com.inmobi.media.fq$b */
    /* compiled from: AdConfig */
    public static final class C6131b {
        public byte impressionType = 0;
    }

    /* renamed from: com.inmobi.media.fq$c */
    /* compiled from: AdConfig */
    public static final class C6132c {
        public boolean bitrate_mandatory = false;
        public int headerTimeout = 2000;
    }

    /* renamed from: com.inmobi.media.fq$e */
    /* compiled from: AdConfig */
    public static final class C6134e {
        public int maxDbEvents = 500;
        public int maxEventBatch = 10;
        public int maxRetries = 3;
        public long pingCacheExpiry = 10800;
        public int pingInterval = 60;
        public int pingTimeout = 120;
    }

    /* renamed from: com.inmobi.media.fq$f */
    /* compiled from: AdConfig */
    public static final class C6135f {
        public byte impressionType = 1;
    }

    /* renamed from: com.inmobi.media.fq$g */
    /* compiled from: AdConfig */
    public static final class C6136g {
        public long expiry = 432000;
        public int maxRetries = 3;
        public int retryInterval = 60;
        public String url = "https://i.l.inmobicdn.net/sdk/sdk/500/android/mraid.js";
    }

    /* renamed from: com.inmobi.media.fq$h */
    /* compiled from: AdConfig */
    public static final class C6137h {
        public long expiry = 432000;
        public int maxRetries = 3;
        public boolean omidEnabled = true;
        public String partnerKey = "Inmobi";
        public int retryInterval = 60;
        public String url = "https://i.l.inmobicdn.net/sdk/sdk/OMID/omsdk-v1.3.17.js";
        public long webViewRetainTime = 1000;
    }

    /* renamed from: com.inmobi.media.fq$j */
    /* compiled from: AdConfig */
    public static final class C6139j {
        List<String> allowedContentType = new ArrayList(Collections.singletonList("video/mp4"));
        long maxSaveSize = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
    }

    /* renamed from: com.inmobi.media.fq$k */
    /* compiled from: AdConfig */
    public static final class C6140k {
        public List<String> allowedContentType = new ArrayList(Arrays.asList(new String[]{"video/mp4", MimeTypes.IMAGE_JPEG, "image/jpg", "image/gif", "image/png"}));
        public C6132c bitRate = new C6132c();
        public int maxWrapperLimit = 3;
        public long optimalVastVideoSize = 3145728;
        public long vastMaxAssetSize = 31457280;
    }

    /* renamed from: com.inmobi.media.fq$l */
    /* compiled from: AdConfig */
    public static final class C6141l {
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 2000;
        public int videoMinPercentagePlay = 50;
    }

    /* renamed from: com.inmobi.media.fq$m */
    /* compiled from: AdConfig */
    public static final class C6142m {
        static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
        static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
        public C6131b banner = new C6131b();
        public int displayMinPercentageAnimate = 67;
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 1000;
        public int impressionPollIntervalMillis = 250;
        public C6135f interstitial = new C6135f();
        private boolean moatEnabled = true;
        public C6137h omidConfig = new C6137h();
        public C6141l video = new C6141l();
        public int visibilityThrottleMillis = 100;
        public C6143n web = new C6143n();
    }

    /* renamed from: com.inmobi.media.fq$n */
    /* compiled from: AdConfig */
    public static final class C6143n {
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 1000;
        public int impressionPollIntervalMillis = 1000;
    }

    /* renamed from: b */
    public final String mo35325b() {
        return CampaignUnit.JSON_KEY_ADS;
    }

    /* renamed from: a */
    public static C6262ij<C6125fq> m18300a() {
        return new C6262ij().mo35466a(new C6267io("cache", C6125fq.class), (C6266in) new C6265im(new Constructor<Map<String, C6133d>>() {
            public final /* synthetic */ Object construct() {
                return new HashMap();
            }
        }, C6133d.class)).mo35466a(new C6267io(ALLOWED_CONTENT_TYPE, C6139j.class), (C6266in) new C6264il(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, String.class)).mo35466a(new C6267io(ALLOWED_CONTENT_TYPE, C6140k.class), (C6266in) new C6264il(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, String.class)).mo35466a(new C6267io(GESTURE_LIST, C6138i.class), (C6266in) new C6264il(new Constructor<List<Integer>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, Integer.class));
    }

    C6125fq(String str) {
        super(str);
        HashMap hashMap = new HashMap();
        this.cache = hashMap;
        hashMap.put(TtmlNode.RUBY_BASE, new C6133d());
        this.cache.put(AdFormat.BANNER, new C6133d());
        this.cache.put("int", new C6133d());
        this.cache.put("native", new C6133d());
    }

    /* renamed from: c */
    public final JSONObject mo35326c() {
        return m18300a().mo35468a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:169:0x0297 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35327d() {
        /*
            r10 = this;
            int r0 = r10.maxPoolSize
            r1 = 0
            if (r0 > 0) goto L_0x0006
            return r1
        L_0x0006:
            com.inmobi.media.jh r0 = r10.timeouts
            r0.mo35540j()
            java.lang.String r0 = r10.url
            java.lang.String r2 = "http://"
            boolean r0 = r0.startsWith(r2)
            java.lang.String r3 = "https://"
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = r10.url
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x0298
        L_0x001f:
            int r0 = r10.minimumRefreshInterval
            if (r0 < 0) goto L_0x0298
            int r4 = r10.defaultRefreshInterval
            if (r4 < 0) goto L_0x0298
            if (r0 > r4) goto L_0x0298
            int r0 = r10.fetchTimeout
            if (r0 > 0) goto L_0x002f
            goto L_0x0298
        L_0x002f:
            java.util.Map<java.lang.String, com.inmobi.media.fq$d> r0 = r10.cache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0039:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            com.inmobi.media.fq$d r4 = (com.inmobi.media.C6125fq.C6133d) r4
            long r8 = r4.timeToLive
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r5 = r1
        L_0x0056:
            if (r5 != 0) goto L_0x0039
            return r1
        L_0x0059:
            com.inmobi.media.fq$e r0 = r10.imai
            int r0 = r0.maxDbEvents
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$e r0 = r10.imai
            int r0 = r0.maxEventBatch
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$e r0 = r10.imai
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$e r0 = r10.imai
            int r0 = r0.pingInterval
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$e r0 = r10.imai
            int r0 = r0.pingTimeout
            if (r0 <= 0) goto L_0x0298
            com.inmobi.media.fq$e r0 = r10.imai
            long r8 = r0.pingCacheExpiry
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0081
            goto L_0x0298
        L_0x0081:
            com.inmobi.media.fq$g r0 = r10.mraid
            long r8 = r0.expiry
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$g r0 = r10.mraid
            int r0 = r0.retryInterval
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$g r0 = r10.mraid
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$g r0 = r10.mraid
            java.lang.String r0 = r0.url
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x00ab
            com.inmobi.media.fq$g r0 = r10.mraid
            java.lang.String r0 = r0.url
            boolean r0 = r0.startsWith(r3)
            if (r0 != 0) goto L_0x00ab
            goto L_0x0298
        L_0x00ab:
            com.inmobi.media.jh r0 = r10.timeouts
            int r0 = r0.mo35538h()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jh r0 = r10.timeouts
            int r0 = r0.mo35531b()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jh r0 = r10.timeouts
            int r0 = r0.mo35533c()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jh r0 = r10.timeouts
            int r0 = r0.mo35534d()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jh r0 = r10.timeouts
            int r0 = r0.mo35535e()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jh r0 = r10.timeouts
            int r0 = r0.mo35536f()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jh r0 = r10.timeouts
            int r0 = r0.mo35537g()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jh r0 = r10.timeouts
            int r0 = r0.mo35539i()
            if (r0 >= 0) goto L_0x00ed
            goto L_0x0298
        L_0x00ed:
            com.inmobi.media.fq$i r0 = r10.rendering
            int r0 = r0.picHeight
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            int r0 = r0.picWidth
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            int r0 = r0.picQuality
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            int r0 = r0.maxVibrationDuration
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            int r0 = r0.maxVibrationPatternLength
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            com.inmobi.media.fq$j r0 = r0.savecontent
            long r2 = r0.maxSaveSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            java.lang.String r0 = r0.webviewBackground
            if (r0 == 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            java.lang.String r0 = r0.webviewBackground
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            long r2 = r0.delayedRedirection
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            long r2 = r0.userTouchResetTime
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$i r0 = r10.rendering
            java.util.List r0 = r0.gestures
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x014f
            goto L_0x0298
        L_0x014f:
            com.inmobi.media.fq$i r0 = r10.rendering     // Catch:{ IllegalArgumentException -> 0x0298 }
            java.lang.String r0 = r0.webviewBackground     // Catch:{ IllegalArgumentException -> 0x0298 }
            android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x0298 }
            com.inmobi.media.fq$g r0 = r10.mraid
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$g r0 = r10.mraid
            int r0 = r0.retryInterval
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$g r0 = r10.mraid
            java.lang.String r0 = r0.url
            if (r0 == 0) goto L_0x0298
            com.inmobi.media.fq$g r0 = r10.mraid
            java.lang.String r0 = r0.url
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0178
            goto L_0x0298
        L_0x0178:
            com.inmobi.media.fq$m r0 = r10.viewability
            int r0 = r0.impressionMinPercentageViewed
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            int r0 = r0.impressionMinPercentageViewed
            r2 = 100
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            int r0 = r0.impressionMinTimeViewed
            if (r0 < 0) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            int r0 = r0.displayMinPercentageAnimate
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            int r0 = r0.displayMinPercentageAnimate
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$l r0 = r0.video
            int r0 = r0.impressionMinPercentageViewed
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$l r0 = r0.video
            int r0 = r0.impressionMinPercentageViewed
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$n r0 = r0.web
            int r0 = r0.impressionMinPercentageViewed
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$n r0 = r0.web
            int r0 = r0.impressionMinPercentageViewed
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$n r0 = r0.web
            int r0 = r0.impressionPollIntervalMillis
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$n r0 = r0.web
            int r0 = r0.impressionMinTimeViewed
            if (r0 < 0) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$l r0 = r0.video
            int r0 = r0.impressionMinTimeViewed
            if (r0 < 0) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$l r0 = r0.video
            int r0 = r0.videoMinPercentagePlay
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$l r0 = r0.video
            int r0 = r0.videoMinPercentagePlay
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            int r0 = r0.visibilityThrottleMillis
            r2 = 50
            if (r0 < r2) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            int r0 = r0.visibilityThrottleMillis
            int r0 = r0 * 5
            com.inmobi.media.fq$m r3 = r10.viewability
            int r3 = r3.impressionMinTimeViewed
            if (r0 > r3) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            int r0 = r0.impressionPollIntervalMillis
            if (r0 < r2) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            int r0 = r0.impressionPollIntervalMillis
            int r0 = r0 * 4
            com.inmobi.media.fq$m r2 = r10.viewability
            int r2 = r2.impressionMinTimeViewed
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.fq$m r0 = r10.viewability
            com.inmobi.media.fq$h r0 = r0.omidConfig
            if (r0 == 0) goto L_0x022f
            int r2 = r0.maxRetries
            if (r2 < 0) goto L_0x022f
            int r2 = r0.retryInterval
            if (r2 < 0) goto L_0x022f
            java.lang.String r2 = r0.url
            if (r2 == 0) goto L_0x022f
            java.lang.String r2 = r0.url
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 == 0) goto L_0x022f
            java.lang.String r0 = r0.partnerKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x022d
            goto L_0x022f
        L_0x022d:
            r0 = r1
            goto L_0x0230
        L_0x022f:
            r0 = r5
        L_0x0230:
            if (r0 == 0) goto L_0x0233
            goto L_0x0235
        L_0x0233:
            r0 = r1
            goto L_0x0236
        L_0x0235:
            r0 = r5
        L_0x0236:
            if (r0 == 0) goto L_0x0239
            return r1
        L_0x0239:
            com.inmobi.media.fq$k r0 = r10.vastVideo
            long r2 = r0.optimalVastVideoSize
            r8 = 31457280(0x1e00000, double:1.55419614E-316)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0298
            com.inmobi.media.fq$k r0 = r10.vastVideo
            long r2 = r0.optimalVastVideoSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0298
            com.inmobi.media.fq$k r0 = r10.vastVideo
            int r0 = r0.maxWrapperLimit
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$k r0 = r10.vastVideo
            long r2 = r0.vastMaxAssetSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0298
            com.inmobi.media.fq$k r0 = r10.vastVideo
            long r2 = r0.vastMaxAssetSize
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x026d
            goto L_0x0298
        L_0x026d:
            com.inmobi.media.fq$a r0 = r10.assetCache
            int r0 = r0.retryInterval
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$a r0 = r10.assetCache
            int r0 = r0.maxCachedAssets
            r2 = 20
            if (r0 > r2) goto L_0x0298
            com.inmobi.media.fq$a r0 = r10.assetCache
            int r0 = r0.maxCachedAssets
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$a r0 = r10.assetCache
            long r2 = r0.timeToLive
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$a r0 = r10.assetCache
            long r2 = r0.maxCacheSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.fq$a r0 = r10.assetCache
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x0298
            return r5
        L_0x0298:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6125fq.mo35327d():boolean");
    }

    /* renamed from: a */
    public final C6133d mo35324a(String str) {
        C6133d dVar = this.cache.get(str);
        if (dVar != null) {
            return dVar;
        }
        C6133d dVar2 = this.cache.get(TtmlNode.RUBY_BASE);
        return dVar2 == null ? new C6133d() : dVar2;
    }

    /* renamed from: com.inmobi.media.fq$d */
    /* compiled from: AdConfig */
    public static final class C6133d {
        public long timeToLive = 3300;

        C6133d() {
        }
    }

    /* renamed from: com.inmobi.media.fq$i */
    /* compiled from: AdConfig */
    public static final class C6138i {
        static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
        public static final int DEFAULT_TOUCH_RESET_TIME = 4;
        public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
        public boolean autoRedirectionEnforcement = true;
        public int bannerNetworkLoadsLimit = 50;
        /* access modifiers changed from: private */
        public long delayedRedirection = 5;
        public boolean enablePubMuteControl = false;
        public List<Integer> gestures = new ArrayList(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5}));
        int maxVibrationDuration = 5;
        int maxVibrationPatternLength = 20;
        public int otherNetworkLoadsLimit = -1;
        int picHeight = 480;
        int picQuality = 100;
        int picWidth = 320;
        C6139j savecontent = new C6139j();
        public boolean shouldRenderPopup = false;
        public long userTouchResetTime = 4;
        /* access modifiers changed from: package-private */
        public String webviewBackground = "#00000000";

        /* renamed from: a */
        public final int mo35328a() {
            try {
                return Color.parseColor(this.webviewBackground);
            } catch (IllegalArgumentException unused) {
                String unused2 = C6125fq.TAG;
                return Color.parseColor("#00000000");
            }
        }
    }
}
