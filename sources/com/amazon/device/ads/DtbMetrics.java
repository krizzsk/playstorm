package com.amazon.device.ads;

import com.amazon.device.ads.DtbMetric;
import com.amazon.device.ads.DtbMetrics;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

class DtbMetrics implements Cloneable {
    private final String LOG_TAG = DtbMetrics.class.getSimpleName();
    private volatile Map<DtbMetric, Long> collectedMetrics = new EnumMap(DtbMetric.class);
    private String instPxlUrl = null;
    private volatile Map<DtbMetric, Long> tempTimer = new EnumMap(DtbMetric.class);

    DtbMetrics() {
    }

    public void incrementMetric(DtbMetric dtbMetric) {
        if (dtbMetric == null || dtbMetric.getMetricType() != DtbMetric.DtbMetricType.COUNTER) {
            throw new IllegalArgumentException("Either metric is null or metric type is not counter.");
        }
        if (this.collectedMetrics.get(dtbMetric) == null) {
            this.collectedMetrics.put(dtbMetric, 0L);
        }
        this.collectedMetrics.put(dtbMetric, Long.valueOf(this.collectedMetrics.get(dtbMetric).longValue() + 1));
    }

    public void startTimer(DtbMetric dtbMetric) {
        if (dtbMetric == null || dtbMetric.getMetricType() != DtbMetric.DtbMetricType.TIMER) {
            throw new IllegalArgumentException("Either metric is null or metric type is not timer.");
        } else if (this.collectedMetrics.get(dtbMetric) == null) {
            this.tempTimer.put(dtbMetric, Long.valueOf(System.currentTimeMillis()));
        } else {
            throw new IllegalArgumentException(dtbMetric + " is already set, your operation is trying to override a value.");
        }
    }

    public void resetMetric(DtbMetric dtbMetric) {
        this.collectedMetrics.remove(dtbMetric);
    }

    public void stopTimer(DtbMetric dtbMetric) {
        if (dtbMetric == null || dtbMetric.getMetricType() == DtbMetric.DtbMetricType.COUNTER) {
            throw new IllegalArgumentException("Either metric is null or metric type is not timer.");
        } else if (this.tempTimer.get(dtbMetric) == null) {
            throw new IllegalArgumentException("You are trying to stop a metric, which is not yet started: " + dtbMetric);
        } else if (this.collectedMetrics.get(dtbMetric) == null) {
            this.collectedMetrics.put(dtbMetric, Long.valueOf(System.currentTimeMillis() - this.tempTimer.get(dtbMetric).longValue()));
            this.tempTimer.remove(dtbMetric);
        } else {
            throw new IllegalArgumentException(dtbMetric + " is already set, your operation is trying to override a value.");
        }
    }

    public boolean isStarted(DtbMetric dtbMetric) {
        return this.tempTimer.containsKey(dtbMetric);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("c", "dtbm");
            for (Map.Entry next : this.collectedMetrics.entrySet()) {
                jSONObject.put(((DtbMetric) next.getKey()).getAAXName(), (Long) next.getValue());
            }
        } catch (JSONException e) {
            DtbLog.debug("Error while adding values to JSON object: " + e.getLocalizedMessage());
        }
        return jSONObject.toString();
    }

    public String toURLEncodedString() {
        return DtbCommonUtils.getURLEncodedString(toString());
    }

    public int getMetricsCount() {
        return this.collectedMetrics.size();
    }

    public String getInstPxlUrl() {
        return this.instPxlUrl;
    }

    public void setInstPxlUrl(String str) {
        int indexOf;
        if (!(str == null || (indexOf = str.indexOf("://")) == -1)) {
            str = str.substring(indexOf + 3);
        }
        this.instPxlUrl = str;
    }

    /* access modifiers changed from: protected */
    public DtbMetrics clone() {
        DtbMetrics dtbMetrics = new DtbMetrics();
        dtbMetrics.collectedMetrics.putAll(this.collectedMetrics);
        dtbMetrics.tempTimer.putAll(this.tempTimer);
        dtbMetrics.instPxlUrl = this.instPxlUrl;
        return dtbMetrics;
    }

    public void reset() {
        this.collectedMetrics.clear();
        this.tempTimer.clear();
    }

    static class Submitter {
        public static final Submitter INSTANCE = new Submitter();
        private final String LOG_TAG = Submitter.class.getSimpleName();
        private final Queue<DtbMetrics> metricsQueue = new ConcurrentLinkedQueue();

        private Submitter() {
        }

        public void submitMetrics(DtbMetrics dtbMetrics) {
            if (dtbMetrics.getMetricsCount() > 0) {
                this.metricsQueue.add(dtbMetrics.clone());
                dtbMetrics.reset();
                DtbLog.debug("Scheduling metrics submission in background thread.");
                DtbThreadService.getInstance().schedule(new Runnable() {
                    public final void run() {
                        DtbMetrics.Submitter.this.lambda$submitMetrics$0$DtbMetrics$Submitter();
                    }
                });
                DtbLog.debug("Dispatched the metrics submit task on a background schedule thread.");
            }
        }

        public /* synthetic */ void lambda$submitMetrics$0$DtbMetrics$Submitter() {
            DtbLog.debug("Starting metrics submission..");
            submitMetrics();
            DtbLog.debug("Metrics submission thread complete.");
        }

        private void submitMetrics() {
            Iterator it = this.metricsQueue.iterator();
            int i = 0;
            while (it.hasNext()) {
                DtbMetrics dtbMetrics = (DtbMetrics) it.next();
                i++;
                DtbLog.debug("Starting metrics submission - Sequence " + i);
                if (dtbMetrics.getInstPxlUrl() == null) {
                    it.remove();
                    DtbLog.debug("No metric url found- Sequence " + i + ", skipping..");
                } else {
                    String str = dtbMetrics.getInstPxlUrl() + dtbMetrics.toURLEncodedString();
                    DtbLog.debug("Metrics URL:" + str);
                    try {
                        DtbHttpClient dtbHttpClient = new DtbHttpClient(str);
                        dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                        dtbHttpClient.executeGET(60000);
                        if (dtbHttpClient.isHttpStatusCodeOK()) {
                            DtbLog.debug("Metrics submitted- Sequence " + i);
                            it.remove();
                        } else {
                            DtbLog.debug("Metrics submission failed- Sequence " + i + ", response invalid");
                            return;
                        }
                    } catch (Exception e) {
                        DtbLog.debug("Metrics submission failed- Sequence " + i + ", encountered error:" + e.toString());
                        return;
                    }
                }
            }
        }
    }
}
