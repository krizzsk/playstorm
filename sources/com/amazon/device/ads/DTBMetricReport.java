package com.amazon.device.ads;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class DTBMetricReport {
    private static final String ADAPTER_VERSION = "adapter_version";
    private static final String ADSERVER = "mediation";
    private static final String APP_NAME = "app_id";
    private static final String CONNECTION = "connection";
    private static final String LATENCY = "latency";
    private static final String LOG_TAG = DTBMetricReport.class.getSimpleName();
    private static final String PROJECT = "project";
    private static final String PROJECT_NAME = "aps_mobile";
    private static final String SDK = "sdk";
    private static final String TIME = "time";
    private static final String TYPE = "type";
    private BidWrapper bidWrapper;
    private int latency;
    private JSONObject propertiesMap;
    private String type;

    protected static class BidWrapper {
        String bidId;
        String hostname;

        BidWrapper(String str, String str2) {
            this.bidId = str;
            this.hostname = str2;
        }
    }

    private DTBMetricReport(String str, BidWrapper bidWrapper2, int i) {
        this.latency = -1;
        this.bidWrapper = bidWrapper2;
        this.latency = i;
        setStandardProperties(str);
    }

    private DTBMetricReport(String str, BidWrapper bidWrapper2) {
        this.latency = -1;
        this.bidWrapper = bidWrapper2;
        setStandardProperties(str);
    }

    private DTBMetricReport(String str, Map<String, Object> map) {
        this.latency = -1;
        setStandardProperties(str);
        addExtraProperties(map);
    }

    private DTBMetricReport(String str, Map<String, Object> map, BidWrapper bidWrapper2) {
        this(str, map);
        this.bidWrapper = bidWrapper2;
    }

    /* access modifiers changed from: package-private */
    public String getBidId() {
        BidWrapper bidWrapper2 = this.bidWrapper;
        if (bidWrapper2 == null) {
            return null;
        }
        return bidWrapper2.bidId;
    }

    /* access modifiers changed from: package-private */
    public String getHostname() {
        BidWrapper bidWrapper2 = this.bidWrapper;
        if (bidWrapper2 == null) {
            return null;
        }
        return bidWrapper2.hostname;
    }

    static BidWrapper addBid(String str, String str2) {
        return new BidWrapper(str, str2);
    }

    private void addExtraProperties(Map<String, Object> map) {
        try {
            for (String next : map.keySet()) {
                Object obj = map.get(next);
                if (obj instanceof String) {
                    this.propertiesMap.put(next, obj);
                } else if (obj instanceof Integer) {
                    this.propertiesMap.put(next, obj);
                } else if (obj instanceof Long) {
                    this.propertiesMap.put(next, obj);
                } else if (obj instanceof Boolean) {
                    this.propertiesMap.put(next, obj);
                }
            }
        } catch (JSONException e) {
            String str = LOG_TAG;
            DtbLog.error(str, "Invalid JSON conversion:" + e.getMessage());
        }
    }

    static DTBMetricReport reportWithBidTypeLatency(BidWrapper bidWrapper2, String str, int i) {
        return new DTBMetricReport(str, bidWrapper2, i);
    }

    static DTBMetricReport reportWithBidIdAndType(BidWrapper bidWrapper2, String str) {
        return new DTBMetricReport(str, bidWrapper2);
    }

    static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map) {
        return new DTBMetricReport(str, map);
    }

    static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map, BidWrapper bidWrapper2) {
        return new DTBMetricReport(str, map, bidWrapper2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071 A[Catch:{ Exception -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[SYNTHETIC, Splitter:B:25:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d A[Catch:{ JSONException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090 A[Catch:{ JSONException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6 A[Catch:{ JSONException -> 0x00c1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setStandardProperties(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "getVersion"
            r5.type = r6
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r5.propertiesMap = r1
            java.lang.String r2 = "type"
            r1.put(r2, r6)     // Catch:{ JSONException -> 0x00c1 }
            org.json.JSONObject r6 = r5.propertiesMap     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "9.5.0"
            r6.put(r1, r2)     // Catch:{ JSONException -> 0x00c1 }
            org.json.JSONObject r6 = r5.propertiesMap     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r1 = "app_id"
            java.lang.String r2 = com.amazon.device.ads.AdRegistration.getAppKey()     // Catch:{ JSONException -> 0x00c1 }
            r6.put(r1, r2)     // Catch:{ JSONException -> 0x00c1 }
            org.json.JSONObject r6 = r5.propertiesMap     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r1 = "project"
            java.lang.String r2 = "aps_mobile"
            r6.put(r1, r2)     // Catch:{ JSONException -> 0x00c1 }
            int r6 = r5.latency     // Catch:{ JSONException -> 0x00c1 }
            if (r6 <= 0) goto L_0x003a
            org.json.JSONObject r6 = r5.propertiesMap     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r1 = "latency"
            int r2 = r5.latency     // Catch:{ JSONException -> 0x00c1 }
            r6.put(r1, r2)     // Catch:{ JSONException -> 0x00c1 }
        L_0x003a:
            r6 = 0
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ JSONException -> 0x00c1 }
            r1 = 0
            java.lang.String r2 = "com.amazon.admob_adapter.APSAdMobAdapter"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0059 }
            java.lang.String r3 = "admob"
            java.lang.reflect.Method r2 = r2.getMethod(r0, r6)     // Catch:{ Exception -> 0x005a }
            r4 = r1
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch:{ Exception -> 0x005a }
            java.lang.Object r2 = r2.invoke(r1, r4)     // Catch:{ Exception -> 0x005a }
            boolean r4 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0074
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x005a }
            r1 = r2
            goto L_0x0074
        L_0x0059:
            r3 = r1
        L_0x005a:
            java.lang.String r2 = "com.amazon.mopub_adapter.APSMopubAdapter"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r3 = "mopub"
            java.lang.reflect.Method r6 = r2.getMethod(r0, r6)     // Catch:{ Exception -> 0x0074 }
            r0 = r1
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r6 = r6.invoke(r1, r0)     // Catch:{ Exception -> 0x0074 }
            boolean r0 = r6 instanceof java.lang.String     // Catch:{ Exception -> 0x0074 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0074 }
            r1 = r6
        L_0x0074:
            if (r3 == 0) goto L_0x007d
            org.json.JSONObject r6 = r5.propertiesMap     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r0 = "mediation"
            r6.put(r0, r3)     // Catch:{ JSONException -> 0x00c1 }
        L_0x007d:
            com.amazon.device.ads.DtbDeviceData r6 = com.amazon.device.ads.DtbDeviceData.getDeviceDataInstance()     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r6 = r6.getConnectionType()     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r0 = "Wifi"
            boolean r0 = r6.equals(r0)     // Catch:{ JSONException -> 0x00c1 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r6 = "wifi"
            goto L_0x009d
        L_0x0090:
            java.lang.String r0 = "0"
            boolean r6 = r6.equals(r0)     // Catch:{ JSONException -> 0x00c1 }
            if (r6 == 0) goto L_0x009b
            java.lang.String r6 = "unknown"
            goto L_0x009d
        L_0x009b:
            java.lang.String r6 = "cellular"
        L_0x009d:
            org.json.JSONObject r0 = r5.propertiesMap     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r2 = "connection"
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x00c1 }
            if (r1 == 0) goto L_0x00ad
            org.json.JSONObject r6 = r5.propertiesMap     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r0 = "adapter_version"
            r6.put(r0, r1)     // Catch:{ JSONException -> 0x00c1 }
        L_0x00ad:
            org.json.JSONObject r6 = r5.propertiesMap     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r0 = "time"
            java.util.Date r1 = new java.util.Date     // Catch:{ JSONException -> 0x00c1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00c1 }
            long r1 = r1.getTime()     // Catch:{ JSONException -> 0x00c1 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r6.put(r0, r1)     // Catch:{ JSONException -> 0x00c1 }
            goto L_0x00dc
        L_0x00c1:
            r6 = move-exception
            java.lang.String r0 = LOG_TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JSON conversion error:"
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.amazon.device.ads.DtbLog.warn(r0, r6)
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBMetricReport.setStandardProperties(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public String getType() {
        return this.type;
    }

    /* access modifiers changed from: package-private */
    public String toEncodedString() throws UnsupportedEncodingException {
        return URLEncoder.encode(this.propertiesMap.toString(), "UTF-8");
    }

    public String toString() {
        return this.propertiesMap.toString();
    }
}
