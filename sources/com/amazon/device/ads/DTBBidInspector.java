package com.amazon.device.ads;

import com.amazon.device.ads.DTBBidInspector;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DTBBidInspector {
    private static final int INSPECTION_PERIOD = 180000;
    private static final int RETENTION_INTERVAL = 480000;
    static DTBBidInspector theInstance = new DTBBidInspector();
    private List<BidDescriptor> bids = new ArrayList();
    private Timer timer;

    static DTBBidInspector getInstance() {
        return theInstance;
    }

    private DTBBidInspector() {
        Timer timer2 = new Timer();
        this.timer = timer2;
        timer2.schedule(new TimerTask() {
            public /* synthetic */ void lambda$run$0$DTBBidInspector$1() {
                DTBBidInspector.this.purge();
            }

            public void run() {
                DtbThreadService.getInstance().execute(new Runnable() {
                    public final void run() {
                        DTBBidInspector.C11561.this.lambda$run$0$DTBBidInspector$1();
                    }
                });
            }
        }, 180000, 180000);
    }

    /* access modifiers changed from: private */
    public synchronized void purge() {
        long time = new Date().getTime();
        Iterator<BidDescriptor> it = this.bids.iterator();
        int i = 0;
        while (it.hasNext() && time - it.next().bidTime > 480000) {
            i++;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.bids.remove(0);
        }
    }

    class BidDescriptor {
        String bidId;
        long bidTime;

        BidDescriptor() {
        }
    }

    public synchronized void addBid(String str) {
        BidDescriptor bidDescriptor = new BidDescriptor();
        bidDescriptor.bidId = str;
        bidDescriptor.bidTime = new Date().getTime();
        this.bids.add(bidDescriptor);
    }

    public synchronized boolean wasUsed(String str) {
        for (BidDescriptor next : this.bids) {
            if (next.bidId.equals(str)) {
                this.bids.remove(next);
                return false;
            }
        }
        return true;
    }
}
