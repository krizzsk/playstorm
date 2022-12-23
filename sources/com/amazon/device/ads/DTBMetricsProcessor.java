package com.amazon.device.ads;

import com.amazon.device.ads.DTBMetricReport;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DTBMetricsProcessor {
    static String ALERT_SDK_WRAPPING = "alert_sdk_wrapping";
    static String ALERT_SDK_WRAPPING_V2 = "alert_sdk_wrapping_v2";
    static String REPORT_LOAD_FAILURE = "fetch_failure";
    static String REPORT_LOAD_LATENCY = "fetch_latency";
    static String REPORT_LOST_BID = "lost_bid";
    static String REPORT_MEDIATION_LATENCY = "mediation_latency";
    private static String SIMPLE_TAG = "DTB_Metrics";
    private static DTBMetricsProcessor theProcessor = new DTBMetricsProcessor();
    private final Object lock = new Object();
    private List<DTBMetricReport> reportQueue = new ArrayList();
    private boolean running;

    static DTBMetricsProcessor getInstance() {
        return theProcessor;
    }

    private DTBMetricsProcessor() {
    }

    private boolean isMainThread() {
        return DTBAdUtil.isMainThread();
    }

    /* access modifiers changed from: package-private */
    public void submitExpiredReport(List<DTBMetricReport.BidWrapper> list) {
        if (isMainThread()) {
            DtbThreadService.getInstance().execute(new Runnable(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    DTBMetricsProcessor.this.lambda$submitExpiredReport$0$DTBMetricsProcessor(this.f$1);
                }
            });
        } else {
            lambda$submitExpiredReport$0$DTBMetricsProcessor(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: submitExpiredReportImpl */
    public void lambda$submitExpiredReport$0$DTBMetricsProcessor(List<DTBMetricReport.BidWrapper> list) {
        for (DTBMetricReport.BidWrapper reportWithBidIdAndType : list) {
            addReport(DTBMetricReport.reportWithBidIdAndType(reportWithBidIdAndType, REPORT_LOST_BID));
        }
        dispenseReport();
    }

    /* access modifiers changed from: package-private */
    public void submitSimpleReportBidId(DTBMetricReport.BidWrapper bidWrapper, String str) {
        addReport(DTBMetricReport.reportWithBidIdAndType(bidWrapper, str));
        dispenseReport();
    }

    /* access modifiers changed from: package-private */
    public void submitErrorReport(String str, Map<String, Object> map) {
        addReport(DTBMetricReport.reportWithTypeAndExtraProperties(str, map));
        dispenseReport();
    }

    /* access modifiers changed from: package-private */
    public void submitErrorReport(String str, Map<String, Object> map, DTBMetricReport.BidWrapper bidWrapper) {
        addReport(DTBMetricReport.reportWithTypeAndExtraProperties(str, map, bidWrapper));
        dispenseReport();
    }

    /* access modifiers changed from: package-private */
    public void submitLatencyReportBidId(DTBMetricReport.BidWrapper bidWrapper, String str, int i) {
        addReport(DTBMetricReport.reportWithBidTypeLatency(bidWrapper, str, i));
        dispenseReport();
    }

    private void dispenseReport() {
        if (isMainThread()) {
            DtbThreadService.getInstance().execute(new Runnable() {
                public final void run() {
                    DTBMetricsProcessor.this.lambda$dispenseReport$1$DTBMetricsProcessor();
                }
            });
        } else {
            lambda$dispenseReport$1$DTBMetricsProcessor();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r6.reportQueue.size() <= 0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = r6.reportQueue.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (com.amazon.device.ads.DTBMetricsConfiguration.getInstance().isTypeEnabled(r0.getType()) != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = SIMPLE_TAG;
        com.amazon.device.ads.DtbLog.debug(r1, "Report type:" + r0.getType() + " is ignored");
        removeFromQueue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = getCompleteURLForPixelsBasedOnReportURL(r0);
        r3 = SIMPLE_TAG;
        com.amazon.device.ads.DtbLog.debug(r3, "Report URL:\n" + r2 + "\nType:" + r0.getType());
        r3 = SIMPLE_TAG;
        r4 = new java.lang.StringBuilder();
        r4.append("Report:\n");
        r4.append(r0);
        com.amazon.device.ads.DtbLog.debug(r3, r4.toString());
        new com.amazon.device.ads.DtbHttpClient(r2).executeGET(60000);
        removeFromQueue();
        com.amazon.device.ads.DtbLog.debug(SIMPLE_TAG, "Report Submission Success");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a3, code lost:
        com.amazon.device.ads.DtbLog.warn("JSON Exception:" + r0.getMessage());
        removeFromQueue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c1, code lost:
        com.amazon.device.ads.DtbLog.warn("IOException:" + r0.getMessage());
        com.amazon.device.ads.DtbLog.debug(SIMPLE_TAG, "Report Submission Failure");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e2, code lost:
        com.amazon.device.ads.DtbLog.warn("Malformed Exception:" + r0.getMessage());
     */
    /* renamed from: dispenseReportImpl */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$dispenseReport$1$DTBMetricsProcessor() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
            boolean r1 = r6.running     // Catch:{ all -> 0x00fd }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            return
        L_0x0009:
            r1 = 1
            r6.running = r1     // Catch:{ all -> 0x00fd }
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
        L_0x000d:
            java.util.List<com.amazon.device.ads.DTBMetricReport> r0 = r6.reportQueue
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L_0x00fa
            java.util.List<com.amazon.device.ads.DTBMetricReport> r0 = r6.reportQueue
            java.lang.Object r0 = r0.get(r1)
            com.amazon.device.ads.DTBMetricReport r0 = (com.amazon.device.ads.DTBMetricReport) r0
            com.amazon.device.ads.DTBMetricsConfiguration r2 = com.amazon.device.ads.DTBMetricsConfiguration.getInstance()
            java.lang.String r3 = r0.getType()
            boolean r2 = r2.isTypeEnabled(r3)
            if (r2 != 0) goto L_0x004f
            java.lang.String r1 = SIMPLE_TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Report type:"
            r2.append(r3)
            java.lang.String r0 = r0.getType()
            r2.append(r0)
            java.lang.String r0 = " is ignored"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.amazon.device.ads.DtbLog.debug(r1, r0)
            r6.removeFromQueue()
            goto L_0x000d
        L_0x004f:
            java.lang.String r2 = r6.getCompleteURLForPixelsBasedOnReportURL(r0)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r3 = SIMPLE_TAG     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            r4.<init>()     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r5 = "Report URL:\n"
            r4.append(r5)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            r4.append(r2)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r5 = "\nType:"
            r4.append(r5)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r5 = r0.getType()     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            r4.append(r5)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r4 = r4.toString()     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            com.amazon.device.ads.DtbLog.debug(r3, r4)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r3 = SIMPLE_TAG     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            r4.<init>()     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r5 = "Report:\n"
            r4.append(r5)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            r4.append(r0)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r0 = r4.toString()     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            com.amazon.device.ads.DtbLog.debug(r3, r0)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            com.amazon.device.ads.DtbHttpClient r0 = new com.amazon.device.ads.DtbHttpClient     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            r0.<init>(r2)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            r2 = 60000(0xea60, float:8.4078E-41)
            r0.executeGET(r2)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            r6.removeFromQueue()     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r0 = SIMPLE_TAG     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            java.lang.String r2 = "Report Submission Success"
            com.amazon.device.ads.DtbLog.debug(r0, r2)     // Catch:{ MalformedURLException -> 0x00e1, IOException -> 0x00c0, JSONException -> 0x00a2 }
            goto L_0x000d
        L_0x00a2:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JSON Exception:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.amazon.device.ads.DtbLog.warn(r0)
            r6.removeFromQueue()
            goto L_0x000d
        L_0x00c0:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "IOException:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.amazon.device.ads.DtbLog.warn(r0)
            java.lang.String r0 = SIMPLE_TAG
            java.lang.String r2 = "Report Submission Failure"
            com.amazon.device.ads.DtbLog.debug(r0, r2)
            goto L_0x00fa
        L_0x00e1:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Malformed Exception:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.amazon.device.ads.DtbLog.warn(r0)
        L_0x00fa:
            r6.running = r1
            return
        L_0x00fd:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBMetricsProcessor.lambda$dispenseReport$1$DTBMetricsProcessor():void");
    }

    private void addReport(DTBMetricReport dTBMetricReport) {
        synchronized (this.reportQueue) {
            this.reportQueue.add(dTBMetricReport);
        }
    }

    private void removeFromQueue() {
        synchronized (this.reportQueue) {
            this.reportQueue.remove(0);
        }
    }

    private String getCompleteURLForPixelsBasedOnReportURL(DTBMetricReport dTBMetricReport) throws UnsupportedEncodingException {
        String str;
        if (dTBMetricReport.getHostname() == null || dTBMetricReport.getHostname().trim().length() == 0) {
            str = DtbConstants.AAX_HOSTNAME;
        } else {
            str = dTBMetricReport.getHostname();
        }
        if (dTBMetricReport.getBidId() == null || dTBMetricReport.getBidId().trim().length() == 0) {
            return String.format("%s/x/px/p/PH/%s%s", new Object[]{str, dTBMetricReport.toEncodedString(), cacheBusterQueryString()});
        }
        return String.format("%s/x/px/%s/%s%s", new Object[]{str, dTBMetricReport.getBidId(), dTBMetricReport.toEncodedString(), cacheBusterQueryString()});
    }

    private static String cacheBusterQueryString() {
        if (AdRegistration.isTestMode()) {
            return "?cb=0";
        }
        return String.format("?cb=%d", new Object[]{Integer.valueOf((int) (Math.random() * 1.0E7d))});
    }
}
