package com.smaato.sdk.core.network.trackers;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BeaconTracker {
    private final HttpClient httpClient;
    private final Logger logger;

    public BeaconTracker(Logger logger2, HttpClient httpClient2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for BeaconTracker");
        this.httpClient = (HttpClient) Objects.requireNonNull(httpClient2, "Parameter httpClient cannot be null for BeaconTracker");
    }

    public void trackBeaconUrls(Collection<String> collection, Consumer<Exception> consumer) {
        Objects.requireNonNull(collection, "Parameter urls cannot be null for BeaconTracker::trackBeaconUrls");
        Iterator it = new ArrayList(collection).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                trackBeaconUrl(str, consumer);
            }
        }
    }

    public void trackBeaconUrl(String str) {
        trackBeaconUrl(str, (Consumer<Exception>) null);
    }

    private void trackBeaconUrl(String str, Consumer<Exception> consumer) {
        Objects.requireNonNull(str, "Parameter url cannot be null for BeaconTracker::trackBeaconUrl");
        Threads.runOnBackgroundThread(new Runnable(str, consumer) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Consumer f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                BeaconTracker.this.lambda$trackBeaconUrl$0$BeaconTracker(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$trackBeaconUrl$0$BeaconTracker(String str, Consumer consumer) {
        try {
            this.httpClient.newCall(Request.get(str)).execute();
            this.logger.info(LogDomain.NETWORK, "Beacon was tracked successfully %s", str);
        } catch (Exception e) {
            this.logger.error(LogDomain.NETWORK, e, "Tracking Beacon failed with error [url: %s]", str);
            if (consumer != null) {
                consumer.accept(e);
            }
        }
    }
}
