package com.smaato.sdk.video.vast.tracking;

import android.util.SparseArray;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Predicate;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.utils.VastVideoPlayerTimeConverterUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class OffsetEventsManager {
    private final SparseArray<Set<Tracking>> percentageTrackingSA;
    private final Set<Tracking> trackedTrackings = Collections.synchronizedSet(new HashSet());

    private OffsetEventsManager(SparseArray<Set<Tracking>> sparseArray) {
        this.percentageTrackingSA = sparseArray;
    }

    private static void appendTrackingPercentage(SparseArray<Set<Tracking>> sparseArray, Tracking tracking, int i) {
        Set set = sparseArray.get(i);
        if (set != null) {
            set.add(tracking);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(tracking);
        sparseArray.append(i, hashSet);
    }

    static OffsetEventsManager fromTrackingsMap(Map<VastEvent, List<Tracking>> map, long j, Logger logger) {
        SparseArray sparseArray = new SparseArray();
        for (VastEvent vastEvent : VastEvent.EVENTS_WITH_OFFSET) {
            Objects.onNotNull(map.get(vastEvent), new Consumer(j, logger, sparseArray) {
                public final /* synthetic */ long f$0;
                public final /* synthetic */ Logger f$1;
                public final /* synthetic */ SparseArray f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r3;
                    this.f$2 = r4;
                }

                public final void accept(Object obj) {
                    OffsetEventsManager.lambda$fromTrackingsMap$0(this.f$0, this.f$1, this.f$2, (List) obj);
                }
            });
        }
        return new OffsetEventsManager(sparseArray);
    }

    static /* synthetic */ void lambda$fromTrackingsMap$0(long j, Logger logger, SparseArray sparseArray, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tracking tracking = (Tracking) it.next();
            int convertOffsetStringToPercentage = VastVideoPlayerTimeConverterUtils.convertOffsetStringToPercentage(tracking.offset, j, logger);
            if (convertOffsetStringToPercentage >= 0) {
                appendTrackingPercentage(sparseArray, tracking, convertOffsetStringToPercentage);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Set<Tracking> getOffsettedTrackingsToTrackNow(Logger logger, long j, long j2) {
        HashSet hashSet = new HashSet();
        if (j2 == 0) {
            logger.warning(LogDomain.VAST, "Video duration is 0", new Object[0]);
            return hashSet;
        }
        for (int i = 0; i < this.percentageTrackingSA.size(); i++) {
            if (((long) this.percentageTrackingSA.keyAt(i)) <= (100 * j) / j2) {
                hashSet.addAll(Sets.retainToSet(this.percentageTrackingSA.valueAt(i), new Predicate() {
                    public final boolean test(Object obj) {
                        return OffsetEventsManager.this.lambda$getOffsettedTrackingsToTrackNow$1$OffsetEventsManager((Tracking) obj);
                    }
                }));
            }
        }
        return hashSet;
    }

    public /* synthetic */ boolean lambda$getOffsettedTrackingsToTrackNow$1$OffsetEventsManager(Tracking tracking) {
        return !this.trackedTrackings.contains(tracking);
    }

    /* access modifiers changed from: package-private */
    public void markAsTracked(Tracking tracking) {
        this.trackedTrackings.add(tracking);
    }
}
