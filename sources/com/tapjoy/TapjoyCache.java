package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TapjoyCache {
    public static final String CACHE_DIRECTORY_NAME = "Tapjoy/Cache/";
    public static final int CACHE_LIMIT = -1;

    /* renamed from: a */
    private static TapjoyCache f27490a = null;
    public static boolean unit_test_mode = false;

    /* renamed from: b */
    private Context f27491b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TapjoyCacheMap f27492c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Vector<String> f27493d;

    /* renamed from: e */
    private ExecutorService f27494e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public File f27495f;

    public TapjoyCache(Context context) {
        if (f27490a == null || unit_test_mode) {
            f27490a = this;
            this.f27491b = context;
            this.f27492c = new TapjoyCacheMap(context, -1);
            this.f27493d = new Vector<>();
            this.f27494e = Executors.newFixedThreadPool(5);
            if (Environment.getExternalStorageDirectory() != null) {
                TapjoyUtil.deleteFileOrDirectory(new File(Environment.getExternalStorageDirectory(), "tapjoy"));
                TapjoyUtil.deleteFileOrDirectory(new File(Environment.getExternalStorageDirectory(), "tjcache/tmp/"));
            }
            File file = new File(this.f27491b.getFilesDir() + "/Tapjoy/Cache/");
            this.f27495f = file;
            if (!file.exists()) {
                if (this.f27495f.mkdirs()) {
                    TapjoyLog.m33194d("TapjoyCache", "Created directory at: " + this.f27495f.getPath());
                } else {
                    TapjoyLog.m33196e("TapjoyCache", "Error initalizing cache");
                    f27490a = null;
                }
            }
            m33133a();
        }
    }

    /* renamed from: a */
    private void m33133a() {
        SharedPreferences sharedPreferences = this.f27491b.getSharedPreferences(TapjoyConstants.PREF_TAPJOY_CACHE, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
            File file = new File((String) next.getKey());
            if (!file.exists() || !file.isFile()) {
                TapjoyLog.m33194d("TapjoyCache", "Removing reference to missing asset: " + ((String) next.getKey()));
                edit.remove((String) next.getKey()).apply();
            } else {
                TapjoyCachedAssetData fromRawJSONString = TapjoyCachedAssetData.fromRawJSONString(next.getValue().toString());
                if (fromRawJSONString != null) {
                    TapjoyLog.m33194d("TapjoyCache", "Loaded Asset: " + fromRawJSONString.getAssetURL());
                    String b = m33135b(fromRawJSONString.getAssetURL());
                    if (b == null || "".equals(b) || b.length() <= 0) {
                        TapjoyLog.m33196e("TapjoyCache", "Removing asset because deserialization failed.");
                        edit.remove((String) next.getKey()).apply();
                    } else if (fromRawJSONString.getTimeOfDeathInSeconds() < System.currentTimeMillis() / 1000) {
                        TapjoyLog.m33194d("TapjoyCache", "Asset expired, removing from cache: " + fromRawJSONString.getAssetURL());
                        if (fromRawJSONString.getLocalFilePath() != null && fromRawJSONString.getLocalFilePath().length() > 0) {
                            TapjoyUtil.deleteFileOrDirectory(new File(fromRawJSONString.getLocalFilePath()));
                        }
                    } else {
                        this.f27492c.put(b, fromRawJSONString);
                    }
                } else {
                    TapjoyLog.m33196e("TapjoyCache", "Removing asset because deserialization failed.");
                    edit.remove((String) next.getKey()).apply();
                }
            }
        }
    }

    public void cacheAssetGroup(final JSONArray jSONArray, final TJCacheListener tJCacheListener) {
        if (jSONArray != null && jSONArray.length() > 0) {
            new Thread() {
                public final void run() {
                    TapjoyLog.m33194d("TapjoyCache", "Starting to cache asset group size of " + jSONArray.length());
                    ArrayList<Future> arrayList = new ArrayList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            Future<Boolean> cacheAssetFromJSONObject = TapjoyCache.this.cacheAssetFromJSONObject(jSONArray.getJSONObject(i));
                            if (cacheAssetFromJSONObject != null) {
                                arrayList.add(cacheAssetFromJSONObject);
                            }
                        } catch (JSONException unused) {
                            TapjoyLog.m33196e("TapjoyCache", "Failed to load JSON object from JSONArray");
                        }
                    }
                    int i2 = 1;
                    for (Future future : arrayList) {
                        try {
                            if (((Boolean) future.get()).booleanValue()) {
                            }
                        } catch (InterruptedException e) {
                            TapjoyLog.m33196e("TapjoyCache", "Caching thread failed: " + e.toString());
                        } catch (ExecutionException e2) {
                            TapjoyLog.m33196e("TapjoyCache", "Caching thread failed: " + e2.toString());
                        }
                        i2 = 2;
                    }
                    TapjoyLog.m33194d("TapjoyCache", "Finished caching group");
                    TJCacheListener tJCacheListener = tJCacheListener;
                    if (tJCacheListener != null) {
                        tJCacheListener.onCachingComplete(i2);
                    }
                }
            }.start();
        } else if (tJCacheListener != null) {
            tJCacheListener.onCachingComplete(1);
        }
    }

    public Future<Boolean> cacheAssetFromJSONObject(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("url");
            Long.valueOf(86400);
            return cacheAssetFromURL(string, jSONObject.optString(TapjoyConstants.TJC_PLACEMENT_OFFER_ID), Long.valueOf(jSONObject.optLong(TapjoyConstants.TJC_TIME_TO_LIVE)).longValue());
        } catch (JSONException unused) {
            TapjoyLog.m33196e("TapjoyCache", "Required parameters to cache an asset from JSON is not present");
            return null;
        }
    }

    public Future<Boolean> cacheAssetFromURL(String str, String str2, long j) {
        try {
            URL url = new URL(str);
            if (!this.f27493d.contains(m33135b(str))) {
                return startCachingThread(url, str2, j);
            }
            TapjoyLog.m33194d("TapjoyCache", "URL is already in the process of being cached: ".concat(String.valueOf(str)));
            return null;
        } catch (MalformedURLException unused) {
            TapjoyLog.m33194d("TapjoyCache", "Invalid cache assetURL");
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m33135b(String str) {
        if (str.startsWith("//")) {
            str = "http:".concat(String.valueOf(str));
        }
        try {
            return new URL(str).getFile();
        } catch (MalformedURLException unused) {
            TapjoyLog.m33196e("TapjoyCache", "Invalid URL ".concat(String.valueOf(str)));
            return "";
        }
    }

    public Future<Boolean> startCachingThread(URL url, String str, long j) {
        if (url != null) {
            return this.f27494e.submit(new CacheAssetThread(url, str, j));
        }
        return null;
    }

    public void clearTapjoyCache() {
        TapjoyLog.m33194d("TapjoyCache", "Cleaning Tapjoy cache!");
        TapjoyUtil.deleteFileOrDirectory(this.f27495f);
        if (this.f27495f.mkdirs()) {
            TapjoyLog.m33194d("TapjoyCache", "Created new cache directory at: " + this.f27495f.getPath());
        }
        this.f27492c = new TapjoyCacheMap(this.f27491b, -1);
    }

    public boolean removeAssetFromCache(String str) {
        String b = m33135b(str);
        return (b == "" || this.f27492c.remove((Object) b) == null) ? false : true;
    }

    public boolean isURLDownloading(String str) {
        String b;
        if (this.f27493d == null || (b = m33135b(str)) == "" || !this.f27493d.contains(b)) {
            return false;
        }
        return true;
    }

    public boolean isURLCached(String str) {
        return this.f27492c.get(m33135b(str)) != null;
    }

    public TapjoyCachedAssetData getCachedDataForURL(String str) {
        String b = m33135b(str);
        if (b != "") {
            return (TapjoyCachedAssetData) this.f27492c.get(b);
        }
        return null;
    }

    public TapjoyCacheMap getCachedData() {
        return this.f27492c;
    }

    public String getPathOfCachedURL(String str) {
        String b = m33135b(str);
        if (b == "" || !this.f27492c.containsKey(b)) {
            return str;
        }
        TapjoyCachedAssetData tapjoyCachedAssetData = (TapjoyCachedAssetData) this.f27492c.get(b);
        if (new File(tapjoyCachedAssetData.getLocalFilePath()).exists()) {
            return tapjoyCachedAssetData.getLocalURL();
        }
        getInstance().removeAssetFromCache(str);
        return str;
    }

    public String cachedAssetsToJSON() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.f27492c.entrySet()) {
            try {
                jSONObject.put(((String) entry.getKey()).toString(), ((TapjoyCachedAssetData) entry.getValue()).toRawJSONString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public String getCachedOfferIDs() {
        ArrayList arrayList = new ArrayList();
        TapjoyCacheMap tapjoyCacheMap = this.f27492c;
        if (tapjoyCacheMap == null) {
            return "";
        }
        for (Map.Entry value : tapjoyCacheMap.entrySet()) {
            String offerId = ((TapjoyCachedAssetData) value.getValue()).getOfferId();
            if (!(offerId == null || offerId.length() == 0 || arrayList.contains(offerId))) {
                arrayList.add(offerId);
            }
        }
        return TextUtils.join(",", arrayList);
    }

    public void printCacheInformation() {
        TapjoyLog.m33194d("TapjoyCache", "------------- Cache Data -------------");
        TapjoyLog.m33194d("TapjoyCache", "Number of files in cache: " + this.f27492c.size());
        TapjoyLog.m33194d("TapjoyCache", "Cache Size: " + TapjoyUtil.fileOrDirectorySize(this.f27495f));
        TapjoyLog.m33194d("TapjoyCache", "--------------------------------------");
    }

    public static TapjoyCache getInstance() {
        return f27490a;
    }

    public static void setInstance(TapjoyCache tapjoyCache) {
        f27490a = tapjoyCache;
    }

    public class CacheAssetThread implements Callable<Boolean> {

        /* renamed from: b */
        private URL f27500b;

        /* renamed from: c */
        private String f27501c;

        /* renamed from: d */
        private long f27502d;

        public CacheAssetThread(URL url, String str, long j) {
            this.f27500b = url;
            this.f27501c = str;
            this.f27502d = j;
            if (j <= 0) {
                this.f27502d = 86400;
            }
            TapjoyCache.this.f27493d.add(TapjoyCache.m33135b(this.f27500b.toString()));
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(10:26|27|28|29|30|31|32|(1:35)|36|37) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0117 */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01a4 A[SYNTHETIC, Splitter:B:57:0x01a4] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01a9 A[SYNTHETIC, Splitter:B:61:0x01a9] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01dc A[SYNTHETIC, Splitter:B:70:0x01dc] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01e1 A[SYNTHETIC, Splitter:B:74:0x01e1] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01e8 A[SYNTHETIC, Splitter:B:80:0x01e8] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01ed A[SYNTHETIC, Splitter:B:84:0x01ed] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x01b0=Splitter:B:67:0x01b0, B:54:0x017f=Splitter:B:54:0x017f} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean call() {
            /*
                r11 = this;
                java.net.URL r0 = r11.f27500b
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = com.tapjoy.TapjoyCache.m33135b((java.lang.String) r0)
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r1 = r1.f27492c
                boolean r1 = r1.containsKey(r0)
                java.lang.String r2 = "TapjoyCache"
                if (r1 == 0) goto L_0x0089
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r1 = r1.f27492c
                java.lang.Object r1 = r1.get(r0)
                com.tapjoy.TapjoyCachedAssetData r1 = (com.tapjoy.TapjoyCachedAssetData) r1
                java.io.File r3 = new java.io.File
                java.lang.String r1 = r1.getLocalFilePath()
                r3.<init>(r1)
                boolean r1 = r3.exists()
                if (r1 == 0) goto L_0x0082
                long r3 = r11.f27502d
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x004d
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r1 = r1.f27492c
                java.lang.Object r1 = r1.get(r0)
                com.tapjoy.TapjoyCachedAssetData r1 = (com.tapjoy.TapjoyCachedAssetData) r1
                long r3 = r11.f27502d
                r1.resetTimeToLive(r3)
                goto L_0x005f
            L_0x004d:
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r1 = r1.f27492c
                java.lang.Object r1 = r1.get(r0)
                com.tapjoy.TapjoyCachedAssetData r1 = (com.tapjoy.TapjoyCachedAssetData) r1
                r3 = 86400(0x15180, double:4.26873E-319)
                r1.resetTimeToLive(r3)
            L_0x005f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Reseting time to live for "
                r1.<init>(r3)
                java.net.URL r3 = r11.f27500b
                java.lang.String r3 = r3.toString()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tapjoy.TapjoyLog.m33194d(r2, r1)
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                java.util.Vector r1 = r1.f27493d
                r1.remove(r0)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
            L_0x0082:
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.getInstance()
                r1.removeAssetFromCache(r0)
            L_0x0089:
                java.lang.System.currentTimeMillis()
                java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x01f1 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f1 }
                r3.<init>()     // Catch:{ Exception -> 0x01f1 }
                com.tapjoy.TapjoyCache r4 = com.tapjoy.TapjoyCache.this     // Catch:{ Exception -> 0x01f1 }
                java.io.File r4 = r4.f27495f     // Catch:{ Exception -> 0x01f1 }
                r3.append(r4)     // Catch:{ Exception -> 0x01f1 }
                java.lang.String r4 = "/"
                r3.append(r4)     // Catch:{ Exception -> 0x01f1 }
                java.lang.String r4 = com.tapjoy.TapjoyUtil.SHA256(r0)     // Catch:{ Exception -> 0x01f1 }
                r3.append(r4)     // Catch:{ Exception -> 0x01f1 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01f1 }
                r1.<init>(r3)     // Catch:{ Exception -> 0x01f1 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Downloading and caching asset from: "
                r3.<init>(r4)
                java.net.URL r4 = r11.f27500b
                r3.append(r4)
                java.lang.String r4 = " to "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                com.tapjoy.TapjoyLog.m33194d(r2, r3)
                r3 = 0
                java.net.URL r4 = r11.f27500b     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                java.net.URLConnection r4 = com.tapjoy.internal.C11631fl.m33789a(r4)     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                r5 = 15000(0x3a98, float:2.102E-41)
                r4.setConnectTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                r5 = 30000(0x7530, float:4.2039E-41)
                r4.setReadTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                r4.connect()     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                if (r5 == 0) goto L_0x00fe
                r5 = r4
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                int r5 = r5.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r5 != r6) goto L_0x00ee
                goto L_0x00fe
            L_0x00ee:
                java.io.IOException r4 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                java.lang.String r6 = "Unexpected response code: "
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                java.lang.String r5 = r6.concat(r5)     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                r4.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                throw r4     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
            L_0x00fe:
                java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                java.io.InputStream r4 = r4.getInputStream()     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                r5.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x01ad, Exception -> 0x017c, all -> 0x0179 }
                java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ SocketTimeoutException -> 0x0173, Exception -> 0x016d, all -> 0x0168 }
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x0173, Exception -> 0x016d, all -> 0x0168 }
                r6.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x0173, Exception -> 0x016d, all -> 0x0168 }
                r4.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x0173, Exception -> 0x016d, all -> 0x0168 }
                com.tapjoy.TapjoyUtil.writeFileToDevice(r5, r4)     // Catch:{ SocketTimeoutException -> 0x0163, Exception -> 0x015e, all -> 0x015c }
                r5.close()     // Catch:{ IOException -> 0x0117 }
            L_0x0117:
                r4.close()     // Catch:{ IOException -> 0x011a }
            L_0x011a:
                com.tapjoy.TapjoyCachedAssetData r3 = new com.tapjoy.TapjoyCachedAssetData
                java.net.URL r4 = r11.f27500b
                java.lang.String r4 = r4.toString()
                java.lang.String r1 = r1.getAbsolutePath()
                long r5 = r11.f27502d
                r3.<init>(r4, r1, r5)
                java.lang.String r1 = r11.f27501c
                if (r1 == 0) goto L_0x0132
                r3.setOfferID(r1)
            L_0x0132:
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r1 = r1.f27492c
                r1.put((java.lang.String) r0, (com.tapjoy.TapjoyCachedAssetData) r3)
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                java.util.Vector r1 = r1.f27493d
                r1.remove(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "----- Download complete -----"
                r0.<init>(r1)
                java.lang.String r1 = r3.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tapjoy.TapjoyLog.m33194d(r2, r0)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
            L_0x015c:
                r0 = move-exception
                goto L_0x016a
            L_0x015e:
                r3 = move-exception
                r10 = r5
                r5 = r3
                r3 = r10
                goto L_0x017f
            L_0x0163:
                r3 = move-exception
                r10 = r5
                r5 = r3
                r3 = r10
                goto L_0x01b0
            L_0x0168:
                r0 = move-exception
                r4 = r3
            L_0x016a:
                r3 = r5
                goto L_0x01e6
            L_0x016d:
                r4 = move-exception
                r10 = r4
                r4 = r3
                r3 = r5
                r5 = r10
                goto L_0x017f
            L_0x0173:
                r4 = move-exception
                r10 = r4
                r4 = r3
                r3 = r5
                r5 = r10
                goto L_0x01b0
            L_0x0179:
                r0 = move-exception
                r4 = r3
                goto L_0x01e6
            L_0x017c:
                r4 = move-exception
                r5 = r4
                r4 = r3
            L_0x017f:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
                java.lang.String r7 = "Error caching asset: "
                r6.<init>(r7)     // Catch:{ all -> 0x01e5 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01e5 }
                r6.append(r5)     // Catch:{ all -> 0x01e5 }
                java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x01e5 }
                com.tapjoy.TapjoyLog.m33196e((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ all -> 0x01e5 }
                com.tapjoy.TapjoyCache r2 = com.tapjoy.TapjoyCache.this     // Catch:{ all -> 0x01e5 }
                java.util.Vector r2 = r2.f27493d     // Catch:{ all -> 0x01e5 }
                r2.remove(r0)     // Catch:{ all -> 0x01e5 }
                com.tapjoy.TapjoyUtil.deleteFileOrDirectory(r1)     // Catch:{ all -> 0x01e5 }
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01e5 }
                if (r3 == 0) goto L_0x01a7
                r3.close()     // Catch:{ IOException -> 0x01a7 }
            L_0x01a7:
                if (r4 == 0) goto L_0x01ac
                r4.close()     // Catch:{ IOException -> 0x01ac }
            L_0x01ac:
                return r0
            L_0x01ad:
                r4 = move-exception
                r5 = r4
                r4 = r3
            L_0x01b0:
                com.tapjoy.TapjoyErrorMessage r6 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x01e5 }
                com.tapjoy.TapjoyErrorMessage$ErrorType r7 = com.tapjoy.TapjoyErrorMessage.ErrorType.NETWORK_ERROR     // Catch:{ all -> 0x01e5 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
                java.lang.String r9 = "Network timeout during caching: "
                r8.<init>(r9)     // Catch:{ all -> 0x01e5 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01e5 }
                r8.append(r5)     // Catch:{ all -> 0x01e5 }
                java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x01e5 }
                r6.<init>(r7, r5)     // Catch:{ all -> 0x01e5 }
                com.tapjoy.TapjoyLog.m33195e((java.lang.String) r2, (com.tapjoy.TapjoyErrorMessage) r6)     // Catch:{ all -> 0x01e5 }
                com.tapjoy.TapjoyCache r2 = com.tapjoy.TapjoyCache.this     // Catch:{ all -> 0x01e5 }
                java.util.Vector r2 = r2.f27493d     // Catch:{ all -> 0x01e5 }
                r2.remove(r0)     // Catch:{ all -> 0x01e5 }
                com.tapjoy.TapjoyUtil.deleteFileOrDirectory(r1)     // Catch:{ all -> 0x01e5 }
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01e5 }
                if (r3 == 0) goto L_0x01df
                r3.close()     // Catch:{ IOException -> 0x01df }
            L_0x01df:
                if (r4 == 0) goto L_0x01e4
                r4.close()     // Catch:{ IOException -> 0x01e4 }
            L_0x01e4:
                return r0
            L_0x01e5:
                r0 = move-exception
            L_0x01e6:
                if (r3 == 0) goto L_0x01eb
                r3.close()     // Catch:{ IOException -> 0x01eb }
            L_0x01eb:
                if (r4 == 0) goto L_0x01f0
                r4.close()     // Catch:{ IOException -> 0x01f0 }
            L_0x01f0:
                throw r0
            L_0x01f1:
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                java.util.Vector r1 = r1.f27493d
                r1.remove(r0)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyCache.CacheAssetThread.call():java.lang.Boolean");
        }
    }
}
