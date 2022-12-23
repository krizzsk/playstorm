package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBMetricReport;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DTBFetchManager {
    private static final int DEPTH = 3;
    private static int INSPECTION_INTERVAL_MS = 300000;
    private static final String LOG_TAG = DTBFetchManager.class.getSimpleName();
    private boolean isSmartBanner;
    private DTBAdLoader loader;
    private LinkedList<FetchEntry> responses;
    private boolean started = false;
    Timer timer = null;

    DTBFetchManager(DTBAdLoader dTBAdLoader, boolean z) {
        dTBAdLoader.pauseAutoRefresh();
        if (!z || dTBAdLoader.getSlotGroupName() != null) {
            this.isSmartBanner = z;
            init(dTBAdLoader);
            return;
        }
        throw new IllegalStateException("No Slot Group Set for This Ad Request");
    }

    private void init(DTBAdLoader dTBAdLoader) {
        this.loader = dTBAdLoader;
        this.responses = new LinkedList<>();
        this.started = false;
    }

    public boolean isEmpty() {
        return this.responses.isEmpty();
    }

    /* access modifiers changed from: private */
    public void addResponse(FetchEntry fetchEntry) {
        synchronized (this.responses) {
            this.responses.add(fetchEntry);
        }
    }

    public DTBAdResponse dispense() {
        FetchEntry poll;
        DTBAdResponse dTBAdResponse = null;
        try {
            synchronized (this.responses) {
                poll = this.responses.poll();
            }
            if (poll != null) {
                dTBAdResponse = poll.response;
            }
            initiateRequest();
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute dispense method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute dispense method", e);
        }
        return dTBAdResponse;
    }

    public DTBAdResponse peek() {
        FetchEntry peek;
        try {
            synchronized (this.responses) {
                peek = this.responses.peek();
            }
            if (peek != null) {
                return peek.response;
            }
            return null;
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute peek method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute peek method", e);
            return null;
        }
    }

    public synchronized void start() {
        try {
            if (!this.started) {
                Timer timer2 = new Timer();
                this.timer = timer2;
                timer2.scheduleAtFixedRate(new TimerTask() {
                    public void run() {
                        DTBFetchManager.this.purgeResponses();
                    }
                }, 0, (long) INSPECTION_INTERVAL_MS);
                this.started = true;
            }
            initiateRequest();
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute start method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute start method", e);
        }
        return;
    }

    public synchronized void stop() {
        try {
            if (this.timer != null) {
                this.timer.cancel();
                this.timer = null;
            }
            this.started = false;
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute stop method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute stop method", e);
        }
        return;
    }

    class FetchEntry {
        DTBAdResponse response;
        long timestamp = new Date().getTime();

        FetchEntry(DTBAdResponse dTBAdResponse) {
            this.response = dTBAdResponse;
        }
    }

    /* access modifiers changed from: private */
    public void purgeResponses() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.responses) {
            long time = new Date().getTime();
            while (true) {
                if (this.responses.size() <= 0) {
                    break;
                } else if (time - this.responses.getFirst().timestamp < ((long) DTBFetchFactory.getInstance().getExpirationInMillis())) {
                    break;
                } else {
                    FetchEntry removeFirst = this.responses.removeFirst();
                    if (removeFirst.response.getBidId() != null) {
                        arrayList.add(new DTBMetricReport.BidWrapper(removeFirst.response.getBidId(), removeFirst.response.getHost()));
                    }
                    initiateRequest();
                }
            }
        }
        submitExpiredBidsReport(arrayList);
    }

    class ResponseListener implements DTBAdCallback {
        ResponseListener() {
        }

        public void onFailure(AdError adError) {
            DTBFetchManager.this.addResponse(new FetchEntry(new DTBAdResponse()));
            DTBFetchManager.this.initiateRequest();
        }

        public void onSuccess(DTBAdResponse dTBAdResponse) {
            DTBFetchManager.this.addResponse(new FetchEntry(dTBAdResponse));
            DTBFetchManager.this.initiateRequest();
        }
    }

    /* access modifiers changed from: private */
    public void initiateRequest() {
        if (this.started && this.responses.size() < 3) {
            ((DTBAdRequest) this.loader).recycle();
            if (this.isSmartBanner) {
                try {
                    this.loader.loadSmartBanner(new ResponseListener());
                } catch (DTBLoadException unused) {
                    stop();
                    DtbLog.error("DTBLoadException", "No suitable Slot Size");
                }
            } else {
                this.loader.loadAd(new ResponseListener());
            }
        }
    }

    private void submitExpiredBidsReport(List<DTBMetricReport.BidWrapper> list) {
        if (list.size() > 0) {
            DTBMetricsProcessor.getInstance().submitExpiredReport(list);
        }
    }

    /* access modifiers changed from: protected */
    public void submitWasteQueueReport() {
        LinkedList<FetchEntry> linkedList = this.responses;
        if (linkedList != null && linkedList.size() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.responses.iterator();
            while (it.hasNext()) {
                FetchEntry fetchEntry = (FetchEntry) it.next();
                if (fetchEntry.response.getBidId() != null) {
                    arrayList.add(new DTBMetricReport.BidWrapper(fetchEntry.response.getBidId(), fetchEntry.response.getHost()));
                }
            }
            submitExpiredBidsReport(arrayList);
        }
    }
}
