package com.vungle.warren;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.core.util.Consumer;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.common.net.HttpHeaders;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.PrivacyManager;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.CacheBustDBAdapter;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.network.APIFactory;
import com.vungle.warren.network.Call;
import com.vungle.warren.network.VungleApi;
import com.vungle.warren.omsdk.OMInjector;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.utility.TimeoutProvider;
import com.vungle.warren.utility.platform.Platform;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;
import okio.Sink;

public class VungleApiClient {
    private static final String AMAZON_ADVERTISING_ID = "amazon_advertising_id";
    public static final String ANDROID_ID = "android_id";
    private static String BASE_URL = "https://ads.api.vungle.com/";
    public static final String GAID = "gaid";

    /* renamed from: ID */
    private static final String f29328ID = "id";
    public static final String IFA = "ifa";
    static final String MANUFACTURER_AMAZON = "Amazon";
    /* access modifiers changed from: private */
    public static final String TAG = VungleApiClient.class.getCanonicalName();
    protected static WrapperFramework WRAPPER_FRAMEWORK_SELECTED;
    private static String headerUa;
    private static Set<Interceptor> logInterceptors = new HashSet();
    private static Set<Interceptor> networkInterceptors = new HashSet();
    private VungleApi api;
    private JsonObject appBody;
    /* access modifiers changed from: private */
    public String appSetId = "";
    private JsonObject baseDeviceInfo;
    private String biLoggingEndpoint;
    private String cacheBustEndpoint;
    private CacheManager cacheManager;
    private OkHttpClient client;
    private Context context;
    private boolean defaultIdFallbackDisabled;
    private boolean enableOm;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private String logEndpoint;
    private String newEndpoint;
    private final OMInjector omInjector;
    private final Platform platform;
    private String reportAdEndpoint;
    /* access modifiers changed from: private */
    public Repository repository;
    private String requestAdEndpoint;
    /* access modifiers changed from: private */
    public Map<String, Long> retryAfterDataMap = new ConcurrentHashMap();
    private String riEndpoint;
    private VungleApi timeoutApi;
    private TimeoutProvider timeoutProvider;
    /* access modifiers changed from: private */
    public String uaString = System.getProperty("http.agent");
    private boolean willPlayAdEnabled;
    private String willPlayAdEndpoint;
    private int willPlayAdTimeout;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";
        public static final String EDGE = "edge";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "LTE";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";
    }

    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    private String getConnectionTypeDetail(int i) {
        switch (i) {
            case 1:
                return ConnectionTypeDetail.GPRS;
            case 2:
                return ConnectionTypeDetail.EDGE;
            case 4:
                return ConnectionTypeDetail.WCDMA;
            case 5:
                return ConnectionTypeDetail.CDMA_EVDO_0;
            case 6:
                return ConnectionTypeDetail.CDMA_EVDO_A;
            case 7:
                return ConnectionTypeDetail.CDMA_1XRTT;
            case 8:
                return ConnectionTypeDetail.HSDPA;
            case 9:
                return ConnectionTypeDetail.HSUPA;
            case 12:
                return ConnectionTypeDetail.CDMA_EVDO_B;
            case 13:
                return ConnectionTypeDetail.LTE;
            case 14:
                return ConnectionTypeDetail.HRPD;
            default:
                return "unknown";
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(MANUFACTURER_AMAZON.equals(Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
        sb.append("6.11.0");
        headerUa = sb.toString();
    }

    VungleApiClient(Context context2, CacheManager cacheManager2, Repository repository2, OMInjector oMInjector, Platform platform2) {
        this.cacheManager = cacheManager2;
        this.context = context2.getApplicationContext();
        this.repository = repository2;
        this.omInjector = oMInjector;
        this.platform = platform2;
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            public Response intercept(Interceptor.Chain chain) throws IOException {
                int code;
                Request request = chain.request();
                String encodedPath = request.url().encodedPath();
                Long l = (Long) VungleApiClient.this.retryAfterDataMap.get(encodedPath);
                if (l != null) {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(l.longValue() - System.currentTimeMillis());
                    if (seconds > 0) {
                        return new Response.Builder().request(request).addHeader(HttpHeaders.RETRY_AFTER, String.valueOf(seconds)).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"Error\":\"Retry-After\"}")).build();
                    }
                    VungleApiClient.this.retryAfterDataMap.remove(encodedPath);
                }
                Response proceed = chain.proceed(request);
                if (proceed != null && ((code = proceed.code()) == 429 || code == 500 || code == 502 || code == 503)) {
                    String str = proceed.headers().get(HttpHeaders.RETRY_AFTER);
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            long parseLong = Long.parseLong(str);
                            if (parseLong > 0) {
                                VungleApiClient.this.retryAfterDataMap.put(encodedPath, Long.valueOf((parseLong * 1000) + System.currentTimeMillis()));
                            }
                        } catch (NumberFormatException unused) {
                            Log.d(VungleApiClient.TAG, "Retry-After value is not an valid value");
                        }
                    }
                }
                return proceed;
            }
        });
        this.client = addInterceptor.build();
        OkHttpClient build = addInterceptor.addInterceptor(new GzipRequestInterceptor()).build();
        this.api = new APIFactory(this.client, BASE_URL).createAPI(Vungle._instance.appID);
        this.gzipApi = new APIFactory(build, BASE_URL).createAPI(Vungle._instance.appID);
        this.timeoutProvider = (TimeoutProvider) ServiceLocator.getInstance(context2).getService(TimeoutProvider.class);
    }

    public static String getHeaderUa() {
        return headerUa;
    }

    public static void setHeaderUa(String str) {
        headerUa = str;
    }

    public void init() {
        init(this.context);
    }

    static class GzipRequestInterceptor implements Interceptor {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        private static final String GZIP = "gzip";

        GzipRequestInterceptor() {
        }

        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            if (request.body() == null || request.header("Content-Encoding") != null) {
                return chain.proceed(request);
            }
            return chain.proceed(request.newBuilder().header("Content-Encoding", GZIP).method(request.method(), gzip(request.body())).build());
        }

        private RequestBody gzip(final RequestBody requestBody) throws IOException {
            final Buffer buffer = new Buffer();
            BufferedSink buffer2 = Okio.buffer((Sink) new GzipSink(buffer));
            requestBody.writeTo(buffer2);
            buffer2.close();
            return new RequestBody() {
                public MediaType contentType() {
                    return requestBody.contentType();
                }

                public long contentLength() {
                    return buffer.size();
                }

                public void writeTo(BufferedSink bufferedSink) throws IOException {
                    bufferedSink.write(buffer.snapshot());
                }
            };
        }
    }

    public void setDefaultIdFallbackDisabled(boolean z) {
        this.defaultIdFallbackDisabled = z;
    }

    /* access modifiers changed from: package-private */
    public synchronized void init(Context context2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(TJAdUnitConstants.String.BUNDLE, context2.getPackageName());
        String str = null;
        try {
            str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (str == null) {
            str = "1.0";
        }
        jsonObject.addProperty("ver", str);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("make", Build.MANUFACTURER);
        jsonObject2.addProperty(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        jsonObject2.addProperty("osv", Build.VERSION.RELEASE);
        jsonObject2.addProperty("carrier", ((TelephonyManager) context2.getSystemService("phone")).getNetworkOperatorName());
        jsonObject2.addProperty("os", MANUFACTURER_AMAZON.equals(Build.MANUFACTURER) ? "amazon" : "android");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context2.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        jsonObject2.addProperty("w", (Number) Integer.valueOf(displayMetrics.widthPixels));
        jsonObject2.addProperty("h", (Number) Integer.valueOf(displayMetrics.heightPixels));
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            jsonObject2.addProperty("ua", userAgent);
            initUserAgentLazy();
        } catch (Exception e) {
            String str2 = TAG;
            Log.e(str2, "Cannot Get UserAgent. Setting Default Device UserAgent." + e.getLocalizedMessage());
        }
        this.baseDeviceInfo = jsonObject2;
        this.appBody = jsonObject;
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        updateAppSetID();
    }

    /* access modifiers changed from: package-private */
    public void setAppId(String str) {
        setAppId(str, this.appBody);
    }

    private void setAppId(String str, JsonObject jsonObject) {
        jsonObject.addProperty("id", str);
    }

    private void initUserAgentLazy() {
        this.platform.getUserAgentLazy(new Consumer<String>() {
            public void accept(String str) {
                if (str == null) {
                    Log.e(VungleApiClient.TAG, "Cannot Get UserAgent. Setting Default Device UserAgent");
                } else {
                    String unused = VungleApiClient.this.uaString = str;
                }
            }
        });
    }

    public com.vungle.warren.network.Response config() throws VungleException, IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody(true));
        jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        jsonObject.add("user", getUserBody());
        JsonObject extBody = getExtBody();
        if (extBody != null) {
            jsonObject.add("ext", extBody);
        }
        com.vungle.warren.network.Response<JsonObject> execute = this.api.config(getHeaderUa(), jsonObject).execute();
        if (!execute.isSuccessful()) {
            return execute;
        }
        JsonObject body = execute.body();
        String str = TAG;
        Log.d(str, "Config Response: " + body);
        if (JsonUtil.hasNonNull(body, "sleep")) {
            String asString = JsonUtil.hasNonNull(body, TJAdUnitConstants.String.VIDEO_INFO) ? body.get(TJAdUnitConstants.String.VIDEO_INFO).getAsString() : "";
            String str2 = TAG;
            Log.e(str2, "Error Initializing Vungle. Please try again. " + asString);
            throw new VungleException(3);
        } else if (JsonUtil.hasNonNull(body, "endpoints")) {
            JsonObject asJsonObject = body.getAsJsonObject("endpoints");
            HttpUrl parse = HttpUrl.parse(asJsonObject.get("new").getAsString());
            HttpUrl parse2 = HttpUrl.parse(asJsonObject.get(CampaignUnit.JSON_KEY_ADS).getAsString());
            HttpUrl parse3 = HttpUrl.parse(asJsonObject.get("will_play_ad").getAsString());
            HttpUrl parse4 = HttpUrl.parse(asJsonObject.get("report_ad").getAsString());
            HttpUrl parse5 = HttpUrl.parse(asJsonObject.get("ri").getAsString());
            HttpUrl parse6 = HttpUrl.parse(asJsonObject.get("log").getAsString());
            HttpUrl parse7 = HttpUrl.parse(asJsonObject.get(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME).getAsString());
            HttpUrl parse8 = HttpUrl.parse(asJsonObject.get("sdk_bi").getAsString());
            if (parse == null || parse2 == null || parse3 == null || parse4 == null || parse5 == null || parse6 == null || parse7 == null || parse8 == null) {
                Log.e(TAG, "Error Initializing Vungle. Please try again. ");
                throw new VungleException(3);
            }
            this.newEndpoint = parse.toString();
            this.requestAdEndpoint = parse2.toString();
            this.willPlayAdEndpoint = parse3.toString();
            this.reportAdEndpoint = parse4.toString();
            this.riEndpoint = parse5.toString();
            this.logEndpoint = parse6.toString();
            this.cacheBustEndpoint = parse7.toString();
            this.biLoggingEndpoint = parse8.toString();
            JsonObject asJsonObject2 = body.getAsJsonObject("will_play_ad");
            this.willPlayAdTimeout = asJsonObject2.get("request_timeout").getAsInt();
            this.willPlayAdEnabled = asJsonObject2.get(TJAdUnitConstants.String.ENABLED).getAsBoolean();
            this.enableOm = JsonUtil.getAsBoolean(body.getAsJsonObject("viewability"), "om", false);
            if (this.willPlayAdEnabled) {
                Log.v(TAG, "willPlayAd is enabled, generating a timeout client.");
                this.timeoutApi = new APIFactory(this.client.newBuilder().readTimeout((long) this.willPlayAdTimeout, TimeUnit.MILLISECONDS).build(), "https://api.vungle.com/").createAPI(Vungle._instance.appID);
            }
            if (getOmEnabled()) {
                this.omInjector.init();
            } else {
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.OM_SDK).addData(SessionAttribute.ENABLED, false).build());
            }
            return execute;
        } else {
            Log.e(TAG, "Error Initializing Vungle. Please try again. ");
            throw new VungleException(3);
        }
    }

    public Call<JsonObject> reportNew() throws IllegalStateException {
        if (this.newEndpoint != null) {
            HashMap hashMap = new HashMap(2);
            JsonElement jsonElement = this.appBody.get("id");
            String str = "";
            hashMap.put("app_id", jsonElement != null ? jsonElement.getAsString() : str);
            JsonObject deviceBody = getDeviceBody();
            if (PrivacyManager.getInstance().shouldSendAdIds()) {
                JsonElement jsonElement2 = deviceBody.get(IFA);
                if (jsonElement2 != null) {
                    str = jsonElement2.getAsString();
                }
                hashMap.put(IFA, str);
            }
            return this.api.reportNew(getHeaderUa(), this.newEndpoint, hashMap);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public Call<JsonObject> requestAd(String str, String str2, boolean z, JsonObject jsonObject) throws IllegalStateException {
        if (this.requestAdEndpoint != null) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("device", getDeviceBody());
            jsonObject2.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
            JsonObject userBody = getUserBody();
            if (jsonObject != null) {
                userBody.add("vision", jsonObject);
            }
            jsonObject2.add("user", userBody);
            JsonObject extBody = getExtBody();
            if (extBody != null) {
                jsonObject2.add("ext", extBody);
            }
            JsonObject jsonObject3 = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(str);
            jsonObject3.add("placements", jsonArray);
            jsonObject3.addProperty("header_bidding", Boolean.valueOf(z));
            if (!TextUtils.isEmpty(str2)) {
                jsonObject3.addProperty("ad_size", str2);
            }
            jsonObject2.add("request", jsonObject3);
            return this.gzipApi.ads(getHeaderUa(), this.requestAdEndpoint, jsonObject2);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* access modifiers changed from: package-private */
    public Call<JsonObject> willPlayAd(String str, boolean z, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody());
        jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        jsonObject.add("user", getUserBody());
        JsonObject jsonObject2 = new JsonObject();
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("reference_id", str);
        jsonObject3.addProperty("is_auto_cached", Boolean.valueOf(z));
        jsonObject2.add("placement", jsonObject3);
        jsonObject2.addProperty(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_AD_TOKEN, str2);
        jsonObject.add("request", jsonObject2);
        return this.timeoutApi.willPlayAd(getHeaderUa(), this.willPlayAdEndpoint, jsonObject);
    }

    /* access modifiers changed from: package-private */
    public boolean canCallWillPlayAd() {
        return this.willPlayAdEnabled && !TextUtils.isEmpty(this.willPlayAdEndpoint);
    }

    public Call<JsonObject> reportAd(JsonObject jsonObject) {
        if (this.reportAdEndpoint != null) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("device", getDeviceBody());
            jsonObject2.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
            jsonObject2.add("request", jsonObject);
            jsonObject2.add("user", getUserBody());
            JsonObject extBody = getExtBody();
            if (extBody != null) {
                jsonObject2.add("ext", extBody);
            }
            return this.gzipApi.reportAd(getHeaderUa(), this.reportAdEndpoint, jsonObject2);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public Call<JsonObject> sendLog(JsonObject jsonObject) {
        if (this.logEndpoint != null) {
            return this.gzipApi.sendLog(getHeaderUa(), this.logEndpoint, jsonObject);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: ri */
    public Call<JsonObject> mo74180ri(JsonObject jsonObject) {
        if (this.riEndpoint != null) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("device", getDeviceBody());
            jsonObject2.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
            jsonObject2.add("request", jsonObject);
            jsonObject2.add("user", getUserBody());
            JsonObject extBody = getExtBody();
            if (extBody != null) {
                jsonObject2.add("ext", extBody);
            }
            return this.api.mo74553ri(getHeaderUa(), this.riEndpoint, jsonObject2);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public boolean pingTPAT(String str) throws ClearTextTrafficException, MalformedURLException {
        boolean z;
        if (TextUtils.isEmpty(str) || HttpUrl.parse(str) == null) {
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Invalid URL").addData(SessionAttribute.URL, str).build());
            throw new MalformedURLException("Invalid URL : " + str);
        }
        try {
            String host = new URL(str).getHost();
            if (Build.VERSION.SDK_INT >= 24) {
                z = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(host);
            } else {
                z = Build.VERSION.SDK_INT >= 23 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true;
            }
            if (z || !URLUtil.isHttpUrl(str)) {
                try {
                    com.vungle.warren.network.Response<Void> execute = this.api.pingTPAT(this.uaString, str).execute();
                    if (execute == null) {
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Error on pinging TPAT").addData(SessionAttribute.URL, str).build());
                    } else if (!execute.isSuccessful()) {
                        SessionTracker instance = SessionTracker.getInstance();
                        SessionData.Builder addData = new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false);
                        SessionAttribute sessionAttribute = SessionAttribute.REASON;
                        instance.trackEvent(addData.addData(sessionAttribute, execute.code() + ": " + execute.message()).addData(SessionAttribute.URL, str).build());
                    }
                    return true;
                } catch (IOException e) {
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, e.getMessage()).addData(SessionAttribute.URL, str).build());
                    Log.d(TAG, "Error on pinging TPAT");
                    return false;
                }
            } else {
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Clear Text Traffic is blocked").addData(SessionAttribute.URL, str).build());
                throw new ClearTextTrafficException("Clear Text Traffic is blocked");
            }
        } catch (MalformedURLException unused) {
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Invalid URL").addData(SessionAttribute.URL, str).build());
            throw new MalformedURLException("Invalid URL : " + str);
        }
    }

    public Call<JsonObject> cacheBust(long j) {
        if (this.cacheBustEndpoint != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("device", getDeviceBody());
            jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
            jsonObject.add("user", getUserBody());
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty(Cookie.LAST_CACHE_BUST, (Number) Long.valueOf(j));
            jsonObject.add("request", jsonObject2);
            return this.gzipApi.cacheBust(getHeaderUa(), this.cacheBustEndpoint, jsonObject);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public Call<JsonObject> sendAnalytics(Collection<CacheBust> collection) {
        if (this.biLoggingEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        } else if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Cannot send analytics when bust and session data is empty");
        } else {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("device", getDeviceBody());
            jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
            JsonObject jsonObject2 = new JsonObject();
            JsonArray jsonArray = new JsonArray(collection.size());
            for (CacheBust next : collection) {
                for (String addProperty : next.getEventIds()) {
                    JsonObject jsonObject3 = new JsonObject();
                    jsonObject3.addProperty("target", next.getIdType() == 1 ? "campaign" : VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE);
                    jsonObject3.addProperty("id", next.getId());
                    jsonObject3.addProperty("event_id", addProperty);
                    jsonArray.add((JsonElement) jsonObject3);
                }
            }
            if (jsonArray.size() > 0) {
                jsonObject2.add(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME, jsonArray);
            }
            jsonObject.add("request", jsonObject2);
            return this.gzipApi.sendBiAnalytics(getHeaderUa(), this.biLoggingEndpoint, jsonObject);
        }
    }

    public Call<JsonObject> sendSessionDataAnalytics(JsonArray jsonArray) {
        if (this.biLoggingEndpoint != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("device", getDeviceBody());
            jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("session_events", jsonArray);
            jsonObject.add("request", jsonObject2);
            return this.gzipApi.sendBiAnalytics(getHeaderUa(), this.biLoggingEndpoint, jsonObject);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    private JsonObject getDeviceBody() throws IllegalStateException {
        return getDeviceBody(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0313, code lost:
        if (((android.app.UiModeManager) r12.context.getSystemService("uimode")).getCurrentModeType() == 4) goto L_0x0315;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b3 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ce A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d0 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01e5 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029e A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02ee A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02ff A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0367 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x037e A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0397 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03c7 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0402 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0405 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b8 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0127 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0129 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014e A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0159 A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016a A[Catch:{ SettingNotFoundException -> 0x03a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.google.gson.JsonObject getDeviceBody(boolean r13) throws java.lang.IllegalStateException {
        /*
            r12 = this;
            monitor-enter(r12)
            com.google.gson.JsonObject r0 = r12.baseDeviceInfo     // Catch:{ all -> 0x040c }
            com.google.gson.JsonObject r0 = r0.deepCopy()     // Catch:{ all -> 0x040c }
            com.google.gson.JsonObject r1 = new com.google.gson.JsonObject     // Catch:{ all -> 0x040c }
            r1.<init>()     // Catch:{ all -> 0x040c }
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r5 = "Amazon"
            java.lang.String r6 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x00a2 }
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x00a2 }
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r12.context     // Catch:{ SettingNotFoundException -> 0x0034 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0034 }
            java.lang.String r6 = "limit_ad_tracking"
            int r6 = android.provider.Settings.Secure.getInt(r5, r6)     // Catch:{ SettingNotFoundException -> 0x0034 }
            if (r6 != r4) goto L_0x0029
            r6 = r4
            goto L_0x002a
        L_0x0029:
            r6 = r3
        L_0x002a:
            java.lang.String r7 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r7)     // Catch:{ SettingNotFoundException -> 0x0032 }
            goto L_0x00ae
        L_0x0032:
            r5 = move-exception
            goto L_0x0036
        L_0x0034:
            r5 = move-exception
            r6 = r4
        L_0x0036:
            java.lang.String r7 = TAG     // Catch:{ Exception -> 0x0040 }
            java.lang.String r8 = "Error getting Amazon advertising info"
            android.util.Log.w(r7, r8, r5)     // Catch:{ Exception -> 0x0040 }
            r5 = r2
            goto L_0x00ae
        L_0x0040:
            r5 = r6
            r6 = r2
            goto L_0x00a4
        L_0x0043:
            android.content.Context r5 = r12.context     // Catch:{ NoClassDefFoundError -> 0x0079, GooglePlayServicesNotAvailableException -> 0x005b }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r5 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch:{ NoClassDefFoundError -> 0x0079, GooglePlayServicesNotAvailableException -> 0x005b }
            if (r5 == 0) goto L_0x0058
            java.lang.String r6 = r5.getId()     // Catch:{ NoClassDefFoundError -> 0x0079, GooglePlayServicesNotAvailableException -> 0x005b }
            boolean r5 = r5.isLimitAdTrackingEnabled()     // Catch:{ NoClassDefFoundError -> 0x0056, GooglePlayServicesNotAvailableException -> 0x0054 }
            goto L_0x00ab
        L_0x0054:
            r5 = move-exception
            goto L_0x005d
        L_0x0056:
            r5 = move-exception
            goto L_0x007b
        L_0x0058:
            r5 = r2
        L_0x0059:
            r6 = r4
            goto L_0x00ae
        L_0x005b:
            r5 = move-exception
            r6 = r2
        L_0x005d:
            java.lang.String r7 = TAG     // Catch:{ Exception -> 0x00a3 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a3 }
            r8.<init>()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r9 = "Play services Not available: "
            r8.append(r9)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r5 = r5.getLocalizedMessage()     // Catch:{ Exception -> 0x00a3 }
            r8.append(r5)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r5 = r8.toString()     // Catch:{ Exception -> 0x00a3 }
            android.util.Log.e(r7, r5)     // Catch:{ Exception -> 0x00a3 }
            r5 = r6
            goto L_0x0059
        L_0x0079:
            r5 = move-exception
            r6 = r2
        L_0x007b:
            java.lang.String r7 = TAG     // Catch:{ Exception -> 0x00a3 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a3 }
            r8.<init>()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r9 = "Play services Not available: "
            r8.append(r9)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r5 = r5.getLocalizedMessage()     // Catch:{ Exception -> 0x00a3 }
            r8.append(r5)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r5 = r8.toString()     // Catch:{ Exception -> 0x00a3 }
            android.util.Log.e(r7, r5)     // Catch:{ Exception -> 0x00a3 }
            android.content.Context r5 = r12.context     // Catch:{ Exception -> 0x00a3 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r7 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r7)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0059
        L_0x00a2:
            r6 = r2
        L_0x00a3:
            r5 = r4
        L_0x00a4:
            java.lang.String r7 = TAG     // Catch:{ all -> 0x040c }
            java.lang.String r8 = "Cannot load Advertising ID"
            android.util.Log.e(r7, r8)     // Catch:{ all -> 0x040c }
        L_0x00ab:
            r11 = r6
            r6 = r5
            r5 = r11
        L_0x00ae:
            com.vungle.warren.PrivacyManager r7 = com.vungle.warren.PrivacyManager.getInstance()     // Catch:{ all -> 0x040c }
            boolean r7 = r7.shouldSendAdIds()     // Catch:{ all -> 0x040c }
            if (r7 == 0) goto L_0x0103
            if (r5 == 0) goto L_0x00d2
            java.lang.String r7 = "Amazon"
            java.lang.String r8 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x040c }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x040c }
            if (r7 == 0) goto L_0x00c7
            java.lang.String r7 = "amazon_advertising_id"
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r7 = "gaid"
        L_0x00c9:
            r1.addProperty((java.lang.String) r7, (java.lang.String) r5)     // Catch:{ all -> 0x040c }
            java.lang.String r7 = "ifa"
            r0.addProperty((java.lang.String) r7, (java.lang.String) r5)     // Catch:{ all -> 0x040c }
            goto L_0x0103
        L_0x00d2:
            android.content.Context r5 = r12.context     // Catch:{ all -> 0x040c }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x040c }
            java.lang.String r7 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r7)     // Catch:{ all -> 0x040c }
            java.lang.String r7 = "ifa"
            boolean r8 = r12.defaultIdFallbackDisabled     // Catch:{ all -> 0x040c }
            if (r8 == 0) goto L_0x00e7
            java.lang.String r8 = ""
            goto L_0x00f1
        L_0x00e7:
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x040c }
            if (r8 != 0) goto L_0x00ef
            r8 = r5
            goto L_0x00f1
        L_0x00ef:
            java.lang.String r8 = ""
        L_0x00f1:
            r0.addProperty((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x040c }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x040c }
            if (r7 != 0) goto L_0x0103
            boolean r7 = r12.defaultIdFallbackDisabled     // Catch:{ all -> 0x040c }
            if (r7 != 0) goto L_0x0103
            java.lang.String r7 = "android_id"
            r1.addProperty((java.lang.String) r7, (java.lang.String) r5)     // Catch:{ all -> 0x040c }
        L_0x0103:
            com.vungle.warren.PrivacyManager r5 = com.vungle.warren.PrivacyManager.getInstance()     // Catch:{ all -> 0x040c }
            boolean r5 = r5.shouldSendAdIds()     // Catch:{ all -> 0x040c }
            if (r5 == 0) goto L_0x010f
            if (r13 == 0) goto L_0x0123
        L_0x010f:
            java.lang.String r13 = "ifa"
            r0.remove(r13)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "android_id"
            r1.remove(r13)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "gaid"
            r1.remove(r13)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "amazon_advertising_id"
            r1.remove(r13)     // Catch:{ all -> 0x040c }
        L_0x0123:
            java.lang.String r13 = "lmt"
            if (r6 == 0) goto L_0x0129
            r5 = r4
            goto L_0x012a
        L_0x0129:
            r5 = r3
        L_0x012a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x040c }
            r0.addProperty((java.lang.String) r13, (java.lang.Number) r5)     // Catch:{ all -> 0x040c }
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x040c }
            java.lang.Boolean r5 = r12.isGooglePlayServicesAvailable()     // Catch:{ all -> 0x040c }
            boolean r13 = r13.equals(r5)     // Catch:{ all -> 0x040c }
            java.lang.String r5 = "is_google_play_services_available"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r5, (java.lang.Boolean) r13)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = r12.getAppSetId()     // Catch:{ all -> 0x040c }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x040c }
            if (r13 != 0) goto L_0x0155
            java.lang.String r13 = "app_set_id"
            java.lang.String r5 = r12.appSetId     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r13, (java.lang.String) r5)     // Catch:{ all -> 0x040c }
        L_0x0155:
            android.content.Context r13 = r12.context     // Catch:{ all -> 0x040c }
            if (r13 == 0) goto L_0x0166
            android.content.Context r13 = r12.context     // Catch:{ all -> 0x040c }
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch:{ all -> 0x040c }
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch:{ all -> 0x040c }
            android.content.Intent r2 = r13.registerReceiver(r2, r5)     // Catch:{ all -> 0x040c }
        L_0x0166:
            r13 = 4
            r5 = 2
            if (r2 == 0) goto L_0x01b3
            java.lang.String r6 = "level"
            r7 = -1
            int r6 = r2.getIntExtra(r6, r7)     // Catch:{ all -> 0x040c }
            java.lang.String r8 = "scale"
            int r8 = r2.getIntExtra(r8, r7)     // Catch:{ all -> 0x040c }
            if (r6 <= 0) goto L_0x0187
            if (r8 <= 0) goto L_0x0187
            java.lang.String r9 = "battery_level"
            float r6 = (float) r6     // Catch:{ all -> 0x040c }
            float r8 = (float) r8     // Catch:{ all -> 0x040c }
            float r6 = r6 / r8
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r9, (java.lang.Number) r6)     // Catch:{ all -> 0x040c }
        L_0x0187:
            java.lang.String r6 = "status"
            int r6 = r2.getIntExtra(r6, r7)     // Catch:{ all -> 0x040c }
            if (r6 != r7) goto L_0x0192
            java.lang.String r2 = "UNKNOWN"
            goto L_0x01b5
        L_0x0192:
            if (r6 == r5) goto L_0x019b
            r8 = 5
            if (r6 != r8) goto L_0x0198
            goto L_0x019b
        L_0x0198:
            java.lang.String r2 = "NOT_CHARGING"
            goto L_0x01b5
        L_0x019b:
            java.lang.String r6 = "plugged"
            int r2 = r2.getIntExtra(r6, r7)     // Catch:{ all -> 0x040c }
            if (r2 == r4) goto L_0x01b0
            if (r2 == r5) goto L_0x01ad
            if (r2 == r13) goto L_0x01aa
            java.lang.String r2 = "BATTERY_PLUGGED_OTHERS"
            goto L_0x01b5
        L_0x01aa:
            java.lang.String r2 = "BATTERY_PLUGGED_WIRELESS"
            goto L_0x01b5
        L_0x01ad:
            java.lang.String r2 = "BATTERY_PLUGGED_USB"
            goto L_0x01b5
        L_0x01b0:
            java.lang.String r2 = "BATTERY_PLUGGED_AC"
            goto L_0x01b5
        L_0x01b3:
            java.lang.String r2 = "UNKNOWN"
        L_0x01b5:
            java.lang.String r6 = "battery_state"
            r1.addProperty((java.lang.String) r6, (java.lang.String) r2)     // Catch:{ all -> 0x040c }
            android.content.Context r2 = r12.context     // Catch:{ all -> 0x040c }
            java.lang.String r6 = "power"
            java.lang.Object r2 = r2.getSystemService(r6)     // Catch:{ all -> 0x040c }
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch:{ all -> 0x040c }
            java.lang.String r6 = "battery_saver_enabled"
            if (r2 == 0) goto L_0x01d0
            boolean r2 = r2.isPowerSaveMode()     // Catch:{ all -> 0x040c }
            if (r2 == 0) goto L_0x01d0
            r2 = r4
            goto L_0x01d1
        L_0x01d0:
            r2 = r3
        L_0x01d1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r6, (java.lang.Number) r2)     // Catch:{ all -> 0x040c }
            android.content.Context r2 = r12.context     // Catch:{ all -> 0x040c }
            java.lang.String r6 = "android.permission.ACCESS_NETWORK_STATE"
            int r2 = androidx.core.content.PermissionChecker.checkCallingOrSelfPermission(r2, r6)     // Catch:{ all -> 0x040c }
            r6 = 24
            r7 = 3
            if (r2 != 0) goto L_0x026b
            java.lang.String r2 = "NONE"
            java.lang.String r8 = "unknown"
            android.content.Context r9 = r12.context     // Catch:{ all -> 0x040c }
            java.lang.String r10 = "connectivity"
            java.lang.Object r9 = r9.getSystemService(r10)     // Catch:{ all -> 0x040c }
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9     // Catch:{ all -> 0x040c }
            if (r9 == 0) goto L_0x0223
            android.net.NetworkInfo r10 = r9.getActiveNetworkInfo()     // Catch:{ all -> 0x040c }
            if (r10 == 0) goto L_0x0223
            int r2 = r10.getType()     // Catch:{ all -> 0x040c }
            if (r2 == 0) goto L_0x0219
            if (r2 == r4) goto L_0x0216
            r10 = 6
            if (r2 == r10) goto L_0x0216
            r10 = 7
            if (r2 == r10) goto L_0x0213
            r10 = 9
            if (r2 == r10) goto L_0x0210
            java.lang.String r2 = "UNKNOWN"
            goto L_0x0223
        L_0x0210:
            java.lang.String r2 = "ETHERNET"
            goto L_0x0223
        L_0x0213:
            java.lang.String r2 = "BLUETOOTH"
            goto L_0x0223
        L_0x0216:
            java.lang.String r2 = "WIFI"
            goto L_0x0223
        L_0x0219:
            java.lang.String r2 = "MOBILE"
            int r8 = r10.getSubtype()     // Catch:{ all -> 0x040c }
            java.lang.String r8 = r12.getConnectionTypeDetail(r8)     // Catch:{ all -> 0x040c }
        L_0x0223:
            java.lang.String r10 = "connection_type"
            r1.addProperty((java.lang.String) r10, (java.lang.String) r2)     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "connection_type_detail"
            r1.addProperty((java.lang.String) r2, (java.lang.String) r8)     // Catch:{ all -> 0x040c }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x040c }
            if (r2 < r6) goto L_0x026b
            boolean r2 = r9.isActiveNetworkMetered()     // Catch:{ all -> 0x040c }
            if (r2 == 0) goto L_0x025b
            int r2 = r9.getRestrictBackgroundStatus()     // Catch:{ all -> 0x040c }
            if (r2 == r4) goto L_0x024a
            if (r2 == r5) goto L_0x0247
            if (r2 == r7) goto L_0x0244
            java.lang.String r2 = "UNKNOWN"
            goto L_0x024c
        L_0x0244:
            java.lang.String r2 = "ENABLED"
            goto L_0x024c
        L_0x0247:
            java.lang.String r2 = "WHITELISTED"
            goto L_0x024c
        L_0x024a:
            java.lang.String r2 = "DISABLED"
        L_0x024c:
            java.lang.String r5 = "data_saver_status"
            r1.addProperty((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "network_metered"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r2, (java.lang.Number) r5)     // Catch:{ all -> 0x040c }
            goto L_0x026b
        L_0x025b:
            java.lang.String r2 = "data_saver_status"
            java.lang.String r5 = "NOT_APPLICABLE"
            r1.addProperty((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "network_metered"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r2, (java.lang.Number) r5)     // Catch:{ all -> 0x040c }
        L_0x026b:
            java.lang.String r2 = "locale"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x040c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "language"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x040c }
            java.lang.String r5 = r5.getLanguage()     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "time_zone"
            java.util.TimeZone r5 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x040c }
            java.lang.String r5 = r5.getID()     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ all -> 0x040c }
            android.content.Context r2 = r12.context     // Catch:{ all -> 0x040c }
            java.lang.String r5 = "audio"
            java.lang.Object r2 = r2.getSystemService(r5)     // Catch:{ all -> 0x040c }
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch:{ all -> 0x040c }
            if (r2 == 0) goto L_0x02c0
            int r5 = r2.getStreamMaxVolume(r7)     // Catch:{ all -> 0x040c }
            int r2 = r2.getStreamVolume(r7)     // Catch:{ all -> 0x040c }
            float r7 = (float) r2     // Catch:{ all -> 0x040c }
            float r5 = (float) r5     // Catch:{ all -> 0x040c }
            float r7 = r7 / r5
            java.lang.String r5 = "volume_level"
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r5, (java.lang.Number) r7)     // Catch:{ all -> 0x040c }
            java.lang.String r5 = "sound_enabled"
            if (r2 <= 0) goto L_0x02b8
            r2 = r4
            goto L_0x02b9
        L_0x02b8:
            r2 = r3
        L_0x02b9:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r5, (java.lang.Number) r2)     // Catch:{ all -> 0x040c }
        L_0x02c0:
            com.vungle.warren.persistence.CacheManager r2 = r12.cacheManager     // Catch:{ all -> 0x040c }
            java.io.File r2 = r2.getCache()     // Catch:{ all -> 0x040c }
            r2.getPath()     // Catch:{ all -> 0x040c }
            boolean r5 = r2.exists()     // Catch:{ all -> 0x040c }
            if (r5 == 0) goto L_0x02e4
            boolean r2 = r2.isDirectory()     // Catch:{ all -> 0x040c }
            if (r2 == 0) goto L_0x02e4
            java.lang.String r2 = "storage_bytes_available"
            com.vungle.warren.persistence.CacheManager r5 = r12.cacheManager     // Catch:{ all -> 0x040c }
            long r7 = r5.getBytesAvailable()     // Catch:{ all -> 0x040c }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r2, (java.lang.Number) r5)     // Catch:{ all -> 0x040c }
        L_0x02e4:
            java.lang.String r2 = "Amazon"
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x040c }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x040c }
            if (r2 == 0) goto L_0x02ff
            android.content.Context r13 = r12.context     // Catch:{ all -> 0x040c }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ all -> 0x040c }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "amazon.hardware.fire_tv"
            boolean r13 = r13.hasSystemFeature(r2)     // Catch:{ all -> 0x040c }
            goto L_0x033e
        L_0x02ff:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x040c }
            r5 = 23
            if (r2 < r5) goto L_0x0319
            android.content.Context r2 = r12.context     // Catch:{ all -> 0x040c }
            java.lang.String r5 = "uimode"
            java.lang.Object r2 = r2.getSystemService(r5)     // Catch:{ all -> 0x040c }
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2     // Catch:{ all -> 0x040c }
            int r2 = r2.getCurrentModeType()     // Catch:{ all -> 0x040c }
            if (r2 != r13) goto L_0x0317
        L_0x0315:
            r13 = r4
            goto L_0x033e
        L_0x0317:
            r13 = r3
            goto L_0x033e
        L_0x0319:
            android.content.Context r13 = r12.context     // Catch:{ all -> 0x040c }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ all -> 0x040c }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "com.google.android.tv"
            boolean r13 = r13.hasSystemFeature(r2)     // Catch:{ all -> 0x040c }
            if (r13 != 0) goto L_0x0315
            android.content.Context r13 = r12.context     // Catch:{ all -> 0x040c }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ all -> 0x040c }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "android.hardware.touchscreen"
            boolean r13 = r13.hasSystemFeature(r2)     // Catch:{ all -> 0x040c }
            if (r13 != 0) goto L_0x0317
            goto L_0x0315
        L_0x033e:
            java.lang.String r2 = "is_tv"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r2, (java.lang.Boolean) r13)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "os_api_level"
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x040c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r13, (java.lang.Number) r2)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "app_target_sdk_version"
            android.content.Context r2 = r12.context     // Catch:{ all -> 0x040c }
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch:{ all -> 0x040c }
            int r2 = r2.targetSdkVersion     // Catch:{ all -> 0x040c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r13, (java.lang.Number) r2)     // Catch:{ all -> 0x040c }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x040c }
            if (r13 < r6) goto L_0x0378
            java.lang.String r13 = "app_min_sdk_version"
            android.content.Context r2 = r12.context     // Catch:{ all -> 0x040c }
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch:{ all -> 0x040c }
            int r2 = r2.minSdkVersion     // Catch:{ all -> 0x040c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r13, (java.lang.Number) r2)     // Catch:{ all -> 0x040c }
        L_0x0378:
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ SettingNotFoundException -> 0x03a7 }
            r2 = 26
            if (r13 < r2) goto L_0x0397
            android.content.Context r13 = r12.context     // Catch:{ SettingNotFoundException -> 0x03a7 }
            java.lang.String r2 = "android.permission.REQUEST_INSTALL_PACKAGES"
            int r13 = r13.checkCallingOrSelfPermission(r2)     // Catch:{ SettingNotFoundException -> 0x03a7 }
            if (r13 != 0) goto L_0x03af
            android.content.Context r13 = r12.context     // Catch:{ SettingNotFoundException -> 0x03a7 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ SettingNotFoundException -> 0x03a7 }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ SettingNotFoundException -> 0x03a7 }
            boolean r13 = r13.canRequestPackageInstalls()     // Catch:{ SettingNotFoundException -> 0x03a7 }
            goto L_0x03b0
        L_0x0397:
            android.content.Context r13 = r12.context     // Catch:{ SettingNotFoundException -> 0x03a7 }
            android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x03a7 }
            java.lang.String r2 = "install_non_market_apps"
            int r13 = android.provider.Settings.Secure.getInt(r13, r2)     // Catch:{ SettingNotFoundException -> 0x03a7 }
            if (r13 != r4) goto L_0x03af
            r13 = r4
            goto L_0x03b0
        L_0x03a7:
            r13 = move-exception
            java.lang.String r2 = TAG     // Catch:{ all -> 0x040c }
            java.lang.String r5 = "isInstallNonMarketAppsEnabled Settings not found"
            android.util.Log.e(r2, r5, r13)     // Catch:{ all -> 0x040c }
        L_0x03af:
            r13 = r3
        L_0x03b0:
            java.lang.String r2 = "is_sideload_enabled"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r2, (java.lang.Boolean) r13)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = android.os.Environment.getExternalStorageState()     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "mounted"
            boolean r13 = r13.equals(r2)     // Catch:{ all -> 0x040c }
            java.lang.String r2 = "sd_card_available"
            if (r13 == 0) goto L_0x03c8
            r3 = r4
        L_0x03c8:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r2, (java.lang.Number) r13)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "os_name"
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x040c }
            r1.addProperty((java.lang.String) r13, (java.lang.String) r2)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "vduid"
            java.lang.String r2 = ""
            r1.addProperty((java.lang.String) r13, (java.lang.String) r2)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "ua"
            java.lang.String r2 = r12.uaString     // Catch:{ all -> 0x040c }
            r0.addProperty((java.lang.String) r13, (java.lang.String) r2)     // Catch:{ all -> 0x040c }
            com.google.gson.JsonObject r13 = new com.google.gson.JsonObject     // Catch:{ all -> 0x040c }
            r13.<init>()     // Catch:{ all -> 0x040c }
            com.google.gson.JsonObject r2 = new com.google.gson.JsonObject     // Catch:{ all -> 0x040c }
            r2.<init>()     // Catch:{ all -> 0x040c }
            java.lang.String r3 = "vungle"
            r13.add(r3, r2)     // Catch:{ all -> 0x040c }
            java.lang.String r3 = "ext"
            r0.add(r3, r13)     // Catch:{ all -> 0x040c }
            java.lang.String r13 = "Amazon"
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x040c }
            boolean r13 = r13.equals(r3)     // Catch:{ all -> 0x040c }
            if (r13 == 0) goto L_0x0405
            java.lang.String r13 = "amazon"
            goto L_0x0407
        L_0x0405:
            java.lang.String r13 = "android"
        L_0x0407:
            r2.add(r13, r1)     // Catch:{ all -> 0x040c }
            monitor-exit(r12)
            return r0
        L_0x040c:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.VungleApiClient.getDeviceBody(boolean):com.google.gson.JsonObject");
    }

    private JsonObject getUserBody() {
        long j;
        String str;
        String str2;
        String str3;
        JsonObject jsonObject = new JsonObject();
        Cookie cookie = this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        String str4 = "";
        if (cookie != null) {
            str2 = cookie.getString("consent_status");
            str = cookie.getString("consent_source");
            j = cookie.getLong("timestamp").longValue();
            str3 = cookie.getString("consent_message_version");
        } else {
            j = 0;
            str2 = "unknown";
            str = "no_interaction";
            str3 = str4;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("consent_status", str2);
        jsonObject2.addProperty("consent_source", str);
        jsonObject2.addProperty("consent_timestamp", (Number) Long.valueOf(j));
        if (!TextUtils.isEmpty(str3)) {
            str4 = str3;
        }
        jsonObject2.addProperty("consent_message_version", str4);
        jsonObject.add("gdpr", jsonObject2);
        Cookie cookie2 = this.repository.load(Cookie.CCPA_COOKIE, Cookie.class).get();
        String string = cookie2 != null ? cookie2.getString(Cookie.CCPA_CONSENT_STATUS) : "opted_in";
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("status", string);
        jsonObject.add("ccpa", jsonObject3);
        if (PrivacyManager.getInstance().getCoppaStatus() != PrivacyManager.COPPA.COPPA_NOTSET) {
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty(Cookie.COPPA_STATUS_KEY, Boolean.valueOf(PrivacyManager.getInstance().getCoppaStatus().getValue()));
            jsonObject.add(Cookie.COPPA_KEY, jsonObject4);
        }
        return jsonObject;
    }

    public boolean getOmEnabled() {
        return this.enableOm;
    }

    private String getUserAgentFromCookie() {
        Cookie cookie = this.repository.load("userAgent", Cookie.class).get();
        if (cookie == null) {
            return System.getProperty("http.agent");
        }
        String string = cookie.getString("userAgent");
        return TextUtils.isEmpty(string) ? System.getProperty("http.agent") : string;
    }

    private void updateAppSetID() {
        try {
            AppSet.getClient(this.context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() {
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    if (appSetIdInfo != null) {
                        String unused = VungleApiClient.this.appSetId = appSetIdInfo.getId();
                        if (!TextUtils.isEmpty(VungleApiClient.this.appSetId)) {
                            Cookie cookie = new Cookie(Cookie.APP_SET_ID_COOKIE);
                            cookie.putValue(Cookie.APP_SET_ID, VungleApiClient.this.appSetId);
                            try {
                                VungleApiClient.this.repository.save(cookie);
                            } catch (DatabaseHelper.DBException e) {
                                String access$100 = VungleApiClient.TAG;
                                Log.e(access$100, "error saving AppSetId in Cookie: " + e.getLocalizedMessage());
                            }
                        }
                    }
                }
            });
        } catch (NoClassDefFoundError e) {
            String str = TAG;
            Log.e(str, "Required libs to get AppSetID Not available: " + e.getLocalizedMessage());
        }
    }

    private String getAppSetId() {
        if (TextUtils.isEmpty(this.appSetId)) {
            Cookie cookie = this.repository.load(Cookie.APP_SET_ID_COOKIE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
            this.appSetId = cookie != null ? cookie.getString(Cookie.APP_SET_ID) : null;
        }
        return this.appSetId;
    }

    public long getRetryAfterHeaderValue(com.vungle.warren.network.Response response) {
        try {
            return Long.parseLong(response.headers().get(HttpHeaders.RETRY_AFTER)) * 1000;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static class ClearTextTrafficException extends IOException {
        ClearTextTrafficException(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void overrideApi(VungleApi vungleApi) {
        this.api = vungleApi;
    }

    public Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    /* access modifiers changed from: package-private */
    public Boolean getPlayServicesAvailabilityFromCookie() {
        Cookie cookie = this.repository.load(Cookie.IS_PLAY_SERVICE_AVAILABLE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (cookie != null) {
            return cookie.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Boolean getPlayServicesAvailabilityFromAPI() {
        try {
            GoogleApiAvailabilityLight instance = GoogleApiAvailabilityLight.getInstance();
            if (instance == null) {
                return null;
            }
            Boolean valueOf = Boolean.valueOf(instance.isGooglePlayServicesAvailable(this.context) == 0);
            addPlaySvcAvailabilityInCookie(valueOf.booleanValue());
            return valueOf;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Play services Not available");
            Boolean bool = false;
            try {
                addPlaySvcAvailabilityInCookie(bool.booleanValue());
                return bool;
            } catch (DatabaseHelper.DBException unused2) {
                Log.w(TAG, "Failure to write GPS availability to DB");
                return bool;
            }
        } catch (Exception unused3) {
            Log.w(TAG, "Unexpected exception from Play services lib.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void addPlaySvcAvailabilityInCookie(boolean z) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(Cookie.IS_PLAY_SERVICE_AVAILABLE);
        cookie.putValue(Cookie.IS_PLAY_SERVICE_AVAILABLE, Boolean.valueOf(z));
        this.repository.save(cookie);
    }

    private JsonObject getExtBody() {
        Cookie cookie = this.repository.load(Cookie.CONFIG_EXTENSION, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        String string = cookie != null ? cookie.getString(Cookie.CONFIG_EXTENSION) : "";
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(Cookie.CONFIG_EXTENSION, string);
        return jsonObject;
    }
}
